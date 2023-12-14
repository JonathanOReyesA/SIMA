
package mx.com.gentera;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para businessDocumentMessageHeaderPartyContactPerson complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="businessDocumentMessageHeaderPartyContactPerson"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="internalID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "businessDocumentMessageHeaderPartyContactPerson", propOrder = {
    "internalID"
})
public class BusinessDocumentMessageHeaderPartyContactPerson {

    protected String internalID;

    /**
     * Obtiene el valor de la propiedad internalID.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInternalID() {
        return internalID;
    }

    /**
     * Define el valor de la propiedad internalID.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInternalID(String value) {
        this.internalID = value;
    }

}
