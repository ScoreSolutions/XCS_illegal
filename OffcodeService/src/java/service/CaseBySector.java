/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package service;

import data.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.lang.Exception;
import com.domain.BaseDomain;

/**
 *
 * @author Administrator
 */
public class CaseBySector extends BaseService {
    public ResponseHeader getResponse(RequestHeader reqHeader) throws Exception{
        ResponseHeader ret = new ResponseHeader();
        
        if (getIsValidData(reqHeader)==true){
                ret.setIsValidData(true);
                ret.setMessage("");
                ret.setResponseBody(setAllCaseBySector(reqHeader));
                System.out.println("Success");
            }else{
                ret.setIsValidData(false);
                ret.setMessage("ไม่พบข้อมูลที่ต้องการ");
                ret.setResponseBody(null);
                System.out.println("No Data Found");
            }


        return ret;
    }

    private boolean getIsValidData(RequestHeader reqHeader) throws Exception{
        boolean ret = false;
        try{
            BaseDomain aa = new BaseDomain(db);
            String sql = "";
            sql += " select ed.offcode, ed.offname , ed.short_name, lg.legislation_code, lg.legislation_name ";
            sql += " from book_impeachment bi ";
            sql += " inner join application_arrest aa on aa.track_no=bi.track_no ";
            sql += " inner join ed_office ed on ed.offcode=aa.offcode ";
            sql += " inner join legislation lg on lg.id=aa.legislation_id ";
            sql += " where to_char(bi.case_date,'mmyyyy') = '" + reqHeader.getMonth_year() + "' ";
            sql += " and substr(ed.offcode,1,2)||'0000' = '" + reqHeader.getOffcode().substring(0,2) + "0000' ";
            sql += " and rownum = 1";

            System.out.println(sql);

            List<Map<String,Object>> caseList = aa.findBySql(sql);
            if(caseList.size()>0)
                ret = true;

        }catch (Exception e){
            e.printStackTrace();
        }

        return ret;
    }

    private ArrayList setAllCaseBySector(RequestHeader reqHeader) throws Exception{
        ArrayList ret = new ArrayList();
        try{
            BaseDomain aa = new BaseDomain(db);
            String sql = "";
            sql += " select distinct to_char(bi.case_date,'month yyyy','NLS_CALENDAR=''THAI BUDDHA'' NLS_DATE_LANGUAGE=THAI') month_year, ";
            sql += " (select offcode from ed_office where offcode =substr(ed.offcode,1,4)||'00') offcode, ";
            sql += " (select offname from ed_office where offcode=substr(ed.offcode,1,4)||'00') offname , ";
            sql += " (select short_name from ed_office where offcode=substr(ed.offcode,1,4)||'00') short_name,  ";
            sql += " lg.id,lg.legislation_code,lg.legislation_name ";
            sql += " from book_impeachment bi ";
            sql += " inner join application_arrest aa on aa.track_no=bi.track_no ";
            sql += " inner join ed_office ed on ed.offcode=aa.offcode ";
            sql += " inner join legislation lg on lg.id=aa.legislation_id ";
            sql += " where to_char(bi.case_date,'mmyyyy') = '" + reqHeader.getMonth_year() + "' ";
            sql += " and substr(ed.offcode,1,2)||'0000' = '" + reqHeader.getOffcode().substring(0,2) + "0000'";
            sql += " order by offcode,lg.id";

            System.out.println(sql);
            List<Map<String,Object>> caseList = aa.findBySql(sql);

            if(caseList.size()>0) {
                for(int i=0;i<caseList.size();i++){
                    String vOffcode = caseList.get(i).get("offcode").toString();
                    String vLegislationCode = caseList.get(i).get("legislation_code").toString();
                    String vMonthYear = reqHeader.getMonth_year();

                    AllCaseByOffcode caseData = new AllCaseByOffcode();
                    caseData.setOffcode(caseList.get(i).get("offcode").toString());
                    caseData.setOffname(caseList.get(i).get("offname").toString());
                    caseData.setShort_name(caseList.get(i).get("short_name").toString());
                    caseData.setLegislation_code(caseList.get(i).get("legislation_code").toString());
                    caseData.setLegislation_name(caseList.get(i).get("legislation_name").toString());
                    caseData.setCase_qty(getCaseQty(vOffcode,vMonthYear, vLegislationCode));
                    caseData.setCourt_qty(getCourtQty(vOffcode,vMonthYear, vLegislationCode));
                    caseData.setNoculprit_qty(getNoCulpritQty(vOffcode,vMonthYear, vLegislationCode));
                    caseData.setCase_fine(getCaseFine(vOffcode,vMonthYear, vLegislationCode));
                    caseData.setCourt_fine(getCourtFine(vOffcode,vMonthYear, vLegislationCode));
                    caseData.setNoculprit_fine(getNoCulpritEstimateFine(vOffcode,vMonthYear, vLegislationCode));

                    ret.add(caseData);
                }
            }else{

            }
        }catch(Exception e){
                e.printStackTrace();
        }

        return ret;
    }

