








 

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
import com.ko.domain.ErrorLog;

public class ErrorLogAction extends BaseAction{
	@Override
	public void _default(HttpServletRequest request, HttpServletResponse response) throws Exception {
		// TODO Auto-generated method stub
	}
	// list
	public void list(HttpServletRequest request,HttpServletResponse response)throws Exception {
		ErrorLog errorLog =new ErrorLog(db);
		// pageUtil.setPageSize(15);
		Integer totalRow = errorLog.countAll();

		// set TotalRow
		pageUtil.setTotalRow(totalRow);
		List<ErrorLog> errorLogs = errorLog.findAll(pageUtil);

		//	for data to display
		request.setAttribute("errorLogs", errorLogs);

		//	for screen to show
		forward("?page=/web/errorLogList.jsp");
	}

	//	 create
	public void add(HttpServletRequest request,HttpServletResponse response)throws Exception {
		forward("?page=/web/errorLogCreate.jsp");
	}
	public void create(HttpServletRequest request,HttpServletResponse response)throws Exception {
		ErrorLog errorLog = new ErrorLog(db);
		bindForm(errorLog);
		errorLog = errorLog.create();
		if( errorLog!= null )
			formHandler.setFormMessage("Create Completed ,view <a href='process2?action=ErrorLog&cmd=view&id="+errorLog.getId()+"' target='_blank'>new Record</a>");
		else
			formHandler.setFormMessage("Create Not Complete");
		redirect("process2?action=ErrorLog&cmd=add");
	}

	// view
	public void view(HttpServletRequest request,HttpServletResponse response)throws Exception {
		String id =  request.getParameter("id");
		if( id!=null && !id.trim().equals("") ){
			ErrorLog errorLog = new ErrorLog(db);
			errorLog = errorLog.findByPk(new Long(id));
			if( errorLog!=null ){
				request.setAttribute("errorLog", errorLog);
			}else{
				formHandler.setFormMessage("Error : Not Found with id "+ id );
			}
		}else{
			formHandler.setFormMessage("Error : Please Enter id");
		}
		forward("?page=/web/errorLogView.jsp");
	}

	// update
	public void edit(HttpServletRequest request,HttpServletResponse response)throws Exception {
		String id =  request.getParameter("id");
		if( id!=null && !id.trim().equals("") ){
			ErrorLog errorLog =new ErrorLog(db);
			errorLog = errorLog.findByPk(new Long(id));
			if( errorLog!=null ){
				request.setAttribute("errorLog", errorLog);
			}else{
				formHandler.setFormMessage("Error : Not Found with id "+ id );
			}
		}
		forward("?page=/web/errorLogEdit.jsp");
	}
	public void update(HttpServletRequest request,HttpServletResponse response)throws Exception {
		ErrorLog errorLog = new ErrorLog(db);
		bindForm(errorLog);
		errorLog = errorLog.update();
		if( errorLog!=null ){
			request.setAttribute("errorLog", errorLog);
			formHandler.setFormMessage("Update Completed");
		}else{
			formHandler.setFormMessage("Update Failed");
		}
		forward("?page=/web/errorLogEdit.jsp");
	}

	// delete
	public void delete(HttpServletRequest request,HttpServletResponse response)throws Exception {
		String[] ids =  request.getParameterValues("id");
		if( ids!=null && ids.length>0 ){
			ErrorLog errorLog = new ErrorLog(db);
			List<Long> idList = new ArrayList<Long>();
			for( int i=0;i<ids.length;i++ )
				idList.add(new Long(ids[i]));
			int deleteRow = errorLog.deleteByPks(idList);
			formHandler.setFormMessage(" Delete "+deleteRow+" Row Completed ");
		}else{
			formHandler.setFormMessage("Plese Select At Least One For Delete");
		}
		redirect("process2?action=ErrorLog&cmd=list");
	}
}