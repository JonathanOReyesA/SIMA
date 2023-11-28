package com.gentera.medicos.endpoints;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.RowMapper;

import com.gentera.medicos.beans.EndpointBean;

import mx.com.gentera.Comportamiento;
import mx.com.gentera.ResultDataType;
import mx.com.gentera.ResultListType;
import mx.com.gentera.seguros.common.persistence.exceptions.StoredProcedureConfigurationNotFoundException;
import mx.com.gentera.seguros.common.persistence.model.CallSPResponse;
import mx.com.gentera.seguros.common.persistence.services.IPersistenceService;

public class ComportamientosEndpoint implements Comportamiento {

	/**
	 * Instancia encargada de generar el log de la aplicacion
	 */
	private static final Logger logger = LoggerFactory.getLogger(ComportamientosEndpoint.class);

	@Autowired
	EndpointBean comportamientoEndpointBean;

	/**
	 * Servicios de la capa de persistencia
	 */

	@Autowired
	IPersistenceService persistenceService;

	@SuppressWarnings("unchecked")
	@Override
	public ResultListType comportamientoAcum(String flagCoverage, Date fechaInit, Date fechaFin, String partnerId) {
		logger.info("Se recibio una peticion para el  servicio {}", "comportamientoAcum");
		logger.info("Peticion con datos {},{},{},{}",
				new Object[] { flagCoverage, fechaInit.toString(), fechaFin.toString(), partnerId });
		CallSPResponse callSPResponse = new CallSPResponse();
		ResultListType response = new ResultListType();
		List<Object> values = new ArrayList<>();
		values.add(flagCoverage);
		values.add(fechaInit);
		values.add(fechaFin);
		values.add(partnerId);
		try {
			callSPResponse = this.persistenceService.executeFunction_SIMA("FNCOMPORTAMIENTO_ACUM", values,
					new RowMapper<ResultDataType>() {
						@Override
						public ResultDataType mapRow(ResultSet resultSet, int i) throws SQLException {
							ResultDataType item = new ResultDataType();
							int index = 0;
							try {
								index++;
								item.setCoverage(resultSet.getString(index));
								index++;
								item.setOs(resultSet.getString(index));
								index++;
								item.setTotal(resultSet.getInt(index));
								index++;
								item.setIndicador(resultSet.getString(index));
								index++;

							} catch (Exception e) {
								throw new SQLException(
										"Error al tratar de convertir registro desde Cursor: " + e.getMessage());
							}
							return item;
						}
					});
			response.getResultType().addAll(((List<ResultDataType>) callSPResponse.getResult().get("SYS_REFCURSOR")));
		} catch (StoredProcedureConfigurationNotFoundException e) {
			callSPResponse.setCode(Integer.valueOf(-1));
			callSPResponse.setDescription(e.getMessage());
			logger.error("Error en el consumo de servicio comportamientoAcum: " + e.getMessage());
		}
		return response;
	}

	@SuppressWarnings("unchecked")
	@Override
	public ResultListType comportamientoDeta(String flagCoverage, String monthYear, String partnerId) {
		logger.info("Se recibio una peticion para el  servicio {}", "comportamientoDeta");
		logger.info("Peticion con datos {},{},{},{}", flagCoverage, monthYear, partnerId);
		CallSPResponse callSPResponse = new CallSPResponse();
		ResultListType response = new ResultListType();
		List<Object> values = new ArrayList<>();
		values.add(flagCoverage);
		values.add(monthYear);
		values.add(partnerId);
		try {
			callSPResponse = persistenceService.executeFunction_SIMA(
					comportamientoEndpointBean.getStoredProcedureName(), values, new RowMapper<ResultDataType>() {
						@Override
						public ResultDataType mapRow(ResultSet resultSet, int i) throws SQLException {
							ResultDataType item = new ResultDataType();
							int index = 0;
							try {
								index++;
								item.setCoverage(resultSet.getString(index));
								index++;
								item.setOs(resultSet.getString(index));
								index++;
								item.setTotal(resultSet.getInt(index));
								index++;
								item.setIndicador(resultSet.getString(index));
								index++;

							} catch (Exception e) {
								throw new SQLException(
										"Error al tratar de convertir registro desde Cursor: " + e.getMessage());
							}
							return item;
						}
					});
			response.getResultType().addAll(((List<ResultDataType>) callSPResponse.getResult().get("SYS_REFCURSOR")));

		} catch (StoredProcedureConfigurationNotFoundException e) {
			callSPResponse.setCode(-1);
			callSPResponse.setDescription(e.getMessage());
			logger.error("Error en el consumo de servicio comportamientoDeta: " + e.getMessage());
		}
		return response;
	}
}
