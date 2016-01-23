/**
 * produce by boonchai ( neng )
 * @author <a href="mailto:mr.boonchai@gmail.com">Mr.Boonchai Wedwanitsathein</a>
 */
package com.ko.webapp.action;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.ko.domain.*;
import com.ko.util.RunningKey;
import com.ko.util.ConfigUtil;
import com.ko.webapp.action.BaseAction;
import org.springframework.web.bind.ServletRequestUtils;

public class ApplicationRewardRequestAction extends BaseAction {

    //private static final String ADD_TRAN_MSG = "บันทึกข้อมูลคำร้องขอรับเงินสินบนรางวัล";

    //private static final String ALCOHOL_CODE = ;
    //private static final String TOBACCO_CODE = "2";
    //private static final String TAX_CODE = "4";

    SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy", new Locale("TH", "th"));
    SimpleDateFormat sdf2 = new SimpleDateFormat("dd/MM/yyyy HH:mm", new Locale("TH", "th"));

    @Override
    public void _default(HttpServletRequest request, HttpServletResponse response) throws Exception {
        // TODO Auto-generated method stub
    }
    // list

    String menuID = "7";
    public void list(HttpServletRequest request, HttpServletResponse response) throws Exception {
    	if(uData.chkUserMenu(menuID)==true){
    		request.setAttribute("offcode", uData.getOffcode());
	        request.setAttribute("offname", uData.getShortName());
	        if(uData.IsAdmin()==true)
	        	request.setAttribute("IsAdmin", "1");
	        
	        if (request.getParameter("doSearch") != null) {
	            writeTranLog("ค้นหาข้อมูลคำร้องขอรับเงินสินบนและรางวัล");
	            
	            String sql = "select ar.id application_reward_request_id, ar.request_no, \n" +
	                    "ar.request_date, to_char(ar.request_date, 'dd/mm/yyyy', 'NLS_CALENDAR=''THAI BUDDHA'' NLS_DATE_LANGUAGE=THAI')  request_date2,\n" +
	                    "cc.compare_case_date, to_char(cc.compare_case_date, 'dd/mm/yyyy', 'NLS_CALENDAR=''THAI BUDDHA'' NLS_DATE_LANGUAGE=THAI')  compare_case_date2,\n" +
	                    "tir.title_name || str.first_name || ' ' || str.last_name request_name, cc.compare_case_no, pke_arrest.getArrestLawbreaker(aa.track_no) lawbreaker_name,\n" +
	                    "aa.legislation_id, lg.legislation_name, dg.group_name, cc.birbe_money, cc.reward_money, cc.treasury_money, tia.title_name || sta.first_name || ' ' || sta.last_name arrest_name\n" +
	                    "from application_reward_request ar\n" +
	                    "inner join compare_case cc on cc.id=ar.compare_case_id\n" +
	                    "inner join application_arrest aa on aa.track_no=cc.track_no\n" +
	                    "inner join v_accuser_list_popup str on str.idcard_no=ar.staff_id_request\n" +
	                    "left join title tir on tir.title_code=str.title_code\n" +
	                    "inner join v_accuser_list_popup sta on sta.idcard_no=aa.accuser_idcardno\n" +
	                    "left join title tia on tia.title_code=sta.title_code\n" +
	                    "inner join legislation lg on lg.id=aa.legislation_id\n" +
	                    "inner join duty_group dg on dg.group_id=aa.product_group_id\n";
	            String count = "select count(ar.id) from application_reward_request ar\n" +
	                    "inner join compare_case cc on cc.id=ar.compare_case_id\n" +
	                    "inner join application_arrest aa on aa.track_no=cc.track_no\n" +
	                    "inner join v_accuser_list_popup str on str.idcard_no=ar.staff_id_request\n" +
	                    "left join title tir on tir.title_code=str.title_code\n" +
	                    "inner join v_accuser_list_popup sta on sta.idcard_no=aa.accuser_idcardno\n" +
	                    "left join title tia on tia.title_code=sta.title_code\n" +
	                    "inner join legislation lg on lg.id=aa.legislation_id\n" +
	                    "inner join duty_group dg on dg.group_id=aa.product_group_id\n";
	            String orderBy = " order by ar.request_no desc";
	            String where = " where 1=1 ";
	            String tmp = "";
	            String track_no = ((tmp = request.getParameter("track_no")) != null) ? tmp : "";
	            String legislation_id = ((tmp = request.getParameter("legislation_id")) != null) ? tmp : "";
	            String request_no = ((tmp = request.getParameter("request_no")) != null) ? tmp : "";
	            String compare_case_no = ((tmp = request.getParameter("compare_case_no")) != null) ? tmp : "";
	            String request_date_from = ((tmp = request.getParameter("request_date_from")) != null) ? tmp : "";
	            String request_date_to = ((tmp = request.getParameter("request_date_to")) != null) ? tmp : "";
	            String compare_case_date_from = ((tmp = request.getParameter("compare_case_date_from")) != null) ? tmp : "";
	            String compare_case_date_to = ((tmp = request.getParameter("compare_case_date_to")) != null) ? tmp : "";
	            String lawbreaker_name = ((tmp = request.getParameter("lawbreaker_name")) != null) ? tmp : "";
	            String staff_name = ((tmp = request.getParameter("staff_name")) != null) ? tmp : "";
	            String offcode = ((tmp = request.getParameter("offcode")) != null) ? tmp : "";
	            String offname = ((tmp = request.getParameter("offname")) != null) ? tmp : "";
	            
	            List<Object> paramList = new ArrayList<Object>();
	            if (!track_no.equals("")) {
	                request.setAttribute("track_no", track_no);
	                where += " and cc.track_no like ? ";
	                paramList.add("%" + track_no + "%");
	            }
	            if (!legislation_id.equals("")) {
	                request.setAttribute("legislation_id", legislation_id);
	                where += " and lg.id = ? ";
	                paramList.add(Long.parseLong(legislation_id));
	            }
	            if (!request_no.equals("")) {
	                request.setAttribute("request_no", request_no);
	                where += " and ar.request_no like ? ";
	                paramList.add("%" + request_no + "%");
	            }
	            if (!compare_case_no.equals("")) {
	                request.setAttribute("compare_case_no", compare_case_no);
	                where += " and cc.compare_case_no like ? ";
	                paramList.add("%" + compare_case_no + "%");
	            }
	            if (!request_date_from.equals("")) {
	                request.setAttribute("request_date_from", request_date_from);
	                if (!request_date_to.equals("")) {
	                    request.setAttribute("request_date_to", request_date_to);
	                    where += " and ar.request_date between ? and ? ";
	                    paramList.add(sdf.parse(request_date_from));
	                    paramList.add(sdf.parse(request_date_to));
	                } else {
	                    where += " and ar.request_date = ? ";
	                    paramList.add(sdf.parse(request_date_from));
	                }
	            }
	            if (!compare_case_date_from.equals("")) {
	                request.setAttribute("compare_case_date_from", compare_case_date_from);
	                if (!request_date_to.equals("")) {
	                    request.setAttribute("compare_case_date_to", compare_case_date_to);
	                    where += " and cc.compare_case_date between ? and ? ";
	                    paramList.add(sdf.parse(compare_case_date_from));
	                    paramList.add(sdf.parse(compare_case_date_to));
	                } else {
	                    where += " and cc.compare_case_date = ? ";
	                    paramList.add(sdf.parse(compare_case_date_from));
	                }
	            }
	            if (!lawbreaker_name.equals("")) {
	                request.setAttribute("lawbreaker_name", lawbreaker_name);
	                where += " and pke_arrest.getArrestLawbreaker(aa.track_no) like ? ";
	                paramList.add("%" + lawbreaker_name + "%");
	            }
	            if (!staff_name.equals("")) {
	                request.setAttribute("staff_name", staff_name);
	                where += " and tir.title_name || str.first_name || ' ' || str.last_name like ? ";
	                paramList.add("%" + staff_name + "%");
	            }
	            if(!offcode.equals("")){
	            	request.setAttribute("offcode", offcode);
	            	request.setAttribute("offname", offname);
	            	where += " and ar.offcode like ? ";
	            	paramList.add("%" + offcode + "%");
	            }
	            
	            ApplicationRewardRequest ar = new ApplicationRewardRequest(db);
	            int totalRow = ar.countBySql(count + (where.equals("") ? "" : where) + orderBy,paramList.toArray());
	
	            // set TotalRow
	            pageUtil.setTotalRow(totalRow);
	            pageUtil.setPageSize(20);
	            
	            //log.debug(sql + (where.equals("") ? "" : where) + orderBy);
	            List<Map<String, Object>> result = ar.findBySql(sql + (where.equals("") ? "" : where) + orderBy, paramList.toArray(), pageUtil);
	            request.setAttribute("result", result);
	        }
	
	        Legislation lg = new Legislation(db);
	        List<Legislation> listLg = lg.findAll();
	        request.setAttribute("legislations", listLg);
	        
	        
	
	        //	for screen to show
	        forward("?page=/CompareCase/reward_request_list.jsp");
    	}else{
    		HttpSession session = request.getSession();
  		  	session.invalidate();
  		  	request.setAttribute("errMsg", "ผู้ใช้ไม่มีสิทธิ์ดำเนินการ");
  		  	forward("?page=/login.jsp", request, response);
  		  
    	}
    }

