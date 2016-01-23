








 

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
import com.ko.domain.Stockin;

public class StockinAction extends BaseAction{
	@Override
	public void _default(HttpServletRequest request, HttpServletResponse response) throws Exception {
		// TODO Auto-generated method stub
	}
	// list
	public void list(HttpServletRequest request,HttpServletResponse response)throws Exception {
		Stockin stockin =new Stockin(db);
		// pageUtil.setPageSize(15);
		Integer totalRow = stockin.countAll();

		// set TotalRow
		pageUtil.setTotalRow(totalRow);
		List<Stockin> stockins = stockin.findAll(pageUtil);

		//	for data to display
		request.setAttribute("stockins", stockins);

		//	for screen to show
		forward("?page=/web/stockinList.jsp");
	}

	//	 create
	public void add(HttpServletRequest request,HttpServletResponse response)throws Exception {
		forward("?page=/web/stockinCreate.jsp");
	}
	public void create(HttpServletRequest request,HttpServletResponse response)throws Exception {
		Stockin stockin = new Stockin(db);
		bindForm(stockin);
		stockin = stockin.create();
		if( stockin!= null )
			formHandler.setFormMessage("Create Completed ,view <a href='process2?action=Stockin&cmd=view&id="+stockin.getId()+"' target='_blank'>new Record</a>");
		else
			formHandler.setFormMessage("Create Not Complete");
		redirect("process2?action=Stockin&cmd=add");
	}

	// view
	public void view(HttpServletRequest request,HttpServletResponse response)throws Exception {
		String id =  request.getParameter("id");
		if( id!=null && !id.trim().equals("") ){
			Stockin stockin = new Stockin(db);
			stockin = stockin.findByPk(new Long(id));
			if( stockin!=null ){
				request.setAttribute("stockin", stockin);
			}else{
				formHandler.setFormMessage("Error : Not Found with id "+ id );
			}
		}else{
			formHandler.setFormMessage("Error : Please Enter id");
		}
		forward("?page=/web/stockinView.jsp");
	}

	// update
	public void edit(HttpServletRequest request,HttpServletResponse response)throws Exception {
		String id =  request.getParameter("id");
		if( id!=null && !id.trim().equals("") ){
			Stockin stockin =new Stockin(db);
			stockin = stockin.findByPk(new Long(id));
			if( stockin!=null ){
				request.setAttribute("stockin", stockin);
			}else{
				formHandler.setFormMessage("Error : Not Found with id "+ id );
			}
		}
		forward("?page=/web/stockinEdit.jsp");
	}
	public void update(HttpServletRequest request,HttpServletResponse response)throws Exception {
		Stockin stockin = new Stockin(db);
		bindForm(stockin);
		stockin = stockin.update();
		if( stockin!=null ){
			request.setAttribute("stockin", stockin);
			formHandler.setFormMessage("Update Completed");
		}else{
			formHandler.setFormMessage("Update Failed");
		}
		forward("?page=/web/stockinEdit.jsp");
	}

	// delete
	public void delete(HttpServletRequest request,HttpServletResponse response)throws Exception {
		String[] ids =  request.getParameterValues("id");
		if( ids!=null && ids.length>0 ){
			Stockin stockin = new Stockin(db);
			List<Long> idList = new ArrayList<Long>();
			for( int i=0;i<ids.length;i++ )
				idList.add(new Long(ids[i]));
			int deleteRow = stockin.deleteByPks(idList);
			formHandler.setFormMessage(" Delete "+deleteRow+" Row Completed ");
		}else{
			formHandler.setFormMessage("Plese Select At Least One For Delete");
		}
		redirect("process2?action=Stockin&cmd=list");
	}
}