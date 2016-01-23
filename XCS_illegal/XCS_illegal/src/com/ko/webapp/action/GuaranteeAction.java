package com.ko.webapp.action;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.Vector;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.jfree.util.Log;

import com.ko.domain.ApplicationArrestIndictment;
import com.ko.domain.ApplicationArrestTeam;
import com.ko.domain.ApplicationInvest;
import com.ko.domain.ApplicationInvestTeam;
import com.ko.domain.ApplicationNoticeArrest;
import com.ko.domain.ApplicationSearchWarrant;
import com.ko.domain.ApplicationSincereConfirm;
import com.ko.domain.ApplicationSincereIndictment;
import com.ko.domain.ApplicationSincereTeam;
import com.ko.domain.Court;
import com.ko.domain.DutyGroup;
import com.ko.domain.EdOffice;

import com.ko.domain.Indictment;
import com.ko.domain.Legislation;
import com.ko.domain.Position;
import com.ko.domain.Province;
import com.ko.domain.Staff;
import com.ko.domain.Title;
import com.ko.domain.TranLog;
import com.ko.util.DateUtil;
import com.ko.util.RunningKey;
import com.ko.webapp.form.WarrantSearchForm;

public class GuaranteeAction extends BaseAction {
	private Long asf_id = new Long(0l);
	String menuID = "4";
	@Override
	public void _default(HttpServletRequest request,
			HttpServletResponse response) throws Exception {
		// TODO Auto-generated method stub

		if(uData.chkUserMenu(menuID)==true){
			forward("?page=/Invest/2_27_list.jsp", request, response);
		}else{
    		HttpSession session = request.getSession();
  		  	session.invalidate();
  		  	request.setAttribute("errMsg", "ผู้ใช้ไม่มีสิทธิ์ดำเนินการ");
  		  	forward("?page=/login.jsp", request, response);
  		  
    	}
	}
	public void find(HttpServletRequest request,HttpServletResponse response) throws Exception {
		searchData(request,response);
		forward("?page=/Invest/2_27_list.jsp", request,response);
	}

	private void searchData(HttpServletRequest request,HttpServletResponse response)throws Exception {
		//String sql ="";
		String slsql;
		String countsql;
		
		countsql = "select count(*)" +
		" from APPLICATION_SINCERE_CONFIRM asf" +
		" inner join staff st on st.idcard_no=asf.staff_idcardno_detect" +
		" left join title ti on ti.title_code=st.title_code ";
		
		slsql = "select asf.id, asf.track_no, asf.detect_date, asf.notice_date," +
		" to_char(asf.detect_date, 'dd/mm/yyyy', 'NLS_CALENDAR=''THAI BUDDHA'' NLS_DATE_LANGUAGE=THAI')  detect_date2," +
		" to_char(asf.notice_date, 'dd/mm/yyyy', 'NLS_CALENDAR=''THAI BUDDHA'' NLS_DATE_LANGUAGE=THAI')  notice_date2," +
		" asf.owner_name, ti.title_name || st.first_name || ' ' || st.last_name detect_name, pke_invest.getSincereIndictment(asf.id) indictment_name," +
		" asf.store_place, asf.detect_result" +
		" from APPLICATION_SINCERE_CONFIRM asf" +
		" inner join staff st on st.idcard_no=asf.staff_idcardno_detect" +
		" left join title ti on ti.title_code=st.title_code ";
		
		String whText = " where 1=1 ";
		if(!request.getParameter("detect_datefrom").trim().equals(""))
			whText += " and to_char(asf.detect_date,'yyyymmdd') >= '" + DateUtil.formatConditionDate(request.getParameter("detect_datefrom").trim()) + "'";
		if(!request.getParameter("detect_dateto").trim().equals(""))
			whText += " and to_char(asf.detect_date,'yyyymmdd') <= '" + DateUtil.formatConditionDate(request.getParameter("detect_dateto").trim()) + "'";
		if(!request.getParameter("notice_datefrom").trim().equals(""))
			whText += " and to_char(asf.notice_date,'yyyymmdd') >= '" + DateUtil.formatConditionDate(request.getParameter("notice_datefrom").trim()) + "' ";
		if(!request.getParameter("notice_dateto").trim().equals(""))
			whText += " and to_char(asf.notice_date,'yyyymmdd') <= '" + DateUtil.formatConditionDate(request.getParameter("notice_dateto").trim()) + "' ";
		if(!request.getParameter("owner_name").trim().equals(""))
			whText += " and asf.owner_name like '%" + request.getParameter("owner_name").trim() + "%'";
		if(!request.getParameter("detect_name").trim().equals(""))
			whText += " and nvl(ti.title_name,'') || nvl(st.first_name,'') || ' ' || nvl(st.last_name,'') like '%" + request.getParameter("detect_name").trim() + "%'";
		if(!request.getParameter("indictment_name").trim().equals(""))
			whText += " and pke_invest.getSincereIndictment(asf.id) like '%" + request.getParameter("indictment_name").trim() + "%'";
		
		ApplicationSincereConfirm  asf  = new ApplicationSincereConfirm(db);
		log.debug(countsql+whText);
		Integer totalRow = asf.countBySql(countsql+whText, null);
		pageUtil.setTotalRow(totalRow);
		pageUtil.setPageSize(20);

		log.debug(slsql+whText + " order by asf.notice_date desc");
		List<Map<String, Object>> asfmap = asf.findBySql(slsql+whText + " order by asf.notice_date desc", null,pageUtil);
        request.setAttribute("asfmap", asfmap);
        request.setAttribute("rowCount", asfmap.size());
	}
	
