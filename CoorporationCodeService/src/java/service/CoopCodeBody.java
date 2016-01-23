/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package service;

import com.domain.BaseDomain;
import java.lang.Exception;
import java.util.ArrayList;
import data.CoopCodeCase;
import data.responseHeader;
/**
 *
 * @author Administrator
 */
public class CoopCodeBody {
    boolean isValidData;
    ArrayList<CoopCodeCase> caseList;
    CoopCodeCaseService service;
    responseHeader resMessage;

    public void setBody(requestHeader reqHeader) throws Exception {

        service = new CoopCodeCaseService();
        resMessage = service.getResponse(reqHeader);
    }

    public responseHeader getResMessage(){
        return resMessage;
    }
    public void setResMessage(responseHeader value){
        resMessage = value;
    }

    public ArrayList<CoopCodeCase> getInquiryOffcode(){
        return caseList;
    }

    public boolean getIsValidData(){
        return isValidData;
    }
}
