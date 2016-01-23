








 

/**
 * produce by boonchai ( neng )
 * @author <a href="mailto:mr.boonchai@gmail.com">Mr.Boonchai Wedwanitsathein</a>
 */
package com.ko.domain;

//include
import com.ko.domain.base.BaseSuspectInvestigateTeam;
import com.ko.util.DB;

import java.util.List;
import java.util.Map;

public class SuspectInvestigateTeam extends BaseSuspectInvestigateTeam{
	public SuspectInvestigateTeam(DB db){
		super(db);
	}
	// business method go here
//    public String getFull_name(){
//        Staff st = new Staff(db);
//        try {
//            List<Staff> listSt = st.findByWhere(Staff.IDCARD_NOCol+"=?",getIdcard_no());
//            if(listSt.size()>0){
//                Staff s = listSt.get(0);
//                List<Map<String,Object>> title_name = (new Title(db)).findBySql("select title_name from title where title_code=?",s.getTitle_code());
//                String t_name = (title_name.size()>0)?title_name.get(0).get("title_name").toString():"";
//                return t_name+s.getFirst_name()+" "+s.getLast_name();
//            }
//        } catch (Exception e) {
//            e.printStackTrace();  //To change body of catch statement use File | Settings | File Templates.
//        }
//        return "";
//    }
//
//    public String getPosname(){
//        Staff st = new Staff(db);
//
//        try {
//            List<Staff> listSt = st.findByWhere(Staff.IDCARD_NOCol+"=?",getIdcard_no());
//            if(listSt.size()>0){
//                //Staff s = listSt.get(0);
//                List<Map<String,Object>> posname = (new Position(db)).findBySql("select posname from position where poscode=?",getPoscode());
//                return(posname.size()>0)?posname.get(0).get("posname").toString():"";
//            }
//        } catch (Exception e) {
//            e.printStackTrace();  //To change body of catch statement use File | Settings | File Templates.
//        }
//        return "";
//    }
}