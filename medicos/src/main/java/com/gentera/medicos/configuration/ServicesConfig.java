package com.gentera.medicos.configuration;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.gentera.medicos.beans.EndpointBean;

@Configuration
public class ServicesConfig {

	/**
	 * @return Obtiene la configuracion del servicio expuesto
	 */
	@Bean
	@ConfigurationProperties(prefix = "endpoint.getPromotores")
	public EndpointBean getPromotoresEndpointBean() {
		return new EndpointBean();
	}

	@Bean
	@ConfigurationProperties(prefix = "endpoint.getClientes")
	public EndpointBean getClientesEndpointBean() {
		return new EndpointBean();
	}

	@Bean
	@ConfigurationProperties(prefix = "endpoint.getAgencias")
	public EndpointBean getAgenciasEndpointBean() {
		return new EndpointBean();
	}

	@Bean
	@ConfigurationProperties(prefix = "endpoint.getDoctors")
	public EndpointBean getDoctorsEndpointBean() {
		return new EndpointBean();
	}

	@Bean
	@ConfigurationProperties(prefix = "endpoint.comportamiento")
	public EndpointBean comportamientoEndpointBean() {
		return new EndpointBean();
	}

	@Bean
	@ConfigurationProperties(prefix = "endpoint.getFlagCoverage")
	public EndpointBean coverageEndpointBean() {
		return new EndpointBean();
	}

	@Bean
	@ConfigurationProperties(prefix = "endpoint.hospitalType")
	public EndpointBean hospitalTypeEndpointBean() {
		return new EndpointBean();
	}

	@Bean
	@ConfigurationProperties(prefix = "endpoint.blackList")
	public EndpointBean blackListEndpointBean() {
		return new EndpointBean();
	}

	@Bean
	@ConfigurationProperties(prefix = "endpoint.getHospitales")
	public EndpointBean getHospitalesEndpointBean() {
		return new EndpointBean();
	}

	@Bean
	@ConfigurationProperties(prefix = "endpoint.createUpdateHospital")
	public EndpointBean createUpdateHospitalEndpointBean() {
		return new EndpointBean();
	}

	@Bean
	@ConfigurationProperties(prefix = "endpoint.getSubdireccion")
	public EndpointBean getSubdireccionEndpointBean() {
		return new EndpointBean();
	}

	@Bean
	@ConfigurationProperties(prefix = "endpoint.getPromotersByOffice")
	public EndpointBean getPromotersByOfficeEndpointBean() {
		return new EndpointBean();
	}

	@Bean
	@ConfigurationProperties(prefix = "endpoint.getIndicators")
	public EndpointBean getIndicatorsEndpointBean() {
		return new EndpointBean();
	}

	@Bean
	@ConfigurationProperties(prefix = "endpoint.medicalIndicators")
	public EndpointBean medicalIndicatorsEndpointBean() {
		return new EndpointBean();
	}

	@Bean
	@ConfigurationProperties(prefix = "endpoint.updateIMClaim")
	public EndpointBean updateClaimEndpointBean() {
		return new EndpointBean();
	}

	@Bean
	@ConfigurationProperties(prefix = "endpoint.searchClaims")
	public EndpointBean searchClaimsEndpointBean() {
		return new EndpointBean();
	}
}
