 package com.gentera.insurances.endpoints;

import java.util.ArrayList;
import java.util.List;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import com.gentera.insurances.beans.EndpointBean;
import mx.com.gentera.ClaimDocumentCreationRespMsgDataType;
import mx.com.gentera.DocumentDataType;
import mx.com.gentera.DocumentsCreation;
import mx.com.gentera.seguros.common.persistence.model.CallSPResponse;
import mx.com.gentera.seguros.common.persistence.services.IPersistenceService;

public class DocumentsCreationEndpoint implements DocumentsCreation{
	
	/**
	 * Instancia encargada de generar el log de la aplicacion
	 */
	private static final Logger logger = LoggerFactory.getLogger(DocumentsCreationEndpoint.class);
	
	
	@Autowired
	EndpointBean documentsCreationEndpointBean;

	/**
	 * Servicios de la capa de persistencia
	 */
	
	@Autowired
	IPersistenceService persistenceService;

	@Override
	public ClaimDocumentCreationRespMsgDataType createDocument(List<DocumentDataType> documentsList) {
		logger.info("Se recibio una peticion del servicio {}", "DocumentsCreation");
		ClaimDocumentCreationRespMsgDataType response = new ClaimDocumentCreationRespMsgDataType();
		CallSPResponse callSPResponse = new CallSPResponse();
		for (DocumentDataType d : documentsList) {
			try {
				List<Object> values = new ArrayList<>();
				values.add(d.getInsuranceID());
				values.add(d.getClaimID());
				values.add(d.getDocumentName());
				values.add(d.getDocumentDate());
				values.add(d.getDocumentUserID());
				values.add(d.getUser());
				values.add(d.getStatusID());
				values.add(d.getPath());
				callSPResponse =  persistenceService.executeSP_SIMA(documentsCreationEndpointBean.getStoredProcedureName(), values, null);
				response.setCode(callSPResponse.getResult().get("P_ERROR") + "");
				response.setMessage((String)callSPResponse.getResult().get("P_ERROR_DESC"));
			} catch(Exception e) {
				logger.error("Ocurrio un error en la creacion de documentos "+ e.getMessage());
			}
			
		}
		
		
		return response;
	}
	
	

}
