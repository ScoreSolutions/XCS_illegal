








 

/**
 * produce by boonchai ( neng )
 * @author <a href="mailto:mr.boonchai@gmail.com">Mr.Boonchai Wedwanitsathein</a>
 */
package com.ko.domain;

//include
import com.ko.domain.base.BaseAppReqApproveCompareForm1;
import com.ko.util.DB;

import java.util.List;
import java.util.Map;

public class AppReqApproveCompareForm1 extends BaseAppReqApproveCompareForm1{
	public AppReqApproveCompareForm1(DB db){
		super(db);
		super.SEQUENCE_NAME = "APP_REQ_APPROVECOMPAREFORM1SEQ";
	}
	// business method go here

	public Map<String,Object> setStaffDesc(Long arf1_id){
		Map<String,Object> ret = null;
		String sql = "";
		sql += " select tii.title_name || sti.first_name || ' ' || sti.last_name staff_inform_name, nvl(sti.posname,psi.posname || ' ' || sti.staff_level) posname_inform, ";
		sql += " tia.title_name || sta.first_name || ' ' || sta.last_name staff_accept_name, nvl(sta.posname,psa.posname || ' ' || sta.staff_level) posname_accept, ";
		sql += " tip.title_name || stp.first_name || ' ' || stp.last_name staff_approve_name, nvl(stp.posname,psp.posname || ' ' || stp.staff_level) posname_approve ";
		sql += " from app_req_approve_compare_form1 arf1 ";
		sql += " left join v_staff_list_popup sti on sti.idcard_no=arf1.staff_id_inform ";
		sql += " left join title tii on tii.title_code=sti.title_code ";
		sql += " left join position psi on psi.poscode=arf1.poscode_inform ";
		sql += " left join v_staff_list_popup sta on sta.idcard_no=arf1.staff_id_accept ";
		sql += " left join title tia on tia.title_code=sta.title_code ";
		sql += " left join position psa on psa.poscode=arf1.poscode_accept ";
		sql += " left join v_staff_list_popup stp on stp.idcard_no=arf1.staff_id_approve ";
		sql += " left join title tip on tip.title_code=stp.title_code ";
		sql += " left join position psp on psp.poscode=arf1.poscode_approve ";
		sql += " where arf1.id = '" + arf1_id + "'";
		try{			
			ret = this.findBySql(sql).get(0);			
		}catch(Exception e){
			ret = null;
			e.printStackTrace();
		}
		
		return ret;
	}
}