/**
 * produce by boonchai ( neng )
 * @author <a href="mailto:mr.boonchai@gmail.com">Mr.Boonchai Wedwanitsathein</a>
 */
package com.ko.webapp.action;

import com.ko.domain.*;
import com.ko.util.DB;
import com.ko.util.DateUtil;
import com.ko.util.RunningKey;
import org.json.JSONArray;
import org.json.JSONObject;
import org.springframework.web.bind.ServletRequestUtils;
import com.ko.webapp.util.InvoiceUtil;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import java.sql.PreparedStatement;
import java.text.SimpleDateFormat;
import java.util.*;

public class CompareCaseChangeAction extends BaseAction {
    @Override
    public void _default(HttpServletRequest request, HttpServletResponse response) throws Exception {
        // TODO Auto-generated method stub
    }

    SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy", new Locale("TH", "th"));

    // list
    String menuID = "14";
    public void list(HttpServletRequest request, HttpServletResponse response) throws Exception {
    	if(uData.chkUserMenu(menuID)==true){
	    	request.setAttribute("IsAdmin", (uData.IsAdmin()==true ? "1" : "0"));
	    	request.setAttribute("compare_office", offcode);
	    	request.setAttribute("ed_offname", uData.getShortName());
	    	if (request.getParameter("doSearch") != null) {
	            String sql = "select ccc.id compare_case_change_id, cc.id compare_case_id, cc.compare_case_no, \n" +
	                    "cc.compare_case_date, to_char(cc.compare_case_date, 'dd/mm/yyyy', 'NLS_CALENDAR=''THAI BUDDHA'' NLS_DATE_LANGUAGE=THAI') compare_case_date2,\n" +
	                    "cc.compare_office compare_offcode, ed.offname compare_name, nvl(cc.case_fine,0) old_fine ,nvl(ccc.change_money,0) new_fine,\n" +
	                    "case when nvl(cc.case_fine,0)<nvl(ccc.change_money,0) then 'D' else 'I' end change_type_code, case when nvl(cc.case_fine,0)<nvl(ccc.change_money,0) then 'ปรับเพิ่ม' else 'ปรับลด' end change_type_name, \n" +
	                    "pke_arrest.getLawBreakerQty(cc.track_no) lawbreakerQty, ccc.change_date, aa.track_no \n" +
	                    "from compare_case_change ccc\n" +
	                    "inner join compare_case cc on cc.id=ccc.compare_case_id\n" +
	                    "inner join application_arrest aa on aa.track_no=cc.track_no\n" +
	                    "inner join legislation lg on lg.id=aa.legislation_id\n" +
	                    "inner join ed_office ed on ed.offcode=cc.compare_office\n" +
	                    "inner join application_arrest_lawbreaker aal on aal.track_no=aa.track_no\n";
	            String count = "select count(distinct ccc.id) \n" +
	                    "from compare_case_change ccc\n" +
	                    "inner join compare_case cc on cc.id=ccc.compare_case_id\n" +
	                    "inner join application_arrest aa on aa.track_no=cc.track_no\n" +
	                    "inner join legislation lg on lg.id=aa.legislation_id\n" +
	                    "inner join ed_office ed on ed.offcode=cc.compare_office\n" +
	                    "inner join application_arrest_lawbreaker aal on aal.track_no=aa.track_no\n";
	            String group_by =
	                    " group by ccc.id , cc.id , cc.compare_case_no, \n" +
	                            "cc.compare_case_date, to_char(cc.compare_case_date, 'dd/mm/yyyy', 'NLS_CALENDAR=''THAI BUDDHA'' NLS_DATE_LANGUAGE=THAI') ,\n" +
	                            "cc.compare_office , ed.offname , nvl(cc.case_fine,0)  ,nvl(ccc.change_money,0),\n" +
	                            "case when nvl(cc.case_fine,0)<nvl(ccc.change_money,0) then 'D' else 'I' end , \n" +
	                            "case when nvl(cc.case_fine,0)<nvl(ccc.change_money,0) then 'ปรับเพิ่ม' else 'ปรับลด' end " +
	                            ",pke_arrest.getLawBreakerQty(cc.track_no),ccc.change_date, aa.track_no";
	            String compare_case_no = ServletRequestUtils.getStringParameter(request, "compare_case_no");
	            String start_date = DateUtil.formatConditionDate(ServletRequestUtils.getStringParameter(request, "start_date"));
	            String end_date = DateUtil.formatConditionDate(ServletRequestUtils.getStringParameter(request, "end_date"));
	            String legislation_id = ServletRequestUtils.getStringParameter(request, "legislation_id");
	            String compare_office = ServletRequestUtils.getStringParameter(request, "compare_office");
	            String case_fine = ServletRequestUtils.getStringParameter(request, "case_fine");
	            //gen query string
	            String query = "select distinct " + CompareCase.IDColumn + " from " + CompareCase.TABLE_NAME;
	            StringBuffer[] condition = new StringBuffer[2];
	            List<Object> listObjs = new ArrayList<Object>();
	            condition[0] = new StringBuffer();
	            condition[1] = new StringBuffer();
	            String where = "";
	            if (compare_case_no != null && !compare_case_no.equals("")) {
	                request.setAttribute("compare_case_no", compare_case_no);
	                where += " and cc.compare_case_no like ? ";
	                listObjs.add(new String("%" + compare_case_no + "%"));
	            }
//	            
	            if(!start_date.equals("")){
	            	request.setAttribute("start_date", start_date);
	            	where += " and to_char(cc.compare_case_date,'yyyymmdd') >= '" + start_date + "'";
	            }
	            if(!end_date.equals("")){
	            	request.setAttribute("end_date", end_date);
	            	where += " and to_char(cc.compare_case_date, 'yyyymmdd') <= '" + end_date + "'";
	            }
	            if (!legislation_id.equals("")) {
	                request.setAttribute("legislation_id", legislation_id);
	                where += " and lg.id = ? ";
	                listObjs.add(Long.parseLong(legislation_id));
	            }
	            if (!compare_office.equals("")) {
	                request.setAttribute("compare_office", compare_office);
	                where += " and ed.offcode = ? ";
	                listObjs.add(compare_office);
	            }
	            if (case_fine != null && !case_fine.equals("")) {
	                request.setAttribute("case_fine", case_fine);
	                if (case_fine.equals("I")) {
	                    where += " and nvl(cc.case_fine,0)<=nvl(ccc.change_money,0) ";
	                } else {
	                    where += " and nvl(cc.case_fine,0)>nvl(ccc.change_money,0) ";
	                }
	            }
	            CompareCase cc = new CompareCase(db);
	            int totalRow = cc.countBySql(count + (where.equals("") ? "" : where) + group_by, listObjs.toArray());
	            // pageUtil.setPageSize(15);
	
	            // set TotalRow
	            pageUtil.setTotalRow(totalRow);
	            log.debug(sql + (where.equals("") ? "" : "where 1=1 " + where) + group_by + " order by ccc.change_date desc");
	            List<Map<String, Object>> result = cc.findBySql(sql + (where.equals("") ? "" : "where 1=1 " + where) + group_by + " order by ccc.change_date desc", listObjs.toArray(), pageUtil);
	            request.setAttribute("result", result);
	            
	            request.setAttribute("compare_office", compare_office);
	        	request.setAttribute("ed_offname", ServletRequestUtils.getStringParameter(request, "ed_offname"));
	
	        }
	
	        Legislation le = new Legislation(db);
	        List<Legislation> les = le.findByWhere(" 1=1 order by " + Legislation.LEGISLATION_NAMECol, null);
	        request.setAttribute("les", les);
	
	        //	for screen to show
	        forward("?page=/CompareCase/compare_case_change_list.jsp");
    	}else{
    		HttpSession session = request.getSession();
  		  	session.invalidate();
  		  	request.setAttribute("errMsg", "ผู้ใช้ไม่มีสิทธิ์ดำเนินการ");
  		  	forward("?page=/login.jsp", request, response);
    	}
    }

