








 

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
import com.ko.domain.SizePackage;

public class SizePackageAction extends BaseAction{
	@Override
	public void _default(HttpServletRequest request, HttpServletResponse response) throws Exception {
		// TODO Auto-generated method stub
	}
	// list
	public void list(HttpServletRequest request,HttpServletResponse response)throws Exception {
		SizePackage sizePackage =new SizePackage(db);
		// pageUtil.setPageSize(15);
		Integer totalRow = sizePackage.countAll();

		// set TotalRow
		pageUtil.setTotalRow(totalRow);
		List<SizePackage> sizePackages = sizePackage.findAll(pageUtil);

		//	for data to display
		request.setAttribute("sizePackages", sizePackages);

		//	for screen to show
		forward("?page=/web/sizePackageList.jsp");
	}

	//	 create
	public void add(HttpServletRequest request,HttpServletResponse response)throws Exception {
		forward("?page=/web/sizePackageCreate.jsp");
	}
	public void create(HttpServletRequest request,HttpServletResponse response)throws Exception {
		SizePackage sizePackage = new SizePackage(db);
		bindForm(sizePackage);
		sizePackage = sizePackage.create();
		if( sizePackage!= null )
			formHandler.setFormMessage("Create Completed ,view <a href='process2?action=SizePackage&cmd=view&id="+sizePackage.getId()+"' target='_blank'>new Record</a>");
		else
			formHandler.setFormMessage("Create Not Complete");
		redirect("process2?action=SizePackage&cmd=add");
	}

	// view
	public void view(HttpServletRequest request,HttpServletResponse response)throws Exception {
		String id =  request.getParameter("id");
		if( id!=null && !id.trim().equals("") ){
			SizePackage sizePackage = new SizePackage(db);
			sizePackage = sizePackage.findByPk(new Long(id));
			if( sizePackage!=null ){
				request.setAttribute("sizePackage", sizePackage);
			}else{
				formHandler.setFormMessage("Error : Not Found with id "+ id );
			}
		}else{
			formHandler.setFormMessage("Error : Please Enter id");
		}
		forward("?page=/web/sizePackageView.jsp");
	}

	// update
	public void edit(HttpServletRequest request,HttpServletResponse response)throws Exception {
		String id =  request.getParameter("id");
		if( id!=null && !id.trim().equals("") ){
			SizePackage sizePackage =new SizePackage(db);
			sizePackage = sizePackage.findByPk(new Long(id));
			if( sizePackage!=null ){
				request.setAttribute("sizePackage", sizePackage);
			}else{
				formHandler.setFormMessage("Error : Not Found with id "+ id );
			}
		}
		forward("?page=/web/sizePackageEdit.jsp");
	}
	public void update(HttpServletRequest request,HttpServletResponse response)throws Exception {
		SizePackage sizePackage = new SizePackage(db);
		bindForm(sizePackage);
		sizePackage = sizePackage.update();
		if( sizePackage!=null ){
			request.setAttribute("sizePackage", sizePackage);
			formHandler.setFormMessage("Update Completed");
		}else{
			formHandler.setFormMessage("Update Failed");
		}
		forward("?page=/web/sizePackageEdit.jsp");
	}

	// delete
	public void delete(HttpServletRequest request,HttpServletResponse response)throws Exception {
		String[] ids =  request.getParameterValues("id");
		if( ids!=null && ids.length>0 ){
			SizePackage sizePackage = new SizePackage(db);
			List<Long> idList = new ArrayList<Long>();
			for( int i=0;i<ids.length;i++ )
				idList.add(new Long(ids[i]));
			int deleteRow = sizePackage.deleteByPks(idList);
			formHandler.setFormMessage(" Delete "+deleteRow+" Row Completed ");
		}else{
			formHandler.setFormMessage("Plese Select At Least One For Delete");
		}
		redirect("process2?action=SizePackage&cmd=list");
	}
}