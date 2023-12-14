package mx.com.gentera.insurances.services;

import java.util.Date;
import mx.com.gentera.ClaimInsurancePaymentResMsgDataType;
import mx.com.gentera.ClaimStatusUpdateRespMsgDataType;
import pe.com.gentera.ClaimInsurancePaymentResMsgDataTypePE;

public interface ServiceBusiness {
  ClaimInsurancePaymentResMsgDataType claimAutomicPayment(String paramString1, String paramString2, String paramString3, String paramString4);
  
  ClaimStatusUpdateRespMsgDataType updateStatus(String paramString1, Integer paramInteger, Date paramDate, String paramString2, String paramString3, String paramString4, String paramString5, String paramString6, String paramString7, String paramString8, String paramString9, String paramString10);
  
  ClaimInsurancePaymentResMsgDataTypePE claimAutomicPaymentPE(String paramString1, String paramString2, String paramString3, String paramString4);
}
