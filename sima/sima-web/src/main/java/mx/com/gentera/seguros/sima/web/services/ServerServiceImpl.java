package mx.com.gentera.seguros.sima.web.services;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.lang.reflect.Field;
import java.math.BigDecimal;
import java.net.URL;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.attribute.BasicFileAttributes;
import java.sql.ResultSet;
import java.sql.SQLException;
//import java.sql.Date;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Date;
import java.util.List;
import java.util.Map;
import javax.xml.bind.JAXBElement;
import mx.com.gentera.seguros.common.persistence.entities.sima.JobProperty;
import mx.com.gentera.seguros.common.persistence.exceptions.StoredProcedureConfigurationNotFoundException;
import mx.com.gentera.seguros.common.persistence.exceptions.StoredProcedureParametersNotMatchException;
import mx.com.gentera.seguros.common.persistence.exceptions.StoredProcedureParametersTypesMismatchException;
import mx.com.gentera.seguros.common.persistence.exceptions.UnexpectedResponseCodeException;
import mx.com.gentera.seguros.common.persistence.model.CallSPResponse;
import mx.com.gentera.seguros.common.persistence.repositories.sima.JobPropertyRepository;
import mx.com.gentera.seguros.common.persistence.services.IPersistenceService;
import mx.com.gentera.seguros.common.sftp.beans.SftpSessionBean;
import mx.com.gentera.seguros.common.sftp.services.ISftpService;
import mx.com.gentera.seguros.sima.web.beans.JobPropertiesBean;
import mx.com.gentera.seguros.sima.web.exceptions.SftpSendingException;
import mx.com.gentera.seguros.sima.web.exceptions.UnknownPartnerIdException;
import mx.com.gentera.seguros.sima.web.mappers.GenericRowMapper;
import mx.com.gentera.seguros.sima.web.model.CatalogoModalidad;
import mx.com.gentera.seguros.sima.web.model.CatalogoProducto;
import mx.com.gentera.seguros.sima.web.model.CatalogoTipoConciliacion;
import mx.com.gentera.seguros.sima.web.model.CatalogoTipoRegistro;
import mx.com.gentera.seguros.sima.web.model.CifrasConciliacion;
import mx.com.gentera.seguros.sima.web.model.CifrasFacturacion;
import mx.com.gentera.seguros.sima.web.model.FileContentItem;
import mx.com.gentera.seguros.sima.web.model.Insurance;
import mx.com.gentera.seguros.sima.web.model.InsuranceFileItem;
import mx.com.gentera.seguros.sima.web.model.InsuranceItem;
import mx.com.gentera.seguros.sima.web.model.MsgResponse;
import mx.com.gentera.seguros.sima.web.model.PartnerItem;
import mx.com.gentera.seguros.sima.web.model.SftpMsgResponse;
import mx.com.gentera.seguros.sima.web.model.ZipFileItem;
import mx.com.gentera.seguros.sima.web.model.BusinessPartnerItem;
import mx.com.gentera.seguros.sima.web.model.ModeItem;
import mx.com.gentera.seguros.sima.web.model.ProductItem;
import mx.com.gentera.seguros.sima.web.model.StatusItem;
import mx.com.gentera.seguros.sima.web.request.FormularioConciliacion;
import mx.com.gentera.seguros.sima.web.request.FormularioFacturacion;
import mx.com.gentera.seguros.sima.web.request.SearchInsurance;
import mx.com.gentera.seguros.sima.web.security.CustomUser;
import mx.com.gentera.seguros.sima.web.security.Menu;
import mx.com.gentera.seguros.sima.web.security.Role;
//import mx.com.gentera.seguros.sima.web.services.IServerService;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.datacontract.schemas._2004._07.cmessage.ArrayOfCComponente;
import org.datacontract.schemas._2004._07.cmessage.CAutenticacion;
import org.datacontract.schemas._2004._07.cmessage.CComponente;
import org.datacontract.schemas._2004._07.cmessage.Item;
import org.datacontract.schemas._2004._07.cmessage.Log;
import org.datacontract.schemas._2004._07.cmessage.ObjectFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;
import org.tempuri.ResponseUm;
import org.tempuri.WFCUM;

@Service
public class ServerServiceImpl implements IServerService {
	private static final Logger log = LoggerFactory.getLogger(ServerServiceImpl.class);

	@Autowired
	private IPersistenceService persistenceService;

	@Autowired
	private ISftpService sftpService;

	@Autowired
	JobPropertyRepository jobPropertyRepository;

	@Autowired
	private SftpSessionBean sftpSessionAterna;

	@Autowired
	private SftpSessionBean sftpSessionMapfre;

	@Autowired
	private SftpSessionBean sftpSessionUniversales;

	@Autowired
	private SftpSessionBean sftpSessionRimac;

	@Autowired
	private SftpSessionBean dbSftpSession;

	private List<Object> lstReportFact;

