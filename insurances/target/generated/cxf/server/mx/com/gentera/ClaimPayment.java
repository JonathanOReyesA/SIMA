package mx.com.gentera;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.Action;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;

/**
 * This class was generated by Apache CXF 3.1.12
 * 2023-12-18T21:48:17.655-06:00
 * Generated source version: 3.1.12
 * 
 */
@WebService(targetNamespace = "http://gentera.com.mx/", name = "claimPayment")
@XmlSeeAlso({ObjectFactory.class})
public interface ClaimPayment {

    @WebMethod
    @Action(input = "http://gentera.com.mx/claimPayment/claimPaymentRequest", output = "http://gentera.com.mx/claimPayment/claimPaymentResponse")
    @RequestWrapper(localName = "claimPayment", targetNamespace = "http://gentera.com.mx/", className = "mx.com.gentera.ClaimPayment_Type")
    @ResponseWrapper(localName = "claimPaymentResponse", targetNamespace = "http://gentera.com.mx/", className = "mx.com.gentera.ClaimPaymentResponse")
    @WebResult(name = "return", targetNamespace = "")
    public mx.com.gentera.ClaimPaymentRespMsgDataType claimPayment(
        @WebParam(name = "claimID", targetNamespace = "")
        java.lang.String claimID,
        @WebParam(name = "odp", targetNamespace = "")
        java.lang.String odp,
        @WebParam(name = "paymentDate", targetNamespace = "")
        java.lang.String paymentDate,
        @WebParam(name = "paymentAmount", targetNamespace = "")
        java.lang.Double paymentAmount,
        @WebParam(name = "claimPaymentDate", targetNamespace = "")
        java.util.Date claimPaymentDate,
        @WebParam(name = "claimPaymentFileName", targetNamespace = "")
        java.lang.String claimPaymentFileName,
        @WebParam(name = "paidDays", targetNamespace = "")
        java.lang.Double paidDays,
        @WebParam(name = "externalInsuranceID", targetNamespace = "")
        java.lang.String externalInsuranceID
    );
}
