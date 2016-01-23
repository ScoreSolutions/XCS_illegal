








 

/**
 * produce by boonchai ( neng )
 * @author <a href="mailto:mr.boonchai@gmail.com">Mr.Boonchai Wedwanitsathein</a>
 */
package com.ko.domain;

//include
import com.ko.domain.base.BaseDutyTable;
import com.ko.util.DB;
import java.util.List;
import java.util.Map;

import org.jfree.util.Log;

public class DutyTable extends BaseDutyTable{
	public DutyTable(DB db){
		super(db);
	}
	// business method go here
	
	public  String GetNewDutyCode() throws Exception{
		String ret="";
		try{
			
			String sql = "select max(to_number(duty_code))+1 duty_code ";
				sql += " from duty_table ";
				sql += " where duty_code not in('w','y00000' ,'GU','9FD825')";
				sql += " and instr(duty_code,'NEW')=0";


				//System.out.println(sql);
				
			DutyTable dt = new DutyTable(db);
			List<Map<String,Object>> dtList = dt.findBySql(sql);
			if(dtList.size()>0){
				ret=dtList.get(0).get("duty_code").toString();
			}
		}
		catch(Exception e){
			System.out.println("GetNewDutyCode Exception " + e.getMessage().toString());
			e.printStackTrace();
			ret="";
		}
		return ret;
	}
	
}