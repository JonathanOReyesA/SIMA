package mx.com.gentera.seguros.common.persistence.beans;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * PROCESO: Persistence OBJETIVO: Almacenar el resultados de la ejecucion del
 * Stored Procedure RELACION: [Ninguna]
 * 
 * @author Miguel Angel Carrasco Irineo
 */
@XmlRootElement(name = "result")
public class CallSPResultBean {

	/**
	 * Nombre del parametro que contiene el codigo del error de retorno
	 */
	private String errorCodeParameterName;
	/**
	 * Nombre del parametro que contiene la descripcion del error de retorno
	 */
	private String errorDescriptionParameterName;
	/**
	 * Valor esperado del codigo de error al ejecutar el Stored Procedure
	 */
	private Integer successExecuteSPCode = 0;
	/**
	 * Valor por definicion de la descripcion al ejecutar el Stored Procedure
	 */
	private String successExecuteSPDescription = "EXITO";
	/**
	 * Valor por definicion del codigo de error al ejecutar el Stored Procedure
	 */
	private Integer errorExecuteSPCode;
	/**
	 * Valor por definicion de la descripcion de error al ejecutar el Stored
	 * Procedure
	 */
	private String errorExecuteSPDescription;

	/**
	 * @return Obtiene el nombre del parametro de error
	 */
	@XmlElement
	public String getErrorCodeParameterName() {
		return errorCodeParameterName;
	}

	/**
	 * @param errorCodeParameterName Establece el nombre del parametro de error
	 */
	public void setErrorCodeParameterName(String errorCodeParameterName) {
		this.errorCodeParameterName = errorCodeParameterName;
	}

	/**
	 * @return Obtiene el nombre del parametro de descripcion
	 */
	@XmlElement
	public String getErrorDescriptionParameterName() {
		return errorDescriptionParameterName;
	}

	/**
	 * @param errorDescriptionParameterName Establece el nombre del parametro de
	 *                                      descripcion
	 */
	public void setErrorDescriptionParameterName(String errorDescriptionParameterName) {
		this.errorDescriptionParameterName = errorDescriptionParameterName;
	}

	/**
	 * @return Obtiene el valor del codigo esperado de error
	 */
	@XmlElement
	public Integer getSuccessExecuteSPCode() {
		return successExecuteSPCode;
	}

	/**
	 * @param successExecuteSPCode Establece el valor del codigo esperado de error
	 */
	public void setSuccessExecuteSPCode(Integer successExecuteSPCode) {
		this.successExecuteSPCode = successExecuteSPCode;
	}

	/**
	 * @return Obtiene la descripcion del resultado de la ejecucion del Stored
	 *         Procedure
	 */
	@XmlElement
	public String getSuccessExecuteSPDescription() {
		return successExecuteSPDescription;
	}

	/**
	 * @param successExecuteSPDescription Establece la descripcion del resultado de
	 *                                    la ejecucion del Stored Procedure
	 */
	public void setSuccessExecuteSPDescription(String successExecuteSPDescription) {
		this.successExecuteSPDescription = successExecuteSPDescription;
	}

	/**
	 * @return Ontiene el codigo de error del resultado de la ejecucion del Stored
	 *         Procedure
	 */
	@XmlElement
	public Integer getErrorExecuteSPCode() {
		return errorExecuteSPCode;
	}

	/**
	 * @param errorExecuteSPCode Establece el codigo de error del resultado de la
	 *                           ejecucion del Stored Procedure
	 */
	public void setErrorExecuteSPCode(Integer errorExecuteSPCode) {
		this.errorExecuteSPCode = errorExecuteSPCode;
	}

	/**
	 * @return Obtiene la descripcion de error del resultado de la ejecucion del
	 *         Stored Procedure
	 */
	@XmlElement
	public String getErrorExecuteSPDescription() {
		return errorExecuteSPDescription;
	}

	/**
	 * @param errorExecuteSPDescription Establece la descripcion de error del
	 *                                  resultado de la ejecucion del Stored
	 *                                  Procedure
	 */
	public void setErrorExecuteSPDescription(String errorExecuteSPDescription) {
		this.errorExecuteSPDescription = errorExecuteSPDescription;
	}

	@Override
	public String toString() {
		return "CallSPResultBean [errorCodeParameterName=" + errorCodeParameterName + ", errorDescriptionParameterName="
				+ errorDescriptionParameterName + ", successExecuteSPCode=" + successExecuteSPCode
				+ ", successExecuteSPDescription=" + successExecuteSPDescription + ", errorExecuteSPCode="
				+ errorExecuteSPCode + ", errorExecuteSPDescription=" + errorExecuteSPDescription + "]";
	}

}
