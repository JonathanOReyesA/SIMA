
package pe.com.gentera;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the pe.com.gentera package. 
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

    private final static QName _ClaimAutomaticPayment_QNAME = new QName("http://gentera.com.pe/", "claimAutomaticPayment");
    private final static QName _ClaimAutomaticPaymentResponse_QNAME = new QName("http://gentera.com.pe/", "claimAutomaticPaymentResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: pe.com.gentera
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link ClaimAutomaticPayment }
     * 
     */
    public ClaimAutomaticPayment createClaimAutomaticPayment() {
        return new ClaimAutomaticPayment();
    }

    /**
     * Create an instance of {@link ClaimAutomaticPaymentResponse }
     * 
     */
    public ClaimAutomaticPaymentResponse createClaimAutomaticPaymentResponse() {
        return new ClaimAutomaticPaymentResponse();
    }

    /**
     * Create an instance of {@link ClaimInsurancePaymentResMsgDataTypePE }
     * 
     */
    public ClaimInsurancePaymentResMsgDataTypePE createClaimInsurancePaymentResMsgDataTypePE() {
        return new ClaimInsurancePaymentResMsgDataTypePE();
    }

    /**
     * Create an instance of {@link ClaimInsuranceDetailDataTypePNEPE }
     * 
     */
    public ClaimInsuranceDetailDataTypePNEPE createClaimInsuranceDetailDataTypePNEPE() {
        return new ClaimInsuranceDetailDataTypePNEPE();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ClaimAutomaticPayment }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://gentera.com.pe/", name = "claimAutomaticPayment")
    public JAXBElement<ClaimAutomaticPayment> createClaimAutomaticPayment(ClaimAutomaticPayment value) {
        return new JAXBElement<ClaimAutomaticPayment>(_ClaimAutomaticPayment_QNAME, ClaimAutomaticPayment.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ClaimAutomaticPaymentResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://gentera.com.pe/", name = "claimAutomaticPaymentResponse")
    public JAXBElement<ClaimAutomaticPaymentResponse> createClaimAutomaticPaymentResponse(ClaimAutomaticPaymentResponse value) {
        return new JAXBElement<ClaimAutomaticPaymentResponse>(_ClaimAutomaticPaymentResponse_QNAME, ClaimAutomaticPaymentResponse.class, null, value);
    }

}
