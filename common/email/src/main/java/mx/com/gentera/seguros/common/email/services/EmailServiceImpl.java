package mx.com.gentera.seguros.common.email.services;

import java.io.IOException;
import java.util.Date;
import java.util.List;
import java.util.Properties;

import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.Multipart;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.AddressException;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeBodyPart;
import javax.mail.internet.MimeMessage;
import javax.mail.internet.MimeMultipart;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

import mx.com.gentera.seguros.common.email.beans.SmtpBean;

/**
 * PROCESO: Email OBJETIVO: Implementar los servicios de envio de correo a
 * traves de un servidor SMTP RELACION: [SmtpBean]
 * 
 * @author Miguel Angel Carrasco Irineo
 */
@Component
@Profile({ "development", "hotfix", "modular", "integration", "performance", "production", "embedded",
		"developmentUpgrade", "modularUpgrade", "integrationUpgrade", "performanceUpgrade" })
public class EmailServiceImpl implements IEmailService {
	private static final Logger log = LoggerFactory.getLogger(EmailServiceImpl.class);

	/**
	 * Configuracion del servidor SMTP
	 */
	@Autowired
	SmtpBean segurosSmtp;

	/**
	 * Propiedades asociadas al correo electronico
	 */
	private final Properties properties = new Properties();

	/**
	 * Sesion en el servidor SMTP
	 */
	private Session session;

	/**
	 * Configuracion de la conexion al servidor SMTP
	 */
	private void config() {
		properties.put("mail.smtp.host", segurosSmtp.getHost());
		properties.put("mail.smtp.port", segurosSmtp.getPort());
		properties.put("mail.smtp.user", segurosSmtp.getUser());
		properties.put("mail.smtp.password", segurosSmtp.getPassword());
		properties.put("mail.smtp.auth", segurosSmtp.getAuth());
		properties.put("mail.smtp.ssl.enable", segurosSmtp.getSsl());
		properties.put("mail.smtp.ssl.checkserveridentity", segurosSmtp.getCheckserveridentity());
		log.info("Properties: {}", properties.toString());
		session = Session.getDefaultInstance(properties);

	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * mx.com.gentera.psc.scheduler.services.IEmailService#sendSimpleMessage(java.
	 * lang.String, java.lang.String, java.lang.String)
	 */
	@Override
	public void sendSimpleMessage(String to, String subject, String text) throws AddressException, MessagingException {
		config();

		log.info("Enviando correo electrónico hacia {}", to);

		MimeMessage message = new MimeMessage(session);

		message.setFrom(new InternetAddress((String) properties.get("mail.smtp.user")));
		to = to.replaceAll(";", ",");
		message.addRecipients(Message.RecipientType.TO, InternetAddress.parse(to));
		message.setSubject(subject);
		message.setContent(text, "text/html; charset=utf-8");
		Transport t = session.getTransport("smtp");
		t.connect(segurosSmtp.getHost(), segurosSmtp.getPort(), segurosSmtp.getUser(), segurosSmtp.getPassword());
		log.info("PASO EL CONTECT: {} ", t.isConnected());
		t.sendMessage(message, message.getAllRecipients());
		log.info("Correo electrónico enviado");
		t.close();
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * mx.com.gentera.psc.scheduler.services.IEmailService#sendSimpleMessage(java.
	 * lang.String, java.lang.String, java.lang.String)
	 */
	@Override
	public void sendComplexMessage(String to, String subject, String text, List<String> attachFiles)
			throws AddressException, MessagingException {
		config();

		log.info("Enviando correo electrónico hacia {}", to);

		Message message = new MimeMessage(session);

		message.setFrom(new InternetAddress((String) properties.get("mail.smtp.user")));
		to = to.replaceAll(";", ",");
		message.addRecipients(Message.RecipientType.TO, InternetAddress.parse(to));
		message.setSubject(subject);
		message.setSentDate(new Date());

		MimeBodyPart messageBodyPart = new MimeBodyPart();
		messageBodyPart.setContent(text, "text/html; charset=utf-8");

		Multipart multipart = new MimeMultipart();
		multipart.addBodyPart(messageBodyPart);

		if (attachFiles != null) {
			for (String filePath : attachFiles) {
				MimeBodyPart attachPart = new MimeBodyPart();

				try {
					attachPart.attachFile(filePath);
				} catch (IOException e) {
					log.error("No fue posible adjuntar el archivo: {}", filePath);
				}

				multipart.addBodyPart(attachPart);
			}
		}

		message.setContent(multipart);

		Transport t = session.getTransport("smtp");

		t.connect(segurosSmtp.getHost(), segurosSmtp.getPort(), segurosSmtp.getUser(), segurosSmtp.getPassword());
		t.sendMessage(message, message.getAllRecipients());

		log.info("Correo electrónico enviado");

		t.close();
	}

}