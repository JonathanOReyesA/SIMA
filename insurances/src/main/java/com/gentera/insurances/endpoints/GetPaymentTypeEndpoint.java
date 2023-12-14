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
import mx.com.gentera.ClaimGetPaymentTypeRspDataType;
import mx.com.gentera.ClaimGetPaymentTypeRspType;
import mx.com.gentera.GetPaymentType;
//import mx.com.gentera.GetPaymentTypeResponse;
//import mx.com.gentera.GetPaymentType_Type;
import mx.com.gentera.seguros.common.persistence.exceptions.StoredProcedureConfigurationNotFoundException;
import mx.com.gentera.seguros.common.persistence.model.CallSPResponse;
import mx.com.gentera.seguros.common.persistence.services.IPersistenceService;

public class GetPaymentTypeEndpoint implements GetPaymentType{

	private static final Logger logger = LoggerFactory.getLogger(GetPaymentTypeEndpoint.class);
	
	@Autowired
	EndpointBean getPaymentTypeEndpointBean;

	/**
	 * Servicios de la capa de persistencia
	 */
	@Autowired
	IPersistenceService persistenceService;

	@SuppressWarnings("unchecked")
	@Override
	public ClaimGetPaymentTypeRspType getPaymentType(String partnerID) {
		logger.info("Se recibio una peticion del servicio {}", "GetPaymentType");
		CallSPResponse callSPResponse = new CallSPResponse();
		ClaimGetPaymentTypeRspType response = new ClaimGetPaymentTypeRspType();
		List<Object> values = new ArrayList<>();
		values.add(partnerID);
		try {
			callSPResponse = persistenceService.executeFunction_SIMA(getPaymentTypeEndpointBean.getStoredProcedureName(), values, 
					new RowMapper<ClaimGetPaymentTypeRspDataType>() {
						@Override
						public ClaimGetPaymentTypeRspDataType mapRow(ResultSet resultSet, int i) throws SQLException {
							ClaimGetPaymentTypeRspDataType item = new ClaimGetPaymentTypeRspDataType();

							try {
								item.setDescripcion(resultSet.getString("DESCRIPTION"));
								item.setId(resultSet.getString("PAYMENTTYPE"));
							} catch (Exception e) {
								throw new SQLException("Error al tratar de convertir registro desde Cursor: " + e.getMessage());
							}
							return item;
						}
					});
			response.getClaimGetPaymentTypeResult().addAll((List<ClaimGetPaymentTypeRspDataType>) callSPResponse.getResult().get("SYS_REFCURSOR"));
		} catch (StoredProcedureConfigurationNotFoundException e) {
			callSPResponse.setCode(-1);
			callSPResponse.setDescription(e.getMessage());
			logger.error("Error en el consumo de servicio GetPaymentTypeEndpoint: "+e.getMessage());
		}
		return response;
	}
}
