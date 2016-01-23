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
import data.ResponseHeader;

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
    public ResponseHeader AllCaseByGroupIDInfo(@WebParam(name = "reqHeader")
    RequestHeader reqHeader) throws Exception {
        //TODO write your implementation code here:
        GroupIDBody resBody = new GroupIDBody();
        resBody.setBody(reqHeader);

        return resBody.getResMessage();
    }
}
