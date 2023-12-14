package com.gentera.insurances.endpoints;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.RowMapper;

import com.gentera.insurances.beans.EndpointBean;

import mx.com.gentera.ClaimCommentsDataType;
import mx.com.gentera.ClaimCommentsSearchRespMsgDataType;
import mx.com.gentera.SearchClaimComments;
import mx.com.gentera.seguros.common.persistence.exceptions.StoredProcedureConfigurationNotFoundException;
import mx.com.gentera.seguros.common.persistence.model.CallSPResponse;
import mx.com.gentera.seguros.common.persistence.services.IPersistenceService;

public class SearchClaimCommentsEndpoint implements SearchClaimComments{


	/**
	 * Instancia encargada de generar el log de la aplicacion
	 */
	private static final Logger logger = LoggerFactory.getLogger(SearchClaimCommentsEndpoint.class);
	
	
	@Autowired
	EndpointBean searchClaimCommentsEndpointBean;

	/**
	 * Servicios de la capa de persistencia
	 */
	
	@Autowired
	IPersistenceService persistenceService;
	
	@SuppressWarnings({ "unchecked" })
	@Override
	public ClaimCommentsSearchRespMsgDataType claimCommentsSearch(String claimID) {		
		logger.info("Se recibio una peticion del id {} para el  servicio {}",claimID ,"SearchClaimComments");
		ClaimCommentsSearchRespMsgDataType response = new ClaimCommentsSearchRespMsgDataType();
		CallSPResponse callSPResponse = new CallSPResponse();
		List<Object> values = new ArrayList<>();
		values.add(claimID);
		try {
			callSPResponse = persistenceService.executeFunction_SIMA(searchClaimCommentsEndpointBean.getStoredProcedureName(), values, 
					new RowMapper<ClaimCommentsDataType>() {
						@Override
						public ClaimCommentsDataType mapRow(ResultSet resultSet, int i) throws SQLException {
							ClaimCommentsDataType item = new ClaimCommentsDataType();
							int index = 0;
							try {
								index++;
								if (resultSet.getString(index) != null)
									item.setClaimCommentsID(resultSet.getString(index));
								index++;
								if (resultSet.getString(index) != null)
									item.setClaimID(resultSet.getString(index));
								index++;
								if (resultSet.getString(index) != null)
									item.setComment(resultSet.getString(index));
								index++;
								if (resultSet.getString(index) != null)
									item.setUserID(resultSet.getString(index));
								index++;
								if (resultSet.getString(index) != null)
									item.setDate(new SimpleDateFormat("dd/MM/yyyy HH:mm:ss").format(resultSet.getTimestamp(index)));
								index++;
								if (resultSet.getString(index) != null)
									item.setPath(resultSet.getString(index));
								index++;
								if (resultSet.getString(index) != null)
									item.setStatusID(resultSet.getString(index));
								index++;
								if (resultSet.getString(index) != null)
									item.setStatusName(resultSet.getString(index));
								index++;
							} catch (Exception e) {
								throw new SQLException(
										"Error al tratar de convertir registro desde Cursor: " + e.getMessage());
							}

							return item;
						}
					});
			response.getClaimCommentsSearchList().addAll((List<ClaimCommentsDataType>) callSPResponse.getResult().get("SYS_REFCURSOR"));
		} catch (StoredProcedureConfigurationNotFoundException e) {
			callSPResponse.setCode(-1);
			callSPResponse.setDescription(e.getMessage());
			logger.error("Error en el consumo de servicio SearchClaimComments: "+e.getMessage());
		}
		return response;
	}

}
