
package com.compartamos.common.structures;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para AcctOriginationBusinessPartnerName_V1 complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="AcctOriginationBusinessPartnerName_V1"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="GivenName" type="{http://compartamos.com/common/gdt}LANGUAGEINDEPENDENT_MEDIUM_Name"/&gt;
 *         &lt;element name="MiddleName" type="{http://compartamos.com/common/gdt}LANGUAGEINDEPENDENT_MEDIUM_Name" minOccurs="0"/&gt;
 *         &lt;element name="FamilyName" type="{http://compartamos.com/common/gdt}LANGUAGEINDEPENDENT_MEDIUM_Name"/&gt;
 *         &lt;element name="AditionalFamilyName" type="{http://compartamos.com/common/gdt}LANGUAGEINDEPENDENT_MEDIUM_Name" minOccurs="0"/&gt;
 *         &lt;element name="MarriedName" type="{http://compartamos.com/common/gdt}LANGUAGEINDEPENDENT_MEDIUM_Name" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AcctOriginationBusinessPartnerName_V1", propOrder = {
    "givenName",
    "middleName",
    "familyName",
    "aditionalFamilyName",
    "marriedName"
})
public class AcctOriginationBusinessPartnerNameV1 {

    @XmlElement(name = "GivenName", required = true)
    protected String givenName;
    @XmlElement(name = "MiddleName")
    protected String middleName;
    @XmlElement(name = "FamilyName", required = true)
    protected String familyName;
    @XmlElement(name = "AditionalFamilyName")
    protected String aditionalFamilyName;
    @XmlElement(name = "MarriedName")
    protected String marriedName;

    /**
     * Obtiene el valor de la propiedad givenName.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGivenName() {
        return givenName;
    }

    /**
     * Define el valor de la propiedad givenName.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGivenName(String value) {
        this.givenName = value;
    }

    /**
     * Obtiene el valor de la propiedad middleName.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMiddleName() {
        return middleName;
    }

    /**
     * Define el valor de la propiedad middleName.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMiddleName(String value) {
        this.middleName = value;
    }

    /**
     * Obtiene el valor de la propiedad familyName.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFamilyName() {
        return familyName;
    }

    /**
     * Define el valor de la propiedad familyName.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFamilyName(String value) {
        this.familyName = value;
    }

    /**
     * Obtiene el valor de la propiedad aditionalFamilyName.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAditionalFamilyName() {
        return aditionalFamilyName;
    }

    /**
     * Define el valor de la propiedad aditionalFamilyName.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAditionalFamilyName(String value) {
        this.aditionalFamilyName = value;
    }

    /**
     * Obtiene el valor de la propiedad marriedName.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMarriedName() {
        return marriedName;
    }

    /**
     * Define el valor de la propiedad marriedName.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMarriedName(String value) {
        this.marriedName = value;
    }

}
