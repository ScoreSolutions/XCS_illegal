package com.ko.webapp.action;

import java.math.BigDecimal;
import java.text.Format;
import java.text.SimpleDateFormat;
import java.util.*;

import com.ko.util.ConfigUtil;
import com.ko.util.RunningKey;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.apache.commons.lang.time.DateUtils;

import com.ko.service.ProductUnitService;
import com.ko.util.DateUtil;
import com.ko.webapp.util.ParameterUtil;
import com.ko.domain.*;
//import com.sun.corba.se.impl.javax.rmi.CORBA.Util;
import com.sun.org.apache.xalan.internal.xsltc.runtime.Parameter;


public class Reward_divideAction extends BaseAction {
    SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy",new Locale("TH","th"));
    public void preup(HttpServletRequest request, HttpServletResponse response) throws Exception {
        //pre(request, response);
        RewardDivide si = new RewardDivide(db);
        String sql;
        sql = " select   rd.id  id, " +
            " cc.id cc_id, rd.divide_no, ed.offcode, ed.offname, aa.legislation_id,lg.legislation_code, lg.legislation_name, cc.compare_case_no," +
            " rd.divide_date, to_char(rd.divide_date, 'dd/mm/yyyy', 'NLS_CALENDAR=''THAI BUDDHA'' NLS_DATE_LANGUAGE=THAI') divide_date2, " +
            " to_char(cc.compare_case_date, 'dd/mm/yyyy', 'NLS_CALENDAR=''THAI BUDDHA'' NLS_DATE_LANGUAGE=THAI') compare_case_date2," +
            " pke_arrest.getArrestLawbreaker(aa.track_no) lawbreaker_name," +
            " tia.title_name || sta.first_name || ' ' || sta.last_name accuser_name, " +
            " nvl(cc.birbe_money,0) birbe_money, nvl(cc.reward_money,0) reward_money, nvl(cc.treasury_money,0) treasury_money," +
            " nvl(cc.birbe_money,0)+nvl(cc.reward_money,0)+nvl(cc.treasury_money,0) fine_money, aa.offcode offcode_area " +
            " from compare_case cc " +
            " left join  reward_divide rd on cc.id=rd.compare_case_id" +
            " inner join book_impeachment bi on bi.track_no=cc.track_no" +
            " inner join application_arrest aa on aa.track_no=cc.track_no" +
            " left join v_accuser_list_popup sta on sta.idcard_no=aa.accuser_idcardno" +
            " left join title tia on tia.title_code=sta.title_code" +
            " inner join ed_office ed on ed.offcode=cc.compare_office" +
            " inner join legislation lg on lg.id=aa.legislation_id" +
            " where bi.case_quality='1' and bi.case_last='1' and cc.id = ?";
        //System.out.println(sql);
        //System.out.println(listsql);
        Map<String, Object> simap = si.findBySql(sql, ParameterUtil.getLongParam("id", request)).get(0);
        request.setAttribute("db", simap);
        
        RewardDivide rd = new RewardDivide(db);
        if (rd.findByWhere(" COMPARE_CASE_ID = ? ", simap.get("cc_id")).size() == 0) {
            //log.debug("pre create");
            request.setAttribute("update", "0");
            rd.setDivide_date(new Date());
            request.setAttribute("rd", rd);
            V_CASE_STAFF_TEAM v = new V_CASE_STAFF_TEAM(db);
            List<Map<String, Object>> staff_team_list = v.findByWhere("compare_case_id=? order by duty_status_id", simap.get("cc_id"));
            request.setAttribute("staff_team_list", staff_team_list);
            if (simap.get("legislation_code").equals("90")) {
                setStaffListAlcohol(request,response, staff_team_list);
            } else {
            	setStaffListTax(request,response,staff_team_list, simap.get("offcode_area").toString(), simap.get("cc_id").toString());
            }
        } else {
            rd = rd.findByWhere(" COMPARE_CASE_ID = ? ", simap.get("cc_id")).get(0);
            request.setAttribute("update", "1");
            request.setAttribute("rd", rd);

            if (simap.get("legislation_code").equals("90")) {
                RewardDivideAlcohol rda = new RewardDivideAlcohol(db);
                List<RewardDivideAlcohol> rdas = rda.findByWhere(RewardDivideAlcohol.REWARD_DIVIDE_IDCol + "=? order by order_seq", rd.getId());
                //List<Map<String,Object>> rdas = rda.findBySql(sqla);
                request.setAttribute("rdas", rdas);
            } else {
                DutyStatu duty = new DutyStatu(db);
                List<DutyStatu> duty_status_list = duty.findByWhere("id>2", null);
                for (DutyStatu statu : duty_status_list) {
                    if (statu.getStatus_name().equals("ผู้แจ้งความ")) {
                        duty_status_list.remove(statu);
                        break;
                    }
                }
                request.setAttribute("duty_status_list", duty_status_list);
                RewardDivideTax rdt = new RewardDivideTax(db);
                List<RewardDivideTax> rdts = rdt.findByWhere(RewardDivideTax.REWARD_DIVIDE_IDCol + "=? order by order_seq", rd.getId());
                request.setAttribute("rdts", rdts);
            }
        }
        request.setAttribute("action", "process?action=Reward_divide&id=" + simap.get("cc_id") + "&cmd=preup");
        forward("?page=/CompareCase/reward_divide_detail.jsp", request, response);

    }

    private void setStaffListAlcohol(HttpServletRequest request, HttpServletResponse response, List<Map<String,Object>> staff_team_list) throws Exception {
    	List<RewardDivideAlcohol> rdas = new ArrayList();
        int index = 1;
        while (staff_team_list.size() > 0) {
            if (index == 1) {
                Map<String, Object> map = staff_team_list.get(0);
                if (((BigDecimal) map.get("duty_status_id")).intValue() == 1) {
                    RewardDivideAlcohol rda = new RewardDivideAlcohol(db);
                    rda.setOrder_seq((long) index);
                    rda.setTitle_code(getString(map.get("title_code")));
                    if (getString(map.get("first_name")).equals(""))
                        rda.setFirst_name("ไม่มีผู้แจ้งความ");
                    else
                        rda.setFirst_name(getString(map.get("first_name")));
                    rda.setLast_name(getString(map.get("last_name")));
                    rda.setPosition_name(getString(map.get("posname")));
                    rda.setStaff_level(getString(map.get("staff_level")));
                    rda.setDuty_status_id(Long.parseLong(map.get("duty_status_id").toString()));
                    rdas.add(0, rda);
                    staff_team_list.remove(0);
                } else {
                    RewardDivideAlcohol rda = new RewardDivideAlcohol(db);
                    rda.setOrder_seq((long) index);
                    rda.setFirst_name("ไม่มีผู้แจ้งความ");
                    rda.setDuty_status_id(Long.parseLong("1"));
                    rdas.add(0, rda);
                }
                index++;
            } else {
                Map<String, Object> map = staff_team_list.get(0);
                RewardDivideAlcohol rda = new RewardDivideAlcohol(db);
                rda.setOrder_seq((long) index);
                rda.setTitle_code(getString(map.get("title_code")));
                rda.setFirst_name(getString(map.get("first_name")));
                rda.setLast_name(getString(map.get("last_name")));
                rda.setPosition_name(getString(map.get("posname")));
                rda.setStaff_level(getString(map.get("staff_level")));
                rda.setDuty_status_id(Long.parseLong(map.get("duty_status_id").toString()));
                rda.setIdcard_no(getString(map.get("idcard_no")));
                rdas.add(index - 1, rda);
                index++;
                
                staff_team_list.remove(0);
            }
        }
        request.setAttribute("rdas", rdas);
    }
    
