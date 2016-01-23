








 

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
import com.ko.domain.ProductType;

public class ProductTypeAction extends BaseAction{
	@Override
	public void _default(HttpServletRequest request, HttpServletResponse response) throws Exception {
		// TODO Auto-generated method stub
	}
	// list
	public void list(HttpServletRequest request,HttpServletResponse response)throws Exception {
		ProductType productType =new ProductType(db);
		// pageUtil.setPageSize(15);
		Integer totalRow = productType.countAll();

		// set TotalRow
		pageUtil.setTotalRow(totalRow);
		List<ProductType> productTypes = productType.findAll(pageUtil);

		//	for data to display
		request.setAttribute("productTypes", productTypes);

		//	for screen to show
		forward("?page=/web/productTypeList.jsp");
	}

	//	 create
	public void add(HttpServletRequest request,HttpServletResponse response)throws Exception {
		forward("?page=/web/productTypeCreate.jsp");
	}
	public void create(HttpServletRequest request,HttpServletResponse response)throws Exception {
		ProductType productType = new ProductType(db);
		bindForm(productType);
		productType = productType.create();
		if( productType!= null )
			formHandler.setFormMessage("Create Completed ,view <a href='process2?action=ProductType&cmd=view&id="+productType.getId()+"' target='_blank'>new Record</a>");
		else
			formHandler.setFormMessage("Create Not Complete");
		redirect("process2?action=ProductType&cmd=add");
	}

	// view
	public void view(HttpServletRequest request,HttpServletResponse response)throws Exception {
		String id =  request.getParameter("id");
		if( id!=null && !id.trim().equals("") ){
			ProductType productType = new ProductType(db);
			productType = productType.findByPk(new Long(id));
			if( productType!=null ){
				request.setAttribute("productType", productType);
			}else{
				formHandler.setFormMessage("Error : Not Found with id "+ id );
			}
		}else{
			formHandler.setFormMessage("Error : Please Enter id");
		}
		forward("?page=/web/productTypeView.jsp");
	}

	// update
	public void edit(HttpServletRequest request,HttpServletResponse response)throws Exception {
		String id =  request.getParameter("id");
		if( id!=null && !id.trim().equals("") ){
			ProductType productType =new ProductType(db);
			productType = productType.findByPk(new Long(id));
			if( productType!=null ){
				request.setAttribute("productType", productType);
			}else{
				formHandler.setFormMessage("Error : Not Found with id "+ id );
			}
		}
		forward("?page=/web/productTypeEdit.jsp");
	}
	public void update(HttpServletRequest request,HttpServletResponse response)throws Exception {
		ProductType productType = new ProductType(db);
		bindForm(productType);
		productType = productType.update();
		if( productType!=null ){
			request.setAttribute("productType", productType);
			formHandler.setFormMessage("Update Completed");
		}else{
			formHandler.setFormMessage("Update Failed");
		}
		forward("?page=/web/productTypeEdit.jsp");
	}

	// delete
	public void delete(HttpServletRequest request,HttpServletResponse response)throws Exception {
		String[] ids =  request.getParameterValues("id");
		if( ids!=null && ids.length>0 ){
			ProductType productType = new ProductType(db);
			List<Long> idList = new ArrayList<Long>();
			for( int i=0;i<ids.length;i++ )
				idList.add(new Long(ids[i]));
			int deleteRow = productType.deleteByPks(idList);
			formHandler.setFormMessage(" Delete "+deleteRow+" Row Completed ");
		}else{
			formHandler.setFormMessage("Plese Select At Least One For Delete");
		}
		redirect("process2?action=ProductType&cmd=list");
	}
}