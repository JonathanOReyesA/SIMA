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

import mx.com.gentera.AddToBlackListRespMsgDataType;
import mx.com.gentera.BlackList;
import mx.com.gentera.BlackListAddDataType;
import mx.com.gentera.CausesDataType;
import mx.com.gentera.ErrorDataType;
import mx.com.gentera.GetBlackDataType;
import mx.com.gentera.GetBlackListRespMsgDataType;
import mx.com.gentera.ListCauseRespMsgDataType;
import mx.com.gentera.ListCauseResponseUPDMsgDataType;
import mx.com.gentera.seguros.common.persistence.exceptions.StoredProcedureConfigurationNotFoundException;
import mx.com.gentera.seguros.common.persistence.model.CallSPResponse;
import mx.com.gentera.seguros.common.persistence.services.IPersistenceService;

public class BlackListEndpoint implements BlackList {

	/**
	 * Instancia encargada de generar el log de la aplicacion
	 */
	private static final Logger logger = LoggerFactory.getLogger(BlackListEndpoint.class);

	@Autowired
	EndpointBean blackListEndpointBean;

	/**
	 * Servicios de la capa de persistencia
	 */

	@Autowired
	IPersistenceService persistenceService;

	// Metodo para agregar un usuario, medico, Os a la lista negra
	@Override
	public AddToBlackListRespMsgDataType addToBlackList(String key, String type, Integer idCause, String comments,
			String status, String user, String partnerID) {
		logger.info("SE RECIBIO UNA PETICION DEL SERVICIO {}", "AddBlackListEndpoint");

		CallSPResponse callSPResponse = new CallSPResponse();
		AddToBlackListRespMsgDataType response = new AddToBlackListRespMsgDataType();

		List<Object> values = new ArrayList<>();
		values.add(key);
		values.add(type);
		values.add(idCause);
		values.add(comments);
		values.add(status);
		values.add(user);
		values.add(partnerID);

		try {
			callSPResponse = persistenceService.executeSP_SIMA(blackListEndpointBean.getStoredProcedureName(), values,
					null);
			BlackListAddDataType item = new BlackListAddDataType();
			item.setCode(callSPResponse.getResult().get("P_ERROR") + "");
			item.setMessage((String) callSPResponse.getResult().get("P_ERROR_DESC"));
			response.getBlackListAddList().add(item);

		} catch (Exception e) {
			callSPResponse.setCode(-1);
			callSPResponse.setDescription(e.getMessage());
			logger.error("Error en el consumo de servicio AddBlackListEndpoint: " + e.getMessage());
		}

		return response;
	}

	// Metodo para obtener el catalogo de caousas o motivos para agregar a la ista
	// negra
	@SuppressWarnings("unchecked")
	@Override
	public ListCauseRespMsgDataType blackListCause(String partnerID) {

		logger.info("Se recibio una peticion del servicio {}", "BlackListCause");
		CallSPResponse callSPResponse = new CallSPResponse();
		ListCauseRespMsgDataType response = new ListCauseRespMsgDataType();
		List<Object> values = new ArrayList<>();
		values.add(partnerID);

		try {
			callSPResponse = persistenceService.executeFunction_SIMA("FNGETBLACKLISTCAUSES", values,
					new RowMapper<CausesDataType>() {
						@Override
						public CausesDataType mapRow(ResultSet resultSet, int i) throws SQLException {
							CausesDataType e = new CausesDataType();
							int index = 0;
							try {
								index++;
								e.setIdCause(resultSet.getInt(index));
								index++;
								e.setDescription(resultSet.getString(index));
								index++;

							} catch (Exception ex) {

								throw new SQLException(
										"Error al tratar de convertir registro desde Cursor: " + ex.getMessage());
							}
							return e;
						}
					});
			response.getCauseList()
					.addAll((Collection<CausesDataType>) callSPResponse.getResult().get("SYS_REFCURSOR"));
		} catch (StoredProcedureConfigurationNotFoundException e) {
			callSPResponse.setCode(-1);
			callSPResponse.setDescription(e.getMessage());
			logger.error("Error en el consumo de servicio BlackListCause: " + e.getMessage());
		}
		return response;
	}

	// Metodo para obtener los medicos,clientes u OS que ha sido agregado a la lista
	// negra
	@SuppressWarnings("unchecked")
	@Override
	public GetBlackListRespMsgDataType getBlackList(String blackKey, String partnerID) {
		logger.info("Se recibio una peticion para el  servicio {}", "getBlackList");
		CallSPResponse callSPResponse = new CallSPResponse();
		GetBlackListRespMsgDataType response = new GetBlackListRespMsgDataType();
		List<Object> values = new ArrayList<>();
		values.add(blackKey);
		values.add(partnerID);
		try {
			callSPResponse = persistenceService.executeFunction_SIMA("FNGETLISTANEGRA", values,
					new RowMapper<GetBlackDataType>() {
						@Override
						public GetBlackDataType mapRow(ResultSet resultSet, int i) throws SQLException {
							GetBlackDataType item = new GetBlackDataType();
							int index = 0;
							try {
								index++;
								item.setKey(resultSet.getString(index));
								index++;
								item.setCausa(resultSet.getString(index));
								index++;
								item.setComentario(resultSet.getString(index));
								index++;

							} catch (Exception e) {
								throw new SQLException(
										"Error al tratar de convertir registro desde Cursor: " + e.getMessage());
							}
							return item;
						}
					});
			response.getList().addAll((Collection<GetBlackDataType>) callSPResponse.getResult().get("SYS_REFCURSOR"));

		} catch (StoredProcedureConfigurationNotFoundException e) {
			callSPResponse.setCode(-1);
			callSPResponse.setDescription(e.getMessage());
			logger.error("Error en el consumo de servicio GetBlackListEndpoint: " + e.getMessage());
		}
		return response;
	}

	// Metdo para agregar o modifcar los item del catalog de causas lista negra
	@Override
	public ListCauseResponseUPDMsgDataType blackListCauseUPD(String idCause, String description, String status,
			String user, String partnerID) {

		logger.info("SE RECIBIO UNA PETICION DEL SERVICIO {}", "AddBlackListEndpoint");

		CallSPResponse callSPResponse = new CallSPResponse();
		ListCauseResponseUPDMsgDataType response = new ListCauseResponseUPDMsgDataType();

		List<Object> values = new ArrayList<>();
		values.add(idCause);
		values.add(description);
		values.add(status);
		values.add(user);
		values.add(partnerID);

		try {
			callSPResponse = persistenceService.executeSP_SIMA("SPCREATEUPDBLKCAUSES", values, null);
			ErrorDataType item = new ErrorDataType();
			item.setCode(callSPResponse.getResult().get("P_ERROR") + "");
			item.setMessage((String) callSPResponse.getResult().get("P_ERROR_DESC"));
			response.getErrorList().add(item);

		} catch (Exception e) {
			callSPResponse.setCode(-1);
			callSPResponse.setDescription(e.getMessage());
			logger.error("Error en el consumo de servicio AddBlackListEndpoint: " + e.getMessage());
		}

		return response;
	}

}
