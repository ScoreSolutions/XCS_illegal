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
import com.ko.domain.Staff;
import com.ko.domain.Title;
import com.ko.domain.InspectorTeam;
import com.ko.domain.V_STAFF_LIST_POPUP;

import com.ko.domain.Legislation;
import com.ko.domain.base.BaseIndictment;
import com.ko.util.DateUtil;
import com.ko.webapp.util.PageUtil;
import com.ko.webapp.util.ParameterUtil;

public class Sendexhibit_popAction extends BaseAction{


	public void pre(HttpServletRequest request,HttpServletResponse response)throws Exception{
		
		Legislation lt = new Legislation(db);
		List<Legislation> ltlist = lt.findByWhere(" 1=1 order by legislation_name", null);
		request.setAttribute("ltlist", ltlist);

	}

	public void list2(HttpServletRequest request,HttpServletResponse response)throws Exception {
		request.setAttribute("p", request.getParameter("pap"));
		request.setAttribute("pageOut", request.getParameter("rdiSource"));
		String checkRadio = ParameterUtil.getStringParam("rdiSource", request);
		log.debug("radio="+checkRadio);
		ApplicationArrestProve aap = new ApplicationArrestProve(db);
		StringBuffer where1=new StringBuffer("where 1 = 1 and ape.id not in (select nvl(app_arrest_prove_exhibit_id,0) from delivery_exhibit_item) ");
		//String closeWhere = ")";
		StringBuffer where2 = new StringBuffer("where 1 = 1 and  aop.id not in (select nvl(application_outside_prove_item,0) from delivery_exhibit_item)");
		
		String order="order by aap.taken_date desc ";
		String sql1="select  distinct aap.track_no, 'IN' sources, aap.exhibit_report_no, aap.taken_date, "
					+"to_char(aap.taken_date,'dd/mm/yyyy','NLS_CALENDAR=''THAI BUDDHA'' NLS_DATE_LANGUAGE=THAI') taken_date2, "
					+"bi.case_id, bi.case_date, to_char(bi.case_date,'dd/mm/yyyy','NLS_CALENDAR=''THAI BUDDHA'' NLS_DATE_LANGUAGE=THAI') case_date2, "
					+"aa.legislation_id, lg.legislation_name "
					+"from  application_arrest_prove aap "
					+"inner join book_impeachment bi on bi.track_no=aap.track_no "
					+"inner join application_arrest aa on aa.track_no=aap.track_no "
					+"inner join legislation lg on lg.id=aa.legislation_id "
					+"inner join app_arrest_prove_exhibit ape on ape.track_no=aap.track_no  ";
		//String sql2	="union all "
		String sql2	="select  distinct aop.job_no track_no, 'OUT' sources, aop.prove_no case_id, aop.prove_date, "
					+"to_char(aop.prove_date,'dd/mm/yyyy','NLS_CALENDAR=''THAI BUDDHA'' NLS_DATE_LANGUAGE=THAI') taken_date2, "
					+" aop.legislation_id, lg.legislation_name "
					+"from application_outside_prove aop "
					+"inner join legislation lg on lg.id=aop.legislation_id  ";
		//String sql3="select count(*) from ( "
		String sql3	="select count(*) "
					+"from  application_arrest_prove aap "
					+"inner join book_impeachment bi on bi.track_no=aap.track_no "
					+"inner join application_arrest aa on aa.track_no=aap.track_no "
					+"inner join legislation lg on lg.id=aa.legislation_id "
					+"inner join app_arrest_prove_exhibit ape on ape.track_no=aap.track_no ";
		//String sql4="union all "
		String sql4	="select count(*) "
					+"from application_outside_prove aop "
					+"inner join legislation lg on lg.id=aop.legislation_id ";

		pre(request,response);
	}

