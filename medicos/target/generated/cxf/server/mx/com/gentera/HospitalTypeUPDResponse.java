
package mx.com.gentera;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para hospitalTypeUPDResponse complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="hospitalTypeUPDResponse"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="response" type="{http://gentera.com.mx/}cretaUpdateHospitalesTypeRespMsg" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "hospitalTypeUPDResponse", propOrder = {
    "response"
})
public class HospitalTypeUPDResponse {

    protected CretaUpdateHospitalesTypeRespMsg response;

    /**
     * Obtiene el valor de la propiedad response.
     * 
     * @return
     *     possible object is
     *     {@link CretaUpdateHospitalesTypeRespMsg }
     *     
     */
    public CretaUpdateHospitalesTypeRespMsg getResponse() {
        return response;
    }

    /**
     * Define el valor de la propiedad response.
     * 
     * @param value
     *     allowed object is
     *     {@link CretaUpdateHospitalesTypeRespMsg }
     *     
     */
    public void setResponse(CretaUpdateHospitalesTypeRespMsg value) {
        this.response = value;
    }

}
