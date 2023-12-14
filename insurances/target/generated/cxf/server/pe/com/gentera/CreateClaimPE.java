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
 * 2023-12-13T23:09:25.956-06:00
 * Generated source version: 3.1.12
 * 
 */
@WebService(targetNamespace = "http://gentera.com.pe/", name = "createClaimPE")
@XmlSeeAlso({schema.ObjectFactory.class, ObjectFactory.class})
public interface CreateClaimPE {

    @WebMethod
    @Action(input = "http://gentera.com.pe/createClaimPE/createClaimRequest", output = "http://gentera.com.pe/createClaimPE/createClaimResponse")
    @RequestWrapper(localName = "createClaim", targetNamespace = "http://gentera.com.pe/", className = "pe.com.gentera.CreateClaim")
    @ResponseWrapper(localName = "createClaimResponse", targetNamespace = "http://gentera.com.pe/", className = "pe.com.gentera.CreateClaimResponse")
    @WebResult(name = "return", targetNamespace = "")
    public pe.com.gentera.ClaimCreationRespMsg createClaim(
        @WebParam(name = "insuranceID", targetNamespace = "")
        java.lang.String insuranceID,
        @WebParam(name = "coverageID", targetNamespace = "")
        java.lang.String coverageID,
        @WebParam(name = "claimDate", targetNamespace = "")
        java.util.Date claimDate,
        @WebParam(name = "affected", targetNamespace = "")
        java.lang.String affected,
        @WebParam(name = "claimCauseID", targetNamespace = "")
        pe.com.gentera.ClaimCauseID claimCauseID,
        @WebParam(name = "statusID", targetNamespace = "")
        java.lang.String statusID,
        @WebParam(name = "statusDate", targetNamespace = "")
        java.util.Date statusDate,
        @WebParam(name = "user", targetNamespace = "")
        java.lang.String user,
        @WebParam(name = "trackingEmail", targetNamespace = "")
        java.lang.String trackingEmail,
        @WebParam(name = "processInstanceID", targetNamespace = "")
        java.lang.String processInstanceID,
        @WebParam(name = "businessPartnerID", targetNamespace = "")
        java.lang.String businessPartnerID,
        @WebParam(name = "claimDays", targetNamespace = "")
        java.lang.Integer claimDays,
        @WebParam(name = "flagCoverage", targetNamespace = "")
        java.lang.Integer flagCoverage,
        @WebParam(name = "initialDate", targetNamespace = "")
        java.lang.String initialDate,
        @WebParam(name = "endDate", targetNamespace = "")
        java.lang.String endDate,
        @WebParam(name = "claimPaymentType", targetNamespace = "")
        java.lang.String claimPaymentType,
        @WebParam(name = "partnerID", targetNamespace = "")
        java.lang.String partnerID,
        @WebParam(name = "idBeneficiary", targetNamespace = "")
        java.lang.String idBeneficiary,
        @WebParam(name = "idPersonPayable", targetNamespace = "")
        java.lang.String idPersonPayable,
        @WebParam(name = "amountToPay", targetNamespace = "")
        java.lang.Double amountToPay
    );
}