    //	 create
    public void add(HttpServletRequest request, HttpServletResponse response) throws Exception {
        writeTranLog("เพิ่มข้อมูลการเพิ่ม-ลดค่าปรับเปรียบเทียบ");
        String page = "?page=/CompareCase/compare_case_change_form.jsp";
        
        if (ServletRequestUtils.getLongParameter(request, "ccid") != null) {
        	CompareCase compareCase = new CompareCase(db);
        	compareCase = compareCase.findByPk(ServletRequestUtils.getLongParameter(request, "ccid"));
            request.setAttribute("cc", compareCase);
            ApplicationArrest aa = new ApplicationArrest(db);
            List<ApplicationArrest> leList = aa.findByWhere(" track_no = ? ", compareCase.getTrack_no());
            request.setAttribute("legislation_id", leList.get(0).getLegislation_id());
            
            CompareCaseChange ccc = new CompareCaseChange(db);
            List<CompareCaseChange> listCCC = ccc.findByWhere(CompareCaseChange.COMPARE_CASE_IDCol + "=?", compareCase.getId());
            if (listCCC.size() > 0) {
                ccc = listCCC.get(0);
                request.setAttribute("ccc", ccc);
                request.setAttribute("action", "process?action=CompareCaseChange&cmd=add&ccid=" + compareCase.getId());
            }else{
            	request.setAttribute("action", "process?action=CompareCaseChange&cmd=add");
            }
            request.setAttribute("cci", compareCaseChangeItem(ServletRequestUtils.getLongParameter(request, "ccid").toString()));
        }else{
        	request.setAttribute("action", "process?action=CompareCaseChange&cmd=add");
        }
        Legislation le = new Legislation(db);
        List<Legislation> les = le.findByWhere(" 1=1 order by " + Legislation.LEGISLATION_NAMECol, null);
        request.setAttribute("les", les);
        request.setAttribute("offcode", offcode);
        forward(page,request,response);
    }

