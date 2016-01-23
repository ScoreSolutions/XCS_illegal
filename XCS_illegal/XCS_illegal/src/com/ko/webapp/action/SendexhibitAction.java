package com.ko.webapp.action;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.ko.domain.AppArrestProveExhibit;
import com.ko.domain.ApplicationArrest;
import com.ko.domain.ApplicationArrestExhibit;
import com.ko.domain.ApplicationArrestIndictment;
import com.ko.domain.ApplicationArrestLawbreaker;
import com.ko.domain.ApplicationArrestLicense;
import com.ko.domain.ApplicationArrestProve;
import com.ko.domain.ApplicationArrestTeam;
import com.ko.domain.ApplicationInvest;
import com.ko.domain.ApplicationInvestTeam;
import com.ko.domain.ApplicationNoticeArrest;
import com.ko.domain.ApplicationOutsideProveItem;
import com.ko.domain.ApplicationSearchWarrant;
import com.ko.domain.ApplicationSincereConfirm;
import com.ko.domain.BookImpeachment;
import com.ko.domain.CompareCase;
import com.ko.domain.DeliveryExhibit;
import com.ko.domain.DeliveryExhibitItem;
import com.ko.domain.District;
import com.ko.domain.DutyGroup;
import com.ko.domain.DutyTable;
import com.ko.domain.EdOffice;
import com.ko.domain.Indictment;
import com.ko.domain.InspectorTeam;
import com.ko.domain.InspectorTeamStaff;
import com.ko.domain.Lawbreaker;
import com.ko.domain.Legislation;
import com.ko.domain.Nationality;
import com.ko.domain.Position;
import com.ko.domain.Product;
import com.ko.domain.Province;
import com.ko.domain.Race;
import com.ko.domain.SizePackage;
import com.ko.domain.Staff;
import com.ko.domain.Subdistrict;
import com.ko.domain.Title;
import com.ko.domain.TranLog;
import com.ko.domain.Unit;
import com.ko.domain.V_STAFF_LIST_POPUP;
import com.ko.service.ProductUnitService;
import com.ko.util.DateUtil;
import com.ko.util.RunningKey;
import com.ko.webapp.util.ParameterUtil;

public class SendexhibitAction extends BaseAction {

	String menuID = "19";
	@Override
	public void _default(HttpServletRequest request,
			HttpServletResponse response) throws Exception {
		// TODO Auto-generated method stub
		
		if(uData.chkUserMenu(menuID)==true){
			pre(request, response);
			this.writeTranLog("แสดงรายการใบนำส่งของกลางเพื่อจัดเก็บ");
			forward("?page=/ProveExhibit/send_exhibit_search.jsp", request,response);
		}else{
    		HttpSession session = request.getSession();
  		  	session.invalidate();
  		  	request.setAttribute("errMsg", "ผู้ใช้ไม่มีสิทธิ์ดำเนินการ");
  		  	forward("?page=/login.jsp", request, response);
    	}
	}

	public void pre(HttpServletRequest request, HttpServletResponse response)
			throws Exception {
		Legislation lt = new Legislation(db);
		List<Legislation> ltlist = lt.findByWhere(
				" 1=1 order by legislation_name", null);
		DutyGroup dg = new DutyGroup(db);
		//log.debug("offnow"+offnow);		
		request.setAttribute("ltlist", ltlist);
		request.setAttribute("offnamenow", offname);
		request.setAttribute("offcodenow", offcode);
		request.setAttribute("nameStaff", create_by_name);
		request.setAttribute("staffID",create_by );

	}

