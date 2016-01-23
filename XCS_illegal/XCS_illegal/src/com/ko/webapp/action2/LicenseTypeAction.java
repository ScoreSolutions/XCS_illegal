








 

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
import com.ko.domain.LicenseType;

public class LicenseTypeAction extends BaseAction{
	@Override
	public void _default(HttpServletRequest request, HttpServletResponse response) throws Exception {
		// TODO Auto-generated method stub
	}
	// list
	public void list(HttpServletRequest request,HttpServletResponse response)throws Exception {
		LicenseType licenseType =new LicenseType(db);
		// pageUtil.setPageSize(15);
		Integer totalRow = licenseType.countAll();

		// set TotalRow
		pageUtil.setTotalRow(totalRow);
		List<LicenseType> licenseTypes = licenseType.findAll(pageUtil);

		//	for data to display
		request.setAttribute("licenseTypes", licenseTypes);

		//	for screen to show
		forward("?page=/web/licenseTypeList.jsp");
	}

	//	 create
	public void add(HttpServletRequest request,HttpServletResponse response)throws Exception {
		forward("?page=/web/licenseTypeCreate.jsp");
	}
	public void create(HttpServletRequest request,HttpServletResponse response)throws Exception {
		LicenseType licenseType = new LicenseType(db);
		bindForm(licenseType);
		licenseType = licenseType.create();
		if( licenseType!= null )
			formHandler.setFormMessage("Create Completed ,view <a href='process2?action=LicenseType&cmd=view&id="+licenseType.getId()+"' target='_blank'>new Record</a>");
		else
			formHandler.setFormMessage("Create Not Complete");
		redirect("process2?action=LicenseType&cmd=add");
	}

	// view
	public void view(HttpServletRequest request,HttpServletResponse response)throws Exception {
		String id =  request.getParameter("id");
		if( id!=null && !id.trim().equals("") ){
			LicenseType licenseType = new LicenseType(db);
			licenseType = licenseType.findByPk(new Long(id));
			if( licenseType!=null ){
				request.setAttribute("licenseType", licenseType);
			}else{
				formHandler.setFormMessage("Error : Not Found with id "+ id );
			}
		}else{
			formHandler.setFormMessage("Error : Please Enter id");
		}
		forward("?page=/web/licenseTypeView.jsp");
	}

	// update
	public void edit(HttpServletRequest request,HttpServletResponse response)throws Exception {
		String id =  request.getParameter("id");
		if( id!=null && !id.trim().equals("") ){
			LicenseType licenseType =new LicenseType(db);
			licenseType = licenseType.findByPk(new Long(id));
			if( licenseType!=null ){
				request.setAttribute("licenseType", licenseType);
			}else{
				formHandler.setFormMessage("Error : Not Found with id "+ id );
			}
		}
		forward("?page=/web/licenseTypeEdit.jsp");
	}
	public void update(HttpServletRequest request,HttpServletResponse response)throws Exception {
		LicenseType licenseType = new LicenseType(db);
		bindForm(licenseType);
		licenseType = licenseType.update();
		if( licenseType!=null ){
			request.setAttribute("licenseType", licenseType);
			formHandler.setFormMessage("Update Completed");
		}else{
			formHandler.setFormMessage("Update Failed");
		}
		forward("?page=/web/licenseTypeEdit.jsp");
	}

	// delete
	public void delete(HttpServletRequest request,HttpServletResponse response)throws Exception {
		String[] ids =  request.getParameterValues("id");
		if( ids!=null && ids.length>0 ){
			LicenseType licenseType = new LicenseType(db);
			List<Long> idList = new ArrayList<Long>();
			for( int i=0;i<ids.length;i++ )
				idList.add(new Long(ids[i]));
			int deleteRow = licenseType.deleteByPks(idList);
			formHandler.setFormMessage(" Delete "+deleteRow+" Row Completed ");
		}else{
			formHandler.setFormMessage("Plese Select At Least One For Delete");
		}
		redirect("process2?action=LicenseType&cmd=list");
	}
}