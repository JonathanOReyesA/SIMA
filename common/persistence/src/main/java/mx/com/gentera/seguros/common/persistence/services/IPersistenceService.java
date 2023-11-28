package mx.com.gentera.seguros.common.persistence.services;


import java.util.List;

import org.springframework.jdbc.core.RowMapper;


import mx.com.gentera.seguros.common.persistence.exceptions.StoredProcedureConfigurationNotFoundException;
import mx.com.gentera.seguros.common.persistence.exceptions.StoredProcedureParametersNotMatchException;
import mx.com.gentera.seguros.common.persistence.exceptions.StoredProcedureParametersTypesMismatchException;
import mx.com.gentera.seguros.common.persistence.exceptions.UnexpectedResponseCodeException;
import mx.com.gentera.seguros.common.persistence.model.CallSPResponse;


/**
 * PROCESO: Persistence 
 * OBJETIVO: Proporcionar una interfaz de servicios de persistencia
 * RELACION: [CallSPResponse, StoredProcedureConfigurationNotFoundException, StoredProcedureParametersNotMatchException, StoredProcedureParametersTypesMismatchException, UnexpectedResponseCodeException]
 * @author Miguel Angel Carrasco Irineo
 */
public interface IPersistenceService {

	/**
	 * Realiza una llamada al metodo generico de ejecucion de Stored Procedure en la Base de Datos PSC
	 * @param storedProcedureName Establece en nombre del Stored Procedure a ejecutar
	 * @param values Establece la lista de parametros para la ejecucion del Stored Procedure
	 * @param rowMapper Establece el convertidor de datos a utilizar
	 * @return Obtiene la el resultado de la ejecucion del Stored Procedure en la base de datos PSC
	 * @throws StoredProcedureConfigurationNotFoundException Lanza una excepcion cuando no se detecta una configuracion para el Stored Procedure
	 * @throws StoredProcedureParametersNotMatchException Lanza una excepcion cuando la lista de parametros no coinciden con los esperados por el Stored Procedure
	 * @throws StoredProcedureParametersTypesMismatchException Lanza una excepcion cuando el tipo de datos del parametro no coincide con la definicion del Stored Procedure
	 * @throws UnexpectedResponseCodeException Lanza una excepcion cuando el codigo de error obtenido no es el esperado segun la configuracion de Stored Procedure
	 */
	public CallSPResponse executeSP_PSC(String storedProcedureName, List<Object> values, RowMapper<?> rowMapper)
			throws StoredProcedureConfigurationNotFoundException, StoredProcedureParametersNotMatchException,
			StoredProcedureParametersTypesMismatchException, UnexpectedResponseCodeException;
	
	/**
	 * Realiza una llamada al metodo generico de ejecucion de Stored Procedure en la Base de Datos PSC
	 * Ejecuta en la Base de Datos SIMA un Stored Procedure
	 * @param storedProcedureName Establece en nombre del Stored Procedure a ejecutar
	 * @param values Establece la lista de parametros para la ejecucion del Stored Procedure
	 * @param rowMapper Establece el convertidor de datos a utilizar
	 * @return Obtiene la el resultado de la ejecucion del Stored Procedure en la Base de Datos SIMA
	 * @throws StoredProcedureConfigurationNotFoundException Lanza una excepcion cuando no se detecta una configuracion para el Stored Procedure
	 * @throws StoredProcedureParametersNotMatchException Lanza una excepcion cuando la lista de parametros no coinciden con los esperados por el Stored Procedure
	 * @throws StoredProcedureParametersTypesMismatchException Lanza una excepcion cuando el tipo de datos del parametro no coincide con la definicion del Stored Procedure
	 * @throws UnexpectedResponseCodeException Lanza una excepcion cuando el codigo de error obtenido no es el esperado segun la configuracion de Stored Procedure
	 */
	public CallSPResponse executeSP_SIMA(String storedProcedureName, List<Object> values, RowMapper<?> rowMapper)
			throws StoredProcedureConfigurationNotFoundException, StoredProcedureParametersNotMatchException,
			StoredProcedureParametersTypesMismatchException, UnexpectedResponseCodeException;

	public CallSPResponse executeSP_PSC_Robo(String storedProcedureName, List<Object> values, RowMapper<?> rowMapper) throws StoredProcedureConfigurationNotFoundException;

	public CallSPResponse executeSP_SIMA_Robo(String storedProcedureName, List<Object> values, RowMapper<?> rowMapper)
			throws StoredProcedureConfigurationNotFoundException;



	public CallSPResponse executeFunction_SIMA(String storedProcedureName, List<Object> values, RowMapper<?> rowMapper)
			throws StoredProcedureConfigurationNotFoundException;

	public CallSPResponse executeFunctionWitOutParameter_SIMA(String storedProcedureName, List<Object> values,
			RowMapper<?> rowMapper) throws StoredProcedureConfigurationNotFoundException;

	public CallSPResponse executeFunctionWitOutParameter_SIMA_Parameters(String storedProcedureName, List<Object> values,
			RowMapper<?> rowMapper, int oracleType) throws StoredProcedureConfigurationNotFoundException, Exception;



	/*
	 * Obtiene el datasource para PSC
	 */


}