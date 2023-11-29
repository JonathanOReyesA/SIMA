package mx.com.gentera.seguros.sima.scheduler.exceptions;

public class InvalidCronExpressionException extends Exception {
	private static final long serialVersionUID = 1L;

	public InvalidCronExpressionException(String message) {
		super(message);
	}
}
