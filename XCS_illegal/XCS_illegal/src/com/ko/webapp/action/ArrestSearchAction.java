package com.ko.webapp.action;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.ko.domain.*;

public class ArrestSearchAction extends BaseAction {

	public void add(HttpServletRequest request,HttpServletResponse response)throws Exception {
		forward("/test/create.jsp", request, response);
	}
	public void create(HttpServletRequest request,HttpServletResponse response)throws Exception {
		/*try{
			$user = new User();
			// bindAndValidate
			bindAndValidate($user);
			if( $this->form->getErrorCount()==0 ){
				$user = $user->create();
				if( !is_null($user) ){
					$this->form->setValues(array());// clear form
					$this->form->setFormMessage("Create Completed ,view <a href=\"userView.php?cmd=_view&user_id=".$user->id."\">new User</a>");
				}
			}else{
				$this->form->setFormErrorMessage("Please Complete Form");
			}
		}catch(Exception $e){
			$this->form->setFormErrorMessage($e->getMessage());
		}
		redirectUrl($_SERVER["PHP_SELF"]);// prevent double submit
		*/
		try{
			ApplicationSincereConfirm asf = new ApplicationSincereConfirm(db);
			asf.setOffcode("aa");
			asf.setOffname(request.getParameter("txt_offname"));
			asf.setTrack_no(request.getParameter("txt_trackno"));
			asf.setInput_date(new Date());
			asf.setDetect_date(new Date());
			asf.setNotice_date(new Date());
			asf.setOffcode_detect("wait");
			asf.setPoscode_detect("waitpopup");
			asf.setCreate_by(1234L);
			asf.setCreate_on(new Date());
			asf.setStaff_idcardno_detect("waitdevilop");
			//)

			//user.setUser_login(request.getParameter("user_login"));
			//user.setUser_pass(request.getParameter("user_pass"));
			//user.create();
			asf.create();
			log.debug("will create");
			//bindAndValidate(user,request);
		}catch(Exception e){
			throw e;
		}
		//validate
		//investForm.getId();

		// table =
		redirect("?page=Invest/2_27_list.jsp", request,response);
	}

