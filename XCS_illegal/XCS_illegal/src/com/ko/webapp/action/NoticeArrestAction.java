package com.ko.webapp.action;


import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.Vector;
import java.text.SimpleDateFormat;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.jfree.util.Log;

import com.ko.domain.*;
import com.ko.util.DateUtil;
import com.ko.util.RunningKey;

public class NoticeArrestAction extends BaseAction{
	private Long asf_id  ;
//	 create
	public void add(HttpServletRequest request,HttpServletResponse response)throws Exception {
		ApplicationNoticeArrest ana = new ApplicationNoticeArrest(db);
		request.setAttribute("action","process?action=NoticeArrest&cmd=add");
	
		//Default Value
		request.setAttribute("create_by_name", create_by_name);
		ana.setOffcode(offcode);
		ana.setOffname(uData.getShortName());
		ana.setNotice_date(DateUtil.getCurrentDate());
		request.setAttribute("staff_name_receive", uData.getFullName());
		ana.setStaff_id_receive(uData.getIdCard());
		ana.setPoscode_receive(uData.getPoscode());
		ana.setOffcode_receive(uData.getOffcode());
		request.setAttribute("posname_receive", uData.getPosname());
		request.setAttribute("offname_receive", uData.getOffname());
		//ana.setInform_name("สายลับ(ขอปิดนาม)");
		ana.setCreate_on(DateUtil.getCurrentDate());
		request.setAttribute("ana", ana);
		
		EdOffice ed = new EdOffice(db);
		//request.setAttribute("ed",ed);

		Legislation lg = new Legislation(db);
		List<Legislation> lglist = lg.findAll();
		request.setAttribute("lglist",lglist);

		DutyGroup dt = new DutyGroup(db);
		List<Map<String,Object>> dtlist = dt.findBySql("select group_id, group_name from duty_group where group_status='N' order by  NLSSORT(UPPER(group_name), 'NLS_SORT = THAI_DICTIONARY')", null);
System.out.println("dtlist : " + dtlist.size());
		request.setAttribute("dtlist", dtlist);

		Indictment idm = new Indictment(db);
		request.setAttribute("idm", idm);

		Lawbreaker lb = new Lawbreaker(db);
		request.setAttribute("lb", lb);
		this.writeTranLog("เพิ่มใบแจ้งความนำจับ");
		forward("?page=/Protect/notice_arrest_create.jsp", request, response);
	}
	public void create(HttpServletRequest request,HttpServletResponse response)throws Exception {
			//ApplicationNoticeArrest table
			ApplicationNoticeArrest ana = new ApplicationNoticeArrest(db);
			ApplicationNoticeArrest ana2 = new ApplicationNoticeArrest(db);
			
			//set general data
			bindForm(ana);
			if(ana.getIsmanage()==null){
				ana.setIsmanage("N");
			}

			ana.setNotice_no(new RunningKey(db).getRunningKey("APPLICATION_NOTICE_ARREST","","",ana.getOffcode()));
			ana.setNotice_date(DateUtil.getDateFromString(request.getParameter("notice_date")+" "+request.getParameter("notice_time")));
			if(ana.getIsreward_pay()==null)
				ana.setIsreward_pay("N");
			else
				ana.setIsreward_pay("Y");
			
			if(ana.getIsmanage()==null)
				ana.setIsmanage("N");
			else
				ana.setIsmanage("Y");
			
			if(ana.getInform_age() == 0)
				ana.setInform_age(null);
			
			if(ana.getLawbreaker_no() == 0)
				ana.setLawbreaker_no(null);
			
			ana.setCreate_by(create_by);
			ana.setCreate_on(create_on);
			ana2 = ana.create();	
			asf_id = ana2.getId();
			uplistinc(request,response,ana);
			redirect("process?action=NoticeArrest&cmd=view&id="+ana.getId(), request,response);
	}


