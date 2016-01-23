package com.ko.illegalwebservice.service;

import com.ko.illegalwebservice.data.AllCaseByGroupID;

//import java.util.List;
//import java.util.Map;
import java.util.HashMap;
import java.util.ArrayList;
import com.ko.domain.ApplicationArrest;
import com.ko.domain.BookImpeachment;
import com.ko.domain.CompareCase;

public class AllCaseByGroupIDService extends BaseService {
	public  ArrayList<AllCaseByGroupID> AllCaseByGroupID(String dateFrom ,String dateTo, String group_id){
		ArrayList<AllCaseByGroupID> ret = new ArrayList();

		try{
			ApplicationArrest aa = new ApplicationArrest(db);
			String sql = "";
			sql += " select distinct to_char(bi.case_date,'dd/mm/yyyy','NLS_CALENDAR=''THAI BUDDHA'' NLS_DATE_LANGUAGE=THAI') case_date, ";
			sql += " to_char(bi.case_date,'yyyymmdd') case_date2, dg.group_id, dg.group_name ";
			sql += " from book_impeachment bi ";
			sql += " inner join application_arrest aa on aa.track_no=bi.track_no ";
			sql += " inner join duty_group dg on dg.group_id=aa.product_group_id ";
			sql += " where to_char(bi.case_date,'yyyymmdd') between '" + dateFrom + "' and '" + dateTo + "' ";
			sql += " and aa.product_group_id='" + group_id + "' ";
			sql += " order by to_char(bi.case_date,'yyyymmdd')";
			ArrayList<HashMap<String,Object>> caseList = aa.findToArrayList(sql);
			
			for(int i=0;i<caseList.size();i++){
				String vDate = caseList.get(i).get("case_date2").toString();
				String vGroupID = caseList.get(i).get("group_id").toString();
				
				AllCaseByGroupID caseData = new AllCaseByGroupID();
				caseData.setCase_date(caseList.get(i).get("case_date").toString());
				caseData.setGroup_id(caseList.get(i).get("group_id").toString());
				caseData.setGroup_name(caseList.get(i).get("group_name").toString());
				caseData.setCase_qty(getCaseQty(vDate, vGroupID));
				caseData.setCourt_qty(getCourtQty(vDate,vGroupID));
				caseData.setNoculprit_qty(getNoCulpritQty(vDate,vGroupID));
				caseData.setCase_fine(getCaseFine(vDate,vGroupID));
				caseData.setCourt_fine(getCaseFine(vDate,vGroupID));
				caseData.setNoculprit_fine(getNoCulpritEstimateFine(vDate,vGroupID));
				
				ret.add(caseData);
				
			}
		}catch(Exception e){
			e.printStackTrace();
		}
		
		return ret;
	}
	
	private Long getCaseQty(String vDate , String group_id) throws Exception{
		BookImpeachment biQty = new BookImpeachment(db);
		String sql = ""
		 + " select count(bi.id) case_qty"
		 + " from book_impeachment bi "
		 + " inner join application_arrest aa on aa.track_no=bi.track_no"
		 + " where to_char(bi.case_date,'yyyymmdd') = '" + vDate + "'"
		 + " and aa.product_group_id = '" + group_id + "'";
		
		return new Long(biQty.findBySql(sql).get(0).get("case_qty").toString());
	}
	
	private Long getCourtQty(String vDate , String group_id) throws Exception{
		BookImpeachment bi = new BookImpeachment(db);
		String sql = ""
		 + " select count(bi.id) court_qty"
		 + " from book_impeachment bi "
		 + " inner join application_arrest aa on aa.track_no=bi.track_no"
		 + " where to_char(bi.case_date,'yyyymmdd') = '" + vDate + "'"
		 + " and aa.product_group_id = '" + group_id + "'"
		 + " and bi.case_quality<>'1' and aa.have_culprit='Y'";
		
		return new Long(bi.findBySql(sql).get(0).get("court_qty").toString());
	}
	
	private Long getNoCulpritQty(String vDate , String group_id) throws Exception{
		BookImpeachment bi = new BookImpeachment(db);
		String sql = ""
		 + " select count(bi.id) court_qty"
		 + " from book_impeachment bi "
		 + " inner join application_arrest aa on aa.track_no=bi.track_no"
		 + " where to_char(bi.case_date,'yyyymmdd') = '" + vDate + "'"
		 + " and aa.product_group_id = '" + group_id + "'"
		 + " and aa.have_culprit='N'";
		
		return new Long(bi.findBySql(sql).get(0).get("court_qty").toString());
	}
	
	private Double getCaseFine(String vDate, String group_id) throws Exception{
		CompareCase ccFine = new CompareCase(db);
		String sql = ""
		 + " select sum(nvl(cc.birbe_money,0)+nvl(cc.reward_money,0)+nvl(cc.treasury_money,0)) case_fine"
		 + " from compare_case cc "
		 + " inner join application_arrest aa on aa.track_no=cc.track_no "
		 + " where to_char(cc.pay_date,'yyyymmdd') = '" + vDate + "'"
		 + " and aa.product_group_id = '" + group_id + "'";
		return new Double(ccFine.findBySql(sql).get(0).get("case_fine").toString());
	}
	
	private Double getCourtFine(String vDate, String group_id) throws Exception{
		BookImpeachment bi = new BookImpeachment(db);
		String sql = ""
		 + " select sum(nvl(bi.case_fine,0)) court_fine"
		 + " from book_impeachment bi "
		 + " inner join application_arrest aa on aa.track_no=bi.track_no "
		 + " where to_char(bi.case_last_date,'yyyymmdd') = '" + vDate + "'"
		 + " and aa.product_group_id = '" + group_id + "'";
		return new Double(bi.findBySql(sql).get(0).get("court_fine").toString());
	}
	
	private Double getNoCulpritEstimateFine(String vDate, String group_id) throws Exception{
		BookImpeachment bi = new BookImpeachment(db);
		String sql = ""
		 + " select sum(nvl(aa.estimate_fine,0)) noculprit_estimate_fine"
		 + " from application_arrest aa "
		 + " inner join book_impeachment bi on bi.track_no=aa.track_no"
		 + " where to_char(bi.case_last_date,'yyyymmdd') = '" + vDate + "'"
		 + " and aa.product_group_id = '" + group_id + "'"
		 + " and aa.have_culprit='N'";
		//log.debug(sql);
		
		ArrayList<HashMap<String,Object>> biList = (ArrayList)bi.findBySql(sql);
		if(biList.get(0).get("noculprit_estimate_fine") != null)
			return new Double(biList.get(0).get("noculprit_estimate_fine").toString());
		else
			return null;
	}
	
	public static void main(String args[]) {
		AllCaseByGroupIDService kList = new AllCaseByGroupIDService();
		ArrayList<AllCaseByGroupID> data = kList.AllCaseByGroupID("20101001","20101031","7002");
//		List<Map<String,Object>> lList = kList.AllCaseByGroupID("20101001","20101031","7002");
		for(int i=0;i<data.size();i++){
			System.out.println(data.get(i).getCase_date());
			System.out.println(data.get(i).getGroup_id());
			System.out.println(data.get(i).getGroup_name());
			System.out.println(data.get(i).getCase_qty());
			System.out.println(data.get(i).getCase_fine());
//			System.out.println("court_fine " + lList.get(i).get("court_fine"));
//			System.out.println("noculprit_estimate_fine " + lList.get(i).get("noculprit_estimate_fine"));
		}
	}
}
