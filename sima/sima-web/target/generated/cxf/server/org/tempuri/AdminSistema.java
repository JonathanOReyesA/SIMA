
package org.tempuri;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import org.datacontract.schemas._2004._07.cmessage.ArrayOfCSistema;
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
 *         &lt;element name="MessageContentSistema" type="{http://schemas.datacontract.org/2004/07/CMessage}CMessageContentHeader" minOccurs="0"/&gt;
 *         &lt;element name="LstSistema" type="{http://schemas.datacontract.org/2004/07/CMessage}ArrayOfCSistema" minOccurs="0"/&gt;
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
    "messageContentSistema",
    "lstSistema",
    "log"
})
@XmlRootElement(name = "AdminSistema")
public class AdminSistema {

    @XmlElementRef(name = "MessageContentSistema", namespace = "http://tempuri.org/", type = JAXBElement.class, required = false)
    protected JAXBElement<CMessageContentHeader> messageContentSistema;
    @XmlElementRef(name = "LstSistema", namespace = "http://tempuri.org/", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfCSistema> lstSistema;
    @XmlElementRef(name = "Log", namespace = "http://tempuri.org/", type = JAXBElement.class, required = false)
    protected JAXBElement<Log> log;

    /**
     * Obtiene el valor de la propiedad messageContentSistema.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link CMessageContentHeader }{@code >}
     *     
     */
    public JAXBElement<CMessageContentHeader> getMessageContentSistema() {
        return messageContentSistema;
    }

    /**
     * Define el valor de la propiedad messageContentSistema.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link CMessageContentHeader }{@code >}
     *     
     */
    public void setMessageContentSistema(JAXBElement<CMessageContentHeader> value) {
        this.messageContentSistema = value;
    }

    /**
     * Obtiene el valor de la propiedad lstSistema.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfCSistema }{@code >}
     *     
     */
    public JAXBElement<ArrayOfCSistema> getLstSistema() {
        return lstSistema;
    }

    /**
     * Define el valor de la propiedad lstSistema.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfCSistema }{@code >}
     *     
     */
    public void setLstSistema(JAXBElement<ArrayOfCSistema> value) {
        this.lstSistema = value;
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