	public void view(HttpServletRequest request,HttpServletResponse response)throws Exception {
		ApplicationNoticeArrest ana = new ApplicationNoticeArrest(db);
		ana = ana.findByPk(new Long(request.getParameter("id")));
		request.setAttribute("ana", ana);
		request.setAttribute("action","process?action=NoticeArrest&cmd=view&id="+request.getParameter("id"));
		
		String sSql = "";
		sSql += " select ana.id, ana.notice_no, ana.staff_id_receive,ana.poscode_receive,ana.offcode_receive,tir.title_name || str.first_name || ' ' || str.last_name staff_name_receive, ";
		sSql += " nvl(ana.owner_pos,psr.posname || ' ' || str.staff_level) posname_receive, nvl(ana.owner_dept,edr.offname) offname_receive,";
		sSql += " ana.staff_id_accept, tia.title_name || sta.first_name || ' ' || sta.last_name staff_name_accept,";
		sSql += " ana.staff_id_commander, ana.poscode_commander,ana.offcode_commander, tic.title_name || stc.first_name || '  ' || stc.last_name staff_name_commander,";
		sSql += " nvl(ana.law_er_pos,psc.posname || ' ' || stc.staff_level) posname_commander, nvl(ana.law_er_dept,edc.offname) offname_commander, ";
		sSql += " tit.title_name || stt.first_name || ' ' || stt.last_name create_by_name, ";
		sSql += " tis.title_name || sts.first_name || ' ' || sts.last_name staff_name_surety, pss.posname || sts.staff_level posname_surety, eds.offname offname_surety,";
		sSql += " ana.poscode_surety, ana.staff_id_surety, ana.offcode_surety ";
		sSql += " from application_notice_arrest ana ";
		sSql += " left join staff str on str.idcard_no=ana.staff_id_receive ";
		sSql += " left join title tir on tir.title_code=str.title_code ";
		sSql += " left join position psr on psr.poscode=ana.poscode_receive ";
		sSql += " left join ed_office edr on edr.offcode=ana.offcode_receive ";
		sSql += " left join staff sta on sta.idcard_no=ana.staff_id_accept ";
		sSql += " left join title tia on tia.title_code=sta.title_code ";
		sSql += " left join staff stc on stc.idcard_no=ana.staff_id_commander ";
		sSql += " left join title tic on tic.title_code=stc.title_code ";
		sSql += " left join position psc on psc.poscode=ana.poscode_commander ";
		sSql += " left join ed_office edc on edc.offcode=ana.offcode_commander ";
		sSql += " left join staff stt on stt.idcard_no=to_char(ana.create_by) ";
		sSql += " left join title tit on tit.title_code=stt.title_code ";
		sSql += " left join staff sts on sts.idcard_no=ana.staff_id_surety ";
		sSql += " left join position pss on pss.poscode=ana.poscode_surety ";
		sSql += " left join title tis on tis.title_code=sts.title_code ";
		sSql += " left join ed_office eds on eds.offcode=ana.offcode_surety ";
		sSql += " where ana.id='" + ana.getId() + "'" ;
		
		List<Map<String,Object>> sList = ana.findBySql(sSql);
		if(sList.size()>0){
			request.setAttribute("create_by_name", (sList.get(0).get("create_by_name") != null ? sList.get(0).get("create_by_name").toString() : ""));
			request.setAttribute("staff_name_receive", (sList.get(0).get("staff_name_receive") != null? sList.get(0).get("staff_name_receive").toString() : ""));
			request.setAttribute("posname_receive", (sList.get(0).get("posname_receive") != null ? sList.get(0).get("posname_receive").toString() : ""));
			request.setAttribute("offname_receive", (sList.get(0).get("offname_receive") != null ? sList.get(0).get("offname_receive").toString() : ""));
			request.setAttribute("staff_name_accept", (sList.get(0).get("staff_name_accept") != null ? sList.get(0).get("staff_name_accept").toString() : ""));
			request.setAttribute("staff_name_surety", (sList.get(0).get("staff_name_surety") != null ? sList.get(0).get("staff_name_surety").toString() : ""));
			//request.setAttribute("staff_id_surety", (sList.get(0).get("staff_id_surety") != null ? sList.get(0).get("staff_id_surety").toString() : ""));
			//request.setAttribute("poscode_surety", (sList.get(0).get("poscode_surety") != null ? sList.get(0).get("poscode_surety").toString() : ""));
			request.setAttribute("posname_surety", (sList.get(0).get("posname_surety") != null ? sList.get(0).get("posname_surety").toString() : ""));
			//request.setAttribute("offcode_surety", (sList.get(0).get("offcode_surety") != null ? sList.get(0).get("offcode_surety").toString() : ""));
			request.setAttribute("offname_surety", (sList.get(0).get("offname_surety") != null ? sList.get(0).get("offname_surety").toString() : ""));
		}
		
		prelist(request,response,ana.getId()+"");
		Lawbreaker lwbk  = new Lawbreaker(db);
		String lSql;
		lSql = "select lb.lawbreaker_no,  trim(nvl(ana.lawbreaker_name,case lb.lawbreaker_type "
			+" when '1' then t.title_name || lb.first_name || ' ' || lb.last_name"
			+" when '2' then t.title_name || lb.first_name || ' ' || lb.middle_name || ' ' || lb.last_name"
			+" when '3' then tc.title_name || lb.company_name end)) lawbreaker_name"
			+" from application_notice_arrest ana "
			+" left join lawbreaker lb on ana.lawbreaker_no=lb.lawbreaker_no"
			+" left join title t on t.title_code=lb.title_code"
			+" left join title tc on tc.title_code=lb.title_code_company"
			+" where ana.id = '" + request.getParameter("id") + "'";
		List<Map<String, Object>> lw_bk = lwbk.findBySql(lSql);
		//log.debug(" lw_bk.size() :: "+lw_bk.size());
		request.setAttribute("lw_bk", ((!lw_bk.isEmpty())? lw_bk.get(0): new HashMap<String, Object>()));

		Legislation lg = new Legislation(db);
		List<Legislation> lglist = lg.findAll();
		request.setAttribute("lglist",lglist);

		DutyGroup dt = new DutyGroup(db);
		List<Map<String,Object>> dtlist = dt.findBySql("select group_id, group_name from duty_group where group_status='N' order by  NLSSORT(UPPER(group_name), 'NLS_SORT = THAI_DICTIONARY')", null);
//System.out.println("dtlist : " + dtlist.size());
		request.setAttribute("dtlist", dtlist);

		Indictment idm = new Indictment(db);
		request.setAttribute("idm", idm);
		
		//log.debug("ana.setNotice_date :: "+ana.getNotice_date());

		Lawbreaker lb = new Lawbreaker(db);
		request.setAttribute("lb", lb);
		forward("?page=/Protect/notice_arrest_update.jsp", request, response);
	}