	// retrive
	public void view(HttpServletRequest request,HttpServletResponse response)throws Exception {
		User user = new User(db);
		user = user.findByPk(new Long(request.getParameter("id")));
		request.setAttribute("user", user);
		forward("/test/view.jsp", request, response);
	}
	public void list(HttpServletRequest request,HttpServletResponse response)throws Exception {
		// select data
		//ApplicationSincereConfirm asf = new ApplicationSincereConfirm();

		//List<ApplicationSincereConfirm> listasf = asf.findAll();
		//	for data to display
		//log.debug(listasf.get(0));
		//request.setAttribute("listasf", listasf);
		//log.debug(listasf.size());
		ArrayList<String> alin ;
		ArrayList<String> alfeild;
		String sql;
		alin = new ArrayList();
		alfeild = new ArrayList();
		alfeild.add("inc.guilt_base like '");
		alin.add(request.getParameter("guilt_base")+"'");

		sql = "select distinct aa.track_no, pke_arrest.getArrestIndictment(aa.track_no) guilt_base, "+
		"case aal.culprit_type "+
		"when 1 then tt.title_name || aal.first_name || ' ' || aal.last_name "+
		"when 2 then tt.title_name || aal.first_name || ' ' || aal.middle_name || ' ' || aal.last_name "+
		"when 3 then tc.title_name || aal.company_name end lawbreaker_name, "+
		"aal.lawbreaker_id_card, aal.lawbreaker_passport, aal.excise_reg_no, aal.corporation_code, "+
		"aa.occurrence_date, to_char(aa.occurrence_date, 'dd/mm/yyyy', 'NLS_CALENDAR=''THAI BUDDHA'' NLS_DATE_LANGUAGE=THAI') occurrence_date2, "+
		"bi.case_date, to_char(bi.case_date, 'dd/mm/yyyy', 'NLS_CALENDAR=''THAI BUDDHA'' NLS_DATE_LANGUAGE=THAI') case_date2, "+
		"aa.application_date, to_char(aa.application_date, 'dd/mm/yyyy', 'NLS_CALENDAR=''THAI BUDDHA'' NLS_DATE_LANGUAGE=THAI')  application_date2, "+
		"bi.case_id, tia.title_name || sta.first_name || ' ' || sta.last_name accuser_name, aa.legislation_id, lg.legislation_name, "+
		"pd.product_name || case when b.brand_main_code is not null  then ' ������ ' || nvl(b.brand_main_thai,b.brand_main_eng) else '' end product_name, "+
		"aa.product_group_id, dg.group_name product_group_name, cc.compare_case_no, aap.exhibit_report_no, "+
		"(select sum(nvl(lbk.fine,0)) from application_arrest_lawbreaker lbk where lbk.track_no=aa.track_no) case_fine, "+
		"aa.offcode, ed.offname, aa.accuser_type, bi.case_quality, aa.have_culprit, inc.exhibit_wild, ali.iswithdraw, bi.case_last, "+
		"ana.notice_no,asw.warrant_no, asi.track_no confirm_no, "+
		"pke_compare.getCaseStatus(aa.track_no,'0') case_status_code, pke_compare.getCaseStatus(aa.track_no,'1') case_status_name, "+
		"pke_compare.getCompareStatus(aa.track_no,'0') compare_status_code, pke_compare.getCompareStatus(aa.track_no,'1') compare_status_name "+
		"from application_arrest aa "+
		"inner join application_arrest_indictment aai on aa.track_no=aai.track_no "+
		"inner join indictment inc on inc.indictment_id=aai.indictment_id "+
		"left join application_arrest_lawbreaker aal on aa.track_no=aal.track_no "+
		"left join lawbreaker lb on lb.lawbreaker_no=aal.lawbreaker_no "+
		"left join title tt on tt.title_code=aal.title_code "+
		"left join title tc on tc.title_code=aal.company_title_code "+
		"left join book_impeachment bi on aa.track_no=bi.track_no "+
		"inner join staff sta on sta.idcard_no=aa.accuser_idcardno "+
		"left join title tia on tia.title_code=sta.title_code "+
		"left join application_arrest_exhibit aae on aa.track_no=aae.track_no "+
		"left join product pd on pd.product_code=aae.product_code "+
		"left join brand_main b on b.brand_main_code=aae.brand_code and b.duty_code=aae.duty_code "+
		"inner join legislation lg on lg.id=aa.legislation_id "+
		"inner join duty_group dg on dg.group_id=aa.product_group_id "+
		"inner join province pv on pv.province_code=aa.scene_province "+
		"inner join district d on d.district_code=aa.scene_district "+
		"inner join subdistrict sd on sd.subdistrict_code=aa.scene_subdistrict "+
		"left join compare_case cc on cc.track_no=aa.track_no "+
		"left join application_arrest_prove aap on aa.track_no=aap.track_no "+
		"inner join ed_office ed on ed.offcode=aa.offcode "+
		"left join application_arrest_license ali on aa.track_no=ali.track_no "+
		"left join application_notice_arrest ana on ana.id=aa.application_notice_arrest_id "+
		"left join application_search_warrant asw on asw.id=aa.application_search_warrant_id "+
		"left join application_sincere_confirm asi on asi.id=aa.application_sincere_confirm_id "+
		"where 1=1 "+
		"order by aa.track_no desc ";

		log.debug(request.getParameter("guilt_base"));
		log.debug(request.getParameter("legislation_id"));
		log.debug(request.getParameter("lawbreaker_name"));
		log.debug(request.getParameter("product_group_id"));
		log.debug(request.getParameter("occurrence_date"));
		log.debug(request.getParameter("occurrence_date2"));
		log.debug(request.getParameter("scene_province"));
		log.debug(request.getParameter("case_date"));
		log.debug(request.getParameter("case_date2"));
		log.debug(request.getParameter("scene_district"));
		log.debug(request.getParameter("application_date"));
		log.debug(request.getParameter("application_date2"));
		log.debug(request.getParameter("scene_subdistrict"));
		log.debug(request.getParameter("aa_track_no"));
		log.debug(request.getParameter("compare_case_no"));
		log.debug(request.getParameter("case_id"));
		log.debug(request.getParameter("exhibit_report_no"));
		log.debug(request.getParameter("partial_name"));
		log.debug(request.getParameter("lawbreaker_id_card"));
		log.debug(request.getParameter("product_name"));
		log.debug(request.getParameter("case_fine"));
		log.debug(request.getParameter("case_fine2"));
		log.debug(request.getParameter("case_law_id"));
		log.debug(request.getParameter("offcode"));
		log.debug(request.getParameter("offname"));
		log.debug(request.getParameter("accuserType"));
		log.debug(request.getParameter("case_quality1"));
		log.debug(request.getParameter("case_quality2"));
		log.debug(request.getParameter("have_culprit"));
		log.debug(request.getParameter("caseLast1"));
		log.debug(request.getParameter("caseLast2"));
		log.debug(request.getParameter("caseLast3"));
		log.debug(request.getParameter("exhibit_wild"));
		log.debug(request.getParameter("iswithdraw"));




		//request.setAttribute("listasf", listasf);

		log.debug("list");
		//	for screen to show
		forward("?page=/Protect/arrest_search.jsp", request, response);

	}

	// update
	public void edit(HttpServletRequest request,HttpServletResponse response)throws Exception {
		User user =new User(db);
		Long id = new Long(request.getParameter("id"));
		user = user.findByPk(id);
		log.debug(user);
		request.setAttribute("user", user);
		forward("/test/edit.jsp", request, response);
	}
	public void update(HttpServletRequest request,HttpServletResponse response)throws Exception {
		User user = new User(db);
		user.setId(new Long(request.getParameter("id")));
		user.setUser_login(request.getParameter("user_login"));
		user.setUser_pass(request.getParameter("user_pass"));
		user.update();
		request.setAttribute("user", user);
		forward("/test/edit.jsp", request, response);
	}

	// delete
	public void delete(HttpServletRequest request,HttpServletResponse response)throws Exception {
		User user = new User(db);
		user.deleteByPk(new Long(request.getParameter("id")));
		redirect("process?action=Invest&cmd=list", request,response);
	}

	@Override
	public void _default(HttpServletRequest request, HttpServletResponse response) throws Exception {
		// TODO Auto-generated method stub
	}

}
