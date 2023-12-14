package pe.com.gentera;

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
 * 2023-12-13T23:09:32.824-06:00
 * Generated source version: 3.1.12
 * 
 */
@WebService(targetNamespace = "http://gentera.com.pe/", name = "claimAutomaticPaymentPE")
@XmlSeeAlso({ObjectFactory.class})
public interface ClaimAutomaticPaymentPE {

    @WebMethod
    @Action(input = "http://gentera.com.pe/claimAutomaticPaymentPE/claimAutomaticPaymentRequest", output = "http://gentera.com.pe/claimAutomaticPaymentPE/claimAutomaticPaymentResponse")
    @RequestWrapper(localName = "claimAutomaticPayment", targetNamespace = "http://gentera.com.pe/", className = "pe.com.gentera.ClaimAutomaticPayment")
    @ResponseWrapper(localName = "claimAutomaticPaymentResponse", targetNamespace = "http://gentera.com.pe/", className = "pe.com.gentera.ClaimAutomaticPaymentResponse")
    @WebResult(name = "return", targetNamespace = "")
    public pe.com.gentera.ClaimInsurancePaymentResMsgDataTypePE claimAutomaticPayment(
        @WebParam(name = "filePath", targetNamespace = "")
        java.lang.String filePath,
        @WebParam(name = "fileName", targetNamespace = "")
        java.lang.String fileName,
        @WebParam(name = "partnerID", targetNamespace = "")
        java.lang.String partnerID,
        @WebParam(name = "userID", targetNamespace = "")
        java.lang.String userID
    );
}
