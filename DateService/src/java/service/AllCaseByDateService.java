package service;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.lang.Exception;

import com.domain.BaseDomain;
import data.*;
import service.RequestHeader;
//import com.ko.domain.BookImpeachment;
//import com.ko.domain.CompareCase;
//import com.ko.illegalwebservice.data.AllCaseByDate;
//import com.ko.illegalwebservice.data.AllCaseByGroupID;

public class AllCaseByDateService extends BaseService {

    String _err="";

    private boolean getIsValidData(String dateFrom ,String dateTo, String legislation_code) throws Exception{
        boolean ret = false;
        try{
            BaseDomain aa = new BaseDomain(db);
            String sql = "";
            sql += " select distinct to_char(bi.case_date,'dd/mm/yyyy','NLS_CALENDAR=''THAI BUDDHA'' NLS_DATE_LANGUAGE=THAI') case_date, ";
            sql += " to_char(bi.case_date,'yyyymmdd') case_date2, lg.legislation_code, lg.legislation_name ";
            sql += " from book_impeachment bi ";
            sql += " inner join application_arrest aa on aa.track_no=bi.track_no ";
            sql += " inner join legislation lg on lg.id=aa.legislation_id ";
            sql += " where to_char(bi.case_date,'yyyymmdd') between '" + dateFrom + "' and '" + dateTo + "' ";
            sql += " and lg.legislation_code='" + legislation_code + "' ";
            //sql += " order by to_char(bi.case_date,'yyyymmdd')";
            List<Map<String,Object>> caseList = aa.findBySql(sql);
            if(caseList.size()>0)
                ret = true;

        }catch (Exception e){
            e.printStackTrace();
        }

        return ret;
    }

    public ResponseHeader getResponse(RequestHeader reqHeader) throws Exception{
        ResponseHeader ret = new ResponseHeader();
        String dateFrom = reqHeader.getDateFrom();
        String dateTo = reqHeader.getDateTo();
        String legislation_code = reqHeader.getLegislationCode();

        String idCard_no = reqHeader.getIdcard_no();
        String appID = reqHeader.getAppID();
        String ins = "insert into use_webservice" + reqHeader.dateFrom + " " + reqHeader.dateTo + " " + reqHeader.legislationCode + "  " + reqHeader.getAppID();
        //System.out.println("getResponse : " + ins);

        if(validateHeader(reqHeader)==true){
            if (getIsValidData(dateFrom,dateTo,legislation_code)==true){
                ret.setIsValidData(true);
                ret.setMessage("");
                ret.setResponseBody(setAllCaseByDate(dateFrom,dateTo,legislation_code));
                //System.out.println("Success");
            }else{
                ret.setIsValidData(false);
                ret.setMessage("ไม่พบข้อมูลที่ต้องการ");
                ret.setResponseBody(null);
                //System.out.println("No Data Found");
            }
        }else{
            ret.setIsValidData(false);
            ret.setMessage(_err);
            ret.setResponseBody(null);
        }

        return ret;
    }

    private boolean validateHeader(RequestHeader reqHeader) throws Exception {
        boolean ret = true;

        if(reqHeader.getAppID() == null || reqHeader.getAppID().equals("")){
            _err = "กรุณาระบุ Application ID";
            ret = false;
        }else if(reqHeader.getIP_address() == null || reqHeader.getIP_address().equals("")){
            _err = "กรุณาระบุหมายเลข IP";
            ret = false;
        }else if(reqHeader.getDateFrom() == null || reqHeader.getDateFrom().equals("")){
            _err = "กรุณาระบุวันที่เริ่มต้น";
            ret = false;
        }else if(reqHeader.getDateTo() == null || reqHeader.getDateTo().equals("")){
            _err = "กรุณาระบุวันที่สิ้นสุด";
            ret = false;
        }else if(reqHeader.getLegislationCode() == null || reqHeader.getLegislationCode().equals("")){
            _err = "กรุณาระบุรหัส พ.ร.บ.";
            ret = false;
        }else if(reqHeader.getIdcard_no() == null || reqHeader.getIdcard_no().equals("")){
            _err = "กรุณาระบุเลขบัตรประชาชนของเจ้าหน้าที่";
            ret = false;
        }else if (chkIDCardno(reqHeader.getIdcard_no())==false){
            ret = false;
        }

        return ret;
    }

