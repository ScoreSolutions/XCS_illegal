package com.ko.util;
import com.ko.domain.*;

import java.sql.PreparedStatement;
import java.util.List;
import java.util.Map;
import com.ko.util.NumberUtil;

import org.jfree.util.Log;

public class ReportsUtil {
	public static String getSumP038Qty(String track_no) throws Exception {
		String ret = "";
		DB db = new DB();
		AppArrestProveExhibit aae = new AppArrestProveExhibit(db);
		
		String sql = "";
		sql += "select sum(aap.qty) qty, nvl(aap.qty_unit_name,u.thname) unit_name, count(aap.id) count_qty";
		sql += " from app_arrest_prove_exhibit aap ";
		sql += " left join unit u on u.unit_code = aap.qty_unit_code";
		sql += " where aap.track_no = '" + track_no + "' ";
		sql += " group by nvl(aap.qty_unit_name,u.thname) ";
		sql += " order by nvl(aap.qty_unit_name,u.thname) ";
		
		//Test track_no = TN4900000042400
		List<Map<String,Object>> list = aae.findBySql(sql);

		if(list.size()>1){
			int qty = 0;
			for(int i=0;i<list.size();i++){
				qty += (list.get(i).get("count_qty") != null ? new Integer(list.get(i).get("count_qty").toString()) : null);
			}
			ret = Integer.toString(qty) + " รายการ";
		}else{
			for (int i=0;i<list.size();i++){
				String qty = NumberUtil.getNumberFormat(new Double(list.get(i).get("qty").toString()), 0, "0");
				if(!ret.equals("")){
					ret += "\n" + qty + " " + list.get(i).get("unit_name").toString();
				}else{
					ret = qty + " " + list.get(i).get("unit_name").toString();
				}
			}
		}
		return ret;
	}
	
	public static String getSumP038Alcohol(String track_no) throws Exception{
		String ret = "";
		DB db = new DB();
		AppArrestProveExhibit aae = new AppArrestProveExhibit(db);
		
		String sql = "";
		sql += "select sum(aap.netweight) netweight, nvl(aap.netweight_unit_name,u.thname) unit_name, aa.legislation_id";
		sql += " from app_arrest_prove_exhibit aap ";
		sql += " left join unit u on u.unit_code = aap.netweight_unit_code";
		sql += " inner join application_arrest aa on aa.track_no=aap.track_no";
		sql += " where aap.track_no = '" + track_no + "' ";
		sql += " group by nvl(aap.netweight_unit_name,u.thname), aa.legislation_id ";
		sql += " order by nvl(aap.netweight_unit_name,u.thname) ";
		
		//Test track_no = TN4900000042400
		List<Map<String,Object>> list = aae.findBySql(sql);
		String legislation_alcohol = ConfigUtil.getConfig("legislation_alcohol");
		
		if(list != null && list.size()>0 && list.get(0).get("legislation_id").toString().equals(legislation_alcohol)){
			
			for (int i=0;i<list.size();i++){
				String qty = NumberUtil.getNumberFormat(new Double(list.get(i).get("netweight").toString()), 3, "0");
				if(!ret.equals("")){
					//ret += "\n" + list.get(i).get("netweight").toString() + " " + list.get(i).get("unit_name").toString();
					ret += "\n" + qty + " " + list.get(i).get("unit_name").toString();
				}else{
					//ret = list.get(i).get("netweight").toString() + " " + list.get(i).get("unit_name").toString();
					ret = qty + " " + list.get(i).get("unit_name").toString();
				}
			}
		}else
			ret = "";
		
		return ret;
	}
	
