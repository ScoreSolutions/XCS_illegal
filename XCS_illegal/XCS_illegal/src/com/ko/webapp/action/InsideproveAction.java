package com.ko.webapp.action;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Map;
import org.apache.commons.lang.StringUtils;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.ko.Constants;
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
import com.ko.domain.ApplicationSearchWarrant;
import com.ko.domain.ApplicationSincereConfirm;
import com.ko.domain.BookImpeachment;
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
import com.opensymphony.oscache.base.Config;

public class InsideproveAction extends BaseAction {

	@Override
	public void _default(HttpServletRequest request,HttpServletResponse response) throws Exception {
		// TODO Auto-generated method stub
		

		//searchData(request,response);
		//forward("?page=/ProveExhibit/attest_exhibit_search.jsp", request,response);

	}

	private void searchData(HttpServletRequest request, HttpServletResponse response) throws Exception {
		ApplicationSincereConfirm aad = new ApplicationSincereConfirm(db);
		String sql ="";
		String slsql;
		String countsql;
		
		
		countsql = "select count(distinct aa.id) \n" +
		"from application_arrest aa \n" +
		"inner join application_arrest_indictment aai on aa.track_no=aai.track_no \n" +
		"inner join indictment inc on inc.indictment_id=aai.indictment_id \n" +
		"left join application_arrest_lawbreaker aal on aa.track_no=aal.track_no \n" +
		"left join lawbreaker lb on lb.lawbreaker_no=aal.lawbreaker_no \n" +
		"left join title tt on tt.title_code=aal.title_code \n" +
		"left join title tc on tc.title_code=aal.company_title_code \n" +
		"inner join book_impeachment bi on aa.track_no=bi.track_no \n" +
		"left join v_accuser_list_popup sta on sta.idcard_no=aa.accuser_idcardno \n" +
		"left join title tia on tia.title_code=sta.title_code \n" +
		"inner join application_arrest_exhibit aae on aa.track_no=aae.track_no \n" +
		" left join duty_table dt on dt.duty_code=aae.duty_code \n" +
		"inner join legislation lg on lg.id=aa.legislation_id \n" +
		"inner join duty_group dg on dg.group_id=aa.product_group_id \n" +
		"inner join province pv on pv.province_code=aa.scene_province \n" +
		"left join district d on d.district_code=aa.scene_district \n" +
		"left join subdistrict sd on sd.subdistrict_code=aa.scene_subdistrict \n" +
		"left join compare_case cc on cc.track_no=aa.track_no \n" +
		"left join application_arrest_prove aap on aa.track_no=aap.track_no \n" +
		"left join staff stp on stp.idcard_no=aap.staff_idcardno_prove \n" +
		"left join title tip on tip.title_code=stp.title_code \n" +
		"inner join ed_office ed on ed.offcode=aa.offcode \n" +
		"left join application_arrest_license ali on aa.track_no=ali.track_no \n" +
		"left join application_notice_arrest ana on ana.id=aa.application_notice_arrest_id \n" +
		"left join application_search_warrant asw on asw.id=aa.application_search_warrant_id \n" +
		"left join application_sincere_confirm asi on asi.id=aa.application_sincere_confirm_id \n" +
		"left join send_income_case sic on sic.compare_case_id=cc.id \n" +
		" 	and sic.send_income_id in (select si.id from send_income si where si.status='1') \n" +//นำส่งเงินแล้ว
		" where  bi.case_date is not null and bi.case_id is not null and aa.del_flag='N' \n";
		slsql = 
			"select distinct aa.id, aa.track_no,nvl(bi.case_id,'-') case_id,bi.case_date, \n" +
			 "to_char(bi.case_date, 'dd/mm/yyyy', 'NLS_CALENDAR=''THAI BUDDHA'' NLS_DATE_LANGUAGE=THAI') case_date2, \n" +
			 "to_char(aap.taken_date, 'dd/mm/yyyy', 'NLS_CALENDAR=''THAI BUDDHA'' NLS_DATE_LANGUAGE=THAI') taken_date2, \n" +
			" aap.exhibit_report_no,aap.taken_date,lg.legislation_name,aa.product_group_id, \n" +
			"aap.status,tia.title_name || sta.first_name || ' ' || sta.last_name accuser_name, \n" +
			" tip.title_name || stp.first_name || ' ' || stp.last_name staff_name_prove, \n" +
			" dg.group_name product_group_name, pke_arrest.getArrestLawbreaker(aa.track_no) lawbreaker_name, \n" +
			" decode(aap.status,'1','ยังไม่พิสูจน์','2','พิสูจน์แล้ว') status_name, nvl(sic.id,0) send_income_case_id  \n" +
			"from application_arrest aa \n" +
			"left join application_arrest_indictment aai on aa.track_no=aai.track_no \n" +
			"left join indictment inc on inc.indictment_id=aai.indictment_id \n" +
			"left join application_arrest_lawbreaker aal on aa.track_no=aal.track_no \n" +
			"left join lawbreaker lb on lb.lawbreaker_no=aal.lawbreaker_no \n" +
			"left join title tt on tt.title_code=aal.title_code \n" +
			"left join title tc on tc.title_code=aal.company_title_code \n" +
			"inner join book_impeachment bi on aa.track_no=bi.track_no \n" +
			"left join v_accuser_list_popup sta on sta.idcard_no=aa.accuser_idcardno \n" +
			"left join title tia on tia.title_code=sta.title_code \n" +
			"inner join application_arrest_exhibit aae on aa.track_no=aae.track_no \n" +
			" left join duty_table dt on dt.duty_code=aae.duty_code \n" +
			"inner join legislation lg on lg.id=aa.legislation_id \n" +
			"inner join duty_group dg on dg.group_id=aa.product_group_id \n" +
			"inner join province pv on pv.province_code=aa.scene_province \n" +
			"left join district d on d.district_code=aa.scene_district \n" +
			"left join subdistrict sd on sd.subdistrict_code=aa.scene_subdistrict \n" +
			"left join compare_case cc on cc.track_no=aa.track_no \n" +
			"left join application_arrest_prove aap on aa.track_no=aap.track_no \n" +
			"left join staff stp on stp.idcard_no=aap.staff_idcardno_prove \n" +
			"left join title tip on tip.title_code=stp.title_code \n" +
			"inner join ed_office ed on ed.offcode=aa.offcode \n" +
			"left join application_arrest_license ali on aa.track_no=ali.track_no \n" +
			"left join application_notice_arrest ana on ana.id=aa.application_notice_arrest_id \n" +
			"left join application_search_warrant asw on asw.id=aa.application_search_warrant_id \n" +
			"left join application_sincere_confirm asi on asi.id=aa.application_sincere_confirm_id \n" +
			"left join send_income_case sic on sic.compare_case_id=cc.id \n" +
			" 	and sic.send_income_id in (select si.id from send_income si where si.status='1') \n" +//นำส่งเงินแล้ว
			" where  bi.case_date is not null and bi.case_id is not null and aa.del_flag='N' \n";

		String whText = "";
		if( request.getParameter("default") != null){//กรณีคลิกเมนู งานพิสูจน์ของกลาง>หน่วยงานภายใน แล้วให้แสดงรายการที่ยังไม่พิสูจน์เลย
			whText += " AND nvl(aap.exhibit_report_no,'0') = '0'";
			//whText += " and to_char(nvl(aap.taken_date,sysdate),'yyyymmdd') = to_char(sysdate,'yyyymmdd')";
			whText += " and to_char(bi.case_date,'yyyy')=to_char(sysdate,'yyyy') \n";
			
			//whText += " AND aa.offcode like '%" + uData.getOffcode().replace("'", "''").trim() + "%' ";
			if(uData.getAccuserType().equals(Constants.ACCUSER_TYPE_XCS)){
	        	//ถ้าเป็นเจ้าหน้าที่ส่วนกลาง ให้ Default ที่ ภาค 10
	        	whText += " AND substr(aa.offcode,1,2) = '10' \n";
	        }else if(uData.getAccuserType().equals(Constants.ACCUSER_TYPE_DEPT)){
	        	//ถ้าเป็นเจ้าหน้าที่สรรพสามิตภาคให้แสดงคดีของภาคนั้นทั้งหมดที่ยังไม่ได้พิสูจน์
	        	whText += " AND substr(aa.offcode,1,2) || '0000' = '" + uData.getOffcode() + "' \n";
	        }else if(uData.getAccuserType().equals(Constants.ACCUSER_TYPE_AREA)){
	        	//ถ้าเป็นเจ้าหน้าที่สรรพสามิตพื้นที่ให้แสดงคดีของพื้นที่นั้นทั้งหมดที่ยังไม่ได้พิสูจน์
	        	whText += " AND substr(aa.offcode,1,4) || '00' = '" + uData.getOffcode() + "' \n";
	        }else if(uData.getAccuserType().equals(Constants.ACCUSER_TYPE_BRANCH)){
	        	//ถ้าเป็นเจ้าหน้าที่สรรพสามิตพื้นที่สาขา
		        whText += " AND aa.offcode = '" + uData.getOffcode() + "' \n";
	        }
			
			
			this.writeTranLog("แสดงรายการพิสูจน์ของกลางหน่วยงานภายใน");
			request.setAttribute("abc", "1");
			request.setAttribute("offcode", uData.getOffcode());
	        request.setAttribute("offname", uData.getShortName());
		}else{ //กรณีกดปุ่มค้นหา
			com.ko.webapp.util.ArrestUtil whTxt = new com.ko.webapp.util.ArrestUtil();
			whText += whTxt.getArrestWhere(request);
			if(request.getParameter("nojob")!=null){
				whText += " AND nvl(aap.exhibit_report_no,'0') = '0' \n";
			}
			
			request.setAttribute("offcode", request.getParameter("offcode"));
            request.setAttribute("offname", request.getParameter("offname"));
			this.writeTranLog("ค้นหาข้อมูลการพิสูจน์ของกลาง");
		}
//log.debug(slsql+whText + " order by aa.track_no desc ");
		Integer totalRow = aad.countBySql(countsql+whText, null);
		pageUtil.setTotalRow(totalRow);
		pageUtil.setPageSize(20);
		
		ApplicationArrest maxid = new ApplicationArrest(db);
		List<Map<String, Object>> dblist = aad.findBySql(slsql+whText + " order by aa.track_no desc ", null,pageUtil);
		List<Map<String, Object>> aamax = maxid.findBySql("select max(id) max from application_arrest", null);
		request.setAttribute("aamax", aamax.get(0));
		request.setAttribute("dblist", dblist);
	}
	

		
	public void pre(HttpServletRequest request, HttpServletResponse response) throws Exception {
		Legislation lt = new Legislation(db);
		List<Legislation> ltlist = lt.findByWhere(" 1=1 order by legislation_name", null);
		request.setAttribute("ltlist", ltlist);
		
        request.setAttribute("uData",uData);
        if (uData.IsAdmin()==true)
        	request.setAttribute("IsAdmin","1");

	}

