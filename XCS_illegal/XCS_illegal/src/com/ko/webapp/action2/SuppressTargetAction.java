








 

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
import com.ko.domain.SuppressTarget;

public class SuppressTargetAction extends BaseAction{
	@Override
	public void _default(HttpServletRequest request, HttpServletResponse response) throws Exception {
		// TODO Auto-generated method stub
	}
	// list
	public void list(HttpServletRequest request,HttpServletResponse response)throws Exception {
		SuppressTarget suppressTarget =new SuppressTarget(db);
		// pageUtil.setPageSize(15);
		Integer totalRow = suppressTarget.countAll();

		// set TotalRow
		pageUtil.setTotalRow(totalRow);
		List<SuppressTarget> suppressTargets = suppressTarget.findAll(pageUtil);

		//	for data to display
		request.setAttribute("suppressTargets", suppressTargets);

		//	for screen to show
		forward("?page=/web/suppressTargetList.jsp");
	}

	//	 create
	public void add(HttpServletRequest request,HttpServletResponse response)throws Exception {
		forward("?page=/web/suppressTargetCreate.jsp");
	}
	public void create(HttpServletRequest request,HttpServletResponse response)throws Exception {
		SuppressTarget suppressTarget = new SuppressTarget(db);
		bindForm(suppressTarget);
		suppressTarget = suppressTarget.create();
		if( suppressTarget!= null )
			formHandler.setFormMessage("Create Completed ,view <a href='process2?action=SuppressTarget&cmd=view&id="+suppressTarget.getId()+"' target='_blank'>new Record</a>");
		else
			formHandler.setFormMessage("Create Not Complete");
		redirect("process2?action=SuppressTarget&cmd=add");
	}

	// view
	public void view(HttpServletRequest request,HttpServletResponse response)throws Exception {
		String id =  request.getParameter("id");
		if( id!=null && !id.trim().equals("") ){
			SuppressTarget suppressTarget = new SuppressTarget(db);
			suppressTarget = suppressTarget.findByPk(new Long(id));
			if( suppressTarget!=null ){
				request.setAttribute("suppressTarget", suppressTarget);
			}else{
				formHandler.setFormMessage("Error : Not Found with id "+ id );
			}
		}else{
			formHandler.setFormMessage("Error : Please Enter id");
		}
		forward("?page=/web/suppressTargetView.jsp");
	}

	// update
	public void edit(HttpServletRequest request,HttpServletResponse response)throws Exception {
		String id =  request.getParameter("id");
		if( id!=null && !id.trim().equals("") ){
			SuppressTarget suppressTarget =new SuppressTarget(db);
			suppressTarget = suppressTarget.findByPk(new Long(id));
			if( suppressTarget!=null ){
				request.setAttribute("suppressTarget", suppressTarget);
			}else{
				formHandler.setFormMessage("Error : Not Found with id "+ id );
			}
		}
		forward("?page=/web/suppressTargetEdit.jsp");
	}
	public void update(HttpServletRequest request,HttpServletResponse response)throws Exception {
		SuppressTarget suppressTarget = new SuppressTarget(db);
		bindForm(suppressTarget);
		suppressTarget = suppressTarget.update();
		if( suppressTarget!=null ){
			request.setAttribute("suppressTarget", suppressTarget);
			formHandler.setFormMessage("Update Completed");
		}else{
			formHandler.setFormMessage("Update Failed");
		}
		forward("?page=/web/suppressTargetEdit.jsp");
	}

	// delete
	public void delete(HttpServletRequest request,HttpServletResponse response)throws Exception {
		String[] ids =  request.getParameterValues("id");
		if( ids!=null && ids.length>0 ){
			SuppressTarget suppressTarget = new SuppressTarget(db);
			List<Long> idList = new ArrayList<Long>();
			for( int i=0;i<ids.length;i++ )
				idList.add(new Long(ids[i]));
			int deleteRow = suppressTarget.deleteByPks(idList);
			formHandler.setFormMessage(" Delete "+deleteRow+" Row Completed ");
		}else{
			formHandler.setFormMessage("Plese Select At Least One For Delete");
		}
		redirect("process2?action=SuppressTarget&cmd=list");
	}
}