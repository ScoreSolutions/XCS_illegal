








 

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
import com.ko.domain.SuspectRelatif;

public class SuspectRelatifAction extends BaseAction{
	@Override
	public void _default(HttpServletRequest request, HttpServletResponse response) throws Exception {
		// TODO Auto-generated method stub
	}
	// list
	public void list(HttpServletRequest request,HttpServletResponse response)throws Exception {
		SuspectRelatif suspectRelatif =new SuspectRelatif(db);
		// pageUtil.setPageSize(15);
		Integer totalRow = suspectRelatif.countAll();

		// set TotalRow
		pageUtil.setTotalRow(totalRow);
		List<SuspectRelatif> suspectRelatifs = suspectRelatif.findAll(pageUtil);

		//	for data to display
		request.setAttribute("suspectRelatifs", suspectRelatifs);

		//	for screen to show
		forward("?page=/web/suspectRelatifList.jsp");
	}

	//	 create
	public void add(HttpServletRequest request,HttpServletResponse response)throws Exception {
		forward("?page=/web/suspectRelatifCreate.jsp");
	}
	public void create(HttpServletRequest request,HttpServletResponse response)throws Exception {
		SuspectRelatif suspectRelatif = new SuspectRelatif(db);
		bindForm(suspectRelatif);
		suspectRelatif = suspectRelatif.create();
		if( suspectRelatif!= null )
			formHandler.setFormMessage("Create Completed ,view <a href='process2?action=SuspectRelatif&cmd=view&id="+suspectRelatif.getId()+"' target='_blank'>new Record</a>");
		else
			formHandler.setFormMessage("Create Not Complete");
		redirect("process2?action=SuspectRelatif&cmd=add");
	}

	// view
	public void view(HttpServletRequest request,HttpServletResponse response)throws Exception {
		String id =  request.getParameter("id");
		if( id!=null && !id.trim().equals("") ){
			SuspectRelatif suspectRelatif = new SuspectRelatif(db);
			suspectRelatif = suspectRelatif.findByPk(new Long(id));
			if( suspectRelatif!=null ){
				request.setAttribute("suspectRelatif", suspectRelatif);
			}else{
				formHandler.setFormMessage("Error : Not Found with id "+ id );
			}
		}else{
			formHandler.setFormMessage("Error : Please Enter id");
		}
		forward("?page=/web/suspectRelatifView.jsp");
	}

	// update
	public void edit(HttpServletRequest request,HttpServletResponse response)throws Exception {
		String id =  request.getParameter("id");
		if( id!=null && !id.trim().equals("") ){
			SuspectRelatif suspectRelatif =new SuspectRelatif(db);
			suspectRelatif = suspectRelatif.findByPk(new Long(id));
			if( suspectRelatif!=null ){
				request.setAttribute("suspectRelatif", suspectRelatif);
			}else{
				formHandler.setFormMessage("Error : Not Found with id "+ id );
			}
		}
		forward("?page=/web/suspectRelatifEdit.jsp");
	}
	public void update(HttpServletRequest request,HttpServletResponse response)throws Exception {
		SuspectRelatif suspectRelatif = new SuspectRelatif(db);
		bindForm(suspectRelatif);
		suspectRelatif = suspectRelatif.update();
		if( suspectRelatif!=null ){
			request.setAttribute("suspectRelatif", suspectRelatif);
			formHandler.setFormMessage("Update Completed");
		}else{
			formHandler.setFormMessage("Update Failed");
		}
		forward("?page=/web/suspectRelatifEdit.jsp");
	}

	// delete
	public void delete(HttpServletRequest request,HttpServletResponse response)throws Exception {
		String[] ids =  request.getParameterValues("id");
		if( ids!=null && ids.length>0 ){
			SuspectRelatif suspectRelatif = new SuspectRelatif(db);
			List<Long> idList = new ArrayList<Long>();
			for( int i=0;i<ids.length;i++ )
				idList.add(new Long(ids[i]));
			int deleteRow = suspectRelatif.deleteByPks(idList);
			formHandler.setFormMessage(" Delete "+deleteRow+" Row Completed ");
		}else{
			formHandler.setFormMessage("Plese Select At Least One For Delete");
		}
		redirect("process2?action=SuspectRelatif&cmd=list");
	}
}