	// update
	public void edit(HttpServletRequest request,HttpServletResponse response)throws Exception {


		ApplicationNoticeArrest ana = new ApplicationNoticeArrest(db);
		ana = ana.findByPk(Long.parseLong(request.getParameter("id")));
		request.setAttribute("ana",ana);

		Legislation lg = new Legislation(db);
		List<Legislation> lglist = lg.findAll();
		request.setAttribute("lglist",lglist);

		DutyGroup dt = new DutyGroup(db);
		List<Map<String,Object>> dtlist = dt.findBySql("select group_id, group_name from duty_group where group_status='N' order by  NLSSORT(UPPER(group_name), 'NLS_SORT = THAI_DICTIONARY')", null);
System.out.println("dtlist : " + dtlist.size());
		request.setAttribute("dtlist", dtlist);

		EdOffice ed = new EdOffice(db);
		request.setAttribute("ed",ed);
		Indictment idm = new Indictment(db);
		request.setAttribute("idm", idm );
		Lawbreaker lb = new Lawbreaker(db);
		request.setAttribute("lb", lb);
		Staff st = new Staff(db);
		request.setAttribute("st", st);

		List<Staff> strcvlist = st.findByWhere("staff_id_receive = ?", ana.getStaff_id_receive());
		Position ps = new Position(db);
		request.setAttribute("ps", ps);

		//Gereral Info
		Province pv = new Province(db);
		List<Province> pvlist = pv.findAll();
		request.setAttribute("pvlist", pvlist);
		District d = new District(db);
		//List<District> = d.findAll();
		request.setAttribute("d", d);
		Subdistrict sd = new Subdistrict(db);
		//List<Subdistrict> = sd.findAll();
		request.setAttribute("sd", d);


		forward("?page=/Protect/notice_arrest_update.jsp", request, response);
	}


