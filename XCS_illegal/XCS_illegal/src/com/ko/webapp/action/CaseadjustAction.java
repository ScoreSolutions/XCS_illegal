package com.ko.webapp.action;

import java.text.DateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.ko.Constants;
import com.ko.domain.ApplicationArrest;
import com.ko.domain.ApplicationArrestIndictment;
import com.ko.domain.ApplicationArrestLawbreaker;
import com.ko.domain.ApplicationSincereConfirm;
import com.ko.domain.CompareAuthority;
import com.ko.domain.BookImpeachment;
import com.ko.domain.CompareCase;
import com.ko.domain.District;
import com.ko.domain.DutyGroup;
import com.ko.domain.EdOffice;
import com.ko.domain.Legislation;

import com.ko.service.EdOfficeService;
import com.ko.util.DateUtil;
import com.ko.util.ReportsUtil;
import com.ko.webapp.util.ParameterUtil;
import com.ko.webapp.util.ArrestUtil;

public class CaseadjustAction extends BaseAction {

	@Override
	public void _default(HttpServletRequest request,HttpServletResponse response) throws Exception {
		
		//pre(request, response);
		//request.setAttribute("abc", "1");
		//searchData(request,response);
		//list(request,response);
		this.writeTranLog("แสดงรายการเปรียบเทียบปรับ");
		//forward("?page=/CompareCase/compare_case_adjust_list.jsp", request,response);

	}
	
	public void add(HttpServletRequest request,HttpServletResponse response)throws Exception {
		//log.debug("start add");
		HttpSession session = request.getSession();
    	session.setAttribute("ResponseTime", System.currentTimeMillis());
    	
		pre(request, response);
		preup(request, response);

        String id = request.getParameter("id");
        // include file
		ApplicationArrest aa = new ApplicationArrest(db);
    	aa = aa.findByPk(Long.parseLong(id));

    	//แสดงรายการข้อกล่าวหา
		ApplicationArrestIndictment aai = new ApplicationArrestIndictment(db);
        String incsql;
        incsql= " select aai.indictment_id, 'มาตรา' || inc.case_law_id || ' ' || case when pke_arrest.getLawBreakerQty(aai.track_no)>1 then 'ร่วมกัน' else '' end || replace(inc.guilt_base,'" + Character.toString('"') + "','" + "\\" + "\"" + "') indictment_name, " +
        " inc.CASE_LAW_ID, inc.PENALTY_CASE_LAW_ID, case when pke_arrest.getLawBreakerQty(aai.track_no)>1 then 'ร่วมกัน' else '' end || inc.guilt_base guilt_base "+ //
		" from application_arrest_indictment aai"+
		" inner join indictment inc on inc.indictment_id=aai.indictment_id"+
		" where aai.track_no = ?"+
		" order by inc.case_law_id";
        List<Map<String,Object>> inclist = aai.findBySql(incsql,aa.getTrack_no());
        request.setAttribute("inclist", inclist);
    	//log.debug(incsql);
    	
        ApplicationArrestLawbreaker aal = new ApplicationArrestLawbreaker(db);
        String lsql = "";
        lsql += " select pke_arrest.getLawbreakerName(aal.id) lawbreaker_name, aal.fine ";
        lsql += " from application_arrest_lawbreaker aal";
        lsql += " where aal.track_no = ? ";
        List<Map<String,Object>>  aallist  = aal.findBySql(lsql,aa.getTrack_no());
        request.setAttribute("aallist", aallist);
        
        CompareAuthority ca = new CompareAuthority(db);
        List<Map<String,Object>> calist = ca.findBySql("select * from compare_authority order by authority_name");
        request.setAttribute("calist", calist);
        
        try{
        	CompareCase cc = new CompareCase(db);
            cc = cc.findByWhere("track_no = '" + aa.getTrack_no() + "'", null).get(0);
			request.setAttribute("update", "1");
			request.setAttribute("cc", cc);
			String ci1 = "";
			String ci2 = "";
			if(cc.getCompare_case_no() != null && cc.getCompare_case_no().indexOf("/")>0){
				ci1 = cc.getCompare_case_no().substring(0, cc.getCompare_case_no().indexOf("/"));
				ci2 = cc.getCompare_case_no().substring(cc.getCompare_case_no().indexOf("/")+1,cc.getCompare_case_no().length());
			}else{
				ci1 = (cc.getCompare_case_no() != null ? cc.getCompare_case_no().toString() : "");
			}
			
			BookImpeachment bi = new BookImpeachment(db); 
			bi= bi.findByWhere("track_no = '" + aa.getTrack_no() + "'", null).get(0);
			if (bi.getCase_none_office().equals("Y")){
				ci1=ci1.replace("น", "");
			}
			
			request.setAttribute("case_no_1",ci1);
			request.setAttribute("case_no_2",ci2);
			request.setAttribute("accuser_testimony", cc.getAccuser_testimony());
			request.setAttribute("compare_office", cc.getCompare_office());
			
			ReportsUtil.UpdateCubeReport2_55(cc.getTrack_no(), uData.getUsername());
        }catch(Exception e){
        	//log.debug("catch Update 0");
        	request.setAttribute("update", "0");
        }
        
		this.writeTranLog("แสดงรายละเอียดคดีเปรียบเทียบปรับ เลขที่งาน " + aa.getTrack_no());
		request.setAttribute("action","process?action=Caseadjust&id="+request.getParameter("id")+"&cmd=add");

		forward("?page=/CompareCase/compare_case_adjust_form.jsp?time=" + new Date().getTime(), request, response);
	}

