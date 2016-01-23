








 

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
import com.ko.domain.TranLog;

public class TranLogAction extends BaseAction{
	@Override
	public void _default(HttpServletRequest request, HttpServletResponse response) throws Exception {
		// TODO Auto-generated method stub
	}
	// list
	public void list(HttpServletRequest request,HttpServletResponse response)throws Exception {
		TranLog tranLog =new TranLog(db);
		// pageUtil.setPageSize(15);
		Integer totalRow = tranLog.countAll();

		// set TotalRow
		pageUtil.setTotalRow(totalRow);
		List<TranLog> tranLogs = tranLog.findAll(pageUtil);

		//	for data to display
		request.setAttribute("tranLogs", tranLogs);

		//	for screen to show
		forward("?page=/web/tranLogList.jsp");
	}

	//	 create
	public void add(HttpServletRequest request,HttpServletResponse response)throws Exception {
		forward("?page=/web/tranLogCreate.jsp");
	}
	public void create(HttpServletRequest request,HttpServletResponse response)throws Exception {
		TranLog tranLog = new TranLog(db);
		bindForm(tranLog);
		tranLog = tranLog.create();
		if( tranLog!= null )
			formHandler.setFormMessage("Create Completed ,view <a href='process2?action=TranLog&cmd=view&id="+tranLog.getId()+"' target='_blank'>new Record</a>");
		else
			formHandler.setFormMessage("Create Not Complete");
		redirect("process2?action=TranLog&cmd=add");
	}

	// view
	public void view(HttpServletRequest request,HttpServletResponse response)throws Exception {
		String id =  request.getParameter("id");
		if( id!=null && !id.trim().equals("") ){
			TranLog tranLog = new TranLog(db);
			tranLog = tranLog.findByPk(new Long(id));
			if( tranLog!=null ){
				request.setAttribute("tranLog", tranLog);
			}else{
				formHandler.setFormMessage("Error : Not Found with id "+ id );
			}
		}else{
			formHandler.setFormMessage("Error : Please Enter id");
		}
		forward("?page=/web/tranLogView.jsp");
	}

	// update
	public void edit(HttpServletRequest request,HttpServletResponse response)throws Exception {
		String id =  request.getParameter("id");
		if( id!=null && !id.trim().equals("") ){
			TranLog tranLog =new TranLog(db);
			tranLog = tranLog.findByPk(new Long(id));
			if( tranLog!=null ){
				request.setAttribute("tranLog", tranLog);
			}else{
				formHandler.setFormMessage("Error : Not Found with id "+ id );
			}
		}
		forward("?page=/web/tranLogEdit.jsp");
	}
	public void update(HttpServletRequest request,HttpServletResponse response)throws Exception {
		TranLog tranLog = new TranLog(db);
		bindForm(tranLog);
		tranLog = tranLog.update();
		if( tranLog!=null ){
			request.setAttribute("tranLog", tranLog);
			formHandler.setFormMessage("Update Completed");
		}else{
			formHandler.setFormMessage("Update Failed");
		}
		forward("?page=/web/tranLogEdit.jsp");
	}

	// delete
	public void delete(HttpServletRequest request,HttpServletResponse response)throws Exception {
		String[] ids =  request.getParameterValues("id");
		if( ids!=null && ids.length>0 ){
			TranLog tranLog = new TranLog(db);
			List<Long> idList = new ArrayList<Long>();
			for( int i=0;i<ids.length;i++ )
				idList.add(new Long(ids[i]));
			int deleteRow = tranLog.deleteByPks(idList);
			formHandler.setFormMessage(" Delete "+deleteRow+" Row Completed ");
		}else{
			formHandler.setFormMessage("Plese Select At Least One For Delete");
		}
		redirect("process2?action=TranLog&cmd=list");
	}
}