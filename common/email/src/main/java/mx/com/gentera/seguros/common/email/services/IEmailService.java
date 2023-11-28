package mx.com.gentera.seguros.common.email.services;

import java.util.List;

import javax.mail.MessagingException;
import javax.mail.internet.AddressException;

/**
 * PROCESO: Email OBJETIVO: Exponer una interfaz de servicios de envio de correo
 * electronico a traves de un servidor SMTP RELACION: [Ninguna]
 * 
 * @author Miguel Angel Carrasco Irineo
 */
public interface IEmailService {

	/**
	 * @param to      Establece el destinatario del correo electronico
	 * @param subject Establece el asunto del correo electronico
	 * @param text    Establece el contenido del correo electronico
	 * @throws AddressException   Lanza una exepcion cuando ocurre un error al
	 *                            intentar enviar un correo electronico
	 * @throws MessagingException Lanza una exepcion cuando ocurre un error al
	 *                            intentar enviar un correo electronico
	 */
	public void sendSimpleMessage(String to, String subject, String text) throws AddressException, MessagingException;

	public void sendComplexMessage(String to, String subject, String text, List<String> attachFiles)
			throws AddressException, MessagingException;

}
