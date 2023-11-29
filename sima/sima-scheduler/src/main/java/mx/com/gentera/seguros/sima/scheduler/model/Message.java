package mx.com.gentera.seguros.sima.scheduler.model;

public class Message {

	private String from;
	private String text;

	/**
	 * @return the from
	 */
	public String getFrom() {
		return from;
	}

	/**
	 * @param from the from to set
	 */
	public void setFrom(String from) {
		this.from = from;
	}

	/**
	 * @return the text
	 */
	public String getText() {
		return text;
	}

	/**
	 * @param text the text to set
	 */
	public void setText(String text) {
		this.text = text;
	}

	@Override
	public String toString() {
		return "Message [from=" + from + ", text=" + text + "]";
	}
}
