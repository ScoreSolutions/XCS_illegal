package com.ko.webapp.ajax;

import java.util.List;
import java.util.Map;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import com.ko.domain.Stockin;
import com.ko.domain.Stockout;
import com.ko.domain.DeliveryExhibitItem;

public class ExhibitAjax extends BaseAjax {
	private final Log logger = LogFactory.getLog(getClass());
	public String chkDupStockout(String code) {
		String return_data = "";
		try {
			Stockout stock_out = new Stockout(db);
			List<Stockout> data_list = stock_out.findByWhere("stockout_code = '" + code + "'",null);
			if (data_list != null && !data_list.isEmpty()) {
				return_data =  "ข้อมูลซ้ำ";
			}			
		} catch (Exception e) {
			logger.error("Found Error On AJAX Message:"+e.getMessage());
			e.printStackTrace();
		} finally {
			closeDB();
		}
		return return_data;
	}
	
	public String chkDupDeliveryExhibit(String de_id ,String id) {
		//System.out.println("## " + de_id + " $$ " + id);
		String return_data = "";
		
		if(!de_id.equals("") && !id.equals("")){
			
			try {
				Stockin stock_in = new Stockin(db);
				List<Stockin> data_list = stock_in.findByWhere("delivery_exhibit_id = '" + ((de_id !=null) ? de_id.trim():"") + "' and id <> "+id ,null);
				if (data_list != null && !data_list.isEmpty()) {
					return_data =  "ข้อมูลซ้ำ";
				}			
			} catch (Exception e) {
				logger.error("Found Error On AJAX Message:"+e.getMessage());
				e.printStackTrace();
			} finally {
				closeDB();
			}		
		}
		return return_data;
	}
	
	public String chkRefOutsideProve(String op_id){
		String ret = "";
		
		try{
			String sql="";
			sql += " select dei.id";
			sql += " from delivery_exhibit_item dei ";
			sql += " where nvl(application_outside_prove_item,'#') in (select api.id from application_outside_prove_item api where api.application_outside_prove_id = '" + op_id + "')";
			DeliveryExhibitItem dei = new DeliveryExhibitItem(db);
			List<Map<String,Object>> deiList = dei.findBySql(sql);
			
			if(deiList != null && deiList.size()>0){
				ret = "ข้อมูลได้ถูกนำไปใช้งาน ไม่สามารถลบได้";
			}
		}catch(Exception e){
			e.printStackTrace();
		}finally{
			closeDB();
		}
		return ret;
	}
}
