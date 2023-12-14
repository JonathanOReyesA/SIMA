package com.gentera.insurances.endpoints;

import java.util.ArrayList;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;

import com.gentera.insurances.beans.EndpointBean;

import mx.com.gentera.CreateInsuranceSystemResp;
import mx.com.gentera.OperationDataType;
import mx.com.gentera.OperationListType;
import mx.com.gentera.ProcessOperationInsurance;
import mx.com.gentera.ResultDataType;
import mx.com.gentera.ResultListType;
import mx.com.gentera.seguros.common.persistence.model.CallSPResponse;
import mx.com.gentera.seguros.common.persistence.services.IPersistenceService;

public class ProcessOperationInsuranceEndpoint implements ProcessOperationInsurance {

	/**
	 * Instancia encargada de generar el log de la aplicacion
	 */
	private static final Logger logger = LoggerFactory.getLogger(ProcessOperationInsuranceEndpoint.class);

	@Autowired
	EndpointBean processOperationInsuranceEndpointBean;

	/**
	 * Servicios de la capa de persistencia
	 */

	@Autowired
	IPersistenceService persistenceService;

	@Override
	public ResultListType processReactivate(OperationListType req) {

		logger.info("Se recibio una peticion del id para el  servicio {}", "processReactivate");
		CallSPResponse callSPResponse = new CallSPResponse();
		ResultListType resp = new ResultListType();
		for (OperationDataType r : req.getOperationListData()) {
			ResultDataType dataError = new ResultDataType();
			List<Object> values = new ArrayList<>();
			values.add(r.getInsuranceID());
			values.add(r.getStatusID());
			try {
				values.add(new java.sql.Date(r.getEventDate().getTime()));
			} catch (Exception e) {
				values.add(null);
			}
			values.add(r.getUserID());
			values.add(r.getPartnerID());
			try {
				callSPResponse = persistenceService
						.executeSP_SIMA(processOperationInsuranceEndpointBean.getStoredProcedureName(), values, null);
				dataError.setError(callSPResponse.getResult().get("P_ERROR") + "");
				dataError.setErrorDesc(callSPResponse.getResult().get("P_ERROR_DESC") + "");
				resp.getResultType().add(dataError);
			} catch (Exception e) {
				dataError.setError("-1");
				resp.getResultType().add(dataError);
				logger.error("Error en el consumo de servicio processReactivate: " + e.getMessage());
			}
		}

		return resp;
	}

	@Override
	public CreateInsuranceSystemResp proccesCreate() {
		logger.info("Se recibio una peticion del id para el  servicio {} pero esta fuera de servicio", "proccesCreate");
		return null;
	}

	@Override
	public ResultListType processCancel(OperationListType req) {
		logger.info("Se recibio una peticion del id para el  servicio {} ", "processCancel");
		ResultListType resp = new ResultListType();
		CallSPResponse callSPResponse = new CallSPResponse();
		for (OperationDataType r : req.getOperationListData()) {
			List<Object> values = new ArrayList<>();
			values.add(r.getInsuranceID());
			values.add(r.getStatusID());
			try {
				values.add(new java.sql.Date(r.getEventDate().getTime()));
			} catch (Exception e) {
				values.add(null);
			}
			values.add(r.getUserID());
			values.add(r.getPartnerID());
			ResultDataType dataError = new ResultDataType();
			try {
				callSPResponse = persistenceService.executeSP_SIMA("SPCANCELBUCK", values, null);
				
				dataError.setError(callSPResponse.getResult().get("P_ERROR") + "");
				dataError.setErrorDesc(callSPResponse.getResult().get("P_ERROR_DESC") + "");
				resp.getResultType().add(dataError);
			} catch (Exception e) {
				dataError.setError("-1");
				dataError.setErrorDesc(e.getMessage());
				resp.getResultType().add(dataError);
				logger.error("Error en el consumo de servicio processReactivate: " + e.getMessage());
			}
		}
		return resp;
	}

}
