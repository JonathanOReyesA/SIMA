package mx.com.gentera;

import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceFeature;
import javax.xml.ws.Service;

/**
 * This class was generated by Apache CXF 3.1.12
 * 2023-12-18T21:48:16.494-06:00
 * Generated source version: 3.1.12
 * 
 */
@WebServiceClient(name = "documentsCreation", 
                  wsdlLocation = "file:/C:/Users/e-jonreyes/Documents/workspace-spring-tool-suite-sima-service/seguros/insurances/src/main/resources/wsdl/documentsCreation.wsdl",
                  targetNamespace = "http://gentera.com.mx/") 
public class DocumentsCreation_Service extends Service {

    public final static URL WSDL_LOCATION;

    public final static QName SERVICE = new QName("http://gentera.com.mx/", "documentsCreation");
    public final static QName DocumentsCreationPort = new QName("http://gentera.com.mx/", "documentsCreationPort");
    static {
        URL url = null;
        try {
            url = new URL("file:/C:/Users/e-jonreyes/Documents/workspace-spring-tool-suite-sima-service/seguros/insurances/src/main/resources/wsdl/documentsCreation.wsdl");
        } catch (MalformedURLException e) {
            java.util.logging.Logger.getLogger(DocumentsCreation_Service.class.getName())
                .log(java.util.logging.Level.INFO, 
                     "Can not initialize the default wsdl from {0}", "file:/C:/Users/e-jonreyes/Documents/workspace-spring-tool-suite-sima-service/seguros/insurances/src/main/resources/wsdl/documentsCreation.wsdl");
        }
        WSDL_LOCATION = url;
    }

    public DocumentsCreation_Service(URL wsdlLocation) {
        super(wsdlLocation, SERVICE);
    }

    public DocumentsCreation_Service(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public DocumentsCreation_Service() {
        super(WSDL_LOCATION, SERVICE);
    }
    
    public DocumentsCreation_Service(WebServiceFeature ... features) {
        super(WSDL_LOCATION, SERVICE, features);
    }

    public DocumentsCreation_Service(URL wsdlLocation, WebServiceFeature ... features) {
        super(wsdlLocation, SERVICE, features);
    }

    public DocumentsCreation_Service(URL wsdlLocation, QName serviceName, WebServiceFeature ... features) {
        super(wsdlLocation, serviceName, features);
    }    




    /**
     *
     * @return
     *     returns DocumentsCreation
     */
    @WebEndpoint(name = "documentsCreationPort")
    public DocumentsCreation getDocumentsCreationPort() {
        return super.getPort(DocumentsCreationPort, DocumentsCreation.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns DocumentsCreation
     */
    @WebEndpoint(name = "documentsCreationPort")
    public DocumentsCreation getDocumentsCreationPort(WebServiceFeature... features) {
        return super.getPort(DocumentsCreationPort, DocumentsCreation.class, features);
    }

}
