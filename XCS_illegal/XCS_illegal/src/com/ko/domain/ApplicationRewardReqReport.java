








 

/**
 * produce by boonchai ( neng )
 * @author <a href="mailto:mr.boonchai@gmail.com">Mr.Boonchai Wedwanitsathein</a>
 */
package com.ko.domain;

//include
import com.ko.domain.base.BaseApplicationRewardReqReport;
import com.ko.util.DB;

public class ApplicationRewardReqReport extends BaseApplicationRewardReqReport{
	public ApplicationRewardReqReport(DB db){
		super(db);
		super.SEQUENCE_NAME="APPLICATION_REWARD_REPORT_SEQ";
	}
	// business method go here

}