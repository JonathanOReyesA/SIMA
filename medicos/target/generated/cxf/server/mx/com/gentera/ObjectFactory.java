
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

    private final static QName _SearchClaims_QNAME = new QName("http://gentera.com.mx/", "searchClaims");
    private final static QName _SearchClaimsResponse_QNAME = new QName("http://gentera.com.mx/", "searchClaimsResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: mx.com.gentera
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link SearchClaims_Type }
     * 
     */
    public SearchClaims_Type createSearchClaims_Type() {
        return new SearchClaims_Type();
    }

    /**
     * Create an instance of {@link SearchClaimsResponse }
     * 
     */
    public SearchClaimsResponse createSearchClaimsResponse() {
        return new SearchClaimsResponse();
    }

    /**
     * Create an instance of {@link ClaimsRespMsgDataType }
     * 
     */
    public ClaimsRespMsgDataType createClaimsRespMsgDataType() {
        return new ClaimsRespMsgDataType();
    }

    /**
     * Create an instance of {@link ClaimsDataType }
     * 
     */
    public ClaimsDataType createClaimsDataType() {
        return new ClaimsDataType();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SearchClaims_Type }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://gentera.com.mx/", name = "searchClaims")
    public JAXBElement<SearchClaims_Type> createSearchClaims(SearchClaims_Type value) {
        return new JAXBElement<SearchClaims_Type>(_SearchClaims_QNAME, SearchClaims_Type.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SearchClaimsResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://gentera.com.mx/", name = "searchClaimsResponse")
    public JAXBElement<SearchClaimsResponse> createSearchClaimsResponse(SearchClaimsResponse value) {
        return new JAXBElement<SearchClaimsResponse>(_SearchClaimsResponse_QNAME, SearchClaimsResponse.class, null, value);
    }

}
