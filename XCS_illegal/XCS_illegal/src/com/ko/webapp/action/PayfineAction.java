package com.ko.webapp.action;

import java.sql.PreparedStatement;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;

import com.ko.Constants;
import com.ko.webapp.util.InvoiceUtil;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

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
import com.ko.domain.ApplicationSearchWarrant;
import com.ko.domain.ApplicationSincereConfirm;
import com.ko.domain.BookImpeachment;
import com.ko.domain.CompareAuthority;
import com.ko.domain.CompareCase;
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
import com.ko.domain.Running;
import com.ko.domain.SizePackage;
import com.ko.domain.Staff;
import com.ko.domain.Subdistrict;
import com.ko.domain.Title;
import com.ko.domain.TranLog;
import com.ko.domain.V_STAFF_LIST_POPUP;
import com.ko.service.EdOfficeService;
import com.ko.service.MasterService;
import com.ko.service.ProductUnitService;
import com.ko.util.DB;
import com.ko.util.DateUtil;
import com.ko.util.ReportsUtil;
import com.ko.util.RunningKey;
import com.ko.webapp.util.ParameterUtil;

public class PayfineAction extends BaseAction {

	@Override
	public void _default(HttpServletRequest request, HttpServletResponse response) throws Exception {
		// TODO Auto-generated method stub
		//request.setAttribute("abc", "1");
		//pre(request, response);
		//searchData(request,response);

		
		//forward("?page=/CompareCase/payfine_list.jsp", request, response);

	}

