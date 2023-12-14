package com.gentera.insurances.endpoints;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.RowMapper;
import com.gentera.insurances.beans.EndpointBean;
import mx.com.gentera.ClaimPaymentLogSearchDataType;
import mx.com.gentera.ClaimPaymentLogSearchRespMsgDataType;
import mx.com.gentera.PaymentlogSearch;
import mx.com.gentera.seguros.common.persistence.exceptions.StoredProcedureConfigurationNotFoundException;
import mx.com.gentera.seguros.common.persistence.model.CallSPResponse;
import mx.com.gentera.seguros.common.persistence.services.IPersistenceService;

public class PaymentlogSearchEndpoint implements PaymentlogSearch{

	/**
	 * Instancia encargada de generar el log de la aplicacion
	 */
	private static final Logger logger = LoggerFactory.getLogger(PaymentlogSearchEndpoint.class);
	
	
	@Autowired
	EndpointBean paymentlogSearchEndpointBean;

	/**
	 * Servicios de la capa de persistencia
	 */
	
	@Autowired
	IPersistenceService persistenceService;

	@SuppressWarnings("unchecked")
	@Override
	public ClaimPaymentLogSearchRespMsgDataType paymentlogSearch(String claimID) {
		logger.info("Se recibio una peticion del id {} para el  servicio {}",claimID ,"PaymentlogSearch");
		CallSPResponse callSPResponse = new CallSPResponse();
		ClaimPaymentLogSearchRespMsgDataType response = new ClaimPaymentLogSearchRespMsgDataType();
		List<Object> values = new ArrayList<>();
		values.add(claimID);

		try {
			callSPResponse = persistenceService.executeFunction_SIMA(paymentlogSearchEndpointBean.getStoredProcedureName(), values, 
					new RowMapper<ClaimPaymentLogSearchDataType>() {
						@Override
						public ClaimPaymentLogSearchDataType mapRow(ResultSet resultSet, int i) throws SQLException {
							ClaimPaymentLogSearchDataType item = new ClaimPaymentLogSearchDataType();
							int index = 0;
							try {
								index++;
								if (resultSet.getString(index) != null)
									item.setDate(resultSet.getDate(index));
								index++;
								if (resultSet.getString(index) != null)
									item.setUserID(resultSet.getString(index));
								index++;
								
							} catch (Exception e) {
								throw new SQLException(
										"Error al tratar de convertir registro desde Cursor: " + e.getMessage());
							}
							return item;
						}
					});
			response.getClaimPaymentLogSearchList().addAll((Collection<ClaimPaymentLogSearchDataType>) callSPResponse.getResult().get("SYS_REFCURSOR"));
		} catch (StoredProcedureConfigurationNotFoundException e) {
			callSPResponse.setCode(-1);
			callSPResponse.setDescription(e.getMessage());
			logger.error("Error en el consumo de servicio PaymentlogSearchEndpoint: "+e.getMessage());
		}
		return response;
	}
}
