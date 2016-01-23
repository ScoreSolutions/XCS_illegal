








 

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
import com.ko.domain.Sysconfig;

public class SysconfigAction extends BaseAction{
	@Override
	public void _default(HttpServletRequest request, HttpServletResponse response) throws Exception {
		// TODO Auto-generated method stub
	}
	// list
	public void list(HttpServletRequest request,HttpServletResponse response)throws Exception {
		Sysconfig sysconfig =new Sysconfig(db);
		// pageUtil.setPageSize(15);
		Integer totalRow = sysconfig.countAll();

		// set TotalRow
		pageUtil.setTotalRow(totalRow);
		List<Sysconfig> sysconfigs = sysconfig.findAll(pageUtil);

		//	for data to display
		request.setAttribute("sysconfigs", sysconfigs);

		//	for screen to show
		forward("?page=/web/sysconfigList.jsp");
	}

	//	 create
	public void add(HttpServletRequest request,HttpServletResponse response)throws Exception {
		forward("?page=/web/sysconfigCreate.jsp");
	}
	public void create(HttpServletRequest request,HttpServletResponse response)throws Exception {
		Sysconfig sysconfig = new Sysconfig(db);
		bindForm(sysconfig);
		sysconfig = sysconfig.create();
		if( sysconfig!= null )
			formHandler.setFormMessage("Create Completed ,view <a href='process2?action=Sysconfig&cmd=view&id="+sysconfig.getId()+"' target='_blank'>new Record</a>");
		else
			formHandler.setFormMessage("Create Not Complete");
		redirect("process2?action=Sysconfig&cmd=add");
	}

	// view
	public void view(HttpServletRequest request,HttpServletResponse response)throws Exception {
		String id =  request.getParameter("id");
		if( id!=null && !id.trim().equals("") ){
			Sysconfig sysconfig = new Sysconfig(db);
			sysconfig = sysconfig.findByPk(new Long(id));
			if( sysconfig!=null ){
				request.setAttribute("sysconfig", sysconfig);
			}else{
				formHandler.setFormMessage("Error : Not Found with id "+ id );
			}
		}else{
			formHandler.setFormMessage("Error : Please Enter id");
		}
		forward("?page=/web/sysconfigView.jsp");
	}

	// update
	public void edit(HttpServletRequest request,HttpServletResponse response)throws Exception {
		String id =  request.getParameter("id");
		if( id!=null && !id.trim().equals("") ){
			Sysconfig sysconfig =new Sysconfig(db);
			sysconfig = sysconfig.findByPk(new Long(id));
			if( sysconfig!=null ){
				request.setAttribute("sysconfig", sysconfig);
			}else{
				formHandler.setFormMessage("Error : Not Found with id "+ id );
			}
		}
		forward("?page=/web/sysconfigEdit.jsp");
	}
	public void update(HttpServletRequest request,HttpServletResponse response)throws Exception {
		Sysconfig sysconfig = new Sysconfig(db);
		bindForm(sysconfig);
		sysconfig = sysconfig.update();
		if( sysconfig!=null ){
			request.setAttribute("sysconfig", sysconfig);
			formHandler.setFormMessage("Update Completed");
		}else{
			formHandler.setFormMessage("Update Failed");
		}
		forward("?page=/web/sysconfigEdit.jsp");
	}

	// delete
	public void delete(HttpServletRequest request,HttpServletResponse response)throws Exception {
		String[] ids =  request.getParameterValues("id");
		if( ids!=null && ids.length>0 ){
			Sysconfig sysconfig = new Sysconfig(db);
			List<Long> idList = new ArrayList<Long>();
			for( int i=0;i<ids.length;i++ )
				idList.add(new Long(ids[i]));
			int deleteRow = sysconfig.deleteByPks(idList);
			formHandler.setFormMessage(" Delete "+deleteRow+" Row Completed ");
		}else{
			formHandler.setFormMessage("Plese Select At Least One For Delete");
		}
		redirect("process2?action=Sysconfig&cmd=list");
	}
}