	public static String getSumP038Tobacco(String track_no) throws Exception{
		String ret = "";
		DB db = new DB();
		AppArrestProveExhibit aae = new AppArrestProveExhibit(db);
		
		String sql = "";
		sql += "select sum(aap.netweight) netweight, nvl(aap.netweight_unit_name,u.thname) unit_name, aa.legislation_id";
		sql += " from app_arrest_prove_exhibit aap ";
		sql += " left join unit u on u.unit_code = aap.netweight_unit_code";
		sql += " inner join application_arrest aa on aa.track_no=aap.track_no";
		sql += " where aap.track_no = '" + track_no + "' ";
		sql += " group by nvl(aap.netweight_unit_name,u.thname), aa.legislation_id ";
		sql += " order by nvl(aap.netweight_unit_name,u.thname) ";
		
		//Test track_no = TN4900000042400
		List<Map<String,Object>> list = aae.findBySql(sql);
		String legislation_tobacco = ConfigUtil.getConfig("legislation_tobacco");
		
		if(list != null && list.get(0).get("legislation_id").toString().equals(legislation_tobacco)){
			
			for (int i=0;i<list.size();i++){
				String qty = NumberUtil.getNumberFormat(new Double(list.get(i).get("netweight").toString()), 0, "0");
				if(!ret.equals("")){
					//ret += "\n" + list.get(i).get("netweight").toString() + " " + list.get(i).get("unit_name").toString();
					ret += "\n" + qty + " " + list.get(i).get("unit_name").toString();
				}else{
					//ret = list.get(i).get("netweight").toString() + " " + list.get(i).get("unit_name").toString();
					ret = qty + " " + list.get(i).get("unit_name").toString();
				}
			}
		}else
			ret = "";
		
		return ret;
	}
	
	public static String getSumExhibitQty(String track_no) throws Exception{
		String ret = "";
		DB db = new DB();
		try{
			AppArrestProveExhibit aae = new AppArrestProveExhibit(db);
			
			String sql = "";
			sql += "select sum(aae.qty) qty, nvl(aae.qty_unit_name,u.thname) unit_name, count(aae.id) count_qty";
			sql += " from application_arrest_exhibit aae ";
			sql += " left join unit u on u.unit_code = aae.qty_unit_code";
			sql += " where aae.track_no = '" + track_no + "' ";
			sql += " group by nvl(aae.qty_unit_name,u.thname) ";
			sql += " order by nvl(aae.qty_unit_name,u.thname) ";
			
			//System.out.println(sql);
			//Test track_no = TN4900000042400
			List<Map<String,Object>> list = aae.findBySql(sql);

			if(list.size()>1){
				int qty = 0;
				for(int i=0;i<list.size();i++){
					qty += (list.get(i).get("count_qty") != null ? new Integer(list.get(i).get("count_qty").toString()) : null);
				}
				ret = Integer.toString(qty) + " รายการ";
			}else{
				for (int i=0;i<list.size();i++){
					String qty = NumberUtil.getNumberFormat(new Double(list.get(i).get("qty").toString()), 0, "");
					if(!ret.equals("")){
						ret += "\n" + qty + " " + (list.get(i).get("unit_name") != null ? list.get(i).get("unit_name").toString() : "");
					}else{
						ret = qty + " " + (list.get(i).get("unit_name") != null ? list.get(i).get("unit_name").toString() : "");
					}
				}
			}
		}catch(Exception e){
			e.printStackTrace();
		}finally{
			db.closedb();
		}
		
		return ret;
	}
	
	public static String getP038Indictment(String track_no) throws Exception{
		String ret = "";
		DB db = new DB();
		ApplicationArrestIndictment aai = new ApplicationArrestIndictment(db);
		String sql = "";
		sql += " select idc.guilt_base, pke_arrest.getLawbreakerQty(aai.track_no) lawbreaker_qty";
		sql += " from application_arrest_indictment aai";
		sql += " inner join indictment idc on idc.indictment_id=aai.indictment_id";
		sql += " where aai.track_no='" + track_no + "'";
		sql += " order by aai.id";
		
		List<Map<String,Object>> aList = aai.findBySql(sql);
		if(aList.size()>0){
			if(aList.size()==1){
				ret = aList.get(0).get("guilt_base").toString();
			}else{
				for(int i = 0;i<aList.size();i++){
					int lawbreakerQty = Integer.parseInt(aList.get(0).get("lawbreaker_qty").toString());
					String tmp="";
					if(lawbreakerQty > 1){
						tmp = "ร่วมกัน";
					} 
					if(ret.equals("")){
						
						ret = (i+1) + ". " + tmp + aList.get(i).get("guilt_base").toString();
					}else{
						ret += "\n" + (i+1) + ". " + tmp + aList.get(i).get("guilt_base").toString();
					}
				}
			}
		}else{
			ret = "";
		}
		
		db.closedb();
		
		return ret;
	}
	
