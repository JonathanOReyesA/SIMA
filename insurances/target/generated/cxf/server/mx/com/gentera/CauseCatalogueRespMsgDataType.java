
package mx.com.gentera;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para causeCatalogueRespMsgDataType complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="causeCatalogueRespMsgDataType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="causeList" type="{http://gentera.com.mx/}causeDataType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "causeCatalogueRespMsgDataType", propOrder = {
    "causeList"
})
public class CauseCatalogueRespMsgDataType {

    @XmlElement(nillable = true)
    protected List<CauseDataType> causeList;

    /**
     * Gets the value of the causeList property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the causeList property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCauseList().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CauseDataType }
     * 
     * 
     */
    public List<CauseDataType> getCauseList() {
        if (causeList == null) {
            causeList = new ArrayList<CauseDataType>();
        }
        return this.causeList;
    }

}
