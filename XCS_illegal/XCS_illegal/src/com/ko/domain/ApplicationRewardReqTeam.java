








 

/**
 * produce by boonchai ( neng )
 * @author <a href="mailto:mr.boonchai@gmail.com">Mr.Boonchai Wedwanitsathein</a>
 */
package com.ko.domain;

//include
import com.ko.domain.base.BaseApplicationRewardReqTeam;
import com.ko.util.DB;

import java.util.List;
import java.util.Map;

public class ApplicationRewardReqTeam extends BaseApplicationRewardReqTeam{
	public ApplicationRewardReqTeam(DB db){
		super(db);
		super.SEQUENCE_NAME = "APPLICATION_REWARD_TEAM_SEQ";
	}
	// business method go here
    public String getStaff_name(){
        String sql = "select ti.title_name || str.first_name || ' ' || str.last_name staff_name from staff str " +
                " left join application_reward_req_team at on at.staff_idcardno = str.idcard_no " +
                " left join title ti on str.title_code = ti.title_code where at.id = ?";
        try {
            List<Map<String,Object>> listStaff = findBySql(sql,getId());
            if(listStaff.size()>0)
                return listStaff.get(0).get("staff_name").toString();
        } catch (Exception e) {
            e.printStackTrace();  //To change body of catch statement use File | Settings | File Templates.
        }
        return "";
    }

    public String getStaff_posname(){
        String sql = "select pos.posname from position pos left join application_reward_req_team at on " +
                "at.poscode = pos.poscode where at.id = ? ";
        try {
            List<Map<String,Object>> listStaff = findBySql(sql,getId());
            if(listStaff.size()>0)
                return listStaff.get(0).get("posname").toString();
        } catch (Exception e) {
            e.printStackTrace();  //To change body of catch statement use File | Settings | File Templates.
        }
        return "";
    }
}