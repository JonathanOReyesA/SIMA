
package mx.com.gentera;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para hospitalResponse complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="hospitalResponse"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="hospitalsTypes" type="{http://gentera.com.mx/}hospitalsRespMsgDataType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "hospitalResponse", propOrder = {
    "hospitalsTypes"
})
public class HospitalResponse {

    protected HospitalsRespMsgDataType hospitalsTypes;

    /**
     * Obtiene el valor de la propiedad hospitalsTypes.
     * 
     * @return
     *     possible object is
     *     {@link HospitalsRespMsgDataType }
     *     
     */
    public HospitalsRespMsgDataType getHospitalsTypes() {
        return hospitalsTypes;
    }

    /**
     * Define el valor de la propiedad hospitalsTypes.
     * 
     * @param value
     *     allowed object is
     *     {@link HospitalsRespMsgDataType }
     *     
     */
    public void setHospitalsTypes(HospitalsRespMsgDataType value) {
        this.hospitalsTypes = value;
    }

}
