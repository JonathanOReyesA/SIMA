
package mx.com.gentera.global.insurancesearchdashboard;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para searchInsuranceDashboardReqMsgResponse complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="searchInsuranceDashboardReqMsgResponse"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="return" type="{http://gentera.com.mx/global/insuranceSearchDashboard/}insuranceSearchDashboardRespMsgDataType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "searchInsuranceDashboardReqMsgResponse", propOrder = {
    "_return"
})
public class SearchInsuranceDashboardReqMsgResponse {

    @XmlElement(name = "return")
    protected InsuranceSearchDashboardRespMsgDataType _return;

    /**
     * Obtiene el valor de la propiedad return.
     * 
     * @return
     *     possible object is
     *     {@link InsuranceSearchDashboardRespMsgDataType }
     *     
     */
    public InsuranceSearchDashboardRespMsgDataType getReturn() {
        return _return;
    }

    /**
     * Define el valor de la propiedad return.
     * 
     * @param value
     *     allowed object is
     *     {@link InsuranceSearchDashboardRespMsgDataType }
     *     
     */
    public void setReturn(InsuranceSearchDashboardRespMsgDataType value) {
        this._return = value;
    }

}
