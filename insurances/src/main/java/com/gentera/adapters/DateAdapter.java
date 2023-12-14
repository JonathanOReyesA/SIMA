package com.gentera.adapters;

import java.util.Date;
import java.util.GregorianCalendar;
import javax.xml.datatype.DatatypeConfigurationException;
import javax.xml.datatype.DatatypeFactory;
import javax.xml.datatype.XMLGregorianCalendar;

public class DateAdapter {
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
  
  public static String marshal(Date v) {
    if (v == null)
      return null; 
    String result = null;
    try {
      GregorianCalendar cal = new GregorianCalendar();
      cal.setTime(v);
      result = DatatypeFactory.newInstance().newXMLGregorianCalendar(cal).toXMLFormat();
    } catch (DatatypeConfigurationException e) {
      return String.valueOf( new Date());
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
    return (new StringBuilder(String.valueOf(v))).toString();
  }
  
  public static Double unmarshalDou(String v) {
    try {
      return Double.valueOf(Double.parseDouble(v));
    } catch (Exception e) {
      return Double.valueOf(0.0D);
    } 
  }
  
  public static String marshalDou(Double v) {
    return String.valueOf(v);
  }
}
