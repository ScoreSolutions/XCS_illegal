package com.ko.webapp.action;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.ko.domain.LicenseType;
import com.ko.domain.Nationality;
import com.ko.util.RunningKey;
import com.ko.webapp.util.ParameterUtil;

public class NationalityList_MasterAction extends BaseAction{

	String menuID="43";
	
	@Override
	public void _default(HttpServletRequest request,
			HttpServletResponse response) throws Exception {
		// TODO Auto-generated method stub
		
		if(uData.chkUserMenu(menuID)==true){
			Nationality nationlity = new Nationality(db);
			List Listnationlity = nationlity.findBySql("select * from nationality nt order by nt.nation_code");
			request.setAttribute("ListNation", Listnationlity);
			RunningKey rk = new RunningKey(db);
			request.setAttribute("NewCode", rk.getRunningKey("NATIONALITY", "", "", "N"));
			forward("?page=/Master/NationalityList.jsp");
		}else{
    		HttpSession session = request.getSession();
  		  	session.invalidate();
  		  	request.setAttribute("errMsg", "ผู้ใช้ไม่มีสิทธิ์ดำเนินการ");
  		  	forward("?page=/login.jsp", request, response);
    	}
	}
	public void create(HttpServletRequest request,
			HttpServletResponse response) throws Exception {
		Nationality na = new Nationality(db);
		bindForm(na);
		//System.out.println(request.getParameter("active"));
		if(request.getParameter("active") == null){
			na.setActive("0");
		}
		na.setCreate_by(create_by);
		na.setCreate_on(create_on);
		//na.setUpdate_by(update_by);
		//na.setUpdate_on(update_on);
		na = na.create();
		//redirect("process?action=NationalityList_Master#"+na.getId());
		redirect("process?action=NationalityList_Master");
	}
	public void delete(HttpServletRequest request,HttpServletResponse response)throws Exception {
		String[] ids =  request.getParameterValues("id");
		int del=ParameterUtil.getIntegerParam("iddel", request);
		del=del-1;
		if( ids!=null && ids.length>0 ){
			Nationality na = new Nationality(db);
			List<Long> idList = new ArrayList<Long>();
			for( int i=0;i<ids.length;i++ )
				idList.add(new Long(ids[i]));
			int deleteRow = na.deleteByPks(idList);
		}
		redirect("process?action=NationalityList_Master#del"+del);
	}
	public void update(HttpServletRequest request,HttpServletResponse response)throws Exception {
		Nationality na = new Nationality(db);
		na = na.findByPk(ParameterUtil.getLongParam("id", request));
		System.out.println("checkBox="+request.getParameter("activeUpdate"));
		if(request.getParameter("activeUpdate") == null){
			na.setActive("0");
		}else{
			na.setActive("1");
		}
		
		//licenseType.setActive_status(request.getParameter("active_statusUpdate"));
		na.setNation_code(request.getParameter("nation_codeUpdate"));
		na.setNation_name(request.getParameter("nation_nameUpdate"));
		na.setUpdate_by(update_by);
		na.setUpdate_on(update_on);
		na = na.update();
		//redirect("process?action=NationalityList_Master#"+ParameterUtil.getLongParam("id", request));
		redirect("process?action=NationalityList_Master");
	}

}
