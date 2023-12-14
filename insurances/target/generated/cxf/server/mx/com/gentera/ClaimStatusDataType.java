
package mx.com.gentera;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para claimStatusDataType complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="claimStatusDataType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="claimStatusID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="claimStatusName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="claimStatusType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "claimStatusDataType", propOrder = {
    "claimStatusID",
    "claimStatusName",
    "claimStatusType"
})
public class ClaimStatusDataType {

    protected String claimStatusID;
    protected String claimStatusName;
    protected String claimStatusType;

    /**
     * Obtiene el valor de la propiedad claimStatusID.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getClaimStatusID() {
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
    public void setClaimStatusID(String value) {
        this.claimStatusID = value;
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
     * Obtiene el valor de la propiedad claimStatusType.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getClaimStatusType() {
        return claimStatusType;
    }

    /**
     * Define el valor de la propiedad claimStatusType.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setClaimStatusType(String value) {
        this.claimStatusType = value;
    }

}
