
package mx.com.gentera.global;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;
import mx.com.gentera.crmms._000.businesspartnermanage.int_0334.v2.DTBusinessPartnerCreateReqSync;
import mx.com.gentera.crmms._000.businesspartnermanage.int_0334.v2.DTBusinessPartnerCreateRespSync;
import mx.com.gentera.crmms._000.businesspartnermanage.int_0334.v2.DTBusinessPartnerRetrieveReqSync;
import mx.com.gentera.crmms._000.businesspartnermanage.int_0334.v2.DTBusinessPartnerRetrieveRespSync;
import mx.com.gentera.crmms._000.businesspartnermanage.int_0334.v2.DTBusinessPartnerUpdateReqSync;
import mx.com.gentera.crmms._000.businesspartnermanage.int_0334.v2.DTBusinessPartnerUpdateRespSync;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the mx.com.gentera.global package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _MTBusinessPartnerRetrieveReqSync_QNAME = new QName("http://gentera.com.mx/global", "MT_BusinessPartnerRetrieveReq_sync");
    private final static QName _MTBusinessPartnerUpdateRespSync_QNAME = new QName("http://gentera.com.mx/global", "MT_BusinessPartnerUpdateResp_sync");
    private final static QName _MTBusinessPartnerRetrieveRespSync_QNAME = new QName("http://gentera.com.mx/global", "MT_BusinessPartnerRetrieveResp_sync");
    private final static QName _MTBusinessPartnerCreateReqSync_QNAME = new QName("http://gentera.com.mx/global", "MT_BusinessPartnerCreateReq_sync");
    private final static QName _MTBusinessPartnerUpdateReqSync_QNAME = new QName("http://gentera.com.mx/global", "MT_BusinessPartnerUpdateReq_sync");
    private final static QName _MTBusinessPartnerCreateRespSync_QNAME = new QName("http://gentera.com.mx/global", "MT_BusinessPartnerCreateResp_sync");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: mx.com.gentera.global
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DTBusinessPartnerRetrieveReqSync }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://gentera.com.mx/global", name = "MT_BusinessPartnerRetrieveReq_sync")
    public JAXBElement<DTBusinessPartnerRetrieveReqSync> createMTBusinessPartnerRetrieveReqSync(DTBusinessPartnerRetrieveReqSync value) {
        return new JAXBElement<DTBusinessPartnerRetrieveReqSync>(_MTBusinessPartnerRetrieveReqSync_QNAME, DTBusinessPartnerRetrieveReqSync.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DTBusinessPartnerUpdateRespSync }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://gentera.com.mx/global", name = "MT_BusinessPartnerUpdateResp_sync")
    public JAXBElement<DTBusinessPartnerUpdateRespSync> createMTBusinessPartnerUpdateRespSync(DTBusinessPartnerUpdateRespSync value) {
        return new JAXBElement<DTBusinessPartnerUpdateRespSync>(_MTBusinessPartnerUpdateRespSync_QNAME, DTBusinessPartnerUpdateRespSync.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DTBusinessPartnerRetrieveRespSync }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://gentera.com.mx/global", name = "MT_BusinessPartnerRetrieveResp_sync")
    public JAXBElement<DTBusinessPartnerRetrieveRespSync> createMTBusinessPartnerRetrieveRespSync(DTBusinessPartnerRetrieveRespSync value) {
        return new JAXBElement<DTBusinessPartnerRetrieveRespSync>(_MTBusinessPartnerRetrieveRespSync_QNAME, DTBusinessPartnerRetrieveRespSync.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DTBusinessPartnerCreateReqSync }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://gentera.com.mx/global", name = "MT_BusinessPartnerCreateReq_sync")
    public JAXBElement<DTBusinessPartnerCreateReqSync> createMTBusinessPartnerCreateReqSync(DTBusinessPartnerCreateReqSync value) {
        return new JAXBElement<DTBusinessPartnerCreateReqSync>(_MTBusinessPartnerCreateReqSync_QNAME, DTBusinessPartnerCreateReqSync.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DTBusinessPartnerUpdateReqSync }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://gentera.com.mx/global", name = "MT_BusinessPartnerUpdateReq_sync")
    public JAXBElement<DTBusinessPartnerUpdateReqSync> createMTBusinessPartnerUpdateReqSync(DTBusinessPartnerUpdateReqSync value) {
        return new JAXBElement<DTBusinessPartnerUpdateReqSync>(_MTBusinessPartnerUpdateReqSync_QNAME, DTBusinessPartnerUpdateReqSync.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DTBusinessPartnerCreateRespSync }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://gentera.com.mx/global", name = "MT_BusinessPartnerCreateResp_sync")
    public JAXBElement<DTBusinessPartnerCreateRespSync> createMTBusinessPartnerCreateRespSync(DTBusinessPartnerCreateRespSync value) {
        return new JAXBElement<DTBusinessPartnerCreateRespSync>(_MTBusinessPartnerCreateRespSync_QNAME, DTBusinessPartnerCreateRespSync.class, null, value);
    }

}
