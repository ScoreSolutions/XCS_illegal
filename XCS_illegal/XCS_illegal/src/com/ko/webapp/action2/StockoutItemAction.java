








 

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
import com.ko.domain.StockoutItem;

public class StockoutItemAction extends BaseAction{
	@Override
	public void _default(HttpServletRequest request, HttpServletResponse response) throws Exception {
		// TODO Auto-generated method stub
	}
	// list
	public void list(HttpServletRequest request,HttpServletResponse response)throws Exception {
		StockoutItem stockoutItem =new StockoutItem(db);
		// pageUtil.setPageSize(15);
		Integer totalRow = stockoutItem.countAll();

		// set TotalRow
		pageUtil.setTotalRow(totalRow);
		List<StockoutItem> stockoutItems = stockoutItem.findAll(pageUtil);

		//	for data to display
		request.setAttribute("stockoutItems", stockoutItems);

		//	for screen to show
		forward("?page=/web/stockoutItemList.jsp");
	}

	//	 create
	public void add(HttpServletRequest request,HttpServletResponse response)throws Exception {
		forward("?page=/web/stockoutItemCreate.jsp");
	}
	public void create(HttpServletRequest request,HttpServletResponse response)throws Exception {
		StockoutItem stockoutItem = new StockoutItem(db);
		bindForm(stockoutItem);
		stockoutItem = stockoutItem.create();
		if( stockoutItem!= null )
			formHandler.setFormMessage("Create Completed ,view <a href='process2?action=StockoutItem&cmd=view&id="+stockoutItem.getId()+"' target='_blank'>new Record</a>");
		else
			formHandler.setFormMessage("Create Not Complete");
		redirect("process2?action=StockoutItem&cmd=add");
	}

	// view
	public void view(HttpServletRequest request,HttpServletResponse response)throws Exception {
		String id =  request.getParameter("id");
		if( id!=null && !id.trim().equals("") ){
			StockoutItem stockoutItem = new StockoutItem(db);
			stockoutItem = stockoutItem.findByPk(new Long(id));
			if( stockoutItem!=null ){
				request.setAttribute("stockoutItem", stockoutItem);
			}else{
				formHandler.setFormMessage("Error : Not Found with id "+ id );
			}
		}else{
			formHandler.setFormMessage("Error : Please Enter id");
		}
		forward("?page=/web/stockoutItemView.jsp");
	}

	// update
	public void edit(HttpServletRequest request,HttpServletResponse response)throws Exception {
		String id =  request.getParameter("id");
		if( id!=null && !id.trim().equals("") ){
			StockoutItem stockoutItem =new StockoutItem(db);
			stockoutItem = stockoutItem.findByPk(new Long(id));
			if( stockoutItem!=null ){
				request.setAttribute("stockoutItem", stockoutItem);
			}else{
				formHandler.setFormMessage("Error : Not Found with id "+ id );
			}
		}
		forward("?page=/web/stockoutItemEdit.jsp");
	}
	public void update(HttpServletRequest request,HttpServletResponse response)throws Exception {
		StockoutItem stockoutItem = new StockoutItem(db);
		bindForm(stockoutItem);
		stockoutItem = stockoutItem.update();
		if( stockoutItem!=null ){
			request.setAttribute("stockoutItem", stockoutItem);
			formHandler.setFormMessage("Update Completed");
		}else{
			formHandler.setFormMessage("Update Failed");
		}
		forward("?page=/web/stockoutItemEdit.jsp");
	}

	// delete
	public void delete(HttpServletRequest request,HttpServletResponse response)throws Exception {
		String[] ids =  request.getParameterValues("id");
		if( ids!=null && ids.length>0 ){
			StockoutItem stockoutItem = new StockoutItem(db);
			List<Long> idList = new ArrayList<Long>();
			for( int i=0;i<ids.length;i++ )
				idList.add(new Long(ids[i]));
			int deleteRow = stockoutItem.deleteByPks(idList);
			formHandler.setFormMessage(" Delete "+deleteRow+" Row Completed ");
		}else{
			formHandler.setFormMessage("Plese Select At Least One For Delete");
		}
		redirect("process2?action=StockoutItem&cmd=list");
	}
}