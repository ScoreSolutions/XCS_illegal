package com.ko.WebService.PRC;

import java.net.MalformedURLException;
import java.net.URL;
import java.rmi.RemoteException;
import java.util.ArrayList;
import java.util.Arrays;
import javax.xml.rpc.ServiceException;

import com.pccth.prcservice.*;
import com.pccth.prcservice.types.*;


public abstract class PrcServiceMaster {
	//String endPoint = "http://web.excise.go.th/WebServices/prcserviceEdSoapHttpPort";
	String endPoint = "http://192.168.101.10/WebServices/prcserviceEdSoapHttpPort";
	protected String err_desc;
	public String serviceCompleteCode = "E00000";
	
	protected String serviceIDBrandMain = "002PRC0001";
	protected String serviceIDBrandSecond = "002PRC0002";
	protected String serviceIDCardTable = "002PRC0003";
	protected String serviceIDGolfTable = "002PRC0004";
	protected String serviceIDLiquorTable = "002PRC0005";
	protected String serviceIDProduct = "002PRC0006";
	protected String serviceIDProduct27 = "002PRC0007";
	protected String serviceIDServiceTable = "002PRC0008";
	protected String serviceIDTobaccoTable = "002PRC0009";
	
	public String getErr_desc(){
		return err_desc;
	}
	
	// -- Return authentication header
	private  Header getAuthenticationHeader(String serviceID,String parameterSearch, String parameterValue) {
		Header header = new Header();
		header.setServiceID(serviceID);
		header.setSystemID("002");
		header.setIPAddress("192.168.3.75");
		
		ParameterAppend append = new ParameterAppend();
		append.setParameterSearch(parameterSearch);
		append.setParameterValue(parameterValue);
		header.setParameterAppend(new ParameterAppend[] { append });
		return header;
	}

	// -- Return authentication body
	private  BodyGen1 getAuthenticationBody() {
		BodyGen1 body = new BodyGen1();
		body.setUserID("LAW");
		body.setPassword("11111111");
		return body;
	}
	
	protected  InquiryPrcReqHeader getInquiryHeader(String serviceID,String parameterSearch, String parameterValue) {
		InquiryPrcReqHeader inHeader = new InquiryPrcReqHeader();

		Header header = getAuthenticationHeader(serviceID, parameterSearch,parameterValue);
		BodyGen1 bodyGen = getAuthenticationBody();

		inHeader.setHeader(header);
		inHeader.setBody(bodyGen);

		return inHeader;
	}

	// -- Return service from web.excise.go.th
	protected  PrcserviceEd_PortType getService() {
		PrcserviceEd_Service service = new PrcserviceEd_ServiceLocator();
		PrcserviceEd_PortType portType = null;
		try {
			//portType = service.getrdbserviceEdSoapHttpPort(new URL("http://web.excise.go.th/WebServices/rdbserviceEdSoapHttpPort"));
			portType = service.getprcserviceEdSoapHttpPort(new URL(endPoint));
		} catch (MalformedURLException e) {
			e.printStackTrace();
		} catch (ServiceException e) {
			e.printStackTrace();
		}
		return portType;
	}
	

	public boolean chkServiceConnection()
	{
		boolean ret = true;
		
		PrcserviceEd_Service service = new PrcserviceEd_ServiceLocator();
		PrcserviceEd_PortType portType = null;
		try {
			portType = service.getprcserviceEdSoapHttpPort(new URL(endPoint));
			InquiryPrcReqHeader inHeader = getInquiryHeader(serviceIDBrandMain,"GROUP_ID","7001");
			InquiryPrcResHeader response = new InquiryPrcResHeader();
			try{
				response = portType.inquiryBrandMainOperation(inHeader);
			}catch(RemoteException e){
				//inHeader.getBody().
				err_desc = e.getMessage();
				ret = false;
			}
		} catch (MalformedURLException e) {
			//e.printStackTrace();
			err_desc = e.getMessage();
			ret = false;
		} catch (ServiceException e) {
			//e.printStackTrace();
			err_desc = e.getMessage();
			ret = false;
		}
		
		return ret;
	}
}
