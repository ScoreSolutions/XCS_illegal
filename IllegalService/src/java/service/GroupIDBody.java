/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package service;

import com.domain.BaseDomain;
import java.lang.Exception;
import java.util.ArrayList;
import data.AllCaseByGroupID;


/**
 *
 * @author Administrator
 */
public class GroupIDBody extends InquiryGroupID {

    String dateFrom;
    String dateTo;
    String groupID;
    boolean isValidData;
    ArrayList<AllCaseByGroupID> caseList;
    AllCaseByGroupIDService service;

    public void setBody(GroupIDHeader reqHeader) throws Exception {
        String idCard_no = reqHeader.getIdcard_no();
        String appID = reqHeader.getAppID();
        String ins = "insert into use_webservice" + reqHeader.dateFrom + " " + reqHeader.dateTo + " " + reqHeader.groupID;
        System.out.println(ins);

        dateFrom = reqHeader.getDateFrom();
        dateTo = reqHeader.getDateTo();
        groupID = reqHeader.getGroupID();
        service = new AllCaseByGroupIDService();
        isValidData = service.getIsValidData(dateFrom, dateTo, groupID);
        caseList = service.AllCaseByGroupID(dateFrom, dateTo, groupID);
        
    }

    public ArrayList<AllCaseByGroupID> getInquiryGroupID(){
        return caseList;
    }

    public boolean getIsValidData(){
        return isValidData;
    }
}
