








 

/**
 * produce by boonchai ( neng )
 * @author <a href="mailto:mr.boonchai@gmail.com">Mr.Boonchai Wedwanitsathein</a>
 */
package com.ko.domain;

//include
import com.ko.domain.base.BaseApplicationRewardRequest;
import com.ko.util.DB;

import java.util.List;
import java.util.Map;

public class ApplicationRewardRequest extends BaseApplicationRewardRequest{
	public ApplicationRewardRequest(DB db){
		super(db);
	}
	// business method go here
    public String getStaff_name_request(){
        String sql = "select ti.title_name || str.first_name || ' ' || str.last_name staff_name from staff str " +
                " left join application_reward_request ar on ar.staff_id_request = str.idcard_no " +
                " left join title ti on str.title_code = ti.title_code where ar.id = ?";
        try {
            List<Map<String,Object>> listStaff = findBySql(sql,getId());
            if(listStaff.size()>0)
                return listStaff.get(0).get("staff_name").toString();
        } catch (Exception e) {
            e.printStackTrace();  //To change body of catch statement use File | Settings | File Templates.
        }
        return "";
    }
    public String getPosname_request(){
        String sql = "select pos.posname from position pos left join application_reward_request ar on " +
                "ar.poscode_request = pos.poscode where ar.id = ? ";
        try {
            List<Map<String,Object>> listStaff = findBySql(sql,getId());
            if(listStaff.size()>0)
                return listStaff.get(0).get("posname").toString();
        } catch (Exception e) {
            e.printStackTrace();  //To change body of catch statement use File | Settings | File Templates.
        }
        return "";
    }
    public String getStaff_name_receive(){
        String sql = "select ti.title_name || str.first_name || ' ' || str.last_name staff_name from staff str " +
                " left join application_reward_request ar on ar.staff_id_receive = str.idcard_no " +
                " left join title ti on str.title_code = ti.title_code where ar.id = ?";
        try {
            List<Map<String,Object>> listStaff = findBySql(sql,getId());
            if(listStaff.size()>0)
                return listStaff.get(0).get("staff_name").toString();
        } catch (Exception e) {
            e.printStackTrace();  //To change body of catch statement use File | Settings | File Templates.
        }
        return "";
    }
    public String getPosname_receive(){
        String sql = "select pos.posname from position pos left join application_reward_request ar on " +
                "ar.poscode_receive = pos.poscode where ar.id = ? ";
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