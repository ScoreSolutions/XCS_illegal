/**
 * produce by boonchai ( neng )
 * @author <a href="mailto:mr.boonchai@gmail.com">Mr.Boonchai Wedwanitsathein</a>
 */
package com.ko.domain;

//include

import com.ko.domain.base.BaseApplicationArrestLawbreaker;
import com.ko.util.DB;
import com.ko.util.RunningKey;

import java.util.List;

public class ApplicationArrestLawbreaker extends BaseApplicationArrestLawbreaker {

    public ApplicationArrestLawbreaker(DB db) {
        super(db);
        super.SEQUENCE_NAME = "APPLICATIONARRESTLAWBREAKERSEQ";
    }
    // business method go here

    public String getLawbreaker_full_name() {
        Title t = new Title(db);
        String title = "";
        try {
            List<Title> tlist = t.findByWhere(TITLE_CODECol+"=?", getTitle_code());
            if (tlist.size() > 0) {
                title = tlist.get(0).getTitle_name();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return title + getFirst_name() + " " + getLast_name();
    }

    public String getNationality_name(){
        Nationality nt = new Nationality(db);
        try {
            return nt.findByPk(getNationality_id()).getNation_name();
        } catch (Exception e) {
            e.printStackTrace();  //To change body of catch statement use File | Settings | File Templates.
        }
        return "";
    }

}