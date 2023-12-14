package com.gentera.insurances.endpoints;

import java.util.Date;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import mx.com.gentera.ClaimStatusUpdateRespMsgDataType;
import mx.com.gentera.UpdateClaimStatus;
import mx.com.gentera.insurances.services.ServiceBusiness;

public class UpdateClaimStatusEndpoint implements UpdateClaimStatus {

	private static final Logger logger = LoggerFactory.getLogger(UpdateClaimStatusEndpoint.class);

	@Autowired
	ServiceBusiness service;

	@Override
	public ClaimStatusUpdateRespMsgDataType claimStatusUpdate(String claimID, Integer claimStatusID,
			Date claimStatusDate, String claimStatusUser, String contactEmail, String claimIdentifier,
			String clientName, String affectedName, String lastStatus, String lastStatusDate, String lastStatusComment,
			String paymentType) {
		logger.info("Se recibio una peticion del id {} para el  servicio {}", claimID, "UpdateClaimStatus");
		return service.updateStatus(claimID, claimStatusID, claimStatusDate, claimStatusUser, contactEmail,
				claimIdentifier, clientName, affectedName, lastStatus, lastStatusDate, lastStatusComment, paymentType);
	}
}
