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
 * 2023-12-18T21:48:05.863-06:00
 * Generated source version: 3.1.12
 * 
 */
@WebServiceClient(name = "coverageCatalogueV2Service", 
                  wsdlLocation = "file:/C:/Users/e-jonreyes/Documents/workspace-spring-tool-suite-sima-service/seguros/insurances/src/main/resources/wsdl/coverageCatalogueV2.wsdl",
                  targetNamespace = "http://gentera.com.mx/") 
public class CoverageCatalogueV2Service extends Service {

    public final static URL WSDL_LOCATION;

    public final static QName SERVICE = new QName("http://gentera.com.mx/", "coverageCatalogueV2Service");
    public final static QName CoverageCatalogueV2Port = new QName("http://gentera.com.mx/", "coverageCatalogueV2Port");
    static {
        URL url = null;
        try {
            url = new URL("file:/C:/Users/e-jonreyes/Documents/workspace-spring-tool-suite-sima-service/seguros/insurances/src/main/resources/wsdl/coverageCatalogueV2.wsdl");
        } catch (MalformedURLException e) {
            java.util.logging.Logger.getLogger(CoverageCatalogueV2Service.class.getName())
                .log(java.util.logging.Level.INFO, 
                     "Can not initialize the default wsdl from {0}", "file:/C:/Users/e-jonreyes/Documents/workspace-spring-tool-suite-sima-service/seguros/insurances/src/main/resources/wsdl/coverageCatalogueV2.wsdl");
        }
        WSDL_LOCATION = url;
    }

    public CoverageCatalogueV2Service(URL wsdlLocation) {
        super(wsdlLocation, SERVICE);
    }

    public CoverageCatalogueV2Service(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public CoverageCatalogueV2Service() {
        super(WSDL_LOCATION, SERVICE);
    }
    
    public CoverageCatalogueV2Service(WebServiceFeature ... features) {
        super(WSDL_LOCATION, SERVICE, features);
    }

    public CoverageCatalogueV2Service(URL wsdlLocation, WebServiceFeature ... features) {
        super(wsdlLocation, SERVICE, features);
    }

    public CoverageCatalogueV2Service(URL wsdlLocation, QName serviceName, WebServiceFeature ... features) {
        super(wsdlLocation, serviceName, features);
    }    




    /**
     *
     * @return
     *     returns CoverageCatalogueV2
     */
    @WebEndpoint(name = "coverageCatalogueV2Port")
    public CoverageCatalogueV2 getCoverageCatalogueV2Port() {
        return super.getPort(CoverageCatalogueV2Port, CoverageCatalogueV2.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns CoverageCatalogueV2
     */
    @WebEndpoint(name = "coverageCatalogueV2Port")
    public CoverageCatalogueV2 getCoverageCatalogueV2Port(WebServiceFeature... features) {
        return super.getPort(CoverageCatalogueV2Port, CoverageCatalogueV2.class, features);
    }

}