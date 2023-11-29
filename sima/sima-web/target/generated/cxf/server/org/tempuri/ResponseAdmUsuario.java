
package org.tempuri;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import org.datacontract.schemas._2004._07.cmessage.CMessageContentHeader;
import org.datacontract.schemas._2004._07.cmessage.CUsuario;
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
 *         &lt;element name="MessageContentIII" type="{http://schemas.datacontract.org/2004/07/CMessage}CMessageContentHeader" minOccurs="0"/&gt;
 *         &lt;element name="Sistema" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Empresa" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Usuario" type="{http://schemas.datacontract.org/2004/07/CMessage}CUsuario" minOccurs="0"/&gt;
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
    "messageContentIII",
    "sistema",
    "empresa",
    "usuario",
    "log"
})
@XmlRootElement(name = "ResponseAdmUsuario")
public class ResponseAdmUsuario {

    @XmlElementRef(name = "MessageContentIII", namespace = "http://tempuri.org/", type = JAXBElement.class, required = false)
    protected JAXBElement<CMessageContentHeader> messageContentIII;
    @XmlElementRef(name = "Sistema", namespace = "http://tempuri.org/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> sistema;
    @XmlElementRef(name = "Empresa", namespace = "http://tempuri.org/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> empresa;
    @XmlElementRef(name = "Usuario", namespace = "http://tempuri.org/", type = JAXBElement.class, required = false)
    protected JAXBElement<CUsuario> usuario;
    @XmlElementRef(name = "Log", namespace = "http://tempuri.org/", type = JAXBElement.class, required = false)
    protected JAXBElement<Log> log;

    /**
     * Obtiene el valor de la propiedad messageContentIII.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link CMessageContentHeader }{@code >}
     *     
     */
    public JAXBElement<CMessageContentHeader> getMessageContentIII() {
        return messageContentIII;
    }

    /**
     * Define el valor de la propiedad messageContentIII.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link CMessageContentHeader }{@code >}
     *     
     */
    public void setMessageContentIII(JAXBElement<CMessageContentHeader> value) {
        this.messageContentIII = value;
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
     * Obtiene el valor de la propiedad usuario.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link CUsuario }{@code >}
     *     
     */
    public JAXBElement<CUsuario> getUsuario() {
        return usuario;
    }

    /**
     * Define el valor de la propiedad usuario.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link CUsuario }{@code >}
     *     
     */
    public void setUsuario(JAXBElement<CUsuario> value) {
        this.usuario = value;
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
