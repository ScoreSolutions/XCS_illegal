package com.ko.webapp.ajax;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.StringTokenizer;

import com.ko.service.EdOfficeService;
import com.pccth.rdbservice.*;

import com.ko.domain.EdOffice;


public class EdOfficeTestAjax extends BaseAjax{  
	public List getSector(){
		List result = new ArrayList();
		//EdOfficeService service = new EdOfficeService();
		
		//if(service.chkServiceConnection()==true){
		//	System.out.println("WebService Sector");
		//	result = service.getSectorList();
		//}else{
			try{
				EdOffice sector = new EdOffice(db);
				String sql = "select offcode,offname from ed_office where substr(offcode,3,4)='0000' order by offcode";
				result = sector.findBySql(sql);
			}catch (Exception e) {
				e.printStackTrace();
				// TODO: handle exception
			}finally{
				closeDB();
			}
		//}
		return result;
	}
	public List getArea(String Code){
		List result = new ArrayList();
		log.debug("getArea");
		try{
			EdOffice sector = new EdOffice(db);
			String sql = "select offcode,offname from ed_office where substr(offcode,5,6)= '00' and substr (offcode,1,2)= ? and substr (offcode,3,2)<>'00' order by offcode";
			result = sector.findBySql(sql, Code);
			
		}catch (Exception e) {
			e.printStackTrace();
			// TODO: handle exception
		}finally{
			closeDB();
		}
		return result;
	}
	public List getBranch(String Code2){
		List result = new ArrayList();
		log.debug("getbranch");
		try{
			EdOffice sector = new EdOffice(db);
			String sql = "select offcode,offname from ed_office where substr(offcode,1,4)= ? and substr (offcode,5,2)<>'00' order by offcode";
			result = sector.findBySql(sql, Code2);
		}catch (Exception e) {
			e.printStackTrace();
			// TODO: handle exception
		}finally{
			closeDB();
		}
		return result;
	}
	public String getOfficeTambol(String vOffcode){
		String ret = "";
	
		try{
			EdOffice ed = new EdOffice(db);
			List<EdOffice> edList = ed.findByWhere("offcode = ?", vOffcode);
			if(edList.size()==1)
				ret = (edList.get(0).getTambol_code() != null ? edList.get(0).getTambol_code() : "000000");
		}catch (Exception e) {
			e.printStackTrace();
			// TODO: handle exception
		}finally{
			closeDB();
		}
		return ret;
	}
	
	public String getOffname(String vOffcode, String isShortName){
		//isShortName = Y หมายถึงให้ return ค่ากลับไปเป็นชื่อย่อ ถ้า <>Y ให้ return เป็นชื่อเต็ม
		String ret = "";
		
		try{
			EdOffice ed = new EdOffice(db);
			List<EdOffice> edList = ed.findByWhere("offcode = ?", vOffcode);
			if(edList.size()==1){
				if(isShortName.equals("Y"))
					ret = (edList.get(0).getShort_name() != null ? edList.get(0).getShort_name() : "");
				else
					ret = (edList.get(0).getOffname() != null ? edList.get(0).getOffname() : "");
			}
		}catch (Exception e) {
			e.printStackTrace();
			// TODO: handle exception
		}finally{
			closeDB();
		}
		return ret;
	}
	
	public List<String> getOffnameFromDistictCode(String DistictCode, String isShortName){
		//isShortName = Y หมายถึงให้ return ค่ากลับไปเป็นชื่อย่อ ถ้า <>Y ให้ return เป็นชื่อเต็ม
		List<String> ret = new ArrayList<String>();
		List<Map<String,Object>> result = new ArrayList();
		try{
			EdOffice ed = new EdOffice(db);
			String sql = "select ed.offcode, ed.offname, ed.short_name from district d "  +
						" inner join ed_office ed on ed.offcode=d.offcode " +
						" where d.district_code=?";
			result = ed.findBySql(sql, DistictCode);
			if(result.size() == 1){
				String str ;
				//str =  result.get(0).get("offname").toString();
				if (isShortName.equals("Y")){
					str = result.get(0).get("offcode").toString() + "#" + result.get(0).get("offname").toString();
					}
				else{
					str = result.get(0).get("offcode").toString() + "#" + result.get(0).get("short_name").toString();					
				}
				
				StringTokenizer st = new StringTokenizer(str, "#");
				while( st.hasMoreElements() ){
					ret.add((String)st.nextElement());
				}
			}
			//log.debug("ret : " + ret);
		}catch (Exception e) {
			e.printStackTrace();
			// TODO: handle exception
		}finally{
			closeDB();
		}
		return ret;
	}
	
}  
