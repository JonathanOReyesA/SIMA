package com.gentera.adapters;

import java.util.Date;
import java.util.GregorianCalendar;
import javax.xml.datatype.DatatypeConfigurationException;
import javax.xml.datatype.DatatypeFactory;
import javax.xml.datatype.XMLGregorianCalendar;

public class DateAdapter {

	/**
	 * @param v Establece el valor de la fecha a convertir de tipo string
	 * @return Un objeto fecha a partir de la cadena proporcionada
	 */
	public static Date unmarshal(String v) {
		try {
			XMLGregorianCalendar xgc = null;
			xgc = DatatypeFactory.newInstance().newXMLGregorianCalendar(v);
			GregorianCalendar cal = xgc.toGregorianCalendar();
			return cal.getTime();
		} catch (Exception e) {
			return new Date();
		}
	}

	/**
	 * @param v Establece el valor de la fecha a convertir de tipo date
	 * @return Una cadena de caracteres que representa la fecha proporcionada
	 */
	public static String marshal(Date v) {
		if (v == null) {
			return null;
		}
		String result = null;
		try {
			GregorianCalendar cal = new GregorianCalendar();
			cal.setTime(v);
			result = DatatypeFactory.newInstance().newXMLGregorianCalendar(cal).toXMLFormat();
		} catch (DatatypeConfigurationException e) {
			return new Date() + "";
		}

		return result;
	}

	public static int unmarshalInt(String v) {
		try {
			return Integer.parseInt(v);
		} catch (Exception e) {
			return 0;
		}

	}

	public static String marshalInt(int v) {
		return v + "";

	}

	public static Double unmarshalDou(String v) {
		try {
			return Double.parseDouble(v);
		} catch (Exception e) {
			return (double) 0;
		}

	}

	public static String marshalDou(Double v) {
		return v + "";

	}

}