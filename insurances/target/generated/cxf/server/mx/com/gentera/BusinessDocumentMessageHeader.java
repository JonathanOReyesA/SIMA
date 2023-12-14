
package mx.com.gentera;

import java.util.Date;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import org.w3._2001.xmlschema.Adapter2;


/**
 * <p>Clase Java para businessDocumentMessageHeader complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="businessDocumentMessageHeader"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="creationDateTime" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="recipientBusinessSystemID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="recipientParty" type="{http://gentera.com.mx/}businessDocumentMessageHeaderParty" minOccurs="0"/&gt;
 *         &lt;element name="referenceID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="referenceUUID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="senderBusinessSystemID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="senderParty" type="{http://gentera.com.mx/}businessDocumentMessageHeaderParty" minOccurs="0"/&gt;
 *         &lt;element name="testDataIndicator" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="uuid" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "businessDocumentMessageHeader", propOrder = {
    "creationDateTime",
    "id",
    "recipientBusinessSystemID",
    "recipientParty",
    "referenceID",
    "referenceUUID",
    "senderBusinessSystemID",
    "senderParty",
    "testDataIndicator",
    "uuid"
})
public class BusinessDocumentMessageHeader {

    @XmlElement(type = String.class)
    @XmlJavaTypeAdapter(Adapter2 .class)
    @XmlSchemaType(name = "dateTime")
    protected Date creationDateTime;
    protected String id;
    protected String recipientBusinessSystemID;
    protected BusinessDocumentMessageHeaderParty recipientParty;
    protected String referenceID;
    protected String referenceUUID;
    protected String senderBusinessSystemID;
    protected BusinessDocumentMessageHeaderParty senderParty;
    protected Boolean testDataIndicator;
    protected String uuid;

    /**
     * Obtiene el valor de la propiedad creationDateTime.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public Date getCreationDateTime() {
        return creationDateTime;
    }

    /**
     * Define el valor de la propiedad creationDateTime.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCreationDateTime(Date value) {
        this.creationDateTime = value;
    }

    /**
     * Obtiene el valor de la propiedad id.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getId() {
        return id;
    }

    /**
     * Define el valor de la propiedad id.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setId(String value) {
        this.id = value;
    }

    /**
     * Obtiene el valor de la propiedad recipientBusinessSystemID.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRecipientBusinessSystemID() {
        return recipientBusinessSystemID;
    }

    /**
     * Define el valor de la propiedad recipientBusinessSystemID.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRecipientBusinessSystemID(String value) {
        this.recipientBusinessSystemID = value;
    }

    /**
     * Obtiene el valor de la propiedad recipientParty.
     * 
     * @return
     *     possible object is
     *     {@link BusinessDocumentMessageHeaderParty }
     *     
     */
    public BusinessDocumentMessageHeaderParty getRecipientParty() {
        return recipientParty;
    }

    /**
     * Define el valor de la propiedad recipientParty.
     * 
     * @param value
     *     allowed object is
     *     {@link BusinessDocumentMessageHeaderParty }
     *     
     */
    public void setRecipientParty(BusinessDocumentMessageHeaderParty value) {
        this.recipientParty = value;
    }

    /**
     * Obtiene el valor de la propiedad referenceID.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReferenceID() {
        return referenceID;
    }

    /**
     * Define el valor de la propiedad referenceID.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReferenceID(String value) {
        this.referenceID = value;
    }

    /**
     * Obtiene el valor de la propiedad referenceUUID.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReferenceUUID() {
        return referenceUUID;
    }

    /**
     * Define el valor de la propiedad referenceUUID.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReferenceUUID(String value) {
        this.referenceUUID = value;
    }

    /**
     * Obtiene el valor de la propiedad senderBusinessSystemID.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSenderBusinessSystemID() {
        return senderBusinessSystemID;
    }

    /**
     * Define el valor de la propiedad senderBusinessSystemID.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSenderBusinessSystemID(String value) {
        this.senderBusinessSystemID = value;
    }

    /**
     * Obtiene el valor de la propiedad senderParty.
     * 
     * @return
     *     possible object is
     *     {@link BusinessDocumentMessageHeaderParty }
     *     
     */
    public BusinessDocumentMessageHeaderParty getSenderParty() {
        return senderParty;
    }

    /**
     * Define el valor de la propiedad senderParty.
     * 
     * @param value
     *     allowed object is
     *     {@link BusinessDocumentMessageHeaderParty }
     *     
     */
    public void setSenderParty(BusinessDocumentMessageHeaderParty value) {
        this.senderParty = value;
    }

    /**
     * Obtiene el valor de la propiedad testDataIndicator.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isTestDataIndicator() {
        return testDataIndicator;
    }

    /**
     * Define el valor de la propiedad testDataIndicator.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setTestDataIndicator(Boolean value) {
        this.testDataIndicator = value;
    }

    /**
     * Obtiene el valor de la propiedad uuid.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUuid() {
        return uuid;
    }

    /**
     * Define el valor de la propiedad uuid.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUuid(String value) {
        this.uuid = value;
    }

}
