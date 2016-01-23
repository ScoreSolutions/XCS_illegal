








 

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
import com.ko.domain.ApplicationSearchWarrantteam;

public class ApplicationSearchWarrantteamAction extends BaseAction{
	@Override
	public void _default(HttpServletRequest request, HttpServletResponse response) throws Exception {
		// TODO Auto-generated method stub
	}
	// list
	public void list(HttpServletRequest request,HttpServletResponse response)throws Exception {
		ApplicationSearchWarrantteam applicationSearchWarrantteam =new ApplicationSearchWarrantteam(db);
		// pageUtil.setPageSize(15);
		Integer totalRow = applicationSearchWarrantteam.countAll();

		// set TotalRow
		pageUtil.setTotalRow(totalRow);
		List<ApplicationSearchWarrantteam> applicationSearchWarrantteams = applicationSearchWarrantteam.findAll(pageUtil);

		//	for data to display
		request.setAttribute("applicationSearchWarrantteams", applicationSearchWarrantteams);

		//	for screen to show
		forward("?page=/web/applicationSearchWarrantteamList.jsp");
	}

	//	 create
	public void add(HttpServletRequest request,HttpServletResponse response)throws Exception {
		forward("?page=/web/applicationSearchWarrantteamCreate.jsp");
	}
	public void create(HttpServletRequest request,HttpServletResponse response)throws Exception {
		ApplicationSearchWarrantteam applicationSearchWarrantteam = new ApplicationSearchWarrantteam(db);
		bindForm(applicationSearchWarrantteam);
		applicationSearchWarrantteam = applicationSearchWarrantteam.create();
		if( applicationSearchWarrantteam!= null )
			formHandler.setFormMessage("Create Completed ,view <a href='process2?action=ApplicationSearchWarrantteam&cmd=view&id="+applicationSearchWarrantteam.getId()+"' target='_blank'>new Record</a>");
		else
			formHandler.setFormMessage("Create Not Complete");
		redirect("process2?action=ApplicationSearchWarrantteam&cmd=add");
	}

	// view
	public void view(HttpServletRequest request,HttpServletResponse response)throws Exception {
		String id =  request.getParameter("id");
		if( id!=null && !id.trim().equals("") ){
			ApplicationSearchWarrantteam applicationSearchWarrantteam = new ApplicationSearchWarrantteam(db);
			applicationSearchWarrantteam = applicationSearchWarrantteam.findByPk(new Long(id));
			if( applicationSearchWarrantteam!=null ){
				request.setAttribute("applicationSearchWarrantteam", applicationSearchWarrantteam);
			}else{
				formHandler.setFormMessage("Error : Not Found with id "+ id );
			}
		}else{
			formHandler.setFormMessage("Error : Please Enter id");
		}
		forward("?page=/web/applicationSearchWarrantteamView.jsp");
	}

	// update
	public void edit(HttpServletRequest request,HttpServletResponse response)throws Exception {
		String id =  request.getParameter("id");
		if( id!=null && !id.trim().equals("") ){
			ApplicationSearchWarrantteam applicationSearchWarrantteam =new ApplicationSearchWarrantteam(db);
			applicationSearchWarrantteam = applicationSearchWarrantteam.findByPk(new Long(id));
			if( applicationSearchWarrantteam!=null ){
				request.setAttribute("applicationSearchWarrantteam", applicationSearchWarrantteam);
			}else{
				formHandler.setFormMessage("Error : Not Found with id "+ id );
			}
		}
		forward("?page=/web/applicationSearchWarrantteamEdit.jsp");
	}
	public void update(HttpServletRequest request,HttpServletResponse response)throws Exception {
		ApplicationSearchWarrantteam applicationSearchWarrantteam = new ApplicationSearchWarrantteam(db);
		bindForm(applicationSearchWarrantteam);
		applicationSearchWarrantteam = applicationSearchWarrantteam.update();
		if( applicationSearchWarrantteam!=null ){
			request.setAttribute("applicationSearchWarrantteam", applicationSearchWarrantteam);
			formHandler.setFormMessage("Update Completed");
		}else{
			formHandler.setFormMessage("Update Failed");
		}
		forward("?page=/web/applicationSearchWarrantteamEdit.jsp");
	}

	// delete
	public void delete(HttpServletRequest request,HttpServletResponse response)throws Exception {
		String[] ids =  request.getParameterValues("id");
		if( ids!=null && ids.length>0 ){
			ApplicationSearchWarrantteam applicationSearchWarrantteam = new ApplicationSearchWarrantteam(db);
			List<Long> idList = new ArrayList<Long>();
			for( int i=0;i<ids.length;i++ )
				idList.add(new Long(ids[i]));
			int deleteRow = applicationSearchWarrantteam.deleteByPks(idList);
			formHandler.setFormMessage(" Delete "+deleteRow+" Row Completed ");
		}else{
			formHandler.setFormMessage("Plese Select At Least One For Delete");
		}
		redirect("process2?action=ApplicationSearchWarrantteam&cmd=list");
	}
}