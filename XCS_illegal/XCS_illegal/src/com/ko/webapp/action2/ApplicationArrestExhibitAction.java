








 

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
import com.ko.domain.ApplicationArrestExhibit;

public class ApplicationArrestExhibitAction extends BaseAction{
	@Override
	public void _default(HttpServletRequest request, HttpServletResponse response) throws Exception {
		// TODO Auto-generated method stub
	}
	// list
	public void list(HttpServletRequest request,HttpServletResponse response)throws Exception {
		ApplicationArrestExhibit applicationArrestExhibit =new ApplicationArrestExhibit(db);
		// pageUtil.setPageSize(15);
		Integer totalRow = applicationArrestExhibit.countAll();

		// set TotalRow
		pageUtil.setTotalRow(totalRow);
		List<ApplicationArrestExhibit> applicationArrestExhibits = applicationArrestExhibit.findAll(pageUtil);

		//	for data to display
		request.setAttribute("applicationArrestExhibits", applicationArrestExhibits);

		//	for screen to show
		forward("?page=/web/applicationArrestExhibitList.jsp");
	}

	//	 create
	public void add(HttpServletRequest request,HttpServletResponse response)throws Exception {
		forward("?page=/web/applicationArrestExhibitCreate.jsp");
	}
	public void create(HttpServletRequest request,HttpServletResponse response)throws Exception {
		ApplicationArrestExhibit applicationArrestExhibit = new ApplicationArrestExhibit(db);
		bindForm(applicationArrestExhibit);
		applicationArrestExhibit = applicationArrestExhibit.create();
		if( applicationArrestExhibit!= null )
			formHandler.setFormMessage("Create Completed ,view <a href='process2?action=ApplicationArrestExhibit&cmd=view&id="+applicationArrestExhibit.getId()+"' target='_blank'>new Record</a>");
		else
			formHandler.setFormMessage("Create Not Complete");
		redirect("process2?action=ApplicationArrestExhibit&cmd=add");
	}

	// view
	public void view(HttpServletRequest request,HttpServletResponse response)throws Exception {
		String id =  request.getParameter("id");
		if( id!=null && !id.trim().equals("") ){
			ApplicationArrestExhibit applicationArrestExhibit = new ApplicationArrestExhibit(db);
			applicationArrestExhibit = applicationArrestExhibit.findByPk(new Long(id));
			if( applicationArrestExhibit!=null ){
				request.setAttribute("applicationArrestExhibit", applicationArrestExhibit);
			}else{
				formHandler.setFormMessage("Error : Not Found with id "+ id );
			}
		}else{
			formHandler.setFormMessage("Error : Please Enter id");
		}
		forward("?page=/web/applicationArrestExhibitView.jsp");
	}

	// update
	public void edit(HttpServletRequest request,HttpServletResponse response)throws Exception {
		String id =  request.getParameter("id");
		if( id!=null && !id.trim().equals("") ){
			ApplicationArrestExhibit applicationArrestExhibit =new ApplicationArrestExhibit(db);
			applicationArrestExhibit = applicationArrestExhibit.findByPk(new Long(id));
			if( applicationArrestExhibit!=null ){
				request.setAttribute("applicationArrestExhibit", applicationArrestExhibit);
			}else{
				formHandler.setFormMessage("Error : Not Found with id "+ id );
			}
		}
		forward("?page=/web/applicationArrestExhibitEdit.jsp");
	}
	public void update(HttpServletRequest request,HttpServletResponse response)throws Exception {
		ApplicationArrestExhibit applicationArrestExhibit = new ApplicationArrestExhibit(db);
		bindForm(applicationArrestExhibit);
		applicationArrestExhibit = applicationArrestExhibit.update();
		if( applicationArrestExhibit!=null ){
			request.setAttribute("applicationArrestExhibit", applicationArrestExhibit);
			formHandler.setFormMessage("Update Completed");
		}else{
			formHandler.setFormMessage("Update Failed");
		}
		forward("?page=/web/applicationArrestExhibitEdit.jsp");
	}

	// delete
	public void delete(HttpServletRequest request,HttpServletResponse response)throws Exception {
		String[] ids =  request.getParameterValues("id");
		if( ids!=null && ids.length>0 ){
			ApplicationArrestExhibit applicationArrestExhibit = new ApplicationArrestExhibit(db);
			List<Long> idList = new ArrayList<Long>();
			for( int i=0;i<ids.length;i++ )
				idList.add(new Long(ids[i]));
			int deleteRow = applicationArrestExhibit.deleteByPks(idList);
			formHandler.setFormMessage(" Delete "+deleteRow+" Row Completed ");
		}else{
			formHandler.setFormMessage("Plese Select At Least One For Delete");
		}
		redirect("process2?action=ApplicationArrestExhibit&cmd=list");
	}
}