	public void add(HttpServletRequest request, HttpServletResponse response) throws Exception {
		preup(request, response);
		
        EdOffice ed = new EdOffice(db);
        String edSql = "select offcode, short_name from ed_office order by offname ";
        List<Map<String,Object>> edlist = ed.findBySql(edSql);
        request.setAttribute("edlist", edlist);

		String vTrackNo = request.getParameter("track_no");
		ApplicationArrestProve aap  = new ApplicationArrestProve(db);
		String sqlp = "";
		sqlp += " select aap.*, ps.posname || ' ' || st.staff_level staff_prove_posname, ed.offname staff_prove_offname,";
		sqlp += " ti.title_name || st.first_name || ' ' || st.last_name staff_name_prove";
		sqlp += " from application_arrest_prove aap";
		sqlp += " left join position ps on ps.poscode=aap.staff_prove_poscode";
		sqlp += " left join ed_office ed on ed.offcode=aap.staff_prove_offcode";
		sqlp += " left join staff st on st.idcard_no=aap.staff_idcardno_prove";
		sqlp += " left join title ti on ti.title_code=st.title_code";
		sqlp += " where aap.track_no = '" + vTrackNo + "'";
		
		if (aap.findByWhere("TRACK_NO=?", vTrackNo).size()>0) {
			List<Map<String,Object>> aaplist = aap.findBySql(sqlp);
			aap=aap.findByWhere("TRACK_NO=?", vTrackNo).get(0);
			request.setAttribute("update", "1");
			request.setAttribute("aap", aaplist.get(0));
			request.setAttribute("report_desc", aap.getReport_desc());

			if(aap.getStaff_idcardno_prove()!=null){
				request.setAttribute("staff_idcardno_prove", (aaplist.get(0).get("staff_idcardno_prove") != null ? aaplist.get(0).get("staff_idcardno_prove").toString() : ""));
		        request.setAttribute("staff_name_prove", (aaplist.get(0).get("staff_name_prove") != null ? aaplist.get(0).get("staff_name_prove").toString() : ""));
		        request.setAttribute("staff_prove_poscode", (aaplist.get(0).get("staff_prove_poscode") != null ? aaplist.get(0).get("staff_prove_poscode").toString() : ""));
		        request.setAttribute("staff_prove_posname", (aaplist.get(0).get("staff_prove_posname") != null ? aaplist.get(0).get("staff_prove_posname").toString() : ""));
		        request.setAttribute("staff_prove_offcode", (aaplist.get(0).get("staff_prove_offcode") != null ? aaplist.get(0).get("staff_prove_offcode").toString() : ""));
			}else{
				request.setAttribute("staff_idcardno_prove", uData.getIdCard());
		        request.setAttribute("staff_name_prove", uData.getFullName());
		        request.setAttribute("staff_prove_poscode", uData.getPoscode());
		        request.setAttribute("staff_prove_posname", uData.getPosname());
		        request.setAttribute("staff_prove_offcode", uData.getOffcode());
			}

			request.setAttribute("aap", aap);
			//System.out.println(bi);
			if(aap.getExhibit_report_no()!=null){
				String ci1 = aap.getExhibit_report_no().substring(0, aap.getExhibit_report_no().indexOf("/"));
				String ci2 = aap.getExhibit_report_no().substring( aap.getExhibit_report_no().indexOf("/")+1,aap.getExhibit_report_no().length());
				request.setAttribute("aap_id_1", ci1);
				request.setAttribute("aap_id_2",ci2);
			}else{
				request.setAttribute("aap_id_1", "");
				request.setAttribute("aap_id_2","");	
			}
			
			ReportsUtil.UpdateCubeReport2_55(aap.getTrack_no(), uData.getUsername());
		} else {
			//System.out.println(aap);
			request.setAttribute("update", "0");
			request.setAttribute("aap", aap);
			request.setAttribute("aap_id_1", "");
			request.setAttribute("aap_id_2","");
		}

		//request.setAttribute("stbi", d);
		request.setAttribute("action","process?action=Insideprove&id="+request.getParameter("id")+"&track_no="+vTrackNo+"&cmd=add");
		this.writeTranLog("แสดงรายละเอียดรายการพิสูจน์ของกลางจากหน่วยงานภายใน");
		
		if(request.getParameter("SaveMsg") != null)
			request.setAttribute("SaveMsg", "1");
        
		if(uData.chkUserRole(new Long(ConfigUtil.getConfig("ILL00009")))){
			request.setAttribute("IsAddExhibit", "Y");
		}
		forward("?page=/ProveExhibit/attest_exhibit_form.jsp", request,response);
	}

