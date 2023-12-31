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
 * 2023-12-18T21:48:21.398-06:00
 * Generated source version: 3.1.12
 * 
 */
@WebService(targetNamespace = "http://gentera.com.mx/", name = "confirmationClaim")
@XmlSeeAlso({ObjectFactory.class})
public interface ConfirmationClaim {

    @WebMethod
    @Action(input = "http://gentera.com.mx/confirmationClaim/confirmationClaimRequest", output = "http://gentera.com.mx/confirmationClaim/confirmationClaimResponse")
    @RequestWrapper(localName = "confirmationClaim", targetNamespace = "http://gentera.com.mx/", className = "mx.com.gentera.ConfirmationClaim_Type")
    @ResponseWrapper(localName = "confirmationClaimResponse", targetNamespace = "http://gentera.com.mx/", className = "mx.com.gentera.ConfirmationClaimResponse")
    @WebResult(name = "return", targetNamespace = "")
    public mx.com.gentera.ClaimConfirmationRspDataType confirmationClaim(
        @WebParam(name = "claimID", targetNamespace = "")
        java.lang.String claimID
    );
}