    public Long createChangeFromInvoice(HttpServletRequest request, HttpServletResponse response) throws Exception {
        CompareCaseChange ccc = new CompareCaseChange(db);
        CompareCase cc = new CompareCase(db);
        Long ccid = ServletRequestUtils.getLongParameter(request, "ccid");
        if (ccid != null) {
            cc = cc.findByPk(ccid);
            List<CompareCaseChange> listCCC = ccc.findByWhere(CompareCaseChange.COMPARE_CASE_IDCol + "=?", cc.getId());
            if (listCCC.size() == 0) {
                ccc.setCompare_case_id(cc.getId());
                ccc.setCreate_by(create_by);
                ccc.setCreate_on(create_on);
                ccc.setChange_date(new Date());
                ccc.setChange_type(ServletRequestUtils.getStringParameter(request, "change_type"));
                ccc.setInv_type(ServletRequestUtils.getStringParameter(request, "inv_type"));
                ccc.setChange_reason(ServletRequestUtils.getStringParameter(request, "change_reason"));
                ccc.setBribe_money_old(ServletRequestUtils.getDoubleParameter(request, "birbe_money_old"));
                ccc.setReward_money_old(ServletRequestUtils.getDoubleParameter(request, "reward_money_old"));
                ccc.setTreasury_money_old(ServletRequestUtils.getDoubleParameter(request, "treasury_money_old"));
                ccc.setCase_fine_old(ServletRequestUtils.getDoubleParameter(request, "case_fine_old"));
                ccc.setChange_money(ServletRequestUtils.getDoubleParameter(request, "case_fine_new"));
                ccc = ccc.create();
            } else {
                ccc = listCCC.get(0);
                ccc.setChange_date(new Date());
                ccc.setChange_type(ServletRequestUtils.getStringParameter(request, "change_type"));
                ccc.setInv_type(ServletRequestUtils.getStringParameter(request, "inv_type"));
                ccc.setChange_reason(ServletRequestUtils.getStringParameter(request, "change_reason"));
                ccc.setBribe_money_old(ServletRequestUtils.getDoubleParameter(request, "birbe_money_old"));
                ccc.setReward_money_old(ServletRequestUtils.getDoubleParameter(request, "reward_money_old"));
                ccc.setTreasury_money_old(ServletRequestUtils.getDoubleParameter(request, "treasury_money_old"));
                ccc.setCase_fine_old(ServletRequestUtils.getDoubleParameter(request, "case_fine_old"));
                ccc.setChange_money(ServletRequestUtils.getDoubleParameter(request, "case_fine_new"));
                ccc.setUpdate_by(update_by);
                ccc.setUpdate_on(update_on);
                ccc.update();
            }
            cc.setUpdate_by(update_by);
            cc.setUpdate_on(update_on);
            cc.setCase_fine(ServletRequestUtils.getDoubleParameter(request, "case_fine_new"));
            cc.setBirbe_money(ServletRequestUtils.getDoubleParameter(request, "birbe_money_new"));
            cc.setReward_money(ServletRequestUtils.getDoubleParameter(request, "reward_money_new"));
            cc.setTreasury_money(ServletRequestUtils.getDoubleParameter(request, "treasury_money_new"));
            cc.setInv_type(ccc.getInv_type());
            cc.setCompare_authority_id(1l);
            cc.update();
        }
        return ccc.getId();
    }

