package com.ko.webapp.action;

import java.text.SimpleDateFormat;
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

import com.ko.domain.ApplicationArrest;
import com.ko.domain.ApplicationArrestTeam;
import com.ko.domain.ApplicationInvest;
import com.ko.domain.ApplicationInvestTeam;
import com.ko.domain.ApplicationNoticeArrest;
import com.ko.domain.ApplicationSearchWarrant;
import com.ko.domain.ApplicationSearchWarrantteam;
import com.ko.domain.Court;
import com.ko.domain.District;
import com.ko.domain.EdOffice;
import com.ko.domain.Province;
import com.ko.domain.Running;
import com.ko.domain.Staff;
import com.ko.domain.Subdistrict;
import com.ko.domain.Title;
import com.ko.domain.TranLog;
import com.ko.util.DateUtil;
import com.ko.util.RunningKey;
import com.ko.webapp.form.StaffForm;
import com.ko.webapp.form.WarrantSearchForm;
import com.ko.webapp.util.ParameterUtil;

public class WarrantAction extends BaseAction {
	public Long asw_id = new Long(0l);
	String menuID = "3";
	@Override
	public void _default(HttpServletRequest request,
			HttpServletResponse response) throws Exception {
		// TODO Auto-generated method stub
		
		if(uData.chkUserMenu(menuID)==true){
			Court c = new Court(db);
			List<Court> clist = c.findByWhere(" 1=1 order by court_name", null);
			request.setAttribute("clist", clist);
			
			forward("?page=/Invest/searchwarrant_request_search.jsp", request,response);
			//System.out.println("Done");
		}else{
    		HttpSession session = request.getSession();
  		  	session.invalidate();
  		  	request.setAttribute("errMsg", "ผู้ใช้ไม่มีสิทธิ์ดำเนินการ");
  		  	forward("?page=/login.jsp", request, response);
  		  
    	}
	}

	public void add(HttpServletRequest request, HttpServletResponse response)
			throws Exception {

		//new RunningKey(db).getRunningKey("APPLICATION_SEARCH_WARRANT","","",offcode);

		ApplicationSearchWarrant asw = new ApplicationSearchWarrant(db);
	//	asw.setTrack_no(new RunningKey(db).getRunningKey("APPLICATION_SEARCH_WARRANT","","",offcode));
		// asw.setRequest_date(new Date());
		// System.out.println();
		ApplicationSearchWarrantteam ast = new ApplicationSearchWarrantteam(db);
		Court c = new Court(db);
		List<Court> clist = c.findByWhere(" 1=1 order by court_name", null);
		Staff st = new Staff(db);
		Title ti = new Title(db);
		EdOffice ed = new EdOffice(db);
		Province pv = new Province(db);
		List<Province> pvlist = pv.findAll();
		District d = new District(db);
		// List<District> dlist = d.findAll();
		Subdistrict sd = new Subdistrict(db);
		// List<Subdistrict> sdlist = sd.findAll();
		ApplicationNoticeArrest ana = new ApplicationNoticeArrest(db);
		request.setAttribute("action","process?action=Warrant&cmd=add");
		// request.setAttribute("tlog", tlog);
		request.setAttribute("asw", asw);
		request.setAttribute("ast", ast);
		request.setAttribute("clist", clist);
		request.setAttribute("st", st);
		request.setAttribute("ti", ti);
		request.setAttribute("ed", ed);
		request.setAttribute("pv", pvlist);
		request.setAttribute("d", d);
		request.setAttribute("sd", sd);
		request.setAttribute("ana", ana);
		request.setAttribute("ana", ana);
		request.setAttribute("staff_name_request", uData.getFullName());
		request.setAttribute("staff_id_request", uData.getIdCard());
		request.setAttribute("posname_request", uData.getPosname());
		request.setAttribute("poscode_request", uData.getPoscode());
		request.setAttribute("offcode_request", uData.getOffcode());
		request.setAttribute("offname_request", uData.getOffname());
		request.setAttribute("career_request", "รับราชการ");
		
		forward("?page=/Invest/createwarrant.jsp", request, response);
	}

