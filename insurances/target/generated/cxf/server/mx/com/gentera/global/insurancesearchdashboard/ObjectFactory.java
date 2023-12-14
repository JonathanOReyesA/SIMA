
package mx.com.gentera.global.insurancesearchdashboard;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the mx.com.gentera.global.insurancesearchdashboard package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _SearchInsuranceDashboardReqMsg_QNAME = new QName("http://gentera.com.mx/global/insuranceSearchDashboard/", "searchInsuranceDashboardReqMsg");
    private final static QName _SearchInsuranceDashboardReqMsgResponse_QNAME = new QName("http://gentera.com.mx/global/insuranceSearchDashboard/", "searchInsuranceDashboardReqMsgResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: mx.com.gentera.global.insurancesearchdashboard
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link SearchInsuranceDashboardReqMsg }
     * 
     */
    public SearchInsuranceDashboardReqMsg createSearchInsuranceDashboardReqMsg() {
        return new SearchInsuranceDashboardReqMsg();
    }

    /**
     * Create an instance of {@link SearchInsuranceDashboardReqMsgResponse }
     * 
     */
    public SearchInsuranceDashboardReqMsgResponse createSearchInsuranceDashboardReqMsgResponse() {
        return new SearchInsuranceDashboardReqMsgResponse();
    }

    /**
     * Create an instance of {@link InsuranceSearchDashboardRespMsgDataType }
     * 
     */
    public InsuranceSearchDashboardRespMsgDataType createInsuranceSearchDashboardRespMsgDataType() {
        return new InsuranceSearchDashboardRespMsgDataType();
    }

    /**
     * Create an instance of {@link InsuranceDashboardDataType }
     * 
     */
    public InsuranceDashboardDataType createInsuranceDashboardDataType() {
        return new InsuranceDashboardDataType();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SearchInsuranceDashboardReqMsg }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://gentera.com.mx/global/insuranceSearchDashboard/", name = "searchInsuranceDashboardReqMsg")
    public JAXBElement<SearchInsuranceDashboardReqMsg> createSearchInsuranceDashboardReqMsg(SearchInsuranceDashboardReqMsg value) {
        return new JAXBElement<SearchInsuranceDashboardReqMsg>(_SearchInsuranceDashboardReqMsg_QNAME, SearchInsuranceDashboardReqMsg.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SearchInsuranceDashboardReqMsgResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://gentera.com.mx/global/insuranceSearchDashboard/", name = "searchInsuranceDashboardReqMsgResponse")
    public JAXBElement<SearchInsuranceDashboardReqMsgResponse> createSearchInsuranceDashboardReqMsgResponse(SearchInsuranceDashboardReqMsgResponse value) {
        return new JAXBElement<SearchInsuranceDashboardReqMsgResponse>(_SearchInsuranceDashboardReqMsgResponse_QNAME, SearchInsuranceDashboardReqMsgResponse.class, null, value);
    }

}
