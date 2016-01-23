package com.ko.webapp.ajax;

import com.ko.domain.*;
import org.json.JSONArray;

import java.util.ArrayList;
import java.util.List;

public class SuspectRelatifAjax extends BaseAjax{
    public String getSuspectRelatifBySuspectNo(String suspect_no){
        List<SuspectRelatif> result = new ArrayList<SuspectRelatif>();
        SuspectRelatif sr = new SuspectRelatif(db);
        JSONArray jsonArr = null;
        try {
            result = sr.findByWhere(SuspectRelatif.SUSPECT_NOCol+"=?",suspect_no);
             jsonArr = new JSONArray(result);
        } catch (Exception e) {
            e.printStackTrace();  //To change body of catch statement use File | Settings | File Templates.
        }finally{
			closeDB();
        }
        return jsonArr.toString().replaceAll("null","\"\"");
    }
    public String deleteRows(String[] ids){
        List<Long> pks = new ArrayList<Long>();
        for(int i=0;i<ids.length;i++){
            pks.add(Long.valueOf(ids[i]));
        }
        List<SuspectRelatif> result = new ArrayList<SuspectRelatif>();
        SuspectRelatif sr = new SuspectRelatif(db);
        try {
            result = sr.findByPks(pks);
            for(SuspectRelatif s:result){
                s.delete();
            }
        } catch (Exception e) {
            e.printStackTrace();  //To change body of catch statement use File | Settings | File Templates.
        } finally {
            closeDB();
        }
        return "";
    }
}