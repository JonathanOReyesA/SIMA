
package mx.com.gentera;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para businessDocumentMessageHeaderParty complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="businessDocumentMessageHeaderParty"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="contactPerson" type="{http://gentera.com.mx/}businessDocumentMessageHeaderPartyContactPerson" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "businessDocumentMessageHeaderParty", propOrder = {
    "contactPerson"
})
public class BusinessDocumentMessageHeaderParty {

    protected BusinessDocumentMessageHeaderPartyContactPerson contactPerson;

    /**
     * Obtiene el valor de la propiedad contactPerson.
     * 
     * @return
     *     possible object is
     *     {@link BusinessDocumentMessageHeaderPartyContactPerson }
     *     
     */
    public BusinessDocumentMessageHeaderPartyContactPerson getContactPerson() {
        return contactPerson;
    }

    /**
     * Define el valor de la propiedad contactPerson.
     * 
     * @param value
     *     allowed object is
     *     {@link BusinessDocumentMessageHeaderPartyContactPerson }
     *     
     */
    public void setContactPerson(BusinessDocumentMessageHeaderPartyContactPerson value) {
        this.contactPerson = value;
    }

}