	private void searchData(HttpServletRequest request, HttpServletResponse response)throws Exception {
		ApplicationSincereConfirm aad = new ApplicationSincereConfirm(db);
		String slsql;
		String countsql;
		slsql = "select distinct aa.id,aa.track_no, inc.guilt_base, ed.offname,aa.offcode,"
		+" pke_arrest.getArrestLawbreaker(aa.track_no) lawbreaker_name,pke_compare.getInvNo(cc.id) invNo,bi.case_id,nvl(cc.compare_case_no,'-') compare_case_no,"
		+" tic.title_name || stc.first_name || ' ' || stc.last_name sue_name,lg.legislation_name, to_char(cc.case_total_fine,'999G999G999G999D99MI') case_fine,"
		+"  to_char(cc.compare_case_date, 'dd/mm/yyyy', 'NLS_CALENDAR=''THAI BUDDHA'' NLS_DATE_LANGUAGE=THAI') compare_case_date2,"
		+" nvl(sic.id,0) send_income_case_id, case when inc.is_prove='Y' then case when aap.exhibit_report_no is null then 'N' else 'Y' end else 'Y' end show_link"
		+" from  compare_case cc "
		+" inner join book_impeachment bi on cc.track_no=bi.track_no "
		+" inner join application_arrest aa on aa.track_no=bi.track_no"
		+" inner join application_arrest_indictment aai on aa.track_no=aai.track_no"
		+" inner join indictment inc on inc.indictment_id=cc.indictment_id"
		+" left join application_arrest_lawbreaker aal on aa.track_no=aal.track_no"
		+" left join lawbreaker lb on lb.lawbreaker_no=aal.lawbreaker_no"
		+" left join title tt on tt.title_code=aal.title_code"
		+" left join title tc on tc.title_code=aal.company_title_code"
		+" left join v_accuser_list_popup sta on sta.idcard_no=aa.accuser_idcardno"
		+" left join title tia on tia.title_code=sta.title_code"
		+" left join staff stc on stc.idcard_no=cc.sue_staff_idcardno"
		+" left join title tic on tic.title_code=stc.title_code"
		+" left join application_arrest_exhibit aae on aa.track_no=aae.track_no"
		+" left join duty_table dt on dt.duty_code=aae.duty_code " 
		+" inner join legislation lg on lg.id=aa.legislation_id"
		+" left join application_arrest_prove aap on aa.track_no=aap.track_no"
		+" inner join ed_office ed on ed.offcode=cc.compare_office"
		+" left join application_arrest_license ali on aa.track_no=ali.track_no"
		+" left join application_notice_arrest ana on ana.id=aa.application_notice_arrest_id"
		+" left join application_search_warrant asw on asw.id=aa.application_search_warrant_id"
		+" left join application_sincere_confirm asi on asi.id=aa.application_sincere_confirm_id"
		+" left join send_income_case sic on sic.compare_case_id=cc.id " 
		+ "       and sic.send_income_id in (select si.id from send_income si where si.status='1')"  //นำส่งเงินแล้ว
		+ " where aa.del_flag='N' and bi.case_quality='1' and bi.case_last='1' and aa.have_culprit='Y' ";
		
		countsql = "select count( distinct aa.id)"
			+" from  compare_case cc "
			+" inner join book_impeachment bi on cc.track_no=bi.track_no "
			+" inner join application_arrest aa on aa.track_no=bi.track_no"
			+" inner join application_arrest_indictment aai on aa.track_no=aai.track_no"
			+" inner join indictment inc on inc.indictment_id=aai.indictment_id"
			+" left join application_arrest_lawbreaker aal on aa.track_no=aal.track_no"
			+" left join lawbreaker lb on lb.lawbreaker_no=aal.lawbreaker_no"
			+" left join title tt on tt.title_code=aal.title_code"
			+" left join title tc on tc.title_code=aal.company_title_code"
			+" left join v_accuser_list_popup sta on sta.idcard_no=aa.accuser_idcardno"
			+" left join title tia on tia.title_code=sta.title_code"
			+" inner join staff stc on stc.idcard_no=cc.sue_staff_idcardno"
			+" left join title tic on tic.title_code=stc.title_code"
			+" left join application_arrest_exhibit aae on aa.track_no=aae.track_no"
			+" left join duty_table dt on dt.duty_code=aae.duty_code "
			+" inner join legislation lg on lg.id=aa.legislation_id"
			+" inner join duty_group dg on dg.group_id=aa.product_group_id"
			+" left join province pv on pv.province_code=aa.scene_province"
			+" left join district d on d.district_code=aa.scene_district"
			+" left join subdistrict sd on sd.subdistrict_code=aa.scene_subdistrict"
			+" left join application_arrest_prove aap on aa.track_no=aap.track_no"
			+" inner join ed_office ed on ed.offcode=cc.compare_office"
			+" left join application_arrest_license ali on aa.track_no=ali.track_no"
			+" left join application_notice_arrest ana on ana.id=aa.application_notice_arrest_id"
			+" left join application_search_warrant asw on asw.id=aa.application_search_warrant_id"
			+" left join application_sincere_confirm asi on asi.id=aa.application_sincere_confirm_id"
			+" left join send_income_case sic on sic.compare_case_id=cc.id " 
			+ "       and sic.send_income_id in (select si.id from send_income si where si.status='1')"  //นำส่งเงินแล้ว
			+ " where aa.del_flag='N' and bi.case_quality='1' and bi.case_last='1' and aa.have_culprit='Y' ";
		
		String whText = "";
//		if (uData.IsAdmin()==false){
//			//ผู้ที่เป็นผู้บังคับบัญชา สามารถดูข้อมูลของผู้ใต้บังคับบัญชาได้		
//			whText += " and (cc.create_by in (" + uData.getSqlSubOrdinate(uData.getIdCard(), menuID) + ") ";
//			whText += " or cc.create_by = '" + uData.getIdCard() + "' or cc.create_by is null ) ";
//        }
		
		if( request.getParameter("default") != null){
			whText += " AND nvl(to_char(cc.pay_date,'dd/mm/yyyy'),'0') = '0'";
			//whText += " AND aa.offcode like '%" + uData.getOffcode().replace("'", "''").trim() + "%' ";
			if(uData.getAccuserType().equals(Constants.ACCUSER_TYPE_XCS)){
	        	//ถ้าเป็นเจ้าหน้าที่ส่วนกลาง ให้ Default ที่ ภาค 10
	        	whText += " AND substr(aa.offcode,1,2) = '10' ";
	        }else if(uData.getAccuserType().equals(Constants.ACCUSER_TYPE_DEPT)){
	        	//ถ้าเป็นเจ้าหน้าที่สรรพสามิตภาคให้แสดงคดีของภาคนั้นทั้งหมดที่ยังไม่ได้ชำระเงินค่าปรับ
	        	whText += " AND substr(aa.offcode,1,2) || '0000' = '" + uData.getOffcode() + "' ";
	        }else if(uData.getAccuserType().equals(Constants.ACCUSER_TYPE_AREA)){
	        	//ถ้าเป็นเจ้าหน้าที่สรรพสามิตพื้นที่ให้แสดงคดีของพื้นที่นั้นทั้งหมดที่ยังไม่ได้ชำระเงินค่าปรับ
	        	whText += " AND substr(aa.offcode,1,4) || '00' = '" + uData.getOffcode() + "' ";
	        }else if(uData.getAccuserType().equals(Constants.ACCUSER_TYPE_BRANCH)){
	        	//ถ้าเป็นเจ้าหน้าที่สรรพสามิตพื้นที่สาขา
		        whText += " AND aa.offcode = '" + uData.getOffcode() + "' ";
	        }
			
			request.setAttribute("abc", "1");
			request.setAttribute("offcode", uData.getOffcode());
	        request.setAttribute("offname", uData.getShortName());
			this.writeTranLog("แสดงหน้าจอการชำระเงินค่าปรับและออกใบเสร็จ");
		}else{ //Is Button Search
			com.ko.webapp.util.ArrestUtil whTxt = new com.ko.webapp.util.ArrestUtil();
			whText += whTxt.getArrestWhere(request);
			if(request.getParameter("nojob")!=null){
				whText += " AND nvl(to_char(cc.pay_date,'dd/mm/yyyy'),'0') = '0'";
			}
			request.setAttribute("offcode", request.getParameter("offcode"));
            request.setAttribute("offname", request.getParameter("offname"));
			this.writeTranLog("ค้นหาข้อมูลการชำระเงินค่าปรับและออกใบเสร็จ");
		}
		
		String vOffcode = uData.getOffcode();
		String vIsCenter = "N";
		if (vOffcode.startsWith("00") || vOffcode.startsWith("10")){
			vIsCenter = "Y";
		}
		request.setAttribute("vIsCenter", vIsCenter);
		
		
		log.debug(slsql+whText + " order by lg.legislation_name desc, ed.offname, bi.case_id desc ");
		
		Integer totalRow = aad.countBySql(countsql+whText, null);
		pageUtil.setTotalRow(totalRow);
		pageUtil.setPageSize(20);

		//log.debug(slsql+whText + " order by lg.legislation_name desc, ed.offname, bi.case_id desc ");
		List<Map<String, Object>> dblist = aad.findBySql(slsql+whText + " order by lg.legislation_name desc, ed.offname, bi.case_id desc ", null,pageUtil);
		request.setAttribute("dblist", dblist);
	}

