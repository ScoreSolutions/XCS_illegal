package com.ko.webapp.ajax;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import com.ko.domain.DutyTable;
import com.ko.domain.SizePackage;
import com.ko.domain.DutyUnit;

public class DutyTableAjax extends BaseAjax{
	public List getDutyTable(){
		List result = new ArrayList();
		try{
			DutyTable dutyTable = new DutyTable(db);
			result = dutyTable.findBySql("select duty_code,duty_code || '-' || duty_name duty_name from duty_table order by duty_code",null);
		}catch (Exception e) {
			e.printStackTrace();
			// TODO: handle exception
		}finally{
			closeDB();
		}
		return result;
	}
	
	public List getDutyTable(String group_id){
		List result = new ArrayList();
		try{
			DutyTable dutyTable = new DutyTable(db);
			String sql="select dt.duty_code, dt.duty_code || '-' || dt.duty_name duty_name";
			sql += " from duty_table dt";
			sql += " where dt.group_id='" + group_id + "' ";
			sql += " and to_char(sysdate,'yyyymmdd') between to_char(nvl(dt.begin_date,sysdate),'yyyymmdd') and to_char(nvl(dt.end_date,sysdate),'yyyymmdd') ";
			sql += " order by dt.duty_code";
			
			result = dutyTable.findBySql(sql,null);
		}catch (Exception e) {
			e.printStackTrace();
			// TODO: handle exception
		}finally{
			closeDB();
		}
		return result;
	}

	

	
	public String getGroupID(String duty_code) throws Exception{
		String ret = "";
		try{
			String sql = "select pt.group_id "; 
				sql += " from duty_table dt ";
				sql += " inner join product_type pt on pt.duty_code=dt.duty_code ";
				sql += " where dt.duty_code='" + duty_code + "' and rownum=1";
			DutyTable dt = new DutyTable(db);
			List<Map<String,Object>> gList = dt.findBySql(sql);
			if(gList.size()>0)
				ret = gList.get(0).get("group_id").toString();
			else
				ret = duty_code;
				
		}catch(Exception e){
			
		}finally{
			closeDB();
		}
		return ret;
		
	}
	
}