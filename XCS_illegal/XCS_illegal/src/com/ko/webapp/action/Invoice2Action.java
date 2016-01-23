
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


public class Invoice2Action  extends BaseAction {
	public void preup(HttpServletRequest request,	HttpServletResponse response) throws Exception {
		pre(request, response);
		ApplicationOutsideProve si = new ApplicationOutsideProve(db);
		String sql ;
		
		sql = 
			" select inv.id , inv.inv_bookno ,inv.INV_NO,inv.INV_DATE,inv.COMPARE_CASE_ID," +
			" inv.interior_fine,inv.interior_remarks,inv.tax_fine,inv.tax_remarks,"+
			" vcc.compare_case_date,vcc.group_name,vcc.COMPARE_CASE_NO,"+
			" vcc.STATUS_NAME,vcc.lawbreaker_name,"+
			" to_char(vcc.compare_case_date,'dd/mm/yyyy', 'NLS_CALENDAR=''THAI BUDDHA'' NLS_DATE_LANGUAGE=THAI') compare_case_date2,"+
			" to_char(inv.inv_date,'dd/mm/yyyy', 'NLS_CALENDAR=''THAI BUDDHA'' NLS_DATE_LANGUAGE=THAI') inv_date2,"+
			" inv.STAFF_RECEIVE,inv.POSCODE_RECEIVE,inv.OFFCODE_RECEIVE,"+
			" inv.SEND_BOOKNO,inv.SEND_NO,tt.title_name||vsp.first_name||' '||vsp.last_name staff_receive_name,"+
			" ps.posname || ' ' || vsp.staff_level posname"+
			" from invoice2 inv"+
			" left join V_STAFF_LIST_POPUP  vsp on vsp.idcard_no=inv.staff_receive"+
			" inner join V_COMPARE_CASE_POPUP vcc on vcc.COMPARE_CASE_ID= inv.COMPARE_CASE_ID"+
			" left join title tt on tt.title_code = vsp.title_code"+
			" left join position ps on ps.poscode = inv.poscode_receive"+
			" where inv.id = ? ";
		
		
		//System.out.println(sql);
		Map<String, Object> simap =null;
		//System.out.println(listsql);
		if(si.findBySql(sql,ParameterUtil.getLongParam("id", request)).size()>0){
			simap = si.findBySql(sql,ParameterUtil.getLongParam("id", request)).get(0);
		}
		//List<Map<String, Object>> listsc = si.findBySql(listsql,ParameterUtil.getLongParam("id", request));
		si = si.findByPk(ParameterUtil.getLongParam("id", request));
		//System.out.println(simap);
		//System.out.println(si);
		request.setAttribute("db", simap);
		request.setAttribute("si", si);
		request.setAttribute("staff_receive", simap.get("staff_receive").toString());
		request.setAttribute("poscode_receive", simap.get("poscode_receive").toString());
		request.setAttribute("offcode_receive", simap.get("offcode_receive").toString());
		request.setAttribute("staff_receive_name", simap.get("staff_receive_name").toString());
		request.setAttribute("posname_receive", simap.get("posname").toString());
		request.setAttribute("action","process?action=Invoice2&id="+ParameterUtil.getLongParam("id", request)+"&cmd=preup");
		
		this.writeTranLog("แสดงรายละเอียดใบเสร็จรับเงินแบบที่ 2");
		forward("?page=/CompareCase/invoice2_edit.jsp", request,response);

	}
	public void pre(HttpServletRequest request,	HttpServletResponse response) throws Exception {
		Legislation lt = new Legislation(db);
		List<Legislation> ltlist = lt.findByWhere(" 1=1 order by legislation_name", null);
		DutyGroup dg = new DutyGroup(db);
		List<Map<String,Object>> dglist = dg.findBySql("select group_id, group_name from duty_group where group_status='N' order by  NLSSORT(UPPER(group_name), 'NLS_SORT = THAI_DICTIONARY')", null);

		
		DutyStatu ds = new DutyStatu(db);
		List<DutyStatu> dslist =  ds.findByWhere(" id not in(1,2)", null);
		log.debug("dslist::"+dslist.toString());
		request.setAttribute("dslist", dslist);
		log.debug(ltlist);
		request.setAttribute("ltlist", ltlist);
		request.setAttribute("dglist", dglist);
		
		 EdOffice ed = new EdOffice(db);
			List<EdOffice> edlist =  ed.findByWhere(" 1=1 order by offname", null);
			log.debug("edlist : "+edlist.size());
			request.setAttribute("edlist", edlist);

		
	}
	
