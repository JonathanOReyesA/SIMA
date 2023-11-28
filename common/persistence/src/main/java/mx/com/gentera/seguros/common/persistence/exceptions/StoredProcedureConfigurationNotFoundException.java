package mx.com.gentera.seguros.common.persistence.exceptions;

/**
 * PROCESO: Persistence OBJETIVO: Proporcionar una definicion de excepcion para
 * la ejecucion de Stored Procedures cuando no se detecte una configuracion para
 * el Stored Procedure proporcionado RELACION: []
 * 
 * @author Miguel Angel Carrasco Irineo
 */
public class StoredProcedureConfigurationNotFoundException extends Exception {
	private static final long serialVersionUID = 1L;

	/**
	 * @param message Genera una nueva instancia de la excepcion
	 */
	public StoredProcedureConfigurationNotFoundException(String message) {
		super(message);
	}

}