    //	 create

    public void add(HttpServletRequest request, HttpServletResponse response) throws Exception {
    	setDefaultValue(request, response);
        forward("?page=/CompareCase/reward_request_form.jsp");
    }
    
    private void setDefaultValue(HttpServletRequest request, HttpServletResponse response) throws Exception {
    	Legislation lg = new Legislation(db);
        List<Legislation> listLg = lg.findAll();
        request.setAttribute("legislations", listLg);
        
        //Alcohol
        String sql = "";
        sql += " select arr.report_to, arr.accept_lean, arr.leader_lean, arr.section_director_lean ";
        sql += " from application_reward_req_alcohol arr ";
        sql += " inner join application_reward_request ar on ar.id=arr.application_reward_request_id ";
        sql += " where ar.offcode='" + uData.getOffcode() + "' ";
        sql += " order by nvl(ar.update_on,ar.create_on) desc";
        ApplicationRewardReqAlcohol arl = new ApplicationRewardReqAlcohol(db);
        List<Map<String,Object>> alList = arl.findBySql(sql);
        if(alList != null && alList.size()>0){
        	request.setAttribute("al_report_to", (alList.get(0).get("report_to") != null ? alList.get(0).get("report_to").toString() : ""));
        	request.setAttribute("al_accept_lean", (alList.get(0).get("accept_lean") != null ? alList.get(0).get("accept_lean").toString() : ""));
        	request.setAttribute("al_leader_lean", (alList.get(0).get("leader_lean") != null ? alList.get(0).get("leader_lean").toString() : ""));
        	request.setAttribute("al_section_director_lean", (alList.get(0).get("section_director_lean") != null ? alList.get(0).get("section_director_lean").toString() : ""));
        }
        
        //Tobacco
        sql = "";
        sql += " select law_director_position "; 
        sql += " from application_reward_req_tobacco arr ";
        sql += " inner join application_reward_request ar on ar.id=arr.application_reward_request_id ";
        sql += " where ar.offcode = '" + uData.getOffcode() + "' ";
        sql += " order by nvl(ar.update_on,ar.create_on) desc";
        ApplicationRewardReqTobacco tb = new ApplicationRewardReqTobacco(db);
        List<Map<String,Object>> tbList = tb.findBySql(sql);
        if(tbList != null && tbList.size() > 0 ){
        	request.setAttribute("al_law_director_position", (tbList.get(0).get("law_director_position") != null ? tbList.get(0).get("law_director_position").toString() : ""));
        }
        
        //Tax
        sql = "";
        sql += " select arr.ask_lean,arr.department_name_send, arr.approve_lean ";
        sql += " from application_reward_req_tax arr ";
        sql += " inner join application_reward_request ar on ar.id=arr.application_reward_request_id ";
        sql += " where ar.offcode = '" + uData.getOffcode() + "' ";
        sql += " order by nvl(ar.update_on,ar.create_on) desc";
        ApplicationRewardReqTax ta = new ApplicationRewardReqTax(db);
        List<Map<String,Object>> taList = ta.findBySql(sql);
        if(taList != null && taList.size() >0){
        	request.setAttribute("al_ask_lean", (taList.get(0).get("ask_lean") != null ? taList.get(0).get("ask_lean").toString() : ""));
        	request.setAttribute("al_department_name_send", (taList.get(0).get("department_name_send") != null ? taList.get(0).get("department_name_send").toString() : ""));
        	request.setAttribute("al_approve_lean", (taList.get(0).get("approve_lean") != null ? taList.get(0).get("approve_lean").toString() : ""));
        }
    }
    
