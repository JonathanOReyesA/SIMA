package com.gentera.insurances.endpoints;

import com.gentera.insurances.beans.EndpointBean;
import java.util.ArrayList;
import java.util.List;
import mx.com.gentera.GetAffectedName;
import mx.com.gentera.GetAffectedResponse;
import mx.com.gentera.seguros.common.persistence.model.CallSPResponse;
import mx.com.gentera.seguros.common.persistence.services.IPersistenceService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;

public class GetAffectedNameEndpoint implements GetAffectedName {
	private static final Logger logger = LoggerFactory.getLogger(GetAffectedNameEndpoint.class);

	@Autowired
	IPersistenceService persistenceService;

	@Autowired
	EndpointBean getAffectedNameEndpointBean;

	@Override
	public GetAffectedResponse getAffectedName(String claimID) {
		logger.info("Se recibio una peticion del id {} para el  servicio {}", claimID, "GetAffectedNameEndpoint");
		CallSPResponse callSPResponse = new CallSPResponse();
		GetAffectedResponse response = new GetAffectedResponse();
		List<Object> values = new ArrayList<Object>();
		values.add(claimID);
		try {
			callSPResponse = this.persistenceService.executeFunctionWitOutParameter_SIMA_Parameters(
					this.getAffectedNameEndpointBean.getStoredProcedureName(), values, null, 12);
			response.setCadena((String) callSPResponse.getResult().get("RETURN"));
		} catch (Exception e) {
			callSPResponse.setCode(Integer.valueOf(-1));
			callSPResponse.setDescription(e.getMessage());
			logger.error("Error en el consumo de servicio GetCauseCatalogueEndpoint: " + e.getMessage());
		}
		return response;
	}
}