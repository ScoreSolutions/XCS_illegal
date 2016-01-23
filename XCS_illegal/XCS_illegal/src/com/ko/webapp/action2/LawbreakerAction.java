








 

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
import com.ko.domain.Lawbreaker;

public class LawbreakerAction extends BaseAction{
	@Override
	public void _default(HttpServletRequest request, HttpServletResponse response) throws Exception {
		// TODO Auto-generated method stub
	}
	// list
	public void list(HttpServletRequest request,HttpServletResponse response)throws Exception {
		Lawbreaker lawbreaker =new Lawbreaker(db);
		// pageUtil.setPageSize(15);
		Integer totalRow = lawbreaker.countAll();

		// set TotalRow
		pageUtil.setTotalRow(totalRow);
		List<Lawbreaker> lawbreakers = lawbreaker.findAll(pageUtil);

		//	for data to display
		request.setAttribute("lawbreakers", lawbreakers);

		//	for screen to show
		forward("?page=/web/lawbreakerList.jsp");
	}

	//	 create
	public void add(HttpServletRequest request,HttpServletResponse response)throws Exception {
		forward("?page=/web/lawbreakerCreate.jsp");
	}
	public void create(HttpServletRequest request,HttpServletResponse response)throws Exception {
		Lawbreaker lawbreaker = new Lawbreaker(db);
		bindForm(lawbreaker);
		lawbreaker = lawbreaker.create();
		if( lawbreaker!= null )
			formHandler.setFormMessage("Create Completed ,view <a href='process2?action=Lawbreaker&cmd=view&id="+lawbreaker.getId()+"' target='_blank'>new Record</a>");
		else
			formHandler.setFormMessage("Create Not Complete");
		redirect("process2?action=Lawbreaker&cmd=add");
	}

	// view
	public void view(HttpServletRequest request,HttpServletResponse response)throws Exception {
		String id =  request.getParameter("id");
		if( id!=null && !id.trim().equals("") ){
			Lawbreaker lawbreaker = new Lawbreaker(db);
			lawbreaker = lawbreaker.findByPk(new Long(id));
			if( lawbreaker!=null ){
				request.setAttribute("lawbreaker", lawbreaker);
			}else{
				formHandler.setFormMessage("Error : Not Found with id "+ id );
			}
		}else{
			formHandler.setFormMessage("Error : Please Enter id");
		}
		forward("?page=/web/lawbreakerView.jsp");
	}

	// update
	public void edit(HttpServletRequest request,HttpServletResponse response)throws Exception {
		String id =  request.getParameter("id");
		if( id!=null && !id.trim().equals("") ){
			Lawbreaker lawbreaker =new Lawbreaker(db);
			lawbreaker = lawbreaker.findByPk(new Long(id));
			if( lawbreaker!=null ){
				request.setAttribute("lawbreaker", lawbreaker);
			}else{
				formHandler.setFormMessage("Error : Not Found with id "+ id );
			}
		}
		forward("?page=/web/lawbreakerEdit.jsp");
	}
	public void update(HttpServletRequest request,HttpServletResponse response)throws Exception {
		Lawbreaker lawbreaker = new Lawbreaker(db);
		bindForm(lawbreaker);
		lawbreaker = lawbreaker.update();
		if( lawbreaker!=null ){
			request.setAttribute("lawbreaker", lawbreaker);
			formHandler.setFormMessage("Update Completed");
		}else{
			formHandler.setFormMessage("Update Failed");
		}
		forward("?page=/web/lawbreakerEdit.jsp");
	}

	// delete
	public void delete(HttpServletRequest request,HttpServletResponse response)throws Exception {
		String[] ids =  request.getParameterValues("id");
		if( ids!=null && ids.length>0 ){
			Lawbreaker lawbreaker = new Lawbreaker(db);
			List<Long> idList = new ArrayList<Long>();
			for( int i=0;i<ids.length;i++ )
				idList.add(new Long(ids[i]));
			int deleteRow = lawbreaker.deleteByPks(idList);
			formHandler.setFormMessage(" Delete "+deleteRow+" Row Completed ");
		}else{
			formHandler.setFormMessage("Plese Select At Least One For Delete");
		}
		redirect("process2?action=Lawbreaker&cmd=list");
	}
}