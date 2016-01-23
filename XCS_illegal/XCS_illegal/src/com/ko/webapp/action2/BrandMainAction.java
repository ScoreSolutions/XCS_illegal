








 

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
import com.ko.domain.BrandMain;

public class BrandMainAction extends BaseAction{
	@Override
	public void _default(HttpServletRequest request, HttpServletResponse response) throws Exception {
		// TODO Auto-generated method stub
	}
	// list
	public void list(HttpServletRequest request,HttpServletResponse response)throws Exception {
		BrandMain brandMain =new BrandMain(db);
		// pageUtil.setPageSize(15);
		Integer totalRow = brandMain.countAll();

		// set TotalRow
		pageUtil.setTotalRow(totalRow);
		List<BrandMain> brandMains = brandMain.findAll(pageUtil);

		//	for data to display
		request.setAttribute("brandMains", brandMains);

		//	for screen to show
		forward("?page=/web/brandMainList.jsp");
	}

	//	 create
	public void add(HttpServletRequest request,HttpServletResponse response)throws Exception {
		forward("?page=/web/brandMainCreate.jsp");
	}
	public void create(HttpServletRequest request,HttpServletResponse response)throws Exception {
		BrandMain brandMain = new BrandMain(db);
		bindForm(brandMain);
		brandMain = brandMain.create();
		if( brandMain!= null )
			formHandler.setFormMessage("Create Completed ,view <a href='process2?action=BrandMain&cmd=view&id="+brandMain.getId()+"' target='_blank'>new Record</a>");
		else
			formHandler.setFormMessage("Create Not Complete");
		redirect("process2?action=BrandMain&cmd=add");
	}

	// view
	public void view(HttpServletRequest request,HttpServletResponse response)throws Exception {
		String id =  request.getParameter("id");
		if( id!=null && !id.trim().equals("") ){
			BrandMain brandMain = new BrandMain(db);
			brandMain = brandMain.findByPk(new Long(id));
			if( brandMain!=null ){
				request.setAttribute("brandMain", brandMain);
			}else{
				formHandler.setFormMessage("Error : Not Found with id "+ id );
			}
		}else{
			formHandler.setFormMessage("Error : Please Enter id");
		}
		forward("?page=/web/brandMainView.jsp");
	}

	// update
	public void edit(HttpServletRequest request,HttpServletResponse response)throws Exception {
		String id =  request.getParameter("id");
		if( id!=null && !id.trim().equals("") ){
			BrandMain brandMain =new BrandMain(db);
			brandMain = brandMain.findByPk(new Long(id));
			if( brandMain!=null ){
				request.setAttribute("brandMain", brandMain);
			}else{
				formHandler.setFormMessage("Error : Not Found with id "+ id );
			}
		}
		forward("?page=/web/brandMainEdit.jsp");
	}
	public void update(HttpServletRequest request,HttpServletResponse response)throws Exception {
		BrandMain brandMain = new BrandMain(db);
		bindForm(brandMain);
		brandMain = brandMain.update();
		if( brandMain!=null ){
			request.setAttribute("brandMain", brandMain);
			formHandler.setFormMessage("Update Completed");
		}else{
			formHandler.setFormMessage("Update Failed");
		}
		forward("?page=/web/brandMainEdit.jsp");
	}

	// delete
	public void delete(HttpServletRequest request,HttpServletResponse response)throws Exception {
		String[] ids =  request.getParameterValues("id");
		if( ids!=null && ids.length>0 ){
			BrandMain brandMain = new BrandMain(db);
			List<Long> idList = new ArrayList<Long>();
			for( int i=0;i<ids.length;i++ )
				idList.add(new Long(ids[i]));
			int deleteRow = brandMain.deleteByPks(idList);
			formHandler.setFormMessage(" Delete "+deleteRow+" Row Completed ");
		}else{
			formHandler.setFormMessage("Plese Select At Least One For Delete");
		}
		redirect("process2?action=BrandMain&cmd=list");
	}
}