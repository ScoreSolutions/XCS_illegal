








 

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
import com.ko.domain.ApplicationRewardReqReport;

public class ApplicationRewardReqReportAction extends BaseAction{
	@Override
	public void _default(HttpServletRequest request, HttpServletResponse response) throws Exception {
		// TODO Auto-generated method stub
	}
	// list
	public void list(HttpServletRequest request,HttpServletResponse response)throws Exception {
		ApplicationRewardReqReport applicationRewardReqReport =new ApplicationRewardReqReport(db);
		// pageUtil.setPageSize(15);
		Integer totalRow = applicationRewardReqReport.countAll();

		// set TotalRow
		pageUtil.setTotalRow(totalRow);
		List<ApplicationRewardReqReport> applicationRewardReqReports = applicationRewardReqReport.findAll(pageUtil);

		//	for data to display
		request.setAttribute("applicationRewardReqReports", applicationRewardReqReports);

		//	for screen to show
		forward("?page=/web/applicationRewardReqReportList.jsp");
	}

	//	 create
	public void add(HttpServletRequest request,HttpServletResponse response)throws Exception {
		forward("?page=/web/applicationRewardReqReportCreate.jsp");
	}
	public void create(HttpServletRequest request,HttpServletResponse response)throws Exception {
		ApplicationRewardReqReport applicationRewardReqReport = new ApplicationRewardReqReport(db);
		bindForm(applicationRewardReqReport);
		applicationRewardReqReport = applicationRewardReqReport.create();
		if( applicationRewardReqReport!= null )
			formHandler.setFormMessage("Create Completed ,view <a href='process2?action=ApplicationRewardReqReport&cmd=view&id="+applicationRewardReqReport.getId()+"' target='_blank'>new Record</a>");
		else
			formHandler.setFormMessage("Create Not Complete");
		redirect("process2?action=ApplicationRewardReqReport&cmd=add");
	}

	// view
	public void view(HttpServletRequest request,HttpServletResponse response)throws Exception {
		String id =  request.getParameter("id");
		if( id!=null && !id.trim().equals("") ){
			ApplicationRewardReqReport applicationRewardReqReport = new ApplicationRewardReqReport(db);
			applicationRewardReqReport = applicationRewardReqReport.findByPk(new Long(id));
			if( applicationRewardReqReport!=null ){
				request.setAttribute("applicationRewardReqReport", applicationRewardReqReport);
			}else{
				formHandler.setFormMessage("Error : Not Found with id "+ id );
			}
		}else{
			formHandler.setFormMessage("Error : Please Enter id");
		}
		forward("?page=/web/applicationRewardReqReportView.jsp");
	}

	// update
	public void edit(HttpServletRequest request,HttpServletResponse response)throws Exception {
		String id =  request.getParameter("id");
		if( id!=null && !id.trim().equals("") ){
			ApplicationRewardReqReport applicationRewardReqReport =new ApplicationRewardReqReport(db);
			applicationRewardReqReport = applicationRewardReqReport.findByPk(new Long(id));
			if( applicationRewardReqReport!=null ){
				request.setAttribute("applicationRewardReqReport", applicationRewardReqReport);
			}else{
				formHandler.setFormMessage("Error : Not Found with id "+ id );
			}
		}
		forward("?page=/web/applicationRewardReqReportEdit.jsp");
	}
	public void update(HttpServletRequest request,HttpServletResponse response)throws Exception {
		ApplicationRewardReqReport applicationRewardReqReport = new ApplicationRewardReqReport(db);
		bindForm(applicationRewardReqReport);
		applicationRewardReqReport = applicationRewardReqReport.update();
		if( applicationRewardReqReport!=null ){
			request.setAttribute("applicationRewardReqReport", applicationRewardReqReport);
			formHandler.setFormMessage("Update Completed");
		}else{
			formHandler.setFormMessage("Update Failed");
		}
		forward("?page=/web/applicationRewardReqReportEdit.jsp");
	}

	// delete
	public void delete(HttpServletRequest request,HttpServletResponse response)throws Exception {
		String[] ids =  request.getParameterValues("id");
		if( ids!=null && ids.length>0 ){
			ApplicationRewardReqReport applicationRewardReqReport = new ApplicationRewardReqReport(db);
			List<Long> idList = new ArrayList<Long>();
			for( int i=0;i<ids.length;i++ )
				idList.add(new Long(ids[i]));
			int deleteRow = applicationRewardReqReport.deleteByPks(idList);
			formHandler.setFormMessage(" Delete "+deleteRow+" Row Completed ");
		}else{
			formHandler.setFormMessage("Plese Select At Least One For Delete");
		}
		redirect("process2?action=ApplicationRewardReqReport&cmd=list");
	}
}