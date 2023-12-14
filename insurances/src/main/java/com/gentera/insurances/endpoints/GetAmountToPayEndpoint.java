package com.gentera.insurances.endpoints;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import com.gentera.insurances.beans.EndpointBean;
import mx.com.gentera.AmountToPayQueryRespMsgDataType;
import mx.com.gentera.GetAmountToPay;
import mx.com.gentera.seguros.common.persistence.model.CallSPResponse;
import mx.com.gentera.seguros.common.persistence.services.IPersistenceService;
import oracle.jdbc.OracleTypes;

public class GetAmountToPayEndpoint implements GetAmountToPay {

	/**
	 * Instancia encargada de generar el log de la aplicacion
	 */
	private static final Logger logger = LoggerFactory.getLogger(GetAmountToPayEndpoint.class);

	@Autowired
	EndpointBean getAmountToPayEndpointBean;

	/**
	 * Servicios de la capa de persistencia
	 */

	@Autowired
	IPersistenceService persistenceService;

	@SuppressWarnings("deprecation")
	@Override
	public AmountToPayQueryRespMsgDataType getAmountToPay(String insuranceID, String businessPartnerID,
			String productID, String coverageID, String flagCoverage, Double claimDays, String initialDate,
			String endDate, String partnerID) {
		logger.info("Se recibio una peticion del id {} para el  servicio {}",insuranceID ,"GetAmountToPay");
		CallSPResponse callSPResponse = new CallSPResponse();
		AmountToPayQueryRespMsgDataType response = new AmountToPayQueryRespMsgDataType();
		List<Object> values = new ArrayList<>();
		values.add(insuranceID);
		values.add(businessPartnerID);
		values.add(productID);
		values.add(coverageID);
		values.add(flagCoverage);
		try {
			values.add((int) claimDays.doubleValue());
		} catch (Exception e) {
			values.add(null);
		}

		try {
			values.add(new java.sql.Date(new java.util.Date(initialDate).getTime()));
		} catch (Exception e) {
			values.add(null);
		}
		try {
			values.add(new java.sql.Date(new java.util.Date(endDate).getTime()));
		} catch (Exception e) {
			values.add(null);
		}
		values.add(partnerID);

		try {
			callSPResponse = persistenceService.executeFunctionWitOutParameter_SIMA_Parameters(
					getAmountToPayEndpointBean.getStoredProcedureName(), values, null, OracleTypes.NUMERIC);
			response.setRemaining(((callSPResponse.getResult().get("P_REMAINING") != null
					? (BigDecimal) callSPResponse.getResult().get("P_REMAINING")
					: 0)).doubleValue());
			response.setCalcDays(((callSPResponse.getResult().get("P_CALCDAYS") != null
					? (BigDecimal) callSPResponse.getResult().get("P_CALCDAYS")
					: 0)).doubleValue());
			response.setCode(callSPResponse.getResult().get("P_ERROR") + "");
			if (callSPResponse.getResult().get("P_ERROR_DESC") != null) {
				response.setMessage(callSPResponse.getResult().get("P_ERROR_DESC") + "");
			}
			response.setReturnValue(((callSPResponse.getResult().get("RETURN") != null
					? (BigDecimal) callSPResponse.getResult().get("RETURN")
					: 0)).doubleValue());
		} catch (Exception e) {
			callSPResponse.setCode(-1);
			callSPResponse.setDescription(e.getMessage());
			logger.error("Error en el consumo de servicio GetAmountToPayEndpoint: " + e.getMessage());
		}

		return response;
	}

}
