package com.gentera.insurances.endpoints;

import mx.com.gentera.insurances.services.ServiceBusiness;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import pe.com.gentera.ClaimAutomaticPaymentPE;
import pe.com.gentera.ClaimInsurancePaymentResMsgDataTypePE;

public class ClaimAutomaticPaymentPEEndpoint implements ClaimAutomaticPaymentPE {
	@Autowired
	ServiceBusiness service;

	private static final Logger logger = LoggerFactory.getLogger(ClaimAutomaticPaymentPEEndpoint.class);

	public ClaimInsurancePaymentResMsgDataTypePE claimAutomaticPayment(String filePath, String fileName,
			String partnerID, String userID) {
		logger.info("Se recibio una peticion del id {} para el  servicio {}", userID,
				"ClaimAutomaticPaymentPEEndpoint");
		logger.info("Peticion con datos {},{},{},{}", new Object[] { filePath, fileName, partnerID, userID });
		return this.service.claimAutomicPaymentPE(filePath, fileName, partnerID, userID);
	}
}