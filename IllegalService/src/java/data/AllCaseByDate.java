package data;

//import com.ko.util.DateUtil;
public class AllCaseByDate {
	String case_date;
	String legislation_code;
	String legislation_name;
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
	
	public String getLegislation_code(){
		return legislation_code;
	}
	public void setLegislation_code(String value){
		legislation_code = value;
	}
	
	public String getLegislation_name(){
		return legislation_name;
	}
	public void setLegislation_name(String value){
		legislation_name = value;
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
