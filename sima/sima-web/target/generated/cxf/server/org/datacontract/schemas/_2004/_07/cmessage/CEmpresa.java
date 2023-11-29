
package org.datacontract.schemas._2004._07.cmessage;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para CEmpresa complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="CEmpresa"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="descEmpresa" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="idEmpresa" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="idOrigne" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="statusEmpresa" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CEmpresa", propOrder = {
    "descEmpresa",
    "idEmpresa",
    "idOrigne",
    "statusEmpresa"
})
public class CEmpresa {

    @XmlElementRef(name = "descEmpresa", namespace = "http://schemas.datacontract.org/2004/07/CMessage", type = JAXBElement.class, required = false)
    protected JAXBElement<String> descEmpresa;
    @XmlElementRef(name = "idEmpresa", namespace = "http://schemas.datacontract.org/2004/07/CMessage", type = JAXBElement.class, required = false)
    protected JAXBElement<String> idEmpresa;
    @XmlElementRef(name = "idOrigne", namespace = "http://schemas.datacontract.org/2004/07/CMessage", type = JAXBElement.class, required = false)
    protected JAXBElement<String> idOrigne;
    @XmlElementRef(name = "statusEmpresa", namespace = "http://schemas.datacontract.org/2004/07/CMessage", type = JAXBElement.class, required = false)
    protected JAXBElement<String> statusEmpresa;

    /**
     * Obtiene el valor de la propiedad descEmpresa.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getDescEmpresa() {
        return descEmpresa;
    }

    /**
     * Define el valor de la propiedad descEmpresa.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setDescEmpresa(JAXBElement<String> value) {
        this.descEmpresa = value;
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
     * Obtiene el valor de la propiedad idOrigne.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getIdOrigne() {
        return idOrigne;
    }

    /**
     * Define el valor de la propiedad idOrigne.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setIdOrigne(JAXBElement<String> value) {
        this.idOrigne = value;
    }

    /**
     * Obtiene el valor de la propiedad statusEmpresa.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getStatusEmpresa() {
        return statusEmpresa;
    }

    /**
     * Define el valor de la propiedad statusEmpresa.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setStatusEmpresa(JAXBElement<String> value) {
        this.statusEmpresa = value;
    }

}
