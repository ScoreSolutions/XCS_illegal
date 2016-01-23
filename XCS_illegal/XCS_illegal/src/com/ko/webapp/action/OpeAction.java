package com.ko.webapp.action;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.ko.domain.ApplicationArrestExhibit;
import com.ko.domain.DutyTable;
import com.ko.domain.Unit;

public class OpeAction extends BaseAction{
	public void list(HttpServletRequest request,HttpServletResponse response)throws Exception {

		
	}

	@Override
	public void _default(HttpServletRequest request, HttpServletResponse response) throws Exception {
		// TODO Auto-generated method stub
		Unit unit = new Unit(db);
		String sql3,sql4;

		DutyTable dutytable =new DutyTable(db);
		sql3="select DUTY_CODE,DUTY_NAME from DUTY_TABLE order by duty_name";
		sql4="select unit_code, nvl(thname, enname) unit_name from unit order by nvl(thname, enname)";
		List unitList=unit.findBySql(sql4, null);
		request.setAttribute("unit_list", unitList);

		sql4="select unit_code, nvl(thname, enname) unit_name from unit order by nvl(thname, enname)";
		List dutyList = dutytable.findBySql(sql3, null);

		//System.out.println(dutyList);
		//System.out.println(unitList);

		request.setAttribute("unit_list", unitList);
		request.setAttribute("duty_tableList", dutyList);
		forward("/Popup/Outside_Prove_Exhibit.jsp", request, response);

	}

}
