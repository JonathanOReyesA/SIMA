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

import mx.com.gentera.SubdirectionDataType;
import mx.com.gentera.SubdirectionRespMsgDataType;
import mx.com.gentera.seguros.common.persistence.exceptions.StoredProcedureConfigurationNotFoundException;
import mx.com.gentera.seguros.common.persistence.model.CallSPResponse;
import mx.com.gentera.seguros.common.persistence.services.IPersistenceService;

public class GetSubdirectionEndpoint implements mx.com.gentera.GetSubdirection {

	/**
	 * Instancia encargada de generar el log de la aplicacion
	 */
	private static final Logger logger = LoggerFactory.getLogger(GetSubdirectionEndpoint.class);

	@Autowired
	EndpointBean getSubdireccionEndpointBean;

	/**
	 * Servicios de la capa de persistencia
	 */

	@Autowired
	IPersistenceService persistenceService;

	@SuppressWarnings("unchecked")
	@Override
	public SubdirectionRespMsgDataType getSubdirection(String subdirectionName, String partnerID) {
		logger.info("Se recibio una peticion para el  servicio {}", "getPromotores");

		CallSPResponse callSPResponse = new CallSPResponse();
		SubdirectionRespMsgDataType response = new SubdirectionRespMsgDataType();
		List<Object> values = new ArrayList<>();
		values.add(subdirectionName);
		values.add(partnerID);
		try {
			callSPResponse = persistenceService.executeFunction_SIMA(
					getSubdireccionEndpointBean.getStoredProcedureName(), values,
					new RowMapper<SubdirectionDataType>() {
						@Override
						public SubdirectionDataType mapRow(ResultSet resultSet, int i) throws SQLException {
							SubdirectionDataType item = new SubdirectionDataType();
							int index = 0;
							try {
								index++;
								if (resultSet.getString(index) != null)
									item.setSubdirectionName(resultSet.getString(index));
								index++;

							} catch (Exception e) {
								throw new SQLException(
										"Error al tratar de convertir registro desde Cursor: " + e.getMessage());
							}
							return item;
						}
					});

			response.getSubdirectionList()
					.addAll(((List<SubdirectionDataType>) callSPResponse.getResult().get("SYS_REFCURSOR")));

		} catch (StoredProcedureConfigurationNotFoundException e) {
			callSPResponse.setCode(-1);
			callSPResponse.setDescription(e.getMessage());
			logger.error("Error en el consumo de servicio GetSubdirectionEndpoint: " + e.getMessage());
		}

		return response;
	}

}
