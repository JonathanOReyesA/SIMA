
package mx.com.gentera.crmms._000.businesspartnermanage.int_0334.v2;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Business Partner General Data
 * 
 * <p>Clase Java para BusinessPartnerGeneralData complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="BusinessPartnerGeneralData"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="BusinessPartnerItem" type="{http://gentera.com.mx/CRMMS/000/BusinessPartnerManage/INT-0334/v2.0}BusinessPartnerItem" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BusinessPartnerGeneralData", propOrder = {
    "businessPartnerItem"
})
public class BusinessPartnerGeneralData {

    @XmlElement(name = "BusinessPartnerItem")
    protected List<BusinessPartnerItem> businessPartnerItem;

    /**
     * Gets the value of the businessPartnerItem property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the businessPartnerItem property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getBusinessPartnerItem().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link BusinessPartnerItem }
     * 
     * 
     */
    public List<BusinessPartnerItem> getBusinessPartnerItem() {
        if (businessPartnerItem == null) {
            businessPartnerItem = new ArrayList<BusinessPartnerItem>();
        }
        return this.businessPartnerItem;
    }

}
