








 

/**
 * produce by boonchai ( neng )
 * @author <a href="mailto:mr.boonchai@gmail.com">Mr.Boonchai Wedwanitsathein</a>
 */
package com.ko.domain;

//include
import java.util.ArrayList;
import java.util.List;

import org.jfree.util.Log;

import com.ko.domain.base.BaseSuppressTarget;
import com.ko.util.DB;

public class SuppressTarget extends BaseSuppressTarget{
	public SuppressTarget(DB db){
		super(db);
	}
	// business method go here
	public String getOffname(){
		EdOffice ed = new EdOffice(db);
		try {
			List<EdOffice> listEd = ed.findByWhere(EdOffice.OFFCODECol+"=?", getOffcode());
			if(listEd.size()>0){
				return listEd.get(0).getOffname();
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return "";
	}
	public List<SuppressTargetItem> getSuppress_items(){
		SuppressTargetItem items = new SuppressTargetItem(db);
		try {
			return items.findByWhere(SuppressTargetItem.SUPPRESS_TARGET_IDCol+"=? order by "+SuppressTargetItem.TARGET_TYPECol,getId());
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return new ArrayList<SuppressTargetItem>();
	}
	
}