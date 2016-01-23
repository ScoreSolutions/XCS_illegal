








 

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
import com.ko.domain.ApplicationNoticeArrest;

public class ApplicationNoticeArrestAction extends BaseAction{
	@Override
	public void _default(HttpServletRequest request, HttpServletResponse response) throws Exception {
		// TODO Auto-generated method stub
	}
	// list
	public void list(HttpServletRequest request,HttpServletResponse response)throws Exception {
		ApplicationNoticeArrest applicationNoticeArrest =new ApplicationNoticeArrest(db);
		// pageUtil.setPageSize(15);
		Integer totalRow = applicationNoticeArrest.countAll();

		// set TotalRow
		pageUtil.setTotalRow(totalRow);
		List<ApplicationNoticeArrest> applicationNoticeArrests = applicationNoticeArrest.findAll(pageUtil);

		//	for data to display
		request.setAttribute("applicationNoticeArrests", applicationNoticeArrests);

		//	for screen to show
		forward("?page=/web/applicationNoticeArrestList.jsp");
	}

	//	 create
	public void add(HttpServletRequest request,HttpServletResponse response)throws Exception {
		forward("?page=/web/applicationNoticeArrestCreate.jsp");
	}
	public void create(HttpServletRequest request,HttpServletResponse response)throws Exception {
		ApplicationNoticeArrest applicationNoticeArrest = new ApplicationNoticeArrest(db);
		bindForm(applicationNoticeArrest);
		applicationNoticeArrest = applicationNoticeArrest.create();
		if( applicationNoticeArrest!= null )
			formHandler.setFormMessage("Create Completed ,view <a href='process2?action=ApplicationNoticeArrest&cmd=view&id="+applicationNoticeArrest.getId()+"' target='_blank'>new Record</a>");
		else
			formHandler.setFormMessage("Create Not Complete");
		redirect("process2?action=ApplicationNoticeArrest&cmd=add");
	}

	// view
	public void view(HttpServletRequest request,HttpServletResponse response)throws Exception {
		String id =  request.getParameter("id");
		if( id!=null && !id.trim().equals("") ){
			ApplicationNoticeArrest applicationNoticeArrest = new ApplicationNoticeArrest(db);
			applicationNoticeArrest = applicationNoticeArrest.findByPk(new Long(id));
			if( applicationNoticeArrest!=null ){
				request.setAttribute("applicationNoticeArrest", applicationNoticeArrest);
			}else{
				formHandler.setFormMessage("Error : Not Found with id "+ id );
			}
		}else{
			formHandler.setFormMessage("Error : Please Enter id");
		}
		forward("?page=/web/applicationNoticeArrestView.jsp");
	}

	// update
	public void edit(HttpServletRequest request,HttpServletResponse response)throws Exception {
		String id =  request.getParameter("id");
		if( id!=null && !id.trim().equals("") ){
			ApplicationNoticeArrest applicationNoticeArrest =new ApplicationNoticeArrest(db);
			applicationNoticeArrest = applicationNoticeArrest.findByPk(new Long(id));
			if( applicationNoticeArrest!=null ){
				request.setAttribute("applicationNoticeArrest", applicationNoticeArrest);
			}else{
				formHandler.setFormMessage("Error : Not Found with id "+ id );
			}
		}
		forward("?page=/web/applicationNoticeArrestEdit.jsp");
	}
	public void update(HttpServletRequest request,HttpServletResponse response)throws Exception {
		ApplicationNoticeArrest applicationNoticeArrest = new ApplicationNoticeArrest(db);
		bindForm(applicationNoticeArrest);
		applicationNoticeArrest = applicationNoticeArrest.update();
		if( applicationNoticeArrest!=null ){
			request.setAttribute("applicationNoticeArrest", applicationNoticeArrest);
			formHandler.setFormMessage("Update Completed");
		}else{
			formHandler.setFormMessage("Update Failed");
		}
		forward("?page=/web/applicationNoticeArrestEdit.jsp");
	}

	// delete
	public void delete(HttpServletRequest request,HttpServletResponse response)throws Exception {
		String[] ids =  request.getParameterValues("id");
		if( ids!=null && ids.length>0 ){
			ApplicationNoticeArrest applicationNoticeArrest = new ApplicationNoticeArrest(db);
			List<Long> idList = new ArrayList<Long>();
			for( int i=0;i<ids.length;i++ )
				idList.add(new Long(ids[i]));
			int deleteRow = applicationNoticeArrest.deleteByPks(idList);
			formHandler.setFormMessage(" Delete "+deleteRow+" Row Completed ");
		}else{
			formHandler.setFormMessage("Plese Select At Least One For Delete");
		}
		redirect("process2?action=ApplicationNoticeArrest&cmd=list");
	}
}