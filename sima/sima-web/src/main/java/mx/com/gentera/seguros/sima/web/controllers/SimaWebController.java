package mx.com.gentera.seguros.sima.web.controllers;

import com.google.gson.Gson;
import java.io.IOException;
import java.io.OutputStream;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import mx.com.gentera.seguros.common.persistence.entities.sima.JobProperty;
import mx.com.gentera.seguros.common.persistence.exceptions.StoredProcedureConfigurationNotFoundException;
import mx.com.gentera.seguros.common.persistence.exceptions.StoredProcedureParametersNotMatchException;
import mx.com.gentera.seguros.common.persistence.exceptions.StoredProcedureParametersTypesMismatchException;
import mx.com.gentera.seguros.common.persistence.exceptions.UnexpectedResponseCodeException;
import mx.com.gentera.seguros.sima.web.exceptions.UnknownPartnerIdException;
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
import mx.com.gentera.seguros.sima.web.model.JobExecutionsHistory;
import mx.com.gentera.seguros.sima.web.model.MsgResponse;
import mx.com.gentera.seguros.sima.web.model.PartnerItem;
import mx.com.gentera.seguros.sima.web.model.SftpMsgResponse;
import mx.com.gentera.seguros.sima.web.request.FormularioConciliacion;
import mx.com.gentera.seguros.sima.web.request.FormularioFacturacion;
import mx.com.gentera.seguros.sima.web.request.SearchInsurance;
import mx.com.gentera.seguros.sima.web.services.ISchedulerService;
import mx.com.gentera.seguros.sima.web.services.IServerService;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

@RequestMapping({ "/api" })
@RestController
public class SimaWebController {

	private static final Logger log = LoggerFactory.getLogger(SimaWebController.class);
	private static final String HEADER_CONTENT_DISP = "Content-Disposition";
	private static final String EXCEL_CONTENT_TYPE = "application/vnd.openxmlformats-officedocument.spreadsheetml.sheet";

	@Autowired
	IServerService serverService;

	@Autowired
	ISchedulerService schedulerService;

	@RequestMapping(value = { "/history/job/{jobName}" }, method = { RequestMethod.GET })
	public ResponseEntity<List<JobExecutionsHistory>> getLstJobExecutionsHistory(
			@PathVariable("jobName") String jobName) {
		ResponseEntity<List<JobExecutionsHistory>> response = null;
		response = new ResponseEntity<List<JobExecutionsHistory>>(
				this.schedulerService.findAllJobExecutionsHistory(jobName), HttpStatus.ACCEPTED);
		return response;
	}

	@RequestMapping(value = { "/job/{jobName}/stop" }, method = { RequestMethod.GET })
	public ResponseEntity<MsgResponse> stopScheduledJob(@PathVariable("jobName") String jobName) throws Exception {
		ResponseEntity<MsgResponse> response = null;
		response = new ResponseEntity<MsgResponse>(this.schedulerService.stop(jobName), HttpStatus.ACCEPTED);
		return response;
	}

	@RequestMapping(value = { "/job/{jobName}/start" }, method = { RequestMethod.GET })
	public ResponseEntity<MsgResponse> startScheduledJob(@PathVariable("jobName") String jobName) throws Exception {
		ResponseEntity<MsgResponse> response = null;
		log.info("METHOD START");
		response = new ResponseEntity<MsgResponse>(this.schedulerService.start(jobName), HttpStatus.ACCEPTED);
		return response;
	}

	@RequestMapping(value = { "/job/{jobName}/execute" }, method = { RequestMethod.GET })
	public ResponseEntity<MsgResponse> executeScheduledJob(@PathVariable("jobName") String jobName) throws Exception {
		ResponseEntity<MsgResponse> response = null;
		log.info("METHOD EXECUTE");
		response = new ResponseEntity<MsgResponse>(this.schedulerService.execute(jobName), HttpStatus.ACCEPTED);
		return response;
	}

	@RequestMapping(value = { "/job/{jobName}/retry/{uuid}" }, method = { RequestMethod.GET })
	public ResponseEntity<MsgResponse> retryJob(@PathVariable("jobName") String jobName,
			@PathVariable("uuid") String uuid) throws Exception {
		ResponseEntity<MsgResponse> response = null;
		response = new ResponseEntity<MsgResponse>(this.schedulerService.retry(jobName, uuid), HttpStatus.ACCEPTED);
		return response;
	}

