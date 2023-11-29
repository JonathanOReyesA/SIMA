
package com.compartamos.common.gdt;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * <p>Clase Java para BusinessDocumentMessageContentHeaderIdentintificationParty_V1 complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="BusinessDocumentMessageContentHeaderIdentintificationParty_V1"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="CompanyID" type="{http://compartamos.com/common/gdt}NOSC_CompanyID"/&gt;
 *         &lt;element name="CompanyDescription" type="{http://compartamos.com/common/gdt}CompanyDescription" minOccurs="0"/&gt;
 *         &lt;element name="CountryCode" type="{http://compartamos.com/common/gdt}CountryCode" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BusinessDocumentMessageContentHeaderIdentintificationParty_V1", propOrder = {
    "companyID",
    "companyDescription",
    "countryCode"
})
public class BusinessDocumentMessageContentHeaderIdentintificationPartyV1 {

    @XmlElement(name = "CompanyID", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String companyID;
    @XmlElement(name = "CompanyDescription")
    protected String companyDescription;
    @XmlElement(name = "CountryCode")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String countryCode;

    /**
     * Obtiene el valor de la propiedad companyID.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCompanyID() {
        return companyID;
    }

    /**
     * Define el valor de la propiedad companyID.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCompanyID(String value) {
        this.companyID = value;
    }

    /**
     * Obtiene el valor de la propiedad companyDescription.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCompanyDescription() {
        return companyDescription;
    }

    /**
     * Define el valor de la propiedad companyDescription.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCompanyDescription(String value) {
        this.companyDescription = value;
    }

    /**
     * Obtiene el valor de la propiedad countryCode.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCountryCode() {
        return countryCode;
    }

    /**
     * Define el valor de la propiedad countryCode.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCountryCode(String value) {
        this.countryCode = value;
    }

}
