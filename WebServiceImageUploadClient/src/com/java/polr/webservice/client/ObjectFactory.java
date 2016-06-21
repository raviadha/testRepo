
package com.java.polr.webservice.client;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.java.polr.webservice.client package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _UploadResponse_QNAME = new QName("http://webservice.polr.java.com/", "uploadResponse");
    private final static QName _DownlaodResponse_QNAME = new QName("http://webservice.polr.java.com/", "downlaodResponse");
    private final static QName _Downlaod_QNAME = new QName("http://webservice.polr.java.com/", "downlaod");
    private final static QName _Upload_QNAME = new QName("http://webservice.polr.java.com/", "upload");
    private final static QName _DownlaodResponseReturn_QNAME = new QName("", "return");
    private final static QName _UploadArg1_QNAME = new QName("", "arg1");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.java.polr.webservice.client
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link Upload }
     * 
     */
    public Upload createUpload() {
        return new Upload();
    }

    /**
     * Create an instance of {@link Downlaod }
     * 
     */
    public Downlaod createDownlaod() {
        return new Downlaod();
    }

    /**
     * Create an instance of {@link UploadResponse }
     * 
     */
    public UploadResponse createUploadResponse() {
        return new UploadResponse();
    }

    /**
     * Create an instance of {@link DownlaodResponse }
     * 
     */
    public DownlaodResponse createDownlaodResponse() {
        return new DownlaodResponse();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UploadResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservice.polr.java.com/", name = "uploadResponse")
    public JAXBElement<UploadResponse> createUploadResponse(UploadResponse value) {
        return new JAXBElement<UploadResponse>(_UploadResponse_QNAME, UploadResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DownlaodResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservice.polr.java.com/", name = "downlaodResponse")
    public JAXBElement<DownlaodResponse> createDownlaodResponse(DownlaodResponse value) {
        return new JAXBElement<DownlaodResponse>(_DownlaodResponse_QNAME, DownlaodResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Downlaod }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservice.polr.java.com/", name = "downlaod")
    public JAXBElement<Downlaod> createDownlaod(Downlaod value) {
        return new JAXBElement<Downlaod>(_Downlaod_QNAME, Downlaod.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Upload }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservice.polr.java.com/", name = "upload")
    public JAXBElement<Upload> createUpload(Upload value) {
        return new JAXBElement<Upload>(_Upload_QNAME, Upload.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link byte[]}{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "return", scope = DownlaodResponse.class)
    public JAXBElement<byte[]> createDownlaodResponseReturn(byte[] value) {
        return new JAXBElement<byte[]>(_DownlaodResponseReturn_QNAME, byte[].class, DownlaodResponse.class, ((byte[]) value));
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link byte[]}{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "arg1", scope = Upload.class)
    public JAXBElement<byte[]> createUploadArg1(byte[] value) {
        return new JAXBElement<byte[]>(_UploadArg1_QNAME, byte[].class, Upload.class, ((byte[]) value));
    }

}
