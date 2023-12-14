package com.gentera.insurances.endpoints;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import com.gentera.insurances.beans.EndpointBean;
import mx.com.gentera.seguros.common.persistence.model.CallSPResponse;
import mx.com.gentera.seguros.common.persistence.services.IPersistenceService;
import pe.com.gentera.ClaimCauseID;
import pe.com.gentera.ClaimCreationRespMsg;
import pe.com.gentera.CreateClaimPE;


public class CreateClaimPEEndpoint implements CreateClaimPE{

	
	/**
	 * Instancia encargada de generar el log de la aplicacion
	 */
	private static final Logger logger = LoggerFactory.getLogger(CreateClaimPEEndpoint.class);
	
	
	@Autowired
	EndpointBean createClaimPEEndpointBean;

	/**
	 * Servicios de la capa de persistencia
	 */
	
	@Autowired
	IPersistenceService persistenceService;
	
	


	@Override
	public ClaimCreationRespMsg createClaim(String insuranceID, String coverageID, Date claimDate, String affected,
			ClaimCauseID claimCauseID, String statusID, Date statusDate, String user, String trackingEmail,
			String processInstanceID, String businessPartnerID, Integer claimDays, Integer flagCoverage,
			String initialDate, String endDate, String claimPaymentType, String partnerID, String idBeneficiary,
			String idPersonPayable, Double amountToPay) {
		logger.info("Se recibio una peticion del id {} para el  servicio {}",insuranceID ,"CreateClaimPE");
		CallSPResponse callSPResponse = new CallSPResponse();
		ClaimCreationRespMsg response = new ClaimCreationRespMsg();
		List<Object> values = new ArrayList<>();
		values.add(insuranceID);
		values.add(coverageID);
		try {
			values.add(new java.sql.Date(claimDate.getTime()));
        } catch (Exception e) {
        	values.add(new java.sql.Date(new Date().getTime()));
        }
		values.add(affected);
		values.add(claimCauseID.getValue().equals("") ? null : claimCauseID.getValue() );
		values.add(statusID);
		try {
			values.add( new java.sql.Date(statusDate.getTime()));
        } catch (Exception e) {
        	values.add( null);
        }
		values.add(user);
		values.add(trackingEmail);
		values.add(processInstanceID);
		values.add(businessPartnerID);
		values.add(claimDays);
		values.add(flagCoverage);
		
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy hh:mm");

		try {
			values.add( new java.sql.Timestamp(sdf.parse(initialDate).getTime()));
        } catch (Exception e) {
        	values.add( null);
        }

		try {
			values.add( new java.sql.Timestamp(sdf.parse(endDate).getTime()));
        } catch (Exception e) {
        	values.add( null);
        }
		
		values.add(claimPaymentType);
		values.add(partnerID);
		
		values.add(idBeneficiary);
		values.add(idPersonPayable);
		values.add(amountToPay);
		
		try {
			callSPResponse = persistenceService.executeSP_SIMA(createClaimPEEndpointBean.getStoredProcedureName(), values ,null);
			response.setClaimID((String)callSPResponse.getResult().get("P_IDCLAIM"));
			response.setCode(callSPResponse.getResult().get("P_ERROR")+ "");
			if (callSPResponse.getResult().get("P_ERROR_DESC")!= null)
				response.setMessage((String)callSPResponse.getResult().get("P_ERROR_DESC"));
			

		} catch (Exception e) {
			callSPResponse.setCode(-1);
			callSPResponse.setDescription(e.getMessage());
			logger.error("Error en el consumo de servicio CreateClaimEndpoint: "+e.getMessage());
		}
		
		return response;
	}





}
