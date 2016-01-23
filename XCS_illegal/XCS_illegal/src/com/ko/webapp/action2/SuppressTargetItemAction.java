








 

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
import com.ko.domain.SuppressTargetItem;

public class SuppressTargetItemAction extends BaseAction{
	@Override
	public void _default(HttpServletRequest request, HttpServletResponse response) throws Exception {
		// TODO Auto-generated method stub
	}
	// list
	public void list(HttpServletRequest request,HttpServletResponse response)throws Exception {
		SuppressTargetItem suppressTargetItem =new SuppressTargetItem(db);
		// pageUtil.setPageSize(15);
		Integer totalRow = suppressTargetItem.countAll();

		// set TotalRow
		pageUtil.setTotalRow(totalRow);
		List<SuppressTargetItem> suppressTargetItems = suppressTargetItem.findAll(pageUtil);

		//	for data to display
		request.setAttribute("suppressTargetItems", suppressTargetItems);

		//	for screen to show
		forward("?page=/web/suppressTargetItemList.jsp");
	}

	//	 create
	public void add(HttpServletRequest request,HttpServletResponse response)throws Exception {
		forward("?page=/web/suppressTargetItemCreate.jsp");
	}
	public void create(HttpServletRequest request,HttpServletResponse response)throws Exception {
		SuppressTargetItem suppressTargetItem = new SuppressTargetItem(db);
		bindForm(suppressTargetItem);
		suppressTargetItem = suppressTargetItem.create();
		if( suppressTargetItem!= null )
			formHandler.setFormMessage("Create Completed ,view <a href='process2?action=SuppressTargetItem&cmd=view&id="+suppressTargetItem.getId()+"' target='_blank'>new Record</a>");
		else
			formHandler.setFormMessage("Create Not Complete");
		redirect("process2?action=SuppressTargetItem&cmd=add");
	}

	// view
	public void view(HttpServletRequest request,HttpServletResponse response)throws Exception {
		String id =  request.getParameter("id");
		if( id!=null && !id.trim().equals("") ){
			SuppressTargetItem suppressTargetItem = new SuppressTargetItem(db);
			suppressTargetItem = suppressTargetItem.findByPk(new Long(id));
			if( suppressTargetItem!=null ){
				request.setAttribute("suppressTargetItem", suppressTargetItem);
			}else{
				formHandler.setFormMessage("Error : Not Found with id "+ id );
			}
		}else{
			formHandler.setFormMessage("Error : Please Enter id");
		}
		forward("?page=/web/suppressTargetItemView.jsp");
	}

	// update
	public void edit(HttpServletRequest request,HttpServletResponse response)throws Exception {
		String id =  request.getParameter("id");
		if( id!=null && !id.trim().equals("") ){
			SuppressTargetItem suppressTargetItem =new SuppressTargetItem(db);
			suppressTargetItem = suppressTargetItem.findByPk(new Long(id));
			if( suppressTargetItem!=null ){
				request.setAttribute("suppressTargetItem", suppressTargetItem);
			}else{
				formHandler.setFormMessage("Error : Not Found with id "+ id );
			}
		}
		forward("?page=/web/suppressTargetItemEdit.jsp");
	}
	public void update(HttpServletRequest request,HttpServletResponse response)throws Exception {
		SuppressTargetItem suppressTargetItem = new SuppressTargetItem(db);
		bindForm(suppressTargetItem);
		suppressTargetItem = suppressTargetItem.update();
		if( suppressTargetItem!=null ){
			request.setAttribute("suppressTargetItem", suppressTargetItem);
			formHandler.setFormMessage("Update Completed");
		}else{
			formHandler.setFormMessage("Update Failed");
		}
		forward("?page=/web/suppressTargetItemEdit.jsp");
	}

	// delete
	public void delete(HttpServletRequest request,HttpServletResponse response)throws Exception {
		String[] ids =  request.getParameterValues("id");
		if( ids!=null && ids.length>0 ){
			SuppressTargetItem suppressTargetItem = new SuppressTargetItem(db);
			List<Long> idList = new ArrayList<Long>();
			for( int i=0;i<ids.length;i++ )
				idList.add(new Long(ids[i]));
			int deleteRow = suppressTargetItem.deleteByPks(idList);
			formHandler.setFormMessage(" Delete "+deleteRow+" Row Completed ");
		}else{
			formHandler.setFormMessage("Plese Select At Least One For Delete");
		}
		redirect("process2?action=SuppressTargetItem&cmd=list");
	}
}