








 

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
import com.ko.domain.ApplicationRewardReqTeam;

public class ApplicationRewardReqTeamAction extends BaseAction{
	@Override
	public void _default(HttpServletRequest request, HttpServletResponse response) throws Exception {
		// TODO Auto-generated method stub
	}
	// list
	public void list(HttpServletRequest request,HttpServletResponse response)throws Exception {
		ApplicationRewardReqTeam applicationRewardReqTeam =new ApplicationRewardReqTeam(db);
		// pageUtil.setPageSize(15);
		Integer totalRow = applicationRewardReqTeam.countAll();

		// set TotalRow
		pageUtil.setTotalRow(totalRow);
		List<ApplicationRewardReqTeam> applicationRewardReqTeams = applicationRewardReqTeam.findAll(pageUtil);

		//	for data to display
		request.setAttribute("applicationRewardReqTeams", applicationRewardReqTeams);

		//	for screen to show
		forward("?page=/web/applicationRewardReqTeamList.jsp");
	}

	//	 create
	public void add(HttpServletRequest request,HttpServletResponse response)throws Exception {
		forward("?page=/web/applicationRewardReqTeamCreate.jsp");
	}
	public void create(HttpServletRequest request,HttpServletResponse response)throws Exception {
		ApplicationRewardReqTeam applicationRewardReqTeam = new ApplicationRewardReqTeam(db);
		bindForm(applicationRewardReqTeam);
		applicationRewardReqTeam = applicationRewardReqTeam.create();
		if( applicationRewardReqTeam!= null )
			formHandler.setFormMessage("Create Completed ,view <a href='process2?action=ApplicationRewardReqTeam&cmd=view&id="+applicationRewardReqTeam.getId()+"' target='_blank'>new Record</a>");
		else
			formHandler.setFormMessage("Create Not Complete");
		redirect("process2?action=ApplicationRewardReqTeam&cmd=add");
	}

	// view
	public void view(HttpServletRequest request,HttpServletResponse response)throws Exception {
		String id =  request.getParameter("id");
		if( id!=null && !id.trim().equals("") ){
			ApplicationRewardReqTeam applicationRewardReqTeam = new ApplicationRewardReqTeam(db);
			applicationRewardReqTeam = applicationRewardReqTeam.findByPk(new Long(id));
			if( applicationRewardReqTeam!=null ){
				request.setAttribute("applicationRewardReqTeam", applicationRewardReqTeam);
			}else{
				formHandler.setFormMessage("Error : Not Found with id "+ id );
			}
		}else{
			formHandler.setFormMessage("Error : Please Enter id");
		}
		forward("?page=/web/applicationRewardReqTeamView.jsp");
	}

	// update
	public void edit(HttpServletRequest request,HttpServletResponse response)throws Exception {
		String id =  request.getParameter("id");
		if( id!=null && !id.trim().equals("") ){
			ApplicationRewardReqTeam applicationRewardReqTeam =new ApplicationRewardReqTeam(db);
			applicationRewardReqTeam = applicationRewardReqTeam.findByPk(new Long(id));
			if( applicationRewardReqTeam!=null ){
				request.setAttribute("applicationRewardReqTeam", applicationRewardReqTeam);
			}else{
				formHandler.setFormMessage("Error : Not Found with id "+ id );
			}
		}
		forward("?page=/web/applicationRewardReqTeamEdit.jsp");
	}
	public void update(HttpServletRequest request,HttpServletResponse response)throws Exception {
		ApplicationRewardReqTeam applicationRewardReqTeam = new ApplicationRewardReqTeam(db);
		bindForm(applicationRewardReqTeam);
		applicationRewardReqTeam = applicationRewardReqTeam.update();
		if( applicationRewardReqTeam!=null ){
			request.setAttribute("applicationRewardReqTeam", applicationRewardReqTeam);
			formHandler.setFormMessage("Update Completed");
		}else{
			formHandler.setFormMessage("Update Failed");
		}
		forward("?page=/web/applicationRewardReqTeamEdit.jsp");
	}

	// delete
	public void delete(HttpServletRequest request,HttpServletResponse response)throws Exception {
		String[] ids =  request.getParameterValues("id");
		if( ids!=null && ids.length>0 ){
			ApplicationRewardReqTeam applicationRewardReqTeam = new ApplicationRewardReqTeam(db);
			List<Long> idList = new ArrayList<Long>();
			for( int i=0;i<ids.length;i++ )
				idList.add(new Long(ids[i]));
			int deleteRow = applicationRewardReqTeam.deleteByPks(idList);
			formHandler.setFormMessage(" Delete "+deleteRow+" Row Completed ");
		}else{
			formHandler.setFormMessage("Plese Select At Least One For Delete");
		}
		redirect("process2?action=ApplicationRewardReqTeam&cmd=list");
	}
}