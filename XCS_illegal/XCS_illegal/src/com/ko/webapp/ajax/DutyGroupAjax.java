package com.ko.webapp.ajax;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import com.ko.domain.DutyGroup;
import com.ko.domain.DutyTable;
import com.ko.domain.SizePackage;
import com.ko.domain.DutyUnit;

public class DutyGroupAjax extends BaseAjax{
	public List getDutyGroup(){
		List result = new ArrayList();
		try{
			DutyGroup dg = new DutyGroup(db);
			result = dg.findBySql("select group_id,group_id || '-' || group_name group_name from duty_group where group_status='N' order by group_id",null);
		}catch (Exception e) {
			e.printStackTrace();
			// TODO: handle exception
		}finally{
			closeDB();
		}
		return result;
	}
	public List getSizePackage(String group_id){
		List result = new ArrayList();
		try{
			SizePackage sizePackage = new SizePackage(db);
			//sizePackage.setDuty_code(duty_code);
			result = sizePackage.findBySql("select size_code,size_desc from size_package where group_id=? order by size_desc",group_id);
			//log.debug("aaaaaaaaaaaaaaaaaa");
		}catch (Exception e) {
			e.printStackTrace();
			// TODO: handle exception
		}finally{
			closeDB();
		}
		return result;
	}
	
	public List getDutyUnit(String group_id, String used_for){
		List result = new ArrayList();
		try{
			DutyUnit du = new DutyUnit(db);
			String sql = "select distinct u.unit_code, nvl(u.thname,u.enname) unit_name ";
			sql += " from duty_unit du";
			sql += " inner join unit u on u.unit_code=du.unit_code ";
			//sql += " inner join product_type pt on pt.duty_code=du.duty_code ";
			sql += " where du.group_id = '" + group_id + "' ";
			if(used_for.equals("QTY"))//หน่วยของจำนวนสินค้า
				sql += " and du.used_for in ('A','P') ";
			if(used_for.equals("SIZES"))//หน่วยของขนาดบรรจุ
				sql += " and du.used_for in ('A','S') ";
			if(used_for.equals("NETWEIGHT"))//หน่วยของปริมาณสุทธิ
				sql += " and du.used_for in ('A','S') ";
			
			sql += " and to_date(sysdate) between to_date(du.begin_date) and to_date(nvl(du.end_date,sysdate)) ";
			sql += " order by nvl(u.thname,u.enname)";
			//log.debug(sql);
			result = du.findBySql(sql);
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