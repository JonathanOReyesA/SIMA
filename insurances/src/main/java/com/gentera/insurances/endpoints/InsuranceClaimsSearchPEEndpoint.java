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
import mx.com.gentera.seguros.common.persistence.exceptions.StoredProcedureConfigurationNotFoundException;
import mx.com.gentera.seguros.common.persistence.model.CallSPResponse;
import mx.com.gentera.seguros.common.persistence.services.IPersistenceService;
import pe.com.gentera.InsuranceClaimsDataTypePE;
import pe.com.gentera.InsuranceClaimsSearchPE;
import pe.com.gentera.InsuranceClaimsSearchRespMsgDataTypePE;

public class InsuranceClaimsSearchPEEndpoint implements InsuranceClaimsSearchPE{

	/**
	 * Instancia encargada de generar el log de la aplicacion
	 */
	private static final Logger logger = LoggerFactory.getLogger(InsuranceClaimsSearchPEEndpoint.class);
	
	@Autowired
	EndpointBean insuranceClaimsSearchPEEndpointBean;

	/**
	 * Servicios de la capa de persistencia
	 */
	
	@Autowired
	IPersistenceService persistenceService;

	@SuppressWarnings("unchecked")
	@Override
	public InsuranceClaimsSearchRespMsgDataTypePE insuranceClaimsSearch(String partnerID, String businessPartnerID,
			Date date, String certificate) {
		logger.info("Se recibio una peticion del id {} para el  servicio {}",businessPartnerID ,"InsuranceClaimsSearchPE");
		CallSPResponse callSPResponse = new CallSPResponse();
		InsuranceClaimsSearchRespMsgDataTypePE response = new InsuranceClaimsSearchRespMsgDataTypePE();
		List<Object> values = new ArrayList<>();
		values.add(partnerID);
		values.add(businessPartnerID);
		values.add(certificate);
		try {
			callSPResponse = persistenceService.executeFunctionWitOutParameter_SIMA(insuranceClaimsSearchPEEndpointBean.getStoredProcedureName(), values, 
					new RowMapper<InsuranceClaimsDataTypePE>() {
				@Override
				public InsuranceClaimsDataTypePE mapRow(ResultSet rset, int i) throws SQLException {
					InsuranceClaimsDataTypePE e = new InsuranceClaimsDataTypePE();
					try {
						 
		                    e.setCertificate(rset.getString("CERTIFICATE"));
		                    e.setInsuranceID(rset.getString("INSURANCEID"));
		                    e.setProductName(rset.getString("PRODUCTNAME"));
		                    e.setProductID(rset.getString("PRODUCTID"));
		                    e.setPartnerID(rset.getString("PARTNERID"));
		                    e.setModeName(rset.getString(6));
		                    e.setBusinessPartnerID(rset.getString("BUSINESSPARTNERID"));
		                    e.setTaxID(rset.getString("TAXID"));
		                    e.setInsuranceCompanyID(rset.getString("INSURANCECOMPANYID"));
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
		                    e.setGivenName(validarNull(rset.getString("GIVENNAME")));
		                    e.setFamilyName(validarNull(rset.getString("FAMILYNAME")));
		                    e.setMiddleName(validarNull(rset.getString("MIDDLENAME")));
		                    e.setAdditionalFamilyName(validarNull(rset.getString("ADDITIONALFAMILYNAME")));
		                    e.setHomePhone(validarNull(rset.getString("HOMEPHONE")));
		                    e.setOfficePhone(validarNull(rset.getString("OFFICEPHONE")));
		                    e.setCellPhone(validarNull(rset.getString("CELLPHONE")));
		                    e.setExteriorHouseID(validarNull(rset.getString("EXTERIORHOUSEID")));
		                    e.setInteriorHouseID(validarNull(rset.getString("INTERIORHOUSEID")));
		                    e.setCityName(validarNull(rset.getString("CITYNAME")));
		                    e.setDistrictName(validarNull(rset.getString("DISTRICTNAME")));
		                    e.setRegionName(validarNull(rset.getString("REGIONNAME")));
		                    e.setPostalCode(validarNull(rset.getString("POSTALCODE")));
		                    e.setCountryName(validarNull(rset.getString("COUNTRYNAME")));
		                    e.setMarriedFamilyName(validarNull(rset.getString("MARRIEDFAMNAME_TIT")));
		                    e.setMaritalStatus(validarNull(rset.getString("MARITALSTATUS_TIT")));
		                    e.setZone(validarNull(rset.getString("ZONE_TIT")));
		                    e.setStatusID(validarNull(rset.getString("STATUSID")));
		                    e.setStatusName(validarNull(rset.getString("STATUSNAME")));
		                    e.setZoneBP(validarNull(rset.getString("ZONE_BEN")));
		                    e.setMaritalStatusBP(validarNull(rset.getString("MARITALSTATUS_BEN")));
		                    e.setMarriedFamilyNameBP(validarNull(rset.getString("MARIIEDFAMNAME_BEN")));
		                    e.setFlagService(validarNull(rset.getString("FLAGSERV")));
		                    e.setModeID(validarNull(rset.getString("MODEID")));
		                    e.setInsurancePolicy(validarNull(rset.getString("INSURANCEPOLICY")));
		                    e.setRelFullName(validarNull(rset.getString(32)));
		                    e.setRelGivenName(validarNull(rset.getString(33)));
		                    e.setFullName(validarNull(rset.getString(8)));
		                    e.setRelMiddleName(validarNull(rset.getString(34)));
		                    e.setRelFamilyName(validarNull(rset.getString(35)));
		                    e.setRelAdditionalFamilyName(validarNull(rset.getString(36)));
		                    e.setRelTaxID(validarNull(rset.getString(37)));
		                    e.setRelHomePhone(validarNull(rset.getString(38)));
		                    e.setRelOfficePhone(validarNull(rset.getString(39)));
		                    e.setRelCellPhone(validarNull(rset.getString(40)));
		                    e.setRelStreetName(validarNull(rset.getString(41)));
		                    e.setRelExteriorHouseID(validarNull(rset.getString(42)));
		                    e.setRelInteriorHouseID(validarNull(rset.getString(43)));
		                    e.setRelCityName(validarNull(rset.getString(44)));
		                    e.setRelDistrictName(validarNull(rset.getString(45)));
		                    e.setMoneyType(validarNull(rset.getString("COUNTRYCURRENCY")));
		                    e.setRelRegionName(validarNull(rset.getString(46)));
		                    e.setRelPostalCode(validarNull(rset.getString(47)));
		                    e.setRelCountryName(validarNull(rset.getString(48)));
		                    e.setPartnerName(validarNull(rset.getString(55)));
		                    e.setRelativeID(validarNull(rset.getString(31)));
		                    e.setMoneyID("");
					} catch (Exception ex) {
						throw new SQLException(
								"Error al tratar de convertir registro desde Cursor: " + ex.getMessage());
					}
					return e;
				}
			});
			response.getList().addAll(((List<InsuranceClaimsDataTypePE>) callSPResponse.getResult().get("SYS_REFCURSOR")));
			response.setCode("0");
			response.setMessage("Exito");
		} catch (StoredProcedureConfigurationNotFoundException e) {
			e.printStackTrace();
			e.printStackTrace();
			callSPResponse.setCode(-1);
			callSPResponse.setDescription(e.getMessage());
			response.setCode("1");
			response.setMessage("Error");
			logger.error("Error en el consumo de servicio InsuranceClaimsSearchEndpointPE: "+e.getMessage());
		}
		return response;
	}
	
	public String validarNull(String data) {
        return data == null ? "" : data;

    }
	
}
