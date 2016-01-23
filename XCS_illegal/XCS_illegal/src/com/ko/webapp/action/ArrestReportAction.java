package com.ko.webapp.action;

//import java.text.SimpleDateFormat;
//import java.util.ArrayList;
//import java.util.Date;
import java.util.Date;
import java.util.List;
import java.util.Map;
//import java.util.Map;
//
//import com.ko.util.ConfigUtil;
//import com.ko.util.RunningKey;
//
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
//
//import com.ko.util.DateUtil;
//import com.ko.webapp.util.ParameterUtil;
import com.ko.domain.*;
//
//import com.ko.service.*;
//import com.pccth.rdbservice.*;
//import com.ko.Constants;
import com.ko.util.DateUtil;
import com.ko.util.RunningKey;


public class ArrestReportAction extends BaseAction {  
	
	String menuID = "386";
    public void preup(HttpServletRequest request, HttpServletResponse response) throws Exception {
//        String sql;
//        sql = "select distinct aa.lawbreak_type, aa.scene_name, aa.scene_no, aa.scene_moo, aa.scene_soi, aa.scene_road, aa.police_station, aa.accuser_poscode," +
//                " aa.accuser_offcode, aa.issentcourt, aa.estimate_fine, aa.department_id, aa.department_name, aa.id, aa.track_no," +
//                " pke_arrest.getArrestIndictment(aa.track_no) guilt_base, " +
//                "aa.coordinate_x, aa.coordinate_y, aa.accuser_idcardno, aa.report_to ,aa.order_by, aa.SCENE_PROVINCE, aa.SCENE_SUBDISTRICT, aa.SCENE_DISTRICT," +
//                "aa.occurrence_date, to_char(aa.occurrence_date, 'dd/mm/yyyy', 'NLS_CALENDAR=''THAI BUDDHA'' NLS_DATE_LANGUAGE=THAI') occurrence_date2, " +
//                " to_char(aa.occurrence_date,'HH24:mi') occurrence_time, " +
//                "aa.application_date, to_char(aa.application_date, 'dd/mm/yyyy', 'NLS_CALENDAR=''THAI BUDDHA'' NLS_DATE_LANGUAGE=THAI')  application_date2, " +
//                "nvl(aa.accuser_name,tia.title_name || sta.first_name || ' ' || sta.last_name) accuser_name, aa.legislation_id, lg.legislation_name, " +
//                "aa.product_group_id, dg.group_name product_group_name, aa.accuser_type,  aa.have_culprit, " +
//                "aa.offcode, ed.short_name area_offname, nvl(aa.accuser_offname, nvl(sta.offname,eda.offname)) offname,nvl(aa.accuser_posname, nvl(sta.posname,ps.posname)) posname, " +
//                " ana.notice_no , ana.inform_name ,asw.warrant_no, asi.track_no confirm_no,aa.application_notice_arrest_id,aa.application_search_warrant_id," +
//                " aa.application_sincere_confirm_id, nvl(aa.report_to_staff,tir.title_name || str.first_name || ' ' || str.last_name) report_to_staff,  " +
//                " tio.title_name || sto.first_name || ' ' || sto.last_name order_by_staff, pke_compare.chkCaseLast(aa.track_no) chkCaseLast, " +
//                " aa.behaviour, aa.testimony,  aa.owner_name,aa.business_name,aa.surety_name, aa.leader_position, aa.guilty, aa.duty, aa.director_position, " +
//                " to_char(aa.arrest_report_date,'dd/mm/yyyy', 'NLS_CALENDAR=''THAI BUDDHA'' NLS_DATE_LANGUAGE=THAI') arrest_report_date, " +
//                " aa.administration, to_char(aa.finished_time,'HH24:mi') finished_time, ed.indc_off " +
//                "from application_arrest aa " +
//                " left join v_accuser_list_popup sta on sta.idcard_no=aa.accuser_idcardno  " +
//                "left join title tia on tia.title_code=sta.title_code " +
//                "left join staff str on str.idcard_no=to_char(aa.report_to) " +
//                "left join title tir on tir.title_code=str.title_code " +
//                "left join staff sto on sto.idcard_no=to_char(aa.order_by) " +
//                "left join title tio on tio.title_code=sto.title_code " +
//                "inner join legislation lg on lg.id=aa.legislation_id " +
//                "inner join duty_group dg on dg.group_id=aa.product_group_id " +
//                "inner join province pv on pv.province_code=aa.scene_province " +
//                "left join district d on d.district_code=aa.scene_district " +
//                "left join subdistrict sd on sd.subdistrict_code=aa.scene_subdistrict " +
//                "inner join ed_office ed on ed.offcode=aa.offcode " +
//                "left join ed_office eda on eda.offcode=aa.accuser_offcode " +
//                "left join position ps on ps.poscode=aa.accuser_poscode " +
//                "left join application_notice_arrest ana on ana.id=aa.application_notice_arrest_id " +
//                "left join application_search_warrant asw on asw.id=aa.application_search_warrant_id " +
//                "left join application_sincere_confirm asi on asi.id=aa.application_sincere_confirm_id " +
//                "where aa.del_flag='N' and aa.id =  ? ";
//        String alisql;
//        String aaesql;
//        String aalsql;
//        String incsql;
//        String aatsql;
//        
//        ApplicationArrest aa = new ApplicationArrest(db);
//
//        Long id = new Long(request.getParameter("id"));
//        List<Map<String, Object>> aad = aa.findBySql(sql, id);
//
//        alisql = "select ali.id, ali.offcode, ali.license_no, ali.book_no," +
//                " ali.establishment_name, ali.entrepreneur, " +
//                "ali.license_type, ali.iswithdraw, ed.offname, lt.licensetype_name" +
//                " from application_arrest_license ali " +
//                "inner join ed_office ed on ed.offcode=ali.offcode " +
//                "inner join LICENSE_TYPE lt on lt.id = ali.license_type " +
//                "where ali.track_no = ?" +
//                " order by ali.id";
//
//        aaesql = "select aae.id, aae.TRACK_NO , aae.ISEXHIBITCO, aae.PRODUCT_CODE," + "\n" +
//                " aae.BRAND_CODE, aae.ISDOMESTIC, aae.SIZES_CODE," + "\n" +
//                " aae.SIZE_UNIT_CODE, nvl(aae.sizes_unit_name,nvl(su.thname,su.enname)) size_unit_name, " + "\n" +
//                " aae.QTY, aae.qty_unit_code, nvl(aae.qty_unit_name,nvl(qu.thname,qu.enname)) qty_unit_name, " + "\n" +
//                " aae.NETWEIGHT, aae.NETWEIGHT_UNIT_CODE, nvl(aae.netweight_unit_name,nvl(wu.thname, wu.enname)) netweight_unit_name, " + "\n" +
//                " aae.STATUS, aae.EXHIBIT_LIST, aae.EXHIBIT_DESC, " + "\n" +
//                " aae.CAR_NO, aae.APPLICATION_ARREST_EXHIBIT_ID co_id, aae.DUTY_CODE, aae.REMARKS," + "\n" +
//                " aae.CREATE_BY, aae.CREATE_ON, aae.UPDATE_BY, aae.UPDATE_ON, " + "\n" 
//                + " replace(nvl(aae.brand_name,  nvl(b.brand_main_thai, b.brand_main_eng)),'" + Character.toString('"') + "','" + "\\" + "\"" + "') brand_name," + "\n" +
//                " nvl(aae.duty_name,dt.duty_name) duty_name, nvl(aae.sizes_desc,sp.size_desc) size_desc, bi.case_id, " + "\n" +
//                " nvl(aae.product_name, p.product_name) product_name, aae.group_id, nvl(aae.group_name,dg.group_name) group_name" + "\n" +
//                " from APPLICATION_ARREST_EXHIBIT aae " + "\n" +
//                " left join unit su on su.unit_code = aae.size_unit_code " + "\n" +
//                " left join unit qu on qu.unit_code = aae.qty_unit_code " + "\n" +
//                " left join unit wu on wu.unit_code = aae.netweight_unit_code " + "\n" +
//                " left join brand_main b on b.group_id = aae.group_id and b.brand_main_code =aae.brand_code" + "\n" +
//                " left join product p on p.product_code = aae.product_code" + "\n" +
//                " left join size_package sp on sp.group_id = aae.group_id and sp.size_code = aae.sizes_code" + "\n" +
//                " left join application_arrest_exhibit aeco on aeco.id=aae.application_arrest_exhibit_id \n" +
//                " left join book_impeachment bi on bi.track_no = aeco.track_no" + "\n" +
//                " left join DUTY_TABLE dt on dt.duty_code=aae.duty_code" + "\n" +
//                " left join duty_group dg on dg.group_id=aae.group_id \n" + 
//                " where aae.track_no = ? " + "\n" +
//                " order by aae.id";
//        //log.debug(aaesql);
//
//        aalsql = "SELECT aal.ID, aal.TRACK_NO, aal.LAWBREAKER_NO,  aal.CULPRIT_TYPE, aal.LAWBREAKER_ID_CARD," +
//                " aal.LAWBREAKER_PASSPORT,   aal.FIRST_NAME, aal.MIDDLE_NAME, aal.LAST_NAME,   aal.ADDRESS_NO," +
//                " aal.SOI, aal.ROAD,   aal.MOO, aal.SUBDISTRICT, aal.DISTRICT,   aal.PROVINCE, " +
//                " aal.NATIONALITY_ID, aal.RACE_ID,   aal.CAREER, aal.AGE, aal.FATHER_NAME,  " +
//                " aal.MOTHER_NAME, aal.PAID_TIME_OFF, aal.INVCODE,   aal.FINE, aal.BOOK_NO, aal.INV_NO, " +
//                "  aal.ISCANCEL, aal.CANCEL_DATE, aal.CANCEL_BY,   aal.CREATE_BY, aal.CREATE_ON, aal.UPDATE_BY,  " +
//                " aal.UPDATE_ON, aal.TITLE_CODE, aal.SEX,    aal.OTHER_NAME, aal.EXCISE_REG_NO,  " +
//                " to_char(aal.birth_date, 'dd/mm/yyyy', 'NLS_CALENDAR=''THAI BUDDHA'' NLS_DATE_LANGUAGE=THAI')  birth_date, " +
//                " aal.CORPORATION_CODE, aal.COMPANY_TITLE_CODE, aal.COMPANY_NAME,   aal.PAPER_NO, aal.ISMISTAKE," +
//                " aal.ISMISTAKE_DESC,  p.province_name ,d.district_name, st.subdistrict_name,  tl.title_name," +
//                " r.race_name race_id_name,n.nation_name nationality_id_name " +
//                " FROM APPLICATION_ARREST_LAWBREAKER aal " +
//                " left join province p on p.province_code = aal.province " +
//                " left join district d on d.district_code = aal.district " +
//                " left join subdistrict st on st.subdistrict_code = aal.subdistrict " +
//                " left join title tl on tl.title_code = aal.title_code" +
//                " left join race r on r.id = aal.race_id" +
//                " left join nationality n on n.id = aal.NATIONALITY_ID" +
//                " where aal.track_no = ? " +
//                " order by aal.id ";
//        //log.debug(aalsql);
//
//        incsql = " SELECT aai.ID, aai.CREATE_BY, aai.CREATE_ON, aai.UPDATE_BY, aai.TRACK_NO, " +
//                " aai.INDICTMENT_ID, aai.EXHIBIT_WILD," +
//                " inc.case_law_id, inc.penalty_case_law_id, replace(inc.guilt_base,'" + Character.toString('"') + "','" + "\\" + "\"" + "') guilt_base" +
//                " FROM APPLICATION_ARREST_INDICTMENT aai" +
//                " left join indictment inc on inc.indictment_id = aai.indictment_id " +
//                " where aai.track_no = ? " +
//                " order by aai.id";
//        //log.debug(incsql);
//        
//        aatsql = " SELECT aat.ID, aat.CREATE_BY, aat.CREATE_ON,  aat.UPDATE_BY, aat.UPDATE_ON, aat.TRACK_NO,    aat.STAFF_NO, aat.INSPECTOR_CODE, aat.STAFF_POSITION, "
//                + " aat.DUTY_STATUS_ID, aat.STAFF_IDCARDNO, aat.STAFF_POSCODE,    aat.STAFF_OFFCODE, st.title_code,st.first_name,st.last_name,t.title_name,    "
//                + " aat.staff_offcode offcode, nvl(ed.offname,st.dept_name) offname , nvl(aat.staff_position,nvl(st.pos_name,  ps.posname)) posname "
//                + " FROM APPLICATION_ARREST_TEAM aat  "
//                + " left join v_accuser_list_popup st on st.idcard_no = aat.STAFF_IDCARDNO  "
//                + " left join title t on t.title_code = st.title_code  "
//                + " left join ed_office ed on ed.offcode = aat.staff_offcode "
//                + " left join position ps on ps.poscode = aat.STAFF_POSCODE "
//                + " where aat.track_no = ? " 
//                + " order by aat.id ";
//        //log.debug(aatsql);
//
//        ApplicationArrestTeam aat = new ApplicationArrestTeam(db);
//        List<Map<String, Object>> aatlist = aat.findBySql(aatsql, aad.get(0).get("track_no"));
//        Indictment inc = new Indictment(db);
//        List<Map<String, Object>> inclist = inc.findBySql(incsql, aad.get(0).get("track_no"));
//        ApplicationArrest aal = new ApplicationArrest(db);
//        List<Map<String, Object>> aallist = aal.findBySql(aalsql, aad.get(0).get("track_no"));
//        ApplicationArrest aae = new ApplicationArrest(db);
//        List<Map<String, Object>> aaelist = aae.findBySql(aaesql, aad.get(0).get("track_no"));
//        ApplicationArrestLicense ali = new ApplicationArrestLicense(db);
//        List<Map<String, Object>> alilist = ali.findBySql(alisql, aad.get(0).get("track_no"));
//
//        request.setAttribute("aailist", inclist);
//        request.setAttribute("aaelist", aaelist);
//        request.setAttribute("aatlist", aatlist);
//        request.setAttribute("alilist", alilist);
//        
//        request.setAttribute("aallist", aallist);
//        request.setAttribute("track_gen", aad.get(0).get("track_no"));
//        request.setAttribute("aalsize", aallist.size());
//        request.setAttribute("db", aad.get(0));
//        request.setAttribute("accuserType",(aad.get(0).get("accuser_type") != null ? aad.get(0).get("accuser_type").toString() : ""));
//        
//        request.setAttribute("offcode", (aad.get(0).get("offcode") != null ? aad.get(0).get("offcode").toString() : ""));
//        request.setAttribute("offname", (aad.get(0).get("area_offname") != null ? aad.get(0).get("area_offname").toString() : ""));
//        request.setAttribute("department_code", (aad.get(0).get("department_id")!=null ? aad.get(0).get("department_id").toString() : ""));
//        request.setAttribute("department_name", (aad.get(0).get("department_name") != null ? aad.get(0).get("department_name").toString() : ""));
//        request.setAttribute("accuser_idcardno", (aad.get(0).get("accuser_idcardno") != null ? aad.get(0).get("accuser_idcardno").toString() : ""));
//        request.setAttribute("accuser_name", (aad.get(0).get("accuser_name") != null ? aad.get(0).get("accuser_name").toString() : ""));
//        request.setAttribute("accuser_poscode", (aad.get(0).get("accuser_poscode") != null ? aad.get(0).get("accuser_poscode").toString() : ""));
//        request.setAttribute("accuser_posname", (aad.get(0).get("posname") != null ? aad.get(0).get("posname").toString() : ""));
//        request.setAttribute("accuser_offcode", (aad.get(0).get("accuser_offcode") != null ? aad.get(0).get("accuser_offcode").toString() : ""));
//        request.setAttribute("accuser_offname", (aad.get(0).get("offname") != null ? aad.get(0).get("offname").toString() : ""));
//        
//        String indcOff = (aad.get(0).get("indc_off") != null ? aad.get(0).get("indc_off").toString() : "");
//		String IsEdit = "";
//		if(!uData.getAccuserType().equals(Constants.ACCUSER_TYPE_XCS)){
//			//ถ้าเป็นเจ้าหน้าที่ภูมิภาค
//	        if(!uData.getINDCOff().equals(indcOff))  //กรณีหน่วยงานใหญ่เข้ามาดูของหน่วยงานย่อย
//	        	IsEdit = "N";
//	        else{
//	        	//กรณีหน่วยงานอื่นๆ แต่สิทธิ์เป็น Admin เข้ามาดู
//	        	if(!uData.getOffcode().equals(aad.get(0).get("offcode").toString())){
//	        		IsEdit = "N";
//	        	}else{
//	        		IsEdit = "Y";
//	        	}
//	        }
//		}else{
//			//ถ้าเป็นเจ้าหน้าที่ส่วนกลาง ให้สามารถแก้ไขคดีของภาค 10 ได้
//			String vOffcode = (aad.get(0).get("offcode") != null ? aad.get(0).get("offcode").toString() : "");
//			if(vOffcode.substring(0, 2).equals("10") || vOffcode.substring(0, 2).equals("00"))
//				IsEdit = "Y";
//			else{
//				if(uData.getOffcode().equals(vOffcode))
//					IsEdit = "Y";
//				else
//					IsEdit = "N";
//			}
//		}
//		request.setAttribute("IsEdit", IsEdit);
    }

