
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

    private final static QName _GetAffectedName_QNAME = new QName("http://gentera.com.mx/", "getAffectedName");
    private final static QName _GetAffectedNameResponse_QNAME = new QName("http://gentera.com.mx/", "getAffectedNameResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: mx.com.gentera
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link GetAffectedName_Type }
     * 
     */
    public GetAffectedName_Type createGetAffectedName_Type() {
        return new GetAffectedName_Type();
    }

    /**
     * Create an instance of {@link GetAffectedNameResponse }
     * 
     */
    public GetAffectedNameResponse createGetAffectedNameResponse() {
        return new GetAffectedNameResponse();
    }

    /**
     * Create an instance of {@link GetAffectedResponse }
     * 
     */
    public GetAffectedResponse createGetAffectedResponse() {
        return new GetAffectedResponse();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetAffectedName_Type }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://gentera.com.mx/", name = "getAffectedName")
    public JAXBElement<GetAffectedName_Type> createGetAffectedName(GetAffectedName_Type value) {
        return new JAXBElement<GetAffectedName_Type>(_GetAffectedName_QNAME, GetAffectedName_Type.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetAffectedNameResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://gentera.com.mx/", name = "getAffectedNameResponse")
    public JAXBElement<GetAffectedNameResponse> createGetAffectedNameResponse(GetAffectedNameResponse value) {
        return new JAXBElement<GetAffectedNameResponse>(_GetAffectedNameResponse_QNAME, GetAffectedNameResponse.class, null, value);
    }

}
