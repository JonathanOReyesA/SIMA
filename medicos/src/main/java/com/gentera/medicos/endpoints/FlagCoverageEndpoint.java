package com.gentera.medicos.endpoints;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.RowMapper;

import com.gentera.medicos.beans.EndpointBean;

import mx.com.gentera.CoverageDataType;
import mx.com.gentera.CoverageRespMsgDataType;
import mx.com.gentera.GetFlagCoverage;
import mx.com.gentera.seguros.common.persistence.exceptions.StoredProcedureConfigurationNotFoundException;
import mx.com.gentera.seguros.common.persistence.model.CallSPResponse;
import mx.com.gentera.seguros.common.persistence.services.IPersistenceService;

public class FlagCoverageEndpoint implements GetFlagCoverage {

	/**
	 * Instancia encargada de generar el log de la aplicacion
	 */
	private static final Logger logger = LoggerFactory.getLogger(FlagCoverageEndpoint.class);

	@Autowired
	EndpointBean coverageEndpointBean;

	/**
	 * Servicios de la capa de persistencia
	 */

	@Autowired
	IPersistenceService persistenceService;

	@SuppressWarnings("unchecked")
	@Override
	public CoverageRespMsgDataType coverage() {
		logger.info("Se recibio una peticion del servicio {}", "FlagCoverageEndpoint");
		CallSPResponse callSPResponse = new CallSPResponse();
		CoverageRespMsgDataType response = new CoverageRespMsgDataType();
		List<Object> values = new ArrayList<>();
		try {
			callSPResponse = persistenceService.executeFunction_SIMA(coverageEndpointBean.getStoredProcedureName(),
					values, new RowMapper<CoverageDataType>() {
						@Override
						public CoverageDataType mapRow(ResultSet resultSet, int i) throws SQLException {
							CoverageDataType e = new CoverageDataType();
							try {
								e.setFlagCoverage(resultSet.getString("FLAGCOVERAGE"));
								e.setCoverageName(resultSet.getString("COVERAGENAME"));

							} catch (Exception ex) {
								throw new SQLException(
										"Error al tratar de convertir registro desde Cursor: " + ex.getMessage());
							}
							return e;
						}
					});
			response.getCoverageList().addAll((List<CoverageDataType>) callSPResponse.getResult().get("SYS_REFCURSOR"));
		} catch (StoredProcedureConfigurationNotFoundException e) {
			callSPResponse.setCode(-1);
			callSPResponse.setDescription(e.getMessage());
			logger.error("Error en el consumo de servicio FlagCoverageEndpoint: " + e.getMessage());
		}

		return response;
	}
}