    private List<Map<String,Object>> compareCaseChangeItem(String ccID) throws Exception {
    	List<Map<String,Object>> ret = null;
    	String sql = "";
    	sql += " select cci.id, aal.id application_arrest_lawbreaker, pke_arrest.getLawbreakerName(aal.id) lawbreaker_name,";
    	sql += " nvl(cci.auto_inv_no,'') invcode , nvl(cci.paper_no,'') paper_no, nvl(cci.book_no,'') book_no, nvl(cci.inv_no,'') inv_no, nvl(ccc.change_money,0)-nvl(ccc.case_fine_old,0) fine,";
    	sql += " nvl(aal.invcode,'') old_invcode, nvl(aal.book_no,'') old_book_no, nvl(aal.inv_no,'') old_inv_no";
    	sql += " from application_arrest_lawbreaker aal";
    	sql += " left join compare_case_change_item cci on cci.application_arrest_lawbreaker=aal.id ";
    	sql += " left join compare_case_change ccc on ccc.id=cci.compare_case_change_id ";
    	sql += " inner join compare_case cc on cc.track_no=aal.track_no ";
    	sql += " where cc.id = '" + ccID + "'"; 
    	log.debug("compareCaseChangeItem  " + sql);
    	CompareCaseChangeItem cci = new CompareCaseChangeItem(db);
    	InvoiceUtil inv = new InvoiceUtil();
    	inv.setOffcode(offcode);
    	//ret = inv.getRunInvCompareChange(db,  cci.findBySql(sql));
    	ret = cci.findBySql(sql);

    	return ret;
    }
    
