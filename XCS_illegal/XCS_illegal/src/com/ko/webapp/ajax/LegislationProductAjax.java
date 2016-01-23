package com.ko.webapp.ajax;

import java.util.ArrayList;
import java.util.List;

import com.ko.domain.DutyGroup;
import com.ko.domain.DutyTable;
import com.ko.domain.Legislation;
import com.ko.domain.Indictment;

public class LegislationProductAjax extends BaseAjax{
	public List getIndictmentList(String vLegislationID, String vGuiltBase, String vPenaltyCaseLawID){
		List result = new ArrayList();
		try{
			Indictment idc = new Indictment(db);
			String sql = "select * ";
			sql += " from INDICTMENT ";
			sql += " where law_id in(select legislation_code ";
			sql += "				from legislation ";
			sql += "				where id = '" + vLegislationID + "')";
			if(!vGuiltBase.equals(""))
				sql += " and guilt_base like '%" + vGuiltBase + "%' ";
			
			if(!vPenaltyCaseLawID.equals(""))
				sql += " and penalty_case_law_id like '%" + vPenaltyCaseLawID + "%'";
			
			log.debug(sql);
			
			result = idc.findBySql(sql);
		}
		catch(Exception e){
			
		}
		finally{
			closeDB();
		}
		return result;
	}
	public List getLegislationList(){
		List result = new ArrayList();
		try{
			Legislation lg = new Legislation(db);
			String sql = "select * from LEGISLATION";
			result = lg.findBySql(sql);
		}catch(Exception e){
			
		}finally{
			closeDB();
		}
		return result;
	}
	public List getDutyGroup(String vLigislationID){
		List result = new ArrayList();
		
		try{
			DutyGroup dg = new DutyGroup(db);
			String sql = "";
			sql += "select dg.group_id, dg.group_name ";
			sql += " from duty_group dg  ";
			sql += " inner join product_legislation pl on pl.group_id=dg.group_id";
			sql += " where dg.group_status='N' and pl.legislation_id='" + vLigislationID + "'";
			sql += " order by  NLSSORT(UPPER(dg.group_name), 'NLS_SORT = THAI_DICTIONARY')";
	        result = dg.findBySql(sql, null);
		}catch (Exception e) {
			e.printStackTrace();
			// TODO: handle exception
		}finally{
			closeDB();
		}
		
		
		return result;
	}
	
	public List getDutyTable(String vLigislationCode){
		List result = new ArrayList();
		
		try{
			DutyTable dt = new DutyTable(db);
			String sql = "";
			sql += "select distinct dt.duty_code, dt.duty_name ";
			sql += " from duty_table dt  ";
			sql += " inner join product_type pt on pt.duty_code=dt.duty_code";
			sql += " inner join product_legislation pl on pl.group_id=pt.group_id";
			sql += " inner join legislation lg on lg.id = pl.legislation_id";
			sql += " where lg.legislation_code='" + vLigislationCode + "'";
			sql += " order by  NLSSORT(UPPER(dt.duty_name), 'NLS_SORT = THAI_DICTIONARY')";

	        result = dt.findBySql(sql, null);
		}catch (Exception e) {
			e.printStackTrace();
			// TODO: handle exception
		}finally{
			closeDB();
		}
		
		return result;
	}
}
