/**
 * produce by boonchai ( neng )
 * @author <a href="mailto:mr.boonchai@gmail.com">Mr.Boonchai Wedwanitsathein</a>
 */
package com.ko.webapp.action;

import com.ko.domain.*;
import com.ko.util.DateUtil;
import com.ko.util.RunningKey;
import org.jfree.chart.servlet.ServletUtilities;
import org.springframework.web.bind.ServletRequestBindingException;
import org.springframework.web.bind.ServletRequestUtils;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

public class AppReqApproveCompareAction extends BaseAction {
    SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy",new Locale("TH","th"));

    @Override
    public void _default(HttpServletRequest request, HttpServletResponse response) throws Exception {
        // TODO Auto-generated method stub
    }

    // list
    String menuID = "12";
    public void list(HttpServletRequest request, HttpServletResponse response) throws Exception {
    	if(uData.chkUserMenu(menuID)==true){
	        if (request.getParameter("doSearch") != null) {
	            writeTranLog("ค้นหาข้อมูลรายงานการขออนุมัติการเปรียบเทียบคดี");
	            String tmp = "";
	            String compare_case_from = ((tmp=request.getParameter("compare_case_no1"))!=null)?tmp:"";
	            String compare_case_to = ((tmp=request.getParameter("compare_case_no2"))!=null)?tmp:"";
	            String compare_case_date1 = ((tmp=request.getParameter("compare_case_date1"))!=null)?tmp:"";
	            String compare_case_date2 = ((tmp=request.getParameter("compare_case_date2"))!=null)?tmp:"";
	            String legislation_id = ((tmp=request.getParameter("legislation_id"))!=null)?tmp:"";
	            String offcode = ((tmp=request.getParameter("offcode"))!=null)?tmp:"";
	            String lawbreaker_name = ((tmp=request.getParameter("lawbreaker_name"))!=null)?tmp:"";
	            String sue_name = ((tmp=request.getParameter("sue_name"))!=null)?tmp:"";
	
	            String sql = "select aac.id app_req_approve_compare_id, aac.track_no, aa.legislation_id, lg.legislation_name, cc.compare_case_no,\n" +
	                    "aac.req_date, to_char(aac.req_date, 'dd/mm/yyyy', 'NLS_CALENDAR=''THAI BUDDHA'' NLS_DATE_LANGUAGE=THAI')  req_date2,\n" +
	                    "cc.compare_case_date, to_char(cc.compare_case_date, 'dd/mm/yyyy', 'NLS_CALENDAR=''THAI BUDDHA'' NLS_DATE_LANGUAGE=THAI') compare_case_date2,\n" +
	                    "aa.application_date, to_char(aa.application_date, 'dd/mm/yyyy', 'NLS_CALENDAR=''THAI BUDDHA'' NLS_DATE_LANGUAGE=THAI') application_date2,\n" +
	                    "ed.offcode, ed.offname, ti.title_name || st.first_name || ' ' || st.last_name sue_name, ced.short_name compare_offname, cc.id compare_case_id " +
	                    ",pke_arrest.getArrestLawbreaker(aa.track_no) lawbreaker_name\n" +
	                    "from compare_case cc\n" +
	                    "left join app_req_approve_compare aac on cc.id=aac.compare_case_id\n" +
	                    "inner join application_arrest aa on aa.track_no=cc.track_no\n" +
	                    "inner join legislation lg on lg.id=aa.legislation_id\n" +
	                    "left join ed_office ed on ed.offcode=aac.offcode\n" +
	                    "left join ed_office ced on ced.offcode=cc.compare_office\n" +
	                    "left join staff st on st.idcard_no=cc.sue_staff_idcardno\n" +
	                    "left join title ti on ti.title_code=st.title_code\n"+
	                    " where cc.pay_date is not null and cc.manage_type = '2' ";
	            	
	            String order = "order by aac.track_no desc";
	            String where = "";
	            List<Object> paramList =  new ArrayList<Object>();
	            
	            if(!request.getParameter("req_track_no_from").equals("")){
	            	sql += " and aac.track_no >= '" + request.getParameter("req_track_no_from").replace("'", "''").trim() + "'";
	            	request.setAttribute("req_track_no_from", request.getParameter("req_track_no_from"));
	            }
	            if(!request.getParameter("req_track_no_to").equals("")){
	            	sql += " and aac.track_no <= '" + request.getParameter("req_track_no_to").replace("'", "''").trim() + "'";
	            	request.setAttribute("req_track_no_to", request.getParameter("req_track_no_to"));
	            }
	            if(!request.getParameter("req_date_from").equals("")){
	            	sql += " and to_char(aac.req_date,'yyyy-mm-dd') >= '" + DateUtil.formatConditionDate(request.getParameter("req_date_from")) + "' ";
	            	request.setAttribute("req_date_from", request.getParameter("req_date_from"));
	            }
	            if(!request.getParameter("req_date_to").equals("")){
	            	sql += " and to_char(aac.req_date,'yyyy-mm-dd') <= '" + DateUtil.formatConditionDate(request.getParameter("req_date_to")) + "'";
	            	request.setAttribute("req_date_to", request.getParameter("req_date_to"));
	            }
	            
	            if(!compare_case_from.equals("")){
	                 request.setAttribute("compare_case_from",compare_case_from);
	                 if(!compare_case_to.equals("")){
	                     request.setAttribute("compare_case_to",compare_case_to);
	                     where += " and cc.compare_case_no between ? and ? ";
	                     paramList.add(compare_case_from);
	                     paramList.add(compare_case_to);
	                 }else{
	                     where += " and cc.compare_case_no = ? ";
	                     paramList.add(compare_case_from);
	                 }
	            }
	            if(!compare_case_date1.equals("")){
	                request.setAttribute("compare_case_date1",compare_case_date1);
	                 if(!compare_case_date2.equals("")){
	                     request.setAttribute("compare_case_date2",compare_case_date2);
	                     where += " and to_char(cc.compare_case_date,'yyyymmdd') between '" + DateUtil.formatConditionDate(compare_case_date1) + "' and '" + DateUtil.formatConditionDate(compare_case_date2) + "' ";
	                     //paramList.add(sdf.parse(compare_case_date1));
	                     //paramList.add(sdf.parse(compare_case_date2));
	                 }else{
	                     where += " and to_char(cc.compare_case_date,'yyyymmdd' >= '" + DateUtil.formatConditionDate(compare_case_date1) + "' ";
	                     //paramList.add(sdf.parse(compare_case_date1));
	                 }
	            }
	            if(!legislation_id.equals("")){
	                request.setAttribute("legislation_id",legislation_id);
	                where += " and lg.id = ? ";
	                paramList.add(Long.parseLong(legislation_id));
	            }
	            if(!offcode.equals("")){
	                request.setAttribute("offcode",offcode);
	                where += " and nvl(ed.offcode,ced.offcode) = ? ";
	                paramList.add(offcode);
	            }
	            if(!lawbreaker_name.equals("")){
	                request.setAttribute("lawbreaker_name",lawbreaker_name);
	                where += " and pke_arrest.getArrestLawbreaker(aa.track_no) like ? ";
	                paramList.add("%"+lawbreaker_name+"%");
	            }
	            if(!sue_name.equals("")){
	                request.setAttribute("sue_name",sue_name);
	                where += " and st.first_name like ? or st.last_name like ? ";
	                paramList.add("%"+sue_name+"%");
	                paramList.add("%"+sue_name+"%");
	            }
	
	            AppReqApproveCompare appReqApproveCompare = new AppReqApproveCompare(db);
	            // pageUtil.setPageSize(15);
	            log.debug(sql+(where.equals("")?"":where)+order);
	            List<Map<String,Object>> result = appReqApproveCompare.findBySql(sql+(where.equals("")?"":where)+order,paramList.toArray());
	            int totalRow = result.size();
	
	            // set TotalRow
	            pageUtil.setTotalRow(totalRow);
	            pageUtil.setPageSize(20);
	            result = appReqApproveCompare.findBySql(sql+(where.equals("")?"":where)+order,paramList.toArray(),pageUtil);
	            request.setAttribute("aacs", result);
	            
	        }
	        EdOffice ed = new EdOffice(db);
	        List<EdOffice> listEd = ed.findByWhere("1=1 order by " + EdOffice.SHORT_NAMECol, null);
	        request.setAttribute("eds", listEd);
	        Legislation le = new Legislation(db);
	        List<Legislation> les = le.findByWhere(" 1=1 order by " + Legislation.LEGISLATION_NAMECol, null);
	        request.setAttribute("les", les);
	
	        //	for screen to show
	        forward("?page=/CompareCase/AppReqApproveCompareList.jsp");
    	}else{
    		HttpSession session = request.getSession();
  		  	session.invalidate();
  		  	request.setAttribute("errMsg", "ผู้ใช้ไม่มีสิทธิ์ดำเนินการ");
  		  	forward("?page=/login.jsp", request, response);
    	}
    }

