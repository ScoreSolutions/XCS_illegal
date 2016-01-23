package com.ko.webapp.action;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.ko.domain.LicenseType;
import com.ko.domain.PictureCategory;
import com.ko.util.RunningKey;
import com.ko.webapp.util.ParameterUtil;

public class PictureCategoryList_MasterAction extends BaseAction{
	String menuID="45";
	@Override
	public void _default(HttpServletRequest request,
			HttpServletResponse response) throws Exception {
		// TODO Auto-generated method stub
		
		if(uData.chkUserMenu(menuID)==true){
			PictureCategory pic = new PictureCategory(db);
			List lpic = pic.findBySql("select * from picture_category pc order by pc.category_code");
			request.setAttribute("ListPic", lpic);
			RunningKey rk = new RunningKey(db);
			request.setAttribute("NewCode", rk.getRunningKey("PICTURE_CATEGORY", "", "", "N"));
			forward("?page=/Master/PictureCategoryList.jsp");
		}else{
    		HttpSession session = request.getSession();
  		  	session.invalidate();
  		  	request.setAttribute("errMsg", "ผู้ใช้ไม่มีสิทธิ์ดำเนินการ");
  		  	forward("?page=/login.jsp", request, response);
    	}
	}
	public void delete(HttpServletRequest request,HttpServletResponse response)throws Exception {
		String[] ids =  request.getParameterValues("id");
		int del=ParameterUtil.getIntegerParam("iddel", request);
		del=del-1;
		if( ids!=null && ids.length>0 ){
			PictureCategory pic = new PictureCategory(db);
			List<Long> idList = new ArrayList<Long>();
			for( int i=0;i<ids.length;i++ )
				idList.add(new Long(ids[i]));
			int deleteRow = pic.deleteByPks(idList);
		}
		redirect("process?action=PictureCategoryList_Master#del"+del);
	}
	public void create(HttpServletRequest request,
			HttpServletResponse response) throws Exception {
		PictureCategory pic = new PictureCategory(db);
		bindForm(pic);
		System.out.println(request.getParameter("active"));
		if(request.getParameter("active") == null){
			pic.setActive("0");
		}
		pic.setCreate_by(create_by);
		pic.setCreate_on(create_on);
		//pic.setUpdate_by(update_by);
		//pic.setUpdate_on(update_on);
		pic = pic.create();
		//redirect("process?action=PictureCategoryList_Master#"+pic.getId());
		redirect("process?action=PictureCategoryList_Master");
	}
	public void update(HttpServletRequest request,HttpServletResponse response)throws Exception {
		PictureCategory pic = new PictureCategory(db);
		pic = pic.findByPk(ParameterUtil.getLongParam("id", request));
		System.out.println("checkBox="+request.getParameter("activeUpdate"));
		if(request.getParameter("activeUpdate") == null){
			pic.setActive("0");
		}else{
			pic.setActive("1");
		}
		
		//licenseType.setActive_status(request.getParameter("active_statusUpdate"));
		pic.setCategory_code(request.getParameter("category_codeUpdate"));
		pic.setCategory_name(request.getParameter("category_nameUpdate"));
		pic.setUpdate_by(update_by);
		pic.setUpdate_on(update_on);
		pic = pic.update();
		redirect("process?action=PictureCategoryList_Master#"+ParameterUtil.getLongParam("id", request));
	}
}
