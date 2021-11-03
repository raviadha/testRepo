/**
 * 
 */
package com.aubank.util;

import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;
import javax.sql.DataSource;

import oracle.jdbc.pool.OracleDataSource;
import oracle.ucp.jdbc.PoolDataSource;
import oracle.ucp.jdbc.ValidConnection;
import oracle.ucp.jdbc.oracle.OracleJDBCConnectionPoolStatistics;

/**
 * @author Ravindar Singh
 *
 */
public class Utility {

	public int displayConnectionDetails(final PrintWriter out, final Connection conn) throws SQLException{
        //final String sQuery = "select sys_context('userenv', 'instance_name'), sys_context('userenv', 'server_host'), sys_context('userenv', 'service_name') from dual";
		final String sQuery = "select 1 from appmonitor";
        
        Statement stmt = null;
        String results="";
        int count = 0;
        try {
            stmt = conn.createStatement();
            ResultSet rs=stmt.executeQuery(sQuery);
            
            while(rs.next()){
            	count ++;
            	
            }
            rs=null;
           
        }
        catch (SQLException se) {
            out.println("<p>Error running query: ");
            out.println(se.getMessage());
            out.println("<p>");
            count=-1;
            
         // Fast Connection Failover
            if (conn == null || !((ValidConnection)conn).isValid()){
            se.printStackTrace();
            String fcfInfo=null;
			try {
				fcfInfo = ((OracleJDBCConnectionPoolStatistics)
				this.getDataSource().getStatistics()).getFCFProcessingInfoProcessedOnly();
			} catch (NamingException e) {
				
				e.printStackTrace();
			}
            System.out.println("FCF information: " + fcfInfo);
            }
            // Close the connection
            conn.close();
            
            
        }
        /*finally {
            if (stmt != null) {
                try {
                    stmt.close();
                }
                catch (SQLException ex) {}
            }
            
        }*/
        return count;
    }
    
	public Connection getConnection() throws SQLException, NamingException{
		
		 Connection conn = getDataSource().getConnection();
		 
		 return conn;
	}
	
    public PoolDataSource getDataSource() throws NamingException, SQLException {
        
     // Look up a data source
        javax.sql.DataSource ds=(javax.sql.DataSource)getContext().lookup ("tomcat/UCPPool");
        PoolDataSource pds= (PoolDataSource)ds;
        
       // oracle.jdbc.implicitstatementcachesize=nnn (nnn = number of statements to be cached) 
        //OracleDataSource ods = new OracleDataSource(); 
        //ods.setImplicitCachingEnabled(true);
        
        return pds;
    }
    
    public Context getContext() throws NamingException{
    	
    	final Context ctx = new InitialContext();
        Context envContext = (Context)ctx.lookup("java:/comp/env");
    	return envContext;
   }
}
