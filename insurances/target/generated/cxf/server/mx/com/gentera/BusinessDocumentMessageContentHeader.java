
package mx.com.gentera;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para businessDocumentMessageContentHeader complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="businessDocumentMessageContentHeader"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="identificationParty" type="{http://gentera.com.mx/}businessDocumentMessageContentHeaderIdentintificationParty" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "businessDocumentMessageContentHeader", propOrder = {
    "identificationParty"
})
public class BusinessDocumentMessageContentHeader {

    protected BusinessDocumentMessageContentHeaderIdentintificationParty identificationParty;

    /**
     * Obtiene el valor de la propiedad identificationParty.
     * 
     * @return
     *     possible object is
     *     {@link BusinessDocumentMessageContentHeaderIdentintificationParty }
     *     
     */
    public BusinessDocumentMessageContentHeaderIdentintificationParty getIdentificationParty() {
        return identificationParty;
    }

    /**
     * Define el valor de la propiedad identificationParty.
     * 
     * @param value
     *     allowed object is
     *     {@link BusinessDocumentMessageContentHeaderIdentintificationParty }
     *     
     */
    public void setIdentificationParty(BusinessDocumentMessageContentHeaderIdentintificationParty value) {
        this.identificationParty = value;
    }

}