	public static String getP2010(String trackno, String colNo) throws Exception{
		String ret = "";
		DB db = new DB();
		try{
			String str = "";
			str += " select aae.track_no, nvl(aae.product_name, nvl(p.product_name,dt.duty_name)) product_name, ";			
			str += "  nvl(aae.brand_name, nvl(b.brand_main_thai,b.brand_main_eng)) brand_name," + "\n";
			str += " aae.qty || ' ' || nvl(aae.qty_unit_name, u.thname) qty_desc, aae.qty, aae.remarks, nvl(aae.qty_unit_name,u.thname) qty_unit_name, ";
			str += " nvl(aae.sizes_desc,sp.size_desc) || ' ' || nvl(aae.sizes_unit_name, us.thname) sizes_desc,";
			str += " trim(to_char(aae.netweight,'999G999G999G999D000')) || ' ' || nvl(aae.netweight_unit_name,uw.thname) netweight_desc";
			str += " from application_arrest_exhibit aae";
			str += " left join product p on p.product_code=aae.product_code";
			str += " left join brand_main b on b.brand_main_code=aae.brand_code and aae.group_id = b.group_id";
			str += " left join unit u on u.unit_code=aae.qty_unit_code ";
			str += " left join duty_table dt on dt.duty_code=aae.duty_code ";
			str += " left join size_package sp on sp.size_code=aae.sizes_code and sp.group_id=aae.group_id ";
			str += " left join unit us on us.unit_code=aae.size_unit_code";
			str += " left join unit uw on uw.unit_code=aae.netweight_unit_code";
			str += " where aae.track_no = '" + trackno + "'";
			str += " order by aae.id";

			ApplicationArrestExhibit aae = new ApplicationArrestExhibit(db);
			List<Map<String,Object>> aList = aae.findBySql(str);
			
			if(aList != null && aList.size()>0){
				String seq = "";
				String productName = "";
				String qty_desc = "";
				String remarks = "";
				for(int i=0;i<aList.size();i++){
					Map<String,Object> data = aList.get(i);
					if(i == 0){
						seq = "1";
						productName = (data.get("product_name") != null ? data.get("product_name").toString() : "");
						productName += (data.get("brand_name") != null ? " ยี่ห้อ " + data.get("brand_name").toString() : "");
						productName += (data.get("sizes_desc") != null ? " ขนาดบรรจุ " + data.get("sizes_desc").toString() : "");
						qty_desc = (data.get("qty") != null ? NumberUtil.getNumberFormat(new Double(data.get("qty").toString()),0,"") : "");
						qty_desc += (data.get("qty_unit_name") != null ? " " + data.get("qty_unit_name").toString() : "");
						remarks = (data.get("netweight_desc") != null ? data.get("netweight_desc").toString() : "");
					}else{
						seq += "\n" + (i+1);
						productName += "\n" +  (data.get("product_name") != null ? data.get("product_name").toString() : "");
						productName += (data.get("brand_name") != null ? " ยี่ห้อ " + data.get("brand_name").toString() : "");
						productName += (data.get("sizes_desc") != null ? " ขนาดบรรจุ " + data.get("sizes_desc").toString() : "");
						qty_desc += "\n" +  (data.get("qty") != null ? NumberUtil.getNumberFormat(new Double(data.get("qty").toString()),0,"") : "");
						qty_desc += (data.get("qty_unit_name") != null ? " " + data.get("qty_unit_name").toString() : "");
						remarks += "\n" + (data.get("netweight_desc") != null ? data.get("netweight_desc").toString() : "");
					}
				}
				
				if(colNo.equals("1")){
					ret = seq;
				}else if(colNo.equals("2")){
					ret = productName;
				}else if(colNo.equals("3")){
					ret = qty_desc;
				}else if(colNo.equals("4")){
					ret = remarks;
				}
			}
			
		}catch(Exception e){
			e.printStackTrace();
		}finally{
			db.closedb();
		}
		
		return ret;
	}
	