	public void update(HttpServletRequest request, HttpServletResponse response)
			throws Exception {
		DeliveryExhibit de = new DeliveryExhibit(db);
		de = de.findByPk(ParameterUtil.getLongParam("de_id", request));
		log.debug(de);
		de.setDelivery_by(ParameterUtil.getStringParam("delivery_by", request) );
		de.setDelivery_date(DateUtil.getDateFromString(ParameterUtil.getStringParam("delivery_date", request) ));
		de.setLegislation_id(ParameterUtil.getLongParam("legislation_id", request) );
		de.setDelivery_code(ParameterUtil.getStringParam("delivery_no1", request)+"/"+ParameterUtil.getStringParam("delivery_no2", request));
		de.setOffcode_from(ParameterUtil.getStringParam("offcode_from", request));
		de.setOffcode_inform(ParameterUtil.getStringParam("offcode_inform", request) );
		de.setOffcode_to(ParameterUtil.getStringParam("offcode_to", request) );
		if(ParameterUtil.getStringParam("confirm", request).equals("2")){
		de.setStatus(ParameterUtil.getStringParam("confirm", request));
		}else{
			de.setStatus("1");
		}
		de.setSubject(ParameterUtil.getStringParam("subject", request));
		de.setSubject_type(ParameterUtil.getStringParam("subject_type", request));
		de= de.update();
		log.debug(de);
		
		uplistlist( request,  response, de);
		this.writeTranLog("บันทึกข้อมูลใบนำส่งของกลางเพื่อจัดเก็บ");
		redirect("process?action=Sendexhibit&id=" + de.getId() + "&SaveMsg=1&cmd=preup",request, response);
	

	}