    private void setApplicationRewardRequestData(HttpServletRequest request, HttpServletResponse response, ApplicationRewardRequest ar) throws Exception{
    	String request_date = request.getParameter("request_date") != null ? request.getParameter("request_date") : "";
        String staff_id_request = request.getParameter("staff_id_request") != null ? request.getParameter("staff_id_request") : "";
        String poscode_request = request.getParameter("poscode_request") != null ? request.getParameter("poscode_request") : "";
        String inform_name = request.getParameter("inform_name") != null ? request.getParameter("inform_name") : "";
        //String inform_position = request.getParameter("inform_position") != null ? request.getParameter("inform_position") : "";
        String staff_id_receive = request.getParameter("staff_id_receive") != null ? request.getParameter("staff_id_receive") : "";
        String poscode_receive = request.getParameter("poscode_receive") != null ? request.getParameter("poscode_receive") : "";
        String noticeDate = request.getParameter("receive_date") != null ? request.getParameter("receive_date") : "";
        String noticeTime = request.getParameter("receive_time") != null ? request.getParameter("receive_time") : "";
        String compare_case_id = request.getParameter("compare_case_id") != null ? request.getParameter("compare_case_id") : "";
        
        if (!request_date.equals("")) {
            ar.setRequest_date(sdf.parse(request_date));
        }
        ar.setOffcode(offcode);
        ar.setStaff_id_request(staff_id_request);
        ar.setPoscode_request(poscode_request);
        ar.setInform_name(inform_name);
        //ar.setInform_position(inform_position);
        ar.setStaff_id_receive(staff_id_receive);
        ar.setPoscode_receive(poscode_receive);
        if (!noticeDate.equals("")) {
            if (!noticeTime.equals(""))
                ar.setReceive_date(sdf2.parse(noticeDate + " " + noticeTime));
            else
                ar.setReceive_date(sdf.parse(noticeDate));
        }
        if (!compare_case_id.equals("")) {
            ar.setCompare_case_id(Long.parseLong(compare_case_id));
        }
    }
    
    public void save(HttpServletRequest request, HttpServletResponse response) throws Exception {
    	
    	String id = request.getParameter("ar_id") != null ? request.getParameter("ar_id") : "";
    	String legislation_code = request.getParameter("legislation_id") != null ? request.getParameter("legislation_id") : "";
    	
    	ApplicationRewardRequest ar = new ApplicationRewardRequest(db);
        if(id.equals("")){
        	setApplicationRewardRequestData(request,response ,ar);
        	ar.setRequest_no(new RunningKey(db).getRunningKey("APPLICATION_REWARD_REQUEST", "", "", offcode));
        	ar.setCreate_by(create_by);
            ar.setCreate_on(create_on);
            ar = ar.create();
            writeTranLog("เพิ่มข้อมูลคำร้องขอรับเงินสินบนรางวัล");
        }else{
        	ar = ar.findByPk(new Long(id));
        	setApplicationRewardRequestData(request,response ,ar);
        	ar.setUpdate_by(update_by);
            ar.setUpdate_on(update_on);
            ar = ar.update();
            writeTranLog("แก้ไขข้อมูลคำร้องขอรับเงินสินบนรางวัล");
        }

        createRewardRequestTeam(ar.getId() , request);
        if (legislation_code.equals(ConfigUtil.getConfig("legislation_alcohol"))) { //สุรา
            createRewardRequestAlcohol(ar.getId(), request);
        } else if (legislation_code.equals(ConfigUtil.getConfig("legislation_tobacco"))) { //ยาสูบ
            createRewardRequestTobacco(ar.getId(), request);
        } else if (legislation_code.equals(ConfigUtil.getConfig("legislation_tax"))) { //สรรพสามิต
        	createRewardRequestReport(ar.getId(), request);
        	createRewardRequestTax(ar.getId(), request);
        }
        
        redirect("process?action=ApplicationRewardRequest&cmd=edit&id=" + ar.getId());
    }
    
    
    public void createRewardRequestReport(Long id, HttpServletRequest request) throws Exception{
    	//log.debug("Start createRewardRequestReport");
    	ApplicationRewardReqReport al = new ApplicationRewardReqReport(db);
    	
    	String arr_id = request.getParameter("arr_id") != null ? request.getParameter("arr_id") : "";
    	if(!arr_id.equals(""))
    		al = al.findByPk(new Long(arr_id));
    	
    	al.setApplication_reward_request_id(id);
    	al.setSubject(request.getParameter("arr_subject") != null ? request.getParameter("arr_subject") : "");
    	al.setIsinform(request.getParameter("chkInform") != null ? request.getParameter("chkInform") : "N");
    	al.setIschkcount(request.getParameter("chkCountInform") != null ? request.getParameter("chkCountInform") : "N");
    	al.setAbnormality(request.getParameter("abnormaly"));
    	al.setStaff_id_control(request.getParameter("ta_staff_id_control"));
    	al.setPoscode_control(request.getParameter("ta_poscode_control"));
    	al.setOffcode_control(request.getParameter("ta_offcode_control"));
    	al.setComment_control(request.getParameter("comment_control"));
    	al.setStaff_id_initial(request.getParameter("ta_staff_id_initial"));
    	al.setPoscode_initial(request.getParameter("ta_poscode_initial"));
    	al.setOffcode_initial(request.getParameter("ta_offcode_initial"));
    	al.setComment_initial(request.getParameter("comment_initial"));
    	al.setStaff_id_commander(request.getParameter("ta_staff_id_commander"));
    	al.setPoscode_commander(request.getParameter("ta_poscode_commander"));
    	al.setOffcode_commander(request.getParameter("ta_offcode_commander"));
    	al.setComment_commander(request.getParameter("comment_commander"));
    	al.setCommand(request.getParameter("command"));
    	
    	if(!arr_id.equals("")){
    		al.setUpdate_by(uData.getIdCard());
    		al.setUpdate_on(update_on);
    		al.update();
    	}else{
    		al.setCreate_by(uData.getIdCard());
    		al.setCreate_on(create_on);
    		al.create();
    	}
    	
    	//log.debug("End createRewardRequestReport");
    	
    }

    // view

    public void view(HttpServletRequest request, HttpServletResponse response) throws Exception {
        String id = request.getParameter("id");
        if (id != null && !id.trim().equals("")) {
            ApplicationRewardRequest applicationRewardRequest = new ApplicationRewardRequest(db);
            applicationRewardRequest = applicationRewardRequest.findByPk(new Long(id));
            if (applicationRewardRequest != null) {
                request.setAttribute("applicationRewardRequest", applicationRewardRequest);
            } else {
                formHandler.setFormMessage("Error : Not Found with id " + id);
            }
        } else {
            formHandler.setFormMessage("Error : Please Enter id");
        }
        forward("?page=/web/applicationRewardRequestView.jsp");
    }

