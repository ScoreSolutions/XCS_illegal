








 

/**
 * produce by boonchai ( neng )
 * @author <a href="mailto:mr.boonchai@gmail.com">Mr.Boonchai Wedwanitsathein</a>
 */
package com.ko.domain;

//include
import com.ko.domain.base.BaseApplicationArrestExhibit;
import com.ko.util.DB;

import java.util.List;
import java.util.Map;
import java.util.ArrayList;

import org.jfree.util.Log;

public class ApplicationArrestExhibit extends BaseApplicationArrestExhibit{
	public ApplicationArrestExhibit(DB db){
		super(db);
	}
	// business method go here
	
	public List<Map<String, Object>> getDataList(String track_no) throws Exception{
		List<Map<String, Object>> ret = new ArrayList();
		String sql = "";
		sql += " select aae.duty_code, nvl(aae.duty_name,dt.duty_name) duty_name, \n";
		sql += " aae.product_code, nvl(aae.product_name,nvl(p.product_name,dt.duty_name)) product_name, \n";
		sql += " aae.brand_code, nvl(aae.brand_name,nvl(bm.brand_main_thai,bm.brand_main_eng)) brand_name,  \n";
		sql += " nvl(aae.sizes_desc,sp.size_desc) size_desc, nvl(aae.sizes_unit_name,su.thname) size_unit_name, aae.sizes_code, aae.size_unit_code,  \n";
		sql += " aae.qty , nvl(aae.qty_unit_name, u.thname) qty_unit_name, \n";
		sql += " aae.netweight, nvl(aae.netweight_unit_name,wu.thname) netweight_unit_name, \n";
		sql += " aae.isexhibitco, aae.isdomestic,aae.status, decode(aae.status,'1','ยึด','2','คืน') status_name, \n";
		sql += " aae.exhibit_list, aae.exhibit_desc, aae.car_no, aae.application_arrest_exhibit_id";
		sql += " from application_arrest_exhibit aae \n";
		sql += " left join duty_table dt on dt.duty_code=aae.duty_code \n";
		sql += " left join product p on p.product_code=aae.product_code \n";
		sql += " left join brand_main bm on bm.brand_main_code=aae.brand_code and aae.group_id=bm.group_id \n";
		sql += " left join unit u on u.unit_code=aae.qty_unit_code \n";
		sql += " left join unit wu on wu.unit_code=aae.netweight_unit_code \n";
		sql += " left join unit su on su.unit_code=aae.size_unit_code \n";
		sql += " left join size_package sp on sp.size_code=aae.sizes_code and aae.group_id=sp.group_id \n";
		sql += " where aae.track_no='" + track_no + "'";
		System.out.println("ApplicationArrestExhibit.getDataList \n"+ sql);
		
		ApplicationArrestExhibit aae = new ApplicationArrestExhibit(db);
		ret = aae.findBySql(sql);
		
		return ret;
	}
}