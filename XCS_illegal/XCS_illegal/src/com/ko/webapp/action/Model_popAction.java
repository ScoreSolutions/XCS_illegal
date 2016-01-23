package com.ko.webapp.action;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.ko.domain.Model;
import com.ko.webapp.util.ParameterUtil;

public class Model_popAction extends BaseAction{

	public void list(HttpServletRequest request,HttpServletResponse response)throws Exception {

		String group_id=request.getParameter("group_id");
		String model_name = ParameterUtil.getStringParam("model_name", request);
		String model_code = ParameterUtil.getStringParam("model_code", request);
		
		String whText = " where group_id = '" + group_id + "'";
		if(!model_name.trim().equals("")){
			whText += " and upper(model_name) like '%" + model_name.trim().toUpperCase() + "%'";
			request.setAttribute("model_name", model_name);
		}
		if(!model_code.trim().equals("")){
			whText += " and upper(model_code) like '%" + model_code.trim().toUpperCase() + "%'";
			request.setAttribute("model_code", model_code);
		}

		request.setAttribute("textCode", request.getParameter("textCode"));
		request.setAttribute("textName", request.getParameter("textName"));
		request.setAttribute("group_id", group_id);
		
		Model md = new Model(db);
		String sql = "";
		sql += " select model_code, model_name ";
		sql += " from model ";
		sql += whText;
		sql += " order by model_name";
		
		String sqlCount = "select count(*) ";
		sqlCount += " from model ";
		sqlCount += whText;
		
		log.debug(sql);
		log.debug(sqlCount);
		
		Integer totalRow = md.countBySql(sqlCount, null);
		pageUtil.setTotalRow(totalRow);
		List listModel = md.findBySql(sql, null,pageUtil);
		
		request.setAttribute("model_popList", listModel);
		forward("/Popup/model_pop.jsp", request, response);

	}
	@Override
	public void _default(HttpServletRequest request, HttpServletResponse response) throws Exception {
		// TODO Auto-generated method stub

	}

}
