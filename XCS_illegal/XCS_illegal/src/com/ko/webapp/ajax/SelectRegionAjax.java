package com.ko.webapp.ajax;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.ko.domain.District;
import com.ko.domain.Province;
import com.ko.domain.Subdistrict;
import com.ko.service.TambolService;
import com.pccth.rdbservice.*;

public class SelectRegionAjax extends BaseAjax{
	public List getProvince(){
		List result = new ArrayList();
		
		//TambolService service = new TambolService();
		//if(service.chkServiceConnection()==true){
		//	System.out.println("WebService Province");
		//	result = service.getProvinceList();
		//}else{
			try{
				System.out.println("NoWebService Province");
				Province province = new Province(db);
				String sql = "select province_code,province_name from province order by province_name";
				result = province.findBySql(sql);
				
			}catch (Exception e) {
				e.printStackTrace();
				// TODO: handle exception
			}finally{
				closeDB();
			}
		//}
		return result;
	}
	public List getDistrict(String province_code){
		List result = new ArrayList();
		
		if(!province_code.equals("") && province_code != null){
			//TambolService service = new TambolService();
			//if(service.chkServiceConnection()==true){
			//	System.out.println("WebService District");
			//	result = service.getDistrictList(province_code);
			//}else{
				System.out.println("NoWebService District");
				try{
					District district = new District(db);
					String sql = "select district_code,district_name from district where province_code=? order by district_name ";
					result = district.findBySql(sql,province_code);
				}catch (Exception e) {
					e.printStackTrace();
					// TODO: handle exception
				}finally{
					closeDB();
				}
			//}
		}
		return result;
	}
	public List getTambol(String district_code){
		List result = new ArrayList();
		
		if(!district_code.equals("") && district_code != null){
			//TambolService service = new TambolService();
			//if(service.chkServiceConnection()==true){
			//	System.out.println("WebService Subdistrict");
			//	result = service.getSubdistrict(district_code);
			//}else{
				System.out.println("NoWebService Subdistrict");
				try{
					Subdistrict subdistrict = new Subdistrict(db);
					String sql = "select subdistrict_code,subdistrict_name from subdistrict where district_code=? order by subdistrict_name ";
					result = subdistrict.findBySql(sql,district_code);
				}catch (Exception e) {
					e.printStackTrace();
					// TODO: handle exception
				}finally{
					closeDB();
				}
			//}
		}
		return result;
	}
}