	public static String getP2013(String track_no) throws Exception{
		String ret = "";
		DB db = new DB();
		try{
			String sql = "";
			sql += " select pke_arrest.getExhibitDesc(aae.id) exhibit_desc ";
			sql += " from application_arrest_exhibit aae ";
			sql += " where aae.track_no='" + track_no + "' ";
			ApplicationArrestExhibit aae = new ApplicationArrestExhibit(db);
			List<Map<String,Object>> cList = aae.findBySql(sql);
			
			if(cList != null && cList.size()>0){
				for(int i = 0;i < cList.size();i++){
					if(ret.equals(""))
						ret = "1. " + cList.get(i).get("exhibit_desc").toString();
					else
						ret += "\n" + (i+1) + ". " + cList.get(i).get("exhibit_desc").toString();
				}
			}
		}catch(Exception e){
			e.printStackTrace();
		}finally{
			db.closedb();
		}
		return ret;
	}
	
	public static String getAccuserTestimony(String track_no) throws Exception{
		String ret = "";
		DB db = new DB();
		try{
			CompareCase cc = new CompareCase(db);
			cc = cc.findByWhere("track_no = '" + track_no + "'", null).get(0);
			
			if(cc != null){
				ret = cc.getAccuser_testimony();
			}
		}catch(Exception e){
			e.printStackTrace();
		}finally{
			db.closedb();
		}
		return ret;
	}
	
	public static String getSumP041(String id, String rtType) throws Exception{
		String ret = "";
		String ret_qty = "";
		String ret_prove = "";
		String ret_remain = "";
		DB db = new DB();
		try{
			DeliveryExhibitItem dei = new DeliveryExhibitItem(db);
			
			String sql = "";
			sql += "select sum(dei.qty) qty, sum(dei.prove_qty) prove_qty, count(dei.id) count_qty, nvl(dei.qty_unit_name,u.thname) unit_name";
			sql += " from delivery_exhibit_item dei ";
			sql += " left join unit u on u.unit_code = dei.unit_code";
			sql += " where dei.delivery_exhibit_id = '" + id + "' ";
			sql += " group by nvl(dei.qty_unit_name,u.thname) ";
			List<Map<String,Object>> list = dei.findBySql(sql);
			if(list.size()>1){
				int qty = 0;
				for(int i=0;i<list.size();i++){
					qty += (list.get(i).get("count_qty") != null ? new Integer(list.get(i).get("count_qty").toString()) : null);
				}
				ret = Integer.toString(qty) + " รายการ";
				
			}else{
				for (int i=0;i<list.size();i++){
					String qty = NumberUtil.getNumberFormat(new Double(list.get(i).get("qty").toString()), 0, "0");
					String prove_qty = NumberUtil.getNumberFormat(new Double(list.get(i).get("prove_qty").toString()), 0, "0");
					double remain = new Double(list.get(i).get("qty").toString()) - new Double(list.get(i).get("prove_qty").toString());
					String remain_qty = NumberUtil.getNumberFormat(remain, 0, "0");
					if(!ret_qty.equals("")){
						ret_qty += "\n" + qty + " " + list.get(i).get("unit_name").toString();
					}else{
						ret_qty = qty + " " + list.get(i).get("unit_name").toString();
					}
					
					if(!ret_prove.equals("")){
						ret_prove += "\n" + prove_qty + " " + list.get(i).get("unit_name").toString();
					}else{
						ret_prove += prove_qty + " " + list.get(i).get("unit_name").toString();
					}
					
					if(!ret_remain.equals("")){
						ret_remain += "\n" + remain_qty + " " + list.get(i).get("unit_name").toString();
					}else{
						ret_remain += remain_qty + " " + list.get(i).get("unit_name").toString();
					}
				}
				if(rtType.equals("QTY"))
					ret = ret_qty;
				else if(rtType.equals("PROVE_QTY"))
					ret = ret_prove;
				else
					ret = ret_remain;
			}
		}catch(Exception e){
			e.printStackTrace();
		}finally{
			db.closedb();
		}
		
		return ret;
	}
	
