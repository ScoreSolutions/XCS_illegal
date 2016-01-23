package com.ko.webapp.ajax;


import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.StringTokenizer;

import com.ko.domain.CompareCase;
import com.ko.domain.BookImpeachment;
import com.ko.util.StringUtil;

public class Pke_CompareAjax extends BaseAjax{
	public List<String> getShareMoney(String vTrackNo,Integer vLegislation,Integer vIndictment,String vIsNotice,Double vFineSum){
		List<String> shareMoney = new ArrayList<String>();
		try{
			String sql = "select PKE_COMPARE.getShareMoney(?,?,?,?,?) as result from dual";
			CompareCase cc = new CompareCase(db);
			Object objs[] =new Object[]{vTrackNo,vLegislation,vIndictment,vIsNotice,vFineSum};
			Object obj = cc.findBySqlSingleResult(sql,objs);
			String result = StringUtil.getValueAsString(obj);
			StringTokenizer st = new StringTokenizer(result, "#");
			while( st.hasMoreElements() ){
				shareMoney.add((String)st.nextElement());
			}
		}catch (Exception e) {
			e.printStackTrace();
			// TODO: handle exception
		}finally{
			closeDB();
		}
		return shareMoney;
	}
	
	public String ChkDupCompareCaseNO(String vTrackNo, String caseID, String offcode,String vCaseNoneOffice){
		String ret = "";
		try{
			String sql = "select cc.id ";
			sql += " from compare_case cc ";
			sql += " inner join book_impeachment bi on bi.track_no=cc.track_no";
			sql += " where cc.compare_case_no = '" + caseID + "' and cc.track_no <> '" + vTrackNo + "'";
			sql += " and cc.compare_office = '" + offcode + "' ";
			sql += " and bi.case_none_office='" + vCaseNoneOffice + "'";
			//log.debug(sql);
			CompareCase cc = new CompareCase(db);
			List<Map<String,Object>> list = cc.findBySql(sql);
			if(list.size()>0){
				ret = "เลขที่คดีเปรียบเทียบปรับซ้ำ";
			}
		}catch(Exception e){
			e.printStackTrace();
		}finally{
			closeDB();
		}
		return ret;
	}
	
	public String ChkDupCaseID(String vTrackNo, String caseID, String offcode,String vCaseNoneOffice){
		String ret = "";
		try{
			String sql = "select bi.id from book_impeachment bi ";
			sql += " inner join application_arrest aa on aa.track_no=bi.track_no";
			//sql += " inner join staff st on bi.staff_id_sue=st.idcard_no ";
			sql += " where bi.case_id = '" + caseID + "' and bi.track_no <> '" + vTrackNo + "'";
			sql += " and aa.offcode = '" + offcode + "'";
			sql += " and bi.case_none_office = '" + vCaseNoneOffice + "'";
			//log.debug(sql);
			BookImpeachment bi = new BookImpeachment(db);
			List<Map<String,Object>> list = bi.findBySql(sql);
			if(list.size()>0){
				ret = "เลขที่คดีซ้ำ";
			}
		}catch(Exception e){
			e.printStackTrace();
		}finally{
			closeDB();
		}
		return ret;
	}
	
	public String ChkDupExhibitReportNo(String vTrackNo, String ExhibitNo, String offcode){
		String ret = "";
		try{
			String sql = "select aap.id from application_arrest_prove aap ";
			sql += " inner join application_arrest aa on aa.track_no=aap.track_no ";
			sql += " where aap.exhibit_report_no = '" + ExhibitNo + "' and aa.track_no <> '" + vTrackNo + "'";
			sql += " and aap.staff_prove_offcode = '" + offcode + "'";
			//log.debug(sql);
			BookImpeachment bi = new BookImpeachment(db);
			List<Map<String,Object>> list = bi.findBySql(sql);
			if(list.size()>0){
				ret = "เลขที่รายงานพิสูจน์ซ้ำ";
			}
		}catch(Exception e){
			e.printStackTrace();
		}finally{
			closeDB();
		}
		return ret;
	}
	
	public String ChkValidateCompareCaseNo(String vCompareCaseNo, String vCompareCaseYear, String vOffcode, String vTrackNo){
		String ret = "";
		try{
//			if(!vCompareCaseNo.equals("") && !vCompareCaseYear.equals("")){			
//				String sql = "select max(substr(bi.case_id,1, instr(bi.case_id,'/')-1)) max_caseid";
//				sql += " from book_impeachment bi";
//				sql += " inner join application_arrest aa on aa.track_no=bi.track_no ";
//				sql += " where substr(bi.case_id,instr(bi.case_id,'/')+1)='" + vCompareCaseYear + "' ";
//				sql += " and aa.offcode = '" + vOffcode + "'";
//				sql += " and instr(bi.case_id,'/')>0";
//				//sql += " and aa.track_no <> '" + vTrackNo + "'";
//				log.debug(sql);
//				BookImpeachment bi = new BookImpeachment(db);
//				List<Map<String,Object>> list = bi.findBySql(sql);
//				if(list.size()>0){
//					if(list.get(0).get("max_caseid") != null){
//						if(Double.parseDouble(vCompareCaseNo) > Double.parseDouble(list.get(0).get("max_caseid").toString())){
//							ret = "เลขที่คดีเปรียบเทียบที่ ต้องน้อยกว่า เลขบันทึกรับคำกล่าวโทษ";
//						}
//					}
//				}
//			}
		}
		catch(Exception ex){
			ex.printStackTrace();
		}
		finally{
			closeDB();
		}
		
		return ret;
	}
	
	public static void main(String[] args) {
		//List<String> result = new Pke_CompareAjax().getShareMoney("TN1002005300002", 1, 5, "N", 10000d);
		//String result = new Pke_CompareAjax().ChkDupCompareCaseNO("1251243", "1000/2554", "030600");
		//System.out.println(result);
		
	}
}