    //	 create
    public void add(HttpServletRequest request, HttpServletResponse response) throws Exception {
        forward("?page=/web/appReqApproveCompareCreate.jsp");
    }

    public void create(HttpServletRequest request, HttpServletResponse response) throws Exception {
        String ccID = request.getParameter("ccID");
        if (request.getParameter("completed") != null) {
            request.setAttribute("completed", "completed");
        }
        if (request.getParameter("failed") != null) {
            request.setAttribute("failed", "failed");
        }
        if (ccID != null && !ccID.trim().equals("")) {
        	String sql ="select nvl(aac.id,'') id , cc.id ccID ,nvl(aac.track_no,'NEW') track_no, aa.legislation_id, lg.legislation_name, cc.compare_case_no, ";
				sql += " aac.req_date, to_char(aac.req_date, 'dd/mm/yyyy', 'NLS_CALENDAR=''THAI BUDDHA'' NLS_DATE_LANGUAGE=THAI')  req_date2, ";
				sql += " cc.compare_case_date, to_char(cc.compare_case_date, 'dd/mm/yyyy', 'NLS_CALENDAR=''THAI BUDDHA'' NLS_DATE_LANGUAGE=THAI') compare_case_date2, ";
				sql += " cc.pay_date, to_char(cc.pay_date, 'dd/mm/yyyy', 'NLS_CALENDAR=''THAI BUDDHA'' NLS_DATE_LANGUAGE=THAI') pay_date2, ";
				sql += " nvl(ed.offcode,cc.compare_office) offcode, nvl(ed.short_name,ced.short_name) offname, stc.title_name || stc.first_name || ' ' || stc.last_name sue_name,  ";
				sql += " stc.posname sue_posname, aac.vehicle_name,aac.engine_no,aac.body_no,aac.hold_ship,aac.ownership,aac.rent_name,aac.contract,aac.contract_no, ";
				sql += " to_char(aac.contract_date, 'dd/mm/yyyy', 'NLS_CALENDAR=''THAI BUDDHA'' NLS_DATE_LANGUAGE=THAI') contract_date, ";
				sql += " aac.islawbreakerrent,aac.mistake_detail, inc.case_law_id,aac.compare_reason, cc.case_fine, aa.track_no aa_track_no ";
				sql += " from compare_case cc ";
				sql += " left join app_req_approve_compare aac on cc.id=aac.compare_case_id ";
				sql += " inner join application_arrest aa on aa.track_no=cc.track_no ";
				sql += " inner join legislation lg on lg.id=aa.legislation_id ";
				sql += " left join ed_office ed on ed.offcode=aac.offcode ";
				sql += " left join ed_office ced on ced.offcode=cc.compare_office ";
				sql += " left join v_staff_list_popup stc on stc.idcard_no=cc.sue_staff_idcardno ";
				//sql += " left join title tic on tic.title_code=stc.title_code ";
				//sql += " left join position psc on psc.poscode=trim(cc.sue_poscode) ";
				sql += " inner join indictment inc on inc.indictment_id=cc.indictment_id ";
				sql += " where cc.id = '" + ccID + "'";
                AppReqApproveCompare aac = new AppReqApproveCompare(db);
				Map<String,Object> aacList = aac.findBySql(sql).get(0);
                request.setAttribute("aac", aacList);
//log.debug(sql);
                String vTrackNo = aacList.get("aa_track_no").toString();
                
                String lSql = "";
                lSql += "select aal.id, pke_arrest.getLawbreakerName(aal.id) lawbreaker_full_name, aal.career, n.nation_name nationality_name, ";
                lSql += " aal.ismistake, aal.ismistake_desc";
                lSql += " from application_arrest_lawbreaker aal ";
                lSql += " left join nationality n on n.id=aal.nationality_id ";
                lSql += " where aal.track_no='" + vTrackNo + "'";
                ApplicationArrestLawbreaker aal = new ApplicationArrestLawbreaker(db);
                List<Map<String,Object>> aals = aal.findBySql(lSql);
                request.setAttribute("aals", aals);
                Double totalFine = 0d;
                if(aacList.get("case_fine") != null){
                    totalFine = Double.parseDouble(aacList.get("case_fine").toString()) * aals.size();
                    request.setAttribute("totalFine", totalFine);
                    
                    if (totalFine <= 100000.0) {
                        AppReqApproveCompareForm1 arf1 = new AppReqApproveCompareForm1(db);
                        List<AppReqApproveCompareForm1> listArf1 = arf1.findByWhere(AppReqApproveCompareForm1.APP_REQ_APPROVE_COMPARE_IDCol + "=?", aacList.get("id"));
                        if (listArf1.size() > 0) {
                        	request.setAttribute("sta1", arf1.setStaffDesc(listArf1.get(0).getId()));
                            request.setAttribute("arf1", listArf1.get(0));
                        }
                    } else if (totalFine <= 1000000.0) {
                        AppReqApproveCompareForm2 arf2 = new AppReqApproveCompareForm2(db);
                        List<AppReqApproveCompareForm2> listArf2 = arf2.findByWhere(AppReqApproveCompareForm2.APP_REQ_APPROVE_COMPARE_IDCol + "=?", aacList.get("id"));
                        if (listArf2.size() > 0) {
                        	request.setAttribute("sta2", arf2.setStaffDesc(listArf2.get(0).getId()));
                            request.setAttribute("arf2", listArf2.get(0));
                        }
                    } else if (totalFine > 1000000.0) {
                        AppReqApproveCompareForm3 arf3 = new AppReqApproveCompareForm3(db);
                        List<AppReqApproveCompareForm3> listArf3 = arf3.findByWhere(AppReqApproveCompareForm3.APP_REQ_APPROVE_COMPARE_IDCol + "=?", aacList.get("id"));
                        if (listArf3.size() > 0) {
                        	request.setAttribute("sta3", arf3.setStaffData(listArf3.get(0).getId()));
                            request.setAttribute("arf3", listArf3.get(0));
                        }
                    }
                }
                
                String eSql = "";
                eSql += " select nvl(aae.product_name,nvl(pd.product_name,dt.duty_name)) product_name, ";
                eSql += " nvl(aae.brand_name,nvl(bm.brand_main_thai,bm.brand_main_eng)) brand_name, ";
                eSql += " nvl(aae.sizes_desc,sp.size_desc) size_desc, nvl(aae.sizes_unit_name,su.thname) size_unit, ";
                eSql += " aae.qty, nvl(aae.qty_unit_name,qu.thname) qty_unit, ";
                eSql += " aae.netweight, nvl(aae.netweight_unit_name,nu.thname) netweight_unit ";
                eSql += " from application_arrest_exhibit aae ";
                eSql += " left join duty_table dt on dt.duty_code=aae.duty_code ";
                eSql += " left join product pd on pd.product_code=aae.product_code ";
                eSql += " left join brand_main bm on bm.brand_main_code=aae.brand_code and bm.group_id=aae.group_id ";
                eSql += " left join size_package sp on sp.size_code=aae.sizes_code and sp.group_id=aae.group_id ";
                eSql += " left join unit su on su.unit_code=aae.sizes_code ";
                eSql += " left join unit qu on qu.unit_code=aae.qty_unit_code ";
                eSql += " left join unit nu on nu.unit_code=aae.netweight_unit_code ";
                eSql += " where aae.track_no= '" + vTrackNo + "'";
                ApplicationArrestExhibit aah = new ApplicationArrestExhibit(db);
                List<Map<String,Object>> aahs = aah.findBySql(eSql);
                request.setAttribute("aahs", aahs);

        }
        EdOffice ed = new EdOffice(db);
        String edSql = "select offcode, short_name from ed_office order by short_name";
        request.setAttribute("eds", ed.findBySql(edSql));
        forward("?page=/CompareCase/AppReqApproveCompareForm.jsp");
    }

