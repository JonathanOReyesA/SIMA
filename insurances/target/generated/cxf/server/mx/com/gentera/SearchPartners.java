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
 * 2023-12-18T21:48:07.056-06:00
 * Generated source version: 3.1.12
 * 
 */
@WebService(targetNamespace = "http://gentera.com.mx/", name = "searchPartners")
@XmlSeeAlso({ObjectFactory.class})
public interface SearchPartners {

    @WebMethod
    @Action(input = "http://gentera.com.mx/searchPartners/searchPartnersRequest", output = "http://gentera.com.mx/searchPartners/searchPartnersResponse")
    @RequestWrapper(localName = "searchPartners", targetNamespace = "http://gentera.com.mx/", className = "mx.com.gentera.SearchPartners_Type")
    @ResponseWrapper(localName = "searchPartnersResponse", targetNamespace = "http://gentera.com.mx/", className = "mx.com.gentera.SearchPartnersResponse")
    @WebResult(name = "return", targetNamespace = "")
    public mx.com.gentera.SearchPartnersRespMsgDataType searchPartners(
        @WebParam(name = "countryId", targetNamespace = "")
        java.lang.String countryId
    );
}