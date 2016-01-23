








 

/**
 * produce by boonchai ( neng )
 * @author <a href="mailto:mr.boonchai@gmail.com">Mr.Boonchai Wedwanitsathein</a>
 */
package com.ko.domain;

//include
import com.ko.domain.base.BaseApplicationRewardReqAlcohol;
import com.ko.util.DB;

import java.util.List;
import java.util.Map;
import java.util.HashMap;

import org.jfree.util.Log;

public class ApplicationRewardReqAlcohol extends BaseApplicationRewardReqAlcohol{
	public ApplicationRewardReqAlcohol(DB db){
		super(db);
		super.SEQUENCE_NAME="APPLICATION_REWARD_ALCOHOL_SEQ";
	}
	
	public Map<String,Object> getData(String ar_id) throws Exception {
		Map<String,Object> ret = new HashMap();
		
		String sql = "";
		sql += " select ara.id, ara.application_reward_request_id, ara.report_to, \n";
		sql += " to_char(ara.accept_date,'dd/mm/yyyy','NLS_CALENDAR=''THAI BUDDHA'' NLS_DATE_LANGUAGE=THAI') accept_date, \n";
		sql += " aap.staff_idcardno_prove, tip.title_name || stp.first_name || ' ' || stp.last_name prove_staff_name, \n";
		sql += " aap.staff_prove_poscode, psp.posname || ' ' || stp.staff_level prove_posname, \n";
		sql += " cc.sue_staff_idcardno, tis.title_name || sts.first_name || ' ' || sts.last_name sue_staff_name, \n";
		sql += " cc.sue_poscode, pss.posname || ' ' || sts.staff_level sue_posname, cc.case_total_fine, cc.birbe_money,cc.reward_money, \n";
		sql += " ara.accept_lean, ara.staff_id_arrest, tia.title_name || sta.first_name || ' ' || sta.last_name arrest_staff_name, \n";
		sql += " ara.poscode_arrest, nvl(sta.posname,psa.posname || ' ' || sta.staff_level) posname_arrest, ara.offcode_arrest, nvl(sta.offname,eda.offname) offname_arrest, ara.accept_desc, \n";
		sql += " ara.leader_lean, ara.leader_accept,ara.leader_accept_reason,ara.leader_deny_reason, \n";
		sql += " ara.staff_id_leader, til.title_name || stl.first_name || ' ' || stl.last_name leader_staff_name, \n";
		sql += " ara.poscode_leader, psl.posname || ' ' || stl.staff_level leader_posname, \n";
		sql += " ara.section_director_lean, ara.section_director_accept, ara.section_director_accept_reason,ara.section_director_deny_reason, \n";
		sql += " ara.staff_id_section_director, tid.title_name || std.first_name || ' ' || std.last_name section_director_staff_name, \n";
		sql += " ara.poscode_section_director, psd.posname || ' ' || std.staff_level section_director_posname, \n";
		sql += " ara.res_director_accept, ara.res_director_accept_reason, ara.res_director_deny_reason, \n";
		sql += " ara.staff_id_res_director,tird.title_name || strd.first_name || ' ' || strd.last_name res_director_staff_name, \n";
		sql += " ara.poscode_res_director, psrd.posname || ' ' || strd.staff_level res_director_posname \n";
		sql += " from application_reward_req_alcohol ara \n";
		sql += " inner join application_reward_request ar on ar.id=ara.application_reward_request_id \n";
		sql += " inner join compare_case cc on cc.id=ar.compare_case_id \n";
		sql += " inner join application_arrest aa on aa.track_no=cc.track_no \n";
		sql += " left join application_arrest_prove aap on aap.track_no=aa.track_no \n";
		sql += " left join staff stp on stp.idcard_no=aap.staff_idcardno_prove \n";
		sql += " left join title tip on tip.title_code=stp.title_code \n";
		sql += " left join position psp on psp.poscode=aap.staff_prove_poscode \n";
		sql += " left join staff sts on sts.idcard_no=cc.sue_staff_idcardno \n";
		sql += " left join title tis on tis.title_code=sts.title_code \n";
		sql += " left join position pss on pss.poscode=trim(cc.sue_poscode) \n";
		sql += " left join v_accuser_list_popup sta on sta.idcard_no=ara.staff_id_arrest \n";
		sql += " left join title tia on tia.title_code=sta.title_code \n";
		sql += " left join position psa on psa.poscode=ara.poscode_arrest \n";
		sql += " left join ed_office eda on eda.offcode=ara.offcode_arrest \n";
		sql += " left join staff stl on stl.idcard_no=ara.staff_id_leader \n";
		sql += " left join title til on til.title_code=stl.title_code \n";
		sql += " left join position psl on psl.poscode=ara.poscode_leader \n";
		sql += " left join staff std on std.idcard_no=ara.staff_id_section_director \n";
		sql += " left join title tid on tid.title_code=std.title_code \n";
		sql += " left join position psd on psd.poscode=ara.poscode_section_director \n";
		sql += " left join staff strd on strd.idcard_no=ara.staff_id_res_director \n";
		sql += " left join title tird on tird.title_code=strd.title_code \n";
		sql += " left join position psrd on psrd.poscode=ara.poscode_res_director \n";
		sql += " where ara.application_reward_request_id='" + ar_id + "' \n";

		System.out.println(sql);
		ApplicationRewardReqAlcohol al = new ApplicationRewardReqAlcohol(db);
		List<Map<String,Object>> alList = al.findBySql(sql);
		if(alList != null){
			if (alList.size()>0)
				ret = al.findBySql(sql).get(0);
		}
		
		return ret;
		
	}
	// business method go here
//    public String getStaff_name_arrest(){
//        String sql = "select ti.title_name || str.first_name || ' ' || str.last_name staff_name from staff str " +
//                " left join application_reward_req_alcohol al on al.staff_id_arrest = str.idcard_no " +
//                " left join title ti on str.title_code = ti.title_code where al.id = ?";
//        try {
//            List<Map<String,Object>> listStaff = findBySql(sql,getId());
//            if(listStaff.size()>0)
//                return listStaff.get(0).get("staff_name").toString();
//        } catch (Exception e) {
//            e.printStackTrace();  //To change body of catch statement use File | Settings | File Templates.
//        }
//        return "";
//    }
//    public String getPosname_arrest(){
//        String sql = "select pos.posname from position pos left join application_reward_req_alcohol al on " +
//                "al.poscode_arrest = pos.poscode where al.id = ? ";
//        try {
//            List<Map<String,Object>> listStaff = findBySql(sql,getId());
//            if(listStaff.size()>0)
//                return listStaff.get(0).get("posname").toString();
//        } catch (Exception e) {
//            e.printStackTrace();  //To change body of catch statement use File | Settings | File Templates.
//        }
//        return "";
//    }
//    public String getOffname_arrest(){
//        String sql = "select ed.offname from ed_office ed left join application_reward_req_alcohol al on " +
//                "al.offcode_arrest = ed.offcode where al.id = ? ";
//        try {
//            List<Map<String,Object>> listStaff = findBySql(sql,getId());
//            if(listStaff.size()>0)
//                return listStaff.get(0).get("offname").toString();
//        } catch (Exception e) {
//            e.printStackTrace();  //To change body of catch statement use File | Settings | File Templates.
//        }
//        return "";
//    }
//    public String getStaff_name_leader(){
//        String sql = "select ti.title_name || str.first_name || ' ' || str.last_name staff_name from staff str " +
//                " left join application_reward_req_alcohol al on al.staff_id_leader = str.idcard_no " +
//                " left join title ti on str.title_code = ti.title_code where al.id = ?";
//        try {
//            List<Map<String,Object>> listStaff = findBySql(sql,getId());
//            if(listStaff.size()>0)
//                return listStaff.get(0).get("staff_name").toString();
//        } catch (Exception e) {
//            e.printStackTrace();  //To change body of catch statement use File | Settings | File Templates.
//        }
//        return "";
//    }
//    public String getPosname_leader(){
//        String sql = "select pos.posname from position pos left join application_reward_req_alcohol al on " +
//                "al.poscode_leader = pos.poscode where al.id = ? ";
//        try {
//            List<Map<String,Object>> listStaff = findBySql(sql,getId());
//            if(listStaff.size()>0)
//                return listStaff.get(0).get("posname").toString();
//        } catch (Exception e) {
//            e.printStackTrace();  //To change body of catch statement use File | Settings | File Templates.
//        }
//        return "";
//    }
//    
//    public String getStaff_name_section_director(){
//        String sql = "select ti.title_name || str.first_name || ' ' || str.last_name staff_name from staff str " +
//                " left join application_reward_req_alcohol al on al.staff_id_section_director = str.idcard_no " +
//                " left join title ti on str.title_code = ti.title_code where al.id = ?";
//        try {
//            List<Map<String,Object>> listStaff = findBySql(sql,getId());
//            if(listStaff.size()>0)
//                return listStaff.get(0).get("staff_name").toString();
//        } catch (Exception e) {
//            e.printStackTrace();  //To change body of catch statement use File | Settings | File Templates.
//        }
//        return "";
//    }
//    public String getPosname_section_director(){
//        String sql = "select pos.posname from position pos left join application_reward_req_alcohol al on " +
//                "al.poscode_section_director = pos.poscode where al.id = ? ";
//        try {
//            List<Map<String,Object>> listStaff = findBySql(sql,getId());
//            if(listStaff.size()>0)
//                return listStaff.get(0).get("posname").toString();
//        } catch (Exception e) {
//            e.printStackTrace();  //To change body of catch statement use File | Settings | File Templates.
//        }
//        return "";
//    }
//    
//    public String getStaff_name_res_director(){
//        String sql = "select ti.title_name || str.first_name || ' ' || str.last_name staff_name from staff str " +
//                " left join application_reward_req_alcohol al on al.staff_id_res_director = str.idcard_no " +
//                " left join title ti on str.title_code = ti.title_code where al.id = ?";
//        try {
//            List<Map<String,Object>> listStaff = findBySql(sql,getId());
//            if(listStaff.size()>0)
//                return listStaff.get(0).get("staff_name").toString();
//        } catch (Exception e) {
//            e.printStackTrace();  //To change body of catch statement use File | Settings | File Templates.
//        }
//        return "";
//    }
//    public String getPosname_res_director(){
//        String sql = "select pos.posname from position pos left join application_reward_req_alcohol al on " +
//                "al.poscode_res_director = pos.poscode where al.id = ? ";
//        try {
//            List<Map<String,Object>> listStaff = findBySql(sql,getId());
//            if(listStaff.size()>0)
//                return listStaff.get(0).get("posname").toString();
//        } catch (Exception e) {
//            e.printStackTrace();  //To change body of catch statement use File | Settings | File Templates.
//        }
//        return "";
//    }
}