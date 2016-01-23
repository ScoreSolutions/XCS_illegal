








 

/**
 * produce by boonchai ( neng )
 * @author <a href="mailto:mr.boonchai@gmail.com">Mr.Boonchai Wedwanitsathein</a>
 */
package com.ko.domain;

//include
import com.ko.domain.base.BaseApplicationRewardReqTax;
import com.ko.util.DB;
import java.util.Map;
import java.util.List;
import java.util.HashMap;

public class ApplicationRewardReqTax extends BaseApplicationRewardReqTax{
	public ApplicationRewardReqTax(DB db){
		super(db);
		super.SEQUENCE_NAME = "APPLICATION_REWARD_TAX_SEQ";
	}
	// business method go here
	
	public Map<String,Object> getData(String ar_id) throws Exception{
		Map<String,Object> ret = new HashMap();
		
		String sql = "";
		sql += " select art.id, arr.id arr_id ,art.application_reward_request_id, arr.subject, dg.group_name product_group_name,arr.isinform,arr.ischkcount,arr.abnormality, \n";
		sql += " arr.staff_id_control, tic.title_name || stc.first_name || ' ' || stc.last_name staff_name_control, arr.poscode_control,  \n";
		sql += " psc.posname || ' ' || stc.staff_level posname_control, arr.offcode_control,arr.comment_control, \n";
		sql += " arr.comment_initial, arr.staff_id_initial,tii.title_name || sti.first_name || ' ' || sti.last_name staff_name_initial, \n"; 
		sql += " arr.poscode_initial, psi.posname || ' ' || sti.staff_level posname_initial, arr.offcode_initial, \n";
		sql += " arr.comment_commander, arr.staff_id_commander, tico.title_name || stco.first_name || ' ' || stco.last_name staff_name_commander, \n";
		sql += " arr.poscode_commander, psco.posname || ' ' || stco.staff_level posname_commander, arr.offcode_commander,arr.command, \n";
		sql += " art.staff_id_confirm, ticf.title_name ||  stcf.first_name || ' ' || stcf.last_name staff_name_confirm, \n";
		sql += " art.poscode_confirm, pscf.posname || ' ' || stcf.staff_level posname_confirm, art.offcode_confirm, \n";
		sql += " nvl(aa.accuser_name,tia.title_name || sta.first_name || ' ' || sta.last_name) accuser_name, nvl(sta.posname,nvl(aa.accuser_posname,psa.posname || ' ' || sta.staff_level)) accuser_posname, \n";
		sql += " to_char(aa.occurrence_date,'dd/mm/yyyy','NLS_CALENDAR=''THAI BUDDHA'' NLS_DATE_LANGUAGE=THAI') occurrence_date, \n";
		sql += " cc.case_total_fine, cc.birbe_money, cc.reward_money, art.ask_lean, art.department_name_send, \n";
		sql += " art.staff_id_ask, tik.title_name || stk.first_name || ' ' || stk.last_name staff_name_ask, \n";
		sql += " art.poscode_ask, psk.posname || ' ' || stk.staff_level posname_ask, art.offcode_ask, \n";
		sql += " art.approve_lean, art.staff_id_approve, tia.title_name || sta.first_name || ' ' || sta.last_name staff_name_approve, \n";
		sql += " art.poscode_approve, psp.posname || ' ' || stp.staff_level posname_approve, art.offcode_approve \n";
		sql += " from application_reward_req_tax art \n";
		sql += " inner join application_reward_request ar on ar.id=art.application_reward_request_id \n";
		sql += " left join application_reward_req_report arr on ar.id=arr.application_reward_request_id \n";
		sql += " inner join ed_office ed on ed.offcode=ar.offcode \n";
		sql += " inner join compare_case cc on cc.id=ar.compare_case_id \n";
		sql += " inner join application_arrest aa on aa.track_no=cc.track_no \n";
		sql += " inner join duty_group dg on dg.group_id=aa.product_group_id \n";
		sql += " left join staff stc on stc.idcard_no=arr.staff_id_control \n";
		sql += " left join title tic on tic.title_code=stc.title_code \n";
		sql += " left join position psc on psc.poscode=arr.poscode_control \n";
		sql += " left join staff sti on sti.idcard_no=arr.staff_id_initial \n";
		sql += " left join title tii on tii.title_code=sti.title_code \n";
		sql += " left join position psi on psi.poscode=arr.poscode_initial \n";
		sql += " left join staff stco on stco.idcard_no=arr.staff_id_commander \n";
		sql += " left join title tico on tico.title_code=stco.title_code \n";
		sql += " left join position psco on psco.poscode=arr.poscode_commander \n";
		sql += " left join staff stcf on stcf.idcard_no=art.staff_id_confirm \n";
		sql += " left join title ticf on ticf.title_code=stcf.title_code \n";
		sql += " left join position pscf on pscf.poscode=art.poscode_confirm \n";
		sql += " inner join v_accuser_list_popup sta on sta.idcard_no=aa.accuser_idcardno \n";
		sql += " left join title tia on tia.title_name=sta.title_code \n";
		sql += " left join position psa on psa.poscode=trim(aa.accuser_poscode) \n";
		sql += " left join staff stk on stk.idcard_no=art.staff_id_ask \n";
		sql += " left join title tik on tik.title_code=stk.title_code \n";
		sql += " left join position psk on psk.poscode=art.poscode_ask \n";
		sql += " left join staff stp on stp.idcard_no=art.staff_id_approve \n";
		sql += " left join title tip on tip.title_code=stp.title_code \n";
		sql += " left join position psp on psp.poscode=art.poscode_approve \n";
		sql += " where ar.id = '" + ar_id + "'";
		
		//System.out.println("ApplicationRewardReqTax \n" + sql);
		ApplicationRewardReqTax al = new ApplicationRewardReqTax(db);
		List<Map<String,Object>> alList = al.findBySql(sql);
		if(alList != null)
			ret = alList.get(0);
		
		return ret;
		
	}

}