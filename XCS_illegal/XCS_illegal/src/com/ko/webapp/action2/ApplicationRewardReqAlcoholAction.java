








 

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
import com.ko.domain.ApplicationRewardReqAlcohol;

public class ApplicationRewardReqAlcoholAction extends BaseAction{
	@Override
	public void _default(HttpServletRequest request, HttpServletResponse response) throws Exception {
		// TODO Auto-generated method stub
	}
	// list
	public void list(HttpServletRequest request,HttpServletResponse response)throws Exception {
		ApplicationRewardReqAlcohol applicationRewardReqAlcohol =new ApplicationRewardReqAlcohol(db);
		// pageUtil.setPageSize(15);
		Integer totalRow = applicationRewardReqAlcohol.countAll();

		// set TotalRow
		pageUtil.setTotalRow(totalRow);
		List<ApplicationRewardReqAlcohol> applicationRewardReqAlcohols = applicationRewardReqAlcohol.findAll(pageUtil);

		//	for data to display
		request.setAttribute("applicationRewardReqAlcohols", applicationRewardReqAlcohols);

		//	for screen to show
		forward("?page=/web/applicationRewardReqAlcoholList.jsp");
	}

	//	 create
	public void add(HttpServletRequest request,HttpServletResponse response)throws Exception {
		forward("?page=/web/applicationRewardReqAlcoholCreate.jsp");
	}
	public void create(HttpServletRequest request,HttpServletResponse response)throws Exception {
		ApplicationRewardReqAlcohol applicationRewardReqAlcohol = new ApplicationRewardReqAlcohol(db);
		bindForm(applicationRewardReqAlcohol);
		applicationRewardReqAlcohol = applicationRewardReqAlcohol.create();
		if( applicationRewardReqAlcohol!= null )
			formHandler.setFormMessage("Create Completed ,view <a href='process2?action=ApplicationRewardReqAlcohol&cmd=view&id="+applicationRewardReqAlcohol.getId()+"' target='_blank'>new Record</a>");
		else
			formHandler.setFormMessage("Create Not Complete");
		redirect("process2?action=ApplicationRewardReqAlcohol&cmd=add");
	}

	// view
	public void view(HttpServletRequest request,HttpServletResponse response)throws Exception {
		String id =  request.getParameter("id");
		if( id!=null && !id.trim().equals("") ){
			ApplicationRewardReqAlcohol applicationRewardReqAlcohol = new ApplicationRewardReqAlcohol(db);
			applicationRewardReqAlcohol = applicationRewardReqAlcohol.findByPk(new Long(id));
			if( applicationRewardReqAlcohol!=null ){
				request.setAttribute("applicationRewardReqAlcohol", applicationRewardReqAlcohol);
			}else{
				formHandler.setFormMessage("Error : Not Found with id "+ id );
			}
		}else{
			formHandler.setFormMessage("Error : Please Enter id");
		}
		forward("?page=/web/applicationRewardReqAlcoholView.jsp");
	}

	// update
	public void edit(HttpServletRequest request,HttpServletResponse response)throws Exception {
		String id =  request.getParameter("id");
		if( id!=null && !id.trim().equals("") ){
			ApplicationRewardReqAlcohol applicationRewardReqAlcohol =new ApplicationRewardReqAlcohol(db);
			applicationRewardReqAlcohol = applicationRewardReqAlcohol.findByPk(new Long(id));
			if( applicationRewardReqAlcohol!=null ){
				request.setAttribute("applicationRewardReqAlcohol", applicationRewardReqAlcohol);
			}else{
				formHandler.setFormMessage("Error : Not Found with id "+ id );
			}
		}
		forward("?page=/web/applicationRewardReqAlcoholEdit.jsp");
	}
	public void update(HttpServletRequest request,HttpServletResponse response)throws Exception {
		ApplicationRewardReqAlcohol applicationRewardReqAlcohol = new ApplicationRewardReqAlcohol(db);
		bindForm(applicationRewardReqAlcohol);
		applicationRewardReqAlcohol = applicationRewardReqAlcohol.update();
		if( applicationRewardReqAlcohol!=null ){
			request.setAttribute("applicationRewardReqAlcohol", applicationRewardReqAlcohol);
			formHandler.setFormMessage("Update Completed");
		}else{
			formHandler.setFormMessage("Update Failed");
		}
		forward("?page=/web/applicationRewardReqAlcoholEdit.jsp");
	}

	// delete
	public void delete(HttpServletRequest request,HttpServletResponse response)throws Exception {
		String[] ids =  request.getParameterValues("id");
		if( ids!=null && ids.length>0 ){
			ApplicationRewardReqAlcohol applicationRewardReqAlcohol = new ApplicationRewardReqAlcohol(db);
			List<Long> idList = new ArrayList<Long>();
			for( int i=0;i<ids.length;i++ )
				idList.add(new Long(ids[i]));
			int deleteRow = applicationRewardReqAlcohol.deleteByPks(idList);
			formHandler.setFormMessage(" Delete "+deleteRow+" Row Completed ");
		}else{
			formHandler.setFormMessage("Plese Select At Least One For Delete");
		}
		redirect("process2?action=ApplicationRewardReqAlcohol&cmd=list");
	}
}