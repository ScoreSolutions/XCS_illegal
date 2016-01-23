








 

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
import com.ko.domain.AppReqApproveCompare;

public class AppReqApproveCompareAction extends BaseAction{
	@Override
	public void _default(HttpServletRequest request, HttpServletResponse response) throws Exception {
		// TODO Auto-generated method stub
	}
	// list
	public void list(HttpServletRequest request,HttpServletResponse response)throws Exception {
		AppReqApproveCompare appReqApproveCompare =new AppReqApproveCompare(db);
		// pageUtil.setPageSize(15);
		Integer totalRow = appReqApproveCompare.countAll();

		// set TotalRow
		pageUtil.setTotalRow(totalRow);
		List<AppReqApproveCompare> appReqApproveCompares = appReqApproveCompare.findAll(pageUtil);

		//	for data to display
		request.setAttribute("appReqApproveCompares", appReqApproveCompares);

		//	for screen to show
		forward("?page=/web/appReqApproveCompareList.jsp");
	}

	//	 create
	public void add(HttpServletRequest request,HttpServletResponse response)throws Exception {
		forward("?page=/web/appReqApproveCompareCreate.jsp");
	}
	public void create(HttpServletRequest request,HttpServletResponse response)throws Exception {
		AppReqApproveCompare appReqApproveCompare = new AppReqApproveCompare(db);
		bindForm(appReqApproveCompare);
		appReqApproveCompare = appReqApproveCompare.create();
		if( appReqApproveCompare!= null )
			formHandler.setFormMessage("Create Completed ,view <a href='process2?action=AppReqApproveCompare&cmd=view&id="+appReqApproveCompare.getId()+"' target='_blank'>new Record</a>");
		else
			formHandler.setFormMessage("Create Not Complete");
		redirect("process2?action=AppReqApproveCompare&cmd=add");
	}

	// view
	public void view(HttpServletRequest request,HttpServletResponse response)throws Exception {
		String id =  request.getParameter("id");
		if( id!=null && !id.trim().equals("") ){
			AppReqApproveCompare appReqApproveCompare = new AppReqApproveCompare(db);
			appReqApproveCompare = appReqApproveCompare.findByPk(new Long(id));
			if( appReqApproveCompare!=null ){
				request.setAttribute("appReqApproveCompare", appReqApproveCompare);
			}else{
				formHandler.setFormMessage("Error : Not Found with id "+ id );
			}
		}else{
			formHandler.setFormMessage("Error : Please Enter id");
		}
		forward("?page=/web/appReqApproveCompareView.jsp");
	}

	// update
	public void edit(HttpServletRequest request,HttpServletResponse response)throws Exception {
		String id =  request.getParameter("id");
		if( id!=null && !id.trim().equals("") ){
			AppReqApproveCompare appReqApproveCompare =new AppReqApproveCompare(db);
			appReqApproveCompare = appReqApproveCompare.findByPk(new Long(id));
			if( appReqApproveCompare!=null ){
				request.setAttribute("appReqApproveCompare", appReqApproveCompare);
			}else{
				formHandler.setFormMessage("Error : Not Found with id "+ id );
			}
		}
		forward("?page=/web/appReqApproveCompareEdit.jsp");
	}
	public void update(HttpServletRequest request,HttpServletResponse response)throws Exception {
		AppReqApproveCompare appReqApproveCompare = new AppReqApproveCompare(db);
		bindForm(appReqApproveCompare);
		appReqApproveCompare = appReqApproveCompare.update();
		if( appReqApproveCompare!=null ){
			request.setAttribute("appReqApproveCompare", appReqApproveCompare);
			formHandler.setFormMessage("Update Completed");
		}else{
			formHandler.setFormMessage("Update Failed");
		}
		forward("?page=/web/appReqApproveCompareEdit.jsp");
	}

	// delete
	public void delete(HttpServletRequest request,HttpServletResponse response)throws Exception {
		String[] ids =  request.getParameterValues("id");
		if( ids!=null && ids.length>0 ){
			AppReqApproveCompare appReqApproveCompare = new AppReqApproveCompare(db);
			List<Long> idList = new ArrayList<Long>();
			for( int i=0;i<ids.length;i++ )
				idList.add(new Long(ids[i]));
			int deleteRow = appReqApproveCompare.deleteByPks(idList);
			formHandler.setFormMessage(" Delete "+deleteRow+" Row Completed ");
		}else{
			formHandler.setFormMessage("Plese Select At Least One For Delete");
		}
		redirect("process2?action=AppReqApproveCompare&cmd=list");
	}
}