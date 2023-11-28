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

import mx.com.gentera.CreateDoctorsRespMsgDataType;
import mx.com.gentera.Doctors;
import mx.com.gentera.DoctorsDataType;
import mx.com.gentera.DoctorsRespMsgDataType;
import mx.com.gentera.MessageDataType;
import mx.com.gentera.seguros.common.persistence.exceptions.StoredProcedureConfigurationNotFoundException;
import mx.com.gentera.seguros.common.persistence.model.CallSPResponse;
import mx.com.gentera.seguros.common.persistence.services.IPersistenceService;

public class GetDoctorsEndpoint implements Doctors {

	/**
	 * Instancia encargada de generar el log de la aplicacion
	 */
	private static final Logger logger = LoggerFactory.getLogger(GetDoctorsEndpoint.class);

	@Autowired
	EndpointBean getDoctorsEndpointBean;

	/**
	 * Servicios de la capa de persistencia
	 */

	@Autowired
	IPersistenceService persistenceService;

	@SuppressWarnings("unchecked")
	@Override
	public DoctorsRespMsgDataType getDoctors(String identificationCard, String nameDoctor, String partnerID) {
		logger.info("Se recibio una peticion para el  servicio {}", "GetDoctorsEndpoint");
		logger.info("Peticion con datos {},{},{}", identificationCard, nameDoctor, partnerID);
		CallSPResponse callSPResponse = new CallSPResponse();
		DoctorsRespMsgDataType response = new DoctorsRespMsgDataType();
		List<Object> values = new ArrayList<>();
		values.add(identificationCard);
		values.add(nameDoctor);
		values.add(partnerID);

		try {

			callSPResponse = persistenceService.executeFunction_SIMA(getDoctorsEndpointBean.getStoredProcedureName(),
					values, new RowMapper<DoctorsDataType>() {
						@Override
						public DoctorsDataType mapRow(ResultSet resultSet, int i) throws SQLException {
							DoctorsDataType item = new DoctorsDataType();
							try {
								item.setIdDoctor(resultSet.getInt("ID_MEDICO"));
								item.setIdentificationCard(resultSet.getString("CEDULA"));
								item.setGivenName(resultSet.getString("GIVENNAME"));
								if (resultSet.getString("MIDDLENAME") != null)
									item.setMiddleName(resultSet.getString("MIDDLENAME"));

								else
									item.setMiddleName("");

								item.setFamilyName(resultSet.getString("FAMILYNAME"));
								item.setAdditionalFamilyName(resultSet.getString("ADDITIONALFAMILYNAME"));
								if (!resultSet.getString("ESPECIALIDAD").isEmpty()
										&& resultSet.getString("ESPECIALIDAD") != "") {
									item.setSpecialty(resultSet.getString("ESPECIALIDAD"));
								}

							} catch (Exception e) {
								throw new SQLException(
										"Error al tratar de convertir registro desde Cursor: " + e.getMessage());
							}
							return item;
						}
					});
			// response.getDoctorsList().addAll(((List<DoctorsDataType>)
			// callSPResponse.getResult().get("SYS_REFCURSOR")));

			response.getDoctorsList()
					.addAll((Collection<DoctorsDataType>) callSPResponse.getResult().get("SYS_REFCURSOR"));

		} catch (StoredProcedureConfigurationNotFoundException e) {
			callSPResponse.setCode(-1);
			callSPResponse.setDescription(e.getMessage());
			logger.error("Error en el consumo de servicio GetDoctorsEndpoint: " + e.getMessage());

		}
		return response;
	}

	@Override
	public CreateDoctorsRespMsgDataType createUpdateDoctor(String idMedico, String cedula, String givenName,
			String middleName, String familyName, String additionalFamilyName, String specialty, String status,
			String userID, String partnerID) {
		logger.info("Se recibio una peticion para el  servicio {}", "createUpdateDoctor");
		logger.info(
				"idMedico: {}, cedula : {}, givenName: {}, middleName: {}, familyName : {},"
						+ "additionalFamilyName: {}, especialidad : {}, status : {}, userID: {}," + "partnerID: {}",
				idMedico, cedula, givenName, middleName, familyName, additionalFamilyName, specialty, status, userID,
				partnerID);

		CallSPResponse callSPResponse = new CallSPResponse();
		CreateDoctorsRespMsgDataType response = new CreateDoctorsRespMsgDataType();

		List<Object> values = new ArrayList<>();
		values.add(idMedico);
		values.add(cedula);
		values.add(givenName);
		values.add(middleName);
		values.add(familyName);
		values.add(additionalFamilyName);
		values.add(specialty);
		values.add(status);
		values.add(userID);
		values.add(partnerID);

		try {

			callSPResponse = persistenceService.executeSP_SIMA("SPCREATEUPDATEMEDICO", values, null);
			MessageDataType item = new MessageDataType();
			item.setCode(callSPResponse.getResult().get("P_ERROR") + "");
			item.setMessage((String) callSPResponse.getResult().get("P_ERROR_DESC"));
			response.getMessageList().add(item);

		} catch (Exception e) {
			callSPResponse.setCode(-1);
			callSPResponse.setDescription(e.getMessage());
			logger.error("Error en el consumo de servicio createUpdateDoctor: " + e.getMessage());
		}

		return response;
	}
}