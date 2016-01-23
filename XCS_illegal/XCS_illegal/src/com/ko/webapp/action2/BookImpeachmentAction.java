








 

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
import com.ko.domain.BookImpeachment;

public class BookImpeachmentAction extends BaseAction{
	@Override
	public void _default(HttpServletRequest request, HttpServletResponse response) throws Exception {
		// TODO Auto-generated method stub
	}
	// list
	public void list(HttpServletRequest request,HttpServletResponse response)throws Exception {
		BookImpeachment bookImpeachment =new BookImpeachment(db);
		// pageUtil.setPageSize(15);
		Integer totalRow = bookImpeachment.countAll();

		// set TotalRow
		pageUtil.setTotalRow(totalRow);
		List<BookImpeachment> bookImpeachments = bookImpeachment.findAll(pageUtil);

		//	for data to display
		request.setAttribute("bookImpeachments", bookImpeachments);

		//	for screen to show
		forward("?page=/web/bookImpeachmentList.jsp");
	}

	//	 create
	public void add(HttpServletRequest request,HttpServletResponse response)throws Exception {
		forward("?page=/web/bookImpeachmentCreate.jsp");
	}
	public void create(HttpServletRequest request,HttpServletResponse response)throws Exception {
		BookImpeachment bookImpeachment = new BookImpeachment(db);
		bindForm(bookImpeachment);
		bookImpeachment = bookImpeachment.create();
		if( bookImpeachment!= null )
			formHandler.setFormMessage("Create Completed ,view <a href='process2?action=BookImpeachment&cmd=view&id="+bookImpeachment.getId()+"' target='_blank'>new Record</a>");
		else
			formHandler.setFormMessage("Create Not Complete");
		redirect("process2?action=BookImpeachment&cmd=add");
	}

	// view
	public void view(HttpServletRequest request,HttpServletResponse response)throws Exception {
		String id =  request.getParameter("id");
		if( id!=null && !id.trim().equals("") ){
			BookImpeachment bookImpeachment = new BookImpeachment(db);
			bookImpeachment = bookImpeachment.findByPk(new Long(id));
			if( bookImpeachment!=null ){
				request.setAttribute("bookImpeachment", bookImpeachment);
			}else{
				formHandler.setFormMessage("Error : Not Found with id "+ id );
			}
		}else{
			formHandler.setFormMessage("Error : Please Enter id");
		}
		forward("?page=/web/bookImpeachmentView.jsp");
	}

	// update
	public void edit(HttpServletRequest request,HttpServletResponse response)throws Exception {
		String id =  request.getParameter("id");
		if( id!=null && !id.trim().equals("") ){
			BookImpeachment bookImpeachment =new BookImpeachment(db);
			bookImpeachment = bookImpeachment.findByPk(new Long(id));
			if( bookImpeachment!=null ){
				request.setAttribute("bookImpeachment", bookImpeachment);
			}else{
				formHandler.setFormMessage("Error : Not Found with id "+ id );
			}
		}
		forward("?page=/web/bookImpeachmentEdit.jsp");
	}
	public void update(HttpServletRequest request,HttpServletResponse response)throws Exception {
		BookImpeachment bookImpeachment = new BookImpeachment(db);
		bindForm(bookImpeachment);
		bookImpeachment = bookImpeachment.update();
		if( bookImpeachment!=null ){
			request.setAttribute("bookImpeachment", bookImpeachment);
			formHandler.setFormMessage("Update Completed");
		}else{
			formHandler.setFormMessage("Update Failed");
		}
		forward("?page=/web/bookImpeachmentEdit.jsp");
	}

	// delete
	public void delete(HttpServletRequest request,HttpServletResponse response)throws Exception {
		String[] ids =  request.getParameterValues("id");
		if( ids!=null && ids.length>0 ){
			BookImpeachment bookImpeachment = new BookImpeachment(db);
			List<Long> idList = new ArrayList<Long>();
			for( int i=0;i<ids.length;i++ )
				idList.add(new Long(ids[i]));
			int deleteRow = bookImpeachment.deleteByPks(idList);
			formHandler.setFormMessage(" Delete "+deleteRow+" Row Completed ");
		}else{
			formHandler.setFormMessage("Plese Select At Least One For Delete");
		}
		redirect("process2?action=BookImpeachment&cmd=list");
	}
}