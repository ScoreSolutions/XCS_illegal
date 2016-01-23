








 

/**
 * produce by boonchai ( neng )
 * @author <a href="mailto:mr.boonchai@gmail.com">Mr.Boonchai Wedwanitsathein</a>
 */
package com.ko.domain;

//include
import com.ko.domain.base.BaseBrandMain;
import com.ko.util.DB;
import java.util.List;
import java.util.Map;

public class BrandMain extends BaseBrandMain{
	public BrandMain(DB db){
		super(db);
	}
	// business method go here
	
	public  String GetNewBrandMainCode() throws Exception{
		String ret = "";
		try{
			String sql = "select max(brand_main_code) brand_main_code from brand_main ";
			sql += " where length(brand_main_code)=3 ";
			sql += " and  PKE_MASTER.chkDigitBrandMain(substr(brand_main_code,1,1))=1 ";
			sql += " and PKE_MASTER.chkDigitBrandMain(substr(brand_main_code,2,1))=1 ";
			sql += " and PKE_MASTER.chkDigitBrandMain(substr(brand_main_code,3,1))=1";
			
			BrandMain bm = new BrandMain(db);
			List<Map<String,Object>> bmList = bm.findBySql(sql);
			if(bmList.size()>0){
				//System.out.println(bmList.get(0).get("brand_main_code").toString());
				int d1 = (int)bmList.get(0).get("brand_main_code").toString().charAt(0);
				int d2 = (int)bmList.get(0).get("brand_main_code").toString().charAt(1);
				int d3 = (int)bmList.get(0).get("brand_main_code").toString().charAt(2);
				
				d3 = d3 + 1;
				//System.out.println(d3);
				if(d3>122){
					d3=48;
					d2=d2+1;
				}else if(d3>90 && d3 < 97){
					d3=97;
				}else if(d3>57 && d3 < 65){
					d3=65;
				}
				//System.out.println(d3);
				
				//System.out.println(d2);
				if (d2>122){
					d2=48;
					d1=d1+1;
				}else if(d2>90 && d2 < 97){
					d2=97;
				}else if(d2>57 && d2 < 65){
					d2=65;
				}
				//System.out.println(d2);
				
				//System.out.println(d1);
				if (d1>122){
					d1=48;
					d2=48;
					d3=48;
				}else if(d1>90 && d1 < 97){
					d1=97;
				}else if(d1>57 && d1 < 65){
					d1=65;
				}
				//System.out.println(d1);
				
				ret=new Character((char)d1).toString() + new Character((char)d2).toString() + new Character((char)d3).toString();  
				//System.out.println(ret);	
			}
		}
		catch(Exception ex){
			ret="";
			ex.printStackTrace();
		}
		return ret;
	}
	
	public static void main(String args[]) throws Exception{
		DB db = new DB();
		BrandMain bm = new BrandMain(db);
		bm.GetNewBrandMainCode();
	}

}