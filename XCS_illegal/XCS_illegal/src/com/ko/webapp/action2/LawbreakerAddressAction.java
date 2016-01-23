








 

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
import com.ko.domain.LawbreakerAddress;

public class LawbreakerAddressAction extends BaseAction{
	@Override
	public void _default(HttpServletRequest request, HttpServletResponse response) throws Exception {
		// TODO Auto-generated method stub
	}
	// list
	public void list(HttpServletRequest request,HttpServletResponse response)throws Exception {
		LawbreakerAddress lawbreakerAddress =new LawbreakerAddress(db);
		// pageUtil.setPageSize(15);
		Integer totalRow = lawbreakerAddress.countAll();

		// set TotalRow
		pageUtil.setTotalRow(totalRow);
		List<LawbreakerAddress> lawbreakerAddresss = lawbreakerAddress.findAll(pageUtil);

		//	for data to display
		request.setAttribute("lawbreakerAddresss", lawbreakerAddresss);

		//	for screen to show
		forward("?page=/web/lawbreakerAddressList.jsp");
	}

	//	 create
	public void add(HttpServletRequest request,HttpServletResponse response)throws Exception {
		forward("?page=/web/lawbreakerAddressCreate.jsp");
	}
	public void create(HttpServletRequest request,HttpServletResponse response)throws Exception {
		LawbreakerAddress lawbreakerAddress = new LawbreakerAddress(db);
		bindForm(lawbreakerAddress);
		lawbreakerAddress = lawbreakerAddress.create();
		if( lawbreakerAddress!= null )
			formHandler.setFormMessage("Create Completed ,view <a href='process2?action=LawbreakerAddress&cmd=view&id="+lawbreakerAddress.getId()+"' target='_blank'>new Record</a>");
		else
			formHandler.setFormMessage("Create Not Complete");
		redirect("process2?action=LawbreakerAddress&cmd=add");
	}

	// view
	public void view(HttpServletRequest request,HttpServletResponse response)throws Exception {
		String id =  request.getParameter("id");
		if( id!=null && !id.trim().equals("") ){
			LawbreakerAddress lawbreakerAddress = new LawbreakerAddress(db);
			lawbreakerAddress = lawbreakerAddress.findByPk(new Long(id));
			if( lawbreakerAddress!=null ){
				request.setAttribute("lawbreakerAddress", lawbreakerAddress);
			}else{
				formHandler.setFormMessage("Error : Not Found with id "+ id );
			}
		}else{
			formHandler.setFormMessage("Error : Please Enter id");
		}
		forward("?page=/web/lawbreakerAddressView.jsp");
	}

	// update
	public void edit(HttpServletRequest request,HttpServletResponse response)throws Exception {
		String id =  request.getParameter("id");
		if( id!=null && !id.trim().equals("") ){
			LawbreakerAddress lawbreakerAddress =new LawbreakerAddress(db);
			lawbreakerAddress = lawbreakerAddress.findByPk(new Long(id));
			if( lawbreakerAddress!=null ){
				request.setAttribute("lawbreakerAddress", lawbreakerAddress);
			}else{
				formHandler.setFormMessage("Error : Not Found with id "+ id );
			}
		}
		forward("?page=/web/lawbreakerAddressEdit.jsp");
	}
	public void update(HttpServletRequest request,HttpServletResponse response)throws Exception {
		LawbreakerAddress lawbreakerAddress = new LawbreakerAddress(db);
		bindForm(lawbreakerAddress);
		lawbreakerAddress = lawbreakerAddress.update();
		if( lawbreakerAddress!=null ){
			request.setAttribute("lawbreakerAddress", lawbreakerAddress);
			formHandler.setFormMessage("Update Completed");
		}else{
			formHandler.setFormMessage("Update Failed");
		}
		forward("?page=/web/lawbreakerAddressEdit.jsp");
	}

	// delete
	public void delete(HttpServletRequest request,HttpServletResponse response)throws Exception {
		String[] ids =  request.getParameterValues("id");
		if( ids!=null && ids.length>0 ){
			LawbreakerAddress lawbreakerAddress = new LawbreakerAddress(db);
			List<Long> idList = new ArrayList<Long>();
			for( int i=0;i<ids.length;i++ )
				idList.add(new Long(ids[i]));
			int deleteRow = lawbreakerAddress.deleteByPks(idList);
			formHandler.setFormMessage(" Delete "+deleteRow+" Row Completed ");
		}else{
			formHandler.setFormMessage("Plese Select At Least One For Delete");
		}
		redirect("process2?action=LawbreakerAddress&cmd=list");
	}
}