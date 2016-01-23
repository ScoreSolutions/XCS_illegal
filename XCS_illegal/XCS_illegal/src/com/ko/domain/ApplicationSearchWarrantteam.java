








 

/**
 * produce by boonchai ( neng )
 * @author <a href="mailto:mr.boonchai@gmail.com">Mr.Boonchai Wedwanitsathein</a>
 */
package com.ko.domain;

//include
import com.ko.domain.base.BaseApplicationSearchWarrantteam;
import com.ko.util.DB;

public class ApplicationSearchWarrantteam extends BaseApplicationSearchWarrantteam{
	public ApplicationSearchWarrantteam(DB db){
		super(db);
		super.SEQUENCE_NAME = "APPLICATION_SEARCH_TEAM_SEQ";
	}
	// business method go here

}