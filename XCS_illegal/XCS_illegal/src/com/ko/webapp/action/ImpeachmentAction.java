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

import com.ko.Constants;
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
import com.ko.domain.CompareCase;
import com.ko.domain.District;
import com.ko.domain.DutyGroup;
import com.ko.domain.DutyStatu;
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
import com.ko.service.EdOfficeService;
import com.ko.service.ProductUnitService;
import com.ko.util.ConfigUtil;
import com.ko.util.DateUtil;
import com.ko.util.ReportsUtil;
import com.ko.webapp.util.ParameterUtil;
import com.ko.webapp.util.RequestUtil;

public class ImpeachmentAction extends BaseAction {

	@Override
	public void _default(HttpServletRequest request, HttpServletResponse response) throws Exception {
		// TODO Auto-generated method stub
		//pre(request, response);
		//request.setAttribute("abc", "1");
		//searchData(request,response);

		//this.writeTranLog("แสดงหน้าจอค้นหาบันทึกรับคำกล่าวโทษ");
		//forward("?page=/CompareCase/book_impeachment_list.jsp", request, response);

	}

	public void pre(HttpServletRequest request,	HttpServletResponse response) throws Exception {
		Legislation lt = new Legislation(db);
		List<Legislation> ltlist = lt.findByWhere(" 1=1 order by legislation_name", null);
		//log.debug(ltlist);
		request.setAttribute("ltlist", ltlist);
		
		DutyStatu ds = new DutyStatu(db);
		List<DutyStatu> dslist =  ds.findByWhere(" id not in(1,2)", null);
		//log.debug("dslist::"+dslist.toString());
		request.setAttribute("dslist", dslist);
		
        request.setAttribute("uData",uData);
        if (uData.IsAdmin()==true)
        	request.setAttribute("IsAdmin","1");
		
	}
	public void add(HttpServletRequest request, HttpServletResponse response) throws Exception {
		
		preup(request, response);
		pre(request, response);
		
        EdOffice ed = new EdOffice(db);
        String edSql = "select offcode, short_name from ed_office order by offname ";
        List<Map<String,Object>> edlist = ed.findBySql(edSql);
        request.setAttribute("edlist", edlist);
		
		String track_no = request.getParameter("track_no");

		BookImpeachment bi = new BookImpeachment(db);
		V_STAFF_LIST_POPUP stbi = new V_STAFF_LIST_POPUP(db);
		List<Map<String, Object>> stbilist;
		Map<String, Object> d =new HashMap<String, Object>();
		String ci1;
		String ci2;
		String caseNoneOffice = "&nbsp;";

		try{
			bi = bi.findByWhere("track_no = '" + track_no + "'", null).get(0);
			request.setAttribute("update", "1");

			String sqlS = "";
			sqlS += " select bi.staff_id_sue";
			stbilist = stbi.findByWhere("idcard_no = ?",(bi.getStaff_id_sue() != null ? bi.getStaff_id_sue().toString() : ""));
			
			if(stbilist.size()>0){
				d = stbilist.get(0);
				String sue_staff_name = (d.get("title_name") != null ? d.get("title_name").toString() : "") + (d.get("first_name") != null ? d.get("first_name").toString() : "") + " " + (d.get("last_name") != null ? d.get("last_name").toString() : "");
				request.setAttribute("sue_staff_name", sue_staff_name);
		        request.setAttribute("sue_staff_id",bi.getStaff_id_sue().toString());
		        request.setAttribute("staff_offcode_sue", d.get("offcode"));
			}
			
			request.setAttribute("bi", bi);
			if(bi.getCase_id() != null && bi.getCase_id().toString().indexOf("/")>0){
				ci1 = bi.getCase_id().toString().substring(0, bi.getCase_id().toString().indexOf("/"));
				ci2 = bi.getCase_id().toString().substring(bi.getCase_id().toString().indexOf("/")+1,bi.getCase_id().toString().length());
				
				if (bi.getCase_none_office().equals("Y")){
					ci1 = ci1.replace("น", "");
					caseNoneOffice="น";
				}
				
				request.setAttribute("case_id_1", ci1);
				request.setAttribute("case_id_2",ci2);
				request.setAttribute("stbi", d);
				request.setAttribute("caseNoneOffice", caseNoneOffice);
				
				ReportsUtil.UpdateCubeReport2_55(bi.getTrack_no(), uData.getUsername());
			}
		}catch(Exception e){
			request.setAttribute("sue_staff_name", uData.getFullName());
	        request.setAttribute("sue_staff_id",uData.getIdCard());
	        request.setAttribute("staff_offcode_sue", uData.getOffcode());
			request.setAttribute("update", "0");
			request.setAttribute("bi", bi);
			request.setAttribute("case_id_1", "");
			request.setAttribute("case_id_2","");
		}

		String id = request.getParameter("id");
		request.setAttribute("action","process?action=Impeachment&id=" + id + "&track_no="+ track_no +"&cmd=add");
		
		forward("?page=/CompareCase/createbook_impeachment_form.jsp", request,response);
	}

