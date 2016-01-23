package com.ko.webapp.ajax;

import org.apache.log4j.Logger;

import com.ko.Constants;
import com.ko.util.DB;

public class BaseAjax {
	protected DB db;
	public static Logger log = Logger.getLogger(Constants.LOG_NAME);
	public BaseAjax(){
		try {
			this.db = new DB();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public void rollBack(){
		try {
			db.rollbackTx();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public void commit(){
		try {
			db.commitTx();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public void closeDB(){
		try {
			db.closedb();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
