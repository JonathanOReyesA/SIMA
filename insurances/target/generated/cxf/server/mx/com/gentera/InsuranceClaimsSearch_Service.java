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
 * 2023-12-18T21:48:13.194-06:00
 * Generated source version: 3.1.12
 * 
 */
@WebServiceClient(name = "insuranceClaimsSearch", 
                  wsdlLocation = "file:/C:/Users/e-jonreyes/Documents/workspace-spring-tool-suite-sima-service/seguros/insurances/src/main/resources/wsdl/insuranceClaimsSearch.wsdl",
                  targetNamespace = "http://gentera.com.mx/") 
public class InsuranceClaimsSearch_Service extends Service {

    public final static URL WSDL_LOCATION;

    public final static QName SERVICE = new QName("http://gentera.com.mx/", "insuranceClaimsSearch");
    public final static QName InsuranceClaimsSearchPort = new QName("http://gentera.com.mx/", "insuranceClaimsSearchPort");
    static {
        URL url = null;
        try {
            url = new URL("file:/C:/Users/e-jonreyes/Documents/workspace-spring-tool-suite-sima-service/seguros/insurances/src/main/resources/wsdl/insuranceClaimsSearch.wsdl");
        } catch (MalformedURLException e) {
            java.util.logging.Logger.getLogger(InsuranceClaimsSearch_Service.class.getName())
                .log(java.util.logging.Level.INFO, 
                     "Can not initialize the default wsdl from {0}", "file:/C:/Users/e-jonreyes/Documents/workspace-spring-tool-suite-sima-service/seguros/insurances/src/main/resources/wsdl/insuranceClaimsSearch.wsdl");
        }
        WSDL_LOCATION = url;
    }

    public InsuranceClaimsSearch_Service(URL wsdlLocation) {
        super(wsdlLocation, SERVICE);
    }

    public InsuranceClaimsSearch_Service(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public InsuranceClaimsSearch_Service() {
        super(WSDL_LOCATION, SERVICE);
    }
    
    public InsuranceClaimsSearch_Service(WebServiceFeature ... features) {
        super(WSDL_LOCATION, SERVICE, features);
    }

    public InsuranceClaimsSearch_Service(URL wsdlLocation, WebServiceFeature ... features) {
        super(wsdlLocation, SERVICE, features);
    }

    public InsuranceClaimsSearch_Service(URL wsdlLocation, QName serviceName, WebServiceFeature ... features) {
        super(wsdlLocation, serviceName, features);
    }    




    /**
     *
     * @return
     *     returns InsuranceClaimsSearch
     */
    @WebEndpoint(name = "insuranceClaimsSearchPort")
    public InsuranceClaimsSearch getInsuranceClaimsSearchPort() {
        return super.getPort(InsuranceClaimsSearchPort, InsuranceClaimsSearch.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns InsuranceClaimsSearch
     */
    @WebEndpoint(name = "insuranceClaimsSearchPort")
    public InsuranceClaimsSearch getInsuranceClaimsSearchPort(WebServiceFeature... features) {
        return super.getPort(InsuranceClaimsSearchPort, InsuranceClaimsSearch.class, features);
    }

}