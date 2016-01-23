








 

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
import com.ko.domain.SendIncomeCase;

public class SendIncomeCaseAction extends BaseAction{
	@Override
	public void _default(HttpServletRequest request, HttpServletResponse response) throws Exception {
		// TODO Auto-generated method stub
	}
	// list
	public void list(HttpServletRequest request,HttpServletResponse response)throws Exception {
		SendIncomeCase sendIncomeCase =new SendIncomeCase(db);
		// pageUtil.setPageSize(15);
		Integer totalRow = sendIncomeCase.countAll();

		// set TotalRow
		pageUtil.setTotalRow(totalRow);
		List<SendIncomeCase> sendIncomeCases = sendIncomeCase.findAll(pageUtil);

		//	for data to display
		request.setAttribute("sendIncomeCases", sendIncomeCases);

		//	for screen to show
		forward("?page=/web/sendIncomeCaseList.jsp");
	}

	//	 create
	public void add(HttpServletRequest request,HttpServletResponse response)throws Exception {
		forward("?page=/web/sendIncomeCaseCreate.jsp");
	}
	public void create(HttpServletRequest request,HttpServletResponse response)throws Exception {
		SendIncomeCase sendIncomeCase = new SendIncomeCase(db);
		bindForm(sendIncomeCase);
		sendIncomeCase = sendIncomeCase.create();
		if( sendIncomeCase!= null )
			formHandler.setFormMessage("Create Completed ,view <a href='process2?action=SendIncomeCase&cmd=view&id="+sendIncomeCase.getId()+"' target='_blank'>new Record</a>");
		else
			formHandler.setFormMessage("Create Not Complete");
		redirect("process2?action=SendIncomeCase&cmd=add");
	}

	// view
	public void view(HttpServletRequest request,HttpServletResponse response)throws Exception {
		String id =  request.getParameter("id");
		if( id!=null && !id.trim().equals("") ){
			SendIncomeCase sendIncomeCase = new SendIncomeCase(db);
			sendIncomeCase = sendIncomeCase.findByPk(new Long(id));
			if( sendIncomeCase!=null ){
				request.setAttribute("sendIncomeCase", sendIncomeCase);
			}else{
				formHandler.setFormMessage("Error : Not Found with id "+ id );
			}
		}else{
			formHandler.setFormMessage("Error : Please Enter id");
		}
		forward("?page=/web/sendIncomeCaseView.jsp");
	}

	// update
	public void edit(HttpServletRequest request,HttpServletResponse response)throws Exception {
		String id =  request.getParameter("id");
		if( id!=null && !id.trim().equals("") ){
			SendIncomeCase sendIncomeCase =new SendIncomeCase(db);
			sendIncomeCase = sendIncomeCase.findByPk(new Long(id));
			if( sendIncomeCase!=null ){
				request.setAttribute("sendIncomeCase", sendIncomeCase);
			}else{
				formHandler.setFormMessage("Error : Not Found with id "+ id );
			}
		}
		forward("?page=/web/sendIncomeCaseEdit.jsp");
	}
	public void update(HttpServletRequest request,HttpServletResponse response)throws Exception {
		SendIncomeCase sendIncomeCase = new SendIncomeCase(db);
		bindForm(sendIncomeCase);
		sendIncomeCase = sendIncomeCase.update();
		if( sendIncomeCase!=null ){
			request.setAttribute("sendIncomeCase", sendIncomeCase);
			formHandler.setFormMessage("Update Completed");
		}else{
			formHandler.setFormMessage("Update Failed");
		}
		forward("?page=/web/sendIncomeCaseEdit.jsp");
	}

	// delete
	public void delete(HttpServletRequest request,HttpServletResponse response)throws Exception {
		String[] ids =  request.getParameterValues("id");
		if( ids!=null && ids.length>0 ){
			SendIncomeCase sendIncomeCase = new SendIncomeCase(db);
			List<Long> idList = new ArrayList<Long>();
			for( int i=0;i<ids.length;i++ )
				idList.add(new Long(ids[i]));
			int deleteRow = sendIncomeCase.deleteByPks(idList);
			formHandler.setFormMessage(" Delete "+deleteRow+" Row Completed ");
		}else{
			formHandler.setFormMessage("Plese Select At Least One For Delete");
		}
		redirect("process2?action=SendIncomeCase&cmd=list");
	}
}