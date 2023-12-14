package com.gentera.insurances.endpoints;

import com.gentera.insurances.beans.EndpointBean;
//import java.sql.Date;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import mx.com.gentera.seguros.common.persistence.model.CallSPResponse;
import mx.com.gentera.seguros.common.persistence.services.IPersistenceService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import pe.com.gentera.AmountToPayQueryRespMsgDataType;
import pe.com.gentera.GetAmountToPayPE;

public class GetAmountToPayPEEndpoint implements GetAmountToPayPE {
	private static final Logger logger = LoggerFactory.getLogger(GetAmountToPayPEEndpoint.class);

	@Autowired
	EndpointBean getAmountToPayPEEndpointBean;

	@Autowired
	IPersistenceService persistenceService;

	@SuppressWarnings("deprecation")
	@Override
	public AmountToPayQueryRespMsgDataType getAmountToPay(String insuranceID, String businessPartnerID,
			String productID, String coverageID, String flagCoverage, Double claimDays, String initialDate,
			String endDate, String partnerID, Double claimAmount, String claimID, String pAffected) {
		logger.info("Se recibio una peticion del id {} para el  servicio {}", insuranceID, "GetAmountToPayPE");
		CallSPResponse callSPResponse = new CallSPResponse();
		AmountToPayQueryRespMsgDataType response = new AmountToPayQueryRespMsgDataType();
		List<Object> values = new ArrayList<Object>();
		values.add(insuranceID);
		values.add(businessPartnerID);
		values.add(productID);
		values.add(coverageID);
		values.add(flagCoverage);
		try {
			values.add(Integer.valueOf((int) claimDays.doubleValue()));
		} catch (Exception e) {
			values.add(null);
		}
		try {
			values.add(new Date((new Date(initialDate)).getTime()));
		} catch (Exception e) {
			values.add(null);
		}
		try {
			values.add(new Date((new Date(endDate)).getTime()));
		} catch (Exception e) {
			values.add(null);
		}
		values.add(claimAmount);
		values.add(claimID);
		values.add(pAffected);
		values.add(partnerID);
		try {
			callSPResponse = this.persistenceService.executeFunctionWitOutParameter_SIMA_Parameters(
					this.getAmountToPayPEEndpointBean.getStoredProcedureName(), values, null, 2);
			response.setRemaining(Double.valueOf(((Double) ((callSPResponse.getResult().get("P_REMAINING") != null)
					? callSPResponse.getResult().get("P_REMAINING")
					: Integer.valueOf(0))).doubleValue()));
			response.setCalcDays(Double.valueOf(((Double) ((callSPResponse.getResult().get("P_CALCDAYS") != null)
					? callSPResponse.getResult().get("P_CALCDAYS")
					: Integer.valueOf(0))).doubleValue()));
			response.setCode((String) callSPResponse.getResult().get("P_ERROR"));
			if (callSPResponse.getResult().get("P_ERROR_DESC") != null)
				response.setMessage((String) callSPResponse.getResult().get("P_ERROR_DESC"));
			response.setReturnValue(Double.valueOf(((Double) ((callSPResponse.getResult().get("RETURN") != null)
					? callSPResponse.getResult().get("RETURN")
					: Integer.valueOf(0))).doubleValue()));
		} catch (Exception e) {
			callSPResponse.setCode(Integer.valueOf(-1));
			callSPResponse.setDescription(e.getMessage());
			logger.error("Error en el consumo de servicio GetAmountToPayEndpoint: " + e.getMessage());
		}
		return response;
	}

}
