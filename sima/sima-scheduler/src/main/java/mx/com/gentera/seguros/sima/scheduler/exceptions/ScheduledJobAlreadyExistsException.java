package mx.com.gentera.seguros.sima.scheduler.exceptions;

public class ScheduledJobAlreadyExistsException extends Exception {
	private static final long serialVersionUID = 1L;

	public ScheduledJobAlreadyExistsException(String message) {
		super(message);
	}
}
