package com.gentera.medicos.endpoints;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.RowMapper;

import com.gentera.medicos.beans.EndpointBean;

import mx.com.gentera.ClaimsDataType;
import mx.com.gentera.ClaimsRespMsgDataType;
import mx.com.gentera.SearchClaims;
import mx.com.gentera.seguros.common.persistence.exceptions.StoredProcedureConfigurationNotFoundException;
import mx.com.gentera.seguros.common.persistence.model.CallSPResponse;
import mx.com.gentera.seguros.common.persistence.services.IPersistenceService;

public class SearchClaimsEndpoint implements SearchClaims {

	/**
	 * Instancia encargada de generar el log de la aplicacion
	 */
	private static final Logger logger = LoggerFactory.getLogger(SearchClaimsEndpoint.class);

	@Autowired
	EndpointBean searchClaimsEndpointBean;

	/**
	 * Servicios de la capa de persistencia
	 */

	@Autowired
	IPersistenceService persistenceService;

	@SuppressWarnings("unchecked")
	@Override
	public ClaimsRespMsgDataType searchClaims(String option, String paramKey, String partnerID) {
		logger.info("Se recibio una peticion para el  servicio {}", "searchClaims");
		logger.info("Peticion con datos {},{},{}", option, paramKey, partnerID);
		CallSPResponse callSPResponse = new CallSPResponse();
		ClaimsRespMsgDataType response = new ClaimsRespMsgDataType();
		List<Object> values = new ArrayList<>();
		values.add(option);
		values.add(paramKey);
		values.add(partnerID);

		try {
			callSPResponse = persistenceService.executeFunction_SIMA(searchClaimsEndpointBean.getStoredProcedureName(),
					values, new RowMapper<ClaimsDataType>() {
						@Override
						public ClaimsDataType mapRow(ResultSet resultSet, int i) throws SQLException {
							ClaimsDataType item = new ClaimsDataType();
							try {

								item.setConsecutive(resultSet.getInt("CONSECUTIVO"));
								item.setSinisterNumber(resultSet.getString("NO_SINIESTRO"));
								item.setSinisterCause(resultSet.getString("CAUSA"));
								item.setClaimedCoverage(resultSet.getString("COBERTURA"));
								item.setClaimDate(resultSet.getDate("FEC_SINIESTRO"));
								item.setSinesterStatus(resultSet.getString("STATUS_SINIESTRO"));
								item.setClientId(resultSet.getString("ID_CLIENTE"));
								item.setClientName(resultSet.getString("NOMBRE_CLIENTE"));
								item.setMedicalCertificate(resultSet.getString("CEDULA"));
								item.setMedicalName(resultSet.getString("MEDICO"));
								item.setIndicator(resultSet.getString("INDICADOR"));
								item.setOsName(resultSet.getString("OS"));
								item.setPromoter(resultSet.getString("PROMOTOR"));
								if (!resultSet.getString("SINIESTRALIDAD").isEmpty()
										&& resultSet.getString("SINIESTRALIDAD") != " ")
									item.setSiniestralidad(resultSet.getString("SINIESTRALIDAD"));

							} catch (Exception e) {
								throw new SQLException(
										"Error al tratar de convertir registro desde Cursor: " + e.getMessage());
							}
							return item;
						}
					});
			// response.getClaimsList().addAll(((List<ClaimsDataType>)
			// callSPResponse.getResult().get("SYS_REFCURSOR")));
			response.getClaimsList()
					.addAll((Collection<ClaimsDataType>) callSPResponse.getResult().get("SYS_REFCURSOR"));
		} catch (StoredProcedureConfigurationNotFoundException e) {
			callSPResponse.setCode(-1);
			callSPResponse.setDescription(e.getMessage());
			logger.error("Error en el consumo de servicio searchClaims: " + e.getMessage());
		}
		return response;
	}
}