package org.tempuri;

import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceFeature;
import javax.xml.ws.Service;

/**
 * This class was generated by Apache CXF 3.1.13
 * 2023-12-05T17:34:57.062-06:00
 * Generated source version: 3.1.13
 * 
 */
@WebServiceClient(name = "WFCUM", 
                  wsdlLocation = "file:/C:/Users/e-jonreyes/Documents/workspace-spring-tool-suite-sima-service/seguros/sima/sima-web/src/main/resources/wsdl/card.wsdl",
                  targetNamespace = "http://tempuri.org/") 
public class WFCUM extends Service {

    public final static URL WSDL_LOCATION;

    public final static QName SERVICE = new QName("http://tempuri.org/", "WFCUM");
    public final static QName BasicHttpBindingIWFCUM = new QName("http://tempuri.org/", "BasicHttpBinding_IWFCUM");
    static {
        URL url = null;
        try {
            url = new URL("file:/C:/Users/e-jonreyes/Documents/workspace-spring-tool-suite-sima-service/seguros/sima/sima-web/src/main/resources/wsdl/card.wsdl");
        } catch (MalformedURLException e) {
            java.util.logging.Logger.getLogger(WFCUM.class.getName())
                .log(java.util.logging.Level.INFO, 
                     "Can not initialize the default wsdl from {0}", "file:/C:/Users/e-jonreyes/Documents/workspace-spring-tool-suite-sima-service/seguros/sima/sima-web/src/main/resources/wsdl/card.wsdl");
        }
        WSDL_LOCATION = url;
    }

    public WFCUM(URL wsdlLocation) {
        super(wsdlLocation, SERVICE);
    }

    public WFCUM(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public WFCUM() {
        super(WSDL_LOCATION, SERVICE);
    }
    
    public WFCUM(WebServiceFeature ... features) {
        super(WSDL_LOCATION, SERVICE, features);
    }

    public WFCUM(URL wsdlLocation, WebServiceFeature ... features) {
        super(wsdlLocation, SERVICE, features);
    }

    public WFCUM(URL wsdlLocation, QName serviceName, WebServiceFeature ... features) {
        super(wsdlLocation, serviceName, features);
    }    




    /**
     *
     * @return
     *     returns IWFCUM
     */
    @WebEndpoint(name = "BasicHttpBinding_IWFCUM")
    public IWFCUM getBasicHttpBindingIWFCUM() {
        return super.getPort(BasicHttpBindingIWFCUM, IWFCUM.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns IWFCUM
     */
    @WebEndpoint(name = "BasicHttpBinding_IWFCUM")
    public IWFCUM getBasicHttpBindingIWFCUM(WebServiceFeature... features) {
        return super.getPort(BasicHttpBindingIWFCUM, IWFCUM.class, features);
    }

}
