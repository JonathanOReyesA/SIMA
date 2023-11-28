package mx.com.gentera.seguros.common.persistence.configuration;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import mx.com.gentera.seguros.common.persistence.beans.DataSourceBean;

/**
 * PROCESO: Persistence OBJETIVO: Configurar los beans de contexto para los
 * servicios de persistencia RELACION: [DataSourceBean]
 * 
 * @author Miguel Angel Carrasco Irineo
 */
@Configuration
public class PersistenceConfig {

	/**
	 * @return Obtiene el bean de configuracion de origenes de datos
	 */
	@Bean
	@ConfigurationProperties(prefix = "datasource")
	public DataSourceBean dataSourceBean() {

		return new DataSourceBean();
	}

}
