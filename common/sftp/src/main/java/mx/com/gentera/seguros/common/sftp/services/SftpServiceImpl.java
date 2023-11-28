package mx.com.gentera.seguros.common.sftp.services;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import com.jcraft.jsch.Channel;
import com.jcraft.jsch.ChannelSftp;
import com.jcraft.jsch.JSch;
import com.jcraft.jsch.JSchException;
import com.jcraft.jsch.Session;
import com.jcraft.jsch.SftpException;

import mx.com.gentera.seguros.common.sftp.beans.SftpSessionBean;

@Service
public class SftpServiceImpl implements ISftpService {
	private static final Logger log = LoggerFactory.getLogger(SftpServiceImpl.class);

	/**
	 * @param sftpSession Establece la configuracion del servidor SFTP
	 * @return Obtiene una sesion SFTP sobre el servidor indicado
	 * @throws JSchException Lanza una excepcion cuando ocurre un error en la
	 *                       conexion al servidor SFTP
	 */
	private Session getSession(SftpSessionBean sftpSession) throws JSchException {
		JSch jsch = new JSch();

		String host = sftpSession.getHost();
		String port = sftpSession.getPort();
		String user = sftpSession.getUser();
		String password = sftpSession.getPassword();
		String timeOutSession = sftpSession.getTimeout();

		Integer sftpPort = 22;
		Integer timeOut = 600000;

		if (port == null || port.isEmpty()) {
			log.info("No se ha indicado un puerto para el protocolo sftp, puerto por omision {}", sftpPort);
		} else if (port.matches("^\\d+$")) {
			sftpPort = Integer.parseInt(port);
		} else {
			log.info("El puerto indicado {} no es valido, intentando conectar con el puerto default {}", port,
					sftpPort);
		}

		timeOut = timeOutSession.matches("^\\d+$") ? Integer.parseInt(timeOutSession) : timeOut;

		Session session = jsch.getSession(user, host, sftpPort);

		session.setConfig("PreferredAuthentications", "password");
		session.setConfig("StrictHostKeyChecking", "no");
		session.setPassword(password);
		session.setTimeout(timeOut);

		log.info("Iniciando sesión en el servidor: {}: Timeout establecido:{}", session.getHost(),
				session.getTimeout());
		session.connect();
		log.info("Sesión iniciada en el servidor: {}", session.getHost());

		return session;
	}

