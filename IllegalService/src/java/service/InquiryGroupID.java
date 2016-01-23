/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package service;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;
import java.util.ArrayList;
import data.AllCaseByGroupID;

/**
 *
 * @author Administrator
 */
@WebService()
public class InquiryGroupID {

    /**
     * Web service operation
     */
    @WebMethod(operationName = "AllCaseByGroupIDInfo")
    public ArrayList<AllCaseByGroupID> AllCaseByGroupIDInfo(@WebParam(name = "reqHeader")
    GroupIDHeader reqHeader) throws Exception {
        //TODO write your implementation code here:
        GroupIDBody resBody = new GroupIDBody();
        resBody.setBody(reqHeader);

        return resBody.getInquiryGroupID();
    }

    /**
     * Web service operation
     */
    @WebMethod(operationName = "IsValidData")
    public boolean IsValidData(@WebParam(name = "reqHeader")
    GroupIDHeader reqHeader) throws Exception {
        //TODO write your implementation code here:
        GroupIDBody resBody = new GroupIDBody();
        resBody.setBody(reqHeader);
        
        return resBody.getIsValidData();
    }
}
