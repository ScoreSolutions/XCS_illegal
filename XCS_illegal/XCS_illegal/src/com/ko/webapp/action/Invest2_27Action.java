package com.ko.webapp.action;


import java.io.File;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Map;
import java.util.Random;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.ko.domain.ApplicationSincereConfirm;
import com.ko.domain.ApplicationInvest;
import com.ko.domain.ApplicationInvestTeam;
import com.ko.domain.ApplicationSearchWarrant;
import com.ko.domain.DutyGroup;
import com.ko.domain.EdOffice;
import com.ko.domain.Legislation;
import com.ko.domain.Province;
import com.ko.domain.Running;
import com.ko.domain.Staff;
import com.ko.domain.TranLog;
import com.ko.domain.User;
import com.ko.util.DateUtil;
public class Invest2_27Action extends BaseAction{

	public void add(HttpServletRequest request,HttpServletResponse response)throws Exception {

		TranLog t = new TranLog(db);
		t.setTran_desc("������������§ҹ����׺�ǹ");
		t.setIp_address("191.10.11.11");
		t.setTran_date(new Date());
		t.setUserid("12345");
		t.create();

		Random generator = new Random();
		int rid = generator.nextInt(100000000);

		ApplicationInvest ai = new ApplicationInvest(db);
		ai.setTrack_no(rid+"");
		ai.setReport_date(new Date());
		ai.setStaff_idcardno_command("111111111");
		ai.setStaff_idcardno_invest("2222222222");
		ai.setPoscode_command("4");
		ai.setPoscode_invest("3");
		ai.setOffcode_command("2");
		ai.setOffcode_invest("1");
		request.setAttribute("ai", ai);


		ApplicationInvestTeam ait = new  ApplicationInvestTeam(db);
	    List<ApplicationInvestTeam>  aitlist =  new ArrayList<ApplicationInvestTeam>();
	    	//ait.findByWhere(" APPLICATION_INVEST_ID = ? ", ai.getId());
	    request.setAttribute("aitlist", aitlist);


		Staff st = new Staff(db);
		EdOffice  ed = new EdOffice(db);
		Legislation lg = new Legislation(db);
		List<Legislation>  lglist =  lg.findAll();
		request.setAttribute("lglist",lglist);

		DutyGroup dt = new DutyGroup(db);
		List<DutyGroup> dtlist = dt.findAll();
		System.out.println("dtlist : "+dtlist.size());
		request.setAttribute("dtlist", dtlist);

		Province pv = new Province(db);
		List<Province> pvlist =  pv.findAll();
		request.setAttribute("pvlist", pvlist);




		forward("?page=/Invest/createinvestreport2.jsp", request, response);
	}
	public void create(HttpServletRequest request,HttpServletResponse response)throws Exception {

		ApplicationInvest ai = new ApplicationInvest(db);
		ai.setAddress_name(request.getParameter("address_name"));
		ai.setAddress_no(request.getParameter("address_no"));
		ai.setConfidence_gauge(request.getParameter("confidence_gauge"));
		ai.setCoordinate_x(Double.parseDouble(request.getParameter("coordinate_x")));
		ai.setCoordinate_y(Double.parseDouble(request.getParameter("coordinate_y")));
		ai.setCreate_by(Long.parseLong("12345"));
		ai.setCreate_on(new Date());
		ai.setDistrict_code(request.getParameter("district_code"));
//		str =
//		SimpleDateFormat formatter = new SimpleDateFormat("dd-MM-yyyy"); //please notice the capital M
//		Date date = formatter.parse(str);
		ai.setEnd_date(DateUtil.getDateFromString(request.getParameter("end_date")+" "+request.getParameter("end_time")));
		ai.setInvest_desc(request.getParameter("invest_desc"));
		ai.setInvest_no(request.getParameter("invest_no_1")+"/"+request.getParameter("invest_no_2"));
		ai.setInvest_qty(Long.parseLong(request.getParameter("invest_qty")));
	//	ai.setLegislation_id(Long.parseLong(request.getParameter("legislation_id")));
		ai.setLegislation_id(Long.parseLong("4"));
		ai.setMap_desc(request.getParameter("map_desc"));
	//	ai.setMap_picture(new File(request.getParameter("map_picture")));
		ai.setMoo(Long.parseLong(request.getParameter("moo")));
		ai.setNews_value(request.getParameter("news_value"));
		ai.setOffcode_command(request.getParameter("offcode_command"));
		ai.setOffcode_invest(request.getParameter("offcode_invest"));
		ai.setPoscode_command(request.getParameter("poscode_command"));
		ai.setPoscode_invest(request.getParameter("poscode_invest"));
		ai.setProduct_group_id(request.getParameter("product_group_id"));
		ai.setProvince_code(request.getParameter("province_code"));
		ai.setReport_date(DateUtil.getDateFromString(request.getParameter("report_date")));
		ai.setRoad(request.getParameter("road"));
		ai.setSoi(request.getParameter("soi"));
		ai.setStaff_idcardno_command(request.getParameter("staff_idcardno_command"));
		ai.setStaff_idcardno_invest(request.getParameter("staff_idcardno_invest"));
		ai.setStart_date(DateUtil.getDateFromString(request.getParameter("start_date") +" " + request.getParameter("start_time")));
		ai.setSubdistrict_code(request.getParameter("subdistrict_code"));
		ai.setTel(request.getParameter("tel"));
		ai.setTrack_no(request.getParameter("track_no"));
		ai.setUpdate_by(Long.parseLong("123456"));
		ai.setUpdate_on(new Date());
		ai.setZipcode(request.getParameter("zipcode"));
        ai =  ai.create();


        ApplicationInvestTeam ait = null ;

        String[] staff_idcard_no = request.getParameterValues("staff_idcard_no");
        for(int i=0; i< staff_idcard_no.length;i++){
        	ait = new  ApplicationInvestTeam(db);
        	ait.setApplication_invest_id(ai.getId());
        	ait.setCreate_by(Long.parseLong("111111111111"));
        	ait.setCreate_on(new Date());
        	ait.setOffcode_staff(request.getParameterValues("offcode_staff")[i]);
        	ait.setPoscode_staff(request.getParameterValues("poscode_staff")[i]);
        	ait.setStaff_idcard_no(staff_idcard_no[i]);
        	ait.setUpdate_by(Long.parseLong("11111111111"));
        	ait.setUpdate_on(new Date());
        	ait.create();
        }

        TranLog t = new TranLog(db);
		t.setTran_desc("�ѹ�֡��§ҹ����׺�ǹ");
		t.setIp_address("191.10.11.11");
		t.setTran_date(new Date());
		t.setUserid("12345");
		t.create();

        forward("process?action=Invest&cmd=add", request,response);
	}

