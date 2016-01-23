package com.ko.webapp.action;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Map;

import com.ko.util.ConfigUtil;
import com.ko.util.ReportsUtil;
import com.ko.util.RunningKey;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.ko.util.DateUtil;
import com.ko.webapp.util.ParameterUtil;
import com.ko.domain.*;

import com.ko.service.*;
import com.pccth.rdbservice.*;
import com.ko.Constants;


public class ArrestAction extends BaseAction {  
	
	String menuID = "6";
	long startTime = 0l;
	
    public void preup(HttpServletRequest request, HttpServletResponse response) throws Exception {
        String sql;
        sql = "select distinct aa.lawbreak_type, aa.scene_name, aa.scene_no, aa.scene_moo, aa.scene_soi, aa.scene_road, aa.police_station, aa.accuser_poscode," +
                " aa.accuser_offcode, aa.issentcourt, aa.estimate_fine, aa.department_id, aa.department_name, aa.id, aa.track_no," +
                " pke_arrest.getArrestIndictment(aa.track_no) guilt_base, " +
                "aa.coordinate_x, aa.coordinate_y, aa.accuser_idcardno, aa.report_to ,aa.order_by, aa.SCENE_PROVINCE, aa.SCENE_SUBDISTRICT, aa.SCENE_DISTRICT," +
                "aa.occurrence_date, to_char(aa.occurrence_date, 'dd/mm/yyyy', 'NLS_CALENDAR=''THAI BUDDHA'' NLS_DATE_LANGUAGE=THAI') occurrence_date2, " +
                " to_char(aa.occurrence_date,'HH24:mi') occurrence_time, " +
                "aa.application_date, to_char(aa.application_date, 'dd/mm/yyyy', 'NLS_CALENDAR=''THAI BUDDHA'' NLS_DATE_LANGUAGE=THAI')  application_date2, " +
                "nvl(aa.accuser_name,tia.title_name || sta.first_name || ' ' || sta.last_name) accuser_name, aa.legislation_id, lg.legislation_name, " +
                "aa.product_group_id, dg.group_name product_group_name, aa.accuser_type,  aa.have_culprit, " +
                "aa.offcode, ed.short_name area_offname, nvl(aa.accuser_offname, nvl(sta.offname,eda.offname)) offname,nvl(aa.accuser_posname, nvl(sta.posname,ps.posname)) posname, " +
                " ana.notice_no , ana.inform_name ,asw.warrant_no, asi.track_no confirm_no,aa.application_notice_arrest_id,aa.application_search_warrant_id," +
                " aa.application_sincere_confirm_id, nvl(aa.report_to_staff,tir.title_name || str.first_name || ' ' || str.last_name) report_to_staff,  " +
                " tio.title_name || sto.first_name || ' ' || sto.last_name order_by_staff, pke_compare.chkCaseLast(aa.track_no) chkCaseLast, " +
                " aa.behaviour, aa.testimony,  aa.owner_name,aa.business_name,aa.surety_name, aa.leader_position, aa.guilty, aa.duty, aa.director_position, " +
                " to_char(aa.arrest_report_date,'dd/mm/yyyy', 'NLS_CALENDAR=''THAI BUDDHA'' NLS_DATE_LANGUAGE=THAI') arrest_report_date, " +
                " aa.administration, to_char(aa.finished_time,'HH24:mi') finished_time, ed.indc_off " +
                "from application_arrest aa " +
                " left join v_accuser_list_popup sta on sta.idcard_no=aa.accuser_idcardno  " +
                "left join title tia on tia.title_code=sta.title_code " +
                "left join staff str on str.idcard_no=to_char(aa.report_to) " +
                "left join title tir on tir.title_code=str.title_code " +
                "left join staff sto on sto.idcard_no=to_char(aa.order_by) " +
                "left join title tio on tio.title_code=sto.title_code " +
                "inner join legislation lg on lg.id=aa.legislation_id " +
                "inner join duty_group dg on dg.group_id=aa.product_group_id " +
                "inner join province pv on pv.province_code=aa.scene_province " +
                "left join district d on d.district_code=aa.scene_district " +
                "left join subdistrict sd on sd.subdistrict_code=aa.scene_subdistrict " +
                "inner join ed_office ed on ed.offcode=aa.offcode " +
                "left join ed_office eda on eda.offcode=aa.accuser_offcode " +
                "left join position ps on ps.poscode=aa.accuser_poscode " +
                "left join application_notice_arrest ana on ana.id=aa.application_notice_arrest_id " +
                "left join application_search_warrant asw on asw.id=aa.application_search_warrant_id " +
                "left join application_sincere_confirm asi on asi.id=aa.application_sincere_confirm_id " +
                "where aa.del_flag='N' and aa.id =  ? ";
        String alisql;
        String aaesql;
        String aalsql;
        String incsql;
        String aatsql;
        
        ApplicationArrest aa = new ApplicationArrest(db);

        Long id = new Long(request.getParameter("id"));
        
        log.debug(sql + "## ID :"+id.toString());
        
        List<Map<String, Object>> aad = aa.findBySql(sql, id);

        alisql = "select ali.id, ali.offcode, ali.license_no, ali.book_no," +
                " ali.establishment_name, ali.entrepreneur, " +
                "ali.license_type, ali.iswithdraw, ed.offname, lt.licensetype_name" +
                " from application_arrest_license ali " +
                "inner join ed_office ed on ed.offcode=ali.offcode " +
                "inner join LICENSE_TYPE lt on lt.id = ali.license_type " +
                "where ali.track_no = ?" +
                " order by ali.id";

        aaesql = "select aae.id, aae.TRACK_NO , aae.ISEXHIBITCO, aae.PRODUCT_CODE," + "\n" +
                " aae.BRAND_CODE, aae.ISDOMESTIC, aae.SIZES_CODE," + "\n" +
                " aae.SIZE_UNIT_CODE, nvl(aae.sizes_unit_name,nvl(su.thname,su.enname)) size_unit_name, " + "\n" +
                " aae.QTY, aae.qty_unit_code, nvl(aae.qty_unit_name,nvl(qu.thname,qu.enname)) qty_unit_name, " + "\n" +
                " aae.NETWEIGHT, aae.NETWEIGHT_UNIT_CODE, nvl(aae.netweight_unit_name,nvl(wu.thname, wu.enname)) netweight_unit_name, " + "\n" +
                " aae.STATUS, aae.EXHIBIT_LIST, aae.EXHIBIT_DESC, " + "\n" +
                " aae.CAR_NO, aae.APPLICATION_ARREST_EXHIBIT_ID co_id, aae.DUTY_CODE, aae.REMARKS," + "\n" +
                " aae.CREATE_BY, aae.CREATE_ON, aae.UPDATE_BY, aae.UPDATE_ON, " + "\n" 
                + " replace(nvl(aae.brand_name,  nvl(b.brand_main_thai, b.brand_main_eng)),'" + Character.toString('"') + "','" + "\\" + "\"" + "') brand_name," + "\n" +
                " nvl(aae.duty_name,dt.duty_name) duty_name, nvl(aae.sizes_desc,sp.size_desc) size_desc, bi.case_id, " + "\n" +
                " nvl(aae.product_name, p.product_name) product_name, aae.group_id, nvl(aae.group_name,dg.group_name) group_name" + "\n" +
                " from APPLICATION_ARREST_EXHIBIT aae " + "\n" +
                " left join unit su on su.unit_code = aae.size_unit_code " + "\n" +
                " left join unit qu on qu.unit_code = aae.qty_unit_code " + "\n" +
                " left join unit wu on wu.unit_code = aae.netweight_unit_code " + "\n" +
                " left join brand_main b on b.group_id = aae.group_id and b.brand_main_code =aae.brand_code" + "\n" +
                " left join product p on p.product_code = aae.product_code" + "\n" +
                " left join size_package sp on sp.group_id = aae.group_id and sp.size_code = aae.sizes_code" + "\n" +
                " left join application_arrest_exhibit aeco on aeco.id=aae.application_arrest_exhibit_id \n" +
                " left join book_impeachment bi on bi.track_no = aeco.track_no" + "\n" +
                " left join DUTY_TABLE dt on dt.duty_code=aae.duty_code" + "\n" +
                " left join duty_group dg on dg.group_id=aae.group_id \n" + 
                " where aae.track_no = ? " + "\n" +
                " order by aae.id";
        //log.debug(aaesql);

        aalsql = "SELECT aal.ID, aal.TRACK_NO, aal.LAWBREAKER_NO,  aal.CULPRIT_TYPE, aal.LAWBREAKER_ID_CARD," +
                " aal.LAWBREAKER_PASSPORT,   aal.FIRST_NAME, aal.MIDDLE_NAME, aal.LAST_NAME,   aal.ADDRESS_NO," +
                " aal.SOI, aal.ROAD,   aal.MOO, aal.SUBDISTRICT, aal.DISTRICT,   aal.PROVINCE, " +
                " aal.NATIONALITY_ID, aal.RACE_ID,   aal.CAREER, aal.AGE, aal.FATHER_NAME,  " +
                " aal.MOTHER_NAME, aal.PAID_TIME_OFF, aal.INVCODE,   aal.FINE, aal.BOOK_NO, aal.INV_NO, " +
                "  aal.ISCANCEL, aal.CANCEL_DATE, aal.CANCEL_BY,   aal.CREATE_BY, aal.CREATE_ON, aal.UPDATE_BY,  " +
                " aal.UPDATE_ON, aal.TITLE_CODE, aal.SEX,    aal.OTHER_NAME, aal.EXCISE_REG_NO,  " +
                " to_char(aal.birth_date, 'dd/mm/yyyy', 'NLS_CALENDAR=''THAI BUDDHA'' NLS_DATE_LANGUAGE=THAI')  birth_date, " +
                " aal.CORPORATION_CODE, aal.COMPANY_TITLE_CODE, aal.COMPANY_NAME,   aal.PAPER_NO, aal.ISMISTAKE," +
                " aal.ISMISTAKE_DESC,  p.province_name ,d.district_name, st.subdistrict_name,  tl.title_name," +
                " r.race_name race_id_name,n.nation_name nationality_id_name " +
                " FROM APPLICATION_ARREST_LAWBREAKER aal " +
                " left join province p on p.province_code = aal.province " +
                " left join district d on d.district_code = aal.district " +
                " left join subdistrict st on st.subdistrict_code = aal.subdistrict " +
                " left join title tl on tl.title_code = aal.title_code" +
                " left join race r on r.id = aal.race_id" +
                " left join nationality n on n.id = aal.NATIONALITY_ID" +
                " where aal.track_no = ? " +
                " order by aal.id ";
        //log.debug(aalsql);

        incsql = " SELECT aai.ID, aai.CREATE_BY, aai.CREATE_ON, aai.UPDATE_BY, aai.TRACK_NO, " +
                " aai.INDICTMENT_ID, aai.EXHIBIT_WILD," +
                " inc.case_law_id, inc.penalty_case_law_id, replace(inc.guilt_base,'" + Character.toString('"') + "','" + "\\" + "\"" + "') guilt_base" +
                " FROM APPLICATION_ARREST_INDICTMENT aai" +
                " left join indictment inc on inc.indictment_id = aai.indictment_id " +
                " where aai.track_no = ? " +
                " order by aai.id";
        //log.debug(incsql);
        
        aatsql = " SELECT aat.ID, aat.CREATE_BY, aat.CREATE_ON,  aat.UPDATE_BY, aat.UPDATE_ON, aat.TRACK_NO,    aat.STAFF_NO, aat.INSPECTOR_CODE, aat.STAFF_POSITION, "
                + " aat.DUTY_STATUS_ID, aat.STAFF_IDCARDNO, aat.STAFF_POSCODE,    aat.STAFF_OFFCODE, st.title_code,st.first_name,st.last_name,t.title_name,    "
                + " aat.staff_offcode offcode, nvl(ed.offname,st.dept_name) offname , nvl(aat.staff_position,nvl(st.pos_name,  ps.posname)) posname "
                + " FROM APPLICATION_ARREST_TEAM aat  "
                + " left join v_accuser_list_popup st on st.idcard_no = aat.STAFF_IDCARDNO  "
                + " left join title t on t.title_code = st.title_code  "
                + " left join ed_office ed on ed.offcode = aat.staff_offcode "
                + " left join position ps on ps.poscode = aat.STAFF_POSCODE "
                + " where aat.track_no = ? " 
                + " order by aat.id ";
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
        request.setAttribute("track_gen", aad.get(0).get("track_no"));
        request.setAttribute("aalsize", aallist.size());
        request.setAttribute("db", aad.get(0));
        request.setAttribute("accuserType",(aad.get(0).get("accuser_type") != null ? aad.get(0).get("accuser_type").toString() : ""));
        
        request.setAttribute("offcode", (aad.get(0).get("offcode") != null ? aad.get(0).get("offcode").toString() : ""));
        request.setAttribute("offname", (aad.get(0).get("area_offname") != null ? aad.get(0).get("area_offname").toString() : ""));
        request.setAttribute("department_code", (aad.get(0).get("department_id")!=null ? aad.get(0).get("department_id").toString() : ""));
        request.setAttribute("department_name", (aad.get(0).get("department_name") != null ? aad.get(0).get("department_name").toString() : ""));
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

    public void pre(HttpServletRequest request, HttpServletResponse response) throws Exception {
        
    	Legislation lt = new Legislation(db);
        List<Legislation> ltlist = lt.findByWhere(" 1=1 order by legislation_name", null);
        
        DutyStatu ds = new DutyStatu(db);
        List<DutyStatu> dslist = ds.findByWhere(" id not in(1,2)", null);
        request.setAttribute("dslist", dslist);
        request.setAttribute("ltlist", ltlist);
        if (uData.IsAdmin()==true)
        	request.setAttribute("IsAdmin","1");
        
    }

    public void _default(HttpServletRequest request,
                         HttpServletResponse response) throws Exception {
        // TODO Auto-generated method stub
        //log.debug("Done");
    	if(uData.chkUserMenu(menuID)==true){
	        pre(request, response);
	        
	        //System.out.println("Log System.out.println");
	        //log.debug("Log log.debug");
	        
	        request.setAttribute("offcode", uData.getOffcode());
	        request.setAttribute("offname", uData.getShortName());
	        forward("?page=/Protect/arrest_search.jsp", request, response);
    	}else{
    		HttpSession session = request.getSession();
  		  	session.invalidate();
  		  	request.setAttribute("errMsg", "ผู้ใช้ไม่มีสิทธิ์ดำเนินการ");
  		  	forward("?page=/login.jsp", request, response);
  		  
    	}
    }

    public void findArrest(HttpServletRequest request, HttpServletResponse response) throws Exception {

        forward("process?action=Arrest", request, response);
    }

    public void add(HttpServletRequest request, HttpServletResponse response) throws Exception {
        request.setAttribute("action", "process?action=Arrest&cmd=add");
        this.writeTranLog("เพิ่มบันทึกการจับกุม");
        String tno = "";
        request.setAttribute("track_gen", "NEW");
        pre(request, response);

    	//System.out.println("EdOffice No Service");
        EdOffice ed = new EdOffice(db);
        String edSql="";
        if(uData.getAccuserType().equals(Constants.ACCUSER_TYPE_XCS)){
        	//ถ้าเป็นเจ้าหน้าที่ของส่วนกลาง (ส่วนคดี) ให้แสดงข้อมูลภาค 10 ให้เลือก
        	edSql = "select offcode, short_name from ed_office where substr(offcode,1,2) = '10' and indc_off = 'E' order by offname ";
        }else{
        	edSql = "select offcode, short_name from ed_office order by offname ";
        }
        
        
        List<Map<String,Object>> edlist = ed.findBySql(edSql);
        //log.debug(edSql);
        request.setAttribute("edlist", edlist);
        
        String vOffcode=uData.getOffcode();
        String vOffname=uData.getShortName();
        
        request.setAttribute("offcode", vOffcode);
        request.setAttribute("offname", vOffname);
        request.setAttribute("department_code", vOffcode);
        request.setAttribute("department_name", vOffname);
        request.setAttribute("accuserType",uData.getAccuserType());
        request.setAttribute("accuser_idcardno", uData.getIdCard());
        request.setAttribute("accuser_name", uData.getFullName());
        request.setAttribute("accuser_poscode", uData.getPoscode());
        request.setAttribute("accuser_posname", uData.getPosname());
        request.setAttribute("accuser_offcode", vOffcode);
        request.setAttribute("accuser_offname", vOffname);
        
        //  pke_arrest(aal.id);
        forward("?page=/Protect/arrest_form.jsp", request, response);
    }

    public void create(HttpServletRequest request, HttpServletResponse response) throws Exception {
    	HttpSession session = request.getSession();
    	session.setAttribute("ResponseTime", System.currentTimeMillis());
    	
    	ApplicationArrest aa = new ApplicationArrest(db);
        setArrestData(request,aa);
       
        aa.setCreate_by(uData.getIdCard());
        aa.setCreate_on(create_on);
        aa.setTrack_no(new RunningKey(db).getRunningKey("APPLICATION_ARREST", "", "", request.getParameter("offcode")));
        aa = aa.create();
        
        //uplist(request, response, aa);
        saveApplicationArrestLicense(request,response, aa);
        saveApplicationArrestTeam(request,response,aa);
        saveApplicationArrestLawbreaker(request,response,aa);
        saveApplicationArrestIndictment(request, response, aa);
        saveApplicationArrestExhibit(request, response, aa);
        
        ApplicationArrestProve aap = new ApplicationArrestProve(db);
        aap.setTrack_no(aa.getTrack_no());
        aap.setCreate_by(new Long(create_by));
        aap.setCreate_on(new Date());
        aap = aap.create();
        
        if (aa.getApplication_notice_arrest_id() != null){
        	ApplicationNoticeArrest ana = new ApplicationNoticeArrest(db);
        	ana = ana.findByPk(aa.getApplication_notice_arrest_id());
        	ana.setNotice_result("2");
        	ana.setUpdate_by(update_by);
        	ana.setUpdate_on(update_on);
        	ana = ana.update();
        }
        
        //Update รายละเอียดของกลางสำหรับใช้แสดงในรายงาน 2/55
        ReportsUtil.UpdateCubeReport2_55(aa.getTrack_no(), uData.getUsername());
        
        this.writeTranLog("เพิ่มข้อมูลบันทึกการจับกุม เลขที่งาน " + aa.getTrack_no());
        redirect("process?action=Arrest&id=" + aa.getId() + "&cmd=showupdate&SaveMSG=1", request, response);
    }

    public void list(HttpServletRequest request, HttpServletResponse response) throws Exception {
        this.writeTranLog("ค้นหาบันทึกการจับกุม");
        
        ApplicationSincereConfirm aad = new ApplicationSincereConfirm(db);
        String sql = "";
        String slsql;
        String countsql;
        ApplicationArrest maxid = new ApplicationArrest(db);

        countsql = "select count(distinct aa.id)" +
                "from application_arrest aa " +
                "left join application_arrest_indictment aai on aa.track_no=aai.track_no " +
                "left join indictment inc on inc.indictment_id=aai.indictment_id " +
                "left join application_arrest_lawbreaker aal on aa.track_no=aal.track_no " +
                "left join lawbreaker lb on lb.lawbreaker_no=aal.lawbreaker_no " +
                "left join title tt on tt.title_code=aal.title_code " +
                "left join title tc on tc.title_code=aal.company_title_code " +
                "left join book_impeachment bi on aa.track_no=bi.track_no " +
                "left join v_accuser_list_popup sta on sta.idcard_no=aa.accuser_idcardno " +
                "left join title tia on tia.title_code=sta.title_code " +
                "left join application_arrest_exhibit aae on aa.track_no=aae.track_no " +
                "left join duty_table dt on dt.duty_code=aae.duty_code " +
                "inner join legislation lg on lg.id=aa.legislation_id " +
                "inner join duty_group dg on dg.group_id=aa.product_group_id " +
                "inner join province pv on pv.province_code=aa.scene_province " +
                "left join district d on d.district_code=aa.scene_district " +
                "left join subdistrict sd on sd.subdistrict_code=aa.scene_subdistrict " +
                "left join compare_case cc on cc.track_no=aa.track_no " +
                "left join application_arrest_prove aap on aa.track_no=aap.track_no " +
                "inner join ed_office ed on ed.offcode=aa.offcode " +
                "left join application_arrest_license ali on aa.track_no=ali.track_no " +
                "left join application_notice_arrest ana on ana.id=aa.application_notice_arrest_id " +
                "left join application_search_warrant asw on asw.id=aa.application_search_warrant_id " +
                "left join application_sincere_confirm asi on asi.id=aa.application_sincere_confirm_id " +
                "where aa.del_flag='N' ";
        
        slsql = "select distinct aa.id, aa.track_no," +
                " pke_arrest.getArrestIndictment(aa.track_no) guilt_base, " +
                " pke_arrest.getArrestLawbreaker(aa.track_no) lawbreaker_name, " +
                " aa.occurrence_date, to_char(aa.occurrence_date, 'dd/mm/yyyy', 'NLS_CALENDAR=''THAI BUDDHA'' NLS_DATE_LANGUAGE=THAI') occurrence_date2, " +
                " bi.case_date, to_char(bi.case_date, 'dd/mm/yyyy', 'NLS_CALENDAR=''THAI BUDDHA'' NLS_DATE_LANGUAGE=THAI') case_date2, " +
                "aa.application_date, to_char(aa.application_date, 'dd/mm/yyyy', 'NLS_CALENDAR=''THAI BUDDHA'' NLS_DATE_LANGUAGE=THAI')  application_date2, " +
                "bi.case_id, tia.title_name || sta.first_name || ' ' || sta.last_name accuser_name, aa.legislation_id, lg.legislation_name, " +
                "aa.product_group_id, dg.group_name product_group_name, cc.compare_case_no, aap.exhibit_report_no, " +
                "aa.offcode, ed.offname, " + 
                "pke_compare.getCaseStatus(aa.track_no,'0') case_status_code, pke_compare.getCaseStatus(aa.track_no,'1') case_status_name, " +
                "pke_compare.getCompareStatus(aa.track_no,'0') compare_status_code, pke_compare.getCompareStatus(aa.track_no,'1') compare_status_name, " +
                "pke_master.fn_show_address(sd.subdistrict_code, d.district_code, pv.province_code,'Y') scene_address " +
                "from application_arrest aa " +
                "left join application_arrest_indictment aai on aa.track_no=aai.track_no " +
                "left join indictment inc on inc.indictment_id=aai.indictment_id " +
                "left join application_arrest_lawbreaker aal on aa.track_no=aal.track_no " +
                "left join lawbreaker lb on lb.lawbreaker_no=aal.lawbreaker_no " +
                "left join title tt on tt.title_code=aal.title_code " +
                "left join title tc on tc.title_code=aal.company_title_code " +
                "left join book_impeachment bi on aa.track_no=bi.track_no " +
                "left join v_accuser_list_popup sta on sta.idcard_no=aa.accuser_idcardno " +
                "left join title tia on tia.title_code=sta.title_code " +
                "left join application_arrest_exhibit aae on aa.track_no=aae.track_no " +
                "left join duty_table dt on dt.duty_code=aae.duty_code " +
                "inner join legislation lg on lg.id=aa.legislation_id " +
                "inner join duty_group dg on dg.group_id=aa.product_group_id " +
                "inner join province pv on pv.province_code=aa.scene_province " +
                "left join district d on d.district_code=aa.scene_district " +
                "left join subdistrict sd on sd.subdistrict_code=aa.scene_subdistrict " +
                "left join compare_case cc on cc.track_no=aa.track_no " +
                "left join application_arrest_prove aap on aa.track_no=aap.track_no " +
                "inner join ed_office ed on ed.offcode=aa.offcode " +
                "left join application_arrest_license ali on aa.track_no=ali.track_no " +
                "left join application_notice_arrest ana on ana.id=aa.application_notice_arrest_id " +
                "left join application_search_warrant asw on asw.id=aa.application_search_warrant_id " +
                "left join application_sincere_confirm asi on asi.id=aa.application_sincere_confirm_id " +
                "where aa.del_flag='N' ";
        
        pre(request, response);
        
        String whText = "";
        com.ko.webapp.util.ArrestUtil whTxt = new com.ko.webapp.util.ArrestUtil();
        whText += whTxt.getArrestWhere(request);
        
        Integer totalRow = aad.countBySql(countsql + whText, null);
        pageUtil.setTotalRow(totalRow);
        pageUtil.setPageSize(20);
        
        //log.debug(slsql + whText);
        List<Map<String, Object>> dblist = aad.findBySql(slsql + whText + " order by aa.track_no desc ", null, pageUtil);
        List<Map<String, Object>> aamax = maxid.findBySql("select max(id) max from application_arrest", null);
        request.setAttribute("aamax", aamax.get(0));
        request.setAttribute("dblist", dblist);
        request.setAttribute("offcode", request.getParameter("offcode"));
        request.setAttribute("offname", request.getParameter("offname"));
        
        forward("?page=/Protect/arrest_search.jsp", request, response);
    } 
    
    public void showupdate(HttpServletRequest request, HttpServletResponse response) throws Exception {
    	
    	String id = "";
    	if(request.getParameter("id") == null)
    		id = request.getAttribute("id").toString();
    	else
    		id = request.getParameter("id");
    	
    	if(request.getParameter("SaveMSG") != null)
    		request.setAttribute("SaveMSG", "1");
    	
        request.setAttribute("action", "process?action=Arrest&cmd=showupdate&id=" + id);
        this.writeTranLog("แสดงรายละเอียดบันทึกการจับกุม");
        preup(request, response);
        pre(request, response);

        EdOffice ed = new EdOffice(db);
        String edSql = "select offcode, short_name from ed_office order by offname ";
        List<Map<String,Object>> edlist = ed.findBySql(edSql);
        request.setAttribute("edlist", edlist);
        request.setAttribute("IsEditArrest", "Y");
        
        long ConfigID = new Long(ConfigUtil.getConfig("ILL00010"));
        if(uData.chkUserRole(ConfigID))
        	request.setAttribute("IsEditIndictment", "Y");
        
        forward("?page=/Protect/updatearrest_form.jsp", request, response);
    }
    
    public void update(HttpServletRequest request, HttpServletResponse response) throws Exception {
        Long id = new Long(request.getParameter("id"));
        ApplicationArrest aa = new ApplicationArrest(db);
        aa = aa.findByPk(id);
        
        setArrestData(request,aa);
        aa.setUpdate_by(uData.getIdCard());
        aa.setUpdate_on(new Date());
        aa = aa.update();

        //uplist(request, response, aa);
        saveApplicationArrestLicense(request,response, aa);
        saveApplicationArrestTeam(request,response,aa);
        saveApplicationArrestLawbreaker(request,response,aa);
        saveApplicationArrestIndictment(request, response, aa);
        saveApplicationArrestExhibit(request, response, aa);
        
        if (aa.getApplication_notice_arrest_id() != null){
        	ApplicationNoticeArrest ana = new ApplicationNoticeArrest(db);
        	ana = ana.findByPk(aa.getApplication_notice_arrest_id());
        	ana.setNotice_result("2");
        	ana.setUpdate_by(update_by);
        	ana.setUpdate_on(update_on);
        	ana = ana.update();
        }
        //Update รายละเอียดของกลางสำหรับใช้แสดงในรายงาน 2/55
        ReportsUtil.UpdateCubeReport2_55(aa.getTrack_no(), uData.getUsername());
        
        this.writeTranLog("บันทึกข้อมูลบันทึกการจับกุม");
        
        //เก็บ Log กรณีมีการแก้ไขข้อมูล 2/39 ซึ่งมาจากคดีที่ชำระเงินค่าปรับไปแล้ว
        String ChkCaseLast = request.getParameter("chkcaselast");
		long ConfigID = new Long(ConfigUtil.getConfig("ILL00010"));
		if(ChkCaseLast.equals("Y") && uData.chkUserRole(ConfigID)==true){
			this.writeTranLog("ILL00010: " + "แก้ไขข้อมูลข้อกล่าวหาหรือรายการของกลางใน 2/39 กรณีที่ออกใบเสร็จรับเงินไปแล้วเลขที่งาน " + aa.getTrack_no());
		}
        
        request.setAttribute("SaveMSG", "1");
        request.setAttribute("id", id);
        showupdate(request,response);
    }

    public void del(HttpServletRequest request, HttpServletResponse response) throws Exception {
        this.writeTranLog("ลบบันทึกการจับกุม");
        Long id = new Long(request.getParameter("id"));
        ApplicationArrest aa = new ApplicationArrest(db);
        aa = aa.findByPk(id);
        aa.setDel_flag("Y");
        aa.update();
        aa.setId(id);
        forward("?page=/Protect/arrest_search.jsp", request, response);
    }
    
    private void setArrestData(HttpServletRequest request, ApplicationArrest aa) throws Exception{
    	String tno = "";
        Date date = new Date();
        int day = date.getDate();
        int mon = date.getMonth();
        int year = date.getYear();
        int ho = date.getHours();
        int mi = date.getMinutes();
        int sec = date.getSeconds();
        tno = "" + year + "" + mon + "" + day + "" + ho + "" + mi + "" + sec + "";
        aa.setAccuser_idcardno(request.getParameter("accuser_idcardno").trim());
        aa.setAccuser_offcode(request.getParameter("accuser_offcode").trim());
        aa.setAccuser_poscode(request.getParameter("accuser_poscode").trim());
        aa.setAccuser_type(request.getParameter("accuserType").trim());
        aa.setAlleged_co(request.getParameter("alleged_co") != null ? request.getParameter("alleged_co") : "N");
        aa.setApplication_notice_arrest_id(!request.getParameter("application_notice_arrest_id").trim().equals("") ? new Long(request.getParameter("application_notice_arrest_id")) : null);
        aa.setApplication_search_warrant_id(!request.getParameter("application_search_warrant_id").trim().equals("") ? new Long(request.getParameter("application_search_warrant_id")) : null);
        aa.setApplication_sincere_confirm_id(!request.getParameter("application_sincere_confirm_id").trim().equals("") ? new Long(request.getParameter("application_sincere_confirm_id")) : null);

        if (request.getParameter("application_date").equals("") == false) {
            aa.setApplication_date(DateUtil.getDateFromString(request.getParameter("application_date")));
        }
        if (request.getParameter("arrest_report_date").equals("") == false) {
            aa.setArrest_report_date(DateUtil.getDateFromString(request.getParameter("arrest_report_date")));
        }
        aa.setBehaviour(request.getParameter("behaviour"));
        aa.setBusiness_name(request.getParameter("business_name"));
        aa.setCoordinate_x(!request.getParameter("coordinate_x").equals("") ? Double.parseDouble(request.getParameter("coordinate_x")) : null);
        aa.setCoordinate_y(!request.getParameter("coordinate_y").equals("") ? Double.parseDouble(request.getParameter("coordinate_y")) : null);
        aa.setDel_flag("N");
        aa.setReport_to(!request.getParameter("report_to").equals("") ? Long.parseLong(request.getParameter("report_to")) : null);
        aa.setOrder_by(!request.getParameter("order_by").equals("") ? Long.parseLong(request.getParameter("order_by")) : null);
        aa.setDepartment_id(!request.getParameter("department_code").equals("") ? request.getParameter("department_code") : null);
        aa.setDepartment_name(request.getParameter("department_name"));
        aa.setDirector_position(request.getParameter("director_position"));
        aa.setDuty(request.getParameter("duty"));
        aa.setAdministration(request.getParameter("administration"));
        aa.setEstimate_fine(request.getParameter("estimate_fine") != null && !request.getParameter("estimate_fine").equals("")  ? Double.parseDouble(request.getParameter("estimate_fine")) : null);
        
        try {
        	SimpleDateFormat formatter = new SimpleDateFormat("dd/mm/yyyy"); //please notice the capital M
            String ftime;
            ftime = request.getParameter("finished_time");
            formatter = new SimpleDateFormat("mm:ss");
            ftime = "00/00/0000 " + ftime;
            date = DateUtil.getDateFromString(ftime);
            aa.setFinished_time(date);
        } catch (Exception e) {
            // TODO: handle exception
        }
        if (request.getParameter("guilty") != null) {
            aa.setGuilty("Y");
        } else {
            aa.setGuilty("N");
        }
        if (request.getParameter("have_culprit") != null) {
            aa.setHave_culprit(request.getParameter("have_culprit"));
        }
        if (request.getParameter("issentcourt") != null) {
            aa.setIssentcourt(request.getParameter("issentcourt"));
        } else {
            aa.setIssentcourt("N");
        }

        aa.setLawbreak_type(request.getParameter("lawbreakertype"));
        aa.setLeader_position(request.getParameter("leader_position"));
        aa.setLegislation_id(Long.parseLong(request.getParameter("legislation_id")));
        
        String occ;
        occ = request.getParameter("occurrence_date");
        occ += " " + request.getParameter("occurrence_time") + ":00";

        Date mmm = DateUtil.getDateFromString(occ);
        aa.setOccurrence_date(mmm);

        aa.setOffcode(request.getParameter("offcode").trim());
        aa.setOwner_name(request.getParameter("owner_name"));
        aa.setPolice_station(request.getParameter("police_station"));
        aa.setProduct_group_id(request.getParameter("product_group_id"));
        aa.setScene_district(request.getParameter("district"));
        aa.setScene_moo(request.getParameter("scene_moo"));
        aa.setScene_name(request.getParameter("scene_name"));
        aa.setScene_no(request.getParameter("scene_no"));
        aa.setScene_province(request.getParameter("scene_province"));
        aa.setScene_road(request.getParameter("scene_road"));
        aa.setScene_soi(request.getParameter("scene_soi"));
        aa.setScene_subdistrict(request.getParameter("tambol"));
        aa.setSurety_name(request.getParameter("surety_name"));
        aa.setTestimony(request.getParameter("testimony"));
        
        Staff st = new Staff(db);
        List<Staff> stList = st.findByWhere("idcard_no = '" + aa.getAccuser_idcardno() + "'", null);
        if (stList.size()>0){
        	if(stList.get(0).getBirthdate() != null){
	        	int birthYear = stList.get(0).getBirthdate().getYear();
	        	int nowDate = new Date().getYear();
	        	aa.setAccuser_age(new Long(nowDate-birthYear));
        	}
        }
    }

    public void cop(HttpServletRequest request, HttpServletResponse response) throws Exception {
        this.writeTranLog("คัดลอกบันทึกการจับกุม");
        Long id = new Long(request.getParameter("id"));
        Long maxid = new Long(request.getParameter("maxid"));
        ApplicationArrest aa = new ApplicationArrest(db);
        ApplicationArrestExhibit aax = new ApplicationArrestExhibit(db);
        ApplicationArrestIndictment aai = new ApplicationArrestIndictment(db);
        ApplicationArrestLawbreaker aal = new ApplicationArrestLawbreaker(db);
        ApplicationArrestLicense aali = new ApplicationArrestLicense(db);
        ApplicationArrestProve aap = new ApplicationArrestProve(db);
        ApplicationArrestTeam aat = new ApplicationArrestTeam(db);
        ApplicationArrest newaa = new ApplicationArrest(db);

        newaa = aa.findByPk(id);
        aa = newaa;

        List<ApplicationArrestExhibit> lnewaax = aax.findByWhere("track_no = ?", aa.getTrack_no());
        List<ApplicationArrestIndictment> lnewaai = aai.findByWhere("track_no = ?", aa.getTrack_no());
        List<ApplicationArrestLawbreaker> lnewaal = aal.findByWhere("track_no = ?", aa.getTrack_no());
        List<ApplicationArrestLicense> lnewaali = aali.findByWhere("track_no = ?", aa.getTrack_no());
        List<ApplicationArrestProve> lnewaap = aap.findByWhere("track_no = ?", aa.getTrack_no());
        List<ApplicationArrestTeam> lnewaat = aat.findByWhere("track_no = ?", aa.getTrack_no());
        String tno = "";

        tno = new RunningKey(db).getRunningKey("APPLICATION_ARREST", "", "", request.getParameter("offcode"));
        maxid++;
        newaa.setTrack_no(tno);
        newaa = newaa.create();

        //Application_Arrest_Exhibit
        for (int i = 0; i < lnewaax.size(); i++) {
            ApplicationArrestExhibit newaax = new ApplicationArrestExhibit(db);

            newaax = lnewaax.get(i);
            newaax.setTrack_no(tno);
            newaax.create();
        }
        
        //Application_Arrest_Indictment
        for (int i = 0; i < lnewaai.size(); i++) {
            ApplicationArrestIndictment newaai = new ApplicationArrestIndictment(db);

            newaai = lnewaai.get(i);
            newaai.setTrack_no(tno);
            newaai.create();
        }
        
        //Application_Arrest_Lawbreaker
        for (int i = 0; i < lnewaal.size(); i++) {
            ApplicationArrestLawbreaker newaal = new ApplicationArrestLawbreaker(db);

            newaal = lnewaal.get(i);
            newaal.setTrack_no(tno);
            newaal.create();
        }
        
        //Application_Arrest_License
        for (int i = 0; i < lnewaali.size(); i++) {
            ApplicationArrestLicense newaali = new ApplicationArrestLicense(db);

            newaali = lnewaali.get(i);
            newaali.setTrack_no(tno);
            newaali.create();
        }
        
        //Application_Arrest_Prove
        for (int i = 0; i < lnewaap.size(); i++) {
            ApplicationArrestProve newaap = new ApplicationArrestProve(db);
            //newaap = lnewaap.get(i);
            newaap.setTrack_no(tno);
            newaap.setCreate_by(new Long(create_by));
            newaap.setCreate_on(new Date());
            newaap.create();
        }
        
        //Application_Arrest_Team
        for (int i = 0; i < lnewaat.size(); i++) {
            ApplicationArrestTeam newaat = new ApplicationArrestTeam(db);

            newaat = lnewaat.get(i);
            newaat.setTrack_no(tno);
            newaat.create();
        }

        maxid++;

        aa = aa.findByWhere("track_no = ?", tno).get(0);
        id = aa.getId();
        redirect("process?action=Arrest&id=" + id + "&cmd=showupdate");
    }

    public boolean isNumeric(String s) {
        try {
            //return s.matches("[-+]?\\d*\\.?\\d+");
        	return s.matches("-?\\d+(.\\d+)?");
        } catch (Exception e) {
            return false;
        }

    }
    
    
    private void saveApplicationArrestLicense(HttpServletRequest request, HttpServletResponse response, ApplicationArrest aa) throws Exception {
    	ApplicationArrestLicense cali = new ApplicationArrestLicense(db);
    	cali.deleteByWhere("track_no = ? ", aa.getTrack_no());
    	
    	String[] ali_book_nolist = request.getParameterValues("ali_book_no");
        String[] ali_entrepreneurlist = request.getParameterValues("ali_entrepreneur");
        String[] ali_establishment_namelist = request.getParameterValues("ali_establishment_name");
        String[] ali_iswithdrawlist = request.getParameterValues("ali_iswithdraw");
        String[] ali_license_nolist = request.getParameterValues("ali_license_no");
        String[] ali_license_typelist = request.getParameterValues("ali_license_type");
        String[] ali_offcodelist = request.getParameterValues("ali_offcode");
        String[] ali_idlist = request.getParameterValues("ali_id");
        
        if(ali_offcodelist != null){
	        for (int i = 0; i < ali_offcodelist.length; i++) {
	        	cali.setBook_no(ali_book_nolist[i]);
	        	cali.setEntrepreneur(ali_entrepreneurlist[i]);
	        	cali.setEstablishment_name(ali_establishment_namelist[i]);
	        	cali.setIswithdraw(ali_iswithdrawlist[i]);
	        	cali.setLicense_no(ali_license_nolist[i]);
	        	cali.setLicense_type(Long.parseLong(ali_license_typelist[i]));
	        	cali.setOffcode(ali_offcodelist[i]);
	            cali.setTrack_no(aa.getTrack_no());
	            cali.setCreate_by(uData.getIdCard());
	            cali.setCreate_on(create_on);
	            cali.create();
	        }
        }
    }
    
    private void saveApplicationArrestIndictment(HttpServletRequest request, HttpServletResponse response, ApplicationArrest aa) throws Exception {
    	ApplicationArrestIndictment caai = new ApplicationArrestIndictment(db);
    	caai.deleteByWhere("track_no = ? ", aa.getTrack_no());

        String[] aai_id = request.getParameterValues("aai_id");
        String[] aai_indictment_id = request.getParameterValues("aai_indictment_id");
        String[] aai_exhibit_wild = request.getParameterValues("aai_exhibit_wild");
        
        if(aai_id != null){
	        for (int i = 0; i < aai_id.length; i++) {
	        	caai.setIndictment_id(Long.parseLong(aai_indictment_id[i]));
	        	caai.setTrack_no(aa.getTrack_no());
	        	caai.setExhibit_wild(aai_exhibit_wild[i]);
	        	caai.setCreate_by(uData.getIdCard());
	        	caai.setCreate_on(create_on);
	        	caai.create();
	        }
        }
    }
    
    private void saveApplicationArrestTeam(HttpServletRequest request, HttpServletResponse response, ApplicationArrest aa) throws Exception {
    	ApplicationArrestTeam caat = new ApplicationArrestTeam(db);
    	caat.deleteByWhere("track_no = ? ", aa.getTrack_no());
        
        String[] aat_id = request.getParameterValues("aat_id");
        String[] aat_duty_status_id = request.getParameterValues("aat_duty_status_id");
        String[] aat_inspector_code = request.getParameterValues("aat_inspector_code");
        String[] aat_staff_idcardno = request.getParameterValues("aat_staff_idcardno");
        String[] aat_staff_no = request.getParameterValues("aat_staff_no");
        String[] aat_staff_position = request.getParameterValues("aat_staff_position");
        String[] aat_staff_poscode = request.getParameterValues("aat_staff_poscode");
        String[] aat_staff_offcode = request.getParameterValues("aat_staff_offcode");
        
        if(aat_id != null){
	        for (int i = 0; i < aat_id.length; i++) {
	        		//log.debug("FFFFFFFFFFFFFFFFFFGGGGGGGGGGGGGG ");
	        		//System.out.println(aat_duty_status_id);
	        	if (aat_duty_status_id != null){
		        	if (aat_duty_status_id[i] != null && aat_duty_status_id[i].equals("") == false) {
		        		caat.setDuty_status_id(Long.parseLong(aat_duty_status_id[i]));
		            } else {
		            	caat.setDuty_status_id(null);
		            }
	        	}else{
	        		caat.setDuty_status_id(null);
	        	}
	
	        	caat.setInspector_code(aat_inspector_code[i]);
	        	caat.setStaff_idcardno(aat_staff_idcardno[i]);
	        	caat.setStaff_no(aat_staff_no[i]);
	        	caat.setStaff_position(aat_staff_position[i]);
	        	caat.setStaff_offcode(aat_staff_offcode[i]);
	        	caat.setStaff_poscode(aat_staff_poscode[i]);
	        	caat.setTrack_no(aa.getTrack_no());
	        	caat.setCreate_by(uData.getIdCard());
	            caat.setCreate_on(create_on);
	            caat.create();
	        }
        }
    }
    
    private void saveApplicationArrestLawbreaker(HttpServletRequest request, HttpServletResponse response, ApplicationArrest aa) throws Exception {
    	ApplicationArrestLawbreaker aal = new ApplicationArrestLawbreaker(db);
    	
    	String[] aal_id = request.getParameterValues("aal_id");
        String[] aal_culprit_type = request.getParameterValues("aal_culprit_type");
        String[] aal_lawbreaker_id_card = request.getParameterValues("aal_lawbreaker_id_card");
        String[] aal_sex = request.getParameterValues("aal_sex");
        String[] aal_title_code = request.getParameterValues("aal_title_code");
        String[] aal_first_name = request.getParameterValues("aal_first_name");
        String[] aal_last_name = request.getParameterValues("aal_last_name");
        String[] aal_other_name = request.getParameterValues("aal_other_name");
        String[] aal_address_no = request.getParameterValues("aal_address_no");
        String[] aal_moo = request.getParameterValues("aal_moo");
        String[] aal_soi = request.getParameterValues("aal_soi");
        String[] aal_road = request.getParameterValues("aal_road");
        String[] aal_province = request.getParameterValues("aal_province");
        String[] aal_district = request.getParameterValues("aal_district");
        String[] aal_subdistrict = request.getParameterValues("aal_subdistrict");
        String[] aal_race_id = request.getParameterValues("aal_race_id");
        String[] aal_nationality_id = request.getParameterValues("aal_nationality_id");
        String[] aal_career = request.getParameterValues("aal_career");
        String[] aal_birth_date = request.getParameterValues("aal_birth_date");
        String[] aal_father_name = request.getParameterValues("aal_father_name");
        String[] aal_mother_name = request.getParameterValues("aal_mother_name");
        String[] aal_lawbreaker_passport = request.getParameterValues("aal_lawbreaker_passport");
        String[] aal_middle_name = request.getParameterValues("aal_middle_name");
        String[] aal_company_title_code = request.getParameterValues("aal_company_title_code");
        String[] aal_company_name = request.getParameterValues("aal_company_name");
        String[] aal_excise_reg_no = request.getParameterValues("aal_excise_reg_no");
        String[] aal_corporation_code = request.getParameterValues("aal_corporation_code");
        String[] aal_age = request.getParameterValues("aal_age");
        String[] aal_lawbreaker_no = request.getParameterValues("aal_lawbreaker_no");

        if(aa.getHave_culprit().equals("Y")){
        	String strID = "";
	        for (int i = 0; i < aal_id.length; i++) {      	
	        	if(!aal_id[i].equals(""))
	        		aal = aal.findByPk(new Long(aal_id[i]));
	        	
	            aal.setAddress_no(aal_address_no[i]);
	            Date aaldate = DateUtil.getDateFromString(aal_birth_date[i]);
	            aal.setBirth_date(aaldate);
	            aal.setCareer(aal_career[i]);
	            if (aal_culprit_type[i] != null) {
	                if (aal_culprit_type[i].equals("") == false) {
	                    aal.setCulprit_type(Long.parseLong(aal_culprit_type[i]));
	                }
	            }
	
	            aal.setDistrict(aal_district[i]);
	            aal.setFather_name(aal_father_name[i]);
	            aal.setFirst_name(aal_first_name[i]);
	            aal.setLast_name(aal_last_name[i]);
	            aal.setLawbreaker_id_card(aal_lawbreaker_id_card[i].trim());
	            aal.setLawbreaker_passport(aal_lawbreaker_passport[i].trim());
	            aal.setMoo(!aal_moo[i].equals("") ? Long.parseLong(aal_moo[i]) : null);
	            aal.setMother_name(aal_mother_name[i]);
	            aal.setNationality_id(aal_nationality_id[i] != null && !aal_nationality_id[i].equals("") ? Long.parseLong(aal_nationality_id[i]) : null);
	            aal.setRace_id(aal_race_id[i] != null && !aal_race_id[i].equals("") ? Long.parseLong(aal_race_id[i]) : null);
	            aal.setOther_name(aal_other_name[i]);
	            aal.setProvince(aal_province[i]);
	            aal.setRoad(aal_road[i]);
	            aal.setSex(aal_sex[i]);
	            aal.setSoi(aal_soi[i]);
	            aal.setSubdistrict(aal_subdistrict[i]);
	            aal.setTitle_code(aal_title_code[i]);
	            aal.setTrack_no(aa.getTrack_no());
	            aal.setCompany_title_code(aal_company_title_code[i]);
	            aal.setExcise_reg_no(aal_excise_reg_no[i]);
	            aal.setMiddle_name(aal_middle_name[i]);
	            aal.setCompany_name(aal_company_name[i]);
	            aal.setCorporation_code(aal_corporation_code[i]);
	            aal.setAge(!aal_age[i].equals("") ? new Long(aal_age[i]) : null);
	            
	            if(!aal_lawbreaker_no[i].equals("") && !aal_lawbreaker_no[i].equals("null")){
	            	aal.setLawbreaker_no(new Long(aal_lawbreaker_no[i]));
	            }else{
		            Date dd = new Date();
		            String dat = "" + dd.getDate() + "" + dd.getMonth() + "" + dd.getYear() + "" + dd.getHours() + "" + dd.getMinutes() + "" + dd.getSeconds();
		            aal.setLawbreaker_no(new Long(dat));
	            }

	            if(!aal_id[i].equals("")){
	            	aal.setUpdate_by(uData.getIdCard());
		            aal.setUpdate_on(update_on);
		            aal = aal.update();
	            }else{
		            aal.setCreate_by(uData.getIdCard());
		            aal.setCreate_on(create_on);
		            aal = aal.create();
	            }
	            
	            if(strID.equals(""))
        			strID = aal.getId().toString();
        		else
        			strID += ", " + aal.getId().toString();
	            
	            uplaw(request, response, aal, aal_birth_date[i]);
	        }
	        //ถ้า application_arrest_lawbreaker.id ไหนที่ไม่มี ก็ให้ลบออกไปเลย
	        aal.deleteByWhere("id not in (" + strID + ") and track_no = '" + aa.getTrack_no() + "'", null);
        }else{
        	aal.deleteByWhere("track_no = ? ", aa.getTrack_no());
        }
    }
    
    private void saveApplicationArrestExhibit(HttpServletRequest request, HttpServletResponse response, ApplicationArrest aa) throws Exception {
    	ApplicationArrestExhibit caae = new ApplicationArrestExhibit(db);
        caae.deleteByWhere("track_no = ?", aa.getTrack_no());

        String[] aae_isexhibitco = request.getParameterValues("aae_isexhibitco");
        String[] aae_duty_code = request.getParameterValues("aae_duty_code");
        String[] aae_duty_name = request.getParameterValues("aae_duty_name");
        String[] aae_product_code = request.getParameterValues("aae_product_code");
        String[] aae_product_name = request.getParameterValues("aae_product_name");
        String[] aae_brand_code = request.getParameterValues("aae_brand_code");
        String[] aae_brand_name = request.getParameterValues("aae_brand_name");
        String[] aae_isdomestic = request.getParameterValues("aae_isdomestic");
        String[] aae_sizes_code = request.getParameterValues("aae_sizes_code");
        String[] aae_sizes_unit_code = request.getParameterValues("aae_sizes_unit_code");
        String[] aae_qty = request.getParameterValues("aae_qty");
        String[] aae_qty_unit_code = request.getParameterValues("aae_qty_unit_code");
        String[] aae_netweight = request.getParameterValues("aae_netweight");
        String[] aae_netweight_unit_code = request.getParameterValues("aae_netweight_unit_code");
        String[] aae_status = request.getParameterValues("aae_status");
        String[] aae_exhibit_list = request.getParameterValues("aae_exhibit_list");
        String[] aae_exhibit_desc = request.getParameterValues("aae_exhibit_desc");
        String[] aae_car_no = request.getParameterValues("aae_car_no");
        String[] aae_remarks = request.getParameterValues("aae_remarks");
        String[] aae_id = request.getParameterValues("aae_id");
        String[] aae_sizes_code_text = request.getParameterValues("aae_sizes_code_text");
        String[] aae_sizes_unit_code_text = request.getParameterValues("aae_sizes_unit_code_text");
        String[] aae_qty_unit_code_text = request.getParameterValues("aae_qty_unit_code_text");
        String[] aae_netweight_unit_code_text = request.getParameterValues("aae_netweight_unit_code_text");
        String[] aae_case_id = request.getParameterValues("aae_case_id");
        String[] aae_co_id = request.getParameterValues("aae_co_id");
        String[] aae_group_id = request.getParameterValues("aae_group_id");
        String[] aae_group_name = request.getParameterValues("aae_group_name");

        if(aae_id != null){
	        for (int i = 0; i < aae_id.length; i++) {
	        	
	        	caae.setBrand_code(aae_brand_code[i]);
	        	caae.setCar_no(aae_car_no[i]);
	        	caae.setDuty_code(aae_duty_code[i]);
	            caae.setExhibit_desc(aae_exhibit_desc[i]);
	            caae.setExhibit_list(aae_exhibit_list[i]);
	            caae.setIsdomestic(aae_isdomestic[i]);
	            caae.setIsexhibitco(aae_isexhibitco[i]);
	            caae.setNetweight(!aae_netweight[i].equals("") ? Double.parseDouble(aae_netweight[i]) : null);
	            caae.setNetweight_unit_code(aae_netweight_unit_code[i]);
	            caae.setProduct_code(aae_product_code[i]);
	            caae.setQty(!aae_qty[i].equals("") ? Double.parseDouble(aae_qty[i]) : null);
	            caae.setQty_unit_code(aae_qty_unit_code[i]);
	            caae.setRemarks(aae_remarks[i]);
	            caae.setApplication_arrest_exhibit_id(!aae_co_id[i].equals("") ? new Long(aae_co_id[i]) : null);
	            caae.setSize_unit_code(aae_sizes_unit_code[i]);
	            caae.setSizes_code(aae_sizes_code[i]);
	            caae.setStatus(!aae_status[i].equals("") ? Long.parseLong(aae_status[i]) : null);
	            caae.setProduct_name(aae_product_name[i]);
	            caae.setBrand_name(aae_brand_name[i]);
	            caae.setSizes_desc(aae_sizes_code_text[i]);
	            caae.setSizes_unit_name(aae_sizes_unit_code_text[i]);
	            caae.setQty_unit_name(aae_qty_unit_code_text[i]);
	            caae.setNetweight_unit_name(aae_netweight_unit_code_text[i]);
	            caae.setGroup_id(aae_group_id[i]);
	            caae.setGroup_name(aae_group_name[i]);
	            caae.setDuty_name(aae_duty_name[i]);
	            caae.setTrack_no(aa.getTrack_no());
	            caae.setCreate_by(uData.getIdCard());
	            caae.setCreate_on(create_on);
	            caae.create();
	        }
        }
    }

    public void uplaw(HttpServletRequest request, HttpServletResponse response, ApplicationArrestLawbreaker aal, String birthDate) throws Exception {
        Lawbreaker lb = new Lawbreaker(db);
        int ishave = 0;
        List<Lawbreaker> lblist = new ArrayList();
        List<Lawbreaker> lblist1 = new ArrayList();
        List<Lawbreaker> lblist2 = new ArrayList();
        List<Lawbreaker> lblist3 = new ArrayList();
        List<Lawbreaker> lblist4 = new ArrayList();
        List<Map<String,Object>> lblist5 = new ArrayList();
        
        lblist = lb.findByWhere(" lawbreaker_no = ? ", aal.getLawbreaker_no());
        if(lblist == null || lblist.size() == 0){
        	//ถ้าไม่มี LAWBREAKER.ID ก็ให้เช็คจาก เลขบัตรประชาชน เลขที่หนังสือเดินทาง หรือเลขที่นิติบุคคล
        	if(aal.getCulprit_type() == 1l){
        		if(aal.getLawbreaker_id_card() != null && !aal.getLawbreaker_id_card().trim().equals("")){
        			lblist4 = lb.findByWhere(" LAWBREAKER_ID_CARD = ? ", aal.getLawbreaker_id_card());
        			if (lblist4 == null || lblist4.size() == 0){
        				if(!aal.getFirst_name().equals("") && !aal.getLast_name().equals("") && !birthDate.equals("")){
        		        	String whText = " first_name = '" + aal.getFirst_name() + "' and last_name = '" + aal.getLast_name() + "' and to_char(birth_date,'dd/mm/yyyy', 'NLS_CALENDAR=''THAI BUDDHA'' NLS_DATE_LANGUAGE=THAI') = '" + birthDate + "'";
        		        	//มีปัญหาเรื่องวันที่ ถ้า Deploy ขึ้น Server
        		        	lblist5 = lb.findBySql("select id from lawbreaker where " + whText, null);
        		        }
        			}
        		}else{
        			if(!aal.getFirst_name().equals("") && !aal.getLast_name().equals("") && !birthDate.equals("")){
    		        	String whText = " first_name = '" + aal.getFirst_name() + "' and last_name = '" + aal.getLast_name() + "' and to_char(birth_date,'dd/mm/yyyy', 'NLS_CALENDAR=''THAI BUDDHA'' NLS_DATE_LANGUAGE=THAI') = '" + birthDate + "'";
    		        	//มีปัญหาเรื่องวันที่ ถ้า Deploy ขึ้น Server
    		        	lblist5 = lb.findBySql("select id from lawbreaker where " + whText, null);
    		        }
        		}
    		}else if(aal.getCulprit_type() == 2l){
    			if(aal.getLawbreaker_passport() != null && !aal.getLawbreaker_passport().trim().equals("")){
    	        	lblist1 = lb.findByWhere(" LAWBREAKER_PASSPORT = ? ", aal.getLawbreaker_passport());
    	        	if (lblist1 == null || lblist1.size() == 0){
    	        		if(!aal.getFirst_name().equals("") && !aal.getLast_name().equals("") && !birthDate.equals("")){
        		        	String whText = " first_name = '" + aal.getFirst_name() + "' and middle_name = '" + aal.getMiddle_name() + "' and last_name = '" + aal.getLast_name() + "' and to_char(birth_date,'dd/mm/yyyy', 'NLS_CALENDAR=''THAI BUDDHA'' NLS_DATE_LANGUAGE=THAI') = '" + birthDate + "'";
        		        	//มีปัญหาเรื่องวันที่ ถ้า Deploy ขึ้น Server
        		        	lblist5 = lb.findBySql("select id from lawbreaker where " + whText, null);
        		        }
    	        	}else{
    	        		if(!aal.getFirst_name().equals("") && !aal.getMiddle_name().equals("") && !aal.getLast_name().equals("") && !birthDate.equals("")){
        		        	String whText = " first_name = '" + aal.getFirst_name() + "' and middle_name = '" + aal.getMiddle_name() + "' and last_name = '" + aal.getLast_name() + "' and to_char(birth_date,'dd/mm/yyyy', 'NLS_CALENDAR=''THAI BUDDHA'' NLS_DATE_LANGUAGE=THAI') = '" + birthDate + "'";
        		        	//มีปัญหาเรื่องวันที่ ถ้า Deploy ขึ้น Server
        		        	lblist5 = lb.findBySql("select id from lawbreaker where " + whText, null);
        		        }
    	        	}
    	        }
    		}else if(aal.getCulprit_type() == 3l){
    			if(aal.getExcise_reg_no() != null && !aal.getExcise_reg_no().trim().equals("")){
    	        	lblist2 = lb.findByWhere(" EXCISE_REG_NO = ? ", aal.getExcise_reg_no());
    	        }
    			if(aal.getCorporation_code() != null && !aal.getCorporation_code().trim().equals("")){
    		        lblist3 = lb.findByWhere(" CORPORATION_CODE = ? ", aal.getCorporation_code());
    	        }
    		}
        }
        
        ishave = (lblist.size() + lblist1.size() + lblist2.size() + lblist3.size() + lblist4.size() + lblist5.size());

        if (ishave > 0) {
            if (lblist.size() > 0) 
                lb = lblist.get(0);
            else if(lblist4.size() > 0)
            	lb = lblist4.get(0);
            else if (lblist1.size() > 0) 
                lb = lblist1.get(0);
            else if (lblist2.size() > 0) 
                lb = lblist2.get(0);
            else if (lblist3.size() > 0) 
                lb = lblist3.get(0);
            else if(lblist5.size() > 0)
            	lb = lb.findByPk(new Long(lblist5.get(0).get("id").toString()));
        }

        lb.setLawbreaker_type(aal.getCulprit_type().toString());
        lb.setLawbreaker_id_card(aal.getLawbreaker_id_card());
        lb.setSex(aal.getSex());
        lb.setTitle_code(aal.getTitle_code());
        lb.setFirst_name(aal.getFirst_name());
        lb.setLast_name(aal.getLast_name());
        lb.setOther_name(aal.getOther_name());
        lb.setAddress_no(aal.getAddress_no());
        lb.setMoo(aal.getMoo());
        lb.setSoi(aal.getSoi());
        lb.setRoad(aal.getRoad());
        lb.setProvince_code(aal.getProvince());
        lb.setDistrict_code(aal.getDistrict());
        lb.setSubdistrict_code(aal.getSubdistrict());
        lb.setRace_id(aal.getRace_id());
        lb.setNation_id(aal.getNationality_id());
        lb.setCareer(aal.getCareer());
        lb.setBirth_date(aal.getBirth_date());
        lb.setLawbreaker_passport(aal.getLawbreaker_passport());
        lb.setMiddle_name(aal.getMiddle_name());
        lb.setCompany_name(aal.getCompany_name());
        lb.setTitle_code_company(aal.getCompany_title_code());
        lb.setExcise_reg_no(aal.getExcise_reg_no());
        lb.setCorporation_code(aal.getCorporation_code());

        if (ishave > 0) {
            lb.setModify_id(update_by);
            lb.setModify_date(update_on);
            lb.update();
            
            aal = aal.findByPk(aal.getId());
            aal.setLawbreaker_no(lb.getLawbreaker_no());
        	aal = aal.update();
        } else {
            lb.setLawbreaker_no(aal.getLawbreaker_no());
            lb.setCreate_id(create_by);
            lb.setCreate_date(create_on);
            lb.create();
        }
    }
}
