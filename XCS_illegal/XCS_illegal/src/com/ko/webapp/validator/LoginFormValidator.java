package com.ko.webapp.validator;


import java.util.Map;

import com.ko.webapp.validator.AbstractValidator;


public class LoginFormValidator implements AbstractValidator{

	/* (non-Javadoc)
	 * @see com.thaijdev.webapp.validator.AbstractValidator#validate(java.util.Map, com.thaijdev.webapp.form.BaseForm)
	 */
	public void validate(Map fieldError, Object form) {
		// TODO Auto-generated method stub

	}

	/* (non-Javadoc)
	 * @see com.thaijdev.webapp.validator.AbstractValidator#validate(com.thaijdev.webapp.util.GenericForm, com.thaijdev.webapp.form.BaseForm)
	 */
	/*User user = (User) command;
		// username
		if (user.getUsername().equals("")) {
			errors.rejectValue("username", "invalid.username",
					"UserName is a required field");
		}
		// password
		if (user.getPassword().equals("")) {
			new Errors().rejectValue("password", "invalid.password",
					"Password is a required field");
		}*/

}
