
package mx.com.gentera.crmms._000.businesspartnermanage.int_0334.v2;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * Economic Activity Data
 * 
 * <p>Clase Java para EconomicActivity complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="EconomicActivity"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="EconomicActivityCode" type="{http://compartamos.com/common/gdt}ActivityCode" minOccurs="0"/&gt;
 *         &lt;element name="EconomicActivityDescription" type="{http://compartamos.com/common/gdt}LANGUAGEINDEPENDENT_MEDIUM_Description" minOccurs="0"/&gt;
 *         &lt;element name="TimeEconomicActivityCode" type="{http://gentera.com.mx/CRMMS/000/BusinessPartnerManage/INT-0334/v2.0}EconomicActivityCode" minOccurs="0"/&gt;
 *         &lt;element name="TimeEconomicActivityDescription" type="{http://compartamos.com/common/gdt}LANGUAGEINDEPENDENT_MEDIUM_Description" minOccurs="0"/&gt;
 *         &lt;element name="HowEconomicActivityCode" type="{http://gentera.com.mx/CRMMS/000/BusinessPartnerManage/INT-0334/v2.0}EconomicActivityCode" minOccurs="0"/&gt;
 *         &lt;element name="HowEconomicActivityDescription" type="{http://compartamos.com/common/gdt}LANGUAGEINDEPENDENT_MEDIUM_Description" minOccurs="0"/&gt;
 *         &lt;element name="IncomeContributionCode" type="{http://gentera.com.mx/CRMMS/000/BusinessPartnerManage/INT-0334/v2.0}EconomicActivityCode" minOccurs="0"/&gt;
 *         &lt;element name="IncomeContributionDescription" type="{http://compartamos.com/common/gdt}LANGUAGEINDEPENDENT_MEDIUM_Description" minOccurs="0"/&gt;
 *         &lt;element name="OtherIncomeCode" type="{http://gentera.com.mx/CRMMS/000/BusinessPartnerManage/INT-0334/v2.0}EconomicActivityCode" minOccurs="0"/&gt;
 *         &lt;element name="OtherIncomeDescription" type="{http://compartamos.com/common/gdt}LANGUAGEINDEPENDENT_MEDIUM_Description" minOccurs="0"/&gt;
 *         &lt;element name="TimeBusinessCode" type="{http://gentera.com.mx/CRMMS/000/BusinessPartnerManage/INT-0334/v2.0}EconomicActivityCode" minOccurs="0"/&gt;
 *         &lt;element name="TimeBusinessDescription" type="{http://compartamos.com/common/gdt}LANGUAGEINDEPENDENT_MEDIUM_Description" minOccurs="0"/&gt;
 *         &lt;element name="BusinessName" type="{http://compartamos.com/common/gdt}LANGUAGEINDEPENDENT_MEDIUM_Name" minOccurs="0"/&gt;
 *         &lt;element name="LocalTypeCode" type="{http://gentera.com.mx/CRMMS/000/BusinessPartnerManage/INT-0334/v2.0}EconomicActivityCode" minOccurs="0"/&gt;
 *         &lt;element name="LocalTypeDescription" type="{http://compartamos.com/common/gdt}LANGUAGEINDEPENDENT_MEDIUM_Description" minOccurs="0"/&gt;
 *         &lt;element name="LocalIsCode" type="{http://gentera.com.mx/CRMMS/000/BusinessPartnerManage/INT-0334/v2.0}EconomicActivityCode" minOccurs="0"/&gt;
 *         &lt;element name="LocalIsDescription" type="{http://compartamos.com/common/gdt}LANGUAGEINDEPENDENT_MEDIUM_Description" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "EconomicActivity", propOrder = {
    "economicActivityCode",
    "economicActivityDescription",
    "timeEconomicActivityCode",
    "timeEconomicActivityDescription",
    "howEconomicActivityCode",
    "howEconomicActivityDescription",
    "incomeContributionCode",
    "incomeContributionDescription",
    "otherIncomeCode",
    "otherIncomeDescription",
    "timeBusinessCode",
    "timeBusinessDescription",
    "businessName",
    "localTypeCode",
    "localTypeDescription",
    "localIsCode",
    "localIsDescription"
})
public class EconomicActivity {

    @XmlElement(name = "EconomicActivityCode")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String economicActivityCode;
    @XmlElement(name = "EconomicActivityDescription")
    protected String economicActivityDescription;
    @XmlElement(name = "TimeEconomicActivityCode")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String timeEconomicActivityCode;
    @XmlElement(name = "TimeEconomicActivityDescription")
    protected String timeEconomicActivityDescription;
    @XmlElement(name = "HowEconomicActivityCode")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String howEconomicActivityCode;
    @XmlElement(name = "HowEconomicActivityDescription")
    protected String howEconomicActivityDescription;
    @XmlElement(name = "IncomeContributionCode")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String incomeContributionCode;
    @XmlElement(name = "IncomeContributionDescription")
    protected String incomeContributionDescription;
    @XmlElement(name = "OtherIncomeCode")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String otherIncomeCode;
    @XmlElement(name = "OtherIncomeDescription")
    protected String otherIncomeDescription;
    @XmlElement(name = "TimeBusinessCode")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String timeBusinessCode;
    @XmlElement(name = "TimeBusinessDescription")
    protected String timeBusinessDescription;
    @XmlElement(name = "BusinessName")
    protected String businessName;
    @XmlElement(name = "LocalTypeCode")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String localTypeCode;
    @XmlElement(name = "LocalTypeDescription")
    protected String localTypeDescription;
    @XmlElement(name = "LocalIsCode")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String localIsCode;
    @XmlElement(name = "LocalIsDescription")
    protected String localIsDescription;

