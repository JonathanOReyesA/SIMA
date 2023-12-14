package com.gentera.insurances.endpoints;

import java.math.BigDecimal;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import com.gentera.insurances.beans.EndpointBean;
import mx.com.gentera.CreateServiceClaim;
import mx.com.gentera.ServiceClaimCreateRspDataType;
import mx.com.gentera.seguros.common.persistence.exceptions.StoredProcedureConfigurationNotFoundException;
import mx.com.gentera.seguros.common.persistence.exceptions.StoredProcedureParametersNotMatchException;
import mx.com.gentera.seguros.common.persistence.exceptions.StoredProcedureParametersTypesMismatchException;
import mx.com.gentera.seguros.common.persistence.exceptions.UnexpectedResponseCodeException;
import mx.com.gentera.seguros.common.persistence.model.CallSPResponse;
import mx.com.gentera.seguros.common.persistence.services.IPersistenceService;

public class CreateServiceClaimEndpoint implements CreateServiceClaim{
	
	/**
	 * Instancia encargada de generar el log de la aplicacion
	 */
	private static final Logger logger = LoggerFactory.getLogger(UpdateBeneficiariesEndpoint.class);
	
	
	@Autowired
	EndpointBean createServiceClaimEndpointBean;

	/**
	 * Servicios de la capa de persistencia
	 */
	
	@Autowired
	IPersistenceService persistenceService;

	@Override
	public ServiceClaimCreateRspDataType createServiceClaim(String insuranceID, String coverageID, String claimDate,
			String affected, BigDecimal claimCauseID, String statusID, String statusDate, String user,
			String trackingEmail, String processInstanceID, String businessPartnerID, String flagCoverage) {
		logger.info("Se recibio una peticion del id {} para el  servicio {}",insuranceID ,"CreateServiceClaim");
		CallSPResponse callSPResponse = new CallSPResponse();
		ServiceClaimCreateRspDataType response = new ServiceClaimCreateRspDataType();
		List<Object> values = new ArrayList<>();
		values.add(insuranceID);
		values.add(coverageID);
		 try {
			 values.add( new java.sql.Date(convertFecha(claimDate).getTime()));
         } catch (Exception e) {
        	 values.add(new java.sql.Date(new Date().getTime()));
         }
		values.add(affected);
		values.add(claimCauseID);
		values.add(statusID);
		try {
			values.add (new java.sql.Date(convertFecha(statusDate).getTime()));
        } catch (Exception e) {
        	values.add( new java.sql.Date(new Date().getTime()));
        }
		values.add(user);
		values.add(trackingEmail);
		values.add(processInstanceID);
		values.add(businessPartnerID);
		values.add(flagCoverage);
		
		try {
			callSPResponse = persistenceService.executeSP_SIMA(createServiceClaimEndpointBean.getStoredProcedureName(), values, null);
			
			response.setError((BigDecimal)callSPResponse.getResult().get("P_ERROR"));
			response.setErrorDesc((String)callSPResponse.getResult().get("P_ERROR_DESC"));
			response.setClaimID((String)callSPResponse.getResult().get("P_IDCLAIM"));
		} catch (StoredProcedureConfigurationNotFoundException | StoredProcedureParametersNotMatchException | StoredProcedureParametersTypesMismatchException | UnexpectedResponseCodeException e) {
			callSPResponse.setCode(-1);
			callSPResponse.setDescription(e.getMessage());
			logger.error("Error en el consumo de servicio CreateServiceClaimEndpoint: "+e.getMessage());
		}	
		return response;
	}
	
	 public Date convertFecha(String request) throws ParseException {
	        @SuppressWarnings("deprecation")
			java.util.Date fecha = new java.util.Date(request);
	        DateFormat formatter = new SimpleDateFormat("EEE MMM dd HH:mm:ss Z yyyy", Locale.US);
	        Date date;
	        date = (Date) formatter.parse(fecha.toString());
	        System.out.println(date);

	        Calendar cal = Calendar.getInstance();
	        cal.setTime(date);
	        String formatedDate = cal.get(Calendar.DATE) + "/"
	                + (cal.get(Calendar.MONTH) + 1)
	                + "/" + cal.get(Calendar.YEAR);
	        SimpleDateFormat formatoDelTexto = new SimpleDateFormat("dd/MM/yyyy");
	        Date fec = null;
	        fec = formatoDelTexto.parse(formatedDate);
	        return fec;

	    }
}