    public void pre(HttpServletRequest request, HttpServletResponse response) throws Exception {
        
    	Legislation lt = new Legislation(db);
        List<Legislation> ltlist = lt.findByWhere(" 1=1 order by legislation_name", null);
        
        DutyStatu ds = new DutyStatu(db);
        List<DutyStatu> dslist = ds.findByWhere(" id not in(1,2)", null);
        request.setAttribute("dslist", dslist);
        request.setAttribute("ltlist", ltlist);
//        if (uData.IsAdmin()==true)
//        	request.setAttribute("IsAdmin","1");
        
    }

    public void _default(HttpServletRequest request,
                         HttpServletResponse response) throws Exception {
        // TODO Auto-generated method stub
        //log.debug("Done");
    	
    	if(uData.chkUserMenu(menuID)==true){
	        pre(request, response);
	        request.setAttribute("offcode", uData.getOffcode());
	        request.setAttribute("offname", uData.getShortName());
	        forward("?page=/Protect/ArrestReportList.jsp", request, response);
    	}else{
    		HttpSession session = request.getSession();
  		  	session.invalidate();
  		  	request.setAttribute("errMsg", "ผู้ใช้ไม่มีสิทธิ์ดำเนินการ");
  		  	forward("?page=/login.jsp", request, response);
    	}
    }

