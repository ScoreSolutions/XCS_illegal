package com.ko.webapp.util;

import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;
/**
 * framework by boonchai ( neng )
 * @author <a href="mailto:mr.boonchai@gmail.com">Mr.Boonchai</a>
 */
public class FormError implements Serializable{
	public String formMessage=new String();
	public Map errors=new HashMap();
	public FormError(){

	}
	/**
	 * @return the formMessage
	 */
	public String getFormMessage() {
		return formMessage;
	}
	/**
	 * @param formMessage the formMessage to set
	 */
	public void setFormMessage(String formMessage) {
		this.formMessage = formMessage;
	}
	/**
	 * @return the errors
	 */
	public Map getErrors() {
		return errors;
	}
	/**
	 * @param errors the errors to set
	 */
	public void setErrors(Map errors) {
		this.errors = errors;
	}
	public void addError(String field,String error){
		this.errors.put(field, error);
	}
	public void removeError(String field,String error){
		this.errors.remove(field);
	}
}