	@SuppressWarnings("unchecked")
	public List<PartnerItem> findAllPartner()
			throws StoredProcedureConfigurationNotFoundException, StoredProcedureParametersNotMatchException,
			StoredProcedureParametersTypesMismatchException, UnexpectedResponseCodeException {
		List<PartnerItem> lstPartnerItem = new ArrayList<>();
		List<Object> values = new ArrayList<Object>();
		values.add(null);
		log.info("Ejecutando SP GETPARTNERS");
		CallSPResponse callSPResponse = this.persistenceService.executeFunction_SIMA("GETPARTNERS", values,
				new RowMapper<PartnerItem>() {

					@Override
					public PartnerItem mapRow(ResultSet rs, int rowNum) throws SQLException {
						PartnerItem item = new PartnerItem();
						item.setPartnerId(Integer.valueOf(rs.getInt("PARTNERID")));
						item.setName(rs.getString("NAME"));
						return item;
					}

				});
		log.info("Resultado de ejecuciSP: Code={}, Description={}", callSPResponse.getCode(),
				callSPResponse.getDescription());
		if (!callSPResponse.getResult().isEmpty())
			lstPartnerItem = (List<PartnerItem>) callSPResponse.getResult().get("SYS_REFCURSOR");
		return lstPartnerItem;
	}

	@SuppressWarnings({ "deprecation", "unchecked" })
	public List<Insurance> searchAllInsurance(SearchInsurance request)
			throws StoredProcedureConfigurationNotFoundException, StoredProcedureParametersNotMatchException,
			StoredProcedureParametersTypesMismatchException, UnexpectedResponseCodeException {
		
		List<Insurance> lstInsuranceItem = new ArrayList<>();
		List<Object> values = new ArrayList<Object>();
		values.add(request.getIdSolicitud());
		values.add("");
		values.add(request.getNombre());
		values.add(request.getaPaterno());
		values.add(request.getsNombre());
		values.add(request.getaMaterno());
		try {
			if (request.getFechaNacimiento() != "" && request.getFechaNacimiento() != null) {
				values.add(new java.sql.Date((new Date(request.getFechaNacimiento())).getTime()));
			} else {
				values.add(null);
			}
		} catch (Exception e) {
			values.add(null);
		}
		values.add(request.getCertificado());
		values.add(request.getIdCliente());
		values.add(request.getPartnerId());
		CallSPResponse callSPResponse = this.persistenceService.executeFunction_SIMA("SPGETINSURANCE", values,
				new GenericRowMapper<Insurance>(Insurance.class));
		log.info("Resultado de ejecuciSP: Code={}, Description={}", callSPResponse.getCode(),
				callSPResponse.getDescription());
		if (!callSPResponse.getResult().isEmpty())
			lstInsuranceItem = (List<Insurance>) callSPResponse.getResult().get("SYS_REFCURSOR");
		return lstInsuranceItem;
	}

	@SuppressWarnings("unchecked")
	public PartnerItem findPartnerByPartnerId(Integer partnerId)
			throws StoredProcedureConfigurationNotFoundException, StoredProcedureParametersNotMatchException,
			StoredProcedureParametersTypesMismatchException, UnexpectedResponseCodeException {
		PartnerItem partnerItem = null;
		List<Object> values = new ArrayList<Object>();
		values.add(partnerId);
		log.info("Ejecutando SP GETPARTNERS");
		CallSPResponse callSPResponse = this.persistenceService.executeFunction_SIMA("GETPARTNERS", values,
				new RowMapper<PartnerItem>() {

					@Override
					public PartnerItem mapRow(ResultSet rs, int rowNum) throws SQLException {
						PartnerItem item = new PartnerItem();
						item.setPartnerId(Integer.valueOf(rs.getInt("PARTNERID")));
						item.setName(rs.getString("NAME"));
						return item;
					}
				});
		log.info("Resultado de ejecuciSP: Code={}, Description={}", callSPResponse.getCode(),
				callSPResponse.getDescription());
		if (!callSPResponse.getResult().isEmpty()) {
			List<PartnerItem> lstPartnerItem = (List<PartnerItem>) callSPResponse.getResult().get("SYS_REFCURSOR");
			if (!lstPartnerItem.isEmpty())
				partnerItem = lstPartnerItem.get(0);
		}
		return partnerItem;
	}

