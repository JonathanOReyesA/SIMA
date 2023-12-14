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
import mx.com.gentera.SearchService;
import mx.com.gentera.ServiceSearchRspDataType;
import mx.com.gentera.ServiceSearchRspType;
import mx.com.gentera.seguros.common.persistence.exceptions.StoredProcedureConfigurationNotFoundException;
import mx.com.gentera.seguros.common.persistence.model.CallSPResponse;
import mx.com.gentera.seguros.common.persistence.services.IPersistenceService;

public class SearchServiceEndpoint implements SearchService{

	/**
	 * Instancia encargada de generar el log de la aplicacion
	 */
	private static final Logger logger = LoggerFactory.getLogger(SearchServiceEndpoint.class);
	
	
	@Autowired
	EndpointBean searchServiceEndpointBean;

	/**
	 * Servicios de la capa de persistencia
	 */
	
	@Autowired
	IPersistenceService persistenceService;

	@SuppressWarnings("unchecked")
	@Override
	public ServiceSearchRspType searchService(String certificate) {

		logger.info("Se recibio una peticion del id {} para el  servicio {}",certificate ,"SearchService");
		CallSPResponse callSPResponse = new CallSPResponse();
		ServiceSearchRspType response = new ServiceSearchRspType();
		List<Object> values = new ArrayList<>();
		values.add(certificate);
		
		try {
			callSPResponse = persistenceService.executeFunction_SIMA(searchServiceEndpointBean.getStoredProcedureName(), values, 
					new RowMapper<ServiceSearchRspDataType>() {
						@Override
						public ServiceSearchRspDataType mapRow(ResultSet resultSet, int i) throws SQLException {
							ServiceSearchRspDataType item = new ServiceSearchRspDataType();
							int index = 0;
							try {
								index++;
								if (resultSet.getString(index) != null)
									item.setCertificate(resultSet.getString(index));
								index++;
								if (resultSet.getString(index) != null)
									item.setProductName(resultSet.getString(index));
								index++;
								if (resultSet.getString(index) != null)
									item.setServiceName(resultSet.getString(index));
								index++;
								if (resultSet.getString(index) != null)
									item.setDescription(resultSet.getString(index));
								index++;
								if (resultSet.getString(index) != null)
									item.setProductQuote(resultSet.getBigDecimal(index));
								index++;
								if (resultSet.getString(index) != null)
									item.setServiceCost(resultSet.getBigDecimal(index));
								index++;
								if (resultSet.getString(index) != null)
									item.setClaimID(resultSet.getString(index));
								index++;
								if (resultSet.getString(index) != null)
									item.setTitularName(resultSet.getString(index));
								index++;
								if (resultSet.getString(index) != null)
									item.setCoverageName(resultSet.getString(index));
								index++;
								if (resultSet.getString(index) != null)
									item.setClaimDate(resultSet.getDate(index));
								index++;
								if (resultSet.getString(index) != null)
									item.setClaimStatusName(resultSet.getString(index));
								index++;
								if (resultSet.getString(index) != null)
									item.setServiceUser(resultSet.getString(index));
								index++;
								if (resultSet.getString(index) != null)
									item.setServiceUserID(resultSet.getBigDecimal(index));
								index++;
							} catch (Exception e) {
								throw new SQLException(
										"Error al tratar de convertir registro desde Cursor: " + e.getMessage());
							}

							return item;
						}
					});
			response.getServiceSearchList().addAll((List<ServiceSearchRspDataType>) callSPResponse.getResult().get("SYS_REFCURSOR"));
		} catch (StoredProcedureConfigurationNotFoundException e) {
			callSPResponse.setCode(-1);
			callSPResponse.setDescription(e.getMessage());
			logger.error("Error en el consumo de servicio SearchService: "+e.getMessage());
		}
		return response;
	}
}
