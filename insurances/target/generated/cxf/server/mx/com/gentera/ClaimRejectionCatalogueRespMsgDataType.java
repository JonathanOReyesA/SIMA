
package mx.com.gentera;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para claimRejectionCatalogueRespMsgDataType complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="claimRejectionCatalogueRespMsgDataType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="claimCauseList" type="{http://gentera.com.mx/}claimRejectionDataType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "claimRejectionCatalogueRespMsgDataType", propOrder = {
    "claimCauseList"
})
public class ClaimRejectionCatalogueRespMsgDataType {

    @XmlElement(nillable = true)
    protected List<ClaimRejectionDataType> claimCauseList;

    /**
     * Gets the value of the claimCauseList property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the claimCauseList property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getClaimCauseList().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ClaimRejectionDataType }
     * 
     * 
     */
    public List<ClaimRejectionDataType> getClaimCauseList() {
        if (claimCauseList == null) {
            claimCauseList = new ArrayList<ClaimRejectionDataType>();
        }
        return this.claimCauseList;
    }

}
