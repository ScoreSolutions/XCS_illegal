








 

/**
 * produce by boonchai ( neng )
 * @author <a href="mailto:mr.boonchai@gmail.com">Mr.Boonchai Wedwanitsathein</a>
 */
package com.ko.domain;

//include
import com.ko.domain.base.BaseApplicationSearchWarrant;
import com.ko.util.DB;

public class ApplicationSearchWarrant extends BaseApplicationSearchWarrant{
	private String[] aswt_id;
	private String[] aswt_idcard_no ;
	private String[] aswt_poscode ;
	private String[] aswt_offcode ;
	public ApplicationSearchWarrant(DB db){
		super(db);
	}
	// business method go here
	public String[] getAswt_id() {
		return aswt_id;
	}
	public void setAswt_id(String[] aswtId) {
		aswt_id = aswtId;
	}
	public String[] getAswt_idcard_no() {
		return aswt_idcard_no;
	}
	public void setAswt_idcard_no(String[] aswtIdcardNo) {
		aswt_idcard_no = aswtIdcardNo;
	}
	public String[] getAswt_poscode() {
		return aswt_poscode;
	}
	public void setAswt_poscode(String[] aswtPoscode) {
		aswt_poscode = aswtPoscode;
	}
	public String[] getAswt_offcode() {
		return aswt_offcode;
	}
	public void setAswt_offcode(String[] aswtOffcode) {
		aswt_offcode = aswtOffcode;
	}

}