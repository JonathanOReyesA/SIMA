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
 * 2023-12-18T21:48:10.382-06:00
 * Generated source version: 3.1.12
 * 
 */
@WebServiceClient(name = "searchClaims", 
                  wsdlLocation = "file:/C:/Users/e-jonreyes/Documents/workspace-spring-tool-suite-sima-service/seguros/insurances/src/main/resources/wsdl/searchClaims.wsdl",
                  targetNamespace = "http://gentera.com.mx/") 
public class SearchClaims_Service extends Service {

    public final static URL WSDL_LOCATION;

    public final static QName SERVICE = new QName("http://gentera.com.mx/", "searchClaims");
    public final static QName SearchClaimsPort = new QName("http://gentera.com.mx/", "searchClaimsPort");
    static {
        URL url = null;
        try {
            url = new URL("file:/C:/Users/e-jonreyes/Documents/workspace-spring-tool-suite-sima-service/seguros/insurances/src/main/resources/wsdl/searchClaims.wsdl");
        } catch (MalformedURLException e) {
            java.util.logging.Logger.getLogger(SearchClaims_Service.class.getName())
                .log(java.util.logging.Level.INFO, 
                     "Can not initialize the default wsdl from {0}", "file:/C:/Users/e-jonreyes/Documents/workspace-spring-tool-suite-sima-service/seguros/insurances/src/main/resources/wsdl/searchClaims.wsdl");
        }
        WSDL_LOCATION = url;
    }

    public SearchClaims_Service(URL wsdlLocation) {
        super(wsdlLocation, SERVICE);
    }

    public SearchClaims_Service(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public SearchClaims_Service() {
        super(WSDL_LOCATION, SERVICE);
    }
    
    public SearchClaims_Service(WebServiceFeature ... features) {
        super(WSDL_LOCATION, SERVICE, features);
    }

    public SearchClaims_Service(URL wsdlLocation, WebServiceFeature ... features) {
        super(wsdlLocation, SERVICE, features);
    }

    public SearchClaims_Service(URL wsdlLocation, QName serviceName, WebServiceFeature ... features) {
        super(wsdlLocation, serviceName, features);
    }    




    /**
     *
     * @return
     *     returns SearchClaims
     */
    @WebEndpoint(name = "searchClaimsPort")
    public SearchClaims getSearchClaimsPort() {
        return super.getPort(SearchClaimsPort, SearchClaims.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns SearchClaims
     */
    @WebEndpoint(name = "searchClaimsPort")
    public SearchClaims getSearchClaimsPort(WebServiceFeature... features) {
        return super.getPort(SearchClaimsPort, SearchClaims.class, features);
    }

}
