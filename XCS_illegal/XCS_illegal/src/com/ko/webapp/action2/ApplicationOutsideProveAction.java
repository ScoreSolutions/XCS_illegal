








 

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
import com.ko.domain.ApplicationOutsideProve;

public class ApplicationOutsideProveAction extends BaseAction{
	@Override
	public void _default(HttpServletRequest request, HttpServletResponse response) throws Exception {
		// TODO Auto-generated method stub
	}
	// list
	public void list(HttpServletRequest request,HttpServletResponse response)throws Exception {
		ApplicationOutsideProve applicationOutsideProve =new ApplicationOutsideProve(db);
		// pageUtil.setPageSize(15);
		Integer totalRow = applicationOutsideProve.countAll();

		// set TotalRow
		pageUtil.setTotalRow(totalRow);
		List<ApplicationOutsideProve> applicationOutsideProves = applicationOutsideProve.findAll(pageUtil);

		//	for data to display
		request.setAttribute("applicationOutsideProves", applicationOutsideProves);

		//	for screen to show
		forward("?page=/web/applicationOutsideProveList.jsp");
	}

	//	 create
	public void add(HttpServletRequest request,HttpServletResponse response)throws Exception {
		forward("?page=/web/applicationOutsideProveCreate.jsp");
	}
	public void create(HttpServletRequest request,HttpServletResponse response)throws Exception {
		ApplicationOutsideProve applicationOutsideProve = new ApplicationOutsideProve(db);
		bindForm(applicationOutsideProve);
		applicationOutsideProve = applicationOutsideProve.create();
		if( applicationOutsideProve!= null )
			formHandler.setFormMessage("Create Completed ,view <a href='process2?action=ApplicationOutsideProve&cmd=view&id="+applicationOutsideProve.getId()+"' target='_blank'>new Record</a>");
		else
			formHandler.setFormMessage("Create Not Complete");
		redirect("process2?action=ApplicationOutsideProve&cmd=add");
	}

	// view
	public void view(HttpServletRequest request,HttpServletResponse response)throws Exception {
		String id =  request.getParameter("id");
		if( id!=null && !id.trim().equals("") ){
			ApplicationOutsideProve applicationOutsideProve = new ApplicationOutsideProve(db);
			applicationOutsideProve = applicationOutsideProve.findByPk(new Long(id));
			if( applicationOutsideProve!=null ){
				request.setAttribute("applicationOutsideProve", applicationOutsideProve);
			}else{
				formHandler.setFormMessage("Error : Not Found with id "+ id );
			}
		}else{
			formHandler.setFormMessage("Error : Please Enter id");
		}
		forward("?page=/web/applicationOutsideProveView.jsp");
	}

	// update
	public void edit(HttpServletRequest request,HttpServletResponse response)throws Exception {
		String id =  request.getParameter("id");
		if( id!=null && !id.trim().equals("") ){
			ApplicationOutsideProve applicationOutsideProve =new ApplicationOutsideProve(db);
			applicationOutsideProve = applicationOutsideProve.findByPk(new Long(id));
			if( applicationOutsideProve!=null ){
				request.setAttribute("applicationOutsideProve", applicationOutsideProve);
			}else{
				formHandler.setFormMessage("Error : Not Found with id "+ id );
			}
		}
		forward("?page=/web/applicationOutsideProveEdit.jsp");
	}
	public void update(HttpServletRequest request,HttpServletResponse response)throws Exception {
		ApplicationOutsideProve applicationOutsideProve = new ApplicationOutsideProve(db);
		bindForm(applicationOutsideProve);
		applicationOutsideProve = applicationOutsideProve.update();
		if( applicationOutsideProve!=null ){
			request.setAttribute("applicationOutsideProve", applicationOutsideProve);
			formHandler.setFormMessage("Update Completed");
		}else{
			formHandler.setFormMessage("Update Failed");
		}
		forward("?page=/web/applicationOutsideProveEdit.jsp");
	}

	// delete
	public void delete(HttpServletRequest request,HttpServletResponse response)throws Exception {
		String[] ids =  request.getParameterValues("id");
		if( ids!=null && ids.length>0 ){
			ApplicationOutsideProve applicationOutsideProve = new ApplicationOutsideProve(db);
			List<Long> idList = new ArrayList<Long>();
			for( int i=0;i<ids.length;i++ )
				idList.add(new Long(ids[i]));
			int deleteRow = applicationOutsideProve.deleteByPks(idList);
			formHandler.setFormMessage(" Delete "+deleteRow+" Row Completed ");
		}else{
			formHandler.setFormMessage("Plese Select At Least One For Delete");
		}
		redirect("process2?action=ApplicationOutsideProve&cmd=list");
	}
}