package mx.com.gentera.seguros.common.persistence.exceptions;

/**
 * PROCESO: Persistence OBJETIVO: Proporcionar una definicion de excepcion para
 * la ejecucion de Stored Procedures cuando el tipo de dato para un parametro no
 * coincida con lo especificado en el Stored Procedure RELACION: []
 * 
 * @author Miguel Angel Carrasco Irineo
 */
public class StoredProcedureParametersTypesMismatchException extends Exception {
	private static final long serialVersionUID = 1L;

	/**
	 * @param message Genera una nueva instancia de la excepcion
	 */
	public StoredProcedureParametersTypesMismatchException(String message) {
		super(message);
	}

}
