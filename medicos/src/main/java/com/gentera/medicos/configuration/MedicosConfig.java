package com.gentera.medicos.configuration;

import javax.xml.namespace.QName;
import javax.xml.ws.Endpoint;

import org.apache.cxf.Bus;
import org.apache.cxf.interceptor.LoggingInInterceptor;
import org.apache.cxf.interceptor.LoggingOutInterceptor;
import org.apache.cxf.jaxws.EndpointImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.gentera.medicos.beans.EndpointBean;
import com.gentera.medicos.endpoints.BlackListEndpoint;
import com.gentera.medicos.endpoints.CatalogTypesHospitalsEndpoint;
import com.gentera.medicos.endpoints.ComportamientosEndpoint;
import com.gentera.medicos.endpoints.CreateUpdateHospitalEndpoint;
import com.gentera.medicos.endpoints.FlagCoverageEndpoint;
import com.gentera.medicos.endpoints.GetAgenciasEndpoint;
import com.gentera.medicos.endpoints.GetClientesEndpoint;
import com.gentera.medicos.endpoints.GetDoctorsEndpoint;
import com.gentera.medicos.endpoints.GetHopitalesEndpoint;
import com.gentera.medicos.endpoints.GetIndicatorsEndpoint;
import com.gentera.medicos.endpoints.GetPromotersByOfficeEndpoint;
import com.gentera.medicos.endpoints.GetPromotoresEndpoint;
import com.gentera.medicos.endpoints.GetSubdirectionEndpoint;
import com.gentera.medicos.endpoints.IndicadoresMedicosEndpoint;
import com.gentera.medicos.endpoints.SearchClaimsEndpoint;
import com.gentera.medicos.endpoints.UpdateIMClaimEndpoint;

import mx.com.gentera.seguros.common.persistence.services.IPersistenceService;

@Configuration
@ComponentScan("*.com.gentera")
public class MedicosConfig {

	/**
	 * Direccionamiento interno de endpoints expuestos a traves de CXF
	 */
	@Autowired
	private Bus bus;

	private String targetName = "http://gentera.com.mx/";

	private String port = "Port";

	/**
	 * Servicios de la capa de persistencia
	 */

	@Autowired
	IPersistenceService persistenceService;

	/**
	 * Configuracion del servicio getPromotores
	 * 
	 * @return
	 */
	@Bean
	GetPromotoresEndpoint getPromotoresImpl() {
		return new GetPromotoresEndpoint();
	}

	@Autowired
	GetPromotoresEndpoint getPromotoresEndpointImpl;

	@Autowired
	EndpointBean getPromotoresEndpointBean;

	@Bean
	public Endpoint getPromotoresEndpoint() {
		EndpointImpl endpoint = new EndpointImpl(bus, getPromotoresEndpointImpl);
		endpoint.setServiceName(new QName(targetName, getPromotoresEndpointBean.getServiceName(),
				getPromotoresEndpointBean.getServiceName()));
		endpoint.setEndpointName(new QName(getPromotoresEndpointBean.getServiceName() + port));
		endpoint.getInInterceptors().add(new LoggingInInterceptor());
		endpoint.getOutInterceptors().add(new LoggingOutInterceptor());
		endpoint.publish(getPromotoresEndpointBean.getEndpointContextPath());
		return endpoint;
	}

	/**
	 * Configuracion del servicio getClientes
	 * 
	 * @return
	 */
	@Bean
	GetClientesEndpoint getClientesImpl() {
		return new GetClientesEndpoint();
	}

	@Autowired
	GetClientesEndpoint getClientesEndpointImpl;

	@Autowired
	EndpointBean getClientesEndpointBean;

