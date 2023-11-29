package mx.com.gentera.seguros.sima.web.model;

public class CifrasFacturacion {

	public Integer tot_reg;
	public Integer type;
	public String type_description;
	public Integer tot_regn;
	public Integer typen;
	public String type_decription_n;
	public boolean succes;
	public String msg;

	/**
	 * @return the tot_reg
	 */
	public Integer getTot_reg() {
		return tot_reg;
	}

	/**
	 * @param tot_reg the tot_reg to set
	 */
	public void setTot_reg(Integer tot_reg) {
		this.tot_reg = tot_reg;
	}

	/**
	 * @return the type
	 */
	public Integer getType() {
		return type;
	}

	/**
	 * @param type the type to set
	 */
	public void setType(Integer type) {
		this.type = type;
	}

	/**
	 * @return the type_description
	 */
	public String getType_description() {
		return type_description;
	}

	/**
	 * @param type_description the type_description to set
	 */
	public void setType_description(String type_description) {
		this.type_description = type_description;
	}

	/**
	 * @return the tot_regn
	 */
	public Integer getTot_regn() {
		return tot_regn;
	}

	/**
	 * @param tot_regn the tot_regn to set
	 */
	public void setTot_regn(Integer tot_regn) {
		this.tot_regn = tot_regn;
	}

	/**
	 * @return the typen
	 */
	public Integer getTypen() {
		return typen;
	}

	/**
	 * @param typen the typen to set
	 */
	public void setTypen(Integer typen) {
		this.typen = typen;
	}

	/**
	 * @return the type_decription_n
	 */
	public String getType_decription_n() {
		return type_decription_n;
	}

	/**
	 * @param type_decription_n the type_decription_n to set
	 */
	public void setType_decription_n(String type_decription_n) {
		this.type_decription_n = type_decription_n;
	}

	/**
	 * @return the succes
	 */
	public boolean isSucces() {
		return succes;
	}

	/**
	 * @param succes the succes to set
	 */
	public void setSucces(boolean succes) {
		this.succes = succes;
	}

	/**
	 * @return the msg
	 */
	public String getMsg() {
		return msg;
	}

	/**
	 * @param msg the msg to set
	 */
	public void setMsg(String msg) {
		this.msg = msg;
	}

	@Override
	public String toString() {
		return "CifrasFacturacion [tot_reg=" + tot_reg + ", type=" + type + ", type_description=" + type_description
				+ ", tot_regn=" + tot_regn + ", typen=" + typen + ", type_decription_n=" + type_decription_n
				+ ", succes=" + succes + ", msg=" + msg + "]";
	}

}