	public void create(HttpServletRequest request, HttpServletResponse response)
			throws Exception {
		ApplicationSearchWarrant asw = new ApplicationSearchWarrant(db);
		//ApplicationSearchWarrant asw2 = new ApplicationSearchWarrant(db);
		bindForm(asw);
		asw.setTrack_no(new RunningKey(db).getRunningKey("APPLICATION_SEARCH_WARRANT","","",offcode));
		asw.setSearch_datefrom(DateUtil.getDateFromString(request.getParameter("search_datefrom") +" "+request.getParameter("search_timefrom")));
		if(!request.getParameter("search_dateto").equals(""))
			asw.setSearch_dateto(DateUtil.getDateFromString(request.getParameter("search_datefrom")+" "+request.getParameter("search_dateto")));
		else
			asw.setSearch_dateto(null);
		
		asw.setConsider_date(DateUtil.getDateFromString(request.getParameter("consider_date")+" "+request.getParameter("consider_time")));	
		
		if(asw.getCourt_id()!=null){
			if(asw.getCourt_id()==0){
				asw.setCourt_id(null);
			}	
		}
		if(asw.getCourt_id_arrest()!=null){
			if(asw.getCourt_id_arrest()==0){
				asw.setCourt_id_arrest(null);
			}
		}
		if(asw.getCourt_id_familiar()!=null){
			if(asw.getCourt_id_familiar()==0){
				asw.setCourt_id_familiar(null);
			}
		}
		if(request.getParameter("chk_continue") != null)
			asw.setChk_continue("Y");
		else
			asw.setChk_continue("N");
		asw.setCreate_by(create_by);
		asw.setCreate_on(create_on);		
		asw = asw.create();
//		asw_id = asw2.getId();
	//	bindForm(asw);
		uplist(request, response, asw);
		// aswt.create();
		//forward("?page=/Invest/createwarrant.jsp", request, response);
		redirect("process?action=Warrant&cmd=view&id="+asw.getId(), request, response);
	}

	public void findWarrant(HttpServletRequest request,HttpServletResponse response) throws Exception {
		searchData(request,response);
		forward("?page=/Invest/searchwarrant_request_search.jsp", request,response);

	}
	
	private void searchData(HttpServletRequest request, HttpServletResponse response)throws Exception {
		String slsql;
		String countsql;

		 slsql = "select asw.id application_search_warrant_id, nvl(asw.request_no,'-') request_no, asw.request_date"
				+ ",to_char(asw.request_date,'dd/mm/yyyy', 'NLS_CALENDAR=''THAI BUDDHA'' NLS_DATE_LANGUAGE=THAI') request_date2"
				+ ",asw.court_id, c.court_name, tir.title_name || str.first_name || ' ' || str.last_name staff_name_req, asw.owner_name,"
				+ "asw.province_code, asw.district_code, asw.subdistrict_code, asw.owner_name || pke_invest.getWarrantAddress(asw.id) owner_address, asw.search_cause,"
				+ "case when asw.warrant_no is null then '1' "
				+ "when asw.warrant_no is not null then '2' "
				+ "when asw.isapprove='N' then '3' end status "
				+ "from application_search_warrant asw "
				+ "inner join court c on c.id=asw.court_id "
				+ "inner join staff str on str.idcard_no=asw.staff_id_request "
				+ "left join title tir on tir.title_code=str.title_code ";

		 countsql = "select count(*) "
				+ "from application_search_warrant asw "
				+ "inner join court c on c.id=asw.court_id "
				+ "inner join staff str on str.idcard_no=asw.staff_id_request "
				+ "left join title tir on tir.title_code=str.title_code  ";
		 
		String whText = " where 1 = 1 ";
		if(uData.IsAdmin()==false)
			whText += " and asw.offcode_request = '" + uData.getOffcode() + "' ";
		if(!request.getParameter("request_no").trim().equals(""))
			 whText += " AND asw.request_no like '%" + request.getParameter("request_no").trim() + "%'";
		if(!request.getParameter("court_id").equals(""))
			whText += " AND asw.court_id = '" + request.getParameter("court_id") + "'";
		if(!request.getParameter("name_request").trim().equals(""))
			whText += " AND nvl(tir.title_name,'') || nvl(str.first_name,'') || ' ' || nvl(str.last_name,'') like '%" + request.getParameter("name_request").trim() + "%'";
		if(!request.getParameter("request_date_start").trim().equals(""))
			whText += " and to_char(asw.request_date,'yyyymmdd')>='" + DateUtil.formatConditionDate(request.getParameter("request_date_start")) + "'";
		if(!request.getParameter("request_date_stop").trim().equals(""))
			whText += " and to_char(asw.request_date,'yyyymmdd')<='" + DateUtil.formatConditionDate(request.getParameter("request_date_stop")) + "'";
		if(!request.getParameter("status").equals(""))
			whText += " AND case when asw.warrant_no is null then '1' when asw.warrant_no is not null then '2'  when asw.isapprove='N' then '3' end = '" + request.getParameter("status") + "'";
		if(!request.getParameter("owner_name").trim().equals(""))
			whText += " AND asw.owner_name like '%" + request.getParameter("owner_name").trim() + "%'";
		if(!request.getParameter("province_code").equals(""))
			whText += " AND asw.province_code = '" + request.getParameter("province_code") + "'";
		if(!request.getParameter("subdistrict_code").equals(""))
			whText += " AND asw.subdistrict_code = '" + request.getParameter("subdistrict_code") + "'";
		if(!request.getParameter("district_code").equals(""))
			whText += " AND asw.district_code = '" + request.getParameter("district_code") + "'";
		 
		
		ApplicationNoticeArrest asw = new ApplicationNoticeArrest(db);
		
		Integer totalRow = asw.countBySql(countsql+whText, null);
		pageUtil.setTotalRow(totalRow);
		pageUtil.setPageSize(20);
		
		//log.debug(slsql+sql);
		List<Map<String, Object>> aswmap = asw.findBySql(slsql+whText + " order by  asw.request_date desc ", null,pageUtil);
        request.setAttribute("aswmap", aswmap);
        request.setAttribute("rowCount", aswmap.size());
        
     // asw.get
		Court c = new Court(db);
		List<Court> clist = c.findByWhere(" 1=1 order by court_name", null);
		request.setAttribute("clist", clist);
	}
	
