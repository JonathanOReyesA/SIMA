package com.gentera.insurances.endpoints;

import com.gentera.insurances.beans.EndpointBean;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import mx.com.gentera.ClaimConfirmationRspDataType;
import mx.com.gentera.ConfirmationClaim;
import mx.com.gentera.seguros.common.persistence.exceptions.StoredProcedureConfigurationNotFoundException;
import mx.com.gentera.seguros.common.persistence.model.CallSPResponse;
import mx.com.gentera.seguros.common.persistence.services.IPersistenceService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;

public class ConfirmationClaimEndpoint implements ConfirmationClaim {
	private static final Logger logger = LoggerFactory.getLogger(ConfirmationClaimEndpoint.class);

	@Autowired
	EndpointBean confirmationClaimEndpointBean;

	@Autowired
	IPersistenceService persistenceService;

	public ClaimConfirmationRspDataType confirmationClaim(String claimID) {
		logger.info("Se recibio una peticion del id {} para el  servicio {}", claimID,
				"BeneficiaConfirmationClaimriesSearch");
		CallSPResponse callSPResponse = new CallSPResponse();
		ClaimConfirmationRspDataType response = new ClaimConfirmationRspDataType();
		List<Object> values = new ArrayList<Object>();
		values.add(claimID);
		try {
			callSPResponse = this.persistenceService
					.executeSP_SIMA(this.confirmationClaimEndpointBean.getStoredProcedureName(), values, null);
			response.setError((BigDecimal) callSPResponse.getResult().get("P_ERROR"));
			response.setErrorDescription((String) callSPResponse.getResult().get("P_ERR_DESC"));
		} catch (StoredProcedureConfigurationNotFoundException
				| mx.com.gentera.seguros.common.persistence.exceptions.StoredProcedureParametersNotMatchException
				| mx.com.gentera.seguros.common.persistence.exceptions.StoredProcedureParametersTypesMismatchException
				| mx.com.gentera.seguros.common.persistence.exceptions.UnexpectedResponseCodeException e) {
			callSPResponse.setCode(Integer.valueOf(-1));
			callSPResponse.setDescription(e.getMessage());
			logger.error("Error en el consumo de servicio CreateServiceClaimEndpoint: " + e.getMessage());
		}
		return response;
	}
}