	@Bean
	public Endpoint getClientesEndpoint() {
		EndpointImpl endpoint = new EndpointImpl(bus, getClientesEndpointImpl);
		endpoint.setServiceName(new QName(targetName, getClientesEndpointBean.getServiceName(),
				getClientesEndpointBean.getServiceName()));
		endpoint.setEndpointName(new QName(getClientesEndpointBean.getServiceName() + port));
		endpoint.getInInterceptors().add(new LoggingInInterceptor());
		endpoint.getOutInterceptors().add(new LoggingOutInterceptor());
		endpoint.publish(getClientesEndpointBean.getEndpointContextPath());
		return endpoint;
	}

	/**
	 * Configuracion del servicio getAgencias
	 * 
	 * @return
	 */
	@Bean
	GetAgenciasEndpoint getAgenciasImpl() {
		return new GetAgenciasEndpoint();
	}

	@Autowired
	GetAgenciasEndpoint getAgenciasEndpointImpl;

	@Autowired
	EndpointBean getAgenciasEndpointBean;

	@Bean
	public Endpoint getAgenciasEndpoint() {
		EndpointImpl endpoint = new EndpointImpl(bus, getAgenciasEndpointImpl);
		endpoint.setServiceName(new QName(targetName, getAgenciasEndpointBean.getServiceName(),
				getAgenciasEndpointBean.getServiceName()));
		endpoint.setEndpointName(new QName(getAgenciasEndpointBean.getServiceName() + port));
		endpoint.getInInterceptors().add(new LoggingInInterceptor());
		endpoint.getOutInterceptors().add(new LoggingOutInterceptor());
		endpoint.publish(getAgenciasEndpointBean.getEndpointContextPath());
		return endpoint;
	}

	/**
	 * Configuracion del servicio getDoctors
	 * 
	 * @return
	 */
	@Bean
	GetDoctorsEndpoint getDoctorsImpl() {
		return new GetDoctorsEndpoint();
	}

	@Autowired
	GetDoctorsEndpoint getDoctorsEndpointImpl;

	@Autowired
	EndpointBean getDoctorsEndpointBean;

	@Bean
	public Endpoint getDoctorsEndpoint() {
		EndpointImpl endpoint = new EndpointImpl(bus, getDoctorsEndpointImpl);
		endpoint.setServiceName(new QName(targetName, getDoctorsEndpointBean.getServiceName(),
				getDoctorsEndpointBean.getServiceName()));
		endpoint.setEndpointName(new QName(getDoctorsEndpointBean.getServiceName() + port));
		endpoint.getInInterceptors().add(new LoggingInInterceptor());
		endpoint.getOutInterceptors().add(new LoggingOutInterceptor());
		endpoint.publish(getDoctorsEndpointBean.getEndpointContextPath());
		return endpoint;
	}

	/**
	 * CONFIGURACION DEL SERVICIO Comportamientos
	 */

	@Bean
	ComportamientosEndpoint ComportamientosEndpointImpl() {
		return new ComportamientosEndpoint();
	}

	@Autowired
	ComportamientosEndpoint comportamientosEndpointImpl;

	@Autowired
	EndpointBean comportamientoEndpointBean;

	@Bean
	public Endpoint comportamientoEndpoint() {
		EndpointImpl endpoint = new EndpointImpl(bus, comportamientosEndpointImpl);
		endpoint.setServiceName(new QName(targetName, comportamientoEndpointBean.getServiceName(),
				comportamientoEndpointBean.getServiceName()));
		endpoint.setEndpointName(new QName(comportamientoEndpointBean.getServiceName() + port));
		endpoint.getInInterceptors().add(new LoggingInInterceptor());
		endpoint.getOutInterceptors().add(new LoggingOutInterceptor());
		endpoint.publish(comportamientoEndpointBean.getEndpointContextPath());
		return endpoint;
	}

	/**
	 * CONFIGURACION DEL SERVICIO FlagCoverage
	 */

	@Bean
	FlagCoverageEndpoint coverageImpl() {
		return new FlagCoverageEndpoint();
	}

	@Autowired
	FlagCoverageEndpoint flagCoverageEndpointImpl;

	@Autowired
	EndpointBean coverageEndpointBean;

