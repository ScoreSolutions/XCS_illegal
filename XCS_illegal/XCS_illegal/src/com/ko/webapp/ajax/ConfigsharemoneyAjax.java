package com.ko.webapp.ajax;

import java.util.List;
import java.util.Map;

import com.ko.domain.Indictment;
import com.ko.domain.ProductType;

public class ConfigsharemoneyAjax extends BaseAjax{
	public List getIndictmentID(Long idindictment_id){
		try{
			Indictment indictment = new Indictment(db);
			return indictment.getIndictmentID(idindictment_id);
			
		}
		catch (Exception e) {
			// TODO: handle exception
			return null;
		}
		finally{
			closeDB();
		}
	}
	public List getProductTtpe(String dutyCode){
		try{
			ProductType product = new ProductType(db);
			List productlist = product.findBySql("select pt.type_code code, pt.type_name name from product_type pt where pt.duty_code = ?", dutyCode);
			return productlist;
		}
		catch (Exception e) {
			// TODO: handle exception
			return null;
		}
		finally{
			closeDB();
		}
	}
}
