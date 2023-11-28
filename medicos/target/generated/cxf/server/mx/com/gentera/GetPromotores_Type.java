
package mx.com.gentera;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para getPromotores complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="getPromotores"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="collaboratorID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="collaboratorName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
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
@XmlType(name = "getPromotores", propOrder = {
    "collaboratorID",
    "collaboratorName",
    "partnerID"
})
public class GetPromotores_Type {

    protected String collaboratorID;
    protected String collaboratorName;
    protected String partnerID;

    /**
     * Obtiene el valor de la propiedad collaboratorID.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCollaboratorID() {
        return collaboratorID;
    }

    /**
     * Define el valor de la propiedad collaboratorID.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCollaboratorID(String value) {
        this.collaboratorID = value;
    }

    /**
     * Obtiene el valor de la propiedad collaboratorName.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCollaboratorName() {
        return collaboratorName;
    }

    /**
     * Define el valor de la propiedad collaboratorName.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCollaboratorName(String value) {
        this.collaboratorName = value;
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