	public void pre(HttpServletRequest request, HttpServletResponse response)throws Exception {
		Legislation lt = new Legislation(db);
		List<Legislation> ltlist = lt.findByWhere(" 1=1 order by legislation_name", null);
		request.setAttribute("ltlist", ltlist);
		
		if (uData.IsAdmin()==true)
        	request.setAttribute("IsAdmin","1");
		
	}
	
	//***************เงื่อนไขเดิม
//	ApplicationArrest maxid = new ApplicationArrest(db);
//
//	ArrayList<String> alcon = new ArrayList();
//	ArrayList<String> alin = new ArrayList();
//	ArrayList<String> alconint = new ArrayList();
//	ArrayList<Integer> alinint = new ArrayList();
//	ArrayList<String> alcondate = new ArrayList();
//	ArrayList<String> alindate = new ArrayList();
//	ArrayList<String> alconcbox1 = new ArrayList();
//	ArrayList<String> alincbox1 = new ArrayList();
//	ArrayList<String> alconcbox2 = new ArrayList();
//	ArrayList<String> alincbox2 = new ArrayList();
//	ArrayList<String> alcontween = new ArrayList();
//	ArrayList<Integer> alintween = new ArrayList();
//	alcon.add(" AND pke_arrest.getArrestIndictment(aa.track_no) like '%");
//	alin.add(request.getParameter("guilt_base") + "%'");
//	if (request.getParameter("legislation") != null) {
//		alconint.add(" AND aa.LEGISLATION_ID = ");
//		alinint.add(new Integer(request.getParameter("legislation")));
//	}
//	if (request.getParameter("case_fine") != null
//			&& request.getParameter("case_fine") != null) {
//		if (request.getParameter("case_fine").equals("") == false
//				&& request.getParameter("case_fine").equals("") == false) {
//			alcontween
//					.add(" AND (select sum(nvl(lbk.fine,0)) from application_arrest_lawbreaker lbk where lbk.track_no=aa.track_no) between ");
//			alintween.add(new Integer(request.getParameter("case_fine")));
//			alcontween.add(" AND ");
//			alintween.add(new Integer(request.getParameter("case_fine2")));
//		}
//	}
//	
//	if(request.getParameter("nojob")!=null){
//		if(!request.getParameter("nojob").equals("")){
//			alcon.add(" AND nvl(to_char(cc.pay_date,'dd/mm/yyyy'),'0') = '");
//			alin.add(request.getParameter("nojob") + "'");
//		}
//	}
//	
//	alcon.add(" AND pke_arrest.getArrestLawbreaker(aa.track_no) like '%");
//	alin.add(request.getParameter("lawbreaker_name") + "%'");
//
//	alcon.add(" AND aa.track_no like '%");
//	alin.add(request.getParameter("aa_track_no") + "%'");
//
//	alcondate
//			.add(" AND add_months(to_date(aa.occurrence_date),6516) between to_date('");
//	alindate.add(request.getParameter("occurrence_date")
//			+ "','dd/mm/yyyy')");
//	alcondate.add(" AND to_date('");
//	alindate.add(request.getParameter("occurrence_date2")
//			+ "','dd/mm/yyyy')");
//
//	alcondate
//			.add(" AND add_months(to_date(bi.case_date),6516) between to_date('");
//	alindate.add(request.getParameter("case_date") + "','dd/mm/yyyy')");
//	alcondate.add(" AND to_date('");
//	alindate.add(request.getParameter("case_date2") + "','dd/mm/yyyy')");
//
//	alcondate
//			.add(" AND add_months(to_date(aa.application_date),6516) between to_date('");
//	alindate.add(request.getParameter("application_date")
//			+ "','dd/mm/yyyy')");
//	alcondate.add(" AND to_date('");
//	alindate.add(request.getParameter("application_date2")
//			+ "','dd/mm/yyyy')");
//
//	alcon.add(" AND aa.scene_province like '%");
//	alin.add(request.getParameter("province") + "%'");
//
//	alcon.add(" AND aa.scene_district like '%");
//	alin.add(request.getParameter("district") + "%'");
//	alcon.add(" AND aa.scene_subdistrict like '%");
//	alin.add(request.getParameter("tambol") + "%'");
//
//	alcon.add(" AND cc.compare_case_no like '%");
//	alin.add(request.getParameter("compare_case_no") + "%'");
//
//	alcon.add(" AND bi.case_id like '%");
//	alin.add(request.getParameter("case_id") + "%'");
//
//	alcon.add(" AND aap.exhibit_report_no like '%");
//	alin.add(request.getParameter("exhibit_report_no") + "%'");
//
//	alcon
//			.add(" AND tia.title_name || sta.first_name || ' ' || sta.last_name like '%");
//	alin.add(request.getParameter("partial_name") + "%'");
//
//	alcon.add(" AND aal.lawbreaker_id_card like '%");
//	alin.add(request.getParameter("lawbreaker_id_card") + "%'");
//
//	alcon.add(" AND pd.product_name like '%");
//	alin.add(request.getParameter("product_name") + "%'");
//
//	alcon.add(" AND aa.product_group_id like '%");
//	alin.add(request.getParameter("product") + "%'");
//
//	alcon.add(" AND inc.case_law_id like '%");
//	alin.add(request.getParameter("case_law_id") + "%'");
//
//	alcon.add(" AND aa.offcode like '%");
//	alin.add(request.getParameter("offcode") + "%'");
//
//	alcon.add(" AND aa.accuser_type like '%");
//	alin.add(request.getParameter("accuserType") + "%'");
//
//	alconcbox1.add(" OR bi.case_quality like '%");
//	alincbox1.add(request.getParameter("case_quality1") + "%'");
//
//	alconcbox1.add(" OR bi.case_quality like '%");
//	alincbox1.add(request.getParameter("case_quality2") + "%'");
//
//	alconcbox1.add(" OR aa.have_culprit like '%");
//	alincbox1.add(request.getParameter("have_culprit") + "%'");
//
//	alconcbox2.add(" OR bi.case_last like '%");
//	alincbox2.add(request.getParameter("caseLast1") + "%'");
//
//	alconcbox2.add(" OR bi.case_last like '%");
//	alincbox2.add(request.getParameter("caseLast2") + "%'");
//
//	alconcbox2.add(" OR bi.case_last like '%");
//	alincbox2.add(request.getParameter("caseLast3") + "%'");
//
//	alcon.add(" AND ali.iswithdraw like '%");
//	alin.add(request.getParameter("iswithdraw") + "%'");
//
//	alcon.add(" AND inc.exhibit_wild like '%");
//	alin.add(request.getParameter("exhibit_wild") + "%'");
//
//	alcon.add(" AND ana.notice_no like '%");
//	alin.add(request.getParameter("notice_no") + "%'");
//
//	alcon.add(" AND asw.warrant_no like '%");
//	alin.add(request.getParameter("warrant_no") + "%'");
//
//	alcon.add(" AND asi.track_no like '%");
//	alin.add(request.getParameter("asi_track_no") + "%'");
	// add sting con
//	for (int i = 0; i < alin.size(); i++) {
//		if (alin.get(i).equals("%'")||alin.get(i).equals("'")) {
//			alcon.set(i, "");
//			alin.set(i, "");
//		}
//		sql += alcon.get(i) + alin.get(i);
//	}
//	// add int con
//	for (int i = 0; i < alinint.size(); i++) {
//		if ((Integer) alinint.get(i) != 0) {
//			sql += alconint.get(i) + (Integer) alinint.get(i);
//		}
//
//	}
//	// add date con
//	for (int i = 0; i < alcondate.size(); i += 2) {
//		if (alindate.get(i).equals("','dd/mm/yyyy')")
//				&& alindate.get(i + 1).equals("','dd/mm/yyyy')")) {
//			alcondate.set(i, "");
//			alindate.set(i, "");
//			alcondate.set(i + 1, "");
//			alindate.set(i + 1, "");
//		}
//		sql += alcondate.get(i) + alindate.get(i);
//		sql += alcondate.get(i + 1) + alindate.get(i + 1);
//	}
//	// add between int case
//	for (int i = 0; i < alintween.size(); i += 2) {
//		sql += alcontween.get(i) + (Integer) alintween.get(i);
//		sql += alcontween.get(i + 1) + (Integer) alintween.get(i + 1);
//	}
//
//	// add check box case
//	if (true) {
//		int chk = 0;
//		String boxsql = "";
//
//		for (int i = 0; i < alincbox1.size(); i++) {
//			if (alincbox1.get(i).equals("%'")
//					|| alincbox1.get(i).equals("null%'")) {
//				alconcbox1.set(i, "");
//				alincbox1.set(i, "");
//				chk++;
//			}
//			boxsql += alconcbox1.get(i) + alincbox1.get(i);
//		}
//		if (boxsql.equals("") == false) {
//			sql += " And ( 1 = 2 " + boxsql + " )";
//		}
//	}
//	// add check box case
//	if (true) {
//		int chk = 0;
//		String boxsql = "";
//
//		for (int i = 0; i < alincbox2.size(); i++) {
//			if (alincbox2.get(i).equals("%'")
//					|| alincbox2.get(i).equals("null%'")) {
//				alconcbox2.set(i, "");
//				alincbox2.set(i, "");
//				chk++;
//			}
//			boxsql += alconcbox2.get(i) + alincbox2.get(i);
//		}
//		if (boxsql.equals("") == false) {
//			sql += " And ( 1 = 2 " + boxsql + " )";
//		}
//	}
	
	
	
	
	
