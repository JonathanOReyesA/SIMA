package com.gentera.insurances.endpoints;


import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import com.gentera.insurances.beans.EndpointBean;
import mx.com.gentera.ManualPaymentValidation;
import mx.com.gentera.ManualPaymentValidationRespMsgDataType;
import mx.com.gentera.seguros.common.persistence.model.CallSPResponse;
import mx.com.gentera.seguros.common.persistence.services.IPersistenceService;
import oracle.jdbc.OracleTypes;

public class ManualPaymentValidationEndpoint implements ManualPaymentValidation{

	
	/**
	 * Instancia encargada de generar el log de la aplicacion
	 */
	private static final Logger logger = LoggerFactory.getLogger(ManualPaymentValidationEndpoint.class);
	
	
	@Autowired
	EndpointBean manualPaymentValidationEndpointBean;

	/**
	 * Servicios de la capa de persistencia
	 */
	
	@Autowired
	IPersistenceService persistenceService;

	@Override
	public ManualPaymentValidationRespMsgDataType manualPaymentValidation(String externalClaimID, String odp,
			String partnerID) {
		logger.info("Se recibio una peticion del id {} para el  servicio {}",externalClaimID ,"ManualPaymentValidation");
		CallSPResponse callSPResponse = new CallSPResponse();
		ManualPaymentValidationRespMsgDataType response = new ManualPaymentValidationRespMsgDataType();
		List<Object> values = new ArrayList<>();
		values.add(externalClaimID);
		values.add(odp);
		values.add(partnerID);
		
		try {
			callSPResponse = persistenceService.executeFunctionWitOutParameter_SIMA_Parameters(manualPaymentValidationEndpointBean.getStoredProcedureName(), values, null,OracleTypes.NUMERIC);
			response.setCode(((BigDecimal)callSPResponse.getResult().get("RETURN")) + "" );
		} catch (Exception  e) {
			callSPResponse.setCode(-1);
			callSPResponse.setDescription(e.getMessage());
			logger.error("Error en el consumo de servicio CreateServiceClaimEndpoint: "+e.getMessage());
		}	
		return response;
	}
}
