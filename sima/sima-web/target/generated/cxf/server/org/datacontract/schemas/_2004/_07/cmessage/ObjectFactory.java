
package org.datacontract.schemas._2004._07.cmessage;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the org.datacontract.schemas._2004._07.cmessage package. 
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

    private final static QName _CAutenticacion_QNAME = new QName("http://schemas.datacontract.org/2004/07/CMessage", "CAutenticacion");
    private final static QName _CMessageContentHeader_QNAME = new QName("http://schemas.datacontract.org/2004/07/CMessage", "CMessageContentHeader");
    private final static QName _IdentificationParty_QNAME = new QName("http://schemas.datacontract.org/2004/07/CMessage", "IdentificationParty");
    private final static QName _ArrayOfContactPerson_QNAME = new QName("http://schemas.datacontract.org/2004/07/CMessage", "ArrayOfContactPerson");
    private final static QName _ContactPerson_QNAME = new QName("http://schemas.datacontract.org/2004/07/CMessage", "ContactPerson");
    private final static QName _ArrayOfCComponente_QNAME = new QName("http://schemas.datacontract.org/2004/07/CMessage", "ArrayOfCComponente");
    private final static QName _CComponente_QNAME = new QName("http://schemas.datacontract.org/2004/07/CMessage", "CComponente");
    private final static QName _TipoComponente_QNAME = new QName("http://schemas.datacontract.org/2004/07/CMessage", "TipoComponente");
    private final static QName _Log_QNAME = new QName("http://schemas.datacontract.org/2004/07/CMessage", "Log");
    private final static QName _Item_QNAME = new QName("http://schemas.datacontract.org/2004/07/CMessage", "Item");
    private final static QName _CREmpresas_QNAME = new QName("http://schemas.datacontract.org/2004/07/CMessage", "CREmpresas");
    private final static QName _ArrayOfCEmpresa_QNAME = new QName("http://schemas.datacontract.org/2004/07/CMessage", "ArrayOfCEmpresa");
    private final static QName _CEmpresa_QNAME = new QName("http://schemas.datacontract.org/2004/07/CMessage", "CEmpresa");
    private final static QName _CRPerfiles_QNAME = new QName("http://schemas.datacontract.org/2004/07/CMessage", "CRPerfiles");
    private final static QName _ArrayOfCPerfiles_QNAME = new QName("http://schemas.datacontract.org/2004/07/CMessage", "ArrayOfCPerfiles");
    private final static QName _CPerfiles_QNAME = new QName("http://schemas.datacontract.org/2004/07/CMessage", "CPerfiles");
    private final static QName _CRUsuario_QNAME = new QName("http://schemas.datacontract.org/2004/07/CMessage", "CRUsuario");
    private final static QName _CUsuario_QNAME = new QName("http://schemas.datacontract.org/2004/07/CMessage", "CUsuario");
    private final static QName _ArrayOfCDUsuario_QNAME = new QName("http://schemas.datacontract.org/2004/07/CMessage", "ArrayOfCDUsuario");
    private final static QName _CDUsuario_QNAME = new QName("http://schemas.datacontract.org/2004/07/CMessage", "CDUsuario");
    private final static QName _CRSistema_QNAME = new QName("http://schemas.datacontract.org/2004/07/CMessage", "CRSistema");
    private final static QName _CSistema_QNAME = new QName("http://schemas.datacontract.org/2004/07/CMessage", "CSistema");
    private final static QName _ArrayOfCSistema_QNAME = new QName("http://schemas.datacontract.org/2004/07/CMessage", "ArrayOfCSistema");
    private final static QName _CSistemaIdSistema_QNAME = new QName("http://schemas.datacontract.org/2004/07/CMessage", "idSistema");
    private final static QName _CSistemaNombre_QNAME = new QName("http://schemas.datacontract.org/2004/07/CMessage", "nombre");
    private final static QName _CDUsuarioAppelidoUsuario_QNAME = new QName("http://schemas.datacontract.org/2004/07/CMessage", "appelidoUsuario");
    private final static QName _CDUsuarioDescPerfil_QNAME = new QName("http://schemas.datacontract.org/2004/07/CMessage", "descPerfil");
    private final static QName _CDUsuarioDescripcion_QNAME = new QName("http://schemas.datacontract.org/2004/07/CMessage", "descripcion");
    private final static QName _CDUsuarioEstatusUsuario_QNAME = new QName("http://schemas.datacontract.org/2004/07/CMessage", "estatusUsuario");
    private final static QName _CDUsuarioFechaAlta_QNAME = new QName("http://schemas.datacontract.org/2004/07/CMessage", "fechaAlta");
    private final static QName _CDUsuarioIdUsuario_QNAME = new QName("http://schemas.datacontract.org/2004/07/CMessage", "idUsuario");
    private final static QName _CDUsuarioNombreUsuario_QNAME = new QName("http://schemas.datacontract.org/2004/07/CMessage", "nombreUsuario");
    private final static QName _CDUsuarioUltimoRegistro_QNAME = new QName("http://schemas.datacontract.org/2004/07/CMessage", "ultimoRegistro");
    private final static QName _CPerfilesIdPerfil_QNAME = new QName("http://schemas.datacontract.org/2004/07/CMessage", "idPerfil");
    private final static QName _CEmpresaDescEmpresa_QNAME = new QName("http://schemas.datacontract.org/2004/07/CMessage", "descEmpresa");
    private final static QName _CEmpresaIdEmpresa_QNAME = new QName("http://schemas.datacontract.org/2004/07/CMessage", "idEmpresa");
    private final static QName _CEmpresaIdOrigne_QNAME = new QName("http://schemas.datacontract.org/2004/07/CMessage", "idOrigne");
    private final static QName _CEmpresaStatusEmpresa_QNAME = new QName("http://schemas.datacontract.org/2004/07/CMessage", "statusEmpresa");
    private final static QName _ItemCategoryCode_QNAME = new QName("http://schemas.datacontract.org/2004/07/CMessage", "CategoryCode");
    private final static QName _ItemNote_QNAME = new QName("http://schemas.datacontract.org/2004/07/CMessage", "Note");
    private final static QName _ItemReferenceObjectNodeSenderTechnicalID_QNAME = new QName("http://schemas.datacontract.org/2004/07/CMessage", "ReferenceObjectNodeSenderTechnicalID");
    private final static QName _ItemTypeID_QNAME = new QName("http://schemas.datacontract.org/2004/07/CMessage", "TypeID");
    private final static QName _ItemWebURI_QNAME = new QName("http://schemas.datacontract.org/2004/07/CMessage", "WebURI");
    private final static QName _CComponenteNombrecomponente_QNAME = new QName("http://schemas.datacontract.org/2004/07/CMessage", "Nombrecomponente");
    private final static QName _CComponenteDescComponente_QNAME = new QName("http://schemas.datacontract.org/2004/07/CMessage", "descComponente");
    private final static QName _CComponenteImagenComponente_QNAME = new QName("http://schemas.datacontract.org/2004/07/CMessage", "imagenComponente");
    private final static QName _CComponenteNombrePagina_QNAME = new QName("http://schemas.datacontract.org/2004/07/CMessage", "nombrePagina");
    private final static QName _CComponenteUrlDestino_QNAME = new QName("http://schemas.datacontract.org/2004/07/CMessage", "urlDestino");
    private final static QName _ContactPersonInternalID_QNAME = new QName("http://schemas.datacontract.org/2004/07/CMessage", "InternalID");
    private final static QName _IdentificationPartyCompanyDescription_QNAME = new QName("http://schemas.datacontract.org/2004/07/CMessage", "CompanyDescription");
    private final static QName _IdentificationPartyCompanyID_QNAME = new QName("http://schemas.datacontract.org/2004/07/CMessage", "CompanyID");
    private final static QName _CUsuarioApellidos_QNAME = new QName("http://schemas.datacontract.org/2004/07/CMessage", "apellidos");
    private final static QName _CUsuarioEstatus_QNAME = new QName("http://schemas.datacontract.org/2004/07/CMessage", "estatus");
    private final static QName _CRSistemaContent_QNAME = new QName("http://schemas.datacontract.org/2004/07/CMessage", "content");
    private final static QName _CRSistemaSistema_QNAME = new QName("http://schemas.datacontract.org/2004/07/CMessage", "sistema");
    private final static QName _CRUsuarioOperacion_QNAME = new QName("http://schemas.datacontract.org/2004/07/CMessage", "Operacion");
    private final static QName _CRUsuarioApellidosUsuario_QNAME = new QName("http://schemas.datacontract.org/2004/07/CMessage", "apellidosUsuario");
    private final static QName _CRUsuarioDescUsuario_QNAME = new QName("http://schemas.datacontract.org/2004/07/CMessage", "descUsuario");
    private final static QName _CRUsuarioIdEmrpesa_QNAME = new QName("http://schemas.datacontract.org/2004/07/CMessage", "idEmrpesa");
    private final static QName _CRUsuarioPassword_QNAME = new QName("http://schemas.datacontract.org/2004/07/CMessage", "password");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: org.datacontract.schemas._2004._07.cmessage
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link CAutenticacion }
     * 
     */
    public CAutenticacion createCAutenticacion() {
        return new CAutenticacion();
    }

    /**
     * Create an instance of {@link CREmpresas }
     * 
     */
    public CREmpresas createCREmpresas() {
        return new CREmpresas();
    }

    /**
     * Create an instance of {@link CRPerfiles }
     * 
     */
    public CRPerfiles createCRPerfiles() {
        return new CRPerfiles();
    }

    /**
     * Create an instance of {@link CRUsuario }
     * 
     */
    public CRUsuario createCRUsuario() {
        return new CRUsuario();
    }

    /**
     * Create an instance of {@link CRSistema }
     * 
     */
    public CRSistema createCRSistema() {
        return new CRSistema();
    }

    /**
     * Create an instance of {@link ArrayOfContactPerson }
     * 
     */
    public ArrayOfContactPerson createArrayOfContactPerson() {
        return new ArrayOfContactPerson();
    }

    /**
     * Create an instance of {@link CMessageContentHeader }
     * 
     */
    public CMessageContentHeader createCMessageContentHeader() {
        return new CMessageContentHeader();
    }

    /**
     * Create an instance of {@link ArrayOfCComponente }
     * 
     */
    public ArrayOfCComponente createArrayOfCComponente() {
        return new ArrayOfCComponente();
    }

    /**
     * Create an instance of {@link Log }
     * 
     */
    public Log createLog() {
        return new Log();
    }

    /**
     * Create an instance of {@link ArrayOfCEmpresa }
     * 
     */
    public ArrayOfCEmpresa createArrayOfCEmpresa() {
        return new ArrayOfCEmpresa();
    }

    /**
     * Create an instance of {@link ArrayOfCPerfiles }
     * 
     */
    public ArrayOfCPerfiles createArrayOfCPerfiles() {
        return new ArrayOfCPerfiles();
    }

    /**
     * Create an instance of {@link CUsuario }
     * 
     */
    public CUsuario createCUsuario() {
        return new CUsuario();
    }

    /**
     * Create an instance of {@link ArrayOfCDUsuario }
     * 
     */
    public ArrayOfCDUsuario createArrayOfCDUsuario() {
        return new ArrayOfCDUsuario();
    }

    /**
     * Create an instance of {@link ArrayOfCSistema }
     * 
     */
    public ArrayOfCSistema createArrayOfCSistema() {
        return new ArrayOfCSistema();
    }

    /**
     * Create an instance of {@link IdentificationParty }
     * 
     */
    public IdentificationParty createIdentificationParty() {
        return new IdentificationParty();
    }

    /**
     * Create an instance of {@link ContactPerson }
     * 
     */
    public ContactPerson createContactPerson() {
        return new ContactPerson();
    }

    /**
     * Create an instance of {@link CComponente }
     * 
     */
    public CComponente createCComponente() {
        return new CComponente();
    }

    /**
     * Create an instance of {@link Item }
     * 
     */
    public Item createItem() {
        return new Item();
    }

    /**
     * Create an instance of {@link CEmpresa }
     * 
     */
    public CEmpresa createCEmpresa() {
        return new CEmpresa();
    }

    /**
     * Create an instance of {@link CPerfiles }
     * 
     */
    public CPerfiles createCPerfiles() {
        return new CPerfiles();
    }

    /**
     * Create an instance of {@link CDUsuario }
     * 
     */
    public CDUsuario createCDUsuario() {
        return new CDUsuario();
    }

    /**
     * Create an instance of {@link CSistema }
     * 
     */
    public CSistema createCSistema() {
        return new CSistema();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CAutenticacion }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/CMessage", name = "CAutenticacion")
    public JAXBElement<CAutenticacion> createCAutenticacion(CAutenticacion value) {
        return new JAXBElement<CAutenticacion>(_CAutenticacion_QNAME, CAutenticacion.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CMessageContentHeader }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/CMessage", name = "CMessageContentHeader")
    public JAXBElement<CMessageContentHeader> createCMessageContentHeader(CMessageContentHeader value) {
        return new JAXBElement<CMessageContentHeader>(_CMessageContentHeader_QNAME, CMessageContentHeader.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link IdentificationParty }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/CMessage", name = "IdentificationParty")
    public JAXBElement<IdentificationParty> createIdentificationParty(IdentificationParty value) {
        return new JAXBElement<IdentificationParty>(_IdentificationParty_QNAME, IdentificationParty.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfContactPerson }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/CMessage", name = "ArrayOfContactPerson")
    public JAXBElement<ArrayOfContactPerson> createArrayOfContactPerson(ArrayOfContactPerson value) {
        return new JAXBElement<ArrayOfContactPerson>(_ArrayOfContactPerson_QNAME, ArrayOfContactPerson.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ContactPerson }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/CMessage", name = "ContactPerson")
    public JAXBElement<ContactPerson> createContactPerson(ContactPerson value) {
        return new JAXBElement<ContactPerson>(_ContactPerson_QNAME, ContactPerson.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfCComponente }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/CMessage", name = "ArrayOfCComponente")
    public JAXBElement<ArrayOfCComponente> createArrayOfCComponente(ArrayOfCComponente value) {
        return new JAXBElement<ArrayOfCComponente>(_ArrayOfCComponente_QNAME, ArrayOfCComponente.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CComponente }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/CMessage", name = "CComponente")
    public JAXBElement<CComponente> createCComponente(CComponente value) {
        return new JAXBElement<CComponente>(_CComponente_QNAME, CComponente.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TipoComponente }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/CMessage", name = "TipoComponente")
    public JAXBElement<TipoComponente> createTipoComponente(TipoComponente value) {
        return new JAXBElement<TipoComponente>(_TipoComponente_QNAME, TipoComponente.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Log }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/CMessage", name = "Log")
    public JAXBElement<Log> createLog(Log value) {
        return new JAXBElement<Log>(_Log_QNAME, Log.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Item }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/CMessage", name = "Item")
    public JAXBElement<Item> createItem(Item value) {
        return new JAXBElement<Item>(_Item_QNAME, Item.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CREmpresas }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/CMessage", name = "CREmpresas")
    public JAXBElement<CREmpresas> createCREmpresas(CREmpresas value) {
        return new JAXBElement<CREmpresas>(_CREmpresas_QNAME, CREmpresas.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfCEmpresa }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/CMessage", name = "ArrayOfCEmpresa")
    public JAXBElement<ArrayOfCEmpresa> createArrayOfCEmpresa(ArrayOfCEmpresa value) {
        return new JAXBElement<ArrayOfCEmpresa>(_ArrayOfCEmpresa_QNAME, ArrayOfCEmpresa.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CEmpresa }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/CMessage", name = "CEmpresa")
    public JAXBElement<CEmpresa> createCEmpresa(CEmpresa value) {
        return new JAXBElement<CEmpresa>(_CEmpresa_QNAME, CEmpresa.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CRPerfiles }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/CMessage", name = "CRPerfiles")
    public JAXBElement<CRPerfiles> createCRPerfiles(CRPerfiles value) {
        return new JAXBElement<CRPerfiles>(_CRPerfiles_QNAME, CRPerfiles.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfCPerfiles }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/CMessage", name = "ArrayOfCPerfiles")
    public JAXBElement<ArrayOfCPerfiles> createArrayOfCPerfiles(ArrayOfCPerfiles value) {
        return new JAXBElement<ArrayOfCPerfiles>(_ArrayOfCPerfiles_QNAME, ArrayOfCPerfiles.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CPerfiles }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/CMessage", name = "CPerfiles")
    public JAXBElement<CPerfiles> createCPerfiles(CPerfiles value) {
        return new JAXBElement<CPerfiles>(_CPerfiles_QNAME, CPerfiles.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CRUsuario }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/CMessage", name = "CRUsuario")
    public JAXBElement<CRUsuario> createCRUsuario(CRUsuario value) {
        return new JAXBElement<CRUsuario>(_CRUsuario_QNAME, CRUsuario.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CUsuario }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/CMessage", name = "CUsuario")
    public JAXBElement<CUsuario> createCUsuario(CUsuario value) {
        return new JAXBElement<CUsuario>(_CUsuario_QNAME, CUsuario.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfCDUsuario }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/CMessage", name = "ArrayOfCDUsuario")
    public JAXBElement<ArrayOfCDUsuario> createArrayOfCDUsuario(ArrayOfCDUsuario value) {
        return new JAXBElement<ArrayOfCDUsuario>(_ArrayOfCDUsuario_QNAME, ArrayOfCDUsuario.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CDUsuario }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/CMessage", name = "CDUsuario")
    public JAXBElement<CDUsuario> createCDUsuario(CDUsuario value) {
        return new JAXBElement<CDUsuario>(_CDUsuario_QNAME, CDUsuario.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CRSistema }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/CMessage", name = "CRSistema")
    public JAXBElement<CRSistema> createCRSistema(CRSistema value) {
        return new JAXBElement<CRSistema>(_CRSistema_QNAME, CRSistema.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CSistema }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/CMessage", name = "CSistema")
    public JAXBElement<CSistema> createCSistema(CSistema value) {
        return new JAXBElement<CSistema>(_CSistema_QNAME, CSistema.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfCSistema }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/CMessage", name = "ArrayOfCSistema")
    public JAXBElement<ArrayOfCSistema> createArrayOfCSistema(ArrayOfCSistema value) {
        return new JAXBElement<ArrayOfCSistema>(_ArrayOfCSistema_QNAME, ArrayOfCSistema.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/CMessage", name = "idSistema", scope = CSistema.class)
    public JAXBElement<String> createCSistemaIdSistema(String value) {
        return new JAXBElement<String>(_CSistemaIdSistema_QNAME, String.class, CSistema.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/CMessage", name = "nombre", scope = CSistema.class)
    public JAXBElement<String> createCSistemaNombre(String value) {
        return new JAXBElement<String>(_CSistemaNombre_QNAME, String.class, CSistema.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/CMessage", name = "appelidoUsuario", scope = CDUsuario.class)
    public JAXBElement<String> createCDUsuarioAppelidoUsuario(String value) {
        return new JAXBElement<String>(_CDUsuarioAppelidoUsuario_QNAME, String.class, CDUsuario.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/CMessage", name = "descPerfil", scope = CDUsuario.class)
    public JAXBElement<String> createCDUsuarioDescPerfil(String value) {
        return new JAXBElement<String>(_CDUsuarioDescPerfil_QNAME, String.class, CDUsuario.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/CMessage", name = "descripcion", scope = CDUsuario.class)
    public JAXBElement<String> createCDUsuarioDescripcion(String value) {
        return new JAXBElement<String>(_CDUsuarioDescripcion_QNAME, String.class, CDUsuario.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/CMessage", name = "estatusUsuario", scope = CDUsuario.class)
    public JAXBElement<String> createCDUsuarioEstatusUsuario(String value) {
        return new JAXBElement<String>(_CDUsuarioEstatusUsuario_QNAME, String.class, CDUsuario.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/CMessage", name = "fechaAlta", scope = CDUsuario.class)
    public JAXBElement<String> createCDUsuarioFechaAlta(String value) {
        return new JAXBElement<String>(_CDUsuarioFechaAlta_QNAME, String.class, CDUsuario.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/CMessage", name = "idUsuario", scope = CDUsuario.class)
    public JAXBElement<String> createCDUsuarioIdUsuario(String value) {
        return new JAXBElement<String>(_CDUsuarioIdUsuario_QNAME, String.class, CDUsuario.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/CMessage", name = "nombreUsuario", scope = CDUsuario.class)
    public JAXBElement<String> createCDUsuarioNombreUsuario(String value) {
        return new JAXBElement<String>(_CDUsuarioNombreUsuario_QNAME, String.class, CDUsuario.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/CMessage", name = "ultimoRegistro", scope = CDUsuario.class)
    public JAXBElement<String> createCDUsuarioUltimoRegistro(String value) {
        return new JAXBElement<String>(_CDUsuarioUltimoRegistro_QNAME, String.class, CDUsuario.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/CMessage", name = "descPerfil", scope = CPerfiles.class)
    public JAXBElement<String> createCPerfilesDescPerfil(String value) {
        return new JAXBElement<String>(_CDUsuarioDescPerfil_QNAME, String.class, CPerfiles.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/CMessage", name = "idPerfil", scope = CPerfiles.class)
    public JAXBElement<String> createCPerfilesIdPerfil(String value) {
        return new JAXBElement<String>(_CPerfilesIdPerfil_QNAME, String.class, CPerfiles.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/CMessage", name = "descEmpresa", scope = CEmpresa.class)
    public JAXBElement<String> createCEmpresaDescEmpresa(String value) {
        return new JAXBElement<String>(_CEmpresaDescEmpresa_QNAME, String.class, CEmpresa.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/CMessage", name = "idEmpresa", scope = CEmpresa.class)
    public JAXBElement<String> createCEmpresaIdEmpresa(String value) {
        return new JAXBElement<String>(_CEmpresaIdEmpresa_QNAME, String.class, CEmpresa.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/CMessage", name = "idOrigne", scope = CEmpresa.class)
    public JAXBElement<String> createCEmpresaIdOrigne(String value) {
        return new JAXBElement<String>(_CEmpresaIdOrigne_QNAME, String.class, CEmpresa.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/CMessage", name = "statusEmpresa", scope = CEmpresa.class)
    public JAXBElement<String> createCEmpresaStatusEmpresa(String value) {
        return new JAXBElement<String>(_CEmpresaStatusEmpresa_QNAME, String.class, CEmpresa.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/CMessage", name = "CategoryCode", scope = Item.class)
    public JAXBElement<String> createItemCategoryCode(String value) {
        return new JAXBElement<String>(_ItemCategoryCode_QNAME, String.class, Item.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/CMessage", name = "Note", scope = Item.class)
    public JAXBElement<String> createItemNote(String value) {
        return new JAXBElement<String>(_ItemNote_QNAME, String.class, Item.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/CMessage", name = "ReferenceObjectNodeSenderTechnicalID", scope = Item.class)
    public JAXBElement<String> createItemReferenceObjectNodeSenderTechnicalID(String value) {
        return new JAXBElement<String>(_ItemReferenceObjectNodeSenderTechnicalID_QNAME, String.class, Item.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/CMessage", name = "TypeID", scope = Item.class)
    public JAXBElement<String> createItemTypeID(String value) {
        return new JAXBElement<String>(_ItemTypeID_QNAME, String.class, Item.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/CMessage", name = "WebURI", scope = Item.class)
    public JAXBElement<String> createItemWebURI(String value) {
        return new JAXBElement<String>(_ItemWebURI_QNAME, String.class, Item.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/CMessage", name = "Nombrecomponente", scope = CComponente.class)
    public JAXBElement<String> createCComponenteNombrecomponente(String value) {
        return new JAXBElement<String>(_CComponenteNombrecomponente_QNAME, String.class, CComponente.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/CMessage", name = "descComponente", scope = CComponente.class)
    public JAXBElement<String> createCComponenteDescComponente(String value) {
        return new JAXBElement<String>(_CComponenteDescComponente_QNAME, String.class, CComponente.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/CMessage", name = "imagenComponente", scope = CComponente.class)
    public JAXBElement<String> createCComponenteImagenComponente(String value) {
        return new JAXBElement<String>(_CComponenteImagenComponente_QNAME, String.class, CComponente.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/CMessage", name = "nombrePagina", scope = CComponente.class)
    public JAXBElement<String> createCComponenteNombrePagina(String value) {
        return new JAXBElement<String>(_CComponenteNombrePagina_QNAME, String.class, CComponente.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/CMessage", name = "urlDestino", scope = CComponente.class)
    public JAXBElement<String> createCComponenteUrlDestino(String value) {
        return new JAXBElement<String>(_CComponenteUrlDestino_QNAME, String.class, CComponente.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/CMessage", name = "InternalID", scope = ContactPerson.class)
    public JAXBElement<String> createContactPersonInternalID(String value) {
        return new JAXBElement<String>(_ContactPersonInternalID_QNAME, String.class, ContactPerson.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/CMessage", name = "CompanyDescription", scope = IdentificationParty.class)
    public JAXBElement<String> createIdentificationPartyCompanyDescription(String value) {
        return new JAXBElement<String>(_IdentificationPartyCompanyDescription_QNAME, String.class, IdentificationParty.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/CMessage", name = "CompanyID", scope = IdentificationParty.class)
    public JAXBElement<String> createIdentificationPartyCompanyID(String value) {
        return new JAXBElement<String>(_IdentificationPartyCompanyID_QNAME, String.class, IdentificationParty.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/CMessage", name = "apellidos", scope = CUsuario.class)
    public JAXBElement<String> createCUsuarioApellidos(String value) {
        return new JAXBElement<String>(_CUsuarioApellidos_QNAME, String.class, CUsuario.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/CMessage", name = "estatus", scope = CUsuario.class)
    public JAXBElement<String> createCUsuarioEstatus(String value) {
        return new JAXBElement<String>(_CUsuarioEstatus_QNAME, String.class, CUsuario.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/CMessage", name = "idPerfil", scope = CUsuario.class)
    public JAXBElement<String> createCUsuarioIdPerfil(String value) {
        return new JAXBElement<String>(_CPerfilesIdPerfil_QNAME, String.class, CUsuario.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/CMessage", name = "idSistema", scope = CUsuario.class)
    public JAXBElement<String> createCUsuarioIdSistema(String value) {
        return new JAXBElement<String>(_CSistemaIdSistema_QNAME, String.class, CUsuario.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/CMessage", name = "idUsuario", scope = CUsuario.class)
    public JAXBElement<String> createCUsuarioIdUsuario(String value) {
        return new JAXBElement<String>(_CDUsuarioIdUsuario_QNAME, String.class, CUsuario.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/CMessage", name = "nombre", scope = CUsuario.class)
    public JAXBElement<String> createCUsuarioNombre(String value) {
        return new JAXBElement<String>(_CSistemaNombre_QNAME, String.class, CUsuario.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Item }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/CMessage", name = "Item", scope = Log.class)
    public JAXBElement<Item> createLogItem(Item value) {
        return new JAXBElement<Item>(_Item_QNAME, Item.class, Log.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link IdentificationParty }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/CMessage", name = "IdentificationParty", scope = CMessageContentHeader.class)
    public JAXBElement<IdentificationParty> createCMessageContentHeaderIdentificationParty(IdentificationParty value) {
        return new JAXBElement<IdentificationParty>(_IdentificationParty_QNAME, IdentificationParty.class, CMessageContentHeader.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CMessageContentHeader }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/CMessage", name = "content", scope = CRSistema.class)
    public JAXBElement<CMessageContentHeader> createCRSistemaContent(CMessageContentHeader value) {
        return new JAXBElement<CMessageContentHeader>(_CRSistemaContent_QNAME, CMessageContentHeader.class, CRSistema.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CSistema }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/CMessage", name = "sistema", scope = CRSistema.class)
    public JAXBElement<CSistema> createCRSistemaSistema(CSistema value) {
        return new JAXBElement<CSistema>(_CRSistemaSistema_QNAME, CSistema.class, CRSistema.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/CMessage", name = "Operacion", scope = CRUsuario.class)
    public JAXBElement<String> createCRUsuarioOperacion(String value) {
        return new JAXBElement<String>(_CRUsuarioOperacion_QNAME, String.class, CRUsuario.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/CMessage", name = "apellidosUsuario", scope = CRUsuario.class)
    public JAXBElement<String> createCRUsuarioApellidosUsuario(String value) {
        return new JAXBElement<String>(_CRUsuarioApellidosUsuario_QNAME, String.class, CRUsuario.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CMessageContentHeader }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/CMessage", name = "content", scope = CRUsuario.class)
    public JAXBElement<CMessageContentHeader> createCRUsuarioContent(CMessageContentHeader value) {
        return new JAXBElement<CMessageContentHeader>(_CRSistemaContent_QNAME, CMessageContentHeader.class, CRUsuario.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/CMessage", name = "descUsuario", scope = CRUsuario.class)
    public JAXBElement<String> createCRUsuarioDescUsuario(String value) {
        return new JAXBElement<String>(_CRUsuarioDescUsuario_QNAME, String.class, CRUsuario.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/CMessage", name = "idEmrpesa", scope = CRUsuario.class)
    public JAXBElement<String> createCRUsuarioIdEmrpesa(String value) {
        return new JAXBElement<String>(_CRUsuarioIdEmrpesa_QNAME, String.class, CRUsuario.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/CMessage", name = "idPerfil", scope = CRUsuario.class)
    public JAXBElement<String> createCRUsuarioIdPerfil(String value) {
        return new JAXBElement<String>(_CPerfilesIdPerfil_QNAME, String.class, CRUsuario.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/CMessage", name = "idSistema", scope = CRUsuario.class)
    public JAXBElement<String> createCRUsuarioIdSistema(String value) {
        return new JAXBElement<String>(_CSistemaIdSistema_QNAME, String.class, CRUsuario.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/CMessage", name = "idUsuario", scope = CRUsuario.class)
    public JAXBElement<String> createCRUsuarioIdUsuario(String value) {
        return new JAXBElement<String>(_CDUsuarioIdUsuario_QNAME, String.class, CRUsuario.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/CMessage", name = "nombreUsuario", scope = CRUsuario.class)
    public JAXBElement<String> createCRUsuarioNombreUsuario(String value) {
        return new JAXBElement<String>(_CDUsuarioNombreUsuario_QNAME, String.class, CRUsuario.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/CMessage", name = "password", scope = CRUsuario.class)
    public JAXBElement<String> createCRUsuarioPassword(String value) {
        return new JAXBElement<String>(_CRUsuarioPassword_QNAME, String.class, CRUsuario.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CMessageContentHeader }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/CMessage", name = "content", scope = CRPerfiles.class)
    public JAXBElement<CMessageContentHeader> createCRPerfilesContent(CMessageContentHeader value) {
        return new JAXBElement<CMessageContentHeader>(_CRSistemaContent_QNAME, CMessageContentHeader.class, CRPerfiles.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/CMessage", name = "idEmpresa", scope = CRPerfiles.class)
    public JAXBElement<String> createCRPerfilesIdEmpresa(String value) {
        return new JAXBElement<String>(_CEmpresaIdEmpresa_QNAME, String.class, CRPerfiles.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/CMessage", name = "idSistema", scope = CRPerfiles.class)
    public JAXBElement<String> createCRPerfilesIdSistema(String value) {
        return new JAXBElement<String>(_CSistemaIdSistema_QNAME, String.class, CRPerfiles.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CMessageContentHeader }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/CMessage", name = "content", scope = CREmpresas.class)
    public JAXBElement<CMessageContentHeader> createCREmpresasContent(CMessageContentHeader value) {
        return new JAXBElement<CMessageContentHeader>(_CRSistemaContent_QNAME, CMessageContentHeader.class, CREmpresas.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/CMessage", name = "idSistema", scope = CREmpresas.class)
    public JAXBElement<String> createCREmpresasIdSistema(String value) {
        return new JAXBElement<String>(_CSistemaIdSistema_QNAME, String.class, CREmpresas.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CMessageContentHeader }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/CMessage", name = "content", scope = CAutenticacion.class)
    public JAXBElement<CMessageContentHeader> createCAutenticacionContent(CMessageContentHeader value) {
        return new JAXBElement<CMessageContentHeader>(_CRSistemaContent_QNAME, CMessageContentHeader.class, CAutenticacion.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/CMessage", name = "idEmpresa", scope = CAutenticacion.class)
    public JAXBElement<String> createCAutenticacionIdEmpresa(String value) {
        return new JAXBElement<String>(_CEmpresaIdEmpresa_QNAME, String.class, CAutenticacion.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/CMessage", name = "idSistema", scope = CAutenticacion.class)
    public JAXBElement<String> createCAutenticacionIdSistema(String value) {
        return new JAXBElement<String>(_CSistemaIdSistema_QNAME, String.class, CAutenticacion.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/CMessage", name = "idUsuario", scope = CAutenticacion.class)
    public JAXBElement<String> createCAutenticacionIdUsuario(String value) {
        return new JAXBElement<String>(_CDUsuarioIdUsuario_QNAME, String.class, CAutenticacion.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/CMessage", name = "password", scope = CAutenticacion.class)
    public JAXBElement<String> createCAutenticacionPassword(String value) {
        return new JAXBElement<String>(_CRUsuarioPassword_QNAME, String.class, CAutenticacion.class, value);
    }

}
