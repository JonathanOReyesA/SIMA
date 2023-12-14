
package pe.com.gentera;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para beneficiariesSearchResponse complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="beneficiariesSearchResponse"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="return" type="{http://gentera.com.pe/}beneficiariesSeachRespMsgDataTypePE" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "beneficiariesSearchResponse", propOrder = {
    "_return"
})
public class BeneficiariesSearchResponse {

    @XmlElement(name = "return")
    protected BeneficiariesSeachRespMsgDataTypePE _return;

    /**
     * Obtiene el valor de la propiedad return.
     * 
     * @return
     *     possible object is
     *     {@link BeneficiariesSeachRespMsgDataTypePE }
     *     
     */
    public BeneficiariesSeachRespMsgDataTypePE getReturn() {
        return _return;
    }

    /**
     * Define el valor de la propiedad return.
     * 
     * @param value
     *     allowed object is
     *     {@link BeneficiariesSeachRespMsgDataTypePE }
     *     
     */
    public void setReturn(BeneficiariesSeachRespMsgDataTypePE value) {
        this._return = value;
    }

}
