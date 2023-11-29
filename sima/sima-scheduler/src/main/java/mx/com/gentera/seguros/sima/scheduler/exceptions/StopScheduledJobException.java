package mx.com.gentera.seguros.sima.scheduler.exceptions;

public class StopScheduledJobException extends Exception {
	private static final long serialVersionUID = 1L;

	public StopScheduledJobException(String message) {
		super(message);
	}
}
