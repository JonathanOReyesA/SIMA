
package mx.com.gentera;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para dtInsuranceBeneficiariesUpdateRespSync complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="dtInsuranceBeneficiariesUpdateRespSync"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="insuranceData" type="{http://gentera.com.mx/}insuranceIdentifier" minOccurs="0"/&gt;
 *         &lt;element name="log" type="{http://gentera.com.mx/}log" minOccurs="0"/&gt;
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
@XmlType(name = "dtInsuranceBeneficiariesUpdateRespSync", propOrder = {
    "insuranceData",
    "log",
    "messageHeader"
})
public class DtInsuranceBeneficiariesUpdateRespSync {

    protected InsuranceIdentifier insuranceData;
    protected Log log;
    protected BusinessDocumentMessageHeader messageHeader;

    /**
     * Obtiene el valor de la propiedad insuranceData.
     * 
     * @return
     *     possible object is
     *     {@link InsuranceIdentifier }
     *     
     */
    public InsuranceIdentifier getInsuranceData() {
        return insuranceData;
    }

    /**
     * Define el valor de la propiedad insuranceData.
     * 
     * @param value
     *     allowed object is
     *     {@link InsuranceIdentifier }
     *     
     */
    public void setInsuranceData(InsuranceIdentifier value) {
        this.insuranceData = value;
    }

    /**
     * Obtiene el valor de la propiedad log.
     * 
     * @return
     *     possible object is
     *     {@link Log }
     *     
     */
    public Log getLog() {
        return log;
    }

    /**
     * Define el valor de la propiedad log.
     * 
     * @param value
     *     allowed object is
     *     {@link Log }
     *     
     */
    public void setLog(Log value) {
        this.log = value;
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
