
package pe.com.gentera;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import org.w3._2001.xmlschema.Adapter1;


/**
 * <p>Clase Java para amountToPayQueryRespMsgDataType complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="amountToPayQueryRespMsgDataType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="calcDays" type="{http://www.w3.org/2001/XMLSchema}double"/&gt;
 *         &lt;element name="code" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="message" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="remaining" type="{http://www.w3.org/2001/XMLSchema}double"/&gt;
 *         &lt;element name="returnValue" type="{http://www.w3.org/2001/XMLSchema}double"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "amountToPayQueryRespMsgDataType", propOrder = {
    "calcDays",
    "code",
    "message",
    "remaining",
    "returnValue"
})
public class AmountToPayQueryRespMsgDataType {

    @XmlElement(required = true, type = String.class)
    @XmlJavaTypeAdapter(Adapter1 .class)
    @XmlSchemaType(name = "double")
    protected Double calcDays;
    @XmlElement(required = true)
    protected String code;
    @XmlElement(required = true)
    protected String message;
    @XmlElement(required = true, type = String.class)
    @XmlJavaTypeAdapter(Adapter1 .class)
    @XmlSchemaType(name = "double")
    protected Double remaining;
    @XmlElement(required = true, type = String.class)
    @XmlJavaTypeAdapter(Adapter1 .class)
    @XmlSchemaType(name = "double")
    protected Double returnValue;

    /**
     * Obtiene el valor de la propiedad calcDays.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public Double getCalcDays() {
        return calcDays;
    }

    /**
     * Define el valor de la propiedad calcDays.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCalcDays(Double value) {
        this.calcDays = value;
    }

    /**
     * Obtiene el valor de la propiedad code.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCode() {
        return code;
    }

    /**
     * Define el valor de la propiedad code.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCode(String value) {
        this.code = value;
    }

    /**
     * Obtiene el valor de la propiedad message.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMessage() {
        return message;
    }

    /**
     * Define el valor de la propiedad message.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMessage(String value) {
        this.message = value;
    }

    /**
     * Obtiene el valor de la propiedad remaining.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public Double getRemaining() {
        return remaining;
    }

    /**
     * Define el valor de la propiedad remaining.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRemaining(Double value) {
        this.remaining = value;
    }

    /**
     * Obtiene el valor de la propiedad returnValue.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public Double getReturnValue() {
        return returnValue;
    }

    /**
     * Define el valor de la propiedad returnValue.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReturnValue(Double value) {
        this.returnValue = value;
    }

}
