








 

/**
 * produce by boonchai ( neng )
 * @author <a href="mailto:mr.boonchai@gmail.com">Mr.Boonchai Wedwanitsathein</a>
 */
package com.ko.domain;

//include
import com.ko.domain.base.BaseAppReqApproveCompare;
import com.ko.util.DB;

import java.util.Date;
import java.util.List;
import java.util.Map;

public class AppReqApproveCompare extends BaseAppReqApproveCompare{
	public AppReqApproveCompare(DB db){
		super(db);
	}
	// business method go here
    public String getCompare_case_no(){
        CompareCase cc = new CompareCase(db);
        try {
            cc = cc.findByPk(getCompare_case_id());
            return cc.getCompare_case_no();
        } catch (Exception e) {
            e.printStackTrace();  //To change body of catch statement use File | Settings | File Templates.
        }
        return "-";
    }

    public String getLegislation_name(){
        try {
            List<Map<String,Object>> result = findBySql("select lg.legislation_name from app_req_approve_compare aac\n" +
                    "inner join compare_case cc on cc.id=aac.compare_case_id\n" +
                    "inner join application_arrest aa on aa.track_no=cc.track_no\n" +
                    "inner join legislation lg on lg.id=aa.legislation_id " +
                    "where aac.id=?",getId());
            if(result.size()>0){
                return result.get(0).get("legislation_name").toString();
            }
        } catch (Exception e) {
            e.printStackTrace();  //To change body of catch statement use File | Settings | File Templates.
        }
        return "";
    }

    public String getOffname(){
        try {
            EdOffice ed = new EdOffice(db);
            List<EdOffice> listEd = ed.findByWhere(EdOffice.OFFCODECol+"=?",getOffcode());
            if(listEd.size()>0){
                return listEd.get(0).getOffname();
            }
        } catch (Exception e) {
            e.printStackTrace();  //To change body of catch statement use File | Settings | File Templates.
        }
        return "";
    }

    public Date getApplication_date(){            
        CompareCase cc = new CompareCase(db);
        ApplicationArrest aa = new ApplicationArrest(db);
        try {
            cc = cc.findByPk(getCompare_case_id());
            List<ApplicationArrest> listaa = aa.findByWhere(ApplicationArrest.TRACK_NOCol+"=?",cc.getTrack_no());
            if(listaa.size()>0){
                listaa.get(0).getApplication_date();
            }
        } catch (Exception e) {
            e.printStackTrace();  //To change body of catch statement use File | Settings | File Templates.
        }
        return new Date();
    }

    public String getLawbreaker_name(){
        CompareCase cc = new CompareCase(db);
        ApplicationArrestLawbreaker aal = new ApplicationArrestLawbreaker(db);
        try {
            cc = cc.findByPk(getCompare_case_id());
            List<ApplicationArrestLawbreaker> listaal = aal.findByWhere(ApplicationArrestLawbreaker.TRACK_NOCol+"=?",cc.getTrack_no());
            if(listaal.size()>0){
                aal = listaal.get(0);
                return aal.getLawbreaker_full_name();
            }
        } catch (Exception e) {
            e.printStackTrace();  //To change body of catch statement use File | Settings | File Templates.
        }
        return "";
    }
}