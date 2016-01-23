package data;

//import com.ko.util.DateUtil;
public class AllCaseByOffcode {
	String month_year;
	String offcode;
	String offname;
        String short_name;
        String legislation_code;
        String legislation_name;
	long case_qty;
	long court_qty;
	long noculprit_qty;
	double case_fine;
	double court_fine;
	double noculprit_fine;

	public String getMonth_year(){
            return month_year;
	}
	public void setMonth_year(String value){
            month_year = value;
	}

        public String getOffcode(){
            return offcode;
        }
        public void setOffcode(String value){
            offcode=value;
        }

        public String getOffname(){
            return offname;
        }
        public void setOffname(String value){
            offname = value;
        }

        public String getShort_name(){
            return short_name;
        }
        public void setShort_name(String value){
            short_name = value;
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
