package com.ko.webapp.action;
import java.io.File;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.Vector;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.jfree.util.Log;
import org.springframework.web.bind.ServletRequestUtils;

import com.ko.domain.ApplicationArrest;
import com.ko.domain.ApplicationArrestExhibit;
import com.ko.domain.ApplicationArrestIndictment;
import com.ko.domain.ApplicationArrestLawbreaker;
import com.ko.domain.ApplicationArrestLicense;
import com.ko.domain.ApplicationArrestTeam;
import com.ko.domain.ApplicationInvest;
import com.ko.domain.ApplicationInvestTeam;
import com.ko.domain.ApplicationSearchWarrant;
import com.ko.domain.DutyGroup;
import com.ko.domain.EdOffice;
import com.ko.domain.Lawbreaker;
import com.ko.domain.Legislation;
import com.ko.domain.Province;
import com.ko.domain.Running;
import com.ko.domain.Staff;
import com.ko.domain.TranLog;
import com.ko.domain.User;
import com.ko.util.ConfigUtil;
import com.ko.util.DateUtil;
import com.ko.util.RunningKey;
//import com.ko.webapp.form.InvestForm2;
import com.ko.webapp.util.ParameterUtil;
//import com.sun.xml.internal.messaging.saaj.util.LogDomainConstants;

public class InvestAction extends BaseAction {
    public Long ai_id = new Long(0l);

    public void add(HttpServletRequest request, HttpServletResponse response) throws Exception {

        ApplicationInvest ai = new ApplicationInvest(db);

        ai.setTrack_no("NEW");
        ai.setReport_date(new Date());
        ai.setStaff_idcardno_invest(uData.getIdCard());
        ai.setPoscode_invest(uData.getPoscode());
        ai.setOffcode_invest(uData.getOffcode());

        request.setAttribute("staff_name_invest", uData.getFullName());
        request.setAttribute("posname_invest", uData.getPosname());
        request.setAttribute("ai", ai);

        //Staff st = new Staff(db);
        //EdOffice ed = new EdOffice(db);
        Legislation lg = new Legislation(db);
        List<Legislation> lglist = lg.findAll();
        request.setAttribute("lglist", lglist);

        DutyGroup dt = new DutyGroup(db);
        String sql="select dg.group_id, dg.group_name ";
        sql += " from duty_group dg";
        sql += " inner join product_legislation pl on pl.group_id=dg.group_id";
        sql += " where dg.group_status='N' and pl.legislation_id = pke_master.getConfigValue('legislation_tax')";
        sql += " order by  NLSSORT(UPPER(group_name), 'NLS_SORT = THAI_DICTIONARY')";
        List<Map<String, Object>> dtlist = dt.findBySql(sql, null);

        //System.out.println("dtlist : " + dtlist.size());
        request.setAttribute("dtlist", dtlist);

        Province pv = new Province(db);
        List<Province> pvlist = pv.findAll();
        request.setAttribute("pvlist", pvlist);

        request.setAttribute("invest_no_1", "");
        request.setAttribute("invest_no_2", DateUtil.formatThaiDate(new Date(),0).split(" ")[4]);
        request.setAttribute("action", "process?action=Invest&cmd=add");
        forward("?page=/Invest/createinvestreport2.jsp", request, response);
    }