	public void add(HttpServletRequest request,HttpServletResponse response)throws Exception {
		pre(request, response);
		preup(request, response);
    	//Request from table;
    	EdOffice ed = new EdOffice(db);
        String edSql = "select offcode, short_name from ed_office order by offname ";
        List<Map<String,Object>> edlist = ed.findBySql(edSql);
        request.setAttribute("edlist", edlist);
        
        String id = request.getParameter("id");
        // include file
		ApplicationArrest aa = new ApplicationArrest(db);
    	aa = aa.findByPk(Long.parseLong(id));

    	ApplicationArrestLawbreaker aal = new ApplicationArrestLawbreaker(db);
        String alSql = " select aal.id, pke_arrest.getLawbreakerName(aal.id) lawbreaker_name, ";
        		alSql += " aal.fine, aal.invcode, aal.paper_no, aal.iscancel, ";
        		alSql += " aal.book_no, aal.inv_no, aal.paid_time_off ";
        		alSql += " from application_arrest_lawbreaker aal";
        		alSql += " left join title ti on ti.title_code=aal.title_code";
        		alSql += " where aal.track_no = ?";
        		
		//InvoiceUtil inv = new InvoiceUtil();
		//inv.setOffcode(offcode);
		List<Map<String,Object>>  aallist  = aal.findBySql(alSql,aa.getTrack_no()); //inv.getRunInvPayFine(db, aal.findBySql(alSql,aa.getTrack_no()));
        request.setAttribute("aallist", aallist);
        if(aallist !=null)
        	request.setAttribute("aalsize", aallist.size());
        
        CompareCase cc = new CompareCase(db);
		if (cc.findByWhere("TRACK_NO=?", aa.getTrack_no()).size()>0) {
			cc=cc.findByWhere("TRACK_NO=?", aa.getTrack_no()).get(0);
			request.setAttribute("update", "1");
			request.setAttribute("cc", cc);
			
			ReportsUtil.UpdateCubeReport2_55(aa.getTrack_no(), uData.getUsername());  
		} else {
			//log.debug(cc);
			request.setAttribute("update", "0");
			request.setAttribute("cc", cc);
		}

		request.setAttribute("action","process?action=Payfine&id="+request.getParameter("id")+"&cmd=add");
		this.writeTranLog("แสดงรายละเอียดการชำระค่าปรับ");
		
		HttpSession session = request.getSession();
        request.setAttribute("ResponseTime", DateUtil.getResponseTime(session.getAttribute("ResponseTime") != null ? new Long(session.getAttribute("ResponseTime").toString()) : 0l));
        session.removeAttribute("ResponseTime");
        
		forward("?page=/CompareCase/payfine_form.jsp?time=" + new Date().getTime(), request, response);
	}

