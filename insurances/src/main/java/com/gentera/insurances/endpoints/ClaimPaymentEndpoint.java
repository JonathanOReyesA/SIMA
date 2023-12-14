package com.gentera.insurances.endpoints;

import com.gentera.insurances.beans.EndpointBean;
//import java.sql.Date;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import mx.com.gentera.ClaimPayment;
import mx.com.gentera.ClaimPaymentRespMsgDataType;
import mx.com.gentera.seguros.common.persistence.model.CallSPResponse;
import mx.com.gentera.seguros.common.persistence.services.IPersistenceService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;

public class ClaimPaymentEndpoint implements ClaimPayment {
	private static final Logger logger = LoggerFactory.getLogger(ClaimPaymentEndpoint.class);

	@Autowired
	EndpointBean claimPaymentEndpointBean;

	@Autowired
	IPersistenceService persistenceService;

	public ClaimPaymentRespMsgDataType claimPayment(String claimID, String odp, String paymentDate,
			Double paymentAmount, Date claimPaymentDate, String claimPaymentFileName, Double paidDays,
			String externalInsuranceID) {
		logger.info("Se recibio una peticion del id {} para el  servicio {}", claimID, "ClaimPayment");
		logger.info("Peticion con datos {},{}", claimID, odp);
		CallSPResponse callSPResponse = new CallSPResponse();
		ClaimPaymentRespMsgDataType response = new ClaimPaymentRespMsgDataType();
		List<Object> values = new ArrayList<Object>();
		values.add(claimID);
		values.add(odp);
		try {
			values.add(new Date(convertFecha(paymentDate).getTime()));
		} catch (Exception e) {
			values.add(new Date((new Date()).getTime()));
		}
		values.add(paymentAmount);
		try {
			values.add(new Date(claimPaymentDate.getTime()));
		} catch (Exception e) {
			values.add(null);
		}
		values.add(claimPaymentFileName);
		values.add(paidDays);
		values.add(externalInsuranceID);
		try {
			callSPResponse = this.persistenceService
					.executeSP_SIMA(this.claimPaymentEndpointBean.getStoredProcedureName(), values, null);
			response.setCode((String) callSPResponse.getResult().get("P_ERROR"));
			response.setMessage((String) callSPResponse.getResult().get("P_ERROR_DESC"));
		} catch (Exception e) {
			callSPResponse.setCode(Integer.valueOf(-1));
			callSPResponse.setDescription(e.getMessage());
			logger.error("Error en el consumo de servicio ClaimPaymentEndpoint: " + e.getMessage());
		}
		return response;
	}

	@SuppressWarnings("deprecation")
	public Date convertFecha(String request) throws ParseException {
		Date fecha = new Date(request);
		DateFormat formatter = new SimpleDateFormat("EEE MMM dd HH:mm:ss Z yyyy", Locale.US);
		Date date = formatter.parse(fecha.toString());
		System.out.println(date);
		Calendar cal = Calendar.getInstance();
		cal.setTime(date);
		String formatedDate = String.valueOf(cal.get(5)) + "/" + (cal.get(2) + 1) + "/" + cal.get(1);
		SimpleDateFormat formatoDelTexto = new SimpleDateFormat("dd/MM/yyyy");
		Date fec = null;
		fec = formatoDelTexto.parse(formatedDate);
		return fec;
	}
}
