/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package service;

import com.domain.BaseDomain;
import java.lang.Exception;
import java.util.ArrayList;
import data.IDCardnoCase;
import data.ResponseHeader;
/**
 *
 * @author Administrator
 */
public class IDCardnoBody {
    String mmyyyy;
    String offcode;
    boolean isValidData;
    ArrayList<IDCardnoCase> caseList;
    IDCardnoCaseService service;
    ResponseHeader resMessage;

    public void setBody(RequestHeader reqHeader) throws Exception {

        service = new IDCardnoCaseService();
        resMessage = service.getResponse(reqHeader);
    }

    public ResponseHeader getResMessage(){
        return resMessage;
    }
    public void setResMessage(ResponseHeader value){
        resMessage = value;
    }

    public ArrayList<IDCardnoCase> getInquiryOffcode(){
        return caseList;
    }

    public boolean getIsValidData(){
        return isValidData;
    }
}
