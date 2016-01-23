








 

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
import com.ko.domain.InspectorTeamStaff;

public class InspectorTeamStaffAction extends BaseAction{
	@Override
	public void _default(HttpServletRequest request, HttpServletResponse response) throws Exception {
		// TODO Auto-generated method stub
	}
	// list
	public void list(HttpServletRequest request,HttpServletResponse response)throws Exception {
		InspectorTeamStaff inspectorTeamStaff =new InspectorTeamStaff(db);
		// pageUtil.setPageSize(15);
		Integer totalRow = inspectorTeamStaff.countAll();

		// set TotalRow
		pageUtil.setTotalRow(totalRow);
		List<InspectorTeamStaff> inspectorTeamStaffs = inspectorTeamStaff.findAll(pageUtil);

		//	for data to display
		request.setAttribute("inspectorTeamStaffs", inspectorTeamStaffs);

		//	for screen to show
		forward("?page=/web/inspectorTeamStaffList.jsp");
	}

	//	 create
	public void add(HttpServletRequest request,HttpServletResponse response)throws Exception {
		forward("?page=/web/inspectorTeamStaffCreate.jsp");
	}
	public void create(HttpServletRequest request,HttpServletResponse response)throws Exception {
		InspectorTeamStaff inspectorTeamStaff = new InspectorTeamStaff(db);
		bindForm(inspectorTeamStaff);
		inspectorTeamStaff = inspectorTeamStaff.create();
		if( inspectorTeamStaff!= null )
			formHandler.setFormMessage("Create Completed ,view <a href='process2?action=InspectorTeamStaff&cmd=view&id="+inspectorTeamStaff.getId()+"' target='_blank'>new Record</a>");
		else
			formHandler.setFormMessage("Create Not Complete");
		redirect("process2?action=InspectorTeamStaff&cmd=add");
	}

	// view
	public void view(HttpServletRequest request,HttpServletResponse response)throws Exception {
		String id =  request.getParameter("id");
		if( id!=null && !id.trim().equals("") ){
			InspectorTeamStaff inspectorTeamStaff = new InspectorTeamStaff(db);
			inspectorTeamStaff = inspectorTeamStaff.findByPk(new Long(id));
			if( inspectorTeamStaff!=null ){
				request.setAttribute("inspectorTeamStaff", inspectorTeamStaff);
			}else{
				formHandler.setFormMessage("Error : Not Found with id "+ id );
			}
		}else{
			formHandler.setFormMessage("Error : Please Enter id");
		}
		forward("?page=/web/inspectorTeamStaffView.jsp");
	}

	// update
	public void edit(HttpServletRequest request,HttpServletResponse response)throws Exception {
		String id =  request.getParameter("id");
		if( id!=null && !id.trim().equals("") ){
			InspectorTeamStaff inspectorTeamStaff =new InspectorTeamStaff(db);
			inspectorTeamStaff = inspectorTeamStaff.findByPk(new Long(id));
			if( inspectorTeamStaff!=null ){
				request.setAttribute("inspectorTeamStaff", inspectorTeamStaff);
			}else{
				formHandler.setFormMessage("Error : Not Found with id "+ id );
			}
		}
		forward("?page=/web/inspectorTeamStaffEdit.jsp");
	}
	public void update(HttpServletRequest request,HttpServletResponse response)throws Exception {
		InspectorTeamStaff inspectorTeamStaff = new InspectorTeamStaff(db);
		bindForm(inspectorTeamStaff);
		inspectorTeamStaff = inspectorTeamStaff.update();
		if( inspectorTeamStaff!=null ){
			request.setAttribute("inspectorTeamStaff", inspectorTeamStaff);
			formHandler.setFormMessage("Update Completed");
		}else{
			formHandler.setFormMessage("Update Failed");
		}
		forward("?page=/web/inspectorTeamStaffEdit.jsp");
	}

	// delete
	public void delete(HttpServletRequest request,HttpServletResponse response)throws Exception {
		String[] ids =  request.getParameterValues("id");
		if( ids!=null && ids.length>0 ){
			InspectorTeamStaff inspectorTeamStaff = new InspectorTeamStaff(db);
			List<Long> idList = new ArrayList<Long>();
			for( int i=0;i<ids.length;i++ )
				idList.add(new Long(ids[i]));
			int deleteRow = inspectorTeamStaff.deleteByPks(idList);
			formHandler.setFormMessage(" Delete "+deleteRow+" Row Completed ");
		}else{
			formHandler.setFormMessage("Plese Select At Least One For Delete");
		}
		redirect("process2?action=InspectorTeamStaff&cmd=list");
	}
}