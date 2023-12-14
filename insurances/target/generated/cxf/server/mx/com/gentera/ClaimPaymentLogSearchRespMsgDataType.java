
package mx.com.gentera;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para claimPaymentLogSearchRespMsgDataType complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="claimPaymentLogSearchRespMsgDataType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="claimPaymentLogSearchList" type="{http://gentera.com.mx/}claimPaymentLogSearchDataType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "claimPaymentLogSearchRespMsgDataType", propOrder = {
    "claimPaymentLogSearchList"
})
public class ClaimPaymentLogSearchRespMsgDataType {

    @XmlElement(nillable = true)
    protected List<ClaimPaymentLogSearchDataType> claimPaymentLogSearchList;

    /**
     * Gets the value of the claimPaymentLogSearchList property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the claimPaymentLogSearchList property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getClaimPaymentLogSearchList().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ClaimPaymentLogSearchDataType }
     * 
     * 
     */
    public List<ClaimPaymentLogSearchDataType> getClaimPaymentLogSearchList() {
        if (claimPaymentLogSearchList == null) {
            claimPaymentLogSearchList = new ArrayList<ClaimPaymentLogSearchDataType>();
        }
        return this.claimPaymentLogSearchList;
    }

}
