








 

/**
 * produce by boonchai ( neng )
 * @author <a href="mailto:mr.boonchai@gmail.com">Mr.Boonchai Wedwanitsathein</a>
 */
package com.ko.domain;

//include
import com.ko.domain.base.BaseRewardDivideTax;
import com.ko.util.DB;

import java.util.List;

public class RewardDivideTax extends BaseRewardDivideTax{
	public RewardDivideTax(DB db){
		super(db);
	}
	// business method go here
    private String full_name = "";
    private String is_notice = "";
    public String getFull_name(){
        if(full_name.equals("")){
            if(getLast_name()!=null)
                return getTitle_text()+((getFirst_name()==null)?"":getFirst_name())+" "+getLast_name();
            else
                return getTitle_text()+((getFirst_name()==null)?"":getFirst_name());
        }else{
            return full_name;
        }
    }
    public void setFull_name(String full_name){
        this.full_name = full_name;
    }
    
    public String getIs_notice(){
    	return is_notice;
    }
    public void setIs_notice(String value){
    	is_notice = value;
    }
    
    public String getTitle_text() {
        if(getTitle_code() == null)return "";
        Title t = new Title(db);
        t.setTitle_code(getTitle_code());
        try {
            List<Title> tList = t.findByExample(t);
            if(tList.size()>0)
                return tList.get(0).getTitle_name();
            else return "";
        } catch (Exception e) {
            e.printStackTrace();  //To change body of catch statement use File | Settings | File Templates.
        }
        return "";
    }
    public double getSum_money(){
        try{
        	return getMoney1()+getMoney2();
        }catch(Exception e){
            return 0.0;
        }
    }
}