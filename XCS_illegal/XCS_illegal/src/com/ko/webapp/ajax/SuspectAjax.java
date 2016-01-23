package com.ko.webapp.ajax;

import java.util.List;
import java.util.Map;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import com.ko.domain.SuspectInvestigate;


public class SuspectAjax extends BaseAjax {
	private final Log logger = LogFactory.getLog(getClass());
	
	public String chkRefSuspect(String SuspectNo){
		String ret = "";
		String msg = "รายการข้อมูลที่เลือกได้ถูกนำไปใช้แล้ว ไม่สามารถลบข้อมูลได้";
		try{
			SuspectInvestigate si = new SuspectInvestigate(db);
			String SQL = "select id from suspect_investigate where rownum = 1 and suspect_no = '" + SuspectNo + "'";
			List<Map<String,Object>> siList = si.findBySql(SQL);			
			if(siList != null && siList.size()>0){
				ret = msg;
			}
		}catch (Exception e){

		}finally{
			closeDB();
		}
		return ret;
	}
	
}
