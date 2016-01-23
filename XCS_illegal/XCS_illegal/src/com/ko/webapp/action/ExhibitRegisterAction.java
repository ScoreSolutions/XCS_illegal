package com.ko.webapp.action;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.web.bind.ServletRequestUtils;

import com.ko.domain.Stockout;
import com.ko.domain.DutyTable;
/**
 * 
 * @author SoCool
 * Action for ทะเบียนสินค้าและของกลาง
 */
public class ExhibitRegisterAction extends ExhibitBaseAction {
	protected String SQL_SELECT2 = "";
	protected String SQL_FROM2 = "";	
	protected String SQL_WHERE2 = "";
	protected String SQL_GROUP2 = "";
	protected String SQL_ORDER2 = "";
	protected String SQL_UNIT_SELECT = "";
	protected String SQL_UNIT_FROM = "";	
	protected String SQL_UNIT_WHERE = "";
	protected String SQL_UNIT_GROUP = "";
	protected String SQL_UNIT_ORDER = "";
	protected String SQL_UNIT_SELECT2 = "";
	protected String SQL_UNIT_FROM2 = "";	
	protected String SQL_UNIT_WHERE2 = "";
	protected String SQL_UNIT_GROUP2 = "";
	protected String SQL_UNIT_ORDER2 = "";
	
	protected String generateExhibitCond(HttpServletRequest request) {
		String cond = "";		
		
//		String legislation_id = ServletRequestUtils.getStringParameter(request, "legislation_id", "");
//		if (!"".equals(legislation_id))
//			cond += " sr.legislation_id = '" + legislation_id + "' and ";
//		
//		String is_domestic = ServletRequestUtils.getStringParameter(request, "is_domestic", "");
//		if (!"".equals(is_domestic))
//			cond += " sr.isdomestic = '" + is_domestic + "' and ";
//		
//		String product_name = ServletRequestUtils.getStringParameter(request, "product_name", "");
//		if (!"".equals(product_name))
//			cond += " pd.product_name like '%" + product_name + "%' and ";
//		
//		String brand_name = ServletRequestUtils.getStringParameter(request, "brand_name", "");
//		if (!"".equals(brand_name))
//			cond += " nvl(bm.brand_main_thai, bm.brand_main_eng) like '%" + brand_name + "%' and ";
//		
//		String qty = ServletRequestUtils.getStringParameter(request, "qty", "");
//		if (!"".equals(qty)){
//			if("1".equals(qty)){
//				cond += " sr.qty > 0 and ";
//			}else if("0".equals(qty)){
//				cond += " sr.qty = 0 and ";
//			}
//		}			
//	
//		if (cond.length() > 4) {
//			cond = cond.substring(0, cond.length() - 4);
//		}		
//		log.info("SQL Condition:" + cond);
		return cond;
	}
	
