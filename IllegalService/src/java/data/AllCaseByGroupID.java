package data;

public class AllCaseByGroupID {
	String case_date;
	String group_id;
	String group_name;
	long case_qty;
	long court_qty;
	long noculprit_qty;
	double case_fine;
	double court_fine;
	double noculprit_fine;
	
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
	
	public long getCase_qty(){
		return case_qty;
	}
	public void setCase_qty(long value){
		case_qty = value;
	}
	
	public long getCourt_qty(){
		return court_qty;
	}
	public void setCourt_qty(long value){
		court_qty = value;
	}
	
	public long getNoculprit_qty(){
		return noculprit_qty;
	}
	public void setNoculprit_qty(long value){
		noculprit_qty = value;
	}
	
	public double getCase_fine(){
		return case_fine;
	}
	public void setCase_fine(double value){
		case_fine = value;
	}
	
	public double getCourt_fine(){
		return court_fine;
	}
	public void setCourt_fine(double value){
		court_fine = value;
	}
	
	public double getNoculprit_fine(){
		return noculprit_fine;
	}
	public void setNoculprit_fine(double value){
		noculprit_fine = value;
	}
}