    private void setStaffListTax(HttpServletRequest request, HttpServletResponse response, List<Map<String,Object>> staff_team_list, String vOffcode, String ccID) throws Exception {
        List<RewardDivideTax> rdts = new ArrayList();
        int index = 1;
        while (staff_team_list.size() > 0) {
            if (index == 1) {
                Map<String, Object> map = staff_team_list.get(0);
                if (((BigDecimal) map.get("duty_status_id")).intValue() == 1) {
                    RewardDivideTax rdt = new RewardDivideTax(db);
                    rdt.setOrder_seq((long) index);
                    rdt.setTitle_code(getString(map.get("title_code")));
                    if (getString(map.get("first_name")).equals("")){
                        rdt.setFirst_name("ไม่มีผู้แจ้งความ");
                        rdt.setIs_notice("N");
                    }else
                        rdt.setFirst_name(getString(map.get("first_name")));
                    rdt.setLast_name(getString(map.get("last_name")));
                    rdt.setPosition_name(getString(map.get("posname")));
                    rdt.setStaff_level(getString(map.get("staff_level")));
                    rdt.setDuty_status_id(Long.parseLong(map.get("duty_status_id").toString()));
                    rdts.add(0, rdt);
                    staff_team_list.remove(0);
                } else {
                    RewardDivideTax rdt = new RewardDivideTax(db);
                    rdt.setOrder_seq((long) index);
                    rdt.setFirst_name("ไม่มีผู้แจ้งความ");
                    rdt.setIs_notice("N");
                    rdt.setDuty_status_id(Long.parseLong(map.get("duty_status_id").toString()));
                    rdts.add(0, rdt);
                }
                index++;
            } else {
                Map<String, Object> map = staff_team_list.get(0);
                RewardDivideTax rdt = new RewardDivideTax(db);
                rdt.setOrder_seq((long) index);
                rdt.setTitle_code(getString(map.get("title_code")));
                rdt.setFirst_name(getString(map.get("first_name")));
                rdt.setLast_name(getString(map.get("last_name")));
                rdt.setPosition_name(getString(map.get("posname")));
                rdt.setStaff_level(getString(map.get("staff_level")));
                rdt.setDuty_status_id(Long.parseLong(map.get("duty_status_id").toString()));
                rdt.setShare1(getTaxShare1(map.get("duty_status_id").toString()));
                rdt.setShare2((map.get("share2")!=null ? new Long(map.get("share2").toString()) : 0));
                rdt.setIdcard_no(getString(map.get("idcard_no")));
                rdts.add(index - 1, rdt);
                index++;
                staff_team_list.remove(0);
            }
        }
        
        //เพิ่มรายการผู้สั่งการที่ถูกกำหนดให้แสดงเป็นค่าเริ่มต้น
//        String sql = "";
//        sql += " select st.idcard_no, st.title_code,  st.first_name, st.last_name, ps.poscode, nvl(st.posname,ps.posname || st.staff_level) posname, st.staff_level, "; 
//        sql += " to_number(pke_master.getConfigValue('commander')) duty_status_id, (select status_name from duty_status where id=pke_master.getConfigValue('commander')) status_name, ";
//        sql += " cds.staff_offcode offcode, ed.offname,  cds.share2, 'TAX_DEFAULT' gtype ";
//        sql += " from config_divide_staff cds ";
//        sql += " inner join v_staff_list_popup st on st.idcard_no=cds.staff_idcardno ";
//        sql += " inner join position ps on trim(ps.poscode)=trim(cds.staff_poscode) ";
//        sql += " inner join ed_office ed on ed.offcode=cds.staff_offcode ";
//        sql += " where cds.staff_idcardno not in (select nvl(idcard_no,'#') from v_case_staff_team where compare_case_id = '" + ccID + "') ";
//        sql += " and cds.share2>0";
//        sql += " and ed.offcode = '" + vOffcode + "'";
//        //log.debug(sql);
//        ConfigDivideStaff cds = new ConfigDivideStaff(db);
//        List<Map<String,Object>> cdsList = cds.findBySql(sql);
//        for(int i=0;i<cdsList.size();i++){
//        	//log.debug("CONFIG_DIVIDE_STAFF item : " + i + " ### index = " + index);
//        	RewardDivideTax rdt = new RewardDivideTax(db);
//        	Map<String,Object> cdsMap = cdsList.get(i);
//        	rdt.setOrder_seq((long) index);
//            rdt.setTitle_code(getString(cdsMap.get("title_code")));
//            rdt.setFirst_name(getString(cdsMap.get("first_name")));
//            rdt.setLast_name(getString(cdsMap.get("last_name")));
//            rdt.setPosition_name(getString(cdsMap.get("posname")));
//            rdt.setStaff_level(getString(cdsMap.get("staff_level")));
//            rdt.setShare1(getTaxShare1(cdsMap.get("duty_status_id").toString()));
//            rdt.setShare2((!cdsMap.get("share2").equals("") ? new Long(cdsMap.get("share2").toString()) : null));
//            rdt.setDuty_status_id(Long.parseLong(cdsMap.get("duty_status_id").toString()));
//            rdt.setIdcard_no(getString(cdsMap.get("idcard_no")));
//            rdts.add(index - 1, rdt);
//            index++;
//        }
        
        request.setAttribute("rdts", rdts);
        DutyStatu duty = new DutyStatu(db);
        List<DutyStatu> duty_status_list = duty.findAll();
        for (DutyStatu statu : duty_status_list) {
            if (statu.getStatus_name().equals("ผู้แจ้งความ")) {
                duty_status_list.remove(statu);
                break;
            }
        }
        request.setAttribute("duty_status_list", duty_status_list);
        RewardDivideTax rdt = new RewardDivideTax(db);
    }
    
    private Long getTaxShare1(String vDutyStatusID) throws Exception {
    	Long ret = null;
    	if(ConfigUtil.getConfig("arrest_by").equals(vDutyStatusID) || ConfigUtil.getConfig("arrest_co").equals(vDutyStatusID) || ConfigUtil.getConfig("commander").equals(vDutyStatusID))
    		ret = new Long("1");
    	else
    		ret = new Long("0");
    	
    	return ret;
    }
    
