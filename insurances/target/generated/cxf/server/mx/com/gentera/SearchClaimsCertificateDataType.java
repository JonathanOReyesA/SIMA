
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
 * <p>Clase Java para searchClaimsCertificateDataType complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="searchClaimsCertificateDataType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="affectedName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="certificate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="claimDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="claimID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="claimStatusName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="coverageName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="modeName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="productName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="productQuote" type="{http://www.w3.org/2001/XMLSchema}double"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "searchClaimsCertificateDataType", propOrder = {
    "affectedName",
    "certificate",
    "claimDate",
    "claimID",
    "claimStatusName",
    "coverageName",
    "modeName",
    "productName",
    "productQuote"
})
public class SearchClaimsCertificateDataType {

    protected String affectedName;
    protected String certificate;
    @XmlElement(type = String.class)
    @XmlJavaTypeAdapter(Adapter2 .class)
    @XmlSchemaType(name = "dateTime")
    protected Date claimDate;
    protected String claimID;
    protected String claimStatusName;
    protected String coverageName;
    protected String modeName;
    protected String productName;
    @XmlElement(required = true, type = String.class)
    @XmlJavaTypeAdapter(Adapter1 .class)
    @XmlSchemaType(name = "double")
    protected Double productQuote;

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
     * Obtiene el valor de la propiedad productQuote.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public Double getProductQuote() {
        return productQuote;
    }

    /**
     * Define el valor de la propiedad productQuote.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProductQuote(Double value) {
        this.productQuote = value;
    }

}
