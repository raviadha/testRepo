package com.java.polr.webservice;

import java.io.BufferedOutputStream;
import java.io.FileOutputStream;

import javax.jws.WebMethod;
import javax.jws.WebService;

@WebService
public class FileTransferImpl implements FileTransfer {

	
	 
	
	@WebMethod
	@Override
	public byte[] downlaod() {
		
		return null;
	}
	@WebMethod
	@Override
	public void upload(String fileName, byte[] imagedata) {
		
		String file = "D:/Workspace2/WebServiceImageUpload/src/resource/output/"+fileName;
		
		try( FileOutputStream out = new FileOutputStream(file);
			 BufferedOutputStream bout =new BufferedOutputStream(out);	
			){
			
			bout.write(imagedata);
			System.out.println("Receiving imagedata: "+file);
			
		}catch(Exception e){
			e.printStackTrace();
		}
		
	}
}
