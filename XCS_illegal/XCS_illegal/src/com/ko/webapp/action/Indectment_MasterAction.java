package com.ko.webapp.action;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.ko.domain.Indictment;
import com.ko.domain.Legislation;
import com.ko.util.RunningKey;
import com.ko.webapp.util.ParameterUtil;

public class Indectment_MasterAction extends BaseAction{
	String menuID="39";
	@Override
	public void _default(HttpServletRequest request,
			HttpServletResponse response) throws Exception {
		// TODO Auto-generated method stub
		
		if(uData.chkUserMenu(menuID)==true){
			Legislation legisLation = new Legislation(db);
			List<Legislation> listLegis = legisLation.findAll();
			String sql="select inc.indictment_id, inc.guilt_mst_id, inc.case_law_id, inc.penalty_case_law_id, inc.guilt_base, "
				+"inc.penalty_desc, inc.isfine, inc.fine_rate, inc.remarks, "
				+"inc.isimprison, inc.exhibit_wild,inc.is_prove "
				+"from indictment inc "
				+"inner join legislation lg on lg.legislation_code=inc.law_id "
				+"where lg.id=pke_master.getConfigValue('legislation_alcohol') ";
			String order="order by inc.guilt_mst_id ";
			Indictment indict = new Indictment(db);
			List<Map<String,Object>> indictList = indict.findBySql(sql+order.toString());
			//log.debug(indictList);
			//log.debug(listLegis);
			request.setAttribute("legisList", listLegis);
			request.setAttribute("indictList", indictList);
			request.setAttribute("legislation_id", listLegis.get(0).getLegislation_code());
			forward("?page=/Master/IndictmentList.jsp");
		}else{
    		HttpSession session = request.getSession();
  		  	session.invalidate();
  		  	request.setAttribute("errMsg", "ผู้ใช้ไม่มีสิทธิ์ดำเนินการ");
  		  	forward("?page=/login.jsp", request, response);
    	}
	}
	public void create(HttpServletRequest request,HttpServletResponse response)throws Exception {
		Indictment indictment = new Indictment(db);
		
		bindForm(indictment);
		if(request.getParameter("exhibit_wild") != null){
			indictment.setExhibit_wild("Y");
		}else{
			indictment.setExhibit_wild("N");
		}
		if(request.getParameter("is_prove") != null){
			indictment.setIs_prove("Y");
		}else{
			indictment.setIs_prove("N");
		}
		indictment.setCreate_by(create_by);
		indictment.setCreate_on(create_on);
		indictment = indictment.create();
		String id=indictment.getLaw_id();
		redirect("process?action=Indectment_Master&cmd=list&law_id="+id+"#"+indictment.getIndictment_id());
	}
	public void add(HttpServletRequest request,
			HttpServletResponse response) throws Exception {
		// TODO Auto-generated method stub
		Legislation legisList = new Legislation(db);
		String key =new RunningKey(db).getRunningKey("INDICTMENT", "", "", "");
		log.debug(key);
		List listLe = legisList.findAll();
		log.debug(listLe);
		request.setAttribute("legisList", listLe);
		request.setAttribute("key", key);
		forward("?page=/Master/IndictmentForm.jsp");
	}
	public void list(HttpServletRequest request,
			HttpServletResponse response) throws Exception {
		// TODO Auto-generated method stub
		String lawID = request.getParameter("law_id");
		String sql="select inc.indictment_id, inc.guilt_mst_id, inc.case_law_id, inc.penalty_case_law_id, inc.guilt_base, "
					+"inc.penalty_desc, inc.isfine, inc.fine_rate, inc.remarks, "
					+"inc.isimprison, inc.exhibit_wild,inc.is_prove "
					+"from indictment inc ";
		StringBuffer where = new StringBuffer("where inc.law_id='?'");
		String order="order by inc.guilt_mst_id ";
		int i;
		if(!lawID.trim().equals("")){
			i=where.indexOf("?");
			where.replace(i, i+1, "");
			where.insert(i,lawID);
		}
		//log.debug(sql+where.toString());
		Indictment indict = new Indictment(db);
		List indictList = indict.findBySql(sql+where.toString()+order.toString());
		//log.debug(indictList);
		Legislation legisList = new Legislation(db);
		List listLe = legisList.findAll();
		//log.debug(listLe);
		request.setAttribute("legisList", listLe);
		request.setAttribute("indictList", indictList);
		forward("?page=/Master/IndictmentList.jsp");
	}
	public void delete(HttpServletRequest request,HttpServletResponse response)throws Exception {
		String[] indictment_ids =  request.getParameterValues("chkList");
		//log.debug(indictment_ids.length);
		String lawid = request.getParameter("legislation_id");
		if( indictment_ids!=null && indictment_ids.length>0 ){
			Indictment indictment = new Indictment(db);
			List<Long> indictment_idList = new ArrayList<Long>();
			for( int i=0;i<indictment_ids.length;i++ ){
				log.debug(indictment_ids[i]);
				indictment_idList.add(new Long(indictment_ids[i]));
			}
			int deleteRow = indictment.deleteByPks(indictment_idList);
			
		}
		redirect("process?action=Indectment_Master&cmd=list&law_id="+lawid+"");
	}
	public void edit(HttpServletRequest request,HttpServletResponse response)throws Exception {
		Indictment indecment = new Indictment(db);
		Legislation legisLation = new Legislation(db);
		Long id = ParameterUtil.getLongParam("id", request);
		if(id != null){
			indecment = indecment.findByPk(id);
			if(indecment != null){
				request.setAttribute("indic", indecment);
			}
		}
		List listLegis = legisLation.findAll();
		request.setAttribute("legisList", listLegis);
		forward("?page=/Master/IndictmentEdit.jsp");
		
	}
	public void update(HttpServletRequest request,HttpServletResponse response)throws Exception {
		Indictment indecment = new Indictment(db);
		Long id = ParameterUtil.getLongParam("id", request);
		indecment = indecment.findByPk(id);
		bindForm(indecment);
		if(indecment != null){
			if(request.getParameter("exhibit_wild") != null){
				indecment.setExhibit_wild("Y");
			}else{
				indecment.setExhibit_wild("N");
			}
			if(request.getParameter("is_prove") != null){
				indecment.setIs_prove("Y");
			}else{
				indecment.setIs_prove("N");
			}
				
			indecment=indecment.update();
		}
		redirect("process?action=Indectment_Master&cmd=edit&id="+indecment.getIndictment_id());
	}
}
