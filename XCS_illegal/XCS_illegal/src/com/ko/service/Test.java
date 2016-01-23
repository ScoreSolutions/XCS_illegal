package com.ko.service;

import java.net.MalformedURLException;
import java.net.URL;
import java.rmi.RemoteException;

import javax.xml.rpc.ServiceException;


import com.pccth.rdbservice.BodyGen1;
import com.pccth.rdbservice.Header;
import com.pccth.rdbservice.InquiryAccMastReqHeader;
import com.pccth.rdbservice.InquiryTitleOperation;
import com.pccth.rdbservice.InquiryTitleOperationResponse;
import com.pccth.rdbservice.ParameterAppend;
import com.pccth.rdbservice.RdbserviceEd;
import com.pccth.rdbservice.RdbserviceEdStub;
import com.pccth.rdbservice.TitleInfo;

public class Test {
	public static void main(String args[]) throws MalformedURLException,
			ServiceException, RemoteException {
		/*RdbserviceEd_Service service = new RdbserviceEd_ServiceLocator();
		// RdbserviceEdSoapHttpStub aa = s.get

		Header header = new Header();
		//header.setIPAddress("192.168.42.67");
		header.setServiceID("0000000002");
		header.setSystemID("002");

		BodyGen1 body = new BodyGen1();
		body.setUserID("LAW");
		body.setPassword("11111111");
//		ParameterAppend append = new ParameterAppend();
//		append.setParameterSearch("");
//		append.setParameterValue("");
		ParameterAppend paramAppend[] = new ParameterAppend[1];
        paramAppend[0] = new ParameterAppend();
        paramAppend[0].setParameterValue("");
        paramAppend[0].setParameterSearch("");
        body.setParameterAppend(paramAppend);
        
        body.setBody(bodyGen1);

//		body.setParameterAppend(new ParameterAppend[] { append });

		InquiryAccMastReqHeader inHeader = new InquiryAccMastReqHeader();
		// add header and body
		inHeader.setHeader(header);
		inHeader.setBody(body);

		InquiryAccMastResHeader response = new InquiryAccMastResHeader();

		RdbserviceEd_PortType type = service
				.getrdbserviceEdSoapHttpPort(new URL(
						"http://web2.excise.go.th/WebServices/rdbserviceEdSoapHttpPort"));

		System.out.println(type.toString());
		
		response = type.inquiryTambolOperation(inHeader);
		Body body2 = response.getBody();
		//String ss = body2.getAccMastInfo().toString();
		
		System.out.println(body2.getTambolInfo()[0].getTambol_code());
		
		//System.out.println(ss);
		System.out.println(body2.getReturnDesc());
		*/
	
		   
           
           //InquiryAccMastReqHeader param = new InquiryAccMastReqHeader();
           
           Header h = new Header();
           //header.setIPAddress("192.168.2.100");
           h.setServiceID("0000000002");
           h.setSystemID("002");
           //param.setHeader(header);
           
           BodyGen1 body = new BodyGen1();
           body.setUserID("LAW");
           body.setPassword("11111111");
           

           ParameterAppend paramAppend[] = new ParameterAppend[1];
           paramAppend[0] = new ParameterAppend();
           paramAppend[0].setParameterValue("");
           paramAppend[0].setParameterSearch("");
           body.setParameterAppend(paramAppend);
           
        // add header and body
           InquiryAccMastReqHeader inHeader = new InquiryAccMastReqHeader();
   			inHeader.setHeader(h);
   			inHeader.setBody(body);
           
           //param.setBody(bodyGen1);
   			InquiryTitleOperation req = new InquiryTitleOperation();
   			req.setInquiryTitleOperation(inHeader);
           //req.setInquiryTitleOperation(inHeader);
           
           RdbserviceEdStub service = new RdbserviceEdStub("http://192.168.103.10/WebServices/rdbserviceEdSoapHttpPort");
           InquiryTitleOperationResponse res = service.inquiryTitleOperation(req);
           
           if(res != null){
               //System.out.println("Return code :: "+res.getInquiryTitleOperationResponse().getBody().getReturnCode());
               
        	   TitleInfo[] title = res.getInquiryTitleOperationResponse().getBody().getTitleInfo();
        	   for(int i=0;i<title.length;i++){
               		System.out.println(title[i].getTitle_name());
               }
           }		
		
	}
}
