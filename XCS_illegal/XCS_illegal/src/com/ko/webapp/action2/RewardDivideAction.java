








 

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
import com.ko.domain.RewardDivide;

public class RewardDivideAction extends BaseAction{
	@Override
	public void _default(HttpServletRequest request, HttpServletResponse response) throws Exception {
		// TODO Auto-generated method stub
	}
	// list
	public void list(HttpServletRequest request,HttpServletResponse response)throws Exception {
		RewardDivide rewardDivide =new RewardDivide(db);
		// pageUtil.setPageSize(15);
		Integer totalRow = rewardDivide.countAll();

		// set TotalRow
		pageUtil.setTotalRow(totalRow);
		List<RewardDivide> rewardDivides = rewardDivide.findAll(pageUtil);

		//	for data to display
		request.setAttribute("rewardDivides", rewardDivides);

		//	for screen to show
		forward("?page=/web/rewardDivideList.jsp");
	}

	//	 create
	public void add(HttpServletRequest request,HttpServletResponse response)throws Exception {
		forward("?page=/web/rewardDivideCreate.jsp");
	}
	public void create(HttpServletRequest request,HttpServletResponse response)throws Exception {
		RewardDivide rewardDivide = new RewardDivide(db);
		bindForm(rewardDivide);
		rewardDivide = rewardDivide.create();
		if( rewardDivide!= null )
			formHandler.setFormMessage("Create Completed ,view <a href='process2?action=RewardDivide&cmd=view&id="+rewardDivide.getId()+"' target='_blank'>new Record</a>");
		else
			formHandler.setFormMessage("Create Not Complete");
		redirect("process2?action=RewardDivide&cmd=add");
	}

	// view
	public void view(HttpServletRequest request,HttpServletResponse response)throws Exception {
		String id =  request.getParameter("id");
		if( id!=null && !id.trim().equals("") ){
			RewardDivide rewardDivide = new RewardDivide(db);
			rewardDivide = rewardDivide.findByPk(new Long(id));
			if( rewardDivide!=null ){
				request.setAttribute("rewardDivide", rewardDivide);
			}else{
				formHandler.setFormMessage("Error : Not Found with id "+ id );
			}
		}else{
			formHandler.setFormMessage("Error : Please Enter id");
		}
		forward("?page=/web/rewardDivideView.jsp");
	}

	// update
	public void edit(HttpServletRequest request,HttpServletResponse response)throws Exception {
		String id =  request.getParameter("id");
		if( id!=null && !id.trim().equals("") ){
			RewardDivide rewardDivide =new RewardDivide(db);
			rewardDivide = rewardDivide.findByPk(new Long(id));
			if( rewardDivide!=null ){
				request.setAttribute("rewardDivide", rewardDivide);
			}else{
				formHandler.setFormMessage("Error : Not Found with id "+ id );
			}
		}
		forward("?page=/web/rewardDivideEdit.jsp");
	}
	public void update(HttpServletRequest request,HttpServletResponse response)throws Exception {
		RewardDivide rewardDivide = new RewardDivide(db);
		bindForm(rewardDivide);
		rewardDivide = rewardDivide.update();
		if( rewardDivide!=null ){
			request.setAttribute("rewardDivide", rewardDivide);
			formHandler.setFormMessage("Update Completed");
		}else{
			formHandler.setFormMessage("Update Failed");
		}
		forward("?page=/web/rewardDivideEdit.jsp");
	}

	// delete
	public void delete(HttpServletRequest request,HttpServletResponse response)throws Exception {
		String[] ids =  request.getParameterValues("id");
		if( ids!=null && ids.length>0 ){
			RewardDivide rewardDivide = new RewardDivide(db);
			List<Long> idList = new ArrayList<Long>();
			for( int i=0;i<ids.length;i++ )
				idList.add(new Long(ids[i]));
			int deleteRow = rewardDivide.deleteByPks(idList);
			formHandler.setFormMessage(" Delete "+deleteRow+" Row Completed ");
		}else{
			formHandler.setFormMessage("Plese Select At Least One For Delete");
		}
		redirect("process2?action=RewardDivide&cmd=list");
	}
}