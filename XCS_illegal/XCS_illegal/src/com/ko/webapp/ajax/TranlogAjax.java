package com.ko.webapp.ajax;

import java.util.Date;

import com.ko.Constants;
import com.ko.domain.TranLog;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import com.ko.webapp.bean.UserSession;

public class TranlogAjax extends BaseAjax{
	public void writeTranLog(String user_id, String ip_address,String tran_desc,String browser,String session_id){
		try{
			TranLog tranLog = new TranLog(db);
			tranLog.setBrowser(browser);
			tranLog.setIp_address(ip_address);
			tranLog.setTran_desc(tran_desc);
			tranLog.setTran_date(new Date());
			tranLog.setUserid(user_id);
			tranLog.setSessionid(session_id);
			tranLog.create();
		}catch (Exception e) {
			e.printStackTrace();
			// TODO: handle exception
		}finally{
			closeDB();
		}
	}
	
	public void writeTranLog(String user_id, String ip_address,String tran_desc,String browser,String session_id, Long logis_his_id){
		try{
			TranLog tranLog = new TranLog(db);
			tranLog.setBrowser(browser);
			tranLog.setIp_address(ip_address);
			tranLog.setTran_desc(tran_desc);
			tranLog.setTran_date(new Date());
			tranLog.setUserid(user_id);
			tranLog.setSessionid(session_id);
			tranLog.setLoging_his_id(logis_his_id);
			tranLog.create();
		}catch (Exception e) {
			e.printStackTrace();
			// TODO: handle exception
		}finally{
			closeDB();
		}
	}
}
