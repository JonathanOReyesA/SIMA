
package mx.com.gentera;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para getDoctors complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="getDoctors"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="identificationCard" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="nameDoctor" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
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
@XmlType(name = "getDoctors", propOrder = {
    "identificationCard",
    "nameDoctor",
    "partnerID"
})
public class GetDoctors {

    protected String identificationCard;
    protected String nameDoctor;
    protected String partnerID;

    /**
     * Obtiene el valor de la propiedad identificationCard.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIdentificationCard() {
        return identificationCard;
    }

    /**
     * Define el valor de la propiedad identificationCard.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIdentificationCard(String value) {
        this.identificationCard = value;
    }

    /**
     * Obtiene el valor de la propiedad nameDoctor.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNameDoctor() {
        return nameDoctor;
    }

    /**
     * Define el valor de la propiedad nameDoctor.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNameDoctor(String value) {
        this.nameDoctor = value;
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
