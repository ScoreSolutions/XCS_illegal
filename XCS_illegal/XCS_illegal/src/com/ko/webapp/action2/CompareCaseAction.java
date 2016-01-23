








 

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
import com.ko.domain.CompareCase;

public class CompareCaseAction extends BaseAction{
	@Override
	public void _default(HttpServletRequest request, HttpServletResponse response) throws Exception {
		// TODO Auto-generated method stub
	}
	// list
	public void list(HttpServletRequest request,HttpServletResponse response)throws Exception {
		CompareCase compareCase =new CompareCase(db);
		// pageUtil.setPageSize(15);
		Integer totalRow = compareCase.countAll();

		// set TotalRow
		pageUtil.setTotalRow(totalRow);
		List<CompareCase> compareCases = compareCase.findAll(pageUtil);

		//	for data to display
		request.setAttribute("compareCases", compareCases);

		//	for screen to show
		forward("?page=/web/compareCaseList.jsp");
	}

	//	 create
	public void add(HttpServletRequest request,HttpServletResponse response)throws Exception {
		forward("?page=/web/compareCaseCreate.jsp");
	}
	public void create(HttpServletRequest request,HttpServletResponse response)throws Exception {
		CompareCase compareCase = new CompareCase(db);
		bindForm(compareCase);
		compareCase = compareCase.create();
		if( compareCase!= null )
			formHandler.setFormMessage("Create Completed ,view <a href='process2?action=CompareCase&cmd=view&id="+compareCase.getId()+"' target='_blank'>new Record</a>");
		else
			formHandler.setFormMessage("Create Not Complete");
		redirect("process2?action=CompareCase&cmd=add");
	}

	// view
	public void view(HttpServletRequest request,HttpServletResponse response)throws Exception {
		String id =  request.getParameter("id");
		if( id!=null && !id.trim().equals("") ){
			CompareCase compareCase = new CompareCase(db);
			compareCase = compareCase.findByPk(new Long(id));
			if( compareCase!=null ){
				request.setAttribute("compareCase", compareCase);
			}else{
				formHandler.setFormMessage("Error : Not Found with id "+ id );
			}
		}else{
			formHandler.setFormMessage("Error : Please Enter id");
		}
		forward("?page=/web/compareCaseView.jsp");
	}

	// update
	public void edit(HttpServletRequest request,HttpServletResponse response)throws Exception {
		String id =  request.getParameter("id");
		if( id!=null && !id.trim().equals("") ){
			CompareCase compareCase =new CompareCase(db);
			compareCase = compareCase.findByPk(new Long(id));
			if( compareCase!=null ){
				request.setAttribute("compareCase", compareCase);
			}else{
				formHandler.setFormMessage("Error : Not Found with id "+ id );
			}
		}
		forward("?page=/web/compareCaseEdit.jsp");
	}
	public void update(HttpServletRequest request,HttpServletResponse response)throws Exception {
		CompareCase compareCase = new CompareCase(db);
		bindForm(compareCase);
		compareCase = compareCase.update();
		if( compareCase!=null ){
			request.setAttribute("compareCase", compareCase);
			formHandler.setFormMessage("Update Completed");
		}else{
			formHandler.setFormMessage("Update Failed");
		}
		forward("?page=/web/compareCaseEdit.jsp");
	}

	// delete
	public void delete(HttpServletRequest request,HttpServletResponse response)throws Exception {
		String[] ids =  request.getParameterValues("id");
		if( ids!=null && ids.length>0 ){
			CompareCase compareCase = new CompareCase(db);
			List<Long> idList = new ArrayList<Long>();
			for( int i=0;i<ids.length;i++ )
				idList.add(new Long(ids[i]));
			int deleteRow = compareCase.deleteByPks(idList);
			formHandler.setFormMessage(" Delete "+deleteRow+" Row Completed ");
		}else{
			formHandler.setFormMessage("Plese Select At Least One For Delete");
		}
		redirect("process2?action=CompareCase&cmd=list");
	}
}