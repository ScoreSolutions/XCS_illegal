








 

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
import com.ko.domain.AppArrestProveExhibit;

public class AppArrestProveExhibitAction extends BaseAction{
	@Override
	public void _default(HttpServletRequest request, HttpServletResponse response) throws Exception {
		// TODO Auto-generated method stub
	}
	// list
	public void list(HttpServletRequest request,HttpServletResponse response)throws Exception {
		AppArrestProveExhibit appArrestProveExhibit =new AppArrestProveExhibit(db);
		// pageUtil.setPageSize(15);
		Integer totalRow = appArrestProveExhibit.countAll();

		// set TotalRow
		pageUtil.setTotalRow(totalRow);
		List<AppArrestProveExhibit> appArrestProveExhibits = appArrestProveExhibit.findAll(pageUtil);

		//	for data to display
		request.setAttribute("appArrestProveExhibits", appArrestProveExhibits);

		//	for screen to show
		forward("?page=/web/appArrestProveExhibitList.jsp");
	}

	//	 create
	public void add(HttpServletRequest request,HttpServletResponse response)throws Exception {
		forward("?page=/web/appArrestProveExhibitCreate.jsp");
	}
	public void create(HttpServletRequest request,HttpServletResponse response)throws Exception {
		AppArrestProveExhibit appArrestProveExhibit = new AppArrestProveExhibit(db);
		bindForm(appArrestProveExhibit);
		appArrestProveExhibit = appArrestProveExhibit.create();
		if( appArrestProveExhibit!= null )
			formHandler.setFormMessage("Create Completed ,view <a href='process2?action=AppArrestProveExhibit&cmd=view&id="+appArrestProveExhibit.getId()+"' target='_blank'>new Record</a>");
		else
			formHandler.setFormMessage("Create Not Complete");
		redirect("process2?action=AppArrestProveExhibit&cmd=add");
	}

	// view
	public void view(HttpServletRequest request,HttpServletResponse response)throws Exception {
		String id =  request.getParameter("id");
		if( id!=null && !id.trim().equals("") ){
			AppArrestProveExhibit appArrestProveExhibit = new AppArrestProveExhibit(db);
			appArrestProveExhibit = appArrestProveExhibit.findByPk(new Long(id));
			if( appArrestProveExhibit!=null ){
				request.setAttribute("appArrestProveExhibit", appArrestProveExhibit);
			}else{
				formHandler.setFormMessage("Error : Not Found with id "+ id );
			}
		}else{
			formHandler.setFormMessage("Error : Please Enter id");
		}
		forward("?page=/web/appArrestProveExhibitView.jsp");
	}

	// update
	public void edit(HttpServletRequest request,HttpServletResponse response)throws Exception {
		String id =  request.getParameter("id");
		if( id!=null && !id.trim().equals("") ){
			AppArrestProveExhibit appArrestProveExhibit =new AppArrestProveExhibit(db);
			appArrestProveExhibit = appArrestProveExhibit.findByPk(new Long(id));
			if( appArrestProveExhibit!=null ){
				request.setAttribute("appArrestProveExhibit", appArrestProveExhibit);
			}else{
				formHandler.setFormMessage("Error : Not Found with id "+ id );
			}
		}
		forward("?page=/web/appArrestProveExhibitEdit.jsp");
	}
	public void update(HttpServletRequest request,HttpServletResponse response)throws Exception {
		AppArrestProveExhibit appArrestProveExhibit = new AppArrestProveExhibit(db);
		bindForm(appArrestProveExhibit);
		appArrestProveExhibit = appArrestProveExhibit.update();
		if( appArrestProveExhibit!=null ){
			request.setAttribute("appArrestProveExhibit", appArrestProveExhibit);
			formHandler.setFormMessage("Update Completed");
		}else{
			formHandler.setFormMessage("Update Failed");
		}
		forward("?page=/web/appArrestProveExhibitEdit.jsp");
	}

	// delete
	public void delete(HttpServletRequest request,HttpServletResponse response)throws Exception {
		String[] ids =  request.getParameterValues("id");
		if( ids!=null && ids.length>0 ){
			AppArrestProveExhibit appArrestProveExhibit = new AppArrestProveExhibit(db);
			List<Long> idList = new ArrayList<Long>();
			for( int i=0;i<ids.length;i++ )
				idList.add(new Long(ids[i]));
			int deleteRow = appArrestProveExhibit.deleteByPks(idList);
			formHandler.setFormMessage(" Delete "+deleteRow+" Row Completed ");
		}else{
			formHandler.setFormMessage("Plese Select At Least One For Delete");
		}
		redirect("process2?action=AppArrestProveExhibit&cmd=list");
	}
}