	@Bean
	public Endpoint flagCoverageEndpoint() {
		EndpointImpl endpoint = new EndpointImpl(bus, flagCoverageEndpointImpl);
		endpoint.setServiceName(
				new QName(targetName, coverageEndpointBean.getServiceName(), coverageEndpointBean.getServiceName()));
		endpoint.setEndpointName(new QName(coverageEndpointBean.getServiceName() + port));
		endpoint.getInInterceptors().add(new LoggingInInterceptor());
		endpoint.getOutInterceptors().add(new LoggingOutInterceptor());
		endpoint.publish(coverageEndpointBean.getEndpointContextPath());
		return endpoint;
	}

	/**
	 * CONFIGURACION DEL SERVICIO CatalogTypesHospitals
	 */

	@Bean
	CatalogTypesHospitalsEndpoint typeHospitalImpl() {
		return new CatalogTypesHospitalsEndpoint();
	}

	@Autowired
	CatalogTypesHospitalsEndpoint typeHospitalEndpointImpl;

	@Autowired
	EndpointBean hospitalTypeEndpointBean;

	@Bean
	public Endpoint catalogTypesHospitalsEndpoint() {
		EndpointImpl endpoint = new EndpointImpl(bus, typeHospitalEndpointImpl);
		endpoint.setServiceName(new QName(targetName, hospitalTypeEndpointBean.getServiceName(),
				hospitalTypeEndpointBean.getServiceName()));
		endpoint.setEndpointName(new QName(hospitalTypeEndpointBean.getServiceName() + port));
		endpoint.getInInterceptors().add(new LoggingInInterceptor());
		endpoint.getOutInterceptors().add(new LoggingOutInterceptor());
		endpoint.publish(hospitalTypeEndpointBean.getEndpointContextPath());
		return endpoint;
	}

	/**
	 * CONFIGURACION DEL SERVICIO BLACK LIST
	 */

	@Bean
	BlackListEndpoint blackListImpl() {
		return new BlackListEndpoint();
	}

	@Autowired
	BlackListEndpoint blackListEndpointImpl;

	@Autowired
	EndpointBean blackListEndpointBean;

	@Bean
	public Endpoint blackListEndpoint() {
		EndpointImpl endpoint = new EndpointImpl(bus, blackListEndpointImpl);
		endpoint.setServiceName(
				new QName(targetName, blackListEndpointBean.getServiceName(), blackListEndpointBean.getServiceName()));
		endpoint.setEndpointName(new QName(blackListEndpointBean.getServiceName() + port));
		endpoint.getInInterceptors().add(new LoggingInInterceptor());
		endpoint.getOutInterceptors().add(new LoggingOutInterceptor());
		endpoint.publish(blackListEndpointBean.getEndpointContextPath());
		return endpoint;
	}

	/**
	 * CONFIGURACION DEL SERVICIO getMedicos
	 */

	@Bean
	GetHopitalesEndpoint getHospitalesImpl() {
		return new GetHopitalesEndpoint();
	}

	@Autowired
	GetHopitalesEndpoint getHospitalesEndpointImpl;

	@Autowired
	EndpointBean getHospitalesEndpointBean;

	@Bean
	public Endpoint geHospitalesEndpoint() {
		EndpointImpl endpoint = new EndpointImpl(bus, getHospitalesEndpointImpl);
		endpoint.setServiceName(new QName(targetName, getHospitalesEndpointBean.getServiceName(),
				getHospitalesEndpointBean.getServiceName()));
		endpoint.setEndpointName(new QName(getHospitalesEndpointBean.getServiceName() + port));
		endpoint.getInInterceptors().add(new LoggingInInterceptor());
		endpoint.getOutInterceptors().add(new LoggingOutInterceptor());
		endpoint.publish(getHospitalesEndpointBean.getEndpointContextPath());
		return endpoint;
	}

	/**
	 * CONFIGURACION DEL SERVICIO createUpdateHospital
	 */