    public void find(HttpServletRequest request, HttpServletResponse response) throws Exception {

        // Random generator = new Random();
        // int rid = generator.nextInt(100000000);

        ApplicationInvest ai = new ApplicationInvest(db);
        List<Map<String, Object>> aimap = null;
        String sql = "";
        String newsselect = "";
        String conselect = "";
        String offcodeselect = "";
        String dtselect = "";
        String lgselect = "";
        String report_date_f = "";
        String report_date_t = "";
        String invest_no_f = "";
        String invest_no_t = "";
        String partial_name1 = "";
        String partial_name2 = "";
        System.out.println("Done " + request.getParameter("find"));

        Enumeration e = request.getParameterNames();
        while (e.hasMoreElements()) {
            System.out.println(e.nextElement());
        }
        if (request.getParameter("report_date_t") != null) {
            // remove ait.application_invest_id ;
            String slsql = "select  ai.id , ai.invest_no, ai.report_date,  "
                    + " to_char(ai.report_date, 'dd/mm/yyyy', 'NLS_CALENDAR=''THAI BUDDHA'' NLS_DATE_LANGUAGE=THAI') report_date2,"
                    + " tii.title_name || sti.first_name || ' ' || sti.last_name staff_name_invest, "
                    + " tic.title_name || stc.first_name || ' ' || stc.last_name staff_name_command, ai.invest_qty, "
                    + " lg.legislation_name || case to_char(lg.id) when pke_master.getConfigvalue('legislation_tax') then dg.group_name else '' end legislation_name,"
                    + " to_char(ai.start_date, 'dd/mm/yyyy', 'NLS_CALENDAR=''THAI BUDDHA'' NLS_DATE_LANGUAGE=THAI') || ' - ' || to_char(ai.end_date, 'dd/mm/yyyy', 'NLS_CALENDAR=''THAI BUDDHA'' NLS_DATE_LANGUAGE=THAI') invest_date,"
                    + " pke_invest.getInvestAddress(ai.id) invest_address , ai.confidence_gauge, ai.news_value, ed.short_name"
                    + " from application_invest ai "
                    + " inner join staff sti on sti.idcard_no=ai.staff_idcardno_invest"
                    + " left join title tii on tii.title_code=sti.title_code "
                    + " inner join staff stc on stc.idcard_no=ai.staff_idcardno_command "
                    + " left join title tic on tic.title_code=stc.title_code "
                    + " inner join legislation lg on lg.id=ai.legislation_id"
                    + " left join ed_office ed on ed.offcode=ai.offcode_invest "
                    + " left join duty_group dg on dg.group_id=ai.product_group_id "
                    + " where 1=1 ";
            String countsql = "select count(*)"
                    + " from application_invest ai "
                    // + " inner join application_invest_team ait on
                    // ai.id=ait.application_invest_id "
                    + " inner join staff sti on sti.idcard_no=ai.staff_idcardno_invest"
                    + " left join title tii on tii.title_code=sti.title_code "
                    + " inner join staff stc on stc.idcard_no=ai.staff_idcardno_command "
                    + " left join title tic on tic.title_code=stc.title_code "
                    + " inner join legislation lg on lg.id=ai.legislation_id"
                    + " left join ed_office ed on ed.offcode=ai.offcode_invest "
                    + " left join duty_group dg on dg.group_id=ai.product_group_id "
                    + " where 1=1 ";

            int j = 1;
            Vector<String> objv = new Vector<String>();
            if (request.getParameter("report_date_f") != null
                    && request.getParameter("report_date_f").trim().length() > 9) {
                objv.add(request.getParameter("report_date_f"));
                report_date_f = request.getParameter("report_date_f");
                sql += " and ai.REPORT_DATE >= to_date(?, 'dd/mm/yyyy', 'NLS_CALENDAR=''THAI BUDDHA'' NLS_DATE_LANGUAGE=THAI')";
                j++;
                //System.out.println("report_date_f : " + report_date_f);
            }
            if (request.getParameter("report_date_t") != null
                    && request.getParameter("report_date_t").trim().length() > 0) {
                if (j == 0)
                    sql += " where ";
                if (j > 0)
                    sql += " and ";
                sql += " ai.REPORT_DATE <= to_date(?, 'dd/mm/yyyy', 'NLS_CALENDAR=''THAI BUDDHA'' NLS_DATE_LANGUAGE=THAI')";
                objv.add(request.getParameter("report_date_t"));
                report_date_t = request.getParameter("report_date_t");
                //System.out.println("report_date_t : " + report_date_t);
                j++;
            }
            if (request.getParameter("invest_no_f") != null
                    && request.getParameter("invest_no_f").trim().length() > 0) {
                if (j == 0)
                    sql += " where ";
                if (j > 0)
                    sql += " and ";
                sql += " ai.invest_no >= ? ";
                objv.add(request.getParameter("invest_no_f"));
                invest_no_f = request.getParameter("invest_no_f");

                j++;
            }
            if (request.getParameter("invest_no_t") != null
                    && request.getParameter("invest_no_t").trim().length() > 0) {
                if (j == 0)
                    sql += " where ";
                if (j > 0)
                    sql += " and ";
                sql += " ai.invest_no <= ? ";
                objv.add(request.getParameter("invest_no_t"));
                invest_no_t = request.getParameter("invest_no_t");

                j++;
            }
            if (request.getParameter("partial_name1") != null
                    && request.getParameter("partial_name1").trim().length() > 0) {
                String[] temp = request.getParameter("partial_name1")
                        .toString().split(" ");
                String out = request.getParameter("partial_name1");
                //System.out.println(out);
                if (j == 0)
                    sql += " where ";
                for (int i = 0; i < temp.length; i++) {
                    if (j > 0)
                        sql += " and ";
                    if (i == 0)
                        sql += " sti.first_name like ? ";
                    else if (i == 1)
                        sql += " sti.last_name like ? ";
                    objv.add("%" + temp[i] + "%");
                    j++;
                }
                partial_name1 = request.getParameter("partial_name1");

            }
            if (request.getParameter("partial_name2") != null
                    && request.getParameter("partial_name2").trim().length() > 0) {
                String[] temp = request.getParameter("partial_name2")
                        .toString().split(" ");
                if (j == 0)
                    sql += " where ";
                for (int i = 0; i < temp.length; i++) {

                    if (j > 0)
                        sql += " and ";
                    if (i == 0)
                        sql += " stc.first_name  like ? ";
                    else if (i == 1)
                        sql += " stc.last_name like ? ";
                    objv.add("%" + temp[i] + "%");
                    j++;
                }
                partial_name2 = request.getParameter("partial_name2");
            }
            if (request.getParameter("legislation_id") != null
                    && request.getParameter("legislation_id").trim().length() > 0) {

                lgselect = request.getParameter("legislation_id");
                if (j == 0)
                    sql += " where ";
                if (j > 0)
                    sql += " and ";
                sql += " ai.legislation_id = ? ";
                objv.add(request.getParameter("legislation_id"));
                //System.out.println(request.getParameter("legislation_id"));
                j++;

            }
            if (request.getParameter("product_group_id") != null
                    && request.getParameter("product_group_id").trim().length() > 0) {
                dtselect = request.getParameter("product_group_id");
                if (j == 0)
                    sql += " where ";
                if (j > 0)
                    sql += " and ";
                sql += " ai.product_group_id = ? ";
                objv.add(request.getParameter("product_group_id"));
                j++;

            }
            
            if(uData.IsAdmin()==true){
	            if (request.getParameter("offcode_invest") != null
	                    && request.getParameter("offcode_invest").trim().length() > 0) {
	                offcodeselect = request.getParameter("offcode_invest");
	                if (j == 0)
	                    sql += " where ";
	                if (j > 0)
	                    sql += " and ";
	                sql += " ai.offcode_invest = ? ";
	                objv.add(request.getParameter("offcode_invest"));
	                j++;
	            }
            }else{
            	request.setAttribute("IsAdmin", "0");
            	offcodeselect = uData.getOffcode();
            	sql += " and ai.offcode_invest = '" + uData.getOffcode() + "'";
            	j++;
            }
            
            
            
            if (request.getParameter("confidence_gauge") != null
                    && request.getParameter("confidence_gauge").trim().length() > 0) {
                conselect = request.getParameter("confidence_gauge");
                if (j == 0)
                    sql += " where ";
                if (j > 0)
                    sql += " and ";
                sql += " ai.confidence_gauge = ? ";
                objv.add(request.getParameter("confidence_gauge"));
                j++;

            }
            if (request.getParameter("news_value") != null
                    && request.getParameter("news_value").trim().length() > 0) {
                newsselect = request.getParameter("news_value");
                if (j == 0)
                    sql += " where ";
                if (j > 0)
                    sql += " and ";
                sql += " ai.news_value = ? ";
                objv.add(request.getParameter("news_value"));
                j++;

            }
            sql += " order by ai.report_date desc,ai.invest_no ";
            //System.out.println(" sql:: " + sql);
            //System.out.println(objv);
            Integer totalRow = ai.countBySql(countsql + sql, objv.toArray());
            pageUtil.setTotalRow(totalRow);


            aimap = ai.findBySql(slsql + sql, objv.toArray(), pageUtil);
            //System.out.println("totalRow " + totalRow);
            request.setAttribute("aimap", aimap);

        }

        request.setAttribute("newsselect", newsselect);
        request.setAttribute("conselect", conselect);
        request.setAttribute("offcodeselect", offcodeselect);
        request.setAttribute("lgselect", lgselect);
        request.setAttribute("dtselect", dtselect);
        request.setAttribute("report_date_f", report_date_f);
        request.setAttribute("report_date_t", report_date_t);
        request.setAttribute("invest_no_f", invest_no_f);
        request.setAttribute("invest_no_t", invest_no_t);
        request.setAttribute("partial_name1", partial_name1);
        request.setAttribute("partial_name2", partial_name2);
        ApplicationInvestTeam ait = new ApplicationInvestTeam(db);
        List<ApplicationInvestTeam> aitlist = new ArrayList<ApplicationInvestTeam>();
        request.setAttribute("aitlist", aitlist);

        Staff st = new Staff(db);
        EdOffice ed = new EdOffice(db);
        List<EdOffice> edlist = ed.findAll();
        request.setAttribute("edlist", edlist);
        Legislation lg = new Legislation(db);
        List<Legislation> lglist = lg.findAll();
        request.setAttribute("lglist", lglist);

        DutyGroup dt = new DutyGroup(db);
        List<Map<String, Object>> dtlist = dt.findBySql("select group_id, group_name from duty_group where group_status='N' order by  NLSSORT(UPPER(group_name), 'NLS_SORT = THAI_DICTIONARY')", null);
        //System.out.println("dtlist : " + dtlist.size());
        request.setAttribute("dtlist", dtlist);

        Province pv = new Province(db);
        List<Province> pvlist = pv.findAll();
        request.setAttribute("pvlist", pvlist);
        request.setAttribute("ResponseTime", "");
        forward("?page=/Invest/investReport2_list.jsp", request, response);
    }

