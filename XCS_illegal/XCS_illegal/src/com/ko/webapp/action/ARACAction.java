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

public class ARACAction extends BaseAction {

	@Override
	public void _default(HttpServletRequest request,
			HttpServletResponse response) throws Exception {
		// TODO Auto-generated method stub
		pre(request, response);
		forward("?page=/CompareCase/AppReqApproveCompareList.jsp", request,
				response);

	}

	public void pre(HttpServletRequest request, HttpServletResponse response)
			throws Exception {
		Legislation lt = new Legislation(db);
		List<Legislation> ltlist = lt.findByWhere(
				" 1=1 order by legislation_name", null);
		DutyGroup dg = new DutyGroup(db);
		EdOffice offnow = new EdOffice(db);
		offnow =offnow.findByWhere("offcode = ?", "001200").get(0);
		 	EdOffice ed = new EdOffice(db);
			List<EdOffice> edlist =  ed.findByWhere(" 1=1 order by offname", null);
			log.debug("edlist : "+edlist.size());
			request.setAttribute("edlist", edlist);
		
		log.debug("offnow"+offnow);		
		request.setAttribute("ltlist", ltlist);
		request.setAttribute("offnamenow", offnow.getOffname());
		request.setAttribute("offcodenow", offnow.getOffcode());
		
		
		
		// request.setAttribute("formname",request.getParameter("formname"));
		// request.setAttribute("empid",request.getParameter("id"));

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
		aop.setUpdate_by(update_by);
		aop.setUpdate_on(update_on);
		log.debug(aop);
		
		aop= aop.update();
		

	    //xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxstart apixxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx
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
String[] api_size_desc = request.getParameterValues("api_size_desc");
String[] api_unit_wnet_name = request.getParameterValues("api_unit_wnet_name");
String[] api_unit_qty_name = request.getParameterValues("api_unit_qty_name");
String[] api_unit_size_name = request.getParameterValues("api_unit_size_name");


log.debug("kkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkk");
		    if(api_id != null){
		    log.debug(api_id.length);}
		    log.debug("kkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkk");

		    if(request.getParameter("api_id") != null){
		    	boolean chkdel=true;
		    	log.debug("chkdet = true");
			    for(int j = 0 ; j<capilist.size() ;j++){
			    	chkdel= true;
			    	for(int k = 0; k<api_id.length ;k++){
			    		log.debug(capilist.get(j).getId()+"เทียบกับ"+api_id[k]);
			    	if(api_id[k].equals("")==false){
			    		if(Long.parseLong(api_id[k])==capilist.get(j).getId()){
			    		chkdel = false;
			    		log.debug("chkdet = false");
			    		}
			    	}
			    	}

			    	if(chkdel== true){

			    		//log.debug(capilist.get(j).getId()+"เทียบกับ"+api_id[0]);
			    		capilist.get(j).delete();

			    	}
			    }
		    	for(int i = 0; i < api_id.length;i++ ){
		    		boolean chkup = false ;

		    		ApplicationOutsideProveItem  api  = new ApplicationOutsideProveItem (db);
		    		   log.debug(api_id[i]);
		    		if(!api_id[i].equals("")){
			    		chkup = true ;
			    		log.debug("iiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiเตรียม");
			    		api = api.findByPk(Long.parseLong(api_id[i]));
			    		log.debug(api);
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
		    		if(isNumeric(api_qty[i])){
		    		api.setQty((api_qty[i] != null ? new Double(api_qty[i]) : null));
		    		}
		    		api.setUnit_qty(api_unit_qty[i]);
		    		if(isNumeric(api_netweight[i])){
		    		api.setNetweight((api_netweight[i] != null ? new Double(api_netweight[i]) : null));
		    		}
		    		api.setUnit_netweight(api_unit_netweight[i]);
		    		api.setDescription(api_description[i]);
		    		api.setRemarks(api_remarks[i]);
		    		
		    		
		    		// end set value

	  	    		  log.debug(api);


		     if(chkup == false){
		    	 log.debug(api);
		    	 api.setCreate_by(1111111l);
		    	 api.setCreate_on(create_on);
		    	 api.create();
		     }else{
		    log.debug(api);
	    	 api.update();

		     		}

		    	}
		    }



		    //xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxend apixxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx-


		
		
		redirect("process?action=Outsideprove&id=" + aop.getId() + "&cmd=preup");
		

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
		
		log.debug(aop);
		aop=aop.create();
		

	    //xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxstart apixxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx
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
String[] api_size_desc = request.getParameterValues("api_size_desc");
String[] api_unit_wnet_name = request.getParameterValues("api_unit_wnet_name");
String[] api_unit_qty_name = request.getParameterValues("api_unit_qty_name");
String[] api_unit_size_name = request.getParameterValues("api_unit_size_name");


log.debug("kkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkk");
		    if(api_id != null){
		    log.debug(api_id.length);}
		    log.debug("kkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkk");

		    if(request.getParameter("api_id") != null){
		    	boolean chkdel=true;
		    	log.debug("chkdet = true");
			    for(int j = 0 ; j<capilist.size() ;j++){
			    	chkdel= true;
			    	for(int k = 0; k<api_id.length ;k++){
			    		log.debug(capilist.get(j).getId()+"เทียบกับ"+api_id[k]);
			    	if(api_id[k].equals("")==false){
			    		if(Long.parseLong(api_id[k])==capilist.get(j).getId()){
			    		chkdel = false;
			    		log.debug("chkdet = false");
			    		}
			    	}
			    	}

			    	if(chkdel== true){

			    		//log.debug(capilist.get(j).getId()+"เทียบกับ"+api_id[0]);
			    		capilist.get(j).delete();
			    	}
			    }
		    	for(int i = 0; i < api_id.length;i++ ){
		    		boolean chkup = false ;

		    		ApplicationOutsideProveItem  api  = new ApplicationOutsideProveItem (db);
		    		   log.debug(api_id[i]);
		    		if(!api_id[i].equals("")){
			    		chkup = true ;
			    		log.debug("iiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiเตรียม");
			    		api = api.findByPk(Long.parseLong(api_id[i]));
			    		log.debug(api);
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
		    		api.setQty((api_qty[i] != null ? new Double(api_qty[i]) : null));
		    		api.setUnit_qty(api_unit_qty[i]);
		    		api.setNetweight((api_netweight[i] != null ? new Double(api_netweight[i]) : null));
		    		api.setUnit_netweight(api_unit_netweight[i]);
		    		api.setDescription(api_description[i]);
		    		api.setRemarks(api_remarks[i]);

	  	    		  log.debug(api);

		     if(chkup == false){
		    	 log.debug(api);
		    	 api.setCreate_by(1111111l);
		    	 api.setCreate_on(create_on);
		    	 api.create();
		     }else{
		    log.debug(api);
	    	 api.update();

		     		}

		    	}
		    }



		    //xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxend apixxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx-


		
	
log.debug("create aop"+aop);
		redirect("process?action=Outsideprove&id=" + aop.getId() + "&cmd=preup");
	}
	public void add(HttpServletRequest request, HttpServletResponse response)
	throws Exception {
		DeliveryExhibit de = new DeliveryExhibit(db);
		pre(request, response);
		Map<String, Object> demap = new HashMap<String, Object>() ;
		log.debug(demap);
		request.setAttribute("aop", demap);
		forward("?page=/CompareCase/AppReqApproveCompareForm.jsp", request,
		response);

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
			" aop.offcode_prove,ed2.offname offname_prove,ps.posname posname_prove," +
			" aop.prove_objective, aop.prove_objective," +
			" tip.title_name || stp.first_name || ' ' || stp.last_name staff_id_prove_name,"+
			" aop.doc_dept_name, aop.legislation_id, lg.legislation_name, aop.prove_no, case when aop.prove_no is null then '0' else '1' end status,"+
			" aop.isreturn, aop.offcode, ed.offname,aop.prove_date,aop.replace_position"+
			" from application_outside_prove aop" +
			" left join ed_office ed2 on ed2.offcode=aop.offcode_prove"+
			" left join legislation lg on lg.id=aop.legislation_id"+
			" left join ed_office ed on ed.offcode=aop.offcode"+
			" left join staff stp on stp.idcard_no=aop.staff_id_prove" +
			" left join position ps on ps.poscode = stp.poscode"+
			" left join title tip on tip.title_code=stp.title_code"+
			
			" where aop.id = ? "
			
			;
		
		
		
		aaesql = 
			
			" select api.id, api.application_outside_prove_id, api.product_code, api.brand_code,"+
			" nvl(api.product_name, pd.product_name)  product_name,"+
			" 	   case when api.brand_code is not null then  nvl(bm.brand_main_thai, bm.brand_main_eng) "+
			 "        else"+
			" 	       case when api.brand_name is not null then api.brand_name else '' end"+
			" 	   end brand_name,"+
			" api.qty, api.unit_qty,  nvl(qu.thname,qu.enname) unit_qty_name,"+
			" api.sizes_code, api.unit_size, sp.size_desc, nvl(su.thname, su.enname) unit_size_name,"+
			" api.netweight, api.unit_netweight,  nvl(wu.thname,wu.enname) unit_wnet_name,"+
			" api.description, api.remarks"+
			" from application_outside_prove_item api"+
			" left join product pd on pd.product_code=api.product_code"+
			" left join brand_main bm on bm.brand_main_code=api.brand_code and substr(api.product_code,1,4)=bm.duty_code"+
			 " left join unit qu on qu.unit_code=api.unit_qty"+
			" left join size_package sp on sp.size_code=api.sizes_code and substr(api.product_code,1,4)=bm.duty_code"+
			" left join unit su on su.unit_code=api.unit_size "+
			" left join unit wu on wu.unit_code=api.unit_netweight" +
			" where api.application_outside_prove_id = ? "
			
			
			;
		log.debug(aaesql);
		log.debug(sql);
		log.debug(ParameterUtil.getLongParam("id", request));
		Map<String, Object> demap = aop.findBySql(sql,ParameterUtil.getLongParam("id", request)).get(0);
		aop = aop.findByPk(ParameterUtil.getLongParam("id", request));
		
		ApplicationArrest aae = new ApplicationArrest(db);
		List<Map<String,Object>> aaelist = aae.findBySql(aaesql, aop.getId());
		request.setAttribute("aaelist", aaelist);
		
		log.debug(demap);
		log.debug(aop);
		request.setAttribute("aop", demap);
		request.setAttribute("oaop", aop);
		forward("?page=/ProveExhibit/Outside_Prove_Edit.jsp", request,
				response);

	}

	public void list(HttpServletRequest request, HttpServletResponse response)
			throws Exception {
		DeliveryExhibit de = new DeliveryExhibit(db);
		String sql;
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
		sql = 
			" select aop.id, aop.job_no, aop.ref_doc_no, aop.job_date, aop.ref_doc_date,"+
			" to_char(aop.job_date, 'dd/mm/yyyy', 'NLS_CALENDAR=''THAI BUDDHA'' NLS_DATE_LANGUAGE=THAI') job_date2,"+
			" to_char(aop.ref_doc_date, 'dd/mm/yyyy', 'NLS_CALENDAR=''THAI BUDDHA'' NLS_DATE_LANGUAGE=THAI') ref_dof_date2,"+
			" aop.dept_type, aop.doc_dept_name, aop.legislation_id, lg.legislation_name, aop.prove_no, case when aop.prove_no is null then '0' else '1' end status,"+
			" aop.isreturn, aop.offcode, ed.offname"+
			" from application_outside_prove aop"+
			" inner join legislation lg on lg.id=aop.legislation_id"+
			" inner join ed_office ed on ed.offcode=aop.offcode"

			
			;

		pre(request, response);
		/*alcon.add(" AND pke_arrest.getArrestIndictment(aa.track_no) like '%");
		alin.add(request.getParameter("guilt_base") + "%'");
		*/
		if (isNumeric(request.getParameter("legislation_id"))) {
			alconint.add(" AND aop.LEGISLATION_ID = ");
			alinint.add(new Integer(request.getParameter("legislation_id")));
		}
	/*	
		if (isNumeric( request.getParameter("status"))) {
			alconint.add(" AND case when aop.prove_no is null then '0' else '1' end = ");
			alinint.add(new Integer(request.getParameter("status")));
		}
*//*		
		if (request.getParameter("case_fine") != null
				&& request.getParameter("case_fine") != null) {
			if (request.getParameter("case_fine").equals("") == false
					&& request.getParameter("case_fine").equals("") == false) {
				alcontween
						.add(" AND (select sum(nvl(lbk.fine,0)) from application_arrest_lawbreaker lbk where lbk.track_no=aa.track_no) between ");
				alintween.add(new Integer(request.getParameter("case_fine")));
				alcontween.add(" AND ");
				alintween.add(new Integer(request.getParameter("case_fine2")));
			}
		}
*//*
		alcon.add(" AND pke_arrest.getArrestLawbreaker(aa.track_no) like '%");
		alin.add(request.getParameter("lawbreaker_name") + "%'");
*/
		alcon.add(" AND case when aop.prove_no is null then '0' else '1' end like '%");
		alin.add(request.getParameter("status") + "%'");

		alcon.add(" AND aop.doc_dept_name like '%");
		alin.add(request.getParameter("doc_dept_name") + "%'");
		
		alcon.add(" AND aop.offcode like '%");
		alin.add(request.getParameter("offcode") + "%'");
		
		alcondate
				.add(" AND add_months(to_date(aop.job_date),6516) between to_date('");
		alindate.add(request.getParameter("job_date1")
				+ "','dd/mm/yyyy')");
		alcondate.add(" AND to_date('");
		alindate.add(request.getParameter("job_date2")
				+ "','dd/mm/yyyy')");
		
		alcondate.add(" AND add_months(to_date(aop.ref_doc_date),6516) between to_date('");
		alindate.add(request.getParameter("ref_doc_date1")+ "','dd/mm/yyyy')");
		alcondate.add(" AND to_date('");
		alindate.add(request.getParameter("ref_doc_date2")+ "','dd/mm/yyyy')");
/*
		alcondate
				.add(" AND add_months(to_date(bi.case_date),6516) between to_date('");
		alindate.add(request.getParameter("case_date") + "','dd/mm/yyyy')");
		alcondate.add(" AND to_date('");
		alindate.add(request.getParameter("case_date2") + "','dd/mm/yyyy')");
*//*
		alcondate
				.add(" AND add_months(to_date(aa.application_date),6516) between to_date('");
		alindate.add(request.getParameter("application_date")
				+ "','dd/mm/yyyy')");
		alcondate.add(" AND to_date('");
		alindate.add(request.getParameter("application_date2")
				+ "','dd/mm/yyyy')");
*/
		alcon.add(" AND aop.job_no like '%");
		alin.add(request.getParameter("job_no") + "%'");
/*
		alcon.add(" AND aa.scene_district like '%");
		alin.add(request.getParameter("district") + "%'");
		alcon.add(" AND aa.scene_subdistrict like '%");
		alin.add(request.getParameter("tambol") + "%'");
*/
		alcon.add(" AND aop.ref_doc_no like '%");
		alin.add(request.getParameter("ref_doc_no") + "%'");

		alcon.add(" AND aop.dept_type like '%");
		alin.add(request.getParameter("dept_type") + "%'");

		alcon.add(" AND aop.prove_no like '%");
		alin.add(request.getParameter("prove_no") + "%'");
		
		if(request.getParameter("isreturn")!= null){
		alcon.add(" AND aop.isreturn like '%");
		alin.add(request.getParameter("isreturn") + "%'");
		}
/*
		alcon
				.add(" AND  ti.title_name || st.first_name || ' ' || st.last_name like '%");
		alin.add(request.getParameter("staff_delivery") + "%'");
*//*
		alcon.add(" AND aal.lawbreaker_id_card like '%");
		alin.add(request.getParameter("lawbreaker_id_card") + "%'");
*//*
		alcon.add(" AND pd.product_name like '%");
		alin.add(request.getParameter("product_name") + "%'");
*//*
		alcon.add(" AND aa.product_group_id like '%");
		alin.add(request.getParameter("product") + "%'");
*//*
		alcon.add(" AND inc.case_law_id like '%");
		alin.add(request.getParameter("case_law_id") + "%'");
*//*
		alcon.add(" AND aa.offcode like '%");
		alin.add(request.getParameter("offcode") + "%'");
*//*
		alcon.add(" AND aa.accuser_type like '%");
		alin.add(request.getParameter("accuserType") + "%'");
*//*
		alconcbox1.add(" OR bi.case_quality like '%");
		alincbox1.add(request.getParameter("case_quality1") + "%'");
*//*
		alconcbox1.add(" OR bi.case_quality like '%");
		alincbox1.add(request.getParameter("case_quality2") + "%'");
*//*
		alconcbox1.add(" OR aa.have_culprit like '%");
		alincbox1.add(request.getParameter("have_culprit") + "%'");
*//*
		alconcbox2.add(" OR bi.case_last like '%");
		alincbox2.add(request.getParameter("caseLast1") + "%'");
*//*
		alconcbox2.add(" OR bi.case_last like '%");
		alincbox2.add(request.getParameter("caseLast2") + "%'");
*//*
		alconcbox2.add(" OR bi.case_last like '%");
		alincbox2.add(request.getParameter("caseLast3") + "%'");
*//*
		alcon.add(" AND ali.iswithdraw like '%");
		alin.add(request.getParameter("iswithdraw") + "%'");
*//*
		alcon.add(" AND inc.exhibit_wild like '%");
		alin.add(request.getParameter("exhibit_wild") + "%'");
*//*
		alcon.add(" AND ana.notice_no like '%");
		alin.add(request.getParameter("notice_no") + "%'");
*//*
		alcon.add(" AND asw.warrant_no like '%");
		alin.add(request.getParameter("warrant_no") + "%'");
*//*
		alcon.add(" AND asi.track_no like '%");
		alin.add(request.getParameter("asi_track_no") + "%'");
*/
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
/*
		// add between int case
		for (int i = 0; i < alintween.size(); i += 2) {
			sql += alcontween.get(i) + (Integer) alintween.get(i);
			sql += alcontween.get(i + 1) + (Integer) alintween.get(i + 1);
		}
*//*
		// add check box case
		if (true) {
			int chk = 0;
			String boxsql = "";

			for (int i = 0; i < alincbox1.size(); i++) {
				if (alincbox1.get(i).equals("%'")
						|| alincbox1.get(i).equals("null%'")) {
					alconcbox1.set(i, "");
					alincbox1.set(i, "");
					chk++;
				}
				boxsql += alconcbox1.get(i) + alincbox1.get(i);
			}
*//*
			if (boxsql.equals("") == false) {
				sql += " And ( 1 = 2 " + boxsql + " )";
			}
		}
*//*
		// add check box case
		if (true) {
			int chk = 0;
			String boxsql = "";

			for (int i = 0; i < alincbox2.size(); i++) {
				if (alincbox2.get(i).equals("%'")
						|| alincbox2.get(i).equals("null%'")) {
					alconcbox2.set(i, "");
					alincbox2.set(i, "");
					chk++;
				}
				boxsql += alconcbox2.get(i) + alincbox2.get(i);
			}
			if (boxsql.equals("") == false) {
				sql += " And ( 1 = 2 " + boxsql + " )";
			}
		}
	*/
		sql += " order by lg.legislation_name, ed.offname, aop.job_date desc ";
		log.debug(sql);
		List<Map<String, Object>> dblist = de.findBySql(sql, null);
		log.debug(dblist);

		List<Map<String, Object>> aamax = maxid.findBySql(
				"select max(id) max from application_arrest", null);
		log.debug(aamax);
		request.setAttribute("aamax", aamax.get(0));
		request.setAttribute("dblist", dblist);
		forward("?page=/ProveExhibit/Outside_Prove_List.jsp", request,
				response);

		
	}
	   public boolean isNumeric(String s) {
		   try{
			   return s.matches("[-+]?\\d*\\.?\\d+");
		   }catch (Exception e) {
			   return false ;
		}

		      }
}