	public void add(HttpServletRequest request,HttpServletResponse response)throws Exception {

		Random generator = new Random();
		request.setAttribute("action","process?action=Guarantee&cmd=add");
		
		ApplicationSincereConfirm asf = new ApplicationSincereConfirm(db);

		asf.setInput_date(DateUtil.getCurrentDate());
		request.setAttribute("asf", asf);

		ApplicationSincereTeam ast = new ApplicationSincereTeam(db);
		List<ApplicationSincereTeam> astlist = new ArrayList<ApplicationSincereTeam>();
		request.setAttribute("astlist", astlist);

		ApplicationSincereIndictment asi = new ApplicationSincereIndictment(db);
        Staff st = new Staff(db);
        Title ti = new Title(db);
        Position ps = new Position(db);
        EdOffice ed = new EdOffice(db);
        Indictment inc = new Indictment(db);

        request.setAttribute("name_create_by", create_by_name);
		Province pv = new Province(db);
		List<Province> pvlist =  pv.findAll();
		request.setAttribute("pvlist", pvlist);
		request.setAttribute("offcode", offcode);
		request.setAttribute("offname", offname);
		request.setAttribute("staff_name_detect", uData.getFullName());
    	request.setAttribute("staff_idcardno_detect", uData.getIdCard());
    	request.setAttribute("offcode_detect", uData.getOffcode());
    	request.setAttribute("posname_detect", uData.getPosname());
    	request.setAttribute("poscode_detect", uData.getPoscode());
		forward("?page=/Invest/create2_27_form.jsp", request, response);
	}
	public void create(HttpServletRequest request,HttpServletResponse response)throws Exception {

		ApplicationSincereConfirm asf = new ApplicationSincereConfirm(db);
		ApplicationSincereConfirm asf2 = new ApplicationSincereConfirm(db);		
	    bindForm(asf);
	    asf.setTrack_no(new RunningKey(db).getRunningKey("APPLICATION_SINCERE_CONFIRM","","",asf.getOffcode()));
	    asf.setDetect_date(DateUtil.getDateFromString(request.getParameter("detect_date")+" "+request.getParameter("detect_time")));
	    asf.setNotice_date(DateUtil.getDateFromString(request.getParameter("notice_date")+" "+request.getParameter("notice_time")));
	    log.debug(" asf.getDetect_date() ::  "+asf.getDetect_date());
	    log.debug(" asf.getNotice_date() ::  "+asf.getNotice_date());
		asf.setCreate_by(create_by);
		asf.setCreate_on(create_on);
	    asf2 = asf.create();
	    
		asf_id = asf2.getId();
	//	bindForm(asf);
		uplist(request, response, asf);
		uplistinc(request, response, asf);
		redirect("process?action=Guarantee&cmd=view&id="+asf.getId(), request, response);
	}

