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

import mx.com.gentera.GetPromotores;
import mx.com.gentera.PromotoresDataType;
import mx.com.gentera.PromotoresRespMsgDataType;
import mx.com.gentera.seguros.common.persistence.exceptions.StoredProcedureConfigurationNotFoundException;
import mx.com.gentera.seguros.common.persistence.model.CallSPResponse;
import mx.com.gentera.seguros.common.persistence.services.IPersistenceService;

public class GetPromotoresEndpoint implements GetPromotores {

	/**
	 * Instancia encargada de generar el log de la aplicacion
	 */
	private static final Logger logger = LoggerFactory.getLogger(GetPromotoresEndpoint.class);

	@Autowired
	EndpointBean getPromotoresEndpointBean;

	/**
	 * Servicios de la capa de persistencia
	 */

	@Autowired
	IPersistenceService persistenceService;

	@SuppressWarnings("unchecked")
	@Override
	public PromotoresRespMsgDataType getPromotores(String collaboratorID, String collaboratorName, String partnerID) {
		logger.info("Se recibio una peticion para el  servicio {}", "getPromotores");
		logger.info("Peticion con datos {},{},{}", collaboratorID, collaboratorName, partnerID);
		CallSPResponse callSPResponse = new CallSPResponse();
		PromotoresRespMsgDataType response = new PromotoresRespMsgDataType();
		List<Object> values = new ArrayList<>();
		values.add(collaboratorID);
		values.add(collaboratorName);
		values.add(partnerID);
		try {
			callSPResponse = persistenceService.executeFunction_SIMA(getPromotoresEndpointBean.getStoredProcedureName(),
					values, new RowMapper<PromotoresDataType>() {
						@Override
						public PromotoresDataType mapRow(ResultSet resultSet, int i) throws SQLException {
							PromotoresDataType item = new PromotoresDataType();
							int index = 0;
							try {
								index++;
								if (resultSet.getString(index) != null)
									item.setNumeroNomina(resultSet.getString(index));
								index++;
								if (resultSet.getString(index) != null)
									item.setNombrePromotor(resultSet.getString(index));
								index++;
								if (resultSet.getString(index) != null)
									item.setNombreOficina(resultSet.getString(index));
								index++;

							} catch (Exception e) {
								throw new SQLException(
										"Error al tratar de convertir registro desde Cursor: " + e.getMessage());
							}
							return item;
						}
					});

			response.getPromotoresList()
					.addAll(((List<PromotoresDataType>) callSPResponse.getResult().get("SYS_REFCURSOR")));

		} catch (StoredProcedureConfigurationNotFoundException e) {
			callSPResponse.setCode(-1);
			callSPResponse.setDescription(e.getMessage());
			logger.error("Error en el consumo de servicio getPromotores: " + e.getMessage());
		}

		return response;
	}
}