    // view
    public void view(HttpServletRequest request, HttpServletResponse response) throws Exception {
        String id = request.getParameter("id");
        if (id != null && !id.trim().equals("")) {
            AppReqApproveCompare appReqApproveCompare = new AppReqApproveCompare(db);
            appReqApproveCompare = appReqApproveCompare.findByPk(new Long(id));
            if (appReqApproveCompare != null) {
                request.setAttribute("appReqApproveCompare", appReqApproveCompare);
            } else {
                formHandler.setFormMessage("Error : Not Found with id " + id);
            }
        } else {
            formHandler.setFormMessage("Error : Please Enter id");
        }
        forward("?page=/web/appReqApproveCompareView.jsp");
    }

    // update
    public void edit(HttpServletRequest request, HttpServletResponse response) throws Exception {
        String id = request.getParameter("id");
        if (request.getParameter("completed") != null) {
            request.setAttribute("completed", "completed");
        }
        if (request.getParameter("failed") != null) {
            request.setAttribute("failed", "failed");
        }
        if (id != null && !id.trim().equals("")) {
            AppReqApproveCompare aac = new AppReqApproveCompare(db);
            aac = aac.findByPk(new Long(id));
            if (aac != null) {
                request.setAttribute("aac", aac);
                CompareCase cc = new CompareCase(db);
                cc = cc.findByPk(aac.getCompare_case_id());
                request.setAttribute("cc", cc);
                ApplicationArrest aa = new ApplicationArrest(db);
                aa = aa.findByWhere(ApplicationArrest.TRACK_NOCol + "=?", cc.getTrack_no()).get(0);
                request.setAttribute("aa", aa);
                ApplicationArrestLawbreaker aal = new ApplicationArrestLawbreaker(db);
                List<ApplicationArrestLawbreaker> aals = aal.findByWhere(ApplicationArrestLawbreaker.TRACK_NOCol + "=?", aa.getTrack_no());
                request.setAttribute("aals", aals);
                Double totalFine = 0d;
                if(cc.getCase_fine() != null)
                    totalFine = cc.getCase_fine() * aals.size();
                request.setAttribute("totalFine", totalFine);
                if (totalFine.doubleValue() <= 100000.0) {
                    AppReqApproveCompareForm1 arf1 = new AppReqApproveCompareForm1(db);
                    List<AppReqApproveCompareForm1> listArf1 = arf1.findByWhere(AppReqApproveCompareForm1.APP_REQ_APPROVE_COMPARE_IDCol + "=?", aac.getId());
                    if (listArf1.size() > 0) {
                        request.setAttribute("arf1", listArf1.get(0));
                    }
                } else if (totalFine.doubleValue() <= 1000000.0) {
                    AppReqApproveCompareForm2 arf2 = new AppReqApproveCompareForm2(db);
                    List<AppReqApproveCompareForm2> listArf2 = arf2.findByWhere(AppReqApproveCompareForm2.APP_REQ_APPROVE_COMPARE_IDCol + "=?", aac.getId());
                    if (listArf2.size() > 0) {
                        request.setAttribute("arf2", listArf2.get(0));
                    }
                } else if (totalFine.doubleValue() > 1000000.0) {
                    AppReqApproveCompareForm3 arf3 = new AppReqApproveCompareForm3(db);
                    List<AppReqApproveCompareForm3> listArf3 = arf3.findByWhere(AppReqApproveCompareForm3.APP_REQ_APPROVE_COMPARE_IDCol + "=?", aac.getId());
                    if (listArf3.size() > 0) {
                        request.setAttribute("arf3", listArf3.get(0));
                    }
                }
                ApplicationArrestExhibit aah = new ApplicationArrestExhibit(db);
                List<ApplicationArrestExhibit> aahs = aah.findByWhere(ApplicationArrestExhibit.TRACK_NOCol + "=?", aa.getTrack_no());
                request.setAttribute("aahs", aahs);
            } else {
                formHandler.setFormMessage("Error : Not Found with id " + id);
            }
        }
        Legislation le = new Legislation(db);
        request.setAttribute("les", le.findAll());
        EdOffice ed = new EdOffice(db);
        request.setAttribute("eds", ed.findAll());
        forward("?page=/CompareCase/AppReqApproveCompareForm.jsp");
    }