	// retrive
	public void view(HttpServletRequest request,HttpServletResponse response)throws Exception {


		String id = request.getParameter("id");
		request.setAttribute("action","process?action=Guarantee&cmd=view&id="+id);
		
		ApplicationSincereConfirm asf = new ApplicationSincereConfirm(db);
		asf =asf.findByPk(Long.parseLong(id));
		//log.debug(" asf.getNotice_date() "+asf.getNotice_date());
		//log.debug(" asf.getDetect_date() "+asf.getDetect_date());
		request.setAttribute("asf", asf);
		request.setAttribute("offcode", asf.getOffcode());
		request.setAttribute("offname", asf.getOffname());
		request.setAttribute("name_create_by", create_by_name);
		ApplicationSincereTeam ast = new ApplicationSincereTeam(db);
		List<ApplicationSincereTeam> astlist = ast.findByWhere("APPLICATION_SINCERE_CONFIRM_ID=?", id);
		request.setAttribute("astlist", astlist);

		ApplicationSincereIndictment asi = new ApplicationSincereIndictment(db);
		List<ApplicationSincereIndictment> asilist = asi.findByWhere("APPLICATION_SINCERE_CONFIRM_ID=?", id);
		request.setAttribute("asilist", asilist);
        
        String sqlS = "";
        sqlS += " select ti.title_name || st.first_name || ' ' || st.last_name staff_name_detect, asf.staff_idcardno_detect, ";
        sqlS += " asf.poscode_detect, asf.offcode_detect, nvl(st.pos_name,ps.posname || ' ' || st.staff_level) posname_detect ";
        sqlS += " from application_sincere_confirm asf ";
        sqlS += " inner join staff st on st.idcard_no=asf.staff_idcardno_detect ";
        sqlS += " left join title ti on ti.title_code=st.title_code ";
        sqlS += " left join position ps on ps.poscode=asf.poscode_detect ";
        sqlS += " where asf.track_no = '" + asf.getTrack_no() + "'";
        List<Map<String, Object>> stStaff = asf.findBySql(sqlS);
        if(stStaff.size() == 1 ){
        	request.setAttribute("staff_name_detect", (stStaff.get(0).get("staff_name_detect") != null ? stStaff.get(0).get("staff_name_detect").toString() : ""));
        	request.setAttribute("staff_idcardno_detect", (stStaff.get(0).get("staff_idcardno_detect") != null ? stStaff.get(0).get("staff_idcardno_detect").toString() : ""));
        	request.setAttribute("offcode_detect", (stStaff.get(0).get("offcode_detect") != null ? stStaff.get(0).get("offcode_detect").toString() : ""));
        	request.setAttribute("posname_detect", (stStaff.get(0).get("posname_detect") != null ? stStaff.get(0).get("posname_detect").toString() : ""));
        	request.setAttribute("poscode_detect", (stStaff.get(0).get("poscode_detect") != null ? stStaff.get(0).get("poscode_detect").toString() : ""));
        }
        
		Province pv = new Province(db);
		List<Province> pvlist =  pv.findAll();
		request.setAttribute("pvlist", pvlist);

		prelist(request, response, id);


		forward("?page=/Invest/update2_27_form.jsp", request, response);
	}

	public void update(HttpServletRequest request,HttpServletResponse response)throws Exception {
		ApplicationSincereConfirm asf = new ApplicationSincereConfirm(db);
		ApplicationSincereConfirm asf2 = new ApplicationSincereConfirm(db);
		asf = asf.findByPk(Long.parseLong(request.getParameter("id")));
		bindForm(asf);
		asf.setDetect_date(DateUtil.getDateFromString(request.getParameter("detect_date")+" "+request.getParameter("detect_time")));
	    asf.setNotice_date(DateUtil.getDateFromString(request.getParameter("notice_date")+" "+request.getParameter("notice_time")));
	    //log.debug(" asf.getDetect_date() ::  "+asf.getDetect_date());
	    //log.debug(" asf.getNotice_date() ::  "+asf.getNotice_date());
	    asf.setUpdate_on(update_on);
	    asf.setUpdate_by(update_by);
	    asf2 = asf.update();
		asf_id = asf2.getId();	
		log.debug(asf2);
		log.debug(asf_id);
		uplist(request, response, asf);
		uplistinc(request, response, asf);
		redirect("process?action=Guarantee&cmd=view&id="+asf.getId(), request, response);
	}

