
package mx.com.gentera.crmms._000.businesspartnermanage.int_0334.v2;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import javax.xml.datatype.XMLGregorianCalendar;
import com.compartamos.common.gdt.CustomerUndesirableReasonCode;
import com.compartamos.common.structures.AcctOriginationBusinessPartnerNameV1;


/**
 * Business Partner Detail
 * 
 * <p>Clase Java para BusinessPartnerDetail complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="BusinessPartnerDetail"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="NameData" type="{http://compartamos.com/common/structures}AcctOriginationBusinessPartnerName_V1" minOccurs="0"/&gt;
 *         &lt;element name="GenderCode" type="{http://compartamos.com/common/gdt}GenderCode" minOccurs="0"/&gt;
 *         &lt;element name="BirthDate" type="{http://compartamos.com/common/gdt}Date" minOccurs="0"/&gt;
 *         &lt;element name="BirthCountryCode" type="{http://compartamos.com/common/gdt}CountryCode" minOccurs="0"/&gt;
 *         &lt;element name="BirthCountryName" type="{http://compartamos.com/common/gdt}LANGUAGEINDEPENDENT_MEDIUM_Description" minOccurs="0"/&gt;
 *         &lt;element name="BirthPlaceCode" type="{http://compartamos.com/common/gdt}CountryCode" minOccurs="0"/&gt;
 *         &lt;element name="BirthPlaceDescription" type="{http://compartamos.com/common/gdt}LANGUAGEINDEPENDENT_MEDIUM_Description" minOccurs="0"/&gt;
 *         &lt;element name="NationalityCode" type="{http://compartamos.com/common/gdt}CountryCode" minOccurs="0"/&gt;
 *         &lt;element name="NationalityDescription" type="{http://compartamos.com/common/gdt}LANGUAGEINDEPENDENT_MEDIUM_Description" minOccurs="0"/&gt;
 *         &lt;element name="OtherNationalityCode" type="{http://compartamos.com/common/gdt}CountryCode" minOccurs="0"/&gt;
 *         &lt;element name="OtherNationalityDescription" type="{http://compartamos.com/common/gdt}LANGUAGEINDEPENDENT_MEDIUM_Description" minOccurs="0"/&gt;
 *         &lt;element name="PhysicalPerson" type="{http://compartamos.com/common/gdt}Flag" minOccurs="0"/&gt;
 *         &lt;element name="MaritalStatusCode" type="{http://compartamos.com/common/gdt}NOSC_MaritalStatusCode" minOccurs="0"/&gt;
 *         &lt;element name="MaritalStatusDescription" type="{http://compartamos.com/common/gdt}LANGUAGEINDEPENDENT_MEDIUM_Description" minOccurs="0"/&gt;
 *         &lt;element name="ChildrenNumber" type="{http://compartamos.com/common/gdt}SMALL_NumberValue" minOccurs="0"/&gt;
 *         &lt;element name="DependentsNumber" type="{http://compartamos.com/common/gdt}SMALL_NumberValue" minOccurs="0"/&gt;
 *         &lt;element name="TitleAcademicCode" type="{http://compartamos.com/common/gdt}NOSC_AcademicTitleCode" minOccurs="0"/&gt;
 *         &lt;element name="TitleAcademicDescription" type="{http://compartamos.com/common/gdt}LANGUAGEINDEPENDENT_MEDIUM_Description" minOccurs="0"/&gt;
 *         &lt;element name="OccupationCode" type="{http://compartamos.com/common/gdt}ZOccupationCode" minOccurs="0"/&gt;
 *         &lt;element name="OccupationDescription" type="{http://compartamos.com/common/gdt}LANGUAGEINDEPENDENT_MEDIUM_Description" minOccurs="0"/&gt;
 *         &lt;element name="CentralBlock" type="{http://compartamos.com/common/gdt}Flag" minOccurs="0"/&gt;
 *         &lt;element name="ReasonBlockCode" type="{http://compartamos.com/common/gdt}RiskLevelCode" minOccurs="0"/&gt;
 *         &lt;element name="ReasonBlockDescription" type="{http://compartamos.com/common/gdt}LANGUAGEINDEPENDENT_MEDIUM_Description" minOccurs="0"/&gt;
 *         &lt;element name="UndesirableCustomer" type="{http://compartamos.com/common/gdt}Flag" minOccurs="0"/&gt;
 *         &lt;element name="ReasonUndesirability" type="{http://compartamos.com/common/gdt}CustomerUndesirableReasonCode" minOccurs="0"/&gt;
 *         &lt;element name="DescriptionReasonUndesirability" type="{http://compartamos.com/common/gdt}LANGUAGEINDEPENDENT_LEN30_Text" minOccurs="0"/&gt;
 *         &lt;element name="LivingPlaceTypeCode" type="{http://compartamos.com/common/gdt}ZBusinessPartnerHouseTypeCode" minOccurs="0"/&gt;
 *         &lt;element name="LivingPlaceDescription" type="{http://compartamos.com/common/gdt}LANGUAGEINDEPENDENT_MEDIUM_Description" minOccurs="0"/&gt;
 *         &lt;element name="Email" type="{http://compartamos.com/common/gdt}NOSC_EmailURI" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BusinessPartnerDetail", propOrder = {
    "nameData",
    "genderCode",
    "birthDate",
    "birthCountryCode",
    "birthCountryName",
    "birthPlaceCode",
    "birthPlaceDescription",
    "nationalityCode",
    "nationalityDescription",
    "otherNationalityCode",
    "otherNationalityDescription",
    "physicalPerson",
    "maritalStatusCode",
    "maritalStatusDescription",
    "childrenNumber",
    "dependentsNumber",
    "titleAcademicCode",
    "titleAcademicDescription",
    "occupationCode",
    "occupationDescription",
    "centralBlock",
    "reasonBlockCode",
    "reasonBlockDescription",
    "undesirableCustomer",
    "reasonUndesirability",
    "descriptionReasonUndesirability",
    "livingPlaceTypeCode",
    "livingPlaceDescription",
    "email"
})
public class BusinessPartnerDetail {

    @XmlElement(name = "NameData")
    protected AcctOriginationBusinessPartnerNameV1 nameData;
    @XmlElement(name = "GenderCode")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String genderCode;
    @XmlElement(name = "BirthDate")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar birthDate;
    @XmlElement(name = "BirthCountryCode")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String birthCountryCode;
    @XmlElement(name = "BirthCountryName")
    protected String birthCountryName;
    @XmlElement(name = "BirthPlaceCode")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String birthPlaceCode;
    @XmlElement(name = "BirthPlaceDescription")
    protected String birthPlaceDescription;
    @XmlElement(name = "NationalityCode")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String nationalityCode;
    @XmlElement(name = "NationalityDescription")
    protected String nationalityDescription;
    @XmlElement(name = "OtherNationalityCode")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String otherNationalityCode;
    @XmlElement(name = "OtherNationalityDescription")
    protected String otherNationalityDescription;
    @XmlElement(name = "PhysicalPerson")
    protected String physicalPerson;
    @XmlElement(name = "MaritalStatusCode")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String maritalStatusCode;
    @XmlElement(name = "MaritalStatusDescription")
    protected String maritalStatusDescription;
    @XmlElement(name = "ChildrenNumber")
    protected Integer childrenNumber;
    @XmlElement(name = "DependentsNumber")
    protected Integer dependentsNumber;
    @XmlElement(name = "TitleAcademicCode")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String titleAcademicCode;
    @XmlElement(name = "TitleAcademicDescription")
    protected String titleAcademicDescription;
    @XmlElement(name = "OccupationCode")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String occupationCode;
    @XmlElement(name = "OccupationDescription")
    protected String occupationDescription;
    @XmlElement(name = "CentralBlock")
    protected String centralBlock;
    @XmlElement(name = "ReasonBlockCode")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String reasonBlockCode;
    @XmlElement(name = "ReasonBlockDescription")
    protected String reasonBlockDescription;
    @XmlElement(name = "UndesirableCustomer")
    protected String undesirableCustomer;
    @XmlElement(name = "ReasonUndesirability")
    protected CustomerUndesirableReasonCode reasonUndesirability;
    @XmlElement(name = "DescriptionReasonUndesirability")
    protected String descriptionReasonUndesirability;
    @XmlElement(name = "LivingPlaceTypeCode")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String livingPlaceTypeCode;
    @XmlElement(name = "LivingPlaceDescription")
    protected String livingPlaceDescription;
    @XmlElement(name = "Email")
    @XmlSchemaType(name = "anyURI")
    protected String email;

    /**
     * Obtiene el valor de la propiedad nameData.
     * 
     * @return
     *     possible object is
     *     {@link AcctOriginationBusinessPartnerNameV1 }
     *     
     */
    public AcctOriginationBusinessPartnerNameV1 getNameData() {
        return nameData;
    }

    /**
     * Define el valor de la propiedad nameData.
     * 
     * @param value
     *     allowed object is
     *     {@link AcctOriginationBusinessPartnerNameV1 }
     *     
     */
    public void setNameData(AcctOriginationBusinessPartnerNameV1 value) {
        this.nameData = value;
    }

    /**
     * Obtiene el valor de la propiedad genderCode.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGenderCode() {
        return genderCode;
    }

    /**
     * Define el valor de la propiedad genderCode.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGenderCode(String value) {
        this.genderCode = value;
    }

    /**
     * Obtiene el valor de la propiedad birthDate.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getBirthDate() {
        return birthDate;
    }

    /**
     * Define el valor de la propiedad birthDate.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setBirthDate(XMLGregorianCalendar value) {
        this.birthDate = value;
    }

    /**
     * Obtiene el valor de la propiedad birthCountryCode.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBirthCountryCode() {
        return birthCountryCode;
    }

    /**
     * Define el valor de la propiedad birthCountryCode.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBirthCountryCode(String value) {
        this.birthCountryCode = value;
    }

    /**
     * Obtiene el valor de la propiedad birthCountryName.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBirthCountryName() {
        return birthCountryName;
    }

    /**
     * Define el valor de la propiedad birthCountryName.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBirthCountryName(String value) {
        this.birthCountryName = value;
    }

    /**
     * Obtiene el valor de la propiedad birthPlaceCode.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBirthPlaceCode() {
        return birthPlaceCode;
    }

    /**
     * Define el valor de la propiedad birthPlaceCode.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBirthPlaceCode(String value) {
        this.birthPlaceCode = value;
    }

    /**
     * Obtiene el valor de la propiedad birthPlaceDescription.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBirthPlaceDescription() {
        return birthPlaceDescription;
    }

    /**
     * Define el valor de la propiedad birthPlaceDescription.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBirthPlaceDescription(String value) {
        this.birthPlaceDescription = value;
    }

    /**
     * Obtiene el valor de la propiedad nationalityCode.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNationalityCode() {
        return nationalityCode;
    }

    /**
     * Define el valor de la propiedad nationalityCode.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNationalityCode(String value) {
        this.nationalityCode = value;
    }

    /**
     * Obtiene el valor de la propiedad nationalityDescription.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNationalityDescription() {
        return nationalityDescription;
    }

    /**
     * Define el valor de la propiedad nationalityDescription.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNationalityDescription(String value) {
        this.nationalityDescription = value;
    }

    /**
     * Obtiene el valor de la propiedad otherNationalityCode.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOtherNationalityCode() {
        return otherNationalityCode;
    }

    /**
     * Define el valor de la propiedad otherNationalityCode.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOtherNationalityCode(String value) {
        this.otherNationalityCode = value;
    }

    /**
     * Obtiene el valor de la propiedad otherNationalityDescription.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOtherNationalityDescription() {
        return otherNationalityDescription;
    }

    /**
     * Define el valor de la propiedad otherNationalityDescription.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOtherNationalityDescription(String value) {
        this.otherNationalityDescription = value;
    }

    /**
     * Obtiene el valor de la propiedad physicalPerson.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPhysicalPerson() {
        return physicalPerson;
    }

    /**
     * Define el valor de la propiedad physicalPerson.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPhysicalPerson(String value) {
        this.physicalPerson = value;
    }

    /**
     * Obtiene el valor de la propiedad maritalStatusCode.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMaritalStatusCode() {
        return maritalStatusCode;
    }

    /**
     * Define el valor de la propiedad maritalStatusCode.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMaritalStatusCode(String value) {
        this.maritalStatusCode = value;
    }

    /**
     * Obtiene el valor de la propiedad maritalStatusDescription.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMaritalStatusDescription() {
        return maritalStatusDescription;
    }

    /**
     * Define el valor de la propiedad maritalStatusDescription.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMaritalStatusDescription(String value) {
        this.maritalStatusDescription = value;
    }

    /**
     * Obtiene el valor de la propiedad childrenNumber.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getChildrenNumber() {
        return childrenNumber;
    }

    /**
     * Define el valor de la propiedad childrenNumber.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setChildrenNumber(Integer value) {
        this.childrenNumber = value;
    }

    /**
     * Obtiene el valor de la propiedad dependentsNumber.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getDependentsNumber() {
        return dependentsNumber;
    }

    /**
     * Define el valor de la propiedad dependentsNumber.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setDependentsNumber(Integer value) {
        this.dependentsNumber = value;
    }

    /**
     * Obtiene el valor de la propiedad titleAcademicCode.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTitleAcademicCode() {
        return titleAcademicCode;
    }

    /**
     * Define el valor de la propiedad titleAcademicCode.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTitleAcademicCode(String value) {
        this.titleAcademicCode = value;
    }

    /**
     * Obtiene el valor de la propiedad titleAcademicDescription.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTitleAcademicDescription() {
        return titleAcademicDescription;
    }

    /**
     * Define el valor de la propiedad titleAcademicDescription.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTitleAcademicDescription(String value) {
        this.titleAcademicDescription = value;
    }

    /**
     * Obtiene el valor de la propiedad occupationCode.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOccupationCode() {
        return occupationCode;
    }

    /**
     * Define el valor de la propiedad occupationCode.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOccupationCode(String value) {
        this.occupationCode = value;
    }

    /**
     * Obtiene el valor de la propiedad occupationDescription.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOccupationDescription() {
        return occupationDescription;
    }

    /**
     * Define el valor de la propiedad occupationDescription.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOccupationDescription(String value) {
        this.occupationDescription = value;
    }

    /**
     * Obtiene el valor de la propiedad centralBlock.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCentralBlock() {
        return centralBlock;
    }

    /**
     * Define el valor de la propiedad centralBlock.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCentralBlock(String value) {
        this.centralBlock = value;
    }

    /**
     * Obtiene el valor de la propiedad reasonBlockCode.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReasonBlockCode() {
        return reasonBlockCode;
    }

    /**
     * Define el valor de la propiedad reasonBlockCode.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReasonBlockCode(String value) {
        this.reasonBlockCode = value;
    }

    /**
     * Obtiene el valor de la propiedad reasonBlockDescription.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReasonBlockDescription() {
        return reasonBlockDescription;
    }

    /**
     * Define el valor de la propiedad reasonBlockDescription.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReasonBlockDescription(String value) {
        this.reasonBlockDescription = value;
    }

    /**
     * Obtiene el valor de la propiedad undesirableCustomer.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUndesirableCustomer() {
        return undesirableCustomer;
    }

    /**
     * Define el valor de la propiedad undesirableCustomer.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUndesirableCustomer(String value) {
        this.undesirableCustomer = value;
    }

    /**
     * Obtiene el valor de la propiedad reasonUndesirability.
     * 
     * @return
     *     possible object is
     *     {@link CustomerUndesirableReasonCode }
     *     
     */
    public CustomerUndesirableReasonCode getReasonUndesirability() {
        return reasonUndesirability;
    }

    /**
     * Define el valor de la propiedad reasonUndesirability.
     * 
     * @param value
     *     allowed object is
     *     {@link CustomerUndesirableReasonCode }
     *     
     */
    public void setReasonUndesirability(CustomerUndesirableReasonCode value) {
        this.reasonUndesirability = value;
    }

    /**
     * Obtiene el valor de la propiedad descriptionReasonUndesirability.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescriptionReasonUndesirability() {
        return descriptionReasonUndesirability;
    }

    /**
     * Define el valor de la propiedad descriptionReasonUndesirability.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescriptionReasonUndesirability(String value) {
        this.descriptionReasonUndesirability = value;
    }

    /**
     * Obtiene el valor de la propiedad livingPlaceTypeCode.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLivingPlaceTypeCode() {
        return livingPlaceTypeCode;
    }

    /**
     * Define el valor de la propiedad livingPlaceTypeCode.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLivingPlaceTypeCode(String value) {
        this.livingPlaceTypeCode = value;
    }

    /**
     * Obtiene el valor de la propiedad livingPlaceDescription.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLivingPlaceDescription() {
        return livingPlaceDescription;
    }

    /**
     * Define el valor de la propiedad livingPlaceDescription.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLivingPlaceDescription(String value) {
        this.livingPlaceDescription = value;
    }

    /**
     * Obtiene el valor de la propiedad email.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEmail() {
        return email;
    }

    /**
     * Define el valor de la propiedad email.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEmail(String value) {
        this.email = value;
    }

}
