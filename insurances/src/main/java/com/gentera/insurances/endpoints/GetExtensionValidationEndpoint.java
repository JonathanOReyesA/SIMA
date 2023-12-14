package com.gentera.insurances.endpoints;

import java.util.ArrayList;
import java.util.List;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import com.gentera.insurances.beans.EndpointBean;
import mx.com.gentera.ExtensionValidationRespMsgDataType;
import mx.com.gentera.GetExtensionValidation;
import mx.com.gentera.seguros.common.persistence.model.CallSPResponse;
import mx.com.gentera.seguros.common.persistence.services.IPersistenceService;
import oracle.jdbc.OracleTypes;

public class GetExtensionValidationEndpoint implements GetExtensionValidation {
	
	/**
	 * Instancia encargada de generar el log de la aplicacion
	 */
	private static final Logger logger = LoggerFactory.getLogger(ClaimStatusCatalogueEndpoint.class);
	
	
	@Autowired
	EndpointBean getExtensionValidationEndpointBean;

	/**
	 * Servicios de la capa de persistencia
	 */
	
	@Autowired
	IPersistenceService persistenceService;

	@Override
	public ExtensionValidationRespMsgDataType getExtensionValidation(String clientID, String insuranceID,
			String partnerID) {
		logger.info("SE RECIBIO UNA PETICION DEL SERVICIO {} ", "GetExtensionValidation");
		CallSPResponse callSPResponse = new CallSPResponse();
		ExtensionValidationRespMsgDataType response = new ExtensionValidationRespMsgDataType();
		List<Object> values = new ArrayList<>();
		values.add(clientID);
		values.add(insuranceID);
		values.add(partnerID);
		try {
			callSPResponse = persistenceService.executeFunctionWitOutParameter_SIMA_Parameters(getExtensionValidationEndpointBean.getStoredProcedureName(), values, null,OracleTypes.VARCHAR);
			response.setReturnValue((String)callSPResponse.getResult().get("RETURN"));
		} catch (Exception e) {
			callSPResponse.setCode(-1);
			callSPResponse.setDescription(e.getMessage());
			logger.error("Error en el consumo de servicio GetExtensionValidationEndpoint: {} " ,e.getMessage());
		}
		return response;
	}

}
