








 

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
import com.ko.domain.RewardDivideAlcohol;

public class RewardDivideAlcoholAction extends BaseAction{
	@Override
	public void _default(HttpServletRequest request, HttpServletResponse response) throws Exception {
		// TODO Auto-generated method stub
	}
	// list
	public void list(HttpServletRequest request,HttpServletResponse response)throws Exception {
		RewardDivideAlcohol rewardDivideAlcohol =new RewardDivideAlcohol(db);
		// pageUtil.setPageSize(15);
		Integer totalRow = rewardDivideAlcohol.countAll();

		// set TotalRow
		pageUtil.setTotalRow(totalRow);
		List<RewardDivideAlcohol> rewardDivideAlcohols = rewardDivideAlcohol.findAll(pageUtil);

		//	for data to display
		request.setAttribute("rewardDivideAlcohols", rewardDivideAlcohols);

		//	for screen to show
		forward("?page=/web/rewardDivideAlcoholList.jsp");
	}

	//	 create
	public void add(HttpServletRequest request,HttpServletResponse response)throws Exception {
		forward("?page=/web/rewardDivideAlcoholCreate.jsp");
	}
	public void create(HttpServletRequest request,HttpServletResponse response)throws Exception {
		RewardDivideAlcohol rewardDivideAlcohol = new RewardDivideAlcohol(db);
		bindForm(rewardDivideAlcohol);
		rewardDivideAlcohol = rewardDivideAlcohol.create();
		if( rewardDivideAlcohol!= null )
			formHandler.setFormMessage("Create Completed ,view <a href='process2?action=RewardDivideAlcohol&cmd=view&id="+rewardDivideAlcohol.getId()+"' target='_blank'>new Record</a>");
		else
			formHandler.setFormMessage("Create Not Complete");
		redirect("process2?action=RewardDivideAlcohol&cmd=add");
	}

	// view
	public void view(HttpServletRequest request,HttpServletResponse response)throws Exception {
		String id =  request.getParameter("id");
		if( id!=null && !id.trim().equals("") ){
			RewardDivideAlcohol rewardDivideAlcohol = new RewardDivideAlcohol(db);
			rewardDivideAlcohol = rewardDivideAlcohol.findByPk(new Long(id));
			if( rewardDivideAlcohol!=null ){
				request.setAttribute("rewardDivideAlcohol", rewardDivideAlcohol);
			}else{
				formHandler.setFormMessage("Error : Not Found with id "+ id );
			}
		}else{
			formHandler.setFormMessage("Error : Please Enter id");
		}
		forward("?page=/web/rewardDivideAlcoholView.jsp");
	}

	// update
	public void edit(HttpServletRequest request,HttpServletResponse response)throws Exception {
		String id =  request.getParameter("id");
		if( id!=null && !id.trim().equals("") ){
			RewardDivideAlcohol rewardDivideAlcohol =new RewardDivideAlcohol(db);
			rewardDivideAlcohol = rewardDivideAlcohol.findByPk(new Long(id));
			if( rewardDivideAlcohol!=null ){
				request.setAttribute("rewardDivideAlcohol", rewardDivideAlcohol);
			}else{
				formHandler.setFormMessage("Error : Not Found with id "+ id );
			}
		}
		forward("?page=/web/rewardDivideAlcoholEdit.jsp");
	}
	public void update(HttpServletRequest request,HttpServletResponse response)throws Exception {
		RewardDivideAlcohol rewardDivideAlcohol = new RewardDivideAlcohol(db);
		bindForm(rewardDivideAlcohol);
		rewardDivideAlcohol = rewardDivideAlcohol.update();
		if( rewardDivideAlcohol!=null ){
			request.setAttribute("rewardDivideAlcohol", rewardDivideAlcohol);
			formHandler.setFormMessage("Update Completed");
		}else{
			formHandler.setFormMessage("Update Failed");
		}
		forward("?page=/web/rewardDivideAlcoholEdit.jsp");
	}

	// delete
	public void delete(HttpServletRequest request,HttpServletResponse response)throws Exception {
		String[] ids =  request.getParameterValues("id");
		if( ids!=null && ids.length>0 ){
			RewardDivideAlcohol rewardDivideAlcohol = new RewardDivideAlcohol(db);
			List<Long> idList = new ArrayList<Long>();
			for( int i=0;i<ids.length;i++ )
				idList.add(new Long(ids[i]));
			int deleteRow = rewardDivideAlcohol.deleteByPks(idList);
			formHandler.setFormMessage(" Delete "+deleteRow+" Row Completed ");
		}else{
			formHandler.setFormMessage("Plese Select At Least One For Delete");
		}
		redirect("process2?action=RewardDivideAlcohol&cmd=list");
	}
}