    public void loadStaffFromView(HttpServletRequest request, HttpServletResponse response) throws Exception {
        pre(request, response);
        ApplicationOutsideProve si = new ApplicationOutsideProve(db);
        String sql;
        sql =
                " select distinct  rd.id  id, " +
                        " cc.id cc_id, rd.divide_no, ed.offcode, ed.offname, aa.legislation_id,lg.legislation_code, lg.legislation_name,  cc.compare_case_no," +
                        " rd.divide_date, to_char(rd.divide_date, 'dd/mm/yyyy', 'NLS_CALENDAR=''THAI BUDDHA'' NLS_DATE_LANGUAGE=THAI') divide_date2, " +
                        " to_char(cc.compare_case_date, 'dd/mm/yyyy', 'NLS_CALENDAR=''THAI BUDDHA'' NLS_DATE_LANGUAGE=THAI') compare_case_date2," +
                        " pke_arrest.getArrestLawbreaker(aa.track_no) lawbreaker_name," +
                        " tia.title_name || sta.first_name || ' ' || sta.last_name accuser_name, " +
                        " nvl(cc.birbe_money,0) birbe_money, nvl(cc.reward_money,0) reward_money, nvl(cc.treasury_money,0) treasury_money," +
                        " nvl(cc.birbe_money,0)+nvl(cc.reward_money,0)+nvl(cc.treasury_money,0) fine_money " +
                        //" case when rd.id is null then '0' else '1' end status_code, case when rd.id is null then 'ยังไม่แบ่งเงิน' else 'แบ่งเงินแล้ว' end status_name" +
                        " from compare_case cc " +
                        " left join  reward_divide rd on cc.id=rd.compare_case_id" +
                        " inner join book_impeachment bi on bi.track_no=cc.track_no" +
                        " inner join application_arrest aa on aa.track_no=cc.track_no" +
                        //" inner join application_arrest_lawbreaker aal on aa.track_no=aal.track_no" +
                        //" left join title tt on tt.title_code=aal.title_code" +
                        //" left join title tc on tc.title_code=aal.company_title_code" +
                        " inner join staff sta on sta.idcard_no=aa.accuser_idcardno" +
                        " left join title tia on tia.title_code=sta.title_code" +
                        " inner join ed_office ed on ed.offcode=cc.compare_office" +
                        " inner join legislation lg on lg.id=aa.legislation_id" +
                        //" inner join duty_group dg on dg.group_id=aa.product_group_id" +
                        " where bi.case_quality='1' and bi.case_last='1' and cc.id = ?";

        //System.out.println(sql);
        //System.out.println(listsql);
        Map<String, Object> simap = si.findBySql(sql, ParameterUtil.getLongParam("id", request)).get(0);
        request.setAttribute("db", simap);
        RewardDivide rd = new RewardDivide(db);
        if (rd.findByWhere(" COMPARE_CASE_ID = ? ", simap.get("cc_id")).size() == 0) {
            request.setAttribute("update", "0");
            rd.setDivide_date(new Date());
            request.setAttribute("rd", rd);
        } else {
            rd = rd.findByWhere(" COMPARE_CASE_ID = ? ", simap.get("cc_id")).get(0);
            request.setAttribute("update", "1");
            request.setAttribute("rd", rd);
        }
        V_CASE_STAFF_TEAM v = new V_CASE_STAFF_TEAM(db);
        List<Map<String, Object>> staff_team_list = v.findByWhere("compare_case_id=? order by duty_status_id", simap.get("cc_id"));
        request.setAttribute("staff_team_list", staff_team_list);
        if (simap.get("legislation_code").equals("90")) {
            List<RewardDivideAlcohol> rdas = new ArrayList();
            int index = 1;
            while (staff_team_list.size() > 0) {
                if (index == 1) {
                    Map<String, Object> map = staff_team_list.get(0);
                    if (((BigDecimal) map.get("duty_status_id")).intValue() == 1) {
                        RewardDivideAlcohol rda = new RewardDivideAlcohol(db);
                        rda.setOrder_seq((long) index);
                        rda.setTitle_code(getString(map.get("title_code")));
                        if (getString(map.get("first_name")).equals(""))
                            rda.setFirst_name("ขอปิดนาม");
                        else
                            rda.setFirst_name(getString(map.get("title_name")) + getString(map.get("first_name")));
                        rda.setLast_name(getString(map.get("last_name")));
                        rda.setPosition_name(getString(map.get("posname")));
                        rda.setStaff_level(getString(map.get("staff_level")));
                        rda.setDuty_status_id(Long.parseLong(map.get("duty_status_id").toString()));
                        rdas.add(0, rda);
                        staff_team_list.remove(0);
                    } else {
                        RewardDivideAlcohol rda = new RewardDivideAlcohol(db);
                        rda.setOrder_seq((long) index);
                        rda.setFirst_name("ขอปิดนาม");
                        rda.setDuty_status_id(Long.parseLong(map.get("duty_status_id").toString()));
                        rdas.add(0, rda);
                    }
                    index++;
                } else {
                    Map<String, Object> map = staff_team_list.get(0);
                    RewardDivideAlcohol rda = new RewardDivideAlcohol(db);
                    rda.setOrder_seq((long) index);
                    rda.setTitle_code(getString(map.get("title_code")));
                    rda.setFirst_name(getString(map.get("title_name")) + getString(map.get("first_name")));
                    rda.setLast_name(getString(map.get("last_name")));
                    rda.setPosition_name(getString(map.get("posname")));
                    rda.setStaff_level(getString(map.get("staff_level")));
                    rda.setDuty_status_id(Long.parseLong(map.get("duty_status_id").toString()));
                    rda.setIdcard_no(getString(map.get("idcard_no")));
                    rdas.add(index - 1, rda);
                    log.debug(getString(map.get("title_name")) + getString(map.get("first_name")));
                    index++;
                    staff_team_list.remove(0);
                }
            }
            request.setAttribute("rdas", rdas);
        } else {
            List<RewardDivideTax> rdts = new ArrayList();
            int index = 1;
            while (staff_team_list.size() > 0) {
                if (index == 1) {
                    Map<String, Object> map = staff_team_list.get(0);
                    if (((BigDecimal) map.get("duty_status_id")).intValue() == 1) {
                        RewardDivideTax rdt = new RewardDivideTax(db);
                        rdt.setOrder_seq((long) index);
                        rdt.setTitle_code(getString(map.get("title_code")));
                        if (getString(map.get("first_name")).equals(""))
                            rdt.setFirst_name("ขอปิดนาม");
                        else
                            rdt.setFirst_name(getString(map.get("title_name")) + getString(map.get("first_name")));
                        rdt.setLast_name(getString(map.get("last_name")));
                        rdt.setPosition_name(getString(map.get("posname")));
                        rdt.setStaff_level(getString(map.get("staff_level")));
                        rdt.setDuty_status_id(Long.parseLong(map.get("duty_status_id").toString()));
                        rdts.add(0, rdt);
                        staff_team_list.remove(0);
                    } else {
                        RewardDivideTax rdt = new RewardDivideTax(db);
                        rdt.setOrder_seq((long) index);
                        rdt.setFirst_name("ขอปิดนาม");
                        rdt.setDuty_status_id(Long.parseLong(map.get("duty_status_id").toString()));
                        rdts.add(0, rdt);
                    }
                    index++;
                } else {
                    Map<String, Object> map = staff_team_list.get(0);
                    RewardDivideTax rdt = new RewardDivideTax(db);
                    rdt.setOrder_seq((long) index);
                    rdt.setTitle_code(getString(map.get("title_code")));
                    rdt.setFirst_name(getString(map.get("title_name")) + getString(map.get("first_name")));
                    rdt.setLast_name(getString(map.get("last_name")));
                    rdt.setPosition_name(getString(map.get("posname")));
                    rdt.setStaff_level(getString(map.get("staff_level")));
                    rdt.setDuty_status_id(Long.parseLong(map.get("duty_status_id").toString()));
                    rdt.setIdcard_no(getString(map.get("idcard_no")));
                    rdts.add(index - 1, rdt);
                    index++;
                    staff_team_list.remove(0);
                }
            }
            request.setAttribute("rdts", rdts);
            DutyStatu duty = new DutyStatu(db);
            List<DutyStatu> duty_status_list = duty.findAll();
            for (DutyStatu statu : duty_status_list) {
                if (statu.getStatus_name().equals("ผู้แจ้งความ")) {
                    duty_status_list.remove(statu);
                    break;
                }
            }
            request.setAttribute("duty_status_list", duty_status_list);
            RewardDivideTax rdt = new RewardDivideTax(db);
        }
        request.setAttribute("action", "process?action=Reward_divide&id=" + simap.get("cc_id") + "&cmd=preup");
        forward("?page=/CompareCase/reward_divide_detail.jsp", request, response);
    }