    // update

    public void edit(HttpServletRequest request, HttpServletResponse response) throws Exception {
        String id = request.getParameter("id");
        if (id != null && !id.trim().equals("")) {
        	String sql = "select ar.id, ar.request_no, cc.id compare_case_id, cc.compare_case_no,\n" +
        	"	 to_char(ar.request_date,'dd/mm/yyyy','NLS_CALENDAR=''THAI BUDDHA'' NLS_DATE_LANGUAGE=THAI') request_date, \n" +
        	"	 to_char(cc.compare_case_date, 'dd/mm/yyyy', 'NLS_CALENDAR=''THAI BUDDHA'' NLS_DATE_LANGUAGE=THAI') as compare_case_date, \n" +
            "    aa.legislation_id, lg.legislation_name, pke_arrest.getArrestLawbreaker(aa.track_no) as lawbreaker_name, \n" +
            "    ar.staff_id_request, tir.title_name || str.first_name || ' ' || str.last_name request_staff_name, nvl(str.posname,posr.posname || ' ' || str.staff_level) posrname, str.poscode posrcode, \n" +
            "    tia.title_name || sta.first_name || ' ' || sta.last_name as accuser_name, nvl(sta.posname,nvl(aa.accuser_posname, posa.posname || ' ' || sta.staff_level)) as posaname,\n" +
            "    sta.IDCARD_NO as aa_idcard_no, sta.OFFCODE as aa_offcode, posa.POSCODE as aa_poscode, ed.OFFNAME as aa_offname,\n" +
            "    tis.title_name || sts.first_name || ' ' || sts.last_name as sue_name, poss.posname || ' ' || sts.staff_level as possname,\n" +
            "    ar.staff_id_receive, tirc.title_name || strc.first_name || ' ' || strc.last_name receive_staff_name, \n" +
            "    nvl(strc.posname,posrc.posname || ' ' || strc.staff_level) receive_posname, ar.poscode_receive, \n" +
            " 	 case when pke_arrest.getLawBreakerQty(aa.track_no)>1 then 'ร่วมกัน' else '' end || idc.guilt_base guilt_base, \n" +
            "    idc.case_law_id , idc.penalty_case_law_id , pke_arrest.getSceneAddress(cc.track_no) as scene_addr,\n" +
            "    aal.fine_case , cc.birbe_money as bribe_money, cc.reward_money, ar.inform_name, ana.notice_no, \n" +
            "    to_char(ar.receive_date,'dd/mm/yyyy','NLS_CALENDAR=''THAI BUDDHA'' NLS_DATE_LANGUAGE=THAI') receive_date, to_char(ar.receive_date,'hh24:mi') receive_time, aa.track_no, \n" +
            " 	 cc.treasury_money_p, cc.bribe_money_p, cc.reward_money_p \n" +
            " from application_reward_request ar \n" +
            " inner join compare_case cc on ar.compare_case_id=cc.id \n" +
            " inner join application_arrest aa on cc.track_no = aa.track_no\n" +
            " inner join legislation lg on lg.id=aa.legislation_id\n"+
            " left join v_accuser_list_popup sta on sta.idcard_no = aa.accuser_idcardno\n" +
            " left join title tia on sta.title_code = tia.title_code  \n" +
            " left join indictment idc on cc.indictment_id = idc.indictment_id\n" +
            " left join staff sts on sts.idcard_no = cc.sue_staff_idcardno\n" +
            " left join title tis on sts.title_code = tis.title_code\n" +
            " left join v_accuser_list_popup str on str.idcard_no=ar.staff_id_request \n" +
            " left join title tir on tir.title_code=str.title_code \n" +
            " left join v_accuser_list_popup strc on strc.idcard_no=ar.staff_id_receive \n"+
            " left join title tirc on tirc.title_code=strc.title_code \n" +
            " left join position posrc on posrc.poscode=trim(ar.poscode_receive) \n" +
            " left join position posr on posr.poscode = trim(ar.poscode_request) \n" +
            " left join position poss on poss.poscode = trim(cc.sue_poscode) \n" +
            " left join position posa on posa.poscode = trim(aa.accuser_poscode) \n" +
            " left join ed_office ed on ed.offcode = sta.offcode \n" +
            " left join ( \n" +
            "    select sum(aal1.fine) as fine_case, aal1.track_no as aal_track_no\n" +
            "    from application_arrest_lawbreaker aal1\n" +
            "    group by aal1.track_no\n" +
            " ) aal on aal.aal_track_no = aa.track_no\n" +
            " left join application_notice_arrest ana on ana.id=aa.application_notice_arrest_id\n" +
            " where ar.id = " + id;
        	//log.debug(sql);
        	
        	ApplicationRewardRequest ar = new ApplicationRewardRequest(db);
        	List<Map<String, Object>> arList = ar.findBySql(sql);
        	request.setAttribute("db", arList.get(0));
        	
        	
        	String tSql = " select ate.id,ate.staff_idcardno, ate.poscode, ate.offcode,ate.staff_level, \n";
        	tSql += " st.title_name || st.first_name || ' ' || st.last_name staff_name, st.posname staff_posname \n";
        	tSql += " from application_reward_req_team ate \n";
        	tSql += " inner join v_accuser_list_popup st on st.idcard_no=ate.staff_idcardno \n";
        	tSql += " where ate.application_reward_request_id = '" + id + "' \n";
        	tSql += " and ate.duty_status_id=? \n";
        	tSql += " order by ate.id";
        	
            ApplicationRewardReqTeam ate = new ApplicationRewardReqTeam(db);
            //List<ApplicationRewardReqTeam> listTeam = ate.findByWhere(ApplicationRewardReqTeam.APPLICATION_REWARD_REQUEST_IDCol + "=? and " +
            //    ApplicationArrestTeam.DUTY_STATUS_IDCol+"=? ", new Object[]{id,new Long(ConfigUtil.getConfig("arrest_co"))});
            List<Map<String, Object>> listTeam=ate.findBySql(tSql, new Long(ConfigUtil.getConfig("arrest_co")));
            request.setAttribute("co_arrests",listTeam);
            
            
            //List<ApplicationRewardReqTeam> listTeam1 = ate.findByWhere(ApplicationRewardReqTeam.APPLICATION_REWARD_REQUEST_IDCol + "=? and " +
            //    ApplicationArrestTeam.DUTY_STATUS_IDCol+"=? ", new Object[]{id,new Long(ConfigUtil.getConfig("commander"))});
            List<Map<String, Object>> listTeam1 = ate.findBySql(tSql, new Long(ConfigUtil.getConfig("commander")));
            request.setAttribute("commanders",listTeam1);
            
            if (arList != null) {
                String legislation_id = arList.get(0).get("legislation_id").toString();
                if (legislation_id.equals(ConfigUtil.getConfig("legislation_alcohol"))) {
                    ApplicationRewardReqAlcohol al = new ApplicationRewardReqAlcohol(db);
                    request.setAttribute("al", al.getData(id));
                } else if (legislation_id.equals(ConfigUtil.getConfig("legislation_tobacco"))) {
                    ApplicationRewardReqTobacco at = new ApplicationRewardReqTobacco(db);
                    request.setAttribute("al", at.getData(id));
                } else if (legislation_id.equals(ConfigUtil.getConfig("legislation_tax"))){
                    ApplicationRewardReqTax atax = new ApplicationRewardReqTax(db);
                    request.setAttribute("al", atax.getData(id));
                    
                    //List<ApplicationRewardReqTeam> listTeamTax = ate.findByWhere(ApplicationRewardReqTeam.APPLICATION_REWARD_REQUEST_IDCol + "=? and " +
                    //        ApplicationArrestTeam.DUTY_STATUS_IDCol+"=? ", new Object[]{id,new Long(ConfigUtil.getConfig("help_by"))});
                    List<Map<String, Object>> listTeamTax=ate.findBySql(tSql, new Long(ConfigUtil.getConfig("help_by")));
                    request.setAttribute("helper",listTeamTax);
                    
                    ApplicationArrestExhibit aae = new ApplicationArrestExhibit(db);
                    List<Map<String,Object>> eList = aae.getDataList(arList.get(0).get("track_no").toString());
                    request.setAttribute("exhibit", eList);
                }
            } else {
                formHandler.setFormMessage("Error : Not Found with id " + id);
            }
        }
        //forward("?page=/CompareCase/reward_request_edit.jsp");
        forward("?page=/CompareCase/reward_request_form.jsp");
    }

//    public void update1(HttpServletRequest request, HttpServletResponse response) throws Exception {
//        System.out.println("Start ------> update()");
//
//        //writeTranLog(ADD_TRAN_MSG);
//
//        String tmp = "";
//        String staff_id_request = ((tmp = request.getParameter("staff_id_request")) != null) ? tmp : "";
//        String poscode_request = ((tmp = request.getParameter("poscode_request")) != null) ? tmp : "";
//        String inform_name = ((tmp = request.getParameter("inform_name")) != null) ? tmp : "";
//        String inform_position = ((tmp = request.getParameter("inform_position")) != null) ? tmp : "";
//        String staff_id_receive = ((tmp = request.getParameter("staff_id_receive")) != null) ? tmp : "";
//        String poscode_receive = ((tmp = request.getParameter("poscode_receive")) != null) ? tmp : "";
//        String noticeDate = ((tmp = request.getParameter("receive_date")) != null) ? tmp : "";
//        String noticeTime = ((tmp = request.getParameter("receive_time")) != null) ? tmp : "";
//
//        String legislation_code = ((tmp = request.getParameter("legislation_id")) != null) ? tmp : "";
//
//        ApplicationRewardRequest ar = new ApplicationRewardRequest(db);
//        Long ar_id = ServletRequestUtils.getLongParameter(request, "ar_id");
//        ar = ar.findByPk(ar_id);
//
//        ar.setStaff_id_request(staff_id_request);
//        ar.setPoscode_request(poscode_request);
//        ar.setInform_name(inform_name);
//        ar.setInform_position(inform_position);
//        ar.setStaff_id_receive(staff_id_receive);
//        ar.setPoscode_receive(poscode_receive);
//        if (!noticeDate.equals("")) {
//            if (!noticeTime.equals(""))
//                ar.setReceive_date(sdf2.parse(noticeDate + " " + noticeTime));
//            else
//                ar.setReceive_date(sdf.parse(noticeDate));
//        }
//
//        ar.setUpdate_by(update_by);
//        ar.setUpdate_on(update_on);
//        ar.update();
//        if (ar != null) {
//            formHandler.setFormMessage("Update Completed");
//        } else {
//            formHandler.setFormMessage("Update Failed");
//        }
//        createRewardRequestTeam(ar.getId(), request);
//
//        if (legislation_code.equals(ConfigUtil.getConfig("legislation_alcohol"))) { //สุรา
//            createRewardRequestAlcohol(ar.getId(), request);
//        } else if (legislation_code.equals(ConfigUtil.getConfig("legislation_tobacco"))) { //ยาสูบ
//            createRewardRequestTobacco(ar.getId(), request);
//        } else if (legislation_code.equals(ConfigUtil.getConfig("legislation_tax"))) { //สรรพสามิต
//            createRewardRequestTax(ar.getId(), request);
//        }
//
//        redirect("process?action=ApplicationRewardRequest&cmd=edit&id=" + ar.getId());
//
//        System.out.println("End ------> update()");
//
//    }

