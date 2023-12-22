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
 * 2023-12-18T21:48:14.180-06:00
 * Generated source version: 3.1.12
 * 
 */
@WebService(targetNamespace = "http://gentera.com.pe/", name = "coverageDocumentsSearchPE")
@XmlSeeAlso({ObjectFactory.class})
public interface CoverageDocumentsSearchPE {

    @WebMethod
    @Action(input = "http://gentera.com.pe/coverageDocumentsSearchPE/coverageDocumentsSearchRequest", output = "http://gentera.com.pe/coverageDocumentsSearchPE/coverageDocumentsSearchResponse")
    @RequestWrapper(localName = "coverageDocumentsSearch", targetNamespace = "http://gentera.com.pe/", className = "pe.com.gentera.CoverageDocumentsSearch")
    @ResponseWrapper(localName = "coverageDocumentsSearchResponse", targetNamespace = "http://gentera.com.pe/", className = "pe.com.gentera.CoverageDocumentsSearchResponse")
    @WebResult(name = "return", targetNamespace = "")
    public pe.com.gentera.CoverageDocumentsSearchRespMsgDataType coverageDocumentsSearch(
        @WebParam(name = "coverageCatalogueID", targetNamespace = "")
        java.lang.String coverageCatalogueID,
        @WebParam(name = "partnerID", targetNamespace = "")
        java.lang.String partnerID
    );
}