	private void searchData(HttpServletRequest request, HttpServletResponse response) throws Exception {
		ApplicationSincereConfirm aad = new ApplicationSincereConfirm(db);
		String slsql;
		String countsql;
		
		
		slsql =
			"select distinct aa.id, nvl(bi.case_id,'-') case_id, ed.short_name, bi.case_date, to_char(bi.case_date, 'dd/mm/yyyy', 'NLS_CALENDAR=''THAI BUDDHA'' NLS_DATE_LANGUAGE=THAI') case_date2, \n"+
			"aa.track_no, pke_arrest.getArrestIndictment(aa.track_no) guilt_base, to_char(aa.occurrence_date, 'dd/mm/yyyy', 'NLS_CALENDAR=''THAI BUDDHA'' NLS_DATE_LANGUAGE=THAI') occurrence_date, \n"+
			" tia.title_name || sta.first_name || ' ' || sta.last_name accuser_name, nvl(sic.id,0) send_income_case_id, pke_arrest.getArrestLawbreaker(aa.track_no) lawbreaker_name, " +
			" lg.legislation_name, pke_master.fn_show_address(sd.subdistrict_code, d.district_code, pv.province_code,'Y') scene_address " +
			"from application_arrest aa \n"+
			"inner join application_arrest_indictment aai on aa.track_no=aai.track_no \n"+
			"inner join indictment inc on inc.indictment_id=aai.indictment_id \n"+
			"inner join ed_office ed on ed.offcode=aa.offcode \n" +
			"left join application_arrest_lawbreaker aal on aa.track_no=aal.track_no \n"+
			"left join lawbreaker lb on lb.lawbreaker_no=aal.lawbreaker_no \n"+
			"left join title tt on tt.title_code=aal.title_code \n"+
			"left join title tc on tc.title_code=aal.company_title_code \n"+
			"inner join book_impeachment bi on aa.track_no=bi.track_no \n"+
			"left join v_accuser_list_popup sta on sta.idcard_no=aa.accuser_idcardno \n"+
			"left join title tia on tia.title_code=sta.title_code \n"+
			"left join application_arrest_exhibit aae on aa.track_no=aae.track_no \n"+
			" left join duty_table dt on dt.duty_code=aae.duty_code \n" +
			"inner join legislation lg on lg.id=aa.legislation_id \n"+
			"inner join duty_group dg on dg.group_id=aa.product_group_id \n"+
			"left join province pv on pv.province_code=aa.scene_province \n"+
			"left join district d on d.district_code=aa.scene_district \n"+
			"left join subdistrict sd on sd.subdistrict_code=aa.scene_subdistrict \n"+
			"left join compare_case cc on cc.track_no=aa.track_no \n"+
			"left join application_arrest_prove aap on aa.track_no=aap.track_no \n"+
			"left join application_arrest_license ali on aa.track_no=ali.track_no \n"+
			"left join application_notice_arrest ana on ana.id=aa.application_notice_arrest_id \n"+
			"left join application_search_warrant asw on asw.id=aa.application_search_warrant_id \n"+
			"left join application_sincere_confirm asi on asi.id=aa.application_sincere_confirm_id " +
			"left join send_income_case sic on sic.compare_case_id=cc.id " +
				" and sic.send_income_id in (select si.id from send_income si where si.status='1')" +//นำส่งเงินแล้ว
				" and sic.ref_type='COMPARE_CASE' " +  //เป็นคดีเปรียบเทียบปรับที่นำส่งเงินแล้ว
			"where aa.del_flag='N' and bi.case_quality='1' and bi.case_last='1' and aa.have_culprit='Y' " +
			" and bi.case_date is not null and bi.case_id is not null and bi.case_id<>'/' ";
	
		countsql = "select count( distinct aa.id) " +
			"from application_arrest aa \n"+
			"inner join application_arrest_indictment aai on aa.track_no=aai.track_no \n"+
			"inner join indictment inc on inc.indictment_id=aai.indictment_id \n"+
			"left join application_arrest_lawbreaker aal on aa.track_no=aal.track_no \n"+
			"left join lawbreaker lb on lb.lawbreaker_no=aal.lawbreaker_no \n"+
			"left join title tt on tt.title_code=aal.title_code \n"+
			"left join title tc on tc.title_code=aal.company_title_code \n"+
			"inner join book_impeachment bi on aa.track_no=bi.track_no \n"+
			"left join v_accuser_list_popup sta on sta.idcard_no=aa.accuser_idcardno \n"+
			"left join title tia on tia.title_code=sta.title_code \n"+
			"left join application_arrest_exhibit aae on aa.track_no=aae.track_no \n"+
			"left join duty_table dt on dt.duty_code=aae.duty_code " +
			"inner join legislation lg on lg.id=aa.legislation_id \n"+
			"inner join duty_group dg on dg.group_id=aa.product_group_id \n"+
			"left join province pv on pv.province_code=aa.scene_province \n"+
			"left join district d on d.district_code=aa.scene_district \n"+
			"left join subdistrict sd on sd.subdistrict_code=aa.scene_subdistrict \n"+
			"left join compare_case cc on cc.track_no=aa.track_no \n"+
			"left join application_arrest_prove aap on aa.track_no=aap.track_no \n"+
			"inner join ed_office ed on ed.offcode=aa.offcode \n"+
			"left join application_arrest_license ali on aa.track_no=ali.track_no \n"+
			"left join application_notice_arrest ana on ana.id=aa.application_notice_arrest_id \n"+
			"left join application_search_warrant asw on asw.id=aa.application_search_warrant_id \n"+
			"left join application_sincere_confirm asi on asi.id=aa.application_sincere_confirm_id  \n" +
			"left join send_income_case sic on sic.compare_case_id=cc.id  \n" +
			" 	and sic.send_income_id in (select si.id from send_income si where si.status='1')  \n" +//นำส่งเงินแล้ว
			"   and sic.ref_type='COMPARE_CASE'  \n" + //เป็นคดีเปรียบเทียบปรับที่นำส่งเงินแล้ว
			" where aa.del_flag='N' and bi.case_quality='1' and bi.case_last='1' and aa.have_culprit='Y'  \n" +
			" and bi.case_date is not null and bi.case_id is not null and bi.case_id<>'/'  \n";
	
		String whText = "";
		if(request.getParameter("default") != null){//เข้าสู่หน้าจอ
				whText += "  AND nvl(cc.track_no,'0') = '0'  \n";
				if(uData.getAccuserType().equals(Constants.ACCUSER_TYPE_XCS)){
    	        	//ถ้าเป็นเจ้าหน้าที่ส่วนกลาง ให้ Default ที่ ภาค 10
    	        	whText += " AND substr(aa.offcode,1,2) = '10'  \n";
    	        }else if(uData.getAccuserType().equals(Constants.ACCUSER_TYPE_DEPT)){
    	        	//ถ้าเป็นเจ้าหน้าที่สรรพสามิตภาคให้แสดงคดีของภาคนั้นทั้งหมดที่ยังไม่ได้เปรียบเทียบปรับ
    	        	whText += " AND substr(aa.offcode,1,2) || '0000' = '" + uData.getOffcode() + "'  \n";
    	        }else if(uData.getAccuserType().equals(Constants.ACCUSER_TYPE_AREA)){
    	        	//ถ้าเป็นเจ้าหน้าที่สรรพสามิตพื้นที่ให้แสดงคดีของพื้นที่นั้นทั้งหมดที่ยังไม่ได้เปรียบเทียบปรับ
    	        	whText += " AND substr(aa.offcode,1,4) || '00' = '" + uData.getOffcode() + "'  \n";
    	        }else if(uData.getAccuserType().equals(Constants.ACCUSER_TYPE_BRANCH)){
    	        	//ถ้าเป็นเจ้าหน้าที่สรรพสามิตพื้นที่สาขา
    		        whText += " AND aa.offcode = '" + uData.getOffcode() + "'  \n";
    	        }
				
				//whText += " AND aa.offcode like '%" + uData.getOffcode().replace("'", "''").trim() + "%' ";
				
				request.setAttribute("abc","1");
				request.setAttribute("offcode", uData.getOffcode());
    	        request.setAttribute("offname", uData.getShortName());
				this.writeTranLog("แสดงรายการเปรียบเทียบปรับ");
			//}
		}else{//กดปุ่มค้นหา
			ArrestUtil whTxt = new ArrestUtil();
			whText += whTxt.getArrestWhere(request);
			if(request.getParameter("nojob")!=null){
				whText += "  AND nvl(cc.track_no,'0') = '0'";
			}
			this.writeTranLog("ค้นหาข้อมูลการเปรียบเทียบปรับ");
			request.setAttribute("offcode", request.getParameter("offcode"));
            request.setAttribute("offname", request.getParameter("offname"));
		}
		//log.debug(slsql+whText);
		Integer totalRow = aad.countBySql(countsql+whText, null);
		pageUtil.setTotalRow(totalRow);
		pageUtil.setPageSize(20);
	
		List<Map<String, Object>> dblist = aad.findBySql(slsql+whText + " order by bi.case_date desc ", null,pageUtil);
		//log.debug(dblist);
		request.setAttribute("dblist", dblist);
	}
	