	protected void fetchDataToRequest(HttpServletRequest request, String condition) {
		//set data for summary list
		Stockout model = new Stockout(this.db);
		List<Object> objList = new ArrayList<Object>();
		List data_list = new ArrayList<Object>();
		List data_list2 = new ArrayList<Object>();
		try {
			Integer totalRow = 0;
			String query_cond = (condition != null && !"".equals(condition))?" and " + condition:"";
			String query = SQL_FROM + SQL_WHERE + query_cond + SQL_GROUP;
			String query2 = SQL_FROM2 + SQL_WHERE2 + query_cond + SQL_GROUP2;

			String sql = " select a.legislation_id, a.legislation_name, a.isdomestic, a.isdomestic_name, \n" +
						" a.product_code, a.duty_name, a.brand_code, a.brand_name, a.status_code, a.status_name, \n" +
						" a.size_desc, a.sizes_unit, a.qty_unit, sum(a.stockin_qty) stockin_qty, sum(a.destroy_qty) destroy_qty, \n" +
						" sum(a.sale_qty) sale_qty, sum(a.return_qty) return_qty, sum(a.keep_qty) keep_qty, \n" +
						" sum(a.transfer_qty) transfer_qty, sum(a.qty) qty  \n" +
						" from (" +
						" " + SQL_SELECT + query+" UNION "+SQL_SELECT2 + query2 +
						" ) a \n" +
						" group by a.legislation_id, a.legislation_name, a.isdomestic, a.isdomestic_name, \n" +
						" a.product_code, a.duty_name, a.brand_code, a.brand_name, a.status_code, a.status_name,a.size_desc, a.sizes_unit, a.qty_unit "; 
						
						
			log.debug(sql);
//log.debug("select count (*) from (" + sql + ")");
			totalRow = model.countBySql("select count (*) from (" + sql + ")", objList.toArray());
			pageUtil.setTotalRow(totalRow);
			
			data_list = model.findBySql(sql, objList.toArray(), pageUtil);						
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		request.setAttribute("stockRemainSumList", data_list);
		setDataSumForExcel(data_list, request);
		
		//set data for unit list
		try {
			Integer totalRow = 0;
			String query_cond = (condition != null && !"".equals(condition))?" and " + condition:"";
			String query = SQL_UNIT_FROM + SQL_UNIT_WHERE + query_cond + SQL_UNIT_GROUP;
			String query2 = SQL_UNIT_FROM2 + SQL_UNIT_WHERE2 + query_cond + SQL_UNIT_GROUP2;
			
			
			String sql = "select a.offcode_from, a.offname_from, a.legislation_id, a.legislation_name, a.isdomestic, a.isdomestic_name, \n"; 
				sql += " a.product_code, a.duty_name, a.brand_code, a.brand_name, a.status_code, a.status_name,  \n";
				sql += " a.size_desc, a.sizes_unit, a.qty_unit, sum(a.stockin_qty) stockin_qty, sum(a.destroy_qty) destroy_qty, \n"; 
				sql += " sum(a.sale_qty) sale_qty, sum(a.return_qty) return_qty, sum(a.keep_qty) keep_qty, \n";
				sql += " sum(a.transfer_qty) transfer_qty, sum(a.qty) qty  \n";
				sql += " from ( \n";
				sql += "	" + SQL_UNIT_SELECT + query+" UNION "+SQL_UNIT_SELECT2 + query2;
				sql += "      ) a ";
				sql += " group by a.offcode_from, a.offname_from, a.legislation_id, a.legislation_name, a.isdomestic, a.isdomestic_name, \n"; 
				sql += " a.product_code, a.duty_name, a.brand_code, a.brand_name, a.status_code, a.status_name,a.size_desc, a.sizes_unit, a.qty_unit ";
				
			//log.debug(sql);
			
			totalRow = model.countBySql("SELECT count(*) FROM (" +sql+")", objList.toArray());
			pageUtil.setTotalRow(totalRow);						
			data_list2 = model.findBySql(sql, objList.toArray(), pageUtil);	
			//log.debug("TotalRow="+totalRow);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		//log.debug("Mu List :"+data_list2);
		request.setAttribute("stockRemainUnitList", data_list2);
		setDataUnitForExcel(data_list2, request);
	}
	
	private void setDataSumForExcel(List data_list, HttpServletRequest request)  {
		try{
			HttpSession session = request.getSession();
			String data = "";
			if (data_list != null && data_list.size()>0){
				//Header Column
				data += "ลำดับ\t";
				data += "พ.ร.บ.\t";
				data += "สินค้า\t";
				data += "ยี่ห้อ\t";
				data += "สินค้าจาก\t";
				data += "ขนาด\t";
				data += "จำนวน\t";
				data += "ทำลาย\t";
				data += "ขาย\t";
				data += "คืน\t";
				data += "จัดเก็บ(พิพิธภัณฑ์)\t";
				data += "โอน\t";
				data += "คงเหลือในคลัง";
				data += "\n";  //ขึ้นบรรทัดใหม่
				
				for(int i=0;i<data_list.size();i++){
					Map<String,Object> dr = (Map<String,Object>)data_list.get(i);
					data += (i+1) + "\t";
					data += dr.get("legislation_name") + "\t";
					data += (dr.get("product_name") != null ? dr.get("product_name") : "") +"\t";
					data += (dr.get("brand_name") != null ? dr.get("brand_name") : "") +"\t";
					data += (dr.get("isdomestic_name") != null ? dr.get("isdomestic_name") : "") +"\t";
					data += (dr.get("size_desc") != null ? dr.get("size_desc") : "") + " " + (dr.get("sizes_unit") != null ? dr.get("sizes_unit") : "") +"\t";
					data += dr.get("stockin_qty") + " " + (dr.get("qty_unit") != null ? dr.get("qty_unit") : "") +"\t";
					data += dr.get("destroy_qty") + " " + (dr.get("qty_unit") != null ? dr.get("qty_unit") : "") +"\t";
					data += dr.get("sale_qty") + " " + (dr.get("qty_unit") != null ? dr.get("qty_unit") : "") +"\t";
					data += dr.get("return_qty") + " " + (dr.get("qty_unit") != null ? dr.get("qty_unit") : "") +"\t";
					data += dr.get("keep_qty") + " " + (dr.get("qty_unit") != null ? dr.get("qty_unit") : "") +"\t";
					data += dr.get("transfer_qty") + " " + (dr.get("qty_unit") != null ? dr.get("qty_unit") : "") +"\t";
					data += dr.get("qty") +"\t";
					data += "\n"; //บรรทัดใหม่
				}
				session.setAttribute("ExportExcelSum", data);
			}
		}catch(Exception e){
			
		}
	}
	
	private void setDataUnitForExcel(List data_list, HttpServletRequest request)  {
		try{
			HttpSession session = request.getSession();
			String data = "";
			if (data_list != null && data_list.size()>0){
				//Header Column
				data += "ลำดับ\t";
				data += "หน่วยงาน\t";
				data += "พ.ร.บ.\t";
				data += "สินค้า\t";
				data += "ยี่ห้อ\t";
				data += "สินค้าจาก\t";
				data += "ขนาด\t";
				data += "จำนวน\t";
				data += "ทำลาย\t";
				data += "ขาย\t";
				data += "คืน\t";
				data += "จัดเก็บ(พิพิธภัณฑ์)\t";
				data += "โอน\t";
				data += "คงเหลือในคลัง";
				data += "\n";  //ขึ้นบรรทัดใหม่
				
				for(int i=0;i<data_list.size();i++){
					Map<String,Object> dr = (Map<String,Object>)data_list.get(i);
					data += (i+1) + "\t";
					data += dr.get("offname_from") + "\t";
					data += dr.get("legislation_name") + "\t";
					data += (dr.get("product_name") != null ? dr.get("product_name") : "") +"\t";
					data += (dr.get("brand_name") != null ? dr.get("brand_name") : "") +"\t";
					data += (dr.get("isdomestic_name") != null ? dr.get("isdomestic_name") : "") +"\t";
					data += (dr.get("size_desc") != null ? dr.get("size_desc") : "") + " " + (dr.get("sizes_unit") != null ? dr.get("sizes_unit") : "") +"\t";
					data += dr.get("stockin_qty") + " " + (dr.get("qty_unit") != null ? dr.get("qty_unit") : "") +"\t";
					data += dr.get("destroy_qty") + " " + (dr.get("qty_unit") != null ? dr.get("qty_unit") : "") +"\t";
					data += dr.get("sale_qty") + " " + (dr.get("qty_unit") != null ? dr.get("qty_unit") : "") +"\t";
					data += dr.get("return_qty") + " " + (dr.get("qty_unit") != null ? dr.get("qty_unit") : "") +"\t";
					data += dr.get("keep_qty") + " " + (dr.get("qty_unit") != null ? dr.get("qty_unit") : "") +"\t";
					data += dr.get("transfer_qty") + " " + (dr.get("qty_unit") != null ? dr.get("qty_unit") : "") +"\t";
					data += dr.get("qty") +"\t";
					data += "\n"; //บรรทัดใหม่
				}
				session.setAttribute("ExportExcelUnit", data);
			}			
		}catch(Exception e){
			
		}
	}
	
	
	@Override
	protected void pre(HttpServletRequest request, HttpServletResponse response) throws Exception {		
		menuID = "26";
		prepare_sql_summary();
		prepare_sql_unit();
		JSP_SEARCH_PAGE = "?page=/ManageExhibit/record_exhibit_search.jsp";		
		TRAN_LOG_MSG_MENU="แสดงรายการทะเบียนสินค้าและของกลาง";
		TRAN_LOG_MSG_SEARCH = "ค้นหาข้อมูลทะเบียนสินค้าและของกลาง";
		
		String code_from = ServletRequestUtils.getStringParameter(request, "code_from", "");
		String code_to = ServletRequestUtils.getStringParameter(request, "code_from", "");
		if (!"".equals(code_from) && !"".equals(code_to)){
			SQL_WHERE += " and (de.delivery_code between '" + code_from   + "' and '"+code_to+"')";
			SQL_WHERE2 += " and (so.stockout_code between '" + code_from   + "' and '"+code_to+"')";
			SQL_UNIT_WHERE += " and (de.delivery_code between '" + code_from   + "' and '"+code_to+"')";
			SQL_UNIT_WHERE2 += " and (so.stockout_code between '" + code_from   + "' and '"+code_to+"')";
		}else if(!"".equals(code_from)){
			SQL_WHERE += " and (de.delivery_code = '" + code_from   + "'";
			SQL_WHERE2 += " and (so.stockout_code = '" + code_from   + "'";
			SQL_UNIT_WHERE += " and (de.delivery_code = '" + code_from   + "'";
			SQL_UNIT_WHERE2 += " and (so.stockout_code = '" + code_from   + "'";
		}			
			
		String deliver_date_from = ServletRequestUtils.getStringParameter(request, "deliver_date_from", "");
		String deliver_date_to = ServletRequestUtils.getStringParameter(request, "deliver_date_to", "");
		if (!"".equals(deliver_date_from) && !"".equals(deliver_date_from)){
			SQL_WHERE += " and ADD_MONTHS (TO_DATE (de.delivery_date), 6516) BETWEEN TO_DATE ('"+deliver_date_from+"', 'dd/mm/yyyy') AND TO_DATE ('"+deliver_date_to+"', 'dd/mm/yyyy') ";
			SQL_UNIT_WHERE += " and ADD_MONTHS (TO_DATE (de.delivery_date), 6516) BETWEEN TO_DATE ('"+deliver_date_from+"', 'dd/mm/yyyy') AND TO_DATE ('"+deliver_date_to+"', 'dd/mm/yyyy') ";
		}else if(!"".equals(deliver_date_from)){
			SQL_WHERE += " and ADD_MONTHS (TO_DATE (de.delivery_date), 6516) BETWEEN TO_DATE ('"+deliver_date_from+"', 'dd/mm/yyyy') AND TO_DATE ('"+deliver_date_from+"', 'dd/mm/yyyy') ";
			SQL_UNIT_WHERE += " and ADD_MONTHS (TO_DATE (de.delivery_date), 6516) BETWEEN TO_DATE ('"+deliver_date_from+"', 'dd/mm/yyyy') AND TO_DATE ('"+deliver_date_from+"', 'dd/mm/yyyy') ";
		}
		if(request.getParameter("legislation_id") != null && !request.getParameter("legislation_id").trim().equals("")){
			SQL_WHERE += " and de.legislation_id = '" + request.getParameter("legislation_id").trim() + "'";
			SQL_WHERE2 += " and so.legislation_id ='" + request.getParameter("legislation_id").trim() + "'";
			SQL_UNIT_WHERE += " and de.legislation_id = '" + request.getParameter("legislation_id").trim() + "'";
			SQL_UNIT_WHERE2 += " and so.legislation_id ='" + request.getParameter("legislation_id").trim() + "'";
		}
		if(request.getParameter("duty_code") != null && !request.getParameter("duty_code").equals("")){
			SQL_WHERE += " and sii.duty_code = '" + request.getParameter("duty_code").trim() + "'";
			SQL_WHERE2 += " and sii.duty_code = '" + request.getParameter("duty_code").trim() + "'";
			SQL_UNIT_WHERE += " and sii.duty_code = '" + request.getParameter("duty_code").trim() + "'";
			SQL_UNIT_WHERE2 += " and sii.duty_code = '" + request.getParameter("duty_code").trim() + "'";
		}
		if(request.getParameter("brand_name") != null && !request.getParameter("brand_name").trim().equals("")){
			SQL_WHERE += " and upper(nvl(sii.brand_name,nvl(bm.brand_main_thai,bm.brand_main_eng))) like '%" + request.getParameter("brand_name").trim().toUpperCase() + "%'";
			SQL_WHERE2 += " and upper(nvl(sii.brand_name,nvl(bm.brand_main_thai,bm.brand_main_eng))) like '%" + request.getParameter("brand_name").trim().toUpperCase() + "%'";
			SQL_UNIT_WHERE += " and uupper(nvl(sii.brand_name,nvl(bm.brand_main_thai,bm.brand_main_eng))) like '%" + request.getParameter("brand_name").trim().toUpperCase() + "%'";
			SQL_UNIT_WHERE2 += " and upper(nvl(sii.brand_name,nvl(bm.brand_main_thai,bm.brand_main_eng))) like '%" + request.getParameter("brand_name").trim().toUpperCase() + "%'";
		}
		if (request.getParameter("status_code") != null && !request.getParameter("status_code").equals("")){
			SQL_WHERE += " and CASE WHEN pke_exhibit.getRemainOut(de.legislation_id, de.id, de.offcode_to, nvl(sii.duty_name,dt.duty_name),nvl(sii.brand_name,nvl(bm.brand_main_thai,bm.brand_main_eng)),nvl(sii.sizes_desc,sp.size_desc),sii.isdomestic,nvl(sii.group_name,dg.group_name),nvl(sii.qty_unit_name,u.thname),nvl(sii.sizes_unit_name,su.thname),'DELIVERY_EXHIBIT') > 0 THEN '1' ELSE '0' END = '" + request.getParameter("status_code").trim() + "'";
			SQL_WHERE2 += " and CASE WHEN pke_exhibit.getRemainOut(so.legislation_id, so.id, so.offcode_to, nvl(sii.duty_name,dt.duty_name),nvl(sii.brand_name,nvl(bm.brand_main_thai,bm.brand_main_eng)),nvl(sii.sizes_desc,sp.size_desc),sii.isdomestic,nvl(sii.group_name,dg.group_name),nvl(sii.qty_unit_name,u.thname),nvl(sii.sizes_unit_name,su.thname),'STOCKOUT') > 0 THEN '1' ELSE '0' END = '" + request.getParameter("status_code").trim() + "'";
			SQL_UNIT_WHERE += " and CASE WHEN pke_exhibit.getRemainOut(de.legislation_id, de.id, de.offcode_to, nvl(sii.duty_name,dt.duty_name),nvl(sii.brand_name,nvl(bm.brand_main_thai,bm.brand_main_eng)),nvl(sii.sizes_desc,sp.size_desc),sii.isdomestic,nvl(sii.group_name,dg.group_name),nvl(sii.qty_unit_name,u.thname),nvl(sii.sizes_unit_name,su.thname),'DELIVERY_EXHIBIT') > 0 THEN '1' ELSE '0' END = '" + request.getParameter("status_code").trim() + "'";
			SQL_UNIT_WHERE2 += " and CASE WHEN pke_exhibit.getRemainOut(so.legislation_id, so.id, so.offcode_to, nvl(sii.duty_name,dt.duty_name),nvl(sii.brand_name,nvl(bm.brand_main_thai,bm.brand_main_eng)),nvl(sii.sizes_desc,sp.size_desc),sii.isdomestic,nvl(sii.group_name,dg.group_name),nvl(sii.qty_unit_name,u.thname),nvl(sii.sizes_unit_name,su.thname),'STOCKOUT') > 0 THEN '1' ELSE '0' END = '" + request.getParameter("status_code").trim() + "'";
		}
		
		if(request.getParameter("is_domestic") != null && !request.getParameter("is_domestic").equals("Z")){
			log.debug(request.getParameter("is_domestic"));
			SQL_WHERE += " and sii.isdomestic = '" + request.getParameter("is_domestic").trim() + "'";
			SQL_WHERE2 += " and sii.isdomestic = '" + request.getParameter("is_domestic").trim() + "'";
			SQL_UNIT_WHERE += " and sii.isdomestic = '" + request.getParameter("is_domestic").trim() + "'";
			SQL_UNIT_WHERE2 += " and sii.isdomestic = '" + request.getParameter("is_domestic").trim() + "'";
		}
		
		DutyTable dt = new DutyTable(db);
		String dtSql = "select duty_code, duty_name from duty_table order by duty_code"; 
		List<Map<String,Object>> dtList = dt.findBySql(dtSql, null);
		request.setAttribute("dtList", dtList);
		
		
		request.setAttribute("tabPage", "1");
		super.pre(request, response);
	}

	@Override
	protected boolean processUpdate(HttpServletRequest request) {
		// TODO Auto-generated method stub
		return false;
	}
	
	private void prepare_sql_summary(){
		SQL_SELECT = " SELECT de.offcode_from, ed.offname offname_from, de.legislation_id,lg.legislation_name, sii.isdomestic, "+ " \n "
					+ " DECODE (sii.isdomestic,'I', 'ในประเทศ', 'O', 'ต่างประเทศ','Z','ไม่ระบุ') isdomestic_name, nvl(sii.product_code,'') product_code, nvl(sii.duty_name,dt.duty_name) duty_name, sii.brand_code,  "+ " \n "
					+ " nvl(sii.brand_name,NVL (bm.brand_main_thai, bm.brand_main_eng)) brand_name,  "+ " \n "
					+ " CASE WHEN sum(pke_exhibit.getRemainOut(de.legislation_id, de.id, de.offcode_to, nvl(sii.duty_name,dt.duty_name),nvl(sii.brand_name,nvl(bm.brand_main_thai,bm.brand_main_eng)),nvl(sii.sizes_desc,sp.size_desc),sii.isdomestic,nvl(sii.group_name,dg.group_name),nvl(sii.qty_unit_name,u.thname),nvl(sii.sizes_unit_name,su.thname),'DELIVERY_EXHIBIT')) > 0 THEN '1' ELSE '0' END status_code,  "+ " \n "
					+ " CASE WHEN sum(pke_exhibit.getRemainOut(de.legislation_id, de.id, de.offcode_to, nvl(sii.duty_name,dt.duty_name),nvl(sii.brand_name,nvl(bm.brand_main_thai,bm.brand_main_eng)),nvl(sii.sizes_desc,sp.size_desc),sii.isdomestic,nvl(sii.group_name,dg.group_name),nvl(sii.qty_unit_name,u.thname),nvl(sii.sizes_unit_name,su.thname),'DELIVERY_EXHIBIT')) > 0 THEN 'คงเหลือในคลัง' ELSE 'ปิดบัญชี' END status_name,  "+ " \n " 
					+ " nvl(sii.sizes_desc,sp.size_desc) size_desc, nvl(sii.sizes_unit_name,su.thname) sizes_unit, sum(sii.qty) stockin_qty, nvl(sii.qty_unit_name,u.thname) qty_unit,  "+ " \n "
					+ " pke_exhibit.getstockoutqty (de.offcode_to,de.offcode_from,nvl(sii.duty_name,dt.duty_name),nvl(sii.brand_name,nvl(bm.brand_main_thai,bm.brand_main_eng)),nvl(sii.sizes_desc,sp.size_desc),sii.isdomestic,nvl(sii.group_name,dg.group_name),nvl(sii.qty_unit_name,u.thname),nvl(sii.sizes_unit_name,su.thname),'1') destroy_qty,  "+ " \n "
					+ " pke_exhibit.getstockoutqty (de.offcode_to,de.offcode_from,nvl(sii.duty_name,dt.duty_name),nvl(sii.brand_name,nvl(bm.brand_main_thai,bm.brand_main_eng)),nvl(sii.sizes_desc,sp.size_desc),sii.isdomestic,nvl(sii.group_name,dg.group_name),nvl(sii.qty_unit_name,u.thname),nvl(sii.sizes_unit_name,su.thname),'2') sale_qty,  "+ " \n "
					+ " pke_exhibit.getstockoutqty (de.offcode_to,de.offcode_from,nvl(sii.duty_name,dt.duty_name),nvl(sii.brand_name,nvl(bm.brand_main_thai,bm.brand_main_eng)),nvl(sii.sizes_desc,sp.size_desc),sii.isdomestic,nvl(sii.group_name,dg.group_name),nvl(sii.qty_unit_name,u.thname),nvl(sii.sizes_unit_name,su.thname),'3') return_qty,  "+ " \n "
					+ " pke_exhibit.getstockoutqty (de.offcode_to,de.offcode_from,nvl(sii.duty_name,dt.duty_name),nvl(sii.brand_name,nvl(bm.brand_main_thai,bm.brand_main_eng)),nvl(sii.sizes_desc,sp.size_desc),sii.isdomestic,nvl(sii.group_name,dg.group_name),nvl(sii.qty_unit_name,u.thname),nvl(sii.sizes_unit_name,su.thname),'4') keep_qty,  "+ " \n "
					+ " pke_exhibit.getstockoutqty (de.offcode_to,de.offcode_from,nvl(sii.duty_name,dt.duty_name),nvl(sii.brand_name,nvl(bm.brand_main_thai,bm.brand_main_eng)),nvl(sii.sizes_desc,sp.size_desc),sii.isdomestic,nvl(sii.group_name,dg.group_name),nvl(sii.qty_unit_name,u.thname),nvl(sii.sizes_unit_name,su.thname),'5') transfer_qty, "+ " \n "
					+ " sum(pke_exhibit.getRemainOut(de.legislation_id, de.id, de.offcode_to, nvl(sii.duty_name,dt.duty_name),nvl(sii.brand_name,nvl(bm.brand_main_thai,bm.brand_main_eng)),nvl(sii.sizes_desc,sp.size_desc),sii.isdomestic,nvl(sii.group_name,dg.group_name),nvl(sii.qty_unit_name,u.thname),nvl(sii.sizes_unit_name,su.thname),'DELIVERY_EXHIBIT')) qty "+ " \n ";
		SQL_FROM = " FROM stockin_item sii INNER JOIN stockin si on si.id=sii.stockin_id "+ " \n "
					+ " INNER JOIN delivery_exhibit de ON de.ID = si.delivery_exhibit_id " + " \n "
					+ " INNER JOIN ed_office ed ON ed.offcode = de.offcode_from "+ " \n "
					+ " INNER JOIN legislation lg ON lg.ID = de.legislation_id "+ " \n "
					+ " LEFT JOIN duty_table dt on dt.duty_code=sii.duty_code "+ " \n "
					+ " LEFT JOIN product pd ON pd.product_code = sii.product_code "+ " \n "
					+ " LEFT JOIN brand_main bm ON bm.brand_main_code = sii.brand_code and bm.group_id=sii.group_id "+ " \n " 
					+ " LEFT JOIN unit u ON u.unit_code = sii.unit_code "+ " \n "
					+ " LEFT JOIN size_package sp ON sp.size_code = sii.sizes_code and sp.group_id=sii.group_id "+ " \n " 
					+ " LEFT JOIN unit su ON su.unit_code = sii.sizes_unit_code  "+ " \n "
					+ " LEFT JOIN duty_group dg on dg.group_id = sii.group_id "+ " \n ";
		SQL_WHERE = " WHERE de.offcode_to = '"+offcode+"' and si.status='2' "+ " \n ";
		SQL_GROUP = " GROUP BY de.offcode_from, de.offcode_to, ed.offname , de.legislation_id,lg.legislation_name, sii.isdomestic, "+ " \n "
					+ " DECODE (sii.isdomestic,'I', 'ในประเทศ', 'O', 'ต่างประเทศ','Z','ไม่ระบุ'), nvl(sii.product_code,''), nvl(sii.duty_name,dt.duty_name), sii.brand_code,"+ " \n "
					+ " nvl(sii.brand_name,NVL(bm.brand_main_thai, bm.brand_main_eng)), "+ " \n "
					+ " nvl(sii.sizes_desc,sp.size_desc), nvl(sii.sizes_unit_name,su.thname), nvl(sii.qty_unit_name,u.thname),nvl(sii.group_name,dg.group_name)"+ " \n ";
		

		SQL_SELECT2 = " SELECT  so.offcode offcode_from, ed.offname offname_from, so.legislation_id,lg.legislation_name, sii.isdomestic, "+ " \n " 
					+ " DECODE (sii.isdomestic,'I', 'ในประเทศ', 'O', 'ต่างประเทศ','Z','ไม่ระบุ') isdomestic_name, sii.product_code, nvl(sii.duty_name,dt.duty_name) product_name, sii.brand_code, "+ " \n " 
					+ " NVL (sii.brand_name,nvl(bm.brand_main_thai, bm.brand_main_eng)) brand_name, "+ " \n "
					+ " CASE WHEN sum(pke_exhibit.getRemainOut(so.legislation_id, so.id, so.offcode_to, nvl(sii.duty_name,dt.duty_name),nvl(sii.brand_name,nvl(bm.brand_main_thai,bm.brand_main_eng)),nvl(sii.sizes_desc,sp.size_desc),sii.isdomestic,nvl(sii.group_name,dg.group_name),nvl(sii.qty_unit_name,u.thname),nvl(sii.sizes_unit_name,su.thname),'STOCKOUT')) > 0 THEN '1' ELSE '0' END status_code, "+ " \n "
					+ " CASE WHEN sum(pke_exhibit.getRemainOut(so.legislation_id, so.id, so.offcode_to, nvl(sii.duty_name,dt.duty_name),nvl(sii.brand_name,nvl(bm.brand_main_thai,bm.brand_main_eng)),nvl(sii.sizes_desc,sp.size_desc),sii.isdomestic,nvl(sii.group_name,dg.group_name),nvl(sii.qty_unit_name,u.thname),nvl(sii.sizes_unit_name,su.thname),'STOCKOUT')) > 0 THEN 'คงเหลือในคลัง' ELSE 'ปิดบัญชี' END status_name, "+ " \n " 
					+ " nvl(sii.sizes_desc,sp.size_desc) size_desc, NVL (sii.sizes_unit_name,su.thname) sizes_unit, sum(sii.qty) stockin_qty, NVL (sii.qty_unit_name,u.thname) qty_unit, "+ " \n "
					+ " pke_exhibit.getstockoutqty (so.offcode_to,so.offcode,nvl(sii.duty_name,dt.duty_name),nvl(sii.brand_name,nvl(bm.brand_main_thai,bm.brand_main_eng)),nvl(sii.sizes_desc,sp.size_desc),sii.isdomestic,nvl(sii.group_name,dg.group_name),nvl(sii.qty_unit_name,u.thname),nvl(sii.sizes_unit_name,su.thname),'1') destroy_qty, "+ " \n "
					+ " pke_exhibit.getstockoutqty (so.offcode_to,so.offcode,nvl(sii.duty_name,dt.duty_name),nvl(sii.brand_name,nvl(bm.brand_main_thai,bm.brand_main_eng)),nvl(sii.sizes_desc,sp.size_desc),sii.isdomestic,nvl(sii.group_name,dg.group_name),nvl(sii.qty_unit_name,u.thname),nvl(sii.sizes_unit_name,su.thname),'2') sale_qty, "+ " \n "
					+ " pke_exhibit.getstockoutqty (so.offcode_to,so.offcode,nvl(sii.duty_name,dt.duty_name),nvl(sii.brand_name,nvl(bm.brand_main_thai,bm.brand_main_eng)),nvl(sii.sizes_desc,sp.size_desc),sii.isdomestic,nvl(sii.group_name,dg.group_name),nvl(sii.qty_unit_name,u.thname),nvl(sii.sizes_unit_name,su.thname),'3') return_qty, "+ " \n "
					+ " pke_exhibit.getstockoutqty (so.offcode_to,so.offcode,nvl(sii.duty_name,dt.duty_name),nvl(sii.brand_name,nvl(bm.brand_main_thai,bm.brand_main_eng)),nvl(sii.sizes_desc,sp.size_desc),sii.isdomestic,nvl(sii.group_name,dg.group_name),nvl(sii.qty_unit_name,u.thname),nvl(sii.sizes_unit_name,su.thname),'4') keep_qty, "+ " \n "
					+ " pke_exhibit.getstockoutqty (so.offcode_to,so.offcode,nvl(sii.duty_name,dt.duty_name),nvl(sii.brand_name,nvl(bm.brand_main_thai,bm.brand_main_eng)),nvl(sii.sizes_desc,sp.size_desc),sii.isdomestic,nvl(sii.group_name,dg.group_name),nvl(sii.qty_unit_name,u.thname),nvl(sii.sizes_unit_name,su.thname),'5') transfer_qty, "+ " \n "
					+ " sum(pke_exhibit.getRemainOut(so.legislation_id, so.id, so.offcode_to, nvl(sii.duty_name,dt.duty_name),nvl(sii.brand_name,nvl(bm.brand_main_thai,bm.brand_main_eng)),nvl(sii.sizes_desc,sp.size_desc),sii.isdomestic,nvl(sii.group_name,dg.group_name),nvl(sii.qty_unit_name,u.thname),nvl(sii.sizes_unit_name,su.thname),'STOCKOUT')) qty "+ " \n ";
		SQL_FROM2 =" FROM stockin_item sii INNER JOIN stockin si on si.id=sii.stockin_id "+ " \n " 
					+ " INNER JOIN stockout so ON so.ID = si.stockout_id "+ " \n "
					+ " INNER JOIN legislation lg ON lg.ID = so.legislation_id " + " \n "
					+ " INNER JOIN ed_office ed ON ed.offcode = so.offcode "+ " \n "
					+ " LEFT JOIN duty_table dt on dt.duty_code=sii.duty_code "+ " \n "
					+ " LEFT JOIN product pd ON pd.product_code = sii.product_code "+ " \n "
					+ " LEFT JOIN brand_main bm ON bm.brand_main_code = sii.brand_code and bm.group_id=sii.group_id "+ " \n " 
					+ " LEFT JOIN unit u ON u.unit_code = sii.unit_code "+ " \n "
					+ " LEFT JOIN size_package sp ON sp.size_code = sii.sizes_code and sp.group_id=sii.group_id "+ " \n " 
					+ " LEFT JOIN unit su ON su.unit_code = sii.sizes_unit_code "+ " \n "
					+ " LEFT JOIN duty_group dg on dg.group_id = sii.group_id "+ " \n ";
		SQL_WHERE2 = " WHERE so.offcode_to = '"+offcode+"' and si.status='2' "+ " \n ";
		SQL_GROUP2 = " GROUP BY so.offcode_to, so.offcode , ed.offname , so.legislation_id,lg.legislation_name, sii.isdomestic,"+ " \n "
					+ " DECODE (sii.isdomestic,'I', 'ในประเทศ', 'O', 'ต่างประเทศ','Z','ไม่ระบุ'), sii.product_code, nvl(sii.duty_name,dt.duty_name), sii.brand_code,"+ " \n "
					+ " NVL (sii.brand_name,nvl(bm.brand_main_thai, bm.brand_main_eng)), "+ " \n "
					+ " nvl(sii.sizes_desc,sp.size_desc), NVL (sii.sizes_unit_name,su.thname),  NVL (sii.qty_unit_name,u.thname),nvl(sii.group_name,dg.group_name)"+ " \n ";
					

	}
	
	private void prepare_sql_unit(){
		//SQL SEPARATE BY UNIT
		SQL_UNIT_SELECT = " SELECT de.offcode_from, ed.offname offname_from, de.legislation_id,lg.legislation_name, sii.isdomestic, \n"  
					  + " DECODE (sii.isdomestic,'I', 'ในประเทศ', 'O', 'ต่างประเทศ','Z','ไม่ระบุ') isdomestic_name, sii.product_code, nvl(sii.duty_name,dt.duty_name) duty_name, sii.brand_code, \n"   
					  + " nvl(sii.brand_name,NVL (bm.brand_main_thai, bm.brand_main_eng)) brand_name,    \n"
					  + " CASE WHEN sum(pke_exhibit.getRemainOut(de.legislation_id, de.id, de.offcode_to, nvl(sii.duty_name,dt.duty_name),nvl(sii.brand_name,nvl(bm.brand_main_thai,bm.brand_main_eng)),nvl(sii.sizes_desc,sp.size_desc),sii.isdomestic,nvl(sii.group_name,dg.group_name),nvl(sii.qty_unit_name,u.thname),nvl(sii.sizes_unit_name,su.thname),'DELIVERY_EXHIBIT')) > 0 THEN '1' ELSE '0' END status_code, \n"   
					  + " CASE WHEN sum(pke_exhibit.getRemainOut(de.legislation_id, de.id, de.offcode_to, nvl(sii.duty_name,dt.duty_name),nvl(sii.brand_name,nvl(bm.brand_main_thai,bm.brand_main_eng)),nvl(sii.sizes_desc,sp.size_desc),sii.isdomestic,nvl(sii.group_name,dg.group_name),nvl(sii.qty_unit_name,u.thname),nvl(sii.sizes_unit_name,su.thname),'DELIVERY_EXHIBIT')) > 0 THEN 'คงเหลือในคลัง' ELSE 'ปิดบัญชี' END status_name, \n"   
					  + " nvl(sii.sizes_desc,sp.size_desc) size_desc, nvl(sii.sizes_unit_name,su.thname) sizes_unit, sum(sii.qty) stockin_qty, NVL (sii.qty_unit_name,u.thname) qty_unit,    \n"
					  + " pke_exhibit.getstockoutqtysum (de.offcode_to,nvl(sii.duty_name,dt.duty_name),nvl(sii.brand_name,nvl(bm.brand_main_thai,bm.brand_main_eng)),nvl(sii.sizes_desc,sp.size_desc),sii.isdomestic,nvl(sii.group_name,dg.group_name),nvl(sii.qty_unit_name,u.thname),nvl(sii.sizes_unit_name,su.thname),'1') destroy_qty,    \n"
					  + " pke_exhibit.getstockoutqtysum (de.offcode_to,nvl(sii.duty_name,dt.duty_name),nvl(sii.brand_name,nvl(bm.brand_main_thai,bm.brand_main_eng)),nvl(sii.sizes_desc,sp.size_desc),sii.isdomestic,nvl(sii.group_name,dg.group_name),nvl(sii.qty_unit_name,u.thname),nvl(sii.sizes_unit_name,su.thname),'2') sale_qty,    \n"
					  + " pke_exhibit.getstockoutqtysum (de.offcode_to,nvl(sii.duty_name,dt.duty_name),nvl(sii.brand_name,nvl(bm.brand_main_thai,bm.brand_main_eng)),nvl(sii.sizes_desc,sp.size_desc),sii.isdomestic,nvl(sii.group_name,dg.group_name),nvl(sii.qty_unit_name,u.thname),nvl(sii.sizes_unit_name,su.thname),'3') return_qty,    \n"
					  + " pke_exhibit.getstockoutqtysum (de.offcode_to,nvl(sii.duty_name,dt.duty_name),nvl(sii.brand_name,nvl(bm.brand_main_thai,bm.brand_main_eng)),nvl(sii.sizes_desc,sp.size_desc),sii.isdomestic,nvl(sii.group_name,dg.group_name),nvl(sii.qty_unit_name,u.thname),nvl(sii.sizes_unit_name,su.thname),'4') keep_qty,    \n"
					  + " pke_exhibit.getstockoutqtysum (de.offcode_to,nvl(sii.duty_name,dt.duty_name),nvl(sii.brand_name,nvl(bm.brand_main_thai,bm.brand_main_eng)),nvl(sii.sizes_desc,sp.size_desc),sii.isdomestic,nvl(sii.group_name,dg.group_name),nvl(sii.qty_unit_name,u.thname),nvl(sii.sizes_unit_name,su.thname),'5') transfer_qty,   \n"
					  + " sum(pke_exhibit.getRemainOut(de.legislation_id, de.id, de.offcode_to, nvl(sii.duty_name,dt.duty_name),nvl(sii.brand_name,nvl(bm.brand_main_thai,bm.brand_main_eng)),nvl(sii.sizes_desc,sp.size_desc),sii.isdomestic,nvl(sii.group_name,dg.group_name),nvl(sii.qty_unit_name,u.thname),nvl(sii.sizes_unit_name,su.thname),'DELIVERY_EXHIBIT')) qty   " + " \n ";
		SQL_UNIT_FROM = " FROM stockin_item sii INNER JOIN stockin si on si.id=sii.stockin_id "+ " \n "
					+ " INNER JOIN delivery_exhibit de ON de.ID = si.delivery_exhibit_id " + " \n "
					+ " INNER JOIN ed_office ed ON ed.offcode = de.offcode_from "+ " \n "
					+ " INNER JOIN legislation lg ON lg.ID = de.legislation_id "+ " \n "
					+ " LEFT JOIN duty_table dt on dt.duty_code=sii.duty_code "+ " \n "
					+ " LEFT JOIN product pd ON pd.product_code = sii.product_code "+ " \n "
					+ " LEFT JOIN brand_main bm ON bm.brand_main_code = sii.brand_code and bm.group_id=sii.group_id "+ " \n " 
					+ " LEFT JOIN unit u ON u.unit_code = sii.unit_code "+ " \n "
					+ " LEFT JOIN size_package sp ON sp.size_code = sii.sizes_code and sp.group_id=sii.group_id "+ " \n " 
					+ " LEFT JOIN unit su ON su.unit_code = sii.sizes_unit_code "+ " \n "
					+ " LEFT JOIN duty_group dg on dg.group_id = sii.group_id "+ " \n ";
	    SQL_UNIT_WHERE = " WHERE de.offcode_to = '"+ offcode +"' and si.status='2' "+ " \n ";
	    SQL_UNIT_GROUP = "GROUP BY de.offcode_from, de.offcode_to, ed.offname , de.legislation_id,lg.legislation_name, sii.isdomestic, \n"  
	    			+ " DECODE (sii.isdomestic,'I', 'ในประเทศ', 'O', 'ต่างประเทศ','Z','ไม่ระบุ') , sii.product_code, nvl(sii.duty_name,dt.duty_name) , sii.brand_code, \n"   
	    			+ " nvl(sii.brand_name,NVL (bm.brand_main_thai, bm.brand_main_eng)),nvl(sii.sizes_desc,sp.size_desc) , nvl(sii.sizes_unit_name,su.thname), \n"
	    			+ " NVL (sii.qty_unit_name,u.thname),nvl(sii.group_name,dg.group_name)";
	    
	    SQL_UNIT_SELECT2 = " SELECT  so.offcode offcode_from, ed.offname offname_from, so.legislation_id,lg.legislation_name, sii.isdomestic, "+ " \n " 
					+ " DECODE (sii.isdomestic,'I', 'ในประเทศ', 'O', 'ต่างประเทศ','Z','ไม่ระบุ') isdomestic_name, sii.product_code, nvl(sii.duty_name,dt.duty_name) duty_name, sii.brand_code, "+ " \n " 
					+ " nvl(sii.brand_name, NVL (bm.brand_main_thai, bm.brand_main_eng)) brand_name, "+ " \n "
					+ " CASE WHEN sum(pke_exhibit.getRemainOut(so.legislation_id, so.id, so.offcode_to, nvl(sii.duty_name,dt.duty_name),nvl(sii.brand_name,nvl(bm.brand_main_thai,bm.brand_main_eng)),nvl(sii.sizes_desc,sp.size_desc),sii.isdomestic,nvl(sii.group_name,dg.group_name),nvl(sii.qty_unit_name,u.thname),nvl(sii.sizes_unit_name,su.thname),'STOCKOUT')) > 0 THEN '1' ELSE '0' END status_code, "+ " \n "
					+ " CASE WHEN sum(pke_exhibit.getRemainOut(so.legislation_id, so.id, so.offcode_to, nvl(sii.duty_name,dt.duty_name),nvl(sii.brand_name,nvl(bm.brand_main_thai,bm.brand_main_eng)),nvl(sii.sizes_desc,sp.size_desc),sii.isdomestic,nvl(sii.group_name,dg.group_name),nvl(sii.qty_unit_name,u.thname),nvl(sii.sizes_unit_name,su.thname),'STOCKOUT')) > 0 THEN 'คงเหลือในคลัง' ELSE 'ปิดบัญชี' END status_name, "+ " \n " 
					+ " nvl(sii.sizes_desc,sp.size_desc) size_desc, nvl(sii.sizes_unit_name,su.thname) sizes_unit, sum(sii.qty) stockin_qty, NVL (sii.qty_unit_name,u.thname) qty_unit, "+ " \n "
					+ " pke_exhibit.getstockoutqtysum (so.offcode_to,nvl(sii.duty_name,dt.duty_name),nvl(sii.brand_name,nvl(bm.brand_main_thai,bm.brand_main_eng)),nvl(sii.sizes_desc,sp.size_desc),sii.isdomestic,nvl(sii.group_name,dg.group_name),nvl(sii.qty_unit_name,u.thname),nvl(sii.sizes_unit_name,su.thname),'1') destroy_qty, "+ " \n "
					+ " pke_exhibit.getstockoutqtysum (so.offcode_to,nvl(sii.duty_name,dt.duty_name),nvl(sii.brand_name,nvl(bm.brand_main_thai,bm.brand_main_eng)),nvl(sii.sizes_desc,sp.size_desc),sii.isdomestic,nvl(sii.group_name,dg.group_name),nvl(sii.qty_unit_name,u.thname),nvl(sii.sizes_unit_name,su.thname),'2') sale_qty, "+ " \n "
					+ " pke_exhibit.getstockoutqtysum (so.offcode_to,nvl(sii.duty_name,dt.duty_name),nvl(sii.brand_name,nvl(bm.brand_main_thai,bm.brand_main_eng)),nvl(sii.sizes_desc,sp.size_desc),sii.isdomestic,nvl(sii.group_name,dg.group_name),nvl(sii.qty_unit_name,u.thname),nvl(sii.sizes_unit_name,su.thname),'3') return_qty, "+ " \n "
					+ " pke_exhibit.getstockoutqtysum (so.offcode_to,nvl(sii.duty_name,dt.duty_name),nvl(sii.brand_name,nvl(bm.brand_main_thai,bm.brand_main_eng)),nvl(sii.sizes_desc,sp.size_desc),sii.isdomestic,nvl(sii.group_name,dg.group_name),nvl(sii.qty_unit_name,u.thname),nvl(sii.sizes_unit_name,su.thname),'4') keep_qty, "+ " \n "
					+ " pke_exhibit.getstockoutqtysum (so.offcode_to,nvl(sii.duty_name,dt.duty_name),nvl(sii.brand_name,nvl(bm.brand_main_thai,bm.brand_main_eng)),nvl(sii.sizes_desc,sp.size_desc),sii.isdomestic,nvl(sii.group_name,dg.group_name),nvl(sii.qty_unit_name,u.thname),nvl(sii.sizes_unit_name,su.thname),'5') transfer_qty, "+ " \n "
					+ " sum(pke_exhibit.getRemainOut(so.legislation_id, so.id, so.offcode_to, nvl(sii.duty_name,dt.duty_name),nvl(sii.brand_name,nvl(bm.brand_main_thai,bm.brand_main_eng)),nvl(sii.sizes_desc,sp.size_desc),sii.isdomestic,nvl(sii.group_name,dg.group_name),nvl(sii.qty_unit_name,u.thname),nvl(sii.sizes_unit_name,su.thname),'STOCKOUT')) qty "+ " \n ";
	    SQL_UNIT_FROM2 = " FROM stockin_item sii INNER JOIN stockin si on si.id=sii.stockin_id "+ " \n " 
					+ " INNER JOIN stockout so ON so.ID = si.stockout_id "+ " \n "
					+ " INNER JOIN legislation lg ON lg.ID = so.legislation_id " + " \n "
					+ " INNER JOIN ed_office ed ON ed.offcode = so.offcode "+ " \n "
					+ " LEFT JOIN duty_table dt on dt.duty_code=sii.duty_code "+ " \n "
					+ " LEFT JOIN product pd ON pd.product_code = sii.product_code "+ " \n "
					+ " LEFT JOIN brand_main bm ON bm.brand_main_code = sii.brand_code and bm.group_id=sii.group_id "+ " \n " 
					+ " LEFT JOIN unit u ON u.unit_code = sii.unit_code "+ " \n "
					+ " LEFT JOIN size_package sp ON sp.size_code = sii.sizes_code and sp.group_id=sii.group_id "+ " \n " 
					+ " LEFT JOIN unit su ON su.unit_code = sii.sizes_unit_code"+ " \n "
					+ " LEFT JOIN duty_group dg on dg.group_id = sii.group_id "+ " \n ";
	    SQL_UNIT_WHERE2 = " WHERE so.offcode_to = '"+offcode+"' and si.status='2' "+ " \n ";
	    SQL_UNIT_GROUP2 = " GROUP BY so.offcode, so.offcode_to,ed.offname , so.legislation_id,lg.legislation_name, sii.isdomestic, \n"  
			    	+ " DECODE (sii.isdomestic,'I', 'ในประเทศ', 'O', 'ต่างประเทศ','Z','ไม่ระบุ') , sii.product_code, nvl(sii.duty_name,dt.duty_name) , sii.brand_code, \n"   
			    	+ " nvl(sii.brand_name,NVL (bm.brand_main_thai, bm.brand_main_eng)),nvl(sii.sizes_desc,sp.size_desc) , nvl(sii.sizes_unit_name,su.thname), \n"
			    	+ " NVL (sii.qty_unit_name,u.thname),nvl(sii.group_name,dg.group_name)";
	    	
	}
	
	public void openExcel(HttpServletRequest request, HttpServletResponse response) throws Exception {
		request.setAttribute("tabPage", request.getAttribute("tabPage"));
		forward("/ManageExhibit/export_excel.jsp", request, response);
		//forward("/Popup/divide_staff_poplist.jsp", request, response);
	}
	
}
