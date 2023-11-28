package com.gentera.medicos.endpoints;

import java.util.ArrayList;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;

import com.gentera.medicos.beans.EndpointBean;

import mx.com.gentera.CreateUpdateHospital;
import mx.com.gentera.CreateUpdateHospitalRespMsgDataType;
import mx.com.gentera.ErrorDataType;
import mx.com.gentera.seguros.common.persistence.model.CallSPResponse;
import mx.com.gentera.seguros.common.persistence.services.IPersistenceService;

public class CreateUpdateHospitalEndpoint implements CreateUpdateHospital {

	/**
	 * Instancia encargada de generar el log de la aplicacion
	 */
	private static final Logger logger = LoggerFactory.getLogger(CreateUpdateHospital.class);

	@Autowired
	EndpointBean createUpdateHospitalEndpointBean;

	/**
	 * Servicios de la capa de persistencia
	 */

	@Autowired
	IPersistenceService persistenceService;

	@Override
	public CreateUpdateHospitalRespMsgDataType createUpdateHospital(Integer idHospital, String nombre, String rfc,
			String descripcion, String idType, String calle, String colonia, String ciudad, String estado, String cp,
			String status, String userID, String partnerID) {

		logger.info("SE RECIBIO UNA PETICION DEL SERVICIO {}", "CreateUpdateHospital");

		CallSPResponse callSPResponse = new CallSPResponse();
		CreateUpdateHospitalRespMsgDataType response = new CreateUpdateHospitalRespMsgDataType();

		List<Object> values = new ArrayList<>();
		values.add(idHospital);
		values.add(nombre);
		values.add(rfc);
		values.add(descripcion);
		values.add(idType);
		values.add(calle);
		values.add(colonia);
		values.add(ciudad);
		values.add(estado);
		values.add(cp);
		values.add(status);
		values.add(userID);
		values.add(partnerID);

		try {
			callSPResponse = persistenceService
					.executeSP_SIMA(createUpdateHospitalEndpointBean.getStoredProcedureName(), values, null);
			ErrorDataType item = new ErrorDataType();
			item.setCode(callSPResponse.getResult().get("P_ERROR") + "");
			item.setMessage((String) callSPResponse.getResult().get("P_ERROR_DESC"));
			response.getErrorList().add(item);
		} catch (Exception e) {
			callSPResponse.setCode(-1);
			callSPResponse.setDescription(e.getMessage());
			logger.error("Error en el consumo de servicio CreateUpdateHospitalEndpoint: " + e.getMessage());
		}

		return response;
	}
}