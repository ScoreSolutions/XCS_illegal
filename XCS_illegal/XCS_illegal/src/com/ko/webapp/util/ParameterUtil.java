package com.ko.webapp.util;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import com.ko.util.DateUtil;
import com.ko.util.NumberUtil;
/**
 * framework by boonchai ( neng )
 * @author <a href="mailto:mr.boonchai@gmail.com">Mr.Boonchai</a>
 */
public class ParameterUtil {
	// String
	public static String getStringParam(String paramName,HttpServletRequest request){
		String value=request.getParameter(paramName);
		return (value!=null)?value:"";
	}
	public static String[] getStringParams(String paramName,HttpServletRequest request){
		String[] values=request.getParameterValues(paramName);
		return ( values != null )?values:null;
	}

	// Long
	public static Long getLongParam(String paramName,HttpServletRequest request){
		String value=request.getParameter(paramName);
		if( value == null)
			return null;
		else{
			try{
				if( value.trim().equals("") )
					return new Long("0");// fix to null in future
				else
					return NumberUtil.getLongFromString(value);
			}catch(Exception e){
				return null;
			}
		}
	}
	public static Long[] getLongParams(String paramName,HttpServletRequest request){
		String[] strValues=request.getParameterValues(paramName);
		List<Long> values = new ArrayList<Long>();
		for( int i=0;i<strValues.length;i++ ){
			try{
				values.add(NumberUtil.getLongFromString(strValues[i]));
			}catch(Exception e){
				e.printStackTrace();
				values.add(null);
			}
		}
		return values.toArray(new Long[0]);
	}

	//  Integer "" -> 0  , 0 -> 0
	public static Integer getIntegerParam(String paramName,HttpServletRequest request){
		String value=request.getParameter(paramName);
		if( value == null)
			return null;
		else{
			try{
				if( value.equals("") )
					return new Integer("0");// fix to null in future
				else
					return NumberUtil.getIntegerFromString(value);
			}catch(Exception e){
				return null;
			}
		}
	}
	public static Integer[] getIntegerParams(String paramName,HttpServletRequest request){
		String[] strValues=request.getParameterValues(paramName);
		List<Integer> values = new ArrayList<Integer>();
		for( int i=0;i<strValues.length;i++ ){
			try{
				values.add(NumberUtil.getIntegerFromString(strValues[i]));
			}catch(Exception e){
				e.printStackTrace();
				values.add(null);
			}
		}
		return values.toArray(new Integer[0]);
	}

	// Double
	public static Double getDoubleParam(String paramName,HttpServletRequest request){
		String value=request.getParameter(paramName);
		if( value == null)
			return null;
		else{
			try{
				if( value.trim().equals("") )
					return new Double("0");// fix to null in future
				else
					return NumberUtil.getDoubleFromString(value);
			}catch (Exception e) {
				return null;
			}
		}
	}
	public static Double[] getDoubleParams(String paramName,HttpServletRequest request){
		String[] strValues=request.getParameterValues(paramName);
		List<Double> values = new ArrayList<Double>();
		for( int i=0;i<strValues.length;i++ ){
			try{
				values.add(NumberUtil.getDoubleFromString(strValues[i]));
			}catch(Exception e){
				e.printStackTrace();
				values.add(null);
			}
		}
		return values.toArray(new Double[0]);
	}

	// Date
	public static Date getDateParam(String paramName,HttpServletRequest request){
		String value=request.getParameter(paramName);
		if( value == null || value.trim().equals("") )
			return null;
		else
			return DateUtil.getDateFromString(value.trim());
	}
	public static Date[] getDateParams(String paramName,HttpServletRequest request){
		String[] strValues=request.getParameterValues(paramName);
		List<Date> values = new ArrayList<Date>();
		for( int i=0;i<strValues.length;i++ ){
			try{
				values.add(DateUtil.getDateFromString(strValues[i].trim()));
			}catch(Exception e){
				e.printStackTrace();
				values.add(null);
			}
		}
		return values.toArray(new Date[0]);
	}

	//boolean
	public static Boolean getBooleanParam(String paramName,HttpServletRequest request){
		String value=request.getParameter(paramName);
		if( value == null )
			return null;
		else{
			try {
				if( value.trim().equals("") )
					return new Boolean(false);
				else
					return Boolean.valueOf(value.trim());
			} catch (Exception e) {
				return null;
			}
		}
	}
	public static Boolean[] getBooleanParams(String paramName,HttpServletRequest request){
		String[] strValues=request.getParameterValues(paramName);
		List<Boolean> values = new ArrayList<Boolean>();
		for( int i=0;i<strValues.length;i++ ){
			try{
				values.add(new Boolean(strValues[i].trim()));
			}catch(Exception e){
				e.printStackTrace();
				values.add(null);
			}
		}
		return values.toArray(new Boolean[0]);
	}

	// char
	public static Character getCharacterParam(String paramName,HttpServletRequest request){
		String value=request.getParameter(paramName);
		if( value == null )
			return null;
		else{
			try {
				if( value.trim().length()!=1 && value.trim().equals("") )
					return null;
				else
					return value.trim().charAt(0);
			} catch (Exception e) {
				return null;
			}
		}
	}
	public static Character[] getCharacterParams(String paramName,HttpServletRequest request){
		String[] strValues=request.getParameterValues(paramName);
		List<Character> values = new ArrayList<Character>();
		for( int i=0;i<strValues.length;i++ ){
			try{
				values.add(strValues[i].trim().charAt(0));
			}catch(Exception e){
				e.printStackTrace();
				values.add(null);
			}
		}
		return values.toArray(new Character[0]);
	}
	public static String getMapValue(String key,Map map){
		String value=(String)map.get(key);
		return (value!=null)?value:"";
	}
}