	String menuID = "16";
	public void _default(HttpServletRequest request,
			HttpServletResponse response) throws Exception {
		// TODO Auto-generated method stub
		if(uData.chkUserMenu(menuID)==true){
           System.out.println("Done");
           this.writeTranLog("แสดงรายการใบเสร็จรับเงินแบบที่ 2");
           pre(request,response);
           request.setAttribute("offcode", uData.getOffcode());
           request.setAttribute("offname", uData.getShortName());
           if(uData.IsAdmin()==true)
        	   request.setAttribute("IsAdmin", "1");
           
           forward("?page=/CompareCase/invoice2_list.jsp", request, response);
		}else{
    		HttpSession session = request.getSession();
  		  	session.invalidate();
  		  	request.setAttribute("errMsg", "ผู้ใช้ไม่มีสิทธิ์ดำเนินการ");
  		  	forward("?page=/login.jsp", request, response);
    	}
	}

	
	public void add(HttpServletRequest request,HttpServletResponse response)throws Exception{
	
		pre(request, response);
		
		
		request.setAttribute("staff_receive", uData.getIdCard());
		request.setAttribute("poscode_receive", uData.getPoscode());
		request.setAttribute("offcode_receive", uData.getOffcode());
		request.setAttribute("staff_receive_name", uData.getFullName());
		request.setAttribute("posname_receive", uData.getPosname());
		request.setAttribute("action","process?action=Invoice2&cmd=add");
      //  pke_arrest(aal.id);
		this.writeTranLog("เพิ่มข้อมูลใบเสร็จรับเงินแบบที่ 2");
		forward("?page=/CompareCase/invoice2_form.jsp", request, response);

	}
	public void update(HttpServletRequest request,HttpServletResponse response)throws Exception{
		Invoice2 inv =new Invoice2(db);
	       inv= inv.findByPk(ParameterUtil.getLongParam("id", request));
        
	       inv.setInv_bookno(ParameterUtil.getStringParam("inv_bookno", request));
	        inv.setInv_no(ParameterUtil.getStringParam("inv_no", request));
	        inv.setCompare_case_id(ParameterUtil.getLongParam("compare_case_id", request));
	        inv.setInv_date(DateUtil.getDateFromString(ParameterUtil.getStringParam("inv_date", request)));
	        inv.setSend_bookno(ParameterUtil.getStringParam("send_bookno", request));
	        inv.setSend_no(ParameterUtil.getStringParam("send_no", request));
	        inv.setStaff_receive(ParameterUtil.getStringParam("staff_receive", request));
	        inv.setOffcode_receive(ParameterUtil.getStringParam("offcode_receive", request));
	        inv.setPoscode_receive(ParameterUtil.getStringParam("poscode_receive", request));
	        inv.setTax_fine(ParameterUtil.getLongParam("tax_fine", request));
	        inv.setTax_remarks(ParameterUtil.getStringParam("tax_remarks", request));
	        inv.setInterior_fine(ParameterUtil.getLongParam("interior_fine", request));
	        inv.setInterior_remarks(ParameterUtil.getStringParam("interior_remarks", request));
	        inv.setUpdate_by(update_by);
	        inv.setUpdate_on(update_on);
	        inv = inv.update();
        System.out.println("si = "+inv);
        this.writeTranLog("บันทึกข้อมูลใบเสร็จรับเงินแบบที่ 2");
       
        redirect("process?action=Invoice2&id="+inv.getId()+"&cmd=preup", request, response);
	}
	public void create(HttpServletRequest request,HttpServletResponse response)throws Exception{

        Invoice2 inv =new Invoice2(db);
       
        inv.setInv_bookno(ParameterUtil.getStringParam("inv_bookno", request));
        inv.setInv_no(ParameterUtil.getStringParam("inv_no", request));
        inv.setCompare_case_id(ParameterUtil.getLongParam("compare_case_id", request));
        inv.setInv_date(DateUtil.getDateFromString(ParameterUtil.getStringParam("inv_date", request)));
        inv.setSend_bookno(ParameterUtil.getStringParam("send_bookno", request));
        inv.setSend_no(ParameterUtil.getStringParam("send_no", request));
        inv.setStaff_receive(ParameterUtil.getStringParam("staff_receive", request));
        inv.setOffcode_receive(ParameterUtil.getStringParam("offcode_receive", request));
        inv.setPoscode_receive(ParameterUtil.getStringParam("poscode_receive", request));
        inv.setTax_fine(ParameterUtil.getLongParam("tax_fine", request));
        inv.setTax_remarks(ParameterUtil.getStringParam("tax_remarks", request));
        inv.setInterior_fine(ParameterUtil.getLongParam("interior_fine", request));
        inv.setInterior_remarks(ParameterUtil.getStringParam("interior_remarks", request));
        inv.setCreate_by(create_by);
        inv.setCreate_on(create_on);
        
       inv = inv.create();
       this.writeTranLog("บันทึกข้อมูลใบเสร็จรับเงินแบบที่ 2");
		redirect("process?action=Invoice2&id="+inv.getId()+"&cmd=preup", request, response);
	}
	public void list(HttpServletRequest request,HttpServletResponse response)throws Exception{
		DeliveryExhibit de = new DeliveryExhibit(db);
		String sql ="";
		String slsql;
		String countsql;
		DeliveryExhibit maxid = new DeliveryExhibit(db);

		ArrayList<String> alcon = new ArrayList();
		ArrayList<String> alin = new ArrayList();
		ArrayList<String> alconint = new ArrayList();
		ArrayList<Integer> alinint = new ArrayList();
		ArrayList<String> alcondate = new ArrayList();
		ArrayList<String> alindate = new ArrayList();
		ArrayList<String> alconcbox1 = new ArrayList();
		ArrayList<String> alincbox1 = new ArrayList();
		ArrayList<String> alconcbox2 = new ArrayList();
		ArrayList<String> alincbox2 = new ArrayList();
		ArrayList<String> alcontween = new ArrayList();
		ArrayList<Integer> alintween = new ArrayList();
		slsql = 
			" select inv.id , cc.compare_case_no, inv.inv_bookno, inv.inv_no, "+
			" cc.compare_case_date, to_char(cc.compare_case_date,'dd/mm/yyyy', 'NLS_CALENDAR=''THAI BUDDHA'' NLS_DATE_LANGUAGE=THAI') compare_case_date2,"+
			" inv.inv_date,to_char(inv.inv_date,'dd/mm/yyyy', 'NLS_CALENDAR=''THAI BUDDHA'' NLS_DATE_LANGUAGE=THAI') inv_date2,"+
			" pke_arrest.getArrestLawbreaker(cc.track_no) lawbreaker_name, cc.compare_office, ed.offname compare_offname, dg.group_name, ed.short_name "+
			" from invoice2 inv"+
			" inner join compare_case cc on cc.id=inv.compare_case_id"+
			" inner join ed_office ed on ed.offcode=cc.compare_office " +
			" inner join application_arrest aa on aa.track_no=cc.track_no " +
			" inner join duty_group dg on dg.group_id=aa.product_group_id " +
			" where 1 = 1 ";
			
			countsql = 
				" select count(inv.id) "+
				" from invoice2 inv"+
				" inner join compare_case cc on cc.id=inv.compare_case_id"+
				" inner join ed_office ed on ed.offcode=cc.compare_office " +
				" inner join application_arrest aa on aa.track_no=cc.track_no " +
				" inner join duty_group dg on dg.group_id=aa.product_group_id " +
				" where 1 = 1 ";

		pre(request, response);
		
		alcon.add(" AND cc.compare_case_no like '%");
		alin.add(request.getParameter("compare_case_no") + "%'");
		
		alcon.add(" AND cc.compare_case_no like '%");
		alin.add(request.getParameter("compare_case_year") + "%'");
		
		alcon.add(" AND inv.inv_bookno like '%");
		alin.add(request.getParameter("inv_bookno") + "%'");
		
		alcon.add(" AND inv.inv_no  like '%");
		alin.add(request.getParameter("inv_no") + "%'");
		
		alcon.add(" AND pke_arrest.getArrestLawbreaker(cc.track_no)  like '%");
		alin.add(request.getParameter("lawbreaker_name") + "%'");
		
		alcon.add(" AND dg.group_name  like '%");
		alin.add(request.getParameter("group_name") + "%'");
		
		alcon.add(" AND ed.short_name  like '%");
		alin.add(request.getParameter("offname") + "%'");
		
		alcon.add(" AND cc.compare_office like '%");
		alin.add(request.getParameter("offcode") + "%'");
		
		alcondate.add(" AND add_months(to_date(cc.compare_case_date),6516) between to_date('");
		alindate.add(request.getParameter("compare_case_date1")+ "','dd/mm/yyyy')");
		alcondate.add(" AND to_date('");
		alindate.add(request.getParameter("compare_case_date2")+ "','dd/mm/yyyy')");
		alcondate.add(" AND add_months(to_date(inv.inv_date),6516) between to_date('");
		alindate.add(request.getParameter("inv_date1") + "','dd/mm/yyyy')");
		alcondate.add(" AND to_date('");
		alindate.add(request.getParameter("inv_date2") + "','dd/mm/yyyy')");

		// add sting con
		for (int i = 0; i < alin.size(); i++) {
			if (alin.get(i).equals("%'")) {
				alcon.set(i, "");
				alin.set(i, "");
			}
			sql += alcon.get(i) + alin.get(i);
		}

		// add int con
		for (int i = 0; i < alinint.size(); i++) {
			if ((Integer) alinint.get(i) != 0) {
				sql += alconint.get(i) + (Integer) alinint.get(i);
			}

		}

		// add date con
		for (int i = 0; i < alcondate.size(); i += 2) {
			if (alindate.get(i).equals("','dd/mm/yyyy')")
					&& alindate.get(i + 1).equals("','dd/mm/yyyy')")) {
				alcondate.set(i, "");
				alindate.set(i, "");
				alcondate.set(i + 1, "");
				alindate.set(i + 1, "");
			}
			sql += alcondate.get(i) + alindate.get(i);
			sql += alcondate.get(i + 1) + alindate.get(i + 1);
		}

		sql += " order by ed.offname, inv.inv_bookno desc, inv.inv_no desc" ;
		System.out.println(slsql+sql);
		System.out.println(countsql+sql);
		Integer totalRow = de.countBySql(countsql+sql, null);
		pageUtil.setTotalRow(totalRow);
		pageUtil.setPageSize(20);
		List<Map<String, Object>> dblist = de.findBySql(slsql+sql, null,pageUtil);
		//System.out.println(dblist);
		log.debug(dblist);
		List<Map<String, Object>> aamax = maxid.findBySql("select max(id) max from application_arrest", null);
		System.out.println(aamax);
		request.setAttribute("aamax", aamax.get(0));
		request.setAttribute("dblist", dblist);
		request.setAttribute("offcode", request.getParameter("offcode"));
		request.setAttribute("offname", request.getParameter("offname"));
		if(uData.IsAdmin()==true)
     	   request.setAttribute("IsAdmin", "1");
		
		this.writeTranLog("ค้นหาข้อมูลใบเสร็จรับเงินแบบที่ 2");
		forward("?page=/CompareCase/invoice2_list.jsp", request, response);
	
		
	}
	

	
	   public boolean isNumeric(String s) {
		   try{
			   return s.matches("[-+]?\\d*\\.?\\d+");
		   }catch (Exception e) {
			   return false ;
		}

		      }
	   
		
		
		

}
