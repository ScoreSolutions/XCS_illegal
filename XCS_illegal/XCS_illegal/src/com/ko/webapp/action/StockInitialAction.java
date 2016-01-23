package com.ko.webapp.action;
import java.sql.PreparedStatement;
import java.text.DateFormat;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.ko.domain.*;
import com.ko.util.DB;
import com.ko.util.DateUtil;

public class StockInitialAction extends BaseAction {
	@Override
	public void _default(HttpServletRequest request, HttpServletResponse response) throws Exception {
		// TODO Auto-generated method stub
		
		String menuID = "28";
		if(uData.chkUserMenu(menuID)==true){
			SetDefault(request,response);
			request.setAttribute("siList", GetDetailData(" and si.offcode = '" + uData.getOffcode() + "'"));
           forward("?page=/ManageExhibit/StockInitial.jsp?rnd=" + Math.random(), request, response);
		}else{
    		HttpSession session = request.getSession();
  		  	session.invalidate();
  		  	request.setAttribute("errMsg", "ผู้ใช้ไม่มีสิทธิ์ดำเนินการ");
  		  	forward("?page=/login.jsp", request, response);
    	}
	}
	
	private void SetDefault(HttpServletRequest request, HttpServletResponse response) throws Exception {
		Legislation lt = new Legislation(db);
        List<Legislation> ltlist = lt.findByWhere(" 1=1 order by legislation_name", null);
		request.setAttribute("ltlist", ltlist);
        
		request.setAttribute("offcode", uData.getOffcode());
		request.setAttribute("offname", uData.getOffname());
	}
	
	public void Save(HttpServletRequest request, HttpServletResponse response) throws Exception {
		String vID = request.getParameter("id");
		String vOffcode = request.getParameter("offcode");
		String vLegislationID = request.getParameter("legislation_id");
		String vDeliveryCode = request.getParameter("delivery_code");
		java.util.Date vDeliveryDate = DateUtil.getDateFromString(request.getParameter("delivery_date"));
		String vIsDomestic = request.getParameter("isdomestic1");
		String vGroupID = request.getParameter("group_id");
		String vDutyCode = request.getParameter("duty_code");
		String vBrandCode = request.getParameter("brand_code");
		String vSizeDesc = request.getParameter("sizes_desc");
		String vSizeUnitCode = request.getParameter("sizes_unit_code");
		double vQty = (!request.getParameter("qty").trim().equals("") ? Double.parseDouble(request.getParameter("qty")) : 0d);
		String vQtyUnitCode = request.getParameter("qty_unit_code");
		double vNetweight = (!request.getParameter("netweight").trim().equals("") ? Double.parseDouble(request.getParameter("netweight")) : 0d);
		String vNetweightUnitCode = request.getParameter("netweight_unit_code");
		String vRemarks = request.getParameter("remarks");
		String vStatus = request.getParameter("status");
		
		StockInitial si = new StockInitial(db);
		String dupWh = "offcode = '" + vOffcode + "'";
		dupWh += " and legislation_id = '" + vLegislationID.toString() + "'";
		dupWh += " and delivery_code = '" + vDeliveryCode + "'";
		dupWh += " and isdomestic = '" + vIsDomestic + "'";
		dupWh += " and group_id = '" + vGroupID + "'";
		dupWh += " and duty_code = '" + vDutyCode + "'";
		dupWh += " and brand_code = '" + vBrandCode + "'";
		dupWh += " and sizes_desc = '" + vSizeDesc + "'";
		dupWh += " and sizes_unit_code = '" + vSizeUnitCode + "'";
		if (vID.equals("")){
			dupWh += " and nvl(id,'0')<>'0'";
		}else
			dupWh += " and id<>'" + vID + "'";
		
		List<StockInitial> siList = si.findByWhere(dupWh, null);
		if(siList.size()>0){
			SetDefault(request,response);
			request.setAttribute("IsDup", "Y");
			List<Map<String,Object>> s = GetDetailData(" and si.id = '" + vID + "' ");
			if (s.size()>0){
				request.setAttribute("si", s.get(0));
			}
			
		}else{
			DB db1 = new DB();
			PreparedStatement pre = null;
			String sql = "";
			
			if (!vID.equals("")){
				sql = " update stock_initial \n";
				sql += " set delivery_code = '" + vDeliveryCode + "',\n";
				sql += " delivery_date = to_date('" + DateUtil.formatConditionDate(request.getParameter("delivery_date")) + "','yyyyMMdd'),\n";
				sql += " legislation_id = '" + vLegislationID + "',\n";
				sql += " offcode = '" + vOffcode + "',\n";
				sql += " isdomestic = '" + vIsDomestic + "',\n";
				sql += " group_id = '" + vGroupID + "',\n";
				sql += " duty_code = '" + vDutyCode + "',\n";
				sql += " brand_code = '" + vBrandCode + "',\n";
				sql += " sizes_desc = '" + vSizeDesc + "',\n";
				sql += " sizes_unit_code = '" + vSizeUnitCode + "',\n";
				sql += " qty = '" + vQty + "',\n";
				sql += " qty_unit_code = '" + vQtyUnitCode + "',\n";
				sql += " netweight = '" + vNetweight + "',\n";
				sql += " netweight_unit_code = '" + vNetweightUnitCode + "',\n";
				sql += " remarks = '" + vRemarks + "',\n";
				sql += " status = '" + vStatus + "',\n";
				sql += " update_by = '" + uData.getIdCard() + "',\n";
				sql += " update_on = sysdate \n";
				sql += " where id = '" + vID + "' \n";
			}else{
				List<Map<String,Object>> sID = si.findBySql(" select SEQ_STOCK_INITIAL.nextval id from dual");
				vID = sID.get(0).get("id").toString();
				
				sql = "INSERT INTO STOCK_INITIAL (ID, CREATE_BY, CREATE_ON, SOURCES, \n";
				sql += " DELIVERY_CODE, DELIVERY_DATE, LEGISLATION_ID, \n";
				sql += " OFFCODE, ISDOMESTIC, GROUP_ID,  DUTY_CODE, BRAND_CODE, \n";
				sql += " SIZES_DESC, SIZES_UNIT_CODE, QTY, QTY_UNIT_CODE, \n";
				sql += " NETWEIGHT, NETWEIGHT_UNIT_CODE, REMARKS, STATUS) \n";
				sql += " VALUES ('" + vID + "', '" + uData.getIdCard() + "',sysdate,'STOCK_INITIAL',";
				sql += " '" + vDeliveryCode + "',to_date('" + DateUtil.formatConditionDate(request.getParameter("delivery_date")) + "','yyyyMMdd'),'" + vLegislationID + "',";
				sql += " '" + vOffcode + "','" + vIsDomestic + "','" + vGroupID + "', '" + vDutyCode + "','" + vBrandCode + "',";
				sql += " '" + vSizeDesc + "','" + vSizeUnitCode + "','" + vQty + "','" + vQtyUnitCode + "',";
				sql += " '" + vNetweight + "','" + vNetweightUnitCode + "','" + vRemarks + "','1')";
			}
			
			pre = db1.getParameterizedStatement(sql, null);
			pre.execute();
			
			pre.close();
			db1.closedb();
			pre = null;
			db1 = null;
			
			SetDefault(request,response);
			
			List<Map<String,Object>> s = GetDetailData(" and si.id = '" + vID + "' ");
			if (s.size()>0){
				request.setAttribute("si", s.get(0));
			}
			request.setAttribute("offcode", vOffcode);
	        request.setAttribute("offname", uData.getOffname());
		}
		
		request.setAttribute("siList", GetDetailData(" and si.offcode = '" + uData.getOffcode() + "'"));
        forward("?page=/ManageExhibit/StockInitial.jsp?rnd=" + Math.random(), request, response);
	}
	
