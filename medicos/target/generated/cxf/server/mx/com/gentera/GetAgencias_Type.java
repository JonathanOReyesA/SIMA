
package mx.com.gentera;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para getAgencias complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="getAgencias"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="certerCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="salesOfficeName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
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
@XmlType(name = "getAgencias", propOrder = {
    "certerCode",
    "salesOfficeName",
    "partnerID"
})
public class GetAgencias_Type {

    protected String certerCode;
    protected String salesOfficeName;
    protected String partnerID;

    /**
     * Obtiene el valor de la propiedad certerCode.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCerterCode() {
        return certerCode;
    }

    /**
     * Define el valor de la propiedad certerCode.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCerterCode(String value) {
        this.certerCode = value;
    }

    /**
     * Obtiene el valor de la propiedad salesOfficeName.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSalesOfficeName() {
        return salesOfficeName;
    }

    /**
     * Define el valor de la propiedad salesOfficeName.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSalesOfficeName(String value) {
        this.salesOfficeName = value;
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
