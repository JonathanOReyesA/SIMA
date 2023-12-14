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
				                    e.setRelFullName(rset.getString(32));
				                    e.setRelGivenName(rset.getString(33));
				                    e.setFullName(rset.getString(8));
				                    e.setRelMiddleName(rset.getString(34));
				                    e.setRelFamilyName(rset.getString(35));
				                    e.setRelAdditionalFamilyName(rset.getString(36));
				                    e.setRelTaxID(rset.getString(37));
				                    e.setRelHomePhone(rset.getString(38));
				                    e.setRelOfficePhone(rset.getString(39));
				                    e.setRelCellPhone(rset.getString(40));
				                    e.setRelStreetName(rset.getString(41));
				                    e.setRelExteriorHouseID(rset.getString(42));
				                    e.setRelInteriorHouseID(rset.getString(43));
				                    e.setRelCityName(rset.getString(44));
				                    e.setRelDistrictName(rset.getString(45));
				                    e.setMoneyType(rset.getString("COUNTRYCURRENCY"));
				                    e.setRelRegionName(rset.getString(46));
				                    e.setRelPostalCode(rset.getString(47));
				                    e.setRelCountryName(rset.getString(48));
				                    e.setPartnerName(rset.getString(55));
				                    e.setRelativeID(rset.getString(31));
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
