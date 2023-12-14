package com.gentera.insurances.endpoints;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import com.gentera.insurances.beans.EndpointBean;
import mx.com.gentera.CoverageCatalogueRespMsgDataType;
import mx.com.gentera.ServiceGetAge;
import mx.com.gentera.ServiceGetAgeRspDataType;
import mx.com.gentera.seguros.common.persistence.model.CallSPResponse;
import mx.com.gentera.seguros.common.persistence.services.IPersistenceService;
import oracle.jdbc.OracleTypes;

public class ServiceGetAgeEndpoint implements ServiceGetAge{

	/**
	 * Instancia encargada de generar el log de la aplicacion
	 */
	private static final Logger logger = LoggerFactory.getLogger(CoverageCatalogueRespMsgDataType.class);
	
	
	@Autowired
	EndpointBean serviceGetAgeEndpointBean;

	/**
	 * Servicios de la capa de persistencia
	 */
	
	@Autowired
	IPersistenceService persistenceService;

	@Override
	public ServiceGetAgeRspDataType serviceGetAge(String birthDate, String insuranceID, String partnerID,
			String serviceDate) {
		logger.info("Se recibio una peticion del id {} para el  servicio {}",insuranceID ,"ServiceGetAge");
		CallSPResponse callSPResponse = new CallSPResponse();
		ServiceGetAgeRspDataType response = new ServiceGetAgeRspDataType();
		List<Object> values = new ArrayList<>();
		values.add(birthDate);
		values.add(insuranceID);
		values.add(partnerID);
		values.add(serviceDate);
		
		try {
			callSPResponse = persistenceService.executeFunctionWitOutParameter_SIMA_Parameters(serviceGetAgeEndpointBean.getStoredProcedureName(), values, null, OracleTypes.NUMERIC);
			response.setError(new BigDecimal(0));
			response.setReturnValue((BigDecimal)callSPResponse.getResult().get("RETURN"));
		} catch (Exception e) {
			e.printStackTrace();
			callSPResponse.setCode(-1);
			callSPResponse.setDescription(e.getMessage());
			logger.error("Error en el consumo de servicio ServiceGetAgeEndpoint: "+e.getMessage());
		}
		return response;
	}
}