    public void createChange(HttpServletRequest request, HttpServletResponse response) throws Exception {
        CompareCaseChange ccc = new CompareCaseChange(db);
        CompareCase cc = new CompareCase(db);
        Long ccid = ServletRequestUtils.getLongParameter(request, "ccid");
        if (ccid != null) {
            cc = cc.findByPk(ccid);
            ApplicationArrest aa = new ApplicationArrest(db);
            List<ApplicationArrest> leList = aa.findByWhere(" track_no = ? ", cc.getTrack_no());
            request.setAttribute("legislation_id", leList.get(0).getLegislation_id());
            List<CompareCaseChange> listCCC = ccc.findByWhere(CompareCaseChange.COMPARE_CASE_IDCol + "=?", cc.getId());
            if (listCCC.size() == 0) {
                ccc.setCompare_case_id(cc.getId());
                ccc.setCreate_by(create_by);
                ccc.setCreate_on(create_on);
                ccc.setChange_date(new Date());
                ccc.setChange_type(ServletRequestUtils.getStringParameter(request, "change_type"));
                ccc.setInv_type(ServletRequestUtils.getStringParameter(request, "inv_type"));
                ccc.setChange_reason(ServletRequestUtils.getStringParameter(request, "change_reason"));
                ccc.setBribe_money_old(!request.getParameter("birbe_money_old").equals("") ? new Double(request.getParameter("birbe_money_old").replaceAll(",", "")) : null);
                ccc.setReward_money_old(!request.getParameter("reward_money_old").equals("") ? new Double(request.getParameter("reward_money_old").replaceAll(",", "")) : null);
                ccc.setTreasury_money_old(!request.getParameter("treasury_money_old").equals("") ? new Double(request.getParameter("treasury_money_old").replaceAll(",", "")) : null);
                ccc.setCase_fine_old(!request.getParameter("case_fine_old").equals("") ? new Double(request.getParameter("case_fine_old").replaceAll(",", "")) : null);
                ccc.setChange_money(!request.getParameter("case_fine_new").equals("") ? new Double(request.getParameter("case_fine_new").replaceAll(",", "")) : null);
                ccc.setIscancel("N");
                ccc.setCancel_date(null);
                ccc.setCancel_by(null);
                if(ccc.getChange_type().equals("1")){
                	//ปรับเพิ่ม
                	ccc.setSend_income_status("1");
                }else{
                	ccc.setSend_income_status("0");
                }
                ccc = ccc.create();
            } else {
                ccc = listCCC.get(0);
                ccc.setChange_date(new Date());
                ccc.setChange_type(ServletRequestUtils.getStringParameter(request, "change_type"));
                ccc.setInv_type(ServletRequestUtils.getStringParameter(request, "inv_type"));
                ccc.setChange_reason(ServletRequestUtils.getStringParameter(request, "change_reason"));
                ccc.setBribe_money_old(!request.getParameter("birbe_money_old").equals("") ? new Double(request.getParameter("birbe_money_old").replaceAll(",", "")) : null);
                ccc.setReward_money_old(!request.getParameter("reward_money_old").equals("") ? new Double(request.getParameter("reward_money_old").replaceAll(",", "")) : null);
                ccc.setTreasury_money_old(!request.getParameter("treasury_money_old").equals("") ? new Double(request.getParameter("treasury_money_old").replaceAll(",", "")) : null);
                ccc.setCase_fine_old(!request.getParameter("case_fine_old").equals("") ? new Double(request.getParameter("case_fine_old").replaceAll(",", "")) : null);
                ccc.setChange_money(!request.getParameter("case_fine_new").equals("") ? new Double(request.getParameter("case_fine_new").replaceAll(",", "")) : null);
                ccc.setIscancel("N");
                ccc.setCancel_date(null);
                ccc.setCancel_by(null);
                ccc.setUpdate_by(update_by);
                ccc.setUpdate_on(update_on);
                if(ccc.getChange_type().equals("1")){
                	//ปรับเพิ่ม
                	ccc.setSend_income_status("1");
                }else{
                	ccc.setSend_income_status("0");
                }
                ccc.update();
            }
            if (ccc.getChange_type().equals("1")) {
                if (ccc.getInv_type().equals("M")) {
                    String[] man_book_no = request.getParameterValues("man_book_no");
                    String[] man_inv_no = request.getParameterValues("man_inv_no");
                    String[] man_lb_id = request.getParameterValues("man_lb_id");
                    String[] man_cc_id = request.getParameterValues("cci_id");
                    for (int i = 0; i < man_lb_id.length; i++) {
                        CompareCaseChangeItem cci = new CompareCaseChangeItem(db);
                        
                        if(!man_cc_id[i].equals("") && man_cc_id[i] != null){
                        	cci = cci.findByPk(new Long(man_cc_id[i]));
                        	cci.setApplication_arrest_lawbreaker(Long.parseLong(man_lb_id[i]));
                            cci.setBook_no(man_book_no[i]);
                            cci.setInv_no(man_inv_no[i]);
                            cci.setCompare_case_change_id(ccc.getId());
                            cci.setUpdate_by(update_by);
                            cci.setUpdate_on(update_on);
                            cci.update();
                        }else{
                        	cci.setApplication_arrest_lawbreaker(Long.parseLong(man_lb_id[i]));
                            cci.setBook_no(man_book_no[i]);
                            cci.setInv_no(man_inv_no[i]);
                            cci.setCompare_case_change_id(ccc.getId());
	                        cci.setCreate_by(create_by);
	                        cci.setCreate_on(create_on);
	                        cci.create();
                        }
                    }
                } else {
                	String[] lb_id = request.getParameterValues("application_arrest_lawbreaker");
                	String[] paper_no = request.getParameterValues("auto_paper_no");
                	String[] invcode = request.getParameterValues("invcode");
                	String[] cc_id = request.getParameterValues("cci_id");
                	
                	for(int i=0;i<invcode.length;i++){
	                	CompareCaseChangeItem cci = new CompareCaseChangeItem(db);
	                	if(!cc_id[i].equals("") && cc_id[i] != null){
	                		cci = cci.findByPk(new Long(cc_id[i]));
	                		cci.setApplication_arrest_lawbreaker(Long.parseLong(lb_id[i]));
		                    cci.setPaper_no(paper_no[i]);
		                    cci.setAuto_inv_no(invcode[i]);
		                    cci.setCompare_case_change_id(ccc.getId());
		                    cci.setUpdate_by(update_by);
		                    cci.setUpdate_on(update_on);
		                    cci.update();
	                	}else{
		                    cci.setApplication_arrest_lawbreaker(Long.parseLong(lb_id[i]));
		                    cci.setPaper_no(paper_no[i]);
		                    String vRunInvCode = new RunningKey(db).getRunningKey("V_RUNNING_INVCODE", "", "", cc.getCompare_office());
		                    cci.setAuto_inv_no(vRunInvCode);
		                    cci.setCompare_case_change_id(ccc.getId());
		                    cci.setCreate_by(create_by);
		                    cci.setCreate_on(create_on);
		                    cci.create();
	                	}
                	}
                }
            }
            
            request.setAttribute("cci", compareCaseChangeItem(ccid.toString()));
            request.setAttribute("SaveMSG", "Y");
            
            //cc.setUpdate_by(update_by);
            //cc.setUpdate_on(update_on);
            //cc.setCase_fine(ServletRequestUtils.getDoubleParameter(request, "case_fine_new"));
            //cc.setBirbe_money(ServletRequestUtils.getDoubleParameter(request, "birbe_money_new"));
            //cc.setReward_money(ServletRequestUtils.getDoubleParameter(request, "reward_money_new"));
            //cc.setTreasury_money(ServletRequestUtils.getDoubleParameter(request, "treasury_money_new"));
            //cc.setInv_type(ccc.getInv_type());
            //cc.setCompare_authority_id(1l);
            //cc.update();
        }
        request.setAttribute("cc", cc);
        request.setAttribute("ccc", ccc);
        cc.setBirbe_money(ccc.getBribe_money_old());
        cc.setReward_money(ccc.getReward_money_old());
        cc.setCase_fine(ccc.getCase_fine_old());
        cc.setTreasury_money(ccc.getTreasury_money_old());
        Legislation le = new Legislation(db);
        List<Legislation> les = le.findByWhere(" 1=1 order by " + Legislation.LEGISLATION_NAMECol, null);
        request.setAttribute("les", les);
        request.setAttribute("offcode", offcode);
        //forward("?page=/CompareCase/compare_case_change_edit.jsp", request, response);
        forward("?page=/CompareCase/compare_case_change_form.jsp", request, response);
    }

