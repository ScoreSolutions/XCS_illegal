package com.ko.webapp.action;

import java.util.Date;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.apache.axis.session.Session;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.json.JSONArray;
import org.springframework.web.bind.ServletRequestUtils;

import com.ko.Constants;
import com.ko.domain.EdOffice;
import com.ko.domain.Staff;
import com.ko.domain.Stockout;
import com.ko.domain.Unit;
import com.ko.util.DateUtil;
import com.ko.util.RunningKey;
import com.ko.webapp.bean.UserSession;

/**
 * 
 * @author SoCool
 * Action for การโอนสินค้าของกลาง
 */
public class ExhibitTransferAction extends ExhibitBaseAction {
	@Override
	protected void pre(HttpServletRequest request, HttpServletResponse response) throws Exception {
		//set parameter for jsp page
		
		menuID = "25";
		SQL_SELECT += " ,DECODE (so.status,'1','ทำรายการ','2','นำส่งแล้ว','3','ตรวจรับแล้ว') status_name, ed.offname offname_to";
		SQL_FROM = " FROM stockout so INNER JOIN legislation lg ON lg.ID = so.legislation_id " + " INNER JOIN staff st ON st.idcard_no = so.transfer_by "
				+ " LEFT JOIN title ti ON ti.title_code = st.title_code "
				+ " LEFT JOIN ed_office ed ON ed.offcode=so.offcode_to ";
		SQL_WHERE = " WHERE so.stockout_type = '5' ";
		JSP_SEARCH_PAGE = "?page=/ManageExhibit/transferExhibit_list.jsp";
		JSP_FORM_PAGE = "?page=/ManageExhibit/transferExhibit_form.jsp";

		//set tran log message
		TRAN_LOG_MSG_MENU = "แสดงรายการข้อมูลการโอนสินค้าของกลาง";
		TRAN_LOG_MSG_CREATE = "เพิ่มข้อมูลการโอนสินค้าของกลาง";
		TRAN_LOG_MSG_SEARCH = "ค้นหาข้อมูลการโอนสินค้าของกลาง";
		TRAN_LOG_MSG_DISPLAY = "แสดงรายละเอียดการโอนสินค้าของกลาง";
		TRAN_LOG_MSG_RESET = "ยกเลิกการแก้ไขข้อมูลการโอนสินค้าของกลาง";
		TRAN_LOG_MSG_CONFIRM = "ยืนยันการโอนสินค้าของกลาง";
		TRAN_LOG_MSG_SAVE = "บันทึกข้อมูลการโอนสินค้าของกลาง";
		go_action = "ExhibitTransfer";
		go_cmd = "edit&display=true";

		super.pre(request, response);
	}

	public void create(HttpServletRequest request, HttpServletResponse response) throws Exception {
		//HttpSession session = request.getSession();
		//UserSession us = (UserSession)session.getValue(Constants.USER_SESSION);
		
		pre(request, response);
		Stockout so = new Stockout(this.db);
		String job_no = so.genJobNo(String.valueOf(offcode));
		so.setJob_no(job_no);
		so.setOffName(offname);
		so.setStockout_date(new Date());
		so.setTransfer_by(uData.getIdCard());
		request.setAttribute("so", so);
		request.setAttribute("staff_name2", uData.getFullName());
		this.tranLogSave(TRAN_LOG_MSG_CREATE);
		forward(JSP_FORM_PAGE, request, response);
	}

	public void edit(HttpServletRequest request, HttpServletResponse response) throws Exception {
		pre(request, response);
		Long id = ServletRequestUtils.getLongParameter(request, "id", -1);
		if (id != -1) {
			Stockout so = new Stockout(this.db).findByPk(id);
			log.debug("so list="+so);
			so.setOffName(offname);
			request.setAttribute("so", so);

			Staff report_staff = so.getReportStaff();
			if (report_staff != null){
				request.setAttribute("staff_name", report_staff.getFullName());
				request.setAttribute("report_to_posname", report_staff.getReport_to_posname());
			}
			Staff transfer_staff = so.getTransferByStaff();
			if (transfer_staff != null)
				request.setAttribute("staff_name2", transfer_staff.getFullName());
			EdOffice office_to = so.getOfficeTo();
			//log.debug(so.toString());
			if (office_to != null)
				request.setAttribute("offname_to", office_to.getOffname());
			this.setStockoutItemList(request, so);
		}
		String reset = ServletRequestUtils.getStringParameter(request, "reset", "");
		if (!"".equals(reset)) {
			this.tranLogSave(TRAN_LOG_MSG_RESET);
		}
		String display = ServletRequestUtils.getStringParameter(request, "display", "");
		if (!"".equals(display)) {
			this.tranLogSave(TRAN_LOG_MSG_DISPLAY);
		}
		Unit unit = new Unit(this.db);
		String uSql = "select u.unit_code, u.thname, du.group_id ";
		uSql += " from unit u";
		uSql += " inner join duty_unit du on du.unit_code=u.unit_code ";
		uSql += " where du.used_for in ('A','S') ";
		uSql += " and to_date(sysdate) between to_date(du.begin_date) and to_date(nvl(du.end_date,sysdate)) ";
		uSql += " order by u.thname";
		log.debug("Transfer Unit List " +uSql);
		List<Map<String,Object>> unitlist = unit.findBySql(uSql);
		
		if(request.getParameter("SaveMsg") != null)
			request.setAttribute("SaveMsg", "1");
		forward(JSP_FORM_PAGE, request, response);
	}

