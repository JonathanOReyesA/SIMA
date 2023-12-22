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
 * 2023-12-18T21:48:08.722-06:00
 * Generated source version: 3.1.12
 * 
 */
@WebService(targetNamespace = "http://gentera.com.mx/", name = "businessPartnerSearch")
@XmlSeeAlso({ObjectFactory.class})
public interface BusinessPartnerSearch {

    @WebMethod
    @Action(input = "http://gentera.com.mx/businessPartnerSearch/businessPartnerSearchRequest", output = "http://gentera.com.mx/businessPartnerSearch/businessPartnerSearchResponse")
    @RequestWrapper(localName = "businessPartnerSearch", targetNamespace = "http://gentera.com.mx/", className = "mx.com.gentera.BusinessPartnerSearch_Type")
    @ResponseWrapper(localName = "businessPartnerSearchResponse", targetNamespace = "http://gentera.com.mx/", className = "mx.com.gentera.BusinessPartnerSearchResponse")
    @WebResult(name = "return", targetNamespace = "")
    public mx.com.gentera.BusinessPartnerSearchRespMsgDataType businessPartnerSearch(
        @WebParam(name = "businessPartnerID", targetNamespace = "")
        java.lang.String businessPartnerID,
        @WebParam(name = "partnerID", targetNamespace = "")
        java.lang.String partnerID
    );
}