	public void create(HttpServletRequest request, HttpServletResponse response)
			throws Exception {
		// new ParameterUtil();
		DeliveryExhibit de = new DeliveryExhibit(db);
		de.setCreate_by(create_by);
		de.setCreate_on(create_on);
		de.setDelivery_by(ParameterUtil.getStringParam("delivery_by", request) );
		de.setDelivery_date(DateUtil.getDateFromString(ParameterUtil.getStringParam("delivery_date", request) ));
		de.setJob_no(new RunningKey(db).getRunningKey("DELIVERY_EXHIBIT", "", "", offcode));
		de.setLegislation_id(ParameterUtil.getLongParam("legislation_id", request) );
		de.setDelivery_code(ParameterUtil.getStringParam("delivery_no1", request)+"/"+ParameterUtil.getStringParam("delivery_no2", request));
		de.setOffcode_from(ParameterUtil.getStringParam("offcode_from", request));
		de.setOffcode_inform(ParameterUtil.getStringParam("offcode_inform", request));
		de.setOffcode_to(ParameterUtil.getStringParam("offcode_to", request) );
		if(ParameterUtil.getStringParam("confirm", request).equals("2")){
			de.setStatus(ParameterUtil.getStringParam("confirm", request));
		}else{
			de.setStatus("1");
		}
		de.setSubject(ParameterUtil.getStringParam("subject", request));
		de.setSubject_type(ParameterUtil.getStringParam("subject_type", request));
		//log.debug(de);
		de = de.create();
		//log.debug(de);	
		
		uplistlist( request,  response, de);
		this.writeTranLog("บันทึกข้อมูลใบนำส่งของกลางเพื่อจัดเก็บ");
//log.debug("create de"+de);
		redirect("process?action=Sendexhibit&id=" + de.getId() + "&SaveMsg=1&cmd=preup");
	}
	public void add(HttpServletRequest request, HttpServletResponse response)
	throws Exception {
		DeliveryExhibit de = new DeliveryExhibit(db);
		pre(request, response);
		Map<String, Object> demap = new HashMap<String, Object>() ;
		//log.debug(demap);
		demap.put("subject", "ส่งของกลางคดี");
		demap.put("offcode_inform", uData.getShortName());
		request.setAttribute("de", demap);
		
		request.setAttribute("action","process?action=Sendexhibit&cmd=add");
		this.writeTranLog("เพิ่มข้อมูลใบนำส่งของกลางเพื่อจัดเก็บ");
		forward("?page=/ProveExhibit/send_exhibit_form.jsp", request,response);

}
	public void preup(HttpServletRequest request, HttpServletResponse response) throws Exception {
		pre(request, response);
		DeliveryExhibit de = new DeliveryExhibit(db);
		String sql;
		String aaesql;
		
		sql = 
			"Select de.id delivery_id, de.delivery_code, de.delivery_date," +
			"de.offcode_inform,de.offcode_to,de.offcode_from," +
			" de.delivery_by, de.offcode_to ,ed.offname offtoname," +
			" ed2.offname offfromname,ed3.offname offinname," +
			" de.subject,de.job_no,de.subject_type,"+
			" to_char(de.delivery_date, 'dd/mm/yyyy', 'NLS_CALENDAR=''THAI BUDDHA'' NLS_DATE_LANGUAGE=THAI')  delivery_date2,"+
			" de.legislation_id, lg.legislation_name, ti.title_name || st.first_name || ' ' || st.last_name staff_delivery,  "+
			" de.status, decode(de.status , '1', 'ยังไม่ส่ง', '2','ส่งแล้ว','3','ตรวจรับแล้ว') status_name" +
			" from delivery_exhibit de "+
			" inner join legislation lg on lg.id=de.legislation_id"+
			" inner join staff st on st.idcard_no=de.delivery_by"+
			" left join title ti on ti.title_code=st.title_code" +
			" left join ed_office ed on ed.offcode = de.offcode_to " +
			" left join ed_office ed2 on ed2.offcode = de.offcode_from " +
			" left join ed_office ed3 on ed3.offcode = de.offcode_inform " +
			" where de.id = ? ";
		
		aaesql = 
			" select dei.id, 'IN' sources ,dei.delivery_exhibit_id, dei.app_arrest_prove_exhibit_id, null application_outside_prove_item, ape.track_no, aap.exhibit_report_no, aap.taken_date,"+
		" to_char(aap.taken_date,'dd/mm/yyyy','NLS_CALENDAR=''THAI BUDDHA'' NLS_DATE_LANGUAGE=THAI') taken_date2,"+
		" nvl(dei.product_name,dt.duty_name) product_name , dei.brand_code , nvl(dei.brand_name,nvl(bm.brand_main_thai, bm.brand_main_eng))  brand_name, nvl(dei.qty_unit_name,au.thname) unit_name,"+
		" ape.netweight, ape.netweight_unit_code unit_netweight, nvl(dei.netweight_unit_name,wu.thname) netweight_unit_name, "+
		" ape.qty arrest_qty,dei.prove_qty, dei.qty, dei.remarks,dei.isdomestic, "+
		" aa.legislation_id, lg.legislation_name, ti.title_name || st.first_name || ' ' || st.last_name title_name," +
		" pke_arrest.getArrestLawbreaker(aa.track_no) lawbreaker_name, dei.sizes_desc || ' ' || dei.sizes_unit_name sizes_desc"+
		" from delivery_exhibit_item dei"+
		"  inner join app_arrest_prove_exhibit ape on ape.id=dei.app_arrest_prove_exhibit_id"+
		" inner join application_arrest_prove aap on aap.track_no=ape.track_no"+
		" inner join application_arrest aa on aa.track_no=aap.track_no"+
		" inner join legislation lg on lg.id=aa.legislation_id"+
		" left join brand_main bm on bm.brand_main_code=dei.brand_code and dei.group_id=bm.group_id"+
		" left join unit au on au.unit_code=ape.qty_unit_code"+
		" left join unit wu on wu.unit_code=ape.netweight_unit_code "+
		" inner join staff st on st.idcard_no=aa.accuser_idcardno"+
		" left join title ti on ti.title_code=st.title_code"+
		" left join duty_table dt on dt.duty_code=dei.duty_code" +
		" where dei.delivery_exhibit_id= ?"+
	 	" union"+
		" select dei.id, 'OUT' sources ,dei.delivery_exhibit_id, null app_arrest_prove_exhibit_id, dei.application_outside_prove_item, aop.job_no, aop.prove_no, aop.prove_date,"+
		" to_char(aop.prove_date,'dd/mm/yyyy','NLS_CALENDAR=''THAI BUDDHA'' NLS_DATE_LANGUAGE=THAI') prove_date2,"+
		" nvl(dei.product_name,dt.duty_name) product_name , dei.brand_code , nvl(dei.brand_name,nvl(bm.brand_main_thai, bm.brand_main_eng))  brand_name, nvl(dei.qty_unit_name,au.thname) unit_name,"+
		" ape.netweight, ape.unit_netweight, nvl(dei.netweight_unit_name,wu.thname) netweight_unit_name, "+
		" ape.qty arrest_qty,dei.prove_qty, dei.qty,dei.remarks,dei.isdomestic,"+
		" aop.legislation_id, lg.legislation_name, '' title_name, '' lawbreaker_name, dei.sizes_desc || ' ' || dei.sizes_unit_name sizes_desc"+
		" from delivery_exhibit_item dei"+
		" inner join application_outside_prove_item ape on ape.id=dei.application_outside_prove_item"+
		" inner join application_outside_prove aop on aop.id=ape.application_outside_prove_id"+
		" inner join legislation lg on lg.id=aop.legislation_id"+
		" left join brand_main bm on bm.brand_main_code=dei.brand_code and dei.group_id=bm.group_id"+
		" left join unit au on au.unit_code=ape.unit_qty "+
		" left join unit wu on wu.unit_code=ape.unit_netweight "+
		" left join duty_table dt on dt.duty_code=dei.duty_code  " +
		" where dei.delivery_exhibit_id= ?" +
		" order by id ";
			
		//log.debug(sql);
		Map<String, Object> demap = de.findBySql(sql,ParameterUtil.getLongParam("id", request)).get(0);
		de = de.findByPk(ParameterUtil.getLongParam("id", request));
		//log.debug(demap);
		//log.debug(aaesql);
		ApplicationArrest aae = new ApplicationArrest(db);
		List<Map<String,Object>> aaelist = aae.findBySql(aaesql,new Object[]{de.getId(),de.getId()});
		request.setAttribute("aaelist", aaelist);
		//log.debug(aaelist);
		//log.debug("Mu="+demap.get("offfromname").toString());
		request.setAttribute("de", demap);
		request.setAttribute("offnamenow", demap.get("offfromname").toString());
		request.setAttribute("nameStaff", demap.get("staff_delivery").toString());
		request.setAttribute("offcodenow", demap.get("offcode_from").toString());
		request.setAttribute("staffID",demap.get("delivery_by").toString());
		if(de.getDelivery_code()!=null){
			request.setAttribute("de_no1",  de.getDelivery_code().substring(0, de.getDelivery_code().indexOf("/")));
			request.setAttribute("de_no2", de.getDelivery_code().substring( de.getDelivery_code().indexOf("/")+1,de.getDelivery_code().length()));
		}
		if(request.getParameter("SaveMsg") != null)
			request.setAttribute("SaveMSG", "1");
		
		request.setAttribute("action","process?action=Sendexhibit&id="+ParameterUtil.getLongParam("id", request)+"&cmd=preup");
		this.writeTranLog("แสดงรายละเอียดของใบนำส่งของกลาง");
		forward("?page=/ProveExhibit/send_exhibit_edit.jsp", request,response);

	}

