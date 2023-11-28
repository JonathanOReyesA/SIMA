
package mx.com.gentera;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para promotersByOfficeRespMsg complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="promotersByOfficeRespMsg"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="promotersByOfficeList" type="{http://gentera.com.mx/}promotersByOfficeDataType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "promotersByOfficeRespMsg", propOrder = {
    "promotersByOfficeList"
})
public class PromotersByOfficeRespMsg {

    @XmlElement(nillable = true)
    protected List<PromotersByOfficeDataType> promotersByOfficeList;

    /**
     * Gets the value of the promotersByOfficeList property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the promotersByOfficeList property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPromotersByOfficeList().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PromotersByOfficeDataType }
     * 
     * 
     */
    public List<PromotersByOfficeDataType> getPromotersByOfficeList() {
        if (promotersByOfficeList == null) {
            promotersByOfficeList = new ArrayList<PromotersByOfficeDataType>();
        }
        return this.promotersByOfficeList;
    }

}