	@RequestMapping(value = { "/job/{jobName}/properties" }, method = { RequestMethod.GET })
	public ResponseEntity<List<JobProperty>> getJobProperties(@PathVariable("jobName") String jobName)
			throws Exception {
		ResponseEntity<List<JobProperty>> response = null;
		response = new ResponseEntity<List<JobProperty>>(this.schedulerService.getJobProperties(jobName),
				HttpStatus.ACCEPTED);
		return response;
	}

	@RequestMapping(value = { "/job/{jobName}/properties" }, method = { RequestMethod.POST })
	public ResponseEntity<List<JobProperty>> getJobProperties(@PathVariable("jobName") String jobName,
			@RequestBody List<JobProperty> lstJobProperties) throws Exception {
		ResponseEntity<List<JobProperty>> response = null;
		response = new ResponseEntity<List<JobProperty>>(
				this.schedulerService.saveJobProperties(jobName, lstJobProperties), HttpStatus.ACCEPTED);
		return response;
	}

	@RequestMapping(value = { "/partner" }, method = { RequestMethod.GET })
	public ResponseEntity<List<PartnerItem>> getLstPartner()
			throws StoredProcedureConfigurationNotFoundException, StoredProcedureParametersNotMatchException,
			StoredProcedureParametersTypesMismatchException, UnexpectedResponseCodeException {
		ResponseEntity<List<PartnerItem>> response = null;
		log.info("Iniciando ejecución por peticion REST getLstPartner");
		response = new ResponseEntity<List<PartnerItem>>(this.serverService.findAllPartner(), HttpStatus.ACCEPTED);
		return response;
	}

	@RequestMapping(value = { "/searchInsurance" }, method = { RequestMethod.GET })
	public ResponseEntity<List<Insurance>> getSearchListInsurance(@RequestParam(name = "partnerId") String partnerId,
			@RequestParam(name = "certificado") String certificado, @RequestParam(name = "idCliente") String idCliente,
			@RequestParam(name = "idSolicitud") String idSolicitud,
			@RequestParam(name = "nombre", required = true) String nombre,
			@RequestParam(name = "sNombre") String sNombre,
			@RequestParam(name = "aPaterno", required = true) String aPaterno,
			@RequestParam(name = "aMaterno") String aMaterno,
			@RequestParam(name = "fechaNacimiento") String fechaNacimiento) {
		ResponseEntity<List<Insurance>> response = null;
		log.info("Iniciando ejecución por peticion REST getSearchListInsurance");
		try {
			SearchInsurance insurance = new SearchInsurance(partnerId, certificado, idCliente, idSolicitud, nombre,
					sNombre, aPaterno, aMaterno, fechaNacimiento);
			log.info("Request : {}", insurance.toString());
			response = new ResponseEntity<List<Insurance>>(this.serverService.searchAllInsurance(insurance),
					HttpStatus.ACCEPTED);
		} catch (Exception e) {
			log.error(e.getMessage());
		}
		return response;
	}

	@RequestMapping(value = { "/typeConciliationCatalogue" }, method = { RequestMethod.GET })
	public ResponseEntity<List<CatalogoTipoConciliacion>> typeConciliationCatalogue() {
		ResponseEntity<List<CatalogoTipoConciliacion>> response = null;
		log.info("Iniciando ejecución por peticion REST typeConciliationCatalogue");
		try {
			response = new ResponseEntity<List<CatalogoTipoConciliacion>>(this.serverService.getTypeConciliation(),
					HttpStatus.ACCEPTED);
		} catch (Exception e) {
			log.error(e.getMessage());
		}
		return response;
	}

	@RequestMapping(value = { "/typeRegistroCatalogue" }, method = { RequestMethod.GET })
	public ResponseEntity<List<CatalogoTipoRegistro>> typeRegistroCatalogue(
			@RequestParam(name = "partnerID", required = true) String partnerID) {
		ResponseEntity<List<CatalogoTipoRegistro>> response = null;
		log.info("Iniciando ejecución por peticion REST typeRegistroCatalogue");
		try {
			response = new ResponseEntity<List<CatalogoTipoRegistro>>(
					this.serverService.getTypeRegistroCatalogue(partnerID), HttpStatus.ACCEPTED);
		} catch (Exception e) {
			log.error(e.getMessage());
		}
		return response;
	}