	/**
	 * Business Logic for get data from request to model
	 * @param request
	 * @param stock_out
	 */
	protected boolean processUpdate(HttpServletRequest request) {
		Long id = ServletRequestUtils.getLongParameter(request, "id", -1);
		//String job_no = ServletRequestUtils.getStringParameter(request, "job_no", "");
		String stockout_code1 = ServletRequestUtils.getStringParameter(request, "stockout_code1", "");
		String stockout_code2 = ServletRequestUtils.getStringParameter(request, "stockout_code2", "");
		String stockout_date = ServletRequestUtils.getStringParameter(request, "stockout_date", "");
		String subject = ServletRequestUtils.getStringParameter(request, "subject", "");
		String subject_type = ServletRequestUtils.getStringParameter(request, "subject_type", "");
		String report_to_staff = ServletRequestUtils.getStringParameter(request, "report_to_staff", "");
		String report_to_posname = ServletRequestUtils.getStringParameter(request, "report_to_posname", "");
		String offcode_to = ServletRequestUtils.getStringParameter(request, "offcode_to", "");
		String transfer_by = ServletRequestUtils.getStringParameter(request, "transfer_by", "");
		Long legislation_id = ServletRequestUtils.getLongParameter(request, "legislation_id", -1);
		String remarks = ServletRequestUtils.getStringParameter(request, "remarks", "");
		String group_id = ServletRequestUtils.getStringParameter(request, "product_group_id", "");
		Stockout stock_out = new Stockout(this.db);
		boolean id_exist = false;
		if (id != -1) {//if id not equals -1 then process update
			try {
				stock_out = stock_out.findByPk(id);
				id_exist = true;
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
				log.error("Fail on Load Stockout:" + e.getMessage());
			}
		}
		//stock_out.setJob_no(job_no);
		stock_out.setStockout_code(stockout_code1 + "/" + stockout_code2);
		stock_out.setStockout_date(DateUtil.getDateFromString(stockout_date));
		stock_out.setSubject(subject);
		stock_out.setSubject_type(subject_type);
		if (legislation_id != -1)
			stock_out.setLegislation_id(legislation_id);
		stock_out.setReport_to_staff(report_to_staff);
		stock_out.setReport_to_posname(report_to_posname);
		if (!"".equals(offcode_to))
			stock_out.setOffcode_to(offcode_to);
		if (!"".equals(transfer_by))
			stock_out.setTransfer_by(transfer_by);
		stock_out.setRemarks(remarks);
		//set optional field
		stock_out.setStockout_type("5");
		stock_out.setGroup_id(group_id);

		if (id_exist) {
			try {
				stock_out.setUpdate_by(update_by);
				stock_out.setUpdate_on(update_on);
				stock_out = stock_out.update();
				updateChildExhibit(request, stock_out);
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
				log.error("Fail on Update Stockout:" + e.getMessage());
			}
		} else {
			try {
				stock_out.setJob_no(new RunningKey(db).getRunningKey("STOCKOUT", "STOCKOUT_TYPE", "5", offcode));
				stock_out.setCreate_by(create_by);
				stock_out.setCreate_on(create_on);
				stock_out.setOffcode(offcode);
				stock_out = stock_out.create();
				updateChildExhibit(request, stock_out);
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
				log.error("Fail on Create Stockout:" + e.getMessage());
			}
		}
		re_id = (stock_out.getId() == null) ? -1 : stock_out.getId();
		return id_exist;
	}
}