    public void update(HttpServletRequest request, HttpServletResponse response) throws Exception {
        writeTranLog("บันทึกข้อมูลรายงานการขออนุมัติการเปรียบเทียบคดี");
        AppReqApproveCompare aac = new AppReqApproveCompare(db);
        if(ServletRequestUtils.getLongParameter(request, "id") != null)
            aac = aac.findByPk(ServletRequestUtils.getLongParameter(request, "id"));
        ApplicationArrestLawbreaker aal = new ApplicationArrestLawbreaker(db);
        List<ApplicationArrestLawbreaker> aals;
        bindForm(aac);                                                           
        if(aac.getId() == null){
            aac.setCreate_by(create_by);
            aac.setCreate_on(create_on);
            aac.setTrack_no(new RunningKey(db).getRunningKey("APP_REQ_APPROVE_COMPARE", "", "", offcode));
            aac = aac.create();
        }else{
            aac.setUpdate_by(update_by);
            aac.setUpdate_on(update_on);
            aac = aac.update();
        }
        if (aac != null) {
            request.setAttribute("aac", aac);
            request.setAttribute("completed", "completed");
            redirect("process?action=AppReqApproveCompare&cmd=create&ccID=" + aac.getCompare_case_id() + "&completed=y");
            CompareCase cc = new CompareCase(db);
            cc = cc.findByPk(aac.getCompare_case_id());
            aals = aal.findByWhere(ApplicationArrestLawbreaker.TRACK_NOCol + "=?", cc.getTrack_no());

            Double totalFine = 0d;
            if(cc.getCase_fine() !=  null)
                totalFine = cc.getCase_fine() * aals.size();
            if (totalFine.doubleValue() <= 100000.0) {
                AppReqApproveCompareForm1 arf1 = new AppReqApproveCompareForm1(db);
                if (request.getParameter("arf1_id") != null) {
                    arf1 = arf1.findByPk(ServletRequestUtils.getLongParameter(request, "arf1_id"));
                    setAppReqApproveCompareForm1Parameter(arf1, request);
                    arf1.setUpdate_by(update_by);
                    arf1.setUpdate_on(update_on);
                    arf1.update();
                } else {
                    arf1.setCreate_by(create_by);
                    arf1.setCreate_on(create_on);
                    arf1.setApp_req_approve_compare_id(aac.getId());
                    setAppReqApproveCompareForm1Parameter(arf1, request);
                    arf1.create();
                }
            } else if (totalFine.doubleValue() <= 1000000.0) {
                AppReqApproveCompareForm2 arf2 = new AppReqApproveCompareForm2(db);
                if(request.getParameter("arf2_id") != null){
                	arf2 = arf2.findByPk(ServletRequestUtils.getLongParameter(request, "arf2_id"));
                	setAppReqApproveCompareForm2Parameter(arf2, request);
                	arf2.setUpdate_by(update_by);
                	arf2.setUpdate_on(update_on);
                	arf2.update();
                }else{
                	arf2.setCreate_by(create_by);
                	arf2.setCreate_on(create_on);
                	setAppReqApproveCompareForm2Parameter(arf2, request);
                	arf2.setApp_req_approve_compare_id(aac.getId());
                	arf2.create();
                }
            } else if (totalFine.doubleValue() > 1000000.0) {
                AppReqApproveCompareForm3 arf3 = new AppReqApproveCompareForm3(db);
                if(request.getParameter("arf3_id") != null){
                	arf3 = arf3.findByPk(new Long(request.getParameter("arf3_id").toString()));
                	setAppReqApproveCompareForm3Parameter(arf3, request);
                	arf3.setUpdate_by(update_by);
                	arf3.setUpdate_on(update_on);
                	arf3.update();
                }else{
                	arf3.setCreate_by(create_by);
                	arf3.setCreate_on(create_on);
                	setAppReqApproveCompareForm3Parameter(arf3, request);
                	arf3.setApp_req_approve_compare_id(aac.getId());
                	arf3.create();
                }
            }
            for (ApplicationArrestLawbreaker al : aals) {
                String tmp = "";
                if ((tmp = request.getParameter("ismistake_" + al.getId().longValue())) != null)
                    al.setIsmistake("Y");
                else
                    al.setIsmistake("N");
                if ((tmp = request.getParameter("ismistake_desc_" + al.getId().longValue())) != null)
                    al.setIsmistake_desc(tmp);
                al.update();
            }
            // update
        } else {
            request.setAttribute("failed", "failed");
            formHandler.setFormMessage("Update Failed");
            redirect("process?action=AppReqApproveCompare&cmd=edit&id=" + aac.getId() + "&failed=y");
        }

    }

