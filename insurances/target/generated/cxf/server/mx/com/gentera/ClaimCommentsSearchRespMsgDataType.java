
package mx.com.gentera;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para claimCommentsSearchRespMsgDataType complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="claimCommentsSearchRespMsgDataType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="claimCommentsSearchList" type="{http://gentera.com.mx/}claimCommentsDataType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "claimCommentsSearchRespMsgDataType", propOrder = {
    "claimCommentsSearchList"
})
public class ClaimCommentsSearchRespMsgDataType {

    @XmlElement(nillable = true)
    protected List<ClaimCommentsDataType> claimCommentsSearchList;

    /**
     * Gets the value of the claimCommentsSearchList property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the claimCommentsSearchList property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getClaimCommentsSearchList().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ClaimCommentsDataType }
     * 
     * 
     */
    public List<ClaimCommentsDataType> getClaimCommentsSearchList() {
        if (claimCommentsSearchList == null) {
            claimCommentsSearchList = new ArrayList<ClaimCommentsDataType>();
        }
        return this.claimCommentsSearchList;
    }

}
