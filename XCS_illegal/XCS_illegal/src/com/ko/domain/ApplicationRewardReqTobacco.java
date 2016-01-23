








 

/**
 * produce by boonchai ( neng )
 * @author <a href="mailto:mr.boonchai@gmail.com">Mr.Boonchai Wedwanitsathein</a>
 */
package com.ko.domain;

//include
import java.util.HashMap;
import java.util.Map;
import java.util.List;

import org.jfree.util.Log;

import com.ko.domain.base.BaseApplicationRewardReqTobacco;
import com.ko.util.DB;

public class ApplicationRewardReqTobacco extends BaseApplicationRewardReqTobacco{
	public ApplicationRewardReqTobacco(DB db){
		super(db);
		super.SEQUENCE_NAME = "APPLICATION_REWARD_TOBACCO_SEQ";
	}
	// business method go here
	
	public Map<String,Object> getData(String ar_id) throws Exception {
		Map<String,Object> ret = new HashMap();
		
		String sql = "";
		sql += "select art.id ,art.application_reward_request_id, tis.title_name || sts.first_name || ' ' || sts.last_name sue_staff_name,pss.posname || ' ' || sts.staff_level sue_posname, \n";
		sql += " nvl(cc.birbe_money,0)+nvl(cc.reward_money,0)+nvl(cc.treasury_money,0) case_fine,nvl(cc.reward_money,0) reward_money, \n";
		sql += " tia.title_name || sta.first_name || ' ' || sta.last_name accuser_name, nvl(sta.posname,psa.posname || ' ' || sta.staff_level) accuser_posname, \n";
		sql += " art.staff_id_arrest, art.poscode_arrest, art.offcode_arrest,  \n";
		sql += " art.lawyer_opinion,  art.law_director_position,art.law_director_opinion, art.command,art.arrest_opinion \n";
		sql += " from application_reward_req_tobacco art  \n";
		sql += " inner join  application_reward_request ar on ar.id=art.application_reward_request_id \n";
		sql += " inner join ed_office ed on ed.offcode=ar.offcode \n";
		sql += " inner join compare_case cc on cc.id=ar.compare_case_id \n";
		sql += " inner join application_arrest aa on aa.track_no=cc.track_no \n";
		sql += " left join v_accuser_list_popup sta on sta.idcard_no=art.staff_id_arrest \n";
		sql += " left join title tia on tia.title_code=sta.title_code \n";
		sql += " left join position psa on psa.poscode=art.poscode_arrest \n";
		sql += " left join staff sts on sts.idcard_no=cc.sue_staff_idcardno \n";
		sql += " left join title tis on tis.title_code=sts.title_code \n";
		sql += " left join position pss on pss.poscode=trim(cc.sue_poscode) \n";
		sql += " where ar.id = '" + ar_id + "' \n";
		
		System.out.println(sql);
		ApplicationRewardReqTobacco al = new ApplicationRewardReqTobacco(db);
		
		List<Map<String,Object>> arList = al.findBySql(sql);
		if(arList != null)
			ret = arList.get(0);
		
		return ret;
	}

}