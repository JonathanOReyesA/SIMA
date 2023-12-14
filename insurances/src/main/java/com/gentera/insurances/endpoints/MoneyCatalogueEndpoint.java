package com.gentera.insurances.endpoints;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.RowMapper;

import com.gentera.insurances.beans.EndpointBean;

import mx.com.gentera.MoneyCatalogue;
import mx.com.gentera.MoneyCatalogueRespMsgDataType;
import mx.com.gentera.MoneyDataType;
import mx.com.gentera.seguros.common.persistence.exceptions.StoredProcedureConfigurationNotFoundException;
import mx.com.gentera.seguros.common.persistence.model.CallSPResponse;
import mx.com.gentera.seguros.common.persistence.services.IPersistenceService;

public class MoneyCatalogueEndpoint implements MoneyCatalogue{

	
	/**
	 * Instancia encargada de generar el log de la aplicacion
	 */
	private static final Logger logger = LoggerFactory.getLogger(MoneyCatalogueEndpoint.class);
	
	
	@Autowired
	EndpointBean moneyCatalogueEndpointBean;

	/**
	 * Servicios de la capa de persistencia
	 */
	
	@Autowired
	IPersistenceService persistenceService;

	@SuppressWarnings("unchecked")
	@Override
	public MoneyCatalogueRespMsgDataType moneyCatalogue() {
		logger.info("Se recibio una peticion del servicio {}", "MoneyCatalogue");
		CallSPResponse callSPResponse = new CallSPResponse();
		MoneyCatalogueRespMsgDataType response = new MoneyCatalogueRespMsgDataType();
		List<Object> values = new ArrayList<>();
		try {
			callSPResponse = persistenceService.executeFunction_SIMA(moneyCatalogueEndpointBean.getStoredProcedureName(), values, 
					new RowMapper<MoneyDataType>() {
						@Override
						public MoneyDataType mapRow(ResultSet resultSet, int i) throws SQLException {
							MoneyDataType item = new MoneyDataType();
							int index = 0;
							try {
								index++;
								if (resultSet.getString(index) != null)
									item.setMoneyID(resultSet.getString(index));
								index++;
								if (resultSet.getString(index) != null)
									item.setMoneyType(resultSet.getString(index));
								index++;
							} catch (Exception e) {
								throw new SQLException(
										"Error al tratar de convertir registro desde Cursor: " + e.getMessage());
							}

							return item;
						}
					});
			response.getMoneyList().addAll((List<MoneyDataType>) callSPResponse.getResult().get("SYS_REFCURSOR"));
		} catch (StoredProcedureConfigurationNotFoundException e) {
			callSPResponse.setCode(-1);
			callSPResponse.setDescription(e.getMessage());
			logger.error("Error en el consumo de servicio SearchService: "+e.getMessage());
		}
		return response;
	}
	
	
}
