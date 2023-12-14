
package mx.com.gentera;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para moneyDataType complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="moneyDataType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="moneyID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="moneyType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "moneyDataType", propOrder = {
    "moneyID",
    "moneyType"
})
public class MoneyDataType {

    protected String moneyID;
    protected String moneyType;

    /**
     * Obtiene el valor de la propiedad moneyID.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMoneyID() {
        return moneyID;
    }

    /**
     * Define el valor de la propiedad moneyID.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMoneyID(String value) {
        this.moneyID = value;
    }

    /**
     * Obtiene el valor de la propiedad moneyType.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMoneyType() {
        return moneyType;
    }

    /**
     * Define el valor de la propiedad moneyType.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMoneyType(String value) {
        this.moneyType = value;
    }

}
