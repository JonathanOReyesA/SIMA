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

import mx.com.gentera.GetPromotersByOffice;
import mx.com.gentera.PromotersByOfficeDataType;
import mx.com.gentera.PromotersByOfficeRespMsg;
import mx.com.gentera.seguros.common.persistence.exceptions.StoredProcedureConfigurationNotFoundException;
import mx.com.gentera.seguros.common.persistence.model.CallSPResponse;
import mx.com.gentera.seguros.common.persistence.services.IPersistenceService;

public class GetPromotersByOfficeEndpoint implements GetPromotersByOffice {

	/**
	 * Instancia encargada de generar el log de la aplicacion
	 */
	private static final Logger logger = LoggerFactory.getLogger(GetPromotersByOfficeEndpoint.class);

	@Autowired
	EndpointBean getPromotersByOfficeEndpointBean;

	/**
	 * Servicios de la capa de persistencia
	 */

	@Autowired
	IPersistenceService persistenceService;

	@SuppressWarnings("unchecked")
	@Override
	public PromotersByOfficeRespMsg getPromotersByOffice(String certificate, String partnerID) {

		logger.info("Se recibio una peticion para el  servicio {}", "GetPromotersByOffice");
		CallSPResponse callSPResponse = new CallSPResponse();
		PromotersByOfficeRespMsg response = new PromotersByOfficeRespMsg();

		List<Object> values = new ArrayList<>();
		values.add(certificate);
		values.add(partnerID);

		try {
			callSPResponse = persistenceService.executeFunction_SIMA(
					getPromotersByOfficeEndpointBean.getStoredProcedureName(), values,
					new RowMapper<PromotersByOfficeDataType>() {
						@Override
						public PromotersByOfficeDataType mapRow(ResultSet resultSet, int i) throws SQLException {
							PromotersByOfficeDataType item = new PromotersByOfficeDataType();
							try {
								item.setCollaboratorID(resultSet.getString("COLLABORATORID"));
								item.setCollaboratorName(resultSet.getString("COLLABORATORNAME"));
								item.setSalesOfficeName(resultSet.getString("SALESOFFICENAME"));
								item.setSubdirection(resultSet.getString("SUBDIRECTION"));

							} catch (Exception e) {
								throw new SQLException(
										"Error al tratar de convertir registro desde Cursor: " + e.getMessage());
							}
							return item;
						}
					});
			response.getPromotersByOfficeList()
					.addAll(((Collection<PromotersByOfficeDataType>) callSPResponse.getResult().get("SYS_REFCURSOR")));

		} catch (StoredProcedureConfigurationNotFoundException e) {
			callSPResponse.setCode(-1);
			callSPResponse.setDescription(e.getMessage());
			logger.error("Error en el consumo de servicio GetPromotersByOffice: " + e.getMessage());
		}

		return response;
	}

}
