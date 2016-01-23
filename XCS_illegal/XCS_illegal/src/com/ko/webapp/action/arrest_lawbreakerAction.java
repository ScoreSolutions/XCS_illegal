package com.ko.webapp.action;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.ko.domain.ApplicationArrestLawbreaker;
import com.ko.domain.Nationality;
import com.ko.domain.Race;
import com.ko.domain.Title;
import com.ko.util.DateUtil;

public class arrest_lawbreakerAction extends BaseAction{
	public void add(HttpServletRequest request,HttpServletResponse response)throws Exception {
		Race ra = new Race(db);
		Nationality na = new Nationality(db);
		Title ti = new Title(db);
		List raList = ra.findBySql("select id, race_name from race order by race_name");
		List naList = na.findBySql("select id, nation_name from nationality order by nation_name");
		List tiList = ti.findBySql("select title_code, title_name from title order by title_name");

		request.setAttribute("p1", request.getParameter("p1"));
		request.setAttribute("p2", request.getParameter("p2"));
		request.setAttribute("rach_popList", raList);
		request.setAttribute("nation_popList", naList);
		request.setAttribute("title_popList", tiList);
		forward("/Popup/arrest_lawbreaker_form.jsp", request, response);
	}
	/*
	public void create(HttpServletRequest request,HttpServletResponse response)throws Exception {
		try{
			ApplicationArrestLawbreaker aal = new ApplicationArrestLawbreaker();
			//SimpleDateFormat simdate = new SimpleDateFormat("dd-MM-yyyy");
			//Date n_date = simdate.parse(request.getParameter("Birthday"));
			aal.setCulprit_type(new Long(request.getParameter("cmbLawBreakerType")));
			aal.setLawbreaker_id_card(request.getParameter("txtIDCardNo"));
			aal.setSex(request.getParameter("sex"));
			aal.setTitle_code(request.getParameter("nick_name"));
			aal.setFirst_name(request.getParameter("first_name"));
			aal.setLast_name(request.getParameter("last_name"));
			aal.setOther_name(request.getParameter("other_name"));
			aal.setAddress_no(request.getParameter("home_number"));
			aal.setMoo(new Long(request.getParameter("moo")));
			aal.setSoi(request.getParameter("soi"));
			aal.setRoad(request.getParameter("road"));
			aal.setProvince(request.getParameter("province"));
			aal.setDistrict(request.getParameter("district"));
			aal.setSubdistrict(request.getParameter("tambol"));
			aal.setRace_id(new Long(request.getParameter("cmbRace")));
			aal.setNationality_id(new Long(request.getParameter("cmbNationality")));
			aal.setCareer(request.getParameter("career"));
			//aal.setBirth_date(new (request.getParameter("Birthday")));
			aal.setBirth_date(DateUtil.getDateFromString(request.getParameter("Birthday")));
			aal.setAge(new Long(request.getParameter("age")));
			aal.setFather_name(request.getParameter("father_name"));
			aal.setMother_name(request.getParameter("mother_name"));
			aal.create();

		}catch (Exception e){
			throw e;
		}
		forward("process?action=arrest_lawbreaker&cmd=add", request,response);
	}
	*/
	@Override
	public void _default(HttpServletRequest request, HttpServletResponse response) throws Exception {
		// TODO Auto-generated method stub

	}

}
