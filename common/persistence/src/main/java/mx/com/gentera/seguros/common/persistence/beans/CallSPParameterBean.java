package mx.com.gentera.seguros.common.persistence.beans;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * PROCESO: Persistence OBJETIVO: Almacenar la configuracion para cada parametro
 * de Entrada / Salida RELACION: [Ninguna]
 * 
 * @author Miguel Angel Carrasco Irineo
 */
@XmlRootElement(name = "parameter")
public class CallSPParameterBean {

	/**
	 * Nombre del parametro como se identifica en el Stored Procedure
	 */
	private String parameterName;
	/**
	 * Indica su es un parametro de salida
	 */
	private Boolean outParameter;
	/**
	 * Tipo de dato del parametro como se espera en el Stored Procedure
	 */
	private String typeParameter;

	/**
	 * @return Obtiene el npmbre del parametro
	 */
	@XmlElement
	public String getParameterName() {
		return parameterName;
	}

	/**
	 * @param parameterName Establece el nombre del parametro
	 */
	public void setParameterName(String parameterName) {
		this.parameterName = parameterName;
	}

	/**
	 * @return Obtiene el indicador de que se trata de un parametro de salida
	 */
	@XmlElement
	public Boolean getOutParameter() {
		return outParameter;
	}

	/**
	 * @param outParameter Establece el indicador de que se trata de un parametro de
	 *                     salida
	 */
	public void setOutParameter(Boolean outParameter) {
		this.outParameter = outParameter;
	}

	/**
	 * @return Obtiene el tipo de dato del parametro
	 */
	@XmlElement
	public String getTypeParameter() {
		return typeParameter;
	}

	/**
	 * @param typeParameter Establece el tipo de dato del parametro
	 */
	public void setTypeParameter(String typeParameter) {
		this.typeParameter = typeParameter.toUpperCase();
	}

	@Override
	public String toString() {
		return "CallSPParameterBean [parameterName=" + parameterName + ", outParameter=" + outParameter
				+ ", typeParameter=" + typeParameter + "]";
	}

}