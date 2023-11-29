
package mx.com.gentera.crmms._000.businesspartnermanage.int_0334.v2;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * Identifier Item
 * 
 * <p>Clase Java para IdentifierItem complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="IdentifierItem"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="TypeID" type="{http://gentera.com.mx/CRMMS/000/BusinessPartnerManage/INT-0334/v2.0}TypeID" minOccurs="0"/&gt;
 *         &lt;element name="TypeDescription" type="{http://compartamos.com/common/gdt}LANGUAGEINDEPENDENT_MEDIUM_Description" minOccurs="0"/&gt;
 *         &lt;element name="NumberID" type="{http://compartamos.com/common/gdt}NOSC_PartyID" minOccurs="0"/&gt;
 *         &lt;element name="CountryCode" type="{http://compartamos.com/common/gdt}CountryCode" minOccurs="0"/&gt;
 *         &lt;element name="CountryDescription" type="{http://compartamos.com/common/gdt}LANGUAGEINDEPENDENT_MEDIUM_Description" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "IdentifierItem", propOrder = {
    "typeID",
    "typeDescription",
    "numberID",
    "countryCode",
    "countryDescription"
})
public class IdentifierItem {

    @XmlElement(name = "TypeID")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String typeID;
    @XmlElement(name = "TypeDescription")
    protected String typeDescription;
    @XmlElement(name = "NumberID")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String numberID;
    @XmlElement(name = "CountryCode")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String countryCode;
    @XmlElement(name = "CountryDescription")
    protected String countryDescription;

    /**
     * Obtiene el valor de la propiedad typeID.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTypeID() {
        return typeID;
    }

    /**
     * Define el valor de la propiedad typeID.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTypeID(String value) {
        this.typeID = value;
    }

    /**
     * Obtiene el valor de la propiedad typeDescription.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTypeDescription() {
        return typeDescription;
    }

    /**
     * Define el valor de la propiedad typeDescription.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTypeDescription(String value) {
        this.typeDescription = value;
    }

    /**
     * Obtiene el valor de la propiedad numberID.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNumberID() {
        return numberID;
    }

    /**
     * Define el valor de la propiedad numberID.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNumberID(String value) {
        this.numberID = value;
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

    /**
     * Obtiene el valor de la propiedad countryDescription.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCountryDescription() {
        return countryDescription;
    }

    /**
     * Define el valor de la propiedad countryDescription.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCountryDescription(String value) {
        this.countryDescription = value;
    }

}