    private boolean chkIDCardno(String idcard_no) throws Exception{
        boolean ret = false;
        try{
                String sql = "select id from staff where idcard_no='" + idcard_no + "'";
                System.out.println(sql);
                BaseDomain aa = new BaseDomain(db);
                List<Map<String,Object>> sList = aa.findBySql(sql);

            if(sList != null && sList.size()>0)
                ret = true;
            else
                _err = "ไม่พบข้อมูลเจ้าหน้าที่";
                
        }catch(Exception e){
            ret = false;
            _err = e.getMessage();
        }
        return ret;
    }

    public  ArrayList AllCaseByDate(String dateFrom ,String dateTo, String legislation_code) throws Exception{
        ArrayList ret = setAllCaseByDate(dateFrom,dateTo,legislation_code);
        return ret;
    }


        private ArrayList setAllCaseByDate(String dateFrom ,String dateTo, String legislation_code) throws Exception{
            ArrayList ret = new ArrayList();
            try{
                BaseDomain aa = new BaseDomain(db);
                String sql = "";
                sql += " select distinct to_char(bi.case_date,'dd/mm/yyyy','NLS_CALENDAR=''THAI BUDDHA'' NLS_DATE_LANGUAGE=THAI') case_date, ";
                sql += " to_char(bi.case_date,'yyyymmdd') case_date2, lg.legislation_code, lg.legislation_name ";
                sql += " from book_impeachment bi ";
                sql += " inner join application_arrest aa on aa.track_no=bi.track_no ";
                sql += " inner join legislation lg on lg.id=aa.legislation_id ";
                sql += " where to_char(bi.case_date,'yyyymmdd') between '" + dateFrom + "' and '" + dateTo + "' ";
                sql += " and lg.legislation_code='" + legislation_code + "' ";
                sql += " order by to_char(bi.case_date,'yyyymmdd')";
                List<Map<String,Object>> caseList = aa.findBySql(sql);

                if(caseList.size()>0) {
                    for(int i=0;i<caseList.size();i++){
                            String vDate = caseList.get(i).get("case_date2").toString();
                            String vLegislationCode = caseList.get(i).get("legislation_code").toString();

                            AllCaseByDate caseData = new AllCaseByDate();
                            caseData.setCase_date(caseList.get(i).get("case_date").toString());
                            caseData.setLegislation_code(caseList.get(i).get("legislation_code").toString());
                            caseData.setLegislation_name(caseList.get(i).get("legislation_name").toString());
                            caseData.setCase_qty(getCaseQty(vDate, vLegislationCode));
                            caseData.setCourt_qty(getCourtQty(vDate,vLegislationCode));
                            caseData.setNoculprit_qty(getNoCulpritQty(vDate,vLegislationCode));
                            caseData.setCase_fine(getCaseFine(vDate,vLegislationCode));
                            caseData.setCourt_fine(getCourtFine(vDate,vLegislationCode));
                            caseData.setNoculprit_fine(getNoCulpritEstimateFine(vDate,vLegislationCode));

                            ret.add(caseData);
                    }
                }else{

                }
            }catch(Exception e){
                    e.printStackTrace();
            }

            return ret;
        }

	private long getCaseQty(String vDate , String legislation_code) throws Exception{
		BaseDomain biQty = new BaseDomain(db);
		String sql = ""
		 + " select count(bi.id) case_qty"
		 + " from book_impeachment bi "
		 + " inner join application_arrest aa on aa.track_no=bi.track_no"
		 + " inner join legislation lg on lg.id=aa.legislation_id "
		 + " where to_char(bi.case_date,'yyyymmdd') = '" + vDate + "'"
		 + " and lg.legislation_code = '" + legislation_code + "'";
		
		return new Long(biQty.findBySql(sql).get(0).get("case_qty").toString());
	}
	
	private long getCourtQty(String vDate , String legislation_code) throws Exception{
		BaseDomain bi = new BaseDomain(db);
		String sql = ""
		 + " select count(bi.id) court_qty"
		 + " from book_impeachment bi "
		 + " inner join application_arrest aa on aa.track_no=bi.track_no"
		 + " inner join legislation lg on lg.id=aa.legislation_id"
		 + " where to_char(bi.case_date,'yyyymmdd') = '" + vDate + "'"
		 + " and lg.legislation_code = '" + legislation_code + "'"
		 + " and bi.case_quality<>'1' and aa.have_culprit='Y'";
		
		return new Long(bi.findBySql(sql).get(0).get("court_qty").toString());
	}
	
