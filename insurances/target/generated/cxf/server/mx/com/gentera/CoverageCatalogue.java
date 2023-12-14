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
 * 2023-12-13T23:09:20.130-06:00
 * Generated source version: 3.1.12
 * 
 */
@WebService(targetNamespace = "http://gentera.com.mx/", name = "coverageCatalogue")
@XmlSeeAlso({ObjectFactory.class})
public interface CoverageCatalogue {

    @WebMethod
    @Action(input = "http://gentera.com.mx/coverageCatalogue/getCoverageRequest", output = "http://gentera.com.mx/coverageCatalogue/getCoverageResponse")
    @RequestWrapper(localName = "getCoverage", targetNamespace = "http://gentera.com.mx/", className = "mx.com.gentera.GetCoverage")
    @ResponseWrapper(localName = "getCoverageResponse", targetNamespace = "http://gentera.com.mx/", className = "mx.com.gentera.GetCoverageResponse")
    @WebResult(name = "return", targetNamespace = "")
    public mx.com.gentera.CoverageCatalogueRespMsgDataType getCoverage(
        @WebParam(name = "productID", targetNamespace = "")
        java.lang.String productID,
        @WebParam(name = "modeID", targetNamespace = "")
        java.lang.String modeID,
        @WebParam(name = "flag", targetNamespace = "")
        java.lang.String flag
    );
}
