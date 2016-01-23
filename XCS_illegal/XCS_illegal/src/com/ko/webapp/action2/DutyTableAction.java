








 

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
import com.ko.domain.DutyTable;

public class DutyTableAction extends BaseAction{
	@Override
	public void _default(HttpServletRequest request, HttpServletResponse response) throws Exception {
		// TODO Auto-generated method stub
	}
	// list
	public void list(HttpServletRequest request,HttpServletResponse response)throws Exception {
		DutyTable dutyTable =new DutyTable(db);
		// pageUtil.setPageSize(15);
		Integer totalRow = dutyTable.countAll();

		// set TotalRow
		pageUtil.setTotalRow(totalRow);
		List<DutyTable> dutyTables = dutyTable.findAll(pageUtil);

		//	for data to display
		request.setAttribute("dutyTables", dutyTables);

		//	for screen to show
		forward("?page=/web/dutyTableList.jsp");
	}

	//	 create
	public void add(HttpServletRequest request,HttpServletResponse response)throws Exception {
		forward("?page=/web/dutyTableCreate.jsp");
	}
	public void create(HttpServletRequest request,HttpServletResponse response)throws Exception {
		DutyTable dutyTable = new DutyTable(db);
		bindForm(dutyTable);
		dutyTable = dutyTable.create();
		if( dutyTable!= null )
			formHandler.setFormMessage("Create Completed ,view <a href='process2?action=DutyTable&cmd=view&id="+dutyTable.getId()+"' target='_blank'>new Record</a>");
		else
			formHandler.setFormMessage("Create Not Complete");
		redirect("process2?action=DutyTable&cmd=add");
	}

	// view
	public void view(HttpServletRequest request,HttpServletResponse response)throws Exception {
		String id =  request.getParameter("id");
		if( id!=null && !id.trim().equals("") ){
			DutyTable dutyTable = new DutyTable(db);
			dutyTable = dutyTable.findByPk(new Long(id));
			if( dutyTable!=null ){
				request.setAttribute("dutyTable", dutyTable);
			}else{
				formHandler.setFormMessage("Error : Not Found with id "+ id );
			}
		}else{
			formHandler.setFormMessage("Error : Please Enter id");
		}
		forward("?page=/web/dutyTableView.jsp");
	}

	// update
	public void edit(HttpServletRequest request,HttpServletResponse response)throws Exception {
		String id =  request.getParameter("id");
		if( id!=null && !id.trim().equals("") ){
			DutyTable dutyTable =new DutyTable(db);
			dutyTable = dutyTable.findByPk(new Long(id));
			if( dutyTable!=null ){
				request.setAttribute("dutyTable", dutyTable);
			}else{
				formHandler.setFormMessage("Error : Not Found with id "+ id );
			}
		}
		forward("?page=/web/dutyTableEdit.jsp");
	}
	public void update(HttpServletRequest request,HttpServletResponse response)throws Exception {
		DutyTable dutyTable = new DutyTable(db);
		bindForm(dutyTable);
		dutyTable = dutyTable.update();
		if( dutyTable!=null ){
			request.setAttribute("dutyTable", dutyTable);
			formHandler.setFormMessage("Update Completed");
		}else{
			formHandler.setFormMessage("Update Failed");
		}
		forward("?page=/web/dutyTableEdit.jsp");
	}

	// delete
	public void delete(HttpServletRequest request,HttpServletResponse response)throws Exception {
		String[] ids =  request.getParameterValues("id");
		if( ids!=null && ids.length>0 ){
			DutyTable dutyTable = new DutyTable(db);
			List<Long> idList = new ArrayList<Long>();
			for( int i=0;i<ids.length;i++ )
				idList.add(new Long(ids[i]));
			int deleteRow = dutyTable.deleteByPks(idList);
			formHandler.setFormMessage(" Delete "+deleteRow+" Row Completed ");
		}else{
			formHandler.setFormMessage("Plese Select At Least One For Delete");
		}
		redirect("process2?action=DutyTable&cmd=list");
	}
}