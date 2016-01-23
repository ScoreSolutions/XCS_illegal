








 

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
import com.ko.domain.Nationality;

public class NationalityAction extends BaseAction{
	@Override
	public void _default(HttpServletRequest request, HttpServletResponse response) throws Exception {
		// TODO Auto-generated method stub
	}
	// list
	public void list(HttpServletRequest request,HttpServletResponse response)throws Exception {
		Nationality nationality =new Nationality(db);
		// pageUtil.setPageSize(15);
		Integer totalRow = nationality.countAll();

		// set TotalRow
		pageUtil.setTotalRow(totalRow);
		List<Nationality> nationalitys = nationality.findAll(pageUtil);

		//	for data to display
		request.setAttribute("nationalitys", nationalitys);

		//	for screen to show
		forward("?page=/web/nationalityList.jsp");
	}

	//	 create
	public void add(HttpServletRequest request,HttpServletResponse response)throws Exception {
		forward("?page=/web/nationalityCreate.jsp");
	}
	public void create(HttpServletRequest request,HttpServletResponse response)throws Exception {
		Nationality nationality = new Nationality(db);
		bindForm(nationality);
		nationality = nationality.create();
		if( nationality!= null )
			formHandler.setFormMessage("Create Completed ,view <a href='process2?action=Nationality&cmd=view&id="+nationality.getId()+"' target='_blank'>new Record</a>");
		else
			formHandler.setFormMessage("Create Not Complete");
		redirect("process2?action=Nationality&cmd=add");
	}

	// view
	public void view(HttpServletRequest request,HttpServletResponse response)throws Exception {
		String id =  request.getParameter("id");
		if( id!=null && !id.trim().equals("") ){
			Nationality nationality = new Nationality(db);
			nationality = nationality.findByPk(new Long(id));
			if( nationality!=null ){
				request.setAttribute("nationality", nationality);
			}else{
				formHandler.setFormMessage("Error : Not Found with id "+ id );
			}
		}else{
			formHandler.setFormMessage("Error : Please Enter id");
		}
		forward("?page=/web/nationalityView.jsp");
	}

	// update
	public void edit(HttpServletRequest request,HttpServletResponse response)throws Exception {
		String id =  request.getParameter("id");
		if( id!=null && !id.trim().equals("") ){
			Nationality nationality =new Nationality(db);
			nationality = nationality.findByPk(new Long(id));
			if( nationality!=null ){
				request.setAttribute("nationality", nationality);
			}else{
				formHandler.setFormMessage("Error : Not Found with id "+ id );
			}
		}
		forward("?page=/web/nationalityEdit.jsp");
	}
	public void update(HttpServletRequest request,HttpServletResponse response)throws Exception {
		Nationality nationality = new Nationality(db);
		bindForm(nationality);
		nationality = nationality.update();
		if( nationality!=null ){
			request.setAttribute("nationality", nationality);
			formHandler.setFormMessage("Update Completed");
		}else{
			formHandler.setFormMessage("Update Failed");
		}
		forward("?page=/web/nationalityEdit.jsp");
	}

	// delete
	public void delete(HttpServletRequest request,HttpServletResponse response)throws Exception {
		String[] ids =  request.getParameterValues("id");
		if( ids!=null && ids.length>0 ){
			Nationality nationality = new Nationality(db);
			List<Long> idList = new ArrayList<Long>();
			for( int i=0;i<ids.length;i++ )
				idList.add(new Long(ids[i]));
			int deleteRow = nationality.deleteByPks(idList);
			formHandler.setFormMessage(" Delete "+deleteRow+" Row Completed ");
		}else{
			formHandler.setFormMessage("Plese Select At Least One For Delete");
		}
		redirect("process2?action=Nationality&cmd=list");
	}
}