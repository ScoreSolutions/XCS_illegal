package com.ko.webapp.action;


import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


import com.ko.domain.ApplicationArrestExhibit;
import com.ko.domain.ApplicationNoticeArrest;
import com.ko.domain.BrandMain;
import com.ko.domain.Legislation;
import com.ko.domain.InspectorTeam;
import com.ko.domain.Lawbreaker;
import com.ko.webapp.util.ParameterUtil;


public class Case_popAction extends BaseAction{

	public void list(HttpServletRequest request,HttpServletResponse response)throws Exception {
		ApplicationArrestExhibit aae = new ApplicationArrestExhibit(db);
		String aaesql ;
		aaesql="select aae.id application_arrest_exhibit_id, bi.case_id ,bi.case_date, " +
				"to_char(bi.case_date, 'dd/mm/yyyy', 'NLS_CALENDAR=''THAI BUDDHA'' NLS_DATE_LANGUAGE=THAI') case_date2, " +
				"aa.legislation_id, lg.legislation_name, nvl(aae.product_name, nvl(dt.duty_name,pd.product_name)) || case when aae.group_id is not null then ' ยี่ห้อ ' || nvl(b.brand_main_thai,b.brand_main_eng) else '' end product_name_show ," +
				" aae.sizes_desc || ' ' || nvl(aae.sizes_unit_name,nvl(su.thname,su.enname)) sizes," +
				" aae.qty || ' ' || nvl(aae.qty_unit_name,nvl(qu.thname,qu.enname)) qtyshow " +
				" ,aae.id, aae.TRACK_NO , aae.ISEXHIBITCO, aae.PRODUCT_CODE," +
				" aae.BRAND_CODE, aae.ISDOMESTIC, aae.SIZES_CODE," +
				" aae.SIZE_UNIT_CODE, nvl(aae.sizes_unit_name,nvl(su.thname,su.enname)) size_unit_name, " +
				" aae.QTY, aae.qty_unit_code, nvl(aae.qty_unit_name,nvl(qu.thname,qu.enname)) qty_unit_name, " +
				" aae.NETWEIGHT, aae.NETWEIGHT_UNIT_CODE, nvl(aae.netweight_unit_name,nvl(qu.thname, qu.enname)) netweight_unit_name, " +
				" aae.STATUS, aae.EXHIBIT_LIST, aae.EXHIBIT_DESC, " +
				" aae.CAR_NO, aae.APPLICATION_ARREST_EXHIBIT_ID co_id, aae.DUTY_CODE, aae.REMARKS," +
				" aae.CREATE_BY, aae.CREATE_ON, aae.UPDATE_BY, aae.UPDATE_ON, " +
				" nvl(aae.brand_name,nvl(b.brand_main_thai, b.brand_main_eng)) brand_name," +
				" dt.duty_name, aae.sizes_desc size_desc,  " +
				" nvl(aae.product_name,pd.product_name) product_name  " +
				"from book_impeachment bi " +
				"inner join application_arrest aa on aa.track_no=bi.track_no " +
				"inner join legislation lg on lg.id=aa.legislation_id " +
				"inner join application_arrest_exhibit aae on aa.track_no=aae.track_no " +
				" left join product pd on pd.product_code=aae.product_code " +
				" left join brand_main b on b.brand_main_code=aae.brand_code and b.group_id = aae.group_id " +
				" left join unit su on su.unit_code = aae.size_unit_code " +
				" left join unit qu on qu.unit_code = aae.qty_unit_code " +
				" left join unit wu on wu.unit_code = aae.netweight_unit_code " +
				//" left join size_package sp on sp.duty_code=aae.duty_code and sp.size_code=aae.sizes_code" +
				" left join DUTY_TABLE dt on dt.duty_code=aae.duty_code" +
				" where aa.legislation_id='" + request.getParameter("legislation_id") + "' ";

		String sql1 ="select count(aae.id)  " +
		"from book_impeachment bi " +
		"inner join application_arrest aa on aa.track_no=bi.track_no " +
		"inner join legislation lg on lg.id=aa.legislation_id " +
		"inner join application_arrest_exhibit aae on aa.track_no=aae.track_no " +
		" left join product pd on pd.product_code=aae.product_code " +
		" left join brand_main b on b.brand_main_code=aae.brand_code and b.group_id = aae.group_id " +
		" left join unit su on su.unit_code = aae.size_unit_code " +
		" left join unit qu on qu.unit_code = aae.qty_unit_code " +
		" left join unit wu on wu.unit_code = aae.netweight_unit_code " +
		//" left join size_package sp on sp.duty_code=aae.duty_code and sp.size_code=aae.sizes_code" +
		" left join DUTY_TABLE dt on dt.duty_code=aae.duty_code" +
		" where aa.legislation_id='" + request.getParameter("legislation_id") + "' ";

		if(request.getParameter("legislation_id") != null){
			Legislation lg = new Legislation(db);
			lg = lg.findByPk(new Long(request.getParameter("legislation_id").toString()));
			request.setAttribute("legislation_id", request.getParameter("legislation_id"));
			request.setAttribute("legislation_name", lg.getLegislation_name());
		}
		//System.out.println(request.getParameter("date_start"));
		//System.out.println(request.getParameter("date_end"));
		//System.out.println(request.getParameter("notice_start"));
		//System.out.println(request.getParameter("notice_end"));

		StringBuffer where = new StringBuffer("");
		String order="order by bi.case_date desc, bi.case_id desc";

		Date date_start = ParameterUtil.getDateParam("date_start", request);
		Date date_end = ParameterUtil.getDateParam("date_end", request);

		String StartDate = request.getParameter("date_start");
		String EndDate = request.getParameter("date_end");
		int a;
		// genereate where
		if( date_start != null && date_end != null ){
			where.append(" AND add_months(to_date(bi.case_date),6516) between to_date(?) ");
			a=where.indexOf("?");
			where.replace(a, a+1, "");
			where.insert(a, "'"+StartDate+"','dd/mm/yyyy'");
			where.append(" AND to_date(?)");
			a=where.indexOf("?");
			where.replace(a, a+1, "");
			where.insert(a, "'"+EndDate+"','dd/mm/yyyy'");
			System.out.println(where.toString());
		}



		Integer totalRow = aae.countBySql(sql1+where.toString(), null);
		pageUtil.setTotalRow(totalRow);
		pageUtil.setPageSize(20);
		

		System.out.println(aaesql+where.toString()+order);
		List<Map<String,Object>> aae_list = aae.findBySql(aaesql+where.toString()+order, null,pageUtil);
		System.out.println(aae_list);
		request.setAttribute("aae_list", aae_list);

		forward("/Popup/case_pop.jsp", request, response);
	}
	@Override
	public void _default(HttpServletRequest request, HttpServletResponse response) throws Exception {
		// TODO Auto-generated method stub
	
		
		Legislation lg = new Legislation(db);
		if(request.getParameter("legislation_id") != null){
			lg = lg.findByPk(new Long(request.getParameter("legislation_id").toString()));
			request.setAttribute("legislation_id", request.getParameter("legislation_id"));
			request.setAttribute("legislation_name", lg.getLegislation_name());
		}
		forward("/Popup/case_pop.jsp", request, response);

	}

}
