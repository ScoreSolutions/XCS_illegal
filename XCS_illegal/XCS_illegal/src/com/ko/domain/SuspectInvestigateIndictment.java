








 

/**
 * produce by boonchai ( neng )
 * @author <a href="mailto:mr.boonchai@gmail.com">Mr.Boonchai Wedwanitsathein</a>
 */
package com.ko.domain;

//include
import com.ko.domain.base.BaseSuspectInvestigateIndictment;
import com.ko.util.DB;

import java.util.List;
import java.util.Map;

public class SuspectInvestigateIndictment extends BaseSuspectInvestigateIndictment{
	public SuspectInvestigateIndictment(DB db){
		super(db);
		super.SEQUENCE_NAME = "SUSPECT_INVEST_INDICTMENT_SEQ";
	}
	// business method go here
    public String getGuilt_base(){
        Indictment i = new Indictment(db);
        try {
            List<Map<String,Object>> result = i.findBySql("select guilt_base from indictment where indictment_id="+getIndictment_id());
            return result.get(0).get("guilt_base").toString();
        } catch (Exception e) {
            e.printStackTrace();  //To change body of catch statement use File | Settings | File Templates.
        }
        return "";
    }
}