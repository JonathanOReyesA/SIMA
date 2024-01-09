package mx.com.gentera.seguros.common.email.services;

import java.util.List;

import javax.mail.MessagingException;
import javax.mail.internet.AddressException;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

/**
 * PROCESO: Email
 * OBJETIVO: Implementar los servicios de envio de correo a traves de un servidor SMTP
 * RELACION: []
 * @author Miguel Angel Carrasco Irineo
 */
@Component
@Profile({"local"})
public class EmailLocalServiceImpl implements IEmailService {
	private static final Logger log = LoggerFactory.getLogger(EmailLocalServiceImpl.class);
	
	/* (non-Javadoc)
	 * @see mx.com.gentera.psc.scheduler.services.IEmailService#sendSimpleMessage(java.lang.String, java.lang.String, java.lang.String)
	 */
	@Override
	public void sendSimpleMessage(String to, String subject, String text, String jobName) throws AddressException, MessagingException {
		log.warn("En ambiente local no está permitido enviar correos electrónicos");
	}

	@Override
	public void sendComplexMessage(String to, String subject, String text, List<String> attachFiles)
			throws AddressException, MessagingException {
		log.warn("En ambiente local no está permitido enviar correos electrónicos");
		
		if (attachFiles != null) {
			for (String filePath : attachFiles) {
				log.warn("Archivo adjunto: {}", filePath);
			}
		}
	}



}
