








 

/**
 * produce by boonchai ( neng )
 * @author <a href="mailto:mr.boonchai@gmail.com">Mr.Boonchai Wedwanitsathein</a>
 */
package com.ko.domain;

//include
import com.ko.domain.base.BaseRewardDivideAlcohol;
import com.ko.util.DB;

import java.util.List;

public class RewardDivideAlcohol extends BaseRewardDivideAlcohol{

	public RewardDivideAlcohol(DB db){
		super(db);
	}
	// business method go here
    private String full_name = "";
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
}