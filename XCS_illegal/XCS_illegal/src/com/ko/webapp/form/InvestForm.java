package com.ko.webapp.form;

import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import com.ko.webapp.util.FormValidator;

public class InvestForm extends BaseForm{
	private String id;
	private String name;
	private Integer[] ids;
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	@Override
	public FormValidator validate(){
		FormValidator validator = new FormValidator();
		return validator;
	}
	public static void main(String[] args) {
		InvestForm investForm = new InvestForm();
		investForm.setId("ok");
		Map<String, String> m= new HashMap<String,String>();
		m.put("ok","neng");
		System.out.println(m);
		System.out.println(investForm);
	}
}