	public void delete(HttpServletRequest request, HttpServletResponse response)throws Exception {
		this.writeTranLog("ลบคำร้องขอหมายค้น");
    	
        //log.debug("delete" + request.getParameter("id"));
        Long id = new Long(request.getParameter("id"));
        ApplicationSearchWarrantteam ast = new ApplicationSearchWarrantteam(db);
        ast.deleteByWhere("application_search_warrant_id = ?", id);
        
        ApplicationSearchWarrant asw = new ApplicationSearchWarrant(db);
        asw.deleteByPk(id);
        //searchData(request,response);
        
        forward("?page=/Invest/searchwarrant_request_search.jsp", request,response);
	}	

	public void view(HttpServletRequest request, HttpServletResponse response)
			throws Exception {		
		ApplicationSearchWarrant asw = new ApplicationSearchWarrant(db);
		asw = asw.findByPk(Long.parseLong(request.getParameter("id")));
		// asw.setRequest_date(new Date());
		// System.out.println();
		ApplicationSearchWarrantteam ast = new ApplicationSearchWarrantteam(db);
		Court c = new Court(db);
		List<Court> clist = c.findByWhere(" 1=1 order by court_name", null);

		String stSql = "select asw.staff_id_request, asw.poscode_request, asw.offcode_request, tir.title_name || str.first_name || ' ' || str.last_name staff_name_request, psr.posname || ' ' || str.staff_level posname_request, edr.offname offname_request, ";
				stSql += " asw.staff_id_req_for, asw.poscode_req_for, asw.offcode_req_for,tif.title_name || stf.first_name || ' ' || stf.last_name staff_name_req_for, psf.posname || ' ' || stf.staff_level posname_req_for,";
				stSql += " asw.staff_id_assign,asw.poscode_assign,asw.offcode_assign,tia.title_name || sta.first_name || ' ' || sta.last_name staff_name_assign, psa.posname || ' ' || sta.staff_level posname_assign, ";
				stSql += " asw.career_request ";
				stSql += " from application_search_warrant asw ";
				stSql += " inner join staff str on str.idcard_no=asw.staff_id_request ";
				stSql += " left join title tir on tir.title_code=str.title_code ";
				stSql += " left join position psr on psr.poscode=asw.poscode_request ";
				stSql += " left join ed_office edr on edr.offcode=asw.offcode_request ";
				stSql += " left join staff stf on stf.idcard_no=asw.staff_id_req_for ";
				stSql += " left join title tif on tif.title_code=stf.title_code ";
				stSql += " left join position psf on psf.poscode=asw.poscode_req_for ";
				stSql += " left join staff sta on sta.idcard_no=asw.staff_id_assign ";
				stSql += " left join title tia on tia.title_code=sta.title_code ";
				stSql += " left join position psa on psa.poscode=asw.poscode_assign ";
				stSql += " where asw.id= '" + request.getParameter("id") + "'";
		List<Map<String,Object>> stList = asw.findBySql(stSql);
						
		
		Title ti = new Title(db);
		EdOffice ed = new EdOffice(db);
		Province pv = new Province(db);
		List<Province> pvlist = pv.findAll();
		District d = new District(db);
		Subdistrict sd = new Subdistrict(db);
		ApplicationNoticeArrest ana = new ApplicationNoticeArrest(db);
		String id = request.getParameter("id");
		request.setAttribute("asw", asw);
		request.setAttribute("ast", ast);
		request.setAttribute("clist", clist);
		request.setAttribute("ti", ti);
		request.setAttribute("ed", ed);
		request.setAttribute("pv", pvlist);
		request.setAttribute("d", d);
		request.setAttribute("sd", sd);
		request.setAttribute("ana", ana);
		request.setAttribute("id",id );
		
		if(stList.size()>0){
			request.setAttribute("staff_name_request", (stList.get(0).get("staff_name_request") != null ? stList.get(0).get("staff_name_request").toString() : ""));
			request.setAttribute("staff_id_request", (stList.get(0).get("staff_id_request") != null ? stList.get(0).get("staff_id_request").toString() : ""));
			request.setAttribute("posname_request", (stList.get(0).get("posname_request") != null ? stList.get(0).get("posname_request").toString() : ""));
			request.setAttribute("poscode_request", (stList.get(0).get("poscode_request") != null ? stList.get(0).get("poscode_request").toString() : ""));
			request.setAttribute("offcode_request", (stList.get(0).get("offcode_request") != null ? stList.get(0).get("offcode_request").toString() : ""));
			request.setAttribute("offname_request", (stList.get(0).get("offname_request") != null ? stList.get(0).get("offname_request").toString() : ""));
			request.setAttribute("career_request", (stList.get(0).get("career_request") != null ? stList.get(0).get("career_request").toString() : ""));
			
			request.setAttribute("stList", stList.get(0));
		}

		prelist(request, response, id);
		request.setAttribute("action","process?action=Warrant&cmd=view&id="+id);
		forward("?page=/Invest/updatewarrant.jsp", request, response);
	}
   
