package com.ko.webapp.action;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;


import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.ko.domain.BrandMain;
import com.ko.domain.Court;
import com.ko.domain.DutyTable;
import com.ko.domain.DutyGroup;
import com.ko.util.ConfigUtil;
import com.ko.util.DateUtil;
import com.ko.webapp.util.ParameterUtil;

public class BrandList_MasterAction extends BaseAction {
	public Long asw_id = new Long(0l);
	String menuID = "242";
	@Override
	
		public void _default(HttpServletRequest request,HttpServletResponse response) throws Exception {
			// TODO Auto-generated method stub
			if(uData.chkUserMenu(menuID)==true){
				DutyGroup dutygrplist = new DutyGroup(db);		
				
				String sql = "select dg.id,dg.group_id,dg.group_name from duty_group dg where dg.group_status = 'N' order by dg.group_id";

				List viewdutygrp = dutygrplist.findBySql(sql);					
			
				//request.setAttribute("cmbDutyGroup", request.getParameter("cmbDutyGroup"));		
				String dutygroupid= "" ;		
				if (request.getParameter("cmbDutyGroup") != null)
				{
					dutygroupid = request.getParameter("cmbDutyGroup");		
				}
				else
				{
					dutygroupid= request.getParameter("group_id");	
				}				
				
				request.setAttribute("cmbDutyGroup", dutygroupid);	
				request.setAttribute("dutylist", viewdutygrp);				
	
				forward("?page=/Master/BrandList.jsp");
			}else{
	    		HttpSession session = request.getSession();
	  		  	session.invalidate();
	  		  	request.setAttribute("errMsg", "ผู้ใช้ไม่มีสิทธิ์ดำเนินการ");
	  		  	forward("?page=/login.jsp", request, response);
	    	}
		}
	
	public void searchData(HttpServletRequest request, String dutygrp_id) throws Exception{
		
		String sql="";
		String sqlCount="";		
		String order=" order by bm.brand_main_thai,bm.brand_main_eng ";
		
		sql=" select bm.id,bm.group_id,bm.brand_main_code,bm.brand_main_thai,bm.brand_main_eng,to_char(bm.begin_date,'fmdd/MM/yyyy', 'NLS_CALENDAR=''THAI BUDDHA'' NLS_DATE_LANGUAGE=THAI') As begin_date ,to_char(bm.end_date,'fmdd/MM/yyyy', 'NLS_CALENDAR=''THAI BUDDHA'' NLS_DATE_LANGUAGE=THAI') As end_date"
					+" from brand_main bm "
					+" where 1=1 "; 
		if(!dutygrp_id.trim().equals(""))
		sql += " and bm.group_id = '" + dutygrp_id.trim().replace("'", "''") + "'";
		
		//page number
		sqlCount =" select Count(*) "
			+" from	 brand_main bm "
			+" where 1=1 "; 
		if(!dutygrp_id.trim().equals(""))
		sqlCount += " and bm.group_id = '" + dutygrp_id.trim().replace("'", "''") + "'";
		
		BrandMain asw = new BrandMain(db);		
		Integer totalRow = asw.countBySql(sqlCount+ order.toString(), null);
		pageUtil.setTotalRow(totalRow);
		pageUtil.setPageSize(20);
		
		if(request.getParameter("_page") != null)
		{
			int page =  Integer.parseInt(request.getParameter("_page")) ;
			pageUtil.setPage(page);
			request.setAttribute("_page", page);
		}
		else
		{
			pageUtil.setPage(1);
			request.setAttribute("_page", 1);
		}
			
		List<Map<String, Object>> brand_list = asw.findBySql(sql + order.toString(), null,pageUtil);
        request.setAttribute("BrandListData", brand_list);
        request.setAttribute("rowCount", brand_list.size());
		
        String dutygroupid= "" ;		
		if (request.getParameter("cmbDutyGroup") != null)
		{
			dutygroupid = request.getParameter("cmbDutyGroup");		
		}
		else
		{
			dutygroupid= request.getParameter("group_id");	
		}				
		request.setAttribute("cmbDutyGroup", dutygroupid);	        
        
        DutyGroup dutygrplist = new DutyGroup(db);
		List viewdutygrp = dutygrplist.findBySql("select dg.id,dg.group_id,dg.group_name from duty_group dg where dg.group_status = 'N' order by dg.group_id");			
		//request.setAttribute("cmbDutyGroup", request.getParameter("cmbDutyGroup"));
		request.setAttribute("dutylist", viewdutygrp);		
	}
	
