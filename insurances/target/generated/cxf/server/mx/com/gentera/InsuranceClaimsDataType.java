
package mx.com.gentera;

import java.util.Date;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import org.w3._2001.xmlschema.Adapter2;
import org.w3._2001.xmlschema.Adapter4;


/**
 * <p>Clase Java para insuranceClaimsDataType complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="insuranceClaimsDataType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="additionalFamilyName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="businessPartnerID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="cellPhone" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="certificate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="cityName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="countryName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="districtName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="endDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="extDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="extMonth" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="exteriorHouseID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="familyName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="fecRenov" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="flagService" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="format" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="fullName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="givenName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="homePhone" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="insuranceID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="insurancePolicy" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="interiorHouseID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="macroPolicy" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="maritalStatus" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="maritalStatusBP" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="marriedFamilyName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="marriedFamilyNameBP" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="middleName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="modeID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="modeName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="moneyID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="moneyType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="officeName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="officePhone" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="partnerID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="partnerName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="postalCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="productID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="productInsuredAmount" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="productName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="regionName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="relAdditionalFamilyName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="relCellPhone" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="relCityName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="relCountryName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="relDistrictName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="relExteriorHouseID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="relFamilyName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="relFullName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="relGivenName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="relHomePhone" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="relInteriorHouseID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="relMiddleName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="relOfficePhone" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="relPostalCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="relRegionName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="relStreetName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="relTaxID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="relativeID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="startDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="statusID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="statusName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="streetName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="taxID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="zone" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="zoneBP" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "insuranceClaimsDataType", propOrder = {
    "additionalFamilyName",
    "businessPartnerID",
    "cellPhone",
    "certificate",
    "cityName",
    "countryName",
    "districtName",
    "endDate",
    "extDate",
    "extMonth",
    "exteriorHouseID",
    "familyName",
    "fecRenov",
    "flagService",
    "format",
    "fullName",
    "givenName",
    "homePhone",
    "insuranceID",
    "insurancePolicy",
    "interiorHouseID",
    "macroPolicy",
    "maritalStatus",
    "maritalStatusBP",
    "marriedFamilyName",
    "marriedFamilyNameBP",
    "middleName",
    "modeID",
    "modeName",
    "moneyID",
    "moneyType",
    "officeName",
    "officePhone",
    "partnerID",
    "partnerName",
    "postalCode",
    "productID",
    "productInsuredAmount",
    "productName",
    "regionName",
    "relAdditionalFamilyName",
    "relCellPhone",
    "relCityName",
    "relCountryName",
    "relDistrictName",
    "relExteriorHouseID",
    "relFamilyName",
    "relFullName",
    "relGivenName",
    "relHomePhone",
    "relInteriorHouseID",
    "relMiddleName",
    "relOfficePhone",
    "relPostalCode",
    "relRegionName",
    "relStreetName",
    "relTaxID",
    "relativeID",
    "startDate",
    "statusID",
    "statusName",
    "streetName",
    "taxID",
    "zone",
    "zoneBP"
})
public class InsuranceClaimsDataType {

    protected String additionalFamilyName;
    protected String businessPartnerID;
    protected String cellPhone;
    protected String certificate;
    protected String cityName;
    protected String countryName;
    protected String districtName;
    @XmlElement(type = String.class)
    @XmlJavaTypeAdapter(Adapter2 .class)
    @XmlSchemaType(name = "dateTime")
    protected Date endDate;
    protected String extDate;
    @XmlElement(required = true, type = String.class)
    @XmlJavaTypeAdapter(Adapter4 .class)
    @XmlSchemaType(name = "int")
    protected Integer extMonth;
    protected String exteriorHouseID;
    protected String familyName;
    protected String fecRenov;
    protected String flagService;
    protected String format;
    protected String fullName;
    protected String givenName;
    protected String homePhone;
    protected String insuranceID;
    protected String insurancePolicy;
    protected String interiorHouseID;
    protected String macroPolicy;
    protected String maritalStatus;
    protected String maritalStatusBP;
    protected String marriedFamilyName;
    protected String marriedFamilyNameBP;
    protected String middleName;
    protected String modeID;
    protected String modeName;
    protected String moneyID;
    protected String moneyType;
    protected String officeName;
    protected String officePhone;
    protected String partnerID;
    protected String partnerName;
    protected String postalCode;
    protected String productID;
    protected String productInsuredAmount;
    protected String productName;
    protected String regionName;
    protected String relAdditionalFamilyName;
    protected String relCellPhone;
    protected String relCityName;
    protected String relCountryName;
    protected String relDistrictName;
    protected String relExteriorHouseID;
    protected String relFamilyName;
    protected String relFullName;
    protected String relGivenName;
    protected String relHomePhone;
    protected String relInteriorHouseID;
    protected String relMiddleName;
    protected String relOfficePhone;
    protected String relPostalCode;
    protected String relRegionName;
    protected String relStreetName;
    protected String relTaxID;
    protected String relativeID;
    @XmlElement(type = String.class)
    @XmlJavaTypeAdapter(Adapter2 .class)
    @XmlSchemaType(name = "dateTime")
    protected Date startDate;
    protected String statusID;
    protected String statusName;
    protected String streetName;
    protected String taxID;
    protected String zone;
    protected String zoneBP;

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
     * Obtiene el valor de la propiedad cellPhone.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCellPhone() {
        return cellPhone;
    }

    /**
     * Define el valor de la propiedad cellPhone.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCellPhone(String value) {
        this.cellPhone = value;
    }

    /**
     * Obtiene el valor de la propiedad certificate.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCertificate() {
        return certificate;
    }

    /**
     * Define el valor de la propiedad certificate.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCertificate(String value) {
        this.certificate = value;
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
     * Obtiene el valor de la propiedad endDate.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public Date getEndDate() {
        return endDate;
    }

    /**
     * Define el valor de la propiedad endDate.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEndDate(Date value) {
        this.endDate = value;
    }

    /**
     * Obtiene el valor de la propiedad extDate.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExtDate() {
        return extDate;
    }

    /**
     * Define el valor de la propiedad extDate.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExtDate(String value) {
        this.extDate = value;
    }

    /**
     * Obtiene el valor de la propiedad extMonth.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public Integer getExtMonth() {
        return extMonth;
    }

    /**
     * Define el valor de la propiedad extMonth.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExtMonth(Integer value) {
        this.extMonth = value;
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
     * Obtiene el valor de la propiedad fecRenov.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFecRenov() {
        return fecRenov;
    }

    /**
     * Define el valor de la propiedad fecRenov.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFecRenov(String value) {
        this.fecRenov = value;
    }

    /**
     * Obtiene el valor de la propiedad flagService.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFlagService() {
        return flagService;
    }

    /**
     * Define el valor de la propiedad flagService.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFlagService(String value) {
        this.flagService = value;
    }

    /**
     * Obtiene el valor de la propiedad format.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFormat() {
        return format;
    }

    /**
     * Define el valor de la propiedad format.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFormat(String value) {
        this.format = value;
    }

    /**
     * Obtiene el valor de la propiedad fullName.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFullName() {
        return fullName;
    }

    /**
     * Define el valor de la propiedad fullName.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFullName(String value) {
        this.fullName = value;
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
     * Obtiene el valor de la propiedad insuranceID.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInsuranceID() {
        return insuranceID;
    }

    /**
     * Define el valor de la propiedad insuranceID.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInsuranceID(String value) {
        this.insuranceID = value;
    }

    /**
     * Obtiene el valor de la propiedad insurancePolicy.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInsurancePolicy() {
        return insurancePolicy;
    }

    /**
     * Define el valor de la propiedad insurancePolicy.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInsurancePolicy(String value) {
        this.insurancePolicy = value;
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
     * Obtiene el valor de la propiedad macroPolicy.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMacroPolicy() {
        return macroPolicy;
    }

    /**
     * Define el valor de la propiedad macroPolicy.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMacroPolicy(String value) {
        this.macroPolicy = value;
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
     * Obtiene el valor de la propiedad maritalStatusBP.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMaritalStatusBP() {
        return maritalStatusBP;
    }

    /**
     * Define el valor de la propiedad maritalStatusBP.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMaritalStatusBP(String value) {
        this.maritalStatusBP = value;
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
     * Obtiene el valor de la propiedad marriedFamilyNameBP.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMarriedFamilyNameBP() {
        return marriedFamilyNameBP;
    }

    /**
     * Define el valor de la propiedad marriedFamilyNameBP.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMarriedFamilyNameBP(String value) {
        this.marriedFamilyNameBP = value;
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
     * Obtiene el valor de la propiedad modeID.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getModeID() {
        return modeID;
    }

    /**
     * Define el valor de la propiedad modeID.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setModeID(String value) {
        this.modeID = value;
    }

    /**
     * Obtiene el valor de la propiedad modeName.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getModeName() {
        return modeName;
    }

    /**
     * Define el valor de la propiedad modeName.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setModeName(String value) {
        this.modeName = value;
    }

    /**
     * Obtiene el valor de la propiedad moneyID.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMoneyID() {
        return moneyID;
    }

    /**
     * Define el valor de la propiedad moneyID.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMoneyID(String value) {
        this.moneyID = value;
    }

    /**
     * Obtiene el valor de la propiedad moneyType.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMoneyType() {
        return moneyType;
    }

    /**
     * Define el valor de la propiedad moneyType.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMoneyType(String value) {
        this.moneyType = value;
    }

    /**
     * Obtiene el valor de la propiedad officeName.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOfficeName() {
        return officeName;
    }

    /**
     * Define el valor de la propiedad officeName.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOfficeName(String value) {
        this.officeName = value;
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
     * Obtiene el valor de la propiedad partnerID.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPartnerID() {
        return partnerID;
    }

    /**
     * Define el valor de la propiedad partnerID.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPartnerID(String value) {
        this.partnerID = value;
    }

    /**
     * Obtiene el valor de la propiedad partnerName.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPartnerName() {
        return partnerName;
    }

    /**
     * Define el valor de la propiedad partnerName.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPartnerName(String value) {
        this.partnerName = value;
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
     * Obtiene el valor de la propiedad productID.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProductID() {
        return productID;
    }

    /**
     * Define el valor de la propiedad productID.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProductID(String value) {
        this.productID = value;
    }

    /**
     * Obtiene el valor de la propiedad productInsuredAmount.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProductInsuredAmount() {
        return productInsuredAmount;
    }

    /**
     * Define el valor de la propiedad productInsuredAmount.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProductInsuredAmount(String value) {
        this.productInsuredAmount = value;
    }

    /**
     * Obtiene el valor de la propiedad productName.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProductName() {
        return productName;
    }

    /**
     * Define el valor de la propiedad productName.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProductName(String value) {
        this.productName = value;
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
     * Obtiene el valor de la propiedad relAdditionalFamilyName.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRelAdditionalFamilyName() {
        return relAdditionalFamilyName;
    }

    /**
     * Define el valor de la propiedad relAdditionalFamilyName.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRelAdditionalFamilyName(String value) {
        this.relAdditionalFamilyName = value;
    }

    /**
     * Obtiene el valor de la propiedad relCellPhone.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRelCellPhone() {
        return relCellPhone;
    }

    /**
     * Define el valor de la propiedad relCellPhone.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRelCellPhone(String value) {
        this.relCellPhone = value;
    }

    /**
     * Obtiene el valor de la propiedad relCityName.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRelCityName() {
        return relCityName;
    }

    /**
     * Define el valor de la propiedad relCityName.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRelCityName(String value) {
        this.relCityName = value;
    }

    /**
     * Obtiene el valor de la propiedad relCountryName.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRelCountryName() {
        return relCountryName;
    }

    /**
     * Define el valor de la propiedad relCountryName.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRelCountryName(String value) {
        this.relCountryName = value;
    }

    /**
     * Obtiene el valor de la propiedad relDistrictName.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRelDistrictName() {
        return relDistrictName;
    }

    /**
     * Define el valor de la propiedad relDistrictName.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRelDistrictName(String value) {
        this.relDistrictName = value;
    }

    /**
     * Obtiene el valor de la propiedad relExteriorHouseID.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRelExteriorHouseID() {
        return relExteriorHouseID;
    }

    /**
     * Define el valor de la propiedad relExteriorHouseID.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRelExteriorHouseID(String value) {
        this.relExteriorHouseID = value;
    }

    /**
     * Obtiene el valor de la propiedad relFamilyName.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRelFamilyName() {
        return relFamilyName;
    }

    /**
     * Define el valor de la propiedad relFamilyName.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRelFamilyName(String value) {
        this.relFamilyName = value;
    }

    /**
     * Obtiene el valor de la propiedad relFullName.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRelFullName() {
        return relFullName;
    }

    /**
     * Define el valor de la propiedad relFullName.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRelFullName(String value) {
        this.relFullName = value;
    }

    /**
     * Obtiene el valor de la propiedad relGivenName.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRelGivenName() {
        return relGivenName;
    }

    /**
     * Define el valor de la propiedad relGivenName.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRelGivenName(String value) {
        this.relGivenName = value;
    }

    /**
     * Obtiene el valor de la propiedad relHomePhone.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRelHomePhone() {
        return relHomePhone;
    }

    /**
     * Define el valor de la propiedad relHomePhone.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRelHomePhone(String value) {
        this.relHomePhone = value;
    }

    /**
     * Obtiene el valor de la propiedad relInteriorHouseID.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRelInteriorHouseID() {
        return relInteriorHouseID;
    }

    /**
     * Define el valor de la propiedad relInteriorHouseID.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRelInteriorHouseID(String value) {
        this.relInteriorHouseID = value;
    }

    /**
     * Obtiene el valor de la propiedad relMiddleName.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRelMiddleName() {
        return relMiddleName;
    }

    /**
     * Define el valor de la propiedad relMiddleName.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRelMiddleName(String value) {
        this.relMiddleName = value;
    }

    /**
     * Obtiene el valor de la propiedad relOfficePhone.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRelOfficePhone() {
        return relOfficePhone;
    }

    /**
     * Define el valor de la propiedad relOfficePhone.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRelOfficePhone(String value) {
        this.relOfficePhone = value;
    }

    /**
     * Obtiene el valor de la propiedad relPostalCode.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRelPostalCode() {
        return relPostalCode;
    }

    /**
     * Define el valor de la propiedad relPostalCode.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRelPostalCode(String value) {
        this.relPostalCode = value;
    }

    /**
     * Obtiene el valor de la propiedad relRegionName.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRelRegionName() {
        return relRegionName;
    }

    /**
     * Define el valor de la propiedad relRegionName.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRelRegionName(String value) {
        this.relRegionName = value;
    }

    /**
     * Obtiene el valor de la propiedad relStreetName.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRelStreetName() {
        return relStreetName;
    }

    /**
     * Define el valor de la propiedad relStreetName.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRelStreetName(String value) {
        this.relStreetName = value;
    }

    /**
     * Obtiene el valor de la propiedad relTaxID.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRelTaxID() {
        return relTaxID;
    }

    /**
     * Define el valor de la propiedad relTaxID.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRelTaxID(String value) {
        this.relTaxID = value;
    }

    /**
     * Obtiene el valor de la propiedad relativeID.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRelativeID() {
        return relativeID;
    }

    /**
     * Define el valor de la propiedad relativeID.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRelativeID(String value) {
        this.relativeID = value;
    }

    /**
     * Obtiene el valor de la propiedad startDate.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public Date getStartDate() {
        return startDate;
    }

    /**
     * Define el valor de la propiedad startDate.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStartDate(Date value) {
        this.startDate = value;
    }

    /**
     * Obtiene el valor de la propiedad statusID.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStatusID() {
        return statusID;
    }

    /**
     * Define el valor de la propiedad statusID.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStatusID(String value) {
        this.statusID = value;
    }

    /**
     * Obtiene el valor de la propiedad statusName.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStatusName() {
        return statusName;
    }

    /**
     * Define el valor de la propiedad statusName.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStatusName(String value) {
        this.statusName = value;
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

    /**
     * Obtiene el valor de la propiedad zoneBP.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getZoneBP() {
        return zoneBP;
    }

    /**
     * Define el valor de la propiedad zoneBP.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setZoneBP(String value) {
        this.zoneBP = value;
    }

}
