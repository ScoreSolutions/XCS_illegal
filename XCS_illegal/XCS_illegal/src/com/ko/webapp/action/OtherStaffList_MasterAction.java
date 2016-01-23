package com.ko.webapp.action;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.ko.domain.ConfigDivideStaff;
import com.ko.domain.ConfigShareMoneyPercent;
import com.ko.domain.StaffOther;
import com.ko.domain.Title;
import com.ko.util.DateUtil;
import com.ko.util.RunningKey;
import com.ko.webapp.util.ParameterUtil;
import java.util.Date;
import java.text.SimpleDateFormat;

public class OtherStaffList_MasterAction extends BaseAction{
	String menuID="36";
	@Override
	public void _default(HttpServletRequest request,
			HttpServletResponse response) throws Exception {
		// TODO Auto-generated method stub
		
		if(uData.chkUserMenu(menuID)==true){
			forward("?page=/Master/OtherStaffList.jsp");
		}else{
    		HttpSession session = request.getSession();
  		  	session.invalidate();
  		  	request.setAttribute("errMsg", "ผู้ใช้ไม่มีสิทธิ์ดำเนินการ");
  		  	forward("?page=/login.jsp", request, response);
    	}
	}
	public void list(HttpServletRequest request,
			HttpServletResponse response) throws Exception {
		String sqlcount="select count(*) "
			   +"from staff_other st "
			   +"left join title ti on ti.title_code=st.title_code "
			   +"where 1=1  ";
		String sql="select st.id, st.staff_no, ti.title_name, st.first_name, st.last_name, st.pos_name, st.dept_name, "
				   +"decode(st.active,'0','ไม่ใช้งาน','1','ใช้งาน') active_status "
				   +"from staff_other st "
				   +"left join title ti on ti.title_code=st.title_code "
				   +"where 1=1 ";
		String order="order by st.dept_name, st.pos_name, st.first_name, st.last_name ";
		StringBuffer where =new StringBuffer("");
		int findChar;
		int a;
		String firstname="";
		String lastname="";
		//----get Data
		String staffname = ParameterUtil.getStringParam("staffname", request);
		String staffpos = ParameterUtil.getStringParam("staffpos", request);
		String staffcode = ParameterUtil.getStringParam("staffcode", request);
		String staffdept = ParameterUtil.getStringParam("staffdept", request);
		if(!staffname.trim().equals("")){
			if((findChar=staffname.indexOf(" "))>= 0 ){
				firstname=staffname.substring(0, findChar);
				lastname=staffname.substring(findChar+1, staffname.length());
				where.append("and st.first_name like ? ");
				a=where.indexOf("?");
				where.replace(a, a+1, "");
				where.insert(a, "'%"+firstname+"%'");
				where.append("and st.last_name like ? ");
				a=where.indexOf("?");
				where.replace(a, a+1, "");  
				where.insert(a, "'%"+lastname+"%'");
			}else{
				where.append("and st.first_name like ? ");
				a=where.indexOf("?");
				where.replace(a, a+1, "");
				where.insert(a, "'%"+staffname+"%'");
			}
			
		}
		if(!staffpos.trim().equals("")){
			where.append("and st.pos_name like ? ");
			a=where.indexOf("?");
			where.replace(a, a+1, "");
			where.insert(a, "'%"+staffpos+"%'");
		}
		if(!staffcode.trim().equals("")){
			where.append("and st.staff_no like ? ");
			a=where.indexOf("?");
			where.replace(a, a+1, "");
			where.insert(a, "'%"+staffcode+"%'");
		}
		if(!staffdept.trim().equals("")){
			where.append("and st.dept_name like ? ");
			a=where.indexOf("?");
			where.replace(a, a+1, "");
			where.insert(a, "'%"+staffdept+"%'");
		}
		//----
		StaffOther staff = new StaffOther(db);
		//System.out.println(sqlcount+where.toString());
		log.debug(sqlcount+where.toString());
		Integer totalRow = staff.countBySql(sqlcount+where.toString());
		pageUtil.setTotalRow(totalRow);
		pageUtil.setPageSize(20);
		//System.out.println("sql="+sql+where.toString()+order.toString());
		log.debug(sql+where.toString()+order.toString());
		List listStaff = staff.findBySql(sql+where.toString()+order.toString(), null, pageUtil);
		//System.out.println(listStaff);
		log.debug(listStaff);
		request.setAttribute("StaffList", listStaff);
		forward("?page=/Master/OtherStaffList.jsp");
	}
	public void add(HttpServletRequest request,
			HttpServletResponse response) throws Exception {
		Title title = new Title(db);
		List listTile = title.findAll();
		request.setAttribute("listSelect", listTile);
		forward("?page=/Master/OtherStaffForm.jsp");
	}
	public void delete(HttpServletRequest request,HttpServletResponse response)throws Exception {
		if(request.getParameter("id") != null){
			StaffOther st = new StaffOther(db);
			st.deleteByPk(new Long(request.getParameter("id")));
		}
		//forward("?page=/Master/OtherStaffList.jsp");
		list(request,response);
	}
	public void create(HttpServletRequest request,HttpServletResponse response)throws Exception {
		StaffOther staff = new StaffOther(db);		
		//set value
		staff.setStaff_no(new RunningKey(db).getRunningKey("STAFF_OTHER","","",offcode));
		staff.setTitle_code(request.getParameter("staff_offcode").trim());
		staff.setFirst_name(request.getParameter("staff_first_name").trim());
		staff.setLast_name(request.getParameter("staff_last_name").trim());
		staff.setCreate_by(create_by.toString());
		staff.setCreate_on(create_on);
		staff.setPos_name(request.getParameter("staff_poscode").trim());
		staff.setDept_name(request.getParameter("staff_level").trim());
		staff.setStart_date(DateUtil.getDateFromString(ParameterUtil.getStringParam("start_date", request)));
		staff.setEnd_date(DateUtil.getDateFromString(ParameterUtil.getStringParam("end_date", request)));
		staff.setActive((request.getParameterValues("active") != null ? "1" : "0"));
		staff = staff.create();
		
		
		this.writeTranLog("เพิ่มข้อมูลเจ้าหน้าที่อื่นๆ");
		formHandler.setFormMessage("บันทึกข้อมูลเรียบร้อย");
		redirect("process?action=OtherStaffList_Master&cmd=edit&id="+staff.getId(), request, response);
		
	}
	public void edit(HttpServletRequest request,HttpServletResponse response)throws Exception {
		String id = request.getParameter("id");
		if(id != null && !id.trim().equals("")){
			StaffOther staff =new StaffOther(db);
			staff = staff.findByPk(new Long(id));
			if(staff != null){
				request.setAttribute("stafflist", staff);
			}
			//System.out.println(staff);
		}
		Title title = new Title(db);
		List listTile = title.findAll();
		request.setAttribute("listSelect", listTile);
		forward("?page=/Master/OtherStaffEdit.jsp");
	}
	public void update(HttpServletRequest request,HttpServletResponse response)throws Exception {
		StaffOther staff = new StaffOther(db);
		String id = request.getParameter("id");
		staff = staff.findByPk(new Long(id));
		staff.setStaff_no(request.getParameter("staff_idcardno"));
		staff.setTitle_code(request.getParameter("staff_offcode").trim());
		staff.setFirst_name(request.getParameter("staff_first_name").trim());
		staff.setLast_name(request.getParameter("staff_last_name").trim());
		staff.setUpdate_by(update_by.toString());
		staff.setUpdate_on(update_on);
		staff.setPos_name(request.getParameter("staff_poscode").trim());
		staff.setDept_name(request.getParameter("dept_name").trim());
		staff.setStart_date(DateUtil.getDateFromString(ParameterUtil.getStringParam("start_date", request)));
		staff.setEnd_date(DateUtil.getDateFromString(ParameterUtil.getStringParam("end_date", request)));
		staff.setActive((request.getParameterValues("active") != null ? "1" : "0"));
		staff = staff.update();

		formHandler.setFormMessage("แก้ไขข้อมูลเรียบร้อย");
		redirect("process?action=OtherStaffList_Master&cmd=edit&id="+request.getParameter("id"));
	}
}
