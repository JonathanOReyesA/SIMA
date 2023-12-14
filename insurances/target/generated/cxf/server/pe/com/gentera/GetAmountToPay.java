
package pe.com.gentera;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import org.w3._2001.xmlschema.Adapter1;


/**
 * <p>Clase Java para getAmountToPay complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="getAmountToPay"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="insuranceID" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="businessPartnerID" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="productID" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="coverageID" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="flagCoverage" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="claimDays" type="{http://www.w3.org/2001/XMLSchema}double"/&gt;
 *         &lt;element name="initialDate" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="endDate" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="partnerID" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="claimAmount" type="{http://www.w3.org/2001/XMLSchema}double"/&gt;
 *         &lt;element name="claimID" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="pAffected" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getAmountToPay", propOrder = {
    "insuranceID",
    "businessPartnerID",
    "productID",
    "coverageID",
    "flagCoverage",
    "claimDays",
    "initialDate",
    "endDate",
    "partnerID",
    "claimAmount",
    "claimID",
    "pAffected"
})
public class GetAmountToPay {

    @XmlElement(required = true)
    protected String insuranceID;
    @XmlElement(required = true)
    protected String businessPartnerID;
    @XmlElement(required = true)
    protected String productID;
    @XmlElement(required = true)
    protected String coverageID;
    @XmlElement(required = true)
    protected String flagCoverage;
    @XmlElement(required = true, type = String.class)
    @XmlJavaTypeAdapter(Adapter1 .class)
    @XmlSchemaType(name = "double")
    protected Double claimDays;
    @XmlElement(required = true)
    protected String initialDate;
    @XmlElement(required = true)
    protected String endDate;
    @XmlElement(required = true)
    protected String partnerID;
    @XmlElement(required = true, type = String.class)
    @XmlJavaTypeAdapter(Adapter1 .class)
    @XmlSchemaType(name = "double")
    protected Double claimAmount;
    @XmlElement(required = true)
    protected String claimID;
    @XmlElement(required = true)
    protected String pAffected;

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
     * Obtiene el valor de la propiedad initialDate.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInitialDate() {
        return initialDate;
    }

    /**
     * Define el valor de la propiedad initialDate.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInitialDate(String value) {
        this.initialDate = value;
    }

    /**
     * Obtiene el valor de la propiedad endDate.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEndDate() {
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
    public void setEndDate(String value) {
        this.endDate = value;
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
     * Obtiene el valor de la propiedad claimAmount.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public Double getClaimAmount() {
        return claimAmount;
    }

    /**
     * Define el valor de la propiedad claimAmount.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setClaimAmount(Double value) {
        this.claimAmount = value;
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
     * Obtiene el valor de la propiedad pAffected.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPAffected() {
        return pAffected;
    }

    /**
     * Define el valor de la propiedad pAffected.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPAffected(String value) {
        this.pAffected = value;
    }

}
