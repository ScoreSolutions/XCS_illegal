
package com.ko.webapp.action;

import java.text.Format;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Map;
import com.ko.util.RunningKey;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.apache.commons.lang.time.DateUtils;

import com.ko.service.ProductUnitService;
import com.ko.util.DateUtil;
import com.ko.webapp.util.ParameterUtil;
import com.ko.domain.*;
//import com.sun.corba.se.impl.javax.rmi.CORBA.Util;
import com.sun.org.apache.xalan.internal.xsltc.runtime.Parameter;


public class StepAction  extends BaseAction {
	
	public void pre(HttpServletRequest request,	HttpServletResponse response) throws Exception {
		Legislation lt = new Legislation(db);
		List<Legislation> ltlist = lt.findByWhere(" 1=1 order by legislation_name", null);
		request.setAttribute("ltlist", ltlist);
		if(uData.IsAdmin()==true)
			request.setAttribute("IsAdmin", "1");
		
		request.setAttribute("offcode", uData.getOffcode());
		request.setAttribute("offname", uData.getOffname());
		//
	}
	
	String menuID = "28";
	
	public void _default(HttpServletRequest request,
			HttpServletResponse response) throws Exception {
		// TODO Auto-generated method stub
           //System.out.println("Done");
		
		if(uData.chkUserMenu(menuID)==true){
           pre(request,response);
           
           forward("?page=/Lawbreaker/step_proceed_list.jsp", request, response);
		}else{
    		HttpSession session = request.getSession();
  		  	session.invalidate();
  		  	request.setAttribute("errMsg", "ผู้ใช้ไม่มีสิทธิ์ดำเนินการ");
  		  	forward("?page=/login.jsp", request, response);
    	}
	}

	public void list(HttpServletRequest request,HttpServletResponse response)throws Exception{
		pre(request,response);
		ApplicationSincereConfirm aad = new ApplicationSincereConfirm(db);
		String sql;
		//ApplicationArrest maxid = new ApplicationArrest(db);

		sql = 
			" select distinct aa.track_no, pke_arrest.getArrestLawbreaker(aa.track_no)  lawbreaker_name,"+
			" pke_arrest.getArrestIndictment(aa.track_no) guilt_base,"+
			" aa.occurrence_date, to_char(aa.occurrence_date, 'dd/mm/yyyy', 'NLS_CALENDAR=''THAI BUDDHA'' NLS_DATE_LANGUAGE=THAI') occurrence_date2,"+
			" bi.case_date, to_char(bi.case_date, 'dd/mm/yyyy', 'NLS_CALENDAR=''THAI BUDDHA'' NLS_DATE_LANGUAGE=THAI') case_date2,"+
			" cc.compare_case_date, to_char(cc.compare_case_date, 'dd/mm/yyyy', 'NLS_CALENDAR=''THAI BUDDHA'' NLS_DATE_LANGUAGE=THAI') compare_case_date2,bi.case_id," +
			" tia.title_name || sta.first_name || ' ' || sta.last_name accuser_name, aa.legislation_id, lg.legislation_name,"+
			" aa.product_group_id, dg.group_name product_group_name, cc.compare_case_no, aap.exhibit_report_no, cc.case_total_fine case_fine, "+
			" pke_compare.getCaseStatus(aa.track_no,'1') compare_status_name, " +
			" pke_master.fn_show_address(sd.subdistrict_code, d.district_code, pv.province_code,'Y') scene_address "+
			" from book_impeachment bi "+
			" inner join application_arrest aa on aa.track_no=bi.track_no"+
			" left join application_arrest_indictment aai on aa.track_no=aai.track_no"+
			" left join indictment inc on inc.indictment_id=aai.indictment_id"+
			" left join application_arrest_lawbreaker aal on aa.track_no=aal.track_no"+
			" left join lawbreaker lb on lb.lawbreaker_no=aal.lawbreaker_no"+
			" left join title tt on tt.title_code=aal.title_code"+
			" left join title tc on tc.title_code=aal.company_title_code"+
			" left join v_accuser_list_popup sta on sta.idcard_no=aa.accuser_idcardno"+
			" left join title tia on tia.title_code=sta.title_code"+
			" left join application_arrest_exhibit aae on aa.track_no=aae.track_no"+
			" left join duty_table dt on dt.duty_code=aae.duty_code " +
			" inner join legislation lg on lg.id=aa.legislation_id"+
			" inner join duty_group dg on dg.group_id=aa.product_group_id"+
			" left join province pv on pv.province_code=aa.scene_province"+
			" left join district d on d.district_code=aa.scene_district"+
			" left join subdistrict sd on sd.subdistrict_code=aa.scene_subdistrict"+
			" left join compare_case cc on cc.track_no=aa.track_no"+
			" left join application_arrest_prove aap on aa.track_no=aap.track_no"+
			" inner join ed_office ed on ed.offcode=aa.offcode"+
			" left join application_arrest_license ali on aa.track_no=ali.track_no"+
			" left join application_notice_arrest ana on ana.id=aa.application_notice_arrest_id"+
			" left join application_search_warrant asw on asw.id=aa.application_search_warrant_id"+
			" left join application_sincere_confirm asi on asi.id=aa.application_sincere_confirm_id"+
			" where aa.del_flag='N' and pke_arrest.getCaseLast(aa.track_no) = 0 ";
			
		com.ko.webapp.util.ArrestUtil whTxt = new com.ko.webapp.util.ArrestUtil();
		String whText = "";
		whText += whTxt.getArrestWhere(request);
		this.writeTranLog("ค้นหาข้อมูลสถานะคดี");

		System.out.println(sql + whText);
		List<Map<String,Object>> dblist =  aad.findBySql(sql + whText + " order by lg.legislation_name desc, bi.case_date desc ", null);
		
		String countsql = "select count(*) from (" + sql + whText + ")";
		Integer totalRow = aad.countBySql(countsql, null);
        pageUtil.setTotalRow(totalRow);
        pageUtil.setPageSize(20);

        request.setAttribute("offcode", request.getParameter("offcode"));
        request.setAttribute("offname", request.getParameter("offname"));
		request.setAttribute("dblist", dblist);
		forward("?page=/Lawbreaker/step_proceed_list.jsp", request, response);
	}
	
	
	
	   public boolean isNumeric(String s) {
		   try{
			   return s.matches("[-+]?\\d*\\.?\\d+");
		   }catch (Exception e) {
			   return false ;
		}

		      }

}