	public void create(HttpServletRequest request, HttpServletResponse response) throws Exception {
		
		HttpSession session = request.getSession();
    	session.setAttribute("ResponseTime", System.currentTimeMillis());
    	
		String track_no = ParameterUtil.getStringParam("track_no", request);
		CompareCase cc = new CompareCase(db);
		String ccSql = "update compare_case set pay_date = to_date('" + DateUtil.formatConditionDate(ParameterUtil.getStringParam("pay_date", request)) + "','yyyymmdd'), ";
		ccSql += " inv_type = '" + ParameterUtil.getStringParam("inv_type", request) + "', ";
		ccSql += " case_status = '2'";  //ชำระค่าปรับเรียบร้อย
		ccSql += " where track_no = '" + track_no + "'";
		//log.debug(ccSql);
		cc.executeUpdate(ccSql);

		String invType = ParameterUtil.getStringParam("inv_type", request);

	    //xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxstart aalxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx
		    String [] aal_id = request.getParameterValues("aal_id");
		    String [] book_no = request.getParameterValues("book_no");
		    String [] inv_no = request.getParameterValues("inv_no");
		    String [] paper_no = request.getParameterValues("paper_no");
		    String [] invcode = request.getParameterValues("invcode");
		    String [] caseFine = request.getParameterValues("fine");
		   
		    //System.out.println("fine.lenght " + caseFine.length);
		    if(caseFine != null){
			    for(int i=0;i<caseFine.length;i++){
			    	ApplicationArrestLawbreaker aal =new ApplicationArrestLawbreaker(db);
			    	String aalSql = "update application_arrest_lawbreaker ";
			    	aalSql += " set paid_time_off = '" + (invType.equals("A") ?  "N" : "Y") + "', ";
			    	if (invType.equals("M")){
			    		aalSql += " book_no = '" + book_no[i] + "', ";
			    		aalSql += " inv_no = '" + inv_no[i] + "', ";
			    		aalSql += " paper_no = '', ";
			    		aalSql += " invcode = '' ";
			    	}else{
			    		aalSql += " book_no = '', ";
			    		aalSql += " inv_no = '', ";
			    		aalSql += " paper_no = '" + paper_no[i] + "', ";
			    		aalSql += " invcode = nvl('" + invcode[i] + "','" + (new RunningKey(db).getRunningKey("V_RUNNING_INVCODE", "", "", offcode)) + "') ";
			    	}
			    	aalSql += " where id = '" + (new Long(aal_id[i])) + "'";
			    	aal.executeUpdate(aalSql);
			    }
		    }

		    //xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxend aalxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx-

		this.writeTranLog("บันทึกข้อมูลการชำระค่าปรับและออกใบเสร็จ TrackNo=" + track_no);
		redirect("process?action=Payfine&id=" + request.getParameter("id") + "&track_no=" + track_no + "&cmd=add",	request, response);
	}
	
