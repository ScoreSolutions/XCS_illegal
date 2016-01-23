








 

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
import com.ko.domain.SuspectVehicle;

public class SuspectVehicleAction extends BaseAction{
	@Override
	public void _default(HttpServletRequest request, HttpServletResponse response) throws Exception {
		// TODO Auto-generated method stub
	}
	// list
	public void list(HttpServletRequest request,HttpServletResponse response)throws Exception {
		SuspectVehicle suspectVehicle =new SuspectVehicle(db);
		// pageUtil.setPageSize(15);
		Integer totalRow = suspectVehicle.countAll();

		// set TotalRow
		pageUtil.setTotalRow(totalRow);
		List<SuspectVehicle> suspectVehicles = suspectVehicle.findAll(pageUtil);

		//	for data to display
		request.setAttribute("suspectVehicles", suspectVehicles);

		//	for screen to show
		forward("?page=/web/suspectVehicleList.jsp");
	}

	//	 create
	public void add(HttpServletRequest request,HttpServletResponse response)throws Exception {
		forward("?page=/web/suspectVehicleCreate.jsp");
	}
	public void create(HttpServletRequest request,HttpServletResponse response)throws Exception {
		SuspectVehicle suspectVehicle = new SuspectVehicle(db);
		bindForm(suspectVehicle);
		suspectVehicle = suspectVehicle.create();
		if( suspectVehicle!= null )
			formHandler.setFormMessage("Create Completed ,view <a href='process2?action=SuspectVehicle&cmd=view&id="+suspectVehicle.getId()+"' target='_blank'>new Record</a>");
		else
			formHandler.setFormMessage("Create Not Complete");
		redirect("process2?action=SuspectVehicle&cmd=add");
	}

	// view
	public void view(HttpServletRequest request,HttpServletResponse response)throws Exception {
		String id =  request.getParameter("id");
		if( id!=null && !id.trim().equals("") ){
			SuspectVehicle suspectVehicle = new SuspectVehicle(db);
			suspectVehicle = suspectVehicle.findByPk(new Long(id));
			if( suspectVehicle!=null ){
				request.setAttribute("suspectVehicle", suspectVehicle);
			}else{
				formHandler.setFormMessage("Error : Not Found with id "+ id );
			}
		}else{
			formHandler.setFormMessage("Error : Please Enter id");
		}
		forward("?page=/web/suspectVehicleView.jsp");
	}

	// update
	public void edit(HttpServletRequest request,HttpServletResponse response)throws Exception {
		String id =  request.getParameter("id");
		if( id!=null && !id.trim().equals("") ){
			SuspectVehicle suspectVehicle =new SuspectVehicle(db);
			suspectVehicle = suspectVehicle.findByPk(new Long(id));
			if( suspectVehicle!=null ){
				request.setAttribute("suspectVehicle", suspectVehicle);
			}else{
				formHandler.setFormMessage("Error : Not Found with id "+ id );
			}
		}
		forward("?page=/web/suspectVehicleEdit.jsp");
	}
	public void update(HttpServletRequest request,HttpServletResponse response)throws Exception {
		SuspectVehicle suspectVehicle = new SuspectVehicle(db);
		bindForm(suspectVehicle);
		suspectVehicle = suspectVehicle.update();
		if( suspectVehicle!=null ){
			request.setAttribute("suspectVehicle", suspectVehicle);
			formHandler.setFormMessage("Update Completed");
		}else{
			formHandler.setFormMessage("Update Failed");
		}
		forward("?page=/web/suspectVehicleEdit.jsp");
	}

	// delete
	public void delete(HttpServletRequest request,HttpServletResponse response)throws Exception {
		String[] ids =  request.getParameterValues("id");
		if( ids!=null && ids.length>0 ){
			SuspectVehicle suspectVehicle = new SuspectVehicle(db);
			List<Long> idList = new ArrayList<Long>();
			for( int i=0;i<ids.length;i++ )
				idList.add(new Long(ids[i]));
			int deleteRow = suspectVehicle.deleteByPks(idList);
			formHandler.setFormMessage(" Delete "+deleteRow+" Row Completed ");
		}else{
			formHandler.setFormMessage("Plese Select At Least One For Delete");
		}
		redirect("process2?action=SuspectVehicle&cmd=list");
	}
}