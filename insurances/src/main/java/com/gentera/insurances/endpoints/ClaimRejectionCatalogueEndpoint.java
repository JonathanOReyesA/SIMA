package com.gentera.insurances.endpoints;

import com.gentera.insurances.beans.EndpointBean;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import mx.com.gentera.ClaimRejectionCatalogue;
import mx.com.gentera.ClaimRejectionCatalogueRespMsgDataType;
import mx.com.gentera.ClaimRejectionDataType;
import mx.com.gentera.seguros.common.persistence.exceptions.StoredProcedureConfigurationNotFoundException;
import mx.com.gentera.seguros.common.persistence.model.CallSPResponse;
import mx.com.gentera.seguros.common.persistence.services.IPersistenceService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.RowMapper;

public class ClaimRejectionCatalogueEndpoint implements ClaimRejectionCatalogue {
	private static final Logger logger = LoggerFactory.getLogger(ClaimRejectionCatalogueEndpoint.class);

	@Autowired
	EndpointBean claimRejectionCatalogueEndpointBean;

	@Autowired
	IPersistenceService persistenceService;

	@SuppressWarnings("unchecked")
	public ClaimRejectionCatalogueRespMsgDataType claimRejectionCatalogue() {
		logger.info("Se recibio una peticion del servicio {}", "ClaimRejectionCatalogue");
		CallSPResponse callSPResponse = new CallSPResponse();
		ClaimRejectionCatalogueRespMsgDataType response = new ClaimRejectionCatalogueRespMsgDataType();
		List<Object> values = new ArrayList<Object>();
		try {
			callSPResponse = this.persistenceService.executeFunction_SIMA(
					this.claimRejectionCatalogueEndpointBean.getStoredProcedureName(), values,
					new RowMapper<ClaimRejectionDataType>() {

						@Override
						public ClaimRejectionDataType mapRow(ResultSet resultSet, int rowNum) throws SQLException {
							ClaimRejectionDataType e = new ClaimRejectionDataType();
							try {
								e.setClaimRejectionTypeID(resultSet.getString("CLAIMREJECTIONTYPEID"));
								e.setDescription(resultSet.getString("DESCRIPTION"));
							} catch (Exception ex) {
								throw new SQLException(
										"Error al tratar de convertir registro desde Cursor: " + ex.getMessage());
							}
							return e;
						}
					});
			response.getClaimCauseList().addAll((Collection<ClaimRejectionDataType>) callSPResponse.getResult().get("SYS_REFCURSOR"));
		} catch (StoredProcedureConfigurationNotFoundException e) {
			callSPResponse.setCode(Integer.valueOf(-1));
			callSPResponse.setDescription(e.getMessage());
			logger.error("Error en el consumo de servicio ClaimRejectionCatalogueEndpoint: " + e.getMessage());
		}
		return response;
	}
}