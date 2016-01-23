/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package service;

/**
 *
 * @author Administrator
 */
public class GroupIDHeader {
    String idcard_no;
    String appID;
    String dateFrom;
    String dateTo;
    String groupID;
    GroupIDBody body;

    public String getIdcard_no(){
        return idcard_no;
    }
    public void setIdcard_no(String value){
        idcard_no=value;
    }

    public String getAppID(){
        return appID;
    }
    public void setAppID(String value){
        appID = value;
    }

    public String getDateFrom(){
        return dateFrom;
    }
    public void setDateFrom(String value){
        dateFrom = value;
    }

    public String getDateTo(){
        return dateTo;
    }
    public void setDateTo(String value){
        dateTo = value;
    }

    public String getGroupID(){
        return groupID;
    }
    public void setGroupID(String value){
        groupID = value;
    }

    public GroupIDBody getBody(){
        return new GroupIDBody();
    }
    public void setBody(GroupIDBody value){
        body = value;
    }

}
