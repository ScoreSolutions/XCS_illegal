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
import com.ko.domain.ApplicationOutsideProve;
import com.ko.domain.ApplicationOutsideProveItem;
import com.ko.domain.ApplicationSearchWarrant;
import com.ko.domain.ApplicationSincereConfirm;
import com.ko.domain.BookImpeachment;
import com.ko.domain.CompareCase;
import com.ko.domain.DeliveryExhibit;
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
import com.ko.domain.V_STAFF_LIST_POPUP;
import com.ko.service.ProductUnitService;
import com.ko.util.DateUtil;
import com.ko.util.RunningKey;
import com.ko.webapp.util.ParameterUtil;

public class OutsideproveAction extends BaseAction {

	String menuID = "18";
	
	@Override
	public void _default(HttpServletRequest request,
			HttpServletResponse response) throws Exception {
		// TODO Auto-generated method stub
		
		if(uData.chkUserMenu(menuID)==true){
			pre(request, response);
			this.writeTranLog("แสดงรายการพิสูจน์ของกลางจากหน่วยงานภายนอก");
			forward("?page=/ProveExhibit/Outside_Prove_List.jsp", request,response);
		}else{
    		HttpSession session = request.getSession();
  		  	session.invalidate();
  		  	request.setAttribute("errMsg", "ผู้ใช้ไม่มีสิทธิ์ดำเนินการ");
  		  	forward("?page=/login.jsp", request, response);
    	}

	}

	public void pre(HttpServletRequest request, HttpServletResponse response) throws Exception {
		Legislation lt = new Legislation(db);
		List<Legislation> ltlist = lt.findByWhere(" 1=1 order by legislation_name", null);
		request.setAttribute("ltlist", ltlist);
		//DutyGroup dg = new DutyGroup(db);
		//EdOffice offnow = new EdOffice(db);
		//offnow =offnow.findByWhere("offcode = ?", offcode).get(0);
	 	EdOffice ed = new EdOffice(db);
	 	String edSql = "select offcode,short_name, offname from ed_office order by offname";
		List<Map<String,Object>> edlist =  ed.findBySql(edSql, null);
//		log.debug("edlist : "+edlist.size());
		request.setAttribute("edlist", edlist);
	
		
		request.setAttribute("offnamenow", uData.getOffname());
		request.setAttribute("offcodenow", uData.getOffcode());
		if (uData.IsAdmin()==true)
        	request.setAttribute("IsAdmin","1");

	}

	public void update(HttpServletRequest request, HttpServletResponse response)
			throws Exception {
		
		
		
		ApplicationOutsideProve aop = new ApplicationOutsideProve(db);
		aop = aop.findByPk(ParameterUtil.getLongParam("aop_id", request));
		aop.setDept_type(ParameterUtil.getStringParam("dept_type", request));
		aop.setDoc_dept_name(ParameterUtil.getStringParam("doc_dept_name", request));
		if(!ParameterUtil.getStringParam("isreturn", request).equals("")){
		aop.setIsreturn(ParameterUtil.getStringParam("isreturn", request));
		}else{aop.setIsreturn("N");}
		aop.setJob_date(DateUtil.getDateFromString(ParameterUtil.getStringParam("job_date", request)+" "+ParameterUtil.getStringParam("job_time", request)));
		//aop.setJob_no(new RunningKey(db).getRunningKey("APPLICATION_OUTSIDE_PROVE", "", "","001200"));
		//aop.setJob_no(aop.getJob_no());
		aop.setLegislation_id(ParameterUtil.getLongParam("legislation_id", request));
		aop.setOffcode(ParameterUtil.getStringParam("offcode", request));
		aop.setOffcode_prove(ParameterUtil.getStringParam("offcode_prove", request));
		aop.setPoscode_prove(ParameterUtil.getStringParam("poscode_prove", request));
		aop.setProve_date(DateUtil.getDateFromString(ParameterUtil.getStringParam("prove_date", request)));
		aop.setProve_no(ParameterUtil.getStringParam("prove_no", request));
		aop.setProve_objective(ParameterUtil.getStringParam("prove_objective", request));
		aop.setProve_result(ParameterUtil.getStringParam("prove_result", request));
		aop.setRef_doc_date(DateUtil.getDateFromString(ParameterUtil.getStringParam("ref_doc_date", request)));
		aop.setRef_doc_no(ParameterUtil.getStringParam("ref_doc_no", request));
		aop.setReplace_position(ParameterUtil.getStringParam("replace_position", request));
		aop.setStaff_id_prove(ParameterUtil.getStringParam("staff_id_prove", request));
		aop.setUpdate_by(update_by);
		aop.setUpdate_on(update_on);
		log.debug(aop);
		
		aop= aop.update();
		
		uplist(request, response, aop);
		this.writeTranLog("บันทึกข้อมูลการพิสูจน์ของกลางจากหน่วยงานภายนอก");
		redirect("process?action=Outsideprove&id=" + aop.getId() + "&SaveMsg=1&cmd=preup");
		

	}
	
