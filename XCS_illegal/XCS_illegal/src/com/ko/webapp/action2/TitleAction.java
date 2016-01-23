








 

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
import com.ko.domain.Title;

public class TitleAction extends BaseAction{
	@Override
	public void _default(HttpServletRequest request, HttpServletResponse response) throws Exception {
		// TODO Auto-generated method stub
	}
	// list
	public void list(HttpServletRequest request,HttpServletResponse response)throws Exception {
		Title title =new Title(db);
		// pageUtil.setPageSize(15);
		Integer totalRow = title.countAll();

		// set TotalRow
		pageUtil.setTotalRow(totalRow);
		List<Title> titles = title.findAll(pageUtil);

		//	for data to display
		request.setAttribute("titles", titles);

		//	for screen to show
		forward("?page=/web/titleList.jsp");
	}

	//	 create
	public void add(HttpServletRequest request,HttpServletResponse response)throws Exception {
		forward("?page=/web/titleCreate.jsp");
	}
	public void create(HttpServletRequest request,HttpServletResponse response)throws Exception {
		Title title = new Title(db);
		bindForm(title);
		title = title.create();
		if( title!= null )
			formHandler.setFormMessage("Create Completed ,view <a href='process2?action=Title&cmd=view&id="+title.getTitle_code()+"' target='_blank'>new Record</a>");
		else
			formHandler.setFormMessage("Create Not Complete");
		redirect("process2?action=Title&cmd=add");
	}

	// view
	public void view(HttpServletRequest request,HttpServletResponse response)throws Exception {
		String title_code =  request.getParameter("title_code");
		if( title_code!=null && !title_code.trim().equals("") ){
			Title title = new Title(db);
			title = title.findByPk(new String(title_code));
			if( title!=null ){
				request.setAttribute("title", title);
			}else{
				formHandler.setFormMessage("Error : Not Found with title_code "+ title_code );
			}
		}else{
			formHandler.setFormMessage("Error : Please Enter title_code");
		}
		forward("?page=/web/titleView.jsp");
	}

	// update
	public void edit(HttpServletRequest request,HttpServletResponse response)throws Exception {
		String title_code =  request.getParameter("title_code");
		if( title_code!=null && !title_code.trim().equals("") ){
			Title title =new Title(db);
			title = title.findByPk(new String(title_code));
			if( title!=null ){
				request.setAttribute("title", title);
			}else{
				formHandler.setFormMessage("Error : Not Found with title_code "+ title_code );
			}
		}
		forward("?page=/web/titleEdit.jsp");
	}
	public void update(HttpServletRequest request,HttpServletResponse response)throws Exception {
		Title title = new Title(db);
		bindForm(title);
		title = title.update();
		if( title!=null ){
			request.setAttribute("title", title);
			formHandler.setFormMessage("Update Completed");
		}else{
			formHandler.setFormMessage("Update Failed");
		}
		forward("?page=/web/titleEdit.jsp");
	}

	// delete
	public void delete(HttpServletRequest request,HttpServletResponse response)throws Exception {
		String[] title_codes =  request.getParameterValues("title_code");
		if( title_codes!=null && title_codes.length>0 ){
			Title title = new Title(db);
			List<String> title_codeList = new ArrayList<String>();
			for( int i=0;i<title_codes.length;i++ )
				title_codeList.add(new String(title_codes[i]));
			int deleteRow = title.deleteByPks(title_codeList);
			formHandler.setFormMessage(" Delete "+deleteRow+" Row Completed ");
		}else{
			formHandler.setFormMessage("Plese Select At Least One For Delete");
		}
		redirect("process2?action=Title&cmd=list");
	}
}