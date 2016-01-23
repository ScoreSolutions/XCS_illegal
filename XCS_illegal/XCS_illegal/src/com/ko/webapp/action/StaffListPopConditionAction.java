package com.ko.webapp.action;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.ko.domain.Staff;
import com.ko.domain.Title;
import com.ko.domain.EdOffice;
import com.ko.domain.InspectorTeam;
import com.ko.domain.V_STAFF_LIST_POPUP;

import com.ko.domain.Legislation;
import com.ko.domain.base.BaseIndictment;
import com.ko.webapp.util.PageUtil;
import com.ko.webapp.util.ParameterUtil;

public class StaffListPopConditionAction extends BaseAction{


	public void pre(HttpServletRequest request,HttpServletResponse response)throws Exception{
		InspectorTeam team= new InspectorTeam(db);
		List<InspectorTeam> teamlist=team.findAll();
		log.debug(teamlist);

		request.setAttribute("teamlist", teamlist);
		request.setAttribute("formname",request.getParameter("formname"));
		//request.setAttribute("empid",request.getParameter("id"));
		request.setAttribute("posname",request.getParameter("posname"));
		request.setAttribute("poscode",request.getParameter("poscode"));
		request.setAttribute("offcode",request.getParameter("offcode"));

		EdOffice ed = new EdOffice(db);
		List<EdOffice> edList = ed.findByWhere(ed.OFFCODECol + "=?", request.getParameter("offcode"));
		if (edList.size()==1)
			request.setAttribute("offname",edList.get(0).getOffname());

	}



	public void list(HttpServletRequest request,HttpServletResponse response)throws Exception {
		V_STAFF_LIST_POPUP v = new V_STAFF_LIST_POPUP(db);
		V_STAFF_LIST_POPUP cv = new V_STAFF_LIST_POPUP(db);
		String sql="" ;
		String sql0 ;
		String sql2;
		
		String txtOffcode = request.getParameter("txtoffcode");
		String txtOffname = request.getParameter("txtoffname");

		ArrayList<String> alcon= new ArrayList();
		ArrayList<String> alin = new ArrayList();
		//sql0 = "select IDCARD_NO,TITLE_NAME,FIRST_NAME,LAST_NAME,POSNAME,OFFNAME,poscode,offcode from V_STAFF_LIST_POPUP where 1 = 1 ";
        sql0 = "select IDCARD_NO,TITLE_CODE,STAFF_LEVEL,TITLE_NAME,FIRST_NAME,LAST_NAME,POSNAME,OFFNAME,poscode,offcode,empid from V_STAFF_LIST_POPUP where 1 = 1 "; 
		sql2 = "select count(*) from V_STAFF_LIST_POPUP where 1 = 1 ";
		alcon.add(" AND FIRST_NAME like '%");
		alin.add(request.getParameter("txtfname")+"%'");
		alcon.add(" AND LAST_NAME like '%");
		alin.add(request.getParameter("txtlname")+"%'");
		alcon.add(" AND POSNAME like '%");
		alin.add(request.getParameter("txtposname")+"%'");
		alcon.add(" AND OFFCODE like '%");
		alin.add(txtOffcode+"%'");
		alcon.add(" AND team_code like '%");
		alin.add(request.getParameter("teamname")+"%'");
		for(int i = 0; i < alin.size();i++){
			if(alin.get(i).equals("%'")){alcon.set(i, "");
			alin.set(i,"");}
			sql += alcon.get(i) + alin.get(i);
		}

		Integer totalRow = cv.countBySql(sql2+sql, null);
		pageUtil.setTotalRow(totalRow);
		log.debug(totalRow);
		log.debug(sql);
		//List leList = cv.findBySql(sql, null);


		//request.setAttribute("lePList", leList);
		//List divide_staff = cv.findByWhere("where TITLE_CODE = '0001' ", null);
		List divide_staff = v.findBySql(sql0+sql, null,pageUtil);

		log.debug("list staff="+divide_staff);
		request.setAttribute("formname",request.getParameter("formname"));
		request.setAttribute("teamname",request.getParameter("teamname"));
		request.setAttribute("txtfname",request.getParameter("txtfname"));
		request.setAttribute("txtlname",request.getParameter("txtlname"));
		request.setAttribute("txtposname",request.getParameter("posname"));
		request.setAttribute("txtposcode",request.getParameter("poscode"));
		request.setAttribute("offname",txtOffname);
		request.setAttribute("offcode",txtOffcode);
		request.setAttribute("divide_staffList", divide_staff);
		

		forward("/Popup/StaffListPopCondition.jsp");
	}
	@Override
	public void _default(HttpServletRequest request, HttpServletResponse response) throws Exception {
		// TODO Auto-generated method stub
		System.out.println(request.getParameter("offcode"));
		pre(request,response);
		System.out.println(request.getParameter("offcode"));
		forward("/Popup/StaffListPopCondition.jsp", request, response);
	}
}