	@SuppressWarnings("unchecked")
	public List<InsuranceItem> getLstInsurance(Integer partnerId, String businessPartnerId, String certificate,
			Date startDate)
			throws StoredProcedureConfigurationNotFoundException, StoredProcedureParametersNotMatchException,
			StoredProcedureParametersTypesMismatchException, UnexpectedResponseCodeException {
		List<InsuranceItem> lstInsuranceItem = new ArrayList<>();
		List<Object> values = new ArrayList<Object>();
		values.add(businessPartnerId);
		values.add(startDate);
		values.add(certificate);
		values.add(partnerId);
		log.info("Ejecutando SP SPSEARCHINSURANCESEND");
		CallSPResponse callSPResponse = this.persistenceService.executeFunction_SIMA("SPSEARCHINSURANCESEND", values,
				new RowMapper<InsuranceItem>() {

					@Override
					public InsuranceItem mapRow(ResultSet rs, int rowNum) throws SQLException {
						InsuranceItem item = new InsuranceItem();
						item.setBusinessPartner(new BusinessPartnerItem());
						item.getBusinessPartner().setBusinessPartnerId(rs.getString("BUSINESSPARTNERID"));
						item.getBusinessPartner().setName(rs.getString(7));
						item.setProduct(new ProductItem());
						item.getProduct().setProductId(rs.getString("PRODUCTID"));
						item.getProduct().setName(rs.getString("PRODUCTNAME"));
						item.setMode(new ModeItem());
						item.getMode().setModeId(rs.getString("MODEID"));
						item.getMode().setDescription(rs.getString("DESCRIPTION"));
						item.setInsuranceId(rs.getString("INSURANCEID"));
						item.setCertificate(rs.getString("CERTIFICATE"));
						item.setStartDate(rs.getDate("STARTDATE"));
						item.setEndDate(rs.getDate("ENDDATE"));
						item.setStatus(new StatusItem());
						item.getStatus().setStatusId(Integer.valueOf(rs.getInt("STATUSID")));
						item.getStatus().setName(rs.getString("STATUSNAME"));
						return item;
					}

				});
		log.info("Resultado de ejecuciSP: Code={}, Description={}", callSPResponse.getCode(),
				callSPResponse.getDescription());
		if (!callSPResponse.getResult().isEmpty())
			lstInsuranceItem = (List<InsuranceItem>) callSPResponse.getResult().get("SYS_REFCURSOR");
		if (!lstInsuranceItem.isEmpty()) {
			PartnerItem partnerItem = findPartnerByPartnerId(partnerId);
			for (InsuranceItem item : lstInsuranceItem)
				item.setPartner(partnerItem);
		}
		return lstInsuranceItem;
	}

	@SuppressWarnings("unchecked")
	public List<InsuranceFileItem> createInsuranceFiles(List<InsuranceItem> lstInsuranceItem)
			throws IOException, StoredProcedureConfigurationNotFoundException,
			StoredProcedureParametersNotMatchException, StoredProcedureParametersTypesMismatchException,
			UnexpectedResponseCodeException, UnknownPartnerIdException {
		List<InsuranceFileItem> lstFile = new ArrayList<>();
		for (InsuranceItem insuranceItem : lstInsuranceItem) {
			String jobName = "";
			switch (insuranceItem.getPartner().getPartnerId().intValue()) {
			case 1:
				jobName = "alternateFileSendMX";
				break;
			case 2:
				jobName = "alternateFileSendGT";
				break;
			case 3:
				jobName = "alternateFileSendPE";
				break;
			default:
				throw new UnknownPartnerIdException(
						"No se reconoce el partnerId " + insuranceItem.getPartner().getPartnerId());
			}
			JobPropertiesBean jobPropertiesBean = getJobPropertiesByName(jobName);
			List<Object> values = new ArrayList<Object>();
			values.add(insuranceItem.getInsuranceId());
			values.add(insuranceItem.getPartner().getPartnerId());
			log.info("Ejecutando SP {}, insuranceId={}, partnerId={}",
					new Object[] { jobPropertiesBean.storedProcedureName, insuranceItem.getInsuranceId(),
							insuranceItem.getPartner().getPartnerId() });
			CallSPResponse callSPResponse = this.persistenceService
					.executeFunction_SIMA(jobPropertiesBean.storedProcedureName, values, new RowMapper<ZipFileItem>() {

						@Override
						public ZipFileItem mapRow(ResultSet rs, int rowNum) throws SQLException {
							ZipFileItem item = new ZipFileItem();
							item.setName(rs.getString("NAME"));
							item.setDataValue(rs.getString("DATA_VALUE"));
							return item;
						}

					});
			log.info("Resultado de ejecuciSP: Code={}, Description={}", callSPResponse.getCode(),
					callSPResponse.getDescription());
			List<ZipFileItem> lstFileItem = new ArrayList<>();
			if (!callSPResponse.getResult().isEmpty())
				lstFileItem = (List<ZipFileItem>) callSPResponse.getResult().get("SYS_REFCURSOR");
			if (!lstFileItem.isEmpty()) {
				List<String> lstFileAux = createFiles(lstFileItem, jobPropertiesBean.extension,
						jobPropertiesBean.localTargetFolder);
				for (String item : lstFileAux) {
					File file = new File(item);
					if (file.exists()) {
						BasicFileAttributes attr = Files.readAttributes(file.toPath(), BasicFileAttributes.class,
								new java.nio.file.LinkOption[0]);
						InsuranceFileItem insuranceFileItem = new InsuranceFileItem();
						insuranceFileItem.setInsuranceId(insuranceItem.getInsuranceId());
						insuranceFileItem.setPartnerId(insuranceItem.getPartner().getPartnerId());
						insuranceFileItem.setName(file.getName());
						insuranceFileItem.setAbsolutePath(file.getAbsolutePath());
						insuranceFileItem.setSize(Long.valueOf(file.length()));
						insuranceFileItem.setCreationDate(new Date(attr.creationTime().toMillis()));
						insuranceFileItem.setStatus("CREADO");
						lstFile.add(insuranceFileItem);
					}
				}
			}
		}
		return lstFile;
	}