	@Bean
	CreateUpdateHospitalEndpoint createUpdateHospitalImpl() {
		return new CreateUpdateHospitalEndpoint();
	}

	@Autowired
	CreateUpdateHospitalEndpoint createUpdateHospitalEndpointImpl;

	@Autowired
	EndpointBean createUpdateHospitalEndpointBean;

	@Bean
	public Endpoint createUpdateHospitalEndpoint() {
		EndpointImpl endpoint = new EndpointImpl(bus, createUpdateHospitalEndpointImpl);
		endpoint.setServiceName(new QName(targetName, createUpdateHospitalEndpointBean.getServiceName(),
				createUpdateHospitalEndpointBean.getServiceName()));
		endpoint.setEndpointName(new QName(createUpdateHospitalEndpointBean.getServiceName() + port));
		endpoint.getInInterceptors().add(new LoggingInInterceptor());
		endpoint.getOutInterceptors().add(new LoggingOutInterceptor());
		endpoint.publish(createUpdateHospitalEndpointBean.getEndpointContextPath());
		return endpoint;
	}

	/**
	 * CONFIGURACION DEL SERVICIO GetSubdireccion
	 */

	@Bean
	GetSubdirectionEndpoint getSubdirectionlImpl() {
		return new GetSubdirectionEndpoint();
	}

	@Autowired
	GetSubdirectionEndpoint getSubdirectionEndpointImpl;

	@Autowired
	EndpointBean getSubdireccionEndpointBean;

	@Bean
	public Endpoint getSubdirectionEndpoint() {
		EndpointImpl endpoint = new EndpointImpl(bus, getSubdirectionEndpointImpl);
		endpoint.setServiceName(new QName(targetName, getSubdireccionEndpointBean.getServiceName(),
				getSubdireccionEndpointBean.getServiceName()));
		endpoint.setEndpointName(new QName(getSubdireccionEndpointBean.getServiceName() + port));
		endpoint.getInInterceptors().add(new LoggingInInterceptor());
		endpoint.getOutInterceptors().add(new LoggingOutInterceptor());
		endpoint.publish(getSubdireccionEndpointBean.getEndpointContextPath());
		return endpoint;
	}

	/**
	 * CONFIGURACION DEL SERVICIO GetIndicators
	 */

	@Bean
	GetIndicatorsEndpoint getIndicatorsImpl() {
		return new GetIndicatorsEndpoint();
	}

	@Autowired
	GetIndicatorsEndpoint getIndicatorsEndpointImpl;

	@Autowired
	EndpointBean getIndicatorsEndpointBean;

	@Bean
	public Endpoint getIndicatorsEndpoint() {
		EndpointImpl endpoint = new EndpointImpl(bus, getIndicatorsEndpointImpl);
		endpoint.setServiceName(new QName(targetName, getIndicatorsEndpointBean.getServiceName(),
				getIndicatorsEndpointBean.getServiceName()));
		endpoint.setEndpointName(new QName(getIndicatorsEndpointBean.getServiceName() + port));
		endpoint.getInInterceptors().add(new LoggingInInterceptor());
		endpoint.getOutInterceptors().add(new LoggingOutInterceptor());
		endpoint.publish(getIndicatorsEndpointBean.getEndpointContextPath());
		return endpoint;
	}

	/**
	 * CONFIGURACION DEL SERVICIO GetPromotersByOffice
	 */

	@Bean
	GetPromotersByOfficeEndpoint getPromotersByOfficeImpl() {
		return new GetPromotersByOfficeEndpoint();
	}

	@Autowired
	GetPromotersByOfficeEndpoint getPromotersByOfficeEndpointImpl;

	@Autowired
	EndpointBean getPromotersByOfficeEndpointBean;

