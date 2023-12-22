package com.gentera.insurances.endpoints;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.RowMapper;

import com.gentera.insurances.beans.EndpointBean;

import mx.com.gentera.RelationshipDataQuery;
import mx.com.gentera.RelationshipDataRespMsgDataType;
import mx.com.gentera.RelationshipDataType;
import mx.com.gentera.seguros.common.persistence.model.CallSPResponse;
import mx.com.gentera.seguros.common.persistence.services.IPersistenceService;

public class RelationshipDataQueryEndpoint implements RelationshipDataQuery{
	
	private static final Logger logger = LoggerFactory.getLogger(RelationshipDataQueryEndpoint.class);
		
	@Autowired
	EndpointBean relationshipDataQueryEndpointBean;
	
	@Autowired
	IPersistenceService persistenceService;

	@SuppressWarnings("unchecked")
	@Override
	public RelationshipDataRespMsgDataType relationshipDataQuery(String insuranceID, String partnerID) {
		logger.info("Se recibio una peticion del id {} para el  servicio {}",insuranceID ,"RelationshipDataQuery");
		CallSPResponse callSPResponse = new CallSPResponse();
		RelationshipDataRespMsgDataType response = new RelationshipDataRespMsgDataType();
		List<Object> values = new ArrayList<>();
		values.add(insuranceID);
		values.add(partnerID);
		try {
			callSPResponse = persistenceService.executeFunction_SIMA(relationshipDataQueryEndpointBean.getStoredProcedureName(), values, 
					new RowMapper<RelationshipDataType>(){
						@Override
						public RelationshipDataType mapRow(ResultSet resultSet, int i) throws SQLException {
							RelationshipDataType item = new RelationshipDataType();
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
									item.setGender(resultSet.getString(index));
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
									item.setRegionName(resultSet.getString(index));
								index++;
								if (resultSet.getString(index) != null)
									item.setPostalCode(resultSet.getString(index));
								index++;
								if (resultSet.getString(index) != null)
									item.setCityName(resultSet.getString(index));
								index++;
								if (resultSet.getString(index) != null)
									item.setDistrictName(resultSet.getString(index));
								index++;
								if (resultSet.getString(index) != null)
									item.setCountryName(resultSet.getString(index));
								index++;
								if (resultSet.getString(index) != null)
									item.setHomePhone(resultSet.getString(index));
								index++;
								if (resultSet.getString(index) != null)
									item.setTaxID(resultSet.getString(index));
								index++;
								if (resultSet.getString(index) != null)
									item.setBirthday(resultSet.getDate(index));
								index++;
								if (resultSet.getString(index) != null)
									item.setRoleName(resultSet.getString(index));
								index++;
								if (resultSet.getString(index) != null)
									item.setBusinessPartnerID(resultSet.getString(index));
								index++;
								if (resultSet.getString(index) != null)
									item.setPercentage(resultSet.getDouble(index));
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
								item.setTest(0);
								item.setCurp(resultSet.getString("CURP"));
								item.setAgeFamily(resultSet.getInt("AGE"));	
								item.setRelationshipCode(resultSet.getString("RELATIONSHIPCODE"));	
							} catch (Exception e) {
								throw new SQLException(
										"Error al tratar de convertir registro desde Cursor: " + e.getMessage());
							}
							return item;
						}
					});
			response.getRelationshipSearchList().addAll((List<RelationshipDataType>) callSPResponse.getResult().get("SYS_REFCURSOR"));
		} catch (Exception e) {
			callSPResponse.setCode(-1);
			callSPResponse.setDescription(e.getMessage());
			logger.error("Error en el consumo de servicio RelationshipDataQuery: "+e.getMessage());
		}
		return response;
	}
}
