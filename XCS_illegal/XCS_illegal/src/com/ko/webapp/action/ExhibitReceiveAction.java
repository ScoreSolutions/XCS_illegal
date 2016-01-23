package com.ko.webapp.action;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.json.JSONArray;
import org.springframework.web.bind.ServletRequestUtils;

import com.ko.domain.ApplicationArrest;
import com.ko.domain.ApplicationArrestTeam;
import com.ko.domain.DeliveryExhibit;
import com.ko.domain.EdOffice;
import com.ko.domain.Legislation;
import com.ko.domain.Position;
import com.ko.domain.Stockin;
import com.ko.domain.StockinItem;
import com.ko.domain.StockinTeam;
import com.ko.domain.Stockout;
import com.ko.domain.Unit;
import com.ko.domain.V_STAFF_LIST_POPUP;
import com.ko.util.DateUtil;
import com.ko.util.RunningKey;
import com.ko.webapp.util.ParameterUtil;

/**
 * 
 * @author SoCool
 * Action for ตรวจรับของกลาง
 */
public class ExhibitReceiveAction extends ExhibitBaseAction {
	protected String SQL_SELECT2 = "";
	protected String SQL_FROM2 = "";
	protected String SQL_WHERE2 = "";

	protected String generateExhibitCond(HttpServletRequest request) {
		
		
		String cond = "";

		String location = ServletRequestUtils.getStringParameter(request, "location", "");
		if (!"".equals(location))
			cond += " si.location = '" + location + "' and ";

		String stockin_code = ServletRequestUtils.getStringParameter(request, "stockin_code", "");
		if (!"".equals(stockin_code))
			cond += " si.stockin_code like '%" + stockin_code + "%' and ";

		String status = ServletRequestUtils.getStringParameter(request, "status", "");
		if (!"".equals(status))
			cond += " si.status = '" + status + "' and ";

		if (cond.length() > 4) {
			cond = cond.substring(0, cond.length() - 4);
		}

		log.info("SQL Condition:" + cond);
		return cond;
	}