    /**
     * Obtiene el valor de la propiedad economicActivityCode.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEconomicActivityCode() {
        return economicActivityCode;
    }

    /**
     * Define el valor de la propiedad economicActivityCode.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEconomicActivityCode(String value) {
        this.economicActivityCode = value;
    }

    /**
     * Obtiene el valor de la propiedad economicActivityDescription.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEconomicActivityDescription() {
        return economicActivityDescription;
    }

    /**
     * Define el valor de la propiedad economicActivityDescription.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEconomicActivityDescription(String value) {
        this.economicActivityDescription = value;
    }

    /**
     * Obtiene el valor de la propiedad timeEconomicActivityCode.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTimeEconomicActivityCode() {
        return timeEconomicActivityCode;
    }

    /**
     * Define el valor de la propiedad timeEconomicActivityCode.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTimeEconomicActivityCode(String value) {
        this.timeEconomicActivityCode = value;
    }

    /**
     * Obtiene el valor de la propiedad timeEconomicActivityDescription.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTimeEconomicActivityDescription() {
        return timeEconomicActivityDescription;
    }

    /**
     * Define el valor de la propiedad timeEconomicActivityDescription.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTimeEconomicActivityDescription(String value) {
        this.timeEconomicActivityDescription = value;
    }

    /**
     * Obtiene el valor de la propiedad howEconomicActivityCode.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHowEconomicActivityCode() {
        return howEconomicActivityCode;
    }

    /**
     * Define el valor de la propiedad howEconomicActivityCode.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHowEconomicActivityCode(String value) {
        this.howEconomicActivityCode = value;
    }

    /**
     * Obtiene el valor de la propiedad howEconomicActivityDescription.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHowEconomicActivityDescription() {
        return howEconomicActivityDescription;
    }

    /**
     * Define el valor de la propiedad howEconomicActivityDescription.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHowEconomicActivityDescription(String value) {
        this.howEconomicActivityDescription = value;
    }

    /**
     * Obtiene el valor de la propiedad incomeContributionCode.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIncomeContributionCode() {
        return incomeContributionCode;
    }

    /**
     * Define el valor de la propiedad incomeContributionCode.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIncomeContributionCode(String value) {
        this.incomeContributionCode = value;
    }

    /**
     * Obtiene el valor de la propiedad incomeContributionDescription.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIncomeContributionDescription() {
        return incomeContributionDescription;
    }

    /**
     * Define el valor de la propiedad incomeContributionDescription.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIncomeContributionDescription(String value) {
        this.incomeContributionDescription = value;
    }

    /**
     * Obtiene el valor de la propiedad otherIncomeCode.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOtherIncomeCode() {
        return otherIncomeCode;
    }

    /**
     * Define el valor de la propiedad otherIncomeCode.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOtherIncomeCode(String value) {
        this.otherIncomeCode = value;
    }

    /**
     * Obtiene el valor de la propiedad otherIncomeDescription.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOtherIncomeDescription() {
        return otherIncomeDescription;
    }

    /**
     * Define el valor de la propiedad otherIncomeDescription.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOtherIncomeDescription(String value) {
        this.otherIncomeDescription = value;
    }

    /**
     * Obtiene el valor de la propiedad timeBusinessCode.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTimeBusinessCode() {
        return timeBusinessCode;
    }

    /**
     * Define el valor de la propiedad timeBusinessCode.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTimeBusinessCode(String value) {
        this.timeBusinessCode = value;
    }

    /**
     * Obtiene el valor de la propiedad timeBusinessDescription.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTimeBusinessDescription() {
        return timeBusinessDescription;
    }

    /**
     * Define el valor de la propiedad timeBusinessDescription.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTimeBusinessDescription(String value) {
        this.timeBusinessDescription = value;
    }

    /**
     * Obtiene el valor de la propiedad businessName.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBusinessName() {
        return businessName;
    }

    /**
     * Define el valor de la propiedad businessName.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBusinessName(String value) {
        this.businessName = value;
    }

    /**
     * Obtiene el valor de la propiedad localTypeCode.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLocalTypeCode() {
        return localTypeCode;
    }

    /**
     * Define el valor de la propiedad localTypeCode.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLocalTypeCode(String value) {
        this.localTypeCode = value;
    }

    /**
     * Obtiene el valor de la propiedad localTypeDescription.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLocalTypeDescription() {
        return localTypeDescription;
    }

    /**
     * Define el valor de la propiedad localTypeDescription.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLocalTypeDescription(String value) {
        this.localTypeDescription = value;
    }

    /**
     * Obtiene el valor de la propiedad localIsCode.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLocalIsCode() {
        return localIsCode;
    }

    /**
     * Define el valor de la propiedad localIsCode.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLocalIsCode(String value) {
        this.localIsCode = value;
    }

    /**
     * Obtiene el valor de la propiedad localIsDescription.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLocalIsDescription() {
        return localIsDescription;
    }

    /**
     * Define el valor de la propiedad localIsDescription.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLocalIsDescription(String value) {
        this.localIsDescription = value;
    }

}
