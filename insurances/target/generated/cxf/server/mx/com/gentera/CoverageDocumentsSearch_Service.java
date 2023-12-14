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
 * 2023-12-13T23:09:33.095-06:00
 * Generated source version: 3.1.12
 * 
 */
@WebServiceClient(name = "coverageDocumentsSearch", 
                  wsdlLocation = "file:/C:/Users/e-jonreyes/Documents/workspace-spring-tool-suite-sima-service/seguros/insurances/src/main/resources/wsdl/coverageDocumentsSearch.wsdl",
                  targetNamespace = "http://gentera.com.mx/") 
public class CoverageDocumentsSearch_Service extends Service {

    public final static URL WSDL_LOCATION;

    public final static QName SERVICE = new QName("http://gentera.com.mx/", "coverageDocumentsSearch");
    public final static QName CoverageDocumentsSearchPort = new QName("http://gentera.com.mx/", "coverageDocumentsSearchPort");
    static {
        URL url = null;
        try {
            url = new URL("file:/C:/Users/e-jonreyes/Documents/workspace-spring-tool-suite-sima-service/seguros/insurances/src/main/resources/wsdl/coverageDocumentsSearch.wsdl");
        } catch (MalformedURLException e) {
            java.util.logging.Logger.getLogger(CoverageDocumentsSearch_Service.class.getName())
                .log(java.util.logging.Level.INFO, 
                     "Can not initialize the default wsdl from {0}", "file:/C:/Users/e-jonreyes/Documents/workspace-spring-tool-suite-sima-service/seguros/insurances/src/main/resources/wsdl/coverageDocumentsSearch.wsdl");
        }
        WSDL_LOCATION = url;
    }

    public CoverageDocumentsSearch_Service(URL wsdlLocation) {
        super(wsdlLocation, SERVICE);
    }

    public CoverageDocumentsSearch_Service(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public CoverageDocumentsSearch_Service() {
        super(WSDL_LOCATION, SERVICE);
    }
    
    public CoverageDocumentsSearch_Service(WebServiceFeature ... features) {
        super(WSDL_LOCATION, SERVICE, features);
    }

    public CoverageDocumentsSearch_Service(URL wsdlLocation, WebServiceFeature ... features) {
        super(wsdlLocation, SERVICE, features);
    }

    public CoverageDocumentsSearch_Service(URL wsdlLocation, QName serviceName, WebServiceFeature ... features) {
        super(wsdlLocation, serviceName, features);
    }    




    /**
     *
     * @return
     *     returns CoverageDocumentsSearch
     */
    @WebEndpoint(name = "coverageDocumentsSearchPort")
    public CoverageDocumentsSearch getCoverageDocumentsSearchPort() {
        return super.getPort(CoverageDocumentsSearchPort, CoverageDocumentsSearch.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns CoverageDocumentsSearch
     */
    @WebEndpoint(name = "coverageDocumentsSearchPort")
    public CoverageDocumentsSearch getCoverageDocumentsSearchPort(WebServiceFeature... features) {
        return super.getPort(CoverageDocumentsSearchPort, CoverageDocumentsSearch.class, features);
    }

}
