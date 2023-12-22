package mx.com.gentera.global.insurancesearchdashboard;

import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceFeature;
import javax.xml.ws.Service;

/**
 * This class was generated by Apache CXF 3.1.12
 * 2023-12-18T21:48:20.125-06:00
 * Generated source version: 3.1.12
 * 
 */
@WebServiceClient(name = "insuranceSearchDashboardService", 
                  wsdlLocation = "file:/C:/Users/e-jonreyes/Documents/workspace-spring-tool-suite-sima-service/seguros/insurances/src/main/resources/wsdl/insuranceSearchDashboard.wsdl",
                  targetNamespace = "http://gentera.com.mx/global/insuranceSearchDashboard/") 
public class InsuranceSearchDashboardService extends Service {

    public final static URL WSDL_LOCATION;

    public final static QName SERVICE = new QName("http://gentera.com.mx/global/insuranceSearchDashboard/", "insuranceSearchDashboardService");
    public final static QName InsuranceSearchDashboardPort = new QName("http://gentera.com.mx/global/insuranceSearchDashboard/", "insuranceSearchDashboardPort");
    static {
        URL url = null;
        try {
            url = new URL("file:/C:/Users/e-jonreyes/Documents/workspace-spring-tool-suite-sima-service/seguros/insurances/src/main/resources/wsdl/insuranceSearchDashboard.wsdl");
        } catch (MalformedURLException e) {
            java.util.logging.Logger.getLogger(InsuranceSearchDashboardService.class.getName())
                .log(java.util.logging.Level.INFO, 
                     "Can not initialize the default wsdl from {0}", "file:/C:/Users/e-jonreyes/Documents/workspace-spring-tool-suite-sima-service/seguros/insurances/src/main/resources/wsdl/insuranceSearchDashboard.wsdl");
        }
        WSDL_LOCATION = url;
    }

    public InsuranceSearchDashboardService(URL wsdlLocation) {
        super(wsdlLocation, SERVICE);
    }

    public InsuranceSearchDashboardService(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public InsuranceSearchDashboardService() {
        super(WSDL_LOCATION, SERVICE);
    }
    
    public InsuranceSearchDashboardService(WebServiceFeature ... features) {
        super(WSDL_LOCATION, SERVICE, features);
    }

    public InsuranceSearchDashboardService(URL wsdlLocation, WebServiceFeature ... features) {
        super(wsdlLocation, SERVICE, features);
    }

    public InsuranceSearchDashboardService(URL wsdlLocation, QName serviceName, WebServiceFeature ... features) {
        super(wsdlLocation, serviceName, features);
    }    




    /**
     *
     * @return
     *     returns InsuranceSearchDashboard
     */
    @WebEndpoint(name = "insuranceSearchDashboardPort")
    public InsuranceSearchDashboard getInsuranceSearchDashboardPort() {
        return super.getPort(InsuranceSearchDashboardPort, InsuranceSearchDashboard.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns InsuranceSearchDashboard
     */
    @WebEndpoint(name = "insuranceSearchDashboardPort")
    public InsuranceSearchDashboard getInsuranceSearchDashboardPort(WebServiceFeature... features) {
        return super.getPort(InsuranceSearchDashboardPort, InsuranceSearchDashboard.class, features);
    }

}
