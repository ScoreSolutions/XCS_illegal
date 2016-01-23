/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package service;

import data.responseHeader;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;

/**
 *
 * @author Administrator
 */
@WebService()
public class InquiryCoorporationCode {

    /**
     * Web service operation
     */
    @WebMethod(operationName = "CoorporationCodeCaseInfo")
    public responseHeader CoorporationCodeCaseInfo(@WebParam(name = "reqHeader")
    requestHeader reqHeader) throws Exception {
        //TODO write your implementation code here:
        CoopCodeBody body = new CoopCodeBody();
        body.setBody(reqHeader);
        return body.getResMessage();
    }

}
