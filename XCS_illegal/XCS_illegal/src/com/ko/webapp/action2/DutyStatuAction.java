








 

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
import com.ko.domain.DutyStatu;

public class DutyStatuAction extends BaseAction{
	@Override
	public void _default(HttpServletRequest request, HttpServletResponse response) throws Exception {
		// TODO Auto-generated method stub
	}
	// list
	public void list(HttpServletRequest request,HttpServletResponse response)throws Exception {
		DutyStatu dutyStatu =new DutyStatu(db);
		// pageUtil.setPageSize(15);
		Integer totalRow = dutyStatu.countAll();

		// set TotalRow
		pageUtil.setTotalRow(totalRow);
		List<DutyStatu> dutyStatus = dutyStatu.findAll(pageUtil);

		//	for data to display
		request.setAttribute("dutyStatus", dutyStatus);

		//	for screen to show
		forward("?page=/web/dutyStatuList.jsp");
	}

	//	 create
	public void add(HttpServletRequest request,HttpServletResponse response)throws Exception {
		forward("?page=/web/dutyStatuCreate.jsp");
	}
	public void create(HttpServletRequest request,HttpServletResponse response)throws Exception {
		DutyStatu dutyStatu = new DutyStatu(db);
		bindForm(dutyStatu);
		dutyStatu = dutyStatu.create();
		if( dutyStatu!= null )
			formHandler.setFormMessage("Create Completed ,view <a href='process2?action=DutyStatu&cmd=view&id="+dutyStatu.getId()+"' target='_blank'>new Record</a>");
		else
			formHandler.setFormMessage("Create Not Complete");
		redirect("process2?action=DutyStatu&cmd=add");
	}

	// view
	public void view(HttpServletRequest request,HttpServletResponse response)throws Exception {
		String id =  request.getParameter("id");
		if( id!=null && !id.trim().equals("") ){
			DutyStatu dutyStatu = new DutyStatu(db);
			dutyStatu = dutyStatu.findByPk(new Long(id));
			if( dutyStatu!=null ){
				request.setAttribute("dutyStatu", dutyStatu);
			}else{
				formHandler.setFormMessage("Error : Not Found with id "+ id );
			}
		}else{
			formHandler.setFormMessage("Error : Please Enter id");
		}
		forward("?page=/web/dutyStatuView.jsp");
	}

	// update
	public void edit(HttpServletRequest request,HttpServletResponse response)throws Exception {
		String id =  request.getParameter("id");
		if( id!=null && !id.trim().equals("") ){
			DutyStatu dutyStatu =new DutyStatu(db);
			dutyStatu = dutyStatu.findByPk(new Long(id));
			if( dutyStatu!=null ){
				request.setAttribute("dutyStatu", dutyStatu);
			}else{
				formHandler.setFormMessage("Error : Not Found with id "+ id );
			}
		}
		forward("?page=/web/dutyStatuEdit.jsp");
	}
	public void update(HttpServletRequest request,HttpServletResponse response)throws Exception {
		DutyStatu dutyStatu = new DutyStatu(db);
		bindForm(dutyStatu);
		dutyStatu = dutyStatu.update();
		if( dutyStatu!=null ){
			request.setAttribute("dutyStatu", dutyStatu);
			formHandler.setFormMessage("Update Completed");
		}else{
			formHandler.setFormMessage("Update Failed");
		}
		forward("?page=/web/dutyStatuEdit.jsp");
	}

	// delete
	public void delete(HttpServletRequest request,HttpServletResponse response)throws Exception {
		String[] ids =  request.getParameterValues("id");
		if( ids!=null && ids.length>0 ){
			DutyStatu dutyStatu = new DutyStatu(db);
			List<Long> idList = new ArrayList<Long>();
			for( int i=0;i<ids.length;i++ )
				idList.add(new Long(ids[i]));
			int deleteRow = dutyStatu.deleteByPks(idList);
			formHandler.setFormMessage(" Delete "+deleteRow+" Row Completed ");
		}else{
			formHandler.setFormMessage("Plese Select At Least One For Delete");
		}
		redirect("process2?action=DutyStatu&cmd=list");
	}
}