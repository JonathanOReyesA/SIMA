
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


/**
 * <p>Clase Java para claimPayment complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="claimPayment"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="claimID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="odp" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="paymentDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="paymentAmount" type="{http://www.w3.org/2001/XMLSchema}double"/&gt;
 *         &lt;element name="claimPaymentDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="claimPaymentFileName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="paidDays" type="{http://www.w3.org/2001/XMLSchema}double"/&gt;
 *         &lt;element name="externalInsuranceID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "claimPayment", propOrder = {
    "claimID",
    "odp",
    "paymentDate",
    "paymentAmount",
    "claimPaymentDate",
    "claimPaymentFileName",
    "paidDays",
    "externalInsuranceID"
})
public class ClaimPayment_Type {

    protected String claimID;
    protected String odp;
    protected String paymentDate;
    @XmlElement(required = true, type = String.class)
    @XmlJavaTypeAdapter(Adapter1 .class)
    @XmlSchemaType(name = "double")
    protected Double paymentAmount;
    @XmlElement(type = String.class)
    @XmlJavaTypeAdapter(Adapter2 .class)
    @XmlSchemaType(name = "dateTime")
    protected Date claimPaymentDate;
    protected String claimPaymentFileName;
    @XmlElement(required = true, type = String.class)
    @XmlJavaTypeAdapter(Adapter1 .class)
    @XmlSchemaType(name = "double")
    protected Double paidDays;
    protected String externalInsuranceID;

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
     * Obtiene el valor de la propiedad odp.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOdp() {
        return odp;
    }

    /**
     * Define el valor de la propiedad odp.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOdp(String value) {
        this.odp = value;
    }

    /**
     * Obtiene el valor de la propiedad paymentDate.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPaymentDate() {
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
    public void setPaymentDate(String value) {
        this.paymentDate = value;
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
     * Obtiene el valor de la propiedad claimPaymentDate.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public Date getClaimPaymentDate() {
        return claimPaymentDate;
    }

    /**
     * Define el valor de la propiedad claimPaymentDate.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setClaimPaymentDate(Date value) {
        this.claimPaymentDate = value;
    }

    /**
     * Obtiene el valor de la propiedad claimPaymentFileName.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getClaimPaymentFileName() {
        return claimPaymentFileName;
    }

    /**
     * Define el valor de la propiedad claimPaymentFileName.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setClaimPaymentFileName(String value) {
        this.claimPaymentFileName = value;
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
     * Obtiene el valor de la propiedad externalInsuranceID.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExternalInsuranceID() {
        return externalInsuranceID;
    }

    /**
     * Define el valor de la propiedad externalInsuranceID.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExternalInsuranceID(String value) {
        this.externalInsuranceID = value;
    }

}
