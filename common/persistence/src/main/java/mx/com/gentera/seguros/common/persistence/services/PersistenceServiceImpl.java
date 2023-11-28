package mx.com.gentera.seguros.common.persistence.services;

import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.Field;
import java.math.BigDecimal;
import java.sql.Types;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.PostConstruct;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;

import org.apache.tomcat.jdbc.pool.DataSource;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.core.io.Resource;
import org.springframework.core.io.support.PathMatchingResourcePatternResolver;
import org.springframework.core.io.support.ResourcePatternResolver;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.core.SqlOutParameter;
import org.springframework.jdbc.core.SqlParameter;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.simple.SimpleJdbcCall;
import org.springframework.stereotype.Service;

import mx.com.gentera.seguros.common.persistence.beans.CallSPBean;
import mx.com.gentera.seguros.common.persistence.beans.CallSPParameterBean;
import mx.com.gentera.seguros.common.persistence.exceptions.StoredProcedureConfigurationNotFoundException;
import mx.com.gentera.seguros.common.persistence.exceptions.StoredProcedureParametersNotMatchException;
import mx.com.gentera.seguros.common.persistence.exceptions.StoredProcedureParametersTypesMismatchException;
import mx.com.gentera.seguros.common.persistence.exceptions.UnexpectedResponseCodeException;
import mx.com.gentera.seguros.common.persistence.model.CallSPResponse;
import oracle.jdbc.OracleTypes;

/**
 * PROCESO: Capa de Persistencia OBJETIVO: Implementar los servicios de
 * persistencia que seran proporcionados a traves de la interfaz RELACION:
 * [CallSPResponse, CallSPBean, CallSPParameterBean,
 * StoredProcedureConfigurationNotFoundException,
 * StoredProcedureParametersNotMatchException,
 * StoredProcedureParametersTypesMismatchException,
 * UnexpectedResponseCodeException]
 * 
 * @author Miguel Angel Carrasco Irineo
 */
@Service
public class PersistenceServiceImpl implements IPersistenceService {
	/**
	 * Generador del log de la clase
	 */
	private static final Logger log = LoggerFactory.getLogger(PersistenceServiceImpl.class);

	/**
	 * Inyeccion de dependencia para el JDBC Template de PSC
	 */
	@Autowired
	@Qualifier("jdbcTemplatePSC")
	JdbcTemplate jdbcTemplatePSC;

	/**
	 * Inyeccion de dependencia para el JDBC Template de SIMA
	 */
	@Autowired
	@Qualifier("jdbcTemplateSIMA")
	JdbcTemplate jdbcTemplateSIMA;

	/**
	 * Lista de configuraciones para los Stored Procedures
	 */
	private Map<String, CallSPBean> mapCallSPBean = new HashMap<>();
	/**
	 * Lista de tipos permitidos para los parametros de los Stored Procedures
	 */
	private Map<String, Integer> mapSqlTypes = new HashMap<>();
	/**
	 * Cadena para concatenar los tipos de datos permitidos para los parametros de
	 * los Stored Procedures
	 */
	private String types = "";

	private String mensajeExitoso = "El proceso fue exitoso";

	/**
	 * Inicializa la instancia singleton de la clase
	 * 
	 * @throws JAXBException          Lanza una excepcion cuando no se puede
	 *                                convertir el documento XML a objeto
	 * @throws IOException            Lanza una exepcion cuando no se puede leer el
	 *                                archivo de configuracion del Stored Procedure
	 * @throws IllegalAccessException Lanza una excepcion de permisos cuando no se
	 *                                puede acceder al archivo de configuracion del
	 *                                Stored Procedure
	 */
	@PostConstruct
	private void init() throws JAXBException, IOException, IllegalArgumentException, IllegalAccessException {
		log.info("Obteniendo configuración de Stored Procedures");
		ResourcePatternResolver resolver = new PathMatchingResourcePatternResolver();

		Resource[] resources = resolver.getResources("classpath:xml/callSP-*.xml");

		for (Resource resource : resources) {
			InputStream file = resource.getInputStream();
			JAXBContext jaxbContext = JAXBContext.newInstance(CallSPBean.class);
			Unmarshaller jaxbUnmarshaller = jaxbContext.createUnmarshaller();
			CallSPBean callSPBean = (CallSPBean) jaxbUnmarshaller.unmarshal(file);
			mapCallSPBean.put(callSPBean.getStoredProcedureName(), callSPBean);

			log.info("Configuración detectada: {} - [{}]", callSPBean.getStoredProcedureName(), callSPBean.toString());
		}

		for (Field field : Types.class.getFields()) {
			mapSqlTypes.put(field.getName(), (Integer) field.get(null));
		}

		for (Map.Entry<String, Integer> entry : mapSqlTypes.entrySet()) {
			types = types.concat(entry.getKey()).concat("|");
		}

		types = types.substring(0, types.length() - 1);
	}

