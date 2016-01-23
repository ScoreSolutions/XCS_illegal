package com.ko.webapp.action;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


import com.ko.domain.BrandMain;
import com.ko.domain.BrandSecond;
import com.ko.webapp.util.ParameterUtil;


public class Brand_popAction extends BaseAction{
	public void list(HttpServletRequest request,HttpServletResponse response)throws Exception {
		String sql2;
		request.setAttribute("textCode", request.getParameter("textCode"));
		request.setAttribute("textName", request.getParameter("textName"));
		request.setAttribute("group_id", request.getParameter("group_id"));
		
		String pa = request.getParameter("duty");
		String chPage = request.getParameter("p");
		String groupID = request.getParameter("group_id");
		String isSecond = (request.getParameter("isSecond") != null ? request.getParameter("isSecond") : "");
		request.setAttribute("p", chPage);
		request.setAttribute("duty", pa);
		request.setAttribute("isSecond", isSecond);
		
		//StringBuffer where = new StringBuffer("");
		String txtNameBrand = ParameterUtil.getStringParam("txtNameBrand", request);
		String txtCodeBrand = ParameterUtil.getStringParam("txtCodeBrand", request);

		if(isSecond.equals("")){
			if (chPage.equals("Y")){//request form �ѭ����觢ͧ
				BrandMain brand = new BrandMain(db);
				String whText = " where bm.group_id = '"+groupID+"'";
				whText += " and to_date(sysdate) between to_date(nvl(bm.begin_date,sysdate)) and to_date(nvl(bm.end_date,sysdate)) ";
				if(!txtCodeBrand.trim().equals(""))
					whText += " and upper(bm.brand_main_code) like '%" + txtCodeBrand.trim().toUpperCase() + "%'";
				if(!txtNameBrand.trim().equals(""))
					whText += " and upper(nvl(bm.BRAND_MAIN_THAI,bm.BRAND_MAIN_ENG)) like '%" + txtNameBrand.trim().toUpperCase() + "%'";
				
				sql2="select bm.BRAND_MAIN_CODE, bm.BRAND_MAIN_THAI name_thai, bm.BRAND_MAIN_ENG name_eng, nvl(bm.brand_main_thai,bm.brand_main_eng) brand_name";
				sql2 += " from BRAND_MAIN bm ";
				sql2 += whText;
				sql2 += " order by bm.BRAND_MAIN_THAI, bm.BRAND_MAIN_ENG";
				log.debug(sql2);
				List brand_list = brand.findBySql(sql2, null,pageUtil);
				//log.debug(brand_list);
				request.setAttribute("brand_popList", brand_list);
	
				String countsql = "select count(*) ";
				countsql += " from BRAND_MAIN bm ";
				countsql += whText;
				Integer totalRow = brand.countBySql(countsql, null);
				pageUtil.setTotalRow(totalRow);
	
				forward("/Popup/brand_pop.jsp", request, response);
			}
		}else{
			String brandMainCode = request.getParameter("brand_main_code");
			request.setAttribute("brand_main_code", brandMainCode);
			
			BrandSecond brand = new BrandSecond(db);
			String whText = " where bs.group_id = '"+groupID+"' ";
			whText += " and trim(bs.brand_main_code) = '" + brandMainCode + "'";
			whText += " and trim(nvl(bs.BRAND_SECOND_NAME_THAI,bs.BRAND_SECOND_NAME_ENG)) is not null ";
			whText += " and to_date(sysdate) between to_date(nvl(bs.begin_date,sysdate)) and to_date(nvl(bs.end_date,sysdate)) ";
			if(!txtCodeBrand.trim().equals(""))
				whText += " and upper(bs.brand_second_code) like '%" + txtCodeBrand.trim().toUpperCase() + "%'";
			if(!txtNameBrand.trim().equals(""))
				whText += " and upper(nvl(bs.BRAND_SECOND_NAME_THAI,bs.BRAND_SECOND_NAME_ENG)) like '%" + txtNameBrand.trim().toUpperCase() + "%'";
			
			sql2="select bs.BRAND_SECOND_CODE brand_main_code, bs.BRAND_SECOND_NAME_THAI name_thai,bs.BRAND_SECOND_NAME_ENG name_eng, nvl(bs.BRAND_SECOND_NAME_THAI,bs.BRAND_SECOND_NAME_ENG) brand_name ";
			sql2 += " from BRAND_SECOND bs ";
			sql2 += whText;
			sql2 += " order by bs.BRAND_SECOND_NAME_THAI,bs.BRAND_SECOND_NAME_ENG ";
			//log.debug(sql2);
			List brand_list = brand.findBySql(sql2, null,pageUtil);
			//log.debug(brand_list);
			request.setAttribute("brand_popList", brand_list);

			String countsql = "select count(*) ";
			countsql += " from BRAND_SECOND bs ";
			countsql += whText;
			Integer totalRow = brand.countBySql(countsql, null);
			pageUtil.setTotalRow(totalRow);

			forward("/Popup/brand_pop.jsp", request, response);
		}

//		StringBuffer where = new StringBuffer("");
//		if(chPage.equals("N")){
//			sql2="select BRAND_MAIN_CODE,nvl(BRAND_MAIN_THAI,BRAND_MAIN_ENG) brand_name from BRAND_MAIN where 1 = 1";
//			BrandMain brand = new BrandMain(db);
//			log.debug(sql2+where);
//			String countsql = "select count(*) from BRAND_MAIN where 1 = 1";
//			Integer totalRow = brand.countBySql(countsql+where, null);
//			pageUtil.setTotalRow(totalRow);
//			
//			List brand_list = brand.findBySql(sql2+where, null,pageUtil);
//			log.debug(brand_list);
//			request.setAttribute("brand_popList", brand_list);
//			forward("/Popup/brand_pop.jsp", request, response);
//		}
			
		request.setAttribute("p", request.getParameter("p"));
		request.setAttribute("textname", request.getParameter("textname"));
		request.setAttribute("textcode", request.getParameter("textcode"));
		request.setAttribute("group_id", request.getParameter("group_id"));


	}



	@Override
	public void _default(HttpServletRequest request, HttpServletResponse response) throws Exception {
		// TODO Auto-generated method stub

	}

}
