
package mx.com.gentera;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para getBlackList complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="getBlackList"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="blackKey" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
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
@XmlType(name = "getBlackList", propOrder = {
    "blackKey",
    "partnerID"
})
public class GetBlackList {

    protected String blackKey;
    protected String partnerID;

    /**
     * Obtiene el valor de la propiedad blackKey.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBlackKey() {
        return blackKey;
    }

    /**
     * Define el valor de la propiedad blackKey.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBlackKey(String value) {
        this.blackKey = value;
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
