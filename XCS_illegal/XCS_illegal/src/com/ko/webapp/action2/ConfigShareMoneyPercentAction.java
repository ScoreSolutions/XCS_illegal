








 

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
import com.ko.domain.ConfigShareMoneyPercent;

public class ConfigShareMoneyPercentAction extends BaseAction{
	@Override
	public void _default(HttpServletRequest request, HttpServletResponse response) throws Exception {
		// TODO Auto-generated method stub
	}
	// list
	public void list(HttpServletRequest request,HttpServletResponse response)throws Exception {
		ConfigShareMoneyPercent configShareMoneyPercent =new ConfigShareMoneyPercent(db);
		// pageUtil.setPageSize(15);
		Integer totalRow = configShareMoneyPercent.countAll();

		// set TotalRow
		pageUtil.setTotalRow(totalRow);
		List<ConfigShareMoneyPercent> configShareMoneyPercents = configShareMoneyPercent.findAll(pageUtil);

		//	for data to display
		request.setAttribute("configShareMoneyPercents", configShareMoneyPercents);

		//	for screen to show
		forward("?page=/web/configShareMoneyPercentList.jsp");
	}

	//	 create
	public void add(HttpServletRequest request,HttpServletResponse response)throws Exception {
		forward("?page=/web/configShareMoneyPercentCreate.jsp");
	}
	public void create(HttpServletRequest request,HttpServletResponse response)throws Exception {
		ConfigShareMoneyPercent configShareMoneyPercent = new ConfigShareMoneyPercent(db);
		bindForm(configShareMoneyPercent);
		configShareMoneyPercent = configShareMoneyPercent.create();
		if( configShareMoneyPercent!= null )
			formHandler.setFormMessage("Create Completed ,view <a href='process2?action=ConfigShareMoneyPercent&cmd=view&id="+configShareMoneyPercent.getId()+"' target='_blank'>new Record</a>");
		else
			formHandler.setFormMessage("Create Not Complete");
		redirect("process2?action=ConfigShareMoneyPercent&cmd=add");
	}

	// view
	public void view(HttpServletRequest request,HttpServletResponse response)throws Exception {
		String id =  request.getParameter("id");
		if( id!=null && !id.trim().equals("") ){
			ConfigShareMoneyPercent configShareMoneyPercent = new ConfigShareMoneyPercent(db);
			configShareMoneyPercent = configShareMoneyPercent.findByPk(new Long(id));
			if( configShareMoneyPercent!=null ){
				request.setAttribute("configShareMoneyPercent", configShareMoneyPercent);
			}else{
				formHandler.setFormMessage("Error : Not Found with id "+ id );
			}
		}else{
			formHandler.setFormMessage("Error : Please Enter id");
		}
		forward("?page=/web/configShareMoneyPercentView.jsp");
	}

	// update
	public void edit(HttpServletRequest request,HttpServletResponse response)throws Exception {
		String id =  request.getParameter("id");
		if( id!=null && !id.trim().equals("") ){
			ConfigShareMoneyPercent configShareMoneyPercent =new ConfigShareMoneyPercent(db);
			configShareMoneyPercent = configShareMoneyPercent.findByPk(new Long(id));
			if( configShareMoneyPercent!=null ){
				request.setAttribute("configShareMoneyPercent", configShareMoneyPercent);
			}else{
				formHandler.setFormMessage("Error : Not Found with id "+ id );
			}
		}
		forward("?page=/web/configShareMoneyPercentEdit.jsp");
	}
	public void update(HttpServletRequest request,HttpServletResponse response)throws Exception {
		ConfigShareMoneyPercent configShareMoneyPercent = new ConfigShareMoneyPercent(db);
		bindForm(configShareMoneyPercent);
		configShareMoneyPercent = configShareMoneyPercent.update();
		if( configShareMoneyPercent!=null ){
			request.setAttribute("configShareMoneyPercent", configShareMoneyPercent);
			formHandler.setFormMessage("Update Completed");
		}else{
			formHandler.setFormMessage("Update Failed");
		}
		forward("?page=/web/configShareMoneyPercentEdit.jsp");
	}

	// delete
	public void delete(HttpServletRequest request,HttpServletResponse response)throws Exception {
		String[] ids =  request.getParameterValues("chkList");
		if( ids!=null && ids.length>0 ){
			ConfigShareMoneyPercent configShareMoneyPercent = new ConfigShareMoneyPercent(db);
			List<Long> idList = new ArrayList<Long>();
			for( int i=0;i<ids.length;i++ )
				idList.add(new Long(ids[i]));
			int deleteRow = configShareMoneyPercent.deleteByPks(idList);
			formHandler.setFormMessage(" Delete "+deleteRow+" Row Completed ");
		}else{
			formHandler.setFormMessage("Plese Select At Least One For Delete");
		}
		redirect("process2?action=ConfigShareMoneyPercent&cmd=list");
	}
}