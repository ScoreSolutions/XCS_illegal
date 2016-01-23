package com.ko.webapp.action;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.json.JSONArray;
import org.springframework.web.bind.ServletRequestUtils;

import com.ko.Constants;
import com.ko.domain.DeliveryExhibit;
import com.ko.domain.Legislation;
import com.ko.domain.Staff;
import com.ko.domain.Stockin;
import com.ko.domain.Stockout;
import com.ko.domain.StockoutItem;
import com.ko.domain.Title;
import com.ko.domain.Unit;
import com.ko.webapp.bean.UserSession;
import com.ko.webapp.util.ParameterUtil;

/**
 * 
 * @author SoCool
 * Base Class for Exhibit Module
 */
public abstract class ExhibitBaseAction extends BaseAction {
	private final Log logger = LogFactory.getLog(getClass());
	protected String SQL_COUNT = "SELECT count(*) ";
	protected String SQL_SELECT = "SELECT so.ID, so.stockout_code, so.stockout_date," + " TO_CHAR(so.stockout_date,'dd/mm/yyyy','NLS_CALENDAR=''THAI BUDDHA'' NLS_DATE_LANGUAGE=THAI') stockout_date2,"
			+ " so.legislation_id, lg.legislation_name, so.subject," + " nvl(so.report_to_posname, ti.title_name || st.first_name || ' ' || st.last_name) learn_staff ";
	protected String SQL_FROM = " FROM stockout so INNER JOIN legislation lg ON lg.ID = so.legislation_id " 
			+ " LEFT JOIN staff st ON st.idcard_no = so.report_to_staff "
			+ " LEFT JOIN title ti ON ti.title_code = st.title_code";
	protected String SQL_WHERE = "";
	protected String SQL_GROUP = "";
	protected String SQL_ORDER = " ORDER BY lg.legislation_name, so.stockout_code ";
	protected String JSP_SEARCH_PAGE = "";
	protected String JSP_FORM_PAGE = "";
	protected String TRAN_LOG_MSG_RESET = "ยกเลิก";
	protected String TRAN_LOG_MSG_SAVE = "บันทึก";
	protected String TRAN_LOG_MSG_BACK = "กลับหน้าค้นหา";
	protected String TRAN_LOG_MSG_CONFIRM = "อัพเกรท";
	protected String TRAN_LOG_MSG_CREATE = "เพิ่มรายการ";
	protected String TRAN_LOG_MSG_SEARCH = "ค้นหา";
	protected String TRAN_LOG_MSG_DISPLAY = "แสดงรายการ";
	protected String TRAN_LOG_MSG_MENU = "เลือก";
	public String back_action="";
	public Long re_id = null;
	public String go_action = "";
	public String go_cmd = "";
	protected String menuID = "";

	@Override
	public void _default(HttpServletRequest request, HttpServletResponse response) throws Exception {
		// TODO Auto-generated method stub
		
		pre(request, response);
		
		if(uData.chkUserMenu(menuID)==true){
			String is_back = ServletRequestUtils.getStringParameter(request, "is_back", "");
			if (!"".equals(is_back)) {
				this.tranLogSave(TRAN_LOG_MSG_BACK);
			}
			String menu = ServletRequestUtils.getStringParameter(request, "menu", "");
			if (!"".equals(menu)) {
				this.tranLogSave(TRAN_LOG_MSG_MENU);
			}
			forward(JSP_SEARCH_PAGE, request, response);
		}else{
    		HttpSession session = request.getSession();
  		  	session.invalidate();
  		  	request.setAttribute("errMsg", "ผู้ใช้ไม่มีสิทธิ์ดำเนินการ");
  		  	forward("?page=/login.jsp", request, response);
    	}
	}

