package com.ko.webapp.action;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.ko.domain.Product;
import com.ko.domain.SizePackage;
import com.ko.webapp.util.ParameterUtil;

public class Product_popAction extends BaseAction{

	public void list(HttpServletRequest request,HttpServletResponse response)throws Exception {
		String pa = request.getParameter("duty");
		String group_id=request.getParameter("group_id");
		String duty_code=request.getParameter("duty");
		request.setAttribute("duty", duty_code);
		
		String chPage = request.getParameter("p");
		//StringBuffer where = new StringBuffer("");
		String product_name = ParameterUtil.getStringParam("product_name", request);
		String product_code = ParameterUtil.getStringParam("product_code", request);

		String sql;
		request.setAttribute("textCode", request.getParameter("textCode"));
		request.setAttribute("p", request.getParameter("p"));
		request.setAttribute("textName", request.getParameter("textName"));
		request.setAttribute("group_id", group_id);

		String whText = " where substr(pd.product_code,1,4)= '"+duty_code+"'";
		if(!product_name.trim().equals(""))
			whText += " and upper(pd.product_name) like '%" + product_name.trim().toUpperCase() + "%'";
		if(!product_code.trim().equals(""))
			whText += " and pd.product_code like '%" + product_code.trim() + "%'";
		
		if (chPage.equals("Y")){//request form �ѭ����觢ͧ

			Product product = new Product(db);
			String sql1;
			sql1=" select pd.PRODUCT_CODE, pd.PRODUCT_NAME ";
			sql1 += " from PRODUCT  pd ";
			//sql1 += " inner join product_type pt on pt.duty_code=substr(pd.product_code,1,4) and pt.type_code= substr(pd.product_code,5,2)";
			sql1 += whText;
			
			String countsql = "select count(*) ";
			countsql += " from PRODUCT pd ";
			//countsql += " inner join product_type pt on pt.duty_code=substr(pd.product_code,1,4) and pt.type_code= substr(pd.product_code,5,2)";
			countsql += whText;

			Integer totalRow = product.countBySql(countsql, null);
			pageUtil.setTotalRow(totalRow);
			
			System.out.println(sql1);
			List listProduct = product.findBySql(sql1, null,pageUtil);
			
			request.setAttribute("product_popList", listProduct);
			forward("/Popup/products_pop.jsp", request, response);
		}
		if (chPage.equals("N")){
			String sql1;
			sql1="select PRODUCT_CODE,PRODUCT_NAME from PRODUCT where 1 = 1";
			
			Product product = new Product(db);
			String countsql = "select count(*) from PRODUCT where substr(PRODUCT_CODE,1,4)= '"+duty_code+"' ";
			
			Integer totalRow = product.countBySql(countsql+whText, null);
			pageUtil.setTotalRow(totalRow);
			List listProduct = product.findBySql(sql1+whText, null,pageUtil);
			//System.out.println(sql1+where);
			request.setAttribute("product_popList", listProduct);
			forward("/Popup/products_pop.jsp", request, response);
		}
	}
	
	@Override
	public void _default(HttpServletRequest request, HttpServletResponse response) throws Exception {
		// TODO Auto-generated method stub

	}

}
