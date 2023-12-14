package com.gentera.insurances.endpoints;

import mx.com.gentera.ClaimAutomaticPayment;
import mx.com.gentera.ClaimInsurancePaymentResMsgDataType;
import mx.com.gentera.insurances.services.ServiceBusiness;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;

public class ClaimAutomaticPaymentEndpoint implements ClaimAutomaticPayment {
	@Autowired
	ServiceBusiness service;

	private static final Logger logger = LoggerFactory.getLogger(ClaimAutomaticPaymentEndpoint.class);

	public ClaimInsurancePaymentResMsgDataType claimAutomaticPayment(String filePath, String fileName, String partnerID,
			String userID) {
		logger.info("Se recibio una peticion del id {} para el  servicio {}", userID, "ClaimAutomaticPayment");
		logger.info("Peticion con datos {},{},{},{}", new Object[] { filePath, fileName, partnerID, userID });
		return this.service.claimAutomicPayment(filePath, fileName, partnerID, userID);
	}
}