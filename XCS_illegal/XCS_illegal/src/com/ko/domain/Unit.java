








 

/**
 * produce by boonchai ( neng )
 * @author <a href="mailto:mr.boonchai@gmail.com">Mr.Boonchai Wedwanitsathein</a>
 */
package com.ko.domain;

//include
import com.ko.domain.base.BaseUnit;
import com.ko.util.DB;
import java.util.List;
import java.util.Map;

public class Unit extends BaseUnit{
	public Unit(DB db){
		super(db);
	}
	// business method go here

	public String GetNewUnitCode() throws Exception{
		String ret="";
		try{
			String sql = "select max(to_number(unit_code))+1 unit_code from unit";
			Unit u = new Unit(db);
			List<Map<String,Object>> uList = u.findBySql(sql);
			if(uList.size()>0){
				ret=uList.get(0).get("unit_code").toString();
			}
		}
		catch(Exception e){
			e.printStackTrace();
			ret="";
		}
		return ret;
	}
}