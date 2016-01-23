package com.ko.illegalwebservice.data;

public class AllCaseByGroupID {
	String case_date;
	String group_id;
	String group_name;
	Long case_qty;
	Long court_qty;
	Long noculprit_qty;
	Double case_fine;
	Double court_fine;
	Double noculprit_fine;
	
	public String getCase_date(){
		return case_date;
	}
	public void setCase_date(String value){
		case_date = value;
	}
	
	public String getGroup_id(){
		return group_id;
	}
	public void setGroup_id(String value){
		group_id = value;
	}
	
	public String getGroup_name(){
		return group_name;
	}
	public void setGroup_name(String value){
		group_name = value;
	}
	
	public Long getCase_qty(){
		return case_qty;
	}
	public void setCase_qty(Long value){
		case_qty = value;
	}
	
	public Long getCourt_qty(){
		return court_qty;
	}
	public void setCourt_qty(Long value){
		court_qty = value;
	}
	
	public Long getNoculprit_qty(){
		return noculprit_qty;
	}
	public void setNoculprit_qty(Long value){
		noculprit_qty = value;
	}
	
	public Double getCase_fine(){
		return case_fine;
	}
	public void setCase_fine(Double value){
		case_fine = value;
	}
	
	public Double getCourt_fine(){
		return court_fine;
	}
	public void setCourt_fine(Double value){
		court_fine = value;
	}
	
	public Double getNoculprit_fine(){
		return noculprit_fine;
	}
	public void setNoculprit_fine(Double value){
		noculprit_fine = value;
	}
}