    public void create(HttpServletRequest request, HttpServletResponse response) throws Exception {
        CompareCase compareCase = new CompareCase(db);
        bindForm(compareCase);
        compareCase = compareCase.create();
        if (compareCase != null)
            formHandler.setFormMessage("Create Completed ,view <a href='process2?action=CompareCase&cmd=view&id=" + compareCase.getId() + "' target='_blank'>new Record</a>");
        else
            formHandler.setFormMessage("Create Not Complete");
        redirect("process2?action=CompareCase&cmd=add");
    }

    // view
    public void view(HttpServletRequest request, HttpServletResponse response) throws Exception {
        String id = request.getParameter("id");
        if (id != null && !id.trim().equals("")) {
            CompareCase compareCase = new CompareCase(db);
            compareCase = compareCase.findByPk(new Long(id));
            if (compareCase != null) {
                request.setAttribute("compareCase", compareCase);
            } else {
                formHandler.setFormMessage("Error : Not Found with id " + id);
            }
        } else {
            formHandler.setFormMessage("Error : Please Enter id");
        }
        forward("?page=/web/compareCaseView.jsp");
    }

    // update
    public void edit(HttpServletRequest request, HttpServletResponse response) throws Exception {
        String id = request.getParameter("id");
        if (id != null && !id.trim().equals("")) {
            CompareCase compareCase = new CompareCase(db);
            compareCase = compareCase.findByPk(new Long(id));
            if (compareCase != null) {
                request.setAttribute("compareCase", compareCase);
            } else {
                formHandler.setFormMessage("Error : Not Found with id " + id);
            }
        }
        forward("?page=/web/compareCaseEdit.jsp");
    }