	String menuID = "10";
	public void list(HttpServletRequest request, HttpServletResponse response) throws Exception {
		if(uData.chkUserMenu(menuID)==true){
			pre(request, response);
			searchData(request,response);
			ApplicationArrest maxid = new ApplicationArrest(db);
			List<Map<String, Object>> aamax = maxid.findBySql("select max(id) max from application_arrest", null);
			//log.debug(aamax);
			request.setAttribute("aamax", aamax.get(0));			
			forward("?page=/CompareCase/compare_case_adjust_list.jsp", request, response);
		}else{
    		HttpSession session = request.getSession();
  		  	session.invalidate();
  		  	request.setAttribute("errMsg", "ผู้ใช้ไม่มีสิทธิ์ดำเนินการ");
  		  	forward("?page=/login.jsp", request, response);
    	}
	}
	
	public void pre(HttpServletRequest request, HttpServletResponse response)throws Exception {
		Legislation lt = new Legislation(db);
		List<Legislation> ltlist = lt.findByWhere(" 1=1 order by legislation_name", null);
		//log.debug(ltlist);
		request.setAttribute("ltlist", ltlist);
		
		DutyGroup dg = new DutyGroup(db);
		List<Map<String, Object>> dglist = dg.findBySql("select  id, group_id, group_name, substr(group_id,3,2) from duty_group where substr(group_id,3,2)<>'00' order by group_name",null);
		request.setAttribute("dglist", dglist);
		
    	//Request from table
        EdOffice ed = new EdOffice(db);
        String edSql = "select offcode, short_name from ed_office order by short_name ";
        List<Map<String,Object>> edlist = ed.findBySql(edSql);
        request.setAttribute("edlist", edlist);
        request.setAttribute("compare_office", uData.getOffcode());
        

        request.setAttribute("uData",uData);
        if (uData.IsAdmin()==true)
        	request.setAttribute("IsAdmin","1");
	
	}
	public void preup(HttpServletRequest request, HttpServletResponse response)throws Exception {
		String sql;
		sql = "select  aa.lawbreak_type, aa.scene_name, aa.scene_no, aa.scene_moo, aa.scene_soi, aa.scene_road, aa.police_station, aa.accuser_poscode, \n"
		+ " aa.accuser_offcode, aa.issentcourt, aa.estimate_fine, aa.department_id, aa.department_name, aa.id, aa.track_no, \n"
		+ " pke_arrest.getArrestIndictment(aa.track_no) guilt_base,  \n"
		+ "aa.coordinate_x, aa.coordinate_y, aa.accuser_idcardno,  aa.SCENE_PROVINCE, aa.SCENE_SUBDISTRICT, aa.SCENE_DISTRICT, \n"
		+ "aa.occurrence_date, to_char(aa.occurrence_date, 'dd/mm/yyyy', 'NLS_CALENDAR=''THAI BUDDHA'' NLS_DATE_LANGUAGE=THAI') occurrence_date2,  \n"
		+ "to_char(aa.occurrence_date,'HH24:mi') occurrence_time , cc.case_fine,pke_arrest.getLawbreakerQty(aa.track_no) aalsize, \n"
		+ "bi.case_date, to_char(bi.case_date, 'dd/mm/yyyy', 'NLS_CALENDAR=''THAI BUDDHA'' NLS_DATE_LANGUAGE=THAI') case_date2,  \n"
		+ "aa.application_date, to_char(aa.application_date, 'dd/mm/yyyy', 'NLS_CALENDAR=''THAI BUDDHA'' NLS_DATE_LANGUAGE=THAI')  application_date2,  \n"
		+ "bi.id book_impeachment_id, bi.case_id, nvl(aa.accuser_name,tia.title_name || sta.first_name || ' ' || sta.last_name) accuser_name, aa.legislation_id, lg.legislation_name,  \n"
		+ "aa.product_group_id, dg.group_name product_group_name, pke_arrest.getArrestLawbreaker(aa.track_no) lawbreaker_name,  \n"
		+ "aa.offcode, edo.short_name offname, nvl(aa.accuser_posname, nvl(sta.pos_name,ps.posname || ' ' || sta.staff_level)) posname,  \n"
		+ "aa.accuser_type,  aa.have_culprit, cc.pay_date, pke_compare.getComparestatus(aa.track_no,'0') compare_status, aa.application_notice_arrest_id, \n"
		+ "nvl(cc.sue_staff_idcardno,bi.staff_id_sue) staff_id_sue, nvl(cc.sue_poscode,sts.poscode) sue_poscode, nvl(cc.sue_offcode,sts.offcode) sue_offcode,  \n"
		+ "nvl(tic.title_name,tis.title_name) || nvl(stc.first_name,sts.first_name) || ' ' || nvl(stc.last_name,sts.last_name) sue_staff_name, aa.administration, \n"
		+ "aap.tax_value, edo.indc_off,bi.case_none_office,cc.case_non_office_name  \n"
		+ "from application_arrest aa  \n"
		+ "inner join book_impeachment bi on aa.track_no=bi.track_no  \n"
		+ "left join v_accuser_list_popup sta on sta.idcard_no=aa.accuser_idcardno  \n"
		+ "left join title tia on tia.title_code=sta.title_code \n"
		+ "left join staff sts on sts.idcard_no=bi.staff_id_sue \n"
		+ "left join title tis on tis.title_code=sts.title_code \n"
		+ "inner join legislation lg on lg.id=aa.legislation_id \n"
		+ "inner join duty_group dg on dg.group_id=aa.product_group_id \n"
		+ "left join application_arrest_prove aap on aap.track_no=aa.track_no \n"
		+ "left join compare_case cc on cc.track_no=aa.track_no \n"
		+ "left join staff stc on stc.idcard_no=cc.sue_staff_idcardno \n"
		+ "left join title tic on tic.title_code=stc.title_code \n"
		+ "left join ed_office eda on eda.offcode=aa.accuser_offcode \n"
		+ "left join ed_office edo on edo.offcode=aa.offcode \n"
		+ "left join position ps on ps.poscode=aa.accuser_poscode \n"
		+ "where aa.del_flag='N' and aa.id =  ? ";

		ApplicationArrest aa = new ApplicationArrest(db);
		Long id = new Long(request.getParameter("id"));
		//System.out.print(id);
		//System.out.println(sql);
		List<Map<String, Object>> db = aa.findBySql(sql, id);
		
		request.setAttribute("db", db.get(0));
		request.setAttribute("aalsize", db.get(0).get("aalsize"));
		request.setAttribute("sue_staff_name", (db.get(0).get("sue_staff_name") != null ? db.get(0).get("sue_staff_name").toString() : uData.getFullName()));
		request.setAttribute("sue_staff_idcardno", (db.get(0).get("staff_id_sue") != null ? db.get(0).get("staff_id_sue").toString() : uData.getIdCard()));
		request.setAttribute("sue_poscode", (db.get(0).get("sue_poscode") != null ? db.get(0).get("sue_poscode").toString() : uData.getPoscode()));
		request.setAttribute("sue_offcode", (db.get(0).get("sue_offcode") != null ? db.get(0).get("sue_offcode").toString() : uData.getOffcode()));
		
		request.setAttribute("accuser_idcardno", (db.get(0).get("accuser_idcardno") != null ? db.get(0).get("accuser_idcardno").toString() :""));
        request.setAttribute("accuser_name", (db.get(0).get("accuser_name") != null ? db.get(0).get("accuser_name").toString() : ""));
        request.setAttribute("accuser_poscode", (db.get(0).get("accuser_poscode") != null ? db.get(0).get("accuser_poscode").toString() : ""));
        request.setAttribute("accuser_posname", (db.get(0).get("posname").toString() != null ? db.get(0).get("posname").toString() : ""));
        request.setAttribute("accuser_offcode", (db.get(0).get("accuser_offcode") != null ? db.get(0).get("accuser_offcode").toString() : ""));
        request.setAttribute("accuser_offname", (db.get(0).get("offname") != null ? db.get(0).get("offname").toString() : ""));
        
        if (db.get(0).get("case_none_office").equals("Y"))
        	request.setAttribute("caseNoneOffice", "น");
        else
        	request.setAttribute("caseNoneOffice", "&nbsp;");
		

		String lPoliceStation = (db.get(0).get("police_station") != null ? db.get(0).get("police_station").toString() : "");
		String testimony = "";
		testimony += "           วันนี้ เวลา " +  db.get(0).get("occurrence_time").toString() + " น.";
		testimony += " ข้าฯ พร้อมด้วยพวกได้ดำเนินการจับกุม " + db.get(0).get("lawbreaker_name").toString();
		testimony += " พร้อมของกลาง ตามบัญชีของกลาง ส.ส.2/4 โดยแจ้งข้อกล่าวหา" + db.get(0).get("guilt_base").toString() + " ให้ทราบ และ นำตัวผู้ต้องหาพร้อมของกลางส่งพนักงานสอบสวน ";
		testimony += lPoliceStation + " เพื่อดำเนินคดี แต่ผู้ต้องหายินยอมชำระค่าปรับ ในความผิดที่ถูกกล่าวหา จึงได้นำตัวส่ง " + uData.getOffname() + " เพื่อดำเนินการต่อไป";
		request.setAttribute("accuser_testimony", testimony);
		
		String indcOff = (db.get(0).get("indc_off") != null ? db.get(0).get("indc_off").toString() : "");
		String IsEdit = "";
		if(!uData.getAccuserType().equals(Constants.ACCUSER_TYPE_XCS)){
			//ถ้าเป็นเจ้าหน้าที่ภูมิภาค
			//log.debug("AAAAAAAAAA :: " + uData.getINDCOff());
	        if(!uData.getINDCOff().equals(indcOff)){  //กรณีหน่วยงานใหญ่เข้ามาดูของหน่วยงานย่อย
	        	IsEdit = "N";
	        	//log.debug("BBBBBBBBBBBBB");
	        }else{
	        	//กรณีหน่วยงานอื่นๆ แต่สิทธิ์เป็น Admin เข้ามาดู
	        	if(!uData.getOffcode().equals(db.get(0).get("offcode").toString())){
	        		IsEdit = "N";
	        	}else{
	        		IsEdit = "Y";
	        		//log.debug("CCCCCCCCCCCCCCCCC");
	        	}
	        }
		}else{
			//ถ้าเป็นเจ้าหน้าที่ส่วนกลาง ให้สามารถแก้ไขคดีของภาค 10 ได้
			String vOffcode = (db.get(0).get("offcode") != null ? db.get(0).get("offcode").toString() : "");
			if(vOffcode.substring(0, 2).equals("10") || vOffcode.substring(0, 2).equals("00"))
				IsEdit = "Y";
			else{
				if(uData.getOffcode().equals(vOffcode)){
					IsEdit = "Y";
					//log.debug("DDDDDDDDDDDDD");
				}else
					IsEdit = "N";
			}
		}
		request.setAttribute("IsEdit", IsEdit);
	}