    private long getCaseQty(String offcode, String month_year, String legislation_code) throws Exception{
        BaseDomain biQty = new BaseDomain(db);
        String sql = " select count(bi.id) case_qty";
         sql += " from book_impeachment bi ";
         sql += " inner join application_arrest aa on aa.track_no=bi.track_no";
         sql += " inner join legislation lg on lg.id=aa.legislation_id " ;
         sql += " inner join ed_office ed on ed.offcode=aa.offcode ";
         sql += " where to_char(bi.case_date,'mmyyyy') = '" + month_year + "' ";
         sql += " and lg.legislation_code = '" + legislation_code + "'";
         sql += " and substr(ed.offcode,1,4)||'00' = '" + offcode + "' ";

         //System.out.println("GetCaseQty : " + sql);
         List<Map<String,Object>> cList = biQty.findBySql(sql);
         if(cList.get(0).get("case_qty") != null)
             return new Long(cList.get(0).get("case_qty").toString());
         else
             return 0l;
    }

    private long getCourtQty(String offcode, String month_year, String legislation_code) throws Exception{
        BaseDomain bi = new BaseDomain(db);
        String sql = "";
             sql += " select count(bi.id) court_qty";
             sql +=  " from book_impeachment bi ";
             sql +=  " inner join application_arrest aa on aa.track_no=bi.track_no";
             sql +=  " inner join legislation lg on lg.id=aa.legislation_id";
             sql +=  " inner join ed_office ed on ed.offcode=aa.offcode ";
             sql +=  " where to_char(bi.case_date,'mmyyyy') = '" + month_year + "'";
             sql +=  " and lg.legislation_code = '" + legislation_code + "'";
             sql +=  " and bi.case_quality<>'1' and aa.have_culprit='Y'";
             sql += " and substr(ed.offcode,1,4)||'00' = '" + offcode + "'";

        List<Map<String,Object>> cList = bi.findBySql(sql);
        if(cList.get(0).get("court_qty") != null)
            return new Long(cList.get(0).get("court_qty").toString());
        else
            return 0l;
    }

    private long getNoCulpritQty(String offcode, String month_year, String legislation_code) throws Exception{
        BaseDomain bi = new BaseDomain(db);
        String sql = "";
            sql += " select count(bi.id) court_qty" ;
            sql += " from book_impeachment bi ";
            sql += " inner join application_arrest aa on aa.track_no=bi.track_no";
            sql += " inner join legislation lg on lg.id=aa.legislation_id";
            sql += " inner join ed_office ed on ed.offcode = aa.offcode ";
            sql += " where to_char(bi.case_date,'mmyyyy') = '" + month_year + "'";
            sql += " and aa.have_culprit='N'";
            sql += " and lg.legislation_code = '" + legislation_code + "'";
            sql += " and substr(ed.offcode,1,4)||'00' = '" + offcode + "' ";

        List<Map<String,Object>> cList = bi.findBySql(sql);
        if(cList.get(0).get("court_qty") != null)
            return new Long(cList.get(0).get("court_qty").toString());
        else
            return 0l;
    }

