package com.gentera.insurances;

import javax.annotation.PostConstruct;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.support.SpringBootServletInitializer;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.core.env.ConfigurableEnvironment;
//import org.springframework.core.env.PropertySource;
import org.springframework.core.io.ClassPathResource;
//import org.springframework.core.io.Resource;
import org.springframework.core.io.support.ResourcePropertySource;

@SpringBootApplication
@ComponentScan({ "com.gentera.insurances" })
public class InsurancesApp extends SpringBootServletInitializer {
	@Autowired
	ConfigurableEnvironment env;

	private String filePrefix = "config";

	@PostConstruct
	public void init() throws Exception {
		byte b;
		int i;
		String[] arrayOfString;
		for (i = (arrayOfString = this.env.getActiveProfiles()).length, b = 0; b < i;) {
			String activeProfile = arrayOfString[b];
			ClassPathResource classPathResource1 = new ClassPathResource(
					"configuration/" + this.filePrefix + "-" + activeProfile + ".properties");
			if (classPathResource1.exists())
				this.env.getPropertySources()
						.addLast( new ResourcePropertySource( classPathResource1));
			b++;
		}
		ClassPathResource classPathResource = new ClassPathResource("configuration/" + this.filePrefix + ".properties");
		if (classPathResource.exists())
			this.env.getPropertySources()
					.addLast( new ResourcePropertySource(classPathResource));
	}

	protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
		return application.sources(new Class[] { InsurancesApp.class });
	}

	public static void main(String[] args) {
		SpringApplication.run(InsurancesApp.class, args);
	}
}
