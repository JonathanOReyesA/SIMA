package mx.com.gentera.seguros.common.sftp.services;

import java.util.List;
import java.util.Map;

import mx.com.gentera.seguros.common.sftp.beans.SftpSessionBean;

/**
 * PROCESO: Sftp OBJETIVO: Proporciona una interfaz a los procesos de operacion
 * de archivos remotos a traves del servicio SFTP RELACION: [SftpSessionBean]
 * 
 * @author Miguel Angel Carrasco Irineo
 */
public interface ISftpService {

	/**
	 * @param sftpSesion Establece la configuracion de conexion al servidor SFTP
	 * @param sourcePath Establece la ruta de origen de los archivos a procesar
	 * @param targetPath Establece la ruta de destino de los archivos procesados
	 * @param pattern    Establece el patron de busqueda de los archivos
	 * @return Obtiene una respuesta de la ejecucion del proceso
	 */
	Boolean moveFilesMatchPattern(SftpSessionBean sftpSesion, String sourcePath, String targetPath, String pattern);

	/**
	 * @param sftpSesion Establece la configuracion de conexion al servidor SFTP
	 * @param sourcePath Establece la ruta de origen de los archivos a procesar
	 * @param pattern    Establece el patron de busqueda de los archivos
	 * @return Obtiene una lista de los archivos encontrados en la ruta
	 *         proporcionada
	 */
	List<String> listFilesMatchPattern(SftpSessionBean sftpSesion, String sourcePath, String pattern);

	/**
	 * @param sftpSesion Establece la configuracion de conexion al servidor SFTP
	 * @param path       Establece la ruta de origen de los archivos a eliminar
	 * @param pattern    Establece el patron de busqueda de los archivos
	 * @return Obtiene una respuesta de la ejecucion del proceso de eliminacion de
	 *         archivos
	 */
	Boolean deleteFilesMatchPattern(SftpSessionBean sftpSesion, String path, String pattern);

	/**
	 * @param sftpSesion Establece la configuracion de conexion al servidor SFTP
	 * @param sourceFile Establece la ubicacion del archivo a copiar
	 * @param targetPath Establece la ubicacion donde se copiara el archivo
	 * @return Obtiene una respuesta de la ejecucion del proceso de carga del
	 *         archivo
	 */
	Map<String, Boolean> uploadFile(SftpSessionBean sftpSession, List<String> lstSourceFile, String targetPath);

	/**
	 * @param sftpSesion Establece la configuracion de conexion al servidor SFTP
	 * @param sourceFile Establece la ubicacion del archivo a decargar
	 * @param targetFile Establece la ubicacion donde se almacenara el archivo
	 * @return Obtiene una respuesta de la ejecucion del proceso de descarga del
	 *         archivo
	 */
	Boolean downloadFile(SftpSessionBean sftpSession, String sourceFile, String targetFile);

	Boolean downloadFiles(SftpSessionBean sftpSession, String sourceFile, String localFolder, String pattern);

}