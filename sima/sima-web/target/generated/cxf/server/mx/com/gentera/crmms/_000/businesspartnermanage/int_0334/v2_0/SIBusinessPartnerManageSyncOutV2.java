package mx.com.gentera.crmms._000.businesspartnermanage.int_0334.v2_0;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.xml.bind.annotation.XmlSeeAlso;

/**
 * This class was generated by Apache CXF 3.1.12
 * 2023-11-29T17:32:07.277-06:00
 * Generated source version: 3.1.12
 * 
 */
@WebService(targetNamespace = "http://gentera.com.mx/CRMMS/000/BusinessPartnerManage/INT-0334/v2.0", name = "SI_BusinessPartnerManageSyncOut_V2")
@XmlSeeAlso({com.compartamos.common.structures.ObjectFactory.class, mx.com.gentera.global.ObjectFactory.class, mx.com.gentera.crmms._000.businesspartnermanage.int_0334.v2.ObjectFactory.class, com.compartamos.common.gdt.ObjectFactory.class, com.compartamos.global.ObjectFactory.class})
@SOAPBinding(parameterStyle = SOAPBinding.ParameterStyle.BARE)
public interface SIBusinessPartnerManageSyncOutV2 {

    @WebMethod(operationName = "RetrieveBusinessPartner", action = "http://sap.com/xi/WebService/soap1.1")
    @WebResult(name = "MT_BusinessPartnerRetrieveResp_sync", targetNamespace = "http://gentera.com.mx/global", partName = "MT_BusinessPartnerRetrieveResp_sync")
    public mx.com.gentera.crmms._000.businesspartnermanage.int_0334.v2.DTBusinessPartnerRetrieveRespSync retrieveBusinessPartner(
        @WebParam(partName = "MT_BusinessPartnerRetrieveReq_sync", name = "MT_BusinessPartnerRetrieveReq_sync", targetNamespace = "http://gentera.com.mx/global")
        mx.com.gentera.crmms._000.businesspartnermanage.int_0334.v2.DTBusinessPartnerRetrieveReqSync mtBusinessPartnerRetrieveReqSync
    ) throws P4ExchangeFaultData;

    @WebMethod(operationName = "CreateBusinessPartner", action = "http://sap.com/xi/WebService/soap1.1")
    @WebResult(name = "MT_BusinessPartnerCreateResp_sync", targetNamespace = "http://gentera.com.mx/global", partName = "MT_BusinessPartnerCreateResp_sync")
    public mx.com.gentera.crmms._000.businesspartnermanage.int_0334.v2.DTBusinessPartnerCreateRespSync createBusinessPartner(
        @WebParam(partName = "MT_BusinessPartnerCreateReq_sync", name = "MT_BusinessPartnerCreateReq_sync", targetNamespace = "http://gentera.com.mx/global")
        mx.com.gentera.crmms._000.businesspartnermanage.int_0334.v2.DTBusinessPartnerCreateReqSync mtBusinessPartnerCreateReqSync
    ) throws P4ExchangeFaultData;

    @WebMethod(operationName = "UpdateBusinessPartner", action = "http://sap.com/xi/WebService/soap1.1")
    @WebResult(name = "MT_BusinessPartnerUpdateResp_sync", targetNamespace = "http://gentera.com.mx/global", partName = "MT_BusinessPartnerUpdateResp_sync")
    public mx.com.gentera.crmms._000.businesspartnermanage.int_0334.v2.DTBusinessPartnerUpdateRespSync updateBusinessPartner(
        @WebParam(partName = "MT_BusinessPartnerUpdateReq_sync", name = "MT_BusinessPartnerUpdateReq_sync", targetNamespace = "http://gentera.com.mx/global")
        mx.com.gentera.crmms._000.businesspartnermanage.int_0334.v2.DTBusinessPartnerUpdateReqSync mtBusinessPartnerUpdateReqSync
    ) throws P4ExchangeFaultData;
}