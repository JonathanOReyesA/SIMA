
package mx.com.gentera;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para claimsRespMsgDataType complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="claimsRespMsgDataType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="claimsList" type="{http://gentera.com.mx/}claimsDataType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "claimsRespMsgDataType", propOrder = {
    "claimsList"
})
public class ClaimsRespMsgDataType {

    @XmlElement(nillable = true)
    protected List<ClaimsDataType> claimsList;

    /**
     * Gets the value of the claimsList property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the claimsList property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getClaimsList().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ClaimsDataType }
     * 
     * 
     */
    public List<ClaimsDataType> getClaimsList() {
        if (claimsList == null) {
            claimsList = new ArrayList<ClaimsDataType>();
        }
        return this.claimsList;
    }

}
