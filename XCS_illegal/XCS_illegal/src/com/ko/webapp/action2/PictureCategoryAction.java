








 

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
import com.ko.domain.PictureCategory;

public class PictureCategoryAction extends BaseAction{
	@Override
	public void _default(HttpServletRequest request, HttpServletResponse response) throws Exception {
		// TODO Auto-generated method stub
	}
	// list
	public void list(HttpServletRequest request,HttpServletResponse response)throws Exception {
		PictureCategory pictureCategory =new PictureCategory(db);
		// pageUtil.setPageSize(15);
		Integer totalRow = pictureCategory.countAll();

		// set TotalRow
		pageUtil.setTotalRow(totalRow);
		List<PictureCategory> pictureCategorys = pictureCategory.findAll(pageUtil);

		//	for data to display
		request.setAttribute("pictureCategorys", pictureCategorys);

		//	for screen to show
		forward("?page=/web/pictureCategoryList.jsp");
	}

	//	 create
	public void add(HttpServletRequest request,HttpServletResponse response)throws Exception {
		forward("?page=/web/pictureCategoryCreate.jsp");
	}
	public void create(HttpServletRequest request,HttpServletResponse response)throws Exception {
		PictureCategory pictureCategory = new PictureCategory(db);
		bindForm(pictureCategory);
		pictureCategory = pictureCategory.create();
		if( pictureCategory!= null )
			formHandler.setFormMessage("Create Completed ,view <a href='process2?action=PictureCategory&cmd=view&id="+pictureCategory.getId()+"' target='_blank'>new Record</a>");
		else
			formHandler.setFormMessage("Create Not Complete");
		redirect("process2?action=PictureCategory&cmd=add");
	}

	// view
	public void view(HttpServletRequest request,HttpServletResponse response)throws Exception {
		String id =  request.getParameter("id");
		if( id!=null && !id.trim().equals("") ){
			PictureCategory pictureCategory = new PictureCategory(db);
			pictureCategory = pictureCategory.findByPk(new Long(id));
			if( pictureCategory!=null ){
				request.setAttribute("pictureCategory", pictureCategory);
			}else{
				formHandler.setFormMessage("Error : Not Found with id "+ id );
			}
		}else{
			formHandler.setFormMessage("Error : Please Enter id");
		}
		forward("?page=/web/pictureCategoryView.jsp");
	}

	// update
	public void edit(HttpServletRequest request,HttpServletResponse response)throws Exception {
		String id =  request.getParameter("id");
		if( id!=null && !id.trim().equals("") ){
			PictureCategory pictureCategory =new PictureCategory(db);
			pictureCategory = pictureCategory.findByPk(new Long(id));
			if( pictureCategory!=null ){
				request.setAttribute("pictureCategory", pictureCategory);
			}else{
				formHandler.setFormMessage("Error : Not Found with id "+ id );
			}
		}
		forward("?page=/web/pictureCategoryEdit.jsp");
	}
	public void update(HttpServletRequest request,HttpServletResponse response)throws Exception {
		PictureCategory pictureCategory = new PictureCategory(db);
		bindForm(pictureCategory);
		pictureCategory = pictureCategory.update();
		if( pictureCategory!=null ){
			request.setAttribute("pictureCategory", pictureCategory);
			formHandler.setFormMessage("Update Completed");
		}else{
			formHandler.setFormMessage("Update Failed");
		}
		forward("?page=/web/pictureCategoryEdit.jsp");
	}

	// delete
	public void delete(HttpServletRequest request,HttpServletResponse response)throws Exception {
		String[] ids =  request.getParameterValues("id");
		if( ids!=null && ids.length>0 ){
			PictureCategory pictureCategory = new PictureCategory(db);
			List<Long> idList = new ArrayList<Long>();
			for( int i=0;i<ids.length;i++ )
				idList.add(new Long(ids[i]));
			int deleteRow = pictureCategory.deleteByPks(idList);
			formHandler.setFormMessage(" Delete "+deleteRow+" Row Completed ");
		}else{
			formHandler.setFormMessage("Plese Select At Least One For Delete");
		}
		redirect("process2?action=PictureCategory&cmd=list");
	}
}