	private List<String> createFiles(List<ZipFileItem> lstFileItem, String extension, String localTargetFolder)
			throws IOException {
		List<String> lstCreatedFile = new ArrayList<>();
		for (ZipFileItem file : lstFileItem) {
			log.info("ZipName: [{}], Name: [{}]", file.getZipName(), file.getName());
			String extensionFile = "";
			if (extension != null) {
				extensionFile = "." + extension;
				extensionFile.replace("..", ".");
			}
			File fout = new File(String.valueOf(localTargetFolder) + file.getName() + extensionFile);
			FileOutputStream fos = new FileOutputStream(fout);
			OutputStreamWriter osw = new OutputStreamWriter(fos);
			osw.write(file.getDataValue());
			osw.close();
			fos.close();
			lstCreatedFile.add(fout.getAbsolutePath());
		}
		return lstCreatedFile;
	}

	@SuppressWarnings("unchecked")
	private JobPropertiesBean getJobPropertiesByName(String jobName) {
		JobPropertiesBean jobPropertiesBean = null;
		List<JobProperty> lstJobProperties = findByIdJobName(jobName);
		if (!lstJobProperties.isEmpty())
			jobPropertiesBean = new JobPropertiesBean();
		for (JobProperty jobProperty : lstJobProperties) {
			try {
				Boolean result;
				Class<?> c = jobPropertiesBean.getClass();
				String fieldName = "";
				String subFieldName = "";
				if (jobProperty.getId().getPropertyName().contains(".")) {
					fieldName = jobProperty.getId().getPropertyName().substring(0,
							jobProperty.getId().getPropertyName().indexOf("."));
					subFieldName = jobProperty.getId().getPropertyName()
							.substring(jobProperty.getId().getPropertyName().indexOf(".") + 1);
				} else {
					fieldName = jobProperty.getId().getPropertyName();
				}
				Field campo = c.getDeclaredField(fieldName);
				String str1;
				switch ((str1 = campo.getType().getName()).hashCode()) {
				case -2056817302:
					if (!str1.equals("java.lang.Integer"))
						break;
					campo.set(jobPropertiesBean, Integer.valueOf(Integer.parseInt(jobProperty.getPropertyValue())));
					continue;
				case -1383349348:
					if (!str1.equals("java.util.Map"))
						break;
					((Map<String, String>) campo.get(jobPropertiesBean)).put(subFieldName,
							jobProperty.getPropertyValue());
					continue;
				case 344809556:
					if (!str1.equals("java.lang.Boolean"))
						break;
					result = Boolean.valueOf(jobProperty.getPropertyValue().equalsIgnoreCase("true"));
					campo.set(jobPropertiesBean, result);
					continue;
				case 1195259493:
					if (!str1.equals("java.lang.String"))
						break;
					campo.set(jobPropertiesBean, jobProperty.getPropertyValue());
					continue;
				}
				log.info("Tipo de dato no manejado: {}", campo.getType().getName());
			} catch (NoSuchFieldException x) {
				x.printStackTrace();
			} catch (IllegalAccessException x) {
				x.printStackTrace();
			}
		}
		return jobPropertiesBean;
	}

	private List<JobProperty> findByIdJobName(String jobName) {
		return this.jobPropertyRepository.findByIdJobName(jobName);
	}

	public FileContentItem getContentFile(String absolutePath, Charset encoding) throws IOException {
		byte[] encoded = Files.readAllBytes(Paths.get(absolutePath, new String[0]));
		FileContentItem fileContentItem = new FileContentItem();
		fileContentItem.setContent(new String(encoded, encoding));
		return fileContentItem;
	}

	public SftpMsgResponse sendFile(String absolutePath, String insuranceId, Integer partnerId)
			throws UnknownPartnerIdException, SftpSendingException, StoredProcedureConfigurationNotFoundException,
			StoredProcedureParametersNotMatchException, StoredProcedureParametersTypesMismatchException,
			UnexpectedResponseCodeException {
		SftpMsgResponse sftpMsgResponse = new SftpMsgResponse();
		String jobName = "";
		String aseguradora = "";
		SftpSessionBean sftpSessionAseguradora = new SftpSessionBean();
		switch (partnerId.intValue()) {
		case 1:
			jobName = "alternateFileSendMX";
			aseguradora = "MAPFRE";
			sftpSessionAseguradora = this.sftpSessionMapfre;
			break;
		case 2:
			jobName = "alternateFileSendGT";
			aseguradora = "UNIVERSALES";
			sftpSessionAseguradora = this.sftpSessionUniversales;
			break;
		case 3:
			jobName = "alternateFileSendPE";
			aseguradora = "RIMAC";
			sftpSessionAseguradora = this.sftpSessionRimac;
			break;
		default:
			throw new UnknownPartnerIdException("No se reconoce el partnerId " + partnerId);
		}
		JobPropertiesBean jobPropertiesBean = getJobPropertiesByName(jobName);
		List<String> lstFilesToSend = new ArrayList<>();
		lstFilesToSend.add(absolutePath);
		MsgResponse msgResponse = new MsgResponse();
		if (uploadFiles(this.sftpSessionAterna, lstFilesToSend,
				(String) jobPropertiesBean.remoteTargetFolder.get("ATERNA")).booleanValue()) {
			if (uploadFiles(sftpSessionAseguradora, lstFilesToSend,
					(String) jobPropertiesBean.remoteTargetFolder.get(aseguradora)).booleanValue()) {
				List<Object> values = new ArrayList<Object>();
				values.add(insuranceId);
				values.add(partnerId);
				log.info("Ejecutando SP {}, insuranceId={}, partnerId={}",
						new Object[] { "SPUPDATEFILEIDSEND", insuranceId, partnerId });
				this.persistenceService.executeSP_SIMA("SPUPDATEFILEIDSEND", values, null);
				msgResponse.setCode(Integer.valueOf(0));
				msgResponse.setDescription("Éxito");
			} else {
				msgResponse.setCode(Integer.valueOf(-1));
				msgResponse.setDescription("No fue posible realizar el envío por sftp hacia " + aseguradora);
			}
		} else {
			msgResponse.setCode(Integer.valueOf(-1));
			msgResponse.setDescription("No fue posible realizar el envío por sftp hacia ATERNA");
		}
		sftpMsgResponse.setAbsolutePath(absolutePath);
		sftpMsgResponse.setMsgResponse(msgResponse);
		return sftpMsgResponse;
	}

