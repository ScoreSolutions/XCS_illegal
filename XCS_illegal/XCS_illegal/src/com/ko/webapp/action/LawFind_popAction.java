package com.ko.webapp.action;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.ko.domain.Staff;
import com.ko.domain.Title;
import com.ko.domain.InspectorTeam;
import com.ko.domain.V_STAFF_LIST_POPUP;

public class LawFind_popAction extends BaseAction{


	public void pre(HttpServletRequest request,HttpServletResponse response)throws Exception{
		InspectorTeam team= new InspectorTeam(db);
		List<InspectorTeam> teamlist=team.findAll();
		System.out.println(teamlist);

		request.setAttribute("formname",request.getParameter("formname"));
		request.setAttribute("empid",request.getParameter("id"));


	}



	public void list(HttpServletRequest request,HttpServletResponse response)throws Exception {
		V_STAFF_LIST_POPUP v = new V_STAFF_LIST_POPUP(db);
		V_STAFF_LIST_POPUP cv = new V_STAFF_LIST_POPUP(db);
		String sql="" ;
		String sql0 ;
		String sql2;

		pre(request,response);

		ArrayList<String> alcon= new ArrayList();
		ArrayList<String> alin = new ArrayList();
		sql0 = "select lb.lawbreaker_no,  trim(case lb.lawbreaker_type "
			+" when '1' then t.title_name || lb.first_name || ' ' || lb.last_name"
			+" when '2' then t.title_name || lb.first_name || ' ' || lb.middle_name || ' ' || lb.last_name"
			+" when '3' then tc.title_name || lb.company_name end) lawbreaker_name"
			+" from lawbreaker lb"
			+" left join title t on t.title_code=lb.title_code"
			+" left join title tc on tc.title_code=lb.title_code_company"
			+" where 1 = 1 ";
		sql2 = "select count(lb.lawbreaker_no) from lawbreaker lb"
			+" left join title t on t.title_code=lb.title_code"
			+" left join title tc on tc.title_code=lb.title_code_company"
			+" where 1 = 1 ";
		alcon.add(" AND case lb.lawbreaker_type "
			+" when '1' then t.title_name || lb.first_name || ' ' || lb.last_name"
			+" when '2' then t.title_name || lb.first_name || ' ' || lb.middle_name || ' ' || lb.last_name"
			+" when '3' then tc.title_name || lb.company_name end  like '%");
		alin.add(request.getParameter("txtfname")+"%'");

		for(int i = 0; i < alin.size();i++){
			if(alin.get(i).equals("%'")){alcon.set(i, "");
			alin.set(i,"");}
			sql += alcon.get(i) + alin.get(i);
		}
		sql+=" order by lb.first_name,lb.middle_name,lb.last_name,lb.company_name";
		Integer totalRow = cv.countBySql(sql2+sql, null);
		pageUtil.setTotalRow(totalRow);
		log.debug(totalRow);
		log.debug(sql);
		//List leList = cv.findBySql(sql, null);


		//request.setAttribute("lePList", leList);
		//List divide_staff = cv.findByWhere("where TITLE_CODE = '0001' ", null);
		List divide_staff = v.findBySql(sql0+sql, null,pageUtil);

		log.debug(divide_staff);
	
		request.setAttribute("divide_staffList", divide_staff);
		forward("/Popup/law_find_pop.jsp", request, response);
	}
	@Override
	public void _default(HttpServletRequest request, HttpServletResponse response) throws Exception {
		// TODO Auto-generated method stub

		pre(request,response);
		forward("/Popup/law_find_pop.jsp", request, response);
	}


	
}
