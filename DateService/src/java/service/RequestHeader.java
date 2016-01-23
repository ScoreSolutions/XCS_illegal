/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package service;

/**
 *
 * @author Administrator
 */
public class RequestHeader {
    String ip_address;
    String idcard_no;
    String appID;
    String dateFrom;
    String dateTo;
    String legislationCode;

    public String getIP_address(){
        return ip_address;
    }
    public void setIP_address(String value){
        ip_address = value;
    }

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

    public String getLegislationCode(){
        return legislationCode;
    }
    public void setLegislationCode(String value){
        legislationCode = value;
    }
}