	/**
	 * @param session Establece la sesion de trabajo en el servidor SFTP
	 * @return Obtiene un canal seguro de intercambio de archivos
	 * @throws JSchException Lanza una excepcion cuando ocurre un error al intentar
	 *                       abrir el canal seguro con el servidor SFTP
	 */
	private ChannelSftp getSftpChannel(Session session) throws JSchException {
		log.info("Conectando al canal sftp: {}:{}", session.getHost(), session.getPort());

		Channel channel = session.openChannel("sftp");

		ChannelSftp sftp = null;
		sftp = (ChannelSftp) channel;
		sftp.connect();
		log.info("Conectado al canal sftp: {}:{}", session.getHost(), session.getPort());

		return sftp;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * mx.com.gentera.psc.scheduler.services.ISftpService#moveFilesMatchPattern(mx.
	 * com.gentera.psc.scheduler.beans.SftpSessionBean, java.lang.String,
	 * java.lang.String, java.lang.String)
	 */
	@Override
	public Boolean moveFilesMatchPattern(SftpSessionBean sftpSession, String sourcePath, String targetPath,
			String pattern) {
		Boolean result = false;
		Session session = null;
		ChannelSftp channelSftp = null;

		try {
			log.info("Moviendo archivos en el servidor: {}/{}", sourcePath, pattern);

			session = getSession(sftpSession);
			channelSftp = getSftpChannel(session);

			channelSftp.cd(sourcePath);

			@SuppressWarnings("unchecked")
			ArrayList<ChannelSftp.LsEntry> ls = new ArrayList<>(channelSftp.ls(pattern));

			int counter = 0;

			for (ChannelSftp.LsEntry entry : ls) {
				channelSftp.rename(entry.getFilename(), targetPath + "/" + entry.getFilename());
				counter++;
			}

			log.info("Se han movido {} archivos hacia: {}", counter, targetPath);

			result = true;
		} catch (SftpException | JSchException e) {
			log.error(e.getMessage());
		} finally {
			if (channelSftp != null && channelSftp.isConnected()) {
				channelSftp.exit();
				channelSftp.disconnect();
			}
			if (session != null && session.isConnected()) {
				session.disconnect();
			}
		}

		return result;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * mx.com.gentera.psc.scheduler.services.ISftpService#listFilesMatchPattern(mx.
	 * com.gentera.psc.scheduler.beans.SftpSessionBean, java.lang.String,
	 * java.lang.String)
	 */
	@Override
	public List<String> listFilesMatchPattern(SftpSessionBean sftpSession, String path, String pattern) {
		List<String> files = new ArrayList<>();
		Session session = null;
		ChannelSftp channelSftp = null;

		try {
			log.info("Listando archivos del servidor: {}/{}", path, pattern);

			session = getSession(sftpSession);
			channelSftp = getSftpChannel(session);

			channelSftp.cd(path);

			@SuppressWarnings("unchecked")
			ArrayList<ChannelSftp.LsEntry> ls = new ArrayList<>(channelSftp.ls(pattern));
			String pathWithSlash = path.concat("/");

			for (ChannelSftp.LsEntry entry : ls) {
				String filePath = pathWithSlash + entry.getFilename();

				files.add(filePath);
			}

			log.info("Se encontraron {} archivos en el servidor: {}/{}", files.size(), path, pattern);
		} catch (SftpException | JSchException e) {
			log.error(e.getMessage());
		} finally {
			if (channelSftp != null && channelSftp.isConnected()) {
				channelSftp.exit();
				channelSftp.disconnect();
			}
			if (session != null && session.isConnected()) {
				session.disconnect();
			}
		}

		return files;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * mx.com.gentera.psc.scheduler.services.ISftpService#deleteFilesMatchPattern(mx
	 * .com.gentera.psc.scheduler.beans.SftpSessionBean, java.lang.String,
	 * java.lang.String)
	 */
	@Override
	public Boolean deleteFilesMatchPattern(SftpSessionBean sftpSession, String path, String pattern) {
		Boolean result = false;
		int counter = 0;
		Session session = null;
		ChannelSftp channelSftp = null;

		try {
			log.info("Eliminando archivos en el servidor: {}/{}", path, pattern);

			session = getSession(sftpSession);
			channelSftp = getSftpChannel(session);

			channelSftp.cd(path);

			@SuppressWarnings("unchecked")
			ArrayList<ChannelSftp.LsEntry> ls = new ArrayList<>(channelSftp.ls(pattern));

			for (ChannelSftp.LsEntry entry : ls) {
				channelSftp.rm(entry.getFilename());
				counter++;
			}

			log.info("Se eliminaron {} archivos en el servidor: {}/{}", counter, path, pattern);

			result = true;
		} catch (SftpException | JSchException e) {
			log.error(e.getMessage());
		} finally {
			if (channelSftp != null && channelSftp.isConnected()) {
				channelSftp.exit();
				channelSftp.disconnect();
			}
			if (session != null && session.isConnected()) {
				session.disconnect();
			}
		}

		return result;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * mx.com.gentera.psc.scheduler.services.ISftpService#uploadFile(mx.com.gentera.
	 * psc.scheduler.beans.SftpSessionBean, java.lang.String, java.lang.String)
	 */
	@Override
	public Map<String, Boolean> uploadFile(SftpSessionBean sftpSession, List<String> lstSourceFile, String targetPath) {
		Map<String, Boolean> result = new HashMap<>();
		Session session = null;
		ChannelSftp channelSftp = null;

		try {
			session = getSession(sftpSession);
			channelSftp = getSftpChannel(session);
			try {
				channelSftp.mkdir(targetPath);
			} catch (Exception e1) {
			}
			channelSftp.cd(targetPath);

			for (String sourceFile : lstSourceFile) {
				File file = new File(sourceFile);
				try (InputStream inputStream = new FileInputStream(file)) {
					long fileLength = file.length();
					String measurement = "Bytes";

					if (fileLength > 1024) {
						fileLength = fileLength / 1024;
						measurement = "KB";
					}

					log.info("Subiendo archivo {} con {} {} hacia el servidor @{}{}", sourceFile, fileLength,
							measurement, sftpSession.getHost(), targetPath);

					channelSftp.put(inputStream, file.getName());

					log.info("Se subió un archivo hacia el servidor");

					result.put(sourceFile, true);
				} catch (Exception e) {
					log.error(e.getMessage());

					result.put(e.getMessage(), false);
				}
			}
		} catch (Exception e) {
			log.error(e.getMessage());
			result.put(e.getMessage(), false);
		} finally {
			if (channelSftp != null && channelSftp.isConnected()) {
				channelSftp.exit();
				channelSftp.disconnect();
			}
			if (session != null && session.isConnected()) {
				session.disconnect();
			}
		}

		return result;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see mx.com.gentera.psc.scheduler.services.ISftpService#downloadFile(mx.com.
	 * gentera.psc.scheduler.beans.SftpSessionBean, java.lang.String,
	 * java.lang.String)
	 */
	@Override
	public Boolean downloadFile(SftpSessionBean sftpSession, String sourceFile, String targetFile) {
		Boolean result = false;
		Session session = null;
		ChannelSftp channelSftp = null;
		InputStream inputStream = null;

		byte[] buffer = new byte[8 * 1024];
		int bytesRead;

		try (OutputStream output = new FileOutputStream(targetFile)) {
			log.info("Descargando archivo {} desde el servidor", sourceFile);

			session = getSession(sftpSession);
			channelSftp = getSftpChannel(session);

			inputStream = channelSftp.get(sourceFile);

			while ((bytesRead = inputStream.read(buffer)) != -1) {
				output.write(buffer, 0, bytesRead);
			}

			log.info("Se descargó un archivo desde el servidor {}", targetFile);

			result = true;
		} catch (SftpException | IOException | JSchException e) {
			log.error(e.getMessage());
		} finally {
			try {
				if (inputStream != null) {
					inputStream.close();
				}
				if (channelSftp != null && channelSftp.isConnected()) {
					channelSftp.exit();
					channelSftp.disconnect();
				}
				if (session != null && session.isConnected()) {
					session.disconnect();
				}
			} catch (IOException e) {
				log.error(e.getMessage());
			}
		}

		return result;
	}

