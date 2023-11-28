package mx.com.gentera;

import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceFeature;
import javax.xml.ws.Service;

/**
 * This class was generated by Apache CXF 3.1.13
 * 2023-11-28T13:26:55.330-06:00
 * Generated source version: 3.1.13
 * 
 */
@WebServiceClient(name = "getPromotersByOffice", 
                  wsdlLocation = "file:/C:/Users/e-jonreyes/Documents/workspace-spring-tool-suite-sima-service/seguros/medicos/src/main/resources/wsdl/getPromotersByOffice.wsdl",
                  targetNamespace = "http://gentera.com.mx/") 
public class GetPromotersByOffice_Service extends Service {

    public final static URL WSDL_LOCATION;

    public final static QName SERVICE = new QName("http://gentera.com.mx/", "getPromotersByOffice");
    public final static QName PromotersByOfficePort = new QName("http://gentera.com.mx/", "promotersByOfficePort");
    static {
        URL url = null;
        try {
            url = new URL("file:/C:/Users/e-jonreyes/Documents/workspace-spring-tool-suite-sima-service/seguros/medicos/src/main/resources/wsdl/getPromotersByOffice.wsdl");
        } catch (MalformedURLException e) {
            java.util.logging.Logger.getLogger(GetPromotersByOffice_Service.class.getName())
                .log(java.util.logging.Level.INFO, 
                     "Can not initialize the default wsdl from {0}", "file:/C:/Users/e-jonreyes/Documents/workspace-spring-tool-suite-sima-service/seguros/medicos/src/main/resources/wsdl/getPromotersByOffice.wsdl");
        }
        WSDL_LOCATION = url;
    }

    public GetPromotersByOffice_Service(URL wsdlLocation) {
        super(wsdlLocation, SERVICE);
    }

    public GetPromotersByOffice_Service(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public GetPromotersByOffice_Service() {
        super(WSDL_LOCATION, SERVICE);
    }
    
    public GetPromotersByOffice_Service(WebServiceFeature ... features) {
        super(WSDL_LOCATION, SERVICE, features);
    }

    public GetPromotersByOffice_Service(URL wsdlLocation, WebServiceFeature ... features) {
        super(wsdlLocation, SERVICE, features);
    }

    public GetPromotersByOffice_Service(URL wsdlLocation, QName serviceName, WebServiceFeature ... features) {
        super(wsdlLocation, serviceName, features);
    }    




    /**
     *
     * @return
     *     returns GetPromotersByOffice
     */
    @WebEndpoint(name = "promotersByOfficePort")
    public GetPromotersByOffice getPromotersByOfficePort() {
        return super.getPort(PromotersByOfficePort, GetPromotersByOffice.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns GetPromotersByOffice
     */
    @WebEndpoint(name = "promotersByOfficePort")
    public GetPromotersByOffice getPromotersByOfficePort(WebServiceFeature... features) {
        return super.getPort(PromotersByOfficePort, GetPromotersByOffice.class, features);
    }

}
