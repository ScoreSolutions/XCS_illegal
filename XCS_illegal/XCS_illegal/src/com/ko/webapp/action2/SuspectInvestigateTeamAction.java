








 

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
import com.ko.domain.SuspectInvestigateTeam;

public class SuspectInvestigateTeamAction extends BaseAction{
	@Override
	public void _default(HttpServletRequest request, HttpServletResponse response) throws Exception {
		// TODO Auto-generated method stub
	}
	// list
	public void list(HttpServletRequest request,HttpServletResponse response)throws Exception {
		SuspectInvestigateTeam suspectInvestigateTeam =new SuspectInvestigateTeam(db);
		// pageUtil.setPageSize(15);
		Integer totalRow = suspectInvestigateTeam.countAll();

		// set TotalRow
		pageUtil.setTotalRow(totalRow);
		List<SuspectInvestigateTeam> suspectInvestigateTeams = suspectInvestigateTeam.findAll(pageUtil);

		//	for data to display
		request.setAttribute("suspectInvestigateTeams", suspectInvestigateTeams);

		//	for screen to show
		forward("?page=/web/suspectInvestigateTeamList.jsp");
	}

	//	 create
	public void add(HttpServletRequest request,HttpServletResponse response)throws Exception {
		forward("?page=/web/suspectInvestigateTeamCreate.jsp");
	}
	public void create(HttpServletRequest request,HttpServletResponse response)throws Exception {
		SuspectInvestigateTeam suspectInvestigateTeam = new SuspectInvestigateTeam(db);
		bindForm(suspectInvestigateTeam);
		suspectInvestigateTeam = suspectInvestigateTeam.create();
		if( suspectInvestigateTeam!= null )
			formHandler.setFormMessage("Create Completed ,view <a href='process2?action=SuspectInvestigateTeam&cmd=view&id="+suspectInvestigateTeam.getId()+"' target='_blank'>new Record</a>");
		else
			formHandler.setFormMessage("Create Not Complete");
		redirect("process2?action=SuspectInvestigateTeam&cmd=add");
	}

	// view
	public void view(HttpServletRequest request,HttpServletResponse response)throws Exception {
		String id =  request.getParameter("id");
		if( id!=null && !id.trim().equals("") ){
			SuspectInvestigateTeam suspectInvestigateTeam = new SuspectInvestigateTeam(db);
			suspectInvestigateTeam = suspectInvestigateTeam.findByPk(new Long(id));
			if( suspectInvestigateTeam!=null ){
				request.setAttribute("suspectInvestigateTeam", suspectInvestigateTeam);
			}else{
				formHandler.setFormMessage("Error : Not Found with id "+ id );
			}
		}else{
			formHandler.setFormMessage("Error : Please Enter id");
		}
		forward("?page=/web/suspectInvestigateTeamView.jsp");
	}

	// update
	public void edit(HttpServletRequest request,HttpServletResponse response)throws Exception {
		String id =  request.getParameter("id");
		if( id!=null && !id.trim().equals("") ){
			SuspectInvestigateTeam suspectInvestigateTeam =new SuspectInvestigateTeam(db);
			suspectInvestigateTeam = suspectInvestigateTeam.findByPk(new Long(id));
			if( suspectInvestigateTeam!=null ){
				request.setAttribute("suspectInvestigateTeam", suspectInvestigateTeam);
			}else{
				formHandler.setFormMessage("Error : Not Found with id "+ id );
			}
		}
		forward("?page=/web/suspectInvestigateTeamEdit.jsp");
	}
	public void update(HttpServletRequest request,HttpServletResponse response)throws Exception {
		SuspectInvestigateTeam suspectInvestigateTeam = new SuspectInvestigateTeam(db);
		bindForm(suspectInvestigateTeam);
		suspectInvestigateTeam = suspectInvestigateTeam.update();
		if( suspectInvestigateTeam!=null ){
			request.setAttribute("suspectInvestigateTeam", suspectInvestigateTeam);
			formHandler.setFormMessage("Update Completed");
		}else{
			formHandler.setFormMessage("Update Failed");
		}
		forward("?page=/web/suspectInvestigateTeamEdit.jsp");
	}

	// delete
	public void delete(HttpServletRequest request,HttpServletResponse response)throws Exception {
		String[] ids =  request.getParameterValues("id");
		if( ids!=null && ids.length>0 ){
			SuspectInvestigateTeam suspectInvestigateTeam = new SuspectInvestigateTeam(db);
			List<Long> idList = new ArrayList<Long>();
			for( int i=0;i<ids.length;i++ )
				idList.add(new Long(ids[i]));
			int deleteRow = suspectInvestigateTeam.deleteByPks(idList);
			formHandler.setFormMessage(" Delete "+deleteRow+" Row Completed ");
		}else{
			formHandler.setFormMessage("Plese Select At Least One For Delete");
		}
		redirect("process2?action=SuspectInvestigateTeam&cmd=list");
	}
}