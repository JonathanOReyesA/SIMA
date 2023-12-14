
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
 * <p>Clase Java para serviceSearchRspDataType complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="serviceSearchRspDataType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="certificate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="claimDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="claimID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="claimStatusName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="coverageName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="description" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="productName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="productQuote" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="serviceCost" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="serviceName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="serviceUser" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="serviceUserID" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/&gt;
 *         &lt;element name="titularName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "serviceSearchRspDataType", propOrder = {
    "certificate",
    "claimDate",
    "claimID",
    "claimStatusName",
    "coverageName",
    "description",
    "productName",
    "productQuote",
    "serviceCost",
    "serviceName",
    "serviceUser",
    "serviceUserID",
    "titularName"
})
public class ServiceSearchRspDataType {

    protected String certificate;
    @XmlElement(type = String.class)
    @XmlJavaTypeAdapter(Adapter2 .class)
    @XmlSchemaType(name = "dateTime")
    protected Date claimDate;
    protected String claimID;
    protected String claimStatusName;
    protected String coverageName;
    protected String description;
    protected String productName;
    protected BigDecimal productQuote;
    protected BigDecimal serviceCost;
    protected String serviceName;
    protected String serviceUser;
    protected BigDecimal serviceUserID;
    protected String titularName;

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
     * Obtiene el valor de la propiedad description.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescription() {
        return description;
    }

    /**
     * Define el valor de la propiedad description.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescription(String value) {
        this.description = value;
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
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getProductQuote() {
        return productQuote;
    }

    /**
     * Define el valor de la propiedad productQuote.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setProductQuote(BigDecimal value) {
        this.productQuote = value;
    }

    /**
     * Obtiene el valor de la propiedad serviceCost.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getServiceCost() {
        return serviceCost;
    }

    /**
     * Define el valor de la propiedad serviceCost.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setServiceCost(BigDecimal value) {
        this.serviceCost = value;
    }

    /**
     * Obtiene el valor de la propiedad serviceName.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getServiceName() {
        return serviceName;
    }

    /**
     * Define el valor de la propiedad serviceName.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setServiceName(String value) {
        this.serviceName = value;
    }

    /**
     * Obtiene el valor de la propiedad serviceUser.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getServiceUser() {
        return serviceUser;
    }

    /**
     * Define el valor de la propiedad serviceUser.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setServiceUser(String value) {
        this.serviceUser = value;
    }

    /**
     * Obtiene el valor de la propiedad serviceUserID.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getServiceUserID() {
        return serviceUserID;
    }

    /**
     * Define el valor de la propiedad serviceUserID.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setServiceUserID(BigDecimal value) {
        this.serviceUserID = value;
    }

    /**
     * Obtiene el valor de la propiedad titularName.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTitularName() {
        return titularName;
    }

    /**
     * Define el valor de la propiedad titularName.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTitularName(String value) {
        this.titularName = value;
    }

}
