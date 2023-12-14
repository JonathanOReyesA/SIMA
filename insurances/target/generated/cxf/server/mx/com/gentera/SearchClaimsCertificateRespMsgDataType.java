
package mx.com.gentera;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para searchClaimsCertificateRespMsgDataType complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="searchClaimsCertificateRespMsgDataType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="searchClaimsCertificateList" type="{http://gentera.com.mx/}searchClaimsCertificateDataType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "searchClaimsCertificateRespMsgDataType", propOrder = {
    "searchClaimsCertificateList"
})
public class SearchClaimsCertificateRespMsgDataType {

    @XmlElement(nillable = true)
    protected List<SearchClaimsCertificateDataType> searchClaimsCertificateList;

    /**
     * Gets the value of the searchClaimsCertificateList property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the searchClaimsCertificateList property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSearchClaimsCertificateList().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SearchClaimsCertificateDataType }
     * 
     * 
     */
    public List<SearchClaimsCertificateDataType> getSearchClaimsCertificateList() {
        if (searchClaimsCertificateList == null) {
            searchClaimsCertificateList = new ArrayList<SearchClaimsCertificateDataType>();
        }
        return this.searchClaimsCertificateList;
    }

}
