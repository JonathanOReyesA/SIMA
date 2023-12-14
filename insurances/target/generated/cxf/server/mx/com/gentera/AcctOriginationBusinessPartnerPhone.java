
package mx.com.gentera;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para acctOriginationBusinessPartnerPhone complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="acctOriginationBusinessPartnerPhone"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="comments" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="phoneNumber" type="{http://gentera.com.mx/}phoneNumberV1" minOccurs="0"/&gt;
 *         &lt;element name="phoneTypeID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "acctOriginationBusinessPartnerPhone", propOrder = {
    "comments",
    "phoneNumber",
    "phoneTypeID"
})
public class AcctOriginationBusinessPartnerPhone {

    protected String comments;
    protected PhoneNumberV1 phoneNumber;
    protected String phoneTypeID;

    /**
     * Obtiene el valor de la propiedad comments.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getComments() {
        return comments;
    }

    /**
     * Define el valor de la propiedad comments.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setComments(String value) {
        this.comments = value;
    }

    /**
     * Obtiene el valor de la propiedad phoneNumber.
     * 
     * @return
     *     possible object is
     *     {@link PhoneNumberV1 }
     *     
     */
    public PhoneNumberV1 getPhoneNumber() {
        return phoneNumber;
    }

    /**
     * Define el valor de la propiedad phoneNumber.
     * 
     * @param value
     *     allowed object is
     *     {@link PhoneNumberV1 }
     *     
     */
    public void setPhoneNumber(PhoneNumberV1 value) {
        this.phoneNumber = value;
    }

    /**
     * Obtiene el valor de la propiedad phoneTypeID.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPhoneTypeID() {
        return phoneTypeID;
    }

    /**
     * Define el valor de la propiedad phoneTypeID.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPhoneTypeID(String value) {
        this.phoneTypeID = value;
    }

}
