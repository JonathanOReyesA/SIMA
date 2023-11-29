
package mx.com.gentera.crmms._000.businesspartnermanage.int_0334.v2;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Business Partner Retrieve Input Data
 * 
 * <p>Clase Java para BusinessPartnerRetrieveInputData complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="BusinessPartnerRetrieveInputData"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="RequestInformation" type="{http://gentera.com.mx/CRMMS/000/BusinessPartnerManage/INT-0334/v2.0}RequestInformation"/&gt;
 *         &lt;element name="BusinessPartnerList" type="{http://gentera.com.mx/CRMMS/000/BusinessPartnerManage/INT-0334/v2.0}BusinessPartnerIDList"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BusinessPartnerRetrieveInputData", propOrder = {
    "requestInformation",
    "businessPartnerList"
})
public class BusinessPartnerRetrieveInputData {

    @XmlElement(name = "RequestInformation", required = true)
    protected RequestInformation requestInformation;
    @XmlElement(name = "BusinessPartnerList", required = true)
    protected BusinessPartnerIDList businessPartnerList;

    /**
     * Obtiene el valor de la propiedad requestInformation.
     * 
     * @return
     *     possible object is
     *     {@link RequestInformation }
     *     
     */
    public RequestInformation getRequestInformation() {
        return requestInformation;
    }

    /**
     * Define el valor de la propiedad requestInformation.
     * 
     * @param value
     *     allowed object is
     *     {@link RequestInformation }
     *     
     */
    public void setRequestInformation(RequestInformation value) {
        this.requestInformation = value;
    }

    /**
     * Obtiene el valor de la propiedad businessPartnerList.
     * 
     * @return
     *     possible object is
     *     {@link BusinessPartnerIDList }
     *     
     */
    public BusinessPartnerIDList getBusinessPartnerList() {
        return businessPartnerList;
    }

    /**
     * Define el valor de la propiedad businessPartnerList.
     * 
     * @param value
     *     allowed object is
     *     {@link BusinessPartnerIDList }
     *     
     */
    public void setBusinessPartnerList(BusinessPartnerIDList value) {
        this.businessPartnerList = value;
    }

}
