package com.ko.webapp.action;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.ko.domain.ConfigShareMoneyPercent;
import com.ko.domain.DutyTable;
import com.ko.domain.Indictment;
import com.ko.domain.Legislation;
import com.ko.domain.ProductType;
import com.ko.util.ConfigUtil;
import com.ko.webapp.util.FormHandler;
import com.ko.webapp.util.ParameterUtil;

public class ConfigShareMoneyPercentAction extends BaseAction{

	String menuID="34";
	@Override
	public void _default(HttpServletRequest request,
			HttpServletResponse response) throws Exception {
		// TODO Auto-generated method stub
		if(uData.chkUserMenu(menuID)==true){
			String legislation_id = ConfigUtil.getConfig("legislation_alcohol");
			searchData(request, legislation_id);
			request.setAttribute("cmbLegislationSearch", legislation_id);
			forward("?page=/Master/ConfigShareMoneyPercentList.jsp");
		}else{
    		HttpSession session = request.getSession();
  		  	session.invalidate();
  		  	request.setAttribute("errMsg", "ผู้ใช้ไม่มีสิทธิ์ดำเนินการ");
  		  	forward("?page=/login.jsp", request, response);
    	}
	}
	private void searchData(HttpServletRequest request, String vLegislationID) throws Exception{
		ConfigShareMoneyPercent configShareMoneyPercent = new ConfigShareMoneyPercent(db);
		String sqlQuery="";
		String order="order by lg.legislation_name,  decode(cs.isnotice,'Y','มี','N','ไม่มี')";
		sqlQuery="select cs.id, cs.legislation_id, lg.legislation_name,  cs.isnotice, "
					+" cs.bribe, cs.reward, cs.treasury, cs.bribe_limit, cs.reward_limit, cs.penalty_case_law_id, "
					+" cs.duty_code, dt.duty_name, cs.type_code, pt.type_name "
					+" from config_share_money_percent cs "
					+" inner join legislation lg on lg.id=cs.legislation_id "
					+" left join product_type pt on pt.duty_code=cs.duty_code and pt.type_code=cs.type_code "
					+" left join duty_table dt on dt.duty_code=cs.duty_code "
					+" where 1=1 "; 
		if(!vLegislationID.trim().equals(""))
			sqlQuery += " and cs.legislation_id = '" + vLegislationID.trim().replace("'", "''") + "'";
		
		Legislation listLegislation = new Legislation(db);
		List ListLegis = listLegislation.findAll();
		List csmp_list = configShareMoneyPercent.findBySql(sqlQuery+order.toString(),null);
		request.setAttribute("MoneyPercent", csmp_list);
		request.setAttribute("cmbLegislationSearch", request.getParameter("cmbLegislationSearch"));
		request.setAttribute("listLegis", ListLegis);
	}
	public void list(HttpServletRequest request,HttpServletResponse response)throws Exception {
		searchData(request,request.getParameter("cmbLegislationSearch"));
		forward("?page=/Master/ConfigShareMoneyPercentList.jsp");
	}
	public void edit(HttpServletRequest request,HttpServletResponse response)throws Exception {
		String id = request.getParameter("by_id");
		ConfigShareMoneyPercent configMoney = new ConfigShareMoneyPercent(db);
		if(id != null && !id.trim().equals("")){
			
			configMoney = configMoney.findByPk(new Long(id));
			if(configMoney != null){
				request.setAttribute("configMoneyEdit", configMoney);
			}
		}
		Legislation legislation = new Legislation(db);
		List ListLegislation = legislation.findAll();
		request.setAttribute("listLegis", ListLegislation);
				
		request.setAttribute("lgCode",legislation.findByPk(configMoney.getLegislation_id()).getLegislation_code());
 
		forward("?page=/Master/ConfigShareMoneyPercentForm.jsp");
	}
	public void add(HttpServletRequest request,HttpServletResponse response)throws Exception {
		Legislation legislation = new Legislation(db);
		DutyTable dutytable = new DutyTable(db);
		ProductType productype = new ProductType(db);
		List ListLegislation = legislation.findAll();
		request.setAttribute("listLegis", ListLegislation);

		forward("?page=/Master/ConfigShareMoneyPercentForm.jsp");
	}
	