	public void list(HttpServletRequest request, HttpServletResponse response) throws Exception {
		DeliveryExhibit de = new DeliveryExhibit(db);

		String sql ="";
		String slsql;
		String countsql;
		pre(request, response);

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
		countsql = 
			"Select count(de.id)" +
			" from delivery_exhibit de "+
			" inner join legislation lg on lg.id=de.legislation_id"+
			" left join staff st on st.idcard_no=de.delivery_by"+
			" left join title ti on ti.title_code=st.title_code" +
			" where 1 = 1";
		slsql = 
			"Select de.id delivery_id, de.delivery_code, de.delivery_date,"+
			" to_char(de.delivery_date, 'dd/mm/yyyy', 'NLS_CALENDAR=''THAI BUDDHA'' NLS_DATE_LANGUAGE=THAI')  delivery_date2,"+
			" de.legislation_id, lg.legislation_name, ti.title_name || st.first_name || ' ' || st.last_name staff_delivery,  "+
			" de.status, decode(de.status , '1', 'ยังไม่ส่ง', '2','ส่งแล้ว','3','ตรวจรับแล้ว') status_name," +
			" ed.short_name offname_to" +
			" from delivery_exhibit de "+
			" inner join legislation lg on lg.id=de.legislation_id"+
			" left join staff st on st.idcard_no=de.delivery_by"+
			" left join title ti on ti.title_code=st.title_code" +
			" inner join ed_office ed on ed.offcode=de.offcode_to"+
			" where 1 = 1";
		String whText = "";
		if(!request.getParameter("legislation_id").equals(""))
			whText += " and de.legislation_id = '" + request.getParameter("legislation_id") + "'";
		if(!request.getParameter("status").equals(""))
			whText += " and de.status = '" + request.getParameter("status") + "'";
		if(!request.getParameter("delivery_code").equals(""))
			whText += " and de.delivery_code like '%" + request.getParameter("delivery_code") + "%'";
		if(!request.getParameter("staff_delivery").equals(""))
			whText += " and ti.title_name || st.first_name || ' ' || st.last_name like '%" + request.getParameter("staff_delivery") + "%'";
		if(!request.getParameter("delivery_date1").equals(""))
			whText += " and to_char(de.delivery_date,'yyyymmdd') >= '" + DateUtil.formatConditionDate(request.getParameter("delivery_date1")) + "'";
		if(!request.getParameter("delivery_date2").equals(""))
			whText += " and to_char(de.delivery_date,'yyyymmdd') <= '" + DateUtil.formatConditionDate(request.getParameter("delivery_date2")) + "'";

		Integer totalRow = de.countBySql(countsql+whText, null);
		pageUtil.setTotalRow(totalRow);
		pageUtil.setPageSize(20);
		//sql += " order by de.delivery_code desc ";
		//log.debug("mu .....="+sql);
		List<Map<String, Object>> dblist = de.findBySql(slsql+whText + " order by de.delivery_code desc ", null,pageUtil);
		//log.debug(dblist);

		request.setAttribute("dblist", dblist);
		this.writeTranLog("ค้นหาข้อมูลใบนำส่งของกลางเพื่อจัดเก็บ");
		forward("?page=/ProveExhibit/send_exhibit_search.jsp", request,response);
	}
	public void uplistlist(HttpServletRequest request, HttpServletResponse response,DeliveryExhibit de)throws Exception {

	    //xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxstart deixxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx
		   DeliveryExhibitItem  cdei = new DeliveryExhibitItem (db);

		    //List<DeliveryExhibitItem > cdeilist = cdei.findByWhere(" DELIVERY_EXHIBIT_ID = ?",de.getId());
		   List<DeliveryExhibitItem > cdeilist = cdei.findByWhere(DeliveryExhibitItem.DELIVERY_EXHIBIT_IDCol+" = ?",de.getId());
			
			String[] dei_id = request.getParameterValues("dei_id");
			String[] dei_soures = request.getParameterValues("dei_soures");
			String[] dei_isdomestic = request.getParameterValues("dei_isdomestic");
			String[] dei_app_arrest_prove_exhibit_id = request.getParameterValues("dei_app_arrest_prove_exhibit_id");
			String[] dei_track_no = request.getParameterValues("dei_track_no");
			String[] dei_exhibit_report_no = request.getParameterValues("dei_exhibit_report_no");
			String[] dei_remarks = request.getParameterValues("dei_remarks");
			String[] dei_taken_date2 = request.getParameterValues("dei_taken_date2");
			String[] dei_product_code = request.getParameterValues("dei_product_code");
			String[] dei_brand_code = request.getParameterValues("dei_brand_code");
			String[] dei_brand_name = request.getParameterValues("dei_brand_name");
			String[] dei_unit_name = request.getParameterValues("dei_unit_name");
			String[] dei_arrest_qty = request.getParameterValues("dei_arrest_qty");
			String[] dei_prove_qty = request.getParameterValues("dei_prove_qty");
			String[] dei_qty = request.getParameterValues("dei_qty");
			String[] dei_legislation_id = request.getParameterValues("dei_legislation_id");
			String[] dei_legislation_name = request.getParameterValues("dei_legislation_name");
			String[] dei_title_name = request.getParameterValues("dei_title_name");
			String[] dei_lawbreaker_name = request.getParameterValues("dei_lawbreaker_name");
			String[] dei_product_name = request.getParameterValues("dei_product_name"); 
			String[] dei_netweight = request.getParameterValues("dei_netweight"); 
			String[] dei_unit_netweight = request.getParameterValues("dei_unit_netweight"); 
			String[] dei_application_outside_prove_item = request.getParameterValues("dei_application_outside_prove_item"); 
			//log.debug("********mu="+dei_id.length);
			if(dei_id == null){
				 for(int j = 0 ; j<cdeilist.size() ;j++){
					 cdeilist.get(j).delete();   	
				 }
			}
	
			if(request.getParameter("dei_id") != null){
		    	boolean chkdel=true;
			    for(int j = 0 ; j<cdeilist.size() ;j++){
			    	chkdel= true;
			    	for(int k = 0; k<dei_id.length ;k++){
				    	if(dei_id[k].equals("")==false){
				    		if(Long.parseLong(dei_id[k])==cdeilist.get(j).getId()){
				    			chkdel = false;
				    		}
				    	}
			    	}

			    	if(chkdel== true){
			    		cdeilist.get(j).delete();
			    	}
			    }
		    	for(int i = 0; i < dei_id.length;i++ ){
		    		boolean chkup = false ;
		    		DeliveryExhibitItem  dei  = new DeliveryExhibitItem (db);
		    		if(!dei_id[i].equals("")){
			    		chkup = true ;
			    		dei = dei.findByPk(Long.parseLong(dei_id[i]));
			    	}

		    		// set value
	    			Unit u = new Unit(db);
	    			if(u.findByWhere("nvl(thname, enname) = ?", dei_unit_name[i].trim()).size()!=0){
	    				u = u.findByWhere("nvl(thname, enname) = ?", dei_unit_name[i].trim()).get(0);
	    				dei.setUnit_code(u.getUnit_code());		
	    			}
		    			
		    		dei.setNetweight_unit(dei_unit_netweight[i]);
		    		dei.setQty((!dei_qty[i].equals("") ? new Double(dei_qty[i]) : null));
		    		dei.setProve_qty((!dei_prove_qty[i].equals("") ? new Double(dei_prove_qty[i]) : null));
		    		dei.setApp_arrest_prove_exhibit_id((!dei_app_arrest_prove_exhibit_id[i].equals("") ? new Long(dei_app_arrest_prove_exhibit_id[i]) : null));
		    		dei.setBrand_code(dei_brand_code[i]);
		    		dei.setDelivery_exhibit_id(de.getId());
		    		dei.setProduct_code((dei_product_code[i] != null ? dei_product_code[i] : ""));
		    		//dei.setDuty_code((dei_product_code[i] != null ? dei_product_code[i].substring(0,4) : ""));
		    		dei.setApplication_outside_prove_item((!dei_application_outside_prove_item[i].equals("") ? new Long(dei_application_outside_prove_item[i]) : null));
		    		dei.setNetweight((!dei_netweight[i].equals("") ? new Double(dei_netweight[i]): null));	
		    		dei.setRemarks(dei_remarks[i]);
		    		dei.setIsdomestic(dei_isdomestic[i]);
		    		
		    		if(dei_application_outside_prove_item[i].equals("")==false){
		    			ApplicationOutsideProveItem aop= new ApplicationOutsideProveItem(db);
		    			aop = aop.findByPk(new Long(dei_application_outside_prove_item[i]));
		    			dei.setSizes_code(aop.getSizes_code());
		    			dei.setSizes_unit_code(aop.getUnit_size());
		    			dei.setUnit_code(aop.getUnit_qty());
		    			dei.setDuty_code(aop.getDuty_code());
		    			dei.setGroup_id(aop.getGroup_id());
		    			
		    		}else{
		    			AppArrestProveExhibit aape = new AppArrestProveExhibit(db);
		    			aape = aape.findByPk(new Long(dei_app_arrest_prove_exhibit_id[i]));
		    			dei.setSizes_code(aape.getSizes_code());
		    			dei.setSizes_unit_code(aape.getSize_unit_code());
		    			dei.setUnit_code(aape.getQty_unit_code());
		    			dei.setDuty_code(aape.getDuty_code());
		    			dei.setGroup_id(aape.getGroup_id());
		    			dei.setProduct_name(aape.getProduct_name());
		    			dei.setBrand_name(aape.getBrand_name());
		    			dei.setQty_unit_name(aape.getQty_unit_name());
		    			dei.setSizes_desc(aape.getSizes_desc());
		    			dei.setSizes_unit_name(aape.getSizes_unit_name());
		    			dei.setNetweight_unit_name(aape.getNetweight_unit_name());
		    			dei.setDuty_name(aape.getProduct_name());
		    			dei.setGroup_name(aape.getGroup_name());
		    			
		    		}
		
				     if(dei.getId()==null){
				    	 dei.setCreate_by(create_by);
				    	 dei.setCreate_on(create_on);
				    	 dei.create();
				     }else{
				    	 dei.setUpdate_by(update_by);
				    	 dei.setUpdate_on(update_on);
				    	 dei.update();
		     		}
		    	}
		    }
		    //xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxend deixxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx-
    	}
}
