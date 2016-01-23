package com.ko.webapp.validator;

import java.util.Map;


public interface AbstractValidator {
	public void validate(Map fieldError,Object pojoForm);
}