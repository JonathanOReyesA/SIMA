
package mx.com.gentera;

import java.util.Date;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import org.w3._2001.xmlschema.Adapter1;
import org.w3._2001.xmlschema.Adapter2;
import org.w3._2001.xmlschema.Adapter4;


/**
 * <p>Clase Java para searchClaimsDataType complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="searchClaimsDataType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="additionalFamilyName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="affected" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="affectedName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="amountPaid" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="amountToPay" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="amountToPay2" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="birthDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="businessPartnerID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="cellPhone" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="certificate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="cityName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="claimCauseID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="claimCauseName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="claimDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="claimDatePosted" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="claimDays" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="claimID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="claimStatusDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="claimStatusID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="claimStatusName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="countryName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="coverageID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="coverageName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="districtName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="endDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="endDateHosp" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="exteriorHouseID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="familyName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="flagCoverage" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="fullName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="givenName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="homePhone" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="idPersonPayable" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="initialDateHosp" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="insuranceID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="insuranceStatusID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="insuranceStatusName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="insuredAmount" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="interiorHouseID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="middleName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="modeID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="modeName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="moneyType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="officeName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="officePhone" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="paidDays" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *         &lt;element name="paymentType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="postalCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="processInstanceID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="productName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="regionName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="startDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="streetName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="trackingEmail" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
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
@XmlType(name = "searchClaimsDataType", propOrder = {
    "additionalFamilyName",
    "affected",
    "affectedName",
    "amountPaid",
    "amountToPay",
    "amountToPay2",
    "birthDate",
    "businessPartnerID",
    "cellPhone",
    "certificate",
    "cityName",
    "claimCauseID",
    "claimCauseName",
    "claimDate",
    "claimDatePosted",
    "claimDays",
    "claimID",
    "claimStatusDate",
    "claimStatusID",
    "claimStatusName",
    "countryName",
    "coverageID",
    "coverageName",
    "districtName",
    "endDate",
    "endDateHosp",
    "exteriorHouseID",
    "familyName",
    "flagCoverage",
    "fullName",
    "givenName",
    "homePhone",
    "idPersonPayable",
    "initialDateHosp",
    "insuranceID",
    "insuranceStatusID",
    "insuranceStatusName",
    "insuredAmount",
    "interiorHouseID",
    "middleName",
    "modeID",
    "modeName",
    "moneyType",
    "officeName",
    "officePhone",
    "paidDays",
    "paymentType",
    "postalCode",
    "processInstanceID",
    "productName",
    "regionName",
    "startDate",
    "streetName",
    "trackingEmail",
    "zone"
})
public class SearchClaimsDataType {

    protected String additionalFamilyName;
    protected String affected;
    protected String affectedName;
    @XmlElement(type = String.class)
    @XmlJavaTypeAdapter(Adapter1 .class)
    @XmlSchemaType(name = "double")
    protected Double amountPaid;
    @XmlElement(type = String.class)
    @XmlJavaTypeAdapter(Adapter1 .class)
    @XmlSchemaType(name = "double")
    protected Double amountToPay;
    @XmlElement(type = String.class)
    @XmlJavaTypeAdapter(Adapter1 .class)
    @XmlSchemaType(name = "double")
    protected Double amountToPay2;
    @XmlElement(type = String.class)
    @XmlJavaTypeAdapter(Adapter2 .class)
    @XmlSchemaType(name = "dateTime")
    protected Date birthDate;
    protected String businessPartnerID;
    protected String cellPhone;
    protected String certificate;
    protected String cityName;
    protected String claimCauseID;
    protected String claimCauseName;
    @XmlElement(type = String.class)
    @XmlJavaTypeAdapter(Adapter2 .class)
    @XmlSchemaType(name = "dateTime")
    protected Date claimDate;
    @XmlElement(type = String.class)
    @XmlJavaTypeAdapter(Adapter2 .class)
    @XmlSchemaType(name = "dateTime")
    protected Date claimDatePosted;
    @XmlElement(type = String.class)
    @XmlJavaTypeAdapter(Adapter1 .class)
    @XmlSchemaType(name = "double")
    protected Double claimDays;
    protected String claimID;
    @XmlElement(type = String.class)
    @XmlJavaTypeAdapter(Adapter2 .class)
    @XmlSchemaType(name = "dateTime")
    protected Date claimStatusDate;
    protected String claimStatusID;
    protected String claimStatusName;
    protected String countryName;
    protected String coverageID;
    protected String coverageName;
    protected String districtName;
    @XmlElement(type = String.class)
    @XmlJavaTypeAdapter(Adapter2 .class)
    @XmlSchemaType(name = "dateTime")
    protected Date endDate;
    protected String endDateHosp;
    protected String exteriorHouseID;
    protected String familyName;
    @XmlElement(type = String.class)
    @XmlJavaTypeAdapter(Adapter4 .class)
    @XmlSchemaType(name = "int")
    protected Integer flagCoverage;
    protected String fullName;
    protected String givenName;
    protected String homePhone;
    protected String idPersonPayable;
    protected String initialDateHosp;
    protected String insuranceID;
    protected String insuranceStatusID;
    protected String insuranceStatusName;
    protected String insuredAmount;
    protected String interiorHouseID;
    protected String middleName;
    protected String modeID;
    protected String modeName;
    protected String moneyType;
    protected String officeName;
    protected String officePhone;
    @XmlElement(type = String.class)
    @XmlJavaTypeAdapter(Adapter1 .class)
    @XmlSchemaType(name = "double")
    protected Double paidDays;
    protected String paymentType;
    protected String postalCode;
    protected String processInstanceID;
    protected String productName;
    protected String regionName;
    @XmlElement(type = String.class)
    @XmlJavaTypeAdapter(Adapter2 .class)
    @XmlSchemaType(name = "dateTime")
    protected Date startDate;
    protected String streetName;
    protected String trackingEmail;
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
     * Obtiene el valor de la propiedad amountPaid.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public Double getAmountPaid() {
        return amountPaid;
    }

    /**
     * Define el valor de la propiedad amountPaid.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAmountPaid(Double value) {
        this.amountPaid = value;
    }

    /**
     * Obtiene el valor de la propiedad amountToPay.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public Double getAmountToPay() {
        return amountToPay;
    }

    /**
     * Define el valor de la propiedad amountToPay.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAmountToPay(Double value) {
        this.amountToPay = value;
    }

    /**
     * Obtiene el valor de la propiedad amountToPay2.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public Double getAmountToPay2() {
        return amountToPay2;
    }

    /**
     * Define el valor de la propiedad amountToPay2.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAmountToPay2(Double value) {
        this.amountToPay2 = value;
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
     * Obtiene el valor de la propiedad claimCauseName.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getClaimCauseName() {
        return claimCauseName;
    }

    /**
     * Define el valor de la propiedad claimCauseName.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setClaimCauseName(String value) {
        this.claimCauseName = value;
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
     * Obtiene el valor de la propiedad claimDays.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public Double getClaimDays() {
        return claimDays;
    }

    /**
     * Define el valor de la propiedad claimDays.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setClaimDays(Double value) {
        this.claimDays = value;
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
     *     {@link String }
     *     
     */
    public String getClaimStatusID() {
        return claimStatusID;
    }

    /**
     * Define el valor de la propiedad claimStatusID.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setClaimStatusID(String value) {
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
     * Obtiene el valor de la propiedad coverageName.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCoverageName() {
        return coverageName;
    }

    /**
     * Define el valor de la propiedad coverageName.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCoverageName(String value) {
        this.coverageName = value;
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
     * Obtiene el valor de la propiedad endDateHosp.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEndDateHosp() {
        return endDateHosp;
    }

    /**
     * Define el valor de la propiedad endDateHosp.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEndDateHosp(String value) {
        this.endDateHosp = value;
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
    public Integer getFlagCoverage() {
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
    public void setFlagCoverage(Integer value) {
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
     * Obtiene el valor de la propiedad idPersonPayable.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIdPersonPayable() {
        return idPersonPayable;
    }

    /**
     * Define el valor de la propiedad idPersonPayable.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIdPersonPayable(String value) {
        this.idPersonPayable = value;
    }

    /**
     * Obtiene el valor de la propiedad initialDateHosp.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInitialDateHosp() {
        return initialDateHosp;
    }

    /**
     * Define el valor de la propiedad initialDateHosp.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInitialDateHosp(String value) {
        this.initialDateHosp = value;
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
     * Obtiene el valor de la propiedad insuranceStatusID.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInsuranceStatusID() {
        return insuranceStatusID;
    }

    /**
     * Define el valor de la propiedad insuranceStatusID.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInsuranceStatusID(String value) {
        this.insuranceStatusID = value;
    }

    /**
     * Obtiene el valor de la propiedad insuranceStatusName.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInsuranceStatusName() {
        return insuranceStatusName;
    }

    /**
     * Define el valor de la propiedad insuranceStatusName.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInsuranceStatusName(String value) {
        this.insuranceStatusName = value;
    }

    /**
     * Obtiene el valor de la propiedad insuredAmount.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInsuredAmount() {
        return insuredAmount;
    }

    /**
     * Define el valor de la propiedad insuredAmount.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInsuredAmount(String value) {
        this.insuredAmount = value;
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
     * Obtiene el valor de la propiedad paidDays.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public Double getPaidDays() {
        return paidDays;
    }

    /**
     * Define el valor de la propiedad paidDays.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPaidDays(Double value) {
        this.paidDays = value;
    }

    /**
     * Obtiene el valor de la propiedad paymentType.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPaymentType() {
        return paymentType;
    }

    /**
     * Define el valor de la propiedad paymentType.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPaymentType(String value) {
        this.paymentType = value;
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
