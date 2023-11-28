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

import mx.com.gentera.GetHospitales;
import mx.com.gentera.HospitalesDataType;
import mx.com.gentera.HospitalesRespMsgDataType;
import mx.com.gentera.seguros.common.persistence.exceptions.StoredProcedureConfigurationNotFoundException;
import mx.com.gentera.seguros.common.persistence.model.CallSPResponse;
import mx.com.gentera.seguros.common.persistence.services.IPersistenceService;

public class GetHopitalesEndpoint implements GetHospitales {

	private static final Logger logger = LoggerFactory.getLogger(GetHopitalesEndpoint.class);

	@Autowired
	EndpointBean getHospitalesEndpointBean;

	@Autowired
	IPersistenceService persistenceService;

	@SuppressWarnings("unchecked")
	@Override
	public HospitalesRespMsgDataType getHospitales(String hospitalName, String rfc, String parnetID) {

		logger.info("Se recibio una peticion del servicio {}", "getHospitales");
		CallSPResponse callSPResponse = new CallSPResponse();
		HospitalesRespMsgDataType response = new HospitalesRespMsgDataType();
		List<Object> values = new ArrayList<>();
		values.add(hospitalName);
		values.add(rfc);
		values.add(parnetID);

		try {
			callSPResponse = persistenceService.executeFunction_SIMA(getHospitalesEndpointBean.getStoredProcedureName(),
					values, new RowMapper<HospitalesDataType>() {
						@Override
						public HospitalesDataType mapRow(ResultSet resultSet, int i) throws SQLException {
							HospitalesDataType e = new HospitalesDataType();
							int index = 0;
							try {
								index++;
								e.setIdHospital(resultSet.getInt(index));
								index++;
								e.setHospitalName(resultSet.getString(index));
								index++;
								e.setRfc(resultSet.getString(index));
								index++;
								e.setDescription(resultSet.getString(index));
								index++;
								e.setAddress(resultSet.getString(index));
								index++;
								e.setTypeHospital(resultSet.getString(index));
								index++;

							} catch (Exception ex) {
								;
								throw new SQLException(
										"Error al tratar de convertir registro desde Cursor: " + ex.getMessage());
							}
							return e;
						}
					});
			response.getHospitalesList()
					.addAll((Collection<HospitalesDataType>) callSPResponse.getResult().get("SYS_REFCURSOR"));
		} catch (StoredProcedureConfigurationNotFoundException e) {
			callSPResponse.setCode(-1);
			callSPResponse.setDescription(e.getMessage());
			logger.error("Error en el consumo de servicio getHospitales: " + e.getMessage());
		}
		return response;
	}
}