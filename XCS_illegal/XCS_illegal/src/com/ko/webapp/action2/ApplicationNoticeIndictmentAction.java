








 

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
import com.ko.domain.ApplicationNoticeIndictment;

public class ApplicationNoticeIndictmentAction extends BaseAction{
	@Override
	public void _default(HttpServletRequest request, HttpServletResponse response) throws Exception {
		// TODO Auto-generated method stub
	}
	// list
	public void list(HttpServletRequest request,HttpServletResponse response)throws Exception {
		ApplicationNoticeIndictment applicationNoticeIndictment =new ApplicationNoticeIndictment(db);
		// pageUtil.setPageSize(15);
		Integer totalRow = applicationNoticeIndictment.countAll();

		// set TotalRow
		pageUtil.setTotalRow(totalRow);
		List<ApplicationNoticeIndictment> applicationNoticeIndictments = applicationNoticeIndictment.findAll(pageUtil);

		//	for data to display
		request.setAttribute("applicationNoticeIndictments", applicationNoticeIndictments);

		//	for screen to show
		forward("?page=/web/applicationNoticeIndictmentList.jsp");
	}

	//	 create
	public void add(HttpServletRequest request,HttpServletResponse response)throws Exception {
		forward("?page=/web/applicationNoticeIndictmentCreate.jsp");
	}
	public void create(HttpServletRequest request,HttpServletResponse response)throws Exception {
		ApplicationNoticeIndictment applicationNoticeIndictment = new ApplicationNoticeIndictment(db);
		bindForm(applicationNoticeIndictment);
		applicationNoticeIndictment = applicationNoticeIndictment.create();
		if( applicationNoticeIndictment!= null )
			formHandler.setFormMessage("Create Completed ,view <a href='process2?action=ApplicationNoticeIndictment&cmd=view&id="+applicationNoticeIndictment.getId()+"' target='_blank'>new Record</a>");
		else
			formHandler.setFormMessage("Create Not Complete");
		redirect("process2?action=ApplicationNoticeIndictment&cmd=add");
	}

	// view
	public void view(HttpServletRequest request,HttpServletResponse response)throws Exception {
		String id =  request.getParameter("id");
		if( id!=null && !id.trim().equals("") ){
			ApplicationNoticeIndictment applicationNoticeIndictment = new ApplicationNoticeIndictment(db);
			applicationNoticeIndictment = applicationNoticeIndictment.findByPk(new Long(id));
			if( applicationNoticeIndictment!=null ){
				request.setAttribute("applicationNoticeIndictment", applicationNoticeIndictment);
			}else{
				formHandler.setFormMessage("Error : Not Found with id "+ id );
			}
		}else{
			formHandler.setFormMessage("Error : Please Enter id");
		}
		forward("?page=/web/applicationNoticeIndictmentView.jsp");
	}

	// update
	public void edit(HttpServletRequest request,HttpServletResponse response)throws Exception {
		String id =  request.getParameter("id");
		if( id!=null && !id.trim().equals("") ){
			ApplicationNoticeIndictment applicationNoticeIndictment =new ApplicationNoticeIndictment(db);
			applicationNoticeIndictment = applicationNoticeIndictment.findByPk(new Long(id));
			if( applicationNoticeIndictment!=null ){
				request.setAttribute("applicationNoticeIndictment", applicationNoticeIndictment);
			}else{
				formHandler.setFormMessage("Error : Not Found with id "+ id );
			}
		}
		forward("?page=/web/applicationNoticeIndictmentEdit.jsp");
	}
	public void update(HttpServletRequest request,HttpServletResponse response)throws Exception {
		ApplicationNoticeIndictment applicationNoticeIndictment = new ApplicationNoticeIndictment(db);
		bindForm(applicationNoticeIndictment);
		applicationNoticeIndictment = applicationNoticeIndictment.update();
		if( applicationNoticeIndictment!=null ){
			request.setAttribute("applicationNoticeIndictment", applicationNoticeIndictment);
			formHandler.setFormMessage("Update Completed");
		}else{
			formHandler.setFormMessage("Update Failed");
		}
		forward("?page=/web/applicationNoticeIndictmentEdit.jsp");
	}

	// delete
	public void delete(HttpServletRequest request,HttpServletResponse response)throws Exception {
		String[] ids =  request.getParameterValues("id");
		if( ids!=null && ids.length>0 ){
			ApplicationNoticeIndictment applicationNoticeIndictment = new ApplicationNoticeIndictment(db);
			List<Long> idList = new ArrayList<Long>();
			for( int i=0;i<ids.length;i++ )
				idList.add(new Long(ids[i]));
			int deleteRow = applicationNoticeIndictment.deleteByPks(idList);
			formHandler.setFormMessage(" Delete "+deleteRow+" Row Completed ");
		}else{
			formHandler.setFormMessage("Plese Select At Least One For Delete");
		}
		redirect("process2?action=ApplicationNoticeIndictment&cmd=list");
	}
}