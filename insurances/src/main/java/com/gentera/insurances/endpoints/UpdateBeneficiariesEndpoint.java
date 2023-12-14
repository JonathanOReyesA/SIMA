package com.gentera.insurances.endpoints;


import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import com.gentera.insurances.beans.EndpointBean;
import mx.com.gentera.BeneficiariesUpdateRespMsgDataType;
import mx.com.gentera.BeneficiaryUpdateDataType;
import mx.com.gentera.ErrorDataType;
import mx.com.gentera.UpdateBeneficiaries;
import mx.com.gentera.seguros.common.persistence.model.CallSPResponse;
import mx.com.gentera.seguros.common.persistence.services.IPersistenceService;

public class UpdateBeneficiariesEndpoint implements UpdateBeneficiaries{

	
	/**
	 * Instancia encargada de generar el log de la aplicacion
	 */
	private static final Logger logger = LoggerFactory.getLogger(UpdateBeneficiariesEndpoint.class);
	
	
	@Autowired
	EndpointBean updateBeneficiariesEndpointBean;

	/**
	 * Servicios de la capa de persistencia
	 */
	
	@Autowired
	IPersistenceService persistenceService;


	@Override
	public BeneficiariesUpdateRespMsgDataType updateBeneficiaries(
			List<BeneficiaryUpdateDataType> beneficiariesUpdateList) {
		
		logger.info("SE RECIBIO UNA PETICION DEL SERVICIO {}", "UpdateBeneficiaries");
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		CallSPResponse callSPResponse = new CallSPResponse();
		BeneficiariesUpdateRespMsgDataType response = new BeneficiariesUpdateRespMsgDataType();
		for (BeneficiaryUpdateDataType b : beneficiariesUpdateList) {
			List<Object> values = new ArrayList<>();
			values.add(b.getBusinessPartnerID());
			values.add(b.getPercentage());
			values.add(b.getGivenName());
			values.add(b.getMiddleName());
			values.add(b.getFamilyName());
			values.add(b.getAdditionalFaminlyName());
			values.add(b.getHomePhone());
			values.add(b.getOfficePhone());
			values.add(b.getCellPhone());
			values.add(b.getStreetName());
			values.add(b.getExteriorHouseID());
			values.add(b.getInteriorHouseID());
			values.add(b.getCityName());
			values.add(b.getDistrictName());
			values.add(b.getRegionName());
			values.add(b.getPostalCode());
			values.add(b.getCountryName());
			values.add(b.getAddressType());
			values.add(b.getTaxID());
			try {
                values.add( new java.sql.Date(sdf.parse(b.getBirthDate()).getTime()));
            } catch (Exception e) {
            	values.add(null);
            }
			values.add(b.getMarriedFamilyName());
			values.add(b.getMaritalStatus());
			values.add(b.getZone());
			values.add(b.getPartnerID());
			
			try {
				callSPResponse = persistenceService.executeSP_SIMA(updateBeneficiariesEndpointBean.getStoredProcedureName(), values, null);
				ErrorDataType item = new ErrorDataType();
				item.setCode(callSPResponse.getResult().get("P_ERROR")+"");
				item.setMessage((String)callSPResponse.getResult().get("P_ERROR_DESC"));
				response.getErrorList().add(item);
			} catch (Exception e) {
				callSPResponse.setCode(-1);
				callSPResponse.setDescription(e.getMessage());
				logger.error("Error en el consumo de servicio UpdateBeneficiariesEndpoint: "+e.getMessage());
			}
		}
		
		return response;
	}
}
