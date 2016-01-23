








 

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
import com.ko.domain.SuspectRoleAssignOffcode;

public class SuspectRoleAssignOffcodeAction extends BaseAction{
	@Override
	public void _default(HttpServletRequest request, HttpServletResponse response) throws Exception {
		// TODO Auto-generated method stub
	}
	// list
	public void list(HttpServletRequest request,HttpServletResponse response)throws Exception {
		SuspectRoleAssignOffcode suspectRoleAssignOffcode =new SuspectRoleAssignOffcode(db);
		// pageUtil.setPageSize(15);
		Integer totalRow = suspectRoleAssignOffcode.countAll();

		// set TotalRow
		pageUtil.setTotalRow(totalRow);
		List<SuspectRoleAssignOffcode> suspectRoleAssignOffcodes = suspectRoleAssignOffcode.findAll(pageUtil);

		//	for data to display
		request.setAttribute("suspectRoleAssignOffcodes", suspectRoleAssignOffcodes);

		//	for screen to show
		forward("?page=/web/suspectRoleAssignOffcodeList.jsp");
	}

	//	 create
	public void add(HttpServletRequest request,HttpServletResponse response)throws Exception {
		forward("?page=/web/suspectRoleAssignOffcodeCreate.jsp");
	}
	public void create(HttpServletRequest request,HttpServletResponse response)throws Exception {
		SuspectRoleAssignOffcode suspectRoleAssignOffcode = new SuspectRoleAssignOffcode(db);
		bindForm(suspectRoleAssignOffcode);
		suspectRoleAssignOffcode = suspectRoleAssignOffcode.create();
		if( suspectRoleAssignOffcode!= null )
			formHandler.setFormMessage("Create Completed ,view <a href='process2?action=SuspectRoleAssignOffcode&cmd=view&id="+suspectRoleAssignOffcode.getId()+"' target='_blank'>new Record</a>");
		else
			formHandler.setFormMessage("Create Not Complete");
		redirect("process2?action=SuspectRoleAssignOffcode&cmd=add");
	}

	// view
	public void view(HttpServletRequest request,HttpServletResponse response)throws Exception {
		String id =  request.getParameter("id");
		if( id!=null && !id.trim().equals("") ){
			SuspectRoleAssignOffcode suspectRoleAssignOffcode = new SuspectRoleAssignOffcode(db);
			suspectRoleAssignOffcode = suspectRoleAssignOffcode.findByPk(new Long(id));
			if( suspectRoleAssignOffcode!=null ){
				request.setAttribute("suspectRoleAssignOffcode", suspectRoleAssignOffcode);
			}else{
				formHandler.setFormMessage("Error : Not Found with id "+ id );
			}
		}else{
			formHandler.setFormMessage("Error : Please Enter id");
		}
		forward("?page=/web/suspectRoleAssignOffcodeView.jsp");
	}

	// update
	public void edit(HttpServletRequest request,HttpServletResponse response)throws Exception {
		String id =  request.getParameter("id");
		if( id!=null && !id.trim().equals("") ){
			SuspectRoleAssignOffcode suspectRoleAssignOffcode =new SuspectRoleAssignOffcode(db);
			suspectRoleAssignOffcode = suspectRoleAssignOffcode.findByPk(new Long(id));
			if( suspectRoleAssignOffcode!=null ){
				request.setAttribute("suspectRoleAssignOffcode", suspectRoleAssignOffcode);
			}else{
				formHandler.setFormMessage("Error : Not Found with id "+ id );
			}
		}
		forward("?page=/web/suspectRoleAssignOffcodeEdit.jsp");
	}
	public void update(HttpServletRequest request,HttpServletResponse response)throws Exception {
		SuspectRoleAssignOffcode suspectRoleAssignOffcode = new SuspectRoleAssignOffcode(db);
		bindForm(suspectRoleAssignOffcode);
		suspectRoleAssignOffcode = suspectRoleAssignOffcode.update();
		if( suspectRoleAssignOffcode!=null ){
			request.setAttribute("suspectRoleAssignOffcode", suspectRoleAssignOffcode);
			formHandler.setFormMessage("Update Completed");
		}else{
			formHandler.setFormMessage("Update Failed");
		}
		forward("?page=/web/suspectRoleAssignOffcodeEdit.jsp");
	}

	// delete
	public void delete(HttpServletRequest request,HttpServletResponse response)throws Exception {
		String[] ids =  request.getParameterValues("id");
		if( ids!=null && ids.length>0 ){
			SuspectRoleAssignOffcode suspectRoleAssignOffcode = new SuspectRoleAssignOffcode(db);
			List<Long> idList = new ArrayList<Long>();
			for( int i=0;i<ids.length;i++ )
				idList.add(new Long(ids[i]));
			int deleteRow = suspectRoleAssignOffcode.deleteByPks(idList);
			formHandler.setFormMessage(" Delete "+deleteRow+" Row Completed ");
		}else{
			formHandler.setFormMessage("Plese Select At Least One For Delete");
		}
		redirect("process2?action=SuspectRoleAssignOffcode&cmd=list");
	}
}