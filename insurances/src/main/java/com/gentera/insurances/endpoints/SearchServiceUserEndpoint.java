package com.gentera.insurances.endpoints;

import java.math.BigDecimal;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.RowMapper;

import com.gentera.insurances.beans.EndpointBean;
import mx.com.gentera.SearchServiceUser;
import mx.com.gentera.ServiceUsersSearchRspDataType;
import mx.com.gentera.ServiceUsersSearchRspType;
import mx.com.gentera.seguros.common.persistence.exceptions.StoredProcedureConfigurationNotFoundException;
import mx.com.gentera.seguros.common.persistence.model.CallSPResponse;
import mx.com.gentera.seguros.common.persistence.services.IPersistenceService;
public class SearchServiceUserEndpoint implements SearchServiceUser{

	/**
	 * Instancia encargada de generar el log de la aplicacion
	 */
	private static final Logger logger = LoggerFactory.getLogger(SearchServiceUserEndpoint.class);
	
	
	@Autowired
	EndpointBean searchServiceUserEndpointBean;

	/**
	 * Servicios de la capa de persistencia
	 */
	
	@Autowired
	IPersistenceService persistenceService;

	@SuppressWarnings("unchecked")
	@Override
	public ServiceUsersSearchRspType searchServiceUser(String claimID, String insuranceID, String businessPartnerID,
			String serviceUserID) {
		logger.info("Se recibio una peticion del id {} para el  servicio {}",insuranceID ,"SearchServiceUser");
		CallSPResponse callSPResponse = new CallSPResponse();
		ServiceUsersSearchRspType response = new ServiceUsersSearchRspType();
		List<Object> values = new ArrayList<>();
		values.add(claimID);
		values.add(insuranceID);
		values.add(businessPartnerID);
		values.add(serviceUserID);
		
		try {
			callSPResponse = persistenceService.executeFunction_SIMA(searchServiceUserEndpointBean.getStoredProcedureName(), values, 
					new RowMapper<ServiceUsersSearchRspDataType>() {
						@Override
						public ServiceUsersSearchRspDataType mapRow(ResultSet rset, int i) throws SQLException {
							ServiceUsersSearchRspDataType e = new ServiceUsersSearchRspDataType();
							try {
								e.setClaimID(validarNull(rset.getString("CLAIMID")));
				                e.setServiceUserID(BigDecimal.valueOf(Double.valueOf(rset.getString("SERVICEUSERID"))));
				                e.setGivenName(validarNull(rset.getString("GIVENNAME")));
				                e.setMiddleName(validarNull(rset.getString("MIDDLENAME")));
				                e.setFamilyName(validarNull(rset.getString("FAMILYNAME")));
				                e.setAdditionalFamilyName(validarNull(rset.getString("ADDITIONALFAMILYNAME")));
				                e.setBirthDate(rset.getDate("BIRTHDATE"));
				                e.setAge(BigDecimal.valueOf(Double.valueOf(rset.getString("AGE"))));
				                e.setGender(validarNull(rset.getString("GENDER")));
				                e.setBusinessPartnerID(validarNull(rset.getString("BUSINESSPARTNERID")));
				                e.setClaimStatusName(validarNull(rset.getString("CLAIMSTATUSNAME")));
							} catch (Exception ex) {
								throw new SQLException(
										"Error al tratar de convertir registro desde Cursor: " + ex.getMessage());
							}

							return e;
						}
					});
			response.getServiceUsersSearchList().addAll((Collection<ServiceUsersSearchRspDataType>) callSPResponse.getResult().get("SYS_REFCURSOR"));
		} catch (StoredProcedureConfigurationNotFoundException e) {
			callSPResponse.setCode(-1);
			callSPResponse.setDescription(e.getMessage());
			logger.error("Error en el consumo de servicio ServiceUsersSearchRspType: "+e.getMessage());
		}
		
		return response;
	}
	
	 public String validarNull(String data) {
	        return data == null ? "" : data;

	    }
}