	/**
	 * Obtiene el listado de propiedades de un origen de datos y lo incluye al log a
	 * nivel debug
	 * 
	 * @param message    Establece el mensaje a concatenar al inicio del listado de
	 *                   propiedades de la conexion
	 * @param dataSource Establece el origen de datos a consultar
	 */
	private void getConnections(String message, DataSource dataSource) {
		log.debug("{} - Active: {}; BorrowedCount: {}; CreatedCount: {}; DefaultTransactionIsolation: {}; "
				+ "Idle: {}; InitialSize: {}; MaxActive: {}; MaxAge: {}; MaxIdle: {}; MaxWait{}; "
				+ "NumActive: {}; NumIdle: {}; PoolSize: {}; ReconnectedCount: {}; ReleasedCount: {}; "
				+ "ReleasedIdleCount: {}; RemoveAbandonedCount: {}; ReturnedCount: {}; Size: {}; "
				+ "SuspectTimeout: {}; TimeBetweenEvictionRunsMillis: {}; ValidationInterval: {}; " + "WaitCount: {};",
				message, dataSource.getActive(), dataSource.getBorrowedCount(), dataSource.getCreatedCount(),
				dataSource.getDefaultTransactionIsolation(), dataSource.getIdle(), dataSource.getInitialSize(),
				dataSource.getMaxActive(), dataSource.getMaxAge(), dataSource.getMaxIdle(), dataSource.getMaxWait(),
				dataSource.getNumActive(), dataSource.getNumIdle(), dataSource.getPoolSize(),
				dataSource.getReconnectedCount(), dataSource.getReleasedCount(), dataSource.getReleasedIdleCount(),
				dataSource.getRemoveAbandonedCount(), dataSource.getReturnedCount(), dataSource.getSize(),
				dataSource.getSuspectTimeout(), dataSource.getTimeBetweenEvictionRunsMillis(),
				dataSource.getValidationInterval(), dataSource.getWaitCount());
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * mx.com.gentera.psc.persistence.services.IPersistenceService#executeSP_PSC(
	 * java.lang.String, java.util.List, org.springframework.jdbc.core.RowMapper)
	 */
	@Override
	public CallSPResponse executeSP_PSC(String storedProcedureName, List<Object> values, RowMapper<?> rowMapper)
			throws StoredProcedureConfigurationNotFoundException, StoredProcedureParametersNotMatchException,
			StoredProcedureParametersTypesMismatchException, UnexpectedResponseCodeException {

		return executeSP(storedProcedureName, values, rowMapper, jdbcTemplatePSC);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * mx.com.gentera.psc.persistence.services.IPersistenceService#executeSP_SIMA(
	 * java.lang.String, java.util.List, org.springframework.jdbc.core.RowMapper)
	 */
	@Override
	public CallSPResponse executeSP_SIMA(String storedProcedureName, List<Object> values, RowMapper<?> rowMapper)
			throws StoredProcedureConfigurationNotFoundException, StoredProcedureParametersNotMatchException,
			StoredProcedureParametersTypesMismatchException, UnexpectedResponseCodeException {

		return executeSP(storedProcedureName, values, rowMapper, jdbcTemplateSIMA);
	}

	@Override
	public CallSPResponse executeSP_PSC_Robo(String storedProcedureName, List<Object> values, RowMapper<?> rowMapper)
			throws StoredProcedureConfigurationNotFoundException {
		return ejecutarSP(storedProcedureName, values, rowMapper, jdbcTemplatePSC);

	}

	@Override
	public CallSPResponse executeSP_SIMA_Robo(String storedProcedureName, List<Object> values, RowMapper<?> rowMapper)
			throws StoredProcedureConfigurationNotFoundException {
		return ejecutarSP(storedProcedureName, values, rowMapper, jdbcTemplateSIMA);

	}

	@Override
	public CallSPResponse executeFunction_SIMA(String storedProcedureName, List<Object> values, RowMapper<?> rowMapper)
			throws StoredProcedureConfigurationNotFoundException {
		return ejecutarSP(storedProcedureName, values, rowMapper, jdbcTemplateSIMA);

	}

