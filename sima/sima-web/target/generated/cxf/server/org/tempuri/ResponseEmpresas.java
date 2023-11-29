
package org.tempuri;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import org.datacontract.schemas._2004._07.cmessage.ArrayOfCEmpresa;
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
 *         &lt;element name="MessageContentI" type="{http://schemas.datacontract.org/2004/07/CMessage}CMessageContentHeader" minOccurs="0"/&gt;
 *         &lt;element name="Sistema" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Empresas" type="{http://schemas.datacontract.org/2004/07/CMessage}ArrayOfCEmpresa" minOccurs="0"/&gt;
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
    "messageContentI",
    "sistema",
    "empresas",
    "log"
})
@XmlRootElement(name = "ResponseEmpresas")
public class ResponseEmpresas {

    @XmlElementRef(name = "MessageContentI", namespace = "http://tempuri.org/", type = JAXBElement.class, required = false)
    protected JAXBElement<CMessageContentHeader> messageContentI;
    @XmlElementRef(name = "Sistema", namespace = "http://tempuri.org/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> sistema;
    @XmlElementRef(name = "Empresas", namespace = "http://tempuri.org/", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfCEmpresa> empresas;
    @XmlElementRef(name = "Log", namespace = "http://tempuri.org/", type = JAXBElement.class, required = false)
    protected JAXBElement<Log> log;

    /**
     * Obtiene el valor de la propiedad messageContentI.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link CMessageContentHeader }{@code >}
     *     
     */
    public JAXBElement<CMessageContentHeader> getMessageContentI() {
        return messageContentI;
    }

    /**
     * Define el valor de la propiedad messageContentI.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link CMessageContentHeader }{@code >}
     *     
     */
    public void setMessageContentI(JAXBElement<CMessageContentHeader> value) {
        this.messageContentI = value;
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
     * Obtiene el valor de la propiedad empresas.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfCEmpresa }{@code >}
     *     
     */
    public JAXBElement<ArrayOfCEmpresa> getEmpresas() {
        return empresas;
    }

    /**
     * Define el valor de la propiedad empresas.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfCEmpresa }{@code >}
     *     
     */
    public void setEmpresas(JAXBElement<ArrayOfCEmpresa> value) {
        this.empresas = value;
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
