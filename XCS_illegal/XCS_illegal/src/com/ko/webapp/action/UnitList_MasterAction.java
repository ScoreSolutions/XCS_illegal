package com.ko.webapp.action;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.ko.domain.ApplicationSearchWarrant;
import com.ko.domain.Court;
import com.ko.domain.DutyGroup;
import com.ko.domain.DutyUnit;
import com.ko.domain.Unit;
import com.ko.domain.Legislation;
import com.ko.webapp.util.ParameterUtil;
import com.ko.domain.Province;
import com.ko.util.RunningKey;

public class UnitList_MasterAction extends BaseAction {
	String menuID="261";
	@Override
	public void _default(HttpServletRequest request,
			HttpServletResponse response) throws Exception {
		// TODO Auto-generated method stub
		
		if(uData.chkUserMenu(menuID)==true){
			Unit unitlist = new Unit(db);
			List viewunit = unitlist.findBySql("select ut.id , ut.unit_code,ut.thname,ut.enname,ut.abbname  from unit ut order by ut.thname ");
					
			request.setAttribute("unitlist", viewunit);				
			forward("?page=/Master/UnitList.jsp");
		}else
		{
    		HttpSession session = request.getSession();
  		  	session.invalidate();
  		  	request.setAttribute("errMsg", "ผู้ใช้ไม่มีสิทธิ์ดำเนินการ");
  		  	forward("?page=/login.jsp", request, response);
    	}
	}
	public void create(HttpServletRequest request,HttpServletResponse response) throws Exception {
		Unit unit = new Unit(db);
		bindForm(unit);	

		String UnitCode = unit.GetNewUnitCode();
		if (!UnitCode.equals("")){
			unit.setUnit_code(UnitCode);
			unit.setData_source("XCS_illegal");
			unit.setCreate_by(create_by);
			unit.setCreate_on(create_on);
			unit = unit.create();
			
			redirect("process?action=UnitList_Master#"+unit.getId());
		}
	}
	public void delete(HttpServletRequest request,HttpServletResponse response)throws Exception {
		
		String[] ids =  request.getParameterValues("id");
		int del = ParameterUtil.getIntegerParam("iddel", request);

		del = del-1;

		if( ids!=null && ids.length>0 ){
			Unit unit = new Unit(db);
			List<Long> idList = new ArrayList<Long>();
			for( int i=0;i<ids.length;i++ )
				idList.add(new Long(ids[i]));
			int deleteRow = unit.deleteByPks(idList);
		}
		redirect("process?action=UnitList_Master#"+del+del);
	}
	public void update(HttpServletRequest request,HttpServletResponse response)throws Exception {
		
		Unit unit = new Unit(db);
		unit= unit.findByPk(ParameterUtil.getLongParam("id", request));
		//unit.setUnit_code(request.getParameter("unit_codeUpdate"));
		unit.setThname(request.getParameter("thnameUpdate"));
		unit.setEnname(request.getParameter("ennameUpdate"));
		unit.setAbbname(request.getParameter("abbnameUpdate"));
		
		unit.setData_source("XCS_illegal");
		unit.setUpdate_by(update_by);
		unit.setUpdate_on(update_on);
		unit = unit.update();
		redirect("process?action=UnitList_Master#"+ParameterUtil.getLongParam("id", request));
	}
	public void view(HttpServletRequest request, HttpServletResponse response)	throws Exception 
	{	
		
		Unit unitlist = new Unit(db);
		unitlist = unitlist.findByPk(Long.parseLong(request.getParameter("id")));		
		
		DutyGroup dutygrplist = new DutyGroup(db);
		List<Map<String,Object>> Listdutygroup = dutygrplist.findBySql("select dg.group_id,dg.group_name from duty_group dg where dg.group_status = 'N' order by dg.group_name ");		
			
		request.setAttribute("unitlist", unitlist);
		request.setAttribute("cmbDutyGroup", request.getParameter("cmbDutyGroup"));
		request.setAttribute("dutygrplist", Listdutygroup);		
		
		DutyUnit dutyunitlist = new DutyUnit(db);
		String sql = "select du.id,dg.group_name , to_char(du.begin_date,'fmdd/MM/yyyy', 'NLS_CALENDAR=''THAI BUDDHA'' NLS_DATE_LANGUAGE=THAI') As begin_date ,to_char(du.end_date,'fmdd/MM/yyyy', 'NLS_CALENDAR=''THAI BUDDHA'' NLS_DATE_LANGUAGE=THAI') As end_date from duty_unit du left join duty_group dg on du.group_id = dg.group_id where du.unit_code = " + unitlist.getUnit_code() ;
		List<Map<String,Object>> listdutyunit = dutyunitlist.findBySql(sql);		
		request.setAttribute("viewdutyunit", listdutyunit);
		
		forward("?page=/Master/DutyUnitList.jsp", request, response);	
	}
	

}
