package mx.com.gentera.seguros.sima.web;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.support.SpringBootServletInitializer;
import org.springframework.context.annotation.ComponentScan;


@SpringBootApplication
@ComponentScan({"mx.com.gentera"})
public class SimaWebApp extends SpringBootServletInitializer {
  protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
    return application.sources(new Class[] { mx.com.gentera.seguros.sima.web.SimaWebApp.class });
  }
  
  public static void main(String[] args) {
    SpringApplication.run(mx.com.gentera.seguros.sima.web.SimaWebApp.class, args);
  }
}
