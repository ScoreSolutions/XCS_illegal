








 

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
import com.ko.domain.ApplicationSincereConfirm;

public class ApplicationSincereConfirmAction extends BaseAction{
	@Override
	public void _default(HttpServletRequest request, HttpServletResponse response) throws Exception {
		// TODO Auto-generated method stub
	}
	// list
	public void list(HttpServletRequest request,HttpServletResponse response)throws Exception {
		ApplicationSincereConfirm applicationSincereConfirm =new ApplicationSincereConfirm(db);
		// pageUtil.setPageSize(15);
		Integer totalRow = applicationSincereConfirm.countAll();

		// set TotalRow
		pageUtil.setTotalRow(totalRow);
		List<ApplicationSincereConfirm> applicationSincereConfirms = applicationSincereConfirm.findAll(pageUtil);

		//	for data to display
		request.setAttribute("applicationSincereConfirms", applicationSincereConfirms);

		//	for screen to show
		forward("?page=/web/applicationSincereConfirmList.jsp");
	}

	//	 create
	public void add(HttpServletRequest request,HttpServletResponse response)throws Exception {
		forward("?page=/web/applicationSincereConfirmCreate.jsp");
	}
	public void create(HttpServletRequest request,HttpServletResponse response)throws Exception {
		ApplicationSincereConfirm applicationSincereConfirm = new ApplicationSincereConfirm(db);
		bindForm(applicationSincereConfirm);
		applicationSincereConfirm = applicationSincereConfirm.create();
		if( applicationSincereConfirm!= null )
			formHandler.setFormMessage("Create Completed ,view <a href='process2?action=ApplicationSincereConfirm&cmd=view&id="+applicationSincereConfirm.getId()+"' target='_blank'>new Record</a>");
		else
			formHandler.setFormMessage("Create Not Complete");
		redirect("process2?action=ApplicationSincereConfirm&cmd=add");
	}

	// view
	public void view(HttpServletRequest request,HttpServletResponse response)throws Exception {
		String id =  request.getParameter("id");
		if( id!=null && !id.trim().equals("") ){
			ApplicationSincereConfirm applicationSincereConfirm = new ApplicationSincereConfirm(db);
			applicationSincereConfirm = applicationSincereConfirm.findByPk(new Long(id));
			if( applicationSincereConfirm!=null ){
				request.setAttribute("applicationSincereConfirm", applicationSincereConfirm);
			}else{
				formHandler.setFormMessage("Error : Not Found with id "+ id );
			}
		}else{
			formHandler.setFormMessage("Error : Please Enter id");
		}
		forward("?page=/web/applicationSincereConfirmView.jsp");
	}

	// update
	public void edit(HttpServletRequest request,HttpServletResponse response)throws Exception {
		String id =  request.getParameter("id");
		if( id!=null && !id.trim().equals("") ){
			ApplicationSincereConfirm applicationSincereConfirm =new ApplicationSincereConfirm(db);
			applicationSincereConfirm = applicationSincereConfirm.findByPk(new Long(id));
			if( applicationSincereConfirm!=null ){
				request.setAttribute("applicationSincereConfirm", applicationSincereConfirm);
			}else{
				formHandler.setFormMessage("Error : Not Found with id "+ id );
			}
		}
		forward("?page=/web/applicationSincereConfirmEdit.jsp");
	}
	public void update(HttpServletRequest request,HttpServletResponse response)throws Exception {
		ApplicationSincereConfirm applicationSincereConfirm = new ApplicationSincereConfirm(db);
		bindForm(applicationSincereConfirm);
		applicationSincereConfirm = applicationSincereConfirm.update();
		if( applicationSincereConfirm!=null ){
			request.setAttribute("applicationSincereConfirm", applicationSincereConfirm);
			formHandler.setFormMessage("Update Completed");
		}else{
			formHandler.setFormMessage("Update Failed");
		}
		forward("?page=/web/applicationSincereConfirmEdit.jsp");
	}

	// delete
	public void delete(HttpServletRequest request,HttpServletResponse response)throws Exception {
		String[] ids =  request.getParameterValues("id");
		if( ids!=null && ids.length>0 ){
			ApplicationSincereConfirm applicationSincereConfirm = new ApplicationSincereConfirm(db);
			List<Long> idList = new ArrayList<Long>();
			for( int i=0;i<ids.length;i++ )
				idList.add(new Long(ids[i]));
			int deleteRow = applicationSincereConfirm.deleteByPks(idList);
			formHandler.setFormMessage(" Delete "+deleteRow+" Row Completed ");
		}else{
			formHandler.setFormMessage("Plese Select At Least One For Delete");
		}
		redirect("process2?action=ApplicationSincereConfirm&cmd=list");
	}
}