	public void create(HttpServletRequest request, HttpServletResponse response)
			throws Exception {

		boolean upchk = false;
		ApplicationArrestProve aap = new ApplicationArrestProve(db);
		ApplicationArrest aa = new ApplicationArrest(db);
		BookImpeachment bi = new BookImpeachment(db);
		aa = aa.findByPk(Long.parseLong(request.getParameter("id")));

		if (request.getParameter("update").equals("1")) {
			upchk = true;
			aap = aap.findByWhere("track_no = ?",	aa.getTrack_no()).get(0);
			bi = bi.findByWhere("track_no = ?",	aa.getTrack_no()).get(0);
		}
		aap.setCase_id(bi.getId());
		aap.setOrder_desc(ParameterUtil.getStringParam("order_desc", request));
		aap.setReplace_position(ParameterUtil.getStringParam("replace_position", request));
		aap.setReport_desc(ParameterUtil.getStringParam("report_desc", request));
		aap.setReplace_position(request.getParameter("replace_position"));
		aap.setStatus("2");
		aap.setStaff_prove_offcode(ParameterUtil.getStringParam("staff_prove_offcode", request));
		aap.setStaff_prove_poscode(ParameterUtil.getStringParam("staff_prove_poscode", request));
		Date takendate = DateUtil.getDateFromString(ParameterUtil.getStringParam("taken_date", request)+" "+ParameterUtil.getStringParam("taken_time", request));
		aap.setTaken_date(takendate);
		aap.setTax_value(ParameterUtil.getDoubleParam("tax_value", request));	
		aap.setStaff_idcardno_prove(ParameterUtil.getStringParam("staff_idcardno_prove", request));
		aap.setTrack_no(ParameterUtil.getStringParam("track_no_p", request));
		
		String reportNo = ParameterUtil.getStringParam("exhibit_report_no1", request) + "/" + ParameterUtil.getStringParam("exhibit_report_no2", request);
		aap.setExhibit_report_no(reportNo);
		//System.out.println(aap);
		if (upchk) {
			aap.setUpdate_by(update_by);
			aap.setUpdate_on(new Date());
			aap = aap.update();
		} else {
			aap.setCreate_by(create_by);
			aap.setCreate_on(new Date());
			aap = aap.create();
		}
		uplist(request, response, aap);
		
		this.writeTranLog("เพิ่มข้อมูลการพิสูจน์ของกลางหน่วยงานภายใน");
		
		//เก็บ Log กรณีมีการแก้ไขข้อมูลการพิสูจน์ของกลาง ซึ่งมาจากคดีที่ชำระเงินค่าปรับไปแล้ว
		String ChkCaseLast = request.getParameter("chkcaselast");
		long ConfigID = new Long(ConfigUtil.getConfig("ILL00009"));
		if(ChkCaseLast.equals("Y") && uData.chkUserRole(ConfigID)==true){
			this.writeTranLog("ILL00009: " + "แก้ไขข้อมูลรายการของกลางใน 2/4 ในคดีที่ออกใบเสร็จรับเงินไปแล้วเลขที่งาน " + aa.getTrack_no());
		}
		
		redirect("process?action=Insideprove&id=" + aa.getId() + "&track_no="+request.getParameter("track_no_p")+"&SaveMsg=1"+"&cmd=add",request, response);
	}

