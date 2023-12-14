package com.gentera.insurances.endpoints;

import java.math.BigDecimal;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import com.gentera.insurances.beans.EndpointBean;
import mx.com.gentera.ServiceUsersUpdateRspDataType;
import mx.com.gentera.UpdateServiceUser;
import mx.com.gentera.seguros.common.persistence.exceptions.StoredProcedureConfigurationNotFoundException;
import mx.com.gentera.seguros.common.persistence.exceptions.StoredProcedureParametersNotMatchException;
import mx.com.gentera.seguros.common.persistence.exceptions.StoredProcedureParametersTypesMismatchException;
import mx.com.gentera.seguros.common.persistence.exceptions.UnexpectedResponseCodeException;
import mx.com.gentera.seguros.common.persistence.model.CallSPResponse;
import mx.com.gentera.seguros.common.persistence.services.IPersistenceService;

public class UpdateServiceUserEndpoint implements UpdateServiceUser{

	
	/**
	 * Instancia encargada de generar el log de la aplicacion
	 */
	private static final Logger logger = LoggerFactory.getLogger(UpdateServiceUserEndpoint.class);
	
	
	@Autowired
	EndpointBean updateServiceUserEndpointBean;

	/**
	 * Servicios de la capa de persistencia
	 */
	
	@Autowired
	IPersistenceService persistenceService;
	
	SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

	@Override
	public ServiceUsersUpdateRspDataType updateServiceUser(String claimID, String serviceUserID, String givenName,
			String middleName, String familyName, String additionalFamilyName, String birthDate, String gender,
			BigDecimal age, String curp) {
		logger.info("Se recibio una peticion del id {} para el  servicio {}",claimID ,"UpdateServiceUser");
		CallSPResponse callSPResponse = new CallSPResponse();
		ServiceUsersUpdateRspDataType response = new ServiceUsersUpdateRspDataType();
		List<Object> values = new ArrayList<>();
		values.add(claimID);
		values.add(serviceUserID);
		values.add(givenName);
		values.add(middleName);
		values.add(familyName);
		values.add(additionalFamilyName);
		try {
			if (birthDate!= null && !birthDate.equals("")) {
				values.add(new java.sql.Date(sdf.parse(birthDate).getTime()));
			}else {
				values.add(null);
			}
			
        } catch (Exception e) {
            values.add(null);
        }
		values.add(gender);
		values.add(age);
		
		try {
			callSPResponse = persistenceService.executeSP_SIMA(updateServiceUserEndpointBean.getStoredProcedureName(), values, null);
			response.setError((BigDecimal)callSPResponse.getResult().get("P_ERROR"));
			response.setErrorDesc((String)callSPResponse.getResult().get("P_ERROR_DESC"));
			response.setServiceUserIDNew((BigDecimal)callSPResponse.getResult().get("P_SERVICEUSERID_NEW"));
		} catch (StoredProcedureConfigurationNotFoundException | StoredProcedureParametersNotMatchException | StoredProcedureParametersTypesMismatchException | UnexpectedResponseCodeException e) {
			callSPResponse.setCode(-1);
			callSPResponse.setDescription(e.getMessage());
			logger.error("Error en el consumo de servicio CreateServiceClaimEndpoint: "+e.getMessage());
		}	
		return response;
	}
}