	@Override
	public CallSPResponse executeFunctionWitOutParameter_SIMA(String storedProcedureName, List<Object> values,
			RowMapper<?> rowMapper) throws StoredProcedureConfigurationNotFoundException {
		return ejecutarFunction(storedProcedureName, values, rowMapper, jdbcTemplateSIMA);

	}

	@Override
	public CallSPResponse executeFunctionWitOutParameter_SIMA_Parameters(String storedProcedureName,
			List<Object> values, RowMapper<?> rowMapper, int oracleType) throws Exception {
		return executeFunctionNumber(storedProcedureName, values, rowMapper, jdbcTemplateSIMA, oracleType);
	}

	private CallSPResponse ejecutarSP(String storedProcedureName, List<Object> values, RowMapper<?> rowMapper,
			JdbcTemplate jdbcTemplate) throws StoredProcedureConfigurationNotFoundException {
		CallSPResponse result = new CallSPResponse();
		CallSPBean callSPBean = null;

		if (!mapCallSPBean.containsKey(storedProcedureName)) {
			throw new StoredProcedureConfigurationNotFoundException(
					"No se encontró la especificación Call para el SP: " + storedProcedureName);
		}
		try {
			callSPBean = mapCallSPBean.get(storedProcedureName);
			SimpleJdbcCall call = new SimpleJdbcCall(jdbcTemplate);
			call.declareParameters(new SqlOutParameter(("SYS_REFCURSOR"), OracleTypes.CURSOR));
			MapSqlParameterSource in = new MapSqlParameterSource();
			int index = 0;
			for (CallSPParameterBean parameter : callSPBean.getParameters()) {
				Integer parameterType = mapSqlTypes.get(parameter.getTypeParameter());
				in.addValue(parameter.getParameterName(), values.get(index));
				call.addDeclaredParameter(new SqlParameter(parameter.getParameterName(), parameterType));
				index++;
			}
			call.withFunctionName(storedProcedureName);
			call.withoutProcedureColumnMetaDataAccess();
			call.returningResultSet("SYS_REFCURSOR", rowMapper);
			result.setResult(call.execute(in));
			result.setCode(1);
			result.setDescription(mensajeExitoso);
			return result;
		} catch (Exception e) {
			e.printStackTrace();
			log.error(e.getMessage());
			result.setDescription(e.getMessage());
			result.setCode(0);
			return result;
		}

	}

	private CallSPResponse ejecutarFunction(String storedProcedureName, List<Object> values, RowMapper<?> rowMapper,
			JdbcTemplate jdbcTemplate) throws StoredProcedureConfigurationNotFoundException {
		CallSPResponse result = new CallSPResponse();
		CallSPBean callSPBean = null;

		if (!mapCallSPBean.containsKey(storedProcedureName)) {
			throw new StoredProcedureConfigurationNotFoundException(
					"No se encontró la especificación Call para el SP: " + storedProcedureName);
		}
		try {
			callSPBean = mapCallSPBean.get(storedProcedureName);
			SimpleJdbcCall call = new SimpleJdbcCall(jdbcTemplate);
			call.declareParameters(new SqlOutParameter(("SYS_REFCURSOR"), OracleTypes.CURSOR));
			MapSqlParameterSource in = new MapSqlParameterSource();
			int index = 0;
			for (CallSPParameterBean parameter : callSPBean.getParameters()) {
				if (parameter.getOutParameter() != null) {
					SqlOutParameter sqlOutParameter = new SqlOutParameter(parameter.getParameterName(),
							mapSqlTypes.get(parameter.getTypeParameter()));
					call.addDeclaredParameter(sqlOutParameter);
				} else {
					Integer parameterType = mapSqlTypes.get(parameter.getTypeParameter());
					in.addValue(parameter.getParameterName(), values.get(index));
					call.addDeclaredParameter(new SqlParameter(parameter.getParameterName(), parameterType));
					index++;
				}

			}
			call.withFunctionName(storedProcedureName);
			call.withoutProcedureColumnMetaDataAccess();
			call.returningResultSet("SYS_REFCURSOR", rowMapper);
			result.setResult(call.execute(in));
			result.setCode(1);
			result.setDescription(mensajeExitoso);
			return result;
		} catch (Exception e) {
			e.printStackTrace();
			log.error(e.getMessage());
			result.setDescription(e.getMessage());
			result.setCode(0);
			return result;
		}

	}

