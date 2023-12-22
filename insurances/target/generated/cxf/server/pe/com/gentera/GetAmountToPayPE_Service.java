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
 * 2023-12-18T21:48:13.737-06:00
 * Generated source version: 3.1.12
 * 
 */
@WebServiceClient(name = "getAmountToPayPE", 
                  wsdlLocation = "file:/C:/Users/e-jonreyes/Documents/workspace-spring-tool-suite-sima-service/seguros/insurances/src/main/resources/wsdl/getAmountToPayPE.wsdl",
                  targetNamespace = "http://gentera.com.pe/") 
public class GetAmountToPayPE_Service extends Service {

    public final static URL WSDL_LOCATION;

    public final static QName SERVICE = new QName("http://gentera.com.pe/", "getAmountToPayPE");
    public final static QName GetAmountToPayPEPort = new QName("http://gentera.com.pe/", "getAmountToPayPEPort");
    static {
        URL url = null;
        try {
            url = new URL("file:/C:/Users/e-jonreyes/Documents/workspace-spring-tool-suite-sima-service/seguros/insurances/src/main/resources/wsdl/getAmountToPayPE.wsdl");
        } catch (MalformedURLException e) {
            java.util.logging.Logger.getLogger(GetAmountToPayPE_Service.class.getName())
                .log(java.util.logging.Level.INFO, 
                     "Can not initialize the default wsdl from {0}", "file:/C:/Users/e-jonreyes/Documents/workspace-spring-tool-suite-sima-service/seguros/insurances/src/main/resources/wsdl/getAmountToPayPE.wsdl");
        }
        WSDL_LOCATION = url;
    }

    public GetAmountToPayPE_Service(URL wsdlLocation) {
        super(wsdlLocation, SERVICE);
    }

    public GetAmountToPayPE_Service(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public GetAmountToPayPE_Service() {
        super(WSDL_LOCATION, SERVICE);
    }
    
    public GetAmountToPayPE_Service(WebServiceFeature ... features) {
        super(WSDL_LOCATION, SERVICE, features);
    }

    public GetAmountToPayPE_Service(URL wsdlLocation, WebServiceFeature ... features) {
        super(wsdlLocation, SERVICE, features);
    }

    public GetAmountToPayPE_Service(URL wsdlLocation, QName serviceName, WebServiceFeature ... features) {
        super(wsdlLocation, serviceName, features);
    }    




    /**
     *
     * @return
     *     returns GetAmountToPayPE
     */
    @WebEndpoint(name = "getAmountToPayPEPort")
    public GetAmountToPayPE getGetAmountToPayPEPort() {
        return super.getPort(GetAmountToPayPEPort, GetAmountToPayPE.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns GetAmountToPayPE
     */
    @WebEndpoint(name = "getAmountToPayPEPort")
    public GetAmountToPayPE getGetAmountToPayPEPort(WebServiceFeature... features) {
        return super.getPort(GetAmountToPayPEPort, GetAmountToPayPE.class, features);
    }

}