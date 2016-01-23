








 

/**
 * produce by boonchai ( neng )
 * @author <a href="mailto:mr.boonchai@gmail.com">Mr.Boonchai Wedwanitsathein</a>
 */
package com.ko.domain;

//include
import com.ko.domain.base.BaseApplicationNoticeIndictment;
import com.ko.util.DB;

public class ApplicationNoticeIndictment extends BaseApplicationNoticeIndictment{
	public ApplicationNoticeIndictment(DB db){
		super(db);
		super.SEQUENCE_NAME = "APPLICATION_NOTICE_INDICTSEQ";
	}
	// business method go here

}