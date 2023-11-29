
package mx.com.gentera.crmms._000.businesspartnermanage.int_0334.v2;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * Address Item Structure
 * 
 * <p>Clase Java para AddressItem complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="AddressItem"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="GUID" type="{http://compartamos.com/common/gdt}GUID" minOccurs="0"/&gt;
 *         &lt;element name="AddressTypeID" type="{http://compartamos.com/common/gdt}AddressTypeID" minOccurs="0"/&gt;
 *         &lt;element name="AddressTypeDescription" type="{http://compartamos.com/common/gdt}LANGUAGEINDEPENDENT_MEDIUM_Description" minOccurs="0"/&gt;
 *         &lt;element name="Street" type="{http://compartamos.com/common/gdt}StreetName" minOccurs="0"/&gt;
 *         &lt;element name="ExternalNumber" type="{http://compartamos.com/common/gdt}HouseID" minOccurs="0"/&gt;
 *         &lt;element name="InternalNumber" type="{http://compartamos.com/common/gdt}HouseID" minOccurs="0"/&gt;
 *         &lt;element name="Location" type="{http://compartamos.com/common/gdt}LANGUAGEINDEPENDENT_MEDIUM_Text" minOccurs="0"/&gt;
 *         &lt;element name="PostalCode" type="{http://compartamos.com/common/gdt}PostalCode" minOccurs="0"/&gt;
 *         &lt;element name="Town" type="{http://compartamos.com/common/gdt}LANGUAGEINDEPENDENT_MEDIUM_Text" minOccurs="0"/&gt;
 *         &lt;element name="City" type="{http://compartamos.com/common/gdt}LANGUAGEINDEPENDENT_MEDIUM_Text" minOccurs="0"/&gt;
 *         &lt;element name="RegionCode" type="{http://compartamos.com/common/gdt}RegionCode" minOccurs="0"/&gt;
 *         &lt;element name="RegionDescription" type="{http://compartamos.com/common/gdt}LANGUAGEINDEPENDENT_MEDIUM_Description" minOccurs="0"/&gt;
 *         &lt;element name="CountryCode" type="{http://compartamos.com/common/gdt}CountryCode" minOccurs="0"/&gt;
 *         &lt;element name="CountryDescription" type="{http://compartamos.com/common/gdt}LANGUAGEINDEPENDENT_MEDIUM_Description" minOccurs="0"/&gt;
 *         &lt;element name="Reference" type="{http://compartamos.com/common/gdt}LANGUAGEINDEPENDENT_MEDIUM_Text" minOccurs="0"/&gt;
 *         &lt;element name="BetweenStreet1" type="{http://compartamos.com/common/gdt}StreetName" minOccurs="0"/&gt;
 *         &lt;element name="BetweenStreet2" type="{http://compartamos.com/common/gdt}StreetName" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AddressItem", propOrder = {
    "guid",
    "addressTypeID",
    "addressTypeDescription",
    "street",
    "externalNumber",
    "internalNumber",
    "location",
    "postalCode",
    "town",
    "city",
    "regionCode",
    "regionDescription",
    "countryCode",
    "countryDescription",
    "reference",
    "betweenStreet1",
    "betweenStreet2"
})
public class AddressItem {

    @XmlElement(name = "GUID")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String guid;
    @XmlElement(name = "AddressTypeID")
    protected String addressTypeID;
    @XmlElement(name = "AddressTypeDescription")
    protected String addressTypeDescription;
    @XmlElement(name = "Street")
    protected String street;
    @XmlElement(name = "ExternalNumber")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String externalNumber;
    @XmlElement(name = "InternalNumber")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String internalNumber;
    @XmlElement(name = "Location")
    protected String location;
    @XmlElement(name = "PostalCode")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String postalCode;
    @XmlElement(name = "Town")
    protected String town;
    @XmlElement(name = "City")
    protected String city;
    @XmlElement(name = "RegionCode")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String regionCode;
    @XmlElement(name = "RegionDescription")
    protected String regionDescription;
    @XmlElement(name = "CountryCode")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String countryCode;
    @XmlElement(name = "CountryDescription")
    protected String countryDescription;
    @XmlElement(name = "Reference")
    protected String reference;
    @XmlElement(name = "BetweenStreet1")
    protected String betweenStreet1;
    @XmlElement(name = "BetweenStreet2")
    protected String betweenStreet2;

