package mx.com.gentera.seguros.common.persistence.beans;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * PROCESO: Persistence. OBJETIVO: Almacenar la configuracion de las ejecuciones
 * de Stored Procedures RELACION: [Ninguna]
 * 
 * @author Miguel Angel Carrasco Irineo
 * 
 */
@XmlRootElement(name = "callSP")
public class CallSPBean {

	/**
	 * Especifica el nombre del procedimiento almacenado que se ejecutara para esta
	 * configuracion
	 */
	private String storedProcedureName;
	/**
	 * Indica si el Stored Procedure es una funcion
	 */
	private Boolean function = false;
	/**
	 * Indica si el Stored Procedure devuelve un conjunto de resultados
	 */
	private Boolean cursor = false;
	/**
	 * Especifica los parametros de entrada y salida para el Stored Procedure a
	 * ejecutar
	 */
	private List<CallSPParameterBean> parameters = new ArrayList<>();
	/**
	 * Almacena el resultado de la ejecucion del Stored Procedure
	 */
	private CallSPResultBean result = new CallSPResultBean();

	/**
	 * @return Obtiene el nombre del Stored Procedure a ejecutar
	 */
	@XmlElement(name = "storedProcedureName")
	public String getStoredProcedureName() {
		return storedProcedureName;
	}

	/**
	 * @param storedProcedureName Establece el nombre del Stored Procedure a
	 *                            ejecutar
	 */
	public void setStoredProcedureName(String storedProcedureName) {
		this.storedProcedureName = storedProcedureName;
	}

	/**
	 * @return Obtiene la indicacion de que el Stored Procedure es una funcion
	 */
	@XmlElement(name = "function")
	public Boolean getFunction() {
		return function;
	}

	/**
	 * @param function Establece la indicacion de que el Stored Procedure es una
	 *                 funcion
	 */
	public void setFunction(Boolean function) {
		this.function = function;
	}

	/**
	 * @return Obtiene la indicacion de que el Stored Procedure devuelve un conjunto
	 *         de resultados
	 */
	@XmlElement(name = "cursor")
	public Boolean getCursor() {
		return cursor;
	}

	/**
	 * @param cursor Establece la indicacion de que el Stored Procedure devuelve un
	 *               conjunto de resultados
	 */
	public void setCursor(Boolean cursor) {
		this.cursor = cursor;
	}

	/**
	 * @return Obtiene la lista de parametros que deben ser suministrados al Stored
	 *         Procedure
	 */
	@XmlElement(name = "parameter")
	public List<CallSPParameterBean> getParameters() {
		return parameters;
	}

	/**
	 * @param parameters Establece los parametros que seran suministrados al Stored
	 *                   Procedure
	 */
	public void setParameters(List<CallSPParameterBean> parameters) {
		this.parameters = parameters;
	}

	/**
	 * @return Obtiene el conjunto de resultados tras la ejecucion del Stored
	 *         Procedure
	 */
	@XmlElement(name = "result")
	public CallSPResultBean getResult() {
		return result;
	}

	/**
	 * @param result Establece el conjunto de resultados tras la ejecucion del
	 *               Stored Procedure
	 */
	public void setResult(CallSPResultBean result) {
		this.result = result;
	}

	@Override
	public String toString() {
		String parameters = "";

		for (CallSPParameterBean parameter : this.parameters) {
			parameters = " [" + parameter.toString() + "] ";
		}

		return "CallSPBean [storedProcedureName=" + storedProcedureName + ", function=" + function + ", cursor="
				+ cursor + ", parameters=" + parameters + ", result=" + result.toString() + "]";
	}

}