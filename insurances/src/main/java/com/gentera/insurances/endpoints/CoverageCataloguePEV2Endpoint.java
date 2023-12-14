package com.gentera.insurances.endpoints;

import com.gentera.insurances.beans.EndpointBean;

import java.sql.ResultSet;
import java.sql.SQLException;
//import java.sql.Date;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;
import java.util.List;
import mx.com.gentera.seguros.common.persistence.exceptions.StoredProcedureConfigurationNotFoundException;
import mx.com.gentera.seguros.common.persistence.model.CallSPResponse;
import mx.com.gentera.seguros.common.persistence.services.IPersistenceService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.RowMapper;

import pe.com.gentera.CoverageCatalogueDataType;
import pe.com.gentera.CoverageCataloguePEV2;
import pe.com.gentera.CoverageCatalogueRespMsgDataType;

public class CoverageCataloguePEV2Endpoint implements CoverageCataloguePEV2 {
	private static final Logger logger = LoggerFactory.getLogger(CoverageCataloguePEV2Endpoint.class);

	@Autowired
	EndpointBean coverageCataloguePEV2EndpointBean;

	@Autowired
	IPersistenceService persistenceService;

	@SuppressWarnings({ "unchecked", "rawtypes" })
	public CoverageCatalogueRespMsgDataType getCoverageV2(String productID, String modeID, String flag,
			Integer partnerID, String startDate) {
		logger.info("Se recibio una peticion del servicio {}", "CoverageCataloguePEV2");
		CallSPResponse callSPResponse = new CallSPResponse();
		CoverageCatalogueRespMsgDataType response = new CoverageCatalogueRespMsgDataType();
		List<Object> values = new ArrayList<Object>();
		values.add(productID);
		values.add(modeID);
		values.add(flag);
		values.add(partnerID);
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		try {
			values.add(new Date(sdf.parse(startDate).getTime()));
		} catch (Exception e1) {
			values.add(new Date((new Date()).getTime()));
		}
		try {
			callSPResponse = this.persistenceService.executeFunction_SIMA(
					this.coverageCataloguePEV2EndpointBean.getStoredProcedureName(), values,
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
			logger.error("Error en el consumo de servicio CoverageCataloguePEV2: " + e.getMessage());
		}
		return response;
	}
}