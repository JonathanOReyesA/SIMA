package mx.com.gentera.seguros.common.persistence.beans;

/**
 * PROCESO: Persistence OBJETIVO: Almacenar la configuracion del DataSource
 * RELACION: [Ninguna]
 * 
 * @author Miguel Angel Carrasco Irineo
 */
public class DataSourceBean {
	/**
	 * Tiempo de espera en milisegundos antes de cancelar la ejecucion de un proceso
	 * en Base de Datos
	 */
	private Integer maxWait;
	/**
	 * Indica si la conexion debe ser probada mientras se encuentra en estado
	 * Disponible
	 */
	private Boolean testWhileIdle;
	/**
	 * Indica si la conexion debe ser probada antes de prestarla a algun proceso
	 * solicitante
	 */
	private Boolean testOnBorrow;
	/**
	 * Indica si la conexion debe ser probada cuando es devuelta al pool de
	 * conexiones
	 */
	private Boolean testOnReturn;
	/**
	 * Tiempo en milisegundos que la conexion puede permanecer en el pool de
	 * conexiones antes de eliminarla
	 */
	private Long maxAge;
	/**
	 * Tiempo en milisegundos que indica la espera entre cada validacion de cada
	 * conexion en el pool de conexiones
	 */
	private Long validationInterval;
	/**
	 * Tiempo en milisegundos que indica la espera entre cada proceso de desalojo de
	 * conexiones invalidas en el pool de conexiones
	 */
	private Integer timeBetweenEvictionRunsMillis;
	/**
	 * Cantidad de conexiones ativas permitidas en el pool de conexiones
	 */
	private Integer maxActive;
	/**
	 * Cantidad minima de conexiones en estado Disponible para el pool de conexiones
	 */
	private Integer minIdle;
	/**
	 * Numero de conexiones que deben ser creadas al iniciar la actividad del pool
	 * de conexiones
	 */
	private Integer initialSize;
	/**
	 * Indica si las conexiones que han sido abandobadas deben ser removidas del
	 * pool de conexiones
	 */
	private Boolean removeAbandoned;
	/**
	 * Tiempo en milisegundos a partir del cual una conexion Disponible es candidata
	 * a ser desalojada del pool de conexiones
	 */
	private Integer minEvictableIdleTimeMillis;

	/**
	 * @return Establece el tiempo en milisegundos de espera de ejecucion de una
	 *         proceso en Base de Datos
	 */
	public Integer getMaxWait() {
		return maxWait;
	}

	/**
	 * @param maxWait Establece el tiempo en milisegundos de espera de ejecucion de
	 *                un proceso e Base de Datos
	 */
	public void setMaxWait(Integer maxWait) {
		this.maxWait = maxWait;
	}

	/**
	 * @return Obtiene el indicador de que se prueben las conexiones en estado
	 *         Disponible
	 */
	public Boolean getTestWhileIdle() {
		return testWhileIdle;
	}

	/**
	 * @param testWhileIdle Establece el indicador de que se prueben las conexiones
	 *                      en estado Disponible
	 */
	public void setTestWhileIdle(Boolean testWhileIdle) {
		this.testWhileIdle = testWhileIdle;
	}

	/**
	 * @return Obtiene el indicador de que se prueben las conexiones antes de ser
	 *         prestadas
	 */
	public Boolean getTestOnBorrow() {
		return testOnBorrow;
	}

	/**
	 * @param testOnBorrow Establece el indicador de que se prueben las conexiones
	 *                     antes de ser prestadas
	 */
	public void setTestOnBorrow(Boolean testOnBorrow) {
		this.testOnBorrow = testOnBorrow;
	}

	/**
	 * @return Obtiene el indicador de que se prueben las conexiones cuando son
	 *         devueltas al pool de conexiones
	 */
	public Boolean getTestOnReturn() {
		return testOnReturn;
	}

	/**
	 * @param testOnReturn Establece el indicador de que se prueben las conexiones
	 *                     cuando son devueltas al pool de conexiones
	 */
	public void setTestOnReturn(Boolean testOnReturn) {
		this.testOnReturn = testOnReturn;
	}

	/**
	 * @return Obtiene en milisegundos el tiempo maximo que pueden permanecer las
	 *         conexiones en el pool
	 */
	public Long getMaxAge() {
		return maxAge;
	}

