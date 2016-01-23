package com.ko.webapp.action;

import java.util.Date;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.ko.domain.Legislation;
import com.ko.domain.V_SELECT_EXHIBIT_POPUP;
import com.ko.webapp.util.ParameterUtil;

public class ManageExhibitAddPopAction extends BaseAction {
	public void pre(HttpServletRequest request, HttpServletResponse response) throws Exception {

		Legislation lt = new Legislation(db);
		List<Legislation> ltlist = lt.findByWhere(" 1=1 order by legislation_name", null);
		request.setAttribute("ltlist", ltlist);
		//log.debug(request.getParameter("stockout_id")+ " @@@@@@@@@@@@@");
		request.setAttribute("stockout_id", request.getParameter("stockout_id"));

	}

	public void list(HttpServletRequest request, HttpServletResponse response) throws Exception {
		
		String stockoutID = (!request.getParameter("stockout_id").equals("") ? request.getParameter("stockout_id") : "0");

		V_SELECT_EXHIBIT_POPUP v_exhibit = new V_SELECT_EXHIBIT_POPUP(db);
		String aaesql;
		aaesql = "select distinct * from V_SELECT_EXHIBIT_POPUP  where OFFCODE= " + "'" + offcode + "'  ";

		String countsql = "select count(*) from V_SELECT_EXHIBIT_POPUP  where  OFFCODE= " + "'" + offcode + "' ";
		StringBuffer where = new StringBuffer("");
		pre(request, response);
		Date date_start = ParameterUtil.getDateParam("date_start", request);
		Date date_end = ParameterUtil.getDateParam("date_end", request);
		String no1 = ParameterUtil.getStringParam("no1", request);
		String no2 = ParameterUtil.getStringParam("no2", request);
		String StartDate = request.getParameter("date_start");
		String EndDate = request.getParameter("date_end");
		String legislation = ParameterUtil.getStringParam("l_id", request);
		int a = 0;
		int i = 0;
		//log.debug("legislation" + legislation);
		if (!legislation.equals("")) {
			where.append("and legislation_id = ? ");
			i = where.indexOf("?");
			where.replace(i, i + 1, "");
			where.insert(i, "'" + legislation + "'");

		}
		if ((!no1.trim().equals("")) && (!no2.trim().equals(""))) {
			where.append("and DELIVERY_CODE between  ? ");
			i = where.indexOf("?");
			where.replace(i, i + 1, "");
			where.insert(i, "'" + no1 + "'");
			where.append("and   ? ");
			i = where.indexOf("?");
			where.replace(i, i + 1, "");
			where.insert(i, "'" + no2 + "'");
		}
		if (date_start != null && date_end != null) {
			where.append(" AND add_months(to_date(DELIVERY_DATE),6516) between to_date(?) ");
			a = where.indexOf("?");
			where.replace(a, a + 1, "");
			where.insert(a, "'" + StartDate + "','dd/mm/yyyy'");
			where.append(" AND to_date(?)");
			a = where.indexOf("?");
			where.replace(a, a + 1, "");
			where.insert(a, "'" + EndDate + "','dd/mm/yyyy'");
		}
		Integer totalRow = v_exhibit.countBySql(countsql + where.toString(), null);
		pageUtil.setTotalRow(totalRow);
		pageUtil.setPageSize(20);
//log.debug(aaesql + where.toString());
		List v_exhibit_list = v_exhibit.findBySql(aaesql + where.toString(), null, pageUtil);
		request.setAttribute("v_exhibit_list", v_exhibit_list);
		//log.debug(v_exhibit_list);

		forward("/Popup/manage_exhibit_add.jsp", request, response);
	}

	@Override
	public void _default(HttpServletRequest request, HttpServletResponse response) throws Exception {
		// TODO Auto-generated method stub
		pre(request, response);
		forward("/Popup/manage_exhibit_add.jsp", request, response);

	}
}
