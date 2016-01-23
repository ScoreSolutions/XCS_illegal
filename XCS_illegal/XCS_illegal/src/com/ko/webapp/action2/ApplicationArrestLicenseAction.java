








 

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
import com.ko.domain.ApplicationArrestLicense;

public class ApplicationArrestLicenseAction extends BaseAction{
	@Override
	public void _default(HttpServletRequest request, HttpServletResponse response) throws Exception {
		// TODO Auto-generated method stub
	}
	// list
	public void list(HttpServletRequest request,HttpServletResponse response)throws Exception {
		ApplicationArrestLicense applicationArrestLicense =new ApplicationArrestLicense(db);
		// pageUtil.setPageSize(15);
		Integer totalRow = applicationArrestLicense.countAll();

		// set TotalRow
		pageUtil.setTotalRow(totalRow);
		List<ApplicationArrestLicense> applicationArrestLicenses = applicationArrestLicense.findAll(pageUtil);

		//	for data to display
		request.setAttribute("applicationArrestLicenses", applicationArrestLicenses);

		//	for screen to show
		forward("?page=/web/applicationArrestLicenseList.jsp");
	}

	//	 create
	public void add(HttpServletRequest request,HttpServletResponse response)throws Exception {
		forward("?page=/web/applicationArrestLicenseCreate.jsp");
	}
	public void create(HttpServletRequest request,HttpServletResponse response)throws Exception {
		ApplicationArrestLicense applicationArrestLicense = new ApplicationArrestLicense(db);
		bindForm(applicationArrestLicense);
		applicationArrestLicense = applicationArrestLicense.create();
		if( applicationArrestLicense!= null )
			formHandler.setFormMessage("Create Completed ,view <a href='process2?action=ApplicationArrestLicense&cmd=view&id="+applicationArrestLicense.getId()+"' target='_blank'>new Record</a>");
		else
			formHandler.setFormMessage("Create Not Complete");
		redirect("process2?action=ApplicationArrestLicense&cmd=add");
	}

	// view
	public void view(HttpServletRequest request,HttpServletResponse response)throws Exception {
		String id =  request.getParameter("id");
		if( id!=null && !id.trim().equals("") ){
			ApplicationArrestLicense applicationArrestLicense = new ApplicationArrestLicense(db);
			applicationArrestLicense = applicationArrestLicense.findByPk(new Long(id));
			if( applicationArrestLicense!=null ){
				request.setAttribute("applicationArrestLicense", applicationArrestLicense);
			}else{
				formHandler.setFormMessage("Error : Not Found with id "+ id );
			}
		}else{
			formHandler.setFormMessage("Error : Please Enter id");
		}
		forward("?page=/web/applicationArrestLicenseView.jsp");
	}

	// update
	public void edit(HttpServletRequest request,HttpServletResponse response)throws Exception {
		String id =  request.getParameter("id");
		if( id!=null && !id.trim().equals("") ){
			ApplicationArrestLicense applicationArrestLicense =new ApplicationArrestLicense(db);
			applicationArrestLicense = applicationArrestLicense.findByPk(new Long(id));
			if( applicationArrestLicense!=null ){
				request.setAttribute("applicationArrestLicense", applicationArrestLicense);
			}else{
				formHandler.setFormMessage("Error : Not Found with id "+ id );
			}
		}
		forward("?page=/web/applicationArrestLicenseEdit.jsp");
	}
	public void update(HttpServletRequest request,HttpServletResponse response)throws Exception {
		ApplicationArrestLicense applicationArrestLicense = new ApplicationArrestLicense(db);
		bindForm(applicationArrestLicense);
		applicationArrestLicense = applicationArrestLicense.update();
		if( applicationArrestLicense!=null ){
			request.setAttribute("applicationArrestLicense", applicationArrestLicense);
			formHandler.setFormMessage("Update Completed");
		}else{
			formHandler.setFormMessage("Update Failed");
		}
		forward("?page=/web/applicationArrestLicenseEdit.jsp");
	}

	// delete
	public void delete(HttpServletRequest request,HttpServletResponse response)throws Exception {
		String[] ids =  request.getParameterValues("id");
		if( ids!=null && ids.length>0 ){
			ApplicationArrestLicense applicationArrestLicense = new ApplicationArrestLicense(db);
			List<Long> idList = new ArrayList<Long>();
			for( int i=0;i<ids.length;i++ )
				idList.add(new Long(ids[i]));
			int deleteRow = applicationArrestLicense.deleteByPks(idList);
			formHandler.setFormMessage(" Delete "+deleteRow+" Row Completed ");
		}else{
			formHandler.setFormMessage("Plese Select At Least One For Delete");
		}
		redirect("process2?action=ApplicationArrestLicense&cmd=list");
	}
}