	// retrive
	public void view(HttpServletRequest request,HttpServletResponse response)throws Exception {


			TranLog t = new TranLog(db);
			t.setTran_desc("���������§ҹ����׺�ǹ");
			t.setIp_address("191.10.11.11");
			t.setTran_date(new Date());
			t.setUserid("12345");
			t.create();

			String id = request.getParameter("id");

			ApplicationInvest ai = new ApplicationInvest(db);
			ai = ai.findByPk(Long.parseLong(id));
			System.out.println(" id : "+ ai.getId());
            request.setAttribute("ai",ai );

			ApplicationInvestTeam ait = new  ApplicationInvestTeam(db);
		    List<ApplicationInvestTeam>  aitlist =  ait.findByWhere(" APPLICATION_INVEST_ID = ? ", ai.getId());
		    request.setAttribute("aitlist", aitlist);

			Legislation lg = new Legislation(db);
			List<Legislation>  lglist =  lg.findAll();
			request.setAttribute("lglist",lglist);

			DutyGroup dt = new DutyGroup(db);
			List<DutyGroup> dtlist = dt.findAll();
			System.out.println("dtlist : "+dtlist.size());
			request.setAttribute("dtlist", dtlist);

			Province pv = new Province(db);
			List<Province> pvlist =  pv.findAll();
			request.setAttribute("pvlist", pvlist);




			forward("?page=/Invest/updateinvestreport2.jsp", request, response);
	}