	public Boolean uploadFiles(SftpSessionBean sftpSession, List<String> lstFileNameToSend, String remoteTargetFolder)
			throws SftpSendingException {
		Boolean sendFail = Boolean.valueOf(false);
		Map<String, Boolean> mapUploadResult = this.sftpService.uploadFile(sftpSession, lstFileNameToSend,
				remoteTargetFolder);
		if (!mapUploadResult.isEmpty()) {
			for (String fileName : lstFileNameToSend) {
				if (!mapUploadResult.containsKey(fileName)
						|| !((Boolean) mapUploadResult.get(fileName)).booleanValue()) {
					log.error("El archivo {} no pudo ser enviado al servidor sftp {}", fileName, sftpSession.getName());
					sendFail = Boolean.valueOf(true);
				}
			}
		} else {
			throw new SftpSendingException("No fue posible completar el envde archivos por SFTP");
		}
		return Boolean.valueOf(!sendFail.booleanValue());
	}

	@SuppressWarnings("unchecked")
	public List<CatalogoProducto> getpProductCatalogue(String c) {
		List<CatalogoProducto> lstRsp = new ArrayList<>();
		List<Object> values = new ArrayList<Object>();
		values.add(c);
		try {
			CallSPResponse callSPResponse = this.persistenceService.executeFunction_SIMA("SPPRODUCTCATALOGUE", values,
					new GenericRowMapper<CatalogoProducto>(CatalogoProducto.class));
			log.info("Resultado de ejecuciSP: Code={}, Description={}", callSPResponse.getCode(),
					callSPResponse.getDescription());
			if (!callSPResponse.getResult().isEmpty())
				lstRsp = (List<CatalogoProducto>) callSPResponse.getResult().get("SYS_REFCURSOR");
		} catch (StoredProcedureConfigurationNotFoundException e) {
			e.printStackTrace();
		}
		return lstRsp;
	}

	@SuppressWarnings("unchecked")
	public List<CatalogoTipoConciliacion> getTypeConciliation() {
		List<CatalogoTipoConciliacion> lstRsp = new ArrayList<>();
		try {
			CallSPResponse callSPResponse = this.persistenceService.executeFunction_SIMA("SPCONCILIATIONCATALOGUE",
					null, new GenericRowMapper<CatalogoTipoConciliacion>(CatalogoTipoConciliacion.class));
			log.info("Resultado de ejecuciSP: Code={}, Description={}", callSPResponse.getCode(),
					callSPResponse.getDescription());
			if (!callSPResponse.getResult().isEmpty())
				lstRsp = (List<CatalogoTipoConciliacion>) callSPResponse.getResult().get("SYS_REFCURSOR");
		} catch (StoredProcedureConfigurationNotFoundException e) {
			e.printStackTrace();
		}
		return lstRsp;
	}

	@SuppressWarnings("unchecked")
	public List<CatalogoTipoRegistro> getTypeRegistroCatalogue(String idPartner) {
		List<CatalogoTipoRegistro> lstRsp = new ArrayList<>();
		List<Object> values = new ArrayList<Object>();
		values.add(idPartner);
		try {
			CallSPResponse callSPResponse = this.persistenceService.executeFunction_SIMA("SPSEARCHINVOICECATALOGUE",
					values, new GenericRowMapper<CatalogoTipoRegistro>(CatalogoTipoRegistro.class));
			log.info("Resultado de ejecuciSP: Code={}, Description={}", callSPResponse.getCode(),
					callSPResponse.getDescription());
			if (!callSPResponse.getResult().isEmpty())
				lstRsp = (List<CatalogoTipoRegistro>) callSPResponse.getResult().get("SYS_REFCURSOR");
		} catch (StoredProcedureConfigurationNotFoundException e) {
			e.printStackTrace();
		}
		return lstRsp;
	}