	public void create(HttpServletRequest request, HttpServletResponse response) throws Exception {
		
    	
		boolean upchk = false;
		BookImpeachment bi = new BookImpeachment(db);
		ApplicationArrest aa = new ApplicationArrest(db);
		aa = aa.findByPk(Long.parseLong(request.getParameter("id")));
		if (request.getParameter("update").equals("1")) {
			upchk = true;
			bi = bi.findByWhere("track_no = ?",	request.getParameter("track_no")).get(0);
		}
		bi.setCase_date(DateUtil.getDateFromString(request.getParameter("case_date") + " " + request.getParameter("case_time")));
		bi.setCase_last(ParameterUtil.getStringParam("cast_last", request));
		bi.setCase_quality(ParameterUtil.getStringParam("case_quality", request));
		if (bi.getCase_last().equals("3")|| bi.getCase_quality().equals("2")) {
			bi.setCase_last_date(DateUtil.getDateFromString(request	.getParameter("case_last_date")));
			bi.setCase_result(ParameterUtil.getStringParam("case_result",request));
			if (isNumeric(request.getParameter("case_fine")))
				bi.setCase_fine((Double.parseDouble(request.getParameter("case_fine"))));
		}

		bi.setStaff_id_sue(ParameterUtil.getLongParam("staff_id_sue", request));
		bi.setTrack_no(ParameterUtil.getStringParam("track_no", request));
		
		if (request.getParameter("chkNoneOffice") != null){
			bi.setCase_id("น"+ParameterUtil.getStringParam("case_id_1", request) + "/" + ParameterUtil.getStringParam("case_id_2", request));
			bi.setCase_none_office(request.getParameter("chkNoneOffice"));
		}else{
			bi.setCase_id(ParameterUtil.getStringParam("case_id_1", request) + "/" + ParameterUtil.getStringParam("case_id_2", request));
			bi.setCase_none_office("N");
		}

		if (upchk) {
			bi.setUpdate_by(update_by);
			bi.setUpdate_on(new Date());
			bi=bi.update();
		} else {
			bi.setCreate_by(create_by);
			bi.setCreate_on(new Date());
			bi=bi.create();
		}
		
		this.writeTranLog("เพิ่มบันทึกรับคำกล่าวโทษ(1/55) เลขที่งาน " + bi.getTrack_no());
		
		
		redirect("process?action=Impeachment&id=" + aa.getId() + "&track_no=" + aa.getTrack_no() + "&cmd=add",request, response);
	}

