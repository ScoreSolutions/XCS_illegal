








 

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
import com.ko.domain.ApplicationArrestIndictment;

public class ApplicationArrestIndictmentAction extends BaseAction{
	@Override
	public void _default(HttpServletRequest request, HttpServletResponse response) throws Exception {
		// TODO Auto-generated method stub
	}
	// list
	public void list(HttpServletRequest request,HttpServletResponse response)throws Exception {
		ApplicationArrestIndictment applicationArrestIndictment =new ApplicationArrestIndictment(db);
		// pageUtil.setPageSize(15);
		Integer totalRow = applicationArrestIndictment.countAll();

		// set TotalRow
		pageUtil.setTotalRow(totalRow);
		List<ApplicationArrestIndictment> applicationArrestIndictments = applicationArrestIndictment.findAll(pageUtil);

		//	for data to display
		request.setAttribute("applicationArrestIndictments", applicationArrestIndictments);

		//	for screen to show
		forward("?page=/web/applicationArrestIndictmentList.jsp");
	}

	//	 create
	public void add(HttpServletRequest request,HttpServletResponse response)throws Exception {
		forward("?page=/web/applicationArrestIndictmentCreate.jsp");
	}
	public void create(HttpServletRequest request,HttpServletResponse response)throws Exception {
		ApplicationArrestIndictment applicationArrestIndictment = new ApplicationArrestIndictment(db);
		bindForm(applicationArrestIndictment);
		applicationArrestIndictment = applicationArrestIndictment.create();
		if( applicationArrestIndictment!= null )
			formHandler.setFormMessage("Create Completed ,view <a href='process2?action=ApplicationArrestIndictment&cmd=view&id="+applicationArrestIndictment.getId()+"' target='_blank'>new Record</a>");
		else
			formHandler.setFormMessage("Create Not Complete");
		redirect("process2?action=ApplicationArrestIndictment&cmd=add");
	}

	// view
	public void view(HttpServletRequest request,HttpServletResponse response)throws Exception {
		String id =  request.getParameter("id");
		if( id!=null && !id.trim().equals("") ){
			ApplicationArrestIndictment applicationArrestIndictment = new ApplicationArrestIndictment(db);
			applicationArrestIndictment = applicationArrestIndictment.findByPk(new Long(id));
			if( applicationArrestIndictment!=null ){
				request.setAttribute("applicationArrestIndictment", applicationArrestIndictment);
			}else{
				formHandler.setFormMessage("Error : Not Found with id "+ id );
			}
		}else{
			formHandler.setFormMessage("Error : Please Enter id");
		}
		forward("?page=/web/applicationArrestIndictmentView.jsp");
	}

	// update
	public void edit(HttpServletRequest request,HttpServletResponse response)throws Exception {
		String id =  request.getParameter("id");
		if( id!=null && !id.trim().equals("") ){
			ApplicationArrestIndictment applicationArrestIndictment =new ApplicationArrestIndictment(db);
			applicationArrestIndictment = applicationArrestIndictment.findByPk(new Long(id));
			if( applicationArrestIndictment!=null ){
				request.setAttribute("applicationArrestIndictment", applicationArrestIndictment);
			}else{
				formHandler.setFormMessage("Error : Not Found with id "+ id );
			}
		}
		forward("?page=/web/applicationArrestIndictmentEdit.jsp");
	}
	public void update(HttpServletRequest request,HttpServletResponse response)throws Exception {
		ApplicationArrestIndictment applicationArrestIndictment = new ApplicationArrestIndictment(db);
		bindForm(applicationArrestIndictment);
		applicationArrestIndictment = applicationArrestIndictment.update();
		if( applicationArrestIndictment!=null ){
			request.setAttribute("applicationArrestIndictment", applicationArrestIndictment);
			formHandler.setFormMessage("Update Completed");
		}else{
			formHandler.setFormMessage("Update Failed");
		}
		forward("?page=/web/applicationArrestIndictmentEdit.jsp");
	}

	// delete
	public void delete(HttpServletRequest request,HttpServletResponse response)throws Exception {
		String[] ids =  request.getParameterValues("id");
		if( ids!=null && ids.length>0 ){
			ApplicationArrestIndictment applicationArrestIndictment = new ApplicationArrestIndictment(db);
			List<Long> idList = new ArrayList<Long>();
			for( int i=0;i<ids.length;i++ )
				idList.add(new Long(ids[i]));
			int deleteRow = applicationArrestIndictment.deleteByPks(idList);
			formHandler.setFormMessage(" Delete "+deleteRow+" Row Completed ");
		}else{
			formHandler.setFormMessage("Plese Select At Least One For Delete");
		}
		redirect("process2?action=ApplicationArrestIndictment&cmd=list");
	}
}