
package mx.com.gentera;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para claimRejection complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="claimRejection"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="claimID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="claimRejectionTypeID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="rejectionAmount" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="rejectionDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="rejectionDocumentName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "claimRejection", propOrder = {
    "claimID",
    "claimRejectionTypeID",
    "rejectionAmount",
    "rejectionDate",
    "rejectionDocumentName"
})
public class ClaimRejection_Type {

    protected String claimID;
    protected String claimRejectionTypeID;
    protected String rejectionAmount;
    protected String rejectionDate;
    protected String rejectionDocumentName;

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
     * Obtiene el valor de la propiedad claimRejectionTypeID.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getClaimRejectionTypeID() {
        return claimRejectionTypeID;
    }

    /**
     * Define el valor de la propiedad claimRejectionTypeID.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setClaimRejectionTypeID(String value) {
        this.claimRejectionTypeID = value;
    }

    /**
     * Obtiene el valor de la propiedad rejectionAmount.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRejectionAmount() {
        return rejectionAmount;
    }

    /**
     * Define el valor de la propiedad rejectionAmount.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRejectionAmount(String value) {
        this.rejectionAmount = value;
    }

    /**
     * Obtiene el valor de la propiedad rejectionDate.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRejectionDate() {
        return rejectionDate;
    }

    /**
     * Define el valor de la propiedad rejectionDate.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRejectionDate(String value) {
        this.rejectionDate = value;
    }

    /**
     * Obtiene el valor de la propiedad rejectionDocumentName.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRejectionDocumentName() {
        return rejectionDocumentName;
    }

    /**
     * Define el valor de la propiedad rejectionDocumentName.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRejectionDocumentName(String value) {
        this.rejectionDocumentName = value;
    }

}
