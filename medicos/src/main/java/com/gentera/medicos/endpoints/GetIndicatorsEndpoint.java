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

import mx.com.gentera.GetIndicators;
import mx.com.gentera.IndicatorsDataType;
import mx.com.gentera.IndicatorsRespMsg;
import mx.com.gentera.seguros.common.persistence.exceptions.StoredProcedureConfigurationNotFoundException;
import mx.com.gentera.seguros.common.persistence.model.CallSPResponse;
import mx.com.gentera.seguros.common.persistence.services.IPersistenceService;

public class GetIndicatorsEndpoint implements GetIndicators {

	/**
	 * Instancia encargada de generar el log de la aplicacion
	 */
	private static final Logger logger = LoggerFactory.getLogger(GetIndicatorsEndpoint.class);

	@Autowired
	EndpointBean getIndicatorsEndpointBean;

	/**
	 * Servicios de la capa de persistencia
	 */

	@Autowired
	IPersistenceService persistenceService;

	@SuppressWarnings("unchecked")
	@Override
	public IndicatorsRespMsg getIndicators(String certificate, Integer coverageID, String partnerID) {
		logger.info("Se recibio una peticion para el  servicio {}", "GetIndicators");
		CallSPResponse callSPResponse = new CallSPResponse();
		IndicatorsRespMsg response = new IndicatorsRespMsg();

		List<Object> values = new ArrayList<>();
		values.add(certificate);
		values.add(coverageID);
		values.add(partnerID);

		try {
			callSPResponse = persistenceService.executeFunction_SIMA(getIndicatorsEndpointBean.getStoredProcedureName(),
					values, new RowMapper<IndicatorsDataType>() {
						@Override
						public IndicatorsDataType mapRow(ResultSet resultSet, int i) throws SQLException {
							IndicatorsDataType item = new IndicatorsDataType();
							int index = 0;
							try {
								index++;
								if (resultSet.getString(index) != null) // CLIENTE
									item.setCliente(resultSet.getString(index));

								index++;
								if (resultSet.getString(index) != null) // IND_CLIENTE
									item.setIndicadorCliente(resultSet.getString(index));

								index++;
								if (resultSet.getString(index) != null) // PROMOTOR
									item.setPromotor(resultSet.getString(index));

								index++;
								if (resultSet.getString(index) != null) // IND_PROMOTOR
									item.setIndicadorPromotor(resultSet.getString(index));

								index++;
								if (resultSet.getString(index) != null) // OS
									item.setOs(resultSet.getString(index));

								index++;
								if (resultSet.getString(index) != null) // IND_OS
									item.setIndicadorOs(resultSet.getString(index));

								index++;
								if (resultSet.getString(index) != null) // SUBDIRECCION
									item.setSubdireccion(resultSet.getString(index));

								index++;
								if (resultSet.getString(index) != null) // IND_SUB
									item.setIndicadorSudireccion(resultSet.getString(index));

								index++;
								logger.info("Mapeo datos");

							} catch (Exception e) {
								throw new SQLException(
										"Error al tratar de convertir registro desde Cursor: " + e.getMessage());
							}
							return item;
						}
					});
			response.getIndicatorsList()
					.addAll(((Collection<IndicatorsDataType>) callSPResponse.getResult().get("SYS_REFCURSOR")));

		} catch (StoredProcedureConfigurationNotFoundException e) {
			callSPResponse.setCode(-1);
			callSPResponse.setDescription(e.getMessage());
			logger.error("Error en el consumo de servicio GetIndicators: " + e.getMessage());
		}

		return response;
	}

}
