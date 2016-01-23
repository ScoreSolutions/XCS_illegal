package service;

import data.AllCaseByGroupID;
import java.lang.Exception;
import java.util.List;
import java.util.Map;
import java.util.HashMap;
import java.util.ArrayList;
import com.domain.*;
import data.ResponseHeader;

public class AllCaseByGroupIDService extends BaseService {

    String _err = "";

    private boolean getIsValidData(String dateFrom ,String dateTo, String groupID) throws Exception{
        boolean ret = false;
        try{
            BaseDomain aa = new BaseDomain(db);
            String sql = "";
            sql += " select distinct to_char(bi.case_date,'dd/mm/yyyy','NLS_CALENDAR=''THAI BUDDHA'' NLS_DATE_LANGUAGE=THAI') case_date, ";
            sql += " to_char(bi.case_date,'yyyymmdd') case_date2 ";
            sql += " from book_impeachment bi ";
            sql += " inner join application_arrest aa on aa.track_no=bi.track_no ";
            sql += " where to_char(bi.case_date,'yyyymmdd') between '" + dateFrom + "' and '" + dateTo + "' ";
            sql += " and aa.product_group_id='" + groupID + "' and rownum=1";
            //System.out.println(sql);
            List<Map<String,Object>> caseList = aa.findBySql(sql);
            if(caseList.size()>0)
                ret = true;

        }catch (Exception e){
            e.printStackTrace();
        }

        return ret;
    }

    public ResponseHeader getResponse(RequestHeader reqHeader) throws Exception {
        ResponseHeader ret = new ResponseHeader();
        String dateFrom = reqHeader.getDateFrom();
        String dateTo = reqHeader.getDateTo();
        String groupID = reqHeader.getGroupID();

        String idCard_no = reqHeader.getIdcard_no();
        String appID = reqHeader.getAppID();
        String ins = "insert into use_webservice" + reqHeader.dateFrom + " " + reqHeader.dateTo + " " + reqHeader.groupID + "  " + reqHeader.getAppID();
        //System.out.println("getResponse : " + ins);

        if (validateHeader(reqHeader) == true) {
            if (getIsValidData(dateFrom, dateTo, groupID) == true) {
                ret.setIsValidData(true);
                ret.setMessage("");
                ret.setResponseBody(setAllCaseByGroupID(dateFrom, dateTo, groupID));
                //System.out.println("Success");
            } else {
                ret.setIsValidData(false);
                ret.setMessage("ไม่พบข้อมูลที่ต้องการ");
                ret.setResponseBody(null);
                //System.out.println("No Data Found");
            }
        } else {
            ret.setIsValidData(false);
            ret.setMessage(_err);
            ret.setResponseBody(null);
        }

        return ret;
    }

    private boolean validateHeader(RequestHeader reqHeader) throws Exception {
        boolean ret = true;

        if (reqHeader.getAppID() == null || reqHeader.getAppID().trim().equals("")) {
            _err = "กรุณาระบุ Application ID";
            ret = false;
        } else if (reqHeader.getIP_address() == null || reqHeader.getIP_address().trim().equals("")) {
            _err = "กรุณาระบุหมายเลข IP";
            ret = false;
        } else if (reqHeader.getDateFrom() == null || reqHeader.getDateFrom().trim().equals("")) {
            _err = "กรุณาระบุวันที่เริ่มต้น";
            ret = false;
        } else if (reqHeader.getDateTo() == null || reqHeader.getDateTo().trim().equals("")) {
            _err = "กรุณาระบุวันที่สิ้นสุด";
            ret = false;
        } else if (reqHeader.getGroupID() == null || reqHeader.getGroupID().trim().equals("")) {
            _err = "กรุณาระบุรหัสกลุ่มสินค้า";
            ret = false;
        } else if (reqHeader.getIdcard_no() == null || reqHeader.getIdcard_no().trim().equals("")) {
            _err = "กรุณาระบุเลขที่บัตรประชาชนของผู้ใช้งาน";
            ret = false;
        } else if (chkIDCardno(reqHeader.getIdcard_no()) == false) {
            ret = false;
        }

        return ret;
    }

