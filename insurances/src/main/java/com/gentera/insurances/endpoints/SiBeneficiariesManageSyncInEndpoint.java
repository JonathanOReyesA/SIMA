package com.gentera.insurances.endpoints;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;

import com.gentera.insurances.beans.EndpointBean;

import mx.com.gentera.AcctOriginationBusinessPartnerPhone;
import mx.com.gentera.BeneficiaryData;
import mx.com.gentera.DtInsuranceBeneficiariesUpdateReqSync;
import mx.com.gentera.DtInsuranceBeneficiariesUpdateRespSync;
import mx.com.gentera.Log;
import mx.com.gentera.LogItem;
import mx.com.gentera.SiBeneficiariesManageSyncIn;
import mx.com.gentera.seguros.common.persistence.model.CallSPResponse;
import mx.com.gentera.seguros.common.persistence.services.IPersistenceService;

public class SiBeneficiariesManageSyncInEndpoint implements SiBeneficiariesManageSyncIn{
	
	/**
	 * Instancia encargada de generar el log de la aplicacion
	 */
	private static final Logger logger = LoggerFactory.getLogger(SiBeneficiariesManageSyncInEndpoint.class);
	
	
	@Autowired
	EndpointBean siBeneficiariesManageSyncInEndpointBean;

	/**
	 * Servicios de la capa de persistencia
	 */
	
	@Autowired
	IPersistenceService persistenceService;

	@Override
	public DtInsuranceBeneficiariesUpdateRespSync siBeneficiariesManageSyncIn(
			DtInsuranceBeneficiariesUpdateReqSync request) {
		logger.info("SE RECIBIO UNA PETICION DEL SERVICIO {}", "SiBeneficiariesManageSyncIn");
		
		CallSPResponse callSPResponse = new CallSPResponse();
		DtInsuranceBeneficiariesUpdateRespSync response = new DtInsuranceBeneficiariesUpdateRespSync();
		String tipo = "";
        String phone = "";
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        for (BeneficiaryData d : request.getInsuranceBeneficiaryData().getBusinessPartnerInsuranceBenficiaryData().getBeneficiaryData()) {
                for (AcctOriginationBusinessPartnerPhone a : d.getPhoneDataItem()) {
                    tipo = a.getPhoneTypeID();
                    phone = a.getPhoneNumber().getAreaID() + a.getPhoneNumber().getSubscriberID() + a.getPhoneNumber().getCountryDiallingCode();

                }
                logger.info("[Invocando SP]: SPBENEFICIARYDATAUPDATE");
                List<Object> values = new ArrayList<>();
        		values.add(request.getInsuranceBeneficiaryData().getInsuranceID());
        		values.add(d.getBeneficiaryID());
        		values.add(d.getPercentage());
        		values.add(d.getRelationship().getValue());
        		values.add(d.getNameData().getGivenName());
        		values.add(d.getNameData().getMiddleName());
        		values.add(d.getNameData().getFamilyName());
        		values.add(d.getNameData().getAditionalFamilyName());
        		try {
        			values.add(new java.sql.Date(sdf.parse(d.getBirthDate()).getTime()));
                } catch (ParseException e) {
                    values.add(null);
                }
        		values.add(d.getGender());
        		values.add(tipo.equals("5") ? phone : null);
        		values.add( tipo.equals("1") ? phone : null);
        		values.add(tipo.equals("2") ? phone : null);
        		values.add(d.getNameData().getMarriedName());
        		values.add(request.getMessageContentHeader().getIdentificationParty().getCompanyID().getValue());

        		try {
        			callSPResponse = persistenceService.executeSP_SIMA(siBeneficiariesManageSyncInEndpointBean.getStoredProcedureName(), values ,null);
        			   LogItem log = new LogItem();
                       log.setNote(validarNull(callSPResponse.getResult().get("P_ERROR") + " - " + (validarNull((String)callSPResponse.getResult().get("P_ERROR_DESC")))));
                       response.setLog(new Log());
                       response.getLog().getItem().add(log);
        		} catch (Exception e) {
        			callSPResponse.setCode(-1);
        			callSPResponse.setDescription(e.getMessage());
        			logger.error("Error en el consumo de servicio SiBeneficiariesManageSyncInEndpoint: "+e.getMessage());
        		}
        }
        return response;
	}
	
	 public String validarNull(String data) {
	        return data == null ? "" : data;

	    }
}
