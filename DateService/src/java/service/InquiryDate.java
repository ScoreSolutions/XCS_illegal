/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package service;

import data.ResponseHeader;
import java.lang.Exception;
import java.util.ArrayList;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;
import data.AllCaseByDate;

/**
 *
 * @author Administrator
 */
@WebService()
public class InquiryDate {

    /**
     * Web service operation
     */
    @WebMethod(operationName = "AllCaseByDateInfo")
    public ResponseHeader AllCaseByDateInfo(@WebParam(name = "reqHeader")
    RequestHeader reqHeader) throws Exception {
        //TODO write your implementation code here:
        DateBody body = new DateBody();
        body.setBody(reqHeader);
        return body.getResMessage();
    }
}
