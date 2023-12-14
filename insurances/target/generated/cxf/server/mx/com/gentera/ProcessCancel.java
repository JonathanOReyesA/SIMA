
package mx.com.gentera;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para processCancel complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="processCancel"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="req" type="{http://gentera.com.mx/}operationListType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "processCancel", propOrder = {
    "req"
})
public class ProcessCancel {

    protected OperationListType req;

    /**
     * Obtiene el valor de la propiedad req.
     * 
     * @return
     *     possible object is
     *     {@link OperationListType }
     *     
     */
    public OperationListType getReq() {
        return req;
    }

    /**
     * Define el valor de la propiedad req.
     * 
     * @param value
     *     allowed object is
     *     {@link OperationListType }
     *     
     */
    public void setReq(OperationListType value) {
        this.req = value;
    }

}
