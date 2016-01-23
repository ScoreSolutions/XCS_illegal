








 

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
import com.ko.domain.StockinTeam;

public class StockinTeamAction extends BaseAction{
	@Override
	public void _default(HttpServletRequest request, HttpServletResponse response) throws Exception {
		// TODO Auto-generated method stub
	}
	// list
	public void list(HttpServletRequest request,HttpServletResponse response)throws Exception {
		StockinTeam stockinTeam =new StockinTeam(db);
		// pageUtil.setPageSize(15);
		Integer totalRow = stockinTeam.countAll();

		// set TotalRow
		pageUtil.setTotalRow(totalRow);
		List<StockinTeam> stockinTeams = stockinTeam.findAll(pageUtil);

		//	for data to display
		request.setAttribute("stockinTeams", stockinTeams);

		//	for screen to show
		forward("?page=/web/stockinTeamList.jsp");
	}

	//	 create
	public void add(HttpServletRequest request,HttpServletResponse response)throws Exception {
		forward("?page=/web/stockinTeamCreate.jsp");
	}
	public void create(HttpServletRequest request,HttpServletResponse response)throws Exception {
		StockinTeam stockinTeam = new StockinTeam(db);
		bindForm(stockinTeam);
		stockinTeam = stockinTeam.create();
		if( stockinTeam!= null )
			formHandler.setFormMessage("Create Completed ,view <a href='process2?action=StockinTeam&cmd=view&id="+stockinTeam.getId()+"' target='_blank'>new Record</a>");
		else
			formHandler.setFormMessage("Create Not Complete");
		redirect("process2?action=StockinTeam&cmd=add");
	}

	// view
	public void view(HttpServletRequest request,HttpServletResponse response)throws Exception {
		String id =  request.getParameter("id");
		if( id!=null && !id.trim().equals("") ){
			StockinTeam stockinTeam = new StockinTeam(db);
			stockinTeam = stockinTeam.findByPk(new Long(id));
			if( stockinTeam!=null ){
				request.setAttribute("stockinTeam", stockinTeam);
			}else{
				formHandler.setFormMessage("Error : Not Found with id "+ id );
			}
		}else{
			formHandler.setFormMessage("Error : Please Enter id");
		}
		forward("?page=/web/stockinTeamView.jsp");
	}

	// update
	public void edit(HttpServletRequest request,HttpServletResponse response)throws Exception {
		String id =  request.getParameter("id");
		if( id!=null && !id.trim().equals("") ){
			StockinTeam stockinTeam =new StockinTeam(db);
			stockinTeam = stockinTeam.findByPk(new Long(id));
			if( stockinTeam!=null ){
				request.setAttribute("stockinTeam", stockinTeam);
			}else{
				formHandler.setFormMessage("Error : Not Found with id "+ id );
			}
		}
		forward("?page=/web/stockinTeamEdit.jsp");
	}
	public void update(HttpServletRequest request,HttpServletResponse response)throws Exception {
		StockinTeam stockinTeam = new StockinTeam(db);
		bindForm(stockinTeam);
		stockinTeam = stockinTeam.update();
		if( stockinTeam!=null ){
			request.setAttribute("stockinTeam", stockinTeam);
			formHandler.setFormMessage("Update Completed");
		}else{
			formHandler.setFormMessage("Update Failed");
		}
		forward("?page=/web/stockinTeamEdit.jsp");
	}

	// delete
	public void delete(HttpServletRequest request,HttpServletResponse response)throws Exception {
		String[] ids =  request.getParameterValues("id");
		if( ids!=null && ids.length>0 ){
			StockinTeam stockinTeam = new StockinTeam(db);
			List<Long> idList = new ArrayList<Long>();
			for( int i=0;i<ids.length;i++ )
				idList.add(new Long(ids[i]));
			int deleteRow = stockinTeam.deleteByPks(idList);
			formHandler.setFormMessage(" Delete "+deleteRow+" Row Completed ");
		}else{
			formHandler.setFormMessage("Plese Select At Least One For Delete");
		}
		redirect("process2?action=StockinTeam&cmd=list");
	}
}