








 

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
import com.ko.domain.ApplicationSearchWarrant;

public class ApplicationSearchWarrantAction extends BaseAction{
	@Override
	public void _default(HttpServletRequest request, HttpServletResponse response) throws Exception {
		// TODO Auto-generated method stub
	}
	// list
	public void list(HttpServletRequest request,HttpServletResponse response)throws Exception {
		ApplicationSearchWarrant applicationSearchWarrant =new ApplicationSearchWarrant(db);
		// pageUtil.setPageSize(15);
		Integer totalRow = applicationSearchWarrant.countAll();

		// set TotalRow
		pageUtil.setTotalRow(totalRow);
		List<ApplicationSearchWarrant> applicationSearchWarrants = applicationSearchWarrant.findAll(pageUtil);

		//	for data to display
		request.setAttribute("applicationSearchWarrants", applicationSearchWarrants);

		//	for screen to show
		forward("?page=/web/applicationSearchWarrantList.jsp");
	}

	//	 create
	public void add(HttpServletRequest request,HttpServletResponse response)throws Exception {
		forward("?page=/web/applicationSearchWarrantCreate.jsp");
	}
	public void create(HttpServletRequest request,HttpServletResponse response)throws Exception {
		ApplicationSearchWarrant applicationSearchWarrant = new ApplicationSearchWarrant(db);
		bindForm(applicationSearchWarrant);
		applicationSearchWarrant = applicationSearchWarrant.create();
		if( applicationSearchWarrant!= null )
			formHandler.setFormMessage("Create Completed ,view <a href='process2?action=ApplicationSearchWarrant&cmd=view&id="+applicationSearchWarrant.getId()+"' target='_blank'>new Record</a>");
		else
			formHandler.setFormMessage("Create Not Complete");
		redirect("process2?action=ApplicationSearchWarrant&cmd=add");
	}

	// view
	public void view(HttpServletRequest request,HttpServletResponse response)throws Exception {
		String id =  request.getParameter("id");
		if( id!=null && !id.trim().equals("") ){
			ApplicationSearchWarrant applicationSearchWarrant = new ApplicationSearchWarrant(db);
			applicationSearchWarrant = applicationSearchWarrant.findByPk(new Long(id));
			if( applicationSearchWarrant!=null ){
				request.setAttribute("applicationSearchWarrant", applicationSearchWarrant);
			}else{
				formHandler.setFormMessage("Error : Not Found with id "+ id );
			}
		}else{
			formHandler.setFormMessage("Error : Please Enter id");
		}
		forward("?page=/web/applicationSearchWarrantView.jsp");
	}

	// update
	public void edit(HttpServletRequest request,HttpServletResponse response)throws Exception {
		String id =  request.getParameter("id");
		if( id!=null && !id.trim().equals("") ){
			ApplicationSearchWarrant applicationSearchWarrant =new ApplicationSearchWarrant(db);
			applicationSearchWarrant = applicationSearchWarrant.findByPk(new Long(id));
			if( applicationSearchWarrant!=null ){
				request.setAttribute("applicationSearchWarrant", applicationSearchWarrant);
			}else{
				formHandler.setFormMessage("Error : Not Found with id "+ id );
			}
		}
		forward("?page=/web/applicationSearchWarrantEdit.jsp");
	}
	public void update(HttpServletRequest request,HttpServletResponse response)throws Exception {
		ApplicationSearchWarrant applicationSearchWarrant = new ApplicationSearchWarrant(db);
		bindForm(applicationSearchWarrant);
		applicationSearchWarrant = applicationSearchWarrant.update();
		if( applicationSearchWarrant!=null ){
			request.setAttribute("applicationSearchWarrant", applicationSearchWarrant);
			formHandler.setFormMessage("Update Completed");
		}else{
			formHandler.setFormMessage("Update Failed");
		}
		forward("?page=/web/applicationSearchWarrantEdit.jsp");
	}

	// delete
	public void delete(HttpServletRequest request,HttpServletResponse response)throws Exception {
		String[] ids =  request.getParameterValues("id");
		if( ids!=null && ids.length>0 ){
			ApplicationSearchWarrant applicationSearchWarrant = new ApplicationSearchWarrant(db);
			List<Long> idList = new ArrayList<Long>();
			for( int i=0;i<ids.length;i++ )
				idList.add(new Long(ids[i]));
			int deleteRow = applicationSearchWarrant.deleteByPks(idList);
			formHandler.setFormMessage(" Delete "+deleteRow+" Row Completed ");
		}else{
			formHandler.setFormMessage("Plese Select At Least One For Delete");
		}
		redirect("process2?action=ApplicationSearchWarrant&cmd=list");
	}
}