	public void save(HttpServletRequest request,HttpServletResponse response)throws Exception {
		ConfigShareMoneyPercent configShareMoneyPercent = new ConfigShareMoneyPercent(db);

		if(!request.getParameter("id").equals(""))
			configShareMoneyPercent = configShareMoneyPercent.findByPk(new Long(request.getParameter("id")));

		Legislation lg = new Legislation(db);
		Long legislationID = lg.findByWhere("legislation_code = ?" , request.getParameter("legislation_id_temp")).get(0).getId();
		
		configShareMoneyPercent.setLegislation_id(legislationID);
		configShareMoneyPercent.setBribe(new Long(request.getParameter("bribe")));
		configShareMoneyPercent.setReward(new Long(request.getParameter("reward")));
		configShareMoneyPercent.setTreasury(new Long(request.getParameter("treasury")));
		configShareMoneyPercent.setBribe_limit(new Double(request.getParameter("bribe_limit")));
		configShareMoneyPercent.setReward_limit(new Double(request.getParameter("reward_limit")));
		
		if(request.getParameter("isnotice") == null)
			configShareMoneyPercent.setIsnotice("N");
		else
			configShareMoneyPercent.setIsnotice("Y");

		if(request.getParameter("indictment_id") != null){
			configShareMoneyPercent.setIndictment_id(!request.getParameter("indictment_id").equals("") ? ParameterUtil.getLongParam("indictment_id", request) : null);
			Indictment indicment = new Indictment(db);
			indicment = indicment.findByPk(ParameterUtil.getLongParam("indictment_id", request));
			if(indicment != null){
				configShareMoneyPercent.setPenalty_case_law_id(indicment.getPenalty_case_law_id() != null || !indicment.getPenalty_case_law_id().equals("") ? indicment.getPenalty_case_law_id() : "");
			}
		}
		
		configShareMoneyPercent.setDuty_code(request.getParameter("duty_code"));
		configShareMoneyPercent.setType_code(request.getParameter("type_code"));
		
		if(!request.getParameter("id").equals(""))
			configShareMoneyPercent = configShareMoneyPercent.update();
		else
			configShareMoneyPercent = configShareMoneyPercent.create();
		
		formHandler.setFormMessage("บันทึกข้อมูลเรียบร้อย");
		redirect("process?action=ConfigShareMoneyPercent&cmd=edit&by_id="+configShareMoneyPercent.getId());
	}
	
//	public void create(HttpServletRequest request,HttpServletResponse response)throws Exception {
//		ConfigShareMoneyPercent configShareMoneyPercent = new ConfigShareMoneyPercent(db);
//
//		if(!request.getParameter("id").equals(""))
//			configShareMoneyPercent = configShareMoneyPercent.findByPk(new Long(request.getParameter("id")));
//
//		Legislation lg = new Legislation(db);
//		Long legislationID = lg.findByWhere("legislation_code = ?" , request.getParameter("legislation_id_temp")).get(0).getId();
//		configShareMoneyPercent.setLegislation_id(legislationID);
//		configShareMoneyPercent.setBribe(new Long(request.getParameter("bribe")));
//		configShareMoneyPercent.setReward(new Long(request.getParameter("reward")));
//		configShareMoneyPercent.setTreasury(new Long(request.getParameter("treasury")));
//		configShareMoneyPercent.setBribe_limit(new Double(request.getParameter("bribe_limit")));
//		configShareMoneyPercent.setReward_limit(new Double(request.getParameter("reward_limit")));
//		
//		if(request.getParameter("isnotice") == null)
//			configShareMoneyPercent.setIsnotice("N");
//		else
//			configShareMoneyPercent.setIsnotice("Y");
//
//		if(request.getParameter("indictment_id") != null){
//			configShareMoneyPercent.setIndictment_id(!request.getParameter("indictment_id").equals("") ? ParameterUtil.getLongParam("indictment_id", request) : null);
//			Indictment indicment = new Indictment(db);
//			indicment = indicment.findByPk(ParameterUtil.getLongParam("indictment_id", request));
//			if(indicment != null){
//				configShareMoneyPercent.setPenalty_case_law_id(indicment.getPenalty_case_law_id() != null || !indicment.getPenalty_case_law_id().equals("") ? indicment.getPenalty_case_law_id() : "");
//			}
//		}
//		configShareMoneyPercent.setDuty_code(request.getParameter("duty_code"));
//		configShareMoneyPercent.setType_code(request.getParameter("type_code"));
//		
//		if(!request.getParameter("id").equals(""))
//			configShareMoneyPercent = configShareMoneyPercent.update();
//		else
//			configShareMoneyPercent = configShareMoneyPercent.create();
//		
//		//formHandler.setFormMessage("บันทึกข้อมูลเรียบร้อย");
//		redirect("process?action=ConfigShareMoneyPercent&cmd=edit&by_id="+configShareMoneyPercent.getId());
//	}
	public void view(HttpServletRequest request,HttpServletResponse response)throws Exception {
		String id =  request.getParameter("id");
		if( id!=null && !id.trim().equals("") ){
			ConfigShareMoneyPercent configShareMoneyPercent = new ConfigShareMoneyPercent(db);
			configShareMoneyPercent = configShareMoneyPercent.findByPk(new Long(id));
			if( configShareMoneyPercent!=null ){
				request.setAttribute("configShareMoneyPercent", configShareMoneyPercent);
			}
		}
		forward("?page=/web/configShareMoneyPercentView.jsp");
	}
	public void delete(HttpServletRequest request,HttpServletResponse response)throws Exception {
		String[] ids =  request.getParameterValues("chkList");
		if( ids!=null && ids.length>0 ){
			ConfigShareMoneyPercent configShareMoneyPercent = new ConfigShareMoneyPercent(db);
			List<Long> idList = new ArrayList<Long>();
			for( int i=0;i<ids.length;i++ )
				idList.add(new Long(ids[i]));
			int deleteRow = configShareMoneyPercent.deleteByPks(idList);
			log.debug("ggggggggggggg :");
			if(deleteRow > 0){
				log.debug("DDDDDDDDDDDDDD : " + request.getParameter("cmbLegislationSearch"));
				formHandler.setFormMessage("ลบรายที่เลือกเรียบร้อย");
			}
		}
		
		redirect("process?action=ConfigShareMoneyPercent&cmd=list&cmbLegislationSearch=" + request.getParameter("cmbLegislationSearch"));
	}
	public void update(HttpServletRequest request,HttpServletResponse response)throws Exception {
		ConfigShareMoneyPercent configShareMoneyPercent = new ConfigShareMoneyPercent(db);
		Long id = ParameterUtil.getLongParam("id", request);
		configShareMoneyPercent = configShareMoneyPercent.findByPk(id);
		bindForm(configShareMoneyPercent);
		if(request.getParameter("isnotice") == null){
			configShareMoneyPercent.setIsnotice("N");
		}
		else{
			configShareMoneyPercent.setIsnotice("Y");
		}
		configShareMoneyPercent = configShareMoneyPercent.update();
		if( configShareMoneyPercent!=null ){
			request.setAttribute("configShareMoneyPercent", configShareMoneyPercent);
		}
		formHandler.setFormMessage("แก้ไขข้อมูลเรียบร้อย");
		redirect("process?action=ConfigShareMoneyPercent&cmd=edit&by_id="+id);
	}
}
