








 

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
import com.ko.domain.InspectorTeam;

public class InspectorTeamAction extends BaseAction{
	@Override
	public void _default(HttpServletRequest request, HttpServletResponse response) throws Exception {
		// TODO Auto-generated method stub
	}
	// list
	public void list(HttpServletRequest request,HttpServletResponse response)throws Exception {
		InspectorTeam inspectorTeam =new InspectorTeam(db);
		// pageUtil.setPageSize(15);
		Integer totalRow = inspectorTeam.countAll();

		// set TotalRow
		pageUtil.setTotalRow(totalRow);
		List<InspectorTeam> inspectorTeams = inspectorTeam.findAll(pageUtil);

		//	for data to display
		request.setAttribute("inspectorTeams", inspectorTeams);

		//	for screen to show
		forward("?page=/web/inspectorTeamList.jsp");
	}

	//	 create
	public void add(HttpServletRequest request,HttpServletResponse response)throws Exception {
		forward("?page=/web/inspectorTeamCreate.jsp");
	}
	public void create(HttpServletRequest request,HttpServletResponse response)throws Exception {
		InspectorTeam inspectorTeam = new InspectorTeam(db);
		bindForm(inspectorTeam);
		inspectorTeam = inspectorTeam.create();
		if( inspectorTeam!= null )
			formHandler.setFormMessage("Create Completed ,view <a href='process2?action=InspectorTeam&cmd=view&id="+inspectorTeam.getId()+"' target='_blank'>new Record</a>");
		else
			formHandler.setFormMessage("Create Not Complete");
		redirect("process2?action=InspectorTeam&cmd=add");
	}

	// view
	public void view(HttpServletRequest request,HttpServletResponse response)throws Exception {
		String id =  request.getParameter("id");
		if( id!=null && !id.trim().equals("") ){
			InspectorTeam inspectorTeam = new InspectorTeam(db);
			inspectorTeam = inspectorTeam.findByPk(new Long(id));
			if( inspectorTeam!=null ){
				request.setAttribute("inspectorTeam", inspectorTeam);
			}else{
				formHandler.setFormMessage("Error : Not Found with id "+ id );
			}
		}else{
			formHandler.setFormMessage("Error : Please Enter id");
		}
		forward("?page=/web/inspectorTeamView.jsp");
	}

	// update
	public void edit(HttpServletRequest request,HttpServletResponse response)throws Exception {
		String id =  request.getParameter("id");
		if( id!=null && !id.trim().equals("") ){
			InspectorTeam inspectorTeam =new InspectorTeam(db);
			inspectorTeam = inspectorTeam.findByPk(new Long(id));
			if( inspectorTeam!=null ){
				request.setAttribute("inspectorTeam", inspectorTeam);
			}else{
				formHandler.setFormMessage("Error : Not Found with id "+ id );
			}
		}
		forward("?page=/web/inspectorTeamEdit.jsp");
	}
	public void update(HttpServletRequest request,HttpServletResponse response)throws Exception {
		InspectorTeam inspectorTeam = new InspectorTeam(db);
		bindForm(inspectorTeam);
		inspectorTeam = inspectorTeam.update();
		if( inspectorTeam!=null ){
			request.setAttribute("inspectorTeam", inspectorTeam);
			formHandler.setFormMessage("Update Completed");
		}else{
			formHandler.setFormMessage("Update Failed");
		}
		forward("?page=/web/inspectorTeamEdit.jsp");
	}

	// delete
	public void delete(HttpServletRequest request,HttpServletResponse response)throws Exception {
		String[] ids =  request.getParameterValues("id");
		if( ids!=null && ids.length>0 ){
			InspectorTeam inspectorTeam = new InspectorTeam(db);
			List<Long> idList = new ArrayList<Long>();
			for( int i=0;i<ids.length;i++ )
				idList.add(new Long(ids[i]));
			int deleteRow = inspectorTeam.deleteByPks(idList);
			formHandler.setFormMessage(" Delete "+deleteRow+" Row Completed ");
		}else{
			formHandler.setFormMessage("Plese Select At Least One For Delete");
		}
		redirect("process2?action=InspectorTeam&cmd=list");
	}
}