








 

/**
 * produce by boonchai ( neng )
 * @author <a href="mailto:mr.boonchai@gmail.com">Mr.Boonchai Wedwanitsathein</a>
 */
package com.ko.domain;

//include
import com.ko.domain.base.BaseAppReqApproveCompareForm3;
import com.ko.util.DB;

import java.util.List;
import java.util.Map;

public class AppReqApproveCompareForm3 extends BaseAppReqApproveCompareForm3{
	public AppReqApproveCompareForm3(DB db){
		super(db);
		super.SEQUENCE_NAME = "APP_REQ_APPROVECOMPAREFORM3SEQ";
	}
	// business method go here
	
	public Map<String,Object> setStaffData(Long arf3_id){
		Map<String,Object> ret =null;
		String sql = "";
		sql += " select tii.title_name || sti.first_name || ' ' || sti.last_name staff_inform_name, psi.posname || ' ' || sti.staff_level posname_inform, ";
		sql += " ti8.title_name || st8.first_name || ' ' || st8.last_name staff_lawyer8_name, ps8.posname || ' ' || st8.staff_level posname_lawyer8, ";
		sql += " tid.title_name || std.first_name || ' ' || std.last_name staff_director_name, psd.posname || ' ' || std.staff_level posname_director, ";
		sql += " tia.title_name || sta.first_name || ' ' || sta.last_name staff_accept_name, psa.posname || ' ' || sta.staff_level posname_accept, ";
		sql += " tip.title_name || stp.first_name || ' ' || stp.last_name staff_approve_name, psp.posname || ' ' || stp.staff_level posname_approve ";
		sql += " from app_req_approve_compare_form3 arf3 ";
		sql += " left join staff sti on sti.idcard_no=arf3.staff_id_inform ";
		sql += " left join title tii on tii.title_code=sti.title_code ";
		sql += " left join position psi on psi.poscode=arf3.poscode_inform ";
		sql += " left join staff st8 on st8.idcard_no=arf3.staff_id_lawyer8 ";
		sql += " left join title ti8 on ti8.title_code=st8.title_code ";
		sql += " left join position ps8 on ps8.poscode=arf3.poscode_lawyer8 ";
		sql += " left join staff std on std.idcard_no=arf3.staff_id_director ";
		sql += " left join title tid on tid.title_code=std.title_code ";
		sql += " left join position psd on psd.poscode=arf3.poscode_director ";
		sql += " left join staff sta on sta.idcard_no=arf3.staff_id_accept ";
		sql += " left join title tia on tia.title_code=sta.title_code ";
		sql += " left join position psa on psa.poscode=arf3.poscode_accept ";
		sql += " left join staff stp on stp.idcard_no=arf3.staff_id_approve ";
		sql += " left join title tip on tip.title_code=stp.title_code ";
		sql += " left join position psp on psp.poscode=arf3.poscode_approve ";
		sql += " where arf3.id = '" + arf3_id + "'";
		
		try{			
			ret = this.findBySql(sql).get(0);			
		}catch(Exception e){
			ret = null;
			e.printStackTrace();
		}
		
		return ret;
	}
}