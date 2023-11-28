
package mx.com.gentera;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para subdirectionDataType complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="subdirectionDataType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="subdirectionName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "subdirectionDataType", propOrder = {
    "subdirectionName"
})
public class SubdirectionDataType {

    protected String subdirectionName;

    /**
     * Obtiene el valor de la propiedad subdirectionName.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSubdirectionName() {
        return subdirectionName;
    }

    /**
     * Define el valor de la propiedad subdirectionName.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSubdirectionName(String value) {
        this.subdirectionName = value;
    }

}