	public static String getCountP041(String id) throws Exception{
		String ret = "";
		DB db = new DB();
		try{
			DeliveryExhibitItem dei = new DeliveryExhibitItem(db);
			
			String sql = "";
			sql += " select count(distinct api.track_no) count_qty";
			sql += " from delivery_exhibit_item dei ";
			sql += " inner join app_arrest_prove_exhibit api on api.id=dei.app_arrest_prove_exhibit_id";
			sql += " where dei.delivery_exhibit_id = '" + id + "' ";

			List<Map<String,Object>> list = dei.findBySql(sql);
			if(list != null){
				ret = list.get(0).get("count_qty") + " ราย";
			}
		}catch(Exception e){
			e.printStackTrace();
		}finally{
			db.closedb();
		}
		
		return ret;
	}
	
	public static String getSumP043(String stockin_code,String rtType) throws Exception{
		String ret = "";
		String ret_send = ""; //จำนวนส่ง
		String ret_lost = ""; //จำนวนชำรุด
		String ret_qty = "";  //จำนวนรับ
		
		DB db = new DB();
		try{
			StockinItem sii = new StockinItem(db);
			
			String sql = "";
			sql += "select sum(sii.qty) qty, sum(sii.send_qty) send_qty, sum(sii.send_qty)-sum(sii.qty) lost_qty, ";
			sql += " count(sii.id) count_qty, nvl(sii.qty_unit_name,u.thname) unit_name";
			sql += " from stockin_item sii ";
			sql += " inner join stockin si on si.id=sii.stockin_id ";
			sql += " left join unit u on u.unit_code = sii.unit_code ";
			sql += " where si.stockin_code = '" + stockin_code + "' ";
			sql += " group by nvl(sii.qty_unit_name,u.thname) ";
			System.out.println(sql);
			List<Map<String,Object>> list = sii.findBySql(sql);
			if(list.size()>1){
				int qty = 0;
				for(int i=0;i<list.size();i++){
					qty += (list.get(i).get("count_qty") != null ? new Integer(list.get(i).get("count_qty").toString()) : null);
				}
				ret_send = Integer.toString(qty) + " รายการ";
				
			}else{
				for (int i=0;i<list.size();i++){
					String send_qty =  NumberUtil.getNumberFormat(new Double(list.get(i).get("send_qty").toString()), 0, "0");
					String lost_qty = NumberUtil.getNumberFormat(new Double(list.get(i).get("lost_qty").toString()), 0, "0");
					String qty = NumberUtil.getNumberFormat(new Double(list.get(i).get("qty").toString()), 0, "0");
					
					if(new Integer(qty) > 0){
						if(!ret_qty.equals("")){
							ret_qty += "\n" + qty + " " + list.get(i).get("unit_name").toString();
						}else{
							ret_qty = qty + " " + list.get(i).get("unit_name").toString();
						}
					}
					
					if(new Integer(lost_qty) > 0){
						if(!ret_lost.equals("")){
							ret_lost += "\n" + lost_qty + " " + list.get(i).get("unit_name").toString();
						}else{
							ret_lost += lost_qty + " " + list.get(i).get("unit_name").toString();
						}
					}
					
					if(new Integer(send_qty) > 0){
						if(!ret_send.equals("")){
							ret_send += "\n" + send_qty + " " + list.get(i).get("unit_name").toString();
						}else{
							ret_send += send_qty + " " + list.get(i).get("unit_name").toString();
						}
					}
				}
			}
			
			if(rtType.equals("QTY"))
				ret = ret_qty;
			else if(rtType.equals("LOST"))
				ret = ret_lost;
			else if(rtType.equals("SEND"))
				ret = ret_send;
		}catch(Exception e){
			e.printStackTrace();
		}finally{
			db.closedb();
		}
		
		return ret;
	}
	
