package com.gentera.medicos.endpoints;

import java.util.ArrayList;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;

import com.gentera.medicos.beans.EndpointBean;

import mx.com.gentera.ErrorDataType;
import mx.com.gentera.UpdateIMClaim;
import mx.com.gentera.UpdateIMClaimRespMsgDataType;
import mx.com.gentera.seguros.common.persistence.model.CallSPResponse;
import mx.com.gentera.seguros.common.persistence.services.IPersistenceService;

public class UpdateIMClaimEndpoint implements UpdateIMClaim {

	/**
	 * Instancia encargada de generar el log de la aplicacion
	 */
	private static final Logger logger = LoggerFactory.getLogger(UpdateIMClaimEndpoint.class);

	@Autowired
	EndpointBean updateClaimEndpointBean;

	/**
	 * Servicios de la capa de persistencia
	 */

	@Autowired
	IPersistenceService persistenceService;

	@Override
	public UpdateIMClaimRespMsgDataType updateIMClaim(String claimID, Integer idMedico, String partnerID) {
		logger.info("SE RECIBIO UNA PETICION DEL SERVICIO {}", "updateIMClaim");

		CallSPResponse callSPResponse = new CallSPResponse();
		UpdateIMClaimRespMsgDataType response = new UpdateIMClaimRespMsgDataType();

		List<Object> values = new ArrayList<>();
		values.add(claimID);
		values.add(idMedico);
		values.add(partnerID);

		try {
			callSPResponse = persistenceService.executeSP_SIMA(updateClaimEndpointBean.getStoredProcedureName(), values,
					null);
			ErrorDataType item = new ErrorDataType();
			item.setCode(callSPResponse.getResult().get("P_ERROR") + "");
			item.setMessage((String) callSPResponse.getResult().get("P_ERROR_DESC"));
			response.getErrorList().add(item);

		} catch (Exception e) {
			callSPResponse.setCode(-1);
			callSPResponse.setDescription(e.getMessage());
			logger.error("Error en el consumo de servicio UpdateIMClaimEndpoint: " + e.getMessage());
		}

		return response;
	}

}
