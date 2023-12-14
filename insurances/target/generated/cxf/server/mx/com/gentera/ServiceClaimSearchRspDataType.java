
package mx.com.gentera;

import java.math.BigDecimal;
import java.util.Date;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import org.w3._2001.xmlschema.Adapter2;


/**
 * <p>Clase Java para serviceClaimSearchRspDataType complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="serviceClaimSearchRspDataType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="additionalFamilyName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="affected" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="affectedName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="birthDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="businessPartnerID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="causeDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="cellPhone" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="certificate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="cityName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="claimCauseID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="claimDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="claimDatePosted" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="claimID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="claimStatusDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="claimStatusID" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="claimStatusName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="countryName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="coverageClaimName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="coverageID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="direction" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="districtName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="endDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="exteriorHouseID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="familyName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="flagCoverage" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="fullName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="givenName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="homePhone" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="insuranceID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="interiorHouseID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="middleName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="modeDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="modeID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="moneyType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="officePhone" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="postalCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="processInstanceID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="productName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="regionName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="salesOfficeName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="serviceID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="startDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="statusID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="statusName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="streetName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="trackingEmail" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "serviceClaimSearchRspDataType", propOrder = {
    "additionalFamilyName",
    "affected",
    "affectedName",
    "birthDate",
    "businessPartnerID",
    "causeDescription",
    "cellPhone",
    "certificate",
    "cityName",
    "claimCauseID",
    "claimDate",
    "claimDatePosted",
    "claimID",
    "claimStatusDate",
    "claimStatusID",
    "claimStatusName",
    "countryName",
    "coverageClaimName",
    "coverageID",
    "direction",
    "districtName",
    "endDate",
    "exteriorHouseID",
    "familyName",
    "flagCoverage",
    "fullName",
    "givenName",
    "homePhone",
    "insuranceID",
    "interiorHouseID",
    "middleName",
    "modeDescription",
    "modeID",
    "moneyType",
    "officePhone",
    "postalCode",
    "processInstanceID",
    "productName",
    "regionName",
    "salesOfficeName",
    "serviceID",
    "startDate",
    "statusID",
    "statusName",
    "streetName",
    "trackingEmail"
})
public class ServiceClaimSearchRspDataType {

    protected String additionalFamilyName;
    protected String affected;
    protected String affectedName;
    @XmlElement(type = String.class)
    @XmlJavaTypeAdapter(Adapter2 .class)
    @XmlSchemaType(name = "dateTime")
    protected Date birthDate;
    protected String businessPartnerID;
    protected String causeDescription;
    protected String cellPhone;
    protected String certificate;
    protected String cityName;
    protected String claimCauseID;
    @XmlElement(type = String.class)
    @XmlJavaTypeAdapter(Adapter2 .class)
    @XmlSchemaType(name = "dateTime")
    protected Date claimDate;
    @XmlElement(type = String.class)
    @XmlJavaTypeAdapter(Adapter2 .class)
    @XmlSchemaType(name = "dateTime")
    protected Date claimDatePosted;
    protected String claimID;
    @XmlElement(type = String.class)
    @XmlJavaTypeAdapter(Adapter2 .class)
    @XmlSchemaType(name = "dateTime")
    protected Date claimStatusDate;
    protected BigDecimal claimStatusID;
    protected String claimStatusName;
    protected String countryName;
    protected String coverageClaimName;
    protected String coverageID;
    protected String direction;
    protected String districtName;
    @XmlElement(type = String.class)
    @XmlJavaTypeAdapter(Adapter2 .class)
    @XmlSchemaType(name = "dateTime")
    protected Date endDate;
    protected String exteriorHouseID;
    protected String familyName;
    protected String flagCoverage;
    protected String fullName;
    protected String givenName;
    protected String homePhone;
    protected String insuranceID;
    protected String interiorHouseID;
    protected String middleName;
    protected String modeDescription;
    protected String modeID;
    protected String moneyType;
    protected String officePhone;
    protected String postalCode;
    protected String processInstanceID;
    protected String productName;
    protected String regionName;
    protected String salesOfficeName;
    protected String serviceID;
    @XmlElement(type = String.class)
    @XmlJavaTypeAdapter(Adapter2 .class)
    @XmlSchemaType(name = "dateTime")
    protected Date startDate;
    protected String statusID;
    protected String statusName;
    protected String streetName;
    protected String trackingEmail;

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
     * Obtiene el valor de la propiedad affected.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAffected() {
        return affected;
    }

    /**
     * Define el valor de la propiedad affected.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAffected(String value) {
        this.affected = value;
    }

    /**
     * Obtiene el valor de la propiedad affectedName.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAffectedName() {
        return affectedName;
    }

    /**
     * Define el valor de la propiedad affectedName.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAffectedName(String value) {
        this.affectedName = value;
    }

    /**
     * Obtiene el valor de la propiedad birthDate.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public Date getBirthDate() {
        return birthDate;
    }

    /**
     * Define el valor de la propiedad birthDate.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBirthDate(Date value) {
        this.birthDate = value;
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
     * Obtiene el valor de la propiedad causeDescription.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCauseDescription() {
        return causeDescription;
    }

    /**
     * Define el valor de la propiedad causeDescription.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCauseDescription(String value) {
        this.causeDescription = value;
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
     * Obtiene el valor de la propiedad claimCauseID.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getClaimCauseID() {
        return claimCauseID;
    }

    /**
     * Define el valor de la propiedad claimCauseID.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setClaimCauseID(String value) {
        this.claimCauseID = value;
    }

    /**
     * Obtiene el valor de la propiedad claimDate.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public Date getClaimDate() {
        return claimDate;
    }

    /**
     * Define el valor de la propiedad claimDate.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setClaimDate(Date value) {
        this.claimDate = value;
    }

    /**
     * Obtiene el valor de la propiedad claimDatePosted.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public Date getClaimDatePosted() {
        return claimDatePosted;
    }

    /**
     * Define el valor de la propiedad claimDatePosted.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setClaimDatePosted(Date value) {
        this.claimDatePosted = value;
    }

    /**
     * Obtiene el valor de la propiedad claimID.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getClaimID() {
        return claimID;
    }

    /**
     * Define el valor de la propiedad claimID.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setClaimID(String value) {
        this.claimID = value;
    }

    /**
     * Obtiene el valor de la propiedad claimStatusDate.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public Date getClaimStatusDate() {
        return claimStatusDate;
    }

    /**
     * Define el valor de la propiedad claimStatusDate.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setClaimStatusDate(Date value) {
        this.claimStatusDate = value;
    }

    /**
     * Obtiene el valor de la propiedad claimStatusID.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getClaimStatusID() {
        return claimStatusID;
    }

    /**
     * Define el valor de la propiedad claimStatusID.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setClaimStatusID(BigDecimal value) {
        this.claimStatusID = value;
    }

    /**
     * Obtiene el valor de la propiedad claimStatusName.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getClaimStatusName() {
        return claimStatusName;
    }

    /**
     * Define el valor de la propiedad claimStatusName.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setClaimStatusName(String value) {
        this.claimStatusName = value;
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
     * Obtiene el valor de la propiedad coverageClaimName.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCoverageClaimName() {
        return coverageClaimName;
    }

    /**
     * Define el valor de la propiedad coverageClaimName.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCoverageClaimName(String value) {
        this.coverageClaimName = value;
    }

    /**
     * Obtiene el valor de la propiedad coverageID.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCoverageID() {
        return coverageID;
    }

    /**
     * Define el valor de la propiedad coverageID.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCoverageID(String value) {
        this.coverageID = value;
    }

    /**
     * Obtiene el valor de la propiedad direction.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDirection() {
        return direction;
    }

    /**
     * Define el valor de la propiedad direction.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDirection(String value) {
        this.direction = value;
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
     * Obtiene el valor de la propiedad flagCoverage.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFlagCoverage() {
        return flagCoverage;
    }

    /**
     * Define el valor de la propiedad flagCoverage.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFlagCoverage(String value) {
        this.flagCoverage = value;
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
     * Obtiene el valor de la propiedad modeDescription.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getModeDescription() {
        return modeDescription;
    }

    /**
     * Define el valor de la propiedad modeDescription.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setModeDescription(String value) {
        this.modeDescription = value;
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
     * Obtiene el valor de la propiedad processInstanceID.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProcessInstanceID() {
        return processInstanceID;
    }

    /**
     * Define el valor de la propiedad processInstanceID.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProcessInstanceID(String value) {
        this.processInstanceID = value;
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
     * Obtiene el valor de la propiedad salesOfficeName.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSalesOfficeName() {
        return salesOfficeName;
    }

    /**
     * Define el valor de la propiedad salesOfficeName.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSalesOfficeName(String value) {
        this.salesOfficeName = value;
    }

    /**
     * Obtiene el valor de la propiedad serviceID.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getServiceID() {
        return serviceID;
    }

    /**
     * Define el valor de la propiedad serviceID.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setServiceID(String value) {
        this.serviceID = value;
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
     * Obtiene el valor de la propiedad trackingEmail.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTrackingEmail() {
        return trackingEmail;
    }

    /**
     * Define el valor de la propiedad trackingEmail.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTrackingEmail(String value) {
        this.trackingEmail = value;
    }

}