    // delete
    public void delete(HttpServletRequest request, HttpServletResponse response) throws Exception {
        String[] ids = request.getParameterValues("id");
        if (ids != null && ids.length > 0) {
            AppReqApproveCompare appReqApproveCompare = new AppReqApproveCompare(db);
            List<Long> idList = new ArrayList<Long>();
            for (int i = 0; i < ids.length; i++)
                idList.add(new Long(ids[i]));
            int deleteRow = appReqApproveCompare.deleteByPks(idList);
            formHandler.setFormMessage(" Delete " + deleteRow + " Row Completed ");
        } else {
            formHandler.setFormMessage("Plese Select At Least One For Delete");
        }
        redirect("process2?action=AppReqApproveCompare&cmd=list");
    }

    private void setAppReqApproveCompareForm3Parameter(AppReqApproveCompareForm3 arf3, HttpServletRequest request){
    	arf3.setInform_to(request.getParameter("arf3_inform_to"));
    	arf3.setInform_for(request.getParameter("arf3_inform_for"));
    	arf3.setInform_date(DateUtil.getDateFromString(request.getParameter("arf3_inform_date")));
    	arf3.setStaff_id_inform(request.getParameter("arf3_staff_id_inform"));
    	arf3.setPoscode_inform(request.getParameter("arf3_poscode_inform"));
    	arf3.setOffcode_inform(request.getParameter("arf3_offcode_inform"));
    	arf3.setLawyer8_inform_to(request.getParameter("arf3_lawyer8_inform_to"));
    	arf3.setLawyer8_inform_for(request.getParameter("arf3_lawyer8_inform_for"));
    	arf3.setLawyer8_inform_date(DateUtil.getDateFromString(request.getParameter("arf3_lawyer8_inform_date")));
    	arf3.setStaff_id_lawyer8(request.getParameter("arf3_staff_id_lawyer8"));
    	arf3.setPoscode_lawyer8(request.getParameter(request.getParameter("arf3_poscode_lawyer8")));
    	arf3.setOffcode_lawyer8(request.getParameter(request.getParameter("arf3_offcode_lawyer8")));
    	arf3.setDirector_inform_to(request.getParameter("arf3_director_inform_to"));
    	arf3.setDirector_inform_for(request.getParameter("arf3_director_inform_for"));
    	arf3.setDirector_inform_date(DateUtil.getDateFromString(request.getParameter("arf3_director_inform_date")));
    	arf3.setStaff_id_director(request.getParameter("arf3_staff_id_director"));
    	arf3.setPoscode_director(request.getParameter("arf3_poscode_director"));
    	arf3.setOffcode_director(request.getParameter("arf3_offcode_director"));
    	arf3.setIsaccept(request.getParameter("arf3_isaccept"));
    	arf3.setAccept_desc(request.getParameter("arf3_accept_desc"));
    	arf3.setNoneaccept_desc(request.getParameter("arf3_noneaccept_desc"));
    	arf3.setStaff_id_accept(request.getParameter("arf3_staff_id_accept"));
    	arf3.setPoscode_accept(request.getParameter("arf3_poscode_accept"));
    	arf3.setOffcode_accept(request.getParameter("arf3_offcode_accept"));
    	arf3.setIsapprove(request.getParameter("arf3_isapprove"));
    	arf3.setApprove_desc(request.getParameter("arf3_approve_desc"));
    	arf3.setNoneapprove_desc(request.getParameter("arf3_noneapprove_desc"));
    	arf3.setApprove_date(DateUtil.getDateFromString(request.getParameter("arf3_approve_date")));
    	arf3.setStaff_id_approve(request.getParameter("arf3_staff_id_approve"));
    	arf3.setPoscode_approve(request.getParameter("arf3_poscode_approve"));
    	arf3.setOffcode_approve(request.getParameter("arf3_offcode_approve"));
    }
    
