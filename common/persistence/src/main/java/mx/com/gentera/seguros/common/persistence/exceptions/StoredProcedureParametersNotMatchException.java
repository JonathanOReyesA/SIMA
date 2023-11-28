package mx.com.gentera.seguros.common.persistence.exceptions;

/**
 * PROCESO: Persistence OBJETIVO: Proporcionar una definicion de excepcion para
 * la ejecucion de Stored Procedures cuando los parametros proporcionados no
 * coincidan con los solicitados por el Stored Procedure RELACION: []
 * 
 * @author Miguel Angel Carrasco Irineo
 */
public class StoredProcedureParametersNotMatchException extends Exception {
	private static final long serialVersionUID = 1L;

	/**
	 * @param message Genera una nueva instancia de la excepcion
	 */
	public StoredProcedureParametersNotMatchException(String message) {
		super(message);
	}

}