	public void list(HttpServletRequest request,HttpServletResponse response)throws Exception {
		log.debug(request.getParameter("cmbDutyGroup"));
		log.debug(request.getParameter("group_id"));
		
		String dutygroupid= "" ;		
		if (request.getParameter("cmbDutyGroup") != null)
		{
			dutygroupid = request.getParameter("cmbDutyGroup");		
		}
		else
		{
			dutygroupid= request.getParameter("group_id");	
		}				
		request.setAttribute("cmbDutyGroup", dutygroupid);	

		searchData(request,dutygroupid);	
		forward("?page=/Master/BrandList.jsp");
	}
	public void create(HttpServletRequest request,HttpServletResponse response) throws Exception {
		
		BrandMain brand = new BrandMain(db);
		//bindForm(duty);
		//if(request.getParameter("active_status") == null){
		String BrandCode = brand.GetNewBrandMainCode();
		if (!BrandCode.equals("")){
			String id = (request.getParameter("id") != null ? request.getParameter("id").toString() : "");
			brand.setGroup_id(request.getParameter("cmbDutyGroupCreate"));	
			brand.setBrand_main_code(BrandCode);
			brand.setBrand_main_thai(request.getParameter("brand_thai"));
			brand.setBrand_main_eng(request.getParameter("brand_eng"));		

			brand.setBegin_date(DateUtil.getDateFromString(request.getParameter("request_date_start")));
			brand.setEnd_date(DateUtil.getDateFromString(request.getParameter("request_date_stop")));
			
			brand.setUpd_date(new java.util.Date());
			brand.setUpd_userid(uData.getIdCard());
			
			if(!id.equals("")){
				brand = brand.update();
			}else{
				brand = brand.create();
			}
			redirect("process?action=BrandList_Master&cmd=list&cmbDutyGroup=" + request.getParameter("cmbDutyGroupCreate"));
		}
	}
	public void update(HttpServletRequest request,HttpServletResponse response)throws Exception {
		
		BrandMain brand = new BrandMain(db);
		brand= brand.findByPk(ParameterUtil.getLongParam("id", request));	
		
		brand.setGroup_id(request.getParameter("group_id"));
    	brand.setBrand_main_code(request.getParameter("brand_codeUpdate"));
		brand.setBrand_main_thai(request.getParameter("brand_nameThaiUpdate"));
		brand.setBrand_main_eng(request.getParameter("brand_nameEngUpdate"));		
		
		brand.setBegin_date(DateUtil.getDateFromString(request.getParameter("request_date_startUpdate")));
		brand.setEnd_date(DateUtil.getDateFromString(request.getParameter("request_date_stopUpdate")));
		
		brand = brand.update();
		redirect("process?action=BrandList_Master&cmd=list&cmbDutyGroup=" + request.getParameter("group_id"));
	}	
public void delete(HttpServletRequest request,HttpServletResponse response)throws Exception {
		
		String[] ids =  request.getParameterValues("id");
		int del = ParameterUtil.getIntegerParam("iddel", request);
		int grp = ParameterUtil.getIntegerParam("idgrp", request);		

		del = del-1;

		if( ids!=null && ids.length>0 ){
			BrandMain BrandMain = new BrandMain(db);
			List<Long> idList = new ArrayList<Long>();
			for( int i=0;i<ids.length;i++ )
				idList.add(new Long(ids[i]));
			int deleteRow = BrandMain.deleteByPks(idList);
		}
		redirect("process?action=BrandList_Master&cmd=list&cmbDutyGroup=" + grp);
	}
}
