
package org.tempuri;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import org.datacontract.schemas._2004._07.cmessage.ArrayOfCComponente;
import org.datacontract.schemas._2004._07.cmessage.CMessageContentHeader;
import org.datacontract.schemas._2004._07.cmessage.Log;


/**
 * <p>Clase Java para anonymous complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="MessageContent" type="{http://schemas.datacontract.org/2004/07/CMessage}CMessageContentHeader" minOccurs="0"/&gt;
 *         &lt;element name="Usuario" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Perfil" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Sistema" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="UltimoAcces" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Aviso" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Menus" type="{http://schemas.datacontract.org/2004/07/CMessage}ArrayOfCComponente" minOccurs="0"/&gt;
 *         &lt;element name="SubMenu" type="{http://schemas.datacontract.org/2004/07/CMessage}ArrayOfCComponente" minOccurs="0"/&gt;
 *         &lt;element name="Componentes" type="{http://schemas.datacontract.org/2004/07/CMessage}ArrayOfCComponente" minOccurs="0"/&gt;
 *         &lt;element name="Log" type="{http://schemas.datacontract.org/2004/07/CMessage}Log" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "messageContent",
    "usuario",
    "perfil",
    "sistema",
    "ultimoAcces",
    "aviso",
    "menus",
    "subMenu",
    "componentes",
    "log"
})
@XmlRootElement(name = "ResponseUm")
public class ResponseUm {

    @XmlElementRef(name = "MessageContent", namespace = "http://tempuri.org/", type = JAXBElement.class, required = false)
    protected JAXBElement<CMessageContentHeader> messageContent;
    @XmlElementRef(name = "Usuario", namespace = "http://tempuri.org/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> usuario;
    @XmlElementRef(name = "Perfil", namespace = "http://tempuri.org/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> perfil;
    @XmlElementRef(name = "Sistema", namespace = "http://tempuri.org/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> sistema;
    @XmlElementRef(name = "UltimoAcces", namespace = "http://tempuri.org/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> ultimoAcces;
    @XmlElementRef(name = "Aviso", namespace = "http://tempuri.org/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> aviso;
    @XmlElementRef(name = "Menus", namespace = "http://tempuri.org/", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfCComponente> menus;
    @XmlElementRef(name = "SubMenu", namespace = "http://tempuri.org/", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfCComponente> subMenu;
    @XmlElementRef(name = "Componentes", namespace = "http://tempuri.org/", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfCComponente> componentes;
    @XmlElementRef(name = "Log", namespace = "http://tempuri.org/", type = JAXBElement.class, required = false)
    protected JAXBElement<Log> log;

    /**
     * Obtiene el valor de la propiedad messageContent.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link CMessageContentHeader }{@code >}
     *     
     */
    public JAXBElement<CMessageContentHeader> getMessageContent() {
        return messageContent;
    }

    /**
     * Define el valor de la propiedad messageContent.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link CMessageContentHeader }{@code >}
     *     
     */
    public void setMessageContent(JAXBElement<CMessageContentHeader> value) {
        this.messageContent = value;
    }

    /**
     * Obtiene el valor de la propiedad usuario.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getUsuario() {
        return usuario;
    }

    /**
     * Define el valor de la propiedad usuario.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setUsuario(JAXBElement<String> value) {
        this.usuario = value;
    }

    /**
     * Obtiene el valor de la propiedad perfil.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getPerfil() {
        return perfil;
    }

    /**
     * Define el valor de la propiedad perfil.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setPerfil(JAXBElement<String> value) {
        this.perfil = value;
    }

    /**
     * Obtiene el valor de la propiedad sistema.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getSistema() {
        return sistema;
    }

    /**
     * Define el valor de la propiedad sistema.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setSistema(JAXBElement<String> value) {
        this.sistema = value;
    }

    /**
     * Obtiene el valor de la propiedad ultimoAcces.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getUltimoAcces() {
        return ultimoAcces;
    }

    /**
     * Define el valor de la propiedad ultimoAcces.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setUltimoAcces(JAXBElement<String> value) {
        this.ultimoAcces = value;
    }

    /**
     * Obtiene el valor de la propiedad aviso.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getAviso() {
        return aviso;
    }

    /**
     * Define el valor de la propiedad aviso.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setAviso(JAXBElement<String> value) {
        this.aviso = value;
    }

    /**
     * Obtiene el valor de la propiedad menus.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfCComponente }{@code >}
     *     
     */
    public JAXBElement<ArrayOfCComponente> getMenus() {
        return menus;
    }

    /**
     * Define el valor de la propiedad menus.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfCComponente }{@code >}
     *     
     */
    public void setMenus(JAXBElement<ArrayOfCComponente> value) {
        this.menus = value;
    }

    /**
     * Obtiene el valor de la propiedad subMenu.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfCComponente }{@code >}
     *     
     */
    public JAXBElement<ArrayOfCComponente> getSubMenu() {
        return subMenu;
    }

    /**
     * Define el valor de la propiedad subMenu.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfCComponente }{@code >}
     *     
     */
    public void setSubMenu(JAXBElement<ArrayOfCComponente> value) {
        this.subMenu = value;
    }

    /**
     * Obtiene el valor de la propiedad componentes.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfCComponente }{@code >}
     *     
     */
    public JAXBElement<ArrayOfCComponente> getComponentes() {
        return componentes;
    }

    /**
     * Define el valor de la propiedad componentes.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfCComponente }{@code >}
     *     
     */
    public void setComponentes(JAXBElement<ArrayOfCComponente> value) {
        this.componentes = value;
    }

    /**
     * Obtiene el valor de la propiedad log.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Log }{@code >}
     *     
     */
    public JAXBElement<Log> getLog() {
        return log;
    }

    /**
     * Define el valor de la propiedad log.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Log }{@code >}
     *     
     */
    public void setLog(JAXBElement<Log> value) {
        this.log = value;
    }

}
