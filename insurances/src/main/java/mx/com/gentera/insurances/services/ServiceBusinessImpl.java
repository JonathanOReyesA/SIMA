package mx.com.gentera.insurances.services;

import java.io.File;
import java.math.BigDecimal;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Date;
import java.util.List;
import javax.mail.MessagingException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Service;
import com.gentera.insurances.beans.EmailDestination;
import com.gentera.insurances.beans.EndpointBean;
import mx.com.gentera.ClaimInsuranceDetailDataTypePNE;
import mx.com.gentera.ClaimInsurancePaymentResMsgDataType;
import mx.com.gentera.ClaimStatusUpdateRespMsgDataType;
import mx.com.gentera.seguros.common.email.services.IEmailService;
import mx.com.gentera.seguros.common.persistence.exceptions.StoredProcedureConfigurationNotFoundException;
import mx.com.gentera.seguros.common.persistence.model.CallSPResponse;
import mx.com.gentera.seguros.common.persistence.services.IPersistenceService;
import mx.com.gentera.seguros.common.sftp.beans.SftpSessionBean;
import mx.com.gentera.seguros.common.sftp.services.ISftpService;
import pe.com.gentera.ClaimInsuranceDetailDataTypePNEPE;
import pe.com.gentera.ClaimInsurancePaymentResMsgDataTypePE;

@Service
public class ServiceBusinessImpl implements ServiceBusiness {

	/**
	 * Instancia encargada de generar el log de la aplicacion
	 */
	private static final Logger logger = LoggerFactory.getLogger(ServiceBusinessImpl.class);

	/**
	 * Servicios de la capa de persistencia
	 */
	@Autowired
	IPersistenceService persistenceService;

	@Autowired
	private IEmailService emailService;

	@Autowired
	private ISftpService sftpService;

	@Autowired
	EndpointBean updateClaimStatusEndpointBean;

	@Autowired
	EndpointBean claimAutomaticPaymentEndpointBean;

	@Autowired
	EndpointBean claimAutomaticPaymentPEEndpointBean;

	@Autowired
	private SftpSessionBean filesSftpSession;

	@Autowired
	private SftpSessionBean dbSftpSession;

	private int total = 0;

	public static final String SUBJECTMESSAGE = "Notificación - Estatus de Siniestro : ";

	public static final String BODYMESSAGE = "Estimado usuario, <br><br>Por medio del presente le informamos sobre el estatus del siniestro que registró.<br><br>Siniestro: <b>"
			+ "@CLAIMID" + "</b><br><br>Cliente: <b>" + "@CLIENTNAME" + "</b><br><br>Afectado: <b>" + "@AFFECTEDNAME"
			+ "</b><br><br>Estatus: <b>" + "@ESTATUS" + "</b><br><br>Fecha Estatus: <b>" + "@DATE"
			+ "</b><br><br>Comentarios: <b>" + "@COMMENT"
			+ "</b><br><br><b><u>CORREO INFORMATIVO. FAVOR DE NO RESPONDER A ESTA CUENTA DE CORREO.<u></b>";

	public static final String SEND_SUCCESS_MAIL = "[Correo enviado Satisfactoriamente]  ";