	public void update(HttpServletRequest request,HttpServletResponse response)throws Exception {

//			ApplicationNoticeArrest table
			ApplicationNoticeArrest ana = new ApplicationNoticeArrest(db);
			ApplicationNoticeArrest ana2 = new ApplicationNoticeArrest(db);
			
			//ana.setId(Long.parseLong(request.getParameter("id")));
			ana = ana.findByPk(Long.parseLong(request.getParameter("id")));
			bindForm(ana);
			ana.setNotice_date(DateUtil.getDateFromString(request.getParameter("notice_date")+" "+request.getParameter("notice_time")));
			
			ana.setUpdate_by(update_by);
			ana.setUpdate_on(update_on);
			if(ana.getIsreward_pay()==null)
				ana.setIsreward_pay("N");
			else
				ana.setIsreward_pay("Y");
				
			if(ana.getIsmanage()==null)
				ana.setIsmanage("N");
			else
				ana.setIsmanage("Y");
			
			if(ana.getInform_age() == 0)
				ana.setInform_age(null);
			
			ana2 =  ana.update();			
			asf_id = ana2.getId();
		   uplistinc(request,response,ana);
		   redirect("process?action=NoticeArrest&cmd=view&id="+request.getParameter("id"), request,response);
	}

	// delete
	public void delete(HttpServletRequest request,HttpServletResponse response)throws Exception {
		
		HttpSession session = request.getSession();
    	session.setAttribute("ResponseTime", System.currentTimeMillis());
    	
		ApplicationNoticeArrest ana = new ApplicationNoticeArrest(db);
		ana = ana.findByPk(Long.parseLong(request.getParameter("id")));
		ana.setDel_flag("Y");
		ana.update();
		//delNA.deleteByPk(new Long(request.getParameter("id")));
		redirect("process?action=NoticeArrest", request,response);
	}
	//back to search page
	public void back(HttpServletRequest request,HttpServletResponse response)throws Exception {
		redirect("process?action=NoticeArrest&cmd=list", request,response);
	}
	//search
	public void find(HttpServletRequest request,HttpServletResponse response)throws Exception {
		
		//String sql ="";
		String slsql;
		String countsql;
		String lbFirst_name="";
		String lbLast_name="";
		String stFirst_name="";
		String stLast_name="";
		String lbname = request.getParameter("lawbraker_name");
		String stname = request.getParameter("staff_name_recive");

		countsql="select count(*) \n"+
		"from application_notice_arrest ana \n"+
		"left join legislation lg on lg.id=ana.legislation_id \n"+
		"left join duty_group dg on dg.group_id=ana.duty_code \n"+
		"left join ed_office ed on ed.offcode=ana.offcode \n"+
		"left join staff st on st.idcard_no=ana.staff_id_receive \n"+
		"left join title ti on ti.title_code=st.title_code \n"+
		"left join lawbreaker lb on lb.lawbreaker_no=ana.lawbreaker_no \n"+
		"left join title til on til.title_code=lb.title_code ";

		slsql ="select ana.id, ana.notice_no, ana.notice_date, to_char(ana.notice_date, 'dd/mm/yyyy', 'NLS_CALENDAR=''THAI BUDDHA'' NLS_DATE_LANGUAGE=THAI') notice_date2, \n"+
		"pke_invest.getNoticeIndictment(ana.id) guilt_base, ana.legislation_id, lg.legislation_name, ana.duty_code, dg.group_name duty_name, ed.offcode, ana.offname, \n"+
		"ana.inform_name, ti.title_name || st.first_name || ' ' || st.last_name staff_name_receive, \n"+
		"nvl(ana.lawbreaker_name, til.title_name || lb.first_name || ' ' || lb.middle_name || ' ' || lb.last_name) lawbreaker_name, \n"+
		"pke_invest.getNoticeLawbreakerAddr(ana.id) lawbreaker_addr, pv.province_name \n"+
		"from application_notice_arrest ana \n"+
		"left join legislation lg on lg.id=ana.legislation_id \n"+
		"left join duty_group dg on dg.group_id=ana.duty_code \n"+
		"left join ed_office ed on ed.offcode=ana.offcode \n"+
		"left join staff st on st.idcard_no=ana.staff_id_receive \n"+
		"left join title ti on ti.title_code=st.title_code \n"+
		"left join lawbreaker lb on lb.lawbreaker_no=ana.lawbreaker_no \n"+
		"left join title til on til.title_code=lb.title_code \n"+
		"left join province pv on pv.province_code = ana.lawbreaker_province_code ";
		
		String whText = "where   ana.del_flag != 'Y' \n"; 

		if (request.getParameter("legislation_id") != null && !request.getParameter("legislation_id").equals("")) 
			whText += "  AND ana.LEGISLATION_ID = '" + request.getParameter("legislation_id") + "'\n"; 
		if(request.getParameter("notice_no") != null && !request.getParameter("notice_no").trim().equals(""))
			whText += " AND ana.notice_no like '%" + request.getParameter("notice_no").trim() + "%'\n"; 
		if(request.getParameter("duty_code") != null && !request.getParameter("duty_code").equals(""))
			whText += " AND ana.duty_code = '" + request.getParameter("duty_code") + "'\n"; 
		if(request.getParameter("guilt_base") != null && !request.getParameter("guilt_base").trim().equals(""))
			whText += " AND pke_invest.getNoticeIndictment(ana.id) like '%" + request.getParameter("guilt_base").trim() + "%'\n"; 
		if(request.getParameter("notice_date") != null && !request.getParameter("notice_date").trim().equals(""))
			whText += " AND to_char(ana.notice_date, 'dd/mm/yyyy', 'NLS_CALENDAR=''THAI BUDDHA'' NLS_DATE_LANGUAGE=THAI') = '" + request.getParameter("notice_date").trim() +  "' \n"; 
		if(uData.IsAdmin()==true){
			if(request.getParameter("offname1") != null && !request.getParameter("offname1").trim().equals("")){
				whText += " AND ana.offname like '%" + request.getParameter("offname1").trim() + "%'\n"; 
			}
			
			request.setAttribute("IsAdmin", "1");
		}else{
			whText += " AND (ana.offname like '%" + uData.getOffname().trim() + "%'";
			whText += " OR ana.offname like '%" + uData.getShortName().trim() + "%') \n"; 
			request.setAttribute("offname", uData.getOffname());
			request.setAttribute("IsAdmin", "0");
		}
		
		if(request.getParameter("infrom_name") != null && !request.getParameter("infrom_name").trim().equals(""))
			whText += " AND ana.inform_name like '%" + request.getParameter("infrom_name").trim() + "%'\n"; 

		ApplicationNoticeArrest ana = new ApplicationNoticeArrest(db);
		Integer totalRow = ana.countBySql(countsql+whText, null);
		pageUtil.setTotalRow(totalRow);
		pageUtil.setPageSize(20);

		log.debug(slsql+whText);
		List<Map<String, Object>> anamap = ana.findBySql(slsql+whText+" order by ana.notice_date desc", null,pageUtil);
   
        request.setAttribute("anamap", anamap);
        request.setAttribute("rowCount", anamap.size());
        request.setAttribute("ana", ana);
        
        
        Legislation lg = new Legislation(db);
		List<Legislation> lglist = lg.findAll();
		request.setAttribute("lglist",lglist);

		DutyGroup dt = new DutyGroup(db);
		List<Map<String,Object>> dtlist = dt.findBySql("select group_id, group_name from duty_group where group_status='N' order by  NLSSORT(UPPER(group_name), 'NLS_SORT = THAI_DICTIONARY')", null);
		//System.out.println("dtlist : " + dtlist.size());
		request.setAttribute("dtlist", dtlist);
		

		forward("?page=/Protect/notice_arrest_list.jsp", request, response);
	}
	String menuID = "5";
	@Override
	public void _default(HttpServletRequest request, HttpServletResponse response) throws Exception {
		// TODO Auto-generated method stub
		if(uData.chkUserMenu(menuID)==true){
			ApplicationNoticeArrest ana = new ApplicationNoticeArrest(db);
			List<Map<String, Object>> anamap = new ArrayList();
			Vector objv = new Vector();
			int totalRow = anamap.size();        
	        pageUtil.setTotalRow(totalRow);       
	        
	        request.setAttribute("anamap", anamap);
	        
	        Legislation lg = new Legislation(db);
			List<Legislation> lglist = lg.findAll();
			request.setAttribute("lglist",lglist);
	
			DutyGroup dt = new DutyGroup(db);
			List<Map<String,Object>> dtlist = dt.findBySql("select group_id, group_name from duty_group where group_status='N' order by  NLSSORT(UPPER(group_name), 'NLS_SORT = THAI_DICTIONARY')", null);
			request.setAttribute("dtlist", dtlist);
			request.setAttribute("offcode", uData.getOffcode());
			request.setAttribute("offname", uData.getOffname());
			request.setAttribute("IsAdmin", (uData.IsAdmin() == true ? "1" : "0"));
			
			HttpSession session = request.getSession();
	        request.setAttribute("ResponseTime", DateUtil.getResponseTime(session.getAttribute("ResponseTime") != null ? new Long(session.getAttribute("ResponseTime").toString()) : 0l));
	        session.removeAttribute("ResponseTime");
	        
			forward("?page=/Protect/notice_arrest_list.jsp", request, response);
		}else{
    		HttpSession session = request.getSession();
  		  	session.invalidate();
  		  	request.setAttribute("errMsg", "ผู้ใช้ไม่มีสิทธิ์ดำเนินการ");
  		  	forward("?page=/login.jsp", request, response);
    	}
	}
	public void uplistinc(HttpServletRequest request,HttpServletResponse response,ApplicationNoticeArrest ana) throws Exception {
		 //xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxstart aaixxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx
		    ApplicationNoticeIndictment ani = new ApplicationNoticeIndictment(db);
		    List<ApplicationNoticeIndictment> anilist = ani.findByWhere("APPLICATION_NOTICE_ARREST_ID = ?",ana.getId());

		    String [] aai_id = ana.getAai_id();
		    String [] aai_indictment_id = ana.getAai_indictment_id();
			
			 if(aai_id == null){
				 for(int j = 0 ; j<anilist.size() ;j++){
					 anilist.get(j).delete();
				 }
			 }
		    
			 if(ana.getAai_id() != null){
		    	boolean chkdel=true;
			    for(int j = 0 ; j<anilist.size() ;j++){
			    	chkdel= true;
			    	for(int k = 0; k<aai_id.length ;k++){
				    	if(aai_id[k].equals("")==false){
				    		if(Long.parseLong(aai_id[k])==anilist.get(j).getId()){
				    			chkdel = false;
				    		}
				    	}
			    	}

			    	if(chkdel== true){
			    		anilist.get(j).delete();
			    	}
			    }
		    	for(int i = 0; i < aai_id.length;i++ ){
		    		boolean chkup = false ;
		    		ApplicationNoticeIndictment aai  = new ApplicationNoticeIndictment(db);
		    		if(aai_id[i].equals("")==false){
			    		chkup = true ;
			    		log.debug("เตรียม");
			    		aai = aai.findByPk(Long.parseLong(aai_id[i]));
			    	}
		    		aai.setApplication_notice_arrest_id(asf_id);
		    		aai.setIndictment_id(new Long(aai_indictment_id[i]));

				     if(chkup == false){
				    	 aai.setCreate_by(create_by);
				    	 aai.setCreate_on(create_on);
				    	 aai.create();
				     }else{
				    	 aai.setUpdate_by(update_by);
				    	 aai.setUpdate_on(update_on);
				    	 aai.update();
				     }
		    	}
			 }

	}
	 public void prelist(HttpServletRequest request,HttpServletResponse response,String id) throws Exception {			
			
			

			String incsql=" SELECT aai.ID,  aai.APPLICATION_NOTICE_ARREST_ID, "+
				" aai.INDICTMENT_ID, "+
				" inc.case_law_id, inc.penalty_case_law_id, replace(replace(inc.guilt_base,chr(13),''),chr(10),'') guilt_base," +
				" inc.EXHIBIT_WILD"+
				" FROM APPLICATION_NOTICE_INDICTMENT aai"+
				" left join indictment inc on inc.indictment_id = aai.indictment_id "+
				" where aai.APPLICATION_NOTICE_ARREST_ID = ?";
			
			//Log.debug(incsql);
			ApplicationNoticeIndictment ani = new ApplicationNoticeIndictment(db);
			List<Map<String,Object>> anilist = ani.findBySql(incsql,id);		 
	
		    request.setAttribute("aailist", anilist);
		 
	 }
	 
	 public boolean isNumeric(String s) {
		   try{
			   return s.matches("[-+]?\\d*\\.?\\d+");
		   }catch (Exception e) {
			   return false ;
		}

	 }
}
