package mx.com.gentera.seguros.sima.web.exceptions;

public class RetryScheduledJobException extends Exception {
	private static final long serialVersionUID = 1L;

	public RetryScheduledJobException(String message) {
		super(message);
	}
}
