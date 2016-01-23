package com.ko.webapp.action;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.web.bind.ServletRequestUtils;

import com.ko.domain.Stockout;
import com.ko.util.DateUtil;

/**
 * 
 * @author SoCool
 * Action for การทำลายของกลาง
 */
public class ExhibitDestroyAction extends ExhibitBaseAction {
	private final Log logger = LogFactory.getLog(getClass());

	@Override
	protected void pre(HttpServletRequest request, HttpServletResponse response) throws Exception {
		//set parameter for jsp page
		menuID = "21";
		SQL_WHERE = " WHERE so.stockout_type = '1' ";
		JSP_SEARCH_PAGE = "?page=/ManageExhibit/destroy_exhibit_search.jsp";
		JSP_FORM_PAGE = "?page=/ManageExhibit/destroy_exhibit_form.jsp";

		//set tran log message
		TRAN_LOG_MSG_MENU = "แสดงรายการข้อมูลการทำลายของกลาง";
		TRAN_LOG_MSG_CREATE = "เพิ่มข้อมูลการทำลายของกลาง";
		TRAN_LOG_MSG_SEARCH = "ค้นหาข้อมูลการทำลายของกลาง";
		TRAN_LOG_MSG_DISPLAY = "แสดงรายละเอียดการทำลายของกลาง";
		TRAN_LOG_MSG_RESET = "ยกเลิกการแก้ไขข้อมูลการทำลายของกลาง";
		TRAN_LOG_MSG_CONFIRM = "ยืนยันการทำลายของกลาง";
		TRAN_LOG_MSG_SAVE = "บันทึกข้อมูลการทำลายของกลาง";
		go_action = "ExhibitDestroy";
		go_cmd = "edit&display=true";
		super.pre(request, response);
	}

	/**
	 * Business Logic for get data from request to model
	 * @param request
	 * @param stock_out
	 */
	protected boolean processUpdate(HttpServletRequest request) {
		//chkDupStockoutItem()
		boolean id_exist = false;

		Long id = ServletRequestUtils.getLongParameter(request, "id", -1);
		String stockout_code1 = ServletRequestUtils.getStringParameter(request, "stockout_code1", "");
		String stockout_code2 = ServletRequestUtils.getStringParameter(request, "stockout_code2", "");
		String stockout_date = ServletRequestUtils.getStringParameter(request, "stockout_date", "");
		String subject = ServletRequestUtils.getStringParameter(request, "subject", "");
		String report_to_staff = ServletRequestUtils.getStringParameter(request, "report_to_staff", "");
		String report_to_posname = ServletRequestUtils.getStringParameter(request, "report_to_posname", "");
		Long legislation_id = ServletRequestUtils.getLongParameter(request, "legislation_id", -1);
		String remarks = ServletRequestUtils.getStringParameter(request, "remarks", "");
		Stockout stock_out = new Stockout(this.db);
		
		if (id != -1) {//if id not equals -1 then process update
			try {
				stock_out = stock_out.findByPk(id);
				id_exist = true;
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
				//logger.error("Fail on Load Stockout:" + e.getMessage());
			}
		}

		stock_out.setStockout_code(stockout_code1 + "/" + stockout_code2);
		stock_out.setStockout_date(DateUtil.getDateFromString(stockout_date));
		stock_out.setSubject(subject);
		stock_out.setReport_to_staff(report_to_staff);
		stock_out.setReport_to_posname(report_to_posname);
		if (legislation_id != -1)
			stock_out.setLegislation_id(legislation_id);
		stock_out.setRemarks(remarks);
		//set optional field
		stock_out.setStockout_type("1");

		if (id_exist) {
			try {
				stock_out.setUpdate_by(legislation_id);

				stock_out.setUpdate_on(update_on);
				stock_out = stock_out.update();
				updateChildExhibit(request, stock_out);
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
				//logger.error("Fail on Update Stockout:" + e.getMessage());
			}
		} else {
			try {
				stock_out.setCreate_on(create_on);
				stock_out.setCreate_by(new Long(this.create_by));
				stock_out.setOffcode(offcode);
				stock_out = stock_out.create();
				updateChildExhibit(request, stock_out);
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
				//logger.error("Fail on Create Stockout:" + e.getMessage());
			}
		}
		re_id = (stock_out.getId() == null) ? -1 : stock_out.getId();
		return id_exist;
	}
}
