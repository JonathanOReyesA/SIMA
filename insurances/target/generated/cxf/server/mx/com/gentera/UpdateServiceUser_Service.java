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
 * 2023-12-18T21:48:21.654-06:00
 * Generated source version: 3.1.12
 * 
 */
@WebServiceClient(name = "updateServiceUser", 
                  wsdlLocation = "file:/C:/Users/e-jonreyes/Documents/workspace-spring-tool-suite-sima-service/seguros/insurances/src/main/resources/wsdl/updateServiceUser.wsdl",
                  targetNamespace = "http://gentera.com.mx/") 
public class UpdateServiceUser_Service extends Service {

    public final static URL WSDL_LOCATION;

    public final static QName SERVICE = new QName("http://gentera.com.mx/", "updateServiceUser");
    public final static QName UpdateServiceUserPort = new QName("http://gentera.com.mx/", "updateServiceUserPort");
    static {
        URL url = null;
        try {
            url = new URL("file:/C:/Users/e-jonreyes/Documents/workspace-spring-tool-suite-sima-service/seguros/insurances/src/main/resources/wsdl/updateServiceUser.wsdl");
        } catch (MalformedURLException e) {
            java.util.logging.Logger.getLogger(UpdateServiceUser_Service.class.getName())
                .log(java.util.logging.Level.INFO, 
                     "Can not initialize the default wsdl from {0}", "file:/C:/Users/e-jonreyes/Documents/workspace-spring-tool-suite-sima-service/seguros/insurances/src/main/resources/wsdl/updateServiceUser.wsdl");
        }
        WSDL_LOCATION = url;
    }

    public UpdateServiceUser_Service(URL wsdlLocation) {
        super(wsdlLocation, SERVICE);
    }

    public UpdateServiceUser_Service(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public UpdateServiceUser_Service() {
        super(WSDL_LOCATION, SERVICE);
    }
    
    public UpdateServiceUser_Service(WebServiceFeature ... features) {
        super(WSDL_LOCATION, SERVICE, features);
    }

    public UpdateServiceUser_Service(URL wsdlLocation, WebServiceFeature ... features) {
        super(wsdlLocation, SERVICE, features);
    }

    public UpdateServiceUser_Service(URL wsdlLocation, QName serviceName, WebServiceFeature ... features) {
        super(wsdlLocation, serviceName, features);
    }    




    /**
     *
     * @return
     *     returns UpdateServiceUser
     */
    @WebEndpoint(name = "updateServiceUserPort")
    public UpdateServiceUser getUpdateServiceUserPort() {
        return super.getPort(UpdateServiceUserPort, UpdateServiceUser.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns UpdateServiceUser
     */
    @WebEndpoint(name = "updateServiceUserPort")
    public UpdateServiceUser getUpdateServiceUserPort(WebServiceFeature... features) {
        return super.getPort(UpdateServiceUserPort, UpdateServiceUser.class, features);
    }

}
