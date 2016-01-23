	package com.ko.webapp.action;

import java.util.*;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.ko.domain.Legislation;
import com.ko.domain.ProductLegislation;
import com.ko.domain.DutyGroup;
import com.ko.util.DB;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import com.ko.webapp.bean.*;

import com.ko.service.DutyGroupService;
import com.pccth.rdbservice.*;

public class ProductLegislationAction extends BaseAction{
	String menuID="226";
	@Override
	public void _default(HttpServletRequest request,HttpServletResponse response) throws Exception {
		// TODO Auto-generated method stub
		
		if(uData.chkUserMenu(menuID)==true){
			SetList(request,response);
			forward("?page=/Master/PRODUCTLegislation.jsp");
		}else{
    		HttpSession session = request.getSession();
  		  	session.invalidate();
  		  	request.setAttribute("errMsg", "ผู้ใช้ไม่มีสิทธิ์ดำเนินการ");
  		  	forward("?page=/login.jsp", request, response);
    	}
	}
	public void update(HttpServletRequest request,HttpServletResponse response) throws Exception {
		DutyGroup Dt = new DutyGroup(db);
		Legislation le = new Legislation(db);
		ProductLegislation Pl = new ProductLegislation(db);
		String sql  = "INSERT INTO PRODUCT_LEGISLATION (ID, GROUP_ID, LEGISLATION_ID,CREATE_BY, CREATE_ON)"; 
			   sql += "VALUES ( id,dg.group_id ,pl.legislation_id , , )";
 
        forward("?page=/Master/PRODUCTLegislation.jsp");
	}
	public void save(HttpServletRequest request,HttpServletResponse response) throws Exception {
		HttpSession session = request.getSession();
		UserSession lUser = new UserSession();
		lUser = (UserSession)session.getAttribute("MYUSER");
		
		String[] vGroupID = request.getParameterValues("group_id");
		if(vGroupID.length>0){
			for(int i=0;i<vGroupID.length;i++){
				//System.out.println(vGroupID[i].toString()+"  vvvvv");
				String[] vLegislationID = request.getParameterValues("legislation_id_temp");
				
				if(!vLegislationID[i].equals("0")){
					String sql = "";
					if (ChkDup(vGroupID[i])==false){
						sql += " insert into product_legislation(id, group_id, legislation_id, create_by, create_on) ";
						sql += " values(product_legislation_seq.nextval, '" + vGroupID[i].toString() + "', ";
						sql += " '" + vLegislationID[i].toString() + "',";
						sql += " '" + lUser.getIdCard() + "', sysdate)";
					}else{
						sql += " update product_legislation ";
						sql += " set legislation_id='" + vLegislationID[i] + "',";
						sql += " create_by = '" + lUser.getIdCard() + "', ";
						sql += " create_on = sysdate ";
						sql += " where group_id = '" + vGroupID[i] + "'";
					}
					System.out.println(sql);
					
					DB db = new DB();
					PreparedStatement pre = null;
					pre = db.getParameterizedStatement(sql, null);
					pre.execute();
					
				 	pre.close();
				 	db.closedb();
				 	pre = null;
				 	db = null;
				}else{
					System.out.println("Not IF");
				}
			}
		}
		
		SetList(request,response);
		request.setAttribute("Msg",1 );
		forward("?page=/Master/PRODUCTLegislation.jsp");
	}
	
	private boolean ChkDup(String groupID) throws Exception {
		boolean ret=false;
		DB db = new DB();
		PreparedStatement pre = null;
		String sql = "";
		sql += "select id from product_legislation " ;
		sql += " where group_id = '" + groupID + "' and rownum=1";

		pre = db.getParameterizedStatement(sql,null);
		ResultSet rs = pre.executeQuery();
		if(rs.next())  //ถ้าพบข้อมูลซ้ำ
			ret = true;
		
		pre.close();
	 	db.closedb();
	 	pre = null;
	 	db = null;
		
		return ret;
	}
	
	private void SetList(HttpServletRequest request,HttpServletResponse response) throws Exception {
		
		DutyGroup Pd = new DutyGroup(db);
		String sql="";
		sql += "select dg.group_id, dg.group_name, nvl(pl.legislation_id,0) legislation_id, ";
		sql += "lg.legislation_name from duty_group dg ";
		sql += "left join product_legislation pl on dg.group_id = pl.group_id ";
		sql += "left join legislation lg on lg.id = pl.legislation_id ";
		sql += "where dg.group_status = 'N' order by dg.group_name ";
		List<Map<String,Object>> ViewPd = Pd.findBySql(sql);
		
		Legislation le = new Legislation(db);
		List ViewLegis = le.findAll();
		
		request.setAttribute("Product", ViewPd);
		request.setAttribute("Legis", ViewLegis);
		
		for(int i=0;i<ViewPd.size();i++){
			String sLegis = ViewPd.get(i).get("legislation_id").toString();
			String sGroupID = ViewPd.get(i).get("group_id").toString();
			request.setAttribute("sLegis", sLegis);
		}
	}
}
