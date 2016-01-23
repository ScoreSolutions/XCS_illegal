/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package service;

/**
 *
 * @author Administrator
 */
public class requestHeader {
    String ip_address;
    String idcard_no;
    String appID;
    String coorporation_code;
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

    public String getCoorporation_code(){
        return coorporation_code;
    }
    public void setCoorporation_code(String value){
        coorporation_code = value;
    }

    public long getRestrospect_year(){
        return restrospect_year;
    }
    public void setRestrospect_year(long value){
        restrospect_year = value;
    }
}
