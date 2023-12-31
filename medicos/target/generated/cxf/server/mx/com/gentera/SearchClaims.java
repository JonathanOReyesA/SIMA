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
 * This class was generated by Apache CXF 3.1.13
 * 2023-11-28T13:26:55.633-06:00
 * Generated source version: 3.1.13
 * 
 */
@WebService(targetNamespace = "http://gentera.com.mx/", name = "searchClaims")
@XmlSeeAlso({ObjectFactory.class})
public interface SearchClaims {

    @WebMethod
    @Action(input = "http://gentera.com.mx/searchClaims/searchClaimssRequest", output = "http://gentera.com.mx/searchClaims/searchClaimsResponse")
    @RequestWrapper(localName = "searchClaims", targetNamespace = "http://gentera.com.mx/", className = "mx.com.gentera.SearchClaims_Type")
    @ResponseWrapper(localName = "searchClaimsResponse", targetNamespace = "http://gentera.com.mx/", className = "mx.com.gentera.SearchClaimsResponse")
    @WebResult(name = "return", targetNamespace = "")
    public mx.com.gentera.ClaimsRespMsgDataType searchClaims(
        @WebParam(name = "option", targetNamespace = "")
        java.lang.String option,
        @WebParam(name = "paramKey", targetNamespace = "")
        java.lang.String paramKey,
        @WebParam(name = "partnerID", targetNamespace = "")
        java.lang.String partnerID
    );
}
