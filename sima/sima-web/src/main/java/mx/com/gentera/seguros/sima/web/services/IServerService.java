package mx.com.gentera.seguros.sima.web.services;

import java.io.IOException;
import java.nio.charset.Charset;
import java.util.Date;
import java.util.List;
import mx.com.gentera.seguros.common.persistence.exceptions.StoredProcedureConfigurationNotFoundException;
import mx.com.gentera.seguros.common.persistence.exceptions.StoredProcedureParametersNotMatchException;
import mx.com.gentera.seguros.common.persistence.exceptions.StoredProcedureParametersTypesMismatchException;
import mx.com.gentera.seguros.common.persistence.exceptions.UnexpectedResponseCodeException;
import mx.com.gentera.seguros.common.sftp.beans.SftpSessionBean;
import mx.com.gentera.seguros.sima.web.exceptions.SftpSendingException;
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
import mx.com.gentera.seguros.sima.web.model.PartnerItem;
import mx.com.gentera.seguros.sima.web.model.SftpMsgResponse;
import mx.com.gentera.seguros.sima.web.request.FormularioConciliacion;
import mx.com.gentera.seguros.sima.web.request.FormularioFacturacion;
import mx.com.gentera.seguros.sima.web.request.SearchInsurance;
import mx.com.gentera.seguros.sima.web.security.CustomUser;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.springframework.web.multipart.MultipartFile;

public interface IServerService {
	List<PartnerItem> findAllPartner()
			throws StoredProcedureConfigurationNotFoundException, StoredProcedureParametersNotMatchException,
			StoredProcedureParametersTypesMismatchException, UnexpectedResponseCodeException;

	List<InsuranceItem> getLstInsurance(Integer paramInteger, String paramString1, String paramString2, Date paramDate)
			throws StoredProcedureConfigurationNotFoundException, StoredProcedureParametersNotMatchException,
			StoredProcedureParametersTypesMismatchException, UnexpectedResponseCodeException;

	PartnerItem findPartnerByPartnerId(Integer paramInteger)
			throws StoredProcedureConfigurationNotFoundException, StoredProcedureParametersNotMatchException,
			StoredProcedureParametersTypesMismatchException, UnexpectedResponseCodeException;

	List<InsuranceFileItem> createInsuranceFiles(List<InsuranceItem> paramList) throws IOException,
			StoredProcedureConfigurationNotFoundException, StoredProcedureParametersNotMatchException,
			StoredProcedureParametersTypesMismatchException, UnexpectedResponseCodeException, UnknownPartnerIdException;

	FileContentItem getContentFile(String paramString, Charset paramCharset) throws IOException;

	Boolean uploadFiles(SftpSessionBean paramSftpSessionBean, List<String> paramList, String paramString)
			throws SftpSendingException;

	SftpMsgResponse sendFile(String paramString1, String paramString2, Integer paramInteger)
			throws UnknownPartnerIdException, SftpSendingException, StoredProcedureConfigurationNotFoundException,
			StoredProcedureParametersNotMatchException, StoredProcedureParametersTypesMismatchException,
			UnexpectedResponseCodeException;

	List<Insurance> searchAllInsurance(SearchInsurance paramSearchInsurance)
			throws StoredProcedureConfigurationNotFoundException, StoredProcedureParametersNotMatchException,
			StoredProcedureParametersTypesMismatchException, UnexpectedResponseCodeException;

	List<CatalogoProducto> getpProductCatalogue(String paramString);

	List<CatalogoTipoConciliacion> getTypeConciliation();

	List<CatalogoModalidad> getModalidad(String paramString);

	List<CifrasConciliacion> conciliation(FormularioConciliacion paramFormularioConciliacion,
			MultipartFile paramMultipartFile);

	XSSFWorkbook obtenerReporteConciliacion(int paramInt);

	List<CatalogoTipoRegistro> getTypeRegistroCatalogue(String paramString);

	CifrasFacturacion facturacion(FormularioFacturacion paramFormularioFacturacion, MultipartFile paramMultipartFile);

	XSSFWorkbook obtenerReporteFacturacion(int paramInt);

	CustomUser consultarServicioPrueba(String paramString1, String paramString2);
}
