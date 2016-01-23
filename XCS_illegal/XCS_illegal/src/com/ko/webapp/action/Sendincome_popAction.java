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
import com.ko.util.DateUtil;
import com.ko.webapp.util.PageUtil;
import com.ko.webapp.util.ParameterUtil;

public class Sendincome_popAction extends BaseAction{

	public void list(HttpServletRequest request,HttpServletResponse response)throws Exception {
		
		request.setAttribute("pageOut", request.getParameter("rdiSource"));
		String checkRadio = ParameterUtil.getStringParam("rdiSource", request);
		
		searchData(request,response);
		forward("/Popup/send_income_add.jsp", request, response);
	}
	@Override
	public void _default(HttpServletRequest request, HttpServletResponse response) throws Exception {
		// TODO Auto-generated method stub
		searchData(request,response);
		forward("/Popup/send_income_add.jsp", request, response);
	}
	
	private void searchData(HttpServletRequest request, HttpServletResponse response) throws Exception {
		request.setAttribute("p", request.getParameter("pap"));
		request.setAttribute("send_offcode", request.getParameter("send_offcode"));
		
		ApplicationArrestProve aap = new ApplicationArrestProve(db);
		V_COMPARE_CASE_POPUP vcc = new V_COMPARE_CASE_POPUP(db);
		//StringBuffer where1=new StringBuffer(" ");
		
		String send_offcode = (request.getParameter("send_offcode") != null ? request.getParameter("send_offcode") : "");
		String compare_case_no1 = (request.getParameter("compare_case_no1") != null ? request.getParameter("compare_case_no1") : "");
		String compare_case_no2 = (request.getParameter("compare_case_no2") != null ? request.getParameter("compare_case_no2") : "");
		String compare_case_date1 = (request.getParameter("compare_case_date1") != null ? DateUtil.formatConditionDate(request.getParameter("compare_case_date1")) : "");
		String compare_case_date2 = (request.getParameter("compare_case_date2") != null ? DateUtil.formatConditionDate(request.getParameter("compare_case_date2")) : "");
		String legislation = (request.getParameter("legislation_id") != null ? request.getParameter("legislation_id") : request.getParameter("pap"));
		
		String whText=" where compare_case_id not in (select nvl(sic.compare_case_id,0) from send_income_case sic inner join send_income si on si.id=sic.send_income_id where si.status <> '2') and pay_date is not null \n";
		String wh = "";
		if(!compare_case_no1.equals(""))
			wh += " and compare_case_no >= '" + compare_case_no1 + "' \n";
		if(!compare_case_no2.equals(""))
			wh += " and compare_case_no <= '" + compare_case_no2 + "' \n";
		if(!compare_case_date1.equals(""))
			wh += " and to_char(compare_case_date,'yyyymmdd') >= '" + compare_case_date1 + "' \n";
		if(!compare_case_date2.equals(""))
			wh += " and to_char(compare_case_date,'yyyymmdd') <= '" + compare_case_date2 + "' \n";
		if(!legislation.equals(""))
			wh += " and legislation_id = '" + legislation + "' \n";
		if(!send_offcode.equals(""))
			wh += " and compare_office = '" + send_offcode + "' \n";
		

		String sql1="select compare_case_id, compare_case_no, compare_case_date, compare_case_date2, \n";
		sql1 += " legislation_id, legislation_name,product_group_id, group_name,offcode,offname,\n";
		sql1 += " trim(to_char(fine_money,'999G999G990D99MI')) fine_money, trim(to_char(birbe_money,'999G999G990D99MI')) birbe_money, \n";
		sql1 += " trim(to_char(reward_money,'999G999G990D99MI')) reward_money, trim(to_char(treasury_money,'999G999G999D99MI')) treasury_money,\n";
		sql1 += " status_code, status_name, lawbreaker_qty, lawbreaker_name, inv_no, pay_date, 'COMPARE_CASE' ref_type \n";
		sql1 += " from V_COMPARE_CASE_POPUP \n";
		sql1 += whText + wh;
		
		sql1 += " union all \n";
		sql1 += " select cc.id compare_case_id, cc.compare_case_no, ccc.change_date , \n";
		sql1 += " TO_CHAR (ccc.change_date , 'dd/mm/yyyy','NLS_CALENDAR=''THAI BUDDHA'' NLS_DATE_LANGUAGE=THAI') compare_case_date2, \n";
		sql1 += " aa.legislation_id, lg.legislation_name, aa.product_group_id,dg.group_name,aa.offcode,ed.offname, \n";
		sql1 += "  trim(to_char((ccc.change_money-ccc.case_fine_old)*pke_arrest.getLawBreakerQty(cc.track_no),'999G999G990D99MI')) fine_money, \n";
		sql1 += " trim(to_char((((ccc.change_money-ccc.case_fine_old)*cc.bribe_money_p)/100)*pke_arrest.getLawBreakerQty(cc.track_no),'999G999G990D99MI')) bribe_money, \n";
		sql1 += " trim(to_char((((ccc.change_money-ccc.case_fine_old)*cc.reward_money_p)/100)*pke_arrest.getLawBreakerQty(cc.track_no),'999G999G990D99MI')) reward_money, \n";
		sql1 += " trim(to_char((((ccc.change_money-ccc.case_fine_old)*cc.treasury_money_p)/100)*pke_arrest.getLawBreakerQty(cc.track_no),'999G999G990D99MI')) treasury_money, \n";
		sql1 += " pke_compare.getCompareStatus (aa.track_no, '0') status_code, \n";
		sql1 += " pke_compare.getCompareStatus (aa.track_no, '1') status_name, \n";
		sql1 += " pke_arrest.getLawBreakerQty(cc.track_no) lawbreaker_qty, \n";
		sql1 += " pke_arrest.getArrestLawbreaker (cc.track_no) lawbreaker_name, \n";
		sql1 += " pke_compare.getChangeInvNo(ccc.id) inv_no, ccc.change_date,  'COMPARE_CASE_CHANGE' ref_type \n";
		sql1 += " from compare_case cc \n";
		sql1 += " inner join compare_case_change ccc on cc.id=ccc.compare_case_id \n";
		sql1 += " inner join application_arrest aa on aa.track_no=cc.track_no \n";
		sql1 += " inner join legislation lg on lg.id=aa.legislation_id \n";
		sql1 += " inner join duty_group dg on dg.group_id=aa.product_group_id \n";
		sql1 += " inner join ed_office ed on ed.offcode=aa.offcode \n";
		sql1 += " where ccc.change_type='1' and ccc.send_income_status='1' \n";
		sql1 += wh;
		

		String sql3	="select count(*) from (" + sql1 + ")  ";

		
		
		List<Map<String,Object>> aalinapp = new ArrayList<Map<String,Object>>();
		for(int j=0;j<10;j++){
			Map<String,Object> inapp_list = new HashMap<String, Object>();
			request.setAttribute("inaaplist"+j, inapp_list);
		}
		
		//log.debug("countBySql="+sql3+whText);
		Integer totalRow = aap.countBySql(sql3, null);
		pageUtil.setTotalRow(totalRow);
		log.debug("sql::"+sql1);
		
		
		List<Map<String,Object>> aap_list = aap.findBySql(sql1,null,pageUtil);
		//log.debug(aap_list);
		request.setAttribute("aapList", aap_list);
	
		for(int j=0;j<aap_list.size();j++){
			String aaesql;
			
			aaesql = 
			" select ape.id app_arrest_prove_exhibit_id, aap.track_no,ape.product_code, 'IN' sources, aap.exhibit_report_no, "+ 
			" nvl(ape.product_name,dt.duty_name) product_name, nvl(ape.brand_name,nvl(bm.brand_main_thai, bm.brand_main_eng)) brand_name,"+ 
			" nvl(ape.sizes_desc,sp.size_desc) size_desc, ape.size_unit_code, nvl(ape.sizes_unit_name,us.thname) unit_name, ape.NETWEIGHT_UNIT_CODE UNIT_NETWEIGHT,ape.NETWEIGHT,"+
			" ape.qty arrest_qty, dei.prove_qty  prove_qty,"+
			" aa.legislation_id, lg.legislation_name, ti.title_name || st.first_name || ' ' || st.last_name title_name, pke_arrest.getArrestLawbreaker(aa.track_no) lawbreaker_name"+
			" from app_arrest_prove_exhibit ape"+
			" left join brand_main bm on bm.brand_main_code=ape.brand_code and ape.group_id=bm.group_id"+
			" left join unit uq on uq.unit_code=ape.qty_unit_code"+
			" left join size_package sp on sp.size_code=ape.sizes_code and ape.group_id=sp.group_id "+
			" left join unit us on us.unit_code=ape.size_unit_code"+
			" inner join application_arrest_prove aap on ape.track_no=aap.track_no"+
			" inner join application_arrest aa on aa.track_no=aap.track_no"+
			" inner join legislation lg on lg.id=aa.legislation_id"+
			" left join delivery_exhibit_item dei on dei.app_arrest_prove_exhibit_id=ape.id"+
			" inner join v_accuser_list_popup st on st.idcard_no=aa.accuser_idcardno"+
			" left join title ti on ti.title_code=st.title_code"+
			" left join duty_table dt on dt.duty_code=ape.duty_code"+
			" where ape.status='1' and ape.app_arrest_prove_exhibit_id is null" +
			" and ape.track_no = ? and ape.id not in (select nvl(di.app_arrest_prove_exhibit_id,0) from delivery_exhibit_item di) ";
			
			log.debug(aaesql);
			ApplicationArrest aae = new ApplicationArrest(db);
			List<Map<String,Object>> inapp_list = aae.findBySql(aaesql,aap_list.get(j).get("track_no"));
			//log.debug("inaaplist"+j+"exgame"+inapp_list);
			request.setAttribute("inaaplist"+j, inapp_list);	
		}
		
		//log.debug(aalinapp);
		request.setAttribute("allapplist", aalinapp);
	}

}