	@Bean
	public Endpoint getPromotersByOfficeEndpoint() {
		EndpointImpl endpoint = new EndpointImpl(bus, getPromotersByOfficeEndpointImpl);
		endpoint.setServiceName(new QName(targetName, getPromotersByOfficeEndpointBean.getServiceName(),
				getPromotersByOfficeEndpointBean.getServiceName()));
		endpoint.setEndpointName(new QName(getPromotersByOfficeEndpointBean.getServiceName() + port));
		endpoint.getInInterceptors().add(new LoggingInInterceptor());
		endpoint.getOutInterceptors().add(new LoggingOutInterceptor());
		endpoint.publish(getPromotersByOfficeEndpointBean.getEndpointContextPath());
		return endpoint;
	}

	/**
	 * CONFIGURACION DEL SERVICIO PARAMETROS INDICADORES MEDICOS
	 */

	@Bean
	IndicadoresMedicosEndpoint indicadoresMedicosImpl() {
		return new IndicadoresMedicosEndpoint();
	}

	@Autowired
	IndicadoresMedicosEndpoint indicadoresMedicosEndpointImpl;

	@Autowired
	EndpointBean medicalIndicatorsEndpointBean;

	@Bean
	public Endpoint indicadoresMedicosEndpoint() {
		EndpointImpl endpoint = new EndpointImpl(bus, indicadoresMedicosEndpointImpl);
		endpoint.setServiceName(new QName(targetName, medicalIndicatorsEndpointBean.getServiceName(),
				medicalIndicatorsEndpointBean.getServiceName()));
		endpoint.setEndpointName(new QName(medicalIndicatorsEndpointBean.getServiceName() + port));
		endpoint.getInInterceptors().add(new LoggingInInterceptor());
		endpoint.getOutInterceptors().add(new LoggingOutInterceptor());
		endpoint.publish(medicalIndicatorsEndpointBean.getEndpointContextPath());
		return endpoint;
	}

	/**
	 * CONFIGURACION DEL SERVICIO PARAMETROS UpdateIMClaim
	 */

	@Bean
	UpdateIMClaimEndpoint updateIMClaimImpl() {
		return new UpdateIMClaimEndpoint();
	}

	@Autowired
	UpdateIMClaimEndpoint updateIMClaimEndpointImpl;

	@Autowired
	EndpointBean updateClaimEndpointBean;

	@Bean
	public Endpoint updateIMClaimEndpoint() {
		EndpointImpl endpoint = new EndpointImpl(bus, updateIMClaimEndpointImpl);
		endpoint.setServiceName(new QName(targetName, updateClaimEndpointBean.getServiceName(),
				updateClaimEndpointBean.getServiceName()));
		endpoint.setEndpointName(new QName(updateClaimEndpointBean.getServiceName() + port));
		endpoint.getInInterceptors().add(new LoggingInInterceptor());
		endpoint.getOutInterceptors().add(new LoggingOutInterceptor());
		endpoint.publish(updateClaimEndpointBean.getEndpointContextPath());
		return endpoint;
	}

	/**
	 * Configuracion del servicio searchClaims
	 * 
	 * @return
	 */
	@Bean
	SearchClaimsEndpoint searchClaimsImpl() {
		return new SearchClaimsEndpoint();
	}

	@Autowired
	SearchClaimsEndpoint searchClaimsEndpointImpl;

	@Autowired
	EndpointBean searchClaimsEndpointBean;

	@Bean
	public Endpoint searchClaimsEndpoint() {
		EndpointImpl endpoint = new EndpointImpl(bus, searchClaimsEndpointImpl);
		endpoint.setServiceName(new QName(targetName, searchClaimsEndpointBean.getServiceName(),
				searchClaimsEndpointBean.getServiceName()));
		endpoint.setEndpointName(new QName(searchClaimsEndpointBean.getServiceName() + port));
		endpoint.getInInterceptors().add(new LoggingInInterceptor());
		endpoint.getOutInterceptors().add(new LoggingOutInterceptor());
		endpoint.publish(searchClaimsEndpointBean.getEndpointContextPath());
		return endpoint;
	}
}