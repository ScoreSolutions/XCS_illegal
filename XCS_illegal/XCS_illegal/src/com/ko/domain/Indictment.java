








 

/**
 * produce by boonchai ( neng )
 * @author <a href="mailto:mr.boonchai@gmail.com">Mr.Boonchai Wedwanitsathein</a>
 */
package com.ko.domain;

//include
import java.util.List;
import java.util.Map;

import com.ko.domain.base.BaseIndictment;
import com.ko.util.DB;

public class Indictment extends BaseIndictment{
	public Indictment(DB db){
		super(db);
	}
	// business method go here
	public List getIndictmentID(Long idindictment_id)throws Exception{
		String sql="select to_char(inc.indictment_id) id , ";
		sql += " case when inc.case_law_id is not null then 'มาตรา ' || inc.penalty_case_law_id || ' ' else '' end  || inc.guilt_base name ";
		sql += " from indictment inc where inc.law_id = ? order by inc.penalty_case_law_id";
		System.out.println(sql);
		List list = findBySql(sql,idindictment_id);
		return list;
		
	}
}