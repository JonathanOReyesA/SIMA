package com.gentera.insurances.endpoints;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.RowMapper;
import com.gentera.insurances.beans.EndpointBean;
import mx.com.gentera.InsuranceClaimsDataType;
import mx.com.gentera.InsuranceClaimsSearch;
import mx.com.gentera.InsuranceClaimsSearchRespMsgDataType;
import mx.com.gentera.seguros.common.persistence.model.CallSPResponse;
import mx.com.gentera.seguros.common.persistence.services.IPersistenceService;

public class InsuranceClaimsSearchEndpoint implements InsuranceClaimsSearch{

	/**
	 * Instancia encargada de generar el log de la aplicacion
	 */
	private static final Logger logger = LoggerFactory.getLogger(InsuranceClaimsSearchEndpoint.class);
	
	@Autowired
	EndpointBean insuranceClaimsSearchEndpointBean;

	/**
	 * Servicios de la capa de persistencia
	 */
	
	@Autowired
	IPersistenceService persistenceService;

	@SuppressWarnings("unchecked")
	@Override
	public InsuranceClaimsSearchRespMsgDataType insuranceClaimsSearch(String partnerID, String businessPartnerID,
			Date date, String certificate) {
		logger.info("Se recibio una peticion del servicio {}", "InsuranceClaimsSearch");
		CallSPResponse callSPResponse = new CallSPResponse();
		InsuranceClaimsSearchRespMsgDataType response = new InsuranceClaimsSearchRespMsgDataType();
		List<Object> values = new ArrayList<>();
		values.add(partnerID);
		values.add(businessPartnerID);
		values.add(certificate);
		try {
			callSPResponse = persistenceService.executeFunctionWitOutParameter_SIMA(insuranceClaimsSearchEndpointBean.getStoredProcedureName(), values, 
					new RowMapper<InsuranceClaimsDataType>() {
						@Override
						public InsuranceClaimsDataType mapRow(ResultSet rset, int i) throws SQLException {
							InsuranceClaimsDataType e = new InsuranceClaimsDataType();
							try {
				                    e.setCertificate(rset.getString("CERTIFICATE"));
				                    e.setInsuranceID(rset.getString("INSURANCEID"));
				                    e.setProductName(rset.getString("PRODUCTNAME"));
				                    e.setProductID(rset.getString("PRODUCTID"));
				                    e.setPartnerID(rset.getString("PARTNERID"));
				                    if (rset.getString(6) != null) 
				                    	e.setModeName(rset.getString(6));
				                    
				                    e.setBusinessPartnerID(rset.getString("BUSINESSPARTNERID"));
				                    e.setTaxID(rset.getString("TAXID"));
				                    e.setExtMonth(rset.getInt("EXTMONTHS"));
				                    e.setExtDate(rset.getString("EXTDATE"));
				                    e.setProductInsuredAmount(rset.getString("PRODUCTINSUREDAMOUNT"));
				                    e.setCountryName(rset.getString("COUNTRYNAME"));
				                    e.setStartDate(rset.getDate("STARTDATE"));
				                    e.setEndDate(rset.getDate("ENDDATE"));
				                    e.setStartDate(rset.getDate("STARTDATE"));
				                    e.setStreetName(rset.getString("STREETNAME"));
				                    e.setOfficeName(rset.getString("salesofficename"));
				                    e.setMacroPolicy(rset.getString("MACROPOLICY"));
				                    e.setFormat(rset.getString("FORMAT"));
				                    e.setGivenName(rset.getString("GIVENNAME"));
				                    e.setFamilyName(rset.getString("FAMILYNAME"));
				                    e.setMiddleName(rset.getString("MIDDLENAME"));
				                    e.setAdditionalFamilyName(rset.getString("ADDITIONALFAMILYNAME"));
				                    e.setHomePhone(rset.getString("HOMEPHONE"));
				                    e.setOfficePhone(rset.getString("OFFICEPHONE"));
				                    e.setCellPhone(rset.getString("CELLPHONE"));
				                    e.setExteriorHouseID(rset.getString("EXTERIORHOUSEID"));
				                    e.setInteriorHouseID(rset.getString("INTERIORHOUSEID"));
				                    e.setCityName(rset.getString("CITYNAME"));
				                    e.setDistrictName(rset.getString("DISTRICTNAME"));
				                    e.setRegionName(rset.getString("REGIONNAME"));
				                    e.setPostalCode(rset.getString("POSTALCODE"));
				                    e.setCountryName(rset.getString("COUNTRYNAME"));
				                    e.setMarriedFamilyName(rset.getString("MARRIEDFAMNAME_TIT"));
				                    e.setMaritalStatus(rset.getString("MARITALSTATUS_TIT"));
				                    e.setZone(rset.getString("ZONE_TIT"));
				                    e.setStatusID(rset.getString("STATUSID"));
				                    e.setStatusName(rset.getString("STATUSNAME"));
				                    e.setZoneBP(rset.getString("ZONE_BEN"));
				                    e.setMaritalStatusBP(rset.getString("MARITALSTATUS_BEN"));
				                    e.setMarriedFamilyNameBP(rset.getString("MARIIEDFAMNAME_BEN"));
				                    e.setFlagService(rset.getString("FLAGSERV"));
				                    e.setModeID(rset.getString("MODEID"));
				                    e.setInsurancePolicy(rset.getString("INSURANCEPOLICY"));
				                    try {
				                        e.setFecRenov(rset.getString("FEC_RENOV"));
				                    } catch (Exception ex) {
				                        e.setFecRenov("");
				                    }
				                    if (rset.getString(32) != null) 
				                    	e.setRelFullName(rset.getString(32));
				                    
				                    if (rset.getString(33) != null) 
				                    	e.setRelFullName(rset.getString(33));
				                    
				                    if (rset.getString(8) != null) 
				                    	e.setRelFullName(rset.getString(8));
				                    	
				                    if (rset.getString(34) != null) 
				                    	e.setRelFullName(rset.getString(34));
				                    
				                    if (rset.getString(35) != null) 
				                    	e.setRelFullName(rset.getString(35));
				                    
				                    if (rset.getString(36) != null) 
				                    	e.setRelFullName(rset.getString(36));
				                   
				                    if (rset.getString(37) != null) 
				                    	e.setRelFullName(rset.getString(37));
				                
				                    if (rset.getString(38) != null) 
				                    	e.setRelFullName(rset.getString(38));
				                    
				                    if (rset.getString(39) != null) 
				                    	e.setRelFullName(rset.getString(39));
				                    
				                    if (rset.getString(40) != null) 
				                    	e.setRelFullName(rset.getString(40));
				                    
				                    if (rset.getString(41) != null) 
				                    	e.setRelFullName(rset.getString(41));
				                  
				                    if (rset.getString(42) != null) 
				                    	e.setRelFullName(rset.getString(42));
				                    
				                    if (rset.getString(43) != null) 
				                    	e.setRelFullName(rset.getString(43));
				                    
				                    if (rset.getString(44) != null) 
				                    	e.setRelFullName(rset.getString(44));
				                    
				                    if (rset.getString(45) != null) 
				                    	e.setRelFullName(rset.getString(45));
				                    
				                    e.setMoneyType(rset.getString("COUNTRYCURRENCY"));
				                    
				                    if (rset.getString(46) != null) 
				                    	e.setRelFullName(rset.getString(36));
				                    
				                    if (rset.getString(47) != null) 
				                    	e.setRelFullName(rset.getString(47));
				                    
				                    if (rset.getString(48) != null) 
				                    	e.setRelFullName(rset.getString(48));
				                    
				                    if (rset.getString(55) != null) 
				                    	e.setRelFullName(rset.getString(55));
				                    
				                    if (rset.getString(31) != null) 
				                    	e.setRelFullName(rset.getString(34));
				                    
							} catch (Exception ex) {
								throw new SQLException(
										"Error al tratar de convertir registro desde Cursor: " + ex.getMessage());
							}
							return e;
						}
					});
			response.getInsuranceClaimsSearchList().addAll(((List<InsuranceClaimsDataType>) callSPResponse.getResult().get("SYS_REFCURSOR")));
			response.setCode("0");
			response.setMessage("Exito");
		} catch (Exception e) {
			e.printStackTrace();
			callSPResponse.setCode(-1);
			callSPResponse.setDescription(e.getMessage());
			response.setCode("1");
			response.setMessage("Error");
			logger.error("Error en el consumo de servicio InsuranceClaimsSearchEndpoint: "+e.getMessage());
		}
		return response;
	}
}
