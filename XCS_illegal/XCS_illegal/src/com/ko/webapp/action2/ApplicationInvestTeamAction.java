








 

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
import com.ko.domain.ApplicationInvestTeam;

public class ApplicationInvestTeamAction extends BaseAction{
	@Override
	public void _default(HttpServletRequest request, HttpServletResponse response) throws Exception {
		// TODO Auto-generated method stub
	}
	// list
	public void list(HttpServletRequest request,HttpServletResponse response)throws Exception {
		ApplicationInvestTeam applicationInvestTeam =new ApplicationInvestTeam(db);
		// pageUtil.setPageSize(15);
		Integer totalRow = applicationInvestTeam.countAll();

		// set TotalRow
		pageUtil.setTotalRow(totalRow);
		List<ApplicationInvestTeam> applicationInvestTeams = applicationInvestTeam.findAll(pageUtil);

		//	for data to display
		request.setAttribute("applicationInvestTeams", applicationInvestTeams);

		//	for screen to show
		forward("?page=/web/applicationInvestTeamList.jsp");
	}

	//	 create
	public void add(HttpServletRequest request,HttpServletResponse response)throws Exception {
		forward("?page=/web/applicationInvestTeamCreate.jsp");
	}
	public void create(HttpServletRequest request,HttpServletResponse response)throws Exception {
		ApplicationInvestTeam applicationInvestTeam = new ApplicationInvestTeam(db);
		bindForm(applicationInvestTeam);
		applicationInvestTeam = applicationInvestTeam.create();
		if( applicationInvestTeam!= null )
			formHandler.setFormMessage("Create Completed ,view <a href='process2?action=ApplicationInvestTeam&cmd=view&id="+applicationInvestTeam.getId()+"' target='_blank'>new Record</a>");
		else
			formHandler.setFormMessage("Create Not Complete");
		redirect("process2?action=ApplicationInvestTeam&cmd=add");
	}

	// view
	public void view(HttpServletRequest request,HttpServletResponse response)throws Exception {
		String id =  request.getParameter("id");
		if( id!=null && !id.trim().equals("") ){
			ApplicationInvestTeam applicationInvestTeam = new ApplicationInvestTeam(db);
			applicationInvestTeam = applicationInvestTeam.findByPk(new Long(id));
			if( applicationInvestTeam!=null ){
				request.setAttribute("applicationInvestTeam", applicationInvestTeam);
			}else{
				formHandler.setFormMessage("Error : Not Found with id "+ id );
			}
		}else{
			formHandler.setFormMessage("Error : Please Enter id");
		}
		forward("?page=/web/applicationInvestTeamView.jsp");
	}

	// update
	public void edit(HttpServletRequest request,HttpServletResponse response)throws Exception {
		String id =  request.getParameter("id");
		if( id!=null && !id.trim().equals("") ){
			ApplicationInvestTeam applicationInvestTeam =new ApplicationInvestTeam(db);
			applicationInvestTeam = applicationInvestTeam.findByPk(new Long(id));
			if( applicationInvestTeam!=null ){
				request.setAttribute("applicationInvestTeam", applicationInvestTeam);
			}else{
				formHandler.setFormMessage("Error : Not Found with id "+ id );
			}
		}
		forward("?page=/web/applicationInvestTeamEdit.jsp");
	}
	public void update(HttpServletRequest request,HttpServletResponse response)throws Exception {
		ApplicationInvestTeam applicationInvestTeam = new ApplicationInvestTeam(db);
		bindForm(applicationInvestTeam);
		applicationInvestTeam = applicationInvestTeam.update();
		if( applicationInvestTeam!=null ){
			request.setAttribute("applicationInvestTeam", applicationInvestTeam);
			formHandler.setFormMessage("Update Completed");
		}else{
			formHandler.setFormMessage("Update Failed");
		}
		forward("?page=/web/applicationInvestTeamEdit.jsp");
	}

	// delete
	public void delete(HttpServletRequest request,HttpServletResponse response)throws Exception {
		String[] ids =  request.getParameterValues("id");
		if( ids!=null && ids.length>0 ){
			ApplicationInvestTeam applicationInvestTeam = new ApplicationInvestTeam(db);
			List<Long> idList = new ArrayList<Long>();
			for( int i=0;i<ids.length;i++ )
				idList.add(new Long(ids[i]));
			int deleteRow = applicationInvestTeam.deleteByPks(idList);
			formHandler.setFormMessage(" Delete "+deleteRow+" Row Completed ");
		}else{
			formHandler.setFormMessage("Plese Select At Least One For Delete");
		}
		redirect("process2?action=ApplicationInvestTeam&cmd=list");
	}
}