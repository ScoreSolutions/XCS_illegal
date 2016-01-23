








 

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
import com.ko.domain.Stockremain;

public class StockremainAction extends BaseAction{
	@Override
	public void _default(HttpServletRequest request, HttpServletResponse response) throws Exception {
		// TODO Auto-generated method stub
	}
	// list
	public void list(HttpServletRequest request,HttpServletResponse response)throws Exception {
		Stockremain stockremain =new Stockremain(db);
		// pageUtil.setPageSize(15);
		Integer totalRow = stockremain.countAll();

		// set TotalRow
		pageUtil.setTotalRow(totalRow);
		List<Stockremain> stockremains = stockremain.findAll(pageUtil);

		//	for data to display
		request.setAttribute("stockremains", stockremains);

		//	for screen to show
		forward("?page=/web/stockremainList.jsp");
	}

	//	 create
	public void add(HttpServletRequest request,HttpServletResponse response)throws Exception {
		forward("?page=/web/stockremainCreate.jsp");
	}
	public void create(HttpServletRequest request,HttpServletResponse response)throws Exception {
		Stockremain stockremain = new Stockremain(db);
		bindForm(stockremain);
		stockremain = stockremain.create();
		if( stockremain!= null )
			formHandler.setFormMessage("Create Completed ,view <a href='process2?action=Stockremain&cmd=view&id="+stockremain.getId()+"' target='_blank'>new Record</a>");
		else
			formHandler.setFormMessage("Create Not Complete");
		redirect("process2?action=Stockremain&cmd=add");
	}

	// view
	public void view(HttpServletRequest request,HttpServletResponse response)throws Exception {
		String id =  request.getParameter("id");
		if( id!=null && !id.trim().equals("") ){
			Stockremain stockremain = new Stockremain(db);
			stockremain = stockremain.findByPk(new Long(id));
			if( stockremain!=null ){
				request.setAttribute("stockremain", stockremain);
			}else{
				formHandler.setFormMessage("Error : Not Found with id "+ id );
			}
		}else{
			formHandler.setFormMessage("Error : Please Enter id");
		}
		forward("?page=/web/stockremainView.jsp");
	}

	// update
	public void edit(HttpServletRequest request,HttpServletResponse response)throws Exception {
		String id =  request.getParameter("id");
		if( id!=null && !id.trim().equals("") ){
			Stockremain stockremain =new Stockremain(db);
			stockremain = stockremain.findByPk(new Long(id));
			if( stockremain!=null ){
				request.setAttribute("stockremain", stockremain);
			}else{
				formHandler.setFormMessage("Error : Not Found with id "+ id );
			}
		}
		forward("?page=/web/stockremainEdit.jsp");
	}
	public void update(HttpServletRequest request,HttpServletResponse response)throws Exception {
		Stockremain stockremain = new Stockremain(db);
		bindForm(stockremain);
		stockremain = stockremain.update();
		if( stockremain!=null ){
			request.setAttribute("stockremain", stockremain);
			formHandler.setFormMessage("Update Completed");
		}else{
			formHandler.setFormMessage("Update Failed");
		}
		forward("?page=/web/stockremainEdit.jsp");
	}

	// delete
	public void delete(HttpServletRequest request,HttpServletResponse response)throws Exception {
		String[] ids =  request.getParameterValues("id");
		if( ids!=null && ids.length>0 ){
			Stockremain stockremain = new Stockremain(db);
			List<Long> idList = new ArrayList<Long>();
			for( int i=0;i<ids.length;i++ )
				idList.add(new Long(ids[i]));
			int deleteRow = stockremain.deleteByPks(idList);
			formHandler.setFormMessage(" Delete "+deleteRow+" Row Completed ");
		}else{
			formHandler.setFormMessage("Plese Select At Least One For Delete");
		}
		redirect("process2?action=Stockremain&cmd=list");
	}
}