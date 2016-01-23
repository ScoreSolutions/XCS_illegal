








 

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
import com.ko.domain.Invoice2;

public class Invoice2Action extends BaseAction{
	@Override
	public void _default(HttpServletRequest request, HttpServletResponse response) throws Exception {
		// TODO Auto-generated method stub
	}
	// list
	public void list(HttpServletRequest request,HttpServletResponse response)throws Exception {
		Invoice2 invoice2 =new Invoice2(db);
		// pageUtil.setPageSize(15);
		Integer totalRow = invoice2.countAll();

		// set TotalRow
		pageUtil.setTotalRow(totalRow);
		List<Invoice2> invoice2s = invoice2.findAll(pageUtil);

		//	for data to display
		request.setAttribute("invoice2s", invoice2s);

		//	for screen to show
		forward("?page=/web/invoice2List.jsp");
	}

	//	 create
	public void add(HttpServletRequest request,HttpServletResponse response)throws Exception {
		forward("?page=/web/invoice2Create.jsp");
	}
	public void create(HttpServletRequest request,HttpServletResponse response)throws Exception {
		Invoice2 invoice2 = new Invoice2(db);
		bindForm(invoice2);
		invoice2 = invoice2.create();
		if( invoice2!= null )
			formHandler.setFormMessage("Create Completed ,view <a href='process2?action=Invoice2&cmd=view&id="+invoice2.getId()+"' target='_blank'>new Record</a>");
		else
			formHandler.setFormMessage("Create Not Complete");
		redirect("process2?action=Invoice2&cmd=add");
	}

	// view
	public void view(HttpServletRequest request,HttpServletResponse response)throws Exception {
		String id =  request.getParameter("id");
		if( id!=null && !id.trim().equals("") ){
			Invoice2 invoice2 = new Invoice2(db);
			invoice2 = invoice2.findByPk(new Long(id));
			if( invoice2!=null ){
				request.setAttribute("invoice2", invoice2);
			}else{
				formHandler.setFormMessage("Error : Not Found with id "+ id );
			}
		}else{
			formHandler.setFormMessage("Error : Please Enter id");
		}
		forward("?page=/web/invoice2View.jsp");
	}

	// update
	public void edit(HttpServletRequest request,HttpServletResponse response)throws Exception {
		String id =  request.getParameter("id");
		if( id!=null && !id.trim().equals("") ){
			Invoice2 invoice2 =new Invoice2(db);
			invoice2 = invoice2.findByPk(new Long(id));
			if( invoice2!=null ){
				request.setAttribute("invoice2", invoice2);
			}else{
				formHandler.setFormMessage("Error : Not Found with id "+ id );
			}
		}
		forward("?page=/web/invoice2Edit.jsp");
	}
	public void update(HttpServletRequest request,HttpServletResponse response)throws Exception {
		Invoice2 invoice2 = new Invoice2(db);
		bindForm(invoice2);
		invoice2 = invoice2.update();
		if( invoice2!=null ){
			request.setAttribute("invoice2", invoice2);
			formHandler.setFormMessage("Update Completed");
		}else{
			formHandler.setFormMessage("Update Failed");
		}
		forward("?page=/web/invoice2Edit.jsp");
	}

	// delete
	public void delete(HttpServletRequest request,HttpServletResponse response)throws Exception {
		String[] ids =  request.getParameterValues("id");
		if( ids!=null && ids.length>0 ){
			Invoice2 invoice2 = new Invoice2(db);
			List<Long> idList = new ArrayList<Long>();
			for( int i=0;i<ids.length;i++ )
				idList.add(new Long(ids[i]));
			int deleteRow = invoice2.deleteByPks(idList);
			formHandler.setFormMessage(" Delete "+deleteRow+" Row Completed ");
		}else{
			formHandler.setFormMessage("Plese Select At Least One For Delete");
		}
		redirect("process2?action=Invoice2&cmd=list");
	}
}