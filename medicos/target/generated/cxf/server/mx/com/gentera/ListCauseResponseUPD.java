
package mx.com.gentera;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para listCauseResponseUPD complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="listCauseResponseUPD"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="response" type="{http://gentera.com.mx/}listCauseResponseUPDMsgDataType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "listCauseResponseUPD", propOrder = {
    "response"
})
public class ListCauseResponseUPD {

    protected ListCauseResponseUPDMsgDataType response;

    /**
     * Obtiene el valor de la propiedad response.
     * 
     * @return
     *     possible object is
     *     {@link ListCauseResponseUPDMsgDataType }
     *     
     */
    public ListCauseResponseUPDMsgDataType getResponse() {
        return response;
    }

    /**
     * Define el valor de la propiedad response.
     * 
     * @param value
     *     allowed object is
     *     {@link ListCauseResponseUPDMsgDataType }
     *     
     */
    public void setResponse(ListCauseResponseUPDMsgDataType value) {
        this.response = value;
    }

}
