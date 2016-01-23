








 

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
import com.ko.domain.ConfigDivide;

public class ConfigDivideAction extends BaseAction{
	@Override
	public void _default(HttpServletRequest request, HttpServletResponse response) throws Exception {
		// TODO Auto-generated method stub
	}
	// list
	public void list(HttpServletRequest request,HttpServletResponse response)throws Exception {
		ConfigDivide configDivide =new ConfigDivide(db);
		// pageUtil.setPageSize(15);
		Integer totalRow = configDivide.countAll();

		// set TotalRow
		pageUtil.setTotalRow(totalRow);
		List<ConfigDivide> configDivides = configDivide.findAll(pageUtil);

		//	for data to display
		request.setAttribute("configDivides", configDivides);

		//	for screen to show
		forward("?page=/web/configDivideList.jsp");
	}

	//	 create
	public void add(HttpServletRequest request,HttpServletResponse response)throws Exception {
		forward("?page=/web/configDivideCreate.jsp");
	}
	public void create(HttpServletRequest request,HttpServletResponse response)throws Exception {
		ConfigDivide configDivide = new ConfigDivide(db);
		bindForm(configDivide);
		configDivide = configDivide.create();
		if( configDivide!= null )
			formHandler.setFormMessage("Create Completed ,view <a href='process2?action=ConfigDivide&cmd=view&id="+configDivide.getId()+"' target='_blank'>new Record</a>");
		else
			formHandler.setFormMessage("Create Not Complete");
		redirect("process2?action=ConfigDivide&cmd=add");
	}

	// view
	public void view(HttpServletRequest request,HttpServletResponse response)throws Exception {
		String id =  request.getParameter("id");
		if( id!=null && !id.trim().equals("") ){
			ConfigDivide configDivide = new ConfigDivide(db);
			configDivide = configDivide.findByPk(new Long(id));
			if( configDivide!=null ){
				request.setAttribute("configDivide", configDivide);
			}else{
				formHandler.setFormMessage("Error : Not Found with id "+ id );
			}
		}else{
			formHandler.setFormMessage("Error : Please Enter id");
		}
		forward("?page=/web/configDivideView.jsp");
	}

	// update
	public void edit(HttpServletRequest request,HttpServletResponse response)throws Exception {
		String id =  request.getParameter("id");
		if( id!=null && !id.trim().equals("") ){
			ConfigDivide configDivide =new ConfigDivide(db);
			configDivide = configDivide.findByPk(new Long(id));
			if( configDivide!=null ){
				request.setAttribute("configDivide", configDivide);
			}else{
				formHandler.setFormMessage("Error : Not Found with id "+ id );
			}
		}
		forward("?page=/web/configDivideEdit.jsp");
	}
	public void update(HttpServletRequest request,HttpServletResponse response)throws Exception {
		ConfigDivide configDivide = new ConfigDivide(db);
		bindForm(configDivide);
		configDivide = configDivide.update();
		if( configDivide!=null ){
			request.setAttribute("configDivide", configDivide);
			formHandler.setFormMessage("Update Completed");
		}else{
			formHandler.setFormMessage("Update Failed");
		}
		forward("?page=/web/configDivideEdit.jsp");
	}

	// delete
	public void delete(HttpServletRequest request,HttpServletResponse response)throws Exception {
		String[] ids =  request.getParameterValues("id");
		if( ids!=null && ids.length>0 ){
			ConfigDivide configDivide = new ConfigDivide(db);
			List<Long> idList = new ArrayList<Long>();
			for( int i=0;i<ids.length;i++ )
				idList.add(new Long(ids[i]));
			int deleteRow = configDivide.deleteByPks(idList);
			formHandler.setFormMessage(" Delete "+deleteRow+" Row Completed ");
		}else{
			formHandler.setFormMessage("Plese Select At Least One For Delete");
		}
		redirect("process2?action=ConfigDivide&cmd=list");
	}
}