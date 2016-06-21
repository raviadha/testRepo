package com.java.polr.webservice.client;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;

public class WebServiceClient {

	public static void main(String[] args) {
		
		FileTransferImplService client = new FileTransferImplService();
		FileTransferImpl service = client.getFileTransferImplPort();
		
		//String fileName ="Image10.jpg";
		String fileName ="video.mp4";
		String filePath ="D:/Workspace2/WebServiceImageUpload/src/resource/input/"+fileName;
		
		File file = new File(filePath);
		int h[]=new int[0];
		Long f[] = new Long[0];
		// uploading a file
		
		try( FileInputStream in = new FileInputStream(file);
			 BufferedInputStream bin = new BufferedInputStream(in);	
			){
			
			byte [] imageData = new byte[(int) file.length()];
			bin.read(imageData);
			
			// calling webservice method
			
			service.upload(fileName, imageData);
			
			System.out.println("File Uploaded : "+fileName);
		}catch(Exception e){
			e.printStackTrace();
		}

	}

}