    // delete

    public void delete(HttpServletRequest request, HttpServletResponse response) throws Exception {
        String[] ids = request.getParameterValues("id");
        if (ids != null && ids.length > 0) {
            ApplicationRewardRequest applicationRewardRequest = new ApplicationRewardRequest(db);
            List<Long> idList = new ArrayList<Long>();
            for (int i = 0; i < ids.length; i++)
                idList.add(new Long(ids[i]));
            int deleteRow = applicationRewardRequest.deleteByPks(idList);
            formHandler.setFormMessage(" Delete " + deleteRow + " Row Completed ");
        } else {
            formHandler.setFormMessage("Plese Select At Least One For Delete");
        }
        redirect("process2?action=ApplicationRewardRequest&cmd=list");
    }

    /**
     * ************************** Private  ***********************************
     */

    private void createRewardRequestTeam(Long id, HttpServletRequest request) throws Exception {

    	System.out.println("createRewardRequestTeam : " + id);
        Long co_arrestId = new Long(ConfigUtil.getConfig("arrest_co"));
        Long comanderId = new Long(ConfigUtil.getConfig("commander"));
        ApplicationRewardReqTeam ate1 = new ApplicationRewardReqTeam(db);
        String[] co_arrest_ids = request.getParameterValues("coArrestBody_id");
        String[] co_arrest_idcards = request.getParameterValues("coArrestBody_idcard_no");
        String[] co_arrest_poscodes = request.getParameterValues("coArrestBody_poscode");
        String[] co_arrest_offcodes = request.getParameterValues("coArrestBody_offcode");
        String[] co_arrest_levels = request.getParameterValues("coArrestBody_level");
        List<ApplicationRewardReqTeam> listTeam = ate1.findByWhere(ApplicationRewardReqTeam.APPLICATION_REWARD_REQUEST_IDCol + "=? and " +
                ApplicationArrestTeam.DUTY_STATUS_IDCol+"=? ", new Object[]{id,co_arrestId});
        if (co_arrest_idcards != null) {
            for (int i = 0; i < co_arrest_idcards.length; i++) {
                String tmp = "";
                String co_arrest_id = co_arrest_ids[i] != null ? co_arrest_ids[i] : "";
                String co_arrest_poscode = co_arrest_poscodes[i] != null ? co_arrest_poscodes[i] : "";
                String co_arrest_offcode = co_arrest_offcodes[i] != null ? co_arrest_offcodes[i] : "";
                String co_arrest_level = co_arrest_levels[i] != null ? co_arrest_levels[i] : "";
                String co_arrest_idcard = co_arrest_idcards[i] != null ? co_arrest_idcards[i] : "";
                ApplicationRewardReqTeam ate = new ApplicationRewardReqTeam(db);
                if (co_arrest_id.equals("")) {
                    ate.setCreate_by(uData.getIdCard());
                    ate.setCreate_on(create_on);
                    //ate.setUpdate_by(update_by);
                    //ate.setUpdate_on(update_on);

                } else {
                    for (ApplicationRewardReqTeam at : listTeam) {
                        if (at.getId().toString().equals(co_arrest_id)) {
                            listTeam.remove(at);
                            break;
                        }
                    }
                    ate = ate.findByPk(Long.parseLong(co_arrest_id));
                    ate.setUpdate_by(uData.getIdCard());
                    ate.setUpdate_on(update_on);
                }
                ate.setApplication_reward_request_id(id);
                ate.setStaff_idcardno(co_arrest_idcard);
                ate.setPoscode(co_arrest_poscode);
                ate.setOffcode(co_arrest_offcode);
                ate.setStaff_level(co_arrest_level);
                ate.setDuty_status_id(co_arrestId);
                if (co_arrest_id.equals("")) {
                    ate.create();
                } else {
                    ate.update();
                }
            }
        }
        for (ApplicationRewardReqTeam at : listTeam) {
            at.delete();
        }
        String[] commander_ids = request.getParameterValues("commanderBody_id");
        String[] commander_poscodes = request.getParameterValues("commanderBody_poscode");
        String[] commander_offcodes = request.getParameterValues("commanderBody_offcode");
        String[] commander_levels = request.getParameterValues("commanderBody_level");
        String[] commander_idcards = request.getParameterValues("commanderBody_idcard_no");
        listTeam = ate1.findByWhere(ApplicationRewardReqTeam.APPLICATION_REWARD_REQUEST_IDCol + "=? and " +
                ApplicationArrestTeam.DUTY_STATUS_IDCol+"=? ", new Object[]{id,comanderId});
        if (commander_idcards != null) {
            for (int i = 0; i < commander_ids.length; i++) {
                String tmp = "";
                String commander_id = ((tmp = commander_ids[i]) != null) ? tmp : "";
                String commander_poscode = ((tmp = commander_poscodes[i]) != null) ? tmp : "";
                String commander_offcode = ((tmp = commander_offcodes[i]) != null) ? tmp : "";
                String commander_level = ((tmp = commander_levels[i]) != null) ? tmp : "";
                String commander_idcard = ((tmp = commander_idcards[i]) != null) ? tmp : "";

                ApplicationRewardReqTeam ate = new ApplicationRewardReqTeam(db);
                if (commander_id.equals("")) {
                    ate.setCreate_by(uData.getIdCard());
                    ate.setCreate_on(create_on);
                } else {
                    for (ApplicationRewardReqTeam at : listTeam) {
                        if (at.getId().toString().equals(commander_id)) {
                            listTeam.remove(at);
                            break;
                        }
                    }
                    ate = ate.findByPk(Long.parseLong(commander_id));
                    ate.setUpdate_by(uData.getIdCard());
                    ate.setUpdate_on(update_on);
                }
                ate.setApplication_reward_request_id(id);
                ate.setStaff_idcardno(commander_idcard);
                ate.setPoscode(commander_poscode);
                ate.setOffcode(commander_offcode);
                ate.setStaff_level(commander_level);
                ate.setDuty_status_id(comanderId);
                if (commander_id.equals("")) {
                    ate.create();
                } else {
                    ate.update();
                }
            }
        }
        for (ApplicationRewardReqTeam at : listTeam) {
            at.delete();
        }
        
        
        //-----------------พ.ร.บ.ภาษี
        if(request.getParameter("legislation_id").equals(ConfigUtil.getConfig("legislation_tax"))){
        	//log.debug("Start save team tax");
        	Long helperid = new Long(ConfigUtil.getConfig("help_by"));
        	String[] helper_ids = request.getParameterValues("helperBody_id");
            String[] helper_poscodes = request.getParameterValues("helperBody_poscode");
            String[] helper_offcodes = request.getParameterValues("helperBody_offcode");
            String[] helper_levels = request.getParameterValues("helperBody_level");
            String[] helper_idcards = request.getParameterValues("helperBody_idcard_no");
        	listTeam = ate1.findByWhere(ApplicationRewardReqTeam.APPLICATION_REWARD_REQUEST_IDCol + "=? and " +
                    ApplicationArrestTeam.DUTY_STATUS_IDCol+"=? ", new Object[]{id,helperid});
        	
        	if(helper_idcards != null){
        		for(int i = 0;i<helper_ids.length;i++){
        			
        			ApplicationRewardReqTeam att = new ApplicationRewardReqTeam(db);
        			String helper_id = (helper_ids[i] != null ? helper_ids[i] : "");
        			String helper_idcard = (helper_idcards[i] != null ? helper_idcards[i] : "");
        			String helper_poscode = (helper_poscodes[i] != null ? helper_poscodes[i] : "");
        			String helper_offcode = (helper_offcodes[i] != null ? helper_offcodes[i] : "");
        			String helper_level = (helper_levels[i] != null ? helper_levels[i] : "");
        			
        			if(helper_id.equals("")){
        				att.setCreate_by(uData.getIdCard());
        				att.setCreate_on(create_on);
        			}else{
        				for (ApplicationRewardReqTeam at : listTeam) {
                            if (at.getId().toString().equals(helper_id)) {
                                listTeam.remove(at);
                                break;
                            }
                        }
                        att = att.findByPk(Long.parseLong(helper_id));
                        att.setUpdate_by(uData.getIdCard());
                        att.setUpdate_on(update_on);
        			}
        			
        			att.setApplication_reward_request_id(id);
                    att.setStaff_idcardno(helper_idcard);
                    att.setPoscode(helper_poscode);
                    att.setOffcode(helper_offcode);
                    att.setStaff_level(helper_level);
                    att.setDuty_status_id(helperid);
                    if (helper_id.equals("")) {
                        att.create();
                    } else {
                        att.update();
                    }
        		}
        	}
        	
        	//log.debug("END save team tax");
        }
    }

