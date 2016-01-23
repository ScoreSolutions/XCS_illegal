








 

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
import com.ko.domain.EdOffice;

public class EdOfficeAction extends BaseAction{
	@Override
	public void _default(HttpServletRequest request, HttpServletResponse response) throws Exception {
		// TODO Auto-generated method stub
	}
	// list
	public void list(HttpServletRequest request,HttpServletResponse response)throws Exception {
		EdOffice edOffice =new EdOffice(db);
		// pageUtil.setPageSize(15);
		Integer totalRow = edOffice.countAll();

		// set TotalRow
		pageUtil.setTotalRow(totalRow);
		List<EdOffice> edOffices = edOffice.findAll(pageUtil);

		//	for data to display
		request.setAttribute("edOffices", edOffices);

		//	for screen to show
		forward("?page=/web/edOfficeList.jsp");
	}

	//	 create
	public void add(HttpServletRequest request,HttpServletResponse response)throws Exception {
		forward("?page=/web/edOfficeCreate.jsp");
	}
	public void create(HttpServletRequest request,HttpServletResponse response)throws Exception {
		EdOffice edOffice = new EdOffice(db);
		bindForm(edOffice);
		edOffice = edOffice.create();
		if( edOffice!= null )
			formHandler.setFormMessage("Create Completed ,view <a href='process2?action=EdOffice&cmd=view&id="+edOffice.getId()+"' target='_blank'>new Record</a>");
		else
			formHandler.setFormMessage("Create Not Complete");
		redirect("process2?action=EdOffice&cmd=add");
	}

	// view
	public void view(HttpServletRequest request,HttpServletResponse response)throws Exception {
		String id =  request.getParameter("id");
		if( id!=null && !id.trim().equals("") ){
			EdOffice edOffice = new EdOffice(db);
			edOffice = edOffice.findByPk(new Long(id));
			if( edOffice!=null ){
				request.setAttribute("edOffice", edOffice);
			}else{
				formHandler.setFormMessage("Error : Not Found with id "+ id );
			}
		}else{
			formHandler.setFormMessage("Error : Please Enter id");
		}
		forward("?page=/web/edOfficeView.jsp");
	}

	// update
	public void edit(HttpServletRequest request,HttpServletResponse response)throws Exception {
		String id =  request.getParameter("id");
		if( id!=null && !id.trim().equals("") ){
			EdOffice edOffice =new EdOffice(db);
			edOffice = edOffice.findByPk(new Long(id));
			if( edOffice!=null ){
				request.setAttribute("edOffice", edOffice);
			}else{
				formHandler.setFormMessage("Error : Not Found with id "+ id );
			}
		}
		forward("?page=/web/edOfficeEdit.jsp");
	}
	public void update(HttpServletRequest request,HttpServletResponse response)throws Exception {
		EdOffice edOffice = new EdOffice(db);
		bindForm(edOffice);
		edOffice = edOffice.update();
		if( edOffice!=null ){
			request.setAttribute("edOffice", edOffice);
			formHandler.setFormMessage("Update Completed");
		}else{
			formHandler.setFormMessage("Update Failed");
		}
		forward("?page=/web/edOfficeEdit.jsp");
	}

	// delete
	public void delete(HttpServletRequest request,HttpServletResponse response)throws Exception {
		String[] ids =  request.getParameterValues("id");
		if( ids!=null && ids.length>0 ){
			EdOffice edOffice = new EdOffice(db);
			List<Long> idList = new ArrayList<Long>();
			for( int i=0;i<ids.length;i++ )
				idList.add(new Long(ids[i]));
			int deleteRow = edOffice.deleteByPks(idList);
			formHandler.setFormMessage(" Delete "+deleteRow+" Row Completed ");
		}else{
			formHandler.setFormMessage("Plese Select At Least One For Delete");
		}
		redirect("process2?action=EdOffice&cmd=list");
	}
}