/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package service;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;
import data.ResponseHeader;
/**
 *
 * @author Administrator
 */
@WebService()
public class InquiryIDCard {

    /**
     * Web service operation
     */
    @WebMethod(operationName = "IDCardNoCaseInfo")
    public ResponseHeader IDCardNoCaseInfo(@WebParam(name = "reqHeader")
    RequestHeader reqHeader) throws Exception {
        //TODO write your implementation code here:

        IDCardnoBody body = new IDCardnoBody();
        body.setBody(reqHeader);

        return body.getResMessage();
    }

}
