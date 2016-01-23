package com.ko.webapp.action;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.ko.domain.Race;
import com.ko.webapp.util.ParameterUtil;
import com.ko.util.RunningKey;

public class RaceList_MasterAction extends BaseAction{
	String menuID="42";
	@Override
	public void _default(HttpServletRequest request,
			HttpServletResponse response) throws Exception {
		// TODO Auto-generated method stub
		
		if(uData.chkUserMenu(menuID)==true){
			Race ra = new Race(db);
			List<Map<String,Object>> lra =ra.findBySql("select * from race ra order by ra.race_code");
			if(lra != null){
				for(int i = 0; i<lra.size();i++){
					Map<String,Object> data = lra.get(i);
					data.put("is_del", "");
					
				}
			}
			request.setAttribute("ListRace", lra);
			
			RunningKey rk = new RunningKey(db);
			request.setAttribute("NewCode", rk.getRunningKey("RACE", "", "", "N"));
			
			forward("?page=/Master/RaceList.jsp");
		}else{
    		HttpSession session = request.getSession();
  		  	session.invalidate();
  		  	request.setAttribute("errMsg", "ผู้ใช้ไม่มีสิทธิ์ดำเนินการ");
  		  	forward("?page=/login.jsp", request, response);
    	}
	}
	public void create(HttpServletRequest request,
			HttpServletResponse response) throws Exception {
		Race ra = new Race(db);
		bindForm(ra);
		System.out.println(request.getParameter("active"));
		if(request.getParameter("active") == null){
			ra.setActive("0");
		}
		ra.setCreate_by(create_by);
		ra.setCreate_on(create_on);
		//ra.setUpdate_by(update_by);
		//ra.setUpdate_on(update_on);
		ra = ra.create();
		//redirect("process?action=RaceList_Master#"+ra.getId());
		redirect("process?action=RaceList_Master");
	}
	public void delete(HttpServletRequest request,HttpServletResponse response)throws Exception {
		String[] ids =  request.getParameterValues("id");
		int del = ParameterUtil.getIntegerParam("iddel", request);
		del=del-1;
		if( ids!=null && ids.length>0 ){
			Race ra = new Race(db);
			List<Long> idList = new ArrayList<Long>();
			for( int i=0;i<ids.length;i++ )
				idList.add(new Long(ids[i]));
			int deleteRow = ra.deleteByPks(idList);
		}
		redirect("process?action=RaceList_Master#del"+del);
	}
	public void update(HttpServletRequest request,HttpServletResponse response)throws Exception {
		Race ra = new Race(db);
		ra= ra.findByPk(ParameterUtil.getLongParam("id", request));
		//court.setId(ParameterUtil.getLongParam("id", request));
		ra.setRace_code(request.getParameter("race_codeUpdate"));
		ra.setRace_name(request.getParameter("race_nameUpdate"));
		if(request.getParameter("activeUpdate") == null){
			ra.setActive("0");
		}else{
			ra.setActive("1");
		}
		ra.setUpdate_by(update_by);
		ra.setUpdate_on(update_on);
		ra = ra.update();
		//redirect("process?action=RaceList_Master#"+ParameterUtil.getLongParam("id", request));
		redirect("process?action=RaceList_Master");
	}
}
