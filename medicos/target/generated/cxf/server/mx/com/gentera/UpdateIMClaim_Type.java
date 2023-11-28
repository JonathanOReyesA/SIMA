
package mx.com.gentera;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import org.w3._2001.xmlschema.Adapter4;


/**
 * <p>Clase Java para updateIMClaim complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="updateIMClaim"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="claimID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="idMedico" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
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
@XmlType(name = "updateIMClaim", propOrder = {
    "claimID",
    "idMedico",
    "partnerID"
})
public class UpdateIMClaim_Type {

    protected String claimID;
    @XmlElement(type = String.class)
    @XmlJavaTypeAdapter(Adapter4 .class)
    @XmlSchemaType(name = "int")
    protected Integer idMedico;
    protected String partnerID;

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
     * Obtiene el valor de la propiedad idMedico.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public Integer getIdMedico() {
        return idMedico;
    }

    /**
     * Define el valor de la propiedad idMedico.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIdMedico(Integer value) {
        this.idMedico = value;
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
