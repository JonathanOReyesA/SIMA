
package mx.com.gentera;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para createUpdateHospitalResponse complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="createUpdateHospitalResponse"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="return" type="{http://gentera.com.mx/}createUpdateHospitalRespMsgDataType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "createUpdateHospitalResponse", propOrder = {
    "_return"
})
public class CreateUpdateHospitalResponse {

    @XmlElement(name = "return")
    protected CreateUpdateHospitalRespMsgDataType _return;

    /**
     * Obtiene el valor de la propiedad return.
     * 
     * @return
     *     possible object is
     *     {@link CreateUpdateHospitalRespMsgDataType }
     *     
     */
    public CreateUpdateHospitalRespMsgDataType getReturn() {
        return _return;
    }

    /**
     * Define el valor de la propiedad return.
     * 
     * @param value
     *     allowed object is
     *     {@link CreateUpdateHospitalRespMsgDataType }
     *     
     */
    public void setReturn(CreateUpdateHospitalRespMsgDataType value) {
        this._return = value;
    }

}
