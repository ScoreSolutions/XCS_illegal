








 

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
import com.ko.domain.ConfigDivideStaff;

public class ConfigDivideStaffAction extends BaseAction{
	@Override
	public void _default(HttpServletRequest request, HttpServletResponse response) throws Exception {
		// TODO Auto-generated method stub
	}
	// list
	public void list(HttpServletRequest request,HttpServletResponse response)throws Exception {
		ConfigDivideStaff configDivideStaff =new ConfigDivideStaff(db);
		// pageUtil.setPageSize(15);
		Integer totalRow = configDivideStaff.countAll();

		// set TotalRow
		pageUtil.setTotalRow(totalRow);
		List<ConfigDivideStaff> configDivideStaffs = configDivideStaff.findAll(pageUtil);

		//	for data to display
		request.setAttribute("configDivideStaffs", configDivideStaffs);

		//	for screen to show
		forward("?page=/web/configDivideStaffList.jsp");
	}

	//	 create
	public void add(HttpServletRequest request,HttpServletResponse response)throws Exception {
		forward("?page=/web/configDivideStaffCreate.jsp");
	}
	public void create(HttpServletRequest request,HttpServletResponse response)throws Exception {
		ConfigDivideStaff configDivideStaff = new ConfigDivideStaff(db);
		bindForm(configDivideStaff);
		configDivideStaff = configDivideStaff.create();
		if( configDivideStaff!= null )
			formHandler.setFormMessage("Create Completed ,view <a href='process2?action=ConfigDivideStaff&cmd=view&id="+configDivideStaff.getId()+"' target='_blank'>new Record</a>");
		else
			formHandler.setFormMessage("Create Not Complete");
		redirect("process2?action=ConfigDivideStaff&cmd=add");
	}

	// view
	public void view(HttpServletRequest request,HttpServletResponse response)throws Exception {
		String id =  request.getParameter("id");
		if( id!=null && !id.trim().equals("") ){
			ConfigDivideStaff configDivideStaff = new ConfigDivideStaff(db);
			configDivideStaff = configDivideStaff.findByPk(new Long(id));
			if( configDivideStaff!=null ){
				request.setAttribute("configDivideStaff", configDivideStaff);
			}else{
				formHandler.setFormMessage("Error : Not Found with id "+ id );
			}
		}else{
			formHandler.setFormMessage("Error : Please Enter id");
		}
		forward("?page=/web/configDivideStaffView.jsp");
	}

	// update
	public void edit(HttpServletRequest request,HttpServletResponse response)throws Exception {
		String id =  request.getParameter("id");
		if( id!=null && !id.trim().equals("") ){
			ConfigDivideStaff configDivideStaff =new ConfigDivideStaff(db);
			configDivideStaff = configDivideStaff.findByPk(new Long(id));
			if( configDivideStaff!=null ){
				request.setAttribute("configDivideStaff", configDivideStaff);
			}else{
				formHandler.setFormMessage("Error : Not Found with id "+ id );
			}
		}
		forward("?page=/web/configDivideStaffEdit.jsp");
	}
	public void update(HttpServletRequest request,HttpServletResponse response)throws Exception {
		ConfigDivideStaff configDivideStaff = new ConfigDivideStaff(db);
		bindForm(configDivideStaff);
		configDivideStaff = configDivideStaff.update();
		if( configDivideStaff!=null ){
			request.setAttribute("configDivideStaff", configDivideStaff);
			formHandler.setFormMessage("Update Completed");
		}else{
			formHandler.setFormMessage("Update Failed");
		}
		forward("?page=/web/configDivideStaffEdit.jsp");
	}

	// delete
	public void delete(HttpServletRequest request,HttpServletResponse response)throws Exception {
		String[] ids =  request.getParameterValues("id");
		if( ids!=null && ids.length>0 ){
			ConfigDivideStaff configDivideStaff = new ConfigDivideStaff(db);
			List<Long> idList = new ArrayList<Long>();
			for( int i=0;i<ids.length;i++ )
				idList.add(new Long(ids[i]));
			int deleteRow = configDivideStaff.deleteByPks(idList);
			formHandler.setFormMessage(" Delete "+deleteRow+" Row Completed ");
		}else{
			formHandler.setFormMessage("Plese Select At Least One For Delete");
		}
		redirect("process2?action=ConfigDivideStaff&cmd=list");
	}
}