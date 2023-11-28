
package mx.com.gentera;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para hostipalesResponse complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="hostipalesResponse"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="hospitales" type="{http://gentera.com.mx/}hospitalesRespMsgDataType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "hostipalesResponse", propOrder = {
    "hospitales"
})
public class HostipalesResponse {

    protected HospitalesRespMsgDataType hospitales;

    /**
     * Obtiene el valor de la propiedad hospitales.
     * 
     * @return
     *     possible object is
     *     {@link HospitalesRespMsgDataType }
     *     
     */
    public HospitalesRespMsgDataType getHospitales() {
        return hospitales;
    }

    /**
     * Define el valor de la propiedad hospitales.
     * 
     * @param value
     *     allowed object is
     *     {@link HospitalesRespMsgDataType }
     *     
     */
    public void setHospitales(HospitalesRespMsgDataType value) {
        this.hospitales = value;
    }

}
