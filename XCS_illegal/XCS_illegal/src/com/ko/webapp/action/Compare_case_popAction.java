package com.ko.webapp.action;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.ko.domain.ApplicationArrest;
import com.ko.domain.ApplicationArrestProve;
import com.ko.domain.DeliveryExhibit;
import com.ko.domain.DeliveryExhibitItem;
import com.ko.domain.SendIncome;
import com.ko.domain.SendIncomeCase;
import com.ko.domain.Staff;
import com.ko.domain.Title;
import com.ko.domain.InspectorTeam;
import com.ko.domain.Unit;
import com.ko.domain.V_COMPARE_CASE_POPUP;
import com.ko.domain.V_STAFF_LIST_POPUP;

import com.ko.domain.Legislation;
import com.ko.domain.base.BaseIndictment;
import com.ko.webapp.util.PageUtil;
import com.ko.webapp.util.ParameterUtil;

public class Compare_case_popAction extends BaseAction{

	private void searchData(HttpServletRequest request,HttpServletResponse response)throws Exception {
		ApplicationArrestProve aap = new ApplicationArrestProve(db);
		V_COMPARE_CASE_POPUP vcc = new V_COMPARE_CASE_POPUP(db);
		StringBuffer where1=new StringBuffer("where 1 = 1 and compare_case_id not in(select compare_case_id from invoice2) ");
		
		String sql1="select * from V_COMPARE_CASE_POPUP ";
		String sql3	="select count(*) from V_COMPARE_CASE_POPUP "	;
		
		String sql4	="select count(*) "
					+"from application_outside_prove aop "
					+"inner join legislation lg on lg.id=aop.legislation_id ";

		String compare_case_no1 = ParameterUtil.getStringParam("compare_case_no", request);
		String compare_case_no2 = ParameterUtil.getStringParam("compare_case_no", request);
		Date compare_case_date1 = ParameterUtil.getDateParam("compare_case_date1", request);
		Date compare_case_date2 = ParameterUtil.getDateParam("compare_case_date2", request);
		String Str_compare_case_date1 = request.getParameter("compare_case_date1");
		String Str_compare_case_date2 = request.getParameter("compare_case_date2");
		Double legislation =(request.getAttribute("p") != null ? new Double(request.getAttribute("p").toString()) : ParameterUtil.getDoubleParam("legislation_id", request));
		//log.debug("op="+legislation);
		
		int i;
		if(legislation != null){
			where1.append("and legislation_id = ? ");
			i=where1.indexOf("?");
			where1.replace(i, i+1, "");
			where1.insert(i, "'"+legislation+"'");
			//where2.append("and lg.id = ? ");
			//i=where2.indexOf("?");
			//where2.replace(i, i+1, "");
			//where2.insert(i, "'"+legislation+"'");
		}
		if((!compare_case_no1.trim().equals(""))&&(!compare_case_no2.trim().equals(""))){
			where1.append("and between compare_case_no like ? ");
			i=where1.indexOf("?");
			where1.replace(i, i+1, "");
			where1.insert(i, "%"+compare_case_no1+"%");
			where1.append("and compare_case_no like ? ");
			i=where1.indexOf("?");
			where1.replace(i, i+1, "");
			where1.insert(i, "%"+compare_case_no2+"%");
			//sql1+=where1.toString();
			//sql3+=where1.toString();
		}
		if((compare_case_date1 != null) && (compare_case_date2 != null)){
			where1.append("and add_months(to_date(compare_case_date),6516) between to_date(?) ");
			i=where1.indexOf("?");
			where1.replace(i, i+1, "");
			where1.insert(i,"'"+Str_compare_case_date1+"','dd/mm/yyyy'");
			where1.append("and to_date(?) ");
			i=where1.indexOf("?");
			where1.replace(i, i+1, "");
			where1.insert(i,"'"+Str_compare_case_date2+"','dd/mm/yyyy'");
			//sql1+=where1.toString();
			//sql3+=where1.toString();
		}
		
		List<Map<String,Object>> aalinapp = new ArrayList<Map<String,Object>>();
		for(int j=0;j<10;j++){
			Map<String,Object> inapp_list = new HashMap<String, Object>();
				request.setAttribute("inaaplist"+j, inapp_list);
			}
			//log.debug("countBySql="+sql1+where1.toString());
			Integer totalRow = aap.countBySql(sql3+where1.toString(), null);
			pageUtil.setTotalRow(totalRow);
			//log.debug(totalRow);
			
			List<Map<String,Object>> aap_list = aap.findBySql(sql1+where1.toString(),null,pageUtil);
			//log.debug(aap_list);
			request.setAttribute("aapList", aap_list);
		
			//log.debug(aalinapp);
			request.setAttribute("allapplist", aalinapp);
	}
	
	public void list(HttpServletRequest request,HttpServletResponse response)throws Exception {
		request.setAttribute("p", request.getParameter("pap"));
		request.setAttribute("pageOut", request.getParameter("rdiSource"));
		String checkRadio = ParameterUtil.getStringParam("rdiSource", request);
		//log.debug("radio="+checkRadio);

		searchData(request,response);
		forward("/Popup/compare_case_pop.jsp", request, response);
	}
	@Override
	public void _default(HttpServletRequest request, HttpServletResponse response) throws Exception {
		// TODO Auto-generated method stub
		//log.debug("res="+request.getParameter("pap"));
		request.setAttribute("p", request.getParameter("pap"));
		
		searchData(request,response);
		forward("/Popup/compare_case_pop.jsp", request, response);
	}
	

}
