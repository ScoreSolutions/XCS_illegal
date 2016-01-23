








 

/**
 * produce by boonchai ( neng )
 * @author <a href="mailto:mr.boonchai@gmail.com">Mr.Boonchai Wedwanitsathein</a>
 */
package com.ko.domain;

//include
import java.util.List;

import com.ko.domain.base.BaseLegislation;
import com.ko.util.DB;

public class Legislation extends BaseLegislation{
	public Legislation(DB db){
		super(db);
	}
	// business method go here
	public List getLegislationID(Long idlegislation_id)throws Exception{
		String sql="select le.id id "
				+"from legislation le "
				+"where le.legislation_code = ? ";
		List list = findBySql(sql, idlegislation_id);
		return list;
	}

}