	public void preup(HttpServletRequest request, HttpServletResponse response) throws Exception {

		String sql;
		sql = "select  aa.lawbreak_type, aa.scene_name, aa.scene_no, aa.scene_moo, aa.scene_soi, aa.scene_road, aa.police_station, aa.accuser_poscode,"
				+ " aa.accuser_offcode, aa.issentcourt, aa.estimate_fine, aa.department_id, aa.department_name, aa.id, aa.track_no,"
				+ " aa.coordinate_x, aa.coordinate_y, aa.accuser_idcardno, aa.report_to ,aa.order_by, aa.SCENE_PROVINCE, aa.SCENE_SUBDISTRICT, aa.SCENE_DISTRICT,"
				+ " aa.occurrence_date, to_char(aa.occurrence_date, 'dd/mm/yyyy', 'NLS_CALENDAR=''THAI BUDDHA'' NLS_DATE_LANGUAGE=THAI') occurrence_date2, "
				+ " to_char(aa.occurrence_date,'HH24:mi') occurrence_time, "
				+ " aa.application_date, to_char(aa.application_date, 'dd/mm/yyyy', 'NLS_CALENDAR=''THAI BUDDHA'' NLS_DATE_LANGUAGE=THAI')  application_date2, "
				+ " tia.title_name || sta.first_name || ' ' || sta.last_name accuser_name, aa.legislation_id, lg.legislation_name, "
				+ " aa.product_group_id, dg.group_name product_group_name,  aa.accuser_type,  aa.have_culprit,"
				+ " aa.offcode, nvl(aa.accuser_offname, nvl(sta.offname,eda.offname)) offname, nvl(aa.accuser_posname, nvl(sta.pos_name,ps.posname  || ' ' || sta.staff_level)) posname, "
				+ " ana.notice_no , ana.inform_name ,asw.warrant_no, asi.track_no confirm_no, pke_compare.chkCaseLast(aa.track_no) chkcaselast, "
				+ " tir.title_name || str.first_name || ' ' || str.last_name report_to_staff, tio.title_name || sto.first_name || ' ' || sto.last_name order_by_staff, "
				+ " aa.behaviour, aa.testimony,  aa.owner_name,aa.business_name,aa.surety_name, aa.leader_position, aa.guilty, aa.duty, aa.director_position, "
				+ " to_char(aa.arrest_report_date,'dd/mm/yyyy', 'NLS_CALENDAR=''THAI BUDDHA'' NLS_DATE_LANGUAGE=THAI') arrest_report_date, "
				+ " aa.administration, to_char(aa.finished_time,'HH24:mi') finished_time, ed.indc_off "
				+ "from application_arrest aa "
				+ "inner join v_accuser_list_popup sta on sta.idcard_no=aa.accuser_idcardno "
				+ "left join title tia on tia.title_code=sta.title_code "
				+ "left join legislation lg on lg.id=aa.legislation_id "
				+ "left join duty_group dg on dg.group_id=aa.product_group_id "
				+ "left join province pv on pv.province_code=aa.scene_province "
				+ "left join district d on d.district_code=aa.scene_district "
				+ "left join subdistrict sd on sd.subdistrict_code=aa.scene_subdistrict "
				+ "left join ed_office ed on ed.offcode=aa.offcode "
				+ "left join ed_office eda on eda.offcode=aa.accuser_offcode "
				+ "left join position ps on ps.poscode=aa.accuser_poscode "
				+ "left join application_notice_arrest ana on ana.id=aa.application_notice_arrest_id "
				+ "left join application_search_warrant asw on asw.id=aa.application_search_warrant_id "
				+ "left join application_sincere_confirm asi on asi.id=aa.application_sincere_confirm_id "
				+ "left join staff str on str.idcard_no=to_char(aa.report_to) "
				+ "left join title tir on tir.title_code=str.title_code "
				+ "left join staff sto on sto.idcard_no=to_char(aa.order_by) " 
				+ "left join title tio on tio.title_code=sto.title_code "
				+ "where aa.del_flag='N' and aa.id =  ? ";
		//log.debug(sql);
		String alisql;
		String aaesql;
		String aalsql;
		String incsql;
		String aatsql;
		ApplicationArrest aa = new ApplicationArrest(db);

		Long id = new Long(request.getParameter("id"));
		List<Map<String, Object>> aad= aa.findBySql(sql, id);

		alisql = "select ali.id, ali.offcode, ali.license_no, ali.book_no,"
				+ " ali.establishment_name, ali.entrepreneur, "
				+ "ali.license_type, ali.iswithdraw, ed.offname, lt.licensetype_name"
				+ " from application_arrest_license ali "
				+ "inner join ed_office ed on ed.offcode=ali.offcode "
				+ "inner join LICENSE_TYPE lt on lt.id = ali.license_type "
				+ "where ali.track_no = ? "
				+ "order by ali.id ";
		//log.debug(alisql);

		aaesql = "select aae.id, aae.TRACK_NO , aae.ISEXHIBITCO, aae.PRODUCT_CODE,"
				+ " aae.BRAND_CODE, aae.ISDOMESTIC, aae.SIZES_CODE,"
				+ " aae.SIZE_UNIT_CODE, nvl(aae.sizes_unit_name,nvl(su.thname,su.enname)) size_unit_name, "
				+ " aae.QTY, aae.qty_unit_code, nvl(aae.qty_unit_name,nvl(qu.thname,qu.enname)) qty_unit_name, "
				+ " aae.NETWEIGHT, aae.NETWEIGHT_UNIT_CODE, nvl(aae.netweight_unit_name,nvl(wu.thname, wu.enname)) netweight_unit_name, "
				+ " aae.STATUS, aae.EXHIBIT_LIST, aae.EXHIBIT_DESC, "
				+ " aae.CAR_NO, aae.APPLICATION_ARREST_EXHIBIT_ID co_id, aae.DUTY_CODE, aae.REMARKS,"
				+ " aae.CREATE_BY, aae.CREATE_ON, aae.UPDATE_BY, aae.UPDATE_ON, "
				+ " replace(nvl(aae.brand_name,  nvl(b.brand_main_thai, b.brand_main_eng)),'" + Character.toString('"') + "','" + "\\" + "\"" + "') brand_name," + "\n" 
				+ " dt.duty_name, nvl(aae.sizes_desc,sp.size_desc) size_desc, bi.case_id, "
				+ " nvl(aae.product_name, nvl(p.product_name,'-')) product_name, dg.group_id, dg.group_name"
				+ " from APPLICATION_ARREST_EXHIBIT aae "
				+ " left join unit su on su.unit_code = aae.size_unit_code "
				+ " left join unit qu on qu.unit_code = aae.qty_unit_code "
				+ " left join unit wu on wu.unit_code = aae.netweight_unit_code "
				+ " left join brand_main b on b.group_id = aae.group_id and b.brand_main_code =aae.brand_code"
				+ " left join product p on p.product_code = aae.product_code"
				+ " left join size_package sp on sp.group_id = aae.group_id and sp.size_code = aae.sizes_code"
				+ " left join book_impeachment bi on bi.track_no = aae.track_no"
				+ " left join DUTY_TABLE dt on dt.duty_code=aae.duty_code"
				+ " left join duty_group dg on dg.group_id=aae.group_id "
				+ " where aae.track_no = ?"
				+ " order by aae.id ";

		aalsql = "SELECT aal.ID, aal.TRACK_NO, aal.LAWBREAKER_NO,  aal.CULPRIT_TYPE, aal.LAWBREAKER_ID_CARD,"
				+ " aal.LAWBREAKER_PASSPORT,   aal.FIRST_NAME, aal.MIDDLE_NAME, aal.LAST_NAME,   aal.ADDRESS_NO,"
				+ " aal.SOI, aal.ROAD,   aal.MOO, aal.SUBDISTRICT, aal.DISTRICT,   aal.PROVINCE, "
				+ " aal.NATIONALITY_ID, aal.RACE_ID,   aal.CAREER, aal.AGE, aal.FATHER_NAME,  "
				+ " aal.MOTHER_NAME, aal.PAID_TIME_OFF, aal.INVCODE,   aal.FINE, aal.BOOK_NO, aal.INV_NO, "
				+ "  aal.ISCANCEL, aal.CANCEL_DATE, aal.CANCEL_BY,   aal.CREATE_BY, aal.CREATE_ON, aal.UPDATE_BY,  "
				+ " aal.UPDATE_ON, aal.TITLE_CODE, aal.SEX,    aal.OTHER_NAME, aal.EXCISE_REG_NO,  "
				+ " to_char(aal.birth_date, 'dd/mm/yyyy', 'NLS_CALENDAR=''THAI BUDDHA'' NLS_DATE_LANGUAGE=THAI')  birth_date, "
				+ " aal.CORPORATION_CODE, aal.COMPANY_TITLE_CODE, aal.COMPANY_NAME,   aal.PAPER_NO, aal.ISMISTAKE,"
				+ " aal.ISMISTAKE_DESC,  p.province_name ,d.district_name, st.subdistrict_name,  tl.title_name,"
				+ " r.race_name race_id_name,n.nation_name nationality_id_name "
				+ " FROM APPLICATION_ARREST_LAWBREAKER aal "
				+ " left join province p on p.province_code = aal.province "
				+ " left join district d on d.district_code = aal.district "
				+ " left join subdistrict st on st.subdistrict_code = aal.subdistrict "
				+ " left join title tl on tl.title_code = aal.title_code"
				+ " left join race r on r.race_code = aal.race_id"
				+ " left join nationality n on n.id = aal.NATIONALITY_ID"
				+ " where aal.track_no = ? "
				+ " order by aal.id ";
		

		incsql = " SELECT ID, aai.CREATE_BY, aai.CREATE_ON, aai.UPDATE_BY, aai.TRACK_NO, "
				+ " aai.INDICTMENT_ID, aai.EXHIBIT_WILD,"
				+ " inc.case_law_id, inc.penalty_case_law_id, replace(inc.guilt_base,'" + Character.toString('"') + "','" + "\\" + "\"" + "') guilt_base,"
				+ " inc.EXHIBIT_WILD"
				+ " FROM APPLICATION_ARREST_INDICTMENT aai"
				+ " left join indictment inc on inc.indictment_id = aai.indictment_id "
				+ " where aai.track_no = ?"
				+ " order by aai.id ";
		
		aatsql = " SELECT aat.ID, aat.CREATE_BY, aat.CREATE_ON,  aat.UPDATE_BY, aat.UPDATE_ON, aat.TRACK_NO,    aat.STAFF_NO, aat.INSPECTOR_CODE, aat.STAFF_POSITION, "  
			+" aat.DUTY_STATUS_ID, aat.STAFF_IDCARDNO, aat.STAFF_POSCODE,    aat.STAFF_OFFCODE, st.title_code,st.first_name,st.last_name,t.title_name,    "
			+" aat.staff_offcode offcode, nvl(ed.offname,st.dept_name) offname , nvl(aat.staff_position,nvl(st.pos_name,  ps.posname)) posname "
			+" FROM APPLICATION_ARREST_TEAM aat  "
			+" left join v_accuser_list_popup st on st.idcard_no = aat.STAFF_IDCARDNO  "
			+" left join title t on t.title_code = st.title_code  "
			+" left join ed_office ed on ed.offcode = aat.staff_offcode "
			+" left join position ps on ps.poscode = aat.STAFF_POSCODE "
			+" where aat.track_no = ? " 
			+" order by aat.id ";

		//log.debug(incsql);
		//log.debug(aaesql);
		//log.debug(aalsql);
		//log.debug(aatsql);

		ApplicationArrestTeam aat = new ApplicationArrestTeam(db);
		List<Map<String, Object>> aatlist = aat.findBySql(aatsql, aad.get(0).get("track_no"));
		Indictment inc = new Indictment(db);
		List<Map<String, Object>> inclist = inc.findBySql(incsql, aad.get(0).get("track_no"));
		ApplicationArrest aal = new ApplicationArrest(db);
		List<Map<String, Object>> aallist = aal.findBySql(aalsql, aad.get(0).get("track_no"));
		ApplicationArrest aae = new ApplicationArrest(db);
		List<Map<String, Object>> aaelist = aae.findBySql(aaesql, aad.get(0).get("track_no"));
		ApplicationArrestLicense ali = new ApplicationArrestLicense(db);
		List<Map<String, Object>> alilist = ali.findBySql(alisql, aad.get(0).get("track_no"));
		
		request.setAttribute("aailist", inclist);
		request.setAttribute("aaelist", aaelist);
		request.setAttribute("aatlist", aatlist);
		request.setAttribute("alilist", alilist);
		request.setAttribute("aallist", aallist);
		request.setAttribute("track_gen", aa.getTrack_no());
		request.setAttribute("aalsize", aallist.size());
		request.setAttribute("db", aad.get(0));
		
		request.setAttribute("accuser_idcardno", (aad.get(0).get("accuser_idcardno") != null ? aad.get(0).get("accuser_idcardno").toString() : ""));
        request.setAttribute("accuser_name", (aad.get(0).get("accuser_name") != null ? aad.get(0).get("accuser_name").toString() : ""));
        request.setAttribute("accuser_poscode", (aad.get(0).get("accuser_poscode") != null ? aad.get(0).get("accuser_poscode").toString() : ""));
        request.setAttribute("accuser_posname", (aad.get(0).get("posname") != null ? aad.get(0).get("posname").toString() : ""));
        request.setAttribute("accuser_offcode", (aad.get(0).get("accuser_offcode") != null ? aad.get(0).get("accuser_offcode").toString() : ""));
        request.setAttribute("accuser_offname", (aad.get(0).get("offname") != null ? aad.get(0).get("offname").toString() : ""));
		
        String indcOff = (aad.get(0).get("indc_off") != null ? aad.get(0).get("indc_off").toString() : "");
		String IsEdit = "";
		if(!uData.getAccuserType().equals(Constants.ACCUSER_TYPE_XCS)){
			//ถ้าเป็นเจ้าหน้าที่ภูมิภาค
	        if(!uData.getINDCOff().equals(indcOff))  //กรณีหน่วยงานใหญ่เข้ามาดูของหน่วยงานย่อย
	        	IsEdit = "N";
	        else{
	        	//กรณีหน่วยงานอื่นๆ แต่สิทธิ์เป็น Admin เข้ามาดู
	        	if(!uData.getOffcode().equals(aad.get(0).get("offcode").toString())){
	        		IsEdit = "N";
	        	}else{
	        		IsEdit = "Y";
	        	}
	        }
		}else{
			//ถ้าเป็นเจ้าหน้าที่ส่วนกลาง ให้สามารถแก้ไขคดีของภาค 10 ได้
			String vOffcode = (aad.get(0).get("offcode") != null ? aad.get(0).get("offcode").toString() : "");
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

	
	private void searchData(HttpServletRequest request, HttpServletResponse response) throws Exception {
		ApplicationSincereConfirm aad = new ApplicationSincereConfirm(db);
		String sql ="";
		String slsql;
		String countsql;
        
        slsql = "select distinct aa.id ,aa.track_no, aa.occurrence_date, to_char(aa.occurrence_date, 'dd/mm/yyyy', 'NLS_CALENDAR=''THAI BUDDHA'' NLS_DATE_LANGUAGE=THAI') occurrence_date2, "
    		+" pke_arrest.getArrestIndictment(aa.track_no) guilt_base, bi.case_id, tia.title_name || sta.first_name || ' ' || sta.last_name accuser_name,"
    		+" aa.offcode, ed.offname,aa.legislation_id, lg.legislation_name, nvl(sic.id,0) send_income_case_id, pke_arrest.getArrestLawbreaker(aa.track_no) lawbreaker_name"
    			+ " from application_arrest aa"
    				+ " inner join application_arrest_indictment aai on aa.track_no=aai.track_no"
    				+ " inner join indictment inc on inc.indictment_id=aai.indictment_id"
    				+ " left join application_arrest_lawbreaker aal on aa.track_no=aal.track_no"
    				+ " left join lawbreaker lb on lb.lawbreaker_no=aal.lawbreaker_no"
    				+ " left join title tt on tt.title_code=aal.title_code"
    				+ " left join title tc on tc.title_code=aal.company_title_code"
    				+ " left join book_impeachment bi on aa.track_no=bi.track_no"
    				+ " left join v_accuser_list_popup sta on sta.idcard_no=aa.accuser_idcardno"
    				+ " left join title tia on tia.title_code=sta.title_code"
    				+ " left join application_arrest_exhibit aae on aa.track_no=aae.track_no"
    				+ " left join duty_table dt on dt.duty_code=aae.duty_code " 
    				+ " inner join legislation lg on lg.id=aa.legislation_id"
    				+ " inner join duty_group dg on dg.group_id=aa.product_group_id"
    				+ " left join province pv on pv.province_code=aa.scene_province"
    				+ " left join district d on d.district_code=aa.scene_district"
    				+ " left join subdistrict sd on sd.subdistrict_code=aa.scene_subdistrict"
    				+ " left join compare_case cc on cc.track_no=aa.track_no"
    				+ " left join application_arrest_prove aap on aa.track_no=aap.track_no"
    				+ " inner join ed_office ed on ed.offcode=aa.offcode"
    				+ " left join application_arrest_license ali on aa.track_no=ali.track_no"
    				+ " left join application_notice_arrest ana on ana.id=aa.application_notice_arrest_id"
    				+ " left join application_search_warrant asw on asw.id=aa.application_search_warrant_id"
    				+ " left join application_sincere_confirm asi on asi.id=aa.application_sincere_confirm_id"
    				+ " left join send_income_case sic on sic.compare_case_id=cc.id " 
    				+ " 	and sic.send_income_id in (select si.id from send_income si where si.status='1')" //นำส่งเงินแล้ว
    				+ " where aa.del_flag='N'";
    		
    		countsql = "select count( distinct  aa.id) "
    				+ " from application_arrest aa"
    					+ " inner join application_arrest_indictment aai on aa.track_no=aai.track_no"
    					+ " inner join indictment inc on inc.indictment_id=aai.indictment_id"
    					+ " left join application_arrest_lawbreaker aal on aa.track_no=aal.track_no"
    					+ " left join lawbreaker lb on lb.lawbreaker_no=aal.lawbreaker_no"
    					+ " left join title tt on tt.title_code=aal.title_code"
    					+ " left join title tc on tc.title_code=aal.company_title_code"
    					+ " left join book_impeachment bi on aa.track_no=bi.track_no"
    					+ " left join v_accuser_list_popup sta on sta.idcard_no=aa.accuser_idcardno"
    					+ " left join title tia on tia.title_code=sta.title_code"
    					+ " left join application_arrest_exhibit aae on aa.track_no=aae.track_no"
    					+ " left join duty_table dt on dt.duty_code=aae.duty_code "
    					+ " inner join legislation lg on lg.id=aa.legislation_id"
    					+ " inner join duty_group dg on dg.group_id=aa.product_group_id"
    					+ " left join province pv on pv.province_code=aa.scene_province"
    					+ " left join district d on d.district_code=aa.scene_district"
    					+ " left join subdistrict sd on sd.subdistrict_code=aa.scene_subdistrict"
    					+ " left join compare_case cc on cc.track_no=aa.track_no"
    					+ " left join application_arrest_prove aap on aa.track_no=aap.track_no"
    					+ " inner join ed_office ed on ed.offcode=aa.offcode"
    					+ " left join application_arrest_license ali on aa.track_no=ali.track_no"
    					+ " left join application_notice_arrest ana on ana.id=aa.application_notice_arrest_id"
    					+ " left join application_search_warrant asw on asw.id=aa.application_search_warrant_id"
    					+ " left join application_sincere_confirm asi on asi.id=aa.application_sincere_confirm_id"
        				+ " left join send_income_case sic on sic.compare_case_id=cc.id " 
        				+ " 	and sic.send_income_id in (select si.id from send_income si where si.status='1')" //นำส่งเงินแล้ว
    					+ " where aa.del_flag='N' ";
    		
	    	String whText = "";

    		if(request.getParameter("default") != null){ //Is Default
    			whText += " AND nvl(bi.track_no,'0') = '0' ";
    			
    			if(uData.getAccuserType().equals(Constants.ACCUSER_TYPE_XCS)){
    	        	//ถ้าเป็นเจ้าหน้าที่ส่วนกลาง ให้ Default ที่ ภาค 10
    	        	whText += " AND substr(aa.offcode,1,2) = '10' ";
    	        }else if(uData.getAccuserType().equals(Constants.ACCUSER_TYPE_DEPT)){
    	        	//ถ้าเป็นเจ้าหน้าที่สรรพสามิตภาคให้แสดงคดีของภาคนั้นทั้งหมดที่ยังไม่มีเลขคดี
    	        	whText += " AND substr(aa.offcode,1,2) || '0000' = '" + uData.getOffcode() + "' ";
    	        }else if(uData.getAccuserType().equals(Constants.ACCUSER_TYPE_AREA)){
    	        	//ถ้าเป็นเจ้าหน้าที่สรรพสามิตพื้นที่ให้แสดงคดีของพื้นที่นั้นทั้งหมดที่ยังไม่มีเลขคดี
    	        	whText += " AND substr(aa.offcode,1,4) || '00' = '" + uData.getOffcode() + "' ";
    	        }else if(uData.getAccuserType().equals(Constants.ACCUSER_TYPE_BRANCH)){
    	        	//ถ้าเป็นเจ้าหน้าที่สรรพสามิตพื้นที่สาขา
    		        whText += " AND aa.offcode = '" + uData.getOffcode() + "' ";
    	        }
    			//whText += " AND aa.offcode like '%" + uData.getOffcode().replace("'", "''").trim() + "%' ";
    			
    			request.setAttribute("abc", "1");
    			request.setAttribute("offcode", uData.getOffcode());
    	        request.setAttribute("offname", uData.getShortName());
    	        this.writeTranLog("แสดงหน้าจอค้นหาบันทึกรับคำกล่าวโทษ");
    		}else{ //Is Button Search
	    		com.ko.webapp.util.ArrestUtil whTxt = new com.ko.webapp.util.ArrestUtil();
	    		whText += whTxt.getArrestWhere(request);
	    		if(request.getParameter("nojob")!=null){
	    			whText += " AND nvl(bi.track_no,'0') = '0'";	    			
	    		}
	    		this.writeTranLog("ค้นหาบันทึกรับคำกล่าวโทษ");
	    		request.setAttribute("offcode", request.getParameter("offcode"));
	            request.setAttribute("offname", request.getParameter("offname"));
    		}
    		Integer totalRow = aad.countBySql(countsql+whText, null);
    		pageUtil.setTotalRow(totalRow);
    		pageUtil.setPageSize(20);
    		//log.debug(slsql+whText + " order by aa.track_no desc ");
    		List<Map<String, Object>> dblist = aad.findBySql(slsql+whText + " order by aa.track_no desc ", null,pageUtil);
    		request.setAttribute("dblist", dblist);
    		
    		ApplicationArrest maxid = new ApplicationArrest(db);
    		List<Map<String, Object>> aamax = maxid.findBySql("select max(id) max from application_arrest", null);
    		request.setAttribute("aamax", aamax.get(0));
    		
	}

	String menuID = "9";
	public void list(HttpServletRequest request, HttpServletResponse response) throws Exception {
		if(uData.chkUserMenu(menuID)==true){
			pre(request, response);
			searchData(request,response);

			forward("?page=/CompareCase/book_impeachment_list.jsp", request, response);
		}else{
    		HttpSession session = request.getSession();
  		  	session.invalidate();
  		  	request.setAttribute("errMsg", "ผู้ใช้ไม่มีสิทธิ์ดำเนินการ");
  		  	forward("?page=/login.jsp", request, response);
    	}
	}
	
    public boolean isNumeric(String s) {
        try {
            return s.matches("[-+]?\\d*\\.?\\d+");
        } catch (Exception e) {
            return false;
        }
    }
}