	public void cancelInv(HttpServletRequest request, HttpServletResponse response)throws Exception {
		System.out.println("ยกเลิกวันที่รับชำระค่าปรับ ");
		String ccID = request.getParameter("ccID").toString();
		String aaID = request.getParameter("aaID").toString();
		CompareCase cc = new CompareCase(db);
		cc = cc.findByPk(new Long(ccID));
		cc.setPay_date(null);
		cc.setInv_type("M");
		cc.setCase_status("4");  //ยกเลิกใบเสร็จรับเงิน
		cc = cc.update();

		System.out.println("//จากนั้นก็ต้องยกเลิกใบเสร็จรับเงิน");
		DB db1 = new DB();
		PreparedStatement pre1 = null;
		ApplicationArrestLawbreaker aal = new ApplicationArrestLawbreaker(db);
		String sqlC ="";
		String sqlL = "";
		sqlL += " select aal.id, aal.track_no, nvl(aal.invcode,aal.book_no || '/' || aal.inv_no) invcode, aal.fine ";
		sqlL += " from application_arrest_lawbreaker aal ";
		sqlL += " inner join compare_case cc on cc.track_no=aal.track_no ";
		sqlL += " where cc.id ='" + ccID + "'";
		List<Map<String,Object>> aalList = aal.findBySql(sqlL);
		for(int i = 0;i<aalList.size();i++){
			System.out.println("//เก็บประวัติใบเสร็จเสีย");
			sqlC = "INSERT INTO COMPARE_INV_LOSE (ID, TRACK_NO, INVCODE_OLD, ";
			sqlC += " EDITDATE, FINE_AMT, REMARKS, KEY_BY) ";
			sqlC += " VALUES(compare_inv_lose_seq.nextval,'" + aalList.get(i).get("track_no").toString() + "','" + aalList.get(i).get("invcode").toString() + "', ";
			sqlC += " sysdate,'" + aalList.get(i).get("fine").toString() + "','ยกเลิกใบเสร็จรับเงิน','" + create_by + "')";
			pre1 = db1.getParameterizedStatement(sqlC, null);
			pre1.execute();
		
			System.out.println("//ทำการยกเลิกใบเสร็จ");
			aal = aal.findByPk(new Long(aalList.get(i).get("id").toString()));
			aal.setIscancel("Y");
			aal.setCancel_date(create_on);
			aal.setCancel_by(create_by.toString());
			aal.setPaid_time_off("N");
			aal.setInvcode("");
			aal.setBook_no("");
			aal.setInv_no("");
			aal = aal.update();
		}
		
		pre1.close();
		db1.closedb();
		pre1 = null;
		db1 = null;
		
		redirect("process?action=Payfine&id="+aaID+"&track_no="+ cc.getTrack_no() +"&cmd=add", request, response);
	}

