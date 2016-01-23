package com.ko.webapp.servlet;

import java.io.IOException;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.beanutils.MethodUtils;
import org.apache.log4j.Logger;

import com.ko.Constants;
import com.ko.domain.ErrorLog;
import com.ko.util.DB;
import com.ko.util.ReflectionUtil;
import com.ko.util.StringUtil;
import com.ko.webapp.util.RequestUtil;
/**
 * framework by boonchai ( neng )
 * @author <a href="mailto:mr.boonchai@gmail.com">Mr.Boonchai</a>
 */
public class MyActionServlet extends HttpServlet {
	private static Logger log = Logger.getLogger(Constants.LOG_NAME);
	private String[] methodStartWithRequiredTx = {"update","create","delete","cop","del","up","remove","save","add","ajax"};
	private boolean isRequiredTx(String cmd){
		for (int i = 0; i < methodStartWithRequiredTx.length; i++) {
			if( cmd.toLowerCase().startsWith(methodStartWithRequiredTx[i]) ){
				return true;
			}
		}
		return false;
	}
	private String packageName = "";
	public void init() throws ServletException { 
		packageName = getServletConfig().getInitParameter("packageName");
	}
	protected void doGet(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		execute(request, response);
	}

	protected void doPost(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		execute(request, response);
	}

	public void execute(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException{
		DB db = null;
		try {
			String action = request.getParameter("action");
			if( action==null || action=="" )
				action = "Home";
			String actionClass = "com.ko.webapp."+packageName+"."+action+"Action";

			//# 1 new actionClass instance
			Object obj = null;
			/*if( request.getSession().getAttribute(Constants.FORM_OBJECT)!=null ){
				obj = request.getSession().getAttribute(Constants.FORM_OBJECT);
				request.setAttribute(Constants.FORM_OBJECT,obj);
				request.getSession().removeAttribute(Constants.FORM_OBJECT);
			}else*/
				obj = ReflectionUtil.getClassInstance(actionClass);
			if( obj != null ){
				// new db
				db = new DB();

				// call setHttpServlet
				MethodUtils.invokeMethod(obj, "setHttpServlet", new Object[]{request,response,db});

				// method is called
				String cmd = request.getParameter("cmd");
				if( cmd == null || cmd == "" )
					cmd="_default";
				
				boolean requiredTx = isRequiredTx(cmd);
				// begin tx
				if( requiredTx )
					db.beginTx();
				// #2 call method
				MethodUtils.invokeMethod(obj, cmd, new Object[]{request,response});
				log.debug("Call Action: --->"+actionClass+", Method: --->"+cmd);
				// commit tx;
				if( requiredTx )
					db.commitTx();
			}else{
				// not found action class
				throw new ClassNotFoundException("Class Not Found");
			}
		} catch (Exception e) {
			e.printStackTrace();
			// work  -> requirment want to get RootCause of error maybe in domain , db
			//e.getCause().printStackTrace();
			// rollback tx
			try {
				DB db2 = new DB();
				ErrorLog errorLog = new ErrorLog(db2);
				errorLog.setError_date(new Date());
				errorLog.setBrowser(RequestUtil.getBrowser(request));
				errorLog.setUserid(RequestUtil.getUserSession(request).getUserId().toString());
				errorLog.setError_desc(StringUtil.getStringMaxLength(StringUtil.getStackTrace(e),200));
				errorLog.setIp_address(RequestUtil.getIpAddress(request));
				errorLog.setSessionid(request.getSession().getId());
				errorLog.create();
				db2.closedb();
				
				db.rollbackTx();
			} catch (Exception e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
	        throw new ServletException(StringUtil.getStackTrace(e));
		}finally{
			// close db;
			try{
				db.closedb();
			}catch (Exception e) {
				e.printStackTrace();
			}
		}
	}
}
