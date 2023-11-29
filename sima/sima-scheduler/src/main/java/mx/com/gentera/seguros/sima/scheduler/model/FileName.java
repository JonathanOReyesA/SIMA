package mx.com.gentera.seguros.sima.scheduler.model;

import java.text.SimpleDateFormat;
import java.util.regex.Pattern;

public class FileName {

	private String nombre;
	private String num;
	private String fecha;
	private String horas;
	private String extension;
	private String prefijo;
	private String format = "yyyyMMdd";

	public FileName(String[] item, String prefijo) {
		this.nombre = item[0];
		this.num = item[1];
		this.fecha = item[2];
		String[] delimitar = item[3].split("\\.");
		this.horas = delimitar[0];
		this.extension = delimitar[1];
		this.prefijo = prefijo;
	}

	public boolean validaFormat() {
		return (validaName() && validExtension() && validaFecha() && validaHoras() && validExtension() && dateValid()
				&& dateHoraValid());
	}

	private boolean validaName() {
		return this.nombre.equals(this.prefijo);
	}

	private boolean validaHoras() {
		String regexp = "\\d{2}\\d{2}\\d{2}";
		return Pattern.matches(regexp, this.horas);
	}

	private boolean validaFecha() {
		String regexp = "\\d{4}\\d{2}\\d{2}";
		return Pattern.matches(regexp, this.fecha);
	}

	private boolean validExtension() {
		return (this.extension.equals("txt") || this.extension.equals("TXT"));
	}

	private boolean dateValid() {
		SimpleDateFormat formatoDelTexto = new SimpleDateFormat(this.format);
		try {
			formatoDelTexto.setLenient(false);
			formatoDelTexto.parse(this.fecha);
			return true;
		} catch (Exception ex) {
			return false;
		}
	}

	private boolean dateHoraValid() {
		return (Integer.parseInt(this.horas.substring(0, 2)) <= 24 && Integer.parseInt(this.horas.substring(2, 4)) <= 60
				&& Integer.parseInt(this.horas.substring(4, 6)) <= 60);
	}

	public String getNombre() {
		return this.nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getFecha() {
		return this.fecha;
	}

	public void setFecha(String fecha) {
		this.fecha = fecha;
	}

	public String getHoras() {
		return this.horas;
	}

	public void setHoras(String horas) {
		this.horas = horas;
	}

	public String getExtension() {
		return this.extension;
	}

	public void setExtension(String extension) {
		this.extension = extension;
	}

	public String getNum() {
		return num;
	}

	public void setNum(String num) {
		this.num = num;
	}

	public String getPrefijo() {
		return prefijo;
	}

	public void setPrefijo(String prefijo) {
		this.prefijo = prefijo;
	}


	@Override
	public String toString() {
		return "FileName [nombre=" + nombre + ", num=" + num + ", fecha=" + fecha + ", horas=" + horas + ", extension="
				+ extension + ", prefijo=" + prefijo + ", format=" + format + "]";
	}

}
