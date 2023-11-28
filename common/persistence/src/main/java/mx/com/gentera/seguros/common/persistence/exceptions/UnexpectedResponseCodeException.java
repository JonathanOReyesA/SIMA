package mx.com.gentera.seguros.common.persistence.exceptions;

/**
 * PROCESO: Persistence OBJETIVO: Proporcionar una definicion de excepcion para
 * la ejecucion de Stored Procedures cuando el codigo de error no sea el
 * esperado de acuerdo a la configuracion del Stored Procedure RELACION: []
 * 
 * @author Miguel Angel Carrasco Irineo
 */
public class UnexpectedResponseCodeException extends Exception {
	private static final long serialVersionUID = 1L;

	/**
	 * @param message Genera una nueva instancia de la excepcion
	 */
	public UnexpectedResponseCodeException(String message) {
		super(message);
	}

}
