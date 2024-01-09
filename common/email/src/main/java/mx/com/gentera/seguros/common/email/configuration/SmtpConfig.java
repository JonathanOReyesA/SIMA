package mx.com.gentera.seguros.common.email.configuration;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

import mx.com.gentera.seguros.common.email.beans.SmtpBean;

/**
 * PROCESO: Email OBJETIVO: Almacenar la configuracion de los servicios SMTP
 * RELACION: [SmtpBean]
 * 
 * @author Miguel Angel Carrasco Irineo
 */
@Component
@Configuration
@Profile({ "development", "hotfix", "modular", "integration", "performance", "production", "embedded",
		"developmentUpgrade", "modularUpgrade", "integrationUpgrade", "performanceUpgrade" })
public class SmtpConfig {

	/**
	 * @return Obtiene la configuracion del servidor SMTP
	 */
	@Bean
	@ConfigurationProperties(prefix = "smtp.server.seguros")
	public SmtpBean segurosSmtp() {
		return new SmtpBean();
	}
}