    private void setAppReqApproveCompareForm2Parameter(AppReqApproveCompareForm2 arf2, HttpServletRequest request) {
    	arf2.setInform_to(request.getParameter("arf2_inform_to"));
    	arf2.setInform_for(request.getParameter("arf2_inform_for"));
    	arf2.setInform_date(DateUtil.getDateFromString(request.getParameter("arf2_inform_date")));
    	arf2.setStaff_id_inform(request.getParameter("arf2_staff_id_inform"));
    	arf2.setPoscode_inform(request.getParameter("arf2_poscode_inform"));
    	arf2.setOffcode_inform(request.getParameter("arf2_offcode_inform"));
    	arf2.setDirector_inform_to(request.getParameter("arf2_director_inform_to"));
    	arf2.setDirector_inform_for(request.getParameter("arf2_director_inform_for"));
    	arf2.setDirector_inform_date(DateUtil.getDateFromString(request.getParameter("arf2_director_inform_date")));
    	arf2.setStaff_id_director(request.getParameter("arf2_staff_id_director"));
    	arf2.setPoscode_director(request.getParameter("arf2_poscode_director"));
    	arf2.setOffcode_director(request.getParameter("arf2_offcode_director"));
    	arf2.setIsaccept(request.getParameter("arf2_isaccept"));
    	arf2.setAccept_desc(request.getParameter("arf2_accept_desc"));
    	arf2.setNoneaccept_desc(request.getParameter("arf2_noneaccept_desc"));
    	arf2.setStaff_id_accept(request.getParameter("arf2_staff_id_accept"));
    	arf2.setPoscode_accept(request.getParameter("arf2_poscode_accept"));
    	arf2.setOffcode_accept(request.getParameter("arf2_offcode_accept"));
    	arf2.setIsapprove(request.getParameter("arf2_isapprove"));
    	arf2.setApprove_desc(request.getParameter("arf2_approve_desc"));
    	arf2.setNoneapprove_desc(request.getParameter("arf2_noneapprove_desc"));
    	arf2.setApprove_date(DateUtil.getDateFromString(request.getParameter("arf2_approve_date")));
    	arf2.setStaff_id_approve(request.getParameter("arf2_staff_id_approve"));
    	arf2.setPoscode_approve(request.getParameter("arf2_poscode_approve"));
    	arf2.setOffcode_approve(request.getParameter("arf2_offcode_approve"));
    }
    
