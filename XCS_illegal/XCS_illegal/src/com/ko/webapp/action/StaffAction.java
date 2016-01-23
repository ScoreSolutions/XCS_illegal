package com.ko.webapp.action;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.ko.domain.Staff;
import com.ko.domain.Title;
import com.ko.domain.User;

public class StaffAction extends BaseAction {

	@Override
	public void _default(HttpServletRequest request, HttpServletResponse response) throws Exception {
		// TODO Auto-generated method stub
		List<Staff> staffs = new ArrayList<Staff>();
		request.setAttribute("formname",request.getParameter("formname"));
		request.setAttribute("formcode",request.getParameter("formcode"));
		request.setAttribute("empid",request.getParameter("id"));
		request.setAttribute("stafflist",staffs);
		forward("Popup/arrest_accuser_pop.jsp", request, response);
	}


	public void findStaff(HttpServletRequest request, HttpServletResponse response) throws Exception{
		Staff staff = new Staff(this.db);
		Title title = new Title(this.db);

		Object[] q = {"%"+request.getParameter("FIRST_NAME")+"%","%"+request.getParameter("LAST_NAME")+"%"};
		//System.out.println("title_code "+ staff.getTitle_code());
		title= title.findByPk(staff.getTitle_code());
		try {
			this.pageUtil.setPageSize(15);
			List<Staff> stafflist = staff.findByWhere("FIRST_NAME like ? and LAST_NAME like ? ",q,this.pageUtil);
			request.setAttribute("stafflist", stafflist);
			request.setAttribute("title", title);
			request.setAttribute("formname",request.getParameter("formname"));
			request.setAttribute("formcode",request.getParameter("formcode"));
			request.setAttribute("empid",request.getParameter("id"));
			log.debug("mu :: "+stafflist);
			forward("Popup/arrest_accuser_pop.jsp", request, response);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			System.out.println("error : StaffAction : findStaff ");
			e.printStackTrace();
		}

	}

}
