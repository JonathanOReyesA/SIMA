
package mx.com.gentera.global.insurancesearchdashboard;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para insuranceSearchDashboardRespMsgDataType complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="insuranceSearchDashboardRespMsgDataType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="insuranceSearchDashboardList" type="{http://gentera.com.mx/global/insuranceSearchDashboard/}insuranceDashboardDataType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "insuranceSearchDashboardRespMsgDataType", propOrder = {
    "insuranceSearchDashboardList"
})
public class InsuranceSearchDashboardRespMsgDataType {

    @XmlElement(nillable = true)
    protected List<InsuranceDashboardDataType> insuranceSearchDashboardList;

    /**
     * Gets the value of the insuranceSearchDashboardList property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the insuranceSearchDashboardList property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getInsuranceSearchDashboardList().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link InsuranceDashboardDataType }
     * 
     * 
     */
    public List<InsuranceDashboardDataType> getInsuranceSearchDashboardList() {
        if (insuranceSearchDashboardList == null) {
            insuranceSearchDashboardList = new ArrayList<InsuranceDashboardDataType>();
        }
        return this.insuranceSearchDashboardList;
    }

}