    private void createRewardRequestAlcohol(Long ar_id, HttpServletRequest request) throws Exception {

        //System.out.println("Start ------> createAlcoholRewardRequest()");
        //System.out.println("application_reward_request_id = " + ar_id);

        String accept_date = request.getParameter("al_accept_date") != null ? request.getParameter("al_accept_date") : "";
        String report_to = request.getParameter("al_report_to") != null ? request.getParameter("al_report_to") : "";

        String staff_id_arrest = request.getParameter("al_staff_id_arrest") != null ? request.getParameter("al_staff_id_arrest") : "";
        String poscode_arrest = request.getParameter("al_poscode_arrest") != null ? request.getParameter("al_poscode_arrest") : "";
        String offcode_arrest = request.getParameter("al_offcode_arrest") != null ? request.getParameter("al_offcode_arrest") : "";
        String accept_lean = request.getParameter("al_accept_lean") != null ? request.getParameter("al_accept_lean") : "";
        String accept_desc = request.getParameter("al_accept_desc") != null ? request.getParameter("al_accept_desc") : "";

        String leader_lean = request.getParameter("al_leader_lean") != null ? request.getParameter("al_leader_lean") : "";
        String leader_accept = request.getParameter("al_rb_leader_accept") != null ? request.getParameter("al_rb_leader_accept") : "";
        String leader_accept_reason = request.getParameter("al_txtLeaderAccept") != null ? request.getParameter("al_txtLeaderAccept") : "";
        String leader_deny_reason = request.getParameter("al_txtLeaderUnAccept") != null ? request.getParameter("al_txtLeaderUnAccept") : "";
        String staff_id_leader = request.getParameter("al_staff_id_leader") != null ? request.getParameter("al_staff_id_leader") : "";
        String poscode_leader = request.getParameter("al_poscode_leader") != null ? request.getParameter("al_poscode_leader") : "";

        String section_director_lean = request.getParameter("al_section_director_lean") != null ? request.getParameter("al_section_director_lean") : "";
        String section_director_accept = request.getParameter("al_rb_section_director_accept") != null ? request.getParameter("al_rb_section_director_accept") : "";
        String section_director_accept_reason = request.getParameter("al_txtSectionDirectorAccept") != null ? request.getParameter("al_txtSectionDirectorAccept") : "";
        String section_director_deny_reason = request.getParameter("al_txtSectionDirectorUnAccept") != null ? request.getParameter("al_txtSectionDirectorUnAccept") : "";
        String staff_id_section_director = request.getParameter("al_staff_id_section_director") != null ? request.getParameter("al_staff_id_section_director") : "";
        String poscode_section_director = request.getParameter("al_poscode_section_director") != null ? request.getParameter("al_poscode_section_director") : "";

        String res_director_accept = request.getParameter("al_rb_res_director_accept") != null ? request.getParameter("al_rb_res_director_accept") : "";
        String res_director_accept_reason = request.getParameter("al_txtResDirectorAccept") != null ? request.getParameter("al_txtResDirectorAccept") : "";
        String res_director_deny_reason = request.getParameter("al_txtResDirectorUnAccept") != null ? request.getParameter("al_txtResDirectorUnAccept") : "";
        String staff_id_res_director = request.getParameter("al_staff_id_res_director") != null ? request.getParameter("al_staff_id_res_director") : "";
        String poscode_res_director = request.getParameter("al_poscode_res_director") != null ? request.getParameter("al_poscode_res_director") : "";

        ApplicationRewardReqAlcohol ara = new ApplicationRewardReqAlcohol(db);
        String ara_id = request.getParameter("al_id") != null ? request.getParameter("al_id") : "";
        if(!ara_id.equals("")){
            ara = ara.findByPk(Long.parseLong(ara_id));
        }
        ara.setApplication_reward_request_id(ar_id);

        if (!accept_date.equals("")) {
            ara.setAccept_date(sdf.parse(accept_date));
        }
        ara.setReport_to(report_to);

        ara.setStaff_id_arrest(staff_id_arrest);
        ara.setPoscode_arrest(poscode_arrest);
        ara.setOffcode_arrest(offcode_arrest);

        ara.setAccept_lean(accept_lean.trim());
        ara.setAccept_desc(accept_desc.trim());

        ara.setLeader_lean(leader_lean);
        ara.setLeader_accept(leader_accept);
        ara.setLeader_accept_reason(leader_accept_reason);
        ara.setLeader_deny_reason(leader_deny_reason);
        ara.setStaff_id_leader(staff_id_leader);
        ara.setPoscode_leader(poscode_leader);

        ara.setSection_director_lean(section_director_lean);
        ara.setSection_director_accept(section_director_accept);
        ara.setSection_director_accept_reason(section_director_accept_reason);
        ara.setSection_director_deny_reason(section_director_deny_reason);
        ara.setStaff_id_section_director(staff_id_section_director);
        ara.setPoscode_section_director(poscode_section_director);

        ara.setRes_director_accept(res_director_accept);
        ara.setRes_director_accept_reason(res_director_accept_reason);
        ara.setRes_director_deny_reason(res_director_deny_reason);
        ara.setStaff_id_res_director(staff_id_res_director);
        ara.setPoscode_res_director(poscode_res_director);

        if(ara.getId()!=null && ara.getId().longValue()>0l){
            ara.setUpdate_by(update_by);
            ara.setUpdate_on(update_on);
            ara.update();
        }else{
            ara.setCreate_by(create_by);
            ara.setCreate_on(create_on);
            ara.create();
        }

        System.out.println("End ------> createAlcoholRewardRequest()");
    }

