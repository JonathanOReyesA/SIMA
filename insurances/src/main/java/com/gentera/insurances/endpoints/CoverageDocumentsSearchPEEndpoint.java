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

import pe.com.gentera.CoverageDocumentDataType;
import mx.com.gentera.seguros.common.persistence.exceptions.StoredProcedureConfigurationNotFoundException;
import mx.com.gentera.seguros.common.persistence.model.CallSPResponse;
import mx.com.gentera.seguros.common.persistence.services.IPersistenceService;
import pe.com.gentera.CoverageDocumentsSearchPE;
import pe.com.gentera.CoverageDocumentsSearchRespMsgDataType;

public class CoverageDocumentsSearchPEEndpoint implements CoverageDocumentsSearchPE{

	
	/**
	 * Instancia encargada de generar el log de la aplicacion
	 */
	private static final Logger logger = LoggerFactory.getLogger(CoverageDocumentsSearchPEEndpoint.class);
	
	@Autowired
	EndpointBean coverageDocumentsSearchPEEndpointBean;

	/**
	 * Servicios de la capa de persistencia
	 */
	
	@Autowired
	IPersistenceService persistenceService;

	@SuppressWarnings("unchecked")
	@Override
	public CoverageDocumentsSearchRespMsgDataType coverageDocumentsSearch(String coverageCatalogueID,
			String partnerID) {
		
		logger.info("Se recibio una peticion del id {} para el  servicio {}",coverageCatalogueID ,"CoverageDocumentsSearchPE");
		CallSPResponse callSPResponse = new CallSPResponse();
		CoverageDocumentsSearchRespMsgDataType response = new CoverageDocumentsSearchRespMsgDataType();
		List<Object> values = new ArrayList<>();
		values.add(coverageCatalogueID);
		values.add(partnerID);
		final String id = coverageCatalogueID;
		try {
			callSPResponse =  persistenceService.executeFunction_SIMA(coverageDocumentsSearchPEEndpointBean.getStoredProcedureName(), values, 
					new RowMapper<CoverageDocumentDataType>() {
						@Override
						public CoverageDocumentDataType mapRow(ResultSet resultSet, int i) throws SQLException {
							CoverageDocumentDataType item = new CoverageDocumentDataType();
							int index = 0;
							try {
								index++;
								if (resultSet.getString(index) != null)
									item.setDocumentName(resultSet.getString(index));
								index++;
								item.setCoverageCatalogueID(id);
							} catch (Exception e) {
								throw new SQLException(
										"Error al tratar de convertir registro desde Cursor: " + e.getMessage());
							}

							return item;
						}
					});
			response.getCoverageDocumentsSearchList().addAll((List<CoverageDocumentDataType>) callSPResponse.getResult().get("SYS_REFCURSOR"));
		} catch (StoredProcedureConfigurationNotFoundException e) {
			callSPResponse.setCode(-1);
			callSPResponse.setDescription(e.getMessage());
			e.printStackTrace();
			logger.error("Error en el consumo de servicio CoverageDocumentsSearch: "+e.getMessage());
		}
		return response;
	}
}