	@Override
	public ClaimStatusUpdateRespMsgDataType updateStatus(String claimID, Integer claimStatusID, Date claimStatusDate,
			String claimStatusUser, String contactEmail, String claimIdentifier, String clientName, String affectedName,
			String lastStatus, String lastStatusDate, String lastStatusComment, String paymentType) {
		List<Object> values = new ArrayList<>();
		values.add(claimID);
		values.add(claimStatusID);
		try {
			values.add(new java.sql.Date(claimStatusDate.getTime()));
		} catch (Exception e) {
			values.add(null);
		}
		values.add(claimStatusUser);
		values.add(paymentType != null ? paymentType : "");

		ClaimStatusUpdateRespMsgDataType response = executeUpdateStatus(values);
		if (response.getCode() == null || response.getCode().equals("") || response.getCode().equals("null")) {
			logger.info("Se procede a enviar correo electronico ");
			if (contactEmail.contains("@")) {
				String emailTo = contactEmail.concat(";");
				String emailCc = "";

				List<EmailDestination> emailDestinationList = obtenerCorreosDestinatarios(claimID.substring(0, 4));

				for (EmailDestination emailDestination : emailDestinationList) {
					switch (emailDestination.getTypeSend()) {
					case "PARA":
						emailTo = emailTo.concat(emailDestination.getEmail()).concat(";");
						break;
					case "CC":
						emailCc = emailCc.concat(emailDestination.getEmail()).concat(";");
						break;
					default:
						break;
					}
				}
				try {
					String body = BODYMESSAGE.replaceAll("@CLAIMID", claimID);
					body = body.replaceAll("@CLIENTNAME", clientName);
					body = body.replaceAll("@AFFECTEDNAME", affectedName);
					body = body.replaceAll("@ESTATUS", lastStatus);
					body = body.replaceAll("@CLIENTNAME", clientName);
					body = body.replaceAll("@DATE", lastStatusDate);
					body = body.replaceAll("@COMMENT", lastStatusComment);
					String subject = SUBJECTMESSAGE + claimID;
					body = body.replaceAll("\\.", "<br>");
					// emailCc
					emailService.sendSimpleMessage(emailTo, subject, body);
					logger.info(SEND_SUCCESS_MAIL);
				} catch (MessagingException e) {
					logger.error("No se pudo enviar correo electronico " + e.getMessage());
					e.printStackTrace();

				}
			}
		}
		return response;
	}

	private ClaimStatusUpdateRespMsgDataType executeUpdateStatus(List<Object> values) {
		CallSPResponse callSPResponse = new CallSPResponse();
		ClaimStatusUpdateRespMsgDataType response = new ClaimStatusUpdateRespMsgDataType();
		try {
			callSPResponse = persistenceService.executeSP_SIMA(updateClaimStatusEndpointBean.getStoredProcedureName(),
					values, null);
			response.setCode(((BigDecimal) callSPResponse.getResult().get("P_ERROR")) + "");
			response.setMessage((String) callSPResponse.getResult().get("P_ERROR_DESC"));
		} catch (Exception e) {
			callSPResponse.setCode(-1);
			callSPResponse.setDescription(e.getMessage());
			logger.error("Error en el consumo de servicio UpdateClaimStatusEndpoint: " + e.getMessage());
		}
		return response;
	}

	@SuppressWarnings("unchecked")
	private List<EmailDestination> obtenerCorreosDestinatarios(String claim) {
		List<Object> values = new ArrayList<>();
		List<EmailDestination> lstEmail = new ArrayList<>();
		values.add(claim);
		CallSPResponse callSPResponse = new CallSPResponse();
		try {
			callSPResponse = persistenceService.executeFunctionWitOutParameter_SIMA("GETEMAIL", values,
					new RowMapper<EmailDestination>() {
						@Override
						public EmailDestination mapRow(ResultSet resultSet, int i) throws SQLException {
							EmailDestination item = new EmailDestination();

							try {
								item.setEmail(resultSet.getString("EMAIL"));
								item.setTypeSend(resultSet.getString("TYPESEND"));
							} catch (Exception e) {
								throw new SQLException(
										"Error al tratar de convertir registro desde Cursor: " + e.getMessage());
							}

							return item;
						}
					});
			lstEmail.addAll((List<EmailDestination>) callSPResponse.getResult().get("SYS_REFCURSOR"));
		} catch (StoredProcedureConfigurationNotFoundException e) {
			callSPResponse.setCode(-1);
			callSPResponse.setDescription(e.getMessage());
		}
		return lstEmail;
	}

	@Override
	public ClaimInsurancePaymentResMsgDataType claimAutomicPayment(String filePath, String fileName, String partnerID,
			String userID) {
		total = 0;
		// Obtiene Archivo de Aterna
		// source file ----origen
		// targetfile------destino
		System.out.println("SE DESCARGA ARCHIVO EN LA RUTA " + filePath);
		// guatemala 2 y peru 3
		String prefix = partnerID.equals("1") ? "MX" : "GT";
		String archivoDB = "AUTOPAYMENTS.dat";
		sftpService.downloadFile(filesSftpSession, filePath + "/" + fileName,
				claimAutomaticPaymentEndpointBean.getFilePathLocal() + "/" + prefix + archivoDB);
		// Renombra el archivo para que sea reconocido

		// Coloca el archivo al FTP del Servidor de la Base de Datos
		sftpService.uploadFile(dbSftpSession,
				Arrays.asList(claimAutomaticPaymentEndpointBean.getFilePathLocal() + "/" + prefix + archivoDB),
				claimAutomaticPaymentEndpointBean.getFileDBRemote());
		// Importante borrar siempre el archivo descargado
		File f1 = new File(claimAutomaticPaymentEndpointBean.getFilePathLocal() + "/" + prefix + archivoDB);
		f1.delete();
		// llamar al sp primer proceso
		if (executeSPAutomaticPayment(fileName, partnerID, userID) == 0) {
			return executeGetPayment(partnerID);
		} else {
			logger.error("Error al procesar informacion ");
			return new ClaimInsurancePaymentResMsgDataType();
		}
	}