	@SuppressWarnings("unchecked")
	public List<CatalogoModalidad> getModalidad(String productId) {
		List<CatalogoModalidad> lstRsp = new ArrayList<>();
		List<Object> values = new ArrayList<Object>();
		values.add(productId);
		try {
			CallSPResponse callSPResponse = this.persistenceService.executeFunction_SIMA("SPMODECATALOGUE", values,
					new GenericRowMapper<CatalogoModalidad>(CatalogoModalidad.class));
			log.info("Resultado de ejecuciSP: Code={}, Description={}", callSPResponse.getCode(),
					callSPResponse.getDescription());
			if (!callSPResponse.getResult().isEmpty())
				lstRsp = (List<CatalogoModalidad>) callSPResponse.getResult().get("SYS_REFCURSOR");
		} catch (StoredProcedureConfigurationNotFoundException e) {
			e.printStackTrace();
		}
		return lstRsp;
	}

	private String getNameJob(int partner) throws UnknownPartnerIdException {
		String jobName = "";
		switch (partner) {
		case 1:
			jobName = "CONCILIACIONMX";
			return jobName;
		case 2:
			jobName = "CONCILIACIONGT";
			return jobName;
		case 3:
			jobName = "CONCILIACIONPE";
			return jobName;
		}
		throw new UnknownPartnerIdException("No se reconoce el partnerId " + partner);
	}

	private List<Object> obtenerPropiedades(FormularioConciliacion form, String nameFile) {
		List<Object> values = new ArrayList<Object>();
		values.add(form.getStardatePeriodo());
		values.add(form.getEnddatePeriodo());
		values.add(form.getIdProduct());
		values.add(Integer.valueOf(form.getTypeCons()));
		values.add(Integer.valueOf(form.getIdModalidad()));
		values.add("user");
		values.add(nameFile);
		values.add(form.getStartDateCierre());
		values.add(form.getEnddateCierre());
		values.add(Integer.valueOf(form.getIdPartner()));
		return values;
	}

	@SuppressWarnings("unchecked")
	private List<CifrasConciliacion> executeCifrasControlConciliacion(List<Object> values, JobPropertiesBean jobPB) {
		List<CifrasConciliacion> cifras = null;
		try {
			CallSPResponse callSPResponse = this.persistenceService.executeFunction_SIMA(jobPB.storedProcedureName,
					values,  new GenericRowMapper<CifrasConciliacion>(CifrasConciliacion.class));
			log.info("Resultado de ejecución SP: Code={}, Description={}", callSPResponse.getCode(),
					callSPResponse.getDescription());
			if (!callSPResponse.getResult().isEmpty())
				cifras = (List<CifrasConciliacion>) callSPResponse.getResult().get("SYS_REFCURSOR");
		} catch (StoredProcedureConfigurationNotFoundException e) {
			log.error("Se produjo un error en el sp {}", jobPB.storedProcedureName);
			cifras = null;
		}
		return cifras;
	}

	private List<CifrasConciliacion> executeConciliacion(FormularioConciliacion form, JobPropertiesBean job,
			String nameFile) {
		List<Object> values = obtenerPropiedades(form, nameFile);
		List<CifrasConciliacion> cifrasC = executeCifrasControlConciliacion(values, job);
		try {
			CallSPResponse callSPResponse = this.persistenceService
					.executeFunctionWitOutParameter_SIMA_Parameters(job.afterStepStoredProcedureName, values, null, 2);
			log.info("Resultado de ejecución SP: Code={}, Description={}", callSPResponse.getCode(),
					callSPResponse.getDescription());
			return ((BigDecimal) callSPResponse.getResult().get("RETURN")).equals(new BigDecimal(0)) ? cifrasC : null;
		} catch (Exception e) {
			log.error("Se produjo un error en el sp {}", job.storedProcedureName);
			return null;
		}
	}

	public List<CifrasConciliacion> conciliation(FormularioConciliacion form, MultipartFile file) {
    List<CifrasConciliacion> cifras = null;
    try {
      JobPropertiesBean jobPB = getJobPropertiesByName(getNameJob(form.getIdPartner()));
      File convFile = new File(String.valueOf(jobPB.localTargetFolder) + "/" + jobPB.remoteTargetFileName);
      file.transferTo(convFile);
      if (uploadFiles(this.dbSftpSession, Arrays.asList(new String[] { String.valueOf(jobPB.localTargetFolder) + "/" + jobPB.remoteTargetFileName } ), jobPB.remoteSourceFolder).booleanValue())
        cifras = executeConciliacion(form, jobPB, file.getOriginalFilename()); 
      convFile.delete();
    } catch (IllegalStateException|IOException|SftpSendingException|UnknownPartnerIdException e) {
      log.error("Hubo un error al procesar la consolidacion : {}", e.getMessage());
    } 
    return cifras;
  }

	@SuppressWarnings("unchecked")
	public XSSFWorkbook obtenerReporteConciliacion(int idPartner) {
		XSSFWorkbook response = null;
		try {
			JobPropertiesBean jobPB = getJobPropertiesByName(getNameJob(idPartner));
			CallSPResponse callSPResponse = this.persistenceService.executeFunction_SIMA(jobPB.sqlQuery, null, null);
			Map<String, String> cursor = null;
			log.info("Resultado de ejecuciSP: Code={}, Description={}", callSPResponse.getCode(),
					callSPResponse.getDescription());
			if (!callSPResponse.getResult().isEmpty()) {
				cursor = ((List<Map<String, String>>) callSPResponse.getResult().get("SYS_REFCURSOR")).get(0);
				response = generateExcelConciliacion(
						((String) cursor.get("DATA_VALUE")).replaceFirst("=", "").split("="),
						String.valueOf(jobPB.localTargetFolder) + "/" + jobPB.sufix, jobPB.recordsPerCall.intValue());
			}
		} catch (UnknownPartnerIdException | StoredProcedureConfigurationNotFoundException | IOException e) {
			e.printStackTrace();
		}
		return response;
	}

