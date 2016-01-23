package com.ko.webapp.action;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.ko.domain.Relation;
import com.ko.domain.Religion;
import com.ko.util.RunningKey;
import com.ko.webapp.util.ParameterUtil;

public class RelationList_MasterAction extends BaseAction{
	String menuID="46";
	@Override
	public void _default(HttpServletRequest request,
			HttpServletResponse response) throws Exception {
		// TODO Auto-generated method st
		
		if(uData.chkUserMenu(menuID)==true){
			Relation relation = new Relation(db);
			List relationList = relation.findBySql("select * from relation re order by re.relation_code");
			request.setAttribute("Listrelation", relationList);
			RunningKey rk = new RunningKey(db);
			request.setAttribute("NewCode", rk.getRunningKey("RELATION", "", "", "N"));
			forward("?page=/Master/RelationList.jsp");
		}else{
    		HttpSession session = request.getSession();
  		  	session.invalidate();
  		  	request.setAttribute("errMsg", "ผู้ใช้ไม่มีสิทธิ์ดำเนินการ");
  		  	forward("?page=/login.jsp", request, response);
    	}
	}
	public void create(HttpServletRequest request,HttpServletResponse response)throws Exception {
		Relation relation = new Relation(db);
		bindForm(relation);
		if(request.getParameter("active") == null){
			relation.setActive("0");
		}
		relation.setCreate_by(create_by);
		relation.setCreate_on(create_on);
		//relation.setUpdate_by(update_by);
		//relation.setUpdate_on(update_on);
		relation = relation.create();
		//redirect("process?action=RelationList_Master#"+relation.getId());
		redirect("process?action=RelationList_Master");
		
	}
	public void delete(HttpServletRequest request,HttpServletResponse response)throws Exception {
		String[] ids =  request.getParameterValues("id");
		int del=ParameterUtil.getIntegerParam("iddel", request);
		del=del-1;
		if( ids!=null && ids.length>0 ){
			Relation relation = new Relation(db);
			List<Long> idList = new ArrayList<Long>();
			for( int i=0;i<ids.length;i++ )
				idList.add(new Long(ids[i]));
			int deleteRow = relation.deleteByPks(idList);
		}
		redirect("process?action=RelationList_Master#del"+del);
	}
	public void update(HttpServletRequest request,HttpServletResponse response)throws Exception {
		Relation relation = new Relation(db);
		relation = relation.findByPk(ParameterUtil.getLongParam("id", request));
		System.out.println("checkBox="+request.getParameter("activeUpdate"));
		if(request.getParameter("activeUpdate") == null){
			relation.setActive("0");
		}else{
			relation.setActive("1");
		}
		
		//licenseType.setActive_status(request.getParameter("active_statusUpdate"));
		relation.setRelation_code(request.getParameter("relation_codeUpdate"));
		relation.setRelation_name(request.getParameter("relation_nameUpdate"));
		relation.setUpdate_by(update_by);
		relation.setUpdate_on(update_on);
		relation = relation.update();
		redirect("process?action=RelationList_Master#"+ParameterUtil.getLongParam("id", request));
	}

}