	public void update(HttpServletRequest request,HttpServletResponse response)throws Exception {

		ApplicationInvest ai = new ApplicationInvest(db);
		ai.setId(Long.parseLong(request.getParameter("id")));
		ai.setAddress_name(request.getParameter("address_name"));
		ai.setAddress_no(request.getParameter("address_no"));
		ai.setConfidence_gauge(request.getParameter("confidence_gauge"));
		ai.setCoordinate_x(Double.parseDouble(request.getParameter("coordinate_x")));
		ai.setCoordinate_y(Double.parseDouble(request.getParameter("coordinate_y")));
		ai.setCreate_by(Long.parseLong("12345"));
		ai.setCreate_on(new Date());
		ai.setDistrict_code(request.getParameter("district_code"));
//		str =
//		SimpleDateFormat formatter = new SimpleDateFormat("dd-MM-yyyy"); //please notice the capital M
//		Date date = formatter.parse(str);
		ai.setEnd_date(DateUtil.getDateFromString(request.getParameter("end_date")+" "+request.getParameter("end_time")));
		ai.setInvest_desc(request.getParameter("invest_desc"));
		ai.setInvest_no(request.getParameter("invest_no_1")+"/"+request.getParameter("invest_no_2"));
		ai.setInvest_qty(Long.parseLong(request.getParameter("invest_qty")));
	//	ai.setLegislation_id(Long.parseLong(request.getParameter("legislation_id")));
		ai.setLegislation_id(Long.parseLong("4"));
		ai.setMap_desc(request.getParameter("map_desc"));
	//	ai.setMap_picture(new File(request.getParameter("map_picture")));
		ai.setMoo(Long.parseLong(request.getParameter("moo")));
		ai.setNews_value(request.getParameter("news_value"));
		ai.setOffcode_command(request.getParameter("offcode_command"));
		ai.setOffcode_invest(request.getParameter("offcode_invest"));
		ai.setPoscode_command(request.getParameter("poscode_command"));
		ai.setPoscode_invest(request.getParameter("poscode_invest"));
		ai.setProduct_group_id(request.getParameter("product_group_id"));
		ai.setProvince_code(request.getParameter("province_code"));
		ai.setReport_date(DateUtil.getDateFromString(request.getParameter("report_date")));
		ai.setRoad(request.getParameter("road"));
		ai.setSoi(request.getParameter("soi"));
		ai.setStaff_idcardno_command(request.getParameter("staff_idcardno_command"));
		ai.setStaff_idcardno_invest(request.getParameter("staff_idcardno_invest"));
		ai.setStart_date(DateUtil.getDateFromString(request.getParameter("start_date") +" " + request.getParameter("start_time")));
		ai.setSubdistrict_code(request.getParameter("subdistrict_code"));
		ai.setTel(request.getParameter("tel"));
		ai.setTrack_no(request.getParameter("track_no"));
		ai.setUpdate_by(Long.parseLong("123456"));
		ai.setUpdate_on(new Date());
		ai.setZipcode(request.getParameter("zipcode"));
        ai =  ai.update();


        ApplicationInvestTeam ait = null ;

        String[] staff_idcard_no = request.getParameterValues("staff_idcard_no");
        for(int i=0; i< staff_idcard_no.length;i++){
        	ait = new  ApplicationInvestTeam(db);
        	ait.setApplication_invest_id(ai.getId());
        	ait.setCreate_by(Long.parseLong("111111111111"));
        	ait.setCreate_on(new Date());
        	ait.setOffcode_staff(request.getParameterValues("offcode_staff")[i]);
        	ait.setPoscode_staff(request.getParameterValues("poscode_staff")[i]);
        	ait.setStaff_idcard_no(staff_idcard_no[i]);
        	ait.setUpdate_by(Long.parseLong("11111111111"));
        	ait.setUpdate_on(new Date());
        	ait.update();
        }

        TranLog t = new TranLog(db);
		t.setTran_desc("�ѹ�֡��§ҹ����׺�ǹ");
		t.setIp_address("191.10.11.11");
		t.setTran_date(new Date());
		t.setUserid("12345");
		t.create();

        forward("process?action=Invest&cmd=add", request,response);
	}

	// delete
	public void delete(HttpServletRequest request,HttpServletResponse response)throws Exception {

		ApplicationInvest ai = new ApplicationInvest(db);
		ai.deleteByPk(new Long(request.getParameter("id")));
		ApplicationInvestTeam ait = new ApplicationInvestTeam(db);
		ait.deleteByWhere(" APPLICATION_INVEST_ID = ? ", new Long(request.getParameter("id")));
		redirect("process?action=Invest&cmd=list", request,response);
	}





	// update
	public void edit(HttpServletRequest request,HttpServletResponse response)throws Exception {
		User user =new User(db);
		Long id = new Long(request.getParameter("id"));
		user = user.findByPk(id);
		System.out.println(user);
		request.setAttribute("user", user);
		forward("/test/edit.jsp", request, response);
	}


	@Override
	public void _default(HttpServletRequest request, HttpServletResponse response) throws Exception {
		// TODO Auto-generated method stub
		list(request, response);
	}







	public void list(HttpServletRequest request,HttpServletResponse response)throws Exception {
		// select data
		ApplicationSincereConfirm asf = new ApplicationSincereConfirm(db);

		List<ApplicationSincereConfirm> listasf = asf.findAll();
		//	for data to display
		System.out.println(listasf.get(0));
		request.setAttribute("listasf", listasf);
		//System.out.println(listasf.size());

		//	for screen to show
		forward("?page=/Invest/2_27_list.jsp", request, response);

	}







}
