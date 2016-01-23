








 

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
import com.ko.domain.ApplicationOutsideProveItem;

public class ApplicationOutsideProveItemAction extends BaseAction{
	@Override
	public void _default(HttpServletRequest request, HttpServletResponse response) throws Exception {
		// TODO Auto-generated method stub
	}
	// list
	public void list(HttpServletRequest request,HttpServletResponse response)throws Exception {
		ApplicationOutsideProveItem applicationOutsideProveItem =new ApplicationOutsideProveItem(db);
		// pageUtil.setPageSize(15);
		Integer totalRow = applicationOutsideProveItem.countAll();

		// set TotalRow
		pageUtil.setTotalRow(totalRow);
		List<ApplicationOutsideProveItem> applicationOutsideProveItems = applicationOutsideProveItem.findAll(pageUtil);

		//	for data to display
		request.setAttribute("applicationOutsideProveItems", applicationOutsideProveItems);

		//	for screen to show
		forward("?page=/web/applicationOutsideProveItemList.jsp");
	}

	//	 create
	public void add(HttpServletRequest request,HttpServletResponse response)throws Exception {
		forward("?page=/web/applicationOutsideProveItemCreate.jsp");
	}
	public void create(HttpServletRequest request,HttpServletResponse response)throws Exception {
		ApplicationOutsideProveItem applicationOutsideProveItem = new ApplicationOutsideProveItem(db);
		bindForm(applicationOutsideProveItem);
		applicationOutsideProveItem = applicationOutsideProveItem.create();
		if( applicationOutsideProveItem!= null )
			formHandler.setFormMessage("Create Completed ,view <a href='process2?action=ApplicationOutsideProveItem&cmd=view&id="+applicationOutsideProveItem.getId()+"' target='_blank'>new Record</a>");
		else
			formHandler.setFormMessage("Create Not Complete");
		redirect("process2?action=ApplicationOutsideProveItem&cmd=add");
	}

	// view
	public void view(HttpServletRequest request,HttpServletResponse response)throws Exception {
		String id =  request.getParameter("id");
		if( id!=null && !id.trim().equals("") ){
			ApplicationOutsideProveItem applicationOutsideProveItem = new ApplicationOutsideProveItem(db);
			applicationOutsideProveItem = applicationOutsideProveItem.findByPk(new Long(id));
			if( applicationOutsideProveItem!=null ){
				request.setAttribute("applicationOutsideProveItem", applicationOutsideProveItem);
			}else{
				formHandler.setFormMessage("Error : Not Found with id "+ id );
			}
		}else{
			formHandler.setFormMessage("Error : Please Enter id");
		}
		forward("?page=/web/applicationOutsideProveItemView.jsp");
	}

	// update
	public void edit(HttpServletRequest request,HttpServletResponse response)throws Exception {
		String id =  request.getParameter("id");
		if( id!=null && !id.trim().equals("") ){
			ApplicationOutsideProveItem applicationOutsideProveItem =new ApplicationOutsideProveItem(db);
			applicationOutsideProveItem = applicationOutsideProveItem.findByPk(new Long(id));
			if( applicationOutsideProveItem!=null ){
				request.setAttribute("applicationOutsideProveItem", applicationOutsideProveItem);
			}else{
				formHandler.setFormMessage("Error : Not Found with id "+ id );
			}
		}
		forward("?page=/web/applicationOutsideProveItemEdit.jsp");
	}
	public void update(HttpServletRequest request,HttpServletResponse response)throws Exception {
		ApplicationOutsideProveItem applicationOutsideProveItem = new ApplicationOutsideProveItem(db);
		bindForm(applicationOutsideProveItem);
		applicationOutsideProveItem = applicationOutsideProveItem.update();
		if( applicationOutsideProveItem!=null ){
			request.setAttribute("applicationOutsideProveItem", applicationOutsideProveItem);
			formHandler.setFormMessage("Update Completed");
		}else{
			formHandler.setFormMessage("Update Failed");
		}
		forward("?page=/web/applicationOutsideProveItemEdit.jsp");
	}

	// delete
	public void delete(HttpServletRequest request,HttpServletResponse response)throws Exception {
		String[] ids =  request.getParameterValues("id");
		if( ids!=null && ids.length>0 ){
			ApplicationOutsideProveItem applicationOutsideProveItem = new ApplicationOutsideProveItem(db);
			List<Long> idList = new ArrayList<Long>();
			for( int i=0;i<ids.length;i++ )
				idList.add(new Long(ids[i]));
			int deleteRow = applicationOutsideProveItem.deleteByPks(idList);
			formHandler.setFormMessage(" Delete "+deleteRow+" Row Completed ");
		}else{
			formHandler.setFormMessage("Plese Select At Least One For Delete");
		}
		redirect("process2?action=ApplicationOutsideProveItem&cmd=list");
	}
}