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
 * 2023-12-18T21:48:10.231-06:00
 * Generated source version: 3.1.12
 * 
 */
@WebServiceClient(name = "searchClaimPE", 
                  wsdlLocation = "file:/C:/Users/e-jonreyes/Documents/workspace-spring-tool-suite-sima-service/seguros/insurances/src/main/resources/wsdl/searchClaimPE.wsdl",
                  targetNamespace = "http://gentera.com.pe/") 
public class SearchClaimPE_Service extends Service {

    public final static URL WSDL_LOCATION;

    public final static QName SERVICE = new QName("http://gentera.com.pe/", "searchClaimPE");
    public final static QName SearchClaimPEPort = new QName("http://gentera.com.pe/", "searchClaimPEPort");
    static {
        URL url = null;
        try {
            url = new URL("file:/C:/Users/e-jonreyes/Documents/workspace-spring-tool-suite-sima-service/seguros/insurances/src/main/resources/wsdl/searchClaimPE.wsdl");
        } catch (MalformedURLException e) {
            java.util.logging.Logger.getLogger(SearchClaimPE_Service.class.getName())
                .log(java.util.logging.Level.INFO, 
                     "Can not initialize the default wsdl from {0}", "file:/C:/Users/e-jonreyes/Documents/workspace-spring-tool-suite-sima-service/seguros/insurances/src/main/resources/wsdl/searchClaimPE.wsdl");
        }
        WSDL_LOCATION = url;
    }

    public SearchClaimPE_Service(URL wsdlLocation) {
        super(wsdlLocation, SERVICE);
    }

    public SearchClaimPE_Service(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public SearchClaimPE_Service() {
        super(WSDL_LOCATION, SERVICE);
    }
    
    public SearchClaimPE_Service(WebServiceFeature ... features) {
        super(WSDL_LOCATION, SERVICE, features);
    }

    public SearchClaimPE_Service(URL wsdlLocation, WebServiceFeature ... features) {
        super(wsdlLocation, SERVICE, features);
    }

    public SearchClaimPE_Service(URL wsdlLocation, QName serviceName, WebServiceFeature ... features) {
        super(wsdlLocation, serviceName, features);
    }    




    /**
     *
     * @return
     *     returns SearchClaimPE
     */
    @WebEndpoint(name = "searchClaimPEPort")
    public SearchClaimPE getSearchClaimPEPort() {
        return super.getPort(SearchClaimPEPort, SearchClaimPE.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns SearchClaimPE
     */
    @WebEndpoint(name = "searchClaimPEPort")
    public SearchClaimPE getSearchClaimPEPort(WebServiceFeature... features) {
        return super.getPort(SearchClaimPEPort, SearchClaimPE.class, features);
    }

}