	protected void pre(HttpServletRequest request, HttpServletResponse response) throws Exception {
		Legislation lt = new Legislation(this.db);
		List<Legislation> ltlist = lt.findByWhere(" 1=1 order by legislation_name", null);
		request.setAttribute("ltlist", ltlist);
		
		Unit unit = new Unit(this.db);
		String uSql = "select u.unit_code, u.thname, du.group_id ";
		uSql += " from unit u";
		uSql += " inner join duty_unit du on du.unit_code=u.unit_code ";
		uSql += " where du.used_for in ('A','S') ";
		uSql += " and to_char(sysdate,'yyyymmdd') between to_char(du.begin_date,'yyyymmdd') and to_char(nvl(du.end_date,sysdate),'yyyymmdd') ";
		uSql += " order by u.thname";
		log.debug(uSql);
		List<Map<String,Object>> unitlist = unit.findBySql(uSql);
		request.setAttribute("unitlist", unitlist);
		request.setAttribute("unit_json", new JSONArray(unitlist).toString());
	}

	//Internal Method	
	protected void fetchDataToRequest(HttpServletRequest request, String condition) {
		Stockout model = new Stockout(this.db);
		List<Object> objList = new ArrayList<Object>();
		List data_list = new ArrayList<Object>();
		try {
			Integer totalRow = 0;
			if (condition != null && !"".equals(condition)) {
				String cond_query = SQL_WHERE + " and " + condition;
				totalRow = model.countBySql(SQL_COUNT + SQL_FROM + cond_query, objList.toArray());
				pageUtil.setTotalRow(totalRow);
				logger.info("Condition Query is:" + SQL_SELECT + SQL_FROM + cond_query + SQL_ORDER);
				data_list = model.findBySql(SQL_SELECT + SQL_FROM + cond_query + SQL_ORDER, objList.toArray(), pageUtil);
			} else {
				String cond_query = SQL_FROM + SQL_WHERE;
				totalRow = model.countBySql(SQL_COUNT + cond_query, objList.toArray());
				pageUtil.setTotalRow(totalRow);
				logger.info("Condition Query is:" + SQL_SELECT + cond_query + SQL_ORDER);
				data_list = model.findBySql(SQL_SELECT + cond_query + SQL_ORDER, objList.toArray(), pageUtil);
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		log.debug("sql Exhivit destrory="+SQL_SELECT +SQL_FROM+SQL_WHERE + " and " + condition + SQL_ORDER);
		request.setAttribute("soList", data_list);
	}

	protected String generateExhibitCond(HttpServletRequest request) {
		String cond = " 1=1 ";
		String stockout_code = ServletRequestUtils.getStringParameter(request, "stockout_code", "");
		if (!"".equals(stockout_code))
			cond += " and so.stockout_code like '%" + stockout_code + "%' ";

		String legislation_id = ServletRequestUtils.getStringParameter(request, "legislation_id", "");
		if (!"".equals(legislation_id))
			cond += " and so.legislation_id = '" + legislation_id + "' ";

		String stockout_date = ServletRequestUtils.getStringParameter(request, "stockout_date", "");
		if (!"".equals(stockout_date)) {
			cond += " ADD_MONTHS (TO_DATE (so.stockout_date), 6516) BETWEEN TO_DATE ('" + stockout_date + "', 'dd/mm/yyyy') " + " AND TO_DATE ('" + stockout_date + "', 'dd/mm/yyyy') and ";
		}

		String stockout_date_from = ServletRequestUtils.getStringParameter(request, "stockout_date_from", "");
		String stockout_date_to = ServletRequestUtils.getStringParameter(request, "stockout_date_to", "");
		if (!"".equals(stockout_date_from) && !"".equals(stockout_date_to)) {
			cond += " ADD_MONTHS (TO_DATE (so.stockout_date), 6516) BETWEEN TO_DATE ('" + stockout_date_from + "', 'dd/mm/yyyy') " + "AND TO_DATE ('" + stockout_date_to + "', 'dd/mm/yyyy') and ";
		} else if (!"".equals(stockout_date_from)) {
			cond += " ADD_MONTHS (TO_DATE (so.stockout_date), 6516) BETWEEN TO_DATE ('" + stockout_date_from + "', 'dd/mm/yyyy') " + "AND TO_DATE ('" + stockout_date_from + "', 'dd/mm/yyyy') and ";
		}

		String so_status = ServletRequestUtils.getStringParameter(request, "so_status", "");
		if (!"".equals(so_status)){
			cond += " and so.status = '" + so_status + "' ";
			request.setAttribute("so_status", so_status);
		}

		String transfer_staff = ServletRequestUtils.getStringParameter(request, "transfer_staff", "");
		if (!"".equals(transfer_staff))
			cond += " and (st.first_name like '%" + transfer_staff + "%' or st.last_name like '%" + transfer_staff + "%') ";

		String offname_to = ServletRequestUtils.getStringParameter(request, "offname_to","");
		if(!"".equals(offname_to))
			cond += " and ed.offname like '%" + offname_to + "%'";

		
		logger.info("SQL Condition:" + cond);
		return cond;
	}

	/**
	 * Business Logic For create update
	 */
	public void list(HttpServletRequest request, HttpServletResponse response) throws Exception {
		pre(request, response);
		String sql_cond = generateExhibitCond(request);
		fetchDataToRequest(request, sql_cond);
		String search = ServletRequestUtils.getStringParameter(request, "search", "");
		if (!"".equals(search)) {
			this.tranLogSave(TRAN_LOG_MSG_SEARCH);
		}
		forward(JSP_SEARCH_PAGE, request, response);
	}

	public void create(HttpServletRequest request, HttpServletResponse response) throws Exception {
		pre(request, response);
		Stockout so = new Stockout(this.db);
		so.setStockout_date(new Date());
		request.setAttribute("so", so);

		this.tranLogSave(TRAN_LOG_MSG_CREATE);
		request.setAttribute("statusname", "ทำรายการ");
		request.setAttribute("action",back_action);
		request.setAttribute("offname", offname);
		forward(JSP_FORM_PAGE, request, response);
	}

	public void edit(HttpServletRequest request, HttpServletResponse response) throws Exception {
		pre(request, response);
		Long id = ServletRequestUtils.getLongParameter(request, "id", -1);
		if (id != -1) {
			Stockout so = new Stockout(this.db).findByPk(id);
			this.setStockoutItemList(request, so);
			request.setAttribute("so", so);
			//log.debug(so.toString());
			//Staff staff = so.getReportStaff();
			//if (staff != null)
			//	log.debug("staff_name="+staff.getFullName());
			//	request.setAttribute("staff_name", staff.getFullName());
		}
		String reset = ServletRequestUtils.getStringParameter(request, "reset", "");
		if (!"".equals(reset)) {
			this.tranLogSave(TRAN_LOG_MSG_RESET);
		}
		String display = ServletRequestUtils.getStringParameter(request, "display", "");
		if (!"".equals(display)) {
			this.tranLogSave(TRAN_LOG_MSG_DISPLAY);
		}
		if(request.getParameter("SaveMsg") != null)
			request.setAttribute("SaveMsg", "1");
		
		forward(JSP_FORM_PAGE, request, response);
	}

	public void update(HttpServletRequest request, HttpServletResponse response) throws Exception {
		pre(request, response);
		if (this.processUpdate(request) == true) {
			this.tranLogSave(TRAN_LOG_MSG_SAVE);
		}
		String confirm = ServletRequestUtils.getStringParameter(request, "confirm", "");
		if (!"".equals(confirm)) {
			this.updateTranlogConfirm(request);
		}
		//log.debug("re to ::" + "process?action=" + go_action + "&cmd=" + go_cmd + "&id=" + re_id);
		redirect("process?action=" + go_action + "&cmd=" + go_cmd + "&id=" + re_id + "&SaveMsg=1");
		//forward(JSP_SEARCH_PAGE, request, response);
	}

	/**
	 * Confirm action update tranlog confirm and set status to 2
	 * @param request
	 */
	protected void updateTranlogConfirm(HttpServletRequest request) {
		Long id = ServletRequestUtils.getLongParameter(request, "id", -1);
		if (id != -1 || re_id != null) {
			Stockout so = null;
			try {
				// comment because error SQL
				/*
				java.sql.SQLException: ORA-04091: table EXCISE_LAW.STOCKOUT is mutating, trigger/function may not see it
				ORA-06512: at "EXCISE_LAW.PKE_EXHIBIT", line 215
				ORA-06512: at "EXCISE_LAW.PKE_EXHIBIT", line 231
				ORA-06512: at "EXCISE_LAW.TG_CUTSTOCKOUT", line 6
				ORA-04088: error during execution of trigger 'EXCISE_LAW.TG_CUTSTOCKOUT'
				*/
				so = new Stockout(this.db).findByPk(id);
				so.setStatus("2");
				so.update();
				
				this.tranLogSave(TRAN_LOG_MSG_CONFIRM);
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		}
	}
	
//	protected boolean chkDupStockoutItem(HttpServletRequest request){
//		boolean ret = false;
//		
//		//เก็บค่าเข้าตัวแปรก่อน
//		String[] product_code = request.getParameterValues("product_code");
//		String[] brand_code = request.getParameterValues("brand_code");
//		String[] isdomestic = request.getParameterValues("isdomestic");
//		String[] size_code = request.getParameterValues("size_code");
//		String[] size_unit_code = request.getParameterValues("size_unit_code");
//		String[] unit_code = request.getParameterValues("unit_code");
//		String[] delivery_code = request.getParameterValues("delivery_code");
//		
//		if (product_code != null) {
//			String vProductCode = "";
//			String vBrandCode = "";
//			String vIsDomestic = "";
//			String vSizeCode = "";
//			String vSizeUnitCode = "";
//			String vUnitCode = "";
//			String vDeliveryID = "";
//			for (int i = 0; i < product_code.length; i++) {
//				log.debug("vProductCode : " + vProductCode + "       ### product_code: " + product_code[i]);
//				if(vProductCode.equals((product_code[i] != null ? product_code[i] : "")) && vBrandCode.equals((brand_code[i] != null ? brand_code[i] : "")) 
//					&& vIsDomestic.equals((isdomestic[i] != null ? isdomestic[i] : "")) && vSizeCode.equals((size_code[i]!=null ? size_code[i] : ""))
//					&& vSizeUnitCode.equals((size_unit_code[i]!=null ? size_unit_code[i] : "")) && vUnitCode.equals((unit_code[i]!=null ? unit_code[i] : ""))
//					&& vDeliveryID.equals((delivery_code[i]!=null ? delivery_code[i] : ""))){
//					
//					return true;
//				}
//				vProductCode = product_code[i];
//				vBrandCode = brand_code[i];
//				vIsDomestic = isdomestic[i];
//				vSizeUnitCode= size_unit_code[i];
//				vSizeCode = size_code[i];
//				vUnitCode = unit_code[i];
//				vDeliveryID = delivery_code[i];
//				
//				//String sql = "";
//				//sql += " select id from stockout_item soi ";
//				//sql += " where nvl(product_code,'#') = nvl('" + product_code[i] + "','#') ";
//				//sql += " and nvl(brand_code,'#') = nvl('" + brand_code[i] + "','#') ";
//				//sql += " and nvl(unit_code,'#') = nvl('" + unit_code[i] + "','#') ";
//				//sql += " and delivery_exhibit_id = '" + delivery_code[i] + "'";
//				//sql += " and nvl(sizes_unit_code,'#') = nvl('" + size_unit_code[i] + "','#')";
//				//sql += " and nvl(sizes_code,'#') = nvl('" + size_code[i] + "','#')";
//				//sql += " and isdemestic = '" + isdomestic + "'";
//			}
//		}
//		
//		return ret;
//	}

	protected void updateChildExhibit(HttpServletRequest request, Stockout stockout) {
		//process for child
		String[] product_code = request.getParameterValues("product_code");
		String[] brand_code = request.getParameterValues("brand_code");
		String[] isdomestic = request.getParameterValues("isdomestic");
		String[] size_code = request.getParameterValues("size_code");
		String[] size_unit_code = request.getParameterValues("size_unit_code");
		String[] unit_code = request.getParameterValues("unit_code");
		String[] qty = request.getParameterValues("qty");
		String[] netweight = request.getParameterValues("netweight");
		String[] netweight_unit = request.getParameterValues("netweight_unit");
		String[] delivery_code = request.getParameterValues("delivery_code");
		String[] duty_code = request.getParameterValues("duty_code");
		String[] ref_stockout_id = request.getParameterValues("ref_stockout_id");
		String[] group_id = request.getParameterValues("group_id");
		String[] product_name = request.getParameterValues("product_name");
		String[] brand_name = request.getParameterValues("brand_name");
		String[] qty_unit_name = request.getParameterValues("qty_unit_name");
		String[] sizes_desc = request.getParameterValues("sizes_desc");
		String[] sizes_unit_name = request.getParameterValues("sizes_unit_name");
		String[] netweight_unit_name = request.getParameterValues("netweight_unit_name");
		String[] duty_name = request.getParameterValues("duty_name");
		String[] group_name = request.getParameterValues("group_name");
		
		StockoutItem soi = new StockoutItem(this.db);
		
		try {
			//clear data first
			if(stockout != null){
				soi.deleteByWhere("stockout_id='" + stockout.getId() + "'", null);
				if (delivery_code != null) {
					for (int i = 0; i < delivery_code.length; i++) {
						//soi = new StockoutItem(this.db);
						soi.setStockout_id(stockout.getId());
						soi.setProduct_code(product_code[i]);
						soi.setBrand_code(brand_code[i]);
						soi.setIsdomestic(isdomestic[i]);
						soi.setSizes_code(size_code[i]);
						soi.setSizes_unit_code(size_unit_code[i]);
						soi.setUnit_code(unit_code[i]);
						soi.setDelivery_exhibit_id((!delivery_code[i].equals("") ? new Long(delivery_code[i]) : null));
						soi.setQty((!qty[i].equals("") ? new Double(qty[i]) : null));
						soi.setNetweight((!netweight[i].equals("") ? new Double(netweight[i]) : null));
						soi.setNetweight_unit(netweight_unit[i]);
						soi.setDuty_code(duty_code[i]);
						soi.setGroup_id(group_id[i]);
						soi.setProduct_name(product_name[i]);
						soi.setBrand_name(brand_name[i]);
						soi.setQty_unit_name(qty_unit_name[i]);
						soi.setSizes_desc(sizes_desc[i]);
						soi.setSizes_unit_name(sizes_unit_name[i]);
						soi.setNetweight_unit_name(netweight_unit_name[i]);
						soi.setDuty_name(duty_name[i]);
						soi.setGroup_name(group_name[i]);
						
						soi.setRef_stockout_id((!ref_stockout_id[i].equals("") ? new Long(ref_stockout_id[i]) : null));
						soi.setCreate_by(new Long(this.create_by));
						
						soi = soi.create();
					}
				}
				this.db.commitTx();
			}			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			try {
				this.db.rollbackTx();
			} catch (Exception e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			e.printStackTrace();
		}
	}

	protected void setStockoutItemList(HttpServletRequest request, Stockout so) {
		String SOI_SQL_SELECT = "SELECT   soi.ID, soi.stockout_id, soi.product_code, nvl(soi.duty_name,dt.duty_name) product_name,"
				+ " soi.brand_code, NVL (bm.brand_main_thai, bm.brand_main_eng) brand_name, "
				+ " soi.sizes_code, soi.sizes_unit_code, " 
				+ "  NVL (soi.sizes_unit_name,us.thname) sizes_unit_name,nvl(soi.sizes_desc, sp.size_desc) sizes_desc, soi.duty_code,"
				+ " soi.isdomestic,DECODE (soi.isdomestic, 'I', 'ในประเทศ', 'O', 'ต่างประเทศ') isdomestic_desc, "
				+ " pke_exhibit.getremainout (so.legislation_id,nvl(soi.delivery_exhibit_id,soi.ref_stockout_id),so.offcode, "
				+ "    nvl(soi.duty_name,dt.duty_name),nvl(soi.brand_name,nvl(bm.brand_main_thai,bm.brand_main_eng)),nvl(soi.sizes_desc,sp.size_desc),"
				+ "    soi.isdomestic, nvl(soi.group_name,dg.group_name), nvl(soi.qty_unit_name,u.thname), nvl(soi.sizes_unit_name,us.thname), "
				+ "    case when soi.delivery_exhibit_id is not null then 'DELIVERY_EXHIBIT' else 'STOCKOUT' end) remain_qty,"
				+ " soi.qty, soi.unit_code,NVL (u.thname, u.enname) unit_name,-1 recieve_qty, soi.netweight, soi.netweight_unit , soi.delivery_exhibit_id, de.delivery_code, soi.ref_stockout_id, "
				+ " soi.group_id, nvl(soi.qty_unit_name, u.thname) qty_unit_name, nvl(soi.netweight_unit_name, wu.thname) netweight_unit_name, "
				+ " nvl(soi.duty_name, dt.duty_name) duty_name, nvl(soi.group_name, dg.group_name) group_name";
		String SOI_SQL_FROM = " FROM stockout_item soi LEFT JOIN product pd " + " ON pd.product_code = soi.product_code "
				+ " INNER JOIN stockout so ON so.ID = soi.stockout_id "	
				+ " LEFT JOIN duty_table dt on dt.duty_code=soi.duty_code"
				+ " LEFT JOIN duty_group dg on dg.group_id=soi.group_id "
				+ " LEFT JOIN unit u ON u.unit_code = soi.unit_code "
				+ " LEFT JOIN unit us ON us.unit_code = soi.sizes_unit_code "
				+ " LEFT JOIN unit wu on wu.unit_code = soi.netweight_unit "
				+ " LEFT JOIN size_package sp ON sp.size_code = soi.sizes_code and sp.group_id=soi.group_id "
				+ " LEFT JOIN brand_main bm ON bm.brand_main_code = soi.brand_code and bm.group_id=soi.group_id "
				+ " LEFT JOIN DELIVERY_EXHIBIT de ON de.id=soi.delivery_exhibit_id "
				+ " LEFT JOIN stockout rso on rso.id=soi.ref_stockout_id ";

		String SOI_SQL_WHERE = " WHERE soi.stockout_id = '" + so.getId() + "' ";
		String SOI_SQL_ORDER = " ORDER BY soi.id ";
		List<Object> objList = new ArrayList<Object>();
		String cond_query = SOI_SQL_FROM + SOI_SQL_WHERE;
		List soi_list = new ArrayList();
		log.debug(SOI_SQL_SELECT + cond_query + SOI_SQL_ORDER);
		try {
			log.info("SQL Stock Item:" + SOI_SQL_SELECT + cond_query + SOI_SQL_ORDER);
			soi_list = new StockoutItem(db).findBySql(SOI_SQL_SELECT + cond_query + SOI_SQL_ORDER, objList.toArray(), null);
			if (soi_list.size() > 0) {
				//long summary = 0;
				
				BigDecimal summary = new BigDecimal("0");
				
				String unit_desc = "";
				Map data = null;
				for (int i = 0; i < soi_list.size(); i++) {
					data = (Map) soi_list.get(i);
					
					//summary += ((BigDecimal) data.get("qty")).longValue();
					BigDecimal t = new BigDecimal(data.get("qty").toString());
					//summary.add(BigDecimal(data.get("qty").toString())).doubleValue();
					summary = summary.add(t) ;
					//unit_desc = (String)data.get("sizes_desc");
					unit_desc = (String)data.get("unit_name");
					
				}
				request.setAttribute("qty", summary);
				request.setAttribute("unit_desc", unit_desc);
			}

		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		if (soi_list != null && !soi_list.isEmpty()) {
			request.setAttribute("soi_list_size", soi_list.size());
		}
		request.setAttribute("soi_list", soi_list);
	}

	protected String getIPAddress() {
		return "127.0.0.1";
	}

	protected void tranLogSave(String message) {
		//save tran log
		try {
			this.writeTranLog(message);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	/**
	 * 
	 * @param request
	 * @return ID Is Exist?
	 * @throws Exception
	 */
	protected abstract boolean processUpdate(HttpServletRequest request) throws Exception;
}
