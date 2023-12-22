package com.gentera.insurances.endpoints;

import com.gentera.insurances.beans.EndpointBean;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import mx.com.gentera.ClaimsSearchCertificate;
import mx.com.gentera.SearchClaimsCertificateDataType;
import mx.com.gentera.SearchClaimsCertificateRespMsgDataType;
import mx.com.gentera.seguros.common.persistence.exceptions.StoredProcedureConfigurationNotFoundException;
import mx.com.gentera.seguros.common.persistence.model.CallSPResponse;
import mx.com.gentera.seguros.common.persistence.services.IPersistenceService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.RowMapper;

public class ClaimsSearchCertificateEndpoint implements ClaimsSearchCertificate {
	private static final Logger logger = LoggerFactory.getLogger(ClaimsSearchCertificateEndpoint.class);

	@Autowired
	EndpointBean claimsSearchCertificateEndpointBean;

	@Autowired
	IPersistenceService persistenceService;

	@SuppressWarnings({ "unchecked", "rawtypes" })
	public SearchClaimsCertificateRespMsgDataType claimsSearchCertificate(String certificate, String partnerID) {
		logger.info("Se recibio una peticion del id {} para el  servicio {}", certificate, "ClaimsSearchCertificate");
		CallSPResponse callSPResponse = new CallSPResponse();
		SearchClaimsCertificateRespMsgDataType response = new SearchClaimsCertificateRespMsgDataType();
		List<Object> values = new ArrayList<Object>();
		values.add(certificate);
		values.add(partnerID);
		try {
			callSPResponse = this.persistenceService.executeFunction_SIMA(
					this.claimsSearchCertificateEndpointBean.getStoredProcedureName(), values,
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
			response.getSearchClaimsCertificateList()
					.addAll((Collection) callSPResponse.getResult().get("SYS_REFCURSOR"));
		} catch (StoredProcedureConfigurationNotFoundException e) {
			callSPResponse.setCode(Integer.valueOf(-1));
			callSPResponse.setDescription(e.getMessage());
			logger.error("Error en el consumo de servicio ClaimsSearchCertificateEndpoint: " + e.getMessage());
		}
		return response;
	}
}