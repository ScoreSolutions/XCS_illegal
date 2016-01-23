








 

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
import com.ko.domain.CompareCaseChange;

public class CompareCaseChangeAction extends BaseAction{
	@Override
	public void _default(HttpServletRequest request, HttpServletResponse response) throws Exception {
		// TODO Auto-generated method stub
	}
	// list
	public void list(HttpServletRequest request,HttpServletResponse response)throws Exception {
		CompareCaseChange compareCaseChange =new CompareCaseChange(db);
		// pageUtil.setPageSize(15);
		Integer totalRow = compareCaseChange.countAll();

		// set TotalRow
		pageUtil.setTotalRow(totalRow);
		List<CompareCaseChange> compareCaseChanges = compareCaseChange.findAll(pageUtil);

		//	for data to display
		request.setAttribute("compareCaseChanges", compareCaseChanges);

		//	for screen to show
		forward("?page=/web/compareCaseChangeList.jsp");
	}

	//	 create
	public void add(HttpServletRequest request,HttpServletResponse response)throws Exception {
		forward("?page=/web/compareCaseChangeCreate.jsp");
	}
	public void create(HttpServletRequest request,HttpServletResponse response)throws Exception {
		CompareCaseChange compareCaseChange = new CompareCaseChange(db);
		bindForm(compareCaseChange);
		compareCaseChange = compareCaseChange.create();
		if( compareCaseChange!= null )
			formHandler.setFormMessage("Create Completed ,view <a href='process2?action=CompareCaseChange&cmd=view&id="+compareCaseChange.getId()+"' target='_blank'>new Record</a>");
		else
			formHandler.setFormMessage("Create Not Complete");
		redirect("process2?action=CompareCaseChange&cmd=add");
	}

	// view
	public void view(HttpServletRequest request,HttpServletResponse response)throws Exception {
		String id =  request.getParameter("id");
		if( id!=null && !id.trim().equals("") ){
			CompareCaseChange compareCaseChange = new CompareCaseChange(db);
			compareCaseChange = compareCaseChange.findByPk(new Long(id));
			if( compareCaseChange!=null ){
				request.setAttribute("compareCaseChange", compareCaseChange);
			}else{
				formHandler.setFormMessage("Error : Not Found with id "+ id );
			}
		}else{
			formHandler.setFormMessage("Error : Please Enter id");
		}
		forward("?page=/web/compareCaseChangeView.jsp");
	}

	// update
	public void edit(HttpServletRequest request,HttpServletResponse response)throws Exception {
		String id =  request.getParameter("id");
		if( id!=null && !id.trim().equals("") ){
			CompareCaseChange compareCaseChange =new CompareCaseChange(db);
			compareCaseChange = compareCaseChange.findByPk(new Long(id));
			if( compareCaseChange!=null ){
				request.setAttribute("compareCaseChange", compareCaseChange);
			}else{
				formHandler.setFormMessage("Error : Not Found with id "+ id );
			}
		}
		forward("?page=/web/compareCaseChangeEdit.jsp");
	}
	public void update(HttpServletRequest request,HttpServletResponse response)throws Exception {
		CompareCaseChange compareCaseChange = new CompareCaseChange(db);
		bindForm(compareCaseChange);
		compareCaseChange = compareCaseChange.update();
		if( compareCaseChange!=null ){
			request.setAttribute("compareCaseChange", compareCaseChange);
			formHandler.setFormMessage("Update Completed");
		}else{
			formHandler.setFormMessage("Update Failed");
		}
		forward("?page=/web/compareCaseChangeEdit.jsp");
	}

	// delete
	public void delete(HttpServletRequest request,HttpServletResponse response)throws Exception {
		String[] ids =  request.getParameterValues("id");
		if( ids!=null && ids.length>0 ){
			CompareCaseChange compareCaseChange = new CompareCaseChange(db);
			List<Long> idList = new ArrayList<Long>();
			for( int i=0;i<ids.length;i++ )
				idList.add(new Long(ids[i]));
			int deleteRow = compareCaseChange.deleteByPks(idList);
			formHandler.setFormMessage(" Delete "+deleteRow+" Row Completed ");
		}else{
			formHandler.setFormMessage("Plese Select At Least One For Delete");
		}
		redirect("process2?action=CompareCaseChange&cmd=list");
	}
}