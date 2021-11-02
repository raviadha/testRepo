package com.aubank.service;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.SQLException;

import javax.naming.NamingException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.sql.DataSource;

import com.aubank.util.Utility;

/**
 * Servlet implementation class UcpService
 * 
 * @author Ravindar Singh
 */
@WebServlet(description = "Service for Planned,UnplannedDatabaseDowntimes andRuntimeLoadBalancing withUCP", urlPatterns = { "/UcpService" })
public class UcpService extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public UcpService() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#service(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		response.setContentType("text/html; charset=windows-1252");
		final PrintWriter out = response.getWriter();
		
		out.println("<html>");
		out.println("<head><title> AU Database HA Checking Service - </title></head>");
		out.println("<body>");
		//out.println("<tr>");
		//out.println("</tr>");
		final String dsLocation = request.getParameter("dsLocation");

		DataSource ds = null;
		Connection conn = null;
		int state=0;
		try {
			Utility utility = new Utility();
			ds = utility.getDataSource();
			conn = ds.getConnection();
			state = utility.displayConnectionDetails(out, conn); 
			out.println("<td>OK</td>");
		}
		catch (NamingException |SQLException e) {
			out.println("<td>Failed</td>");
			//out.println("<p><br>Server Database HA Monitoring Service failed with below Error :<br>");
			//e.printStackTrace(out);
		     e.printStackTrace();
			out.flush();
			state =-1;
		} finally {
			ds=null;
			if (conn != null) {

				try {
					conn.close();
					conn=null; 
				}
				catch (SQLException ex2) {}
			}
			//            if(state==0){
				//            	out.println("<td> OK without Data</td>");
			//            }else if (state==1){
			//            	out.println("<td> OK </td>");
			//            } 	else{
			//            	out.println("<td> Failed </td>");
			//            }
		}
		//out.println("<table border=1>");
		out.println("</body></html>");
		out.flush();
		out.close();

		
		
		
		
		
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