	private CallSPResponse executeFunctionNumber(String storedProcedureName, List<Object> values,
			RowMapper<?> rowMapper, JdbcTemplate jdbcTemplate, int typeOracle)
			throws StoredProcedureConfigurationNotFoundException, StoredProcedureParametersNotMatchException,
			StoredProcedureParametersTypesMismatchException, UnexpectedResponseCodeException {
		CallSPResponse result = new CallSPResponse();
		CallSPBean callSPBean = null;

		if (!mapCallSPBean.containsKey(storedProcedureName)) {
			throw new StoredProcedureConfigurationNotFoundException(
					"No se encontró la especificación Call para el SP: " + storedProcedureName);
		}
		try {
			callSPBean = mapCallSPBean.get(storedProcedureName);
			SimpleJdbcCall call = new SimpleJdbcCall(jdbcTemplate);
			call.declareParameters(new SqlOutParameter(("RETURN"), typeOracle));
			MapSqlParameterSource in = new MapSqlParameterSource();
			int index = 0;
			for (CallSPParameterBean parameter : callSPBean.getParameters()) {
				if (parameter.getOutParameter() != null) {
					SqlOutParameter sqlOutParameter = new SqlOutParameter(parameter.getParameterName(),
							mapSqlTypes.get(parameter.getTypeParameter()));
					call.addDeclaredParameter(sqlOutParameter);
				} else {
					Integer parameterType = mapSqlTypes.get(parameter.getTypeParameter());
					in.addValue(parameter.getParameterName(), values.get(index));
					call.addDeclaredParameter(new SqlParameter(parameter.getParameterName(), parameterType));
					index++;
				}

			}
			call.withFunctionName(storedProcedureName);
			call.withoutProcedureColumnMetaDataAccess();
			result.setResult(call.execute(in));
			result.setCode(1);
			result.setDescription(mensajeExitoso);
			return result;
		} catch (Exception e) {
			e.printStackTrace();
			log.error(e.getMessage());
			result.setDescription(e.getMessage());
			result.setCode(0);
			return result;
		}
	}