	@Override
	public Boolean downloadFiles(SftpSessionBean sftpSession, String sourceFile, String localFolder, String pattern) {
		Boolean result = false;
		Session session = null;
		ChannelSftp channelSftp = null;
		InputStream inputStream = null;
		byte[] buffer = new byte[8 * 1024];
		int bytesRead;
		try {
			session = getSession(sftpSession);
			channelSftp = getSftpChannel(session);
			for (String file : listFilesMatchPattern(sftpSession, sourceFile, pattern)) {
				String fileName = file.substring(file.lastIndexOf("/"));
				@SuppressWarnings("resource")
				OutputStream output = new FileOutputStream(localFolder + fileName);
				log.info("Descargando archivo {} desde el servidor", localFolder + fileName);

				inputStream = channelSftp.get(file);
				while ((bytesRead = inputStream.read(buffer)) != -1) {
					output.write(buffer, 0, bytesRead);
				}
				log.info("Se descargó un archivo desde el servidor {}", file);
			}
			result = true;
		} catch (SftpException | IOException | JSchException e) {
			log.error(e.getMessage() + " error io");
			e.printStackTrace();
		} finally {
			try {
				if (inputStream != null) {
					inputStream.close();
				}
				if (channelSftp != null && channelSftp.isConnected()) {
					channelSftp.exit();
					channelSftp.disconnect();
				}
				if (session != null && session.isConnected()) {
					session.disconnect();
				}
			} catch (IOException e) {
				log.error(e.getMessage());
				e.printStackTrace();
			}
		}

		return result;
	}

}