	@Override
	public ClaimInsurancePaymentResMsgDataTypePE claimAutomicPaymentPE(String filePath, String fileName,
			String partnerID, String userID) {
		total = 0;
		// Obtiene Archivo de Aterna
		// source file ----origen
		// targetfile------destino
		System.out.println("SE DESCARGA ARCHIVO EN LA RUTA " + filePath);
		// guatemala 2 y peru 3
		String prefix = "";
		String archivoDB = "PEAUTOPAYMENTS.dat";
		sftpService.downloadFile(filesSftpSession, filePath + "/" + fileName,
				claimAutomaticPaymentPEEndpointBean.getFilePathLocal() + "/" + prefix + archivoDB);
		// Renombra el archivo para que sea reconocido

		// Coloca el archivo al FTP del Servidor de la Base de Datos
		sftpService.uploadFile(dbSftpSession,
				Arrays.asList(claimAutomaticPaymentPEEndpointBean.getFilePathLocal() + "/" + prefix + archivoDB),
				claimAutomaticPaymentPEEndpointBean.getFileDBRemote());
		// Importante borrar siempre el archivo descargado
		File f1 = new File(claimAutomaticPaymentPEEndpointBean.getFilePathLocal() + "/" + prefix + archivoDB);
		f1.delete();
		// llamar al sp primer proceso
		if (executeSPAutomaticPaymentPE(fileName, partnerID, userID) == 0) {
			return executeGetPaymentPE(partnerID);
		} else {
			logger.error("Error al procesar informacion ");
			return new ClaimInsurancePaymentResMsgDataTypePE();
		}
	}

	private int executeSPAutomaticPayment(String fileName, String partnerID, String userID) {
		CallSPResponse callSPResponse = new CallSPResponse();
		List<Object> values = new ArrayList<>();
		values.add(partnerID);
		values.add(userID);
		values.add(fileName);
		try {
			callSPResponse = persistenceService
					.executeSP_SIMA(claimAutomaticPaymentEndpointBean.getStoredProcedureName(), values, null);
			total = Integer.parseInt((BigDecimal) callSPResponse.getResult().get("P_REG_PROC") + "")
					+ Integer.parseInt((BigDecimal) callSPResponse.getResult().get("P_REG_REJECT") + "");
			System.out.println(Integer.parseInt((BigDecimal) callSPResponse.getResult().get("P_ERROR") + ""));
			return Integer.parseInt((BigDecimal) callSPResponse.getResult().get("P_ERROR") + "");
		} catch (Exception e) {
			logger.error("Error al ejecutar sp para pago automatico: " + e.getMessage());
			return 1;
		}
	}

	private int executeSPAutomaticPaymentPE(String fileName, String partnerID, String userID) {
		CallSPResponse callSPResponse = new CallSPResponse();
		List<Object> values = new ArrayList<>();
		values.add(partnerID);
		values.add(userID);
		values.add(fileName);
		try {
			callSPResponse = persistenceService
					.executeSP_SIMA(claimAutomaticPaymentPEEndpointBean.getStoredProcedureName(), values, null);
			total = Integer.parseInt((BigDecimal) callSPResponse.getResult().get("P_REG_PROC") + "")
					+ Integer.parseInt((BigDecimal) callSPResponse.getResult().get("P_REG_REJECT") + "");
			System.out.println(Integer.parseInt((BigDecimal) callSPResponse.getResult().get("P_ERROR") + ""));
			return Integer.parseInt((BigDecimal) callSPResponse.getResult().get("P_ERROR") + "");
		} catch (Exception e) {
			logger.error("Error al ejecutar sp para pago automatico: " + e.getMessage());
			return 1;
		}
	}

