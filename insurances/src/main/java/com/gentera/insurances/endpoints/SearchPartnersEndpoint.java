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

import mx.com.gentera.SearchPartners;
import mx.com.gentera.SearchPartnersRespDataType;
import mx.com.gentera.SearchPartnersRespMsgDataType;
import mx.com.gentera.seguros.common.persistence.exceptions.StoredProcedureConfigurationNotFoundException;
import mx.com.gentera.seguros.common.persistence.model.CallSPResponse;
import mx.com.gentera.seguros.common.persistence.services.IPersistenceService;




public class SearchPartnersEndpoint implements SearchPartners{

	/**
	 * Instancia encargada de generar el log de la aplicacion
	 */
	private static final Logger logger = LoggerFactory.getLogger(SearchPartnersEndpoint.class);
	
	
	@Autowired
	EndpointBean searchPartnersEndpointBean;

	/**
	 * Servicios de la capa de persistencia
	 */
	
	@Autowired
	IPersistenceService persistenceService;

	@SuppressWarnings("unchecked")
	@Override
	public SearchPartnersRespMsgDataType searchPartners(String countryId) {
		logger.info("Se recibio una peticion del servicio {}", "SearchPartners");
		CallSPResponse callSPResponse = new CallSPResponse();
		SearchPartnersRespMsgDataType response = new SearchPartnersRespMsgDataType();
		List<Object> values = new ArrayList<>();
		values.add(countryId);
		try {
			callSPResponse = persistenceService.executeFunction_SIMA(searchPartnersEndpointBean.getStoredProcedureName(), values, 
					new RowMapper<SearchPartnersRespDataType>() {
						@Override
						public SearchPartnersRespDataType mapRow(ResultSet resultSet, int i) throws SQLException {
							SearchPartnersRespDataType item = new SearchPartnersRespDataType();
							int index = 0;
							try {
								index++;
								if (resultSet.getString(index) != null)
									item.setPartnerId(resultSet.getString(index));
								index++;
								if (resultSet.getString(index) != null)
									item.setPartnerName(resultSet.getString(index));
								index++;
							} catch (Exception e) {
								throw new SQLException(
										"Error al tratar de convertir registro desde Cursor: " + e.getMessage());
							}

							return item;
						}
					});
			response.getSearchPartnersList().addAll((List<SearchPartnersRespDataType>) callSPResponse.getResult().get("SYS_REFCURSOR"));
		} catch (StoredProcedureConfigurationNotFoundException e) {
			callSPResponse.setCode(-1);
			callSPResponse.setDescription(e.getMessage());
			logger.error("Error en el consumo de servicio SearchPartnersEndpoint: "+e.getMessage());
		}
		return response;
	}

}
