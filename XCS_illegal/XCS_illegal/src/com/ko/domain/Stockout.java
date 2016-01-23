/**
 * produce by boonchai ( neng )
 * @author <a href="mailto:mr.boonchai@gmail.com">Mr.Boonchai Wedwanitsathein</a>
 */
package com.ko.domain;

//include
import java.util.List;

import org.jfree.util.Log;

import com.ko.domain.base.BaseStockout;
import com.ko.util.DB;
import com.ko.util.RunningKey;

public class Stockout extends BaseStockout {
	private String offName="";
	public Stockout(DB db) {
		super(db);
	}

	// business method go here
	public String getStockoutCode1() {
		if (this.getStockout_code() != null) {
			return this.getStockout_code().split("/")[0];
		} else {
			return "";
		}
	}

	public String getStockoutCode2() {
		if (this.getStockout_code() != null) {
			return this.getStockout_code().split("/")[1];
		} else {
			return "";
		}
	}

	public Staff getReportStaff() {
		Staff staff = null;
		if (this.getReport_to_staff() != null) {
			try {
				List<Staff> lstaff = new Staff(this.db).findByWhere(Staff.IDCARD_NOCol+"= '" + this.getReport_to_staff() + "'", null);
				
				if (lstaff != null && !lstaff.isEmpty()){
					staff = lstaff.get(0);
				}
			} catch (NumberFormatException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		return staff;
	}

	public Staff getTransferByStaff() {
		Staff staff = null;
		if (this.getTransfer_by() != null) {
			try {
				List<Staff> lstaff = new Staff(this.db).findByWhere("idcard_no = '" + this.getTransfer_by() + "'", null);
				if (lstaff != null && !lstaff.isEmpty())
					staff = lstaff.get(0);
			} catch (NumberFormatException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		return staff;
	}
		
	
	public String getStatusName() {
		if ("1".equals(this.getStatus())) {
			return "ทำรายการ";
		} else if ("2".equals(this.getStatus())) {
			return "นำส่งแล้ว";
		} else if ("3".equals(this.getStatus())) {
			return "ตรวจรับแล้ว";
		} else {
			return "";
		}
	}
	
	public EdOffice getOfficeTo(){
		EdOffice office_to = null;
		if (this.getOffcode_to() != null) {
			try {
				List<EdOffice> loffice = new EdOffice(this.db).findByWhere("offcode = '" + this.getOffcode_to() + "'", null);
				if (loffice != null && !loffice.isEmpty())
					office_to = loffice.get(0);
			} catch (NumberFormatException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		return office_to;
	}
	
	public void setOffName(String offName) {
		this.offName = offName;
	}

	public String getOffName(){
		return this.offName;
	}
	
	public String genJobNo(String offcode){
		String job_no = "";
		try {
			job_no = new RunningKey(db).getRunningKey("STOCKOUT", "STOCKOUT_TYPE", "5", offcode);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return job_no;
	}
}