








 

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
import com.ko.domain.ApplicationRewardReqTax;

public class ApplicationRewardReqTaxAction extends BaseAction{
	@Override
	public void _default(HttpServletRequest request, HttpServletResponse response) throws Exception {
		// TODO Auto-generated method stub
	}
	// list
	public void list(HttpServletRequest request,HttpServletResponse response)throws Exception {
		ApplicationRewardReqTax applicationRewardReqTax =new ApplicationRewardReqTax(db);
		// pageUtil.setPageSize(15);
		Integer totalRow = applicationRewardReqTax.countAll();

		// set TotalRow
		pageUtil.setTotalRow(totalRow);
		List<ApplicationRewardReqTax> applicationRewardReqTaxs = applicationRewardReqTax.findAll(pageUtil);

		//	for data to display
		request.setAttribute("applicationRewardReqTaxs", applicationRewardReqTaxs);

		//	for screen to show
		forward("?page=/web/applicationRewardReqTaxList.jsp");
	}

	//	 create
	public void add(HttpServletRequest request,HttpServletResponse response)throws Exception {
		forward("?page=/web/applicationRewardReqTaxCreate.jsp");
	}
	public void create(HttpServletRequest request,HttpServletResponse response)throws Exception {
		ApplicationRewardReqTax applicationRewardReqTax = new ApplicationRewardReqTax(db);
		bindForm(applicationRewardReqTax);
		applicationRewardReqTax = applicationRewardReqTax.create();
		if( applicationRewardReqTax!= null )
			formHandler.setFormMessage("Create Completed ,view <a href='process2?action=ApplicationRewardReqTax&cmd=view&id="+applicationRewardReqTax.getId()+"' target='_blank'>new Record</a>");
		else
			formHandler.setFormMessage("Create Not Complete");
		redirect("process2?action=ApplicationRewardReqTax&cmd=add");
	}

	// view
	public void view(HttpServletRequest request,HttpServletResponse response)throws Exception {
		String id =  request.getParameter("id");
		if( id!=null && !id.trim().equals("") ){
			ApplicationRewardReqTax applicationRewardReqTax = new ApplicationRewardReqTax(db);
			applicationRewardReqTax = applicationRewardReqTax.findByPk(new Long(id));
			if( applicationRewardReqTax!=null ){
				request.setAttribute("applicationRewardReqTax", applicationRewardReqTax);
			}else{
				formHandler.setFormMessage("Error : Not Found with id "+ id );
			}
		}else{
			formHandler.setFormMessage("Error : Please Enter id");
		}
		forward("?page=/web/applicationRewardReqTaxView.jsp");
	}

	// update
	public void edit(HttpServletRequest request,HttpServletResponse response)throws Exception {
		String id =  request.getParameter("id");
		if( id!=null && !id.trim().equals("") ){
			ApplicationRewardReqTax applicationRewardReqTax =new ApplicationRewardReqTax(db);
			applicationRewardReqTax = applicationRewardReqTax.findByPk(new Long(id));
			if( applicationRewardReqTax!=null ){
				request.setAttribute("applicationRewardReqTax", applicationRewardReqTax);
			}else{
				formHandler.setFormMessage("Error : Not Found with id "+ id );
			}
		}
		forward("?page=/web/applicationRewardReqTaxEdit.jsp");
	}
	public void update(HttpServletRequest request,HttpServletResponse response)throws Exception {
		ApplicationRewardReqTax applicationRewardReqTax = new ApplicationRewardReqTax(db);
		bindForm(applicationRewardReqTax);
		applicationRewardReqTax = applicationRewardReqTax.update();
		if( applicationRewardReqTax!=null ){
			request.setAttribute("applicationRewardReqTax", applicationRewardReqTax);
			formHandler.setFormMessage("Update Completed");
		}else{
			formHandler.setFormMessage("Update Failed");
		}
		forward("?page=/web/applicationRewardReqTaxEdit.jsp");
	}

	// delete
	public void delete(HttpServletRequest request,HttpServletResponse response)throws Exception {
		String[] ids =  request.getParameterValues("id");
		if( ids!=null && ids.length>0 ){
			ApplicationRewardReqTax applicationRewardReqTax = new ApplicationRewardReqTax(db);
			List<Long> idList = new ArrayList<Long>();
			for( int i=0;i<ids.length;i++ )
				idList.add(new Long(ids[i]));
			int deleteRow = applicationRewardReqTax.deleteByPks(idList);
			formHandler.setFormMessage(" Delete "+deleteRow+" Row Completed ");
		}else{
			formHandler.setFormMessage("Plese Select At Least One For Delete");
		}
		redirect("process2?action=ApplicationRewardReqTax&cmd=list");
	}
}