    private void createRewardRequestTobacco(Long ar_id, HttpServletRequest request) throws Exception {

        String staff_id_arrest = request.getParameter("to_staff_id_arrest") != null ? request.getParameter("to_staff_id_arrest") : "";
        String poscode_arrest = request.getParameter("to_poscode_arrest") != null ? request.getParameter("to_poscode_arrest") : "";
        String offcode_arrest = request.getParameter("to_offcode_arrest") != null ? request.getParameter("to_offcode_arrest") : "";
        String lawyer_opinion = request.getParameter("to_lawyer_opinion") != null ? request.getParameter("to_lawyer_opinion") : "";
        String law_director_position = request.getParameter("to_law_director_position") != null ? request.getParameter("to_law_director_position") : "";
        String law_director_opinion = request.getParameter("to_law_director_opinion") != null ? request.getParameter("to_law_director_opinion") : "";
        String command = request.getParameter("to_command") != null ? request.getParameter("to_command") : "";
        String arrest_opinion = request.getParameter("to_arrest_opinion") != null ? request.getParameter("to_arrest_opinion") : "";

        ApplicationRewardReqTobacco arc = new ApplicationRewardReqTobacco(db);
        String arc_id = request.getParameter("al_id") != null ? request.getParameter("al_id") : "";
        if(!arc_id.equals("")){
            arc = arc.findByPk(Long.parseLong(arc_id));
        }
        
        arc.setApplication_reward_request_id(ar_id);
        arc.setStaff_id_arrest(staff_id_arrest);
        arc.setPoscode_arrest(poscode_arrest);
        arc.setOffcode_arrest(offcode_arrest);
        arc.setLawyer_opinion(lawyer_opinion);
        arc.setLaw_director_position(law_director_position);
        arc.setLaw_director_opinion(law_director_opinion);
        arc.setCommand(command);
        arc.setArrest_opinion(arrest_opinion);

        if(arc_id.equals("")){
	        arc.setCreate_by(create_by);
	        arc.setCreate_on(create_on);
	        arc.create();
        }else{
	        arc.setUpdate_by(update_by);
	        arc.setUpdate_on(update_on);
	        arc.update();
        }
    }