    public void findArrest(HttpServletRequest request, HttpServletResponse response) throws Exception {

        //forward("process?action=Arrest", request, response);
    }

    public void add(HttpServletRequest request, HttpServletResponse response) throws Exception {
        request.setAttribute("action", "process?action=ArrestReport&cmd=add");
        this.writeTranLog("เพิ่มรายงานการจับกุม");
        log.debug("เพิ่มรายงานการจับกุม");
//        String tno = "";
//        request.setAttribute("track_gen", "NEW");
        pre(request, response);
//
//    	//System.out.println("EdOffice No Service");
//        EdOffice ed = new EdOffice(db);
//        String edSql="";
//        if(uData.getAccuserType().equals(Constants.ACCUSER_TYPE_XCS)){
//        	//ถ้าเป็นเจ้าหน้าที่ของส่วนกลาง (ส่วนคดี) ให้แสดงข้อมูลภาค 10 ให้เลือก
//        	edSql = "select offcode, short_name from ed_office where substr(offcode,1,2) = '10' and indc_off = 'E' order by offname ";
//        }else{
//        	edSql = "select offcode, short_name from ed_office order by offname ";
//        }
//        
//        
//        List<Map<String,Object>> edlist = ed.findBySql(edSql);
//        //log.debug(edSql);
//        request.setAttribute("edlist", edlist);
//        
//        String vOffcode=uData.getOffcode();
//        String vOffname=uData.getShortName();
//        
//        request.setAttribute("offcode", vOffcode);
//        request.setAttribute("offname", vOffname);
//        request.setAttribute("department_code", vOffcode);
//        request.setAttribute("department_name", vOffname);
//        request.setAttribute("accuserType",uData.getAccuserType());
//        request.setAttribute("accuser_idcardno", uData.getIdCard());
//        request.setAttribute("accuser_name", uData.getFullName());
//        request.setAttribute("accuser_poscode", uData.getPoscode());
//        request.setAttribute("accuser_posname", uData.getPosname());
//        request.setAttribute("accuser_offcode", vOffcode);
//        request.setAttribute("accuser_offname", vOffname);
//        
//        //  pke_arrest(aal.id);
        forward("?page=/Protect/ArrestReportForm.jsp", request, response);
    }