	public XSSFWorkbook obtenerReporteFacturacion(int idPartner) {
		XSSFWorkbook response = null;
		try {
			JobPropertiesBean jobPB = getJobPropertiesByName(getNameFac(idPartner));
			response = generateExcelFacturacion(this.lstReportFact,
					String.valueOf(jobPB.localTargetFolder) + "/" + jobPB.sufix, jobPB.pattern);
		} catch (UnknownPartnerIdException | IOException e) {
			e.printStackTrace();
		}
		return response;
	}

	public CifrasFacturacion facturacion(FormularioFacturacion form, MultipartFile file) {
    CifrasFacturacion cifras = null;
    try {
      JobPropertiesBean jobPB = getJobPropertiesByName(getNameFac(form.getIdPartner()));
      String nameFile = form.getIdRegistro().equals("4") ? jobPB.prefix : jobPB.remoteTargetFileName;
      File convFile = new File(String.valueOf(jobPB.localTargetFolder) + "/" + nameFile);
      file.transferTo(convFile);
      if (uploadFiles(this.dbSftpSession, Arrays.asList(new String[] { String.valueOf(jobPB.localTargetFolder) + "/" + nameFile } ), jobPB.remoteSourceFolder).booleanValue())
        cifras = executeProcesoFacturacion(form, jobPB); 
      convFile.delete();
      if (cifras == null) {
        cifras = new CifrasFacturacion();
        cifras.setSucces(false);
        cifras.setMsg("Se produjo un error al conciliar la información del reporte con el administrador");
      } 
    } catch (Exception e) {
      cifras = new CifrasFacturacion();
      cifras.setSucces(false);
      cifras.setMsg(e.getMessage());
    } 
    return cifras;
  }

	@SuppressWarnings("deprecation")
	private List<Object> obtenerPropiedadesFacturacion(FormularioFacturacion form) {
		List<Object> lst = new ArrayList<Object>();
		lst.add(Integer.valueOf(form.getIdPartner()));
		lst.add(form.getIdProduct());
		lst.add(form.getIdRegistro());
		lst.add(form.getIdModalidad());
		lst.add(new Date((new Date(form.getStardate())).getTime()));
		lst.add(new Date((new Date(form.getEnddate())).getTime()));
		
		return lst;
	}

	private CifrasFacturacion executeProcesoFacturacion(FormularioFacturacion form, JobPropertiesBean jobPB)
			throws StoredProcedureConfigurationNotFoundException, StoredProcedureParametersNotMatchException,
			StoredProcedureParametersTypesMismatchException, UnexpectedResponseCodeException {
		String store = form.getIdRegistro().equals("4") ? jobPB.sqlQuery : jobPB.afterStepStoredProcedureName;
		if (executeSPInsertaFacturas(jobPB.storedProcedureName))
			return executeSPCifrasControlFacturacion(form, store);
		return null;
	}

	private boolean executeSPInsertaFacturas(String store)
			throws StoredProcedureConfigurationNotFoundException, StoredProcedureParametersNotMatchException,
			StoredProcedureParametersTypesMismatchException, UnexpectedResponseCodeException {
		CallSPResponse callSPResponse = this.persistenceService.executeSP_SIMA(store, null, null);
		log.info("Resultado de ejecución SP: Code={}, Description={}", callSPResponse.getCode(),
				callSPResponse.getDescription());
		return true;
	}

	@SuppressWarnings("unchecked")
	private CifrasFacturacion executeSPCifrasControlFacturacion(FormularioFacturacion form, String store) {
		List<Object> values = obtenerPropiedadesFacturacion(form);
		CifrasFacturacion ccf = new CifrasFacturacion();
		try {
			CallSPResponse callSPResponse = this.persistenceService.executeFunctionWitOutParameter_SIMA(store, values,
					null);
			log.info("Resultado de ejecución SP: Code={}, Description={}", callSPResponse.getCode(),
					callSPResponse.getDescription());
			ccf.setTot_reg(Integer.valueOf(((BigDecimal) callSPResponse.getResult().get("P_TOT_REG")).intValue()));
			ccf.setType(Integer.valueOf(((BigDecimal) callSPResponse.getResult().get("P_TYPE")).intValue()));
			ccf.setType_description((String) callSPResponse.getResult().get("P_TYPE_DESCRIPTION"));
			ccf.setTot_regn(Integer.valueOf(((BigDecimal) callSPResponse.getResult().get("P_TOT_REGN")).intValue()));
			ccf.setTypen(Integer.valueOf(((BigDecimal) callSPResponse.getResult().get("P_TYPEN")).intValue()));
			ccf.setType_decription_n((String) callSPResponse.getResult().get("P_TYPE_DESCRIPTIONN"));
			ccf.setSucces(true);
			this.lstReportFact = (List<Object>) callSPResponse.getResult().get("SYS_REFCURSOR");
		} catch (Exception e) {
			log.error("Se produjo un error en el sp {}", store);
			ccf.setSucces(false);
			ccf.setMsg(e.getMessage());
		}
		return ccf;
	}

