
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
 * <p>Clase Java para claimsDataType complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="claimsDataType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="consecutive" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="sinisterNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="sinisterCause" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="claimedCoverage" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="claimDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="sinesterStatus" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="clientId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="clientName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="medicalCertificate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="medicalName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Indicator" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="osName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="promoter" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="siniestralidad" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "claimsDataType", propOrder = {
    "consecutive",
    "sinisterNumber",
    "sinisterCause",
    "claimedCoverage",
    "claimDate",
    "sinesterStatus",
    "clientId",
    "clientName",
    "medicalCertificate",
    "medicalName",
    "indicator",
    "osName",
    "promoter",
    "siniestralidad"
})
public class ClaimsDataType {

    @XmlElement(type = String.class)
    @XmlJavaTypeAdapter(Adapter4 .class)
    @XmlSchemaType(name = "int")
    protected Integer consecutive;
    protected String sinisterNumber;
    protected String sinisterCause;
    protected String claimedCoverage;
    @XmlElement(type = String.class)
    @XmlJavaTypeAdapter(Adapter2 .class)
    @XmlSchemaType(name = "dateTime")
    protected Date claimDate;
    protected String sinesterStatus;
    protected String clientId;
    protected String clientName;
    protected String medicalCertificate;
    protected String medicalName;
    @XmlElement(name = "Indicator")
    protected String indicator;
    protected String osName;
    protected String promoter;
    protected String siniestralidad;

    /**
     * Obtiene el valor de la propiedad consecutive.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public Integer getConsecutive() {
        return consecutive;
    }

    /**
     * Define el valor de la propiedad consecutive.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setConsecutive(Integer value) {
        this.consecutive = value;
    }

    /**
     * Obtiene el valor de la propiedad sinisterNumber.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSinisterNumber() {
        return sinisterNumber;
    }

    /**
     * Define el valor de la propiedad sinisterNumber.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSinisterNumber(String value) {
        this.sinisterNumber = value;
    }

    /**
     * Obtiene el valor de la propiedad sinisterCause.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSinisterCause() {
        return sinisterCause;
    }

    /**
     * Define el valor de la propiedad sinisterCause.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSinisterCause(String value) {
        this.sinisterCause = value;
    }

    /**
     * Obtiene el valor de la propiedad claimedCoverage.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getClaimedCoverage() {
        return claimedCoverage;
    }

    /**
     * Define el valor de la propiedad claimedCoverage.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setClaimedCoverage(String value) {
        this.claimedCoverage = value;
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
     * Obtiene el valor de la propiedad sinesterStatus.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSinesterStatus() {
        return sinesterStatus;
    }

    /**
     * Define el valor de la propiedad sinesterStatus.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSinesterStatus(String value) {
        this.sinesterStatus = value;
    }

    /**
     * Obtiene el valor de la propiedad clientId.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getClientId() {
        return clientId;
    }

    /**
     * Define el valor de la propiedad clientId.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setClientId(String value) {
        this.clientId = value;
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
     * Obtiene el valor de la propiedad medicalCertificate.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMedicalCertificate() {
        return medicalCertificate;
    }

    /**
     * Define el valor de la propiedad medicalCertificate.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMedicalCertificate(String value) {
        this.medicalCertificate = value;
    }

    /**
     * Obtiene el valor de la propiedad medicalName.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMedicalName() {
        return medicalName;
    }

    /**
     * Define el valor de la propiedad medicalName.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMedicalName(String value) {
        this.medicalName = value;
    }

    /**
     * Obtiene el valor de la propiedad indicator.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIndicator() {
        return indicator;
    }

    /**
     * Define el valor de la propiedad indicator.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIndicator(String value) {
        this.indicator = value;
    }

    /**
     * Obtiene el valor de la propiedad osName.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOsName() {
        return osName;
    }

    /**
     * Define el valor de la propiedad osName.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOsName(String value) {
        this.osName = value;
    }

    /**
     * Obtiene el valor de la propiedad promoter.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPromoter() {
        return promoter;
    }

    /**
     * Define el valor de la propiedad promoter.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPromoter(String value) {
        this.promoter = value;
    }

    /**
     * Obtiene el valor de la propiedad siniestralidad.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSiniestralidad() {
        return siniestralidad;
    }

    /**
     * Define el valor de la propiedad siniestralidad.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSiniestralidad(String value) {
        this.siniestralidad = value;
    }

}
