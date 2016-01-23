








 

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
import com.ko.domain.Indictment;

public class IndictmentAction extends BaseAction{
	@Override
	public void _default(HttpServletRequest request, HttpServletResponse response) throws Exception {
		// TODO Auto-generated method stub
	}
	// list
	public void list(HttpServletRequest request,HttpServletResponse response)throws Exception {
		Indictment indictment =new Indictment(db);
		// pageUtil.setPageSize(15);
		Integer totalRow = indictment.countAll();

		// set TotalRow
		pageUtil.setTotalRow(totalRow);
		List<Indictment> indictments = indictment.findAll(pageUtil);

		//	for data to display
		request.setAttribute("indictments", indictments);

		//	for screen to show
		forward("?page=/web/indictmentList.jsp");
	}

	//	 create
	public void add(HttpServletRequest request,HttpServletResponse response)throws Exception {
		forward("?page=/web/indictmentCreate.jsp");
	}
	public void create(HttpServletRequest request,HttpServletResponse response)throws Exception {
		Indictment indictment = new Indictment(db);
		bindForm(indictment);
		indictment = indictment.create();
		if( indictment!= null )
			formHandler.setFormMessage("Create Completed ,view <a href='process2?action=Indictment&cmd=view&id="+indictment.getIndictment_id()+"' target='_blank'>new Record</a>");
		else
			formHandler.setFormMessage("Create Not Complete");
		redirect("process2?action=Indictment&cmd=add");
	}

	// view
	public void view(HttpServletRequest request,HttpServletResponse response)throws Exception {
		String indictment_id =  request.getParameter("indictment_id");
		if( indictment_id!=null && !indictment_id.trim().equals("") ){
			Indictment indictment = new Indictment(db);
			indictment = indictment.findByPk(new Long(indictment_id));
			if( indictment!=null ){
				request.setAttribute("indictment", indictment);
			}else{
				formHandler.setFormMessage("Error : Not Found with indictment_id "+ indictment_id );
			}
		}else{
			formHandler.setFormMessage("Error : Please Enter indictment_id");
		}
		forward("?page=/web/indictmentView.jsp");
	}

	// update
	public void edit(HttpServletRequest request,HttpServletResponse response)throws Exception {
		String indictment_id =  request.getParameter("indictment_id");
		if( indictment_id!=null && !indictment_id.trim().equals("") ){
			Indictment indictment =new Indictment(db);
			indictment = indictment.findByPk(new Long(indictment_id));
			if( indictment!=null ){
				request.setAttribute("indictment", indictment);
			}else{
				formHandler.setFormMessage("Error : Not Found with indictment_id "+ indictment_id );
			}
		}
		forward("?page=/web/indictmentEdit.jsp");
	}
	public void update(HttpServletRequest request,HttpServletResponse response)throws Exception {
		Indictment indictment = new Indictment(db);
		bindForm(indictment);
		indictment = indictment.update();
		if( indictment!=null ){
			request.setAttribute("indictment", indictment);
			formHandler.setFormMessage("Update Completed");
		}else{
			formHandler.setFormMessage("Update Failed");
		}
		forward("?page=/web/indictmentEdit.jsp");
	}

	// delete
	public void delete(HttpServletRequest request,HttpServletResponse response)throws Exception {
		String[] indictment_ids =  request.getParameterValues("indictment_id");
		if( indictment_ids!=null && indictment_ids.length>0 ){
			Indictment indictment = new Indictment(db);
			List<Long> indictment_idList = new ArrayList<Long>();
			for( int i=0;i<indictment_ids.length;i++ )
				indictment_idList.add(new Long(indictment_ids[i]));
			int deleteRow = indictment.deleteByPks(indictment_idList);
			formHandler.setFormMessage(" Delete "+deleteRow+" Row Completed ");
		}else{
			formHandler.setFormMessage("Plese Select At Least One For Delete");
		}
		redirect("process2?action=Indictment&cmd=list");
	}
}