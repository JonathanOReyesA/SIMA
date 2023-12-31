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
 * 2023-12-18T21:48:17.977-06:00
 * Generated source version: 3.1.12
 * 
 */
@WebService(targetNamespace = "http://gentera.com.mx/", name = "claimRejection")
@XmlSeeAlso({ObjectFactory.class})
public interface ClaimRejection {

    @WebMethod
    @Action(input = "http://gentera.com.mx/claimRejection/claimRejectionRequest", output = "http://gentera.com.mx/claimRejection/claimRejectionResponse")
    @RequestWrapper(localName = "claimRejection", targetNamespace = "http://gentera.com.mx/", className = "mx.com.gentera.ClaimRejection_Type")
    @ResponseWrapper(localName = "claimRejectionResponse", targetNamespace = "http://gentera.com.mx/", className = "mx.com.gentera.ClaimRejectionResponse")
    @WebResult(name = "return", targetNamespace = "")
    public mx.com.gentera.ClaimRejectionRespMsgDataType claimRejection(
        @WebParam(name = "claimID", targetNamespace = "")
        java.lang.String claimID,
        @WebParam(name = "claimRejectionTypeID", targetNamespace = "")
        java.lang.String claimRejectionTypeID,
        @WebParam(name = "rejectionAmount", targetNamespace = "")
        java.lang.String rejectionAmount,
        @WebParam(name = "rejectionDate", targetNamespace = "")
        java.lang.String rejectionDate,
        @WebParam(name = "rejectionDocumentName", targetNamespace = "")
        java.lang.String rejectionDocumentName
    );
}
