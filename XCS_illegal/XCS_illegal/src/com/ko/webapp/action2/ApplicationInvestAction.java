








 

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
import com.ko.domain.ApplicationInvest;

public class ApplicationInvestAction extends BaseAction{
	@Override
	public void _default(HttpServletRequest request, HttpServletResponse response) throws Exception {
		// TODO Auto-generated method stub
	}
	// list
	public void list(HttpServletRequest request,HttpServletResponse response)throws Exception {
		ApplicationInvest applicationInvest =new ApplicationInvest(db);
		// pageUtil.setPageSize(15);
		Integer totalRow = applicationInvest.countAll();

		// set TotalRow
		pageUtil.setTotalRow(totalRow);
		List<ApplicationInvest> applicationInvests = applicationInvest.findAll(pageUtil);

		//	for data to display
		request.setAttribute("applicationInvests", applicationInvests);

		//	for screen to show
		forward("?page=/web/applicationInvestList.jsp");
	}

	//	 create
	public void add(HttpServletRequest request,HttpServletResponse response)throws Exception {
		forward("?page=/web/applicationInvestCreate.jsp");
	}
	public void create(HttpServletRequest request,HttpServletResponse response)throws Exception {
		ApplicationInvest applicationInvest = new ApplicationInvest(db);
		bindForm(applicationInvest);
		applicationInvest = applicationInvest.create();
		if( applicationInvest!= null )
			formHandler.setFormMessage("Create Completed ,view <a href='process2?action=ApplicationInvest&cmd=view&id="+applicationInvest.getId()+"' target='_blank'>new Record</a>");
		else
			formHandler.setFormMessage("Create Not Complete");
		redirect("process2?action=ApplicationInvest&cmd=add");
	}

	// view
	public void view(HttpServletRequest request,HttpServletResponse response)throws Exception {
		String id =  request.getParameter("id");
		if( id!=null && !id.trim().equals("") ){
			ApplicationInvest applicationInvest = new ApplicationInvest(db);
			applicationInvest = applicationInvest.findByPk(new Long(id));
			if( applicationInvest!=null ){
				request.setAttribute("applicationInvest", applicationInvest);
			}else{
				formHandler.setFormMessage("Error : Not Found with id "+ id );
			}
		}else{
			formHandler.setFormMessage("Error : Please Enter id");
		}
		forward("?page=/web/applicationInvestView.jsp");
	}

	// update
	public void edit(HttpServletRequest request,HttpServletResponse response)throws Exception {
		String id =  request.getParameter("id");
		if( id!=null && !id.trim().equals("") ){
			ApplicationInvest applicationInvest =new ApplicationInvest(db);
			applicationInvest = applicationInvest.findByPk(new Long(id));
			if( applicationInvest!=null ){
				request.setAttribute("applicationInvest", applicationInvest);
			}else{
				formHandler.setFormMessage("Error : Not Found with id "+ id );
			}
		}
		forward("?page=/web/applicationInvestEdit.jsp");
	}
	public void update(HttpServletRequest request,HttpServletResponse response)throws Exception {
		ApplicationInvest applicationInvest = new ApplicationInvest(db);
		bindForm(applicationInvest);
		applicationInvest = applicationInvest.update();
		if( applicationInvest!=null ){
			request.setAttribute("applicationInvest", applicationInvest);
			formHandler.setFormMessage("Update Completed");
		}else{
			formHandler.setFormMessage("Update Failed");
		}
		forward("?page=/web/applicationInvestEdit.jsp");
	}

	// delete
	public void delete(HttpServletRequest request,HttpServletResponse response)throws Exception {
		String[] ids =  request.getParameterValues("id");
		if( ids!=null && ids.length>0 ){
			ApplicationInvest applicationInvest = new ApplicationInvest(db);
			List<Long> idList = new ArrayList<Long>();
			for( int i=0;i<ids.length;i++ )
				idList.add(new Long(ids[i]));
			int deleteRow = applicationInvest.deleteByPks(idList);
			formHandler.setFormMessage(" Delete "+deleteRow+" Row Completed ");
		}else{
			formHandler.setFormMessage("Plese Select At Least One For Delete");
		}
		redirect("process2?action=ApplicationInvest&cmd=list");
	}
}