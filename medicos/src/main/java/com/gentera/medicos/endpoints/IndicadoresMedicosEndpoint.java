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

import mx.com.gentera.ErrorDataType;
import mx.com.gentera.GetMedicalIndicatorsDataType;
import mx.com.gentera.GetMedicalIndicatorsRespMsgDataType;
import mx.com.gentera.MedicalIndicators;
import mx.com.gentera.UpdateImRespMsgDataType;
import mx.com.gentera.seguros.common.persistence.exceptions.StoredProcedureConfigurationNotFoundException;
import mx.com.gentera.seguros.common.persistence.model.CallSPResponse;
import mx.com.gentera.seguros.common.persistence.services.IPersistenceService;

public class IndicadoresMedicosEndpoint implements MedicalIndicators {

	/**
	 * Instancia encargada de generar el log de la aplicacion
	 */
	private static final Logger logger = LoggerFactory.getLogger(IndicadoresMedicosEndpoint.class);

	@Autowired
	EndpointBean medicalIndicatorsEndpointBean;

	@Autowired
	IPersistenceService persistenceService;

	@SuppressWarnings("unchecked")
	@Override
	public GetMedicalIndicatorsRespMsgDataType getMedicalIndicators(String partnerID) {
		logger.info("Se recibio una peticion del servicio {}", "getMedicalIndicators");
		CallSPResponse callSPResponse = new CallSPResponse();
		GetMedicalIndicatorsRespMsgDataType response = new GetMedicalIndicatorsRespMsgDataType();
		List<Object> values = new ArrayList<>();
		values.add(partnerID);

		try {
			callSPResponse = persistenceService.executeFunction_SIMA("FNGETIMPARAMETERS", values,
					new RowMapper<GetMedicalIndicatorsDataType>() {
						@Override
						public GetMedicalIndicatorsDataType mapRow(ResultSet resultSet, int i) throws SQLException {
							GetMedicalIndicatorsDataType e = new GetMedicalIndicatorsDataType();
							try {
								e.setParamId(resultSet.getInt("PARAM_ID"));
								e.setName(resultSet.getString("NOMBRE"));
								e.setCobertura(resultSet.getInt("COBERTURA"));
								e.setDescripcion(resultSet.getString("DESCRIPCION"));
								e.setClave(resultSet.getString("CLAVE"));
								e.setMaxDias(resultSet.getInt("MAX_DIAS"));
								e.setMaxSiniestros(resultSet.getInt("MAX_SINIESTROS"));
								e.setDateUpdate(resultSet.getDate("FEC_ACTUALIZACION"));
								e.setUsuario(resultSet.getString("USUARIO"));

							} catch (Exception ex) {
								;
								throw new SQLException(
										"Error al tratar de convertir registro desde Cursor: " + ex.getMessage());
							}
							return e;
						}
					});
			response.getImList()
					.addAll((Collection<GetMedicalIndicatorsDataType>) callSPResponse.getResult().get("SYS_REFCURSOR"));
		} catch (StoredProcedureConfigurationNotFoundException e) {
			callSPResponse.setCode(-1);
			callSPResponse.setDescription(e.getMessage());
			logger.error("Error en el consumo de servicio getMedicalIndicators: " + e.getMessage());
		}
		return response;
	}

	@Override
	public UpdateImRespMsgDataType updateImParameters(Integer paramId, Integer maxDays, Integer maxSiniestros,
			String user, String partnerId) {
		logger.info("Se recibio una peticion del servicio {}", "hospitalTypeUPD");

		CallSPResponse callSPResponse = new CallSPResponse();
		UpdateImRespMsgDataType response = new UpdateImRespMsgDataType();
		List<Object> values = new ArrayList<>();
		values.add(paramId);
		values.add(maxDays);
		values.add(maxSiniestros);
		values.add(user);
		values.add(partnerId);

		try {
			callSPResponse = persistenceService.executeSP_SIMA(medicalIndicatorsEndpointBean.getStoredProcedureName(),
					values, null);
			ErrorDataType item = new ErrorDataType();
			item.setCode(callSPResponse.getResult().get("P_ERROR") + "");
			item.setMessage((String) callSPResponse.getResult().get("P_ERROR_DESC"));
			response.getErrorList().add(item);

		} catch (Exception e) {
			callSPResponse.setCode(-1);
			callSPResponse.setDescription(e.getMessage());
			logger.error("Error en el consumo de servicio hospitalTypeUPD: " + e.getMessage());
		}

		return response;
	}

}
