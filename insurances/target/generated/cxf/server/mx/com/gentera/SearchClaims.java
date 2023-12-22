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
 * 2023-12-18T21:48:10.348-06:00
 * Generated source version: 3.1.12
 * 
 */
@WebService(targetNamespace = "http://gentera.com.mx/", name = "searchClaims")
@XmlSeeAlso({ObjectFactory.class})
public interface SearchClaims {

    @WebMethod
    @Action(input = "http://gentera.com.mx/searchClaims/claimsSearchRequest", output = "http://gentera.com.mx/searchClaims/claimsSearchResponse")
    @RequestWrapper(localName = "claimsSearch", targetNamespace = "http://gentera.com.mx/", className = "mx.com.gentera.ClaimsSearch")
    @ResponseWrapper(localName = "claimsSearchResponse", targetNamespace = "http://gentera.com.mx/", className = "mx.com.gentera.ClaimsSearchResponse")
    @WebResult(name = "return", targetNamespace = "")
    public mx.com.gentera.SearchClaimsRespMsgDataType claimsSearch(
        @WebParam(name = "partnerID", targetNamespace = "")
        java.lang.String partnerID,
        @WebParam(name = "businessPartnerID", targetNamespace = "")
        java.lang.String businessPartnerID,
        @WebParam(name = "claimID", targetNamespace = "")
        java.lang.String claimID,
        @WebParam(name = "certificate", targetNamespace = "")
        java.lang.String certificate
    );
}