	public void update(HttpServletRequest request, HttpServletResponse response)
			throws Exception {
		ApplicationSearchWarrant asw = new ApplicationSearchWarrant(db);
		ApplicationSearchWarrant asw2 = new ApplicationSearchWarrant(db);
		asw = asw.findByPk(Long.parseLong(request.getParameter("id")));
		bindForm(asw);		
		asw.setSearch_datefrom(DateUtil.getDateFromString(request.getParameter("search_datefrom") +" "+request.getParameter("search_timefrom")));
		if(!request.getParameter("search_dateto").equals(""))
			asw.setSearch_dateto(DateUtil.getDateFromString(request.getParameter("search_datefrom")+" "+request.getParameter("search_dateto")));
		else
			asw.setSearch_dateto(null);
		
		asw.setConsider_date(DateUtil.getDateFromString(request.getParameter("consider_date")+" "+request.getParameter("consider_time")));	

		asw.setUpdate_by(update_by);
		asw.setUpdate_on(update_on);
		if(asw.getCourt_id()!=null){
			if(asw.getCourt_id()==0){
				asw.setCourt_id(null);
			}	
		}
		if(asw.getCourt_id_arrest()!=null){
			if(asw.getCourt_id_arrest()==0){
				asw.setCourt_id_arrest(null);
			}
		}
		if(asw.getCourt_id_familiar()!=null){
			if(asw.getCourt_id_familiar()==0){
				asw.setCourt_id_familiar(null);
			}
		}
		
		if(request.getParameter("chk_continue") != null)
			asw.setChk_continue("Y");
		else
			asw.setChk_continue("N");
		
		//log.debug(asw);
		asw2 = asw.update();
		asw_id = asw2.getId();
		uplist(request, response, asw);
	//	forward("?page=/Invest/searchwarrant_request_search.jsp", request,
	//			response);
		redirect("process?action=Warrant&cmd=view&id="+asw2.getId(), request, response);
	}
	
