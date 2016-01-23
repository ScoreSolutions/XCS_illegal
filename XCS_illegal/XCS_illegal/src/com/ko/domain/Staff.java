








 

/**
 * produce by boonchai ( neng )
 * @author <a href="mailto:mr.boonchai@gmail.com">Mr.Boonchai Wedwanitsathein</a>
 */
package com.ko.domain;

//include
import java.util.List;

import org.jfree.util.Log;

import com.ko.domain.base.BaseStaff;
import com.ko.util.DB;
import java.util.Map;

public class Staff extends BaseStaff{
	public Staff(DB db){
		super(db);
	}
	// business method go here
	// business method go here
	public String getFullName() {
		String full_name = "";
		try {
			//String title = new Title(this.db).findByPk(this.getTitle_code()).getTitle_name();
			Title ti = new Title(this.db);
			List<Title> ti_list = ti.findByWhere(Title.TITLE_CODECol + "='"+this.getTitle_code()+"'",null);
			String title =ti_list.get(0).getTitle_name().toString();
			full_name = title + this.getFirst_name() + " " + this.getLast_name();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return full_name;
	}
	public String getReport_to_posname() throws Exception{
		String ret = "";
		Position ps = new Position(this.db);
		List<Position> psList = ps.findByWhere("poscode = '" + this.getPoscode() + "'", null);
		
		if(psList.size() > 0){
			if(psList.get(0).getPosname() != null)
				ret = psList.get(0).getPosname();
			else
				ret = this.getPos_name();
		}else{
			ret = this.getPos_name();
		}
		
		return ret + " " + (this.getStaff_level() != null ? this.getStaff_level() : "");
		
	}
}