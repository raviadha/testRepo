
package com.java.polr.webservice.client;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.Action;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.9-b130926.1035
 * Generated source version: 2.2
 * 
 */
@WebService(name = "FileTransferImpl", targetNamespace = "http://webservice.polr.java.com/")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface FileTransferImpl {


    /**
     * 
     * @return
     *     returns byte[]
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "downlaod", targetNamespace = "http://webservice.polr.java.com/", className = "com.java.polr.webservice.client.Downlaod")
    @ResponseWrapper(localName = "downlaodResponse", targetNamespace = "http://webservice.polr.java.com/", className = "com.java.polr.webservice.client.DownlaodResponse")
    @Action(input = "http://webservice.polr.java.com/FileTransferImpl/downlaodRequest", output = "http://webservice.polr.java.com/FileTransferImpl/downlaodResponse")
    public byte[] downlaod();

    /**
     * 
     * @param arg1
     * @param arg0
     */
    @WebMethod
    @RequestWrapper(localName = "upload", targetNamespace = "http://webservice.polr.java.com/", className = "com.java.polr.webservice.client.Upload")
    @ResponseWrapper(localName = "uploadResponse", targetNamespace = "http://webservice.polr.java.com/", className = "com.java.polr.webservice.client.UploadResponse")
    @Action(input = "http://webservice.polr.java.com/FileTransferImpl/uploadRequest", output = "http://webservice.polr.java.com/FileTransferImpl/uploadResponse")
    public void upload(
        @WebParam(name = "arg0", targetNamespace = "")
        String arg0,
        @WebParam(name = "arg1", targetNamespace = "")
        byte[] arg1);

}