	 public void uplist(HttpServletRequest request,HttpServletResponse response,ApplicationSearchWarrant ai) throws Exception {
		   
		//xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxstart aiixxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx
		ApplicationSearchWarrantteam caii = new ApplicationSearchWarrantteam(db);
		List<ApplicationSearchWarrantteam> caiilist = caii.findByWhere("APPLICATION_SEARCH_WARRANT_ID = ?",ai.getId());

	    String [] aii_id = ai.getAswt_id();
	    String [] aii_staff_idcardno = ai.getAswt_idcard_no();
	    String [] aii_staff_poscode = ai.getAswt_poscode();
	    String [] aii_staff_offcode = ai.getAswt_offcode();

	    if(aii_id == null){
	   	 	for(int j = 0 ; j<caiilist.size() ;j++){
	   	 		caiilist.get(j).delete();
	   	 	}
	    }
	    
	    if(ai.getAswt_id() != null){
	    	boolean chkdel=true;
		    for(int j = 0 ; j<caiilist.size() ;j++){
		    	chkdel= true;
		    	for(int k = 0; k<aii_id.length ;k++){
			    	if(aii_id[k].equals("")==false){
			    		if(Long.parseLong(aii_id[k])==caiilist.get(j).getId()){
			    			chkdel = false;
			    		}
			    	}
		    	}

		    	if(chkdel== true){
		    		caiilist.get(j).delete();
		    	}
		    }
		    
	    	for(int i = 0; i < aii_id.length;i++ ){
	    		boolean chkup = false ;

	    		ApplicationSearchWarrantteam aii  = new ApplicationSearchWarrantteam(db);
	    		if(aii_id[i].equals("")==false){
		    		chkup = true ;
		    		aii = aii.findByPk(Long.parseLong(aii_id[i]));
		    	}

	    		aii.setApplication_search_warrant_id(ai.getId());
	    		aii.setStaff_idcardno(aii_staff_idcardno[i]);
	    		aii.setStaff_poscode(aii_staff_poscode[i]);
	    		aii.setStaff_offcode(aii_staff_offcode[i]);

	    	    //log.debug(aii);
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
	 public void prelist(HttpServletRequest request,HttpServletResponse response,String id) throws Exception {
		  String	aatsql = " SELECT aat.ID, " +
			" aat.STAFF_IDCARDNO STAFF_IDCARD_NO,aat.STAFF_POSCODE POSCODE_STAFF ,st.title_code,st.first_name," +
			" st.last_name,t.title_name, ps.posname || ' ' || st.staff_level posname ," +
			" aat.STAFF_OFFCODE offcode_staff, ed.offname " +
			" FROM APPLICATION_SEARCH_WARRANTTEAM aat " +
			" left join staff st on st.idcard_no = aat.STAFF_IDCARDNO " +
			" left join title t on t.title_code = st.title_code " +
			" left join ed_office ed on ed.offcode = aat.STAFF_OFFCODE" +
			" left join position ps on ps.poscode = aat.STAFF_POSCODE" +
			" where aat.APPLICATION_SEARCH_WARRANT_ID = ?";



		  Log.debug(aatsql);
			ApplicationArrestTeam aat = new ApplicationArrestTeam(db);
			List<Map<String,Object>> aatlist = aat.findBySql(aatsql,id);
			
			 request.setAttribute("aatlist", aatlist);
		 
			   }
	 
	 
	 public boolean isNumeric(String s) {
		   try{
			   return s.matches("[-+]?\\d*\\.?\\d+");
		   }catch (Exception e) {
			   return false ;
		}

	 }
}
