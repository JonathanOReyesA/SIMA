package mx.com.gentera.seguros.common.persistence.configuration.local;

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
import org.springframework.context.annotation.Primary;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.orm.jpa.JpaTransactionManager;
import org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean;
import org.springframework.orm.jpa.vendor.HibernateJpaVendorAdapter;
import org.springframework.transaction.PlatformTransactionManager;

import mx.com.gentera.seguros.common.persistence.beans.DataSourceBean;

/**
 * PROCESO: Persistence Local OBJETIVO: Configurar los beans de contexto para
 * los servicios de persistencia RELACION: [DataSourceBean]
 * 
 * @author Miguel Angel Carrasco Irineo
 */
@Configuration
@EnableJpaRepositories(basePackages = "mx.com.gentera.seguros.common.persistence.repositories.local", entityManagerFactoryRef = "localEntityManager", transactionManagerRef = "localTransactionManager")
public class PersistenceConfigLocal {
	/**
	 * Generador del log de la clase
	 */
	private static final Logger log = LoggerFactory.getLogger(PersistenceConfigLocal.class);
	/**
	 * Sentencia de validacion de conexiones para H2
	 */
	private static final String VALIDATION_QUERY = "SELECT 1";

	@Bean
	@Primary
	public LocalContainerEntityManagerFactoryBean localEntityManager() {
		LocalContainerEntityManagerFactoryBean em = new LocalContainerEntityManagerFactoryBean();
		em.setPersistenceUnitName("localEntityManager");
		em.setDataSource(localDataSource());
		em.setPackagesToScan(new String[] { "mx.com.gentera.seguros.common.persistence.entities.local" });

		HibernateJpaVendorAdapter vendorAdapter = new HibernateJpaVendorAdapter();
		em.setJpaVendorAdapter(vendorAdapter);

		HashMap<String, Object> properties = new HashMap<>();
		properties.put("hibernate.hbm2ddl.auto", "update");
		properties.put("hibernate.dialect", "org.hibernate.dialect.H2Dialect");

		em.setJpaPropertyMap(properties);

		return em;
	}

	/**
	 * @return Obtiene el origen de datos para la conexion local a traves de H2
	 */
	@Primary
	@Bean(name = "localDataSource")
	@ConfigurationProperties(prefix = "spring.datasource.local")
	public DataSource localDataSource() {
		DataSource dataSource = (DataSource) DataSourceBuilder.create().build();

		log.info("Configurando DataSource {}: {}", "localDataSource", dataSourceBean.toString());
		setDataSourceProperties(dataSource, VALIDATION_QUERY);

		return (DataSource) DataSourceBuilder.create().build();
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

	@Primary
	@Bean
	public PlatformTransactionManager localTransactionManager() {

		JpaTransactionManager transactionManager = new JpaTransactionManager();
		transactionManager.setEntityManagerFactory(localEntityManager().getObject());

		return transactionManager;
	}

	/**
	 * @param dataSource Establece el origen de datos que debe ser asociada al JDBC
	 *                   Template Local
	 * @return Obtiene el JDBC Template Local asociado al origen de datos
	 *         proporcionado
	 */
	@Primary
	@Bean(name = "jdbcTemplateLocal")
	public JdbcTemplate jdbcTemplateLocal(@Qualifier("localDataSource") DataSource dataSource) {

		return new JdbcTemplate(dataSource);
	}

}