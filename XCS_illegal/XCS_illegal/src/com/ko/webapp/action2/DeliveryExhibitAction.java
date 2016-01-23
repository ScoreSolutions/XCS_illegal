








 

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
import com.ko.domain.DeliveryExhibit;

public class DeliveryExhibitAction extends BaseAction{
	@Override
	public void _default(HttpServletRequest request, HttpServletResponse response) throws Exception {
		// TODO Auto-generated method stub
	}
	// list
	public void list(HttpServletRequest request,HttpServletResponse response)throws Exception {
		DeliveryExhibit deliveryExhibit =new DeliveryExhibit(db);
		// pageUtil.setPageSize(15);
		Integer totalRow = deliveryExhibit.countAll();

		// set TotalRow
		pageUtil.setTotalRow(totalRow);
		List<DeliveryExhibit> deliveryExhibits = deliveryExhibit.findAll(pageUtil);

		//	for data to display
		request.setAttribute("deliveryExhibits", deliveryExhibits);

		//	for screen to show
		forward("?page=/web/deliveryExhibitList.jsp");
	}

	//	 create
	public void add(HttpServletRequest request,HttpServletResponse response)throws Exception {
		forward("?page=/web/deliveryExhibitCreate.jsp");
	}
	public void create(HttpServletRequest request,HttpServletResponse response)throws Exception {
		DeliveryExhibit deliveryExhibit = new DeliveryExhibit(db);
		bindForm(deliveryExhibit);
		deliveryExhibit = deliveryExhibit.create();
		if( deliveryExhibit!= null )
			formHandler.setFormMessage("Create Completed ,view <a href='process2?action=DeliveryExhibit&cmd=view&id="+deliveryExhibit.getId()+"' target='_blank'>new Record</a>");
		else
			formHandler.setFormMessage("Create Not Complete");
		redirect("process2?action=DeliveryExhibit&cmd=add");
	}

	// view
	public void view(HttpServletRequest request,HttpServletResponse response)throws Exception {
		String id =  request.getParameter("id");
		if( id!=null && !id.trim().equals("") ){
			DeliveryExhibit deliveryExhibit = new DeliveryExhibit(db);
			deliveryExhibit = deliveryExhibit.findByPk(new Long(id));
			if( deliveryExhibit!=null ){
				request.setAttribute("deliveryExhibit", deliveryExhibit);
			}else{
				formHandler.setFormMessage("Error : Not Found with id "+ id );
			}
		}else{
			formHandler.setFormMessage("Error : Please Enter id");
		}
		forward("?page=/web/deliveryExhibitView.jsp");
	}

	// update
	public void edit(HttpServletRequest request,HttpServletResponse response)throws Exception {
		String id =  request.getParameter("id");
		if( id!=null && !id.trim().equals("") ){
			DeliveryExhibit deliveryExhibit =new DeliveryExhibit(db);
			deliveryExhibit = deliveryExhibit.findByPk(new Long(id));
			if( deliveryExhibit!=null ){
				request.setAttribute("deliveryExhibit", deliveryExhibit);
			}else{
				formHandler.setFormMessage("Error : Not Found with id "+ id );
			}
		}
		forward("?page=/web/deliveryExhibitEdit.jsp");
	}
	public void update(HttpServletRequest request,HttpServletResponse response)throws Exception {
		DeliveryExhibit deliveryExhibit = new DeliveryExhibit(db);
		bindForm(deliveryExhibit);
		deliveryExhibit = deliveryExhibit.update();
		if( deliveryExhibit!=null ){
			request.setAttribute("deliveryExhibit", deliveryExhibit);
			formHandler.setFormMessage("Update Completed");
		}else{
			formHandler.setFormMessage("Update Failed");
		}
		forward("?page=/web/deliveryExhibitEdit.jsp");
	}

	// delete
	public void delete(HttpServletRequest request,HttpServletResponse response)throws Exception {
		String[] ids =  request.getParameterValues("id");
		if( ids!=null && ids.length>0 ){
			DeliveryExhibit deliveryExhibit = new DeliveryExhibit(db);
			List<Long> idList = new ArrayList<Long>();
			for( int i=0;i<ids.length;i++ )
				idList.add(new Long(ids[i]));
			int deleteRow = deliveryExhibit.deleteByPks(idList);
			formHandler.setFormMessage(" Delete "+deleteRow+" Row Completed ");
		}else{
			formHandler.setFormMessage("Plese Select At Least One For Delete");
		}
		redirect("process2?action=DeliveryExhibit&cmd=list");
	}
}