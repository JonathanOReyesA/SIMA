package mx.com.gentera.seguros.sima.scheduler.exceptions;

public class JobImplementationNotExistsException extends Exception {
	private static final long serialVersionUID = 1L;

	public JobImplementationNotExistsException(String message) {
		super(message);
	}
}