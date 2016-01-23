








 

/**
 * produce by boonchai ( neng )
 * @author <a href="mailto:mr.boonchai@gmail.com">Mr.Boonchai Wedwanitsathein</a>
 */
package com.ko.domain;

//include
import com.ko.domain.base.BaseApplicationInvest;
import com.ko.util.DB;
import com.ko.util.DateUtil;

public class ApplicationInvest extends BaseApplicationInvest{
	private String end_time;
	private String invest_no_1;
	private String invest_no_2;
	private String start_time;
	private String[] aii_id;
	private String[] aii_idcard_no ;
	private String[] aii_poscode ;
	private String[] aii_offcode ;
	public ApplicationInvest(DB db){
		super(db);
	}
	public String getEnd_time() {
		
		return end_time;
	}
	public void setEnd_time(String endTime) {		
		end_time = endTime;
	}
	public String getInvest_no_1() {
		return invest_no_1;
	}
	public void setInvest_no_1(String investNo_1) {
		invest_no_1 = investNo_1;
	}
	public String getInvest_no_2() {
		return invest_no_2;
	}
	public void setInvest_no_2(String investNo_2) {
		invest_no_2 = investNo_2;
	}
	public String getStart_time() {
		return start_time;
	}
	public void setStart_time(String startTime) {
		start_time = startTime;
	}
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
	
	// business method go here

}