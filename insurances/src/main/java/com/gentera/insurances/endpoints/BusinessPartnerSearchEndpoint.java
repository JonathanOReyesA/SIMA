package com.gentera.insurances.endpoints;

import com.gentera.insurances.beans.EndpointBean;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import mx.com.gentera.BusinessPartnerSearch;
import mx.com.gentera.BusinessPartnerSearchRespMsgDataType;
import mx.com.gentera.seguros.common.persistence.exceptions.StoredProcedureConfigurationNotFoundException;
import mx.com.gentera.seguros.common.persistence.model.CallSPResponse;
import mx.com.gentera.seguros.common.persistence.services.IPersistenceService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.RowMapper;

public class BusinessPartnerSearchEndpoint implements BusinessPartnerSearch {
	private static final Logger logger = LoggerFactory.getLogger(BusinessPartnerSearchEndpoint.class);

	@Autowired
	EndpointBean businessPartnerSearchEndpointBean;

	@Autowired
	IPersistenceService persistenceService;

	@SuppressWarnings("unchecked")
	public BusinessPartnerSearchRespMsgDataType businessPartnerSearch(String businessPartnerID, String partnerID) {
		logger.info("Se recibio una peticion del id {} para el  servicio {}", businessPartnerID,
				"BusinessPartnerSearch");
		logger.info("Peticion con datos {},{},{},{}", businessPartnerID, partnerID);
		CallSPResponse callSPResponse = new CallSPResponse();
		BusinessPartnerSearchRespMsgDataType response = new BusinessPartnerSearchRespMsgDataType();
		List<Object> values = new ArrayList<Object>();
		values.add(businessPartnerID);
		values.add(partnerID);
		try {
			callSPResponse = this.persistenceService.executeFunction_SIMA(
					this.businessPartnerSearchEndpointBean.getStoredProcedureName(), values,
					new RowMapper<BusinessPartnerSearchRespMsgDataType>() {

						@Override
						public BusinessPartnerSearchRespMsgDataType mapRow(ResultSet resultSet, int rowNum)
								throws SQLException {
							BusinessPartnerSearchRespMsgDataType item = new BusinessPartnerSearchRespMsgDataType();
							int index = 0;
							try {
								index++;
								if (resultSet.getString(index) != null)
									item.setGivenName(resultSet.getString(index));
								index++;
								if (resultSet.getString(index) != null)
									item.setMiddleName(resultSet.getString(index));
								index++;
								if (resultSet.getString(index) != null)
									item.setFamilyName(resultSet.getString(index));
								index++;
								if (resultSet.getString(index) != null)
									item.setAdditionalFamilyName(resultSet.getString(index));
								index++;
								if (resultSet.getString(index) != null)
									item.setBirthDate(resultSet.getDate(index));
								index++;
								if (resultSet.getString(index) != null)
									item.setAge(Integer.valueOf(resultSet.getInt(index)));
								index++;
								if (resultSet.getString(index) != null)
									item.setGender(resultSet.getString(index));
								index++;
								if (resultSet.getString(index) != null)
									item.setTaxID(resultSet.getString(index));
								index++;
								if (resultSet.getString(index) != null)
									item.setHomePhone(resultSet.getString(index));
								index++;
								if (resultSet.getString(index) != null)
									item.setPercentage(resultSet.getString(index));
								index++;
								if (resultSet.getString(index) != null)
									item.setOfficePhone(resultSet.getString(index));
								index++;
								if (resultSet.getString(index) != null)
									item.setCellPhone(resultSet.getString(index));
								index++;
								if (resultSet.getString(index) != null)
									item.setStreetName(resultSet.getString(index));
								index++;
								if (resultSet.getString(index) != null)
									item.setExteriorHouseID(resultSet.getString(index));
								index++;
								if (resultSet.getString(index) != null)
									item.setInteriorHouseID(resultSet.getString(index));
								index++;
								if (resultSet.getString(index) != null)
									item.setCityName(resultSet.getString(index));
								index++;
								if (resultSet.getString(index) != null)
									item.setDistrictName(resultSet.getString(index));
								index++;
								if (resultSet.getString(index) != null)
									item.setRegionName(resultSet.getString(index));
								index++;
								if (resultSet.getString(index) != null)
									item.setPostalCode(resultSet.getString(index));
								index++;
								if (resultSet.getString(index) != null)
									item.setCountryName(resultSet.getString(index));
								index++;
								if (resultSet.getString(index) != null)
									item.setAddressType(resultSet.getString(index));
								index++;
								if (resultSet.getString(index) != null)
									item.setBusinessPartnerID(resultSet.getString(index));
								index++;
								if (resultSet.getString(index) != null)
									item.setMarriedFamilyName(resultSet.getString(index));
								index++;
								if (resultSet.getString(index) != null)
									item.setMaritalStatus(resultSet.getString(index));
								index++;
								if (resultSet.getString(index) != null)
									item.setZone(resultSet.getString(index));
								index++;
							} catch (Exception e) {
								throw new SQLException(
										"Error al tratar de convertir registro desde Cursor: " + e.getMessage());
							}
							return item;
						}
					});
			response = ((List<BusinessPartnerSearchRespMsgDataType>) callSPResponse.getResult().get("SYS_REFCURSOR"))
					.get(0);
		} catch (StoredProcedureConfigurationNotFoundException e) {
			callSPResponse.setCode(Integer.valueOf(-1));
			callSPResponse.setDescription(e.getMessage());
			logger.error("Error en el consumo de servicio businessPartnerSearch: " + e.getMessage());
		}
		return response;
	}
}