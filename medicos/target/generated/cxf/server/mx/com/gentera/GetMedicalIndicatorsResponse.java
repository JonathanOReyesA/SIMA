
package mx.com.gentera;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para getMedicalIndicatorsResponse complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="getMedicalIndicatorsResponse"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="response" type="{http://gentera.com.mx/}getMedicalIndicatorsRespMsgDataType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getMedicalIndicatorsResponse", propOrder = {
    "response"
})
public class GetMedicalIndicatorsResponse {

    protected GetMedicalIndicatorsRespMsgDataType response;

    /**
     * Obtiene el valor de la propiedad response.
     * 
     * @return
     *     possible object is
     *     {@link GetMedicalIndicatorsRespMsgDataType }
     *     
     */
    public GetMedicalIndicatorsRespMsgDataType getResponse() {
        return response;
    }

    /**
     * Define el valor de la propiedad response.
     * 
     * @param value
     *     allowed object is
     *     {@link GetMedicalIndicatorsRespMsgDataType }
     *     
     */
    public void setResponse(GetMedicalIndicatorsRespMsgDataType value) {
        this.response = value;
    }

}
