package mx.com.gentera.seguros.common.sftp.configuration;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import mx.com.gentera.seguros.common.sftp.beans.SftpSessionBean;

/**
 * PROCESO: Sftp OBJETIVO: Almacenar la configuracion de los servicios SFTP
 * RELACION: [SftpSessionBean]
 * 
 * @author Miguel Angel Carrasco Irineo
 */
@Configuration
public class SftpConfig {

	/**
	 * @return Obtiene la configuracion SFTP del servidor de archivos
	 */
	@Bean
	@ConfigurationProperties(prefix = "sftp.server.files")
	public SftpSessionBean filesSftpSession() {

		return new SftpSessionBean();
	}

	/**
	 * @return Obtiene la configuracion SFTP del servidor de Aterna
	 */
	@Bean
	@ConfigurationProperties(prefix = "sftp.server.aterna")
	public SftpSessionBean sftpSessionAterna() {

		return new SftpSessionBean();
	}

	/**
	 * @return Obtiene la configuracion SFTP del servidor de la aseguradora Mapfre
	 */
	@Bean
	@ConfigurationProperties(prefix = "sftp.server.mapfre")
	public SftpSessionBean sftpSessionMapfre() {

		return new SftpSessionBean();
	}

	@Bean
	@ConfigurationProperties(prefix = "sftp.server.mapfre_MXA")
	public SftpSessionBean sftpSessionMapfre_MXA() {

		return new SftpSessionBean();
	}

	/**
	 * @return Obtiene la configuracion SFTP del servidor de la aseguradora
	 *         Universales
	 */
	@Bean
	@ConfigurationProperties(prefix = "sftp.server.universales")
	public SftpSessionBean sftpSessionUniversales() {

		return new SftpSessionBean();
	}

	/**
	 * @return Obtiene la configuracion SFTP del servidor de la aseguradora Rimac
	 */
	@Bean
	@ConfigurationProperties(prefix = "sftp.server.rimac")
	public SftpSessionBean sftpSessionRimac() {

		return new SftpSessionBean();
	}

	/**
	 * @return Obtiene la configuracion SFTP del servidor de base de datos
	 */
	@Bean
	@ConfigurationProperties(prefix = "sftp.server.db")
	public SftpSessionBean dbSftpSession() {

		return new SftpSessionBean();
	}
}