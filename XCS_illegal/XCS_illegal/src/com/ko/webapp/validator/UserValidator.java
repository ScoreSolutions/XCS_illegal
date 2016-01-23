package com.ko.webapp.validator;

import java.util.Map;

import org.apache.commons.validator.GenericValidator;

import com.ko.domain.User;

public class UserValidator implements AbstractValidator{

	public void validate(Map fieldError, Object pojoForm){
		User user = (User)pojoForm;
		/*if( GenericValidator.isBlankOrNull(user.getUser_email()) )
			fieldError.put("user_email","Email is a required field");*/
		if( GenericValidator.isBlankOrNull(user.getUser_login()) )
			fieldError.put("user_login","Login is a required field");
		if( GenericValidator.isBlankOrNull(user.getUser_pass()) )
			fieldError.put("user_pass","Password is a required field");
	}

}