    private void setAppReqApproveCompareForm1Parameter(AppReqApproveCompareForm1 arf1, HttpServletRequest request) {
        String tmp = "";
        try {
            if ((tmp = request.getParameter("arf1_approve_date")) != null && !tmp.equals(""))
                arf1.setApprove_date(sdf.parse(tmp));
            if ((tmp = request.getParameter("arf1_inform_date")) != null && !tmp.equals(""))
                arf1.setInform_date(sdf.parse(tmp));
        } catch (ParseException e) {
            e.printStackTrace();
        }
        if ((tmp = request.getParameter("arf1_inform_to")) != null)
            arf1.setInform_to(tmp);
        if ((tmp = request.getParameter("arf1_inform_for")) != null)
            arf1.setInform_for(tmp);
        if ((tmp = request.getParameter("arf1_staff_id_inform")) != null)
            arf1.setStaff_id_inform(tmp);
        if ((tmp = request.getParameter("arf1_poscode_inform")) != null)
            arf1.setPoscode_inform(tmp);
        if ((tmp = request.getParameter("arf1_offcode_inform")) != null)
            arf1.setOffcode_inform(tmp);
        if ((tmp = request.getParameter("arf1_isaccept")) != null) {
            arf1.setIsaccept(tmp);
            if (arf1.getIsaccept().equals("Y")) {
                if ((tmp = request.getParameter("arf1_accept_desc")) != null)
                    arf1.setAccept_desc(tmp);
                arf1.setNoneaccept_desc("");
            } else {
                if ((tmp = request.getParameter("arf1_noneaccept_desc")) != null)
                    arf1.setNoneaccept_desc(tmp);
                arf1.setAccept_desc("");
            }
        }
        if ((tmp = request.getParameter("arf1_staff_id_accept")) != null)
            arf1.setStaff_id_accept(tmp);
        if ((tmp = request.getParameter("arf1_poscode_accept")) != null)
            arf1.setPoscode_accept(tmp);
        if ((tmp = request.getParameter("arf1_offcode_accept")) != null)
            arf1.setOffcode_accept(tmp);
        if ((tmp = request.getParameter("arf1_isapprove")) != null) {
            arf1.setIsapprove(tmp);
            if (arf1.getIsapprove().equals("Y")) {
                if ((tmp = request.getParameter("arf1_approve_desc")) != null)
                    arf1.setApprove_desc(tmp);
                arf1.setNoneapprove_desc("");
            } else {
                if ((tmp = request.getParameter("arf1_noneapprove_desc")) != null)
                    arf1.setNoneapprove_desc(tmp);
                arf1.setApprove_desc("");
            }
        }
        if ((tmp = request.getParameter("arf1_staff_id_approve")) != null)
            arf1.setStaff_id_approve(tmp);
        if ((tmp = request.getParameter("arf1_poscode_approve")) != null)
            arf1.setPoscode_approve(tmp);
        if ((tmp = request.getParameter("arf1_offcode_approve")) != null)
            arf1.setOffcode_approve(tmp);

    }
}