	@RequestMapping(value = { "/productCatalogue" }, method = { RequestMethod.GET })
	public ResponseEntity<List<CatalogoProducto>> productCatalogue(
			@RequestParam(name = "partnerID", required = true) String partnerID) {
		ResponseEntity<List<CatalogoProducto>> response = null;
		log.info("Iniciando ejecución por peticion REST productCatalogue");
		try {
			response = new ResponseEntity<List<CatalogoProducto>>(this.serverService.getpProductCatalogue(partnerID),
					HttpStatus.ACCEPTED);
		} catch (Exception e) {
			log.error(e.getMessage());
		}
		return response;
	}

	@RequestMapping(value = { "/modalidadCatalogue" }, method = { RequestMethod.GET })
	public ResponseEntity<List<CatalogoModalidad>> modalidadCatalogue(
			@RequestParam(name = "productId", required = true) String productId) {
		ResponseEntity<List<CatalogoModalidad>> response = null;
		log.info("Iniciando ejecución por peticion REST modalidadCatalogue");
		try {
			response = new ResponseEntity<List<CatalogoModalidad>>(this.serverService.getModalidad(productId),
					HttpStatus.ACCEPTED);
		} catch (Exception e) {
			log.error(e.getMessage());
		}
		return response;
	}

	@RequestMapping(value = { "/insurance" }, method = { RequestMethod.GET })
	public ResponseEntity<List<InsuranceItem>> getLstInsurance(
			@RequestParam(name = "partnerId", required = true) Integer partnerId,
			@RequestParam(name = "businessPartnerId", required = false) String businessPartnerId,
			@RequestParam(name = "certificate", required = false) String certificate,
			@RequestParam(name = "startDate", required = true) @DateTimeFormat(pattern = "dd-MM-yyyy") Date startDate)
			throws StoredProcedureConfigurationNotFoundException, StoredProcedureParametersNotMatchException,
			StoredProcedureParametersTypesMismatchException, UnexpectedResponseCodeException {
		ResponseEntity<List<InsuranceItem>> response = null;
		log.info("Iniciando ejecución por peticion REST getLstInsurance");
		response = new ResponseEntity<List<InsuranceItem>>(
				this.serverService.getLstInsurance(partnerId, businessPartnerId, certificate, startDate),
				HttpStatus.ACCEPTED);
		return response;
	}

	@RequestMapping(value = { "/getReportConciliacion" }, method = { RequestMethod.GET })
	public void getReportConciliacion(HttpServletResponse response, @RequestParam("idPartner") int idPartner) {
		log.info("Iniciando ejecución por peticion REST export report");
		try {
			String fileName = "conciliation_detail.xlsx";
			response.setContentType("application/vnd.openxmlformats-officedocument.spreadsheetml.sheet");
			response.setHeader("Content-Disposition", "inline; filename=\"" + fileName);
			XSSFWorkbook workbook = this.serverService.obtenerReporteConciliacion(idPartner);
			workbook.write((OutputStream) response.getOutputStream());
			workbook.close();
		} catch (Exception e) {
			log.error(e.getMessage());
		}
	}

	@RequestMapping(value = { "/getReportFacturacion" }, method = { RequestMethod.GET })
	public void getReportFacturacion(HttpServletResponse response, @RequestParam("idPartner") int idPartner) {
		log.info("Iniciando ejecución por peticion REST export report facturacion");
		try {
			String fileName = "detalleFacturacion.xlsx";
			response.setContentType("application/vnd.openxmlformats-officedocument.spreadsheetml.sheet");
			response.setHeader("Content-Disposition", "inline; filename=\"" + fileName);
			XSSFWorkbook workbook = this.serverService.obtenerReporteFacturacion(idPartner);
			workbook.write((OutputStream) response.getOutputStream());
			workbook.close();
		} catch (Exception e) {
			log.error(e.getMessage());
		}
	}

