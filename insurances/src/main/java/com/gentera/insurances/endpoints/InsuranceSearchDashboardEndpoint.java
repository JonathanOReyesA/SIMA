package com.gentera.insurances.endpoints;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.RowMapper;

import com.gentera.insurances.beans.EndpointBean;

import mx.com.gentera.global.insurancesearchdashboard.InsuranceDashboardDataType;
import mx.com.gentera.global.insurancesearchdashboard.InsuranceSearchDashboard;
import mx.com.gentera.global.insurancesearchdashboard.InsuranceSearchDashboardRespMsgDataType;
import mx.com.gentera.seguros.common.persistence.exceptions.StoredProcedureConfigurationNotFoundException;
import mx.com.gentera.seguros.common.persistence.model.CallSPResponse;
import mx.com.gentera.seguros.common.persistence.services.IPersistenceService;


public class InsuranceSearchDashboardEndpoint implements InsuranceSearchDashboard{
	
	/**
	 * Instancia encargada de generar el log de la aplicacion
	 */
	private static final Logger logger = LoggerFactory.getLogger(InsuranceSearchDashboardEndpoint.class);
	
	@Autowired
	EndpointBean insuranceSearchDashboardEndpointBean;

	/**
	 * Servicios de la capa de persistencia
	 */
	
	@Autowired
	IPersistenceService persistenceService;

	@SuppressWarnings("unchecked")
	@Override
	public InsuranceSearchDashboardRespMsgDataType searchInsuranceDashboardReqMsg(String insuranceID, String productID,
			String givenName, String familyName, String middleName, String additionalFamilyName, Date birthDate,
			String certificate, String businessPartnerID, String partnerID) {
		
		logger.info("Se recibio una peticion del id {} para el  servicio {}",insuranceID ,"InsuranceSearchDashboard");
		CallSPResponse callSPResponse = new CallSPResponse();
		InsuranceSearchDashboardRespMsgDataType response = new InsuranceSearchDashboardRespMsgDataType();
		List<Object> values = new ArrayList<>();
		values.add(insuranceID);
		values.add(productID);
		values.add(givenName);
		values.add(familyName);		
		values.add(middleName);
		values.add(additionalFamilyName);
		 try {
			 values.add(new java.sql.Date(birthDate.getTime()));
        } catch (Exception e) {
        	values.add(null);
        }	
		values.add(certificate);
		values.add(businessPartnerID);
		values.add(partnerID);
		
		try {
			callSPResponse = persistenceService.executeFunction_SIMA(insuranceSearchDashboardEndpointBean.getStoredProcedureName(), values, 
					new RowMapper<InsuranceDashboardDataType>() {
						@Override
						public InsuranceDashboardDataType mapRow(ResultSet rset, int i) throws SQLException {
							InsuranceDashboardDataType e = new InsuranceDashboardDataType();
							try {
								e.setInsuranceID(rset.getString("INSURANCEID"));
				                e.setMacropolicy(rset.getString("INSURANCEPOLICY"));
				                e.setCertificate(rset.getString("CERTIFICATE"));
				                e.setBusinessPartnerID(rset.getString("BUSINESSPARTNERID"));
				                e.setFullName(rset.getString("FULLNAME"));
				                e.setBirthDate(rset.getDate("BIRTHDATE"));
				                e.setProductName(rset.getString("PRODUCTNAME"));
				                e.setDescription(rset.getString("DESCRIPTION"));
				                e.setCost(rset.getString("COST"));
				                e.setPremium(rset.getString("PREMIUM"));
				                e.setStartDate(rset.getDate("STARTDATE"));
				                e.setEndDate(rset.getDate("ENDDATE"));
				                e.setStatusName(rset.getString("STATUSNAME"));
				                e.setFecAltaMapfre(rset.getDate("FEC_ALTA_MAPFRE"));
				                e.setFecBajaMapfre(rset.getDate("FEC_BAJA_MAPFRE"));
				                e.setPartnerName(rset.getString("SOCIO"));
				                e.setSalesOfficeName(rset.getString("SALES_OFFICE"));
							} catch (Exception ex) {
								throw new SQLException(
										"Error al tratar de convertir registro desde Cursor: " + ex.getMessage());
							}

							return e;
						}
					});
			
			response.getInsuranceSearchDashboardList().addAll((Collection<InsuranceDashboardDataType>) callSPResponse.getResult().get("SYS_REFCURSOR"));
		} catch (StoredProcedureConfigurationNotFoundException e) {
			callSPResponse.setCode(-1);
			callSPResponse.setDescription(e.getMessage());
			logger.error("Error en el consumo de servicio InsuranceSearchDashboardEndpoint: "+e.getMessage());
		}
		
		return response;
	}

}
