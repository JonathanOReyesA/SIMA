
package mx.com.gentera;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the mx.com.gentera package. 
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

    private final static QName _ClaimStatusCatalogue_QNAME = new QName("http://gentera.com.mx/", "claimStatusCatalogue");
    private final static QName _ClaimStatusCatalogueResponse_QNAME = new QName("http://gentera.com.mx/", "claimStatusCatalogueResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: mx.com.gentera
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link ClaimStatusCatalogue_Type }
     * 
     */
    public ClaimStatusCatalogue_Type createClaimStatusCatalogue_Type() {
        return new ClaimStatusCatalogue_Type();
    }

    /**
     * Create an instance of {@link ClaimStatusCatalogueResponse }
     * 
     */
    public ClaimStatusCatalogueResponse createClaimStatusCatalogueResponse() {
        return new ClaimStatusCatalogueResponse();
    }

    /**
     * Create an instance of {@link ClaimStatusCatalogueRespMsgDataType }
     * 
     */
    public ClaimStatusCatalogueRespMsgDataType createClaimStatusCatalogueRespMsgDataType() {
        return new ClaimStatusCatalogueRespMsgDataType();
    }

    /**
     * Create an instance of {@link ClaimStatusDataType }
     * 
     */
    public ClaimStatusDataType createClaimStatusDataType() {
        return new ClaimStatusDataType();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ClaimStatusCatalogue_Type }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://gentera.com.mx/", name = "claimStatusCatalogue")
    public JAXBElement<ClaimStatusCatalogue_Type> createClaimStatusCatalogue(ClaimStatusCatalogue_Type value) {
        return new JAXBElement<ClaimStatusCatalogue_Type>(_ClaimStatusCatalogue_QNAME, ClaimStatusCatalogue_Type.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ClaimStatusCatalogueResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://gentera.com.mx/", name = "claimStatusCatalogueResponse")
    public JAXBElement<ClaimStatusCatalogueResponse> createClaimStatusCatalogueResponse(ClaimStatusCatalogueResponse value) {
        return new JAXBElement<ClaimStatusCatalogueResponse>(_ClaimStatusCatalogueResponse_QNAME, ClaimStatusCatalogueResponse.class, null, value);
    }

}
