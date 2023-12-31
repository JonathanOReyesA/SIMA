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
 * 2023-12-18T21:48:08.294-06:00
 * Generated source version: 3.1.12
 * 
 */
@WebService(targetNamespace = "http://gentera.com.pe/", name = "coverageCataloguePE")
@XmlSeeAlso({ObjectFactory.class})
public interface CoverageCataloguePE {

    @WebMethod
    @Action(input = "http://gentera.com.pe/coverageCataloguePE/getCoverageRequest", output = "http://gentera.com.pe/coverageCataloguePE/getCoverageResponse")
    @RequestWrapper(localName = "getCoverage", targetNamespace = "http://gentera.com.pe/", className = "pe.com.gentera.GetCoverage")
    @ResponseWrapper(localName = "getCoverageResponse", targetNamespace = "http://gentera.com.pe/", className = "pe.com.gentera.GetCoverageResponse")
    @WebResult(name = "return", targetNamespace = "")
    public pe.com.gentera.CoverageCatalogueRespMsgDataType getCoverage(
        @WebParam(name = "productID", targetNamespace = "")
        java.lang.String productID,
        @WebParam(name = "modeID", targetNamespace = "")
        java.lang.String modeID,
        @WebParam(name = "flag", targetNamespace = "")
        java.lang.String flag,
        @WebParam(name = "partnerId", targetNamespace = "")
        java.lang.String partnerId
    );
}