    public void pre(HttpServletRequest request, HttpServletResponse response) throws Exception {
        Legislation lt = new Legislation(db);
        List<Legislation> ltlist = lt.findByWhere(" 1=1 order by legislation_name", null);
        request.setAttribute("ltlist", ltlist);
        
        DutyGroup dg = new DutyGroup(db);
        List<Map<String, Object>> dglist = dg.findBySql("select group_id, group_name from duty_group where group_status='N' order by  NLSSORT(UPPER(group_name), 'NLS_SORT = THAI_DICTIONARY')", null);
        request.setAttribute("dglist", dglist);
        
        EdOffice ed = new EdOffice(db);
        String edSql = "select offcode, short_name, offname from ed_office order by short_name";
        List<Map<String,Object>> edlist = ed.findBySql(edSql);
        //System.out.println("edlist : " + edlist.size());
        request.setAttribute("edlist", edlist);
        //findByWhere(GROUP_ID , obj)
        //System.out.println(ltlist);
    }

    public void _default(HttpServletRequest request,
                         HttpServletResponse response) throws Exception {
        // TODO Auto-generated method stub


        //this.writeTranLog("แสดงรายการแบ่งเงินสินบนรางวัล");
        //request.setAttribute("offcode", offcode);
        //pre(request, response);
        //forward("?page=/CompareCase/reward_divide_list.jsp", request, response);
        //redirect("process?action=Reward_divide&cmd=listAmm",request,response);
    	//redirect("process?action=Reward_divide&cmd=listAmm",request,response);
    }


    public void add(HttpServletRequest request, HttpServletResponse response) throws Exception {

        pre(request, response);

        //  pke_arrest(aal.id);
        forward("?page=/CompareCase/invoice2_form.jsp", request, response);

    }

