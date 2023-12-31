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
 * 2023-12-18T21:48:17.355-06:00
 * Generated source version: 3.1.12
 * 
 */
@WebService(targetNamespace = "http://gentera.com.pe/", name = "claimRejectionCataloguePE")
@XmlSeeAlso({ObjectFactory.class})
public interface ClaimRejectionCataloguePE {

    @WebMethod
    @Action(input = "http://gentera.com.pe/claimRejectionCataloguePE/claimRejectionCatalogueRequest", output = "http://gentera.com.pe/claimRejectionCataloguePE/claimRejectionCatalogueResponse")
    @RequestWrapper(localName = "claimRejectionCatalogue", targetNamespace = "http://gentera.com.pe/", className = "pe.com.gentera.ClaimRejectionCatalogue")
    @ResponseWrapper(localName = "claimRejectionCatalogueResponse", targetNamespace = "http://gentera.com.pe/", className = "pe.com.gentera.ClaimRejectionCatalogueResponse")
    @WebResult(name = "return", targetNamespace = "")
    public pe.com.gentera.ClaimRejectionCatalogueRespMsgDataType claimRejectionCatalogue(
        @WebParam(name = "partnerID", targetNamespace = "")
        java.lang.String partnerID
    );
}
