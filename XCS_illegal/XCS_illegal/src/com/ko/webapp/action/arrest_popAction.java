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

public class arrest_popAction extends BaseAction{


	public void pre(HttpServletRequest request,HttpServletResponse response)throws Exception{
		/*
		InspectorTeam team= new InspectorTeam(db);
		List<InspectorTeam> teamlist=team.findAll();
		log.debug(teamlist);

		request.setAttribute("teamlist", teamlist);
		request.setAttribute("formname",request.getParameter("formname"));
		request.setAttribute("empid",request.getParameter("id"));
		request.setAttribute("posname",request.getParameter("posname"));
		request.setAttribute("poscode",request.getParameter("poscode"));
		request.setAttribute("offname",request.getParameter("offname"));
		request.setAttribute("offcode",request.getParameter("offcode"));
		*/


	}



	public void list(HttpServletRequest request,HttpServletResponse response)throws Exception {
		request.setAttribute("p", request.getParameter("pap"));
		request.setAttribute("pageOut", request.getParameter("rdiSource"));
		String checkRadio = ParameterUtil.getStringParam("rdiSource", request);
		log.debug("radio="+checkRadio);
		ApplicationArrestProve aap = new ApplicationArrestProve(db);
		V_COMPARE_CASE_POPUP vcc = new V_COMPARE_CASE_POPUP(db);
		StringBuffer where1=new StringBuffer(" where aa.track_no not in (select s.track_no from seize s) ");

		String sql1=	" select aa.track_no, aa.occurrence_date,"+
		" to_char(aa.occurrence_date, 'dd/mm/yyyy', 'NLS_CALENDAR=''THAI BUDDHA'' NLS_DATE_LANGUAGE=THAI') occurrence_date2,"+
		" aa.legislation_id, lg.legislation_name, pke_arrest.getArrestLawbreaker(aa.track_no) lawbreaker_name,"+
		" ti.title_name || st.first_name || ' ' || st.last_name accuser_name "+
		" from application_arrest aa"+
		" inner join legislation lg on lg.id=aa.legislation_id"+
		" inner join staff st on st.idcard_no=aa.accuser_idcardno"+
		" left join title ti on ti.title_code=st.title_code"+
		" ";

		String sql3	=
			" select count(*)"+
			" from application_arrest aa"+
			" inner join legislation lg on lg.id=aa.legislation_id"+
			" inner join staff st on st.idcard_no=aa.accuser_idcardno"+
			" left join title ti on ti.title_code=st.title_code"+
			" ";
					
		//String sql4="union all "
		String sql4	="select count(*) "
					+"from application_outside_prove aop "
					+"inner join legislation lg on lg.id=aop.legislation_id ";

		//pre(request,response);
		String track_no1 = ParameterUtil.getStringParam("track_no1", request);
		String track_no2 = ParameterUtil.getStringParam("track_no2", request);
		Date occurrence_date1 = ParameterUtil.getDateParam("occurrence_date1", request);
		Date occurrence_date2 = ParameterUtil.getDateParam("occurrence_date2", request);
		String Str_occurrence_date1 = request.getParameter("occurrence_date1");
		String Str_occurrence_date2 = request.getParameter("occurrence_date2");
		Long legislation =ParameterUtil.getLongParam("legislation_id", request);
		
		int i;
		
		
		
		if(legislation != null){
			where1.append("and aa.legislation_id = ? ");
			i=where1.indexOf("?");
			where1.replace(i, i+1, "");
			where1.insert(i, "'"+legislation+"'");
			//where2.append("and lg.id = ? ");
			//i=where2.indexOf("?");
			//where2.replace(i, i+1, "");
			//where2.insert(i, "'"+legislation+"'");
		}
		if((!track_no1.trim().equals(""))&&(!track_no2.trim().equals(""))){
			where1.append("and aa.track_no between  ? ");
			i=where1.indexOf("?");
			where1.replace(i, i+1, "");
			where1.insert(i, "'"+track_no1+"'");
			where1.append("and  ? ");
			i=where1.indexOf("?");
			where1.replace(i, i+1, "");
			where1.insert(i, "'"+track_no2+"'");
			//sql1+=where1.toString();
			//sql3+=where1.toString();
		}
		if((occurrence_date1 != null) && (occurrence_date2 != null)){
			where1.append("and add_months(to_date(aa.occurrence_date),6516) between to_date(?) ");
			i=where1.indexOf("?");
			where1.replace(i, i+1, "");
			where1.insert(i,"'"+Str_occurrence_date1+"','dd/mm/yyyy'");
			where1.append("and to_date(?) ");
			i=where1.indexOf("?");
			where1.replace(i, i+1, "");
			where1.insert(i,"'"+Str_occurrence_date2+"','dd/mm/yyyy'");
		}
		
			log.debug("countBySql="+sql3+where1.toString());
			Integer totalRow = aap.countBySql(sql3+where1.toString(), null);
			pageUtil.setTotalRow(totalRow);
			log.debug(totalRow);
			
			
			List<Map<String,Object>> aap_list = aap.findBySql(sql1+where1.toString(),null,pageUtil);
			log.debug(aap_list);
			request.setAttribute("aapList", aap_list);
		
			
			List<Map<String,Object>> aalinapp = new ArrayList<Map<String,Object>>();
			
			
			for(int j=0;j<aap_list.size();j++){
				String aaesql;

				aaesql = 
					" select aae.track_no,"+
					 " nvl(aae.duty_name,dt.duty_name) || case when nvl(aae.brand_name,nvl(bm.brand_main_thai, bm.brand_main_eng)) is not null then ' ยี่ห้อ ' || nvl(aae.brand_name,nvl(bm.brand_main_thai, bm.brand_main_eng)) else '' end product_name," +
					 " aae.qty || ' ' || nvl(aae.qty_unit_name,u.thname) qty,aae.remarks" +
					" from application_arrest_exhibit aae "+
					" left join brand_main bm on bm.brand_main_code = aae.brand_code and bm.group_id = aae.group_id"+
					" left join unit u on u.unit_code = aae.qty_unit_code "+
					" left join duty_table dt on dt.duty_code=aae.duty_code "+
					" where aae.track_no = ?";

				//log.debug(aaesql);
				ApplicationArrest aae = new ApplicationArrest(db);
				List<Map<String,Object>> inapp_list = aae.findBySql(aaesql,aap_list.get(j).get("track_no"));
				
				for(int k=0;k<inapp_list.size();k++){
					aalinapp.add( inapp_list.get(k));		
				}
			}
			
		
		

		log.debug(aalinapp);
			request.setAttribute("allapplist", aalinapp);
		
		
		forward("/Popup/arrest_pop.jsp", request, response);
	}
	@Override
	public void _default(HttpServletRequest request, HttpServletResponse response) throws Exception {
		// TODO Auto-generated method stub
		log.debug("res="+request.getParameter("pap"));
		request.setAttribute("p", request.getParameter("pap"));
		//pre(request,response);
		forward("/Popup/arrest_pop.jsp", request, response);
	}
	

}
