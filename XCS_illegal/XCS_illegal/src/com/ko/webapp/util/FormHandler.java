package com.ko.webapp.util;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.apache.commons.validator.util.ValidatorUtils;
import org.apache.log4j.Logger;

import com.ko.Constants;
import com.ko.util.StringUtil;
/**
 * framework by boonchai ( neng )
 * @author <a href="mailto:mr.boonchai@gmail.com">Mr.Boonchai</a>
 */
public class FormHandler {
	private static Logger log = Logger.getLogger(Constants.LOG_NAME);
	private HttpServletRequest request;
	private HttpSession session;
	private String formMessage;
	private Map<String,String> formErrors;
	private Map<String,Object> formData;
	
	public FormHandler(){
		this.formMessage = "";
		this.formErrors = new HashMap<String,String>();
		this.formData = new HashMap<String,Object>();
	}
	public FormHandler(HttpServletRequest request){
		log.debug("New Form Handler");
		this.request = request;
		session = request.getSession();
		if( session.getAttribute(Constants.FORM_MESSAGE)!=null ){
			this.formMessage = (String)session.getAttribute(Constants.FORM_MESSAGE);
			session.removeAttribute(Constants.FORM_MESSAGE);
			request.setAttribute(Constants.FORM_MESSAGE, this.getFormMessage());
		}
		if( session.getAttribute(Constants.FORM_DATA)!=null ){
			this.formData = (Map<String,Object>)session.getAttribute(Constants.FORM_DATA);
			session.removeAttribute(Constants.FORM_DATA);
			request.setAttribute(Constants.FORM_DATA, this.getFormData());
		}
		if( session.getAttribute(Constants.FORM_ERRORS)!=null ){
			this.formErrors = (Map<String,String>)session.getAttribute(Constants.FORM_ERRORS);
			session.removeAttribute(Constants.FORM_ERRORS);
			request.setAttribute(Constants.FORM_ERRORS, this.getFormErrors());
		}
	}
	public String getFormMessage() {
		if( this.formMessage == null )
			return "";
		else
			return this.formMessage;
	}
	public void setFormMessage(String formMessage) {
		session.setAttribute(Constants.FORM_MESSAGE, formMessage);
		this.formMessage = formMessage;
	}
	// errors
	public Map<String,String> getFormErrors() {
		return formErrors;
	}
	public void setFormErrors(Map<String,String> formErrors) {
		session.setAttribute(Constants.FORM_ERRORS, formErrors);
		this.formErrors = formErrors;
	}
	
	public String getError(String name){
		return (this.formErrors.get(name)!=null)?(String)this.formErrors.get(name):"";
	}
	
	public void setError(String name,String error){
		this.formErrors.put(name, error);
	}
	public boolean isValidateOk(){
		return formErrors.size()==0;
	}
	
	public Map<String, Object> getFormData() {
		return formData;
	}
	public void setFormData(Map<String, Object> formData) {
		session.setAttribute(Constants.FORM_DATA, formData);
		this.formData = formData;
	}
	
	/*  ******** Html component **********   */
	private String getValue(String element_name,String default_value){
		String value= "";
		try {
			//value = StringUtil.htmlEscape(ServletRequestUtils.getStringParameter(request, element_name));
			//value = ServletRequestUtils.getStringParameter(request, element_name);
			
			//value = ValidatorUtils.getValueAsString(this.formObject,element_name);
			
			// get from hashMap
			/*this.formData = getFormData();
			if( this.formData != null ){
				List<String> values = (List<String>)formData.get(element_name);
				if( values!=null && values.size() > 0){
					value = StringUtil.getValueAsString(values.get(0));
					if( value == null )
						value = default_value;
				}
				System.out.println("name:"+element_name+"------"+value);
			}*/
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			value = default_value;
		}
		return StringUtil.getValueAsString(value);
	}
	
