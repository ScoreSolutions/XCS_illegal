








 

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
import com.ko.domain.LawbreakerRelatif;

public class LawbreakerRelatifAction extends BaseAction{
	@Override
	public void _default(HttpServletRequest request, HttpServletResponse response) throws Exception {
		// TODO Auto-generated method stub
	}
	// list
	public void list(HttpServletRequest request,HttpServletResponse response)throws Exception {
		LawbreakerRelatif lawbreakerRelatif =new LawbreakerRelatif(db);
		// pageUtil.setPageSize(15);
		Integer totalRow = lawbreakerRelatif.countAll();

		// set TotalRow
		pageUtil.setTotalRow(totalRow);
		List<LawbreakerRelatif> lawbreakerRelatifs = lawbreakerRelatif.findAll(pageUtil);

		//	for data to display
		request.setAttribute("lawbreakerRelatifs", lawbreakerRelatifs);

		//	for screen to show
		forward("?page=/web/lawbreakerRelatifList.jsp");
	}

	//	 create
	public void add(HttpServletRequest request,HttpServletResponse response)throws Exception {
		forward("?page=/web/lawbreakerRelatifCreate.jsp");
	}
	public void create(HttpServletRequest request,HttpServletResponse response)throws Exception {
		LawbreakerRelatif lawbreakerRelatif = new LawbreakerRelatif(db);
		bindForm(lawbreakerRelatif);
		lawbreakerRelatif = lawbreakerRelatif.create();
		if( lawbreakerRelatif!= null )
			formHandler.setFormMessage("Create Completed ,view <a href='process2?action=LawbreakerRelatif&cmd=view&id="+lawbreakerRelatif.getId()+"' target='_blank'>new Record</a>");
		else
			formHandler.setFormMessage("Create Not Complete");
		redirect("process2?action=LawbreakerRelatif&cmd=add");
	}

	// view
	public void view(HttpServletRequest request,HttpServletResponse response)throws Exception {
		String id =  request.getParameter("id");
		if( id!=null && !id.trim().equals("") ){
			LawbreakerRelatif lawbreakerRelatif = new LawbreakerRelatif(db);
			lawbreakerRelatif = lawbreakerRelatif.findByPk(new Long(id));
			if( lawbreakerRelatif!=null ){
				request.setAttribute("lawbreakerRelatif", lawbreakerRelatif);
			}else{
				formHandler.setFormMessage("Error : Not Found with id "+ id );
			}
		}else{
			formHandler.setFormMessage("Error : Please Enter id");
		}
		forward("?page=/web/lawbreakerRelatifView.jsp");
	}

	// update
	public void edit(HttpServletRequest request,HttpServletResponse response)throws Exception {
		String id =  request.getParameter("id");
		if( id!=null && !id.trim().equals("") ){
			LawbreakerRelatif lawbreakerRelatif =new LawbreakerRelatif(db);
			lawbreakerRelatif = lawbreakerRelatif.findByPk(new Long(id));
			if( lawbreakerRelatif!=null ){
				request.setAttribute("lawbreakerRelatif", lawbreakerRelatif);
			}else{
				formHandler.setFormMessage("Error : Not Found with id "+ id );
			}
		}
		forward("?page=/web/lawbreakerRelatifEdit.jsp");
	}
	public void update(HttpServletRequest request,HttpServletResponse response)throws Exception {
		LawbreakerRelatif lawbreakerRelatif = new LawbreakerRelatif(db);
		bindForm(lawbreakerRelatif);
		lawbreakerRelatif = lawbreakerRelatif.update();
		if( lawbreakerRelatif!=null ){
			request.setAttribute("lawbreakerRelatif", lawbreakerRelatif);
			formHandler.setFormMessage("Update Completed");
		}else{
			formHandler.setFormMessage("Update Failed");
		}
		forward("?page=/web/lawbreakerRelatifEdit.jsp");
	}

	// delete
	public void delete(HttpServletRequest request,HttpServletResponse response)throws Exception {
		String[] ids =  request.getParameterValues("id");
		if( ids!=null && ids.length>0 ){
			LawbreakerRelatif lawbreakerRelatif = new LawbreakerRelatif(db);
			List<Long> idList = new ArrayList<Long>();
			for( int i=0;i<ids.length;i++ )
				idList.add(new Long(ids[i]));
			int deleteRow = lawbreakerRelatif.deleteByPks(idList);
			formHandler.setFormMessage(" Delete "+deleteRow+" Row Completed ");
		}else{
			formHandler.setFormMessage("Plese Select At Least One For Delete");
		}
		redirect("process2?action=LawbreakerRelatif&cmd=list");
	}
}