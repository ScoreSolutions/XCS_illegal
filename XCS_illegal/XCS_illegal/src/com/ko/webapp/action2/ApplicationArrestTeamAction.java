








 

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
import com.ko.domain.ApplicationArrestTeam;

public class ApplicationArrestTeamAction extends BaseAction{
	@Override
	public void _default(HttpServletRequest request, HttpServletResponse response) throws Exception {
		// TODO Auto-generated method stub
	}
	// list
	public void list(HttpServletRequest request,HttpServletResponse response)throws Exception {
		ApplicationArrestTeam applicationArrestTeam =new ApplicationArrestTeam(db);
		// pageUtil.setPageSize(15);
		Integer totalRow = applicationArrestTeam.countAll();

		// set TotalRow
		pageUtil.setTotalRow(totalRow);
		List<ApplicationArrestTeam> applicationArrestTeams = applicationArrestTeam.findAll(pageUtil);

		//	for data to display
		request.setAttribute("applicationArrestTeams", applicationArrestTeams);

		//	for screen to show
		forward("?page=/web/applicationArrestTeamList.jsp");
	}

	//	 create
	public void add(HttpServletRequest request,HttpServletResponse response)throws Exception {
		forward("?page=/web/applicationArrestTeamCreate.jsp");
	}
	public void create(HttpServletRequest request,HttpServletResponse response)throws Exception {
		ApplicationArrestTeam applicationArrestTeam = new ApplicationArrestTeam(db);
		bindForm(applicationArrestTeam);
		applicationArrestTeam = applicationArrestTeam.create();
		if( applicationArrestTeam!= null )
			formHandler.setFormMessage("Create Completed ,view <a href='process2?action=ApplicationArrestTeam&cmd=view&id="+applicationArrestTeam.getId()+"' target='_blank'>new Record</a>");
		else
			formHandler.setFormMessage("Create Not Complete");
		redirect("process2?action=ApplicationArrestTeam&cmd=add");
	}

	// view
	public void view(HttpServletRequest request,HttpServletResponse response)throws Exception {
		String id =  request.getParameter("id");
		if( id!=null && !id.trim().equals("") ){
			ApplicationArrestTeam applicationArrestTeam = new ApplicationArrestTeam(db);
			applicationArrestTeam = applicationArrestTeam.findByPk(new Long(id));
			if( applicationArrestTeam!=null ){
				request.setAttribute("applicationArrestTeam", applicationArrestTeam);
			}else{
				formHandler.setFormMessage("Error : Not Found with id "+ id );
			}
		}else{
			formHandler.setFormMessage("Error : Please Enter id");
		}
		forward("?page=/web/applicationArrestTeamView.jsp");
	}

	// update
	public void edit(HttpServletRequest request,HttpServletResponse response)throws Exception {
		String id =  request.getParameter("id");
		if( id!=null && !id.trim().equals("") ){
			ApplicationArrestTeam applicationArrestTeam =new ApplicationArrestTeam(db);
			applicationArrestTeam = applicationArrestTeam.findByPk(new Long(id));
			if( applicationArrestTeam!=null ){
				request.setAttribute("applicationArrestTeam", applicationArrestTeam);
			}else{
				formHandler.setFormMessage("Error : Not Found with id "+ id );
			}
		}
		forward("?page=/web/applicationArrestTeamEdit.jsp");
	}
	public void update(HttpServletRequest request,HttpServletResponse response)throws Exception {
		ApplicationArrestTeam applicationArrestTeam = new ApplicationArrestTeam(db);
		bindForm(applicationArrestTeam);
		applicationArrestTeam = applicationArrestTeam.update();
		if( applicationArrestTeam!=null ){
			request.setAttribute("applicationArrestTeam", applicationArrestTeam);
			formHandler.setFormMessage("Update Completed");
		}else{
			formHandler.setFormMessage("Update Failed");
		}
		forward("?page=/web/applicationArrestTeamEdit.jsp");
	}

	// delete
	public void delete(HttpServletRequest request,HttpServletResponse response)throws Exception {
		String[] ids =  request.getParameterValues("id");
		if( ids!=null && ids.length>0 ){
			ApplicationArrestTeam applicationArrestTeam = new ApplicationArrestTeam(db);
			List<Long> idList = new ArrayList<Long>();
			for( int i=0;i<ids.length;i++ )
				idList.add(new Long(ids[i]));
			int deleteRow = applicationArrestTeam.deleteByPks(idList);
			formHandler.setFormMessage(" Delete "+deleteRow+" Row Completed ");
		}else{
			formHandler.setFormMessage("Plese Select At Least One For Delete");
		}
		redirect("process2?action=ApplicationArrestTeam&cmd=list");
	}
}