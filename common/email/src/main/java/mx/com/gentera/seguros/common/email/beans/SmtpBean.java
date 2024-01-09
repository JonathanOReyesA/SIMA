package mx.com.gentera.seguros.common.email.beans;

/**
 * PROCESO: Email OBJETIVO: Almacenar la configuracion del servicio SMTP
 * RELACION: [Ninguna]
 * 
 * @author Miguel Angel Carrasco Irineo
 */
public class SmtpBean {

	private String name;
	/**
	 * Nombre del host del servicio SMTP
	 */
	private String host;
	/**
	 * Puerto del servicio SMTP en el servidor
	 */
	private Integer port;
	/**
	 * Usuario para ingresar al SMTP
	 */
	private String user;
	/**
	 * Password para ingresar al SMTP
	 */
	private String password;
	/**
	 * Correo para enviar correos cuando hay un envio automatico en Mexico
	 */
	private String correoActivation;
	/**
	 * contraseña de correo para enviar correos cuando hay un envio automatico en Mexico
	 */
	private String passwordActivation;
	/**
	 * Indicador de autenticacion requerida en el servidor
	 */
	private String auth;
	/**
	 * Indicador de conexion SSL hacia el servidor
	 */
	private String ssl;
	/**
	 * Indicador de verificacion de la identidad del servidor
	 */
	private String checkserveridentity;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @return Obtiene el nombre del servidor
	 */
	public String getHost() {
		return host;
	}

	/**
	 * @param host Establece el nombre del servidor
	 */
	public void setHost(String host) {
		this.host = host;
	}

	/**
	 * @return Obtiene el puerto del servicio SMTP
	 */
	public Integer getPort() {
		return port;
	}

	/**
	 * @param port Establece el puerto del servicio SMTP
	 */
	public void setPort(Integer port) {
		this.port = port;
	}

	/**
	 * @return Obtiene el usuario para ingresar al servicio SMTP
	 */
	public String getUser() {
		return user;
	}

	/**
	 * @param user Establece el usuario para ingresar al servicio SMTP
	 */
	public void setUser(String user) {
		this.user = user;
	}

	/**
	 * @return Obtiene el password para ingresar al servicio SMPT
	 */
	public String getPassword() {
		return password;
	}
	

	/**
	 * @return the correoActivation
	 */
	public String getCorreoActivation() {
		return correoActivation;
	}

	/**
	 * @param correoActivation the correoActivation to set
	 */
	public void setCorreoActivation(String correoActivation) {
		this.correoActivation = correoActivation;
	}

	/**
	 * @return the passwordActivation
	 */
	public String getPasswordActivation() {
		return passwordActivation;
	}

	/**
	 * @param passwordActivation the passwordActivation to set
	 */
	public void setPasswordActivation(String passwordActivation) {
		this.passwordActivation = passwordActivation;
	}

	/**
	 * @param password Establece el password para ingresar al servicio SMPT
	 */
	public void setPassword(String password) {
		this.password = password;
	}

	/**
	 * @return Obtiene el indicador de que se requiere autenticacion en el servidor
	 */
	public String getAuth() {
		return auth;
	}

	/**
	 * @param auth Establece el indicador de que se requiere autenticacion en el
	 *             servidor
	 */
	public void setAuth(String auth) {
		this.auth = auth;
	}

	/**
	 * @return Obtiene el indicador de que se requiere conexion SSL hacia el
	 *         servidor
	 */
	public String getSsl() {
		return ssl;
	}

	/**
	 * @param ssl Establece el indicador de que se requiere conexion SSL hacia el
	 *            servidor
	 */
	public void setSsl(String ssl) {
		this.ssl = ssl;
	}

	/**
	 * @return Obtiene el indicador de que se requiere verificar la identidad del
	 *         servidor
	 */
	public String getCheckserveridentity() {
		return checkserveridentity;
	}

	/**
	 * @param checkserveridentity Establece el indicador de que se requiere
	 *                            verificar la identidad del servidor
	 */
	public void setCheckserveridentity(String checkserveridentity) {
		this.checkserveridentity = checkserveridentity;
	}
}