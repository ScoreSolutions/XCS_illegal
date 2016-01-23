








 

/**
 * produce by boonchai ( neng )
 * @author <a href="mailto:mr.boonchai@gmail.com">Mr.Boonchai Wedwanitsathein</a>
 */
package com.ko.domain;

//include
import com.ko.domain.base.BaseApplicationNoticeArrest;
import com.ko.util.DB;

public class ApplicationNoticeArrest extends BaseApplicationNoticeArrest{
	private String[] aai_id ;
	private String[] aai_indictment_id ;
	public ApplicationNoticeArrest(DB db){
		super(db);
	}
	// business method go here
	public String[] getAai_id() {
		return aai_id;
	}
	public void setAai_id(String[] aaiId) {
		aai_id = aaiId;
	}
	public String[] getAai_indictment_id() {
		return aai_indictment_id;
	}
	public void setAai_indictment_id(String[] aaiIndictmentId) {
		aai_indictment_id = aaiIndictmentId;
	}

}