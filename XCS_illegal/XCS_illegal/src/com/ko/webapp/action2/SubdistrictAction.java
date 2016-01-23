








 

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
import com.ko.domain.Subdistrict;

public class SubdistrictAction extends BaseAction{
	@Override
	public void _default(HttpServletRequest request, HttpServletResponse response) throws Exception {
		// TODO Auto-generated method stub
	}
	// list
	public void list(HttpServletRequest request,HttpServletResponse response)throws Exception {
		Subdistrict subdistrict =new Subdistrict(db);
		// pageUtil.setPageSize(15);
		Integer totalRow = subdistrict.countAll();

		// set TotalRow
		pageUtil.setTotalRow(totalRow);
		List<Subdistrict> subdistricts = subdistrict.findAll(pageUtil);

		//	for data to display
		request.setAttribute("subdistricts", subdistricts);

		//	for screen to show
		forward("?page=/web/subdistrictList.jsp");
	}

	//	 create
	public void add(HttpServletRequest request,HttpServletResponse response)throws Exception {
		forward("?page=/web/subdistrictCreate.jsp");
	}
	public void create(HttpServletRequest request,HttpServletResponse response)throws Exception {
		Subdistrict subdistrict = new Subdistrict(db);
		bindForm(subdistrict);
		subdistrict = subdistrict.create();
		if( subdistrict!= null )
			formHandler.setFormMessage("Create Completed ,view <a href='process2?action=Subdistrict&cmd=view&id="+subdistrict.getId()+"' target='_blank'>new Record</a>");
		else
			formHandler.setFormMessage("Create Not Complete");
		redirect("process2?action=Subdistrict&cmd=add");
	}

	// view
	public void view(HttpServletRequest request,HttpServletResponse response)throws Exception {
		String id =  request.getParameter("id");
		if( id!=null && !id.trim().equals("") ){
			Subdistrict subdistrict = new Subdistrict(db);
			subdistrict = subdistrict.findByPk(new Long(id));
			if( subdistrict!=null ){
				request.setAttribute("subdistrict", subdistrict);
			}else{
				formHandler.setFormMessage("Error : Not Found with id "+ id );
			}
		}else{
			formHandler.setFormMessage("Error : Please Enter id");
		}
		forward("?page=/web/subdistrictView.jsp");
	}

	// update
	public void edit(HttpServletRequest request,HttpServletResponse response)throws Exception {
		String id =  request.getParameter("id");
		if( id!=null && !id.trim().equals("") ){
			Subdistrict subdistrict =new Subdistrict(db);
			subdistrict = subdistrict.findByPk(new Long(id));
			if( subdistrict!=null ){
				request.setAttribute("subdistrict", subdistrict);
			}else{
				formHandler.setFormMessage("Error : Not Found with id "+ id );
			}
		}
		forward("?page=/web/subdistrictEdit.jsp");
	}
	public void update(HttpServletRequest request,HttpServletResponse response)throws Exception {
		Subdistrict subdistrict = new Subdistrict(db);
		bindForm(subdistrict);
		subdistrict = subdistrict.update();
		if( subdistrict!=null ){
			request.setAttribute("subdistrict", subdistrict);
			formHandler.setFormMessage("Update Completed");
		}else{
			formHandler.setFormMessage("Update Failed");
		}
		forward("?page=/web/subdistrictEdit.jsp");
	}

	// delete
	public void delete(HttpServletRequest request,HttpServletResponse response)throws Exception {
		String[] ids =  request.getParameterValues("id");
		if( ids!=null && ids.length>0 ){
			Subdistrict subdistrict = new Subdistrict(db);
			List<Long> idList = new ArrayList<Long>();
			for( int i=0;i<ids.length;i++ )
				idList.add(new Long(ids[i]));
			int deleteRow = subdistrict.deleteByPks(idList);
			formHandler.setFormMessage(" Delete "+deleteRow+" Row Completed ");
		}else{
			formHandler.setFormMessage("Plese Select At Least One For Delete");
		}
		redirect("process2?action=Subdistrict&cmd=list");
	}
}