	/**
	 * @param maxAge Establece en milisegundos el tiempo maximo que pueden
	 *               permanecer las conexiones en el pool
	 */
	public void setMaxAge(Long maxAge) {
		this.maxAge = maxAge;
	}

	/**
	 * @return Obtiene en milisegundos el tiempo de espera entre cada validacion de
	 *         conexiones
	 */
	public Long getValidationInterval() {
		return validationInterval;
	}

	/**
	 * @param validationInterval Establece en milisegundos el tiempo de espera entre
	 *                           cada validacion de conexiones
	 */
	public void setValidationInterval(Long validationInterval) {
		this.validationInterval = validationInterval;
	}

	/**
	 * @return Obtiene en milisegundos el tiempo de espera entre cada proceso de
	 *         desalojo de conexiones
	 */
	public Integer getTimeBetweenEvictionRunsMillis() {
		return timeBetweenEvictionRunsMillis;
	}

	/**
	 * @param timeBetweenEvictionRunsMillis Establece en milisegundos el tiempo de
	 *                                      espera entre cada proceso de desalojo de
	 *                                      conexiones
	 */
	public void setTimeBetweenEvictionRunsMillis(Integer timeBetweenEvictionRunsMillis) {
		this.timeBetweenEvictionRunsMillis = timeBetweenEvictionRunsMillis;
	}

	/**
	 * @return Obtiene el numero maximo de conexiones que pueden estar activas en el
	 *         pool
	 */
	public Integer getMaxActive() {
		return maxActive;
	}

	/**
	 * @param maxActive Establece el numero maximo de conexiones que pueden estar
	 *                  activas en el pool
	 */
	public void setMaxActive(Integer maxActive) {
		this.maxActive = maxActive;
	}

	/**
	 * @return Obtiene el numero minimo de conexiones que deben estar activas en el
	 *         pool
	 */
	public Integer getMinIdle() {
		return minIdle;
	}

	/**
	 * @param minIdle Establece el numero minimo de conexiones que deben estar
	 *                activas en el pool
	 */
	public void setMinIdle(Integer minIdle) {
		this.minIdle = minIdle;
	}

	/**
	 * @return Obtiene el numero de conexiones creadas en el pool al momento de
	 *         activarse
	 */
	public Integer getInitialSize() {
		return initialSize;
	}

	/**
	 * @param initialSize Establece el numero de conexiones creadas en el pool al
	 *                    momento de activarse
	 */
	public void setInitialSize(Integer initialSize) {
		this.initialSize = initialSize;
	}

	/**
	 * @return Obtiene el indicador de que el pool debe remover las conexiones
	 *         abandonadas
	 */
	public Boolean getRemoveAbandoned() {
		return removeAbandoned;
	}

	/**
	 * @param removeAbandoned Establece el indicador de que el pool debe remover las
	 *                        conexiones abandonadas
	 */
	public void setRemoveAbandoned(Boolean removeAbandoned) {
		this.removeAbandoned = removeAbandoned;
	}

	/**
	 * @return Obtiene el tiempo minimo en milisegundos que debe esperar el pool
	 *         para cada conexion en estado Disponible antes de ser desalojada
	 */
	public Integer getMinEvictableIdleTimeMillis() {
		return minEvictableIdleTimeMillis;
	}

	/**
	 * @param minEvictableIdleTimeMillis Establece el tiempo minimo en milisegundos
	 *                                   que debe esperar el pool para cada conexion
	 *                                   en estado Disponible antes de ser
	 *                                   desalojada
	 */
	public void setMinEvictableIdleTimeMillis(Integer minEvictableIdleTimeMillis) {
		this.minEvictableIdleTimeMillis = minEvictableIdleTimeMillis;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "DataSourceBean [maxWait=" + maxWait + ", testWhileIdle=" + testWhileIdle + ", testOnBorrow="
				+ testOnBorrow + ", testOnReturn=" + testOnReturn + ", maxAge=" + maxAge + ", validationInterval="
				+ validationInterval + ", timeBetweenEvictionRunsMillis=" + timeBetweenEvictionRunsMillis
				+ ", maxActive=" + maxActive + ", minIdle=" + minIdle + ", initialSize=" + initialSize
				+ ", removeAbandoned=" + removeAbandoned + ", minEvictableIdleTimeMillis=" + minEvictableIdleTimeMillis
				+ "]";
	}
}