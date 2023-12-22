package com.gentera.insurances.endpoints;

import com.gentera.insurances.beans.EndpointBean;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import mx.com.gentera.BeneficiariesSeachRespMsgDataType;
import mx.com.gentera.BeneficiariesSearch;
import mx.com.gentera.BeneficiaryDataType;
import mx.com.gentera.seguros.common.persistence.exceptions.StoredProcedureConfigurationNotFoundException;
import mx.com.gentera.seguros.common.persistence.model.CallSPResponse;
import mx.com.gentera.seguros.common.persistence.services.IPersistenceService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.RowMapper;

public class BeneficiariesSearchEndpoint implements BeneficiariesSearch {
	private static final Logger logger = LoggerFactory.getLogger(BeneficiariesSearchEndpoint.class);

	@Autowired
	EndpointBean beneficiariesSearchEndpointBean;

	@Autowired
	IPersistenceService persistenceService;

	@SuppressWarnings("unchecked")
	public BeneficiariesSeachRespMsgDataType beneficiariesSearch(String insuranceID,String mode, String coverageID,
			String partnerID,String affectedID) {
		logger.info("Se recibio una peticion del id {} para el  servicio {}", insuranceID, "BeneficiariesSearch");
		logger.info("Peticion con datos {},{},{},{},{}", new Object[] { insuranceID, mode, coverageID, partnerID,affectedID });
		CallSPResponse callSPResponse = new CallSPResponse();
		BeneficiariesSeachRespMsgDataType response = new BeneficiariesSeachRespMsgDataType();
		List<Object> values = new ArrayList<Object>();
		values.add(insuranceID);
		values.add(mode);
		values.add(coverageID);
		values.add(partnerID);
		values.add(affectedID);
		try {
			callSPResponse = this.persistenceService.executeFunction_SIMA(
					this.beneficiariesSearchEndpointBean.getStoredProcedureName(), values,
					new RowMapper<BeneficiaryDataType>() {

						@Override
						public BeneficiaryDataType mapRow(ResultSet resultSet, int rowNum) throws SQLException {
							BeneficiaryDataType item = new BeneficiaryDataType();
							int index = 0;
							try {
								index++;
								if (resultSet.getString(index) != null)
									item.setPercentage(resultSet.getString(index));
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
									item.setBirthday(resultSet.getDate(index));
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
									item.setOfficePhone(resultSet.getString(index));
								index++;
								if (resultSet.getString(index) != null)
									item.setCellphone(resultSet.getString(index));
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
								if (resultSet.getString(index) != null)
									item.setRelationshipName(resultSet.getString(index));
								index++;
								if (resultSet.getString(index) != null)
									item.setRoleCode(resultSet.getString(index));
								index++;
							} catch (Exception e) {
								throw new SQLException(
										"Error al tratar de convertir registro desde Cursor: " + e.getMessage());
							}
							return item;
						}
					});
			response.getBeneficiariesSearchList().addAll((Collection<BeneficiaryDataType>) callSPResponse.getResult().get("SYS_REFCURSOR"));
		} catch (StoredProcedureConfigurationNotFoundException e) {
			callSPResponse.setCode(Integer.valueOf(-1));
			callSPResponse.setDescription(e.getMessage());
			logger.error("Error en el consumo de servicio BeneficiariesSearchEndpoint: " + e.getMessage());
		}
		return response;
	}
}