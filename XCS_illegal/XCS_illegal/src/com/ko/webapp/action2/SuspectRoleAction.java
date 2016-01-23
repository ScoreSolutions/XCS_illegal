








 

/**
 * produce by boonchai ( neng )
 * @author <a href="mailto:mr.boonchai@gmail.com">Mr.Boonchai Wedwanitsathein</a>
 */
package com.ko.webapp.action2;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.ko.webapp.action.BaseAction;
import com.ko.domain.SuspectRole;

public class SuspectRoleAction extends BaseAction{
	@Override
	public void _default(HttpServletRequest request, HttpServletResponse response) throws Exception {
		// TODO Auto-generated method stub
	}
	// list
	public void list(HttpServletRequest request,HttpServletResponse response)throws Exception {
		SuspectRole suspectRole =new SuspectRole(db);
		// pageUtil.setPageSize(15);
		Integer totalRow = suspectRole.countAll();

		// set TotalRow
		pageUtil.setTotalRow(totalRow);
		List<SuspectRole> suspectRoles = suspectRole.findAll(pageUtil);

		//	for data to display
		request.setAttribute("suspectRoles", suspectRoles);

		//	for screen to show
		forward("?page=/web/suspectRoleList.jsp");
	}

	//	 create
	public void add(HttpServletRequest request,HttpServletResponse response)throws Exception {
		forward("?page=/web/suspectRoleCreate.jsp");
	}
	public void create(HttpServletRequest request,HttpServletResponse response)throws Exception {
		SuspectRole suspectRole = new SuspectRole(db);
		bindForm(suspectRole);
		suspectRole = suspectRole.create();
		if( suspectRole!= null )
			formHandler.setFormMessage("Create Completed ,view <a href='process2?action=SuspectRole&cmd=view&id="+suspectRole.getId()+"' target='_blank'>new Record</a>");
		else
			formHandler.setFormMessage("Create Not Complete");
		redirect("process2?action=SuspectRole&cmd=add");
	}

	// view
	public void view(HttpServletRequest request,HttpServletResponse response)throws Exception {
		String id =  request.getParameter("id");
		if( id!=null && !id.trim().equals("") ){
			SuspectRole suspectRole = new SuspectRole(db);
			suspectRole = suspectRole.findByPk(new Long(id));
			if( suspectRole!=null ){
				request.setAttribute("suspectRole", suspectRole);
			}else{
				formHandler.setFormMessage("Error : Not Found with id "+ id );
			}
		}else{
			formHandler.setFormMessage("Error : Please Enter id");
		}
		forward("?page=/web/suspectRoleView.jsp");
	}

	// update
	public void edit(HttpServletRequest request,HttpServletResponse response)throws Exception {
		String id =  request.getParameter("id");
		if( id!=null && !id.trim().equals("") ){
			SuspectRole suspectRole =new SuspectRole(db);
			suspectRole = suspectRole.findByPk(new Long(id));
			if( suspectRole!=null ){
				request.setAttribute("suspectRole", suspectRole);
			}else{
				formHandler.setFormMessage("Error : Not Found with id "+ id );
			}
		}
		forward("?page=/web/suspectRoleEdit.jsp");
	}
	public void update(HttpServletRequest request,HttpServletResponse response)throws Exception {
		SuspectRole suspectRole = new SuspectRole(db);
		bindForm(suspectRole);
		suspectRole = suspectRole.update();
		if( suspectRole!=null ){
			request.setAttribute("suspectRole", suspectRole);
			formHandler.setFormMessage("Update Completed");
		}else{
			formHandler.setFormMessage("Update Failed");
		}
		forward("?page=/web/suspectRoleEdit.jsp");
	}

	// delete
	public void delete(HttpServletRequest request,HttpServletResponse response)throws Exception {
		String[] ids =  request.getParameterValues("id");
		if( ids!=null && ids.length>0 ){
			SuspectRole suspectRole = new SuspectRole(db);
			List<Long> idList = new ArrayList<Long>();
			for( int i=0;i<ids.length;i++ )
				idList.add(new Long(ids[i]));
			int deleteRow = suspectRole.deleteByPks(idList);
			formHandler.setFormMessage(" Delete "+deleteRow+" Row Completed ");
		}else{
			formHandler.setFormMessage("Plese Select At Least One For Delete");
		}
		redirect("process2?action=SuspectRole&cmd=list");
	}
}