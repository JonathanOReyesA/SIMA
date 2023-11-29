package mx.com.gentera.seguros.sima.scheduler;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.support.SpringBootServletInitializer;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan({ "mx.com.gentera" })
public class SimaSchedulerApp extends SpringBootServletInitializer {
	protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
		return application.sources(new Class[] { SimaSchedulerApp.class });
	}

	public static void main(String[] args) {
		SpringApplication.run(SimaSchedulerApp.class, args);
	}
}
