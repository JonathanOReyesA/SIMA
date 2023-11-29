
package org.tempuri;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.datatype.XMLGregorianCalendar;
import javax.xml.namespace.QName;
import org.datacontract.schemas._2004._07.cmessage.ArrayOfCComponente;
import org.datacontract.schemas._2004._07.cmessage.ArrayOfCDUsuario;
import org.datacontract.schemas._2004._07.cmessage.ArrayOfCEmpresa;
import org.datacontract.schemas._2004._07.cmessage.ArrayOfCPerfiles;
import org.datacontract.schemas._2004._07.cmessage.ArrayOfCSistema;
import org.datacontract.schemas._2004._07.cmessage.ArrayOfContactPerson;
import org.datacontract.schemas._2004._07.cmessage.CMessageContentHeader;
import org.datacontract.schemas._2004._07.cmessage.CUsuario;
import org.datacontract.schemas._2004._07.cmessage.Log;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the org.tempuri package. 
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

    private final static QName _CreationDateTime_QNAME = new QName("http://tempuri.org/", "CreationDateTime");
    private final static QName _ID_QNAME = new QName("http://tempuri.org/", "ID");
    private final static QName _RecipientBusinessSystemID_QNAME = new QName("http://tempuri.org/", "RecipientBusinessSystemID");
    private final static QName _RecipientParty_QNAME = new QName("http://tempuri.org/", "RecipientParty");
    private final static QName _ReferenceID_QNAME = new QName("http://tempuri.org/", "ReferenceID");
    private final static QName _ReferenceUUID_QNAME = new QName("http://tempuri.org/", "ReferenceUUID");
    private final static QName _SenderBusinessSystemID_QNAME = new QName("http://tempuri.org/", "SenderBusinessSystemID");
    private final static QName _SenderParty_QNAME = new QName("http://tempuri.org/", "SenderParty");
    private final static QName _TestDataIndicator_QNAME = new QName("http://tempuri.org/", "TestDataIndicator");
    private final static QName _UUID_QNAME = new QName("http://tempuri.org/", "UUID");
    private final static QName _ResponseUmMessageContent_QNAME = new QName("http://tempuri.org/", "MessageContent");
    private final static QName _ResponseUmUsuario_QNAME = new QName("http://tempuri.org/", "Usuario");
    private final static QName _ResponseUmPerfil_QNAME = new QName("http://tempuri.org/", "Perfil");
    private final static QName _ResponseUmSistema_QNAME = new QName("http://tempuri.org/", "Sistema");
    private final static QName _ResponseUmUltimoAcces_QNAME = new QName("http://tempuri.org/", "UltimoAcces");
    private final static QName _ResponseUmAviso_QNAME = new QName("http://tempuri.org/", "Aviso");
    private final static QName _ResponseUmMenus_QNAME = new QName("http://tempuri.org/", "Menus");
    private final static QName _ResponseUmSubMenu_QNAME = new QName("http://tempuri.org/", "SubMenu");
    private final static QName _ResponseUmComponentes_QNAME = new QName("http://tempuri.org/", "Componentes");
    private final static QName _ResponseUmLog_QNAME = new QName("http://tempuri.org/", "Log");
    private final static QName _ResponseEmpresasMessageContentI_QNAME = new QName("http://tempuri.org/", "MessageContentI");
    private final static QName _ResponseEmpresasEmpresas_QNAME = new QName("http://tempuri.org/", "Empresas");
    private final static QName _ResponsePerfilesMessageContentII_QNAME = new QName("http://tempuri.org/", "MessageContentII");
    private final static QName _ResponsePerfilesEmpresa_QNAME = new QName("http://tempuri.org/", "Empresa");
    private final static QName _ResponsePerfilesListaPerfiles_QNAME = new QName("http://tempuri.org/", "ListaPerfiles");
    private final static QName _ResponseAdmUsuarioMessageContentIII_QNAME = new QName("http://tempuri.org/", "MessageContentIII");
    private final static QName _ResponseGetUsuariosListaUsuarios_QNAME = new QName("http://tempuri.org/", "ListaUsuarios");
    private final static QName _AdminSistemaMessageContentSistema_QNAME = new QName("http://tempuri.org/", "MessageContentSistema");
    private final static QName _AdminSistemaLstSistema_QNAME = new QName("http://tempuri.org/", "LstSistema");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: org.tempuri
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link ResponseUm }
     * 
     */
    public ResponseUm createResponseUm() {
        return new ResponseUm();
    }

    /**
     * Create an instance of {@link ResponseEmpresas }
     * 
     */
    public ResponseEmpresas createResponseEmpresas() {
        return new ResponseEmpresas();
    }

    /**
     * Create an instance of {@link ResponsePerfiles }
     * 
     */
    public ResponsePerfiles createResponsePerfiles() {
        return new ResponsePerfiles();
    }

    /**
     * Create an instance of {@link ResponseAdmUsuario }
     * 
     */
    public ResponseAdmUsuario createResponseAdmUsuario() {
        return new ResponseAdmUsuario();
    }

    /**
     * Create an instance of {@link ResponseGetUsuarios }
     * 
     */
    public ResponseGetUsuarios createResponseGetUsuarios() {
        return new ResponseGetUsuarios();
    }

    /**
     * Create an instance of {@link AdminSistema }
     * 
     */
    public AdminSistema createAdminSistema() {
        return new AdminSistema();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "CreationDateTime")
    public JAXBElement<XMLGregorianCalendar> createCreationDateTime(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_CreationDateTime_QNAME, XMLGregorianCalendar.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "ID")
    public JAXBElement<String> createID(String value) {
        return new JAXBElement<String>(_ID_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "RecipientBusinessSystemID")
    public JAXBElement<String> createRecipientBusinessSystemID(String value) {
        return new JAXBElement<String>(_RecipientBusinessSystemID_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfContactPerson }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "RecipientParty")
    public JAXBElement<ArrayOfContactPerson> createRecipientParty(ArrayOfContactPerson value) {
        return new JAXBElement<ArrayOfContactPerson>(_RecipientParty_QNAME, ArrayOfContactPerson.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "ReferenceID")
    public JAXBElement<String> createReferenceID(String value) {
        return new JAXBElement<String>(_ReferenceID_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "ReferenceUUID")
    public JAXBElement<String> createReferenceUUID(String value) {
        return new JAXBElement<String>(_ReferenceUUID_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "SenderBusinessSystemID")
    public JAXBElement<String> createSenderBusinessSystemID(String value) {
        return new JAXBElement<String>(_SenderBusinessSystemID_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfContactPerson }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "SenderParty")
    public JAXBElement<ArrayOfContactPerson> createSenderParty(ArrayOfContactPerson value) {
        return new JAXBElement<ArrayOfContactPerson>(_SenderParty_QNAME, ArrayOfContactPerson.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "TestDataIndicator")
    public JAXBElement<String> createTestDataIndicator(String value) {
        return new JAXBElement<String>(_TestDataIndicator_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "UUID")
    public JAXBElement<String> createUUID(String value) {
        return new JAXBElement<String>(_UUID_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CMessageContentHeader }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "MessageContent", scope = ResponseUm.class)
    public JAXBElement<CMessageContentHeader> createResponseUmMessageContent(CMessageContentHeader value) {
        return new JAXBElement<CMessageContentHeader>(_ResponseUmMessageContent_QNAME, CMessageContentHeader.class, ResponseUm.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "Usuario", scope = ResponseUm.class)
    public JAXBElement<String> createResponseUmUsuario(String value) {
        return new JAXBElement<String>(_ResponseUmUsuario_QNAME, String.class, ResponseUm.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "Perfil", scope = ResponseUm.class)
    public JAXBElement<String> createResponseUmPerfil(String value) {
        return new JAXBElement<String>(_ResponseUmPerfil_QNAME, String.class, ResponseUm.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "Sistema", scope = ResponseUm.class)
    public JAXBElement<String> createResponseUmSistema(String value) {
        return new JAXBElement<String>(_ResponseUmSistema_QNAME, String.class, ResponseUm.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "UltimoAcces", scope = ResponseUm.class)
    public JAXBElement<String> createResponseUmUltimoAcces(String value) {
        return new JAXBElement<String>(_ResponseUmUltimoAcces_QNAME, String.class, ResponseUm.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "Aviso", scope = ResponseUm.class)
    public JAXBElement<String> createResponseUmAviso(String value) {
        return new JAXBElement<String>(_ResponseUmAviso_QNAME, String.class, ResponseUm.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfCComponente }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "Menus", scope = ResponseUm.class)
    public JAXBElement<ArrayOfCComponente> createResponseUmMenus(ArrayOfCComponente value) {
        return new JAXBElement<ArrayOfCComponente>(_ResponseUmMenus_QNAME, ArrayOfCComponente.class, ResponseUm.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfCComponente }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "SubMenu", scope = ResponseUm.class)
    public JAXBElement<ArrayOfCComponente> createResponseUmSubMenu(ArrayOfCComponente value) {
        return new JAXBElement<ArrayOfCComponente>(_ResponseUmSubMenu_QNAME, ArrayOfCComponente.class, ResponseUm.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfCComponente }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "Componentes", scope = ResponseUm.class)
    public JAXBElement<ArrayOfCComponente> createResponseUmComponentes(ArrayOfCComponente value) {
        return new JAXBElement<ArrayOfCComponente>(_ResponseUmComponentes_QNAME, ArrayOfCComponente.class, ResponseUm.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Log }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "Log", scope = ResponseUm.class)
    public JAXBElement<Log> createResponseUmLog(Log value) {
        return new JAXBElement<Log>(_ResponseUmLog_QNAME, Log.class, ResponseUm.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CMessageContentHeader }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "MessageContentI", scope = ResponseEmpresas.class)
    public JAXBElement<CMessageContentHeader> createResponseEmpresasMessageContentI(CMessageContentHeader value) {
        return new JAXBElement<CMessageContentHeader>(_ResponseEmpresasMessageContentI_QNAME, CMessageContentHeader.class, ResponseEmpresas.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "Sistema", scope = ResponseEmpresas.class)
    public JAXBElement<String> createResponseEmpresasSistema(String value) {
        return new JAXBElement<String>(_ResponseUmSistema_QNAME, String.class, ResponseEmpresas.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfCEmpresa }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "Empresas", scope = ResponseEmpresas.class)
    public JAXBElement<ArrayOfCEmpresa> createResponseEmpresasEmpresas(ArrayOfCEmpresa value) {
        return new JAXBElement<ArrayOfCEmpresa>(_ResponseEmpresasEmpresas_QNAME, ArrayOfCEmpresa.class, ResponseEmpresas.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Log }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "Log", scope = ResponseEmpresas.class)
    public JAXBElement<Log> createResponseEmpresasLog(Log value) {
        return new JAXBElement<Log>(_ResponseUmLog_QNAME, Log.class, ResponseEmpresas.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CMessageContentHeader }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "MessageContentII", scope = ResponsePerfiles.class)
    public JAXBElement<CMessageContentHeader> createResponsePerfilesMessageContentII(CMessageContentHeader value) {
        return new JAXBElement<CMessageContentHeader>(_ResponsePerfilesMessageContentII_QNAME, CMessageContentHeader.class, ResponsePerfiles.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "Sistema", scope = ResponsePerfiles.class)
    public JAXBElement<String> createResponsePerfilesSistema(String value) {
        return new JAXBElement<String>(_ResponseUmSistema_QNAME, String.class, ResponsePerfiles.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "Empresa", scope = ResponsePerfiles.class)
    public JAXBElement<String> createResponsePerfilesEmpresa(String value) {
        return new JAXBElement<String>(_ResponsePerfilesEmpresa_QNAME, String.class, ResponsePerfiles.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfCPerfiles }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "ListaPerfiles", scope = ResponsePerfiles.class)
    public JAXBElement<ArrayOfCPerfiles> createResponsePerfilesListaPerfiles(ArrayOfCPerfiles value) {
        return new JAXBElement<ArrayOfCPerfiles>(_ResponsePerfilesListaPerfiles_QNAME, ArrayOfCPerfiles.class, ResponsePerfiles.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Log }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "Log", scope = ResponsePerfiles.class)
    public JAXBElement<Log> createResponsePerfilesLog(Log value) {
        return new JAXBElement<Log>(_ResponseUmLog_QNAME, Log.class, ResponsePerfiles.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CMessageContentHeader }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "MessageContentIII", scope = ResponseAdmUsuario.class)
    public JAXBElement<CMessageContentHeader> createResponseAdmUsuarioMessageContentIII(CMessageContentHeader value) {
        return new JAXBElement<CMessageContentHeader>(_ResponseAdmUsuarioMessageContentIII_QNAME, CMessageContentHeader.class, ResponseAdmUsuario.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "Sistema", scope = ResponseAdmUsuario.class)
    public JAXBElement<String> createResponseAdmUsuarioSistema(String value) {
        return new JAXBElement<String>(_ResponseUmSistema_QNAME, String.class, ResponseAdmUsuario.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "Empresa", scope = ResponseAdmUsuario.class)
    public JAXBElement<String> createResponseAdmUsuarioEmpresa(String value) {
        return new JAXBElement<String>(_ResponsePerfilesEmpresa_QNAME, String.class, ResponseAdmUsuario.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CUsuario }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "Usuario", scope = ResponseAdmUsuario.class)
    public JAXBElement<CUsuario> createResponseAdmUsuarioUsuario(CUsuario value) {
        return new JAXBElement<CUsuario>(_ResponseUmUsuario_QNAME, CUsuario.class, ResponseAdmUsuario.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Log }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "Log", scope = ResponseAdmUsuario.class)
    public JAXBElement<Log> createResponseAdmUsuarioLog(Log value) {
        return new JAXBElement<Log>(_ResponseUmLog_QNAME, Log.class, ResponseAdmUsuario.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CMessageContentHeader }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "MessageContentII", scope = ResponseGetUsuarios.class)
    public JAXBElement<CMessageContentHeader> createResponseGetUsuariosMessageContentII(CMessageContentHeader value) {
        return new JAXBElement<CMessageContentHeader>(_ResponsePerfilesMessageContentII_QNAME, CMessageContentHeader.class, ResponseGetUsuarios.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "Sistema", scope = ResponseGetUsuarios.class)
    public JAXBElement<String> createResponseGetUsuariosSistema(String value) {
        return new JAXBElement<String>(_ResponseUmSistema_QNAME, String.class, ResponseGetUsuarios.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "Empresa", scope = ResponseGetUsuarios.class)
    public JAXBElement<String> createResponseGetUsuariosEmpresa(String value) {
        return new JAXBElement<String>(_ResponsePerfilesEmpresa_QNAME, String.class, ResponseGetUsuarios.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfCDUsuario }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "ListaUsuarios", scope = ResponseGetUsuarios.class)
    public JAXBElement<ArrayOfCDUsuario> createResponseGetUsuariosListaUsuarios(ArrayOfCDUsuario value) {
        return new JAXBElement<ArrayOfCDUsuario>(_ResponseGetUsuariosListaUsuarios_QNAME, ArrayOfCDUsuario.class, ResponseGetUsuarios.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Log }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "Log", scope = ResponseGetUsuarios.class)
    public JAXBElement<Log> createResponseGetUsuariosLog(Log value) {
        return new JAXBElement<Log>(_ResponseUmLog_QNAME, Log.class, ResponseGetUsuarios.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CMessageContentHeader }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "MessageContentSistema", scope = AdminSistema.class)
    public JAXBElement<CMessageContentHeader> createAdminSistemaMessageContentSistema(CMessageContentHeader value) {
        return new JAXBElement<CMessageContentHeader>(_AdminSistemaMessageContentSistema_QNAME, CMessageContentHeader.class, AdminSistema.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfCSistema }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "LstSistema", scope = AdminSistema.class)
    public JAXBElement<ArrayOfCSistema> createAdminSistemaLstSistema(ArrayOfCSistema value) {
        return new JAXBElement<ArrayOfCSistema>(_AdminSistemaLstSistema_QNAME, ArrayOfCSistema.class, AdminSistema.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Log }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "Log", scope = AdminSistema.class)
    public JAXBElement<Log> createAdminSistemaLog(Log value) {
        return new JAXBElement<Log>(_ResponseUmLog_QNAME, Log.class, AdminSistema.class, value);
    }

}