	public void delete(HttpServletRequest request, HttpServletResponse response) throws Exception {
		this.writeTranLog("ลบบันทึกการตรวจรับของกลางจากหน่วยงานภายนอก");
        //log.debug("delete" + request.getParameter("id"));
        Long id = new Long(request.getParameter("id"));
        ApplicationOutsideProveItem api = new ApplicationOutsideProveItem(db);
        api.deleteByWhere("application_outside_prove_id = '" + id.toString() + "'", null);
        
        ApplicationOutsideProve aop = new ApplicationOutsideProve(db);
        aop.deleteByPk(id);

        forward("?page=/ProveExhibit/Outside_Prove_List.jsp", request,response);
	}

	public void create(HttpServletRequest request, HttpServletResponse response)
			throws Exception {
		// new ParameterUtil();
		
		ApplicationOutsideProve aop = new ApplicationOutsideProve(db);
		aop.setCreate_by(create_by);
		aop.setCreate_on(create_on);
		aop.setDept_type(ParameterUtil.getStringParam("dept_type", request));
		aop.setDoc_dept_name(ParameterUtil.getStringParam("doc_dept_name", request));
		
		if(!ParameterUtil.getStringParam("isreturn", request).equals("")){
			aop.setIsreturn(ParameterUtil.getStringParam("isreturn", request));
			}else{aop.setIsreturn("N");}
		aop.setJob_date(DateUtil.getDateFromString(ParameterUtil.getStringParam("job_date", request)+" "+ParameterUtil.getStringParam("job_time", request)));
		aop.setJob_no(new RunningKey(db).getRunningKey("APPLICATION_OUTSIDE_PROVE", "", "","001200"));
		aop.setLegislation_id(ParameterUtil.getLongParam("legislation_id", request));
		aop.setOffcode(ParameterUtil.getStringParam("offcode", request));
		aop.setOffcode_prove(ParameterUtil.getStringParam("offcode_prove", request));
		aop.setPoscode_prove(ParameterUtil.getStringParam("poscode_prove", request));
		aop.setProve_date(DateUtil.getDateFromString(ParameterUtil.getStringParam("prove_date", request)));
		aop.setProve_no(ParameterUtil.getStringParam("prove_no", request));
		aop.setProve_objective(ParameterUtil.getStringParam("prove_objective", request));
		aop.setProve_result(ParameterUtil.getStringParam("prove_result", request));
		aop.setRef_doc_date(DateUtil.getDateFromString(ParameterUtil.getStringParam("ref_doc_date", request)));
		aop.setRef_doc_no(ParameterUtil.getStringParam("ref_doc_no", request));
		aop.setReplace_position(ParameterUtil.getStringParam("replace_position", request));
		aop.setStaff_id_prove(ParameterUtil.getStringParam("staff_id_prove", request));
		
		//log.debug(aop);
		aop=aop.create();
		this.writeTranLog("บันทึกข้อมูลการพิสูจน์ของกลางจากหน่วยงานภายนอก");
		uplist(request, response, aop);
		
		//log.debug("create aop"+aop);
		redirect("process?action=Outsideprove&id=" + aop.getId() + "&SaveMsg=1&cmd=preup");
	}
	public void add(HttpServletRequest request, HttpServletResponse response)
	throws Exception {
		DeliveryExhibit de = new DeliveryExhibit(db);
		pre(request, response);
		Map<String, Object> demap = new HashMap<String, Object>() ;
		demap.put("staff_id_prove_name", uData.getFullName());
		demap.put("posname_prove", uData.getPosname());
		request.setAttribute("aop", demap);
		
		Map<String, Object> opmap = new HashMap<String, Object>();
		opmap.put("staff_id_prove", uData.getIdCard());
		opmap.put("offcode_prove", uData.getOffcode());
		opmap.put("poscode_prove", uData.getPoscode());
		request.setAttribute("oaop", opmap);
		
		this.writeTranLog("เพิ่มข้อมูลการพิสูจน์ของกลางจากหน่วยงานภายนอก");
		request.setAttribute("action","process?action=Outsideprove&cmd=add");
		
		forward("?page=/ProveExhibit/Outside_Prove_Form.jsp", request,response);

}
	public void preup(HttpServletRequest request, HttpServletResponse response)
			throws Exception {
		pre(request, response);
		ApplicationOutsideProve aop = new ApplicationOutsideProve(db);
		String sql ;
		String aaesql;
		sql = 
			" select aop.id ,aop.job_no, aop.ref_doc_no, aop.job_date, aop.ref_doc_date,aop.dept_type,aop.job_date, "+
			" to_char(aop.job_date, 'dd/mm/yyyy', 'NLS_CALENDAR=''THAI BUDDHA'' NLS_DATE_LANGUAGE=THAI') job_date2,"+
			" to_char(aop.ref_doc_date, 'dd/mm/yyyy', 'NLS_CALENDAR=''THAI BUDDHA'' NLS_DATE_LANGUAGE=THAI') ref_doc_date2,"+
			" to_char(aop.prove_date, 'dd/mm/yyyy', 'NLS_CALENDAR=''THAI BUDDHA'' NLS_DATE_LANGUAGE=THAI') prove_date2," +
			" aop.offcode_prove,ed2.offname offname_prove,ps.posname || ' ' || stp.staff_level posname_prove," +
			" aop.prove_objective, aop.prove_objective," +
			" tip.title_name || stp.first_name || ' ' || stp.last_name staff_id_prove_name,"+
			" aop.doc_dept_name, aop.legislation_id, lg.legislation_name, aop.prove_no, case when aop.prove_no is null then '0' else '1' end status,"+
			" aop.isreturn, aop.offcode, ed.offname,aop.prove_date,aop.replace_position"+
			" from application_outside_prove aop" +
			" left join ed_office ed2 on ed2.offcode=aop.offcode_prove"+
			" left join legislation lg on lg.id=aop.legislation_id"+
			" left join ed_office ed on ed.offcode=aop.offcode"+
			" left join staff stp on stp.idcard_no=aop.staff_id_prove" +
			" left join position ps on ps.poscode = aop.poscode_prove"+
			" left join title tip on tip.title_code=stp.title_code"+
			" where aop.id = ? ";
		

		aaesql = " select api.id, api.application_outside_prove_id, api.product_code, api.brand_code,"+
			" nvl(api.product_name, pd.product_name)  product_name,"+
			" 	   case when api.brand_code is not null then  nvl(bm.brand_main_thai, bm.brand_main_eng) "+
			 "        else"+
			" 	       case when api.brand_name is not null then api.brand_name else '' end"+
			" 	   end brand_name,"+
			" api.qty, api.unit_qty,  nvl(qu.thname,qu.enname) unit_qty_name,"+
			" api.sizes_code, api.unit_size, sp.size_desc, nvl(su.thname, su.enname) unit_size_name,"+
			" api.netweight, api.unit_netweight,  nvl(wu.thname,wu.enname) unit_wnet_name,"+
			" api.description, api.remarks, api.duty_code, api.brand_second, api.model_code,"+
			" nvl(bs.brand_second_name_thai,bs.brand_second_name_eng) brand_second_name, md.model_name," +
			" dg.group_id, dg.group_name " +
			" from application_outside_prove_item api"+
			" left join product pd on pd.product_code=api.product_code"+
			" left join brand_main bm on bm.brand_main_code=api.brand_code and api.group_id=bm.group_id"+
			" left join unit qu on qu.unit_code=api.unit_qty"+
			" left join size_package sp on sp.size_code=api.sizes_code and sp.group_id=api.group_id"+
			" left join unit su on su.unit_code=api.unit_size "+
			" left join unit wu on wu.unit_code=api.unit_netweight" +
			" left join brand_second bs on bs.brand_second_code=api.brand_second and api.group_id=bs.group_id and bs.brand_main_code=bm.brand_main_code" +
			" left join model md on md.model_code=api.model_code and md.group_id=api.group_id" +
			" left join duty_group dg on dg.group_id=api.group_id " +
			" where api.application_outside_prove_id = ? " +
			" order by api.id ";
		
		//log.debug(aaesql);
		
		Map<String, Object> demap = aop.findBySql(sql,ParameterUtil.getLongParam("id", request)).get(0);
		aop = aop.findByPk(ParameterUtil.getLongParam("id", request));
		
		ApplicationArrest aae = new ApplicationArrest(db);
		List<Map<String,Object>> aaelist = aae.findBySql(aaesql, aop.getId());
		request.setAttribute("aaelist", aaelist);
		if(request.getParameter("SaveMsg") != null)
			request.setAttribute("SaveMsg", "1");

		request.setAttribute("aop", demap);
		request.setAttribute("oaop", aop);
		request.setAttribute("offcodenow", demap.get("offcode"));
		request.setAttribute("action","process?action=Outsideprove&id="+ParameterUtil.getLongParam("id", request)+"&cmd=preup");
		this.writeTranLog("แสดงรายละเอียดรายการพิสูจน์ของกลางจากหน่วยงานภายนอก");
		forward("?page=/ProveExhibit/Outside_Prove_Edit.jsp", request,response);

	}

