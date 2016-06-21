package com.java.polr.webservice;

import javax.xml.ws.Endpoint;

public class FileServiceServer {

	public static void main(String[] args) {
		
		String bindingURL = "http://localhost:8888/fileServer/fileService";
		FileTransfer service = new FileTransferImpl();
		Endpoint.publish(bindingURL, service);
		System.out.println("Server Started : "+bindingURL);

	}

}