    public void create(HttpServletRequest request, HttpServletResponse response)
            throws Exception {
    	
        ApplicationInvest ai = new ApplicationInvest(db);
        bindForm(ai);
        
        ai.setTrack_no(new RunningKey(db).getRunningKey("APPLICATION_INVEST", "", "", ai.getOffcode_invest()));
        ai.setStart_date(DateUtil.getDateFromString(DateUtil.getStringFromDate(ai.getStart_date(), "dd/MM/yyyy") + " " + ai.getStart_time()));
        ai.setEnd_date(DateUtil.getDateFromString(DateUtil.getStringFromDate(ai.getEnd_date(), "dd/MM/yyyy") + " " + ai.getEnd_time()));
        ai.setInvest_no(ai.getInvest_no_1() + "/" + ai.getInvest_no_2());
        ai.setPosname_command(request.getParameter("posname_command"));
        ai.setCreate_by(create_by);
        ai.setCreate_on(create_on);

        ai.create();
        ai_id = ai.getId();
        //log.debug(ai);
        uplist(request, response, ai);
        redirect("process?action=Invest&cmd=view&id=" + ai.getId(), request, response);
    }

    // retrive
    public void view(HttpServletRequest request, HttpServletResponse response)
            throws Exception {

        String id = request.getParameter("id");

        ApplicationInvest ai = new ApplicationInvest(db);
        Staff st = new Staff(db);
        ai = ai.findByPk(Long.parseLong(id));
        //System.out.println(" id : " + ai.getId());
        request.setAttribute("ai", ai);
        String[] invest = ai.getInvest_no().split("/");
        request.setAttribute("invest_no_1", invest[0]);
        request.setAttribute("invest_no_2", invest[1]);
        
        String stSql = "select tii.title_name || sti.first_name || ' ' || sti.last_name staff_name_invest, psi.posname || sti.staff_level posname_invest,";
        stSql += "tic.title_name || stc.first_name || ' ' || stc.last_name staff_name_command ";
        stSql += " from application_invest ai ";
        stSql += " inner join staff sti on sti.idcard_no=ai.staff_idcardno_invest ";
        stSql += " left join title tii on tii.title_code=sti.title_code ";
        stSql += " left join position psi on trim(psi.poscode)=trim(sti.poscode) ";
        stSql += " left join staff stc on stc.idcard_no=ai.staff_idcardno_command ";
        stSql += " left join title tic on tic.title_code=stc.title_code ";
        stSql += " where ai.id='" + ai.getId() + "'";
        
        List<Map<String,Object>> stList = st.findBySql(stSql);
        if(!stList.isEmpty()){
        	request.setAttribute("staff_name_invest", stList.get(0).get("staff_name_invest"));
        	request.setAttribute("posname_invest", stList.get(0).get("posname_invest"));
        	request.setAttribute("staff_command_name", stList.get(0).get("staff_name_command"));
        }

//        List<Map<String, Object>> st_invest = st.findBySql("select * from STAFF st,TITLE ti where st.TITLE_CODE = ti.TITLE_CODE and st.IDCARD_NO = ? ",ai.getStaff_idcardno_invest());
//        String staff_name_invest = "";
//
//        if (!st_invest.isEmpty()) {
//            Map<String, Object> map = st_invest.get(0);
//            staff_name_invest = map.get("title_name").toString()
//                    + map.get("first_name").toString() + "&nbsp;"
//                    + map.get("last_name").toString();
//            System.out.println("staff_command_name" + staff_name_invest);
//        }
//        List<Map<String, Object>> st_command = st
//                .findBySql(
//                        "select * from STAFF st,TITLE ti where st.TITLE_CODE = ti.TITLE_CODE and st.IDCARD_NO = ? ",
//                        ai.getStaff_idcardno_command());
//        String staff_command_name = "";
//
//        if (!st_command.isEmpty()) {
//            Map<String, Object> map = st_command.get(0);
//            staff_command_name = map.get("title_name").toString()
//                    + map.get("first_name").toString() + "&nbsp;"
//                    + map.get("last_name").toString();
//            System.out.println("staff_command_name" + staff_command_name);
//        }
//        //log.debug(ai);
//        request.setAttribute("staff_name_invest", staff_name_invest);
//        request.setAttribute("staff_command_name", staff_command_name);
        
        
        ApplicationInvestTeam ait = new ApplicationInvestTeam(db);
        List<ApplicationInvestTeam> aitlist = ait.findByWhere(
                " APPLICATION_INVEST_ID = ? ", ai.getId());
        request.setAttribute("aitlist", aitlist);

        Legislation lg = new Legislation(db);
        List<Legislation> lglist = lg.findAll();
        request.setAttribute("lglist", lglist);

        DutyGroup dt = new DutyGroup(db);
        List<Map<String, Object>> dtlist = dt.findBySql("select group_id, group_name from duty_group where group_status='N' order by  NLSSORT(UPPER(group_name), 'NLS_SORT = THAI_DICTIONARY')", null);
        request.setAttribute("dtlist", dtlist);

        Province pv = new Province(db);
        List<Province> pvlist = pv.findAll();
        request.setAttribute("pvlist", pvlist);

        request.setAttribute("action", "process?action=Invest&cmd=view&id=" + id);
        prelist(request, response, id);
        forward("?page=/Invest/updateinvestreport2.jsp", request, response);
    }

