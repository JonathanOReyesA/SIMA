package mx.com.gentera.seguros.sima.web.model;

public class SftpMsgResponse {

	private String absolutePath;
	private MsgResponse msgResponse;

	/**
	 * @return the absolutePath
	 */
	public String getAbsolutePath() {
		return absolutePath;
	}

	/**
	 * @param absolutePath the absolutePath to set
	 */
	public void setAbsolutePath(String absolutePath) {
		this.absolutePath = absolutePath;
	}

	/**
	 * @return the msgResponse
	 */
	public MsgResponse getMsgResponse() {
		return msgResponse;
	}

	/**
	 * @param msgResponse the msgResponse to set
	 */
	public void setMsgResponse(MsgResponse msgResponse) {
		this.msgResponse = msgResponse;
	}

	@Override
	public String toString() {
		return "SftpMsgResponse [absolutePath=" + absolutePath + ", msgResponse=" + msgResponse + "]";
	}

}
