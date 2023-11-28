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

import mx.com.gentera.CretaUpdateHospitalesTypeRespMsg;
import mx.com.gentera.ErrorDataType;
import mx.com.gentera.HospitalTypeCatalog;
import mx.com.gentera.HospitalsRespMsgDataType;
import mx.com.gentera.HostipalDataType;
import mx.com.gentera.seguros.common.persistence.exceptions.StoredProcedureConfigurationNotFoundException;
import mx.com.gentera.seguros.common.persistence.model.CallSPResponse;
import mx.com.gentera.seguros.common.persistence.services.IPersistenceService;

public class CatalogTypesHospitalsEndpoint implements HospitalTypeCatalog {

	/**
	 * Instancia encargada de generar el log de la aplicacion
	 */
	private static final Logger logger = LoggerFactory.getLogger(CatalogTypesHospitalsEndpoint.class);

	@Autowired
	EndpointBean hospitalTypeEndpointBean;

	@Autowired
	IPersistenceService persistenceService;

	@SuppressWarnings("unchecked")
	@Override
	public HospitalsRespMsgDataType getHospitalType(String partnerID) {
		logger.info("Se recibio una peticion del servicio {}", "getHospitalType");
		CallSPResponse callSPResponse = new CallSPResponse();
		HospitalsRespMsgDataType response = new HospitalsRespMsgDataType();
		List<Object> values = new ArrayList<>();
		values.add(partnerID);

		try {
			callSPResponse = persistenceService.executeFunction_SIMA(hospitalTypeEndpointBean.getStoredProcedureName(),
					values, new RowMapper<HostipalDataType>() {
						@Override
						public HostipalDataType mapRow(ResultSet resultSet, int i) throws SQLException {
							HostipalDataType e = new HostipalDataType();
							try {
								e.setIdType(resultSet.getInt("ID_TYPE"));
								e.setDescription(resultSet.getString("DESCRIPCION"));

							} catch (Exception ex) {
								;
								throw new SQLException(
										"Error al tratar de convertir registro desde Cursor: " + ex.getMessage());
							}
							return e;
						}
					});
			response.getHospitalsTypesList()
					.addAll((Collection<HostipalDataType>) callSPResponse.getResult().get("SYS_REFCURSOR"));
		} catch (StoredProcedureConfigurationNotFoundException e) {
			callSPResponse.setCode(-1);
			callSPResponse.setDescription(e.getMessage());
			logger.error("Error en el consumo de servicio CatalogTypesHospitals: " + e.getMessage());
		}
		return response;
	}

	@Override
	public CretaUpdateHospitalesTypeRespMsg hospitalTypeUPD(Integer idType, String description, String status,
			String user, String partnerID) {
		logger.info("Se recibio una peticion del servicio {}", "cretaUpdateHospitalesType");

		CallSPResponse callSPResponse = new CallSPResponse();
		CretaUpdateHospitalesTypeRespMsg response = new CretaUpdateHospitalesTypeRespMsg();
		List<Object> values = new ArrayList<>();
		values.add(idType);
		values.add(description);
		values.add(status);
		values.add(user);
		values.add(partnerID);

		try {
			callSPResponse = persistenceService.executeSP_SIMA("SPCREATEUPDHOPITALTYPE", values, null);
			ErrorDataType item = new ErrorDataType();
			item.setCode(callSPResponse.getResult().get("P_ERROR") + "");
			item.setMessage((String) callSPResponse.getResult().get("P_ERROR_DESC"));
			response.getErrorList().add(item);
		} catch (Exception e) {
			callSPResponse.setCode(-1);
			callSPResponse.setDescription(e.getMessage());
			logger.error("Error en el consumo de servicio cretaUpdateHospitalesType: " + e.getMessage());
		}

		return response;
	}

}
