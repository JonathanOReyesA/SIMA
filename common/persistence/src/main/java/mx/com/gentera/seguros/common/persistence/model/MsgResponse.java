package mx.com.gentera.seguros.common.persistence.model;

/**
 * PROCESO: Persistence OBJETIVO: Proporcionar el modelo canonico para la
 * respuesta de un servicio web RELACION: [Ninguna]
 * 
 * @author Miguel Angel Carrasco Irineo
 */
public class MsgResponse {
	/**
	 * Almacena el codigo de error para la respuesta de un servicio web
	 */
	private Integer code;
	/**
	 * Almacena la descripcion de error para la respuesta de un servicio web
	 */
	private String description;

	/**
	 * @return Obtiene el codigo de error de la respuesta
	 */
	public Integer getCode() {
		return code;
	}

	/**
	 * @param code Establece el codigo de error de la respuesta
	 */
	public void setCode(Integer code) {
		this.code = code;
	}

	/**
	 * @return Obtiene la descripcion de error de la respuesta
	 */
	public String getDescription() {
		return description;
	}

	/**
	 * @param description Establece la descripcion de error de la respuesta
	 */
	public void setDescription(String description) {
		this.description = description;
	}

}