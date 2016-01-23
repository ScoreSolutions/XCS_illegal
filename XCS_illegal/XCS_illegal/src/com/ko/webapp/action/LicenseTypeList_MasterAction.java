package com.ko.webapp.action;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.ko.domain.Court;
import com.ko.domain.LicenseType;
import com.ko.webapp.util.ParameterUtil;

public class LicenseTypeList_MasterAction extends BaseAction{

	@Override
	public void _default(HttpServletRequest request,
			HttpServletResponse response) throws Exception {
		// TODO Auto-generated method stub
		String sql="select lt.id, lt.licensetype_code, lt.licensetype_name, lt.active_status "
					+"from license_type lt order by lt.licensetype_code";
		
		LicenseType licenseType = new LicenseType(db);
		List listLicense = licenseType.findBySql(sql);
		//System.out.println(listLicense);
		request.setAttribute("listlicense", listLicense);
		forward("?page=/Master/LicenseTypeList.jsp");
	}
	public void create(HttpServletRequest request,
			HttpServletResponse response) throws Exception {
		LicenseType li = new LicenseType(db);
		bindForm(li);
		//System.out.println(request.getParameter("active_status"));
		if(request.getParameter("active_status") == null){
			li.setActive_status("0");
		}
		li.setCreate_by(create_by);
		li.setCreate_on(create_on);
		//li.setUpdate_by(update_by);
		//li.setUpdate_on(update_on);
		li = li.create();
		//redirect("process?action=LicenseTypeList_Master#"+li.getId());
		redirect("process?action=LicenseTypeList_Master");
	}
	public void delete(HttpServletRequest request,HttpServletResponse response)throws Exception {
		String[] ids =  request.getParameterValues("id");
		int del = ParameterUtil.getIntegerParam("iddel", request);
		del=del-1;
		if( ids!=null && ids.length>0 ){
			LicenseType court = new LicenseType(db);
			List<Long> idList = new ArrayList<Long>();
			for( int i=0;i<ids.length;i++ )
				idList.add(new Long(ids[i]));
			int deleteRow = court.deleteByPks(idList);
		}
		redirect("process?action=LicenseTypeList_Master#del"+del);
	}
	public void update(HttpServletRequest request,HttpServletResponse response)throws Exception {
		LicenseType licenseType = new LicenseType(db);
		licenseType = licenseType.findByPk(ParameterUtil.getLongParam("id", request));
		System.out.println("checkBox="+request.getParameter("active_statusUpdate"));
		if(request.getParameter("active_statusUpdate") == null){
			licenseType.setActive_status("0");
		}else{
			licenseType.setActive_status("1");
		}
		
		//licenseType.setActive_status(request.getParameter("active_statusUpdate"));
		licenseType.setLicensetype_code(request.getParameter("licensetype_codeUpdate"));
		licenseType.setLicensetype_name(request.getParameter("licensetype_nameUpdate"));
		licenseType.setUpdate_by(update_by);
		licenseType.setUpdate_on(update_on);
		licenseType = licenseType.update();
		redirect("process?action=LicenseTypeList_Master#"+ParameterUtil.getLongParam("id", request));
	}
}