	public void create(HttpServletRequest request, HttpServletResponse response) throws Exception {
		boolean upchk = false;
		CompareCase cc = new CompareCase(db);
		if (request.getParameter("update").equals("1")) {
			upchk = true;
			cc = cc.findByWhere("track_no = ?",	request.getParameter("track_no")).get(0);
		}
		
		String case_status = (request.getParameter("case_status") != null ? request.getParameter("case_status") : "");
		if(!case_status.equals("2")){
			cc.setCompare_case_no(ParameterUtil.getStringParam("compare_case_no_1", request).trim()+"/"+ParameterUtil.getStringParam("compare_case_no_2", request).trim());
			Date comdate = DateUtil.getDateFromString(ParameterUtil.getStringParam("compare_case_date", request));
			cc.setCompare_case_date(comdate);
			cc.setCase_status("1");
			cc.setCase_id(new Long(ParameterUtil.getStringParam("bi_id", request)));
			cc.setCompare_office(ParameterUtil.getStringParam("compare_office", request));
			cc.setCompare_province(ParameterUtil.getStringParam("compare_province", request));
			cc.setAccuser_province(ParameterUtil.getStringParam("accuser_province", request));
			cc.setCompare_district(ParameterUtil.getStringParam("compare_district", request));
			cc.setAccuser_district(ParameterUtil.getStringParam("accuser_district", request));
			cc.setCompare_subdistrict(ParameterUtil.getStringParam("compare_subdistrict", request));
			cc.setAccuser_subdistrict(ParameterUtil.getStringParam("accuser_subdistrict", request));
			cc.setManage_type(ParameterUtil.getStringParam("manage_type", request));
			cc.setAccuser_testimony(ParameterUtil.getStringParam("accuser_testimony", request));
			if(ParameterUtil.getStringParam("manage_type", request).equals("1")){
				cc.setCompare_authority_id(new Long(ParameterUtil.getStringParam("compare_authority_id", request)));
			}
			cc.setSue_staff_idcardno(ParameterUtil.getStringParam("sue_staff_idcardno", request));
			cc.setSue_poscode(request.getParameter("sue_poscode").trim());
			cc.setSue_offcode(ParameterUtil.getStringParam("sue_offcode", request));
			cc.setIndictment_id(new Long(ParameterUtil.getStringParam("indictment_id", request)));

			ApplicationArrestLawbreaker aal = new ApplicationArrestLawbreaker(db);
			List<ApplicationArrestLawbreaker> aallist = aal.findByWhere("track_no = ?", request.getParameter("track_no"));
			if(aallist.size()>0){
				for(int i=0 ;i<aallist.size();i++){
					aallist.get(i).setFine(new Double(ParameterUtil.getStringParam("case_fine", request)));
					aallist.get(i).update();
				}
			}
			if(isNumeric(ParameterUtil.getStringParam("case_fine", request))){
				cc.setCase_fine(new Double(ParameterUtil.getStringParam("case_fine", request)));
			}
		}
		
		cc.setTreasury_money_p(!request.getParameter("treasury_money_p").equals("") ? Long.parseLong(request.getParameter("treasury_money_p")) : null);
		cc.setTreasury_money(!request.getParameter("treasury_money").equals("") ?  Double.parseDouble(request.getParameter("treasury_money")) : null);
		cc.setBribe_money_p(!request.getParameter("bribe_money_p").equals("") ? Long.parseLong(request.getParameter("bribe_money_p")) : null);
		cc.setBirbe_money(!request.getParameter("bribe_money").equals("") ? Double.parseDouble(request.getParameter("bribe_money")) : null);
		cc.setReward_money_p(!request.getParameter("reward_money_p").equals("") ? Long.parseLong(request.getParameter("reward_money_p")) : null);
		cc.setReward_money(!request.getParameter("reward_money").equals("") ? Double.parseDouble(request.getParameter("reward_money")) : null);
		Double totalFine = cc.getBirbe_money() + cc.getReward_money() + cc.getTreasury_money();
		cc.setCase_total_fine(totalFine);
		
		if(request.getParameter("case_non_office_name") != null)
			cc.setCase_non_office_name(ParameterUtil.getStringParam("case_non_office_name", request));
		
		if (request.getParameter("txtNoneOffice").equals("Y")){
			cc.setCompare_case_no("น"+ParameterUtil.getStringParam("compare_case_no_1", request) + "/" + ParameterUtil.getStringParam("compare_case_no_2", request));
		}else{
			cc.setCompare_case_no(ParameterUtil.getStringParam("compare_case_no_1", request) + "/" + ParameterUtil.getStringParam("compare_case_no_2", request));
		}
		
		
		if (upchk) {
			cc.setUpdate_by(update_by);
			cc.setUpdate_on(new Date());
			cc.update();
		} else {
			cc.setTrack_no(ParameterUtil.getStringParam("track_no", request));
			cc.setCreate_by(create_by);
			cc.setCreate_on(new Date());
			cc.create();
		}

		ApplicationArrest aa = new ApplicationArrest(db);
		String uSql = "update application_arrest ";
		uSql += " set administration='" + ParameterUtil.getStringParam("administration", request).replaceAll("'", "''") + "' ";
		uSql += " where track_no = '" + request.getParameter("track_no") + "'";
		aa.executeUpdate(uSql);

		this.writeTranLog("บันทึกข้อมูลการเปรียบเทียบปรับ");
		
		String aaId = request.getParameter("id");
		redirect("process?action=Caseadjust&id=" + aaId + "&cmd=add",request, response);
	}

	 public boolean isNumeric(String s) {
		   try{
			   return s.matches("[-+]?\\d*\\.?\\d+");
		   }catch (Exception e) {
			   return false ;
		}

		      }
	
}
