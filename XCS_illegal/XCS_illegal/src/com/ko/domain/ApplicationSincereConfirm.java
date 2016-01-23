








 

/**
 * produce by boonchai ( neng )
 * @author <a href="mailto:mr.boonchai@gmail.com">Mr.Boonchai Wedwanitsathein</a>
 */
package com.ko.domain;

//include
import com.ko.domain.base.BaseApplicationSincereConfirm;
import com.ko.util.DB;

public class ApplicationSincereConfirm extends BaseApplicationSincereConfirm{
	private String[] aii_id;
	private String[] aii_idcard_no ;
	private String[] aii_poscode ;
	private String[] aii_offcode ;
	private String[] aai_id ;
	private String[] aai_indictment_id ;
	public ApplicationSincereConfirm(DB db){
		
		super(db);
		super.SEQUENCE_NAME = "APPLICATION_SINCERE_CONFIRSEQ";
	}
	// business method go here
	public String[] getAii_id() {
		return aii_id;
	}
	public void setAii_id(String[] aiiId) {
		aii_id = aiiId;
	}
	public String[] getAii_idcard_no() {
		return aii_idcard_no;
	}
	public void setAii_idcard_no(String[] aiiIdcardNo) {
		aii_idcard_no = aiiIdcardNo;
	}
	public String[] getAii_poscode() {
		return aii_poscode;
	}
	public void setAii_poscode(String[] aiiPoscode) {
		aii_poscode = aiiPoscode;
	}
	public String[] getAii_offcode() {
		return aii_offcode;
	}
	public void setAii_offcode(String[] aiiOffcode) {
		aii_offcode = aiiOffcode;
	}
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