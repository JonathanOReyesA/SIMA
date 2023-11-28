package mx.com.gentera.seguros.common.persistence.configuration.sima;

import java.util.HashMap;

import org.apache.tomcat.jdbc.pool.DataSource;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.autoconfigure.jdbc.DataSourceBuilder;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.orm.jpa.JpaTransactionManager;
import org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean;
import org.springframework.orm.jpa.vendor.HibernateJpaVendorAdapter;
import org.springframework.transaction.PlatformTransactionManager;

import mx.com.gentera.seguros.common.persistence.beans.DataSourceBean;

/**
 * PROCESO: Persistence SIMA OBJETIVO: Configurar los beans de contexto para los
 * servicios de persistencia RELACION: [DataSourceBean]
 * 
 * @author Miguel Angel Carrasco Irineo
 */
@Configuration
@EnableJpaRepositories(basePackages = "mx.com.gentera.seguros.common.persistence.repositories.sima", entityManagerFactoryRef = "simaEntityManager", transactionManagerRef = "simaTransactionManager")
public class PersistenceConfigSIMA {
	/**
	 * Generador del log de la clase
	 */
	private static final Logger log = LoggerFactory.getLogger(PersistenceConfigSIMA.class);
	/**
	 * Sentencia de validacion de conexiones para Oracle
	 */
	private static final String VALIDATION_QUERY_ORACLE = "SELECT 1 FROM DUAL";

	@Bean(name = "simaEntityManager")
	public LocalContainerEntityManagerFactoryBean simaEntityManager() {
		LocalContainerEntityManagerFactoryBean em = new LocalContainerEntityManagerFactoryBean();
		em.setPersistenceUnitName("simaEntityManager");
		em.setDataSource(simaDataSource());
		em.setPackagesToScan(new String[] { "mx.com.gentera.seguros.common.persistence.entities.sima" });

		HibernateJpaVendorAdapter vendorAdapter = new HibernateJpaVendorAdapter();
		em.setJpaVendorAdapter(vendorAdapter);

		HashMap<String, Object> properties = new HashMap<>();
		properties.put("hibernate.hbm2ddl.auto", "validate");
		// properties.put("hibernate.dialect",
		// "org.hibernate.dialect.Oracle10gDialect");
		properties.put("hibernate.dialect", "org.hibernate.dialect.Oracle12cDialect");
		em.setJpaPropertyMap(properties);

		return em;
	}

	/**
	 * @return Obtiene el origen de datos para la conexion a BD Oracle de SIMA
	 */
	@Bean(name = "simaDataSource")
	@ConfigurationProperties(prefix = "spring.datasource.sima")
	public DataSource simaDataSource() {
		DataSource dataSource = (DataSource) DataSourceBuilder.create().build();

		log.info("Configurando DataSource {}: {}", "simaDataSource", dataSourceBean.toString());
		setDataSourceProperties(dataSource, VALIDATION_QUERY_ORACLE);

		return dataSource;
	}

	/**
	 * Inyeccion de dependencia para la configuracion de origenes de datos
	 */
	@Autowired
	private DataSourceBean dataSourceBean;

	/**
	 * Configura un pool de conexiones
	 * 
	 * @param dataSource      Establece el origen de datos a configurar
	 * @param validationQuery Establece la sentencia de validacion para el origen de
	 *                        datos
	 * @return Obtiene el origen de datos configurado segun la configuracion
	 *         proporcionada
	 */
	private DataSource setDataSourceProperties(DataSource dataSource, String validationQuery) {
		dataSource.setValidationQuery(validationQuery);

		if (dataSourceBean != null) {
			dataSource.setMaxWait(dataSourceBean.getMaxWait());
			dataSource.setTestWhileIdle(dataSourceBean.getTestWhileIdle());
			dataSource.setTestOnBorrow(dataSourceBean.getTestOnBorrow());
			dataSource.setTestOnReturn(dataSourceBean.getTestOnReturn());
			dataSource.setMaxAge(dataSourceBean.getMaxAge());
			dataSource.setValidationInterval(dataSourceBean.getValidationInterval());
			dataSource.setTimeBetweenEvictionRunsMillis(dataSourceBean.getTimeBetweenEvictionRunsMillis());
			dataSource.setMaxActive(dataSourceBean.getMaxActive());
			dataSource.setMinIdle(dataSourceBean.getMinIdle());
			dataSource.setInitialSize(dataSourceBean.getInitialSize());
			dataSource.setRemoveAbandoned(dataSourceBean.getRemoveAbandoned());
			dataSource.setMinEvictableIdleTimeMillis(dataSourceBean.getMinEvictableIdleTimeMillis());
		} else {
			dataSource.setMaxWait(-1);
			dataSource.setTestWhileIdle(true);
			dataSource.setTestOnBorrow(true);
			dataSource.setTestOnReturn(true);
			dataSource.setMaxAge(600000);
			dataSource.setValidationInterval(1000);
			dataSource.setTimeBetweenEvictionRunsMillis(3000);
			dataSource.setMaxActive(100);
			dataSource.setMinIdle(0);
			dataSource.setInitialSize(0);
			dataSource.setRemoveAbandoned(false);
			dataSource.setMinEvictableIdleTimeMillis(10000);
		}

		return dataSource;
	}

	@Bean
	public PlatformTransactionManager simaTransactionManager() {

		JpaTransactionManager transactionManager = new JpaTransactionManager();
		transactionManager.setEntityManagerFactory(simaEntityManager().getObject());

		return transactionManager;
	}

	/**
	 * @param dataSource Establece el origen de datos que debe ser asociada al JDBC
	 *                   Template de SIMA
	 * @return Obtiene el JDBC Template de SIMA asociado al origen de datos
	 *         proporcionado
	 */
	@Bean(name = "jdbcTemplateSIMA")
	public JdbcTemplate jdbcTemplateSIMA(@Qualifier("simaDataSource") DataSource dataSource) {

		return new JdbcTemplate(dataSource);
	}

}
