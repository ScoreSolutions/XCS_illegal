








 

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
import com.ko.domain.Legislation;

public class LegislationAction extends BaseAction{
	@Override
	public void _default(HttpServletRequest request, HttpServletResponse response) throws Exception {
		// TODO Auto-generated method stub
	}
	// list
	public void list(HttpServletRequest request,HttpServletResponse response)throws Exception {
		Legislation legislation =new Legislation(db);
		// pageUtil.setPageSize(15);
		Integer totalRow = legislation.countAll();

		// set TotalRow
		pageUtil.setTotalRow(totalRow);
		List<Legislation> legislations = legislation.findAll(pageUtil);

		//	for data to display
		request.setAttribute("legislations", legislations);

		//	for screen to show
		forward("?page=/web/legislationList.jsp");
	}

	//	 create
	public void add(HttpServletRequest request,HttpServletResponse response)throws Exception {
		forward("?page=/web/legislationCreate.jsp");
	}
	public void create(HttpServletRequest request,HttpServletResponse response)throws Exception {
		Legislation legislation = new Legislation(db);
		bindForm(legislation);
		legislation = legislation.create();
		if( legislation!= null )
			formHandler.setFormMessage("Create Completed ,view <a href='process2?action=Legislation&cmd=view&id="+legislation.getId()+"' target='_blank'>new Record</a>");
		else
			formHandler.setFormMessage("Create Not Complete");
		redirect("process2?action=Legislation&cmd=add");
	}

	// view
	public void view(HttpServletRequest request,HttpServletResponse response)throws Exception {
		String id =  request.getParameter("id");
		if( id!=null && !id.trim().equals("") ){
			Legislation legislation = new Legislation(db);
			legislation = legislation.findByPk(new Long(id));
			if( legislation!=null ){
				request.setAttribute("legislation", legislation);
			}else{
				formHandler.setFormMessage("Error : Not Found with id "+ id );
			}
		}else{
			formHandler.setFormMessage("Error : Please Enter id");
		}
		forward("?page=/web/legislationView.jsp");
	}

	// update
	public void edit(HttpServletRequest request,HttpServletResponse response)throws Exception {
		String id =  request.getParameter("id");
		if( id!=null && !id.trim().equals("") ){
			Legislation legislation =new Legislation(db);
			legislation = legislation.findByPk(new Long(id));
			if( legislation!=null ){
				request.setAttribute("legislation", legislation);
			}else{
				formHandler.setFormMessage("Error : Not Found with id "+ id );
			}
		}
		forward("?page=/web/legislationEdit.jsp");
	}
	public void update(HttpServletRequest request,HttpServletResponse response)throws Exception {
		Legislation legislation = new Legislation(db);
		bindForm(legislation);
		legislation = legislation.update();
		if( legislation!=null ){
			request.setAttribute("legislation", legislation);
			formHandler.setFormMessage("Update Completed");
		}else{
			formHandler.setFormMessage("Update Failed");
		}
		forward("?page=/web/legislationEdit.jsp");
	}

	// delete
	public void delete(HttpServletRequest request,HttpServletResponse response)throws Exception {
		String[] ids =  request.getParameterValues("id");
		if( ids!=null && ids.length>0 ){
			Legislation legislation = new Legislation(db);
			List<Long> idList = new ArrayList<Long>();
			for( int i=0;i<ids.length;i++ )
				idList.add(new Long(ids[i]));
			int deleteRow = legislation.deleteByPks(idList);
			formHandler.setFormMessage(" Delete "+deleteRow+" Row Completed ");
		}else{
			formHandler.setFormMessage("Plese Select At Least One For Delete");
		}
		redirect("process2?action=Legislation&cmd=list");
	}
}