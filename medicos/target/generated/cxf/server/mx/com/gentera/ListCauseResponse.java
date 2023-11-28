
package mx.com.gentera;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para listCauseResponse complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="listCauseResponse"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="listCause" type="{http://gentera.com.mx/}listCauseRespMsgDataType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "listCauseResponse", propOrder = {
    "listCause"
})
public class ListCauseResponse {

    protected ListCauseRespMsgDataType listCause;

    /**
     * Obtiene el valor de la propiedad listCause.
     * 
     * @return
     *     possible object is
     *     {@link ListCauseRespMsgDataType }
     *     
     */
    public ListCauseRespMsgDataType getListCause() {
        return listCause;
    }

    /**
     * Define el valor de la propiedad listCause.
     * 
     * @param value
     *     allowed object is
     *     {@link ListCauseRespMsgDataType }
     *     
     */
    public void setListCause(ListCauseRespMsgDataType value) {
        this.listCause = value;
    }

}