    public void create(HttpServletRequest request, HttpServletResponse response) throws Exception {
        RewardDivide rd = new RewardDivide(db);
        boolean upchk = false;
        if (request.getParameter("update").equals("1")) {
            upchk = true;
            rd = rd.findByPk(ParameterUtil.getLongParam("rd_id", request));
            //log.debug("rd get===" + rd.toString());
        }
        if (upchk) {
            rd.setReceive_date(ParameterUtil.getDateParam("receive_date", request));
            if(request.getParameter("legislation_id").equals(ConfigUtil.getConfig("legislation_alcohol").toString()))
            	rd.setRemarks(request.getParameter("remarks_al"));
            else
            	rd.setRemarks(request.getParameter("remarks_tax"));
            rd.setUpdate_by(update_by);
            rd.setUpdate_on(new Date());
            rd = rd.update();
        } else {
            String key = new RunningKey(db).getRunningKey("REWARD_DIVIDE", "", "", offcode);
            rd.setDivide_no(key);
            rd.setDivide_date(ParameterUtil.getDateParam("divide_date", request));
            rd.setOffcode(offcode);
            rd.setReceive_date(ParameterUtil.getDateParam("receive_date", request));
            rd.setCompare_case_id(ParameterUtil.getLongParam("com_id", request));
            if(request.getParameter("legislation_id").equals(ConfigUtil.getConfig("legislation_alcohol").toString()))
            	rd.setRemarks(request.getParameter("remarks_al"));
            else
            	rd.setRemarks(request.getParameter("remarks_tax"));
            rd.setCreate_by(create_by);
            rd.setCreate_on(new Date());
            rd = rd.create();
        }
        if (ParameterUtil.getStringParam("legislation_code", request).equals("90")) {
            // do manage reward_divide_alcohol
            String[] rda_ids = request.getParameterValues("rda_id");
            String[] rda_order_seqs = request.getParameterValues("order_seq");
            String[] rda_duty_status_ids = request.getParameterValues("rda_duty_status_id");
            String[] rda_idcard_no = request.getParameterValues("rda_idcard_no");
            RewardDivideAlcohol rda = new RewardDivideAlcohol(db);
            List<RewardDivideAlcohol> listRda = rda.findByWhere(RewardDivideAlcohol.REWARD_DIVIDE_IDCol + "=?", rd.getId());
            //log.debug("rda_ids is length="+rda_ids.length);
            
            for (int i = 0; i < rda_ids.length; i++) {
                rda = new RewardDivideAlcohol(db);
                String id = rda_ids[i];
                //log.debug("id =..."+id + " idcard_no : " + rda_idcard_no[i]);
                if (id != null && !id.equals("")) {
                    try {
                        Long idL = Long.parseLong(id);
                        rda = rda.findByPk(idL);
                        rda.setOrder_seq(Long.parseLong(rda_order_seqs[i]));
                        rda.setDuty_status_id(Long.parseLong(rda_duty_status_ids[i]));
                        rda.setIdcard_no(rda_idcard_no[i]);
                        if (rda_duty_status_ids[i].equals("1")) {
                            //rda.setDuty_status01_money(Double.parseDouble(request.getParameterValues("birbe")[i]));
                        	rda.setDuty_status01_money(Double.parseDouble((!request.getParameter("birbe").equals("") ? request.getParameter("birbe").toString() : "0")));
                        } else if (rda_duty_status_ids[i].equals("2")) {
                            rda.setDuty_status02_money(Double.parseDouble(request.getParameterValues("arrest")[i]));
                            rda.setDuty_status03_money(0.0);
                            rda.setDuty_status04_money(0.0);
                            rda.setDuty_status05_money(0.0);
                        } else if (rda_duty_status_ids[i].equals("3")) {
                            rda.setDuty_status02_money(0.0);
                            rda.setDuty_status03_money(Double.parseDouble(request.getParameterValues("arrest_co")[i]));
                            rda.setDuty_status04_money(0.0);
                            rda.setDuty_status05_money(0.0);
                        } else if (rda_duty_status_ids[i].equals("4")) {
                            rda.setDuty_status02_money(0.0);
                            rda.setDuty_status04_money(Double.parseDouble(request.getParameterValues("command")[i]));
                            rda.setDuty_status03_money(0.0);
                            rda.setDuty_status05_money(0.0);
                        } else if (rda_duty_status_ids[i].equals("5")) {
                            rda.setDuty_status02_money(0.0);
                            rda.setDuty_status05_money(Double.parseDouble(request.getParameterValues("helper")[i]));
                            rda.setDuty_status04_money(0.0);
                            rda.setDuty_status03_money(0.0);
                        }
                        
                        rda.setUpdate_by(update_by);
                        rda.setUpdate_on(update_on);
                        rda.update();
                        for (RewardDivideAlcohol tmp : listRda) {
                            if (rda.getId().longValue() == tmp.getId().longValue()) {
                                listRda.remove(tmp);
                                break;
                            }
                        }
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                } else {
                	//log.debug("insert item");
                    try {
                        rda.setTitle_code(request.getParameterValues("rda_title_code")[i]);
                        rda.setFirst_name(request.getParameterValues("rda_first_name")[i]);
                        rda.setLast_name(request.getParameterValues("rda_last_name")[i]);
                        for (RewardDivideAlcohol tmp : listRda) {
                            if (rda.getFirst_name().equals(tmp.getFirst_name()) &&
                                    rda.getLast_name().equals(tmp.getLast_name())) {
                                listRda.remove(tmp);
                                rda = tmp;
                                break;
                            }
                        }
                        rda.setStaff_level(request.getParameterValues("rda_staff_level")[i]);
                        rda.setPosition_name(request.getParameterValues("rda_position_name")[i]);
                        rda.setIdcard_no(rda_idcard_no[i]);
                        rda.setOrder_seq(Long.parseLong(rda_order_seqs[i]));
                        rda.setDuty_status_id(Long.parseLong(rda_duty_status_ids[i]));
                        if (rda_duty_status_ids[i].equals("1")) {
                        	log.debug("birbe item " + i);
                            rda.setDuty_status01_money(Double.parseDouble((!request.getParameter("birbe").equals("") ? request.getParameter("birbe").toString() : "0")));
                        } else if (rda_duty_status_ids[i].equals("2")) {
                        	//log.debug("arrest item " + i);
                            rda.setDuty_status02_money(getDouble(request,"arrest",i));
                            rda.setDuty_status03_money(0.0);
                            rda.setDuty_status04_money(0.0);
                            rda.setDuty_status05_money(0.0);
                        } else if (rda_duty_status_ids[i].equals("3")) {
                        	//log.debug("arrest_co item" + i);
                            rda.setDuty_status02_money(0.0);
                            rda.setDuty_status03_money(getDouble(request,"arrest_co",i));
                            rda.setDuty_status04_money(0.0);
                            rda.setDuty_status05_money(0.0);
                        } else if (rda_duty_status_ids[i].equals("4")) {
                        	//log.debug("command item" + i);
                            rda.setDuty_status02_money(0.0);
                            rda.setDuty_status04_money(getDouble(request,"command",i));
                            rda.setDuty_status03_money(0.0);
                            rda.setDuty_status05_money(0.0);
                        } else if (rda_duty_status_ids[i].equals("5")) {
                        	//log.debug("helper item" + i);
                            rda.setDuty_status02_money(0.0);
                            rda.setDuty_status05_money(getDouble(request,"helper",i));
                            rda.setDuty_status04_money(0.0);
                            rda.setDuty_status03_money(0.0);
                        }
                        if(rda.getId() != null){
                            rda.setUpdate_by(update_by);
                            rda.setUpdate_on(update_on);
                            rda.update();
                        }else{
                            rda.setCreate_by(create_by);
                            rda.setCreate_on(create_on);
                            rda.setReward_divide_id(rd.getId());
                            rda.create();
                        }
                    } catch (Exception e) {
                    	//log.debug("ROWS : " + i);
                        e.printStackTrace();
                    }
                }
            }
            for (RewardDivideAlcohol tmp : listRda) {
                if(tmp.getDuty_status_id().longValue() != 1l)
                    tmp.delete();
            }
        } else {
            // update reward divide tax
            // do manage reward_divide_alcohol
            String[] rdt_ids = request.getParameterValues("rdt_id");
            String[] rdt_order_seqs = request.getParameterValues("order_seq");
            String[] rdt_duty_status_ids = request.getParameterValues("rdt_duty_status_id");
            String[] rdt_idcard_no = request.getParameterValues("rdt_idcard_no");
            String[] rdt_share1 = request.getParameterValues("rdt_share1");
        	String[] rdt_share2 = request.getParameterValues("rdt_share2");
        	String[] rdt_money1 = request.getParameterValues("rdt_money1");
        	String[] rdt_money2 = request.getParameterValues("rdt_money2");
            
            RewardDivideTax rdt = new RewardDivideTax(db);
            List<RewardDivideTax> listrdt = rdt.findByWhere(RewardDivideTax.REWARD_DIVIDE_IDCol + "=?", rd.getId());
            for (int i = 0; i < rdt_ids.length; i++) {
                rdt = new RewardDivideTax(db); 
                String id = rdt_ids[i];
                //System.out.println(id + "  $$$$ " + rdt_duty_status_ids[i]);
                if (id != null && !id.equals("")) {
                	//log.debug("UPDATE id = " + id);
                    try {
                        Long idL = Long.parseLong(id);
                        rdt = rdt.findByPk(idL);
                        rdt.setOrder_seq(Long.parseLong(rdt_order_seqs[i]));
                        rdt.setStaff_level(request.getParameterValues("rdt_staff_level")[i]);
                        rdt.setPosition_name(request.getParameterValues("rdt_position_name")[i]);
                        rdt.setDuty_status_id(Long.parseLong(rdt_duty_status_ids[i]));
                        
                        if (!rdt_duty_status_ids[i].equals("1")) {
                        	rdt.setIdcard_no(rdt_idcard_no[i]);
                        	rdt.setShare1((!rdt_share1[i].equals("") ? Long.parseLong(rdt_share1[i]) : null));
                            rdt.setShare2((!rdt_share2[i].equals("") ? Long.parseLong(rdt_share2[i]) : null));
                            rdt.setMoney1((!rdt_money1[i].equals("") ? Double.parseDouble(rdt_money1[i]) : null));
                            rdt.setMoney2((!rdt_money2[i].equals("") ? Double.parseDouble(rdt_money2[i]) : null));
                        }
                        rdt.setUpdate_by(update_by);
                        rdt.setUpdate_on(update_on);
                        rdt.update();
                        for (RewardDivideTax tmp : listrdt) {
                            if (rdt.getId().longValue() == tmp.getId().longValue()) {
                                listrdt.remove(tmp);
                                break;
                            }
                        }
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                } else {
                    try {
                        rdt.setTitle_code(request.getParameterValues("rdt_title_code")[i]);
                        rdt.setFirst_name(request.getParameterValues("rdt_first_name")[i]);
                        rdt.setLast_name(request.getParameterValues("rdt_last_name")[i]);
                        for (RewardDivideTax tmp : listrdt) {
                            if (rdt.getFirst_name().equals(tmp.getFirst_name()) &&
                                    rdt.getLast_name().equals(tmp.getLast_name())) {
                                listrdt.remove(tmp);
                                rdt = tmp;
                                break;
                            }
                        }
                        rdt.setStaff_level(request.getParameterValues("rdt_staff_level")[i]);
                        rdt.setPosition_name(request.getParameterValues("rdt_position_name")[i]);
                        rdt.setOrder_seq(Long.parseLong(rdt_order_seqs[i]));
                        rdt.setDuty_status_id(Long.parseLong(rdt_duty_status_ids[i]));
                        
                        if (!rdt_duty_status_ids[i].equals("1")) {
                        	rdt.setIdcard_no(rdt_idcard_no[i]);
                            rdt.setShare1((!rdt_share1[i].equals("") ? Long.parseLong(rdt_share1[i]) : null));
                            rdt.setShare2((!rdt_share2[i].equals("") ? Long.parseLong(rdt_share2[i]) : null));
                            rdt.setMoney1((!rdt_money1[i].equals("") ? Double.parseDouble(rdt_money1[i]) : null));
                            rdt.setMoney2((!rdt_money2[i].equals("") ? Double.parseDouble(rdt_money2[i]) : null));
                        }
                        if(rdt.getId() !=null){
                            rdt.setUpdate_by(update_by);
                            rdt.setUpdate_on(update_on);
                            rdt.update();
                        }else{
                            rdt.setCreate_by(create_by);
                            rdt.setCreate_on(create_on);
                            rdt.setReward_divide_id(rd.getId());
                            rdt.create();
                        }
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                }
            }
            for (RewardDivideTax tmp : listrdt) {
                if(tmp.getDuty_status_id().longValue() != 1l)
                    tmp.delete();
            }            
        }
        
		
		log.debug("//Update Application Notice Arrest กำหนดวันที่่จ่ายเงินรางวัลแล้ว");
		String anaSql = " select aa.application_notice_arrest_id ";
		anaSql += " from reward_divide rd ";
		anaSql += " inner join compare_case cc on rd.compare_case_id=cc.id ";
		anaSql += " inner join application_arrest aa on aa.track_no=cc.track_no ";
		anaSql += " where rd.id = '" + rd.getId() + "'";
		
		//log.debug(anaSql);
		ApplicationArrest aa = new ApplicationArrest(db);
		List<Map<String,Object>> aaList = aa.findBySql(anaSql);
		
		if(aaList.size()>0 && aaList.get(0).get("application_notice_arrest_id") != null){
			//log.debug("//Update Application Notice Arrest กำหนดวันที่่จ่ายเงินรางวัลแล้ว");
			ApplicationNoticeArrest ana = new ApplicationNoticeArrest(db);
			ana = ana.findByPk(new Long(aaList.get(0).get("application_notice_arrest_id").toString()));
			ana.setReceive_date(rd.getReceive_date());
			ana.setIsreward_pay("Y");
			ana = ana.update();
		}
		
		
        redirect("process?action=Reward_divide&id=" + rd.getCompare_case_id() + "&cmd=preup", request, response);
    }
    private double getDouble(HttpServletRequest request,String moneyType,int index){
        try{
         return Double.parseDouble(request.getParameterValues(moneyType)[index]);
        }catch(Exception e){
        }
        return 0.0;
    }

    private void searchData(HttpServletRequest request, HttpServletResponse response) throws Exception {
    	
    	String sqlCount ="select count(cc.id) as count \n"+
        "from compare_case cc \n" +
        "left join  reward_divide rd on cc.id=rd.compare_case_id\n" +
        "inner join book_impeachment bi on bi.track_no=cc.track_no\n" +
        "inner join application_arrest aa on aa.track_no=cc.track_no\n" +
        "left join v_accuser_list_popup sta on sta.idcard_no=aa.accuser_idcardno\n" +
        "left join title tia on tia.title_code=sta.title_code\n" +
        "inner join legislation lg on lg.id=aa.legislation_id\n" +
        "inner join duty_group dg on dg.group_id=aa.product_group_id\n" +
        "where bi.case_quality='1' and bi.case_last='1' \n" + 
        "and lg.id in (pke_master.getconfigvalue('legislation_alcohol'),pke_master.getconfigvalue('legislation_tax'))\n";
        
    	
    	String sql = "select distinct rd.id, cc.id cc_id, rd.divide_no,  aa.legislation_id, lg.legislation_name, dg.group_name, cc.compare_case_no,cc.compare_case_date compare_case_date2,\n" +
        "rd.divide_date, to_char(cc.compare_case_date, 'dd/mm/yyyy', 'NLS_CALENDAR=''THAI BUDDHA'' NLS_DATE_LANGUAGE=THAI') compare_case_date,\n" +
        "pke_arrest.getArrestLawbreaker(aa.track_no) lawbreaker_name,cc.compare_office,\n" +
        "tia.title_name || sta.first_name || ' ' || sta.last_name accuser_name,\n" +
        "trim(to_char(nvl(cc.birbe_money,0),'999G999G990D99MI')) birbe_money, trim(to_char(nvl(cc.reward_money,0),'999G999G990D99MI')) reward_money, \n" +
        "trim(to_char(nvl(cc.treasury_money,0),'999G999G990D99MI')) treasury_money,\n" +
        "trim(to_char(nvl(cc.birbe_money,0)+nvl(cc.reward_money,0)+nvl(cc.treasury_money,0),'999G999G990D99MI')) fine_money,\n" +
        "case when rd.id is null then '0' else '1' end status_code, case when rd.id is null then 'ยังไม่แบ่งเงิน' else 'แบ่งเงินแล้ว' end status_name\n" +
        "from compare_case cc \n" +
        "left join  reward_divide rd on cc.id=rd.compare_case_id\n" +
        "inner join book_impeachment bi on bi.track_no=cc.track_no\n" +
        "inner join application_arrest aa on aa.track_no=cc.track_no\n" +
        "left join v_accuser_list_popup sta on sta.idcard_no=aa.accuser_idcardno\n" +
        "left join title tia on tia.title_code=sta.title_code\n" +
        "inner join legislation lg on lg.id=aa.legislation_id\n" +
        "inner join duty_group dg on dg.group_id=aa.product_group_id\n" +
        "where bi.case_quality='1' and bi.case_last='1' \n" +
    	" and lg.id in (pke_master.getconfigvalue('legislation_alcohol'),pke_master.getconfigvalue('legislation_tax')) \n" +
    	" and cc.compare_case_no is not null and cc.compare_case_date is not null \n ";
    	
    	
    	
		String order = "order by cc.compare_office, cc.compare_case_date desc";
		String tmp = "";
		String where = "";
		List<Object> paramList =  new ArrayList<Object>();
		
		if(request.getParameter("doSearch") != null){
			//เมื่อคลิกปุ่มค้นหา
			request.setAttribute("track_no", request.getParameter("track_no").trim());
			request.setAttribute("legislation_id", request.getParameter("legislation_id"));
			request.setAttribute("compare_case_no", request.getParameter("compare_case_no"));
			request.setAttribute("lawbreaker_name", request.getParameter("lawbreaker_name"));
			request.setAttribute("offcode", request.getParameter("offcode"));
			request.setAttribute("offname", request.getParameter("offname"));
			request.setAttribute("group_name", request.getParameter("group_name"));
			request.setAttribute("divide_date1", request.getParameter("divide_date1"));
			request.setAttribute("divide_date2", request.getParameter("divide_date2"));
			request.setAttribute("accuser_name", request.getParameter("accuser_name"));
			request.setAttribute("status", request.getParameter("status"));

			if(!request.getParameter("track_no").trim().equals(""))
				where += " and rd.divide_no like '%" + request.getParameter("track_no").trim().replace("'", "''") + "%'";
			if(!request.getParameter("legislation_id").equals(""))
				where += " and lg.id = '" + request.getParameter("legislation_id") + "'";
			if(!request.getParameter("compare_case_no").trim().equals(""))
				where += " and cc.compare_case_no like '%" + request.getParameter("compare_case_no").trim().replace("'", "''") + "%'";
			if(!request.getParameter("lawbreaker_name").trim().equals(""))
				where += " and pke_arrest.getArrestLawbreaker(aa.track_no) like '%" + request.getParameter("lawbreaker_name").trim().replace("'", "''") + "%'";
			if(!request.getParameter("offcode").trim().equals(""))
				where += " and cc.compare_office like '%" + request.getParameter("offcode").trim().replace("'", "''") + "%'";
			if(!request.getParameter("group_name").trim().equals(""))
				where += " and dg.group_name like '%" + request.getParameter("group_name").trim().replace("'", "''") + "%'";
			if(!request.getParameter("divide_date1").equals(""))
				where += " and to_char(rd.divide_date,'yyyymmdd') >= '" + DateUtil.formatConditionDate(request.getParameter("divide_date1")) + "'";
			if(!request.getParameter("divide_date2").equals(""))
				where += " and to_char(rd.divide_date,'yyyymmdd') <= '" + DateUtil.formatConditionDate(request.getParameter("divide_date2")) + "'";
	        if(!request.getParameter("accuser_name").trim().equals(""))
	        	where += " and sta.first_name || ' ' || sta.last_name like '%" + request.getParameter("accuser_name").trim().replace("'", "''") + "%'";
	        if(!request.getParameter("status").equals("")){
	        	if(request.getParameter("status").equals("0"))
	        		where += " and rd.id is not null ";
	        	else
	        		where += " and rd.id is null ";
	        }
	        
	        writeTranLog("ค้นหาข้อมูลการแบ่งเงินสินบนและรางวัล");
		}else{
			//เมื่อคลิกเข้าเมนู

			//String offcode = request.getAttribute("offcode").toString();
			sql += " and to_char(cc.pay_date,'yyyy') = to_char(sysdate,'yyyy') ";
			sqlCount += " and to_char(cc.pay_date,'yyyy') = to_char(sysdate,'yyyy') ";
			
			where += " and cc.compare_office = '" + uData.getOffcode() + "'";
			where += " and rd.id is null ";
			where += " and to_char(bi.case_date,'yyyymmdd') >= '" + DateUtil.formatConditionDate("13/01/2556") + "' ";
			writeTranLog("แสดงหน้าจอข้อมูลการแบ่งเงินสินบนและรางวัล");
		}

        RewardDivide rd = new RewardDivide(db);
        // pageUtil.setPageSize(15);
        List<Map<String,Object>> result = rd.findBySql(sqlCount + where + order,paramList.toArray());
        int totalRow = Integer.parseInt(result.get(0).get("count").toString());

        pageUtil.setTotalRow(totalRow);
        pageUtil.setPageSize(20);
        //log.debug(sql+ where + order);
        result = rd.findBySql(sql+ where + order,paramList.toArray(),pageUtil);
        request.setAttribute("dblist", result);
        request.setAttribute("rowCount", result.size());
    }
    
    String menuID = "13";
    public void listAmm(HttpServletRequest request, HttpServletResponse response) throws Exception {
    	if(uData.chkUserMenu(menuID)==true){
	    	if (request.getParameter("doSearch") == null) {
	            request.setAttribute("status", "1");
	        }
	        
	        if (uData.IsAdmin()==true)
	        	request.setAttribute("IsAdmin","1");
	
	        request.setAttribute("offcode", uData.getOffcode());
	        request.setAttribute("offname", uData.getShortName());
	
	        searchData(request,response);
	        Legislation le = new Legislation(db);
	        List<Legislation> les = le.findByWhere("legislation.id in (pke_master.getconfigvalue('legislation_alcohol'),pke_master.getconfigvalue('legislation_tax')) order by " + Legislation.LEGISLATION_NAMECol, null);
	        request.setAttribute("les", les);
	        //	for screen to show
	        forward("?page=/CompareCase/reward_divide_list.jsp", request, response);
	        //redirect("process?action=Reward_divide&cmd=listAmm",request,response);
    	}else{
    		HttpSession session = request.getSession();
  		  	session.invalidate();
  		  	request.setAttribute("errMsg", "ผู้ใช้ไม่มีสิทธิ์ดำเนินการ");
  		  	forward("?page=/login.jsp", request, response);
    	}
    }


    public void list(HttpServletRequest request, HttpServletResponse response) throws Exception {
        DeliveryExhibit de = new DeliveryExhibit(db);
        String sql = "";
        String slsql;
        String countsql;
        DeliveryExhibit maxid = new DeliveryExhibit(db);

        ArrayList<String> alcon = new ArrayList();
        ArrayList<String> alin = new ArrayList();
        ArrayList<String> alconint = new ArrayList();
        ArrayList<Integer> alinint = new ArrayList();
        ArrayList<String> alcondate = new ArrayList();
        ArrayList<String> alindate = new ArrayList();
        ArrayList<String> alconcbox1 = new ArrayList();
        ArrayList<String> alincbox1 = new ArrayList();
        ArrayList<String> alconcbox2 = new ArrayList();
        ArrayList<String> alincbox2 = new ArrayList();
        ArrayList<String> alcontween = new ArrayList();
        ArrayList<Integer> alintween = new ArrayList();
        slsql =
                " select distinct rd.id, cc.id cc_id, rd.divide_no, ed.offcode, ed.offname, aa.legislation_id, lg.legislation_name, dg.group_name, cc.compare_case_no," +
                        " rd.divide_date, to_char(rd.divide_date, 'dd/mm/yyyy', 'NLS_CALENDAR=''THAI BUDDHA'' NLS_DATE_LANGUAGE=THAI') divide_date2, " +
                        " to_char(cc.compare_case_date, 'dd/mm/yyyy', 'NLS_CALENDAR=''THAI BUDDHA'' NLS_DATE_LANGUAGE=THAI') compare_case_date2," +
                        " pke_arrest.getArrestLawbreaker(aa.track_no) lawbreaker_name," +
                        " tia.title_name || sta.first_name || ' ' || sta.last_name accuser_name, " +
                        " nvl(cc.birbe_money,0) birbe_money, nvl(cc.reward_money,0) reward_money, nvl(cc.treasury_money,0) treasury_money," +
                        " nvl(cc.birbe_money,0)+nvl(cc.reward_money,0)+nvl(cc.treasury_money,0) fine_money," +
                        " case when rd.id is null then '0' else '1' end status_code, case when rd.id is null then 'ยังไม่แบ่งเงิน' else 'แบ่งเงินแล้ว' end status_name" +
                        " from compare_case cc " +
                        " left join  reward_divide rd on cc.id=rd.compare_case_id" +
                        " inner join book_impeachment bi on bi.track_no=cc.track_no" +
                        " inner join application_arrest aa on aa.track_no=cc.track_no" +
                        " inner join application_arrest_lawbreaker aal on aa.track_no=aal.track_no" +
                        " left join title tt on tt.title_code=aal.title_code" +
                        " left join title tc on tc.title_code=aal.company_title_code" +
                        " inner join staff sta on sta.idcard_no=aa.accuser_idcardno" +
                        " left join title tia on tia.title_code=sta.title_code" +
                        " inner join ed_office ed on ed.offcode=cc.compare_office" +
                        " inner join legislation lg on lg.id=aa.legislation_id" +
                        " inner join duty_group dg on dg.group_id=aa.product_group_id" +
                        " where bi.case_quality='1' and bi.case_last='1'"


                ;
        countsql =
                " select count(distinct rd.id)" +
                        " from compare_case cc " +
                        " left join  reward_divide rd on cc.id=rd.compare_case_id" +
                        " inner join book_impeachment bi on bi.track_no=cc.track_no" +
                        " inner join application_arrest aa on aa.track_no=cc.track_no" +
                        " inner join application_arrest_lawbreaker aal on aa.track_no=aal.track_no" +
                        " left join title tt on tt.title_code=aal.title_code" +
                        " left join title tc on tc.title_code=aal.company_title_code" +
                        " inner join staff sta on sta.idcard_no=aa.accuser_idcardno" +
                        " left join title tia on tia.title_code=sta.title_code" +
                        " inner join ed_office ed on ed.offcode=cc.compare_office" +
                        " inner join legislation lg on lg.id=aa.legislation_id" +
                        " inner join duty_group dg on dg.group_id=aa.product_group_id" +
                        " where bi.case_quality='1' and bi.case_last='1'"


                ;

        pre(request, response);

        alcon.add(" AND cc.compare_case_no like '%");
        alin.add(request.getParameter("compare_case_no") + "%'");

        alcon.add(" AND aa.legislation_id like '%");
        alin.add(request.getParameter("legislation_id") + "%'");

        alcon.add(" AND dg.group_name like '%");
        alin.add(request.getParameter("group_name") + "%'");

        alcon.add(" AND tia.title_name || sta.first_name || ' ' || sta.last_name  like '%");
        alin.add(request.getParameter("accuser_name") + "%'");

        alcon.add(" AND pke_arrest.getArrestLawbreaker(aa.track_no)  like '%");
        alin.add(request.getParameter("lawbreaker_name") + "%'");

        alcon.add(" AND dg.group_name  like '%");
        alin.add(request.getParameter("group_name") + "%'");


        alcon.add(" AND ed.offcode  like '%");
        alin.add(request.getParameter("offcode") + "%'");

        alcon.add(" AND case when rd.id is null then '0' else '1'   like '%");
        alin.add(request.getParameter("status") + "%'");


        alcondate
                .add(" AND add_months(to_date(rd.divide_date),6516) between to_date('");
        alindate.add(request.getParameter("divide_date1")
                + "','dd/mm/yyyy')");
        alcondate.add(" AND to_date('");
        alindate.add(request.getParameter("divide_date2")
                + "','dd/mm/yyyy')");

        // add sting con
        for (int i = 0; i < alin.size(); i++) {
            if (alin.get(i).equals("%'")) {
                alcon.set(i, "");
                alin.set(i, "");
            }
            sql += alcon.get(i) + alin.get(i);
        }

        // add int con
        for (int i = 0; i < alinint.size(); i++) {
            if ((Integer) alinint.get(i) != 0) {
                sql += alconint.get(i) + (Integer) alinint.get(i);
            }

        }

        // add date con
        for (int i = 0; i < alcondate.size(); i += 2) {
            if (alindate.get(i).equals("','dd/mm/yyyy')")
                    && alindate.get(i + 1).equals("','dd/mm/yyyy')")) {
                alcondate.set(i, "");
                alindate.set(i, "");
                alcondate.set(i + 1, "");
                alindate.set(i + 1, "");
            }
            sql += alcondate.get(i) + alindate.get(i);
            sql += alcondate.get(i + 1) + alindate.get(i + 1);
        }
        sql += " order by cc.compare_case_no desc ";
        Integer totalRow = de.countBySql(countsql + sql, null);
        pageUtil.setTotalRow(totalRow);
        pageUtil.setPageSize(20);
        System.out.println(sql);
        List<Map<String, Object>> dblist = de.findBySql(slsql + sql, null);
        System.out.println(slsql + sql);
        log.debug(dblist);
        List<Map<String, Object>> aamax = maxid.findBySql("select max(id) max from application_arrest", null);
        System.out.println(aamax);
        request.setAttribute("aamax", aamax.get(0));
        request.setAttribute("dblist", dblist);
        this.writeTranLog("ค้นหาข้อมูลการแบ่งเงิน");
        request.setAttribute("offcode", offcode);
        pre(request, response);
        forward("?page=/CompareCase/reward_divide_list.jsp", request, response);
    }


    public boolean isNumeric(String s) {
        try {
            return s.matches("[-+]?\\d*\\.?\\d+");
        } catch (Exception e) {
            return false;
        }

    }

    private String getString(Object obj) {
        if (obj != null) return obj.toString();
        else return "";
    }


    public void getShareQty(HttpServletRequest request, HttpServletResponse response) throws Exception {
        String idcard_no = request.getParameter("idcard_no");
        try {
            int resp = 0;
            String sql = "select accuser_type from V_STAFF_LIST_POPUP where idcard_no=?";
            V_STAFF_LIST_POPUP vs = new V_STAFF_LIST_POPUP(db);
            List<Map<String, Object>> listStaff = vs.findBySql(sql, idcard_no);
            if (listStaff.size() > 0) {
                String accuser_type = listStaff.get(0).get("accuser_type").toString();
                if (accuser_type.equals("5")) {
                    // by title
                    ConfigDivide cd = new ConfigDivide(db);
                    List<Map<String, Object>> result = cd.findBySql("select share_qty from config_divide where " +
                            " legislation_id=1 and bribe_reward='2' and proportion='2/5' and ref_table='TITLE' " +
                            " and ref_value=? ", listStaff.get(0).get("title_code"));
                    if (result.size() > 0)
                        resp = Integer.parseInt(result.get(0).get("share_qty").toString());
                    else
                        resp = 1;
                } else {
                    // by level
                    ConfigDivide cd = new ConfigDivide(db);
                    List<Map<String, Object>> result = cd.findBySql("select share_qty from config_divide where " +
                            " legislation_id=1 and bribe_reward='2' and proportion='2/5' and ref_table='PER_LEVEL' " +
                            " and ref_value=? ", listStaff.get(0).get("staff_level"));
                    if (result.size() > 0)
                        resp = Integer.parseInt(result.get(0).get("share_qty").toString());
                    else
                        resp = 1;
                }

            } else
                resp = 1;
            response.getWriter().println(idcard_no + "," + resp);
            return;
        } catch (Exception e) {
            e.printStackTrace();
        }
        response.getWriter().println(idcard_no + "," + 1);
    }
}
