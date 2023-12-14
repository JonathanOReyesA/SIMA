package com.gentera.insurances.endpoints;

import com.gentera.insurances.beans.EndpointBean;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;
import mx.com.gentera.SearchClaims;
import mx.com.gentera.SearchClaimsDataType;
import mx.com.gentera.SearchClaimsRespMsgDataType;
import mx.com.gentera.seguros.common.persistence.exceptions.StoredProcedureConfigurationNotFoundException;
import mx.com.gentera.seguros.common.persistence.model.CallSPResponse;
import mx.com.gentera.seguros.common.persistence.services.IPersistenceService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.RowMapper;

public class SearchClaimsEndpoint implements SearchClaims {
  private static final Logger logger = LoggerFactory.getLogger(SearchClaimsEndpoint.class);
  
  @Autowired
  EndpointBean searchClaimsEndpointBean;
  
  @Autowired
  IPersistenceService persistenceService;
  
  @SuppressWarnings("unchecked")
public SearchClaimsRespMsgDataType claimsSearch(String partnerID, String businessPartnerID, String claimID, String certificate) {
    logger.info("Se recibio una peticion del id {} para el  servicio {}", businessPartnerID, "SearchClaims");
    CallSPResponse callSPResponse = new CallSPResponse();
    SearchClaimsRespMsgDataType response = new SearchClaimsRespMsgDataType();
    List<Object> values = new ArrayList<Object>();
    values.add(partnerID);
    values.add(businessPartnerID);
    values.add(claimID);
    values.add(certificate);
		
		try {
			callSPResponse = persistenceService.executeFunction_SIMA(searchClaimsEndpointBean.getStoredProcedureName(), values, 
					new RowMapper<SearchClaimsDataType>() {
						@Override
						public SearchClaimsDataType mapRow(ResultSet rset, int i) throws SQLException {
							SearchClaimsDataType e = new SearchClaimsDataType();
							try {
								e.setCertificate(rset.getString("CERTIFICATE"));
				                e.setInsuranceID(rset.getString("INSURANCEID"));
				                e.setProductName(rset.getString("PRODUCTNAME"));
				                e.setInsuredAmount(rset.getString("PRODUCTINSUREDAMOUNT"));
				                e.setClaimCauseName(rset.getString(14));
				                e.setModeName(rset.getString(16));
				                e.setBusinessPartnerID(rset.getString("BUSINESSPARTNERID"));
				                e.setAffected(rset.getString("AFFECTED"));
				                e.setAffectedName(rset.getString("affected_name"));
				                e.setCoverageID(rset.getString("COVERAGEID"));
				                e.setClaimID(rset.getString("CLAIMID"));
				                e.setCoverageName(rset.getString("COVERAGECLAIMNAME"));
				                e.setStartDate(rset.getDate("STARTDATE"));
				                e.setEndDate(rset.getDate("ENDDATE"));
				                e.setClaimDate(rset.getDate("CLAIMDATE"));
				                e.setOfficeName(rset.getString(19));
				                e.setClaimCauseID(rset.getString("CLAIMCAUSEID"));
				                e.setMoneyType(rset.getString("MONEYTYPE"));
				                e.setFullName(rset.getString("name"));
				                e.setClaimDatePosted(rset.getDate("CLAIMDATEPOSTED"));
				                e.setClaimStatusID(rset.getString("CLAIMSTATUSID"));
				                e.setClaimStatusName(rset.getString("CLAIMSTATUSNAME"));
				                e.setClaimStatusDate(rset.getDate("CLAIMSTATUSDATE"));
				                e.setGivenName(rset.getString("GIVENNAME"));
				                e.setFamilyName(rset.getString("FAMILYNAME"));
				                e.setMiddleName(rset.getString("MIDDLENAME"));
				                e.setAdditionalFamilyName(rset.getString("ADDITIONALFAMILYNAME"));
				                e.setBirthDate(rset.getDate("BIRTHDATE"));
				                e.setHomePhone(rset.getString("HOMEPHONE"));
				                e.setOfficePhone(rset.getString("OFFICEPHONE"));
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
				                e.setClaimDays(rset.getDouble("CLAIMDAYS"));
				                e.setInsuranceStatusName(rset.getString("STATUSNAME"));
				                e.setInsuranceStatusID(rset.getString("STATUSID"));
				                e.setAmountToPay(rset.getDouble("AMOUNTTOPAY"));
				                e.setPaidDays(rset.getDouble("PAIDDAYS"));
				                e.setAmountPaid(rset.getDouble("AMOUNTPAID"));
				                try {
				                    e.setInitialDateHosp(new SimpleDateFormat("dd/MM/yyyy HH:mm:ss").format(rset.getTimestamp("INITIAL_DATE")));
				                } catch (Exception ex) {
				                    e.setInitialDateHosp("");
				                }
				                try {
				                    e.setEndDateHosp(new SimpleDateFormat("dd/MM/yyyy HH:mm:ss").format(rset.getTimestamp("END_DATE")));
				                } catch (Exception ex) {
				                    e.setEndDateHosp(" ");
				                }
				                e.setModeID(rset.getString("MODEID"));
				                e.setFlagCoverage(rset.getInt("FLAGCOVERAGE"));
				                e.setIdPersonPayable(rset.getString("IDPERSONPAYABLE"));
				                e.setTrackingEmail(rset.getString("TRACKINGEMAIL"));
				                e.setZone(rset.getString("ZONE"));
				                e.setPaymentType(rset.getString("PAYMENTTYPE"));
							} catch (Exception ex) {
								throw new SQLException(
										"Error al tratar de convertir registro desde Cursor: " + ex.getMessage());
							}

							return e;
						}
					});
			response.getSearchClaimsList().addAll((List<SearchClaimsDataType>) callSPResponse.getResult().get("SYS_REFCURSOR"));
		} catch (StoredProcedureConfigurationNotFoundException e) {
			callSPResponse.setCode(-1);
			callSPResponse.setDescription(e.getMessage());
			logger.error("Error en el consumo de servicio SearchClaimPEEndpoint: "+e.getMessage());
		}
		
		
		return response;
	}
}