    public void save(HttpServletRequest request, HttpServletResponse response) throws Exception {
    	Long id = 0l;
    	if(!request.getParameter("ar_id").equals("")){
    		id = new Long(request.getParameter("ar_id"));
    	}
    	ApplicationArrestReport ar = new ApplicationArrestReport(db);
    	if(id>0l){
    		ar=ar.findByPk(id);
    	}
    	
    	ar.setCase_date(DateUtil.getDateFromString(request.getParameter("case_date")));
    	ar.setReport_title(request.getParameter("report_title"));
    	ar.setExhibit_desc(request.getParameter("exhibit_desc"));
    	ar.setNature_invest(request.getParameter("nature_invest"));
    	ar.setLawbreaker_name(request.getParameter("lawbreaker_name"));
    	ar.setIsnotice(request.getParameter("isNotice") != null ? request.getParameter("isNotice") : "N");
    	ar.setIscompare(request.getParameter("isCompare") != null ? request.getParameter("isCompare") : "N");
    	ar.setAccuser_name(request.getParameter("accuser_name"));
    	ar.setCommander_name(request.getParameter("commander_name"));
    	ar.setArrest_desc(request.getParameter("arrest_desc"));
    	ar.setCommander_comment(request.getParameter("commander_comment"));
    	ar.setStaff_name_sue(request.getParameter("staff_name_sue"));
    	ar.setStaff_posname_sue(request.getParameter("staff_posname_sue"));
    	ar.setReport_command(request.getParameter("report_command"));
    	ar.setHelper_name(request.getParameter("helper_name"));
    	
    	if(id>0l){
        	ar.setUpdate_by(uData.getUserId());
    		ar.setUpdate_on(new Date());
    		ar = ar.update();
    	}else{
    		ar.setCreate_by(uData.getUserId());
        	ar.setCreate_on(new Date());
        	String jobNo = "";
        	jobNo = new RunningKey(db).getRunningKey("APPLICATION_ARREST_REPORT", "", "", "");
        	ar.setJob_no(jobNo);
        	
        	ar = ar.create();
    	}
    	this.writeTranLog("บันทึกข้อมูลรายงานการจับกุม Job No="+ ar.getJob_no());
    	
    	redirect("process?action=ArrestReport&id=" + ar.getId() + "&cmd=showupdate&SaveMSG=1", request, response);
    }

