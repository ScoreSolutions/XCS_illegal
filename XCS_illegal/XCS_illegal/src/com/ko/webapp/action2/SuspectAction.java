








 

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
import com.ko.domain.Suspect;

public class SuspectAction extends BaseAction{
	@Override
	public void _default(HttpServletRequest request, HttpServletResponse response) throws Exception {
		// TODO Auto-generated method stub
	}
	// list
	public void list(HttpServletRequest request,HttpServletResponse response)throws Exception {
		Suspect suspect =new Suspect(db);
		// pageUtil.setPageSize(15);
		Integer totalRow = suspect.countAll();

		// set TotalRow
		pageUtil.setTotalRow(totalRow);
		List<Suspect> suspects = suspect.findAll(pageUtil);

		//	for data to display
		request.setAttribute("suspects", suspects);

		//	for screen to show
		forward("?page=/web/suspectList.jsp");
	}

	//	 create
	public void add(HttpServletRequest request,HttpServletResponse response)throws Exception {
		forward("?page=/web/suspectCreate.jsp");
	}
	public void create(HttpServletRequest request,HttpServletResponse response)throws Exception {
		Suspect suspect = new Suspect(db);
		bindForm(suspect);
		suspect = suspect.create();
		if( suspect!= null )
			formHandler.setFormMessage("Create Completed ,view <a href='process2?action=Suspect&cmd=view&id="+suspect.getId()+"' target='_blank'>new Record</a>");
		else
			formHandler.setFormMessage("Create Not Complete");
		redirect("process2?action=Suspect&cmd=add");
	}

	// view
	public void view(HttpServletRequest request,HttpServletResponse response)throws Exception {
		String id =  request.getParameter("id");
		if( id!=null && !id.trim().equals("") ){
			Suspect suspect = new Suspect(db);
			suspect = suspect.findByPk(new Long(id));
			if( suspect!=null ){
				request.setAttribute("suspect", suspect);
			}else{
				formHandler.setFormMessage("Error : Not Found with id "+ id );
			}
		}else{
			formHandler.setFormMessage("Error : Please Enter id");
		}
		forward("?page=/web/suspectView.jsp");
	}

	// update
	public void edit(HttpServletRequest request,HttpServletResponse response)throws Exception {
		String id =  request.getParameter("id");
		if( id!=null && !id.trim().equals("") ){
			Suspect suspect =new Suspect(db);
			suspect = suspect.findByPk(new Long(id));
			if( suspect!=null ){
				request.setAttribute("suspect", suspect);
			}else{
				formHandler.setFormMessage("Error : Not Found with id "+ id );
			}
		}
		forward("?page=/web/suspectEdit.jsp");
	}
	public void update(HttpServletRequest request,HttpServletResponse response)throws Exception {
		Suspect suspect = new Suspect(db);
		bindForm(suspect);
		suspect = suspect.update();
		if( suspect!=null ){
			request.setAttribute("suspect", suspect);
			formHandler.setFormMessage("Update Completed");
		}else{
			formHandler.setFormMessage("Update Failed");
		}
		forward("?page=/web/suspectEdit.jsp");
	}

	// delete
	public void delete(HttpServletRequest request,HttpServletResponse response)throws Exception {
		String[] ids =  request.getParameterValues("id");
		if( ids!=null && ids.length>0 ){
			Suspect suspect = new Suspect(db);
			List<Long> idList = new ArrayList<Long>();
			for( int i=0;i<ids.length;i++ )
				idList.add(new Long(ids[i]));
			int deleteRow = suspect.deleteByPks(idList);
			formHandler.setFormMessage(" Delete "+deleteRow+" Row Completed ");
		}else{
			formHandler.setFormMessage("Plese Select At Least One For Delete");
		}
		redirect("process2?action=Suspect&cmd=list");
	}
}