    public void saveData(HttpServletRequest request, HttpServletResponse response) throws Exception{
    	Long id;
    	ApplicationInvest ai = new ApplicationInvest(db);
    	if(request.getParameter("id") != null){
    		id = new Long(request.getParameter("id"));
    		ai = ai.findByPk(id);
    		ai.setUpdate_by(update_by);
    		ai.setUpdate_on(new Date());
    	}else{
    		ai.setTrack_no(new RunningKey(db).getRunningKey("APPLICATION_INVEST", "", "", request.getParameter("offcode_invest")));
    		ai.setCreate_by(create_by);
    		ai.setCreate_on(new Date());
    	}
    	
    	ai.setInvest_qty(!request.getParameter("invest_qty").trim().equals("") ? new Long(request.getParameter("invest_qty")) : null);
    	ai.setInvest_no(request.getParameter("invest_no_1") + "/" + request.getParameter("invest_no_2"));
    	ai.setStaff_idcardno_invest(request.getParameter("staff_idcardno_invest"));
    	ai.setPoscode_invest(request.getParameter("poscode_invest") != null ? request.getParameter("poscode_invest") : null);
    	ai.setOffcode_invest(request.getParameter("offcode_invest") != null ? request.getParameter("offcode_invest") : null);
    	ai.setStaff_idcardno_command(request.getParameter("staff_idcardno_command"));
    	ai.setPoscode_command(request.getParameter("poscode_command") != null ? request.getParameter("poscode_command") : null);
    	ai.setOffcode_command(request.getParameter("offcode_command") != null ? request.getParameter("offcode_command") : null);
    	ai.setLegislation_id(!request.getParameter("legislation_id").trim().equals("") ? new Long(request.getParameter("legislation_id")) : null);
    	ai.setProduct_group_id(request.getParameter("product_group_id") != null ? request.getParameter("product_group_id") : null);
    	ai.setStart_date(DateUtil.getDateFromString(request.getParameter("start_date") + " " + request.getParameter("start_time")));
    	ai.setEnd_date(DateUtil.getDateFromString((request.getParameter("end_date") != null ? request.getParameter("end_date") + " " : "") + (request.getParameter("end_time") != null ? request.getParameter("end_time") : "")));
    	ai.setCoordinate_x(!request.getParameter("coordinate_x").trim().equals("") ? new Double(request.getParameter("coordinate_x")) : null);
    	ai.setCoordinate_y(!request.getParameter("coordinate_y").trim().equals("") ? new Double(request.getParameter("coordinate_y")) : null);
    	ai.setAddress_name(request.getParameter("address_name") != null ? request.getParameter("address_name") : "");
    	ai.setAddress_no(request.getParameter("address_no") != null ? request.getParameter("address_no") : "");
    	ai.setMoo(!request.getParameter("moo").trim().equals("") ? new Long(request.getParameter("moo").toString()) : null);
    	ai.setSoi(request.getParameter("soi") != null ? request.getParameter("soi") : "");
    	ai.setRoad(request.getParameter("road") != null ? request.getParameter("road") : "");
    	ai.setProvince_code(request.getParameter("province_code") != null ? request.getParameter("province_code") : "");
    	ai.setDistrict_code(request.getParameter("district_code") != null ? request.getParameter("district_code") : "");
    	ai.setSubdistrict_code(request.getParameter("subdistrict_code") != null ? request.getParameter("subdistrict_code") : "");
    	ai.setZipcode(request.getParameter("zipcode") != null ? request.getParameter("zipcode") : "");
    	ai.setTel(request.getParameter("tel") != null ? request.getParameter("tel") : "");
    	//ai.setMap_picture(request.getParameter("map_picture") != null ?  request.getParameter("map_picture") : null);
    	ai.setMap_desc(request.getParameter("map_desc") != null ? request.getParameter("map_desc") : "");
    	ai.setInvest_desc(request.getParameter("invest_desc") != null ? request.getParameter("invest_desc") : "");
    	ai.setConfidence_gauge(request.getParameter("confidence_gauge") != null ? request.getParameter("confidence_gauge") : "");
    	ai.setNews_value(request.getParameter("news_value") != null ? request.getParameter("news_value") : "");
    	ai.setPosname_command(request.getParameter("posname_command") != null ? request.getParameter("posname_command") : "");
    	
    	if(request.getParameter("id") != null)
    		ai = ai.update();
    	else{
    		ai.setReport_date(DateUtil.getDateFromString(request.getParameter("report_date")));
    		ai = ai.create();
    	}

    	ai_id = ai.getId();
    	uplist(request, response, ai);
        redirect("process?action=Invest&cmd=view&id=" + ai.getId(), request, response);
    }
    
