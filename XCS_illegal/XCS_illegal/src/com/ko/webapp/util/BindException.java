/*
 * JCatalog Project
 */
package com.ko.webapp.util;

/**
 * framework by boonchai ( neng )
 * @author <a href="mailto:mr.boonchai@gmail.com">Mr.Boonchai</a>
 */
public class BindException extends Exception{
	/**
	 * Constructor with error message.
	 *
	 * @param msg the error message associated with the exception
	 */
	public BindException(String msg) {
		super(msg);
	}

	/**
	 * Constructor with error message and root cause.
	 *
	 * @param msg the error message associated with the exception
	 * @param cause the root cause of the exception
	 */
	public BindException(String msg, Throwable cause) {
		super(msg, cause);
	}
}
