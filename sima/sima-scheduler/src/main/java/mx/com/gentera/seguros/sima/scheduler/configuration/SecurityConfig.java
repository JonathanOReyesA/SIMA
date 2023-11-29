package mx.com.gentera.seguros.sima.scheduler.configuration;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
//import org.springframework.security.config.annotation.authentication.configurers.provisioning.InMemoryUserDetailsManagerConfigurer;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
//import org.springframework.security.config.annotation.web.configurers.ExpressionUrlAuthorizationConfigurer;
import org.springframework.security.config.http.SessionCreationPolicy;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

@EnableWebSecurity
@Configuration
public class SecurityConfig extends WebSecurityConfigurerAdapter {
	private static String REALM = "SIMA";

	protected void configure(HttpSecurity http) throws Exception {
		http.csrf().disable().httpBasic().realmName(REALM).and().authorizeRequests().antMatchers(new String[] { "/**" })
				.authenticated().and().sessionManagement().sessionCreationPolicy(SessionCreationPolicy.STATELESS).and()
				.headers().frameOptions().disable();
	}

	@Autowired
	public void configureGlobal(AuthenticationManagerBuilder auth) throws Exception {
		(auth.inMemoryAuthentication().withUser("admin").password("admin").roles(new String[] { "USER" }).and())
				.withUser("actuator").password("actuator").roles(new String[] { "ACTUATOR" });
	}

	@Bean
	public PasswordEncoder passwordEncoder() {
		return (PasswordEncoder) new BCryptPasswordEncoder();
	}
}