    public void list(HttpServletRequest request, HttpServletResponse response) throws Exception {
    	this.writeTranLog("ค้นหารายงานการจับกุม");

    	String wh = "1=1";
    	if(!request.getParameter("case_date_from").equals(""))
    		wh += " and to_char(case_date,'yyyymmdd') >= '" + DateUtil.formatConditionDate(request.getParameter("case_date_from")) + "'";
    	if(!request.getParameter("case_date_to").equals(""))
    		wh += " and to_char(case_date,'yyyymmdd') <= '" + DateUtil.formatConditionDate(request.getParameter("case_date_to")) + "'";
    	if(!request.getParameter("report_title").equals(""))
    		wh += " and report_title like '%" + request.getParameter("report_title").replace("'", "''").trim() + "%'";
    	if(!request.getParameter("lawbreaker_name").equals(""))
    		wh += " and lawbreaker_name like '%" + request.getParameter("lawbreaker_name").replace("'", "''").trim() + "%'";
    	if(!request.getParameter("accuser_name").equals(""))
    		wh += " and accuser_name like '%" + request.getParameter("accuser_name").replace("'", "''").trim() + "%'";
    	

    	
    	String sql = "select ar.id, ar.job_no, ar.report_title,ar.lawbreaker_name,ar.accuser_name, \n";
		sql += " to_char(ar.case_date,'dd/mm/yyyy','NLS_CALENDAR=''THAI BUDDHA'' NLS_DATE_LANGUAGE=THAI') case_date \n";
		sql += " from application_arrest_report ar \n";
		sql += " where " + wh;
		sql += " order by accuser_name, case_date, job_no";
		
		String countsql = " select count(id) from (" + sql + ")";
		
		ApplicationArrestReport ar = new ApplicationArrestReport(db);
		Integer totalRow = ar.countBySql(countsql, null);
        pageUtil.setTotalRow(totalRow);
        pageUtil.setPageSize(20);
        
        List<Map<String, Object>> dblist = ar.findBySql(sql, null, pageUtil);
        request.setAttribute("dblist", dblist);
        
        forward("?page=/Protect/ArrestReportList.jsp", request, response);
    } 
    
