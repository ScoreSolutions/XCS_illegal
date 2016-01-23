








 

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
import com.ko.domain.ApplicationRewardReqTobacco;

public class ApplicationRewardReqTobaccoAction extends BaseAction{
	@Override
	public void _default(HttpServletRequest request, HttpServletResponse response) throws Exception {
		// TODO Auto-generated method stub
	}
	// list
	public void list(HttpServletRequest request,HttpServletResponse response)throws Exception {
		ApplicationRewardReqTobacco applicationRewardReqTobacco =new ApplicationRewardReqTobacco(db);
		// pageUtil.setPageSize(15);
		Integer totalRow = applicationRewardReqTobacco.countAll();

		// set TotalRow
		pageUtil.setTotalRow(totalRow);
		List<ApplicationRewardReqTobacco> applicationRewardReqTobaccos = applicationRewardReqTobacco.findAll(pageUtil);

		//	for data to display
		request.setAttribute("applicationRewardReqTobaccos", applicationRewardReqTobaccos);

		//	for screen to show
		forward("?page=/web/applicationRewardReqTobaccoList.jsp");
	}

	//	 create
	public void add(HttpServletRequest request,HttpServletResponse response)throws Exception {
		forward("?page=/web/applicationRewardReqTobaccoCreate.jsp");
	}
	public void create(HttpServletRequest request,HttpServletResponse response)throws Exception {
		ApplicationRewardReqTobacco applicationRewardReqTobacco = new ApplicationRewardReqTobacco(db);
		bindForm(applicationRewardReqTobacco);
		applicationRewardReqTobacco = applicationRewardReqTobacco.create();
		if( applicationRewardReqTobacco!= null )
			formHandler.setFormMessage("Create Completed ,view <a href='process2?action=ApplicationRewardReqTobacco&cmd=view&id="+applicationRewardReqTobacco.getId()+"' target='_blank'>new Record</a>");
		else
			formHandler.setFormMessage("Create Not Complete");
		redirect("process2?action=ApplicationRewardReqTobacco&cmd=add");
	}

	// view
	public void view(HttpServletRequest request,HttpServletResponse response)throws Exception {
		String id =  request.getParameter("id");
		if( id!=null && !id.trim().equals("") ){
			ApplicationRewardReqTobacco applicationRewardReqTobacco = new ApplicationRewardReqTobacco(db);
			applicationRewardReqTobacco = applicationRewardReqTobacco.findByPk(new Long(id));
			if( applicationRewardReqTobacco!=null ){
				request.setAttribute("applicationRewardReqTobacco", applicationRewardReqTobacco);
			}else{
				formHandler.setFormMessage("Error : Not Found with id "+ id );
			}
		}else{
			formHandler.setFormMessage("Error : Please Enter id");
		}
		forward("?page=/web/applicationRewardReqTobaccoView.jsp");
	}

	// update
	public void edit(HttpServletRequest request,HttpServletResponse response)throws Exception {
		String id =  request.getParameter("id");
		if( id!=null && !id.trim().equals("") ){
			ApplicationRewardReqTobacco applicationRewardReqTobacco =new ApplicationRewardReqTobacco(db);
			applicationRewardReqTobacco = applicationRewardReqTobacco.findByPk(new Long(id));
			if( applicationRewardReqTobacco!=null ){
				request.setAttribute("applicationRewardReqTobacco", applicationRewardReqTobacco);
			}else{
				formHandler.setFormMessage("Error : Not Found with id "+ id );
			}
		}
		forward("?page=/web/applicationRewardReqTobaccoEdit.jsp");
	}
	public void update(HttpServletRequest request,HttpServletResponse response)throws Exception {
		ApplicationRewardReqTobacco applicationRewardReqTobacco = new ApplicationRewardReqTobacco(db);
		bindForm(applicationRewardReqTobacco);
		applicationRewardReqTobacco = applicationRewardReqTobacco.update();
		if( applicationRewardReqTobacco!=null ){
			request.setAttribute("applicationRewardReqTobacco", applicationRewardReqTobacco);
			formHandler.setFormMessage("Update Completed");
		}else{
			formHandler.setFormMessage("Update Failed");
		}
		forward("?page=/web/applicationRewardReqTobaccoEdit.jsp");
	}

	// delete
	public void delete(HttpServletRequest request,HttpServletResponse response)throws Exception {
		String[] ids =  request.getParameterValues("id");
		if( ids!=null && ids.length>0 ){
			ApplicationRewardReqTobacco applicationRewardReqTobacco = new ApplicationRewardReqTobacco(db);
			List<Long> idList = new ArrayList<Long>();
			for( int i=0;i<ids.length;i++ )
				idList.add(new Long(ids[i]));
			int deleteRow = applicationRewardReqTobacco.deleteByPks(idList);
			formHandler.setFormMessage(" Delete "+deleteRow+" Row Completed ");
		}else{
			formHandler.setFormMessage("Plese Select At Least One For Delete");
		}
		redirect("process2?action=ApplicationRewardReqTobacco&cmd=list");
	}
}