	public void list(HttpServletRequest request, HttpServletResponse response) throws Exception {
		
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
		
		countsql = 
			" select count(*)"+
			" from application_outside_prove aop"+
			" inner join legislation lg on lg.id=aop.legislation_id"+
			" inner join ed_office ed on ed.offcode=aop.offcode"; 

		slsql = 
			" select aop.id, aop.job_no, aop.ref_doc_no, aop.job_date, aop.ref_doc_date,"+
			" to_char(aop.job_date, 'dd/mm/yyyy hh24:mi', 'NLS_CALENDAR=''THAI BUDDHA'' NLS_DATE_LANGUAGE=THAI') job_date2,"+
			" to_char(aop.ref_doc_date, 'dd/mm/yyyy', 'NLS_CALENDAR=''THAI BUDDHA'' NLS_DATE_LANGUAGE=THAI') ref_dof_date2,"+
			" aop.dept_type, aop.doc_dept_name, aop.legislation_id, lg.legislation_name, aop.prove_no, case when aop.prove_no is null then '0' else '1' end status,"+
			" aop.isreturn, aop.offcode, ed.offname"+
			" from application_outside_prove aop"+
			" inner join legislation lg on lg.id=aop.legislation_id"+
			" inner join ed_office ed on ed.offcode=aop.offcode";
		

		pre(request, response);
		if (isNumeric(request.getParameter("legislation_id"))) {
			alconint.add(" AND aop.LEGISLATION_ID = ");
			alinint.add(new Integer(request.getParameter("legislation_id")));
		}
	
		alcon.add(" AND case when aop.prove_no is null then '0' else '1' end like '%");
		alin.add(request.getParameter("status") + "%'");

		alcon.add(" AND aop.doc_dept_name like '%");
		alin.add(request.getParameter("doc_dept_name") + "%'");
		
		alcon.add(" AND aop.offcode like '%");
		alin.add(request.getParameter("offcode") + "%'");
		request.setAttribute("offcodenow", request.getParameter("offcode"));
		
		
		alcondate.add(" AND add_months(to_date(aop.job_date),6516) between to_date('");
		alindate.add(request.getParameter("job_date1")
				+ "','dd/mm/yyyy')");
		alcondate.add(" AND to_date('");
		alindate.add(request.getParameter("job_date2")
				+ "','dd/mm/yyyy')");
		
		alcondate.add(" AND add_months(to_date(aop.ref_doc_date),6516) between to_date('");
		alindate.add(request.getParameter("ref_doc_date1")+ "','dd/mm/yyyy')");
		alcondate.add(" AND to_date('");
		alindate.add(request.getParameter("ref_doc_date2")+ "','dd/mm/yyyy')");

		alcon.add(" AND aop.job_no like '%");
		alin.add(request.getParameter("job_no") + "%'");

		alcon.add(" AND aop.ref_doc_no like '%");
		alin.add(request.getParameter("ref_doc_no") + "%'");

		alcon.add(" AND aop.dept_type like '%");
		alin.add(request.getParameter("dept_type") + "%'");

		alcon.add(" AND aop.prove_no like '%");
		alin.add(request.getParameter("prove_no") + "%'");
		
		if(request.getParameter("isreturn")!=null){
			if(!request.getParameter("isreturn").equals("")){
		alcon.add(" AND aop.isreturn like '%");
		alin.add(request.getParameter("isreturn") + "%'");
			}
		}

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

		sql += " order by lg.legislation_name, ed.offname, aop.job_date desc ";
		//log.debug(sql);
		
		Integer totalRow = de.countBySql(countsql+sql, null);
		pageUtil.setTotalRow(totalRow);
		pageUtil.setPageSize(20);
		List<Map<String, Object>> dblist = de.findBySql(slsql+sql, null,pageUtil);
		//log.debug(dblist);

		List<Map<String, Object>> aamax = maxid.findBySql(
				"select max(id) max from application_arrest", null);
		//log.debug(aamax);
		request.setAttribute("aamax", aamax.get(0));
		request.setAttribute("dblist", dblist);
		this.writeTranLog("ค้นหาข้อมูลการพิสูจน์ของกลางจากหน่วยงานภายนอก");
		forward("?page=/ProveExhibit/Outside_Prove_List.jsp", request,response);
	}
	   public boolean isNumeric(String s) {
		   try{
			   return s.matches("[-+]?\\d*\\?\\d+");
		   }catch (Exception e) {
			   return false ;
		}

	}
		public void uplist(HttpServletRequest request, HttpServletResponse response, ApplicationOutsideProve aop)
		throws Exception {
			
			   ApplicationOutsideProveItem  capi = new ApplicationOutsideProveItem (db);
			   List<ApplicationOutsideProveItem > capilist = capi.findByWhere(" APPLICATION_OUTSIDE_PROVE_ID = ?",aop.getId());

				String[] api_id = request.getParameterValues("api_id");
				String[] api_product_code = request.getParameterValues("api_product_code");
				String[] api_brand_code = request.getParameterValues("api_brand_code");
				String[] api_sizes_code = request.getParameterValues("api_sizes_code");
				String[] api_unit_size = request.getParameterValues("api_unit_size");
				String[] api_qty = request.getParameterValues("api_qty");
				String[] api_unit_qty = request.getParameterValues("api_unit_qty");
				String[] api_netweight  = request.getParameterValues("api_netweight");
				String[] api_unit_netweight = request.getParameterValues("api_unit_netweight");
				String[] api_description = request.getParameterValues("api_description");
				String[] api_remarks = request.getParameterValues("api_remarks");
				String[] api_product_name = request.getParameterValues("api_product_name");
				String[] api_brand_name = request.getParameterValues("api_brand_name");
				String[] api_duty_code = request.getParameterValues("api_duty_code");
				String[] api_size_desc = request.getParameterValues("api_size_desc");
				String[] api_unit_wnet_name = request.getParameterValues("api_unit_wnet_name");
				String[] api_unit_qty_name = request.getParameterValues("api_unit_qty_name");
				String[] api_unit_size_name = request.getParameterValues("api_unit_size_name");
				String[] api_brand_second_code = request.getParameterValues("api_brand_second_code");
				String[] api_model_code = request.getParameterValues("api_model_code");
				String[] api_group_id = request.getParameterValues("api_group_id");

			    if(request.getParameter("api_id") != null){
			    	boolean chkdel=true;
				    for(int j = 0 ; j<capilist.size() ;j++){
				    	chkdel= true;
				    	for(int k = 0; k<api_id.length ;k++){
					    	if(api_id[k].equals("")==false){
					    		if(Long.parseLong(api_id[k])==capilist.get(j).getId()){
					    			chkdel = false;
					    		}
					    	}
				    	}

				    	if(chkdel== true){
				    		capilist.get(j).delete();
				    	}
				    }
			    	for(int i = 0; i < api_id.length;i++ ){
			    		boolean chkup = false ;

			    		ApplicationOutsideProveItem  api  = new ApplicationOutsideProveItem (db);
			    		if(!api_id[i].equals("")){
				    		chkup = true ;
				    		api = api.findByPk(Long.parseLong(api_id[i]));
				    	}
			    			
			    		// set value
			    		api.setProduct_code(api_product_code[i]);
			    		api.setProduct_name(api_product_name[i]);
			    		api.setBrand_code(api_brand_code[i]);
			    		api.setBrand_name(api_brand_name[i]);
			    		api.setSizes_code(api_sizes_code[i]);
			    		api.setUnit_size(api_unit_size[i]);
			    		api.setIsdomestic("I");
			    		api.setApplication_outside_prove_id(aop.getId());
		    			api.setQty((!api_qty[i].equals("") ? new Double(api_qty[i]) : null));
		    			api.setUnit_qty(api_unit_qty[i]);
		    			api.setNetweight((!api_netweight[i].equals("") ? new Double(api_netweight[i]) : null));
			    		api.setUnit_netweight(api_unit_netweight[i]);
			    		api.setDescription(api_description[i]);
			    		api.setRemarks(api_remarks[i]);
			    		api.setDuty_code(api_duty_code[i]);
			    		api.setBrand_second(api_brand_second_code[i]);
			    		api.setModel_code(api_model_code[i]);
			    		api.setGroup_id(api_group_id[i]);
			    		
		  	    		  //log.debug(api);
					     if(chkup == false){
					    	 api.setCreate_by(create_by);
					    	 api.setCreate_on(create_on);
					    	 api.create();
					     }else{
					    	 api.setUpdate_by(update_by);
					    	 api.setUpdate_on(update_on);
					    	 api.update();
			     		}
			    	}
			    }
		}
}
