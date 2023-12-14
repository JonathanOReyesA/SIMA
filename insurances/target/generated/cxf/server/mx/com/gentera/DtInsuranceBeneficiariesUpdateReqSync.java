
package mx.com.gentera;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para dtInsuranceBeneficiariesUpdateReqSync complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="dtInsuranceBeneficiariesUpdateReqSync"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="insuranceBeneficiaryData" type="{http://gentera.com.mx/}insuranceBeneficiaryData" minOccurs="0"/&gt;
 *         &lt;element name="messageContentHeader" type="{http://gentera.com.mx/}businessDocumentMessageContentHeader" minOccurs="0"/&gt;
 *         &lt;element name="messageHeader" type="{http://gentera.com.mx/}businessDocumentMessageHeader" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "dtInsuranceBeneficiariesUpdateReqSync", propOrder = {
    "insuranceBeneficiaryData",
    "messageContentHeader",
    "messageHeader"
})
public class DtInsuranceBeneficiariesUpdateReqSync {

    protected InsuranceBeneficiaryData insuranceBeneficiaryData;
    protected BusinessDocumentMessageContentHeader messageContentHeader;
    protected BusinessDocumentMessageHeader messageHeader;

    /**
     * Obtiene el valor de la propiedad insuranceBeneficiaryData.
     * 
     * @return
     *     possible object is
     *     {@link InsuranceBeneficiaryData }
     *     
     */
    public InsuranceBeneficiaryData getInsuranceBeneficiaryData() {
        return insuranceBeneficiaryData;
    }

    /**
     * Define el valor de la propiedad insuranceBeneficiaryData.
     * 
     * @param value
     *     allowed object is
     *     {@link InsuranceBeneficiaryData }
     *     
     */
    public void setInsuranceBeneficiaryData(InsuranceBeneficiaryData value) {
        this.insuranceBeneficiaryData = value;
    }

    /**
     * Obtiene el valor de la propiedad messageContentHeader.
     * 
     * @return
     *     possible object is
     *     {@link BusinessDocumentMessageContentHeader }
     *     
     */
    public BusinessDocumentMessageContentHeader getMessageContentHeader() {
        return messageContentHeader;
    }

    /**
     * Define el valor de la propiedad messageContentHeader.
     * 
     * @param value
     *     allowed object is
     *     {@link BusinessDocumentMessageContentHeader }
     *     
     */
    public void setMessageContentHeader(BusinessDocumentMessageContentHeader value) {
        this.messageContentHeader = value;
    }

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

}
