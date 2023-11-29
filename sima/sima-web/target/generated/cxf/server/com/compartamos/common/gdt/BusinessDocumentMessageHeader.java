
package com.compartamos.common.gdt;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Clase Java para BusinessDocumentMessageHeader complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="BusinessDocumentMessageHeader"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ID" type="{http://compartamos.com/common/gdt}BusinessDocumentMessageID" minOccurs="0"/&gt;
 *         &lt;element name="UUID" type="{http://compartamos.com/common/gdt}UUID" minOccurs="0"/&gt;
 *         &lt;element name="ReferenceID" type="{http://compartamos.com/common/gdt}BusinessDocumentMessageID" minOccurs="0"/&gt;
 *         &lt;element name="ReferenceUUID" type="{http://compartamos.com/common/gdt}UUID" minOccurs="0"/&gt;
 *         &lt;element name="CreationDateTime" type="{http://compartamos.com/common/gdt}GLOBAL_DateTime"/&gt;
 *         &lt;element name="TestDataIndicator" type="{http://compartamos.com/common/gdt}Indicator" minOccurs="0"/&gt;
 *         &lt;element name="SenderBusinessSystemID" type="{http://compartamos.com/common/gdt}BusinessSystemID" minOccurs="0"/&gt;
 *         &lt;element name="RecipientBusinessSystemID" type="{http://compartamos.com/common/gdt}BusinessSystemID" minOccurs="0"/&gt;
 *         &lt;element name="SenderParty" type="{http://compartamos.com/common/gdt}BusinessDocumentMessageHeaderParty" minOccurs="0"/&gt;
 *         &lt;element name="RecipientParty" type="{http://compartamos.com/common/gdt}BusinessDocumentMessageHeaderParty" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BusinessDocumentMessageHeader", propOrder = {
    "id",
    "uuid",
    "referenceID",
    "referenceUUID",
    "creationDateTime",
    "testDataIndicator",
    "senderBusinessSystemID",
    "recipientBusinessSystemID",
    "senderParty",
    "recipientParty"
})
public class BusinessDocumentMessageHeader {

    @XmlElement(name = "ID")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String id;
    @XmlElement(name = "UUID")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String uuid;
    @XmlElement(name = "ReferenceID")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String referenceID;
    @XmlElement(name = "ReferenceUUID")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String referenceUUID;
    @XmlElement(name = "CreationDateTime", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar creationDateTime;
    @XmlElement(name = "TestDataIndicator")
    protected Boolean testDataIndicator;
    @XmlElement(name = "SenderBusinessSystemID")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String senderBusinessSystemID;
    @XmlElement(name = "RecipientBusinessSystemID")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String recipientBusinessSystemID;
    @XmlElement(name = "SenderParty")
    protected BusinessDocumentMessageHeaderParty senderParty;
    @XmlElement(name = "RecipientParty")
    protected BusinessDocumentMessageHeaderParty recipientParty;

    /**
     * Obtiene el valor de la propiedad id.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getID() {
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
    public void setID(String value) {
        this.id = value;
    }

    /**
     * Obtiene el valor de la propiedad uuid.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUUID() {
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
    public void setUUID(String value) {
        this.uuid = value;
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
     * Obtiene el valor de la propiedad creationDateTime.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getCreationDateTime() {
        return creationDateTime;
    }

    /**
     * Define el valor de la propiedad creationDateTime.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setCreationDateTime(XMLGregorianCalendar value) {
        this.creationDateTime = value;
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

}
