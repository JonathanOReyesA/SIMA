
package org.datacontract.schemas._2004._07.cmessage;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para CRSistema complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="CRSistema"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Operacion" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="content" type="{http://schemas.datacontract.org/2004/07/CMessage}CMessageContentHeader" minOccurs="0"/&gt;
 *         &lt;element name="sistema" type="{http://schemas.datacontract.org/2004/07/CMessage}CSistema" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CRSistema", propOrder = {
    "operacion",
    "content",
    "sistema"
})
public class CRSistema {

    @XmlElement(name = "Operacion")
    protected Integer operacion;
    @XmlElementRef(name = "content", namespace = "http://schemas.datacontract.org/2004/07/CMessage", type = JAXBElement.class, required = false)
    protected JAXBElement<CMessageContentHeader> content;
    @XmlElementRef(name = "sistema", namespace = "http://schemas.datacontract.org/2004/07/CMessage", type = JAXBElement.class, required = false)
    protected JAXBElement<CSistema> sistema;

    /**
     * Obtiene el valor de la propiedad operacion.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getOperacion() {
        return operacion;
    }

    /**
     * Define el valor de la propiedad operacion.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setOperacion(Integer value) {
        this.operacion = value;
    }

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
     * Obtiene el valor de la propiedad sistema.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link CSistema }{@code >}
     *     
     */
    public JAXBElement<CSistema> getSistema() {
        return sistema;
    }

    /**
     * Define el valor de la propiedad sistema.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link CSistema }{@code >}
     *     
     */
    public void setSistema(JAXBElement<CSistema> value) {
        this.sistema = value;
    }

}
