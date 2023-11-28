package com.gentera.medicos;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.support.SpringBootServletInitializer;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.core.env.ConfigurableEnvironment;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.support.ResourcePropertySource;

@SpringBootApplication
@ComponentScan("com.gentera.medicos")
public class MedicosApp extends SpringBootServletInitializer {

	/**
	 * Ambiente de trabajo para el contexto de Spring. Permite el acceso a los
	 * archivos de propiedades.
	 */
	@Autowired
	ConfigurableEnvironment env;

	private String filePrefix = "config";

	@PostConstruct
	public void init() throws Exception {

		for (String activeProfile : env.getActiveProfiles()) {
			ClassPathResource classPathResource = new ClassPathResource(
					"configuration/" + filePrefix + "-" + activeProfile + ".properties");
			if (classPathResource.exists()) {
				env.getPropertySources().addLast(new ResourcePropertySource(classPathResource));
			}
		}

		ClassPathResource classPathResource = new ClassPathResource("configuration/" + filePrefix + ".properties");

		if (classPathResource.exists()) {

			env.getPropertySources().addLast(new ResourcePropertySource(classPathResource));
		}
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * org.springframework.boot.web.support.SpringBootServletInitializer#configure(
	 * org.springframework.boot.builder.SpringApplicationBuilder)
	 */
	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
		return application.sources(MedicosApp.class);
	}

	/**
	 * Metodo principal de ejecucion de la aplicacion web
	 * 
	 * @param args Establece los argumentos de ejecucion de la aplicacion web
	 */
	public static void main(String[] args) {
		SpringApplication.run(MedicosApp.class, args);
	}
}