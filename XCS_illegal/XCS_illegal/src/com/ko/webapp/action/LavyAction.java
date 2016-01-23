
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


public class LavyAction  extends BaseAction {
	public void preup(HttpServletRequest request,	HttpServletResponse response) throws Exception {
		pre(request, response);
		Seize se = new Seize(db);
		Seize sei = new Seize(db);
		String sql ;
		sql = 
			" select aae.track_no,"+
			 " nvl(aae.duty_name,dt.duty_name) || case when nvl(aae.brand_name,nvl(bm.brand_main_thai, bm.brand_main_eng)) is not null then nvl(aae.brand_name,nvl(bm.brand_main_thai, bm.brand_main_eng)) else '' end product_name," +
			 " aae.qty || ' ' || nvl(aae.qty_unit_name,u.thname) qty,aae.remarks" +
			" from application_arrest_exhibit aae "+
			" left join brand_main bm on bm.brand_main_code = aae.brand_code and bm.group_id = aae.group_id"+
			" left join unit u on u.unit_code = aae.qty_unit_code "+
			" left join duty_table dt on dt.duty_code=aae.duty_code"+
			" where aae.track_no = ?";

		se = se.findByPk(ParameterUtil.getLongParam("id", request));
		List<Map<String, Object>> seilist = sei.findBySql(sql,se.getTrack_no()); 
		
		//log.debug("IsSave = " + request.getParameter("isSave"));
		if(request.getParameter("isSave") != null){
			request.setAttribute("isSave", "1");
			//log.debug("issave");
		}
			
		
		request.setAttribute("db", se);
		request.setAttribute("seilist", seilist);
		request.setAttribute("action","process?action=Lavy&id="+ParameterUtil.getLongParam("id", request)+"&cmd=preup");
		this.writeTranLog("แสดงรายละเอียดการอายัดทรัพย์สิน");
		forward("?page=/Protect/lavy_edit.jsp", request,response);

	}
	public void pre(HttpServletRequest request,	HttpServletResponse response) throws Exception {
		Legislation lt = new Legislation(db);
		List<Legislation> ltlist = lt.findByWhere(" 1=1 order by legislation_name", null);
		DutyGroup dg = new DutyGroup(db);
		
		List<Map<String,Object>> dglist = dg.findBySql("select group_id, group_name from duty_group where group_status='N' order by  NLSSORT(UPPER(group_name), 'NLS_SORT = THAI_DICTIONARY')", null);
		
		EdOffice ed = new EdOffice(db);
		List<EdOffice> edlist =  ed.findByWhere(" 1=1 order by offname", null);
		log.debug("edlist : "+edlist.size());
		request.setAttribute("edlist", edlist);
		//findByWhere(GROUP_ID , obj)

		log.debug(ltlist);
		request.setAttribute("ltlist", ltlist);
		request.setAttribute("dglist", dglist);

		

	}
	String menuID = "8";
	public void _default(HttpServletRequest request,
			HttpServletResponse response) throws Exception {
		// TODO Auto-generated method stub
		if(uData.chkUserMenu(menuID)==true){
			request.setAttribute("action","process?action=Lavy&cmd=add");
			pre(request,response);
			forward("?page=/Protect/lavy_search.jsp", request, response);
		}else{
    		HttpSession session = request.getSession();
  		  	session.invalidate();
  		  	request.setAttribute("errMsg", "ผู้ใช้ไม่มีสิทธิ์ดำเนินการ");
  		  	forward("?page=/login.jsp", request, response);
    	}
	}

	
	public void add(HttpServletRequest request,HttpServletResponse response)throws Exception{
	
		//pre(request, response);
        
		this.writeTranLog("เพิ่มข้อมูลการอายัดทรัพย์สิน");
		request.setAttribute("action","process?action=Lavy&cmd=add");
		
		forward("?page=/Protect/lavy_form.jsp", request, response);

	}
	public void update(HttpServletRequest request,HttpServletResponse response)throws Exception{
	       Seize se =new Seize(db);
	       
	       se= se.findByPk(ParameterUtil.getLongParam("se_id", request));
	       se.setTrack_no(ParameterUtil.getStringParam("track_no", request));
	       se.setOrder_no(ParameterUtil.getStringParam("order_no", request));
	       se.setSeize_date(DateUtil.getDateFromString(ParameterUtil.getStringParam("seize_date", request)));
	       se.setSeize_location(ParameterUtil.getStringParam("seize_location", request));
	       se.setCancel_date(DateUtil.getDateFromString(ParameterUtil.getStringParam("cancel_date", request)));
	       se.setLimit_date(DateUtil.getDateFromString(ParameterUtil.getStringParam("limit_date", request)));
	       se.setUpdate_by(update_by);
	        se.setUpdate_on(update_on);
	        se = se.update();
        //log.debug("si = "+se);
        this.writeTranLog("บันทึกข้อมูลการอายัดทรัพย์สิน");
  
        redirect("process?action=Lavy&id="+se.getId()+"&isSave=1&cmd=preup", request, response);
	}
	public void create(HttpServletRequest request,HttpServletResponse response)throws Exception{

        Seize se =new Seize(db);
        se.setTrack_no(ParameterUtil.getStringParam("track_no", request));
        se.setOrder_no(ParameterUtil.getStringParam("order_no", request));
        se.setSeize_date(DateUtil.getDateFromString(ParameterUtil.getStringParam("seize_date", request)));
        se.setSeize_location(ParameterUtil.getStringParam("seize_location", request));
        se.setCancel_date(DateUtil.getDateFromString(ParameterUtil.getStringParam("cancel_date", request)));
        se.setLimit_date(DateUtil.getDateFromString(ParameterUtil.getStringParam("limit_date", request)));
        se.setCreate_by(create_by);
        se.setCreate_on(create_on);
        
        se = se.create();
        this.writeTranLog("บันทึกข้อมูลการอายัดทรัพย์สิน");

		redirect("process?action=Lavy&id="+se.getId()+"&isSave=1&cmd=preup", request, response);
	}
	public void list(HttpServletRequest request,HttpServletResponse response)throws Exception{
		String slsql;
		String countsql;

		slsql = 
			" select s.id, s.order_no, s.seize_date, s.cancel_date,s.limit_date, aa.track_no," +
			" to_char(s.seize_date,'dd/mm/yyyy', 'NLS_CALENDAR=''THAI BUDDHA'' NLS_DATE_LANGUAGE=THAI') seize_date2,"+
			" to_char(s.cancel_date,'dd/mm/yyyy', 'NLS_CALENDAR=''THAI BUDDHA'' NLS_DATE_LANGUAGE=THAI') cancel_date2,"+
			" to_char(s.limit_date,'dd/mm/yyyy', 'NLS_CALENDAR=''THAI BUDDHA'' NLS_DATE_LANGUAGE=THAI') limit_date2,s.seize_location"+
			" from seize s"+
			" inner join application_arrest aa on aa.track_no=s.track_no";
		countsql = 
			" select count(*)"+
			" from seize s"+
			" inner join application_arrest aa on aa.track_no=s.track_no";
		
		pre(request, response);
		
		String whText =	" where s.del_flag = 'N' ";
		if(!request.getParameter("order_no").trim().equals(""))
			whText += " and s.order_no like '%" + request.getParameter("order_no").trim() + "%'";
		if(!request.getParameter("track_no").trim().equals(""))
			whText += " and aa.track_no like '%" + request.getParameter("track_no").trim() + "%'";
		if(!request.getParameter("seize_location").trim().equals(""))
			whText += "  AND s.seize_location like '%" + request.getParameter("seize_location").trim() + "%'";
		if(!request.getParameter("seize_date1").trim().equals(""))
			whText += " and to_char(s.seize_date,'yyyymmdd') >= '" + DateUtil.formatConditionDate(request.getParameter("seize_date1").trim()) + "'";
		if(!request.getParameter("seize_date2").trim().equals(""))
			whText += " and to_char(s.seize_date,'yyyymmdd') <= '" + DateUtil.formatConditionDate(request.getParameter("seize_date2").trim()) + "'";
		if(!request.getParameter("cancel_date1").trim().equals(""))
			whText += " and to_char(s.cancel_date,'yyyymmdd') >= '" + DateUtil.formatConditionDate(request.getParameter("cancel_date1").trim()) + "'";
		if(!request.getParameter("cancel_date2").trim().equals(""))
			whText += " and to_char(s.cancel_date,'yyyymmdd') <= '" + DateUtil.formatConditionDate(request.getParameter("cancel_date2").trim()) + "'";

		Seize se = new Seize(db);
		Integer totalRow = se.countBySql(countsql+whText, null);
		pageUtil.setTotalRow(totalRow);
		pageUtil.setPageSize(20);
		//log.debug(sql);
		List<Map<String, Object>> dblist = se.findBySql(slsql+whText + " order by s.seize_date desc ", null,pageUtil);
		//log.debug(dblist);
		//log.debug(dblist);
		
		request.setAttribute("dblist", dblist);
		request.setAttribute("rowCount", dblist.size());
		this.writeTranLog("ค้นหาข้อมูลการอายัดทรัพย์สิน");
		forward("?page=/Protect/lavy_search.jsp", request, response);
	}
	

	public void del(HttpServletRequest request,HttpServletResponse response)throws Exception{
		//log.debug("delete"+request.getParameter("id"));
		Long id = new Long(request.getParameter("id"));
		Seize aa = new Seize(db);
		aa = aa.findByPk(id);
		aa.setDel_flag("Y");
		aa.setDel_date(new Date());
		//aa.setDel_idcardno();
		aa.update();
		aa.setId(id);
		//log.debug(aa);
		//log.debug("delete"+request.getParameter("id"));
		forward("?page=/Protect/lavy_search.jsp", request, response);
			
	}
	
	
	   public boolean isNumeric(String s) {
		   try{
			   return s.matches("[-+]?\\d*\\.?\\d+");
		   }catch (Exception e) {
			   return false ;
		}

		      }
	   
		
		
		

}
