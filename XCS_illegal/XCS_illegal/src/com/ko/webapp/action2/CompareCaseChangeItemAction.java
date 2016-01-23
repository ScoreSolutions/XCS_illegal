








 

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
import com.ko.domain.CompareCaseChangeItem;

public class CompareCaseChangeItemAction extends BaseAction{
	@Override
	public void _default(HttpServletRequest request, HttpServletResponse response) throws Exception {
		// TODO Auto-generated method stub
	}
	// list
	public void list(HttpServletRequest request,HttpServletResponse response)throws Exception {
		CompareCaseChangeItem compareCaseChangeItem =new CompareCaseChangeItem(db);
		// pageUtil.setPageSize(15);
		Integer totalRow = compareCaseChangeItem.countAll();

		// set TotalRow
		pageUtil.setTotalRow(totalRow);
		List<CompareCaseChangeItem> compareCaseChangeItems = compareCaseChangeItem.findAll(pageUtil);

		//	for data to display
		request.setAttribute("compareCaseChangeItems", compareCaseChangeItems);

		//	for screen to show
		forward("?page=/web/compareCaseChangeItemList.jsp");
	}

	//	 create
	public void add(HttpServletRequest request,HttpServletResponse response)throws Exception {
		forward("?page=/web/compareCaseChangeItemCreate.jsp");
	}
	public void create(HttpServletRequest request,HttpServletResponse response)throws Exception {
		CompareCaseChangeItem compareCaseChangeItem = new CompareCaseChangeItem(db);
		bindForm(compareCaseChangeItem);
		compareCaseChangeItem = compareCaseChangeItem.create();
		if( compareCaseChangeItem!= null )
			formHandler.setFormMessage("Create Completed ,view <a href='process2?action=CompareCaseChangeItem&cmd=view&id="+compareCaseChangeItem.getId()+"' target='_blank'>new Record</a>");
		else
			formHandler.setFormMessage("Create Not Complete");
		redirect("process2?action=CompareCaseChangeItem&cmd=add");
	}

	// view
	public void view(HttpServletRequest request,HttpServletResponse response)throws Exception {
		String id =  request.getParameter("id");
		if( id!=null && !id.trim().equals("") ){
			CompareCaseChangeItem compareCaseChangeItem = new CompareCaseChangeItem(db);
			compareCaseChangeItem = compareCaseChangeItem.findByPk(new Long(id));
			if( compareCaseChangeItem!=null ){
				request.setAttribute("compareCaseChangeItem", compareCaseChangeItem);
			}else{
				formHandler.setFormMessage("Error : Not Found with id "+ id );
			}
		}else{
			formHandler.setFormMessage("Error : Please Enter id");
		}
		forward("?page=/web/compareCaseChangeItemView.jsp");
	}

	// update
	public void edit(HttpServletRequest request,HttpServletResponse response)throws Exception {
		String id =  request.getParameter("id");
		if( id!=null && !id.trim().equals("") ){
			CompareCaseChangeItem compareCaseChangeItem =new CompareCaseChangeItem(db);
			compareCaseChangeItem = compareCaseChangeItem.findByPk(new Long(id));
			if( compareCaseChangeItem!=null ){
				request.setAttribute("compareCaseChangeItem", compareCaseChangeItem);
			}else{
				formHandler.setFormMessage("Error : Not Found with id "+ id );
			}
		}
		forward("?page=/web/compareCaseChangeItemEdit.jsp");
	}
	public void update(HttpServletRequest request,HttpServletResponse response)throws Exception {
		CompareCaseChangeItem compareCaseChangeItem = new CompareCaseChangeItem(db);
		bindForm(compareCaseChangeItem);
		compareCaseChangeItem = compareCaseChangeItem.update();
		if( compareCaseChangeItem!=null ){
			request.setAttribute("compareCaseChangeItem", compareCaseChangeItem);
			formHandler.setFormMessage("Update Completed");
		}else{
			formHandler.setFormMessage("Update Failed");
		}
		forward("?page=/web/compareCaseChangeItemEdit.jsp");
	}

	// delete
	public void delete(HttpServletRequest request,HttpServletResponse response)throws Exception {
		String[] ids =  request.getParameterValues("id");
		if( ids!=null && ids.length>0 ){
			CompareCaseChangeItem compareCaseChangeItem = new CompareCaseChangeItem(db);
			List<Long> idList = new ArrayList<Long>();
			for( int i=0;i<ids.length;i++ )
				idList.add(new Long(ids[i]));
			int deleteRow = compareCaseChangeItem.deleteByPks(idList);
			formHandler.setFormMessage(" Delete "+deleteRow+" Row Completed ");
		}else{
			formHandler.setFormMessage("Plese Select At Least One For Delete");
		}
		redirect("process2?action=CompareCaseChangeItem&cmd=list");
	}
}