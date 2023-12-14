
package mx.com.gentera;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para manualPaymentValidation complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="manualPaymentValidation"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="externalClaimID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="odp" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="partnerID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "manualPaymentValidation", propOrder = {
    "externalClaimID",
    "odp",
    "partnerID"
})
public class ManualPaymentValidation_Type {

    protected String externalClaimID;
    protected String odp;
    protected String partnerID;

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

}
