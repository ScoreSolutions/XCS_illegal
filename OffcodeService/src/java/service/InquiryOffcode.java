/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package service;

import data.ResponseHeader;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;
import data.AllCaseByOffcode;

/**
 *
 * @author Administrator
 */
@WebService()
public class InquiryOffcode {

    /**
     * Web service operation
     */
    @WebMethod(operationName = "SumCaseByOffcodeInfo")
    public ResponseHeader SumCaseByOffcodeInfo(@WebParam(name = "reqHeader")
    RequestHeader reqHeader) throws Exception {
        //TODO write your implementation code here:
        OffcodeBody  body = new OffcodeBody();
        body.setBody(reqHeader);
        
        return body.getResMessage();
    }

}
