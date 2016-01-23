package com.ko.webapp.ajax;

import com.ko.domain.SuspectPicture;
import com.ko.domain.SuspectRelatif;
import org.json.JSONArray;

import java.util.ArrayList;
import java.util.List;

public class SuspectPictureAjax extends BaseAjax{
    public void deleteRow(String id){
        SuspectPicture sp = new SuspectPicture(db);
        try {
            sp.deleteByPk(Long.valueOf(id));
        } catch (Exception e) {
            e.printStackTrace();  //To change body of catch statement use File | Settings | File Templates.
        } finally {
            closeDB();
        }
    }
    public String deleteRows(String[] ids){
        List<Long> pks = new ArrayList<Long>();
        for(int i=0;i<ids.length;i++){
            pks.add(Long.valueOf(ids[i]));
        }
        List<SuspectPicture> result = new ArrayList<SuspectPicture>();
        SuspectPicture sr = new SuspectPicture(db);
        try {
            result = sr.findByPks(pks);
            for(SuspectPicture s:result){
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