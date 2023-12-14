package com.gentera.insurances.endpoints;

import com.gentera.insurances.beans.EndpointBean;
import java.util.ArrayList;
import java.util.List;
import mx.com.gentera.ClaimPaymentLogRespMsgDataType;
import mx.com.gentera.ClaimPaymentlog;
import mx.com.gentera.seguros.common.persistence.services.IPersistenceService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;

public class ClaimPaymentlogEndpoint implements ClaimPaymentlog {
	private static final Logger logger = LoggerFactory.getLogger(ClaimPaymentlogEndpoint.class);

	@Autowired
	EndpointBean claimPaymentlogEndpointBean;

	@Autowired
	IPersistenceService persistenceService;

	public ClaimPaymentLogRespMsgDataType claimPaymentlog(String claimID, String userID) {
		logger.info("Se recibio una peticion del id {} para el  servicio {}", claimID, "ClaimPaymentlog");
		ClaimPaymentLogRespMsgDataType response = new ClaimPaymentLogRespMsgDataType();
		List<Object> values = new ArrayList<Object>();
		values.add(userID);
		values.add(claimID);
		try {
			this.persistenceService.executeSP_SIMA(this.claimPaymentlogEndpointBean.getStoredProcedureName(), values,
					null);
			response.setCode("0");
			response.setMessage("Exito");
		} catch (Exception e) {
			response.setCode("-1");
			response.setMessage(e.getMessage());
			logger.error("Error en el consumo de servicio ClaimPaymentlogEndpoint: " + e.getMessage());
		}
		return response;
	}
}