	public void preup(HttpServletRequest request, HttpServletResponse response)throws Exception {
		log.debug("Start Preup");
		String sql;
		sql = "select aa.lawbreak_type, aa.scene_name, aa.scene_no, aa.scene_moo, aa.scene_soi, aa.scene_road, aa.police_station, aa.accuser_poscode,"
		+ " aa.accuser_offcode, aa.issentcourt, aa.estimate_fine, aa.department_id, aa.department_name, aa.id, aa.track_no,"
		+ "aa.coordinate_x, aa.coordinate_y, aa.accuser_idcardno, aa.report_to ,aa.order_by, aa.SCENE_PROVINCE, aa.SCENE_SUBDISTRICT, aa.SCENE_DISTRICT,"
		+ "aa.occurrence_date, to_char(aa.occurrence_date, 'dd/mm/yyyy', 'NLS_CALENDAR=''THAI BUDDHA'' NLS_DATE_LANGUAGE=THAI') occurrence_date2, "
		+ "to_char(aa.occurrence_date,'HH24:MI') occurrence_time, "
		+ "aa.application_date, to_char(aa.application_date, 'dd/mm/yyyy', 'NLS_CALENDAR=''THAI BUDDHA'' NLS_DATE_LANGUAGE=THAI')  application_date2, "
		+ "tia.title_name || sta.first_name || ' ' || sta.last_name accuser_name, aa.legislation_id, lg.legislation_name, "
		+ "aa.offcode, nvl(aa.accuser_offname, nvl(sta.dept_name,eda.offname)) offname,nvl(aa.accuser_posname, nvl(sta.pos_name,ps.posname || ' ' || sta.staff_level)) posname, "
		+ "aa.product_group_id, dg.group_name product_group_name,  aa.accuser_type, aa.have_culprit, ed.indc_off, "
		+ "nvl((select si.id from send_income si inner join send_income_case sic on sic.send_income_id=si.id where sic.compare_case_id=cc.id and si.status='1' and rownum=1),0) IsSend "
		+ "from application_arrest aa "
		+ "left join v_accuser_list_popup sta on sta.idcard_no=aa.accuser_idcardno "
		+ "left join title tia on tia.title_code=sta.title_code "
		+ "left join legislation lg on lg.id=aa.legislation_id "
		+ "left join duty_group dg on dg.group_id=aa.product_group_id "
		+ "left join province pv on pv.province_code=aa.scene_province "
		+ "left join district d on d.district_code=aa.scene_district "
		+ "left join subdistrict sd on sd.subdistrict_code=aa.scene_subdistrict "
		+ "left join ed_office ed on ed.offcode=aa.offcode "
		+ "left join ed_office eda on eda.offcode=aa.accuser_offcode "
		+ "left join position ps on ps.poscode=aa.accuser_poscode "
		+ "inner join compare_case cc on cc.track_no=aa.track_no "
		+ "where  aa.id =  ? ";

		log.debug(sql);
	ApplicationArrest aa = new ApplicationArrest(db);
	Long id = new Long(request.getParameter("id"));
	List<Map<String, Object>> db = aa.findBySql(sql, id);
	
	request.setAttribute("db", db.get(0));
	request.setAttribute("accuser_idcardno",(db.get(0).get("accuser_idcardno")!=null ? db.get(0).get("accuser_idcardno").toString() : ""));
	request.setAttribute("accuser_name",(db.get(0).get("accuser_name") != null ? db.get(0).get("accuser_name").toString() : ""));
	request.setAttribute("accuser_poscode",(db.get(0).get("accuser_poscode") != null ? db.get(0).get("accuser_poscode").toString() : ""));
	request.setAttribute("accuser_posname", (db.get(0).get("posname") != null ? db.get(0).get("posname").toString() : ""));
	request.setAttribute("accuser_offcode", (db.get(0).get("accuser_offcode") != null ? db.get(0).get("accuser_offcode").toString() : ""));
	request.setAttribute("accuser_offname", (db.get(0).get("offname") != null ? db.get(0).get("offname").toString() : ""));
	request.setAttribute("IsSend", (db.get(0).get("issend") != null ? db.get(0).get("issend").toString() : "0"));
	
	String indcOff = (db.get(0).get("indc_off") != null ? db.get(0).get("indc_off").toString() : "");
	String IsEdit = "";
	if(!uData.getAccuserType().equals(Constants.ACCUSER_TYPE_XCS)){
		//ถ้าเป็นเจ้าหน้าที่ภูมิภาค
        if(!uData.getINDCOff().equals(indcOff))  //กรณีหน่วยงานใหญ่เข้ามาดูของหน่วยงานย่อย
        	IsEdit = "N";
        else{
        	//กรณีหน่วยงานอื่นๆ แต่สิทธิ์เป็น Admin เข้ามาดู
        	if(!uData.getOffcode().equals(db.get(0).get("offcode").toString())){
        		IsEdit = "N";
        	}else{
        		IsEdit = "Y";
        	}
        }
	}else{
		//ถ้าเป็นเจ้าหน้าที่ส่วนกลาง ให้สามารถแก้ไขคดีของภาค 10 ได้
		String vOffcode = (db.get(0).get("offcode") != null ? db.get(0).get("offcode").toString() : "");
		if(vOffcode.substring(0, 2).equals("10") || vOffcode.substring(0, 2).equals("00"))
			IsEdit = "Y";
		else{
			if(uData.getOffcode().equals(vOffcode))
				IsEdit = "Y";
			else
				IsEdit = "N";
		}
	}
	request.setAttribute("IsEdit", IsEdit);
}
	String menuID = "11";
	
