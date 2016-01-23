package com.ko.webapp.action;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.ko.domain.Court;
import com.ko.domain.Legislation;
import com.ko.webapp.util.ParameterUtil;
import com.ko.domain.Province;
import com.ko.util.RunningKey;

public class CourtList_MasterAction extends BaseAction{
	String menuID="41";
	@Override
	public void _default(HttpServletRequest request,
			HttpServletResponse response) throws Exception {
		// TODO Auto-generated method stub
		
		if(uData.chkUserMenu(menuID)==true){
			Court courtlist = new Court(db);
			Province provlist = new Province(db);
			List<Map<String,Object>> Listprovince = provlist.findBySql("select province_code, province_name from province order by province_name");		
			List viewcourt = courtlist.findBySql("select co.*, prov.province_code, prov.province_name from court co left join province prov on co.province_code = prov.province_code order by co.court_code ");
			
			
			request.setAttribute("cmbCourtProvince", request.getParameter("cmbCourtProvince"));
			request.setAttribute("courtlist", viewcourt);
			request.setAttribute("provlist", Listprovince);
			
			RunningKey rk = new RunningKey(db);
			request.setAttribute("NewCode", rk.getRunningKey("COURT", "", "", "N"));
			
			forward("?page=/Master/CourtList.jsp");
		}else{
    		HttpSession session = request.getSession();
  		  	session.invalidate();
  		  	request.setAttribute("errMsg", "ผู้ใช้ไม่มีสิทธิ์ดำเนินการ");
  		  	forward("?page=/login.jsp", request, response);
    	}
	}
	public void create(HttpServletRequest request,
			HttpServletResponse response) throws Exception {
		Court court = new Court(db);
		bindForm(court);
		if(request.getParameter("active_status") == null){
			court.setActive_status("0");
		}
		court.setProvince_code(request.getParameter("cmbCourtProvince").toString());
		court.setCreate_by(create_by);
		//court.setUpdate_by(update_by);
		court.setCreate_on(create_on);
		court.setUpdate_on(update_on);
		court = court.create();
		redirect("process?action=CourtList_Master#"+court.getId());
	}
	public void delete(HttpServletRequest request,HttpServletResponse response)throws Exception {
		String[] ids =  request.getParameterValues("id");
		int del = ParameterUtil.getIntegerParam("iddel", request);
		log.debug("ก่อน"+del);
		del = del-1;
		log.debug("หลังช"+del);
		if( ids!=null && ids.length>0 ){
			Court court = new Court(db);
			List<Long> idList = new ArrayList<Long>();
			for( int i=0;i<ids.length;i++ )
				idList.add(new Long(ids[i]));
			int deleteRow = court.deleteByPks(idList);
		}
		redirect("process?action=CourtList_Master#"+del+del);
	}
	public void update(HttpServletRequest request,HttpServletResponse response)throws Exception {
		Court court = new Court(db);
		court= court.findByPk(ParameterUtil.getLongParam("id", request));
		court.setProvince_code(request.getParameter("cmbCourtProvinceUpdate").toString());
		//court.setId(ParameterUtil.getLongParam("id", request));
		court.setCourt_code(request.getParameter("court_codeUpdate"));
		court.setCourt_name(request.getParameter("court_nameUpdate"));
		//court.setActive_status(request.getParameter("active_statusUpdate"));
		if(request.getParameter("active_statusUpdate") == null){
			court.setActive_status("0");
		}else{
			court.setActive_status("1");
		}
		//System.out.println("court_code="+request.getParameter("court_codeUpdate"));
		//System.out.println("court_name="+request.getParameter("court_nameUpdate"));
		//System.out.println("active_status="+request.getParameter("active_statusUpdate"));
		//System.out.println("id="+ParameterUtil.getLongParam("id", request));
		court.setUpdate_by(update_by);
		court.setUpdate_on(update_on);
		//court.setCreate_by(create_by);
		//court.setCreate_on(create_on);
		court = court.update();
		redirect("process?action=CourtList_Master#"+ParameterUtil.getLongParam("id", request));
	}
}
