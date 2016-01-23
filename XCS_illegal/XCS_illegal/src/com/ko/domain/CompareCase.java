








 

/**
 * produce by boonchai ( neng )
 * @author <a href="mailto:mr.boonchai@gmail.com">Mr.Boonchai Wedwanitsathein</a>
 */
package com.ko.domain;

//include
import com.ko.domain.base.BaseCompareCase;
import com.ko.util.DB;

import java.util.ArrayList;
import java.util.List;

public class CompareCase extends BaseCompareCase{
	public CompareCase(DB db){
		super(db);                                    
	}
	// business method go here
    public List<ApplicationArrestLawbreaker> getLawbreakers(){
        ApplicationArrestLawbreaker aal = new ApplicationArrestLawbreaker(db);
        try{
            return aal.findByWhere(ApplicationArrestLawbreaker.TRACK_NOCol+"=?",getTrack_no());
        } catch (Exception e) {
            e.printStackTrace();  //To change body of catch statement use File | Settings | File Templates.
        }
        return new ArrayList<ApplicationArrestLawbreaker>();
    }
    public Integer getLawbreakersQty(){
        ApplicationArrestLawbreaker aal = new ApplicationArrestLawbreaker(db);
        try {
            return aal.countByWhere(ApplicationArrestLawbreaker.TRACK_NOCol+"=?",getTrack_no());
        } catch (Exception e) {
            e.printStackTrace();  //To change body of catch statement use File | Settings | File Templates.
        }
        return 0;
    }
    public String getIndictment_name(){
        Indictment i = new Indictment(db);
        try {
            i = i.findByPk(getIndictment_id());
            return i.getCase_law_id();
        } catch (Exception e) {
            e.printStackTrace();  //To change body of catch statement use File | Settings | File Templates.
        }
        return "";
    }
    public String getStaff_full_name(){
        Staff st = new Staff(db);
        try {
            List<Staff> listSt = st.findByWhere(Staff.IDCARD_NOCol+"=?",getSue_staff_idcardno());
            if(listSt.size()>0){
                return listSt.get(0).getFullName();
            }
        } catch (Exception e) {
            e.printStackTrace();  //To change body of catch statement use File | Settings | File Templates.
        }
        return "";
    }

    public String getStaff_pos_name(){
        Position p = new Position(db);
        try {
            List<Position> listSt = p.findByWhere(Position.POSCODECol+"=?",getSue_poscode());
            if(listSt.size()>0){
                return listSt.get(0).getPosname();
            }
        } catch (Exception e) {
            e.printStackTrace();  //To change body of catch statement use File | Settings | File Templates.
        }
        return "";
    }
}