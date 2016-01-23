








 

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
import com.ko.domain.Stockout;

public class StockoutAction extends BaseAction{
	@Override
	public void _default(HttpServletRequest request, HttpServletResponse response) throws Exception {
		// TODO Auto-generated method stub
	}
	// list
	public void list(HttpServletRequest request,HttpServletResponse response)throws Exception {
		Stockout stockout =new Stockout(db);
		// pageUtil.setPageSize(15);
		Integer totalRow = stockout.countAll();

		// set TotalRow
		pageUtil.setTotalRow(totalRow);
		List<Stockout> stockouts = stockout.findAll(pageUtil);

		//	for data to display
		request.setAttribute("stockouts", stockouts);

		//	for screen to show
		forward("?page=/web/stockoutList.jsp");
	}

	//	 create
	public void add(HttpServletRequest request,HttpServletResponse response)throws Exception {
		forward("?page=/web/stockoutCreate.jsp");
	}
	public void create(HttpServletRequest request,HttpServletResponse response)throws Exception {
		Stockout stockout = new Stockout(db);
		bindForm(stockout);
		stockout = stockout.create();
		if( stockout!= null )
			formHandler.setFormMessage("Create Completed ,view <a href='process2?action=Stockout&cmd=view&id="+stockout.getId()+"' target='_blank'>new Record</a>");
		else
			formHandler.setFormMessage("Create Not Complete");
		redirect("process2?action=Stockout&cmd=add");
	}

	// view
	public void view(HttpServletRequest request,HttpServletResponse response)throws Exception {
		String id =  request.getParameter("id");
		if( id!=null && !id.trim().equals("") ){
			Stockout stockout = new Stockout(db);
			stockout = stockout.findByPk(new Long(id));
			if( stockout!=null ){
				request.setAttribute("stockout", stockout);
			}else{
				formHandler.setFormMessage("Error : Not Found with id "+ id );
			}
		}else{
			formHandler.setFormMessage("Error : Please Enter id");
		}
		forward("?page=/web/stockoutView.jsp");
	}

	// update
	public void edit(HttpServletRequest request,HttpServletResponse response)throws Exception {
		String id =  request.getParameter("id");
		if( id!=null && !id.trim().equals("") ){
			Stockout stockout =new Stockout(db);
			stockout = stockout.findByPk(new Long(id));
			if( stockout!=null ){
				request.setAttribute("stockout", stockout);
			}else{
				formHandler.setFormMessage("Error : Not Found with id "+ id );
			}
		}
		forward("?page=/web/stockoutEdit.jsp");
	}
	public void update(HttpServletRequest request,HttpServletResponse response)throws Exception {
		Stockout stockout = new Stockout(db);
		bindForm(stockout);
		stockout = stockout.update();
		if( stockout!=null ){
			request.setAttribute("stockout", stockout);
			formHandler.setFormMessage("Update Completed");
		}else{
			formHandler.setFormMessage("Update Failed");
		}
		forward("?page=/web/stockoutEdit.jsp");
	}

	// delete
	public void delete(HttpServletRequest request,HttpServletResponse response)throws Exception {
		String[] ids =  request.getParameterValues("id");
		if( ids!=null && ids.length>0 ){
			Stockout stockout = new Stockout(db);
			List<Long> idList = new ArrayList<Long>();
			for( int i=0;i<ids.length;i++ )
				idList.add(new Long(ids[i]));
			int deleteRow = stockout.deleteByPks(idList);
			formHandler.setFormMessage(" Delete "+deleteRow+" Row Completed ");
		}else{
			formHandler.setFormMessage("Plese Select At Least One For Delete");
		}
		redirect("process2?action=Stockout&cmd=list");
	}
}