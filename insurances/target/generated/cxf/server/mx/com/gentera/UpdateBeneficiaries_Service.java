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
 * 2023-12-18T21:48:16.759-06:00
 * Generated source version: 3.1.12
 * 
 */
@WebServiceClient(name = "updateBeneficiaries", 
                  wsdlLocation = "file:/C:/Users/e-jonreyes/Documents/workspace-spring-tool-suite-sima-service/seguros/insurances/src/main/resources/wsdl/updateBeneficiaries.wsdl",
                  targetNamespace = "http://gentera.com.mx/") 
public class UpdateBeneficiaries_Service extends Service {

    public final static URL WSDL_LOCATION;

    public final static QName SERVICE = new QName("http://gentera.com.mx/", "updateBeneficiaries");
    public final static QName UpdateBeneficiariesPort = new QName("http://gentera.com.mx/", "updateBeneficiariesPort");
    static {
        URL url = null;
        try {
            url = new URL("file:/C:/Users/e-jonreyes/Documents/workspace-spring-tool-suite-sima-service/seguros/insurances/src/main/resources/wsdl/updateBeneficiaries.wsdl");
        } catch (MalformedURLException e) {
            java.util.logging.Logger.getLogger(UpdateBeneficiaries_Service.class.getName())
                .log(java.util.logging.Level.INFO, 
                     "Can not initialize the default wsdl from {0}", "file:/C:/Users/e-jonreyes/Documents/workspace-spring-tool-suite-sima-service/seguros/insurances/src/main/resources/wsdl/updateBeneficiaries.wsdl");
        }
        WSDL_LOCATION = url;
    }

    public UpdateBeneficiaries_Service(URL wsdlLocation) {
        super(wsdlLocation, SERVICE);
    }

    public UpdateBeneficiaries_Service(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public UpdateBeneficiaries_Service() {
        super(WSDL_LOCATION, SERVICE);
    }
    
    public UpdateBeneficiaries_Service(WebServiceFeature ... features) {
        super(WSDL_LOCATION, SERVICE, features);
    }

    public UpdateBeneficiaries_Service(URL wsdlLocation, WebServiceFeature ... features) {
        super(wsdlLocation, SERVICE, features);
    }

    public UpdateBeneficiaries_Service(URL wsdlLocation, QName serviceName, WebServiceFeature ... features) {
        super(wsdlLocation, serviceName, features);
    }    




    /**
     *
     * @return
     *     returns UpdateBeneficiaries
     */
    @WebEndpoint(name = "updateBeneficiariesPort")
    public UpdateBeneficiaries getUpdateBeneficiariesPort() {
        return super.getPort(UpdateBeneficiariesPort, UpdateBeneficiaries.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns UpdateBeneficiaries
     */
    @WebEndpoint(name = "updateBeneficiariesPort")
    public UpdateBeneficiaries getUpdateBeneficiariesPort(WebServiceFeature... features) {
        return super.getPort(UpdateBeneficiariesPort, UpdateBeneficiaries.class, features);
    }

}