	private List<String> getValues(String element_name,List<String> default_value){
		List<String> values= new ArrayList<String>();
		/*try {
			//value = StringUtil.htmlEscape(ServletRequestUtils.getStringParameter(request, element_name));
			value = ServletRequestUtils.getStringParameters(request, element_name);
		} catch (ServletRequestBindingException e) {
			// TODO Auto-generated catch block
			return StringUtil.getValueAsString(default_value);
		}*/
		return values;
	}
	/*
	// input_text
	public String input_text(String element_name,String default_value,String option) {
		log.debug("---- input_text ----");
		String value = getValue(element_name, default_value);
		String html = "<input type='text' id='"+element_name+"' name='"+element_name+"' value='"+value+"' "+StringUtil.getValueAsString(option)+"/>";
		return html;
	}
	// input hidden
	public String input_hidden(String element_name,String default_value,String option) {
		log.debug("---- input_hidden ----");
		String value = getValue(element_name, default_value);
		String html = "<input type='hidden' id='"+element_name+"' name='"+element_name+"' value='"+value+"' "+StringUtil.getValueAsString(option)+"/>";
		return html;
	}
	// input password
	public String input_password(String element_name,String default_value,String option) {
		log.debug("---- input_password ----");
		String value = getValue(element_name, default_value);
		String html = "<input type='password' id='"+element_name+"' name='"+element_name+"' value='"+value+"' "+StringUtil.getValueAsString(option)+"/>";
		return html;
	}
	// input calendar
	public String input_calendar(String element_name,String default_value,String option) {
		log.debug("---- input_calendar ----");
		String value = getValue(element_name, default_value);
		String html = "<input type='text' id='"+element_name+"' name='"+element_name+"' value='"+value+"' size='10' maxlength='10' "+StringUtil.getValueAsString(option)+">" +
		"<a href=\"javascript:NewCssCal('"+element_name+"','ddmmyyyy')\"><img src='images/btn_calendar.png' alt='' width='19' height='19' align='middle' style='border-style: none'></a>";
		return html;
	}
	// file upload
	public String input_file(String element_name,String default_value,String option) {
		log.debug("---- input_file ----");
		String html = "<input type='file' id='"+element_name+"' name='"+element_name+"' value='' "+StringUtil.getValueAsString(option)+"/>";
		return html;
	}
	// text area
	public String input_textarea(String element_name,String default_value,String option) {
		log.debug("---- input_textarea ----");
		String value = getValue(element_name, default_value);
		String html = "<textarea id='"+element_name+"' name='"+element_name+"' "+StringUtil.getValueAsString(option)+">"+value+"</textarea>";
		return html;
	}
	// select box
	public String input_select(String element_name,String key, String default_value , String option){
		log.debug("---- input_select ----");
		String value = getValue(element_name, default_value);
		String html_header = "<select name='"+element_name+"' "+StringUtil.getValueAsString(option)+">\n";
		String html_body ="";
		boolean match = false;
		String checked ="";
		String element_value = "";
		String option_value = "";
		String lable_value = "";
		List selects = (List)request.getAttribute(key);
		Map<String,String> map =null;
		for (int i = 0; i < selects.size() ; i++) {
			map = (Map)selects.get(i);
			element_value = map.get("value");
			option_value = map.get("opt");
			lable_value = map.get("label");
			if( element_value.equalsIgnoreCase(value) ){
				checked = " selected='selected' ";
				match=true;
			}else
				checked="";
			html_body+="<option value='"+element_value+"' "+checked+">"+lable_value+"</option>\n";
		}
		if( !match ){// not found display pleas select at head
			html_header+="<option value='' selected='selected'>-ยังไม่ระบุค่า-</option>";
		}
		return html_header+html_body+"</select>";
	}
	
	// input radio
	public String input_radio(String element_name,String element_value,String default_value,String option ) {
		log.debug("---- input_radio ----");
		String value = getValue(element_name, default_value);
		String checked = (element_value.equalsIgnoreCase(value))?" checked='checked' ":"";
		String html = "<input type='radio' name='"+element_name+"' value='"+element_value+"' "+checked+" "+StringUtil.getValueAsString(option)+">";
		return html;
	}
	
	// check box
	public String input_checkbox(String element_name,String element_value,List<String> default_value,String option) {
		log.debug("---- input_checkbox ----");
		List<String> values = getValues(element_name, default_value);// array
		String checked = (values.contains(element_value))?" checked='checked' ":"";
		String html = "<input type='checkbox' name='"+element_name+"' value='"+element_value+"' "+checked+" "+StringUtil.getValueAsString(option)+">";
		return html;
	}*/
	public String getHtmlError(String errorMessage){
		return "<font color='"+Constants.FORM_ERROR_COLOR+"'>"+StringUtil.getValueAsString(errorMessage)+"</font>";
	}
}