	public void list(HttpServletRequest request,HttpServletResponse response)throws Exception {
		request.setAttribute("p", request.getParameter("pap"));
		request.setAttribute("pageOut", request.getParameter("rdiSource"));
		
		String offcode_prove = request.getParameter("offcode_prove");
		request.setAttribute("offcode_prove", offcode_prove);
		String checkRadio = ParameterUtil.getStringParam("rdiSource", request);

		ApplicationArrestProve aap = new ApplicationArrestProve(db);

		String order="order by taken_date desc \n";
		String sql1="select  distinct aap.track_no, 'IN' sources, aap.exhibit_report_no, aap.taken_date, \n"
					+"to_char(aap.taken_date,'dd/mm/yyyy','NLS_CALENDAR=''THAI BUDDHA'' NLS_DATE_LANGUAGE=THAI') taken_date2, \n"
					+"bi.case_id, bi.case_date, to_char(bi.case_date,'dd/mm/yyyy','NLS_CALENDAR=''THAI BUDDHA'' NLS_DATE_LANGUAGE=THAI') case_date2, \n"
					+"aa.legislation_id, lg.legislation_name \n"
					+"from  application_arrest_prove aap \n"
					+"inner join book_impeachment bi on bi.track_no=aap.track_no \n"
					+"inner join application_arrest aa on aa.track_no=aap.track_no \n"
					+"inner join legislation lg on lg.id=aa.legislation_id \n"
					+"inner join app_arrest_prove_exhibit ape on ape.track_no=aap.track_no  \n";

		String sql2	="select  distinct aop.job_no track_no, 'OUT' sources, aop.prove_no exhibit_report_no, aop.prove_date, "
					+"to_char(aop.prove_date,'dd/mm/yyyy','NLS_CALENDAR=''THAI BUDDHA'' NLS_DATE_LANGUAGE=THAI') taken_date2, "
					+" aop.legislation_id, lg.legislation_name "
					+"from application_outside_prove aop "
					+"inner join legislation lg on lg.id=aop.legislation_id  ";

		String sql3	="select count(*) "
					+"from  application_arrest_prove aap "
					+"inner join book_impeachment bi on bi.track_no=aap.track_no "
					+"inner join application_arrest aa on aa.track_no=aap.track_no "
					+"inner join legislation lg on lg.id=aa.legislation_id "
					+"inner join app_arrest_prove_exhibit ape on ape.track_no=aap.track_no ";

		String sql4	="select count(*) "
					+"from application_outside_prove aop "
					+"inner join legislation lg on lg.id=aop.legislation_id ";

		pre(request,response);
		String ex_report_no1 = ParameterUtil.getStringParam("exhibit_report_no1", request);
		String ex_report_no2 = ParameterUtil.getStringParam("exhibit_report_no2", request);
		Date takendate1 = ParameterUtil.getDateParam("taken_date1", request);
		Date takendate2 = ParameterUtil.getDateParam("taken_date2", request);
		String Str_takendate1 = request.getParameter("taken_date1");
		String Str_takendate2 = request.getParameter("taken_date2");
		String CaseId1 = ParameterUtil.getStringParam("case_id1", request);
		String CaseId2 = ParameterUtil.getStringParam("case_id2", request);
		Date CaseDate1 = ParameterUtil.getDateParam("case_date1", request);
		Date CaseDate2 = ParameterUtil.getDateParam("case_date2", request);
		String Str_CaseDate1 = request.getParameter("case_date1");
		String Str_CaseDate2 = request.getParameter("case_date2");
		Long legislation =ParameterUtil.getLongParam("legislation_id", request);
		
		String out_case_id11 = ParameterUtil.getStringParam("case_id11", request);
		String out_case_id12 = ParameterUtil.getStringParam("case_id12", request);
		Date out_case_date11 = ParameterUtil.getDateParam("case_date11", request);
		Date out_case_date12 = ParameterUtil.getDateParam("case_date12", request);
		String Str_case_date11 = request.getParameter("case_date11");
		String Str_case_date12 = request.getParameter("case_date11");
		
		String wh2=" where aop.id not in (select nvl(application_outside_prove_item,0) from delivery_exhibit_item) and aop.prove_no is not null and aop.prove_date is not null and aop.offcode='" + offcode_prove + "' ";
		if((!out_case_id11.trim().equals(""))){
			wh2 += " and aop.prove_no >= '" + out_case_id11.trim() + "' ";
		}
		
		if((!out_case_id12.trim().equals(""))){
			wh2 += " and aop.prove_no <= '" + out_case_id12.trim() + "' ";
		}
		
		if((out_case_date11 != null)){
			wh2 += " and to_char(aop.prove_date,'yyyymmdd') >= '" + DateUtil.formatConditionDate(Str_case_date11) + "' ";
		}
		if((out_case_date12 != null)){
			wh2 += " and to_char(aop.prove_date,'yyyymmdd') <= '" + DateUtil.formatConditionDate(Str_case_date12) + "' ";
		}
		
		String wh1="where ape.status='1' and ape.app_arrest_prove_exhibit_id is null and ape.id not in (select nvl(app_arrest_prove_exhibit_id,0) from delivery_exhibit_item) and aap.exhibit_report_no is not null and  aap.taken_date is not null and aa.offcode='" + offcode_prove + "'  ";
		if(legislation != null){
			wh1 += " and lg.id = '" + legislation + "' ";
			wh2 += " and lg.id = '" + legislation + "' ";
		}
		
		if((!ex_report_no1.trim().equals(""))){
			wh1 += " and aap.exhibit_report_no >= '" + ex_report_no1.trim() + "' ";
		}
		
		if((!ex_report_no2.trim().equals(""))){
			wh1 += " and aap.exhibit_report_no <= '" + ex_report_no2.trim() + "' ";
		}
		
		if((takendate1 != null)){
			wh1 += " and to_char(aap.taken_date,'yyyymmdd') >= '" + DateUtil.formatConditionDate(Str_takendate1) + "' ";
		}
		
		if((takendate2 != null)){
			wh1 += " and to_char(aap.taken_date,'yyyymmdd') <= '" + DateUtil.formatConditionDate(Str_takendate2) + "' ";
		}
		
		if((!CaseId1.trim().equals(""))){
			wh1 += " and bi.case_id >= '" + CaseId1.trim() + "' ";
		}
		
		if((!CaseId2.trim().equals(""))){
			wh1 += " and bi.case_id <= '" + CaseId2.trim() + "' ";
		}
		
		if((CaseDate1 != null)){
			wh1 += " and to_char(bi.case_date,'yyyymmdd') >= '" + DateUtil.formatConditionDate(Str_CaseDate1) + "' ";
		}
		
		if((CaseDate2 != null)){
			wh1 += " and to_char(bi.case_date,'yyyymmdd') <= '" + DateUtil.formatConditionDate(Str_CaseDate2) + "' ";
		}
		
		List<Map<String,Object>> aalinapp = new ArrayList<Map<String,Object>>();
	
		if(checkRadio.trim().equals("IN")){
			String sqlIn = sql1+wh1+order.toString();
			Integer totalRow = aap.countBySql("select count (*) from (" + sqlIn + ")", null);
			pageUtil.setTotalRow(totalRow);
			//log.debug(sqlIn);

			List<Map<String,Object>> aap_list = aap.findBySql(sqlIn,null,pageUtil);
			request.setAttribute("aapList", aap_list);
			for(int j=0;j<aap_list.size();j++){
				String aaesql;
				
				aaesql = 
				" select ape.id app_arrest_prove_exhibit_id, aap.track_no,ape.product_code, 'IN' sources, aap.exhibit_report_no, nvl(ape.product_name,dt.duty_name) product_name, " + 
				" replace(nvl(ape.brand_name,nvl(bm.brand_main_thai, bm.brand_main_eng)),'" + Character.toString('"') + "','" + "\\" + "\"" + "') brand_name,"+ 
				" ape.sizes_desc || ' ' || nvl(ape.sizes_unit_name,us.thname) size_desc, ape.size_unit_code, nvl(ape.qty_unit_name,nvl(uq.thname,uq.enname)) unit_name, ape.NETWEIGHT_UNIT_CODE UNIT_NETWEIGHT,ape.NETWEIGHT,"+
				" ape.qty arrest_qty, dei.prove_qty  prove_qty,ape.brand_code,ape.isdomestic,"+
				" aa.legislation_id, lg.legislation_name, ti.title_name || st.first_name || ' ' || st.last_name title_name, pke_arrest.getArrestLawbreaker(aa.track_no) lawbreaker_name"+
				" from app_arrest_prove_exhibit ape"+
				" left join duty_table dt on dt.duty_code=ape.duty_code " +
				" left join brand_main bm on bm.brand_main_code=ape.brand_code and ape.group_id=bm.group_id "+
				" left join unit uq on uq.unit_code=ape.qty_unit_code"+
				" left join unit us on us.unit_code=ape.size_unit_code"+
				" inner join application_arrest_prove aap on ape.track_no=aap.track_no"+
				" inner join application_arrest aa on aa.track_no=aap.track_no"+
				" inner join legislation lg on lg.id=aa.legislation_id"+
				" left join delivery_exhibit_item dei on dei.app_arrest_prove_exhibit_id=ape.id"+
				" inner join v_accuser_list_popup st on st.idcard_no=aa.accuser_idcardno"+
				" left join title ti on ti.title_code=st.title_code"+
				" where ape.status='1' and ape.app_arrest_prove_exhibit_id is null" +
				" and ape.track_no = ? and ape.id not in (select nvl(di.app_arrest_prove_exhibit_id,0) from delivery_exhibit_item di) ";

				ApplicationArrest aae = new ApplicationArrest(db);
				List<Map<String,Object>> inapp_list = aae.findBySql(aaesql,aap_list.get(j).get("track_no"));
				request.setAttribute("inaaplist"+j, inapp_list);
				
				for(int k=0;k<inapp_list.size();k++){
					aalinapp.add( inapp_list.get(k));
				}
			}
		}
		
		if(checkRadio.trim().equals("OUT")){
			//log.debug("countBySql="+sql4+where2.toString());
			Integer totalRow = aap.countBySql(sql4+wh2, null);
			pageUtil.setTotalRow(totalRow);

			List<Map<String,Object>> aap_list = aap.findBySql(sql2+wh2,null,pageUtil);
			request.setAttribute("aapList", aap_list);
			
			for(int j=0;j<aap_list.size();j++){
				String aaesql;
				
				aaesql = 
					" select aoi.id application_outside_prove_item, aop.job_no track_no,aoi.product_code, 'OUT' sources, aop.prove_no exhibit_report_no,  nvl(dt.duty_name, dg.group_name) product_name, nvl(bm.brand_main_thai, bm.brand_main_eng) brand_name,"+
					" sp.size_desc, aoi.sizes_code size_unit_code, nvl(us.thname,us.enname) unit_name,  aoi.UNIT_NETWEIGHT,aoi.NETWEIGHT, uq.thname size_unit_name, "+
					" aoi.qty  arrest_qty, dei.prove_qty prove_qty,aoi.brand_code,aoi.isdomestic,"+
					" aop.legislation_id, lg.legislation_name, null title_name,null lawbreaker_name "+
					" from application_outside_prove_item aoi "+
					" left join product pd on pd.product_code=aoi.product_code"+
					" left join brand_main bm on bm.brand_main_code=aoi.brand_code and aoi.group_id=bm.group_id"+
					" left join unit uq on uq.unit_code=aoi.unit_size"+
					" left join size_package sp on sp.size_code=aoi.sizes_code and aoi.group_id=sp.group_id"+
					" left join unit us on us.unit_code=aoi.unit_qty"+
					" left join application_outside_prove aop on aop.id=aoi.application_outside_prove_id"+
					" left join legislation lg on lg.id=aop.legislation_id"+
					" left join delivery_exhibit_item dei on dei.application_outside_prove_item=aoi.id"+
					" left join duty_table dt on dt.duty_code=aoi.duty_code " +
					" left join duty_group dg on dg.group_id=aoi.group_id " +
					" where "+
					" aop.job_no = ?  and "+
					" aoi.id not in (select nvl(di.application_outside_prove_item,0) from delivery_exhibit_item di)"; 

				ApplicationArrest aae = new ApplicationArrest(db);
				List<Map<String,Object>> inapp_list = aae.findBySql(aaesql,aap_list.get(j).get("track_no"));
				request.setAttribute("inaaplist"+j, inapp_list);
				
				for(int k=0;k<inapp_list.size();k++){
					aalinapp.add( inapp_list.get(k));		
				}
			}
		}

		request.setAttribute("allapplist", aalinapp);
		forward("/Popup/send_exhibit_add.jsp", request, response);
	}
	@Override
	public void _default(HttpServletRequest request, HttpServletResponse response) throws Exception {
		// TODO Auto-generated method stub
		
		request.setAttribute("p", request.getParameter("pap"));
		request.setAttribute("offcode_prove", request.getParameter("offcode_prove"));
		pre(request,response);
		forward("/Popup/send_exhibit_add.jsp", request, response);
	}
}