	private long getNoCulpritQty(String vDate , String legislation_code) throws Exception{
		BaseDomain bi = new BaseDomain(db);
		String sql = ""
		 + " select count(bi.id) court_qty"
		 + " from book_impeachment bi "
		 + " inner join application_arrest aa on aa.track_no=bi.track_no"
		 + " inner join legislation lg on lg.id=aa.legislation_id"
		 + " where to_char(bi.case_date,'yyyymmdd') = '" + vDate + "'"
		 + " and lg.legislation_code = '" + legislation_code + "'"
		 + " and aa.have_culprit='N'";
		
		return new Long(bi.findBySql(sql).get(0).get("court_qty").toString());
	}
	
	private double getCaseFine(String vDate, String legislation_code) throws Exception{
		BaseDomain ccFine = new BaseDomain(db);
		String sql = ""
		 + " select sum(nvl(cc.birbe_money,0)+nvl(cc.reward_money,0)+nvl(cc.treasury_money,0)) case_fine"
		 + " from compare_case cc "
		 + " inner join application_arrest aa on aa.track_no=cc.track_no "
		 + " inner join legislation lg on lg.id=aa.legislation_id"
		 + " where to_char(cc.pay_date,'yyyymmdd') = '" + vDate + "'"
		 + " and lg.legislation_code = '" + legislation_code + "'";
		return new Double(ccFine.findBySql(sql).get(0).get("case_fine").toString());
	}
	
	private double getCourtFine(String vDate, String legislation_code) throws Exception{
		BaseDomain bi = new BaseDomain(db);
		String sql = ""
		 + " select sum(nvl(bi.case_fine,0)) court_fine"
		 + " from book_impeachment bi "
		 + " inner join application_arrest aa on aa.track_no=bi.track_no "
		 + " inner join legislation lg on lg.id=aa.legislation_id"
		 + " where to_char(bi.case_last_date,'yyyymmdd') = '" + vDate + "'"
		 + " and lg.legislation_code = '" + legislation_code + "'";

                List<Map<String,Object>> biList = bi.findBySql(sql);
                if(biList.get(0).get("court_fine") != null)
                    return new Double(biList.get(0).get("court_fine").toString());
                else
                    return 0d;
	}
	
	private double getNoCulpritEstimateFine(String vDate, String legislation_code) throws Exception{
		BaseDomain bi = new BaseDomain(db);
		String sql = ""
		 + " select sum(nvl(aa.estimate_fine,0)) noculprit_estimate_fine"
		 + " from application_arrest aa "
		 + " inner join book_impeachment bi on bi.track_no=aa.track_no"
		 + " inner join legislation lg on lg.id=aa.legislation_id"
		 + " where to_char(bi.case_last_date,'yyyymmdd') = '" + vDate + "'"
		 + " and lg.legislation_code = '" + legislation_code + "'"
		 + " and aa.have_culprit='N'";
		//log.debug(sql);
		
		List<Map<String,Object>> biList = bi.findBySql(sql);
		if(biList.get(0).get("noculprit_estimate_fine") != null)
			return new Double(biList.get(0).get("noculprit_estimate_fine").toString());
		else
			return 0d;
	}
	
	
	public static void main(String args[]) throws Exception {
		AllCaseByDateService kList = new AllCaseByDateService();
		List<AllCaseByDate> data = kList.AllCaseByDate("20101001","20101031","90");
//		List<Map<String,Object>> lList = kList.AllCaseByGroupID("20101001","20101031","7002");
		for(int i=0;i<data.size();i++){
			System.out.println(data.get(i).getCase_date());
			System.out.println(data.get(i).getLegislation_code());
			System.out.println(data.get(i).getLegislation_name());
			System.out.println(data.get(i).getCase_qty());
			System.out.println(data.get(i).getCourt_qty());
			System.out.println(data.get(i).getNoculprit_qty());
			System.out.println(data.get(i).getCase_fine());
			System.out.println(data.get(i).getCourt_fine());
			System.out.println(data.get(i).getNoculprit_fine());
			//System.out.println(data.get(i).getCase_fine());
//			System.out.println("court_fine " + lList.get(i).get("court_fine"));
//			System.out.println("noculprit_estimate_fine " + lList.get(i).get("noculprit_estimate_fine"));
		}
	}
}
