package mx.com.gentera.seguros.common.persistence.model;

import java.util.HashMap;
import java.util.Map;

/**
 * PROCESO: Persistence OBJETIVO: Proporcionar el modelo canonico para el
 * resultado de ejecuciones de Stored Procedures RELACION: [Ninguna]
 * 
 * @author Miguel Angel Carrasco Irineo
 */
public class CallSPResponse {
	/**
	 * Almacena el cursor obtenido por la ejecucion del Stored Procedure
	 */
	private Map<String, Object> result = new HashMap<>();

	/**
	 * Almacena el codigo de error para la respuesta del Stored Procedure
	 */
	private Integer code;
	/**
	 * Almacena la descripcion de error para la respuesta del Stored Procedure
	 */
	private String description;

	/**
	 * @return Obtiene el cursor obtenido por la ejecucion del Stored Procedure
	 */
	public Map<String, Object> getResult() {
		return result;
	}

	/**
	 * @param result Establece el cursor obtenido por la ejecucion del Stored
	 *               Procedure
	 */
	public void setResult(Map<String, Object> result) {
		this.result = result;
	}

	/**
	 * @return Obtiene el codigo de error de la ejecucion del Stored Procedure
	 */
	public Integer getCode() {
		return code;
	}

	/**
	 * @param code Establece el codigo de error de la ejecucion del Stored Procedure
	 */
	public void setCode(Integer code) {
		this.code = code;
	}

	/**
	 * @return Obtiene la descripcion de error de la ejecucion del Stored Procedure
	 */
	public String getDescription() {
		return description;
	}

	/**
	 * @param description Establece la descripcion de error de la ejecucion del
	 *                    Stored Procedure
	 */
	public void setDescription(String description) {
		this.description = description;
	}

}