	protected void fetchDataToRequest(HttpServletRequest request, String condition) {
		//set data for summary list
		Stockin model = new Stockin(this.db);
		List<Object> objList = new ArrayList<Object>();
		List data_list = new ArrayList<Object>();
		try {
			Integer totalRow = 0;
			String query_cond = (condition != null && !"".equals(condition)) ? " and " + condition : "";
			String query = SQL_FROM + SQL_WHERE + query_cond;
			String query2 = SQL_FROM2 + SQL_WHERE2 + query_cond;
			log.info("SQL Summary Count is:" + SQL_COUNT + query + " UNION " + SQL_COUNT + query2);
			log.info("SQL Summary is:" + SQL_SELECT + query + " UNION " + SQL_SELECT2 + query2);
			totalRow = model.countBySql("select sum(qtyrow) from ("+ SQL_COUNT +" qtyrow "+ query + " UNION " + SQL_COUNT + query2+")", objList.toArray());
			pageUtil.setTotalRow(totalRow);
			data_list = model.findBySql(SQL_SELECT + query + " UNION " + SQL_SELECT2 + query2, objList.toArray(), pageUtil);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		//log.debug(data_list);
		request.setAttribute("stockReceiveList", data_list);
	}
	
//	public void create(HttpServletRequest request, HttpServletResponse response) throws Exception {
//		Legislation lt = new Legislation(this.db);
//		List<Legislation> ltlist = lt.findByWhere(" 1=1 order by legislation_name", null);
//		request.setAttribute("ltlist", ltlist);
//		Unit unit = new Unit(this.db);
//		List<Unit> unitlist = unit.findByWhere(" 1=1 order by thname", null);
//		request.setAttribute("unitlist", unitlist);
//		request.setAttribute("unit_json", new JSONArray(unitlist).toString());
//		
//		
//	}

	@Override
	protected void pre(HttpServletRequest request, HttpServletResponse response) throws Exception {
		menuID = "20";
		
		prepare_sql_summary();
		JSP_SEARCH_PAGE = "?page=/ManageExhibit/checkunit_list.jsp";
		JSP_FORM_PAGE = "?page=/ManageExhibit/checkunit_form.jsp";
		go_action = "ExhibitReceive";
		go_cmd = "preup";
		back_action= "process?action=ExhibitReceive&cmd=create";
		
		String legislation_id = ServletRequestUtils.getStringParameter(request, "legislation_id", "");
		if (!"".equals(legislation_id)) {
			SQL_WHERE += " and de.legislation_id = '" + legislation_id + "'";
			SQL_WHERE2 += " and so.legislation_id = '" + legislation_id + "'";
		}

		String delivery_code = ServletRequestUtils.getStringParameter(request, "delivery_code", "");
		if (!"".equals(delivery_code)) {
			SQL_WHERE += " and de.delivery_code like '%" + delivery_code + "%'";
			SQL_WHERE2 += " and so.stockout_code like '%" + delivery_code + "%'";
		}
		
		//String deliver_date_from = DateUtil.formatConditionDate(request.getParameter("deliver_date_from")); // ServletRequestUtils.getStringParameter(request, "deliver_date_from", "");
		//String deliver_date_to = DateUtil.formatConditionDate(request.getParameter("deliver_date_to")); //ServletRequestUtils.getStringParameter(request, "deliver_date_to", "");
		if(request.getParameter("deliver_date_from") != null && !request.getParameter("deliver_date_from").trim().equals("")){
			SQL_WHERE += " and to_char(de.delivery_date,'yyyymmdd') >= '" + request.getParameter("deliver_date_from") + "'";
			SQL_WHERE2 += " and to_char(so.stockout_date,'yyyymmdd') >= '" + request.getParameter("deliver_date_from") + "'";
		}
		
		if(request.getParameter("deliver_date_to") != null && !request.getParameter("deliver_date_to").trim().equals("")){
			SQL_WHERE += " and to_char(de.delivery_date,'yyyymmdd') <= '" + request.getParameter("deliver_date_to") + "'";
			SQL_WHERE2 += " and to_char(so.stockout_date,'yyyymmdd') <= '" + request.getParameter("deliver_date_to") + "'";
		}

		String offcode_from = ServletRequestUtils.getStringParameter(request, "offname_from", "");
		if (!"".equals(offcode_from)){
			SQL_WHERE += " and de.offcode_from = '" + offcode_from + "'";
			SQL_WHERE2 += " and so.offcode = '" + offcode_from + "'";
		}

		Stockin si = new Stockin(db);
		request.setAttribute("si", si);
		
		super.pre(request, response);
	}

	/**
	 * Business Logic for get data from request to model
	 * @param request
	 * @param stock_out
	 */
	protected boolean processUpdate(HttpServletRequest request) throws Exception {
		Long id = ServletRequestUtils.getLongParameter(request, "id", -1);
		String stockin_code = ServletRequestUtils.getStringParameter(request, "stockin_code", "");
		String stockin_date = ServletRequestUtils.getStringParameter(request, "stockin_date", "") + " " + ServletRequestUtils.getStringParameter(request, "stockin_time", "");
		String doc_no = ServletRequestUtils.getStringParameter(request, "doc_no", "");
		String send_date = ServletRequestUtils.getStringParameter(request, "send_date", "");
		String location = ServletRequestUtils.getStringParameter(request, "location", "");
		String destroy_limit_date = ServletRequestUtils.getStringParameter(request, "destroy_limit_date", "");
		String remarks = ServletRequestUtils.getStringParameter(request, "remarks", "");
		String status = ServletRequestUtils.getStringParameter(request, "status", "");
		String poscode_recive = ServletRequestUtils.getStringParameter(request, "poscode_receive", "");
		
		//System.out.println("statussssssssssss   " + status);
		
		Stockin stock_in = new Stockin(this.db);
		boolean id_exist = false;
		if (id != -1) {//if id not equals -1 then process update
			try {
				stock_in = stock_in.findByPk(id);
				id_exist = true;
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
				log.error("Fail on Load Stockin:" + e.getMessage());
			}
		}
		
		if (!"".equals(stockin_date))
			stock_in.setStockin_date(DateUtil.getDateFromString(stockin_date));
		if (!"".equals(location))
			stock_in.setLocation(location);
		if (!"".equals(destroy_limit_date))
			stock_in.setDestroy_limit_date(DateUtil.getDateFromString(destroy_limit_date));
		if (!"".equals(remarks))
			stock_in.setRemarks(remarks);
		//if (isNumeric(ParameterUtil.getStringParam("de_id", request)))
		//	stock_in.setDelivery_exhibit_id(ParameterUtil.getLongParam("de_id", request));
		stock_in.setDelivery_exhibit_id(!request.getParameter("de_id").equals("") ? new Long(request.getParameter("de_id")) : null);
		stock_in.setStockout_id(!request.getParameter("so_id").equals("") ? new Long(request.getParameter("so_id")) : null);
		//set optional field
		if(!"".equals(status))
			stock_in.setStatus(status);

		if (id_exist) {//update exist record
			try {
				stock_in.setUpdate_by(this.update_by);
				stock_in.setUpdate_on(this.update_on);
				stock_in = stock_in.update();
				
				if(stock_in.getStatus().equals("2")){ //ยืนยันการตรวจรับ ให้ไป Set status ของใบนำส่งเป็น ตรวจรับแล้ว
					DeliveryExhibit de = new DeliveryExhibit(db);
					de = de.findByPk(new Long(ParameterUtil.getLongParam("de_id", request)));
					de.setStatus("3");
					de.update();
				}
					
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
				log.error("Fail on Update Stockin:" + e.getMessage());
			}
		} else {//insert new record
			try {
				stock_in.setCreate_by(new Long(this.create_by));
				stock_in.setReceive_by(String.valueOf(this.create_by));
				stockin_code = new RunningKey(db).getRunningKey("STOCKIN", "", "", uData.getOffcode());
				stock_in.setStockin_code(stockin_code);
				stock_in.setPoscode_receive(this.poscode);
				stock_in = stock_in.create();
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
				log.error("Fail on Create Stockin:" + e.getMessage());
			}
		}
		if(stock_in != null){
			StockinTeam caat = new StockinTeam(db);
			
			List<StockinTeam> caatlist = caat.findByWhere("stockin_id = ?", stock_in.getId());

			String[] aat_id = request.getParameterValues("aat_id");
			String[] aat_duty_status_id = request.getParameterValues("aat_duty_status_id");
			String[] aat_inspector_code = request.getParameterValues("aat_inspector_code");
			String[] aat_staff_idcardno = request.getParameterValues("aat_staff_idcardno");
			String[] aat_staff_no = request.getParameterValues("aat_staff_no");
			String[] aat_staff_position = request.getParameterValues("aat_staff_position");
			String[] aat_staff_poscode = request.getParameterValues("aat_staff_poscode");
			String[] aat_staff_offcode = request.getParameterValues("aat_staff_offcode");
			
			if (aat_id == null) {
				for (int j = 0; j < caatlist.size(); j++) {
					caatlist.get(j).delete();
				}
			}

			if (request.getParameter("aat_id") != null) {
				boolean chkdel = true;
				for (int j = 0; j < caatlist.size(); j++) {
					chkdel = true;
					for (int k = 0; k < aat_id.length; k++) {
						if (aat_id[k].equals("") == false) {
							if (Long.parseLong(aat_id[k]) == caatlist.get(j).getId()) {
								chkdel = false;
							}
						}
					}

					if (chkdel == true) {
						caatlist.get(j).delete();
					}
				}
				for (int i = 0; i < aat_id.length; i++) {
					boolean chkup = false;

					StockinTeam aat = new StockinTeam(db);
					if (aat_id[i].equals("") == false) {
						chkup = true;
						aat = aat.findByPk(Long.parseLong(aat_id[i]));
					}

					aat.setStaff_idcardno(aat_staff_idcardno[i]);
					aat.setStaff_offcode(aat_staff_offcode[i]);
					aat.setStaff_poscode(aat_staff_poscode[i]);
					aat.setStockin_id(stock_in.getId());

					//System.out.println(aat);
					if (chkup == false) {

						aat.setCreate_by(create_by);
						aat.setCreate_on(create_on);
						aat.create();
					} else {
						aat.setUpdate_by(update_by);
						aat.setUpdate_on(update_on);
						aat.update();
					}
				}
			}

			//xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxend aatxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx-

			//xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxstart seixxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx
			StockinItem csei = new StockinItem(db);

			List<StockinItem> cseilist = csei.findByWhere("stockin_id = ?", stock_in.getId());

			String[] sei_id = request.getParameterValues("sei_id");
			String[] sei_product_code = request.getParameterValues("sei_product_code");
			String[] sei_brand_code = request.getParameterValues("sei_brand_code");
			String[] sei_sizes_code = request.getParameterValues("sei_sizes_code");
			String[] sei_sizes_unit_code = request.getParameterValues("sei_sizes_unit_code");
			String[] sei_unit_code = request.getParameterValues("sei_unit_code");
			String[] sei_isdomestic = request.getParameterValues("sei_isdomestic");
			String[] sei_netweigth = request.getParameterValues("sei_netweigth");
			String[] sei_send_qty = request.getParameterValues("sei_send_qty");
			String[] sei_qty = request.getParameterValues("sei_left_qty");
			String[] sei_netweight_unit = request.getParameterValues("netweight_unit");
			String[] sei_remarks = request.getParameterValues("sei_remarks");
			String[] sei_duty_code = request.getParameterValues("sei_duty_code");
			String[] sei_group_id = request.getParameterValues("sei_group_id");
			String[] sei_product_name = request.getParameterValues("sei_product_name");
			String[] sei_brand_name = request.getParameterValues("sei_brand_name");
			String[] sei_qty_unit_name = request.getParameterValues("sei_qty_unit_name");
			String[] sei_sizes_desc = request.getParameterValues("sei_sizes_desc");
			String[] sei_sizes_unit_name = request.getParameterValues("sei_sizes_unit_name");
			String[] sei_netweight_unit_name = request.getParameterValues("sei_netweight_unit_name");
			String[] sei_duty_name = request.getParameterValues("sei_duty_name");
			String[] sei_group_name = request.getParameterValues("sei_group_name");

			if (sei_id == null) {
				for (int j = 0; j < cseilist.size(); j++) {
					cseilist.get(j).delete();
				}
			}

			if (request.getParameter("sei_id") != null) {
				boolean chkdel = true;
				//System.out.println("chkdet = true");
				for (int j = 0; j < cseilist.size(); j++) {
					chkdel = true;
					for (int k = 0; k < sei_id.length; k++) {
						if (sei_id[k].equals("") == false) {
							if (Long.parseLong(sei_id[k]) == cseilist.get(j).getId()) {
								chkdel = false;
							}
						}
					}

					if (chkdel == true) {
						cseilist.get(j).delete();
					}
				}
				for (int i = 0; i < sei_id.length; i++) {
					boolean chkup = false;

					StockinItem sei = new StockinItem(db);
					if (sei_id[i].equals("") == false) {
						chkup = true;
						sei = sei.findByPk(Long.parseLong(sei_id[i]));
					}

					/////////////////////////set val/////////////////

					sei.setBrand_code(sei_brand_code[i]);
					sei.setIsdomestic(sei_isdomestic[i]);
					sei.setNetweight((!sei_netweigth[i].equals("") ? new Double(sei_netweigth[i]) : null));
					sei.setProduct_code(sei_product_code[i]);
					sei.setQty((!sei_qty[i].equals("") ? new Double(sei_qty[i]) : null));
					sei.setRemarks(sei_remarks[i]);
					sei.setSizes_code(sei_sizes_code[i]);
					sei.setSizes_unit_code(sei_sizes_unit_code[i]);
					sei.setStockin_id(stock_in.getId());
					sei.setUnit_code(sei_unit_code[i]);
					sei.setNetweight_unit(sei_netweight_unit[i]);
					sei.setDuty_code(sei_duty_code[i]);
					sei.setGroup_id(sei_group_id[i]);
					sei.setProduct_name(sei_product_name[i]);
					sei.setBrand_name(sei_brand_name[i]);
					sei.setQty_unit_name(sei_qty_unit_name[i]);
					sei.setSizes_desc(sei_sizes_desc[i]);
					sei.setSizes_unit_name(sei_sizes_unit_name[i]);
					sei.setNetweight_unit_name(sei_netweight_unit_name[i]);
					sei.setDuty_name(sei_duty_name[i]);
					sei.setGroup_name(sei_group_name[i]);
					sei.setSend_qty(sei_send_qty[i] != null ? new Double(sei_send_qty[i]) : null);

					////////////////////// end set value/////////////////////

					if (chkup == false) {
						sei.setCreate_by(this.create_by);
						sei.setCreate_on(create_on);
						sei.create();
					} else {
						sei.setUpdate_by(update_by);
						sei.setUpdate_on(update_on);
						sei.update();

					}

				}
			}
		}
		if(stock_in != null)
			re_id = (stock_in.getId() == null) ? -1 : stock_in.getId();
		return id_exist;
	}

	private void prepare_sql_summary() throws Exception  {
		SQL_SELECT = " SELECT si.ID stockin_id, si.stockin_code, si.stockin_date, de.delivery_date,"
				+ " TO_CHAR(si.stockin_date,'dd/mm/yyyy','NLS_CALENDAR=''THAI BUDDHA'' NLS_DATE_LANGUAGE=THAI') stockin_date2,"
				+ " TO_CHAR(de.delivery_date,'dd/mm/yyyy','NLS_CALENDAR=''THAI BUDDHA'' NLS_DATE_LANGUAGE=THAI') delivery_date2,"
				+ " de.legislation_id, lg.legislation_name, de.delivery_code, si.LOCATION," + " si.status status_code,DECODE (si.status, '1', 'ทำรายการ', '2', 'ตรวจรับแล้ว') status_name,"
				+ " de.offcode_from, ed.offname offname_from, de.offcode_to,'SEND' stockin_type";
		SQL_FROM = " FROM delivery_exhibit de inner JOIN stockin si ON de.ID = si.delivery_exhibit_id" + " INNER JOIN legislation lg ON lg.ID = de.legislation_id"
				+ " INNER JOIN ed_office ed ON ed.offcode = de.offcode_from";
		SQL_WHERE = " WHERE 1=1 ";
		if(uData.IsAdmin()== false)
			SQL_WHERE += " and de.offcode_to = '" + uData.getOffcode() + "' ";

		SQL_SELECT2 = " SELECT si.ID stockin_id, si.stockin_code, si.stockin_date, so.stockout_date,"
				+ " TO_CHAR(si.stockin_date,'dd/mm/yyyy','NLS_CALENDAR=''THAI BUDDHA'' NLS_DATE_LANGUAGE=THAI') stockin_date2,"
				+ " TO_CHAR(so.stockout_date,'dd/mm/yyyy','NLS_CALENDAR=''THAI BUDDHA'' NLS_DATE_LANGUAGE=THAI') stockout_date2,"
				+ " so.legislation_id, lg.legislation_name, so.stockout_code, si.LOCATION," + " si.status status_code,DECODE (si.status, '1', 'ทำรายการ', '2', 'ตรวจรับแล้ว') status_name,"
				+ " so.offcode offcode_from, ed.offname offname_from, so.offcode_to,'TRANSFER' stockin_type";
		SQL_FROM2 = " FROM stockout so INNER JOIN stockin si ON si.stockout_id = so.ID" + " INNER JOIN legislation lg ON lg.ID = so.legislation_id"
				+ " INNER JOIN ed_office ed ON ed.offcode = so.offcode_to";
		SQL_WHERE2 = " WHERE so.stockout_type = '5'";
		
		if(uData.IsAdmin()== false)
			SQL_WHERE2 += " and so.offcode_to = '" + uData.getOffcode() + "'";
	}

	public void preup(HttpServletRequest request, HttpServletResponse response) throws Exception {
		pre(request, response);
		//DeliveryExhibit de = new DeliveryExhibit(db);
		//Stockout so = new Stockout(db);
		String id = request.getParameter("id");
		String siSql = "";
		siSql += "select si.id, si.stockin_code, to_char(si.stockin_date,'dd/mm/yyyy', 'NLS_CALENDAR=''THAI BUDDHA'' NLS_DATE_LANGUAGE=THAI') stockin_date, ";
		siSql += " to_char(si.stockin_date,'HH24:mi') stockin_time, si.delivery_exhibit_id, si.stockout_id,si.location, ";
		siSql += " to_char(si.destroy_limit_date,'dd/mm/yyyy', 'NLS_CALENDAR=''THAI BUDDHA'' NLS_DATE_LANGUAGE=THAI') destroy_limit_date, ";
		siSql += " nvl(de.delivery_code, so.stockout_code) delivery_code, to_char(nvl(de.delivery_date,so.stockout_date),'dd/mm/yyyy', 'NLS_CALENDAR=''THAI BUDDHA'' NLS_DATE_LANGUAGE=THAI') delivery_date, ";
		siSql += " si.status, decode(si.status,'1','ทำรายการ','2','ยืนยันการตรวจรับ') statusname, ";
		siSql += " nvl(ded.offcode, sed.offcode) offcode, nvl(ded.offname, sed.offname) offname,";
		siSql += " ti.title_name || st.first_name || ' ' || st.last_name staff_name, ps.posname || st.staff_level posname, si.remarks ";
		siSql += " from stockin si ";
		siSql += " left join delivery_exhibit de on de.id=si.delivery_exhibit_id ";
		siSql += " left join stockout so on so.id=si.stockout_id ";
		siSql += " left join ed_office ded on ded.offcode=de.offcode_from ";
		siSql += " left join ed_office sed on sed.offcode=so.offcode ";
		siSql += " inner join staff st on st.idcard_no=si.receive_by ";
		siSql += " left join position ps on ps.poscode=si.poscode_receive ";
		siSql += " left join title ti on ti.title_code=st.title_code ";
		siSql += " where si.id= '" + id + "'";
log.debug(siSql);
		Stockin si = new Stockin(db);
		//si = si.findByPk(ParameterUtil.getLongParam("id", request));
		Map<String,Object> siList = si.findBySql(siSql).get(0);
		request.setAttribute("si", siList);
		
		String incsql;
		incsql = " select sit.id, sit.stockin_id, sit.staff_idcardno, sit.staff_poscode, sit.staff_offcode,"
				+ " ti.title_name || st.first_name || ' ' || st.last_name staff_name, ps.posname || st.staff_level posname" 
				+ " from stockin_team sit"
				+ " inner join staff st on st.idcard_no=sit.staff_idcardno" 
				+ " left join title ti on ti.title_code=st.title_code" 
				+ " left join position ps on ps.poscode=sit.staff_poscode"
				+ " where sit.stockin_id= '" + id + "' "
				+ " order by sit.id";

		ApplicationArrest inc = new ApplicationArrest(db);
		List<Map<String, Object>> inclist = inc.findBySql(incsql);
		request.setAttribute("aatlist", inclist);
		
		String aaesql;
		if(siList.get("delivery_exhibit_id") != null){
			//รับจากการนำส่ง
			aaesql = " select sti.id,sti.stockin_id, sti.product_code, sti.brand_code, nvl(sti.product_name,nvl(dt.duty_name,pd.product_name))  product_name,"
					+ " sti.isdomestic,decode(sti.isdomestic,'I','ในประเทศ','O','ต่างประเทศ','Z','ไม่ระบุ') isdomestic_name, sti.sizes_code, nvl(sti.sizes_desc,sp.size_desc) sizes_desc, sti.sizes_unit_code, "
					+ " sti.send_qty, nvl(sti.send_qty,0)-nvl(sti.qty,0) lose_qty, sti.qty,"
					+ " sti.unit_code, nvl(sti.qty_unit_name,nvl(u.thname,u.enname)) unit_name, sti.netweight, nvl(sti.netweight_unit_name,nvl(wu.thname,wu.enname)) netweight_unit_name, "
					+ " sti.remarks,sti.netweight_unit,sti.duty_code, nvl(sti.brand_name, nvl(bm.brand_main_thai,bm.brand_main_eng)) brand_name, "
					+ " nvl(sti.duty_name,dt.duty_name) duty_name, nvl(sti.group_name, dg.group_name) group_name, dg.group_id, "
					+ " nvl(sti.sizes_unit_name, su.thname) sizes_unit_name"
					+ " from stockin_item sti"
					+ " left join product pd on pd.product_code=sti.product_code " 
					+ " left join brand_main bm on bm.brand_main_code=sti.brand_code and bm.group_id=sti.group_id "
					+ " inner join stockin st on st.id=sti.stockin_id " 
					+ " left join unit u on sti.unit_code=u.unit_code "
					+ " left join unit wu on sti.netweight_unit=wu.unit_code "
					+ " left join unit su on sti.sizes_unit_code=su.unit_code"
					+ " left join size_package sp on sp.size_code=sti.sizes_code and sp.group_id = sti.group_id "
					+ " left join duty_table dt on dt.duty_code=sti.duty_code "
					+ " left join duty_group dg on dg.group_id=sti.group_id "
					+ " where sti.stockin_id= '" + id + "' "
					+ " order by sti.id";
		}else{
		//กรณีรับจากการโอน
			aaesql = " select sti.id,sti.stockin_id, sti.product_code, sti.brand_code,  nvl(sti.product_name,nvl(dt.duty_name,pd.product_name)) product_name, nvl(sti.brand_name,nvl(bm.brand_main_thai, bm.brand_main_eng)) brand_name, ";
			aaesql += " sti.isdomestic,decode(sti.isdomestic,'I','ในประเทศ','O','ต่างประเทศ','Z','ไม่ระบุ') isdomestic_name, sti.sizes_code, nvl(sti.sizes_desc,sp.size_desc) sizes_desc, sti.sizes_unit_code, ";
			aaesql += " sti.send_qty, nvl(sti.send_qty,0)-nvl(sti.qty,0) lose_qty, sti.qty, ";
			aaesql += " sti.unit_code, nvl(sti.qty_unit_name,nvl(u.thname,u.enname)) unit_name, sti.netweight, nvl(sti.netweight_unit_name,nvl(wu.thname,wu.enname)) netweight_unit_name, ";
			aaesql += " sti.remarks,sti.netweight_unit,sti.duty_code, nvl(sti.duty_name, dt.duty_name) duty_name, ";
			aaesql += " nvl(sti.group_name, dg.group_name) group_name, dg.group_id, nvl(sti.sizes_unit_name, su.thname) sizes_unit_name ";
			aaesql += " from stockin_item sti ";
			aaesql += " left join product pd on pd.product_code=sti.product_code "; 
			aaesql += " left join brand_main bm on bm.brand_main_code=sti.brand_code and bm.group_id=sti.group_id ";
			aaesql += " inner join stockin st on st.id=sti.stockin_id "; 
			aaesql += " left join unit u on sti.unit_code=u.unit_code ";
			aaesql += " left join unit wu on sti.netweight_unit=wu.unit_code ";
			aaesql += " left join unit su on sti.sizes_unit_code=su.unit_code ";
			aaesql += " left join size_package sp on sp.size_code=sti.sizes_code and sp.group_id = sti.group_id ";
			aaesql += " left join duty_table dt on sti.duty_code = dt.duty_code ";
			aaesql += " left join duty_group dg on sti.group_id=dg.group_id ";
			aaesql += " where sti.stockin_id= '" + id + "' ";
			aaesql += " order by sti.id ";
		}
log.debug(aaesql);
		ApplicationArrest aae = new ApplicationArrest(db);
		List<Map<String, Object>> aaelist = aae.findBySql(aaesql);
		request.setAttribute("seilist", aaelist);

		request.setAttribute("action","process?action=ExhibitReceive&cmd=preup&id="+ParameterUtil.getLongParam("id", request));
		this.writeTranLog("แสดงรายละเอียดการตรวจรับของกลาง");
		
		forward("?page=/ManageExhibit/checkunit_form.jsp", request, response);
	}

	public boolean isNumeric(String s) {
		try {
			return s.matches("[-+]?\\d*\\.?\\d+");
		} catch (Exception e) {
			return false;
		}

	}
}