	// deletenn
	public void delete(HttpServletRequest request,HttpServletResponse response)throws Exception {
		ApplicationSincereConfirm asf = new ApplicationSincereConfirm(db);

		ApplicationSincereTeam ast = new ApplicationSincereTeam(db);
		ast.deleteByWhere("APPLICATION_SINCERE_CONFIRM_ID=?", new Long(request.getParameter("id")));
		ApplicationSincereIndictment asi = new ApplicationSincereIndictment(db);
		asi.deleteByWhere("APPLICATION_SINCERE_CONFIRM_ID=?", new Long(request.getParameter("id")));
		asf.deleteByPk(new Long(request.getParameter("id")));

		forward("?page=/Invest/2_27_list.jsp", request,response);

	}
	public void uplist(HttpServletRequest request,HttpServletResponse response,ApplicationSincereConfirm ai) throws Exception {
		   
		//xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxstart aiixxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx
				   ApplicationSincereTeam caii = new ApplicationSincereTeam(db);

				    List<ApplicationSincereTeam> caiilist = caii.findByWhere("APPLICATION_SINCERE_CONFIRM_ID = ?",ai.getId());


				    String [] aii_id = ai.getAii_id();
				     String [] aii_staff_idcardno = ai.getAii_idcard_no();
				    String [] aii_staff_poscode = ai.getAii_poscode();
				    String [] aii_staff_offcode = ai.getAii_offcode();

				    if(aii_id == null){
				   	 for(int j = 0 ; j<caiilist.size() ;j++){
				   		 caiilist.get(j).delete();
				   	    	
				   	    	}
				    }
				    log.debug("kkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkk");
				    if(aii_id != null){
				    log.debug(aii_id.length);}
				    log.debug("kkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkk");

				    if(request.getParameter("aii_id") != null){
				    	boolean chkdel=true;
				    	log.debug("chkdet = true");
					    for(int j = 0 ; j<caiilist.size() ;j++){
					    	chkdel= true;
					    	for(int k = 0; k<aii_id.length ;k++){
					    		log.debug(caiilist.get(j).getId()+"เทียบกับ"+aii_id[k]);
					    	if(aii_id[k].equals("")==false){
					    		if(Long.parseLong(aii_id[k])==caiilist.get(j).getId()){
					    		chkdel = false;
					    		log.debug("chkdet = false");
					    		}
					    	}
					    	}

					    	if(chkdel== true){

					    		//log.debug(caiilist.get(j).getId()+"เทียบกับ"+aii_id[0]);
					    		caiilist.get(j).delete();

					    	}
					    }
				    	for(int i = 0; i < aii_id.length;i++ ){
				    		boolean chkup = false ;

				    		ApplicationSincereTeam aii  = new ApplicationSincereTeam(db);
				    		if(aii_id[i].equals("")==false){
					    		chkup = true ;
					    		log.debug("เตรียม");
					    		aii = aii.findByPk(Long.parseLong(aii_id[i]));
					    	}

				    	   aii.setApplication_sincere_confirm_id(asf_id);
				    		aii.setStaff_idcard_no(aii_staff_idcardno[i]);
				    		
				    		aii.setOffcode_staff(aii_staff_offcode[i]);
				    		aii.setPoscode_staff(aii_staff_poscode[i]);
				    	    log.debug(aii);
				     if(chkup == false){

				    	 aii.setCreate_by(create_by);
				    	 aii.setCreate_on(create_on);
				    	 aii.create();
				     }else{
				    	  aii.setUpdate_by(update_by);
				    	    aii.setUpdate_on(update_on);
			    	 aii.update();

				     		}

				    	}
				    }

		 //xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxend aiixxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx-
			   
			   }
	public void uplistinc(HttpServletRequest request,HttpServletResponse response,ApplicationSincereConfirm ai) throws Exception {
		 //xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxstart aaixxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx
		   ApplicationSincereIndictment caai = new ApplicationSincereIndictment(db);
		    List<ApplicationSincereIndictment> caailist = caai.findByWhere("APPLICATION_SINCERE_CONFIRM_ID = ?",ai.getId());


		    String [] aai_id = ai.getAai_id();
		    String [] aai_indictment_id = ai.getAai_indictment_id();
			
			 if(aai_id == null){
				 for(int j = 0 ; j<caailist.size() ;j++){
					 caailist.get(j).delete();
				    	
				    	}
			 }
		    log.debug("kkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkk");
		    if(aai_id != null){
		    log.debug(aai_id.length);}
		    log.debug("kkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkk");

	     if(ai.getAai_id() != null){
		    	boolean chkdel=true;
		    	log.debug("chkdet = true");
			    for(int j = 0 ; j<caailist.size() ;j++){
			    	chkdel= true;
			    	for(int k = 0; k<aai_id.length ;k++){
			    		log.debug(caailist.get(j).getId()+"เทียบกับ"+aai_id[k]);
			    	if(aai_id[k].equals("")==false){
			    		if(Long.parseLong(aai_id[k])==caailist.get(j).getId()){
			    		chkdel = false;
			    		log.debug("chkdet = false");
			    		}
			    	}
			    	}

			    	if(chkdel== true){

			    		//log.debug(caailist.get(j).getId()+"เทียบกับ"+aai_id);
			    		caailist.get(j).delete();


			    	}
			    }
		    	for(int i = 0; i < aai_id.length;i++ ){
		    		boolean chkup = false ;

		    		ApplicationSincereIndictment aai  = new ApplicationSincereIndictment(db);
		    		if(aai_id[i].equals("")==false){
			    		chkup = true ;
			    		log.debug("เตรียม");
			    		aai = aai.findByPk(Long.parseLong(aai_id[i]));
			    	}
		    		
		    	   aai.setApplication_sincere_confirm_id(asf_id);
		    	   aai.setIndictment_id(new Long(aai_indictment_id[i]));
		    	  
		    	   




		     if(chkup == false){
		    	 aai.setCreate_by(create_by);
		    	 aai.setCreate_on(create_on);
		    	 aai.create();
		    	 log.debug("create success");}else{
		    	 log.debug(aai);
		    	 aai.setUpdate_by(update_by);
	    	    aai.setUpdate_on(update_on);

		    	 aai.update();
		    	 log.debug("update success");}

		    	}
		   }



		    //xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxend aaixxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx-

			   }
	 public void prelist(HttpServletRequest request,HttpServletResponse response,String id) throws Exception {
		  String	aatsql = " SELECT aat.ID, " +
			" aat.STAFF_IDCARD_NO,aat.POSCODE_STAFF ,st.title_code,st.first_name," +
			" st.last_name,t.title_name, ps.posname , " +
			" aat.offcode_staff, ed.offname " +
			" FROM APPLICATION_SINCERE_TEAM aat " +
			" left join staff st on st.idcard_no = aat.STAFF_IDCARD_NO " +
			" left join title t on t.title_code = st.title_code " +
			" left join ed_office ed on ed.offcode = aat.OFFCODE_STAFF" +
			" left join position ps on ps.poscode = aat.poscode_staff" +
			" where aat.APPLICATION_SINCERE_CONFIRM_ID = ?";



			Log.debug(aatsql);
			ApplicationArrestTeam aat = new ApplicationArrestTeam(db);
			List<Map<String,Object>> aatlist = aat.findBySql(aatsql,id);
			
			
			

			String incsql=" SELECT aai.ID,  aai.APPLICATION_SINCERE_CONFIRM_ID, "+
				" aai.INDICTMENT_ID, "+
				" inc.case_law_id, inc.penalty_case_law_id, inc.guilt_base," +
				" inc.EXHIBIT_WILD"+
				" FROM APPLICATION_SINCERE_INDICTMENT aai"+
				" left join indictment inc on inc.indictment_id = aai.indictment_id "+
				" where aai.APPLICATION_SINCERE_CONFIRM_ID = ?";
			
			Log.debug(incsql);
			ApplicationArrestTeam inc = new ApplicationArrestTeam(db);
			List<Map<String,Object>> inclist = inc.findBySql(incsql,id);
			 
			 request.setAttribute("aatlist", aatlist);
			 request.setAttribute("aailist", inclist);
		 
			   }


}
