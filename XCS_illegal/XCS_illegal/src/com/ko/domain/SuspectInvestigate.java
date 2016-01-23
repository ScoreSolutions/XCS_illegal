








 

/**
 * produce by boonchai ( neng )
 * @author <a href="mailto:mr.boonchai@gmail.com">Mr.Boonchai Wedwanitsathein</a>
 */
package com.ko.domain;

//include
import com.ko.domain.base.BaseSuspectInvestigate;
import com.ko.util.DB;

import java.util.List;
import java.util.Map;

public class SuspectInvestigate extends BaseSuspectInvestigate{
	public SuspectInvestigate(DB db){
		super(db);
	}
	// business method go here
    public String getStaff_investigate_name(){
        return getStaffName(getStaff_investigate());
        
    }
    public String getStaff_info_name(){
        return getStaffName(getStaff_info());
    }
    public String getStaff_command_name(){
        return getStaffName(getStaff_command());
    }
    public String getStaff_order_save_name(){
        return getStaffName(getStaff_order_save());
    }
    public String getStaff_report_to_name(){
        return getStaffName(getStaff_report_to());
    }
    private String getStaffName(String staffId){
        Staff st = new Staff(db);
        try {
            List<Staff> listSt = st.findByWhere(Staff.IDCARD_NOCol+"=?",staffId);
            if(listSt.size()>0){
                Staff s = listSt.get(0);
                List<Map<String,Object>> title_name = (new Title(db)).findBySql("select title_name from title where title_code=?",s.getTitle_code());
                String t_name = (title_name.size()>0)?title_name.get(0).get("title_name").toString():"";
                return t_name+s.getFirst_name()+" "+s.getLast_name();
            }
        } catch (Exception e) {
            e.printStackTrace();  //To change body of catch statement use File | Settings | File Templates.
        }
        return "";
    }
}