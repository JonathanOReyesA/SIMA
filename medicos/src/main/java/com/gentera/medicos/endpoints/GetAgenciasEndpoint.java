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

import mx.com.gentera.AgenciasDataType;
import mx.com.gentera.AgenciasRespMsgDataType;
import mx.com.gentera.GetAgencias;
import mx.com.gentera.seguros.common.persistence.exceptions.StoredProcedureConfigurationNotFoundException;
import mx.com.gentera.seguros.common.persistence.model.CallSPResponse;
import mx.com.gentera.seguros.common.persistence.services.IPersistenceService;

public class GetAgenciasEndpoint implements GetAgencias {

	/**
	 * Instancia encargada de generar el log de la aplicacion
	 */
	private static final Logger logger = LoggerFactory.getLogger(GetAgenciasEndpoint.class);

	@Autowired
	EndpointBean getAgenciasEndpointBean;

	/**
	 * Servicios de la capa de persistencia
	 */

	@Autowired
	IPersistenceService persistenceService;

	@SuppressWarnings("unchecked")
	@Override
	public AgenciasRespMsgDataType getAgencias(String certerCode, String salesOfficeName, String partnerID) {
		logger.info("Se recibio una peticion para el  servicio {}", "getAgencias");
		logger.info("Peticion con datos {},{},{}", certerCode, salesOfficeName, partnerID);
		CallSPResponse callSPResponse = new CallSPResponse();
		AgenciasRespMsgDataType response = new AgenciasRespMsgDataType();
		List<Object> values = new ArrayList<>();
		values.add(certerCode);
		values.add(salesOfficeName);
		values.add(partnerID);

		try {
			callSPResponse = persistenceService.executeFunction_SIMA(getAgenciasEndpointBean.getStoredProcedureName(),
					values, new RowMapper<AgenciasDataType>() {
						@Override
						public AgenciasDataType mapRow(ResultSet resultSet, int i) throws SQLException {
							AgenciasDataType item = new AgenciasDataType();
							int index = 0;
							try {
								index++;
								if (resultSet.getString(index) != null)
									item.setCerterCode(resultSet.getString(index));
								index++;
								if (resultSet.getString(index) != null)
									item.setSalesOfficeName(resultSet.getString(index));
								index++;
								if (resultSet.getString(index) != null)
									item.setAddress(resultSet.getString(index));
								index++;
								if (resultSet.getString(index) != null)
									item.setInternalId(resultSet.getString(index));
								index++;

							} catch (Exception e) {
								throw new SQLException(
										"Error al tratar de convertir registro desde Cursor: " + e.getMessage());
							}
							return item;
						}
					});
			response.getAgenciasList()
					.addAll(((List<AgenciasDataType>) callSPResponse.getResult().get("SYS_REFCURSOR")));

		} catch (StoredProcedureConfigurationNotFoundException e) {
			callSPResponse.setCode(-1);
			callSPResponse.setDescription(e.getMessage());
			logger.error("Error en el consumo de servicio getAgencia: " + e.getMessage());
		}

		return response;
	}
}