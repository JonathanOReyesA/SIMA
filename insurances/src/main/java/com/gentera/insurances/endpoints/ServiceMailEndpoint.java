package com.gentera.insurances.endpoints;

import javax.mail.MessagingException;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import mx.com.gentera.ServiceMail;
import mx.com.gentera.seguros.common.email.services.IEmailService;

public class ServiceMailEndpoint implements ServiceMail {

	
	/**
	 * Instancia encargada de generar el log de la aplicacion
	 */
	private static final Logger logger = LoggerFactory.getLogger(ServiceMailEndpoint.class);
	
	
	@Autowired
	private IEmailService emailService;

	@Override
	public void serviceMail(String sendTo, String from, String subject, String body) {
		try {
			logger.info("Enviando correo electronico");
			emailService.sendSimpleMessage(sendTo, subject, body,null);
		} catch (MessagingException e) {
			logger.error("Error al tratar de enviar correo electronico");
			e.printStackTrace();
		}
		
	}
	
	
}
