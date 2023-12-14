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
import mx.com.gentera.ClaimRejection;
import mx.com.gentera.ClaimRejectionRespMsgDataType;
import mx.com.gentera.seguros.common.persistence.exceptions.StoredProcedureConfigurationNotFoundException;
import mx.com.gentera.seguros.common.persistence.model.CallSPResponse;
import mx.com.gentera.seguros.common.persistence.services.IPersistenceService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;

public class ClaimRejectionEndpoint implements ClaimRejection {
	private static final Logger logger = LoggerFactory.getLogger(ClaimRejectionEndpoint.class);

	@Autowired
	EndpointBean claimRejectionEndpointBean;

	@Autowired
	IPersistenceService persistenceService;

	public ClaimRejectionRespMsgDataType claimRejection(String claimID, String claimRejectionTypeID,
			String rejectionAmount, String rejectionDate, String rejectionDocumentName) {
		logger.info("Peticion del servicio {} con valores {}", "ClaimRejection", claimID);
		CallSPResponse callSPResponse = new CallSPResponse();
		ClaimRejectionRespMsgDataType response = new ClaimRejectionRespMsgDataType();
		List<Object> values = new ArrayList<Object>();
		values.add(claimID);
		values.add(claimRejectionTypeID);
		values.add(Double.valueOf(Double.parseDouble(rejectionAmount)));
		try {
			values.add(4, new Date(convertFecha(rejectionDate).getTime()));
			values.add(new Date((new Date()).getTime()));
		} catch (Exception e) {
			values.add(new Date((new Date()).getTime()));
		}
		values.add(rejectionDocumentName);
		try {
			callSPResponse = this.persistenceService
					.executeSP_SIMA(this.claimRejectionEndpointBean.getStoredProcedureName(), values, null);
			response.setCode((String) callSPResponse.getResult().get("P_ERROR"));
			response.setMessage((String) callSPResponse.getResult().get("P_ERROR_DESC"));
		} catch (StoredProcedureConfigurationNotFoundException
				| mx.com.gentera.seguros.common.persistence.exceptions.StoredProcedureParametersNotMatchException
				| mx.com.gentera.seguros.common.persistence.exceptions.StoredProcedureParametersTypesMismatchException
				| mx.com.gentera.seguros.common.persistence.exceptions.UnexpectedResponseCodeException e) {
			callSPResponse.setCode(Integer.valueOf(-1));
			callSPResponse.setDescription(e.getMessage());
			logger.error("Error en el consumo de servicio ClaimRejectionEndpoint: {} ", e.getMessage());
		}
		return response;
	}

	@SuppressWarnings("deprecation")
	public Date convertFecha(String request) throws ParseException {
		Date fecha = new Date(request);
		DateFormat formatter = new SimpleDateFormat("EEE MMM dd HH:mm:ss Z yyyy", Locale.US);
		Date date = formatter.parse(fecha.toString());
		Calendar cal = Calendar.getInstance();
		cal.setTime(date);
		String formatedDate = String.valueOf(cal.get(5)) + "/" + (cal.get(2) + 1) + "/" + cal.get(1);
		SimpleDateFormat formatoDelTexto = new SimpleDateFormat("dd/MM/yyyy");
		Date fec = null;
		fec = formatoDelTexto.parse(formatedDate);
		return fec;
	}
}
