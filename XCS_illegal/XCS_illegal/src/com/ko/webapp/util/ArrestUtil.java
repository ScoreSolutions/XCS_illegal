package com.ko.webapp.util;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import org.apache.log4j.Logger;
import com.ko.Constants;
import com.ko.util.DB;
import com.ko.domain.EdOffice;
import com.ko.util.DateUtil;
import com.ko.webapp.bean.UserSession;


public class ArrestUtil {
	public static Logger log = Logger.getLogger(Constants.LOG_NAME);
	
	public String getArrestWhere(HttpServletRequest request) throws Exception{
		HttpSession session = request.getSession();
		UserSession uData = (UserSession)session.getAttribute(Constants.USER_SESSION);
		
		String whText = "";
		//log.debug("start ArrestUtil");
        if(!request.getParameter("guilt_base").equals(""))
        	whText += " AND pke_arrest.getArrestIndictment(aa.track_no) like '%" + request.getParameter("guilt_base").replace("'", "''").trim() + "%'  \n";
        if(!request.getParameter("legislation").equals("")) 
        	whText += "  AND aa.LEGISLATION_ID = '" + request.getParameter("legislation") + "'  \n";
        if(!request.getParameter("case_fine").equals(""))
        	whText += " AND cc.case_total_fine >= " + new Double(request.getParameter("case_fine")) + " \n";
        if(!request.getParameter("case_fine2").equals(""))
        	whText += " AND cc.case_total_fine <= " + new Double(request.getParameter("case_fine2")) + " \n";
        if(!request.getParameter("lawbreaker_name").equals(""))
        	whText += " AND pke_arrest.getArrestLawbreaker(aa.track_no) like '%" + request.getParameter("lawbreaker_name").replace("'", "''").trim() + "%'  \n";
        if(!request.getParameter("aa_track_no").equals(""))
        	whText += " AND aa.track_no like '%" + request.getParameter("aa_track_no").replace("'", "''").trim() + "%'  \n";
        if(!request.getParameter("occurrence_date").equals(""))
        	whText += " and to_char(aa.occurrence_date,'yyyymmdd') >= '" + DateUtil.formatConditionDate(request.getParameter("occurrence_date")) + "' \n";
        if(!request.getParameter("occurrence_date2").equals(""))
        	whText += " and to_char(aa.occurrence_date,'yyyymmdd') <= '" + DateUtil.formatConditionDate(request.getParameter("occurrence_date2")) + "' \n";
        if(!request.getParameter("case_date").equals(""))
        	whText += " and to_char(bi.case_date,'yyyymmdd') >= '" + DateUtil.formatConditionDate(request.getParameter("case_date")) + "' \n";
        if(!request.getParameter("case_date2").equals(""))
        	whText += " and to_char(bi.case_date,'yyyymmdd') <= '" + DateUtil.formatConditionDate(request.getParameter("case_date2")) + "' \n";
        if(!request.getParameter("application_date").equals(""))
        	whText += " and to_char(aa.application_date,'yyyymmdd') >= '" + DateUtil.formatConditionDate(request.getParameter("application_date")) + "' \n";
        if(!request.getParameter("application_date2").equals(""))
        	whText += " and to_char(aa.application_date,'yyyymmdd') <= '" + DateUtil.formatConditionDate(request.getParameter("application_date2")) + "' \n";
        if(!request.getParameter("province").equals(""))
        	whText += " AND aa.scene_province like '%" + request.getParameter("province") + "%' \n";
        if(!request.getParameter("district").equals(""))
        	whText += " AND aa.scene_district like '%" + request.getParameter("district") + "%' \n";
        if(!request.getParameter("tambol").equals(""))
        	whText += " AND aa.scene_subdistrict like '%" + request.getParameter("tambol") + "%' \n";
        if(!request.getParameter("compare_case_no").equals(""))
        	whText += " AND cc.compare_case_no like '%" + request.getParameter("compare_case_no").replace("'", "''").trim() + "%'  \n";
        if(!request.getParameter("case_id").equals(""))
        	whText += " AND bi.case_id like '%" + request.getParameter("case_id").replace("'", "''").trim() + "%'  \n";
        if(!request.getParameter("exhibit_report_no").equals(""))
        	whText += " AND aap.exhibit_report_no like '%" + request.getParameter("exhibit_report_no").replace("'", "''").trim() + "%'  \n";
        if(!request.getParameter("partial_name").equals(""))
        	whText += " AND tia.title_name || sta.first_name || ' ' || sta.last_name like '%" + request.getParameter("partial_name").replace("'", "''").trim() + "%' \n";
        if(!request.getParameter("lawbreaker_id_card").equals("")){
        	whText += "  AND (aal.lawbreaker_id_card like '%" + request.getParameter("lawbreaker_id_card").replace("'", "''").trim() + "%' \n";
        	whText += " or aa.accuser_idcardno like '%" + request.getParameter("lawbreaker_id_card").replace("'", "''").trim() + "%') \n";
        }
        if(!request.getParameter("product_name").equals(""))
        	whText += " AND nvl(aae.duty_name,dt.duty_name) like '%" + request.getParameter("product_name").replace("'", "''").trim() + "%' \n";
        if(!request.getParameter("product").equals(""))
        	whText += " AND aa.product_group_id like '%" + request.getParameter("product").replace("'", "''").trim() + "%'  \n";
        if(!request.getParameter("case_law_id").equals(""))
        	whText += " AND inc.case_law_id like '%" + request.getParameter("case_law_id").replace("'", "''").trim() + "%'  \n";
        
        //ประเภทหน่วยงานที่ค้นหา
        if(!request.getParameter("offcode").equals("")){
        	DB db = new DB();
        	try{
        		EdOffice ed = new EdOffice(db);
        		ed = ed.findByWhere("offcode = '" + request.getParameter("offcode") + "'", null).get(0);
        		if(ed.getIndc_off().equals(Constants.OFFCODE_TYPE_DEPT)){
        			//ถ้าเป็นหน่วยงานภาค
        			whText += " AND substr(aa.offcode,1,2)||'0000' = '" + request.getParameter("offcode").replace("'", "''").trim() + "'  \n";
        		}else if(ed.getIndc_off().equals(Constants.OFFCODE_TYPE_AREA)){
        			//ถ้าเป็นหน่วยงานพื้นที่
        			whText += " AND substr(aa.offcode,1,4)||'00' = '" + request.getParameter("offcode").replace("'", "''").trim() + "'  \n";
        		}else if(ed.getIndc_off().equals(Constants.OFFCODE_TYPE_BRANCH)){
        			//ถ้าเป็นหน่วยงานพื้นที่สาขา
        			whText += " AND aa.offcode = '" + request.getParameter("offcode").replace("'", "''").trim() + "' \n ";
        		}
        	}catch(Exception e){
        		
        	}finally{
        		db.closedb();
        	}
        }
        
        
        
        //ประเภทหน่วยงานของผู้ที่ Login
//        if(!request.getParameter("offcode").equals("")){
//	        if(uData.getAccuserType().equals(Constants.ACCUSER_TYPE_XCS)){
//	        	//ถ้าเป็นเจ้าหน้าที่ส่วนกลาง
//	        	if(!uData.getOffcode().equals(request.getParameter("offcode").toString()))
//	        		whText += " AND aa.offcode like '%" + request.getParameter("offcode").replace("'", "''").trim() + "%' ";
//	        }else if(uData.getAccuserType().equals(Constants.ACCUSER_TYPE_DEPT)){
//	        	//ถ้าเป็นเจ้าหน้าที่สรรพสามิตภาค
//	        	if(!uData.getOffcode().equals(request.getParameter("offcode").toString()))
//	        		whText += " AND aa.offcode = '" + request.getParameter("offcode").replace("'", "''").trim() + "' ";
//	        	else
//	        		whText += " AND substr(aa.offcode,1,2) = '" + request.getParameter("offcode").replace("'", "''").trim().substring(0,2) + "' ";
//	        }else if(uData.getAccuserType().equals(Constants.ACCUSER_TYPE_AREA)){
//	        	//ถ้าเป็นเจ้าหน้าที่สรรพสามิตพื้นที่
//	        	if(!uData.getOffcode().equals(request.getParameter("offcode").toString()))
//	        		whText += " AND aa.offcode = '" + request.getParameter("offcode").replace("'", "''").trim() + "' ";
//	        	else
//	        		whText += " AND substr(aa.offcode,1,4) = '" + request.getParameter("offcode").replace("'", "''").trim().substring(0,4) + "' ";
//	        }else if(uData.getAccuserType().equals(Constants.ACCUSER_TYPE_BRANCH)){
//	        	//ถ้าเป็นเจ้าหน้าที่สรรพสามิตพื้นที่สาขา
//		        whText += " AND aa.offcode = '" + request.getParameter("offcode").replace("'", "''").trim() + "' ";
//	        }
//        }
        
        if(!request.getParameter("accuserType").equals(""))
        	whText += " AND aa.accuser_type = '" + request.getParameter("accuserType") + "' \n ";
        
        if(request.getParameter("case_quality1") != null && request.getParameter("case_quality2")!= null && request.getParameter("have_culprit") != null){
        	whText += " and (bi.case_quality in ('1','2') OR aa.have_culprit = 'N')  \n";
        }else if(request.getParameter("case_quality1") != null && request.getParameter("case_quality2")!= null){
        	whText += " and (bi.case_quality in ('1','2') and aa.have_culprit = 'Y')  \n";
        }else if(request.getParameter("case_quality1") != null && request.getParameter("have_culprit") != null){
        	whText += " and (bi.case_quality = '2' or aa.have_culprit = 'N')  \n";
        }else if(request.getParameter("case_quality2")!= null && request.getParameter("have_culprit") != null){
        	whText += " and (bi.case_quality = '1' or aa.have_culprit = 'N')  \n";
        }else if(request.getParameter("case_quality1") != null){
        	whText += " and bi.case_quality = '2' and aa.have_culprit = 'Y' \n ";
        }else if(request.getParameter("case_quality2")!= null){
        	whText += " and bi.case_quality = '1'";
        }else if(request.getParameter("have_culprit") != null){
        	whText += " and aa.have_culprit = 'N' \n";
        }

        //คดีสิ้นสุดชั้น
        if(request.getParameter("caseLast1") != null && request.getParameter("caseLast2") != null && request.getParameter("caseLast3") != null){
        	whText += ""; //เอามาหมด
        }else if(request.getParameter("caseLast1") != null && request.getParameter("caseLast2") != null){
        	whText += " and bi.case_last in ('1','2')  \n";
        }else if(request.getParameter("caseLast1") != null && request.getParameter("caseLast3") != null){
        	whText += " and bi.case_last in ('1','3')  \n";
        }else if(request.getParameter("caseLast2") != null && request.getParameter("caseLast3") != null){
        	whText += " and bi.case_last in ('2','3')  \n";
        }else if(request.getParameter("caseLast1") != null){
        	whText += " and bi.case_last = '1'  \n";
        }else if(request.getParameter("caseLast2") != null){
        	whText += " and bi.case_last = '2'  \n";
        }else if(request.getParameter("caseLast3") != null){
        	whText += " and bi.case_last = '3'  \n";
        }
        if(!request.getParameter("iswithdraw").equals(""))
        	whText += " AND ali.iswithdraw = '" + request.getParameter("iswithdraw") + "'  \n";
        if(!request.getParameter("exhibit_wild").equals(""))
        	whText += " AND inc.exhibit_wild = '" + request.getParameter("exhibit_wild") + "'  \n";
        if(!request.getParameter("notice_no").equals(""))
        	whText += " AND ana.notice_no like '%" + request.getParameter("notice_no").replace("'", "''").trim() + "%'  \n";
        if(!request.getParameter("warrant_no").equals(""))
        	whText += " AND asw.warrant_no like '%" + request.getParameter("warrant_no").replace("'", "''").trim() + "%' \n";
        if(!request.getParameter("asi_track_no").equals(""))
        	whText += " AND asi.track_no like '%" + request.getParameter("asi_track_no").replace("'", "''").trim() + "%' \n";
		
        //log.debug(whText);
        return whText;
	}
}
