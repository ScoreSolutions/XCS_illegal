/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package data;

import java.util.ArrayList;
/**
 *
 * @author Administrator
 */
public class ResponseHeader {
    boolean isValidData;
    String message;
    ArrayList<AllCaseByDate> responseBody;

    public boolean getIsValidData(){
        return isValidData;
    }
    public void setIsValidData(boolean value){
        isValidData = value;
    }

    public String getMessage(){
        return message;
    }
    public void setMessage(String value){
        message = value;
    }

    public ArrayList<AllCaseByDate> getResponseBody(){
        return responseBody;
    }

    public void setResponseBody(ArrayList<AllCaseByDate> value){
        responseBody = value;
    }
}
