package com.ko.webapp.ajax;

import com.ko.domain.ApplicationSearchWarrant;
import java.util.List;
import java.util.Map;

public class SearchWarrantAjax extends BaseAjax{
	public boolean chkDupReqNo(String vID, String request_no, String vOffcode){
		boolean ret = false;
		
		String sql = "";
		sql += "select id from application_search_warrant ";
		sql += " where request_no = '" + request_no + "' and offcode_request = '" + vOffcode + "'";
		sql += " and id <> '" + (!vID.equals("") ? vID : "0") + "'";
		try{
			ApplicationSearchWarrant asw = new ApplicationSearchWarrant(db);
			List<Map<String,Object>> wList = asw.findBySql(sql);
			if(wList.size()>0)
				ret = true;
		}catch(Exception e){
			ret = false;
		}

		return ret;
	}
	public boolean chkDupWarrantNo(String vID, String warrant_no, String vCourtID){
		boolean ret = false;
		
		String sql = "";
		sql += "select id from application_search_warrant ";
		sql += " where warrant_no = '" + warrant_no + "' and court_id = '" + vCourtID + "'";
		sql += " and id <> '" + (!vID.equals("") ? vID : "0") + "'";
		try{
			ApplicationSearchWarrant asw = new ApplicationSearchWarrant(db);
			List<Map<String,Object>> wList = asw.findBySql(sql);
			if(wList.size()>0)
				ret = true;
		}catch(Exception e){
			ret = false;
		}

		return ret;
	}
}