    public void update(HttpServletRequest request, HttpServletResponse response) throws Exception {
        CompareCase compareCase = new CompareCase(db);
        bindForm(compareCase);
        compareCase = compareCase.update();
        if (compareCase != null) {
            request.setAttribute("compareCase", compareCase);
            formHandler.setFormMessage("Update Completed");
        } else {
            formHandler.setFormMessage("Update Failed");
        }
        forward("?page=/web/compareCaseEdit.jsp");
    }

    // delete
    public void delete(HttpServletRequest request, HttpServletResponse response) throws Exception {
        String[] ids = request.getParameterValues("id");
        if (ids != null && ids.length > 0) {
            CompareCase compareCase = new CompareCase(db);
            List<Long> idList = new ArrayList<Long>();
            for (int i = 0; i < ids.length; i++)
                idList.add(new Long(ids[i]));
            int deleteRow = compareCase.deleteByPks(idList);
            formHandler.setFormMessage(" Delete " + deleteRow + " Row Completed ");
        } else {
            formHandler.setFormMessage("Plese Select At Least One For Delete");
        }
        redirect("process2?action=CompareCase&cmd=list");
    }

    public void openEdPopup(HttpServletRequest request, HttpServletResponse response) throws Exception {
        EdOffice ed = new EdOffice(db);
        List<EdOffice> eds = ed.findAll();
        request.setAttribute("eds", eds);
        request.setAttribute("compare_office", request.getParameter("compare_office"));
        request.setAttribute("ed_offname", request.getParameter("ed_offname"));
        forward("/Popup/ed_office_pop.jsp");
    }

    public void openCompareCasePopup(HttpServletRequest request, HttpServletResponse response) throws Exception {
        
    	String compare_case_no = "";
    	if(request.getParameter("txtCompareCaseNo") != null){
    		compare_case_no = request.getParameter("txtCompareCaseNo");
    		request.setAttribute("compare_case_no", compare_case_no);
    	}
    	
    	Long legislation_id = ServletRequestUtils.getLongParameter(request, "legislation_id");
    	request.setAttribute("legislation_id", legislation_id);
        CompareCase cc = new CompareCase(db);

        String sql = "";
        sql += " select cc.id, nvl(cc.compare_case_no,'-') compare_case_no, cc.case_total_fine case_fine, ";
        sql += " pke_arrest.getLawbreakerQty(cc.track_no) lawbreaker_qty, ed.short_name compare_offname ";
        sql += " from compare_case cc";
        sql += " inner join application_arrest aa on aa.track_no=cc.track_no";
        sql += " left join compare_case_change ccc on cc.id=ccc.compare_case_id ";
        sql += " inner join ed_office ed on ed.offcode = cc.compare_office ";
        sql += " where aa.legislation_id=" + legislation_id;
        sql += " and cc.id not in (select compare_case_id from compare_case_change) ";
        if (request.getParameter("reward_request") != null) {
        	sql += " and cc.id not in (select compare_case_id from application_reward_request) ";
        }
        sql += " and cc.pay_date is not null and cc.compare_case_no is not null ";
        if(uData.IsAdmin()==false){
        	sql += " and (cc.compare_office = '" + uData.getOffcode() + "' or aa.offcode = '" + uData.getOffcode() + "')";
        }
        sql += " " + (!compare_case_no.equals("") ? " and cc.compare_case_no like '%" + compare_case_no + "%'" : "");
        sql += " order by cc.compare_case_date desc ";
        System.out.println(sql);

        String countsql = "select count(*) from (" + sql + ")";
        Integer totalRow = cc.countBySql(countsql, null);
        pageUtil.setTotalRow(totalRow);
        pageUtil.setPageSize(20);
        List<Map<String, Object>> ccList = cc.findBySql(sql,null,pageUtil);
        if (ccList.size() > 0) {
            request.setAttribute("ccList", ccList);
        }
        forward("/Popup/ccc_select_pop.jsp",request,response);
    }
    