	public void list(HttpServletRequest request, HttpServletResponse response) throws Exception {
		if(uData.chkUserMenu(menuID)==true){
			pre(request, response);
			searchData(request, response);
			forward("?page=/CompareCase/payfine_list.jsp", request, response);
		}else{
    		HttpSession session = request.getSession();
  		  	session.invalidate();
  		  	request.setAttribute("errMsg", "ผู้ใช้ไม่มีสิทธิ์ดำเนินการ");
  		  	forward("?page=/login.jsp", request, response);
    	}
	}
	
	  public boolean isNumeric(String s) {
		   try{
			   return s.matches("[-+]?\\d*\\.?\\d+");
		   }catch (Exception e) {
			   return false ;
		}

	}
	  public void setprint(HttpServletRequest request, HttpServletResponse response) throws Exception {
			// TODO Auto-generated method stub
			ApplicationArrestLawbreaker aal = new ApplicationArrestLawbreaker(db);
			log.debug("aal_id"+request.getParameter("aal_id"));
			Long id = new Long(request.getParameter("aal_id"));
			//pre(request,response);
			aal = aal.findByPk(id);
			aal.setPaper_no(request.getParameter("paper_no"));
			aal.setIscancel("Y");
			aal.update();
			log.debug("iscan Y");
			forward("/Popup/status_pop.jsp", request, response);
		}
	  public void unsetprint(HttpServletRequest request, HttpServletResponse response) throws Exception {
			// TODO Auto-generated method stub
			ApplicationArrestLawbreaker aal = new ApplicationArrestLawbreaker(db);
			log.debug("aal_id"+request.getParameter("aal_id"));
			Long id = new Long(request.getParameter("aal_id"));
			//pre(request,response);
			aal = aal.findByPk(id);
			aal.setIscancel("N");
			aal.update();
			log.debug("iscan N");
			forward("/Popup/status_pop.jsp", request, response);
		}
}
