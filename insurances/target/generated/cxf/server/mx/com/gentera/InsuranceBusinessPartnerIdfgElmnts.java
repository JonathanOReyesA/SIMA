
package mx.com.gentera;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para insuranceBusinessPartnerIdfgElmnts complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="insuranceBusinessPartnerIdfgElmnts"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="partyID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="partyTypeCode" type="{http://gentera.com.mx/}partyIdentifierTypeCodeExt" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "insuranceBusinessPartnerIdfgElmnts", propOrder = {
    "partyID",
    "partyTypeCode"
})
public class InsuranceBusinessPartnerIdfgElmnts {

    protected String partyID;
    protected PartyIdentifierTypeCodeExt partyTypeCode;

    /**
     * Obtiene el valor de la propiedad partyID.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPartyID() {
        return partyID;
    }

    /**
     * Define el valor de la propiedad partyID.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPartyID(String value) {
        this.partyID = value;
    }

    /**
     * Obtiene el valor de la propiedad partyTypeCode.
     * 
     * @return
     *     possible object is
     *     {@link PartyIdentifierTypeCodeExt }
     *     
     */
    public PartyIdentifierTypeCodeExt getPartyTypeCode() {
        return partyTypeCode;
    }

    /**
     * Define el valor de la propiedad partyTypeCode.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyIdentifierTypeCodeExt }
     *     
     */
    public void setPartyTypeCode(PartyIdentifierTypeCodeExt value) {
        this.partyTypeCode = value;
    }

}
