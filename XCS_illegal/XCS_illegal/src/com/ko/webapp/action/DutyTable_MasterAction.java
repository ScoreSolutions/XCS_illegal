package com.ko.webapp.action;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

//import org.apache.poi.ss.usermodel.DateUtil;

import com.ko.domain.Court;
import com.ko.domain.DutyTable;
import com.ko.domain.Legislation;
import com.ko.webapp.util.ParameterUtil;
import com.ko.domain.DutyGroup;
import com.ko.util.RunningKey;

import com.ko.util.DateUtil;

public class DutyTable_MasterAction extends BaseAction {
	String menuID="41";
	@Override
	public void _default(HttpServletRequest request,
			HttpServletResponse response) throws Exception {
		// TODO Auto-generated method stub
		
		if(uData.chkUserMenu(menuID)==true){
			DutyTable dutylist = new DutyTable(db);
			DutyGroup dutygrplist = new DutyGroup(db);
			List<Map<String,Object>> Listdutygroup = dutygrplist.findBySql("select dg.group_id,dg.group_name from duty_group dg where dg.group_status = 'N' order by dg.group_name ");		
			List viewduty = dutylist.findBySql("select dt.id, dt.duty_code,dt.duty_name,dg.group_name,to_char(dt.begin_date,'fmdd/MM/yyyy', 'NLS_CALENDAR=''THAI BUDDHA'' NLS_DATE_LANGUAGE=THAI') As begin_date ,to_char(dt.end_date,'fmdd/MM/yyyy', 'NLS_CALENDAR=''THAI BUDDHA'' NLS_DATE_LANGUAGE=THAI') As end_date,dt.group_id  from duty_table dt left join duty_group dg on  dt.group_id = dg.group_id and dg.group_status = 'N' order by dt.duty_code");		
			
			request.setAttribute("cmbDutyGroup", request.getParameter("cmbDutyGroup"));
			request.setAttribute("dutylist", viewduty);
			request.setAttribute("dutygrplist", Listdutygroup);
			
			//RunningKey rk = new RunningKey(db);
			//request.setAttribute("NewCode", rk.getRunningKey("COURT", "", "", "N"));
			
			forward("?page=/Master/DutyTable.jsp");
		}else{
    		HttpSession session = request.getSession();
  		  	session.invalidate();
  		  	request.setAttribute("errMsg", "ผู้ใช้ไม่มีสิทธิ์ดำเนินการ");
  		  	forward("?page=/login.jsp", request, response);
    	}
	}
	public void create(HttpServletRequest request,HttpServletResponse response) throws Exception {
		DutyTable duty = new DutyTable(db);
		//bindForm(duty);
		//if(request.getParameter("active_status") == null){
		String id = (request.getParameter("id") != null ? request.getParameter("id").toString() : "");
		
		String DutyCode = request.getParameter("duty_code");
		if(DutyCode.equals("NEW")==true){
			DutyCode= duty.GetNewDutyCode();
		}
		
		if (!DutyCode.equals("")){
			duty.setDuty_code(DutyCode);
			duty.setDuty_name(request.getParameter("duty_name"));
			duty.setGroup_id(request.getParameter("cmbDutyGroup").toString());			
	
			duty.setBegin_date(DateUtil.getDateFromString(request.getParameter("request_date_start").toString()));
			duty.setEnd_date(DateUtil.getDateFromString(request.getParameter("request_date_stop").toString()));
			
			duty.setUpd_date(new java.util.Date());
			duty.setUpd_userid(uData.getIdCard());
			duty.setData_source("XCS_illegal");
			
			if(!id.equals("")){
				duty = duty.update();
			}else{
				duty = duty.create();
			}
			redirect("process?action=DutyTable_Master#"+duty.getId());
		}
	}
	public void delete(HttpServletRequest request,HttpServletResponse response)throws Exception {
		
		String[] ids =  request.getParameterValues("id");
		int del = ParameterUtil.getIntegerParam("iddel", request);
		//log.debug("ก่อน"+del);
		del = del-1;
		//log.debug("หลังช"+del);
		if( ids!=null && ids.length>0 ){
			DutyTable DutyTable = new DutyTable(db);
			List<Long> idList = new ArrayList<Long>();
			for( int i=0;i<ids.length;i++ )
				idList.add(new Long(ids[i]));
			int deleteRow = DutyTable.deleteByPks(idList);
		}
		redirect("process?action=DutyTable_Master#"+del+del);
	}
	public void update(HttpServletRequest request,HttpServletResponse response)throws Exception {
		DutyTable dutytable = new DutyTable(db);
		dutytable= dutytable.findByPk(ParameterUtil.getLongParam("id", request));
		dutytable.setGroup_id(request.getParameter("cmbDutyGroupUpdate").toString());
		dutytable.setDuty_code(request.getParameter("Duty_codeUpdate"));
		dutytable.setDuty_name(request.getParameter("Duty_nameUpdate"));	
		dutytable.setBegin_date(DateUtil.getDateFromString(request.getParameter("request_date_startUpdate").toString()));
		dutytable.setEnd_date(DateUtil.getDateFromString(request.getParameter("request_date_stopUpdate").toString()));
		dutytable.setData_source("XCS_illegal");
		
		dutytable = dutytable.update();
		redirect("process?action=DutyTable_Master#"+ParameterUtil.getLongParam("id", request));
	}
	
}
