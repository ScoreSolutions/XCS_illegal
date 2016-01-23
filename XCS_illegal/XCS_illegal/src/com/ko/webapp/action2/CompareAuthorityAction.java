








 

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
import com.ko.domain.CompareAuthority;

public class CompareAuthorityAction extends BaseAction{
	@Override
	public void _default(HttpServletRequest request, HttpServletResponse response) throws Exception {
		// TODO Auto-generated method stub
	}
	// list
	public void list(HttpServletRequest request,HttpServletResponse response)throws Exception {
		CompareAuthority compareAuthority =new CompareAuthority(db);
		// pageUtil.setPageSize(15);
		Integer totalRow = compareAuthority.countAll();

		// set TotalRow
		pageUtil.setTotalRow(totalRow);
		List<CompareAuthority> compareAuthoritys = compareAuthority.findAll(pageUtil);

		//	for data to display
		request.setAttribute("compareAuthoritys", compareAuthoritys);

		//	for screen to show
		forward("?page=/web/compareAuthorityList.jsp");
	}

	//	 create
	public void add(HttpServletRequest request,HttpServletResponse response)throws Exception {
		forward("?page=/web/compareAuthorityCreate.jsp");
	}
	public void create(HttpServletRequest request,HttpServletResponse response)throws Exception {
		CompareAuthority compareAuthority = new CompareAuthority(db);
		bindForm(compareAuthority);
		compareAuthority = compareAuthority.create();
		if( compareAuthority!= null )
			formHandler.setFormMessage("Create Completed ,view <a href='process2?action=CompareAuthority&cmd=view&id="+compareAuthority.getId()+"' target='_blank'>new Record</a>");
		else
			formHandler.setFormMessage("Create Not Complete");
		redirect("process2?action=CompareAuthority&cmd=add");
	}

	// view
	public void view(HttpServletRequest request,HttpServletResponse response)throws Exception {
		String id =  request.getParameter("id");
		if( id!=null && !id.trim().equals("") ){
			CompareAuthority compareAuthority = new CompareAuthority(db);
			compareAuthority = compareAuthority.findByPk(new Long(id));
			if( compareAuthority!=null ){
				request.setAttribute("compareAuthority", compareAuthority);
			}else{
				formHandler.setFormMessage("Error : Not Found with id "+ id );
			}
		}else{
			formHandler.setFormMessage("Error : Please Enter id");
		}
		forward("?page=/web/compareAuthorityView.jsp");
	}

	// update
	public void edit(HttpServletRequest request,HttpServletResponse response)throws Exception {
		String id =  request.getParameter("id");
		if( id!=null && !id.trim().equals("") ){
			CompareAuthority compareAuthority =new CompareAuthority(db);
			compareAuthority = compareAuthority.findByPk(new Long(id));
			if( compareAuthority!=null ){
				request.setAttribute("compareAuthority", compareAuthority);
			}else{
				formHandler.setFormMessage("Error : Not Found with id "+ id );
			}
		}
		forward("?page=/web/compareAuthorityEdit.jsp");
	}
	public void update(HttpServletRequest request,HttpServletResponse response)throws Exception {
		CompareAuthority compareAuthority = new CompareAuthority(db);
		bindForm(compareAuthority);
		compareAuthority = compareAuthority.update();
		if( compareAuthority!=null ){
			request.setAttribute("compareAuthority", compareAuthority);
			formHandler.setFormMessage("Update Completed");
		}else{
			formHandler.setFormMessage("Update Failed");
		}
		forward("?page=/web/compareAuthorityEdit.jsp");
	}

	// delete
	public void delete(HttpServletRequest request,HttpServletResponse response)throws Exception {
		String[] ids =  request.getParameterValues("id");
		if( ids!=null && ids.length>0 ){
			CompareAuthority compareAuthority = new CompareAuthority(db);
			List<Long> idList = new ArrayList<Long>();
			for( int i=0;i<ids.length;i++ )
				idList.add(new Long(ids[i]));
			int deleteRow = compareAuthority.deleteByPks(idList);
			formHandler.setFormMessage(" Delete "+deleteRow+" Row Completed ");
		}else{
			formHandler.setFormMessage("Plese Select At Least One For Delete");
		}
		redirect("process2?action=CompareAuthority&cmd=list");
	}
}