    public void showupdate(HttpServletRequest request, HttpServletResponse response) throws Exception {
    	String id = "0";
    	if(request.getParameter("id") == null)
    		id = request.getAttribute("id").toString();
    	else
    		id = request.getParameter("id");
    	
    	if(request.getParameter("SaveMSG") != null)
    		request.setAttribute("SaveMSG", "1");
    	
    	ApplicationArrestReport ar = new ApplicationArrestReport(db);
    	ar = ar.findByPk(new Long(id));
    	
        request.setAttribute("ar", ar);
        request.setAttribute("action", "process?action=ArrestReport&cmd=showupdate&id=" + id);
    	
        forward("?page=/Protect/ArrestReportForm.jsp", request, response);
    	
//    	String id = "";
//    	if(request.getParameter("id") == null)
//    		id = request.getAttribute("id").toString();
//    	else
//    		id = request.getParameter("id");
//    	
//    	if(request.getParameter("SaveMSG") != null)
//    		request.setAttribute("SaveMSG", "1");
//    	
//        request.setAttribute("action", "process?action=Arrest&cmd=showupdate&id=" + id);
//        this.writeTranLog("แสดงรายละเอียดบันทึกการจับกุม");
//        preup(request, response);
//        pre(request, response);
//
//        EdOffice ed = new EdOffice(db);
//        String edSql = "select offcode, short_name from ed_office order by offname ";
//        List<Map<String,Object>> edlist = ed.findBySql(edSql);
//        request.setAttribute("edlist", edlist);
//        request.setAttribute("IsEditArrest", "Y");
//        
//        long ConfigID = new Long(ConfigUtil.getConfig("ILL00010"));
//        if(uData.chkUserRole(ConfigID))
//        	request.setAttribute("IsEditIndictment", "Y");
//        
//        forward("?page=/Protect/updatearrest_form.jsp", request, response);
    }
    
