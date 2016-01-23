








 

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
import com.ko.domain.StockinItem;

public class StockinItemAction extends BaseAction{
	@Override
	public void _default(HttpServletRequest request, HttpServletResponse response) throws Exception {
		// TODO Auto-generated method stub
	}
	// list
	public void list(HttpServletRequest request,HttpServletResponse response)throws Exception {
		StockinItem stockinItem =new StockinItem(db);
		// pageUtil.setPageSize(15);
		Integer totalRow = stockinItem.countAll();

		// set TotalRow
		pageUtil.setTotalRow(totalRow);
		List<StockinItem> stockinItems = stockinItem.findAll(pageUtil);

		//	for data to display
		request.setAttribute("stockinItems", stockinItems);

		//	for screen to show
		forward("?page=/web/stockinItemList.jsp");
	}

	//	 create
	public void add(HttpServletRequest request,HttpServletResponse response)throws Exception {
		forward("?page=/web/stockinItemCreate.jsp");
	}
	public void create(HttpServletRequest request,HttpServletResponse response)throws Exception {
		StockinItem stockinItem = new StockinItem(db);
		bindForm(stockinItem);
		stockinItem = stockinItem.create();
		if( stockinItem!= null )
			formHandler.setFormMessage("Create Completed ,view <a href='process2?action=StockinItem&cmd=view&id="+stockinItem.getId()+"' target='_blank'>new Record</a>");
		else
			formHandler.setFormMessage("Create Not Complete");
		redirect("process2?action=StockinItem&cmd=add");
	}

	// view
	public void view(HttpServletRequest request,HttpServletResponse response)throws Exception {
		String id =  request.getParameter("id");
		if( id!=null && !id.trim().equals("") ){
			StockinItem stockinItem = new StockinItem(db);
			stockinItem = stockinItem.findByPk(new Long(id));
			if( stockinItem!=null ){
				request.setAttribute("stockinItem", stockinItem);
			}else{
				formHandler.setFormMessage("Error : Not Found with id "+ id );
			}
		}else{
			formHandler.setFormMessage("Error : Please Enter id");
		}
		forward("?page=/web/stockinItemView.jsp");
	}

	// update
	public void edit(HttpServletRequest request,HttpServletResponse response)throws Exception {
		String id =  request.getParameter("id");
		if( id!=null && !id.trim().equals("") ){
			StockinItem stockinItem =new StockinItem(db);
			stockinItem = stockinItem.findByPk(new Long(id));
			if( stockinItem!=null ){
				request.setAttribute("stockinItem", stockinItem);
			}else{
				formHandler.setFormMessage("Error : Not Found with id "+ id );
			}
		}
		forward("?page=/web/stockinItemEdit.jsp");
	}
	public void update(HttpServletRequest request,HttpServletResponse response)throws Exception {
		StockinItem stockinItem = new StockinItem(db);
		bindForm(stockinItem);
		stockinItem = stockinItem.update();
		if( stockinItem!=null ){
			request.setAttribute("stockinItem", stockinItem);
			formHandler.setFormMessage("Update Completed");
		}else{
			formHandler.setFormMessage("Update Failed");
		}
		forward("?page=/web/stockinItemEdit.jsp");
	}

	// delete
	public void delete(HttpServletRequest request,HttpServletResponse response)throws Exception {
		String[] ids =  request.getParameterValues("id");
		if( ids!=null && ids.length>0 ){
			StockinItem stockinItem = new StockinItem(db);
			List<Long> idList = new ArrayList<Long>();
			for( int i=0;i<ids.length;i++ )
				idList.add(new Long(ids[i]));
			int deleteRow = stockinItem.deleteByPks(idList);
			formHandler.setFormMessage(" Delete "+deleteRow+" Row Completed ");
		}else{
			formHandler.setFormMessage("Plese Select At Least One For Delete");
		}
		redirect("process2?action=StockinItem&cmd=list");
	}
}