package com.ko.illegalwebservice.service;

import com.ko.util.DB;
import com.ko.Constants;
import com.ko.domain.TranLog;
import com.ko.domain.base.BaseDomain;
import org.apache.log4j.Logger;
import java.sql.Blob;
import java.util.ArrayList;
import java.util.Date;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.Iterator;


public abstract class BaseService {
	public static Logger log = Logger.getLogger(Constants.LOG_NAME);
	protected DB db;

}
