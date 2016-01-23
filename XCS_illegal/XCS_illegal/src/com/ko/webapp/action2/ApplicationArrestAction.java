








 

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
import com.ko.domain.ApplicationArrest;

public class ApplicationArrestAction extends BaseAction{
	@Override
	public void _default(HttpServletRequest request, HttpServletResponse response) throws Exception {
		// TODO Auto-generated method stub
	}
	// list
	public void list(HttpServletRequest request,HttpServletResponse response)throws Exception {
		ApplicationArrest applicationArrest =new ApplicationArrest(db);
		// pageUtil.setPageSize(15);
		Integer totalRow = applicationArrest.countAll();

		// set TotalRow
		pageUtil.setTotalRow(totalRow);
		List<ApplicationArrest> applicationArrests = applicationArrest.findAll(pageUtil);

		//	for data to display
		request.setAttribute("applicationArrests", applicationArrests);

		//	for screen to show
		forward("?page=/web/applicationArrestList.jsp");
	}

	//	 create
	public void add(HttpServletRequest request,HttpServletResponse response)throws Exception {
		forward("?page=/web/applicationArrestCreate.jsp");
	}
	public void create(HttpServletRequest request,HttpServletResponse response)throws Exception {
		ApplicationArrest applicationArrest = new ApplicationArrest(db);
		bindForm(applicationArrest);
		applicationArrest = applicationArrest.create();
		if( applicationArrest!= null )
			formHandler.setFormMessage("Create Completed ,view <a href='process2?action=ApplicationArrest&cmd=view&id="+applicationArrest.getId()+"' target='_blank'>new Record</a>");
		else
			formHandler.setFormMessage("Create Not Complete");
		redirect("process2?action=ApplicationArrest&cmd=add");
	}

	// view
	public void view(HttpServletRequest request,HttpServletResponse response)throws Exception {
		String id =  request.getParameter("id");
		if( id!=null && !id.trim().equals("") ){
			ApplicationArrest applicationArrest = new ApplicationArrest(db);
			applicationArrest = applicationArrest.findByPk(new Long(id));
			if( applicationArrest!=null ){
				request.setAttribute("applicationArrest", applicationArrest);
			}else{
				formHandler.setFormMessage("Error : Not Found with id "+ id );
			}
		}else{
			formHandler.setFormMessage("Error : Please Enter id");
		}
		forward("?page=/web/applicationArrestView.jsp");
	}

	// update
	public void edit(HttpServletRequest request,HttpServletResponse response)throws Exception {
		String id =  request.getParameter("id");
		if( id!=null && !id.trim().equals("") ){
			ApplicationArrest applicationArrest =new ApplicationArrest(db);
			applicationArrest = applicationArrest.findByPk(new Long(id));
			if( applicationArrest!=null ){
				request.setAttribute("applicationArrest", applicationArrest);
			}else{
				formHandler.setFormMessage("Error : Not Found with id "+ id );
			}
		}
		forward("?page=/web/applicationArrestEdit.jsp");
	}
	public void update(HttpServletRequest request,HttpServletResponse response)throws Exception {
		ApplicationArrest applicationArrest = new ApplicationArrest(db);
		bindForm(applicationArrest);
		applicationArrest = applicationArrest.update();
		if( applicationArrest!=null ){
			request.setAttribute("applicationArrest", applicationArrest);
			formHandler.setFormMessage("Update Completed");
		}else{
			formHandler.setFormMessage("Update Failed");
		}
		forward("?page=/web/applicationArrestEdit.jsp");
	}

	// delete
	public void delete(HttpServletRequest request,HttpServletResponse response)throws Exception {
		String[] ids =  request.getParameterValues("id");
		if( ids!=null && ids.length>0 ){
			ApplicationArrest applicationArrest = new ApplicationArrest(db);
			List<Long> idList = new ArrayList<Long>();
			for( int i=0;i<ids.length;i++ )
				idList.add(new Long(ids[i]));
			int deleteRow = applicationArrest.deleteByPks(idList);
			formHandler.setFormMessage(" Delete "+deleteRow+" Row Completed ");
		}else{
			formHandler.setFormMessage("Plese Select At Least One For Delete");
		}
		redirect("process2?action=ApplicationArrest&cmd=list");
	}
}