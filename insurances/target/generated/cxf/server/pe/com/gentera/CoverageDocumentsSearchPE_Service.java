package pe.com.gentera;

import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceFeature;
import javax.xml.ws.Service;

/**
 * This class was generated by Apache CXF 3.1.12
 * 2023-12-13T23:09:25.261-06:00
 * Generated source version: 3.1.12
 * 
 */
@WebServiceClient(name = "coverageDocumentsSearchPE", 
                  wsdlLocation = "file:/C:/Users/e-jonreyes/Documents/workspace-spring-tool-suite-sima-service/seguros/insurances/src/main/resources/wsdl/coverageDocumentsSearchPE.wsdl",
                  targetNamespace = "http://gentera.com.pe/") 
public class CoverageDocumentsSearchPE_Service extends Service {

    public final static URL WSDL_LOCATION;

    public final static QName SERVICE = new QName("http://gentera.com.pe/", "coverageDocumentsSearchPE");
    public final static QName CoverageDocumentsSearchPEPort = new QName("http://gentera.com.pe/", "coverageDocumentsSearchPEPort");
    static {
        URL url = null;
        try {
            url = new URL("file:/C:/Users/e-jonreyes/Documents/workspace-spring-tool-suite-sima-service/seguros/insurances/src/main/resources/wsdl/coverageDocumentsSearchPE.wsdl");
        } catch (MalformedURLException e) {
            java.util.logging.Logger.getLogger(CoverageDocumentsSearchPE_Service.class.getName())
                .log(java.util.logging.Level.INFO, 
                     "Can not initialize the default wsdl from {0}", "file:/C:/Users/e-jonreyes/Documents/workspace-spring-tool-suite-sima-service/seguros/insurances/src/main/resources/wsdl/coverageDocumentsSearchPE.wsdl");
        }
        WSDL_LOCATION = url;
    }

    public CoverageDocumentsSearchPE_Service(URL wsdlLocation) {
        super(wsdlLocation, SERVICE);
    }

    public CoverageDocumentsSearchPE_Service(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public CoverageDocumentsSearchPE_Service() {
        super(WSDL_LOCATION, SERVICE);
    }
    
    public CoverageDocumentsSearchPE_Service(WebServiceFeature ... features) {
        super(WSDL_LOCATION, SERVICE, features);
    }

    public CoverageDocumentsSearchPE_Service(URL wsdlLocation, WebServiceFeature ... features) {
        super(wsdlLocation, SERVICE, features);
    }

    public CoverageDocumentsSearchPE_Service(URL wsdlLocation, QName serviceName, WebServiceFeature ... features) {
        super(wsdlLocation, serviceName, features);
    }    




    /**
     *
     * @return
     *     returns CoverageDocumentsSearchPE
     */
    @WebEndpoint(name = "coverageDocumentsSearchPEPort")
    public CoverageDocumentsSearchPE getCoverageDocumentsSearchPEPort() {
        return super.getPort(CoverageDocumentsSearchPEPort, CoverageDocumentsSearchPE.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns CoverageDocumentsSearchPE
     */
    @WebEndpoint(name = "coverageDocumentsSearchPEPort")
    public CoverageDocumentsSearchPE getCoverageDocumentsSearchPEPort(WebServiceFeature... features) {
        return super.getPort(CoverageDocumentsSearchPEPort, CoverageDocumentsSearchPE.class, features);
    }

}
