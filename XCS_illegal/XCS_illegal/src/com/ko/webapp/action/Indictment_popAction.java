package com.ko.webapp.action;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


import com.ko.domain.Legislation;
import com.ko.domain.base.BaseIndictment;
import com.ko.webapp.util.ParameterUtil;


import com.ko.webapp.util.PageUtil;



public class Indictment_popAction extends BaseAction{
	public void pre(HttpServletRequest request,HttpServletResponse response)throws Exception{
		request.setAttribute("formname",request.getParameter("formname"));
		request.setAttribute("id",request.getParameter("id"));
		forward("/Popup/arrest_indictment_form.jsp", request, response);

	}
	public void add(HttpServletRequest request,HttpServletResponse response)throws Exception {
		Legislation le = new Legislation(db);
		String sql2 = "select * from LEGISLATION";
		List leList = le.findBySql(sql2, null);
		request.setAttribute("lePList", leList);
		forward("Popup/arrest_indictment_form.jsp", request, response);

	}
	
	public void ShowDialog(HttpServletRequest request,HttpServletResponse response)throws Exception {
		Legislation le = new Legislation(db);
		String sql2 = "select * from LEGISLATION";
		List leList = le.findBySql(sql2, null);
		request.setAttribute("lePList", leList);
		//forward("Popup/arrest_indictment_form.jsp", request, response);

	}


	public void list(HttpServletRequest request,HttpServletResponse response)throws Exception {
		BaseIndictment inment = new BaseIndictment(db);
		Legislation le = new Legislation(db);
		StringBuffer where = new StringBuffer("");
		String sql,sql1,sql2;
		sql = "select inc.indictment_id, inc.case_law_id, inc.penalty_case_law_id, inc.guilt_base,  inc.exhibit_wild from indictment inc inner join legislation lt on lt.legislation_code = inc.law_id where 1=1 ";
		sql2 = "select * from LEGISLATION";
		sql1 ="select count(*) from indictment inc  inner join legislation lt on lt.legislation_code = inc.law_id where 1=1";

		request.setAttribute("formname",request.getParameter("formname"));
		request.setAttribute("id",request.getParameter("id"));

		String legislation = ParameterUtil.getStringParam("legislation_id", request);
		String guilt = ParameterUtil.getStringParam("GuiltBase", request);
		String low = ParameterUtil.getStringParam("low", request);
		int a;
		if(!legislation.trim().equals("")){
			where.append(" and lt.id ='?'");
			a=where.indexOf("?");
			where.replace(a, a+1, "");
			where.insert(a, legislation);

		}
		if(!guilt.trim().equals("")){
			where.append(" and guilt_base like ?");
			a=where.indexOf("?");
			where.replace(a, a+1, "");
			where.insert(a, "'%"+guilt+"%'");
			System.out.println("where = "+where);
		}
		
		if(!low.trim().equals("")){
			where.append(" and penalty_case_law_id like ?");
			a=where.indexOf("?");
			where.replace(a, a+1, "");
			where.insert(a, "'%"+low+"%'");
		}
		//System.out.println(sql+where);
		Integer totalRow = le.countBySql(sql1+where.toString(), null);
		pageUtil.setTotalRow(totalRow);

		//System.out.println(sql+where);
		
		List leList = le.findBySql(sql2, null);
		List inment_pop = inment.findBySql(sql+where.toString(), null, pageUtil);
		//System.out.println(inment_pop);
		request.setAttribute("lePList", leList);
		request.setAttribute("Inditcment_List", inment_pop);
		forward("Popup/arrest_indictment_form.jsp", request, response);
	}
	@Override
	public void _default(HttpServletRequest request, HttpServletResponse response) throws Exception {
		// TODO Auto-generated method stub

		pre(request,response);
	}

}