    private double getCaseFine(String offcode, String month_year, String legislation_code) throws Exception{
        BaseDomain ccFine = new BaseDomain(db);
        String sql = "";
         sql += " select sum(nvl(cc.birbe_money,0)+nvl(cc.reward_money,0)+nvl(cc.treasury_money,0)) case_fine";
         sql += " from compare_case cc ";
         sql += " inner join application_arrest aa on aa.track_no=cc.track_no ";
         sql += " inner join legislation lg on lg.id=aa.legislation_id";
         sql += " inner join ed_office ed on ed.offcode = aa.offcode ";
         sql += " where to_char(cc.pay_date,'mmyyyy') = '" + month_year + "'";
         sql += " and lg.legislation_code = '" + legislation_code + "'";
         sql += " and substr(ed.offcode,1,4)||'00' = '" + offcode + "'";
         //System.out.println("getCaseFine : " + sql);
         List<Map<String,Object>> cList = ccFine.findBySql(sql);
         if(cList.get(0).get("case_fine") != null)
             return new Double(cList.get(0).get("case_fine").toString());
         else
             return 0d;
    }

    private double getCourtFine(String offcode, String month_year, String legislation_code) throws Exception{
        BaseDomain bi = new BaseDomain(db);
        String sql = "";
         sql += " select sum(nvl(bi.case_fine,0)) court_fine";
         sql += " from book_impeachment bi ";
         sql += " inner join application_arrest aa on aa.track_no=bi.track_no ";
         sql += " inner join legislation lg on lg.id=aa.legislation_id";
         sql += " inner join ed_office ed on ed.offcode = aa.offcode ";
         sql += " where to_char(bi.case_last_date,'mmyyyy') = '" + month_year + "'";
         sql += " and lg.legislation_code = '" + legislation_code + "'";
         sql += " and substr(ed.offcode,1,4)||'00' = '" + offcode + "' ";

        List<Map<String,Object>> biList = bi.findBySql(sql);
        if(biList.get(0).get("court_fine") != null)
            return new Double(biList.get(0).get("court_fine").toString());
        else
            return 0d;
    }

    private double getNoCulpritEstimateFine(String offcode, String month_year, String legislation_code) throws Exception{
        BaseDomain bi = new BaseDomain(db);
        String sql = "";
         sql += " select sum(nvl(aa.estimate_fine,0)) noculprit_estimate_fine";
         sql += " from application_arrest aa ";
         sql += " inner join book_impeachment bi on bi.track_no=aa.track_no";
         sql += " inner join legislation lg on lg.id=aa.legislation_id";
         sql += " inner join ed_office ed on ed.offcode = aa.offcode ";
         sql += " where to_char(bi.case_last_date,'mmyyyy') = '" + month_year + "'";
         sql += " and lg.legislation_code = '" + legislation_code + "'";
         sql += " and aa.have_culprit='N'";
         sql += " and substr(ed.offcode,1,4)||'00' = '" + offcode + "' ";

        List<Map<String,Object>> biList = bi.findBySql(sql);
        if(biList.get(0).get("noculprit_estimate_fine") != null)
                return new Double(biList.get(0).get("noculprit_estimate_fine").toString());
        else
                return 0d;
    }

    public static void main(String args[]) throws Exception {
        CaseBySector sbs = new CaseBySector();
        RequestHeader hm = new RequestHeader();
        hm.appID = "ILLEGAL";
        hm.ip_address = "127.0.0.1";
        hm.idcard_no = "3410101141069";
        hm.month_year = "092010";
        hm.offcode = "050000";

        ResponseHeader hh = sbs.getResponse(hm);
        ArrayList<AllCaseByOffcode> data = hh.getResponseBody();
        for(int i=0;i<data.size();i++){
            System.out.println(data.get(i).getOffcode() + " " + data.get(i).getOffname() + " " +
                             data.get(i).getShort_name() + " " + data.get(i).getLegislation_code() + " " +
                             data.get(i).getLegislation_name() + " " + data.get(i).getCase_qty());
            //System.out.println(data.get(i).getOffname());
            //System.out.println(data.get(i).getShort_name());
            //System.out.println(data.get(i).getLegislation_code());
            //System.out.println(data.get(i).getLegislation_name());
            //System.out.println(data.get(i).getCase_qty());
//			System.out.println(data.get(i).getCourt_qty());
//			System.out.println(data.get(i).getNoculprit_qty());
//			System.out.println(data.get(i).getCase_fine());
//			System.out.println(data.get(i).getCourt_fine());
//			System.out.println(data.get(i).getNoculprit_fine());
        }

    }
}
