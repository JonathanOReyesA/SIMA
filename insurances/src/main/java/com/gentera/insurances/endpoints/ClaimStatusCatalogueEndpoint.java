package com.gentera.insurances.endpoints;

import com.gentera.insurances.beans.EndpointBean;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import mx.com.gentera.ClaimStatusCatalogue;
import mx.com.gentera.ClaimStatusCatalogueRespMsgDataType;
//import mx.com.gentera.ClaimStatusDataType;
import mx.com.gentera.SearchClaimsCertificateDataType;
import mx.com.gentera.seguros.common.persistence.exceptions.StoredProcedureConfigurationNotFoundException;
import mx.com.gentera.seguros.common.persistence.model.CallSPResponse;
import mx.com.gentera.seguros.common.persistence.services.IPersistenceService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.RowMapper;

public class ClaimStatusCatalogueEndpoint implements ClaimStatusCatalogue {
	private static final Logger logger = LoggerFactory.getLogger(ClaimStatusCatalogueEndpoint.class);

	@Autowired
	EndpointBean claimStatusCatalogueEndpointBean;

	@Autowired
	IPersistenceService persistenceService;

	@SuppressWarnings({ "unchecked", "rawtypes" })
	public ClaimStatusCatalogueRespMsgDataType claimStatusCatalogue(String claimStatusType) {
		logger.info("Se recibio una peticion del id {} para el  servicio {}", claimStatusType, "ClaimStatusCatalogue");
		CallSPResponse callSPResponse = new CallSPResponse();
		ClaimStatusCatalogueRespMsgDataType response = new ClaimStatusCatalogueRespMsgDataType();
		List<Object> values = new ArrayList<Object>();
		values.add(claimStatusType);
		try {
			callSPResponse = this.persistenceService.executeFunction_SIMA(
					this.claimStatusCatalogueEndpointBean.getStoredProcedureName(), values,
					new RowMapper<SearchClaimsCertificateDataType>() {

						@Override
						public SearchClaimsCertificateDataType mapRow(ResultSet resultSet, int rowNum)
								throws SQLException {
							SearchClaimsCertificateDataType item = new SearchClaimsCertificateDataType();
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
									item.setModeName(resultSet.getString(index));
								index++;
								if (resultSet.getString(index) != null)
									item.setProductQuote(Double.valueOf(resultSet.getDouble(index)));
								index++;
								if (resultSet.getString(index) != null)
									item.setClaimID(resultSet.getString(index));
								index++;
								if (resultSet.getString(index) != null)
									item.setAffectedName(resultSet.getString(index));
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
							} catch (Exception e) {
								throw new SQLException(
										"Error al tratar de convertir registro desde Cursor: " + e.getMessage());
							}
							return item;
						}

					});
			response.getClaimStatusList().addAll((Collection) callSPResponse.getResult().get("SYS_REFCURSOR"));
		} catch (StoredProcedureConfigurationNotFoundException e) {
			callSPResponse.setCode(Integer.valueOf(-1));
			callSPResponse.setDescription(e.getMessage());
			logger.error("Error en el consumo de servicio ClaimStatusCatalogueEndpoint: " + e.getMessage());
		}
		return response;
	}
}