	public void preup(HttpServletRequest request, HttpServletResponse response)
			throws Exception {

		String sql;
		sql = "select  aa.lawbreak_type, aa.scene_name, aa.scene_no, aa.scene_moo, aa.scene_soi, aa.scene_road, aa.police_station, aa.accuser_poscode," + "\n "
				+ " aa.accuser_offcode, aa.issentcourt, aa.estimate_fine, aa.department_id, aa.department_name, aa.id, aa.track_no," + "\n "
				+ "aa.coordinate_x, aa.coordinate_y, aa.accuser_idcardno,  aa.SCENE_PROVINCE, aa.SCENE_SUBDISTRICT, aa.SCENE_DISTRICT," + "\n "
				+ "aa.occurrence_date, to_char(aa.occurrence_date, 'dd/mm/yyyy', 'NLS_CALENDAR=''THAI BUDDHA'' NLS_DATE_LANGUAGE=THAI') occurrence_date2, " + "\n "
				+ "to_char(aa.occurrence_date,'HH24:mi') occurrence_time, aa.product_group_id,dg.group_name product_group_name, aap.exhibit_report_no, " + "\n "
				+ "bi.case_date, to_char(bi.case_date, 'dd/mm/yyyy', 'NLS_CALENDAR=''THAI BUDDHA'' NLS_DATE_LANGUAGE=THAI') case_date2, " + "\n "
				+ "to_char(bi.case_date,'HH24:MI') case_time, nvl(sic.id,0) send_income_case_id," + "\n "
				+ "aa.application_date, to_char(aa.application_date, 'dd/mm/yyyy', 'NLS_CALENDAR=''THAI BUDDHA'' NLS_DATE_LANGUAGE=THAI')  application_date2, " + "\n "
				+ "bi.case_id, tia.title_name || sta.first_name || ' ' || sta.last_name accuser_name, aa.legislation_id, lg.legislation_name, " + "\n "
				+ "aa.offcode, nvl(aa.accuser_offname, nvl(sta.dept_name,eda.offname)) offname, nvl(aa.accuser_posname, nvl(sta.pos_name,ps.posname || ' ' || sta.staff_level)) posname, " + "\n "
				+ "aa.accuser_type, aa.have_culprit,pke_arrest.getLawbreakerQty(aa.track_no) aalsize, ed.indc_off  " + "\n "
				+ "from application_arrest aa " + "\n "
				+ "inner join book_impeachment bi on aa.track_no=bi.track_no " + "\n "
				+ "left join compare_case cc on cc.track_no=aa.track_no " + "\n "
				+ "left join v_accuser_list_popup sta on sta.idcard_no=aa.accuser_idcardno" + "\n "
				+ "left join title tia on tia.title_code=sta.title_code " + "\n "
				+ "inner join legislation lg on lg.id=aa.legislation_id " + "\n "
				+ "inner join duty_group dg on dg.group_id=aa.product_group_id " + "\n "
				+ "left join province pv on pv.province_code=aa.scene_province " + "\n "
				+ "left join district d on d.district_code=aa.scene_district " + "\n "
				+ "left join subdistrict sd on sd.subdistrict_code=aa.scene_subdistrict " + "\n "
				+ "left join application_arrest_prove aap on aa.track_no=aap.track_no " + "\n "
				+ "inner join ed_office ed on ed.offcode=aa.offcode " + "\n "
				+ "left join ed_office eda on eda.offcode=aa.accuser_offcode " + "\n "
				+ "left join position ps on ps.poscode=aa.accuser_poscode " + "\n "
				+ "left join send_income_case sic on sic.compare_case_id=cc.id \n" 
				+ " 	and sic.send_income_id in (select si.id from send_income si where si.status='1') \n" //นำส่งเงินแล้ว
				+ "where aa.del_flag='N' and aa.track_no =  ? ";
		String incsql;
		String apesql;
		ApplicationArrest aa = new ApplicationArrest(db);
		String vTrackNo = request.getParameter("track_no");
		List<Map<String, Object>> aad= aa.findBySql(sql, vTrackNo);
		//log.debug(sql);

		apesql = "select aae.id, aae.TRACK_NO ,  aae.PRODUCT_CODE," + "\n" 
			+ " aae.BRAND_CODE, aae.ISDOMESTIC, aae.SIZES_CODE," + "\n" 
			+ " aae.SIZE_UNIT_CODE, nvl(aae.sizes_unit_name, nvl(su.thname,su.enname)) size_unit_name, " + "\n" 
			+ " aae.QTY, aae.qty_unit_code, nvl(aae.qty_unit_name, nvl(qu.thname,qu.enname)) qty_unit_name, " + "\n" 
			+ " aae.NETWEIGHT, aae.NETWEIGHT_UNIT_CODE, nvl(aae.netweight_unit_name, nvl(wu.thname, wu.enname)) netweight_unit_name, " + "\n" 
			+ " aae.STATUS, aae.EXHIBIT_LIST, aae.EXHIBIT_DESC,aae.APP_ARREST_PROVE_EXHIBIT_ID co_id, " + "\n" 
			+ " aae.CAR_NO, aae.DUTY_CODE, aae.REMARKS," + "\n" 
			+ " aae.CREATE_BY, aae.CREATE_ON, aae.UPDATE_BY, aae.UPDATE_ON, " + "\n" 
			+ " replace(nvl(aae.brand_name,  nvl(b.brand_main_thai, b.brand_main_eng)),'" + Character.toString('"') + "','" + "\\" + "\"" + "') brand_name, " + "\n" 
			+ " dt.duty_name, nvl(aae.sizes_desc,sp.size_desc) size_desc, bi.case_id, " + "\n" 
			+ " nvl(aae.product_name, nvl(p.product_name,dt.duty_name)) product_name," + "\n"
			+ " dg.group_id, dg.group_name, case when aae.APP_ARREST_PROVE_EXHIBIT_ID is not null then 'Y' else 'N' end isexhibitco  \n"
			+ " from APP_ARREST_PROVE_EXHIBIT aae " + "\n" 
			+ " left join unit su on su.unit_code = aae.size_unit_code " + "\n" 
			+ " left join unit qu on qu.unit_code = aae.qty_unit_code " + "\n" 
			+ " left join application_arrest_exhibit ae on ae.id=aae.APP_ARREST_PROVE_EXHIBIT_ID " + "\n" 
			+ " left join unit wu on wu.unit_code = aae.netweight_unit_code " + "\n" 
			+ " left join brand_main b on b.group_id = aae.group_id and b.brand_main_code =aae.brand_code" + "\n" 
			+ " left join product p on p.product_code = aae.product_code" + "\n" 
			+ " left join size_package sp on sp.group_id = aae.group_id and sp.size_code = aae.sizes_code" + "\n" 
			+ " left join book_impeachment bi on bi.track_no = ae.track_no" + "\n" 
			+ " left join DUTY_TABLE dt on dt.duty_code=aae.duty_code" + "\n"
			+ " left join duty_group dg on dg.group_id=aae.group_id " + "\n"
			+ " where aae.track_no = ? \n" 
			+ " order by aae.id ";
		//log.debug(apesql);

		incsql = " SELECT ID, aai.CREATE_BY, aai.CREATE_ON, aai.UPDATE_BY, aai.TRACK_NO, "
				+ " aai.INDICTMENT_ID, aai.EXHIBIT_WILD,"
				+ " inc.case_law_id, inc.penalty_case_law_id, replace(inc.guilt_base,'" + Character.toString('"') + "','" + "\\" + "\"" + "') guilt_base ,"
				+ " inc.EXHIBIT_WILD"
				+ " FROM APPLICATION_ARREST_INDICTMENT aai"
				+ " left join indictment inc on inc.indictment_id = aai.indictment_id "
				+ " where aai.track_no = ?";

		ApplicationArrestIndictment inc = new ApplicationArrestIndictment(db);
		List<Map<String, Object>> inclist = inc.findBySql(incsql, vTrackNo);

		ApplicationArrestExhibit aae = new ApplicationArrestExhibit(db);
		List<ApplicationArrestExhibit> copaaelist = aae.findByWhere("track_no = ?", vTrackNo);
		
		AppArrestProveExhibit ape = new AppArrestProveExhibit(db);
		ApplicationArrestExhibit bufaae = new ApplicationArrestExhibit(db);
		List<AppArrestProveExhibit> apelist = ape.findByWhere("track_no = ?", vTrackNo);
		if(apelist.size()==0){
			
			for(int i=0;i<copaaelist.size();i++){
				ape = new AppArrestProveExhibit(db);
				bufaae = copaaelist.get(i);
				ape.setApp_arrest_prove_exhibit_id(bufaae.getApplication_arrest_exhibit_id());
				ape.setBrand_code(bufaae.getBrand_code());	
				ape.setCar_no(bufaae.getCar_no());
				ape.setCreate_by(create_by);
				ape.setCreate_on(create_on);
				ape.setGroup_id(bufaae.getGroup_id());
				ape.setDuty_code(bufaae.getDuty_code());
				ape.setExhibit_desc(bufaae.getExhibit_desc());
				ape.setExhibit_list(bufaae.getExhibit_list());
				ape.setIsdomestic((bufaae.getIsdomestic() != null ? bufaae.getIsdomestic().trim() : "Z"));
				ape.setNetweight(bufaae.getNetweight());
				ape.setNetweight_unit_code(bufaae.getNetweight_unit_code());
				ape.setProduct_code(bufaae.getProduct_code());
				ape.setQty(bufaae.getQty());
				ape.setQty_unit_code(bufaae.getQty_unit_code());
				ape.setRemarks(bufaae.getRemarks());
				ape.setSize_unit_code(bufaae.getSize_unit_code());
				ape.setSizes_code(bufaae.getSizes_code());
				ape.setStatus(bufaae.getStatus());
				ape.setTrack_no(bufaae.getTrack_no());
				ape.setNetweight_unit_name(bufaae.getNetweight_unit_name());
				ape.setQty_unit_name(bufaae.getQty_unit_name());
				ape.setSizes_unit_name(bufaae.getSizes_unit_name());
				ape.setSizes_desc(bufaae.getSizes_desc());
				ape.setBrand_name(bufaae.getBrand_name());
				ape.setProduct_name(bufaae.getProduct_name());
				ape.setDuty_name(bufaae.getDuty_name());
				ape.setGroup_name(bufaae.getGroup_name());
				ape.create();
			}
		}

		List<Map<String,Object>> apelistmap = ape.findBySql(apesql, request.getParameter("track_no"));
		request.setAttribute("aailist", inclist);
		request.setAttribute("aaelist", apelistmap);
		request.setAttribute("track_gen", aa.getTrack_no());
		if(aad.size()>0){
			request.setAttribute("db", aad.get(0));
			request.setAttribute("aalsize", aad.get(0).get("aalsize"));
		}
		//request.setAttribute("aa", aa);
		Map<String,Object> data = aad.get(0);
		request.setAttribute("accuser_idcardno", (data.get("accuser_idcardno") != null ? data.get("accuser_idcardno").toString() : ""));
        request.setAttribute("accuser_name", (data.get("accuser_name") != null ? data.get("accuser_name").toString() :""));
        request.setAttribute("accuser_poscode", (data.get("accuser_poscode") != null ? data.get("accuser_poscode").toString() : ""));
        request.setAttribute("accuser_posname", (data.get("posname") != null ? data.get("posname").toString() : ""));
        request.setAttribute("accuser_offcode", (data.get("accuser_offcode") != null ? data.get("accuser_offcode").toString() : ""));
        request.setAttribute("accuser_offname", (data.get("offname") != null ? data.get("offname").toString() : ""));
        
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

	String menuID = "17";
	public void list(HttpServletRequest request, HttpServletResponse response)throws Exception {
		if(uData.chkUserMenu(menuID)==true){
			pre(request,response);
			searchData(request,response);
			forward("?page=/ProveExhibit/attest_exhibit_search.jsp", request,response);
		}else{
    		HttpSession session = request.getSession();
  		  	session.invalidate();
  		  	request.setAttribute("errMsg", "ผู้ใช้ไม่มีสิทธิ์ดำเนินการ");
  		  	forward("?page=/login.jsp", request, response);
    	}
	}
	
	public boolean isNumeric(String s) {
	   try{
		   return s.matches("[-+]?\\d*\\?\\d+");
	   }catch (Exception e) {
		   return false ;
	   }
	}
	   

	   public void uplist(HttpServletRequest request, HttpServletResponse response,ApplicationArrestProve aap) throws Exception {
		
		    //xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxstart aaexxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx
		   AppArrestProveExhibit  caae = new AppArrestProveExhibit (db);
		    List<AppArrestProveExhibit > caaelist = caae.findByWhere("track_no = ?",request.getParameter("track_no_p"));
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
			
			//System.out.println("kkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkk");
		    if(aae_id != null){
		    //System.out.println(aae_id.length);}
		    //System.out.println("kkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkk");

			    if(request.getParameter("aae_id") != null){
			    	boolean chkdel=true;
			    	//System.out.println("chkdet = true");
				    for(int j = 0 ; j<caaelist.size() ;j++){
				    	chkdel= true;
				    	for(int k = 0; k<aae_id.length ;k++){
				    		//System.out.println(caaelist.get(j).getId()+"เทียบกับ"+aae_id[k]);
					    	if(aae_id[k].equals("")==false){
					    		if(Long.parseLong(aae_id[k])==caaelist.get(j).getId()){
					    			chkdel = false;
					    		//System.out.println("chkdet = false");
					    		}
					    	}
				    	}

				    	if(chkdel== true){
				    		//System.out.println(caaelist.get(j).getId()+"เทียบกับ"+aae_id[0]);
				    		caaelist.get(j).delete();
				    	}
				    }
				    
			    	for(int i = 0; i < aae_id.length;i++ ){
			    		boolean chkup = false ;
			    		AppArrestProveExhibit  aae  = new AppArrestProveExhibit (db);
			    		   //System.out.println(aae_id[i]);
			    		if(!aae_id[i].equals("")){
				    		chkup = true ;
				    		aae = aae.findByPk(Long.parseLong(aae_id[i]));
				    	}
			    		if(!aae_co_id[i].equals(""))
			    			aae.setApp_arrest_prove_exhibit_id(new Long(aae_co_id[i]));
		    			else
		    				aae.setApp_arrest_prove_exhibit_id(null);
			    		
		  	    		aae.setBrand_code(aae_brand_code[i]);
		  	    		aae.setCar_no(aae_car_no[i]);
		  	    		aae.setDuty_code(aae_duty_code[i]);
		  	    		aae.setGroup_id(aae_group_id[i]);
		  	    		aae.setExhibit_desc(aae_exhibit_desc[i]);
		  	    		aae.setExhibit_list(aae_exhibit_list[i]);
		  	    		aae.setIsdomestic(aae_isdomestic[i].trim());
		  	    		
		  	    		if(StringUtils.isNotBlank(aae_netweight[i]))
		  	    			aae.setNetweight(Double.parseDouble(aae_netweight[i]));
		  	    		else{
		  	    			aae.setNetweight(null);
		  	    		}

		  	    		aae.setNetweight_unit_code(aae_netweight_unit_code[i]);
		  	    		aae.setProduct_code(aae_product_code[i]);
			    		if(StringUtils.isNotBlank(aae_qty[i]))
			    		    aae.setQty(Double.parseDouble(aae_qty[i]));
			    		else{
			    			aae.setQty(null);
			    		}

		  	    		aae.setQty_unit_code(aae_qty_unit_code[i]);
		  	    		aae.setQty_unit_name(aae_qty_unit_code_text[i]);
		  	    		aae.setRemarks(aae_remarks[i]);		  	    		
		  	    		aae.setSize_unit_code(aae_sizes_unit_code[i]);
		  	    		aae.setSizes_code(aae_sizes_code[i]);
			    		aae.setStatus(Long.parseLong(aae_status[i]));
		  	    		aae.setTrack_no(request.getParameter("track_no_p"));
		  	    		aae.setProduct_name(aae_product_name[i]);
		  	    		aae.setBrand_name(aae_brand_name[i]);
		  	    		aae.setSizes_desc(aae_sizes_code_text[i]);
		  	    		aae.setSizes_unit_name(aae_sizes_unit_code_text[i]);
		  	    		aae.setNetweight_unit_name(aae_netweight_unit_code_text[i]);
		  	    		aae.setDuty_name(aae_duty_name[i]);
		  	    		aae.setGroup_name(aae_group_name[i]);
		  	    		
					    if(chkup == false){
					    	 //System.out.println("INSERT");
					    	 aae.setCreate_by(create_by);
					    	 aae.setCreate_on(create_on);
					    	 aae.create();
					    }else{
					        //System.out.println("UPDATE");
					    	aae.setUpdate_by(update_by);
			  	    		aae.setUpdate_on(update_on);
			  	    		aae.update();
			     		}
			    	}
			    }
			    //xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxend aaexxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx-
		   }
	}
}
