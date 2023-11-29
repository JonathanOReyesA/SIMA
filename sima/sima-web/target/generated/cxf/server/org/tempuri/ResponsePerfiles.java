
package org.tempuri;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import org.datacontract.schemas._2004._07.cmessage.ArrayOfCPerfiles;
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
 *         &lt;element name="MessageContentII" type="{http://schemas.datacontract.org/2004/07/CMessage}CMessageContentHeader" minOccurs="0"/&gt;
 *         &lt;element name="Sistema" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Empresa" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ListaPerfiles" type="{http://schemas.datacontract.org/2004/07/CMessage}ArrayOfCPerfiles" minOccurs="0"/&gt;
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
    "messageContentII",
    "sistema",
    "empresa",
    "listaPerfiles",
    "log"
})
@XmlRootElement(name = "ResponsePerfiles")
public class ResponsePerfiles {

    @XmlElementRef(name = "MessageContentII", namespace = "http://tempuri.org/", type = JAXBElement.class, required = false)
    protected JAXBElement<CMessageContentHeader> messageContentII;
    @XmlElementRef(name = "Sistema", namespace = "http://tempuri.org/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> sistema;
    @XmlElementRef(name = "Empresa", namespace = "http://tempuri.org/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> empresa;
    @XmlElementRef(name = "ListaPerfiles", namespace = "http://tempuri.org/", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfCPerfiles> listaPerfiles;
    @XmlElementRef(name = "Log", namespace = "http://tempuri.org/", type = JAXBElement.class, required = false)
    protected JAXBElement<Log> log;

    /**
     * Obtiene el valor de la propiedad messageContentII.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link CMessageContentHeader }{@code >}
     *     
     */
    public JAXBElement<CMessageContentHeader> getMessageContentII() {
        return messageContentII;
    }

    /**
     * Define el valor de la propiedad messageContentII.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link CMessageContentHeader }{@code >}
     *     
     */
    public void setMessageContentII(JAXBElement<CMessageContentHeader> value) {
        this.messageContentII = value;
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
     * Obtiene el valor de la propiedad empresa.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getEmpresa() {
        return empresa;
    }

    /**
     * Define el valor de la propiedad empresa.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setEmpresa(JAXBElement<String> value) {
        this.empresa = value;
    }

    /**
     * Obtiene el valor de la propiedad listaPerfiles.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfCPerfiles }{@code >}
     *     
     */
    public JAXBElement<ArrayOfCPerfiles> getListaPerfiles() {
        return listaPerfiles;
    }

    /**
     * Define el valor de la propiedad listaPerfiles.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfCPerfiles }{@code >}
     *     
     */
    public void setListaPerfiles(JAXBElement<ArrayOfCPerfiles> value) {
        this.listaPerfiles = value;
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
