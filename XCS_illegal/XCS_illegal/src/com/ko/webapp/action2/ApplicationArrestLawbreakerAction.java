








 

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
import com.ko.domain.ApplicationArrestLawbreaker;

public class ApplicationArrestLawbreakerAction extends BaseAction{
	@Override
	public void _default(HttpServletRequest request, HttpServletResponse response) throws Exception {
		// TODO Auto-generated method stub
	}
	// list
	public void list(HttpServletRequest request,HttpServletResponse response)throws Exception {
		ApplicationArrestLawbreaker applicationArrestLawbreaker =new ApplicationArrestLawbreaker(db);
		// pageUtil.setPageSize(15);
		Integer totalRow = applicationArrestLawbreaker.countAll();

		// set TotalRow
		pageUtil.setTotalRow(totalRow);
		List<ApplicationArrestLawbreaker> applicationArrestLawbreakers = applicationArrestLawbreaker.findAll(pageUtil);

		//	for data to display
		request.setAttribute("applicationArrestLawbreakers", applicationArrestLawbreakers);

		//	for screen to show
		forward("?page=/web/applicationArrestLawbreakerList.jsp");
	}

	//	 create
	public void add(HttpServletRequest request,HttpServletResponse response)throws Exception {
		forward("?page=/web/applicationArrestLawbreakerCreate.jsp");
	}
	public void create(HttpServletRequest request,HttpServletResponse response)throws Exception {
		ApplicationArrestLawbreaker applicationArrestLawbreaker = new ApplicationArrestLawbreaker(db);
		bindForm(applicationArrestLawbreaker);
		applicationArrestLawbreaker = applicationArrestLawbreaker.create();
		if( applicationArrestLawbreaker!= null )
			formHandler.setFormMessage("Create Completed ,view <a href='process2?action=ApplicationArrestLawbreaker&cmd=view&id="+applicationArrestLawbreaker.getId()+"' target='_blank'>new Record</a>");
		else
			formHandler.setFormMessage("Create Not Complete");
		redirect("process2?action=ApplicationArrestLawbreaker&cmd=add");
	}

	// view
	public void view(HttpServletRequest request,HttpServletResponse response)throws Exception {
		String id =  request.getParameter("id");
		if( id!=null && !id.trim().equals("") ){
			ApplicationArrestLawbreaker applicationArrestLawbreaker = new ApplicationArrestLawbreaker(db);
			applicationArrestLawbreaker = applicationArrestLawbreaker.findByPk(new Long(id));
			if( applicationArrestLawbreaker!=null ){
				request.setAttribute("applicationArrestLawbreaker", applicationArrestLawbreaker);
			}else{
				formHandler.setFormMessage("Error : Not Found with id "+ id );
			}
		}else{
			formHandler.setFormMessage("Error : Please Enter id");
		}
		forward("?page=/web/applicationArrestLawbreakerView.jsp");
	}

	// update
	public void edit(HttpServletRequest request,HttpServletResponse response)throws Exception {
		String id =  request.getParameter("id");
		if( id!=null && !id.trim().equals("") ){
			ApplicationArrestLawbreaker applicationArrestLawbreaker =new ApplicationArrestLawbreaker(db);
			applicationArrestLawbreaker = applicationArrestLawbreaker.findByPk(new Long(id));
			if( applicationArrestLawbreaker!=null ){
				request.setAttribute("applicationArrestLawbreaker", applicationArrestLawbreaker);
			}else{
				formHandler.setFormMessage("Error : Not Found with id "+ id );
			}
		}
		forward("?page=/web/applicationArrestLawbreakerEdit.jsp");
	}
	public void update(HttpServletRequest request,HttpServletResponse response)throws Exception {
		ApplicationArrestLawbreaker applicationArrestLawbreaker = new ApplicationArrestLawbreaker(db);
		bindForm(applicationArrestLawbreaker);
		applicationArrestLawbreaker = applicationArrestLawbreaker.update();
		if( applicationArrestLawbreaker!=null ){
			request.setAttribute("applicationArrestLawbreaker", applicationArrestLawbreaker);
			formHandler.setFormMessage("Update Completed");
		}else{
			formHandler.setFormMessage("Update Failed");
		}
		forward("?page=/web/applicationArrestLawbreakerEdit.jsp");
	}

	// delete
	public void delete(HttpServletRequest request,HttpServletResponse response)throws Exception {
		String[] ids =  request.getParameterValues("id");
		if( ids!=null && ids.length>0 ){
			ApplicationArrestLawbreaker applicationArrestLawbreaker = new ApplicationArrestLawbreaker(db);
			List<Long> idList = new ArrayList<Long>();
			for( int i=0;i<ids.length;i++ )
				idList.add(new Long(ids[i]));
			int deleteRow = applicationArrestLawbreaker.deleteByPks(idList);
			formHandler.setFormMessage(" Delete "+deleteRow+" Row Completed ");
		}else{
			formHandler.setFormMessage("Plese Select At Least One For Delete");
		}
		redirect("process2?action=ApplicationArrestLawbreaker&cmd=list");
	}
}