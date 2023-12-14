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
import mx.com.gentera.seguros.common.persistence.exceptions.StoredProcedureConfigurationNotFoundException;
import mx.com.gentera.seguros.common.persistence.model.CallSPResponse;
import mx.com.gentera.seguros.common.persistence.services.IPersistenceService;
import pe.com.gentera.CauseCatalogueRespMsgDataType;
import pe.com.gentera.CauseDataType;
import pe.com.gentera.GetCauseCataloguePE;

public class GetCauseCataloguePEEndpoint implements GetCauseCataloguePE{

	/**
	 * Instancia encargada de generar el log de la aplicacion
	 */
	private static final Logger logger = LoggerFactory.getLogger(GetCauseCataloguePEEndpoint.class);
	
	
	@Autowired
	EndpointBean getCauseCataloguePEEndpointBean;

	/**
	 * Servicios de la capa de persistencia
	 */
	
	@Autowired
	IPersistenceService persistenceService;

	@SuppressWarnings("unchecked")
	@Override
	public CauseCatalogueRespMsgDataType getCauseCatalogue(String flag, String partnerId) {
		
		logger.info("Se recibio una peticion del servicio {}", "GetCauseCataloguePE");
		CallSPResponse callSPResponse = new CallSPResponse();
		CauseCatalogueRespMsgDataType response = new CauseCatalogueRespMsgDataType();
		List<Object> values = new ArrayList<>();
		values.add(flag);
		values.add(partnerId);
		try {
			callSPResponse = persistenceService.executeFunction_SIMA(getCauseCataloguePEEndpointBean.getStoredProcedureName(), values, 
					new RowMapper<CauseDataType>() {
						@Override
						public CauseDataType mapRow(ResultSet resultSet, int i) throws SQLException {
							CauseDataType item = new CauseDataType();
							int index = 0;
							try {
								index++;
								if (resultSet.getString(index) != null)
									item.setClaimCauseID(resultSet.getString(index));
								index++;
								if (resultSet.getString(index) != null)
									item.setClaimType(resultSet.getString(index));
								index++;
								if (resultSet.getString(index) != null)
									item.setDescription(resultSet.getString(index));
								index++;
							} catch (Exception e) {
								throw new SQLException(
										"Error al tratar de convertir registro desde Cursor: " + e.getMessage());
							}

							return item;
						}
					});
			response.getCauseList().addAll((List<CauseDataType>) callSPResponse.getResult().get("SYS_REFCURSOR"));
		} catch (StoredProcedureConfigurationNotFoundException e) {
			callSPResponse.setCode(-1);
			callSPResponse.setDescription(e.getMessage());
			logger.error("Error en el consumo de servicio getCauseCataloguePEEndpointBean: "+e.getMessage());
		}
		return response;
	}
}
