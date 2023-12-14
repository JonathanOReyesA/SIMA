package com.gentera.insurances.endpoints;

import com.gentera.insurances.beans.EndpointBean;

import java.sql.ResultSet;
import java.sql.SQLException;
//import java.sql.Date;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import mx.com.gentera.CoverageCatalogueDataType;
import mx.com.gentera.CoverageCatalogueRespMsgDataType;
import mx.com.gentera.CoverageCatalogueV2;
import mx.com.gentera.seguros.common.persistence.model.CallSPResponse;
import mx.com.gentera.seguros.common.persistence.services.IPersistenceService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.RowMapper;

public class CoverageCatalogueV2Endpoint implements CoverageCatalogueV2 {
	private static final Logger logger = LoggerFactory.getLogger(CoverageCatalogueV2Endpoint.class);

	@Autowired
	EndpointBean coverageCatalogueV2EndpointBean;

	@Autowired
	IPersistenceService persistenceService;

	@SuppressWarnings({ "rawtypes", "unchecked" })
	public CoverageCatalogueRespMsgDataType getCoverageV2(String productID, String modeID, String flag,
			Integer partnerID, String startDate) {
		logger.info("Se recibio una peticion del servicio {}", "CoverageCatalogueV2");
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
					this.coverageCatalogueV2EndpointBean.getStoredProcedureName(), values,
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
			response.getCoverageList().addAll((List) callSPResponse.getResult().get("SYS_REFCURSOR"));
		} catch (Exception e) {
			callSPResponse.setCode(Integer.valueOf(-1));
			callSPResponse.setDescription(e.getMessage());
			logger.error("Error en el consumo de servicio CoverageCatalogueV2: " + e.getMessage());
		}
		return response;
	}
}
