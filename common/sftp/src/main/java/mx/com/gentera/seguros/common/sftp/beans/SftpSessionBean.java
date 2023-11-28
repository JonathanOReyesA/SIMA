package mx.com.gentera.seguros.common.sftp.beans;

/**
 * PROCESO: Sftp OBJETIVO: Almacenar la configuracion del servicio de conexion
 * via SFTP RELACION: [Ninguna]
 * 
 * @author Miguel Angel Carrasco Irineo
 */
public class SftpSessionBean {
	/**
	 * Nombre del host SFTP
	 */
	private String name;
	/**
	 * IP del host SFTP
	 */
	private String host;
	/**
	 * Puerto del servicio SFTP en el host
	 */
	private String port;
	/**
	 * Usuario para ingresar al servidor SFTP
	 */
	private String user;
	/**
	 * Password para ingresar al servidor SFTP
	 */
	private String password;

	private String timeout;
	

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @return Obtiene el nombre del host SFTP
	 */
	public String getHost() {
		return host;
	}

	/**
	 * @param host Establece el nombre del host SFTP
	 */
	public void setHost(String host) {
		this.host = host;
	}

	/**
	 * @return Obtiene el puerto del servicio SFTP
	 */
	public String getPort() {
		return port;
	}

	/**
	 * @param port Establece el puerto del servicio SFTP
	 */
	public void setPort(String port) {
		this.port = port;
	}

	/**
	 * @return Obtiene el usuario para ingresar al servidor SFTP
	 */
	public String getUser() {
		return user;
	}

	/**
	 * @param user Establece el usuario para ingresar al servidor SFTP
	 */
	public void setUser(String user) {
		this.user = user;
	}

	/**
	 * @return Obtiene el password para ingresar al servidor SFTP
	 */
	public String getPassword() {
		return password;
	}

	/**
	 * @param password Establece el password para ingresar al servidor SFTP
	 */
	public void setPassword(String password) {
		this.password = password;
	}

	/**
	 * @return Obtiene el timeout para ingresar al servidor SFTP
	 */
	public String getTimeout() {
		return timeout;
	}

	/**
	 * @param Timeout Establece el tiempo para ingresar al servidor SFTP
	 */
	public void setTimeout(String timeout) {
		this.timeout = timeout;
	}

}