	/**
	 * Ejecuta en la Base de Datos especificada un Stored Procedure
	 * 
	 * @param storedProcedureName Establece en nombre del Stored Procedure a
	 *                            ejecutar
	 * @param values              Establece la lista de parametros para la ejecucion
	 *                            del Stored Procedure
	 * @param rowMapper           Establece el convertidor de datos a utilizar
	 * @param jdbcTemplate        Establece el JDBC Template a utilizar para la
	 *                            ejecucion del Stored Procedure
	 * @return Obtiene la el resultado de la ejecucion del Stored Procedure en la
	 *         base de datos PSC
	 * @throws StoredProcedureConfigurationNotFoundException   Lanza una excepcion
	 *                                                         cuando no se detecta
	 *                                                         una configuracion
	 *                                                         para el Stored
	 *                                                         Procedure
	 * @throws StoredProcedureParametersNotMatchException      Lanza una excepcion
	 *                                                         cuando la lista de
	 *                                                         parametros no
	 *                                                         coinciden con los
	 *                                                         esperados por el
	 *                                                         Stored Procedure
	 * @throws StoredProcedureParametersTypesMismatchException Lanza una excepcion
	 *                                                         cuando el tipo de
	 *                                                         datos del parametro
	 *                                                         no coincide con la
	 *                                                         definicion del Stored
	 *                                                         Procedure
	 * @throws UnexpectedResponseCodeException                 Lanza una excepcion
	 *                                                         cuando el codigo de
	 *                                                         error obtenido no es
	 *                                                         el esperado segun la
	 *                                                         configuracion de
	 *                                                         Stored Procedure
	 */
	private CallSPResponse executeSP(String storedProcedureName, List<Object> values, RowMapper<?> rowMapper,
			JdbcTemplate jdbcTemplate)
			throws StoredProcedureConfigurationNotFoundException, StoredProcedureParametersNotMatchException,
			StoredProcedureParametersTypesMismatchException, UnexpectedResponseCodeException {
		log.debug("Iniciando ejecución de SP--- VERSION 2");

		CallSPResponse result = new CallSPResponse();
		SimpleJdbcCall call = null;
		CallSPBean callSPBean = null;

		if (!mapCallSPBean.containsKey(storedProcedureName)) {
			throw new StoredProcedureConfigurationNotFoundException(
					" VERSION 2 -  No se encontró la especificación para el SP  : " + storedProcedureName);
		}

		callSPBean = mapCallSPBean.get(storedProcedureName);

		int parametersIn = callSPBean.getParameters().size();

		for (CallSPParameterBean parameter : callSPBean.getParameters()) {
			if (parameter.getOutParameter() != null && parameter.getOutParameter()) {
				parametersIn--;
			}
		}

		if (values == null) {
			values = new ArrayList<>();
		}

		if (values.size() != parametersIn) {
			throw new StoredProcedureParametersNotMatchException(
					"El número de valores suministrados no corresponden a la definición del SP: "
							+ callSPBean.getStoredProcedureName() + " -> Parameters=" + parametersIn + ", Values="
							+ values.size());
		}

		call = new SimpleJdbcCall(jdbcTemplate);
		call.setProcedureName(callSPBean.getStoredProcedureName());
		call.setFunction(callSPBean.getFunction());

		MapSqlParameterSource parameterSource = new MapSqlParameterSource();

		int index = 0;

		if (callSPBean.getFunction() && callSPBean.getCursor()) {
			SqlOutParameter sqlOutParameter = new SqlOutParameter("SYS_REFCURSOR", OracleTypes.CURSOR);
			call.addDeclaredParameter(sqlOutParameter);
			if (rowMapper == null) {

			} else {
				call.returningResultSet("SYS_REFCURSOR", rowMapper);
			}
		}

		for (CallSPParameterBean parameter : callSPBean.getParameters()) {
			Integer parameterType = null;

			if (!mapSqlTypes.containsKey(parameter.getTypeParameter())) {
				throw new StoredProcedureParametersTypesMismatchException(
						"El tipo de dato especificado en la definición del Call para el SP no es válido:  "
								+ callSPBean.getStoredProcedureName() + " -> Parameter=" + parameter.getParameterName()
								+ ", Type=" + parameter.getTypeParameter() + ", Esperado=" + types);
			}

			parameterType = mapSqlTypes.get(parameter.getTypeParameter());

			if (parameter.getOutParameter() != null && parameter.getOutParameter()) {
				SqlOutParameter sqlOutParameter = new SqlOutParameter(parameter.getParameterName(), parameterType);
				call.addDeclaredParameter(sqlOutParameter);
			} else {
				SqlParameter sqlParameter = new SqlParameter(parameter.getParameterName(), parameterType);
				call.addDeclaredParameter(sqlParameter);

				parameterSource.addValue(parameter.getParameterName(), values.get(index));
				index++;
			}
		}

		getConnections("Before execute SP", (DataSource) jdbcTemplate.getDataSource());
		result.setResult(call.execute(parameterSource));
		getConnections("After  execute SP", (DataSource) jdbcTemplate.getDataSource());

		Object errorCode = null;

		if (callSPBean.getResult().getErrorCodeParameterName() != null) {
			errorCode = result.getResult().get(callSPBean.getResult().getErrorCodeParameterName());
		}

		if (errorCode != null) {
			if (errorCode.getClass().getName().equals("java.lang.Integer")) {
				result.setCode((Integer) errorCode);
			} else if (errorCode.getClass().getName().equals("java.lang.String")) {
				result.setCode(Integer.parseInt((String) errorCode));
			} else if (errorCode.getClass().getName().equals("java.math.BigDecimal")) {
				result.setCode(((BigDecimal) errorCode).intValueExact());
			}
		} else {
			if (callSPBean.getResult().getSuccessExecuteSPCode() != null) {
				result.setCode(callSPBean.getResult().getSuccessExecuteSPCode());
			}
		}

		String errorDescription = null;

		if (callSPBean.getResult().getErrorDescriptionParameterName() != null) {
			errorDescription = (String) result.getResult()
					.get(callSPBean.getResult().getErrorDescriptionParameterName());
		}

		if (errorDescription != null) {
			result.setDescription(errorDescription);
		} else {
			if (callSPBean.getResult().getSuccessExecuteSPDescription() != null) {
				result.setDescription(callSPBean.getResult().getSuccessExecuteSPDescription());
			}
		}
		if (result.getCode().compareTo(callSPBean.getResult().getSuccessExecuteSPCode()) != 0) {
			log.error("Código de error obtenido: [{}]; Código de error esperado: [{}]", result.getCode(),
					callSPBean.getResult().getSuccessExecuteSPCode());
			throw new UnexpectedResponseCodeException(result.getDescription());
		}
		log.debug("Resultado -> SP: " + callSPBean.getStoredProcedureName() + ", Code=" + result.getCode()
				+ ", Expected=" + callSPBean.getResult().getSuccessExecuteSPCode() + ", Description="
				+ result.getDescription());
		return result;
	}
}