	public void Update(HttpServletRequest request, HttpServletResponse response) throws Exception {
		String vID = request.getParameter("id");
		SetDefault(request, response);
		if (!vID.equals("")){
			List<Map<String, Object>> si = GetDetailData(" and si.id='" + vID + "'");
			if (si.size()>0){
				request.setAttribute("si", si.get(0));
				request.setAttribute("offcode", uData.getOffcode());
		        request.setAttribute("offname", uData.getOffname());
			}
			
			request.setAttribute("siList", GetDetailData(" and si.offcode = '" + uData.getOffcode() + "'"));
			forward("?page=/ManageExhibit/StockInitial.jsp?rnd=" + Math.random(), request, response);
		}
	}
	
	private List<Map<String, Object>> GetDetailData(String whText) throws Exception {
		String sql = " select si.id, si.sources, si.delivery_code, si.delivery_date, si.legislation_id, lg.legislation_name, si.offcode, ed.offname, \n";
			sql += " to_char(si.delivery_date, 'dd/mm/yyyy', 'NLS_CALENDAR=''THAI BUDDHA'' NLS_DATE_LANGUAGE=THAI')  delivery_date2, \n";
			sql += " si.isdomestic, decode(si.isdomestic,'I','ในประเทศ','O','ต่างประเทศ','Z','ไม่ระบุ') domestic_name, si.group_id, dg.group_name,\n";
			sql += " si.duty_code, dt.duty_name, si.brand_code, nvl(bm.brand_main_thai,bm.brand_main_eng) brand_main_name,\n";
			sql += " si.sizes_desc, si.sizes_unit_code, su.thname sizes_unit_name , si.qty, si.qty_unit_code, qu.thname qty_unit_name,\n";
			sql += " si.netweight, si.netweight_unit_code, nu.thname netweight_unit_name, si.remarks, \n";
			sql += " si.status, decode(si.status,'1','ยังไม่นำเข้า','2','นำเข้าเรียบร้อยแล้ว') status_name \n";
			sql += " from stock_initial si \n";
			sql += " inner join ed_office ed on ed.offcode=si.offcode \n";
			sql += " inner join duty_group dg on dg.group_id=si.group_id \n";
			sql += " inner join legislation lg on lg.id=si.legislation_id \n";
			sql += " left join duty_table dt on dt.duty_code=si.duty_code and dt.group_id=si.group_id \n";
			sql += " left join brand_main bm on bm.brand_main_code=si.brand_code and bm.group_id=si.group_id \n";
			sql += " left join unit qu on qu.unit_code=si.qty_unit_code \n";
			sql += " left join unit su on su.unit_code=si.sizes_unit_code \n";
			sql += " left join unit nu on nu.unit_code=si.netweight_unit_code \n";
			sql += " where 1=1 " + whText + "\n";
			sql += " order by si.offcode, lg.legislation_name, dg.group_name, dt.duty_name, nvl(bm.brand_main_thai,bm.brand_main_eng)";
			
			StockInitial si = new StockInitial(db);
			List<Map<String,Object>> siList = si.findBySql(sql);
			
			return siList;
	}

	public void Delete(HttpServletRequest request, HttpServletResponse response) throws Exception {
		String vID = request.getParameter("id");
		if (!vID.equals("")){
			StockInitial si = new StockInitial(db);
			si.deleteByPk(Long.parseLong(vID));
		}
		
		SetDefault(request, response);
		request.setAttribute("siList", GetDetailData(" and si.offcode = '" + uData.getOffcode() + "'"));
		forward("?page=/ManageExhibit/StockInitial.jsp?rnd=" + Math.random(), request, response);
	}
	
}
