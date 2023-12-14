package com.gentera.insurances.endpoints;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;

import com.gentera.insurances.beans.EndpointBean;

import mx.com.gentera.CreateComment;
import mx.com.gentera.CreateCommentRespMsgDataType;
import mx.com.gentera.seguros.common.persistence.model.CallSPResponse;
import mx.com.gentera.seguros.common.persistence.services.IPersistenceService;

public class CreateCommentEndpoint implements CreateComment{
	
	/**
	 * Instancia encargada de generar el log de la aplicacion
	 */
	private static final Logger logger = LoggerFactory.getLogger(CreateComment.class);
	
	
	@Autowired
	EndpointBean createCommentEndpointBean;

	/**
	 * Servicios de la capa de persistencia
	 */
	
	@Autowired
	IPersistenceService persistenceService;




	@Override
	public CreateCommentRespMsgDataType commentCreation(String claimID, String comment, String userID,
			Date date, String statusID) {
		logger.info("Se recibio una peticion del id {} para el  servicio {}",claimID ,"CreateComment");
			CallSPResponse callSPResponse = new CallSPResponse();
			CreateCommentRespMsgDataType response = new CreateCommentRespMsgDataType();
			List<Object> values = new ArrayList<>();
			values.add(claimID);
			values.add(comment);
			values.add(userID);
			values.add(date);
			values.add(statusID);
			try {
				callSPResponse = persistenceService.executeSP_SIMA(createCommentEndpointBean.getStoredProcedureName(), values, null);
				response.setCode(callSPResponse.getResult().get("P_ERROR")+"");
				response.setMessage((String)callSPResponse.getResult().get("P_ERROR_DESC"));
			} catch (Exception e) {
				callSPResponse.setCode(-1);
				callSPResponse.setDescription(e.getMessage());
				logger.error("Error en el consumo de servicio CreateComment: "+e.getMessage());
			}
			return response;
	}






}