	private String getNameFac(int partner) throws UnknownPartnerIdException {
		String jobName = "";
		switch (partner) {
		case 1:
			jobName = "REGISTROFACMX";
			return jobName;
		case 2:
			jobName = "REGISTROFACGT";
			return jobName;
		case 3:
			jobName = "REGISTROFACPE";
			return jobName;
		}
		throw new UnknownPartnerIdException("No se reconoce el partnerId " + partner);
	}

	private XSSFWorkbook generateExcelConciliacion(String[] values, String file, int col) throws IOException {
		String fileName = file;
		FileInputStream fsIP = new FileInputStream(new File(fileName));
		try (XSSFWorkbook workbook = new XSSFWorkbook(fsIP)) {
			XSSFSheet sheet = workbook.getSheetAt(0);
			int rowNum = 0, colNum = 0;
			Cell cell = null;
			Row row = null;
			byte b;
			int i;
			String[] arrayOfString;
			for (i = (arrayOfString = values).length, b = 0; b < i;) {
				XSSFRow xSSFRow = null;
				String val = arrayOfString[b];
				if (colNum == 0)
					xSSFRow = sheet.createRow(rowNum);
				cellNew(cell, Integer.valueOf(colNum), (Row) xSSFRow, val.replaceAll("\"", "").replace(",", ""));
				rowNum = (colNum < col) ? rowNum : (rowNum + 1);
				colNum = (colNum < col) ? (colNum + 1) : 0;
				b++;
			}
			return workbook;
		}
	}

	@SuppressWarnings("unchecked")
	private XSSFWorkbook generateExcelFacturacion(List<Object> lst, String file, String encabezado) throws IOException {
		String fileName = file;
		FileInputStream fsIP = new FileInputStream(new File(fileName));
		XSSFWorkbook workbook = new XSSFWorkbook(fsIP);
		XSSFSheet sheet = workbook.getSheetAt(0);
		int rowNum = 0;
		Cell cell = null;
		XSSFRow xSSFRow = sheet.createRow(rowNum);
		String[] enca = encabezado.split(",");
		for (int i = 0; i < enca.length; i++)
			cellNew(cell, Integer.valueOf(i), (Row) xSSFRow, enca[i]);
		rowNum = 1;
		for (Object o : lst) {
			int colNum = 0;
			Map<String, String> cursor = (Map<String, String>) o;
			xSSFRow = sheet.createRow(rowNum);
			for (int j = 0; j < enca.length; j++)
				cellNew(cell, Integer.valueOf(colNum++), (Row) xSSFRow, cursor.get(enca[j]));
			rowNum++;
		}
		return workbook;
	}

	public void cellNew(Cell cell, Integer colNum, Row row, Object campo) {
		cell = row.createCell(colNum.intValue());
		cell.setCellValue((String) campo);
	}

	public CustomUser consultarServicioPrueba(String user, String password) {
		JobPropertiesBean jobPB = getJobPropertiesByName("LDAP");
		List<Menu> lstResponse = new ArrayList<>();
		CustomUser customUser = new CustomUser();
		Collection<Role> roles = new ArrayList<>();
		try {
			URL url = new URL(jobPB.sufix);
			WFCUM client = new WFCUM(url);
			CAutenticacion messageContent = new CAutenticacion();
			ObjectFactory factory = new ObjectFactory();
			JAXBElement<String> value = factory.createCAutenticacionIdSistema(jobPB.prefix);
			messageContent.setIdSistema(value);
			JAXBElement<String> value2 = factory.createCAutenticacionIdUsuario(user);
			messageContent.setIdUsuario(value2);
			JAXBElement<String> value3 = factory.createCAutenticacionPassword(password);
			messageContent.setPassword(value3);
			ResponseUm response = client.getBasicHttpBindingIWFCUM().validaUsuario(messageContent);
			if (((Log) response.getLog().getValue()).getBusinessDocumentProcessingResultCode().intValue() == 0) {
				for (CComponente list : ((ArrayOfCComponente) response.getMenus().getValue()).getCComponente()) {
					Menu m = new Menu(list.getUrlDestino().getValue(), list.getImagenComponente().getValue(),
							list.getNombrecomponente().getValue(), list.getIdModulo().intValue());
					lstResponse.add(m);
				}
				customUser.setExito(true);
				customUser.setMenu(lstResponse);
				customUser.setUsername(response.getUsuario().getValue());
				roles.add(new Role(response.getPerfil().getValue()));
			} else {
				customUser.setExito(false);
				customUser.setMensaje(((Item) ((Log) response.getLog().getValue()).getItem().getValue())
						.getCategoryCode().getValue());
				roles.add(new Role("NA"));
				customUser.setUsername("ERROR");
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		customUser.setAuthorities(roles);
		return customUser;
	}
}
