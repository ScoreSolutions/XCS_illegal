








 

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
import com.ko.domain.MappingLevel;

public class MappingLevelAction extends BaseAction{
	@Override
	public void _default(HttpServletRequest request, HttpServletResponse response) throws Exception {
		// TODO Auto-generated method stub
	}
	// list
	public void list(HttpServletRequest request,HttpServletResponse response)throws Exception {
		MappingLevel mappingLevel =new MappingLevel(db);
		// pageUtil.setPageSize(15);
		Integer totalRow = mappingLevel.countAll();

		// set TotalRow
		pageUtil.setTotalRow(totalRow);
		List<MappingLevel> mappingLevels = mappingLevel.findAll(pageUtil);

		//	for data to display
		request.setAttribute("mappingLevels", mappingLevels);

		//	for screen to show
		forward("?page=/web/mappingLevelList.jsp");
	}

	//	 create
	public void add(HttpServletRequest request,HttpServletResponse response)throws Exception {
		forward("?page=/web/mappingLevelCreate.jsp");
	}
	public void create(HttpServletRequest request,HttpServletResponse response)throws Exception {
		MappingLevel mappingLevel = new MappingLevel(db);
		bindForm(mappingLevel);
		mappingLevel = mappingLevel.create();
		if( mappingLevel!= null )
			formHandler.setFormMessage("Create Completed ,view <a href='process2?action=MappingLevel&cmd=view&id="+mappingLevel.getId()+"' target='_blank'>new Record</a>");
		else
			formHandler.setFormMessage("Create Not Complete");
		redirect("process2?action=MappingLevel&cmd=add");
	}

	// view
	public void view(HttpServletRequest request,HttpServletResponse response)throws Exception {
		String id =  request.getParameter("id");
		if( id!=null && !id.trim().equals("") ){
			MappingLevel mappingLevel = new MappingLevel(db);
			mappingLevel = mappingLevel.findByPk(new Long(id));
			if( mappingLevel!=null ){
				request.setAttribute("mappingLevel", mappingLevel);
			}else{
				formHandler.setFormMessage("Error : Not Found with id "+ id );
			}
		}else{
			formHandler.setFormMessage("Error : Please Enter id");
		}
		forward("?page=/web/mappingLevelView.jsp");
	}

	// update
	public void edit(HttpServletRequest request,HttpServletResponse response)throws Exception {
		String id =  request.getParameter("id");
		if( id!=null && !id.trim().equals("") ){
			MappingLevel mappingLevel =new MappingLevel(db);
			mappingLevel = mappingLevel.findByPk(new Long(id));
			if( mappingLevel!=null ){
				request.setAttribute("mappingLevel", mappingLevel);
			}else{
				formHandler.setFormMessage("Error : Not Found with id "+ id );
			}
		}
		forward("?page=/web/mappingLevelEdit.jsp");
	}
	public void update(HttpServletRequest request,HttpServletResponse response)throws Exception {
		MappingLevel mappingLevel = new MappingLevel(db);
		bindForm(mappingLevel);
		mappingLevel = mappingLevel.update();
		if( mappingLevel!=null ){
			request.setAttribute("mappingLevel", mappingLevel);
			formHandler.setFormMessage("Update Completed");
		}else{
			formHandler.setFormMessage("Update Failed");
		}
		forward("?page=/web/mappingLevelEdit.jsp");
	}

	// delete
	public void delete(HttpServletRequest request,HttpServletResponse response)throws Exception {
		String[] ids =  request.getParameterValues("id");
		if( ids!=null && ids.length>0 ){
			MappingLevel mappingLevel = new MappingLevel(db);
			List<Long> idList = new ArrayList<Long>();
			for( int i=0;i<ids.length;i++ )
				idList.add(new Long(ids[i]));
			int deleteRow = mappingLevel.deleteByPks(idList);
			formHandler.setFormMessage(" Delete "+deleteRow+" Row Completed ");
		}else{
			formHandler.setFormMessage("Plese Select At Least One For Delete");
		}
		redirect("process2?action=MappingLevel&cmd=list");
	}
}