    public void cancelInv(HttpServletRequest request, HttpServletResponse response)throws Exception {
		
		String ccID = request.getParameter("ccID").toString();
		
		System.out.println("เปลี่ยนสถานะของการเพิ่มลดค่าปรับเปรียบเทียบ เป็นยกเลิกใบเสร็จ");
		CompareCaseChange ccc = new CompareCaseChange(db);
		List<CompareCaseChange> clist = ccc.findByWhere(" compare_case_id = ?", ccID);
		if(clist.size()==1){
			ccc = ccc.findByPk(new Long(clist.get(0).getId()));
			ccc.setIscancel("Y");
			ccc.setCancel_date(update_on);
			ccc.setCancel_by(update_by.toString());
			ccc.setUpdate_by(update_by);
			ccc.setUpdate_on(update_on);
			ccc = ccc.update();
		}
		
		System.out.println("//จากนั้นก็ต้องยกเลิกใบเสร็จรับเงิน");
		DB db1 = new DB();
		PreparedStatement pre1 = null;
		CompareCaseChangeItem cci = new CompareCaseChangeItem(db);
		String sqlC ="";
		String sqlL = "";
		sqlL += " select cci.id, cc.track_no, nvl(cci.auto_inv_no,cci.book_no || '/' || cci.inv_no) invcode, nvl(ccc.change_money,0)-nvl(ccc.case_fine_old,0) fine ";
		sqlL += " from compare_case_change_item cci ";
		sqlL += " inner join compare_case_change ccc on ccc.id=cci.compare_case_change_id";
		sqlL += " inner join compare_case cc on cc.id=ccc.compare_case_id ";
		sqlL += " where cc.id ='" + ccID + "'";
		List<Map<String,Object>> aalList = cci.findBySql(sqlL);
		for(int i = 0;i<aalList.size();i++){
			System.out.println("//เก็บประวัติใบเสร็จเสีย");
			sqlC = "INSERT INTO COMPARE_INV_LOSE (ID, TRACK_NO, INVCODE_OLD, ";
			sqlC += " EDITDATE, FINE_AMT, REMARKS, KEY_BY) ";
			sqlC += " VALUES(compare_inv_lose_seq.nextval,'" + aalList.get(i).get("track_no").toString() + "','" + aalList.get(i).get("invcode").toString() + "', ";
			sqlC += " sysdate,'" + aalList.get(i).get("fine").toString() + "','ยกเลิกใบเสร็จรับเงิน ปรับเพิ่ม','" + create_by + "')";
			pre1 = db1.getParameterizedStatement(sqlC, null);
			pre1.execute();
		
			System.out.println("//ทำการยกเลิกใบเสร็จ");
			cci = cci.findByPk(new Long(aalList.get(i).get("id").toString()));
			cci.setIscancel("Y");
			cci.setCancel_date(create_on);
			cci.setCancel_by(create_by.toString());
			cci.setAuto_inv_no("");
			cci.setPaper_no("");
			cci.setBook_no("");
			cci.setInv_no("");
			cci.setUpdate_by(update_by);
			cci.setUpdate_on(update_on);
			cci = cci.update();
		}
		
		pre1.close();
		db1.closedb();
		pre1 = null;
		db1 = null;
		
		redirect("process?action=CompareCaseChange&cmd=add&ccid=" + ccID, request, response);
	}

}