	private static double getSumILLR8210D(String vLigislationID, String dateFrom,String dateTo, String vOffcode1, String vOffcode2, String vOffcode3) throws Exception{
		double ret = 0d;
		DB db = new DB();
		try{
			ApplicationArrest aa = new ApplicationArrest(db);
			String sql = "";
			sql += " select sum(nvl(cc.case_total_fine,0)) case_total_fine \n";
			sql += " from application_arrest aa \n";
			sql += " inner join compare_case cc on cc.track_no=aa.track_no \n";
			sql += " where substr(aa.offcode,1,2)||'0000'=nvl('" + vOffcode1 + "',substr(aa.offcode,1,2)||'0000') \n";
			sql += " and substr(aa.offcode,1,4)||'00'=nvl('" + vOffcode2 + "',substr(aa.offcode,1,4)||'00') \n";
			sql += " and aa.offcode=nvl('" + vOffcode3 + "',aa.offcode) \n";
			sql += " and to_char(cc.pay_date,'yyyy-mm-dd') between '" + dateFrom + "' and '" + dateTo + "' \n";
			sql += " and aa.legislation_id='" + vLigislationID + "' \n";
			
			//System.out.println(sql);
			List<Map<String,Object>> list = aa.findBySql(sql);
			if(list != null){
				ret = new Double(list.get(0).get("case_total_fine").toString());
			}
		}catch(Exception e){
			//e.printStackTrace();
		}finally{
			db.closedb();
		}
		return ret;
	}
	
	public static String getSumILLR8210(String vLigislationID, String dateFrom,String dateTo, String vOffcode1, String vOffcode2, String vOffcode3) throws Exception{
		String ret = NumberUtil.getNumberFormat(getSumILLR8210D(vLigislationID, dateFrom, dateTo, vOffcode1, vOffcode2, vOffcode3),2,"");
		if (ret.equals(""))
			ret = "-";
		
		return ret; 
	}
	public static String getSumILLR8210All(String dateFrom,String dateTo, String vOffcode1, String vOffcode2, String vOffcode3) throws Exception{
		double ret = 0d;
		ret = getSumILLR8210D(ConfigUtil.getConfig("legislation_alcohol"), dateFrom, dateTo, vOffcode1, vOffcode2, vOffcode3) +
		      getSumILLR8210D(ConfigUtil.getConfig("legislation_tobacco"), dateFrom, dateTo, vOffcode1, vOffcode2, vOffcode3) +
		      getSumILLR8210D(ConfigUtil.getConfig("legislation_card"), dateFrom, dateTo, vOffcode1, vOffcode2, vOffcode3) +
		      getSumILLR8210D(ConfigUtil.getConfig("legislation_tax"), dateFrom, dateTo, vOffcode1, vOffcode2, vOffcode3);
		return NumberUtil.getNumberFormat(ret,2,"");
	}
	
	public static void UpdateCubeReport2_55(String vTrackNo, String UserID) throws Exception{
		DB db = new DB();
		try{
			PreparedStatement pre = null;
			String sql=" call sp_load_cube_report_2_55('" + vTrackNo + "','" + UserID + "')";
			//System.out.println("UpdateCubeReport2_55 :" + sql);
			pre = db.getParameterizedStatement(sql, null);
			pre.execute();
		}
		catch(Exception ex){
			System.out.println("UpdateCubeReport2_55 :" + ex.getMessage() + "\r\n" + ex.getStackTrace().toString());
		}
		finally{
			db.closedb();
		}
		
	}
	
	public static void main(String args[]) throws Exception{
		//System.out.println(getSumP043("ST0005005400005","SEND"));
		//char newLine13 = 13;
		//char newLine10 = 10;
		//System.out.println(getAccuserTestimony("TN0005005400009").replaceAll(Character.toString(newLine), "AAAAAAAAAAA"));
		//System.out.println(getSumP041("1181","QTY"));
		//System.out.println(getSumP041("1181","PROVE_QTY"));
		//System.out.println(getSumP041("1181","REMAIN_QTY"));
		//System.out.println(getSumP038Qty("TN0005005400012"));
		//System.out.println(getSumP038Alcohol("TN0005005400023"));
		//System.out.println(getSumP038Tobacco("TN5400000218067"));
		//System.out.println(getP038Indictment("TN1001005400001"));
		//System.out.println(getP2013("TN0005005400011"));
		System.out.println(getP2010("TN0005005400028","4"));
		//System.out.println(getSumExhibitQty("TN0005005400011"));
		//System.out.println(Thaicut.wordwrap(getAccuserTestimony("TN0005005400028") ,110));
		//System.out.println(getSumILLR8210("3","2009-03-01","2009-03-31","100000","",""));
		//System.out.println(getSumILLR8210All("2009-03-01","2009-03-31","","",""));
		
		
	}
}
