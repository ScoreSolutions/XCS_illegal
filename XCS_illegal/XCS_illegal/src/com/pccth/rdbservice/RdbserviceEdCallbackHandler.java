
/**
 * RdbserviceEdCallbackHandler.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.6.2  Built on : Apr 17, 2012 (05:33:49 IST)
 */

    package com.pccth.rdbservice;

    /**
     *  RdbserviceEdCallbackHandler Callback class, Users can extend this class and implement
     *  their own receiveResult and receiveError methods.
     */
    public abstract class RdbserviceEdCallbackHandler{



    protected Object clientData;

    /**
    * User can pass in any object that needs to be accessed once the NonBlocking
    * Web service call is finished and appropriate method of this CallBack is called.
    * @param clientData Object mechanism by which the user can pass in user data
    * that will be avilable at the time this callback is called.
    */
    public RdbserviceEdCallbackHandler(Object clientData){
        this.clientData = clientData;
    }

    /**
    * Please use this constructor if you don't want to set any clientData
    */
    public RdbserviceEdCallbackHandler(){
        this.clientData = null;
    }

    /**
     * Get the client data
     */

     public Object getClientData() {
        return clientData;
     }

        
           /**
            * auto generated Axis2 call back method for inquiryVatRateOperation method
            * override this method for handling normal response from inquiryVatRateOperation operation
            */
           public void receiveResultinquiryVatRateOperation(
                    com.pccth.rdbservice.InquiryVatRateOperationResponse result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from inquiryVatRateOperation operation
           */
            public void receiveErrorinquiryVatRateOperation(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for inquiryCountryOperation method
            * override this method for handling normal response from inquiryCountryOperation operation
            */
           public void receiveResultinquiryCountryOperation(
                    com.pccth.rdbservice.InquiryCountryOperationResponse result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from inquiryCountryOperation operation
           */
            public void receiveErrorinquiryCountryOperation(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for inquiryCusGrpOperation method
            * override this method for handling normal response from inquiryCusGrpOperation operation
            */
           public void receiveResultinquiryCusGrpOperation(
                    com.pccth.rdbservice.InquiryCusGrpOperationResponse result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from inquiryCusGrpOperation operation
           */
            public void receiveErrorinquiryCusGrpOperation(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for inquiryLicenseDtOperation method
            * override this method for handling normal response from inquiryLicenseDtOperation operation
            */
           public void receiveResultinquiryLicenseDtOperation(
                    com.pccth.rdbservice.InquiryLicenseDtOperationResponse result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from inquiryLicenseDtOperation operation
           */
            public void receiveErrorinquiryLicenseDtOperation(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for inquiryDutyTableOperation method
            * override this method for handling normal response from inquiryDutyTableOperation operation
            */
           public void receiveResultinquiryDutyTableOperation(
                    com.pccth.rdbservice.InquiryDutyTableOperationResponse result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from inquiryDutyTableOperation operation
           */
            public void receiveErrorinquiryDutyTableOperation(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for inquiryApproveLevelOperation method
            * override this method for handling normal response from inquiryApproveLevelOperation operation
            */
           public void receiveResultinquiryApproveLevelOperation(
                    com.pccth.rdbservice.InquiryApproveLevelOperationResponse result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from inquiryApproveLevelOperation operation
           */
            public void receiveErrorinquiryApproveLevelOperation(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for inquiryTitleOperation method
            * override this method for handling normal response from inquiryTitleOperation operation
            */
           public void receiveResultinquiryTitleOperation(
                    com.pccth.rdbservice.InquiryTitleOperationResponse result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from inquiryTitleOperation operation
           */
            public void receiveErrorinquiryTitleOperation(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for inquiryProductIncMastOperation method
            * override this method for handling normal response from inquiryProductIncMastOperation operation
            */
           public void receiveResultinquiryProductIncMastOperation(
                    com.pccth.rdbservice.InquiryProductIncMastOperationResponse result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from inquiryProductIncMastOperation operation
           */
            public void receiveErrorinquiryProductIncMastOperation(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for inquiryCdProductUnitOperation method
            * override this method for handling normal response from inquiryCdProductUnitOperation operation
            */
           public void receiveResultinquiryCdProductUnitOperation(
                    com.pccth.rdbservice.InquiryCdProductUnitOperationResponse result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from inquiryCdProductUnitOperation operation
           */
            public void receiveErrorinquiryCdProductUnitOperation(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for inquiryObjRateOperation method
            * override this method for handling normal response from inquiryObjRateOperation operation
            */
           public void receiveResultinquiryObjRateOperation(
                    com.pccth.rdbservice.InquiryObjRateOperationResponse result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from inquiryObjRateOperation operation
           */
            public void receiveErrorinquiryObjRateOperation(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for inquiryMaterialOperation method
            * override this method for handling normal response from inquiryMaterialOperation operation
            */
           public void receiveResultinquiryMaterialOperation(
                    com.pccth.rdbservice.InquiryMaterialOperationResponse result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from inquiryMaterialOperation operation
           */
            public void receiveErrorinquiryMaterialOperation(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for inquiryDutyGroupOperation method
            * override this method for handling normal response from inquiryDutyGroupOperation operation
            */
           public void receiveResultinquiryDutyGroupOperation(
                    com.pccth.rdbservice.InquiryDutyGroupOperationResponse result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from inquiryDutyGroupOperation operation
           */
            public void receiveErrorinquiryDutyGroupOperation(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for inquiryDueDatePs0112Operation method
            * override this method for handling normal response from inquiryDueDatePs0112Operation operation
            */
           public void receiveResultinquiryDueDatePs0112Operation(
                    com.pccth.rdbservice.InquiryDueDatePs0112OperationResponse result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from inquiryDueDatePs0112Operation operation
           */
            public void receiveErrorinquiryDueDatePs0112Operation(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for inquiryTimeRateOperation method
            * override this method for handling normal response from inquiryTimeRateOperation operation
            */
           public void receiveResultinquiryTimeRateOperation(
                    com.pccth.rdbservice.InquiryTimeRateOperationResponse result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from inquiryTimeRateOperation operation
           */
            public void receiveErrorinquiryTimeRateOperation(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for inquiryCustomHouseOperation method
            * override this method for handling normal response from inquiryCustomHouseOperation operation
            */
           public void receiveResultinquiryCustomHouseOperation(
                    com.pccth.rdbservice.InquiryCustomHouseOperationResponse result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from inquiryCustomHouseOperation operation
           */
            public void receiveErrorinquiryCustomHouseOperation(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for inquiryCdCountryOperation method
            * override this method for handling normal response from inquiryCdCountryOperation operation
            */
           public void receiveResultinquiryCdCountryOperation(
                    com.pccth.rdbservice.InquiryCdCountryOperationResponse result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from inquiryCdCountryOperation operation
           */
            public void receiveErrorinquiryCdCountryOperation(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for inquiryStoreOperation method
            * override this method for handling normal response from inquiryStoreOperation operation
            */
           public void receiveResultinquiryStoreOperation(
                    com.pccth.rdbservice.InquiryStoreOperationResponse result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from inquiryStoreOperation operation
           */
            public void receiveErrorinquiryStoreOperation(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for inquiryDegreeOperation method
            * override this method for handling normal response from inquiryDegreeOperation operation
            */
           public void receiveResultinquiryDegreeOperation(
                    com.pccth.rdbservice.InquiryDegreeOperationResponse result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from inquiryDegreeOperation operation
           */
            public void receiveErrorinquiryDegreeOperation(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for inquiryHolidayOperation method
            * override this method for handling normal response from inquiryHolidayOperation operation
            */
           public void receiveResultinquiryHolidayOperation(
                    com.pccth.rdbservice.InquiryHolidayOperationResponse result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from inquiryHolidayOperation operation
           */
            public void receiveErrorinquiryHolidayOperation(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for inquiryFindAmphurOperation method
            * override this method for handling normal response from inquiryFindAmphurOperation operation
            */
           public void receiveResultinquiryFindAmphurOperation(
                    com.pccth.rdbservice.InquiryFindAmphurOperationResponse result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from inquiryFindAmphurOperation operation
           */
            public void receiveErrorinquiryFindAmphurOperation(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for inquiryEmbassyOperation method
            * override this method for handling normal response from inquiryEmbassyOperation operation
            */
           public void receiveResultinquiryEmbassyOperation(
                    com.pccth.rdbservice.InquiryEmbassyOperationResponse result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from inquiryEmbassyOperation operation
           */
            public void receiveErrorinquiryEmbassyOperation(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for inquiryZipCodeOperation method
            * override this method for handling normal response from inquiryZipCodeOperation operation
            */
           public void receiveResultinquiryZipCodeOperation(
                    com.pccth.rdbservice.InquiryZipCodeOperationResponse result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from inquiryZipCodeOperation operation
           */
            public void receiveErrorinquiryZipCodeOperation(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for inquirySystemParamOperation method
            * override this method for handling normal response from inquirySystemParamOperation operation
            */
           public void receiveResultinquirySystemParamOperation(
                    com.pccth.rdbservice.InquirySystemParamOperationResponse result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from inquirySystemParamOperation operation
           */
            public void receiveErrorinquirySystemParamOperation(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for inquiryAnacarGrpOperation method
            * override this method for handling normal response from inquiryAnacarGrpOperation operation
            */
           public void receiveResultinquiryAnacarGrpOperation(
                    com.pccth.rdbservice.InquiryAnacarGrpOperationResponse result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from inquiryAnacarGrpOperation operation
           */
            public void receiveErrorinquiryAnacarGrpOperation(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for inquiryAnacarSdOperation method
            * override this method for handling normal response from inquiryAnacarSdOperation operation
            */
           public void receiveResultinquiryAnacarSdOperation(
                    com.pccth.rdbservice.InquiryAnacarSdOperationResponse result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from inquiryAnacarSdOperation operation
           */
            public void receiveErrorinquiryAnacarSdOperation(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for inquiryTambolOperation method
            * override this method for handling normal response from inquiryTambolOperation operation
            */
           public void receiveResultinquiryTambolOperation(
                    com.pccth.rdbservice.InquiryTambolOperationResponse result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from inquiryTambolOperation operation
           */
            public void receiveErrorinquiryTambolOperation(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for inquiryIncomeTypeOperation method
            * override this method for handling normal response from inquiryIncomeTypeOperation operation
            */
           public void receiveResultinquiryIncomeTypeOperation(
                    com.pccth.rdbservice.InquiryIncomeTypeOperationResponse result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from inquiryIncomeTypeOperation operation
           */
            public void receiveErrorinquiryIncomeTypeOperation(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for inquiryFormCodeOperation method
            * override this method for handling normal response from inquiryFormCodeOperation operation
            */
           public void receiveResultinquiryFormCodeOperation(
                    com.pccth.rdbservice.InquiryFormCodeOperationResponse result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from inquiryFormCodeOperation operation
           */
            public void receiveErrorinquiryFormCodeOperation(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for inquiryVatSplitHdOperation method
            * override this method for handling normal response from inquiryVatSplitHdOperation operation
            */
           public void receiveResultinquiryVatSplitHdOperation(
                    com.pccth.rdbservice.InquiryVatSplitHdOperationResponse result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from inquiryVatSplitHdOperation operation
           */
            public void receiveErrorinquiryVatSplitHdOperation(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for inquiryLicenseHdOperation method
            * override this method for handling normal response from inquiryLicenseHdOperation operation
            */
           public void receiveResultinquiryLicenseHdOperation(
                    com.pccth.rdbservice.InquiryLicenseHdOperationResponse result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from inquiryLicenseHdOperation operation
           */
            public void receiveErrorinquiryLicenseHdOperation(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for inquiryDutyMaterialOperation method
            * override this method for handling normal response from inquiryDutyMaterialOperation operation
            */
           public void receiveResultinquiryDutyMaterialOperation(
                    com.pccth.rdbservice.InquiryDutyMaterialOperationResponse result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from inquiryDutyMaterialOperation operation
           */
            public void receiveErrorinquiryDutyMaterialOperation(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for inquiryProductOperation method
            * override this method for handling normal response from inquiryProductOperation operation
            */
           public void receiveResultinquiryProductOperation(
                    com.pccth.rdbservice.InquiryProductOperationResponse result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from inquiryProductOperation operation
           */
            public void receiveErrorinquiryProductOperation(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for inquiryVatSplitDetOperation method
            * override this method for handling normal response from inquiryVatSplitDetOperation operation
            */
           public void receiveResultinquiryVatSplitDetOperation(
                    com.pccth.rdbservice.InquiryVatSplitDetOperationResponse result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from inquiryVatSplitDetOperation operation
           */
            public void receiveErrorinquiryVatSplitDetOperation(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for inquirySssFundRateOperation method
            * override this method for handling normal response from inquirySssFundRateOperation operation
            */
           public void receiveResultinquirySssFundRateOperation(
                    com.pccth.rdbservice.InquirySssFundRateOperationResponse result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from inquirySssFundRateOperation operation
           */
            public void receiveErrorinquirySssFundRateOperation(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for inquiryCurrencyOperation method
            * override this method for handling normal response from inquiryCurrencyOperation operation
            */
           public void receiveResultinquiryCurrencyOperation(
                    com.pccth.rdbservice.InquiryCurrencyOperationResponse result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from inquiryCurrencyOperation operation
           */
            public void receiveErrorinquiryCurrencyOperation(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for inquiryProductTypeOperation method
            * override this method for handling normal response from inquiryProductTypeOperation operation
            */
           public void receiveResultinquiryProductTypeOperation(
                    com.pccth.rdbservice.InquiryProductTypeOperationResponse result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from inquiryProductTypeOperation operation
           */
            public void receiveErrorinquiryProductTypeOperation(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for inquiryBankBranchOperation method
            * override this method for handling normal response from inquiryBankBranchOperation operation
            */
           public void receiveResultinquiryBankBranchOperation(
                    com.pccth.rdbservice.InquiryBankBranchOperationResponse result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from inquiryBankBranchOperation operation
           */
            public void receiveErrorinquiryBankBranchOperation(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for inquiryIncMastOperation method
            * override this method for handling normal response from inquiryIncMastOperation operation
            */
           public void receiveResultinquiryIncMastOperation(
                    com.pccth.rdbservice.InquiryIncMastOperationResponse result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from inquiryIncMastOperation operation
           */
            public void receiveErrorinquiryIncMastOperation(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for inquiryHospitalOperation method
            * override this method for handling normal response from inquiryHospitalOperation operation
            */
           public void receiveResultinquiryHospitalOperation(
                    com.pccth.rdbservice.InquiryHospitalOperationResponse result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from inquiryHospitalOperation operation
           */
            public void receiveErrorinquiryHospitalOperation(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for inquiryStructureGoodsOperation method
            * override this method for handling normal response from inquiryStructureGoodsOperation operation
            */
           public void receiveResultinquiryStructureGoodsOperation(
                    com.pccth.rdbservice.InquiryStructureGoodsOperationResponse result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from inquiryStructureGoodsOperation operation
           */
            public void receiveErrorinquiryStructureGoodsOperation(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for inquiryLocalRateOperation method
            * override this method for handling normal response from inquiryLocalRateOperation operation
            */
           public void receiveResultinquiryLocalRateOperation(
                    com.pccth.rdbservice.InquiryLocalRateOperationResponse result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from inquiryLocalRateOperation operation
           */
            public void receiveErrorinquiryLocalRateOperation(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for inquiryProductUnitOperation method
            * override this method for handling normal response from inquiryProductUnitOperation operation
            */
           public void receiveResultinquiryProductUnitOperation(
                    com.pccth.rdbservice.InquiryProductUnitOperationResponse result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from inquiryProductUnitOperation operation
           */
            public void receiveErrorinquiryProductUnitOperation(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for inquiryEdiGoodsOperation method
            * override this method for handling normal response from inquiryEdiGoodsOperation operation
            */
           public void receiveResultinquiryEdiGoodsOperation(
                    com.pccth.rdbservice.InquiryEdiGoodsOperationResponse result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from inquiryEdiGoodsOperation operation
           */
            public void receiveErrorinquiryEdiGoodsOperation(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for inquiryOilFundRateOperation method
            * override this method for handling normal response from inquiryOilFundRateOperation operation
            */
           public void receiveResultinquiryOilFundRateOperation(
                    com.pccth.rdbservice.InquiryOilFundRateOperationResponse result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from inquiryOilFundRateOperation operation
           */
            public void receiveErrorinquiryOilFundRateOperation(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for inquiryFindTambolOperation method
            * override this method for handling normal response from inquiryFindTambolOperation operation
            */
           public void receiveResultinquiryFindTambolOperation(
                    com.pccth.rdbservice.InquiryFindTambolOperationResponse result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from inquiryFindTambolOperation operation
           */
            public void receiveErrorinquiryFindTambolOperation(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for inquiryAreaCodeOperation method
            * override this method for handling normal response from inquiryAreaCodeOperation operation
            */
           public void receiveResultinquiryAreaCodeOperation(
                    com.pccth.rdbservice.InquiryAreaCodeOperationResponse result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from inquiryAreaCodeOperation operation
           */
            public void receiveErrorinquiryAreaCodeOperation(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for inquiryAccMastOperation method
            * override this method for handling normal response from inquiryAccMastOperation operation
            */
           public void receiveResultinquiryAccMastOperation(
                    com.pccth.rdbservice.InquiryAccMastOperationResponse result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from inquiryAccMastOperation operation
           */
            public void receiveErrorinquiryAccMastOperation(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for inquiryEdOfficeOperation method
            * override this method for handling normal response from inquiryEdOfficeOperation operation
            */
           public void receiveResultinquiryEdOfficeOperation(
                    com.pccth.rdbservice.InquiryEdOfficeOperationResponse result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from inquiryEdOfficeOperation operation
           */
            public void receiveErrorinquiryEdOfficeOperation(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for inquiryDutyUnitOperation method
            * override this method for handling normal response from inquiryDutyUnitOperation operation
            */
           public void receiveResultinquiryDutyUnitOperation(
                    com.pccth.rdbservice.InquiryDutyUnitOperationResponse result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from inquiryDutyUnitOperation operation
           */
            public void receiveErrorinquiryDutyUnitOperation(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for inquiryBankOperation method
            * override this method for handling normal response from inquiryBankOperation operation
            */
           public void receiveResultinquiryBankOperation(
                    com.pccth.rdbservice.InquiryBankOperationResponse result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from inquiryBankOperation operation
           */
            public void receiveErrorinquiryBankOperation(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for inquiryEdiUnitMapOperation method
            * override this method for handling normal response from inquiryEdiUnitMapOperation operation
            */
           public void receiveResultinquiryEdiUnitMapOperation(
                    com.pccth.rdbservice.InquiryEdiUnitMapOperationResponse result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from inquiryEdiUnitMapOperation operation
           */
            public void receiveErrorinquiryEdiUnitMapOperation(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for inquiryProductSubTypeOperation method
            * override this method for handling normal response from inquiryProductSubTypeOperation operation
            */
           public void receiveResultinquiryProductSubTypeOperation(
                    com.pccth.rdbservice.InquiryProductSubTypeOperationResponse result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from inquiryProductSubTypeOperation operation
           */
            public void receiveErrorinquiryProductSubTypeOperation(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for inquiryImportCompOperation method
            * override this method for handling normal response from inquiryImportCompOperation operation
            */
           public void receiveResultinquiryImportCompOperation(
                    com.pccth.rdbservice.InquiryImportCompOperationResponse result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from inquiryImportCompOperation operation
           */
            public void receiveErrorinquiryImportCompOperation(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for inquiryCustomRateOperation method
            * override this method for handling normal response from inquiryCustomRateOperation operation
            */
           public void receiveResultinquiryCustomRateOperation(
                    com.pccth.rdbservice.InquiryCustomRateOperationResponse result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from inquiryCustomRateOperation operation
           */
            public void receiveErrorinquiryCustomRateOperation(java.lang.Exception e) {
            }
                


    }
    