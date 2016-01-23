package com.ko.webapp.action;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.ko.domain.Lawbreaker;
import com.ko.domain.Suspect;

public class ArrestLawbreakerFind_popAction extends BaseAction{

	@Override
	public void _default(HttpServletRequest request, HttpServletResponse response) throws Exception {
		// TODO Auto-generated method stub
		System.out.println("_default");
		forward("?page=/Popup/arrest_lawbreaker_find_pop.jsp", request,response);
	}
	
	private void searchData(HttpServletRequest request, HttpServletResponse response) throws Exception {
		Lawbreaker v = new Lawbreaker(db);
		Lawbreaker cv = new Lawbreaker(db);
		String sql="" ;
		String sql0 ;
		String sql2;

		ArrayList<String> alcon= new ArrayList();
		ArrayList<String> alin = new ArrayList();
		sql0 = "select lb.id, lb.lawbreaker_id_card,  trim(case lb.lawbreaker_type "
			+" when '1' then t.title_name || lb.first_name || ' ' || lb.last_name"
			+" when '2' then t.title_name || lb.first_name || ' ' || lb.middle_name || ' ' || lb.last_name"
			+" when '3' then tc.title_name || lb.company_name end) lawbreaker_name, 'L' lstype, "
			+" pke_lawbreaker.getLawbreakerAddress(lb.id) lawbreaker_address, lb.lawbreaker_no "
			+" from lawbreaker lb"
			+" left join title t on t.title_code=lb.title_code"
			+" left join title tc on tc.title_code=lb.title_code_company"
			+" where lb.lawbreaker_type ='1' ";
		sql2 = "select count(lb.id) from lawbreaker lb"
			+" left join title t on t.title_code=lb.title_code"
			+" left join title tc on tc.title_code=lb.title_code_company"
			+" where lb.lawbreaker_type ='1' ";
		
		if(request.getAttribute("showPop").toString().equals("1")){
			alcon.add(" and lb.lawbreaker_id_card like '%");
			alin.add(request.getAttribute("txtIdcardNo").toString() + "%'");
		}else{
			alcon.add(" AND upper(case lb.lawbreaker_type "
				+" when '1' then t.title_name || lb.first_name || ' ' || lb.last_name"
				+" when '2' then t.title_name || lb.first_name || ' ' || lb.middle_name || ' ' || lb.last_name"
				+" when '3' then tc.title_name || lb.company_name end)  like '%");
				alin.add(request.getParameter("txtfname").toString().toUpperCase()+"%'");
			
			alcon.add(" and lb.lawbreaker_id_card like '%");
			alin.add(request.getParameter("txtIdcardNo")+"%'");
		}
		
		for(int i = 0; i < alin.size();i++){
			if(alin.get(i).equals("%'")){alcon.set(i, "");
			alin.set(i,"");}
			sql += alcon.get(i) + alin.get(i);
		}
		sql+=" order by lb.first_name,lb.middle_name,lb.last_name,lb.company_name";
		Integer totalRow = cv.countBySql(sql2+sql, null);
		pageUtil.setTotalRow(totalRow);
		//log.debug(totalRow);
		//log.debug(sql0 + " " + sql);
		List divide_staff = v.findBySql(sql0+sql, null,pageUtil);
		if(divide_staff != null && divide_staff.size()>0){
			request.setAttribute("divide_staffList", divide_staff);
		}else{
			//ถ้าไม่เจอให้ค้นหาจากประวัติผู้ต้องสงสัย
			searchSuspect(request,response);
		}
	}
	
	private void searchSuspect(HttpServletRequest request, HttpServletResponse response) throws Exception {
		List ret = null;
		Suspect v = new Suspect(db);
		Suspect cv = new Suspect(db);
		
		String sql="" ;
		String sql0 ;
		String sql2;

		ArrayList<String> alcon= new ArrayList();
		ArrayList<String> alin = new ArrayList();
		sql0 = "select sp.id, sp.suspect_id_card lawbreaker_id_card,  trim(case sp.suspect_type "
			+" when '1' then t.title_name || sp.first_name || ' ' || sp.last_name"
			+" when '2' then t.title_name || sp.first_name || ' ' || sp.middle_name || ' ' || sp.last_name"
			+" when '3' then tc.title_name || sp.company_name end) lawbreaker_name, 'S' lstype, "
			+" pke_suspect.getSuspectAddress(sp.id) lawbreaker_address, sp.suspect_no lawbreaker_no "
			+" from suspect sp"
			+" left join title t on t.title_code=sp.title_code"
			+" left join title tc on tc.title_code=sp.title_code_company"
			+" where sp.suspect_type ='1' ";
		sql2 = "select count(sp.suspect_no) from suspect sp"
			+" left join title t on t.title_code=sp.title_code"
			+" left join title tc on tc.title_code=sp.title_code_company"
			+" where sp.suspect_type ='1' and sp.suspect_id_card is not null ";
		
		if(request.getAttribute("showPop").toString().equals("1")){
			alcon.add(" and sp.suspect_id_card like '%");
			alin.add(request.getAttribute("txtIdcardNo").toString() + "%'");
		}else{
			alcon.add(" AND case sp.suspect_type "
				+" when '1' then t.title_name || sp.first_name || ' ' || sp.last_name"
				+" when '2' then t.title_name || sp.first_name || ' ' || sp.middle_name || ' ' || sp.last_name"
				+" when '3' then tc.title_name || sp.company_name end  like '%");
			alin.add(request.getParameter("txtfname")+"%'");
			
			alcon.add(" and sp.suspect_id_card like '%");
			alin.add(request.getParameter("txtIdcardNo")+"%'");
		}
		
		for(int i = 0; i < alin.size();i++){
			if(alin.get(i).equals("%'")){alcon.set(i, "");
			alin.set(i,"");}
			sql += alcon.get(i) + alin.get(i);
		}
		sql+=" order by sp.first_name,sp.middle_name,sp.last_name,sp.company_name";
		Integer totalRow = cv.countBySql(sql2+sql, null);
		pageUtil.setTotalRow(totalRow);
		//log.debug(totalRow);
		//log.debug(sql2 + " " + sql);
		List divide_staff = v.findBySql(sql0+sql, null,pageUtil);

		if(divide_staff != null && divide_staff.size()>0){
			request.setAttribute("divide_staffList", divide_staff);
		}
	}
	public void list(HttpServletRequest request, HttpServletResponse response) throws Exception {
		System.out.println("list");
		request.setAttribute("showPop", "0");
		request.setAttribute("txtfname", request.getParameter("txtfname"));
		request.setAttribute("txtIdcardNo", request.getParameter("txtIdcardNo"));
		searchData(request,response);
		
		forward("/Popup/arrest_lawbreaker_find_pop.jsp", request,response);
	}
	public void showPop(HttpServletRequest request, HttpServletResponse response) throws Exception {
		//System.out.println("showPop");
		request.setAttribute("showPop", "1");
		String idCard = (request.getParameter("idCard") != null ? request.getParameter("idCard") : "");
		String txtfname = (request.getParameter("txtfname") != null ? request.getParameter("txtfname") : "");
		if(!idCard.equals(""))
			request.setAttribute("txtIdcardNo", idCard);

		if(!txtfname.equals(""))
			request.setAttribute("txtfname", txtfname);
		
		log.debug(txtfname + " $$$$$");
		
		if(!idCard.equals("") && !txtfname.equals(""))
			searchData(request,response);
		
		forward("/Popup/arrest_lawbreaker_find_pop.jsp", request,response);
	}
}