	@SuppressWarnings("unchecked")
	private ClaimInsurancePaymentResMsgDataType executeGetPayment(String partnerID) {
		CallSPResponse callSPResponse = new CallSPResponse();
		List<Object> values = new ArrayList<>();
		ClaimInsurancePaymentResMsgDataType response = new ClaimInsurancePaymentResMsgDataType();
		values.add(partnerID);
		try {
			callSPResponse = persistenceService.executeFunction_SIMA(
					claimAutomaticPaymentEndpointBean.getStoredProcedureNameBefore(), values,
					new RowMapper<ClaimInsuranceDetailDataTypePNE>() {
						@Override
						public ClaimInsuranceDetailDataTypePNE mapRow(ResultSet rset, int i) throws SQLException {
							ClaimInsuranceDetailDataTypePNE e = new ClaimInsuranceDetailDataTypePNE();
							try {
								e.setFlag(rset.getString("FLAG") != null ? rset.getString("FLAG") : "");
								e.setClaimID(rset.getString("CLAIMID") != null ? rset.getString("CLAIMID") : "");
								e.setPolicyID(
										rset.getString("INSURANCEPOLICY") != null ? rset.getString("INSURANCEPOLICY")
												: "");
								e.setPaymentDate(rset.getDate("PAYMENTDATE"));
								e.setPaymentAmount(Double.parseDouble(rset.getString("AMOUNTTOPAY")));
								e.setBeneficiaryName(
										rset.getString("BENEFICIARYNAME") != null ? rset.getString("BENEFICIARYNAME")
												: "");
								e.setPaymentOrder(rset.getString("ODP") != null ? rset.getString("ODP") : "");
								e.setCertificateNumber(
										rset.getString("CERTIFICATE") != null ? rset.getString("CERTIFICATE") : "");
								e.setStatus(rset.getString("STATUS") != null ? rset.getString("STATUS") : "");
								e.setInsuredName(
										rset.getString("AFFECTEDNAME") != null ? rset.getString("AFFECTEDNAME") : "");
								e.setBusinessPartnerID(rset.getString("BUSINESSPARTNERID") != null
										? rset.getString("BUSINESSPARTNERID")
										: "");
								e.setBeneficiaryAddress(rset.getString("BENEFICIARYADDRESS") != null
										? rset.getString("BENEFICIARYADDRESS")
										: "");
								e.setBeneficiaryPhone(
										rset.getString("HOMEPHONE") != null ? rset.getString("HOMEPHONE") : "");
								e.setInstanceClaimID(rset.getString("PROCESSINSTANCEID") != null
										? rset.getString("PROCESSINSTANCEID")
										: "");
								e.setExternalClaimID(
										rset.getString("CLAIMINSURANCEID") != null ? rset.getString("CLAIMINSURANCEID")
												: "");
								e.setDaysToPay(Integer.parseInt(rset.getString("HOSPITALDAYS")));
								e.setMessage(rset.getString("MESSAGE") != null ? rset.getString("MESSAGE") : "");
								e.setMarriedFamilyName(rset.getString("MARRIEDFAMILYNAME") != null
										? rset.getString("MARRIEDFAMILYNAME")
										: "");
								e.setMaritalStatus(
										rset.getString("MARITALSTATUS") != null ? rset.getString("MARITALSTATUS") : "");
								e.setZone(rset.getString("ZONE") != null ? rset.getString("ZONE") : "");

							} catch (Exception ex) {
								throw new SQLException(
										"Error al tratar de convertir registro desde Cursor: " + ex.getMessage());
							}
							return e;
						}
					});
			response.getClaimInsurancePaymentArray().addAll(
					(Collection<ClaimInsuranceDetailDataTypePNE>) callSPResponse.getResult().get("SYS_REFCURSOR"));
			response.setPaymentsFileTotal(total);
			return response;
		} catch (StoredProcedureConfigurationNotFoundException e) {
			e.printStackTrace();
			return response;
		}
	}

