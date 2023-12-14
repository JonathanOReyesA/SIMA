
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
 * <p>Clase Java para claimInsuranceDetailDataTypePNE complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="claimInsuranceDetailDataTypePNE"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="beneficiaryAddress" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="beneficiaryName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="beneficiaryPhone" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="businessPartnerID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="certificateNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="claimID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="daysToPay" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="externalClaimID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="flag" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="instanceClaimID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="insuredName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="maritalStatus" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="marriedFamilyName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="message" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="paymentAmount" type="{http://www.w3.org/2001/XMLSchema}double"/&gt;
 *         &lt;element name="paymentDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="paymentOrder" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="policyID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="status" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
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
@XmlType(name = "claimInsuranceDetailDataTypePNE", propOrder = {
    "beneficiaryAddress",
    "beneficiaryName",
    "beneficiaryPhone",
    "businessPartnerID",
    "certificateNumber",
    "claimID",
    "daysToPay",
    "externalClaimID",
    "flag",
    "instanceClaimID",
    "insuredName",
    "maritalStatus",
    "marriedFamilyName",
    "message",
    "paymentAmount",
    "paymentDate",
    "paymentOrder",
    "policyID",
    "status",
    "zone"
})
public class ClaimInsuranceDetailDataTypePNE {

    protected String beneficiaryAddress;
    protected String beneficiaryName;
    protected String beneficiaryPhone;
    protected String businessPartnerID;
    protected String certificateNumber;
    protected String claimID;
    @XmlElement(required = true, type = String.class)
    @XmlJavaTypeAdapter(Adapter4 .class)
    @XmlSchemaType(name = "int")
    protected Integer daysToPay;
    protected String externalClaimID;
    protected String flag;
    protected String instanceClaimID;
    protected String insuredName;
    protected String maritalStatus;
    protected String marriedFamilyName;
    protected String message;
    @XmlElement(required = true, type = String.class)
    @XmlJavaTypeAdapter(Adapter1 .class)
    @XmlSchemaType(name = "double")
    protected Double paymentAmount;
    @XmlElement(type = String.class)
    @XmlJavaTypeAdapter(Adapter2 .class)
    @XmlSchemaType(name = "dateTime")
    protected Date paymentDate;
    protected String paymentOrder;
    protected String policyID;
    protected String status;
    protected String zone;

    /**
     * Obtiene el valor de la propiedad beneficiaryAddress.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBeneficiaryAddress() {
        return beneficiaryAddress;
    }

    /**
     * Define el valor de la propiedad beneficiaryAddress.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBeneficiaryAddress(String value) {
        this.beneficiaryAddress = value;
    }

    /**
     * Obtiene el valor de la propiedad beneficiaryName.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBeneficiaryName() {
        return beneficiaryName;
    }

    /**
     * Define el valor de la propiedad beneficiaryName.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBeneficiaryName(String value) {
        this.beneficiaryName = value;
    }

    /**
     * Obtiene el valor de la propiedad beneficiaryPhone.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBeneficiaryPhone() {
        return beneficiaryPhone;
    }

    /**
     * Define el valor de la propiedad beneficiaryPhone.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBeneficiaryPhone(String value) {
        this.beneficiaryPhone = value;
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
     * Obtiene el valor de la propiedad certificateNumber.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCertificateNumber() {
        return certificateNumber;
    }

    /**
     * Define el valor de la propiedad certificateNumber.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCertificateNumber(String value) {
        this.certificateNumber = value;
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
     * Obtiene el valor de la propiedad daysToPay.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public Integer getDaysToPay() {
        return daysToPay;
    }

    /**
     * Define el valor de la propiedad daysToPay.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDaysToPay(Integer value) {
        this.daysToPay = value;
    }

    /**
     * Obtiene el valor de la propiedad externalClaimID.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExternalClaimID() {
        return externalClaimID;
    }

    /**
     * Define el valor de la propiedad externalClaimID.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExternalClaimID(String value) {
        this.externalClaimID = value;
    }

    /**
     * Obtiene el valor de la propiedad flag.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFlag() {
        return flag;
    }

    /**
     * Define el valor de la propiedad flag.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFlag(String value) {
        this.flag = value;
    }

    /**
     * Obtiene el valor de la propiedad instanceClaimID.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInstanceClaimID() {
        return instanceClaimID;
    }

    /**
     * Define el valor de la propiedad instanceClaimID.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInstanceClaimID(String value) {
        this.instanceClaimID = value;
    }

    /**
     * Obtiene el valor de la propiedad insuredName.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInsuredName() {
        return insuredName;
    }

    /**
     * Define el valor de la propiedad insuredName.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInsuredName(String value) {
        this.insuredName = value;
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
     * Obtiene el valor de la propiedad message.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMessage() {
        return message;
    }

    /**
     * Define el valor de la propiedad message.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMessage(String value) {
        this.message = value;
    }

    /**
     * Obtiene el valor de la propiedad paymentAmount.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public Double getPaymentAmount() {
        return paymentAmount;
    }

    /**
     * Define el valor de la propiedad paymentAmount.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPaymentAmount(Double value) {
        this.paymentAmount = value;
    }

    /**
     * Obtiene el valor de la propiedad paymentDate.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public Date getPaymentDate() {
        return paymentDate;
    }

    /**
     * Define el valor de la propiedad paymentDate.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPaymentDate(Date value) {
        this.paymentDate = value;
    }

    /**
     * Obtiene el valor de la propiedad paymentOrder.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPaymentOrder() {
        return paymentOrder;
    }

    /**
     * Define el valor de la propiedad paymentOrder.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPaymentOrder(String value) {
        this.paymentOrder = value;
    }

    /**
     * Obtiene el valor de la propiedad policyID.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPolicyID() {
        return policyID;
    }

    /**
     * Define el valor de la propiedad policyID.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPolicyID(String value) {
        this.policyID = value;
    }

    /**
     * Obtiene el valor de la propiedad status.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStatus() {
        return status;
    }

    /**
     * Define el valor de la propiedad status.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStatus(String value) {
        this.status = value;
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
