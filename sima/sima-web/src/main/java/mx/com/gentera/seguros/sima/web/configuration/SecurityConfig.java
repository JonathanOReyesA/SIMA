package mx.com.gentera.seguros.sima.web.configuration;

import javax.servlet.Filter;
import mx.com.gentera.seguros.sima.web.security.CsrfHeaderFilter;
import mx.com.gentera.seguros.sima.web.security.CustomUser;
import mx.com.gentera.seguros.sima.web.security.CustomUserDetailsContextMapper;
import mx.com.gentera.seguros.sima.web.services.IServerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.ldap.core.ContextSource;
import org.springframework.ldap.core.support.BaseLdapPathContextSource;
import org.springframework.security.authentication.AuthenticationProvider;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
//import org.springframework.security.config.annotation.web.configurers.ExpressionUrlAuthorizationConfigurer;
import org.springframework.security.config.http.SessionCreationPolicy;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.AuthenticationException;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.ldap.DefaultSpringSecurityContextSource;
import org.springframework.security.ldap.userdetails.DefaultLdapAuthoritiesPopulator;
import org.springframework.security.ldap.userdetails.LdapAuthoritiesPopulator;
import org.springframework.security.web.csrf.CsrfFilter;
import org.springframework.security.web.csrf.CsrfTokenRepository;
import org.springframework.security.web.csrf.HttpSessionCsrfTokenRepository;
import java.util.Collection;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;

@Configuration
public class SecurityConfig extends WebSecurityConfigurerAdapter {

	@Autowired
	IServerService serverService;

	@Value("${spring.ldap.userSearchFilter}")
	private String userSearchFilter;

	@Value("${spring.ldap.userSearchBase}")
	private String userSearchBase;

	@Value("${spring.ldap.groupSearchBase}")
	private String groupSearchBase;

	@Value("${spring.ldap.userDn}")
	private String userDn;

	@Value("${spring.ldap.password}")
	private String password;

	@Value("${spring.ldap.url}")
	private String url;

	private static String REALM = "SIMA";

	protected void configure(HttpSecurity http) throws Exception {
		http.csrf().disable().httpBasic().realmName(REALM).and().authorizeRequests()
				.antMatchers(new String[] { "/api/**" }).authenticated().antMatchers(new String[] { "/**" }).permitAll()
				.anyRequest().authenticated().and().logout().and().csrf().csrfTokenRepository(csrfTokenRepository())
				.and().sessionManagement().sessionCreationPolicy(SessionCreationPolicy.IF_REQUIRED)
				.invalidSessionUrl("/").and().addFilterAfter((Filter) new CsrfHeaderFilter(), CsrfFilter.class);
	}

	@Bean
	public CustomUserDetailsContextMapper customUserDetailsContextMapper() {
		return new CustomUserDetailsContextMapper();
	}

	@Bean
	public BaseLdapPathContextSource contextSource() throws Exception {
		DefaultSpringSecurityContextSource contextSource = new DefaultSpringSecurityContextSource(this.url);
		contextSource.setUserDn(this.userDn);
		contextSource.setPassword(this.password);
		contextSource.setReferral("ignore");
		contextSource.afterPropertiesSet();
		return (BaseLdapPathContextSource) contextSource;
	}

	@Bean
	public LdapAuthoritiesPopulator ldapAuthoritiesPopulator() throws Exception {
		DefaultLdapAuthoritiesPopulator populator = new DefaultLdapAuthoritiesPopulator(contextSource(),
				this.groupSearchBase);
		populator.setIgnorePartialResultException(true);
		return (LdapAuthoritiesPopulator) populator;
	}

	@Autowired
	protected void configureGlobal(AuthenticationManagerBuilder auth) throws Exception {
		auth.authenticationProvider(new AuthenticationProvider() {

			@Override
			public Authentication authenticate(Authentication authentication) throws AuthenticationException {
				CustomUser user = SecurityConfig.this.serverService.consultarServicioPrueba(authentication.getName(),
						(String) authentication.getCredentials());
				Collection<? extends GrantedAuthority> authorities = user.getAuthorities();
				return new UsernamePasswordAuthenticationToken(user, "", authorities);
			}

			@Override
			public boolean supports(Class<?> authentication) {
				return true;
			}

		});
	}

	private CsrfTokenRepository csrfTokenRepository() {
		HttpSessionCsrfTokenRepository repository = new HttpSessionCsrfTokenRepository();
		repository.setHeaderName("X-XSRF-TOKEN");
		return (CsrfTokenRepository) repository;
	}

	@Bean
	public PasswordEncoder passwordEncoder() {
		return (PasswordEncoder) new BCryptPasswordEncoder();
	}
}