	@SuppressWarnings("unchecked")
	private ClaimInsurancePaymentResMsgDataTypePE executeGetPaymentPE(String partnerID) {
		CallSPResponse callSPResponse = new CallSPResponse();
		List<Object> values = new ArrayList<>();
		ClaimInsurancePaymentResMsgDataTypePE response = new ClaimInsurancePaymentResMsgDataTypePE();
		values.add(partnerID);
		try {
			callSPResponse = persistenceService.executeFunction_SIMA(
					claimAutomaticPaymentPEEndpointBean.getStoredProcedureNameBefore(), values,
					new RowMapper<ClaimInsuranceDetailDataTypePNEPE>() {
						@Override
						public ClaimInsuranceDetailDataTypePNEPE mapRow(ResultSet rset, int i) throws SQLException {
							ClaimInsuranceDetailDataTypePNEPE e = new ClaimInsuranceDetailDataTypePNEPE();
							try {
								e.setFlag(rset.getString("FLAG") != null ? rset.getString("FLAG") : "");
								e.setClaimID(rset.getString("CLAIMID") != null ? rset.getString("CLAIMID") : "");
								e.setPolicyID(
										rset.getString("INSURANCEPOLICY") != null ? rset.getString("INSURANCEPOLICY")
												: "");
								e.setPaymentDate(rset.getString("PAYMENTDATE"));
								e.setPaymentAmount(Double.parseDouble(rset.getString("AMOUNTTOPAY")));
								e.setBeneficiaryName(
										rset.getString("BENEFICIARYNAME") != null ? rset.getString("BENEFICIARYNAME")
												: "");
								e.setPaymentOrder(rset.getString("ODP") != null ? rset.getString("ODP") : "");
								e.setCertificateNumber(
										rset.getString("CERTIFICATE") != null ? rset.getString("CERTIFICATE") : "");
								e.setStatus(rset.getString("STATUS") != null ? rset.getString("STATUS") : "");
								e.setInsuredName(
										rset.getString("AFFECTEDNAME") != null ? rset.getString("AFFECTEDNAME") : "");
								e.setBusinessPartnerID(rset.getString("BUSINESSPARTNERID") != null
										? rset.getString("BUSINESSPARTNERID")
										: "");
								e.setBeneficiaryAddress(rset.getString("BENEFICIARYADDRESS") != null
										? rset.getString("BENEFICIARYADDRESS")
										: "");
								e.setBeneficiaryPhone(
										rset.getString("HOMEPHONE") != null ? rset.getString("HOMEPHONE") : "");
								e.setInstanceClaimID(rset.getString("PROCESSINSTANCEID") != null
										? rset.getString("PROCESSINSTANCEID")
										: "");
								e.setExternalClaimID(
										rset.getString("CLAIMINSURANCEID") != null ? rset.getString("CLAIMINSURANCEID")
												: "");
								e.setDaysToPay(Integer.parseInt(rset.getString("HOSPITALDAYS")));
								e.setMessage(rset.getString("MESSAGE") != null ? rset.getString("MESSAGE") : "");
								e.setMarriedFamilyName(rset.getString("MARRIEDFAMILYNAME") != null
										? rset.getString("MARRIEDFAMILYNAME")
										: "");
								e.setMaritalStatus(
										rset.getString("MARITALSTATUS") != null ? rset.getString("MARITALSTATUS") : "");
								e.setZone(rset.getString("ZONE") != null ? rset.getString("ZONE") : "");
								e.setOdpFormat(
										rset.getString("ODP_FORMAT") != null ? rset.getString("ODP_FORMAT") : "");
								e.setFlagCoverage(
										rset.getString("FLAGCOVERAGE") != null ? rset.getString("FLAGCOVERAGE") : "");

							} catch (Exception ex) {
								throw new SQLException(
										"Error al tratar de convertir registro desde Cursor: " + ex.getMessage());
							}
							return e;
						}
					});
			response.getClaimInsurancePaymentArray().addAll(
					(Collection<ClaimInsuranceDetailDataTypePNEPE>) callSPResponse.getResult().get("SYS_REFCURSOR"));
			response.setPaymentsFileTotal(total);
			logger.info(response.getClaimInsurancePaymentArray().size() + "");
			return response;
		} catch (StoredProcedureConfigurationNotFoundException e) {
			e.printStackTrace();
			return response;
		}
	}
}
