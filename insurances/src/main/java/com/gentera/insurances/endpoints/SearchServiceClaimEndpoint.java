package com.gentera.insurances.endpoints;

import java.math.BigDecimal;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.RowMapper;

import com.gentera.insurances.beans.EndpointBean;

import mx.com.gentera.SearchServiceClaim;
import mx.com.gentera.ServiceClaimSearchReqDataType;
import mx.com.gentera.ServiceClaimSearchRspDataType;
import mx.com.gentera.ServiceClaimSearchRspType;
import mx.com.gentera.seguros.common.persistence.exceptions.StoredProcedureConfigurationNotFoundException;
import mx.com.gentera.seguros.common.persistence.model.CallSPResponse;
import mx.com.gentera.seguros.common.persistence.services.IPersistenceService;

public class SearchServiceClaimEndpoint implements SearchServiceClaim{

	
	/**
	 * Instancia encargada de generar el log de la aplicacion
	 */
	private static final Logger logger = LoggerFactory.getLogger(SearchServiceClaimEndpoint.class);
	
	@Autowired
	EndpointBean searchServiceClaimEndpointBean;

	/**
	 * Servicios de la capa de persistencia
	 */
	
	@Autowired
	IPersistenceService persistenceService;

	@SuppressWarnings("unchecked")
	@Override
	public ServiceClaimSearchRspType searchServiceClaim(ServiceClaimSearchReqDataType name) {
		logger.info("Se recibio una peticion del id {} para el  servicio {}",name ,"SearchServiceClaim");
		CallSPResponse callSPResponse = new CallSPResponse();
		ServiceClaimSearchRspType response = new ServiceClaimSearchRspType();
		List<Object> values = new ArrayList<>();
		values.add(name.getPartnerID());
		values.add(name.getBusinessPartnerID());
		values.add(name.getClaimID());
		values.add(name.getCertificate());
		try {
			callSPResponse = persistenceService.executeFunction_SIMA(searchServiceClaimEndpointBean.getStoredProcedureName(), values, 
					new RowMapper<ServiceClaimSearchRspDataType>() {
						@Override
						public ServiceClaimSearchRspDataType mapRow(ResultSet rset, int i) throws SQLException {
							ServiceClaimSearchRspDataType e = new ServiceClaimSearchRspDataType();
							try {
								e.setClaimID(rset.getString("CLAIMID"));
				                e.setCertificate(rset.getString("CERTIFICATE"));
				                e.setInsuranceID(rset.getString("INSURANCEID"));
				                e.setProductName(rset.getString("PRODUCTNAME"));
				                e.setServiceID(rset.getString("SERVICENAME"));
				                e.setBusinessPartnerID(rset.getString("BUSINESSPARTNERID"));
				                e.setAffected(rset.getString("AFFECTED"));
				                e.setAffectedName(rset.getString("affected_name"));
				                e.setCoverageID(rset.getString("COVERAGEID"));
				                e.setClaimID(rset.getString("CLAIMID"));
				                e.setCoverageClaimName(rset.getString("COVERAGECLAIMNAME"));
				                e.setStartDate(rset.getDate("STARTDATE"));
				                e.setEndDate(rset.getDate("ENDDATE"));
				                e.setClaimDate(rset.getDate("CLAIMDATE"));
				                e.setClaimCauseID(rset.getString("CLAIMCAUSEID"));
				                e.setCauseDescription(rset.getString(15));
				                e.setModeDescription(rset.getString(17));
				                e.setFullName(rset.getString("FULL_NAME"));
				                e.setDirection(rset.getString("DIRECTION"));
				                e.setClaimDatePosted(rset.getDate("CLAIMDATEPOSTED"));
				                e.setClaimStatusID(BigDecimal.valueOf(Double.valueOf(rset.getString("CLAIMSTATUSID"))));
				                e.setClaimStatusName(rset.getString("CLAIMSTATUSNAME"));
				                e.setClaimStatusDate(rset.getDate("CLAIMSTATUSDATE"));
				                e.setGivenName(rset.getString("GIVENNAME"));
				                e.setFamilyName(rset.getString("FAMILYNAME"));
				                e.setMiddleName(rset.getString("MIDDLENAME"));
				                e.setAdditionalFamilyName(rset.getString("ADDITIONALFAMILYNAME"));
				                e.setBirthDate(rset.getDate("BIRTHDATE"));
				                e.setHomePhone(rset.getString("HOMEPHONE"));
				                e.setOfficePhone(rset.getString("OFFICEPHONE"));
				                e.setSalesOfficeName(rset.getString("SALESOFFICENAME"));
				                e.setCellPhone(rset.getString("CELLPHONE"));
				                e.setStreetName(rset.getString("STREETNAME"));
				                e.setExteriorHouseID(rset.getString("EXTERIORHOUSEID"));
				                e.setInteriorHouseID(rset.getString("INTERIORHOUSEID"));
				                e.setCityName(rset.getString("CITYNAME"));
				                e.setDistrictName(rset.getString("DISTRICTNAME"));
				                e.setRegionName(rset.getString("REGIONNAME"));
				                e.setPostalCode(rset.getString("POSTALCODE"));
				                e.setCountryName(rset.getString("COUNTRYNAME"));
				                e.setProcessInstanceID(rset.getString("PROCESSINSTANCEID"));
				                e.setModeID(rset.getString("MODEID"));
				                e.setStatusID(rset.getString("STATUSID"));
				                e.setStatusName(rset.getString("STATUSNAME"));
				                e.setFlagCoverage(rset.getString("FLAGCOVERAGE"));
				                e.setTrackingEmail(rset.getString("TRACKINGEMAIL"));
				                e.setMoneyType(rset.getString("MONEYTYPE"));
							} catch (Exception ex) {
								throw new SQLException(
										"Error al tratar de convertir registro desde Cursor: " + ex.getMessage());
							}

							return e;
						}
					});
			response.getServiceClaimSearchList().addAll((Collection<ServiceClaimSearchRspDataType>) callSPResponse.getResult().get("SYS_REFCURSOR"));
		} catch (StoredProcedureConfigurationNotFoundException e) {
			callSPResponse.setCode(-1);
			callSPResponse.setDescription(e.getMessage());
			logger.error("Error en el consumo de servicio SearchServiceClaimEndpoint: "+e.getMessage());
		}
		return response;
	}
}
