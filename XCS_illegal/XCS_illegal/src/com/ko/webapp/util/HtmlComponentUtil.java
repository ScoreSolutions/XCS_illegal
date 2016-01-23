package com.ko.webapp.util;

import java.util.Arrays;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.ko.util.ArrayUtil;
import com.ko.util.DateUtil;
import com.ko.util.StringUtil;

public class HtmlComponentUtil {
	// object mean ->  String or String[]
	private static Object getValue(String element_name,Object value){
		Map<String,Object> keyValue = new HashMap<String, Object>();
		// must use httpRequest
		//HashMap<String,Object> keyValue = (Map<String,Object>)request.getAttribute(Constants.FORM_DATA);
		if( keyValue!=null && keyValue.containsKey(element_name) ){// 
			return keyValue.get(element_name);
		}else
			return value;
	}
	// input_text
	public static String text(String element_name,String value,String option) {
		Object obj = getValue(element_name,value);
		String html = "<input type='text' id='"+element_name+"' name='"+element_name+"' value='"+value+"' "+option+"/>";
		return html;
	}
	// input hidden
	public static String hidden(String element_name,String value,String option) {
		Object obj = getValue(element_name,value);
		String html = "<input type='hidden' id='"+element_name+"' name='"+element_name+"' value='"+value+"' "+option+"/>";
		return html;
	}
	// input password
	public static String password(String element_name,String value,String option) {
		Object obj = getValue(element_name,value);
		String html = "<input type='password' id='"+element_name+"' name='"+element_name+"' value='"+value+"' "+option+"/>";
		return html;
	}
	// input calendar
	public static String calendar(String element_name,Date value,String option) {
		Object obj = getValue(element_name,value);
		String html = "<input type='text' id='"+element_name+"' name='"+element_name+"' value='"+DateUtil.getStringFromDate(value,"dd/MM/yyyy")+"' size='10' maxlength='10' readOnly "+option+"/>" +
		"<a href=\"javascript:NewCssCal('"+element_name+"','ddmmyyyy')\"><img src='images/btn_calendar.png' alt='' width='19' height='19' align='middle' style='border-style: none'></a>";
		return html;
	}
	// file upload
	public static String file(String element_name,String option) {
		String html = "<input type='file' id='"+element_name+"' name='"+element_name+"' value='' "+option+"/>";
		return html;
	}
	// text area
	public static String textarea(String element_name,String value,String option) {
		Object obj = getValue(element_name,value);
		String html = "<textarea id='"+element_name+"' name='"+element_name+"' "+option+">"+value+"</textarea>";
		return html;
	}
	// select box
	public static String select(String element_name,List selects, String value , String option){
		Object obj = getValue(element_name,value);
		String html_header = "<select name='"+element_name+"' "+option+">\n";
		String html_body ="";
		boolean match = false;
		String checked ="";
		String element_value = "";
		String option_value = "";
		String lable_value = "";
		Map<String,String> map =null;
		for (int i = 0;selects!=null && i < selects.size() ; i++) {
			map = (Map)selects.get(i);
			element_value = map.get("value");
			option_value = StringUtil.getValueAsString(map.get("opt"));
			lable_value = StringUtil.getValueAsString(map.get("label"));
			if( element_value.equalsIgnoreCase(value) ){
				checked = " selected='selected' ";
				match=true;
			}else
				checked="";
			html_body+="<option value='"+element_value+"' "+option_value+" "+checked+">"+lable_value+"</option>\n";
		}
		if( !match ){// not found display pleas select at head
			html_header+="<option value='' selected='selected'>-ยังไม่ระบุค่า-</option>";
		}
		return html_header+html_body+"</select>";
	}
	
	// input radio
	public static String radio(String element_name,String element_value,String value,String option ) {
		Object obj = getValue(element_name,value);
		String checked = (element_value.equalsIgnoreCase(value))?" checked='checked' ":"";
		String html = "<input type='radio' name='"+element_name+"' value='"+element_value+"' "+checked+" "+option+">";
		return html;
	}
	
	// check box
	public static String checkbox(String element_name,String element_value,Object[] values,String option) {
		Object obj = getValue(element_name,values);
		String checked = (values!=null && Arrays.asList(ArrayUtil.toStringArray(values)).contains(element_value))?" checked='checked' ":"";
		String html = "<input type='checkbox' name='"+element_name+"' value='"+element_value+"' "+checked+" "+option+">";
		return html;
	}
}
