
package mx.com.gentera;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para getMedicalIndicatorsRespMsgDataType complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="getMedicalIndicatorsRespMsgDataType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ImList" type="{http://gentera.com.mx/}getMedicalIndicatorsDataType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getMedicalIndicatorsRespMsgDataType", propOrder = {
    "imList"
})
public class GetMedicalIndicatorsRespMsgDataType {

    @XmlElement(name = "ImList", nillable = true)
    protected List<GetMedicalIndicatorsDataType> imList;

    /**
     * Gets the value of the imList property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the imList property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getImList().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link GetMedicalIndicatorsDataType }
     * 
     * 
     */
    public List<GetMedicalIndicatorsDataType> getImList() {
        if (imList == null) {
            imList = new ArrayList<GetMedicalIndicatorsDataType>();
        }
        return this.imList;
    }

}