    /**
     * Obtiene el valor de la propiedad guid.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGUID() {
        return guid;
    }

    /**
     * Define el valor de la propiedad guid.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGUID(String value) {
        this.guid = value;
    }

    /**
     * Obtiene el valor de la propiedad addressTypeID.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAddressTypeID() {
        return addressTypeID;
    }

    /**
     * Define el valor de la propiedad addressTypeID.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAddressTypeID(String value) {
        this.addressTypeID = value;
    }

    /**
     * Obtiene el valor de la propiedad addressTypeDescription.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAddressTypeDescription() {
        return addressTypeDescription;
    }

    /**
     * Define el valor de la propiedad addressTypeDescription.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAddressTypeDescription(String value) {
        this.addressTypeDescription = value;
    }

    /**
     * Obtiene el valor de la propiedad street.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStreet() {
        return street;
    }

    /**
     * Define el valor de la propiedad street.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStreet(String value) {
        this.street = value;
    }

    /**
     * Obtiene el valor de la propiedad externalNumber.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExternalNumber() {
        return externalNumber;
    }

    /**
     * Define el valor de la propiedad externalNumber.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExternalNumber(String value) {
        this.externalNumber = value;
    }

    /**
     * Obtiene el valor de la propiedad internalNumber.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInternalNumber() {
        return internalNumber;
    }

    /**
     * Define el valor de la propiedad internalNumber.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInternalNumber(String value) {
        this.internalNumber = value;
    }

    /**
     * Obtiene el valor de la propiedad location.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLocation() {
        return location;
    }

    /**
     * Define el valor de la propiedad location.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLocation(String value) {
        this.location = value;
    }

    /**
     * Obtiene el valor de la propiedad postalCode.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPostalCode() {
        return postalCode;
    }

    /**
     * Define el valor de la propiedad postalCode.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPostalCode(String value) {
        this.postalCode = value;
    }

    /**
     * Obtiene el valor de la propiedad town.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTown() {
        return town;
    }

    /**
     * Define el valor de la propiedad town.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTown(String value) {
        this.town = value;
    }

    /**
     * Obtiene el valor de la propiedad city.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCity() {
        return city;
    }

    /**
     * Define el valor de la propiedad city.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCity(String value) {
        this.city = value;
    }

    /**
     * Obtiene el valor de la propiedad regionCode.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRegionCode() {
        return regionCode;
    }

    /**
     * Define el valor de la propiedad regionCode.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRegionCode(String value) {
        this.regionCode = value;
    }

    /**
     * Obtiene el valor de la propiedad regionDescription.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRegionDescription() {
        return regionDescription;
    }

    /**
     * Define el valor de la propiedad regionDescription.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRegionDescription(String value) {
        this.regionDescription = value;
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

    /**
     * Obtiene el valor de la propiedad reference.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReference() {
        return reference;
    }

    /**
     * Define el valor de la propiedad reference.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReference(String value) {
        this.reference = value;
    }

    /**
     * Obtiene el valor de la propiedad betweenStreet1.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBetweenStreet1() {
        return betweenStreet1;
    }

    /**
     * Define el valor de la propiedad betweenStreet1.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBetweenStreet1(String value) {
        this.betweenStreet1 = value;
    }

    /**
     * Obtiene el valor de la propiedad betweenStreet2.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBetweenStreet2() {
        return betweenStreet2;
    }

    /**
     * Define el valor de la propiedad betweenStreet2.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBetweenStreet2(String value) {
        this.betweenStreet2 = value;
    }

}
