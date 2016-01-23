package com.ko.webapp.action;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.ko.domain.Nationality;
import com.ko.domain.Religion;
import com.ko.util.RunningKey;
import com.ko.webapp.util.ParameterUtil;

public class ReligionList_MasterAction extends BaseAction{
	String menuID="44";
	@Override
	public void _default(HttpServletRequest request,
			HttpServletResponse response) throws Exception {
		// TODO Auto-generated method stub
		
		if(uData.chkUserMenu(menuID)==true){
			Religion Re = new Religion(db);
			List ListRe = Re.findBySql("select * from religion re order by re.religion_code");
			request.setAttribute("ListReligion", ListRe);
			RunningKey rk = new RunningKey(db);
			request.setAttribute("NewCode", rk.getRunningKey("RELIGION", "", "", "N"));
			forward("?page=/Master/ReligionList.jsp");
		}else{
    		HttpSession session = request.getSession();
  		  	session.invalidate();
  		  	request.setAttribute("errMsg", "ผู้ใช้ไม่มีสิทธิ์ดำเนินการ");
  		  	forward("?page=/login.jsp", request, response);
    	}
	}
	public void create(HttpServletRequest request,HttpServletResponse response)throws Exception {
		Religion Re = new Religion(db);
		bindForm(Re);
		if(request.getParameter("active") == null){
			Re.setActive("0");
		}
		Re.setCreate_by(create_by);
		Re.setCreate_on(create_on);
		//Re.setUpdate_by(update_by);
		//Re.setUpdate_on(update_on);
		Re = Re.create();
		//redirect("process?action=ReligionList_Master#"+Re.getId());
		redirect("process?action=ReligionList_Master");
		
	}
	public void delete(HttpServletRequest request,HttpServletResponse response)throws Exception {
		String[] ids =  request.getParameterValues("id");
		int del = ParameterUtil.getIntegerParam("iddel", request);
		if( ids!=null && ids.length>0 ){
			Religion Re = new Religion(db);
			List<Long> idList = new ArrayList<Long>();
			for( int i=0;i<ids.length;i++ )
				idList.add(new Long(ids[i]));
			int deleteRow = Re.deleteByPks(idList);
		}
		redirect("process?action=ReligionList_Master#del"+del);
	}
	public void update(HttpServletRequest request,HttpServletResponse response)throws Exception {
		Religion Re = new Religion(db);
		Re = Re.findByPk(ParameterUtil.getLongParam("id", request));
		System.out.println("checkBox="+request.getParameter("activeUpdate"));
		if(request.getParameter("activeUpdate") == null){
			Re.setActive("0");
		}else{
			Re.setActive("1");
		}
		
		//licenseType.setActive_status(request.getParameter("active_statusUpdate"));
		Re.setReligion_code(request.getParameter("religion_codeUpdate"));
		Re.setReligion_name(request.getParameter("religion_nameUpdate"));
		Re.setUpdate_by(update_by);
		Re.setUpdate_on(update_on);
		Re = Re.update();
		//redirect("process?action=ReligionList_Master#"+ParameterUtil.getLongParam("id", request));
		redirect("process?action=ReligionList_Master");
	}

}
