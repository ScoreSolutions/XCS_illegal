








 

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
import com.ko.domain.ApplicationSincereTeam;

public class ApplicationSincereTeamAction extends BaseAction{
	@Override
	public void _default(HttpServletRequest request, HttpServletResponse response) throws Exception {
		// TODO Auto-generated method stub
	}
	// list
	public void list(HttpServletRequest request,HttpServletResponse response)throws Exception {
		ApplicationSincereTeam applicationSincereTeam =new ApplicationSincereTeam(db);
		// pageUtil.setPageSize(15);
		Integer totalRow = applicationSincereTeam.countAll();

		// set TotalRow
		pageUtil.setTotalRow(totalRow);
		List<ApplicationSincereTeam> applicationSincereTeams = applicationSincereTeam.findAll(pageUtil);

		//	for data to display
		request.setAttribute("applicationSincereTeams", applicationSincereTeams);

		//	for screen to show
		forward("?page=/web/applicationSincereTeamList.jsp");
	}

	//	 create
	public void add(HttpServletRequest request,HttpServletResponse response)throws Exception {
		forward("?page=/web/applicationSincereTeamCreate.jsp");
	}
	public void create(HttpServletRequest request,HttpServletResponse response)throws Exception {
		ApplicationSincereTeam applicationSincereTeam = new ApplicationSincereTeam(db);
		bindForm(applicationSincereTeam);
		applicationSincereTeam = applicationSincereTeam.create();
		if( applicationSincereTeam!= null )
			formHandler.setFormMessage("Create Completed ,view <a href='process2?action=ApplicationSincereTeam&cmd=view&id="+applicationSincereTeam.getId()+"' target='_blank'>new Record</a>");
		else
			formHandler.setFormMessage("Create Not Complete");
		redirect("process2?action=ApplicationSincereTeam&cmd=add");
	}

	// view
	public void view(HttpServletRequest request,HttpServletResponse response)throws Exception {
		String id =  request.getParameter("id");
		if( id!=null && !id.trim().equals("") ){
			ApplicationSincereTeam applicationSincereTeam = new ApplicationSincereTeam(db);
			applicationSincereTeam = applicationSincereTeam.findByPk(new Long(id));
			if( applicationSincereTeam!=null ){
				request.setAttribute("applicationSincereTeam", applicationSincereTeam);
			}else{
				formHandler.setFormMessage("Error : Not Found with id "+ id );
			}
		}else{
			formHandler.setFormMessage("Error : Please Enter id");
		}
		forward("?page=/web/applicationSincereTeamView.jsp");
	}

	// update
	public void edit(HttpServletRequest request,HttpServletResponse response)throws Exception {
		String id =  request.getParameter("id");
		if( id!=null && !id.trim().equals("") ){
			ApplicationSincereTeam applicationSincereTeam =new ApplicationSincereTeam(db);
			applicationSincereTeam = applicationSincereTeam.findByPk(new Long(id));
			if( applicationSincereTeam!=null ){
				request.setAttribute("applicationSincereTeam", applicationSincereTeam);
			}else{
				formHandler.setFormMessage("Error : Not Found with id "+ id );
			}
		}
		forward("?page=/web/applicationSincereTeamEdit.jsp");
	}
	public void update(HttpServletRequest request,HttpServletResponse response)throws Exception {
		ApplicationSincereTeam applicationSincereTeam = new ApplicationSincereTeam(db);
		bindForm(applicationSincereTeam);
		applicationSincereTeam = applicationSincereTeam.update();
		if( applicationSincereTeam!=null ){
			request.setAttribute("applicationSincereTeam", applicationSincereTeam);
			formHandler.setFormMessage("Update Completed");
		}else{
			formHandler.setFormMessage("Update Failed");
		}
		forward("?page=/web/applicationSincereTeamEdit.jsp");
	}

	// delete
	public void delete(HttpServletRequest request,HttpServletResponse response)throws Exception {
		String[] ids =  request.getParameterValues("id");
		if( ids!=null && ids.length>0 ){
			ApplicationSincereTeam applicationSincereTeam = new ApplicationSincereTeam(db);
			List<Long> idList = new ArrayList<Long>();
			for( int i=0;i<ids.length;i++ )
				idList.add(new Long(ids[i]));
			int deleteRow = applicationSincereTeam.deleteByPks(idList);
			formHandler.setFormMessage(" Delete "+deleteRow+" Row Completed ");
		}else{
			formHandler.setFormMessage("Plese Select At Least One For Delete");
		}
		redirect("process2?action=ApplicationSincereTeam&cmd=list");
	}
}