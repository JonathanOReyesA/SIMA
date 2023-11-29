
package generated;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;
import org.datacontract.schemas._2004._07.cmessage.CAutenticacion;
import org.datacontract.schemas._2004._07.cmessage.CREmpresas;
import org.datacontract.schemas._2004._07.cmessage.CRPerfiles;
import org.datacontract.schemas._2004._07.cmessage.CRSistema;
import org.datacontract.schemas._2004._07.cmessage.CRUsuario;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the generated package. 
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

    private final static QName _MessageContent_QNAME = new QName("", "MessageContent");
    private final static QName _MessageEmpresa_QNAME = new QName("", "MessageEmpresa");
    private final static QName _MessagePerfiles_QNAME = new QName("", "MessagePerfiles");
    private final static QName _AdmUsuario_QNAME = new QName("", "AdmUsuario");
    private final static QName _MessageUsuarios_QNAME = new QName("", "MessageUsuarios");
    private final static QName _MessaheSistemas_QNAME = new QName("", "MessaheSistemas");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: generated
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CAutenticacion }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "MessageContent")
    public JAXBElement<CAutenticacion> createMessageContent(CAutenticacion value) {
        return new JAXBElement<CAutenticacion>(_MessageContent_QNAME, CAutenticacion.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CREmpresas }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "MessageEmpresa")
    public JAXBElement<CREmpresas> createMessageEmpresa(CREmpresas value) {
        return new JAXBElement<CREmpresas>(_MessageEmpresa_QNAME, CREmpresas.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CRPerfiles }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "MessagePerfiles")
    public JAXBElement<CRPerfiles> createMessagePerfiles(CRPerfiles value) {
        return new JAXBElement<CRPerfiles>(_MessagePerfiles_QNAME, CRPerfiles.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CRUsuario }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "AdmUsuario")
    public JAXBElement<CRUsuario> createAdmUsuario(CRUsuario value) {
        return new JAXBElement<CRUsuario>(_AdmUsuario_QNAME, CRUsuario.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CRPerfiles }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "MessageUsuarios")
    public JAXBElement<CRPerfiles> createMessageUsuarios(CRPerfiles value) {
        return new JAXBElement<CRPerfiles>(_MessageUsuarios_QNAME, CRPerfiles.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CRSistema }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "MessaheSistemas")
    public JAXBElement<CRSistema> createMessaheSistemas(CRSistema value) {
        return new JAXBElement<CRSistema>(_MessaheSistemas_QNAME, CRSistema.class, null, value);
    }

}
