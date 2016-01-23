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
    String lawbreaker_idcard_no;
    long restrospect_year;

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

    public String getLawbreaker_idcard_no(){
        return lawbreaker_idcard_no;
    }
    public void setLawbreaker_idcard_no(String value){
        lawbreaker_idcard_no = value;
    }

    public long getRestrospect_year(){
        return restrospect_year;
    }
    public void setRestrospect_year(long value){
        restrospect_year = value;
    }
}
