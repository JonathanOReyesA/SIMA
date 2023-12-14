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
 * 2023-12-13T23:09:33.093-06:00
 * Generated source version: 3.1.12
 * 
 */
@WebService(targetNamespace = "http://gentera.com.mx/", name = "coverageDocumentsSearch")
@XmlSeeAlso({ObjectFactory.class})
public interface CoverageDocumentsSearch {

    @WebMethod
    @Action(input = "http://gentera.com.mx/coverageDocumentsSearch/coverageDocumentsSearchRequest", output = "http://gentera.com.mx/coverageDocumentsSearch/coverageDocumentsSearchResponse")
    @RequestWrapper(localName = "coverageDocumentsSearch", targetNamespace = "http://gentera.com.mx/", className = "mx.com.gentera.CoverageDocumentsSearch_Type")
    @ResponseWrapper(localName = "coverageDocumentsSearchResponse", targetNamespace = "http://gentera.com.mx/", className = "mx.com.gentera.CoverageDocumentsSearchResponse")
    @WebResult(name = "return", targetNamespace = "")
    public mx.com.gentera.CoverageDocumentsSearchRespMsgDataType coverageDocumentsSearch(
        @WebParam(name = "coverageCatalogueID", targetNamespace = "")
        java.lang.String coverageCatalogueID
    );
}
