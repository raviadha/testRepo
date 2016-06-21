package com.java.polr.webservice;

import javax.jws.WebMethod;
import javax.jws.WebService;

@WebService
public interface FileTransfer {

	@WebMethod
	public void upload(String fileName, byte[] imagedata);
	
	@WebMethod
	public byte[] downlaod();
}
