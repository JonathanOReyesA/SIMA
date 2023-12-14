package com.gentera.insurances.endpoints;

import com.gentera.insurances.beans.EndpointBean;
//import java.sql.Date;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import mx.com.gentera.ClaimUpdate;
import mx.com.gentera.ClaimUpdateRespMsgDataType;
import mx.com.gentera.seguros.common.persistence.exceptions.StoredProcedureConfigurationNotFoundException;
import mx.com.gentera.seguros.common.persistence.model.CallSPResponse;
import mx.com.gentera.seguros.common.persistence.services.IPersistenceService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;

public class ClaimUpdateEndpoint implements ClaimUpdate {
	private static final Logger logger = LoggerFactory.getLogger(ClaimUpdateEndpoint.class);

	@Autowired
	EndpointBean claimUpdateEndpointBean;

	@Autowired
	IPersistenceService persistenceService;

	public ClaimUpdateRespMsgDataType claimUpdate(String claimID, Date claimDate, String documentName,
			Date documentDate, String givenName, String middleName, String familyName, String additionalFamilyName,
			String claimCauseID, String trackingEmail, String idPersonPayable) {
		logger.info("Se recibio una peticion del id {} para el  servicio {}", claimID, "ClaimUpdateEndpoint");
		CallSPResponse callSPResponse = new CallSPResponse();
		ClaimUpdateRespMsgDataType response = new ClaimUpdateRespMsgDataType();
		List<Object> values = new ArrayList<Object>();
		values.add(claimID);
		try {
			values.add(new Date(claimDate.getTime()));
		} catch (Exception e) {
			values.add(null);
		}
		values.add(documentName);
		try {
			values.add(new Date(documentDate.getTime()));
		} catch (Exception e) {
			values.add(null);
		}
		values.add(givenName);
		values.add(middleName);
		values.add(familyName);
		values.add(additionalFamilyName);
		values.add(trackingEmail);
		values.add(Integer.valueOf(Integer.parseInt(claimCauseID)));
		values.add(idPersonPayable);
		try {
			callSPResponse = this.persistenceService
					.executeSP_SIMA(this.claimUpdateEndpointBean.getStoredProcedureName(), values, null);
			response.setCode((String) callSPResponse.getResult().get("P_ERROR"));
			response.setMessage((String) callSPResponse.getResult().get("P_ERROR_DESC"));
		} catch (StoredProcedureConfigurationNotFoundException
				| mx.com.gentera.seguros.common.persistence.exceptions.StoredProcedureParametersNotMatchException
				| mx.com.gentera.seguros.common.persistence.exceptions.StoredProcedureParametersTypesMismatchException
				| mx.com.gentera.seguros.common.persistence.exceptions.UnexpectedResponseCodeException e) {
			callSPResponse.setCode(Integer.valueOf(-1));
			callSPResponse.setDescription(e.getMessage());
			logger.error("Error en el consumo de servicio UpdateBeneficiariesEndpoint: " + e.getMessage());
		}
		return response;
	}
}