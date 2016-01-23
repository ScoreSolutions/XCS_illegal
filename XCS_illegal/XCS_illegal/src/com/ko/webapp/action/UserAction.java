package com.ko.webapp.action;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.ko.domain.User;
public class UserAction extends BaseAction{
	@Override
	public void _default(HttpServletRequest request, HttpServletResponse response) throws Exception {
		// TODO Auto-generated method stub
	}
	public void list(HttpServletRequest request,HttpServletResponse response)throws Exception {
		User user =new User(db);
		// pageUtil.setPageSize(15);
		Integer totalRow = user.countAll();
		// set TotalRow
		pageUtil.setTotalRow(totalRow);
		List<User> users = user.findAll(pageUtil);
		/*for (User user2 : users) {
			System.out.println(user2.getCreate_on());
		}*/
		//	for data to display
		request.setAttribute("users", users);

		// for screen to show
		forward("?page=/test2/list.jsp");
	}

	// create new record
	public void add(HttpServletRequest request,HttpServletResponse response)throws Exception {
		forward("?page=/test2/create.jsp", request, response);
	}
	public void create(HttpServletRequest request,HttpServletResponse response)throws Exception {
		User user = new User(db);
		bindForm(user);
		user.setCreate_by(create_by);
		user.setCreate_on(create_on);
		user.setUpdate_on(update_on);
		user.setUpdate_by(update_by);
		user = user.create();
		if( user!=null )
			formHandler.setFormMessage("Create Completed ,view <a href='process?action=User&cmd=view&id="+user.getId()+"' target='_blank'>new User</a>");
		else
			formHandler.setFormMessage("Create Not Complete");
		redirect("process?action=User&cmd=add");
	}

	// view
	public void view(HttpServletRequest request,HttpServletResponse response)throws Exception {
		String id = request.getParameter("id");
		if( id!=null && !id.trim().equals("") ){
			User user = new User(db);
			user = user.findByPk(new Long(id));
			if( user != null ){
				request.setAttribute("user", user);
			}else{
				formHandler.setFormMessage("Error : Not Found with id : "+id);
			}
		}else{
			formHandler.setFormMessage("Error : Please Enter id");
		}
		forward("?page=/test2/view.jsp");
	}

	// update
	public void edit(HttpServletRequest request,HttpServletResponse response)throws Exception {
		String id = request.getParameter("id");
		if( id!=null && !id.trim().equals("") ){
			User user =new User(db);
			user = user.findByPk(new Long(id));
			if( user != null ){
				request.setAttribute("user", user);
			}else{
				formHandler.setFormMessage("Error : Comment Not Found");
			}
		}else{
			formHandler.setFormMessage("Error : Please Enter id");
		}
		forward("?page=/test2/edit.jsp");
	}
	public void update(HttpServletRequest request,HttpServletResponse response)throws Exception {
		User user = new User(db);
		bindForm(user);
		user = user.update();
		if( user != null ){
			request.setAttribute("user", user);
			formHandler.setFormMessage("Update Completed");
		}else{
			formHandler.setFormMessage("Update Failed");
		}
		forward("?page=/test2/edit.jsp");
	}

	// delete
	public void delete(HttpServletRequest request,HttpServletResponse response)throws Exception {
		String[] ids = request.getParameterValues("id");
		if( ids!=null && ids.length>0 ){
			User user = new User(db);
			List<Long> idList = new ArrayList<Long>();
			for( int i=0;i<ids.length;i++ )
				idList.add(new Long(ids[i]));
			int deleteRow = user.deleteByPks(idList);
			formHandler.setFormMessage(" Delete "+deleteRow+" Row Completed ");
		}else{
			formHandler.setFormMessage("Plese Select At Least One For Delete");
		}
		redirect("process?action=User&cmd=list");
	}
	public void testUploadFile(HttpServletRequest request,HttpServletResponse response)throws Exception {
		forward("?page=/test2/FileUpload.jsp", request, response);
	}
	public void UploadFile(HttpServletRequest request,HttpServletResponse response)throws Exception{
		
	}
}