	@RequestMapping(value = { "/sendConciliation" }, method = { RequestMethod.POST })
	public ResponseEntity<List<CifrasConciliacion>> sendConciliation(@RequestParam("file") MultipartFile file,
			HttpServletRequest httpRequest) {
		log.info("Iniciando ejecución por peticion REST del servicio para conciliar seguros");
		ResponseEntity<List<CifrasConciliacion>> response = null;
		try {
			Gson gson = new Gson();
			FormularioConciliacion form = (FormularioConciliacion) gson
					.fromJson(httpRequest.getParameter("FormularioConciliacion"), FormularioConciliacion.class);
			if (form.getIdPartner() != 0 && !form.getIdProduct().equals("0") && form.getIdModalidad() != 0
					&& form.getTypeCons() != 0 && form.getEnddateCierre() != null && form.getEnddatePeriodo() != null
					&& form.getStardatePeriodo() != null && form.getStartDateCierre() != null) {
				List<CifrasConciliacion> resultado = this.serverService.conciliation(form, file);
				response = (resultado != null)
						? new ResponseEntity<List<CifrasConciliacion>>(resultado, HttpStatus.ACCEPTED)
						: new ResponseEntity<List<CifrasConciliacion>>(resultado, HttpStatus.FAILED_DEPENDENCY);
			} else {
				response = new ResponseEntity(new ArrayList<Object>(), HttpStatus.FAILED_DEPENDENCY);
			}
		} catch (Exception e) {
			log.error(e.getMessage());
			response = new ResponseEntity<List<CifrasConciliacion>>(new ArrayList<CifrasConciliacion>(),
					HttpStatus.FAILED_DEPENDENCY);
		}
		return response;
	}

	@RequestMapping(value = { "/sendFacturacion" }, method = { RequestMethod.POST })
	public ResponseEntity<CifrasFacturacion> sendFacturacion(@RequestParam("file") MultipartFile file,
			HttpServletRequest httpRequest) {
		log.info("Iniciando ejecución por peticion REST del servicio para conciliar seguros");
		ResponseEntity<CifrasFacturacion> response = null;
		Gson gson = new Gson();
		FormularioFacturacion form = (FormularioFacturacion) gson
				.fromJson(httpRequest.getParameter("FormularioFacturacion"), FormularioFacturacion.class);
		CifrasFacturacion cifras = this.serverService.facturacion(form, file);
		response = new ResponseEntity<CifrasFacturacion>(cifras,
				(cifras != null) ? HttpStatus.ACCEPTED : HttpStatus.INTERNAL_SERVER_ERROR);
		return response;
	}

	@RequestMapping(value = { "/insurance/files" }, method = { RequestMethod.POST })
	public ResponseEntity<List<InsuranceFileItem>> getLstInsuranceFiles(
			@RequestBody List<InsuranceItem> lstInsuranceItem)
			throws IOException, StoredProcedureConfigurationNotFoundException,
			StoredProcedureParametersNotMatchException, StoredProcedureParametersTypesMismatchException,
			UnexpectedResponseCodeException, UnknownPartnerIdException {
		ResponseEntity<List<InsuranceFileItem>> response = null;
		log.info("Iniciando ejecución por peticion REST getLstInsuranceFiles - {} registros",
				Integer.valueOf(lstInsuranceItem.size()));
		response = new ResponseEntity<List<InsuranceFileItem>>(
				this.serverService.createInsuranceFiles(lstInsuranceItem), HttpStatus.ACCEPTED);
		return response;
	}

	@RequestMapping(value = { "/insurance/file" }, method = { RequestMethod.GET })
	public ResponseEntity<FileContentItem> getContentFile(
			@RequestParam(name = "absolutePath", required = true) String absolutePath) throws IOException {
		ResponseEntity<FileContentItem> response = null;
		log.info("Iniciando ejecución por peticion REST getContentFile");
		response = new ResponseEntity<FileContentItem>(
				this.serverService.getContentFile(absolutePath, StandardCharsets.UTF_8), HttpStatus.ACCEPTED);
		return response;
	}

	@RequestMapping(value = { "/insurance/file/send" }, method = { RequestMethod.GET })
	public ResponseEntity<SftpMsgResponse> sendFile(
			@RequestParam(name = "absolutePath", required = true) String absolutePath,
			@RequestParam(name = "insuranceId", required = true) String insuranceId,
			@RequestParam(name = "partnerId", required = true) Integer partnerId) {
		SftpMsgResponse sftpMsgResponse = new SftpMsgResponse();
		log.info("Iniciando ejecución por peticion REST sendFile");
		try {
			sftpMsgResponse = this.serverService.sendFile(absolutePath, insuranceId, partnerId);
		} catch (Exception e) {
			log.error("Error al intentar el envío del archivo hacia la aseguradora: {}", e.getMessage());
			sftpMsgResponse.setAbsolutePath(absolutePath);
			MsgResponse msgResponse = new MsgResponse();
			msgResponse.setCode(Integer.valueOf(-1));
			msgResponse.setDescription(e.getLocalizedMessage());
			sftpMsgResponse.setMsgResponse(msgResponse);
		}
		return new ResponseEntity<SftpMsgResponse>(sftpMsgResponse, HttpStatus.ACCEPTED);
	}
}