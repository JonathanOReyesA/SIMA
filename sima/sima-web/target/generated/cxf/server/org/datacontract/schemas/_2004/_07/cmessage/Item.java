
package org.datacontract.schemas._2004._07.cmessage;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para Item complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="Item"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="CategoryCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Note" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ReferenceObjectNodeSenderTechnicalID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="SeverityCode" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="TypeID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="WebURI" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Item", propOrder = {
    "categoryCode",
    "note",
    "referenceObjectNodeSenderTechnicalID",
    "severityCode",
    "typeID",
    "webURI"
})
public class Item {

    @XmlElementRef(name = "CategoryCode", namespace = "http://schemas.datacontract.org/2004/07/CMessage", type = JAXBElement.class, required = false)
    protected JAXBElement<String> categoryCode;
    @XmlElementRef(name = "Note", namespace = "http://schemas.datacontract.org/2004/07/CMessage", type = JAXBElement.class, required = false)
    protected JAXBElement<String> note;
    @XmlElementRef(name = "ReferenceObjectNodeSenderTechnicalID", namespace = "http://schemas.datacontract.org/2004/07/CMessage", type = JAXBElement.class, required = false)
    protected JAXBElement<String> referenceObjectNodeSenderTechnicalID;
    @XmlElement(name = "SeverityCode")
    protected Integer severityCode;
    @XmlElementRef(name = "TypeID", namespace = "http://schemas.datacontract.org/2004/07/CMessage", type = JAXBElement.class, required = false)
    protected JAXBElement<String> typeID;
    @XmlElementRef(name = "WebURI", namespace = "http://schemas.datacontract.org/2004/07/CMessage", type = JAXBElement.class, required = false)
    protected JAXBElement<String> webURI;

    /**
     * Obtiene el valor de la propiedad categoryCode.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCategoryCode() {
        return categoryCode;
    }

    /**
     * Define el valor de la propiedad categoryCode.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCategoryCode(JAXBElement<String> value) {
        this.categoryCode = value;
    }

    /**
     * Obtiene el valor de la propiedad note.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getNote() {
        return note;
    }

    /**
     * Define el valor de la propiedad note.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setNote(JAXBElement<String> value) {
        this.note = value;
    }

    /**
     * Obtiene el valor de la propiedad referenceObjectNodeSenderTechnicalID.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getReferenceObjectNodeSenderTechnicalID() {
        return referenceObjectNodeSenderTechnicalID;
    }

    /**
     * Define el valor de la propiedad referenceObjectNodeSenderTechnicalID.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setReferenceObjectNodeSenderTechnicalID(JAXBElement<String> value) {
        this.referenceObjectNodeSenderTechnicalID = value;
    }

    /**
     * Obtiene el valor de la propiedad severityCode.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getSeverityCode() {
        return severityCode;
    }

    /**
     * Define el valor de la propiedad severityCode.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setSeverityCode(Integer value) {
        this.severityCode = value;
    }

    /**
     * Obtiene el valor de la propiedad typeID.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getTypeID() {
        return typeID;
    }

    /**
     * Define el valor de la propiedad typeID.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setTypeID(JAXBElement<String> value) {
        this.typeID = value;
    }

    /**
     * Obtiene el valor de la propiedad webURI.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getWebURI() {
        return webURI;
    }

    /**
     * Define el valor de la propiedad webURI.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setWebURI(JAXBElement<String> value) {
        this.webURI = value;
    }

}