    private boolean chkIDCardno(String idcard_no) throws Exception {
        boolean ret = false;
        try {
            String sql = "select id from staff where idcard_no='" + idcard_no + "'";
            //System.out.println(sql);
            BaseDomain aa = new BaseDomain(db);
            List<Map<String, Object>> sList = aa.findBySql(sql);

            if (sList != null && sList.size() > 0) {
                ret = true;
            } else {
                _err = "ไม่พบข้อมูลเจ้าหน้าที่";
            }

        } catch (Exception e) {
            ret = false;
            _err = e.getMessage();
        }
        return ret;
    }

    public ArrayList<AllCaseByGroupID> setAllCaseByGroupID(String dateFrom, String dateTo, String group_id) throws Exception {
        ArrayList<AllCaseByGroupID> ret = new ArrayList();

        try {
            BaseDomain aa = new BaseDomain(db);
            String sql = "";
            sql += " select distinct to_char(bi.case_date,'dd/mm/yyyy','NLS_CALENDAR=''THAI BUDDHA'' NLS_DATE_LANGUAGE=THAI') case_date, ";
            sql += " to_char(bi.case_date,'yyyymmdd') case_date2, dg.group_id, dg.group_name ";
            sql += " from book_impeachment bi ";
            sql += " inner join application_arrest aa on aa.track_no=bi.track_no ";
            sql += " inner join duty_group dg on dg.group_id=aa.product_group_id ";
            sql += " where to_char(bi.case_date,'yyyymmdd') between '" + dateFrom + "' and '" + dateTo + "' ";
            sql += " and aa.product_group_id='" + group_id + "' ";
            sql += " order by to_char(bi.case_date,'yyyymmdd')";
            ArrayList<HashMap<String, Object>> caseList = aa.findToArrayList(sql);
            //System.out.println(sql);
            if (caseList.size() > 0) {

                for (int i = 0; i < caseList.size(); i++) {
                    String vDate = caseList.get(i).get("case_date2").toString();
                    String vGroupID = caseList.get(i).get("group_id").toString();

                    AllCaseByGroupID caseData = new AllCaseByGroupID();
                    caseData.setCase_date(caseList.get(i).get("case_date").toString());
                    caseData.setGroup_id(caseList.get(i).get("group_id").toString());
                    caseData.setGroup_name(caseList.get(i).get("group_name").toString());
                    caseData.setCase_qty(getCaseQty(vDate, vGroupID));
                    caseData.setCourt_qty(getCourtQty(vDate, vGroupID));
                    caseData.setNoculprit_qty(getNoCulpritQty(vDate, vGroupID));
                    caseData.setCase_fine(getCaseFine(vDate, vGroupID));
                    caseData.setCourt_fine(getCourtFine(vDate, vGroupID));
                    caseData.setNoculprit_fine(getNoCulpritEstimateFine(vDate, vGroupID));

                    ret.add(caseData);
                }
            }

        } catch (Exception e) {
            e.printStackTrace();
        }

        return ret;
    }

    private Long getCaseQty(String vDate, String group_id) throws Exception {
        BaseDomain biQty = new BaseDomain(db);
        String sql = ""
                + " select count(bi.id) case_qty"
                + " from book_impeachment bi "
                + " inner join application_arrest aa on aa.track_no=bi.track_no"
                + " where to_char(bi.case_date,'yyyymmdd') = '" + vDate + "'"
                + " and aa.product_group_id = '" + group_id + "'";

        //System.out.println(sql);

        return new Long(biQty.findBySql(sql).get(0).get("case_qty").toString());
    }