    public void update(HttpServletRequest request, HttpServletResponse response)
            throws Exception {
    	
    	log.debug("PosnameCommand : " + request.getParameter("posname_command"));
    	
        ApplicationInvest ai = new ApplicationInvest(db);
        String id = request.getParameter("id");
        ai = ai.findByPk(Long.parseLong(id));
        bindForm(ai);
        log.debug("PosnameCommand2 : " + request.getParameter("posname_command"));
        ai.setInvest_no(ai.getInvest_no_1() + "/" + ai.getInvest_no_2());        
        ai.setStart_date(DateUtil.getDateFromString(DateUtil.getStringFromDate(ai.getStart_date(), "dd/MM/yyyy") + " " + ai.getStart_time()));
        ai.setEnd_date(DateUtil.getDateFromString(DateUtil.getStringFromDate(ai.getEnd_date(), "dd/MM/yyyy") + " " + ai.getEnd_time()));
        ai.setPosname_command(request.getParameter("posname_command"));

        ai.update();
        ai_id = ai.getId();
        uplist(request, response, ai);
        redirect("process?action=Invest&cmd=view&id=" + ai.getId(), request, response);
    }

    // delete
    public void delete(HttpServletRequest request, HttpServletResponse response)
            throws Exception {
    	
    	HttpSession session = request.getSession();
    	session.setAttribute("ResponseTime", System.currentTimeMillis());
    	
    	ApplicationInvestTeam ait = new ApplicationInvestTeam(db);
        ait.deleteByWhere(" APPLICATION_INVEST_ID = ? ", new Long(request.getParameter("id")));
        
        ApplicationInvest ai = new ApplicationInvest(db);
        ai.deleteByPk(new Long(request.getParameter("id")));
        
        redirect("process?action=Invest", request, response);
    }

