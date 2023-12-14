
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
 * <p>Clase Java para claimStatusUpdate complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="claimStatusUpdate"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="claimID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="claimStatusID" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="claimStatusDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="claimStatusUser" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="contactEmail" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="claimIdentifier" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="clientName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="affectedName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="lastStatus" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="lastStatusDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="lastStatusComment" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="paymentType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "claimStatusUpdate", propOrder = {
    "claimID",
    "claimStatusID",
    "claimStatusDate",
    "claimStatusUser",
    "contactEmail",
    "claimIdentifier",
    "clientName",
    "affectedName",
    "lastStatus",
    "lastStatusDate",
    "lastStatusComment",
    "paymentType"
})
public class ClaimStatusUpdate {

    protected String claimID;
    @XmlElement(required = true, type = String.class)
    @XmlJavaTypeAdapter(Adapter4 .class)
    @XmlSchemaType(name = "int")
    protected Integer claimStatusID;
    @XmlElement(type = String.class)
    @XmlJavaTypeAdapter(Adapter2 .class)
    @XmlSchemaType(name = "dateTime")
    protected Date claimStatusDate;
    protected String claimStatusUser;
    protected String contactEmail;
    protected String claimIdentifier;
    protected String clientName;
    protected String affectedName;
    protected String lastStatus;
    protected String lastStatusDate;
    protected String lastStatusComment;
    protected String paymentType;

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
     * Obtiene el valor de la propiedad claimStatusID.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public Integer getClaimStatusID() {
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
    public void setClaimStatusID(Integer value) {
        this.claimStatusID = value;
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
     * Obtiene el valor de la propiedad claimStatusUser.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getClaimStatusUser() {
        return claimStatusUser;
    }

    /**
     * Define el valor de la propiedad claimStatusUser.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setClaimStatusUser(String value) {
        this.claimStatusUser = value;
    }

    /**
     * Obtiene el valor de la propiedad contactEmail.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getContactEmail() {
        return contactEmail;
    }

    /**
     * Define el valor de la propiedad contactEmail.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setContactEmail(String value) {
        this.contactEmail = value;
    }

    /**
     * Obtiene el valor de la propiedad claimIdentifier.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getClaimIdentifier() {
        return claimIdentifier;
    }

    /**
     * Define el valor de la propiedad claimIdentifier.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setClaimIdentifier(String value) {
        this.claimIdentifier = value;
    }

    /**
     * Obtiene el valor de la propiedad clientName.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getClientName() {
        return clientName;
    }

    /**
     * Define el valor de la propiedad clientName.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setClientName(String value) {
        this.clientName = value;
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
     * Obtiene el valor de la propiedad lastStatus.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLastStatus() {
        return lastStatus;
    }

    /**
     * Define el valor de la propiedad lastStatus.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLastStatus(String value) {
        this.lastStatus = value;
    }

    /**
     * Obtiene el valor de la propiedad lastStatusDate.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLastStatusDate() {
        return lastStatusDate;
    }

    /**
     * Define el valor de la propiedad lastStatusDate.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLastStatusDate(String value) {
        this.lastStatusDate = value;
    }

    /**
     * Obtiene el valor de la propiedad lastStatusComment.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLastStatusComment() {
        return lastStatusComment;
    }

    /**
     * Define el valor de la propiedad lastStatusComment.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLastStatusComment(String value) {
        this.lastStatusComment = value;
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

}
