package mx.com.gentera.seguros.sima.scheduler.exceptions;

public class ScheduledJobNotExistsException extends Exception {
	private static final long serialVersionUID = 1L;

	public ScheduledJobNotExistsException(String message) {
		super(message);
	}
}
