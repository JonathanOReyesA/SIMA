package mx.com.gentera.seguros.sima.scheduler.exceptions;

public class JobConfigurationNotExistsException extends Exception {
	private static final long serialVersionUID = 1L;

	public JobConfigurationNotExistsException(String message) {
		super(message);
	}
}
