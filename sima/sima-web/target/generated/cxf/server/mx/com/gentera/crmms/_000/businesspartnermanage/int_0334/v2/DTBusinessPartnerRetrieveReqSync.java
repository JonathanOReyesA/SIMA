
package mx.com.gentera.crmms._000.businesspartnermanage.int_0334.v2;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import com.compartamos.common.gdt.BusinessDocumentMessageContentHeaderV1;
import com.compartamos.common.gdt.BusinessDocumentMessageHeader;


/**
 * Business Partner Retrieve Request Structure V2
 * 
 * <p>Clase Java para DT_BusinessPartnerRetrieveReq_sync complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="DT_BusinessPartnerRetrieveReq_sync"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="MessageHeader" type="{http://compartamos.com/common/gdt}BusinessDocumentMessageHeader"/&gt;
 *         &lt;element name="MessageContentHeader" type="{http://compartamos.com/common/gdt}BusinessDocumentMessageContentHeader_V1"/&gt;
 *         &lt;element name="BusinessPartnerRetrieveInputData" type="{http://gentera.com.mx/CRMMS/000/BusinessPartnerManage/INT-0334/v2.0}BusinessPartnerRetrieveInputData"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DT_BusinessPartnerRetrieveReq_sync", propOrder = {
    "messageHeader",
    "messageContentHeader",
    "businessPartnerRetrieveInputData"
})
public class DTBusinessPartnerRetrieveReqSync {

    @XmlElement(name = "MessageHeader", required = true)
    protected BusinessDocumentMessageHeader messageHeader;
    @XmlElement(name = "MessageContentHeader", required = true)
    protected BusinessDocumentMessageContentHeaderV1 messageContentHeader;
    @XmlElement(name = "BusinessPartnerRetrieveInputData", required = true)
    protected BusinessPartnerRetrieveInputData businessPartnerRetrieveInputData;

    /**
     * Obtiene el valor de la propiedad messageHeader.
     * 
     * @return
     *     possible object is
     *     {@link BusinessDocumentMessageHeader }
     *     
     */
    public BusinessDocumentMessageHeader getMessageHeader() {
        return messageHeader;
    }

    /**
     * Define el valor de la propiedad messageHeader.
     * 
     * @param value
     *     allowed object is
     *     {@link BusinessDocumentMessageHeader }
     *     
     */
    public void setMessageHeader(BusinessDocumentMessageHeader value) {
        this.messageHeader = value;
    }

    /**
     * Obtiene el valor de la propiedad messageContentHeader.
     * 
     * @return
     *     possible object is
     *     {@link BusinessDocumentMessageContentHeaderV1 }
     *     
     */
    public BusinessDocumentMessageContentHeaderV1 getMessageContentHeader() {
        return messageContentHeader;
    }

    /**
     * Define el valor de la propiedad messageContentHeader.
     * 
     * @param value
     *     allowed object is
     *     {@link BusinessDocumentMessageContentHeaderV1 }
     *     
     */
    public void setMessageContentHeader(BusinessDocumentMessageContentHeaderV1 value) {
        this.messageContentHeader = value;
    }

    /**
     * Obtiene el valor de la propiedad businessPartnerRetrieveInputData.
     * 
     * @return
     *     possible object is
     *     {@link BusinessPartnerRetrieveInputData }
     *     
     */
    public BusinessPartnerRetrieveInputData getBusinessPartnerRetrieveInputData() {
        return businessPartnerRetrieveInputData;
    }

    /**
     * Define el valor de la propiedad businessPartnerRetrieveInputData.
     * 
     * @param value
     *     allowed object is
     *     {@link BusinessPartnerRetrieveInputData }
     *     
     */
    public void setBusinessPartnerRetrieveInputData(BusinessPartnerRetrieveInputData value) {
        this.businessPartnerRetrieveInputData = value;
    }

}
