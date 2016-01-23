








 

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
import com.ko.domain.SuspectPicture;

public class SuspectPictureAction extends BaseAction{
	@Override
	public void _default(HttpServletRequest request, HttpServletResponse response) throws Exception {
		// TODO Auto-generated method stub
	}
	// list
	public void list(HttpServletRequest request,HttpServletResponse response)throws Exception {
		SuspectPicture suspectPicture =new SuspectPicture(db);
		// pageUtil.setPageSize(15);
		Integer totalRow = suspectPicture.countAll();

		// set TotalRow
		pageUtil.setTotalRow(totalRow);
		List<SuspectPicture> suspectPictures = suspectPicture.findAll(pageUtil);

		//	for data to display
		request.setAttribute("suspectPictures", suspectPictures);

		//	for screen to show
		forward("?page=/web/suspectPictureList.jsp");
	}

	//	 create
	public void add(HttpServletRequest request,HttpServletResponse response)throws Exception {
		forward("?page=/web/suspectPictureCreate.jsp");
	}
	public void create(HttpServletRequest request,HttpServletResponse response)throws Exception {
		SuspectPicture suspectPicture = new SuspectPicture(db);
		bindForm(suspectPicture);
		suspectPicture = suspectPicture.create();
		if( suspectPicture!= null )
			formHandler.setFormMessage("Create Completed ,view <a href='process2?action=SuspectPicture&cmd=view&id="+suspectPicture.getId()+"' target='_blank'>new Record</a>");
		else
			formHandler.setFormMessage("Create Not Complete");
		redirect("process2?action=SuspectPicture&cmd=add");
	}

	// view
	public void view(HttpServletRequest request,HttpServletResponse response)throws Exception {
		String id =  request.getParameter("id");
		if( id!=null && !id.trim().equals("") ){
			SuspectPicture suspectPicture = new SuspectPicture(db);
			suspectPicture = suspectPicture.findByPk(new Long(id));
			if( suspectPicture!=null ){
				request.setAttribute("suspectPicture", suspectPicture);
			}else{
				formHandler.setFormMessage("Error : Not Found with id "+ id );
			}
		}else{
			formHandler.setFormMessage("Error : Please Enter id");
		}
		forward("?page=/web/suspectPictureView.jsp");
	}

	// update
	public void edit(HttpServletRequest request,HttpServletResponse response)throws Exception {
		String id =  request.getParameter("id");
		if( id!=null && !id.trim().equals("") ){
			SuspectPicture suspectPicture =new SuspectPicture(db);
			suspectPicture = suspectPicture.findByPk(new Long(id));
			if( suspectPicture!=null ){
				request.setAttribute("suspectPicture", suspectPicture);
			}else{
				formHandler.setFormMessage("Error : Not Found with id "+ id );
			}
		}
		forward("?page=/web/suspectPictureEdit.jsp");
	}
	public void update(HttpServletRequest request,HttpServletResponse response)throws Exception {
		SuspectPicture suspectPicture = new SuspectPicture(db);
		bindForm(suspectPicture);
		suspectPicture = suspectPicture.update();
		if( suspectPicture!=null ){
			request.setAttribute("suspectPicture", suspectPicture);
			formHandler.setFormMessage("Update Completed");
		}else{
			formHandler.setFormMessage("Update Failed");
		}
		forward("?page=/web/suspectPictureEdit.jsp");
	}

	// delete
	public void delete(HttpServletRequest request,HttpServletResponse response)throws Exception {
		String[] ids =  request.getParameterValues("id");
		if( ids!=null && ids.length>0 ){
			SuspectPicture suspectPicture = new SuspectPicture(db);
			List<Long> idList = new ArrayList<Long>();
			for( int i=0;i<ids.length;i++ )
				idList.add(new Long(ids[i]));
			int deleteRow = suspectPicture.deleteByPks(idList);
			formHandler.setFormMessage(" Delete "+deleteRow+" Row Completed ");
		}else{
			formHandler.setFormMessage("Plese Select At Least One For Delete");
		}
		redirect("process2?action=SuspectPicture&cmd=list");
	}
}