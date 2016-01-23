








 

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
import com.ko.domain.AppReqApproveCompareForm3;

public class AppReqApproveCompareForm3Action extends BaseAction{
	@Override
	public void _default(HttpServletRequest request, HttpServletResponse response) throws Exception {
		// TODO Auto-generated method stub
	}
	// list
	public void list(HttpServletRequest request,HttpServletResponse response)throws Exception {
		AppReqApproveCompareForm3 appReqApproveCompareForm3 =new AppReqApproveCompareForm3(db);
		// pageUtil.setPageSize(15);
		Integer totalRow = appReqApproveCompareForm3.countAll();

		// set TotalRow
		pageUtil.setTotalRow(totalRow);
		List<AppReqApproveCompareForm3> appReqApproveCompareForm3s = appReqApproveCompareForm3.findAll(pageUtil);

		//	for data to display
		request.setAttribute("appReqApproveCompareForm3s", appReqApproveCompareForm3s);

		//	for screen to show
		forward("?page=/web/appReqApproveCompareForm3List.jsp");
	}

	//	 create
	public void add(HttpServletRequest request,HttpServletResponse response)throws Exception {
		forward("?page=/web/appReqApproveCompareForm3Create.jsp");
	}
	public void create(HttpServletRequest request,HttpServletResponse response)throws Exception {
		AppReqApproveCompareForm3 appReqApproveCompareForm3 = new AppReqApproveCompareForm3(db);
		bindForm(appReqApproveCompareForm3);
		appReqApproveCompareForm3 = appReqApproveCompareForm3.create();
		if( appReqApproveCompareForm3!= null )
			formHandler.setFormMessage("Create Completed ,view <a href='process2?action=AppReqApproveCompareForm3&cmd=view&id="+appReqApproveCompareForm3.getId()+"' target='_blank'>new Record</a>");
		else
			formHandler.setFormMessage("Create Not Complete");
		redirect("process2?action=AppReqApproveCompareForm3&cmd=add");
	}

	// view
	public void view(HttpServletRequest request,HttpServletResponse response)throws Exception {
		String id =  request.getParameter("id");
		if( id!=null && !id.trim().equals("") ){
			AppReqApproveCompareForm3 appReqApproveCompareForm3 = new AppReqApproveCompareForm3(db);
			appReqApproveCompareForm3 = appReqApproveCompareForm3.findByPk(new Long(id));
			if( appReqApproveCompareForm3!=null ){
				request.setAttribute("appReqApproveCompareForm3", appReqApproveCompareForm3);
			}else{
				formHandler.setFormMessage("Error : Not Found with id "+ id );
			}
		}else{
			formHandler.setFormMessage("Error : Please Enter id");
		}
		forward("?page=/web/appReqApproveCompareForm3View.jsp");
	}

	// update
	public void edit(HttpServletRequest request,HttpServletResponse response)throws Exception {
		String id =  request.getParameter("id");
		if( id!=null && !id.trim().equals("") ){
			AppReqApproveCompareForm3 appReqApproveCompareForm3 =new AppReqApproveCompareForm3(db);
			appReqApproveCompareForm3 = appReqApproveCompareForm3.findByPk(new Long(id));
			if( appReqApproveCompareForm3!=null ){
				request.setAttribute("appReqApproveCompareForm3", appReqApproveCompareForm3);
			}else{
				formHandler.setFormMessage("Error : Not Found with id "+ id );
			}
		}
		forward("?page=/web/appReqApproveCompareForm3Edit.jsp");
	}
	public void update(HttpServletRequest request,HttpServletResponse response)throws Exception {
		AppReqApproveCompareForm3 appReqApproveCompareForm3 = new AppReqApproveCompareForm3(db);
		bindForm(appReqApproveCompareForm3);
		appReqApproveCompareForm3 = appReqApproveCompareForm3.update();
		if( appReqApproveCompareForm3!=null ){
			request.setAttribute("appReqApproveCompareForm3", appReqApproveCompareForm3);
			formHandler.setFormMessage("Update Completed");
		}else{
			formHandler.setFormMessage("Update Failed");
		}
		forward("?page=/web/appReqApproveCompareForm3Edit.jsp");
	}

	// delete
	public void delete(HttpServletRequest request,HttpServletResponse response)throws Exception {
		String[] ids =  request.getParameterValues("id");
		if( ids!=null && ids.length>0 ){
			AppReqApproveCompareForm3 appReqApproveCompareForm3 = new AppReqApproveCompareForm3(db);
			List<Long> idList = new ArrayList<Long>();
			for( int i=0;i<ids.length;i++ )
				idList.add(new Long(ids[i]));
			int deleteRow = appReqApproveCompareForm3.deleteByPks(idList);
			formHandler.setFormMessage(" Delete "+deleteRow+" Row Completed ");
		}else{
			formHandler.setFormMessage("Plese Select At Least One For Delete");
		}
		redirect("process2?action=AppReqApproveCompareForm3&cmd=list");
	}
}