








 

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
import com.ko.domain.SendIncome;

public class SendIncomeAction extends BaseAction{
	@Override
	public void _default(HttpServletRequest request, HttpServletResponse response) throws Exception {
		// TODO Auto-generated method stub
	}
	// list
	public void list(HttpServletRequest request,HttpServletResponse response)throws Exception {
		SendIncome sendIncome =new SendIncome(db);
		// pageUtil.setPageSize(15);
		Integer totalRow = sendIncome.countAll();

		// set TotalRow
		pageUtil.setTotalRow(totalRow);
		List<SendIncome> sendIncomes = sendIncome.findAll(pageUtil);

		//	for data to display
		request.setAttribute("sendIncomes", sendIncomes);

		//	for screen to show
		forward("?page=/web/sendIncomeList.jsp");
	}

	//	 create
	public void add(HttpServletRequest request,HttpServletResponse response)throws Exception {
		forward("?page=/web/sendIncomeCreate.jsp");
	}
	public void create(HttpServletRequest request,HttpServletResponse response)throws Exception {
		SendIncome sendIncome = new SendIncome(db);
		bindForm(sendIncome);
		sendIncome = sendIncome.create();
		if( sendIncome!= null )
			formHandler.setFormMessage("Create Completed ,view <a href='process2?action=SendIncome&cmd=view&id="+sendIncome.getId()+"' target='_blank'>new Record</a>");
		else
			formHandler.setFormMessage("Create Not Complete");
		redirect("process2?action=SendIncome&cmd=add");
	}

	// view
	public void view(HttpServletRequest request,HttpServletResponse response)throws Exception {
		String id =  request.getParameter("id");
		if( id!=null && !id.trim().equals("") ){
			SendIncome sendIncome = new SendIncome(db);
			sendIncome = sendIncome.findByPk(new Long(id));
			if( sendIncome!=null ){
				request.setAttribute("sendIncome", sendIncome);
			}else{
				formHandler.setFormMessage("Error : Not Found with id "+ id );
			}
		}else{
			formHandler.setFormMessage("Error : Please Enter id");
		}
		forward("?page=/web/sendIncomeView.jsp");
	}

	// update
	public void edit(HttpServletRequest request,HttpServletResponse response)throws Exception {
		String id =  request.getParameter("id");
		if( id!=null && !id.trim().equals("") ){
			SendIncome sendIncome =new SendIncome(db);
			sendIncome = sendIncome.findByPk(new Long(id));
			if( sendIncome!=null ){
				request.setAttribute("sendIncome", sendIncome);
			}else{
				formHandler.setFormMessage("Error : Not Found with id "+ id );
			}
		}
		forward("?page=/web/sendIncomeEdit.jsp");
	}
	public void update(HttpServletRequest request,HttpServletResponse response)throws Exception {
		SendIncome sendIncome = new SendIncome(db);
		bindForm(sendIncome);
		sendIncome = sendIncome.update();
		if( sendIncome!=null ){
			request.setAttribute("sendIncome", sendIncome);
			formHandler.setFormMessage("Update Completed");
		}else{
			formHandler.setFormMessage("Update Failed");
		}
		forward("?page=/web/sendIncomeEdit.jsp");
	}

	// delete
	public void delete(HttpServletRequest request,HttpServletResponse response)throws Exception {
		String[] ids =  request.getParameterValues("id");
		if( ids!=null && ids.length>0 ){
			SendIncome sendIncome = new SendIncome(db);
			List<Long> idList = new ArrayList<Long>();
			for( int i=0;i<ids.length;i++ )
				idList.add(new Long(ids[i]));
			int deleteRow = sendIncome.deleteByPks(idList);
			formHandler.setFormMessage(" Delete "+deleteRow+" Row Completed ");
		}else{
			formHandler.setFormMessage("Plese Select At Least One For Delete");
		}
		redirect("process2?action=SendIncome&cmd=list");
	}
}