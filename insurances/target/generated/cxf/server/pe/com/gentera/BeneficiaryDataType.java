
package pe.com.gentera;

import java.util.Date;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import org.w3._2001.xmlschema.Adapter2;
import org.w3._2001.xmlschema.Adapter4;


/**
 * <p>Clase Java para beneficiaryDataType complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="beneficiaryDataType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="additionalFamilyName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="addressType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="age" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="birthday" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="businessPartnerID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="cellphone" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="cityName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="countryName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="districtName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="exteriorHouseID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="familyName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="gender" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="givenName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="homePhone" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="interiorHouseID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="maritalStatus" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="marriedFamilyName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="middleName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="officePhone" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="percentage" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="postalCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="regionName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="relationshipName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="roleCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="streetName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="taxID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="zone" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "beneficiaryDataType", propOrder = {
    "additionalFamilyName",
    "addressType",
    "age",
    "birthday",
    "businessPartnerID",
    "cellphone",
    "cityName",
    "countryName",
    "districtName",
    "exteriorHouseID",
    "familyName",
    "gender",
    "givenName",
    "homePhone",
    "interiorHouseID",
    "maritalStatus",
    "marriedFamilyName",
    "middleName",
    "officePhone",
    "percentage",
    "postalCode",
    "regionName",
    "relationshipName",
    "roleCode",
    "streetName",
    "taxID",
    "zone"
})
@XmlSeeAlso({
    BeneficiaryDataTypePE.class
})
public class BeneficiaryDataType {

    protected String additionalFamilyName;
    protected String addressType;
    @XmlElement(type = String.class)
    @XmlJavaTypeAdapter(Adapter4 .class)
    @XmlSchemaType(name = "int")
    protected Integer age;
    @XmlElement(type = String.class)
    @XmlJavaTypeAdapter(Adapter2 .class)
    @XmlSchemaType(name = "dateTime")
    protected Date birthday;
    protected String businessPartnerID;
    protected String cellphone;
    protected String cityName;
    protected String countryName;
    protected String districtName;
    protected String exteriorHouseID;
    protected String familyName;
    protected String gender;
    protected String givenName;
    protected String homePhone;
    protected String interiorHouseID;
    protected String maritalStatus;
    protected String marriedFamilyName;
    protected String middleName;
    protected String officePhone;
    protected String percentage;
    protected String postalCode;
    protected String regionName;
    protected String relationshipName;
    protected String roleCode;
    protected String streetName;
    protected String taxID;
    protected String zone;

    /**
     * Obtiene el valor de la propiedad additionalFamilyName.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAdditionalFamilyName() {
        return additionalFamilyName;
    }

    /**
     * Define el valor de la propiedad additionalFamilyName.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAdditionalFamilyName(String value) {
        this.additionalFamilyName = value;
    }

    /**
     * Obtiene el valor de la propiedad addressType.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAddressType() {
        return addressType;
    }

    /**
     * Define el valor de la propiedad addressType.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAddressType(String value) {
        this.addressType = value;
    }

    /**
     * Obtiene el valor de la propiedad age.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public Integer getAge() {
        return age;
    }

    /**
     * Define el valor de la propiedad age.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAge(Integer value) {
        this.age = value;
    }

    /**
     * Obtiene el valor de la propiedad birthday.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public Date getBirthday() {
        return birthday;
    }

    /**
     * Define el valor de la propiedad birthday.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBirthday(Date value) {
        this.birthday = value;
    }

    /**
     * Obtiene el valor de la propiedad businessPartnerID.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBusinessPartnerID() {
        return businessPartnerID;
    }

    /**
     * Define el valor de la propiedad businessPartnerID.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBusinessPartnerID(String value) {
        this.businessPartnerID = value;
    }

    /**
     * Obtiene el valor de la propiedad cellphone.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCellphone() {
        return cellphone;
    }

    /**
     * Define el valor de la propiedad cellphone.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCellphone(String value) {
        this.cellphone = value;
    }

    /**
     * Obtiene el valor de la propiedad cityName.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCityName() {
        return cityName;
    }

    /**
     * Define el valor de la propiedad cityName.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCityName(String value) {
        this.cityName = value;
    }

    /**
     * Obtiene el valor de la propiedad countryName.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCountryName() {
        return countryName;
    }

    /**
     * Define el valor de la propiedad countryName.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCountryName(String value) {
        this.countryName = value;
    }

    /**
     * Obtiene el valor de la propiedad districtName.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDistrictName() {
        return districtName;
    }

    /**
     * Define el valor de la propiedad districtName.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDistrictName(String value) {
        this.districtName = value;
    }

    /**
     * Obtiene el valor de la propiedad exteriorHouseID.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExteriorHouseID() {
        return exteriorHouseID;
    }

    /**
     * Define el valor de la propiedad exteriorHouseID.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExteriorHouseID(String value) {
        this.exteriorHouseID = value;
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
     * Obtiene el valor de la propiedad gender.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGender() {
        return gender;
    }

    /**
     * Define el valor de la propiedad gender.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGender(String value) {
        this.gender = value;
    }

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
     * Obtiene el valor de la propiedad homePhone.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHomePhone() {
        return homePhone;
    }

    /**
     * Define el valor de la propiedad homePhone.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHomePhone(String value) {
        this.homePhone = value;
    }

    /**
     * Obtiene el valor de la propiedad interiorHouseID.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInteriorHouseID() {
        return interiorHouseID;
    }

    /**
     * Define el valor de la propiedad interiorHouseID.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInteriorHouseID(String value) {
        this.interiorHouseID = value;
    }

    /**
     * Obtiene el valor de la propiedad maritalStatus.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMaritalStatus() {
        return maritalStatus;
    }

    /**
     * Define el valor de la propiedad maritalStatus.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMaritalStatus(String value) {
        this.maritalStatus = value;
    }

    /**
     * Obtiene el valor de la propiedad marriedFamilyName.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMarriedFamilyName() {
        return marriedFamilyName;
    }

    /**
     * Define el valor de la propiedad marriedFamilyName.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMarriedFamilyName(String value) {
        this.marriedFamilyName = value;
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
     * Obtiene el valor de la propiedad officePhone.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOfficePhone() {
        return officePhone;
    }

    /**
     * Define el valor de la propiedad officePhone.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOfficePhone(String value) {
        this.officePhone = value;
    }

    /**
     * Obtiene el valor de la propiedad percentage.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPercentage() {
        return percentage;
    }

    /**
     * Define el valor de la propiedad percentage.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPercentage(String value) {
        this.percentage = value;
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
     * Obtiene el valor de la propiedad regionName.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRegionName() {
        return regionName;
    }

    /**
     * Define el valor de la propiedad regionName.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRegionName(String value) {
        this.regionName = value;
    }

    /**
     * Obtiene el valor de la propiedad relationshipName.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRelationshipName() {
        return relationshipName;
    }

    /**
     * Define el valor de la propiedad relationshipName.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRelationshipName(String value) {
        this.relationshipName = value;
    }

    /**
     * Obtiene el valor de la propiedad roleCode.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRoleCode() {
        return roleCode;
    }

    /**
     * Define el valor de la propiedad roleCode.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRoleCode(String value) {
        this.roleCode = value;
    }

    /**
     * Obtiene el valor de la propiedad streetName.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStreetName() {
        return streetName;
    }

    /**
     * Define el valor de la propiedad streetName.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStreetName(String value) {
        this.streetName = value;
    }

    /**
     * Obtiene el valor de la propiedad taxID.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTaxID() {
        return taxID;
    }

    /**
     * Define el valor de la propiedad taxID.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTaxID(String value) {
        this.taxID = value;
    }

    /**
     * Obtiene el valor de la propiedad zone.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getZone() {
        return zone;
    }

    /**
     * Define el valor de la propiedad zone.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setZone(String value) {
        this.zone = value;
    }

}
