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
    String month_year;
    String offcode;
    String rtType;

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

    public String getMonth_year(){
        return month_year;
    }
    public void setMonth_year(String value){
        month_year = value;
    }

    public String getOffcode(){
        return offcode;
    }
    public void setOffcode(String value){
        offcode = value;
    }
    public String getRtType(){
        return rtType;
    }
    public void setRtType(String value){
        rtType = value;
    }
}
