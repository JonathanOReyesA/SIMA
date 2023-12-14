package com.gentera.insurances.endpoints;

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
import mx.com.gentera.seguros.common.persistence.exceptions.StoredProcedureConfigurationNotFoundException;
import mx.com.gentera.seguros.common.persistence.model.CallSPResponse;
import mx.com.gentera.seguros.common.persistence.services.IPersistenceService;
import pe.com.gentera.PropertyAddress;
import pe.com.gentera.PropertyAddressResponse;
import pe.com.gentera.SearchAddressMultiRiesgoPE;

public class SearchAddressMultiRiesgoPEEndpoint implements SearchAddressMultiRiesgoPE{

	/**
	 * Instancia encargada de generar el log de la aplicacion
	 */
	private static final Logger logger = LoggerFactory.getLogger(SearchAddressMultiRiesgoPEEndpoint.class);
	
	
	@Autowired
	EndpointBean searchAddressMultiRiesgoPEEndpointBean;

	/**
	 * Servicios de la capa de persistencia
	 */
	
	@Autowired
	IPersistenceService persistenceService;
	
	@SuppressWarnings("unchecked")
	@Override
	public PropertyAddressResponse searchAddressMultiRiesgo(String insuranceId, String partnerId) {
		logger.info("Se recibio una peticion del id {} para el  servicio {}",insuranceId ,"SearchAddressMultiRiesgoPE");
		CallSPResponse callSPResponse = new CallSPResponse();
		PropertyAddressResponse response = new PropertyAddressResponse();
		List<Object> values = new ArrayList<>();
		values.add(insuranceId);
		values.add(partnerId);
		try {
			callSPResponse = persistenceService.executeFunction_SIMA(searchAddressMultiRiesgoPEEndpointBean.getStoredProcedureName(), values, 
					new RowMapper<PropertyAddress>() {
						@Override
						public PropertyAddress mapRow(ResultSet resultSet, int i) throws SQLException {
							PropertyAddress item = new PropertyAddress();
							int index = 0;
							try {
								index++;
								if (resultSet.getString(index) != null)
									item.setStreetName(resultSet.getString(index));
								index++;
								if (resultSet.getString(index) != null)
									item.setTypeRack(resultSet.getString(index));
								index++;
								if (resultSet.getString(index) != null)
									item.setReference(resultSet.getString(index));
								index++;
								if (resultSet.getString(index) != null)
									item.setUrbanization(resultSet.getString(index));
								index++;
								if (resultSet.getString(index) != null)
									item.setExteriorHouseId(resultSet.getString(index));
								index++;
								if (resultSet.getString(index) != null)
									item.setRegionName(resultSet.getString(index));
								index++;
								if (resultSet.getString(index) != null)
									item.setCityName(resultSet.getString(index));
								index++;
								if (resultSet.getString(index) != null)
									item.setDistrictName(resultSet.getString(index));
								index++;
							} catch (Exception e) {
								throw new SQLException(
										"Error al tratar de convertir registro desde Cursor: " + e.getMessage());
							}

							return item;
						}
					});
			response.getPropertyList().addAll((Collection<PropertyAddress>) callSPResponse.getResult().get("SYS_REFCURSOR"));
		} catch (StoredProcedureConfigurationNotFoundException e) {
			callSPResponse.setCode(-1);
			callSPResponse.setDescription(e.getMessage());
			logger.error("Error en el consumo de servicio PropertyAddressResponse: "+e.getMessage());
		}
		
		return response;
	}
	
	

}
