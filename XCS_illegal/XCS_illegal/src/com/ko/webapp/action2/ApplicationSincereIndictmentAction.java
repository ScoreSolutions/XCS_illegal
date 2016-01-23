








 

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
import com.ko.domain.ApplicationSincereIndictment;

public class ApplicationSincereIndictmentAction extends BaseAction{
	@Override
	public void _default(HttpServletRequest request, HttpServletResponse response) throws Exception {
		// TODO Auto-generated method stub
	}
	// list
	public void list(HttpServletRequest request,HttpServletResponse response)throws Exception {
		ApplicationSincereIndictment applicationSincereIndictment =new ApplicationSincereIndictment(db);
		// pageUtil.setPageSize(15);
		Integer totalRow = applicationSincereIndictment.countAll();

		// set TotalRow
		pageUtil.setTotalRow(totalRow);
		List<ApplicationSincereIndictment> applicationSincereIndictments = applicationSincereIndictment.findAll(pageUtil);

		//	for data to display
		request.setAttribute("applicationSincereIndictments", applicationSincereIndictments);

		//	for screen to show
		forward("?page=/web/applicationSincereIndictmentList.jsp");
	}

	//	 create
	public void add(HttpServletRequest request,HttpServletResponse response)throws Exception {
		forward("?page=/web/applicationSincereIndictmentCreate.jsp");
	}
	public void create(HttpServletRequest request,HttpServletResponse response)throws Exception {
		ApplicationSincereIndictment applicationSincereIndictment = new ApplicationSincereIndictment(db);
		bindForm(applicationSincereIndictment);
		applicationSincereIndictment = applicationSincereIndictment.create();
		if( applicationSincereIndictment!= null )
			formHandler.setFormMessage("Create Completed ,view <a href='process2?action=ApplicationSincereIndictment&cmd=view&id="+applicationSincereIndictment.getId()+"' target='_blank'>new Record</a>");
		else
			formHandler.setFormMessage("Create Not Complete");
		redirect("process2?action=ApplicationSincereIndictment&cmd=add");
	}

	// view
	public void view(HttpServletRequest request,HttpServletResponse response)throws Exception {
		String id =  request.getParameter("id");
		if( id!=null && !id.trim().equals("") ){
			ApplicationSincereIndictment applicationSincereIndictment = new ApplicationSincereIndictment(db);
			applicationSincereIndictment = applicationSincereIndictment.findByPk(new Long(id));
			if( applicationSincereIndictment!=null ){
				request.setAttribute("applicationSincereIndictment", applicationSincereIndictment);
			}else{
				formHandler.setFormMessage("Error : Not Found with id "+ id );
			}
		}else{
			formHandler.setFormMessage("Error : Please Enter id");
		}
		forward("?page=/web/applicationSincereIndictmentView.jsp");
	}

	// update
	public void edit(HttpServletRequest request,HttpServletResponse response)throws Exception {
		String id =  request.getParameter("id");
		if( id!=null && !id.trim().equals("") ){
			ApplicationSincereIndictment applicationSincereIndictment =new ApplicationSincereIndictment(db);
			applicationSincereIndictment = applicationSincereIndictment.findByPk(new Long(id));
			if( applicationSincereIndictment!=null ){
				request.setAttribute("applicationSincereIndictment", applicationSincereIndictment);
			}else{
				formHandler.setFormMessage("Error : Not Found with id "+ id );
			}
		}
		forward("?page=/web/applicationSincereIndictmentEdit.jsp");
	}
	public void update(HttpServletRequest request,HttpServletResponse response)throws Exception {
		ApplicationSincereIndictment applicationSincereIndictment = new ApplicationSincereIndictment(db);
		bindForm(applicationSincereIndictment);
		applicationSincereIndictment = applicationSincereIndictment.update();
		if( applicationSincereIndictment!=null ){
			request.setAttribute("applicationSincereIndictment", applicationSincereIndictment);
			formHandler.setFormMessage("Update Completed");
		}else{
			formHandler.setFormMessage("Update Failed");
		}
		forward("?page=/web/applicationSincereIndictmentEdit.jsp");
	}

	// delete
	public void delete(HttpServletRequest request,HttpServletResponse response)throws Exception {
		String[] ids =  request.getParameterValues("id");
		if( ids!=null && ids.length>0 ){
			ApplicationSincereIndictment applicationSincereIndictment = new ApplicationSincereIndictment(db);
			List<Long> idList = new ArrayList<Long>();
			for( int i=0;i<ids.length;i++ )
				idList.add(new Long(ids[i]));
			int deleteRow = applicationSincereIndictment.deleteByPks(idList);
			formHandler.setFormMessage(" Delete "+deleteRow+" Row Completed ");
		}else{
			formHandler.setFormMessage("Plese Select At Least One For Delete");
		}
		redirect("process2?action=ApplicationSincereIndictment&cmd=list");
	}
}