








 

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
import com.ko.domain.SuspectRoleAssign;

public class SuspectRoleAssignAction extends BaseAction{
	@Override
	public void _default(HttpServletRequest request, HttpServletResponse response) throws Exception {
		// TODO Auto-generated method stub
	}
	// list
	public void list(HttpServletRequest request,HttpServletResponse response)throws Exception {
		SuspectRoleAssign suspectRoleAssign =new SuspectRoleAssign(db);
		// pageUtil.setPageSize(15);
		Integer totalRow = suspectRoleAssign.countAll();

		// set TotalRow
		pageUtil.setTotalRow(totalRow);
		List<SuspectRoleAssign> suspectRoleAssigns = suspectRoleAssign.findAll(pageUtil);

		//	for data to display
		request.setAttribute("suspectRoleAssigns", suspectRoleAssigns);

		//	for screen to show
		forward("?page=/web/suspectRoleAssignList.jsp");
	}

	//	 create
	public void add(HttpServletRequest request,HttpServletResponse response)throws Exception {
		forward("?page=/web/suspectRoleAssignCreate.jsp");
	}
	public void create(HttpServletRequest request,HttpServletResponse response)throws Exception {
		SuspectRoleAssign suspectRoleAssign = new SuspectRoleAssign(db);
		bindForm(suspectRoleAssign);
		suspectRoleAssign = suspectRoleAssign.create();
		if( suspectRoleAssign!= null )
			formHandler.setFormMessage("Create Completed ,view <a href='process2?action=SuspectRoleAssign&cmd=view&id="+suspectRoleAssign.getId()+"' target='_blank'>new Record</a>");
		else
			formHandler.setFormMessage("Create Not Complete");
		redirect("process2?action=SuspectRoleAssign&cmd=add");
	}

	// view
	public void view(HttpServletRequest request,HttpServletResponse response)throws Exception {
		String id =  request.getParameter("id");
		if( id!=null && !id.trim().equals("") ){
			SuspectRoleAssign suspectRoleAssign = new SuspectRoleAssign(db);
			suspectRoleAssign = suspectRoleAssign.findByPk(new Long(id));
			if( suspectRoleAssign!=null ){
				request.setAttribute("suspectRoleAssign", suspectRoleAssign);
			}else{
				formHandler.setFormMessage("Error : Not Found with id "+ id );
			}
		}else{
			formHandler.setFormMessage("Error : Please Enter id");
		}
		forward("?page=/web/suspectRoleAssignView.jsp");
	}

	// update
	public void edit(HttpServletRequest request,HttpServletResponse response)throws Exception {
		String id =  request.getParameter("id");
		if( id!=null && !id.trim().equals("") ){
			SuspectRoleAssign suspectRoleAssign =new SuspectRoleAssign(db);
			suspectRoleAssign = suspectRoleAssign.findByPk(new Long(id));
			if( suspectRoleAssign!=null ){
				request.setAttribute("suspectRoleAssign", suspectRoleAssign);
			}else{
				formHandler.setFormMessage("Error : Not Found with id "+ id );
			}
		}
		forward("?page=/web/suspectRoleAssignEdit.jsp");
	}
	public void update(HttpServletRequest request,HttpServletResponse response)throws Exception {
		SuspectRoleAssign suspectRoleAssign = new SuspectRoleAssign(db);
		bindForm(suspectRoleAssign);
		suspectRoleAssign = suspectRoleAssign.update();
		if( suspectRoleAssign!=null ){
			request.setAttribute("suspectRoleAssign", suspectRoleAssign);
			formHandler.setFormMessage("Update Completed");
		}else{
			formHandler.setFormMessage("Update Failed");
		}
		forward("?page=/web/suspectRoleAssignEdit.jsp");
	}

	// delete
	public void delete(HttpServletRequest request,HttpServletResponse response)throws Exception {
		String[] ids =  request.getParameterValues("id");
		if( ids!=null && ids.length>0 ){
			SuspectRoleAssign suspectRoleAssign = new SuspectRoleAssign(db);
			List<Long> idList = new ArrayList<Long>();
			for( int i=0;i<ids.length;i++ )
				idList.add(new Long(ids[i]));
			int deleteRow = suspectRoleAssign.deleteByPks(idList);
			formHandler.setFormMessage(" Delete "+deleteRow+" Row Completed ");
		}else{
			formHandler.setFormMessage("Plese Select At Least One For Delete");
		}
		redirect("process2?action=SuspectRoleAssign&cmd=list");
	}
}