    public void update(HttpServletRequest request, HttpServletResponse response) throws Exception {
//        Long id = new Long(request.getParameter("id"));
//        ApplicationArrest aa = new ApplicationArrest(db);
//        aa = aa.findByPk(id);
//        
//        setArrestData(request,aa);
//        aa.setUpdate_by(uData.getIdCard());
//        aa.setUpdate_on(new Date());
//        aa = aa.update();
//
//        //uplist(request, response, aa);
//        saveApplicationArrestLicense(request,response, aa);
//        saveApplicationArrestTeam(request,response,aa);
//        saveApplicationArrestLawbreaker(request,response,aa);
//        saveApplicationArrestIndictment(request, response, aa);
//        saveApplicationArrestExhibit(request, response, aa);
//        
//        if (aa.getApplication_notice_arrest_id() != null){
//        	ApplicationNoticeArrest ana = new ApplicationNoticeArrest(db);
//        	ana = ana.findByPk(aa.getApplication_notice_arrest_id());
//        	ana.setNotice_result("2");
//        	ana.setUpdate_by(update_by);
//        	ana.setUpdate_on(update_on);
//        	ana = ana.update();
//        }
//        
//        this.writeTranLog("บันทึกข้อมูลบันทึกการจับกุม");
//        
//        //เก็บ Log กรณีมีการแก้ไขข้อมูล 2/39 ซึ่งมาจากคดีที่ชำระเงินค่าปรับไปแล้ว
//        String ChkCaseLast = request.getParameter("chkcaselast");
//		long ConfigID = new Long(ConfigUtil.getConfig("ILL00010"));
//		if(ChkCaseLast.equals("Y") && uData.chkUserRole(ConfigID)==true){
//			this.writeTranLog("ILL00010: " + "แก้ไขข้อมูลข้อกล่าวหาหรือรายการของกลางใน 2/39 กรณีที่ออกใบเสร็จรับเงินไปแล้วเลขที่งาน " + aa.getTrack_no());
//		}
//        
//        request.setAttribute("SaveMSG", "1");
//        request.setAttribute("id", id);
//        showupdate(request,response);
    }

    
    private void setArrestData(HttpServletRequest request, ApplicationArrest aa) throws Exception{
//    	String tno = "";
//        Date date = new Date();
//        int day = date.getDate();
//        int mon = date.getMonth();
//        int year = date.getYear();
//        int ho = date.getHours();
//        int mi = date.getMinutes();
//        int sec = date.getSeconds();
//        tno = "" + year + "" + mon + "" + day + "" + ho + "" + mi + "" + sec + "";
//        aa.setAccuser_idcardno(request.getParameter("accuser_idcardno").trim());
//        aa.setAccuser_offcode(request.getParameter("accuser_offcode").trim());
//        aa.setAccuser_poscode(request.getParameter("accuser_poscode").trim());
//        aa.setAccuser_type(request.getParameter("accuserType").trim());
//        aa.setAlleged_co(request.getParameter("alleged_co") != null ? request.getParameter("alleged_co") : "N");
//        aa.setApplication_notice_arrest_id(!request.getParameter("application_notice_arrest_id").trim().equals("") ? new Long(request.getParameter("application_notice_arrest_id")) : null);
//        aa.setApplication_search_warrant_id(!request.getParameter("application_search_warrant_id").trim().equals("") ? new Long(request.getParameter("application_search_warrant_id")) : null);
//        aa.setApplication_sincere_confirm_id(!request.getParameter("application_sincere_confirm_id").trim().equals("") ? new Long(request.getParameter("application_sincere_confirm_id")) : null);
//
//        if (request.getParameter("application_date").equals("") == false) {
//            aa.setApplication_date(DateUtil.getDateFromString(request.getParameter("application_date")));
//        }
//        if (request.getParameter("arrest_report_date").equals("") == false) {
//            aa.setArrest_report_date(DateUtil.getDateFromString(request.getParameter("arrest_report_date")));
//        }
//        aa.setBehaviour(request.getParameter("behaviour"));
//        aa.setBusiness_name(request.getParameter("business_name"));
//        aa.setCoordinate_x(!request.getParameter("coordinate_x").equals("") ? Double.parseDouble(request.getParameter("coordinate_x")) : null);
//        aa.setCoordinate_y(!request.getParameter("coordinate_y").equals("") ? Double.parseDouble(request.getParameter("coordinate_y")) : null);
//        aa.setDel_flag("N");
//        aa.setReport_to(!request.getParameter("report_to").equals("") ? Long.parseLong(request.getParameter("report_to")) : null);
//        aa.setOrder_by(!request.getParameter("order_by").equals("") ? Long.parseLong(request.getParameter("order_by")) : null);
//        aa.setDepartment_id(!request.getParameter("department_code").equals("") ? request.getParameter("department_code") : null);
//        aa.setDepartment_name(request.getParameter("department_name"));
//        aa.setDirector_position(request.getParameter("director_position"));
//        aa.setDuty(request.getParameter("duty"));
//        aa.setAdministration(request.getParameter("administration"));
//        aa.setEstimate_fine(request.getParameter("estimate_fine") != null && !request.getParameter("estimate_fine").equals("")  ? Double.parseDouble(request.getParameter("estimate_fine")) : null);
//        
//        try {
//        	SimpleDateFormat formatter = new SimpleDateFormat("dd/mm/yyyy"); //please notice the capital M
//            String ftime;
//            ftime = request.getParameter("finished_time");
//            formatter = new SimpleDateFormat("mm:ss");
//            ftime = "00/00/0000 " + ftime;
//            date = DateUtil.getDateFromString(ftime);
//            aa.setFinished_time(date);
//        } catch (Exception e) {
//            // TODO: handle exception
//        }
//        if (request.getParameter("guilty") != null) {
//            aa.setGuilty("Y");
//        } else {
//            aa.setGuilty("N");
//        }
//        if (request.getParameter("have_culprit") != null) {
//            aa.setHave_culprit(request.getParameter("have_culprit"));
//        }
//        if (request.getParameter("issentcourt") != null) {
//            aa.setIssentcourt(request.getParameter("issentcourt"));
//        } else {
//            aa.setIssentcourt("N");
//        }
//
//        aa.setLawbreak_type(request.getParameter("lawbreakertype"));
//        aa.setLeader_position(request.getParameter("leader_position"));
//        aa.setLegislation_id(Long.parseLong(request.getParameter("legislation_id")));
//        
//        String occ;
//        occ = request.getParameter("occurrence_date");
//        occ += " " + request.getParameter("occurrence_time") + ":00";
//
//        Date mmm = DateUtil.getDateFromString(occ);
//        aa.setOccurrence_date(mmm);
//
//        aa.setOffcode(request.getParameter("offcode").trim());
//        aa.setOwner_name(request.getParameter("owner_name"));
//        aa.setPolice_station(request.getParameter("police_station"));
//        aa.setProduct_group_id(request.getParameter("product_group_id"));
//        aa.setScene_district(request.getParameter("district"));
//        aa.setScene_moo(request.getParameter("scene_moo"));
//        aa.setScene_name(request.getParameter("scene_name"));
//        aa.setScene_no(request.getParameter("scene_no"));
//        aa.setScene_province(request.getParameter("scene_province"));
//        aa.setScene_road(request.getParameter("scene_road"));
//        aa.setScene_soi(request.getParameter("scene_soi"));
//        aa.setScene_subdistrict(request.getParameter("tambol"));
//        aa.setSurety_name(request.getParameter("surety_name"));
//        aa.setTestimony(request.getParameter("testimony"));
//        
//        Staff st = new Staff(db);
//        List<Staff> stList = st.findByWhere("idcard_no = '" + aa.getAccuser_idcardno() + "'", null);
//        if (stList.size()>0){
//        	if(stList.get(0).getBirthdate() != null){
//	        	int birthYear = stList.get(0).getBirthdate().getYear();
//	        	int nowDate = new Date().getYear();
//	        	aa.setAccuser_age(new Long(nowDate-birthYear));
//        	}
//        }
    }

    public boolean isNumeric(String s) {
        try {
            //return s.matches("[-+]?\\d*\\.?\\d+");
        	return s.matches("-?\\d+(.\\d+)?");
        } catch (Exception e) {
            return false;
        }

    }
   
}
