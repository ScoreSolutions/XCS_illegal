/**
 * produce by boonchai ( neng )
 * @author <a href="mailto:mr.boonchai@gmail.com">Mr.Boonchai Wedwanitsathein</a>
 */
package com.ko.domain;

//include
import java.util.Date;

import com.ko.domain.base.BaseStockin;
import com.ko.util.DB;
import com.ko.util.RunningKey;

public class Stockin extends BaseStockin {
	private Date sendDate = new Date();
	private String offName = "Dummy Off Name";
	private String recieveName = "oooo";
	private String posName = "ooo";
	private String statusName = "Dummy Status Name";

	public Stockin(DB db) {
		super(db);
	}
	
	public Date getSendDate() {
		return sendDate;
	}

	public void setSendDate(Date sendDate) {
		this.sendDate = sendDate;
	}

	public String getOffName() {
		return offName;
	}

	public void setOffName(String offName) {
		this.offName = offName;
	}

	public String getRecieveName() {
		return recieveName;
	}

	public void setRecieveName(String recieveName) {
		this.recieveName = recieveName;
	}

	public String getPosName() {
		return posName;
	}

	public void setPosName(String posName) {
		this.posName = posName;
	}

	public String getStatusName() {
		return statusName;
	}

	public void setStatusName(String statusName) {
		this.statusName = statusName;
	}

	public String genStockInCode(String offcode){
		String stock_code = "";
		try {
			stock_code = new RunningKey(db).getRunningKey("STOCKIN", "", "", offcode);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return stock_code;
	}
	
	String delivery_code;
	String delivery_date;
	String offname;
	String statusname;
	String staff_name;
	String posname;
	public String getDelivery_code()
	{
		return delivery_code;
	}
	public String getDelivery_date()
	{
		return delivery_date;
	}
	public String getOffname(){
		return offname;
	}
	public String getStatusname(){
		return statusname;
	}
	public String getStaff_name(){
		return staff_name;
	}
	public String getPosname(){
		return posname;
	}
}