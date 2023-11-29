
package org.datacontract.schemas._2004._07.cmessage;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para CRPerfiles complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="CRPerfiles"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="content" type="{http://schemas.datacontract.org/2004/07/CMessage}CMessageContentHeader" minOccurs="0"/&gt;
 *         &lt;element name="idEmpresa" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="idSistema" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CRPerfiles", propOrder = {
    "content",
    "idEmpresa",
    "idSistema"
})
public class CRPerfiles {

    @XmlElementRef(name = "content", namespace = "http://schemas.datacontract.org/2004/07/CMessage", type = JAXBElement.class, required = false)
    protected JAXBElement<CMessageContentHeader> content;
    @XmlElementRef(name = "idEmpresa", namespace = "http://schemas.datacontract.org/2004/07/CMessage", type = JAXBElement.class, required = false)
    protected JAXBElement<String> idEmpresa;
    @XmlElementRef(name = "idSistema", namespace = "http://schemas.datacontract.org/2004/07/CMessage", type = JAXBElement.class, required = false)
    protected JAXBElement<String> idSistema;

    /**
     * Obtiene el valor de la propiedad content.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link CMessageContentHeader }{@code >}
     *     
     */
    public JAXBElement<CMessageContentHeader> getContent() {
        return content;
    }

    /**
     * Define el valor de la propiedad content.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link CMessageContentHeader }{@code >}
     *     
     */
    public void setContent(JAXBElement<CMessageContentHeader> value) {
        this.content = value;
    }

    /**
     * Obtiene el valor de la propiedad idEmpresa.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getIdEmpresa() {
        return idEmpresa;
    }

    /**
     * Define el valor de la propiedad idEmpresa.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setIdEmpresa(JAXBElement<String> value) {
        this.idEmpresa = value;
    }

    /**
     * Obtiene el valor de la propiedad idSistema.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getIdSistema() {
        return idSistema;
    }

    /**
     * Define el valor de la propiedad idSistema.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setIdSistema(JAXBElement<String> value) {
        this.idSistema = value;
    }

}
