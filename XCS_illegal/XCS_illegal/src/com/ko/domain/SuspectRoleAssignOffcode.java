








 

/**
 * produce by boonchai ( neng )
 * @author <a href="mailto:mr.boonchai@gmail.com">Mr.Boonchai Wedwanitsathein</a>
 */
package com.ko.domain;

//include
import com.ko.domain.base.BaseSuspectRoleAssignOffcode;
import com.ko.util.DB;

public class SuspectRoleAssignOffcode extends BaseSuspectRoleAssignOffcode{
	public SuspectRoleAssignOffcode(DB db){
		super(db);
		super.SEQUENCE_NAME = "SUSPECT_ROLE_ASSIGN_OFFCODESEQ";
	}
	// business method go here

}