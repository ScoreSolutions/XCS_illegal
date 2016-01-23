/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package service;

import com.domain.BaseDomain;
import java.lang.Exception;
import java.util.ArrayList;
import data.AllCaseByOffcode;
import data.ResponseHeader;
/**
 *
 * @author Administrator
 */
public class OffcodeBody {
    String mmyyyy;
    String offcode;
    boolean isValidData;
    ArrayList<AllCaseByOffcode> caseList;
    AllCaseByOffcodeService service;
    ResponseHeader resMessage;

    public void setBody(RequestHeader reqHeader) throws Exception {

        service = new AllCaseByOffcodeService();
        resMessage = service.getResponse(reqHeader);
    }

    public ResponseHeader getResMessage(){
        return resMessage;
    }
    public void setResMessage(ResponseHeader value){
        resMessage = value;
    }

    public ArrayList<AllCaseByOffcode> getInquiryOffcode(){
        return caseList;
    }

    public boolean getIsValidData(){
        return isValidData;
    }
}