    private void createRewardRequestTax(Long ar_id, HttpServletRequest request) throws Exception {

        String staff_id_confirm = request.getParameter("ta_staff_id_confirm") != null ? request.getParameter("ta_staff_id_confirm") : "";
        String poscode_confirm = request.getParameter("ta_poscode_confirm") != null ? request.getParameter("ta_poscode_confirm") : "";
        String offcode_confirm = request.getParameter("ta_offcode_confirm") != null ? request.getParameter("ta_offcode_confirm") : "";
        String ask_lean = request.getParameter("ta_ask_lean") != null ? request.getParameter("ta_ask_lean") : "";
        String department_name_send = request.getParameter("ta_department_name_send") != null ? request.getParameter("ta_department_name_send") : "";
        String staff_id_ask = request.getParameter("ta_staff_id_ark") != null ? request.getParameter("ta_staff_id_ark") : "";
        String poscode_ask = request.getParameter("ta_poscode_ark") != null ? request.getParameter("ta_poscode_ark") : "";
        String offcode_ask = request.getParameter("ta_offcode_ark") != null ? request.getParameter("ta_offcode_ark") : "";
        String approve_lean = request.getParameter("ta_approve_lean") != null ? request.getParameter("ta_approve_lean") : "";
        String staff_id_approve = request.getParameter("ta_staff_id_approve") != null ? request.getParameter("ta_staff_id_approve") : "";
        String poscode_approve = request.getParameter("ta_poscode_approve") != null ? request.getParameter("ta_poscode_approve") : "";
        String offcode_approve = request.getParameter("ta_offcode_approve") != null ? request.getParameter("ta_offcode_approve") : "";
        String id = request.getParameter("al_id") != null ? request.getParameter("al_id") : "";
        
        ApplicationRewardReqTax art = new ApplicationRewardReqTax(db);
        
        if(!id.equals(""))
        	art = art.findByPk(new Long(id));
        
        art.setApplication_reward_request_id(ar_id);
        art.setStaff_id_confirm(staff_id_confirm);
        art.setPoscode_confirm(poscode_confirm);
        art.setOffcode_confirm(offcode_confirm);
        art.setAsk_lean(ask_lean);
        art.setDepartment_name_send(department_name_send);
        art.setStaff_id_ask(staff_id_ask);
        art.setPoscode_ask(poscode_ask);
        art.setOffcode_ask(offcode_ask);
        art.setApprove_lean(approve_lean);
        art.setStaff_id_approve(staff_id_approve);
        art.setPoscode_approve(poscode_approve);
        art.setOffcode_approve(offcode_approve);
        
        if(id.equals("")){
        	art.setCreate_by(create_by);
            art.setCreate_on(create_on);
            art.create();
        }else{
        	art.setUpdate_by(update_by);
            art.setUpdate_on(update_on);
            art.update();
        }
        
        
        

        //System.out.println("End ------> createTaxRewardRequest()");
    }
    
    public void openCompareCasePopup(HttpServletRequest request, HttpServletResponse response) throws Exception {
        Long legislation_id = ServletRequestUtils.getLongParameter(request, "legislation_id");
        request.setAttribute("legislation_id", legislation_id);
        if (request.getParameter("R") != null){
        	request.setAttribute("reward_request", request.getParameter("R"));
        }
        CompareCase cc = new CompareCase(db);

        String sql = "";
        sql += " select cc.id, nvl(cc.compare_case_no,'-') compare_case_no, cc.case_total_fine case_fine, pke_arrest.getLawbreakerQty(cc.track_no) lawbreaker_qty ";
        sql += " from compare_case cc";
        sql += " inner join application_arrest aa on aa.track_no=cc.track_no";
        sql += " where aa.legislation_id=" + legislation_id;
        sql += " and cc.id not in (select compare_case_id from application_reward_request) and cc.pay_date is not null ";
        sql += " and cc.create_by is not null and aa.offcode = '" + uData.getOffcode() + "'";
        //System.out.println(sql);
        String countSql = "select count(id) from (" + sql + ")";
        int totalRow = cc.countBySql(countSql);
        
        pageUtil.setTotalRow(totalRow);
        pageUtil.setPageSize(20);
        List<Map<String, Object>> ccList = cc.findBySql(sql,null,pageUtil);
        

        if (ccList.size() > 0) {
            request.setAttribute("ccList", ccList);
        }
        forward("/Popup/ccc_select_pop.jsp");
    }

}