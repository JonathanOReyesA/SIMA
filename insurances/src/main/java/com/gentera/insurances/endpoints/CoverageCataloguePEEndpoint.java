package com.gentera.insurances.endpoints;

import com.gentera.insurances.beans.EndpointBean;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import mx.com.gentera.seguros.common.persistence.exceptions.StoredProcedureConfigurationNotFoundException;
import mx.com.gentera.seguros.common.persistence.model.CallSPResponse;
import mx.com.gentera.seguros.common.persistence.services.IPersistenceService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.RowMapper;

import pe.com.gentera.CoverageCatalogueDataType;
import pe.com.gentera.CoverageCataloguePE;
import pe.com.gentera.CoverageCatalogueRespMsgDataType;

public class CoverageCataloguePEEndpoint implements CoverageCataloguePE {
	private static final Logger logger = LoggerFactory.getLogger(CoverageCataloguePEEndpoint.class);

	@Autowired
	EndpointBean coverageCataloguePEEndpointBean;

	@Autowired
	IPersistenceService persistenceService;

	@SuppressWarnings({ "rawtypes", "unchecked" })
	public CoverageCatalogueRespMsgDataType getCoverage(String productID, String modeID, String flag,
			String partnerId) {
		logger.info("Se recibio una peticion del id {} para el  servicio {}", productID, "CoverageCataloguePE");
		CallSPResponse callSPResponse = new CallSPResponse();
		CoverageCatalogueRespMsgDataType response = new CoverageCatalogueRespMsgDataType();
		List<Object> values = new ArrayList<Object>();
		values.add(productID);
		values.add(modeID);
		values.add(flag);
		values.add(partnerId);
		try {
			callSPResponse = this.persistenceService.executeFunction_SIMA(
					this.coverageCataloguePEEndpointBean.getStoredProcedureName(), values,
					new RowMapper<CoverageCatalogueDataType>() {

						@Override
						public CoverageCatalogueDataType mapRow(ResultSet resultSet, int rowNum) throws SQLException {
							CoverageCatalogueDataType item = new CoverageCatalogueDataType();
							int index = 0;
							try {
								index++;
								if (resultSet.getString(index) != null)
									item.setCoverageCatalogueID(resultSet.getString(index));
								index++;
								if (resultSet.getString(index) != null)
									item.setCoverageClaimName(resultSet.getString(index));
								index++;
								if (resultSet.getString(index) != null)
									item.setFlagCoverage(resultSet.getString(index));
								index++;
								if (resultSet.getString(index) != null)
									item.setFlagID(resultSet.getString(index));
								index++;
							} catch (Exception e) {
								throw new SQLException(
										"Error al tratar de convertir registro desde Cursor: " + e.getMessage());
							}
							return item;
						}

					});
			response.getCoverageList().addAll((Collection) callSPResponse.getResult().get("SYS_REFCURSOR"));
		} catch (StoredProcedureConfigurationNotFoundException e) {
			callSPResponse.setCode(Integer.valueOf(-1));
			callSPResponse.setDescription(e.getMessage());
			logger.error("Error en el consumo de servicio CoverageCataloguePE: " + e.getMessage());
		}
		return response;
	}
}