    private Long getCourtQty(String vDate, String group_id) throws Exception {
        BaseDomain bi = new BaseDomain(db);
        String sql = ""
                + " select count(bi.id) court_qty"
                + " from book_impeachment bi "
                + " inner join application_arrest aa on aa.track_no=bi.track_no"
                + " where to_char(bi.case_date,'yyyymmdd') = '" + vDate + "'"
                + " and aa.product_group_id = '" + group_id + "'"
                + " and bi.case_quality<>'1' and aa.have_culprit='Y'";

        return new Long(bi.findBySql(sql).get(0).get("court_qty").toString());
    }

    private Long getNoCulpritQty(String vDate, String group_id) throws Exception {
        BaseDomain bi = new BaseDomain(db);
        String sql = ""
                + " select count(bi.id) court_qty"
                + " from book_impeachment bi "
                + " inner join application_arrest aa on aa.track_no=bi.track_no"
                + " where to_char(bi.case_date,'yyyymmdd') = '" + vDate + "'"
                + " and aa.product_group_id = '" + group_id + "'"
                + " and aa.have_culprit='N'";

        return new Long(bi.findBySql(sql).get(0).get("court_qty").toString());
    }

    private Double getCaseFine(String vDate, String group_id) throws Exception {
        Double ret = 0d;
        BaseDomain ccFine = new BaseDomain(db);
        String sql = ""
                + " select sum(nvl(cc.birbe_money,0)+nvl(cc.reward_money,0)+nvl(cc.treasury_money,0)) case_fine"
                + " from compare_case cc "
                + " inner join application_arrest aa on aa.track_no=cc.track_no "
                + " where to_char(cc.pay_date,'yyyymmdd') = '" + vDate + "'"
                + " and aa.product_group_id = '" + group_id + "'";
        //System.out.println(sql);

        if (ccFine.findBySql(sql).get(0).get("case_fine") != null){
            ret = new Double(ccFine.findBySql(sql).get(0).get("case_fine").toString());
        }

        return ret;
    }

    private Double getCourtFine(String vDate, String group_id) throws Exception {
        BaseDomain bi = new BaseDomain(db);
        String sql = ""
                + " select sum(nvl(bi.case_fine,0)) court_fine"
                + " from book_impeachment bi "
                + " inner join application_arrest aa on aa.track_no=bi.track_no "
                + " where to_char(bi.case_last_date,'yyyymmdd') = '" + vDate + "'"
                + " and aa.product_group_id = '" + group_id + "'";

        if (bi.findBySql(sql).get(0).get("court_fine") != null) {
            return new Double(bi.findBySql(sql).get(0).get("court_fine").toString());
        } else {
            return 0d;
        }
    }

    private Double getNoCulpritEstimateFine(String vDate, String group_id) throws Exception {
        BaseDomain bi = new BaseDomain(db);
        String sql = ""
                + " select sum(nvl(aa.estimate_fine,0)) noculprit_estimate_fine"
                + " from application_arrest aa "
                + " inner join book_impeachment bi on bi.track_no=aa.track_no"
                + " where to_char(bi.case_last_date,'yyyymmdd') = '" + vDate + "'"
                + " and aa.product_group_id = '" + group_id + "'"
                + " and aa.have_culprit='N'";
        log.debug(sql);

        ArrayList<HashMap<String, Object>> biList = (ArrayList) bi.findBySql(sql);
        if (biList.get(0).get("noculprit_estimate_fine") != null) {
            return new Double(biList.get(0).get("noculprit_estimate_fine").toString());
        } else {
            return 0d;
        }
    }

    public static void main(String args[]) throws Exception {
        try {
            AllCaseByGroupIDService kList = new AllCaseByGroupIDService();
//		System.out.println(kList.getCaseQty("20101101", "7002"));
            ArrayList<AllCaseByGroupID> data = kList.setAllCaseByGroupID("20101001", "20101005", "7002");
////		List<Map<String,Object>> lList = kList.AllCaseByGroupID("20101001","20101031","7002");
            for (int i = 0; i < data.size(); i++) {
                System.out.println(data.get(i).getCase_date());
                System.out.println(data.get(i).getCase_fine());
                System.out.println(data.get(i).getCourt_fine());
            }
        } catch (Exception e) {
            System.out.println("Error");
        }

    }
}
