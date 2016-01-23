/**
 * PrcserviceEd_PortType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.pccth.prcservice;

public interface PrcserviceEd_PortType extends java.rmi.Remote {
    public com.pccth.prcservice.types.InquiryPrcResHeader inquiryBrandMainOperation(com.pccth.prcservice.types.InquiryPrcReqHeader parameters) throws java.rmi.RemoteException;
    public com.pccth.prcservice.types.InquiryPrcResHeader inquiryBrandSecondOperation(com.pccth.prcservice.types.InquiryPrcReqHeader parameters) throws java.rmi.RemoteException;
    public com.pccth.prcservice.types.InquiryPrcResHeader inquiryCardOperation(com.pccth.prcservice.types.InquiryPrcReqHeader parameters) throws java.rmi.RemoteException;
    public com.pccth.prcservice.types.InquiryPrcResHeader inquiryGolfOperation(com.pccth.prcservice.types.InquiryPrcReqHeader parameters) throws java.rmi.RemoteException;
    public com.pccth.prcservice.types.InquiryPrcResHeader inquiryLiquorOperation(com.pccth.prcservice.types.InquiryPrcReqHeader parameters) throws java.rmi.RemoteException;
    public com.pccth.prcservice.types.InquiryPrcResHeader inquiryProduct27Operation(com.pccth.prcservice.types.InquiryPrcReqHeader parameters) throws java.rmi.RemoteException;
    public com.pccth.prcservice.types.InquiryPrcResHeader inquiryServiceOperation(com.pccth.prcservice.types.InquiryPrcReqHeader parameters) throws java.rmi.RemoteException;
    public com.pccth.prcservice.types.InquiryPrcResHeader inquiryTobaccoOperation(com.pccth.prcservice.types.InquiryPrcReqHeader parameters) throws java.rmi.RemoteException;
}
