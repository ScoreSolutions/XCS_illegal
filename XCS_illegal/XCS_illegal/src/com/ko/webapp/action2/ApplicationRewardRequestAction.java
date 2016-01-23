








 

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
import com.ko.domain.ApplicationRewardRequest;

public class ApplicationRewardRequestAction extends BaseAction{
	@Override
	public void _default(HttpServletRequest request, HttpServletResponse response) throws Exception {
		// TODO Auto-generated method stub
	}
	// list
	public void list(HttpServletRequest request,HttpServletResponse response)throws Exception {
		ApplicationRewardRequest applicationRewardRequest =new ApplicationRewardRequest(db);
		// pageUtil.setPageSize(15);
		Integer totalRow = applicationRewardRequest.countAll();

		// set TotalRow
		pageUtil.setTotalRow(totalRow);
		List<ApplicationRewardRequest> applicationRewardRequests = applicationRewardRequest.findAll(pageUtil);

		//	for data to display
		request.setAttribute("applicationRewardRequests", applicationRewardRequests);

		//	for screen to show
		forward("?page=/web/applicationRewardRequestList.jsp");
	}

	//	 create
	public void add(HttpServletRequest request,HttpServletResponse response)throws Exception {
		forward("?page=/web/applicationRewardRequestCreate.jsp");
	}
	public void create(HttpServletRequest request,HttpServletResponse response)throws Exception {
		ApplicationRewardRequest applicationRewardRequest = new ApplicationRewardRequest(db);
		bindForm(applicationRewardRequest);
		applicationRewardRequest = applicationRewardRequest.create();
		if( applicationRewardRequest!= null )
			formHandler.setFormMessage("Create Completed ,view <a href='process2?action=ApplicationRewardRequest&cmd=view&id="+applicationRewardRequest.getId()+"' target='_blank'>new Record</a>");
		else
			formHandler.setFormMessage("Create Not Complete");
		redirect("process2?action=ApplicationRewardRequest&cmd=add");
	}

	// view
	public void view(HttpServletRequest request,HttpServletResponse response)throws Exception {
		String id =  request.getParameter("id");
		if( id!=null && !id.trim().equals("") ){
			ApplicationRewardRequest applicationRewardRequest = new ApplicationRewardRequest(db);
			applicationRewardRequest = applicationRewardRequest.findByPk(new Long(id));
			if( applicationRewardRequest!=null ){
				request.setAttribute("applicationRewardRequest", applicationRewardRequest);
			}else{
				formHandler.setFormMessage("Error : Not Found with id "+ id );
			}
		}else{
			formHandler.setFormMessage("Error : Please Enter id");
		}
		forward("?page=/web/applicationRewardRequestView.jsp");
	}

	// update
	public void edit(HttpServletRequest request,HttpServletResponse response)throws Exception {
		String id =  request.getParameter("id");
		if( id!=null && !id.trim().equals("") ){
			ApplicationRewardRequest applicationRewardRequest =new ApplicationRewardRequest(db);
			applicationRewardRequest = applicationRewardRequest.findByPk(new Long(id));
			if( applicationRewardRequest!=null ){
				request.setAttribute("applicationRewardRequest", applicationRewardRequest);
			}else{
				formHandler.setFormMessage("Error : Not Found with id "+ id );
			}
		}
		forward("?page=/web/applicationRewardRequestEdit.jsp");
	}
	public void update(HttpServletRequest request,HttpServletResponse response)throws Exception {
		ApplicationRewardRequest applicationRewardRequest = new ApplicationRewardRequest(db);
		bindForm(applicationRewardRequest);
		applicationRewardRequest = applicationRewardRequest.update();
		if( applicationRewardRequest!=null ){
			request.setAttribute("applicationRewardRequest", applicationRewardRequest);
			formHandler.setFormMessage("Update Completed");
		}else{
			formHandler.setFormMessage("Update Failed");
		}
		forward("?page=/web/applicationRewardRequestEdit.jsp");
	}

	// delete
	public void delete(HttpServletRequest request,HttpServletResponse response)throws Exception {
		String[] ids =  request.getParameterValues("id");
		if( ids!=null && ids.length>0 ){
			ApplicationRewardRequest applicationRewardRequest = new ApplicationRewardRequest(db);
			List<Long> idList = new ArrayList<Long>();
			for( int i=0;i<ids.length;i++ )
				idList.add(new Long(ids[i]));
			int deleteRow = applicationRewardRequest.deleteByPks(idList);
			formHandler.setFormMessage(" Delete "+deleteRow+" Row Completed ");
		}else{
			formHandler.setFormMessage("Plese Select At Least One For Delete");
		}
		redirect("process2?action=ApplicationRewardRequest&cmd=list");
	}
}