    public void list(HttpServletRequest request, HttpServletResponse response)
            throws Exception {
        // select data
        User user = new User(db);
        List<User> users = user.findAll(pageUtil);
        // for data to display
        request.setAttribute("users", users);
        System.out.println(users.size());
        // for screen to show
        forward("/test/list.jsp", request, response);
    }

    // update
    public void edit(HttpServletRequest request, HttpServletResponse response)
            throws Exception {
        User user = new User(db);
        Long id = new Long(request.getParameter("id"));
        user = user.findByPk(id);
        System.out.println(user);
        request.setAttribute("user", user);
        forward("/test/edit.jsp", request, response);
    }

    String menuID = "2";
    
    @Override
    public void _default(HttpServletRequest request,
                         HttpServletResponse response) throws Exception {
        // TODO Auto-generated method stub
    	if(uData.chkUserMenu(menuID)==true){
    	
	        ApplicationInvest ai = new ApplicationInvest(db);
	        List<Map<String, Object>> aimap = new ArrayList();
	        int totalRow = 0;
	        request.setAttribute("aimap", aimap);
	        pageUtil.setTotalRow(totalRow);
	        request.setAttribute("newsselect", "");
	        request.setAttribute("conselect", "");
	        request.setAttribute("offcodeselect", uData.getOffcode());
	        request.setAttribute("lgselect", "");
	        request.setAttribute("dtselect", "");
	        request.setAttribute("report_date_f", "");
	        request.setAttribute("report_date_t", "");
	        request.setAttribute("invest_no_f", "");
	        request.setAttribute("invest_no_t", "");
	        request.setAttribute("partial_name1", "");
	        request.setAttribute("partial_name2", "");
	        ApplicationInvestTeam ait = new ApplicationInvestTeam(db);
	        List<ApplicationInvestTeam> aitlist = new ArrayList<ApplicationInvestTeam>();
	        request.setAttribute("aitlist", aitlist);
	        if(uData.IsAdmin() == false)
	        	request.setAttribute("IsAdmin", "0");
	
	        Staff st = new Staff(db);
	        EdOffice ed = new EdOffice(db);
	        List<Map<String,Object>> edlist = ed.findBySql("select offcode, short_name from ed_office order by short_name");
	        request.setAttribute("edlist", edlist);
	        Legislation lg = new Legislation(db);
	        List<Legislation> lglist = lg.findAll();
	        request.setAttribute("lglist", lglist);
	
	        DutyGroup dt = new DutyGroup(db);
	        List<Map<String, Object>> dtlist = dt.findBySql("select group_id, group_name from duty_group where group_status='N' and substr(group_id,1,1) not in ('7','8','9') order by NLSSORT(group_name,'NLS_SORT = THAI_DICTIONARY')", null);
	        //System.out.println("dtlist : " + dtlist.size());
	        request.setAttribute("dtlist", dtlist);
	
	        Province pv = new Province(db);
	        List<Province> pvlist = pv.findAll();
	        request.setAttribute("pvlist", pvlist);
	        
	        HttpSession session = request.getSession();
	        request.setAttribute("ResponseTime", DateUtil.getResponseTime(session.getValue("ResponseTime") != null ? new Long(session.getValue("ResponseTime").toString()) : 0l));
	        session.removeAttribute("ResponseTime");
	        
	        forward("?page=/Invest/investReport2_list.jsp", request, response);
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

    public void uplist(HttpServletRequest request, HttpServletResponse response, ApplicationInvest ai) throws Exception {
    	ApplicationInvestTeam caii = new ApplicationInvestTeam(db);

        List<ApplicationInvestTeam> caiilist = caii.findByWhere("APPLICATION_INVEST_ID = ?", ai.getId());
        if (caiilist.size()>0){
        	caii.deleteByWhere("application_invest_id = ? ", ai.getId());
        }

        String[] aii_id = request.getParameterValues("aii_id");
        String[] aii_staff_idcardno = request.getParameterValues("aii_idcard_no");
        String[] aii_staff_poscode = request.getParameterValues("aii_poscode");
        String[] aii_staff_offcode = request.getParameterValues("aii_offcode");
        
        if(aii_staff_idcardno != null && aii_staff_idcardno.length>0){
        	for (int i = 0; i < aii_staff_idcardno.length; i++) {
                ApplicationInvestTeam aii = new ApplicationInvestTeam(db);
                aii.setApplication_invest_id(ai_id);
                aii.setStaff_idcard_no(aii_staff_idcardno[i]);
                aii.setOffcode_staff(aii_staff_offcode[i]);
                aii.setPoscode_staff(aii_staff_poscode[i]);
                aii.setCreate_by(create_by);
                aii.setCreate_on(create_on);
                aii.create();
            }
        }
    }
    
    public void uplist2(HttpServletRequest request, HttpServletResponse response, ApplicationInvest ai) throws Exception {

//xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxstart aiixxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx
        ApplicationInvestTeam caii = new ApplicationInvestTeam(db);

        List<ApplicationInvestTeam> caiilist = caii.findByWhere("APPLICATION_INVEST_ID = ?", ai.getId());

        String[] aii_id = ai.getAii_id();
        String[] aii_staff_idcardno = ai.getAii_idcard_no();
        String[] aii_staff_poscode = ai.getAii_poscode();
        String[] aii_staff_offcode = ai.getAii_offcode();

        if (aii_id == null) {
            for (int j = 0; j < caiilist.size(); j++) {
                caiilist.get(j).delete();

            }
        }
//        log.debug("kkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkk");
        if (aii_id != null) {
            log.debug(" aii_id.length " + aii_id.length);
        }
//        log.debug("kkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkk");

        if (ai.getAii_id() != null) {
            boolean chkdel = true;
//            log.debug("chkdet = true");
            for (int j = 0; j < caiilist.size(); j++) {
                chkdel = true;
                for (int k = 0; k < aii_id.length; k++) {
                    //log.debug(caiilist.get(j).getId() + "เทียบกับ" + aii_id[k]);
                    if (aii_id[k].equals("") == false) {
                        if (Long.parseLong(aii_id[k]) == caiilist.get(j).getId()) {
                            chkdel = false;
                            //log.debug("chkdet = false");
                        }
                    }
                }

                if (chkdel == true) {

                    //log.debug(caiilist.get(j).getId()+"เทียบกับ"+aii_id[0]);
                    caiilist.get(j).delete();

                }
            }
            for (int i = 0; i < aii_id.length; i++) {
                boolean chkup = false;

                ApplicationInvestTeam aii = new ApplicationInvestTeam(db);
                if (aii_id[i].equals("") == false) {
                    chkup = true;
                    //log.debug("เตรียม");
                    aii = aii.findByPk(Long.parseLong(aii_id[i]));
                }

                aii.setApplication_invest_id(ai_id);
                aii.setStaff_idcard_no(aii_staff_idcardno[i]);
                aii.setOffcode_staff(aii_staff_offcode[i]);
                aii.setPoscode_staff(aii_staff_poscode[i]);


                //log.debug(aii);
                if (chkup == false) {

                    aii.setCreate_by(create_by);
                    aii.setCreate_on(create_on);
                    aii.create();
                } else {
                    aii.setUpdate_by(update_by);
                    aii.setUpdate_on(update_on);
                    aii.update();

                }

            }
        }

        //xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxend aiixxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx-

    }

    public void prelist(HttpServletRequest request, HttpServletResponse response, String id) throws Exception {
        String aatsql = " SELECT aat.ID, " +
                " aat.STAFF_IDCARD_NO,aat.POSCODE_STAFF ,st.title_code,st.first_name," +
                " st.last_name,t.title_name, ps.posname || ' ' || st.staff_level posname , " +
                " aat.offcode_staff, ed.offname " +
                " FROM APPLICATION_INVEST_TEAM aat " +
                " left join staff st on st.idcard_no = aat.STAFF_IDCARD_NO " +
                " left join title t on t.title_code = st.title_code " +
                " left join ed_office ed on ed.offcode = aat.OFFCODE_STAFF" +
                " left join position ps on ps.poscode = aat.poscode_staff" +
                " where aat.APPLICATION_INVEST_ID = ?" +
                " order by aat.id ";


        //Log.debug(aatsql);
        ApplicationArrestTeam aat = new ApplicationArrestTeam(db);
        List<Map<String, Object>> aatlist = aat.findBySql(aatsql, id);

        request.setAttribute("aiilist", aatlist);

    }
}
