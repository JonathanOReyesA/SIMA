
package mx.com.gentera;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para insuranceBusinessPartnerData complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="insuranceBusinessPartnerData"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="amount" type="{http://gentera.com.mx/}amount" minOccurs="0"/&gt;
 *         &lt;element name="identifyingElements" type="{http://gentera.com.mx/}insuranceBusinessPartnerIdfgElmnts" minOccurs="0"/&gt;
 *         &lt;element name="nameData" type="{http://gentera.com.mx/}acctOriginationBusinessPartnerNameV1" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "insuranceBusinessPartnerData", propOrder = {
    "amount",
    "identifyingElements",
    "nameData"
})
public class InsuranceBusinessPartnerData {

    protected Amount amount;
    protected InsuranceBusinessPartnerIdfgElmnts identifyingElements;
    protected AcctOriginationBusinessPartnerNameV1 nameData;

    /**
     * Obtiene el valor de la propiedad amount.
     * 
     * @return
     *     possible object is
     *     {@link Amount }
     *     
     */
    public Amount getAmount() {
        return amount;
    }

    /**
     * Define el valor de la propiedad amount.
     * 
     * @param value
     *     allowed object is
     *     {@link Amount }
     *     
     */
    public void setAmount(Amount value) {
        this.amount = value;
    }

    /**
     * Obtiene el valor de la propiedad identifyingElements.
     * 
     * @return
     *     possible object is
     *     {@link InsuranceBusinessPartnerIdfgElmnts }
     *     
     */
    public InsuranceBusinessPartnerIdfgElmnts getIdentifyingElements() {
        return identifyingElements;
    }

    /**
     * Define el valor de la propiedad identifyingElements.
     * 
     * @param value
     *     allowed object is
     *     {@link InsuranceBusinessPartnerIdfgElmnts }
     *     
     */
    public void setIdentifyingElements(InsuranceBusinessPartnerIdfgElmnts value) {
        this.identifyingElements = value;
    }

    /**
     * Obtiene el valor de la propiedad nameData.
     * 
     * @return
     *     possible object is
     *     {@link AcctOriginationBusinessPartnerNameV1 }
     *     
     */
    public AcctOriginationBusinessPartnerNameV1 getNameData() {
        return nameData;
    }

    /**
     * Define el valor de la propiedad nameData.
     * 
     * @param value
     *     allowed object is
     *     {@link AcctOriginationBusinessPartnerNameV1 }
     *     
     */
    public void setNameData(AcctOriginationBusinessPartnerNameV1 value) {
        this.nameData = value;
    }

}
