package service;

import com.util.DB;
import com.Constants;
import org.apache.log4j.Logger;


public class BaseService {
	public static Logger log = Logger.getLogger(Constants.LOG_NAME);
	protected DB db;

}
