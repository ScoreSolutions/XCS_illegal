/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package service;

import com.domain.BaseDomain;
import java.lang.Exception;
import java.util.ArrayList;
import data.AllCaseByDate;
import data.ResponseHeader;
/**
 *
 * @author Administrator
 */
public class DateBody {
    String dateFrom;
    String dateTo;
    String legislationCode;
    boolean isValidData;
    ArrayList<AllCaseByDate> caseList;
    AllCaseByDateService service;
    ResponseHeader resMessage;

    public void setBody(RequestHeader reqHeader) throws Exception {
        service = new AllCaseByDateService();
        resMessage = service.getResponse(reqHeader);
    }

    public ResponseHeader getResMessage(){
        return resMessage;
    }
    public void setResMessage(ResponseHeader value){
        resMessage = value;
    }


    public ArrayList<AllCaseByDate> getInquiryDate(){
        return caseList;
    }

    public boolean getIsValidData(){
        return isValidData;
    }
}
