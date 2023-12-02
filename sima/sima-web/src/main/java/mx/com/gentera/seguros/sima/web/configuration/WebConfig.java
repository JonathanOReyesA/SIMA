package mx.com.gentera.seguros.sima.web.configuration;

import mx.com.gentera.seguros.sima.web.beans.ApiPropertiesBean;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class WebConfig {
	
	
	@Bean
	@ConfigurationProperties(prefix = "api.server.scheduler")
	public ApiPropertiesBean apiSchedulerBean() {
		return new ApiPropertiesBean();
	}
}
