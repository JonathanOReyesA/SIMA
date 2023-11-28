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

import mx.com.gentera.ClientesDataType;
import mx.com.gentera.ClientesRespMsgDataType;
import mx.com.gentera.GetClientes;
import mx.com.gentera.seguros.common.persistence.exceptions.StoredProcedureConfigurationNotFoundException;
import mx.com.gentera.seguros.common.persistence.model.CallSPResponse;
import mx.com.gentera.seguros.common.persistence.services.IPersistenceService;

public class GetClientesEndpoint implements GetClientes {

	/**
	 * Instancia encargada de generar el log de la aplicacion
	 */
	private static final Logger logger = LoggerFactory.getLogger(GetClientesEndpoint.class);

	@Autowired
	EndpointBean getClientesEndpointBean;

	/**
	 * Servicios de la capa de persistencia
	 */

	@Autowired
	IPersistenceService persistenceService;

	@SuppressWarnings("unchecked")
	@Override
	public ClientesRespMsgDataType getClientes(String businessPartnerID, String businessPartnerName, Date birthday,
			String partnerID) {
		logger.info("Se recibio una peticion para el  servicio {}", "getClientes");
		logger.info("Peticion con datos {},{},{}", businessPartnerID, businessPartnerName, partnerID);
		CallSPResponse callSPResponse = new CallSPResponse();
		ClientesRespMsgDataType response = new ClientesRespMsgDataType();
		List<Object> values = new ArrayList<>();
		values.add(businessPartnerID);
		values.add(businessPartnerName);
		values.add(birthday);
		values.add(partnerID);
		try {
			callSPResponse = persistenceService.executeFunction_SIMA(getClientesEndpointBean.getStoredProcedureName(),
					values, new RowMapper<ClientesDataType>() {
						@Override
						public ClientesDataType mapRow(ResultSet resultSet, int i) throws SQLException {
							ClientesDataType item = new ClientesDataType();
							int index = 0;
							try {
								index++;
								item.setBusinessPartnerID(resultSet.getString(index));
								index++;
								item.setBusinessPartnerNam(resultSet.getString(index));
								index++;
								item.setBirthday(resultSet.getDate(index));
								index++;

							} catch (Exception e) {
								throw new SQLException(
										"Error al tratar de convertir registro desde Cursor: " + e.getMessage());
							}
							return item;
						}
					});
			response.getClientesList()
					.addAll(((List<ClientesDataType>) callSPResponse.getResult().get("SYS_REFCURSOR")));

		} catch (StoredProcedureConfigurationNotFoundException e) {
			callSPResponse.setCode(-1);
			callSPResponse.setDescription(e.getMessage());
			logger.error("Error en el consumo de servicio getClientes: " + e.getMessage());
		}

		return response;
	}
}