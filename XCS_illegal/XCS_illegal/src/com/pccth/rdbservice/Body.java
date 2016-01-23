
/**
 * Body.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.6.2  Built on : Apr 17, 2012 (05:34:40 IST)
 */

            
                package com.pccth.rdbservice;
            

            /**
            *  Body bean class
            */
            @SuppressWarnings({"unchecked","unused"})
        
        public  class Body
        implements org.apache.axis2.databinding.ADBBean{
        /* This type was generated from the piece of schema that had
                name = Body
                Namespace URI = http://rdbservice.pccth.com/
                Namespace Prefix = ns1
                */
            

                        /**
                        * field for CdProductUnitInfo
                        * This was an Array!
                        */

                        
                                    protected com.pccth.rdbservice.CdProductUnitInfo[] localCdProductUnitInfo ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localCdProductUnitInfoTracker = false ;

                           public boolean isCdProductUnitInfoSpecified(){
                               return localCdProductUnitInfoTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return com.pccth.rdbservice.CdProductUnitInfo[]
                           */
                           public  com.pccth.rdbservice.CdProductUnitInfo[] getCdProductUnitInfo(){
                               return localCdProductUnitInfo;
                           }

                           
                        


                               
                              /**
                               * validate the array for CdProductUnitInfo
                               */
                              protected void validateCdProductUnitInfo(com.pccth.rdbservice.CdProductUnitInfo[] param){
                             
                              }


                             /**
                              * Auto generated setter method
                              * @param param CdProductUnitInfo
                              */
                              public void setCdProductUnitInfo(com.pccth.rdbservice.CdProductUnitInfo[] param){
                              
                                   validateCdProductUnitInfo(param);

                               localCdProductUnitInfoTracker = true;
                                      
                                      this.localCdProductUnitInfo=param;
                              }

                               
                             
                             /**
                             * Auto generated add method for the array for convenience
                             * @param param com.pccth.rdbservice.CdProductUnitInfo
                             */
                             public void addCdProductUnitInfo(com.pccth.rdbservice.CdProductUnitInfo param){
                                   if (localCdProductUnitInfo == null){
                                   localCdProductUnitInfo = new com.pccth.rdbservice.CdProductUnitInfo[]{};
                                   }

                            
                                 //update the setting tracker
                                localCdProductUnitInfoTracker = true;
                            

                               java.util.List list =
                            org.apache.axis2.databinding.utils.ConverterUtil.toList(localCdProductUnitInfo);
                               list.add(param);
                               this.localCdProductUnitInfo =
                             (com.pccth.rdbservice.CdProductUnitInfo[])list.toArray(
                            new com.pccth.rdbservice.CdProductUnitInfo[list.size()]);

                             }
                             

                        /**
                        * field for HospitalInfo
                        * This was an Array!
                        */

                        
                                    protected com.pccth.rdbservice.HospitalInfo[] localHospitalInfo ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localHospitalInfoTracker = false ;

                           public boolean isHospitalInfoSpecified(){
                               return localHospitalInfoTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return com.pccth.rdbservice.HospitalInfo[]
                           */
                           public  com.pccth.rdbservice.HospitalInfo[] getHospitalInfo(){
                               return localHospitalInfo;
                           }

                           
                        


                               
                              /**
                               * validate the array for HospitalInfo
                               */
                              protected void validateHospitalInfo(com.pccth.rdbservice.HospitalInfo[] param){
                             
                              }


                             /**
                              * Auto generated setter method
                              * @param param HospitalInfo
                              */
                              public void setHospitalInfo(com.pccth.rdbservice.HospitalInfo[] param){
                              
                                   validateHospitalInfo(param);

                               localHospitalInfoTracker = true;
                                      
                                      this.localHospitalInfo=param;
                              }

                               
                             
                             /**
                             * Auto generated add method for the array for convenience
                             * @param param com.pccth.rdbservice.HospitalInfo
                             */
                             public void addHospitalInfo(com.pccth.rdbservice.HospitalInfo param){
                                   if (localHospitalInfo == null){
                                   localHospitalInfo = new com.pccth.rdbservice.HospitalInfo[]{};
                                   }

                            
                                 //update the setting tracker
                                localHospitalInfoTracker = true;
                            

                               java.util.List list =
                            org.apache.axis2.databinding.utils.ConverterUtil.toList(localHospitalInfo);
                               list.add(param);
                               this.localHospitalInfo =
                             (com.pccth.rdbservice.HospitalInfo[])list.toArray(
                            new com.pccth.rdbservice.HospitalInfo[list.size()]);

                             }
                             

                        /**
                        * field for DegreeInfo
                        * This was an Array!
                        */

                        
                                    protected com.pccth.rdbservice.DegreeInfo[] localDegreeInfo ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localDegreeInfoTracker = false ;

                           public boolean isDegreeInfoSpecified(){
                               return localDegreeInfoTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return com.pccth.rdbservice.DegreeInfo[]
                           */
                           public  com.pccth.rdbservice.DegreeInfo[] getDegreeInfo(){
                               return localDegreeInfo;
                           }

                           
                        


                               
                              /**
                               * validate the array for DegreeInfo
                               */
                              protected void validateDegreeInfo(com.pccth.rdbservice.DegreeInfo[] param){
                             
                              }


                             /**
                              * Auto generated setter method
                              * @param param DegreeInfo
                              */
                              public void setDegreeInfo(com.pccth.rdbservice.DegreeInfo[] param){
                              
                                   validateDegreeInfo(param);

                               localDegreeInfoTracker = true;
                                      
                                      this.localDegreeInfo=param;
                              }

                               
                             
                             /**
                             * Auto generated add method for the array for convenience
                             * @param param com.pccth.rdbservice.DegreeInfo
                             */
                             public void addDegreeInfo(com.pccth.rdbservice.DegreeInfo param){
                                   if (localDegreeInfo == null){
                                   localDegreeInfo = new com.pccth.rdbservice.DegreeInfo[]{};
                                   }

                            
                                 //update the setting tracker
                                localDegreeInfoTracker = true;
                            

                               java.util.List list =
                            org.apache.axis2.databinding.utils.ConverterUtil.toList(localDegreeInfo);
                               list.add(param);
                               this.localDegreeInfo =
                             (com.pccth.rdbservice.DegreeInfo[])list.toArray(
                            new com.pccth.rdbservice.DegreeInfo[list.size()]);

                             }
                             

                        /**
                        * field for ZipCodeInfo
                        * This was an Array!
                        */

                        
                                    protected com.pccth.rdbservice.ZipCodeInfo[] localZipCodeInfo ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localZipCodeInfoTracker = false ;

                           public boolean isZipCodeInfoSpecified(){
                               return localZipCodeInfoTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return com.pccth.rdbservice.ZipCodeInfo[]
                           */
                           public  com.pccth.rdbservice.ZipCodeInfo[] getZipCodeInfo(){
                               return localZipCodeInfo;
                           }

                           
                        


                               
                              /**
                               * validate the array for ZipCodeInfo
                               */
                              protected void validateZipCodeInfo(com.pccth.rdbservice.ZipCodeInfo[] param){
                             
                              }


                             /**
                              * Auto generated setter method
                              * @param param ZipCodeInfo
                              */
                              public void setZipCodeInfo(com.pccth.rdbservice.ZipCodeInfo[] param){
                              
                                   validateZipCodeInfo(param);

                               localZipCodeInfoTracker = true;
                                      
                                      this.localZipCodeInfo=param;
                              }

                               
                             
                             /**
                             * Auto generated add method for the array for convenience
                             * @param param com.pccth.rdbservice.ZipCodeInfo
                             */
                             public void addZipCodeInfo(com.pccth.rdbservice.ZipCodeInfo param){
                                   if (localZipCodeInfo == null){
                                   localZipCodeInfo = new com.pccth.rdbservice.ZipCodeInfo[]{};
                                   }

                            
                                 //update the setting tracker
                                localZipCodeInfoTracker = true;
                            

                               java.util.List list =
                            org.apache.axis2.databinding.utils.ConverterUtil.toList(localZipCodeInfo);
                               list.add(param);
                               this.localZipCodeInfo =
                             (com.pccth.rdbservice.ZipCodeInfo[])list.toArray(
                            new com.pccth.rdbservice.ZipCodeInfo[list.size()]);

                             }
                             

                        /**
                        * field for TimeRateInfo
                        * This was an Array!
                        */

                        
                                    protected com.pccth.rdbservice.TimeRateInfo[] localTimeRateInfo ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localTimeRateInfoTracker = false ;

                           public boolean isTimeRateInfoSpecified(){
                               return localTimeRateInfoTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return com.pccth.rdbservice.TimeRateInfo[]
                           */
                           public  com.pccth.rdbservice.TimeRateInfo[] getTimeRateInfo(){
                               return localTimeRateInfo;
                           }

                           
                        


                               
                              /**
                               * validate the array for TimeRateInfo
                               */
                              protected void validateTimeRateInfo(com.pccth.rdbservice.TimeRateInfo[] param){
                             
                              }


                             /**
                              * Auto generated setter method
                              * @param param TimeRateInfo
                              */
                              public void setTimeRateInfo(com.pccth.rdbservice.TimeRateInfo[] param){
                              
                                   validateTimeRateInfo(param);

                               localTimeRateInfoTracker = true;
                                      
                                      this.localTimeRateInfo=param;
                              }

                               
                             
                             /**
                             * Auto generated add method for the array for convenience
                             * @param param com.pccth.rdbservice.TimeRateInfo
                             */
                             public void addTimeRateInfo(com.pccth.rdbservice.TimeRateInfo param){
                                   if (localTimeRateInfo == null){
                                   localTimeRateInfo = new com.pccth.rdbservice.TimeRateInfo[]{};
                                   }

                            
                                 //update the setting tracker
                                localTimeRateInfoTracker = true;
                            

                               java.util.List list =
                            org.apache.axis2.databinding.utils.ConverterUtil.toList(localTimeRateInfo);
                               list.add(param);
                               this.localTimeRateInfo =
                             (com.pccth.rdbservice.TimeRateInfo[])list.toArray(
                            new com.pccth.rdbservice.TimeRateInfo[list.size()]);

                             }
                             

                        /**
                        * field for EmbassyInfo
                        * This was an Array!
                        */

                        
                                    protected com.pccth.rdbservice.EmbassyInfo[] localEmbassyInfo ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localEmbassyInfoTracker = false ;

                           public boolean isEmbassyInfoSpecified(){
                               return localEmbassyInfoTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return com.pccth.rdbservice.EmbassyInfo[]
                           */
                           public  com.pccth.rdbservice.EmbassyInfo[] getEmbassyInfo(){
                               return localEmbassyInfo;
                           }

                           
                        


                               
                              /**
                               * validate the array for EmbassyInfo
                               */
                              protected void validateEmbassyInfo(com.pccth.rdbservice.EmbassyInfo[] param){
                             
                              }


                             /**
                              * Auto generated setter method
                              * @param param EmbassyInfo
                              */
                              public void setEmbassyInfo(com.pccth.rdbservice.EmbassyInfo[] param){
                              
                                   validateEmbassyInfo(param);

                               localEmbassyInfoTracker = true;
                                      
                                      this.localEmbassyInfo=param;
                              }

                               
                             
                             /**
                             * Auto generated add method for the array for convenience
                             * @param param com.pccth.rdbservice.EmbassyInfo
                             */
                             public void addEmbassyInfo(com.pccth.rdbservice.EmbassyInfo param){
                                   if (localEmbassyInfo == null){
                                   localEmbassyInfo = new com.pccth.rdbservice.EmbassyInfo[]{};
                                   }

                            
                                 //update the setting tracker
                                localEmbassyInfoTracker = true;
                            

                               java.util.List list =
                            org.apache.axis2.databinding.utils.ConverterUtil.toList(localEmbassyInfo);
                               list.add(param);
                               this.localEmbassyInfo =
                             (com.pccth.rdbservice.EmbassyInfo[])list.toArray(
                            new com.pccth.rdbservice.EmbassyInfo[list.size()]);

                             }
                             

                        /**
                        * field for TitleInfo
                        * This was an Array!
                        */

                        
                                    protected com.pccth.rdbservice.TitleInfo[] localTitleInfo ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localTitleInfoTracker = false ;

                           public boolean isTitleInfoSpecified(){
                               return localTitleInfoTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return com.pccth.rdbservice.TitleInfo[]
                           */
                           public  com.pccth.rdbservice.TitleInfo[] getTitleInfo(){
                               return localTitleInfo;
                           }

                           
                        


                               
                              /**
                               * validate the array for TitleInfo
                               */
                              protected void validateTitleInfo(com.pccth.rdbservice.TitleInfo[] param){
                             
                              }


                             /**
                              * Auto generated setter method
                              * @param param TitleInfo
                              */
                              public void setTitleInfo(com.pccth.rdbservice.TitleInfo[] param){
                              
                                   validateTitleInfo(param);

                               localTitleInfoTracker = true;
                                      
                                      this.localTitleInfo=param;
                              }

                               
                             
                             /**
                             * Auto generated add method for the array for convenience
                             * @param param com.pccth.rdbservice.TitleInfo
                             */
                             public void addTitleInfo(com.pccth.rdbservice.TitleInfo param){
                                   if (localTitleInfo == null){
                                   localTitleInfo = new com.pccth.rdbservice.TitleInfo[]{};
                                   }

                            
                                 //update the setting tracker
                                localTitleInfoTracker = true;
                            

                               java.util.List list =
                            org.apache.axis2.databinding.utils.ConverterUtil.toList(localTitleInfo);
                               list.add(param);
                               this.localTitleInfo =
                             (com.pccth.rdbservice.TitleInfo[])list.toArray(
                            new com.pccth.rdbservice.TitleInfo[list.size()]);

                             }
                             

                        /**
                        * field for AnacarGrpInfo
                        * This was an Array!
                        */

                        
                                    protected com.pccth.rdbservice.AnacarGrpInfo[] localAnacarGrpInfo ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localAnacarGrpInfoTracker = false ;

                           public boolean isAnacarGrpInfoSpecified(){
                               return localAnacarGrpInfoTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return com.pccth.rdbservice.AnacarGrpInfo[]
                           */
                           public  com.pccth.rdbservice.AnacarGrpInfo[] getAnacarGrpInfo(){
                               return localAnacarGrpInfo;
                           }

                           
                        


                               
                              /**
                               * validate the array for AnacarGrpInfo
                               */
                              protected void validateAnacarGrpInfo(com.pccth.rdbservice.AnacarGrpInfo[] param){
                             
                              }


                             /**
                              * Auto generated setter method
                              * @param param AnacarGrpInfo
                              */
                              public void setAnacarGrpInfo(com.pccth.rdbservice.AnacarGrpInfo[] param){
                              
                                   validateAnacarGrpInfo(param);

                               localAnacarGrpInfoTracker = true;
                                      
                                      this.localAnacarGrpInfo=param;
                              }

                               
                             
                             /**
                             * Auto generated add method for the array for convenience
                             * @param param com.pccth.rdbservice.AnacarGrpInfo
                             */
                             public void addAnacarGrpInfo(com.pccth.rdbservice.AnacarGrpInfo param){
                                   if (localAnacarGrpInfo == null){
                                   localAnacarGrpInfo = new com.pccth.rdbservice.AnacarGrpInfo[]{};
                                   }

                            
                                 //update the setting tracker
                                localAnacarGrpInfoTracker = true;
                            

                               java.util.List list =
                            org.apache.axis2.databinding.utils.ConverterUtil.toList(localAnacarGrpInfo);
                               list.add(param);
                               this.localAnacarGrpInfo =
                             (com.pccth.rdbservice.AnacarGrpInfo[])list.toArray(
                            new com.pccth.rdbservice.AnacarGrpInfo[list.size()]);

                             }
                             

                        /**
                        * field for ProductSubTypeInfo
                        * This was an Array!
                        */

                        
                                    protected com.pccth.rdbservice.ProductSubTypeInfo[] localProductSubTypeInfo ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localProductSubTypeInfoTracker = false ;

                           public boolean isProductSubTypeInfoSpecified(){
                               return localProductSubTypeInfoTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return com.pccth.rdbservice.ProductSubTypeInfo[]
                           */
                           public  com.pccth.rdbservice.ProductSubTypeInfo[] getProductSubTypeInfo(){
                               return localProductSubTypeInfo;
                           }

                           
                        


                               
                              /**
                               * validate the array for ProductSubTypeInfo
                               */
                              protected void validateProductSubTypeInfo(com.pccth.rdbservice.ProductSubTypeInfo[] param){
                             
                              }


                             /**
                              * Auto generated setter method
                              * @param param ProductSubTypeInfo
                              */
                              public void setProductSubTypeInfo(com.pccth.rdbservice.ProductSubTypeInfo[] param){
                              
                                   validateProductSubTypeInfo(param);

                               localProductSubTypeInfoTracker = true;
                                      
                                      this.localProductSubTypeInfo=param;
                              }

                               
                             
                             /**
                             * Auto generated add method for the array for convenience
                             * @param param com.pccth.rdbservice.ProductSubTypeInfo
                             */
                             public void addProductSubTypeInfo(com.pccth.rdbservice.ProductSubTypeInfo param){
                                   if (localProductSubTypeInfo == null){
                                   localProductSubTypeInfo = new com.pccth.rdbservice.ProductSubTypeInfo[]{};
                                   }

                            
                                 //update the setting tracker
                                localProductSubTypeInfoTracker = true;
                            

                               java.util.List list =
                            org.apache.axis2.databinding.utils.ConverterUtil.toList(localProductSubTypeInfo);
                               list.add(param);
                               this.localProductSubTypeInfo =
                             (com.pccth.rdbservice.ProductSubTypeInfo[])list.toArray(
                            new com.pccth.rdbservice.ProductSubTypeInfo[list.size()]);

                             }
                             

                        /**
                        * field for AreaCodeInfo
                        * This was an Array!
                        */

                        
                                    protected com.pccth.rdbservice.AreaCodeInfo[] localAreaCodeInfo ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localAreaCodeInfoTracker = false ;

                           public boolean isAreaCodeInfoSpecified(){
                               return localAreaCodeInfoTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return com.pccth.rdbservice.AreaCodeInfo[]
                           */
                           public  com.pccth.rdbservice.AreaCodeInfo[] getAreaCodeInfo(){
                               return localAreaCodeInfo;
                           }

                           
                        


                               
                              /**
                               * validate the array for AreaCodeInfo
                               */
                              protected void validateAreaCodeInfo(com.pccth.rdbservice.AreaCodeInfo[] param){
                             
                              }


                             /**
                              * Auto generated setter method
                              * @param param AreaCodeInfo
                              */
                              public void setAreaCodeInfo(com.pccth.rdbservice.AreaCodeInfo[] param){
                              
                                   validateAreaCodeInfo(param);

                               localAreaCodeInfoTracker = true;
                                      
                                      this.localAreaCodeInfo=param;
                              }

                               
                             
                             /**
                             * Auto generated add method for the array for convenience
                             * @param param com.pccth.rdbservice.AreaCodeInfo
                             */
                             public void addAreaCodeInfo(com.pccth.rdbservice.AreaCodeInfo param){
                                   if (localAreaCodeInfo == null){
                                   localAreaCodeInfo = new com.pccth.rdbservice.AreaCodeInfo[]{};
                                   }

                            
                                 //update the setting tracker
                                localAreaCodeInfoTracker = true;
                            

                               java.util.List list =
                            org.apache.axis2.databinding.utils.ConverterUtil.toList(localAreaCodeInfo);
                               list.add(param);
                               this.localAreaCodeInfo =
                             (com.pccth.rdbservice.AreaCodeInfo[])list.toArray(
                            new com.pccth.rdbservice.AreaCodeInfo[list.size()]);

                             }
                             

                        /**
                        * field for VatRateInfo
                        * This was an Array!
                        */

                        
                                    protected com.pccth.rdbservice.VatRateInfo[] localVatRateInfo ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localVatRateInfoTracker = false ;

                           public boolean isVatRateInfoSpecified(){
                               return localVatRateInfoTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return com.pccth.rdbservice.VatRateInfo[]
                           */
                           public  com.pccth.rdbservice.VatRateInfo[] getVatRateInfo(){
                               return localVatRateInfo;
                           }

                           
                        


                               
                              /**
                               * validate the array for VatRateInfo
                               */
                              protected void validateVatRateInfo(com.pccth.rdbservice.VatRateInfo[] param){
                             
                              }


                             /**
                              * Auto generated setter method
                              * @param param VatRateInfo
                              */
                              public void setVatRateInfo(com.pccth.rdbservice.VatRateInfo[] param){
                              
                                   validateVatRateInfo(param);

                               localVatRateInfoTracker = true;
                                      
                                      this.localVatRateInfo=param;
                              }

                               
                             
                             /**
                             * Auto generated add method for the array for convenience
                             * @param param com.pccth.rdbservice.VatRateInfo
                             */
                             public void addVatRateInfo(com.pccth.rdbservice.VatRateInfo param){
                                   if (localVatRateInfo == null){
                                   localVatRateInfo = new com.pccth.rdbservice.VatRateInfo[]{};
                                   }

                            
                                 //update the setting tracker
                                localVatRateInfoTracker = true;
                            

                               java.util.List list =
                            org.apache.axis2.databinding.utils.ConverterUtil.toList(localVatRateInfo);
                               list.add(param);
                               this.localVatRateInfo =
                             (com.pccth.rdbservice.VatRateInfo[])list.toArray(
                            new com.pccth.rdbservice.VatRateInfo[list.size()]);

                             }
                             

                        /**
                        * field for CountryInfo
                        * This was an Array!
                        */

                        
                                    protected com.pccth.rdbservice.CountryInfo[] localCountryInfo ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localCountryInfoTracker = false ;

                           public boolean isCountryInfoSpecified(){
                               return localCountryInfoTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return com.pccth.rdbservice.CountryInfo[]
                           */
                           public  com.pccth.rdbservice.CountryInfo[] getCountryInfo(){
                               return localCountryInfo;
                           }

                           
                        


                               
                              /**
                               * validate the array for CountryInfo
                               */
                              protected void validateCountryInfo(com.pccth.rdbservice.CountryInfo[] param){
                             
                              }


                             /**
                              * Auto generated setter method
                              * @param param CountryInfo
                              */
                              public void setCountryInfo(com.pccth.rdbservice.CountryInfo[] param){
                              
                                   validateCountryInfo(param);

                               localCountryInfoTracker = true;
                                      
                                      this.localCountryInfo=param;
                              }

                               
                             
                             /**
                             * Auto generated add method for the array for convenience
                             * @param param com.pccth.rdbservice.CountryInfo
                             */
                             public void addCountryInfo(com.pccth.rdbservice.CountryInfo param){
                                   if (localCountryInfo == null){
                                   localCountryInfo = new com.pccth.rdbservice.CountryInfo[]{};
                                   }

                            
                                 //update the setting tracker
                                localCountryInfoTracker = true;
                            

                               java.util.List list =
                            org.apache.axis2.databinding.utils.ConverterUtil.toList(localCountryInfo);
                               list.add(param);
                               this.localCountryInfo =
                             (com.pccth.rdbservice.CountryInfo[])list.toArray(
                            new com.pccth.rdbservice.CountryInfo[list.size()]);

                             }
                             

                        /**
                        * field for ApproveLevelInfo
                        * This was an Array!
                        */

                        
                                    protected com.pccth.rdbservice.ApproveLevelInfo[] localApproveLevelInfo ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localApproveLevelInfoTracker = false ;

                           public boolean isApproveLevelInfoSpecified(){
                               return localApproveLevelInfoTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return com.pccth.rdbservice.ApproveLevelInfo[]
                           */
                           public  com.pccth.rdbservice.ApproveLevelInfo[] getApproveLevelInfo(){
                               return localApproveLevelInfo;
                           }

                           
                        


                               
                              /**
                               * validate the array for ApproveLevelInfo
                               */
                              protected void validateApproveLevelInfo(com.pccth.rdbservice.ApproveLevelInfo[] param){
                             
                              }


                             /**
                              * Auto generated setter method
                              * @param param ApproveLevelInfo
                              */
                              public void setApproveLevelInfo(com.pccth.rdbservice.ApproveLevelInfo[] param){
                              
                                   validateApproveLevelInfo(param);

                               localApproveLevelInfoTracker = true;
                                      
                                      this.localApproveLevelInfo=param;
                              }

                               
                             
                             /**
                             * Auto generated add method for the array for convenience
                             * @param param com.pccth.rdbservice.ApproveLevelInfo
                             */
                             public void addApproveLevelInfo(com.pccth.rdbservice.ApproveLevelInfo param){
                                   if (localApproveLevelInfo == null){
                                   localApproveLevelInfo = new com.pccth.rdbservice.ApproveLevelInfo[]{};
                                   }

                            
                                 //update the setting tracker
                                localApproveLevelInfoTracker = true;
                            

                               java.util.List list =
                            org.apache.axis2.databinding.utils.ConverterUtil.toList(localApproveLevelInfo);
                               list.add(param);
                               this.localApproveLevelInfo =
                             (com.pccth.rdbservice.ApproveLevelInfo[])list.toArray(
                            new com.pccth.rdbservice.ApproveLevelInfo[list.size()]);

                             }
                             

                        /**
                        * field for AccMastInfo
                        * This was an Array!
                        */

                        
                                    protected com.pccth.rdbservice.AccMastInfo[] localAccMastInfo ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localAccMastInfoTracker = false ;

                           public boolean isAccMastInfoSpecified(){
                               return localAccMastInfoTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return com.pccth.rdbservice.AccMastInfo[]
                           */
                           public  com.pccth.rdbservice.AccMastInfo[] getAccMastInfo(){
                               return localAccMastInfo;
                           }

                           
                        


                               
                              /**
                               * validate the array for AccMastInfo
                               */
                              protected void validateAccMastInfo(com.pccth.rdbservice.AccMastInfo[] param){
                             
                              }


                             /**
                              * Auto generated setter method
                              * @param param AccMastInfo
                              */
                              public void setAccMastInfo(com.pccth.rdbservice.AccMastInfo[] param){
                              
                                   validateAccMastInfo(param);

                               localAccMastInfoTracker = true;
                                      
                                      this.localAccMastInfo=param;
                              }

                               
                             
                             /**
                             * Auto generated add method for the array for convenience
                             * @param param com.pccth.rdbservice.AccMastInfo
                             */
                             public void addAccMastInfo(com.pccth.rdbservice.AccMastInfo param){
                                   if (localAccMastInfo == null){
                                   localAccMastInfo = new com.pccth.rdbservice.AccMastInfo[]{};
                                   }

                            
                                 //update the setting tracker
                                localAccMastInfoTracker = true;
                            

                               java.util.List list =
                            org.apache.axis2.databinding.utils.ConverterUtil.toList(localAccMastInfo);
                               list.add(param);
                               this.localAccMastInfo =
                             (com.pccth.rdbservice.AccMastInfo[])list.toArray(
                            new com.pccth.rdbservice.AccMastInfo[list.size()]);

                             }
                             

                        /**
                        * field for FormCodeInfo
                        * This was an Array!
                        */

                        
                                    protected com.pccth.rdbservice.FormCodeInfo[] localFormCodeInfo ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localFormCodeInfoTracker = false ;

                           public boolean isFormCodeInfoSpecified(){
                               return localFormCodeInfoTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return com.pccth.rdbservice.FormCodeInfo[]
                           */
                           public  com.pccth.rdbservice.FormCodeInfo[] getFormCodeInfo(){
                               return localFormCodeInfo;
                           }

                           
                        


                               
                              /**
                               * validate the array for FormCodeInfo
                               */
                              protected void validateFormCodeInfo(com.pccth.rdbservice.FormCodeInfo[] param){
                             
                              }


                             /**
                              * Auto generated setter method
                              * @param param FormCodeInfo
                              */
                              public void setFormCodeInfo(com.pccth.rdbservice.FormCodeInfo[] param){
                              
                                   validateFormCodeInfo(param);

                               localFormCodeInfoTracker = true;
                                      
                                      this.localFormCodeInfo=param;
                              }

                               
                             
                             /**
                             * Auto generated add method for the array for convenience
                             * @param param com.pccth.rdbservice.FormCodeInfo
                             */
                             public void addFormCodeInfo(com.pccth.rdbservice.FormCodeInfo param){
                                   if (localFormCodeInfo == null){
                                   localFormCodeInfo = new com.pccth.rdbservice.FormCodeInfo[]{};
                                   }

                            
                                 //update the setting tracker
                                localFormCodeInfoTracker = true;
                            

                               java.util.List list =
                            org.apache.axis2.databinding.utils.ConverterUtil.toList(localFormCodeInfo);
                               list.add(param);
                               this.localFormCodeInfo =
                             (com.pccth.rdbservice.FormCodeInfo[])list.toArray(
                            new com.pccth.rdbservice.FormCodeInfo[list.size()]);

                             }
                             

                        /**
                        * field for CurrencyInfo
                        * This was an Array!
                        */

                        
                                    protected com.pccth.rdbservice.CurrencyInfo[] localCurrencyInfo ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localCurrencyInfoTracker = false ;

                           public boolean isCurrencyInfoSpecified(){
                               return localCurrencyInfoTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return com.pccth.rdbservice.CurrencyInfo[]
                           */
                           public  com.pccth.rdbservice.CurrencyInfo[] getCurrencyInfo(){
                               return localCurrencyInfo;
                           }

                           
                        


                               
                              /**
                               * validate the array for CurrencyInfo
                               */
                              protected void validateCurrencyInfo(com.pccth.rdbservice.CurrencyInfo[] param){
                             
                              }


                             /**
                              * Auto generated setter method
                              * @param param CurrencyInfo
                              */
                              public void setCurrencyInfo(com.pccth.rdbservice.CurrencyInfo[] param){
                              
                                   validateCurrencyInfo(param);

                               localCurrencyInfoTracker = true;
                                      
                                      this.localCurrencyInfo=param;
                              }

                               
                             
                             /**
                             * Auto generated add method for the array for convenience
                             * @param param com.pccth.rdbservice.CurrencyInfo
                             */
                             public void addCurrencyInfo(com.pccth.rdbservice.CurrencyInfo param){
                                   if (localCurrencyInfo == null){
                                   localCurrencyInfo = new com.pccth.rdbservice.CurrencyInfo[]{};
                                   }

                            
                                 //update the setting tracker
                                localCurrencyInfoTracker = true;
                            

                               java.util.List list =
                            org.apache.axis2.databinding.utils.ConverterUtil.toList(localCurrencyInfo);
                               list.add(param);
                               this.localCurrencyInfo =
                             (com.pccth.rdbservice.CurrencyInfo[])list.toArray(
                            new com.pccth.rdbservice.CurrencyInfo[list.size()]);

                             }
                             

                        /**
                        * field for ObjRateInfo
                        * This was an Array!
                        */

                        
                                    protected com.pccth.rdbservice.ObjRateInfo[] localObjRateInfo ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localObjRateInfoTracker = false ;

                           public boolean isObjRateInfoSpecified(){
                               return localObjRateInfoTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return com.pccth.rdbservice.ObjRateInfo[]
                           */
                           public  com.pccth.rdbservice.ObjRateInfo[] getObjRateInfo(){
                               return localObjRateInfo;
                           }

                           
                        


                               
                              /**
                               * validate the array for ObjRateInfo
                               */
                              protected void validateObjRateInfo(com.pccth.rdbservice.ObjRateInfo[] param){
                             
                              }


                             /**
                              * Auto generated setter method
                              * @param param ObjRateInfo
                              */
                              public void setObjRateInfo(com.pccth.rdbservice.ObjRateInfo[] param){
                              
                                   validateObjRateInfo(param);

                               localObjRateInfoTracker = true;
                                      
                                      this.localObjRateInfo=param;
                              }

                               
                             
                             /**
                             * Auto generated add method for the array for convenience
                             * @param param com.pccth.rdbservice.ObjRateInfo
                             */
                             public void addObjRateInfo(com.pccth.rdbservice.ObjRateInfo param){
                                   if (localObjRateInfo == null){
                                   localObjRateInfo = new com.pccth.rdbservice.ObjRateInfo[]{};
                                   }

                            
                                 //update the setting tracker
                                localObjRateInfoTracker = true;
                            

                               java.util.List list =
                            org.apache.axis2.databinding.utils.ConverterUtil.toList(localObjRateInfo);
                               list.add(param);
                               this.localObjRateInfo =
                             (com.pccth.rdbservice.ObjRateInfo[])list.toArray(
                            new com.pccth.rdbservice.ObjRateInfo[list.size()]);

                             }
                             

                        /**
                        * field for ReturnDesc
                        */

                        
                                    protected java.lang.String localReturnDesc ;
                                

                           /**
                           * Auto generated getter method
                           * @return java.lang.String
                           */
                           public  java.lang.String getReturnDesc(){
                               return localReturnDesc;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param ReturnDesc
                               */
                               public void setReturnDesc(java.lang.String param){
                            
                                            this.localReturnDesc=param;
                                    

                               }
                            

                        /**
                        * field for CusGrpInfo
                        * This was an Array!
                        */

                        
                                    protected com.pccth.rdbservice.CusGrpInfo[] localCusGrpInfo ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localCusGrpInfoTracker = false ;

                           public boolean isCusGrpInfoSpecified(){
                               return localCusGrpInfoTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return com.pccth.rdbservice.CusGrpInfo[]
                           */
                           public  com.pccth.rdbservice.CusGrpInfo[] getCusGrpInfo(){
                               return localCusGrpInfo;
                           }

                           
                        


                               
                              /**
                               * validate the array for CusGrpInfo
                               */
                              protected void validateCusGrpInfo(com.pccth.rdbservice.CusGrpInfo[] param){
                             
                              }


                             /**
                              * Auto generated setter method
                              * @param param CusGrpInfo
                              */
                              public void setCusGrpInfo(com.pccth.rdbservice.CusGrpInfo[] param){
                              
                                   validateCusGrpInfo(param);

                               localCusGrpInfoTracker = true;
                                      
                                      this.localCusGrpInfo=param;
                              }

                               
                             
                             /**
                             * Auto generated add method for the array for convenience
                             * @param param com.pccth.rdbservice.CusGrpInfo
                             */
                             public void addCusGrpInfo(com.pccth.rdbservice.CusGrpInfo param){
                                   if (localCusGrpInfo == null){
                                   localCusGrpInfo = new com.pccth.rdbservice.CusGrpInfo[]{};
                                   }

                            
                                 //update the setting tracker
                                localCusGrpInfoTracker = true;
                            

                               java.util.List list =
                            org.apache.axis2.databinding.utils.ConverterUtil.toList(localCusGrpInfo);
                               list.add(param);
                               this.localCusGrpInfo =
                             (com.pccth.rdbservice.CusGrpInfo[])list.toArray(
                            new com.pccth.rdbservice.CusGrpInfo[list.size()]);

                             }
                             

                        /**
                        * field for AnacarSdInfo
                        * This was an Array!
                        */

                        
                                    protected com.pccth.rdbservice.AnacarSdInfo[] localAnacarSdInfo ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localAnacarSdInfoTracker = false ;

                           public boolean isAnacarSdInfoSpecified(){
                               return localAnacarSdInfoTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return com.pccth.rdbservice.AnacarSdInfo[]
                           */
                           public  com.pccth.rdbservice.AnacarSdInfo[] getAnacarSdInfo(){
                               return localAnacarSdInfo;
                           }

                           
                        


                               
                              /**
                               * validate the array for AnacarSdInfo
                               */
                              protected void validateAnacarSdInfo(com.pccth.rdbservice.AnacarSdInfo[] param){
                             
                              }


                             /**
                              * Auto generated setter method
                              * @param param AnacarSdInfo
                              */
                              public void setAnacarSdInfo(com.pccth.rdbservice.AnacarSdInfo[] param){
                              
                                   validateAnacarSdInfo(param);

                               localAnacarSdInfoTracker = true;
                                      
                                      this.localAnacarSdInfo=param;
                              }

                               
                             
                             /**
                             * Auto generated add method for the array for convenience
                             * @param param com.pccth.rdbservice.AnacarSdInfo
                             */
                             public void addAnacarSdInfo(com.pccth.rdbservice.AnacarSdInfo param){
                                   if (localAnacarSdInfo == null){
                                   localAnacarSdInfo = new com.pccth.rdbservice.AnacarSdInfo[]{};
                                   }

                            
                                 //update the setting tracker
                                localAnacarSdInfoTracker = true;
                            

                               java.util.List list =
                            org.apache.axis2.databinding.utils.ConverterUtil.toList(localAnacarSdInfo);
                               list.add(param);
                               this.localAnacarSdInfo =
                             (com.pccth.rdbservice.AnacarSdInfo[])list.toArray(
                            new com.pccth.rdbservice.AnacarSdInfo[list.size()]);

                             }
                             

                        /**
                        * field for StructureGoodsInfo
                        * This was an Array!
                        */

                        
                                    protected com.pccth.rdbservice.StructureGoodsInfo[] localStructureGoodsInfo ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localStructureGoodsInfoTracker = false ;

                           public boolean isStructureGoodsInfoSpecified(){
                               return localStructureGoodsInfoTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return com.pccth.rdbservice.StructureGoodsInfo[]
                           */
                           public  com.pccth.rdbservice.StructureGoodsInfo[] getStructureGoodsInfo(){
                               return localStructureGoodsInfo;
                           }

                           
                        


                               
                              /**
                               * validate the array for StructureGoodsInfo
                               */
                              protected void validateStructureGoodsInfo(com.pccth.rdbservice.StructureGoodsInfo[] param){
                             
                              }


                             /**
                              * Auto generated setter method
                              * @param param StructureGoodsInfo
                              */
                              public void setStructureGoodsInfo(com.pccth.rdbservice.StructureGoodsInfo[] param){
                              
                                   validateStructureGoodsInfo(param);

                               localStructureGoodsInfoTracker = true;
                                      
                                      this.localStructureGoodsInfo=param;
                              }

                               
                             
                             /**
                             * Auto generated add method for the array for convenience
                             * @param param com.pccth.rdbservice.StructureGoodsInfo
                             */
                             public void addStructureGoodsInfo(com.pccth.rdbservice.StructureGoodsInfo param){
                                   if (localStructureGoodsInfo == null){
                                   localStructureGoodsInfo = new com.pccth.rdbservice.StructureGoodsInfo[]{};
                                   }

                            
                                 //update the setting tracker
                                localStructureGoodsInfoTracker = true;
                            

                               java.util.List list =
                            org.apache.axis2.databinding.utils.ConverterUtil.toList(localStructureGoodsInfo);
                               list.add(param);
                               this.localStructureGoodsInfo =
                             (com.pccth.rdbservice.StructureGoodsInfo[])list.toArray(
                            new com.pccth.rdbservice.StructureGoodsInfo[list.size()]);

                             }
                             

                        /**
                        * field for IncMastInfo
                        * This was an Array!
                        */

                        
                                    protected com.pccth.rdbservice.IncMastInfo[] localIncMastInfo ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localIncMastInfoTracker = false ;

                           public boolean isIncMastInfoSpecified(){
                               return localIncMastInfoTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return com.pccth.rdbservice.IncMastInfo[]
                           */
                           public  com.pccth.rdbservice.IncMastInfo[] getIncMastInfo(){
                               return localIncMastInfo;
                           }

                           
                        


                               
                              /**
                               * validate the array for IncMastInfo
                               */
                              protected void validateIncMastInfo(com.pccth.rdbservice.IncMastInfo[] param){
                             
                              }


                             /**
                              * Auto generated setter method
                              * @param param IncMastInfo
                              */
                              public void setIncMastInfo(com.pccth.rdbservice.IncMastInfo[] param){
                              
                                   validateIncMastInfo(param);

                               localIncMastInfoTracker = true;
                                      
                                      this.localIncMastInfo=param;
                              }

                               
                             
                             /**
                             * Auto generated add method for the array for convenience
                             * @param param com.pccth.rdbservice.IncMastInfo
                             */
                             public void addIncMastInfo(com.pccth.rdbservice.IncMastInfo param){
                                   if (localIncMastInfo == null){
                                   localIncMastInfo = new com.pccth.rdbservice.IncMastInfo[]{};
                                   }

                            
                                 //update the setting tracker
                                localIncMastInfoTracker = true;
                            

                               java.util.List list =
                            org.apache.axis2.databinding.utils.ConverterUtil.toList(localIncMastInfo);
                               list.add(param);
                               this.localIncMastInfo =
                             (com.pccth.rdbservice.IncMastInfo[])list.toArray(
                            new com.pccth.rdbservice.IncMastInfo[list.size()]);

                             }
                             

                        /**
                        * field for DutyUnitInfo
                        * This was an Array!
                        */

                        
                                    protected com.pccth.rdbservice.DutyUnitInfo[] localDutyUnitInfo ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localDutyUnitInfoTracker = false ;

                           public boolean isDutyUnitInfoSpecified(){
                               return localDutyUnitInfoTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return com.pccth.rdbservice.DutyUnitInfo[]
                           */
                           public  com.pccth.rdbservice.DutyUnitInfo[] getDutyUnitInfo(){
                               return localDutyUnitInfo;
                           }

                           
                        


                               
                              /**
                               * validate the array for DutyUnitInfo
                               */
                              protected void validateDutyUnitInfo(com.pccth.rdbservice.DutyUnitInfo[] param){
                             
                              }


                             /**
                              * Auto generated setter method
                              * @param param DutyUnitInfo
                              */
                              public void setDutyUnitInfo(com.pccth.rdbservice.DutyUnitInfo[] param){
                              
                                   validateDutyUnitInfo(param);

                               localDutyUnitInfoTracker = true;
                                      
                                      this.localDutyUnitInfo=param;
                              }

                               
                             
                             /**
                             * Auto generated add method for the array for convenience
                             * @param param com.pccth.rdbservice.DutyUnitInfo
                             */
                             public void addDutyUnitInfo(com.pccth.rdbservice.DutyUnitInfo param){
                                   if (localDutyUnitInfo == null){
                                   localDutyUnitInfo = new com.pccth.rdbservice.DutyUnitInfo[]{};
                                   }

                            
                                 //update the setting tracker
                                localDutyUnitInfoTracker = true;
                            

                               java.util.List list =
                            org.apache.axis2.databinding.utils.ConverterUtil.toList(localDutyUnitInfo);
                               list.add(param);
                               this.localDutyUnitInfo =
                             (com.pccth.rdbservice.DutyUnitInfo[])list.toArray(
                            new com.pccth.rdbservice.DutyUnitInfo[list.size()]);

                             }
                             

                        /**
                        * field for CustomHouseInfo
                        * This was an Array!
                        */

                        
                                    protected com.pccth.rdbservice.CustomHouseInfo[] localCustomHouseInfo ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localCustomHouseInfoTracker = false ;

                           public boolean isCustomHouseInfoSpecified(){
                               return localCustomHouseInfoTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return com.pccth.rdbservice.CustomHouseInfo[]
                           */
                           public  com.pccth.rdbservice.CustomHouseInfo[] getCustomHouseInfo(){
                               return localCustomHouseInfo;
                           }

                           
                        


                               
                              /**
                               * validate the array for CustomHouseInfo
                               */
                              protected void validateCustomHouseInfo(com.pccth.rdbservice.CustomHouseInfo[] param){
                             
                              }


                             /**
                              * Auto generated setter method
                              * @param param CustomHouseInfo
                              */
                              public void setCustomHouseInfo(com.pccth.rdbservice.CustomHouseInfo[] param){
                              
                                   validateCustomHouseInfo(param);

                               localCustomHouseInfoTracker = true;
                                      
                                      this.localCustomHouseInfo=param;
                              }

                               
                             
                             /**
                             * Auto generated add method for the array for convenience
                             * @param param com.pccth.rdbservice.CustomHouseInfo
                             */
                             public void addCustomHouseInfo(com.pccth.rdbservice.CustomHouseInfo param){
                                   if (localCustomHouseInfo == null){
                                   localCustomHouseInfo = new com.pccth.rdbservice.CustomHouseInfo[]{};
                                   }

                            
                                 //update the setting tracker
                                localCustomHouseInfoTracker = true;
                            

                               java.util.List list =
                            org.apache.axis2.databinding.utils.ConverterUtil.toList(localCustomHouseInfo);
                               list.add(param);
                               this.localCustomHouseInfo =
                             (com.pccth.rdbservice.CustomHouseInfo[])list.toArray(
                            new com.pccth.rdbservice.CustomHouseInfo[list.size()]);

                             }
                             

                        /**
                        * field for TitleOldInfo
                        * This was an Array!
                        */

                        
                                    protected com.pccth.rdbservice.TitleOldInfo[] localTitleOldInfo ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localTitleOldInfoTracker = false ;

                           public boolean isTitleOldInfoSpecified(){
                               return localTitleOldInfoTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return com.pccth.rdbservice.TitleOldInfo[]
                           */
                           public  com.pccth.rdbservice.TitleOldInfo[] getTitleOldInfo(){
                               return localTitleOldInfo;
                           }

                           
                        


                               
                              /**
                               * validate the array for TitleOldInfo
                               */
                              protected void validateTitleOldInfo(com.pccth.rdbservice.TitleOldInfo[] param){
                             
                              }


                             /**
                              * Auto generated setter method
                              * @param param TitleOldInfo
                              */
                              public void setTitleOldInfo(com.pccth.rdbservice.TitleOldInfo[] param){
                              
                                   validateTitleOldInfo(param);

                               localTitleOldInfoTracker = true;
                                      
                                      this.localTitleOldInfo=param;
                              }

                               
                             
                             /**
                             * Auto generated add method for the array for convenience
                             * @param param com.pccth.rdbservice.TitleOldInfo
                             */
                             public void addTitleOldInfo(com.pccth.rdbservice.TitleOldInfo param){
                                   if (localTitleOldInfo == null){
                                   localTitleOldInfo = new com.pccth.rdbservice.TitleOldInfo[]{};
                                   }

                            
                                 //update the setting tracker
                                localTitleOldInfoTracker = true;
                            

                               java.util.List list =
                            org.apache.axis2.databinding.utils.ConverterUtil.toList(localTitleOldInfo);
                               list.add(param);
                               this.localTitleOldInfo =
                             (com.pccth.rdbservice.TitleOldInfo[])list.toArray(
                            new com.pccth.rdbservice.TitleOldInfo[list.size()]);

                             }
                             

                        /**
                        * field for EdiGoodsInfo
                        * This was an Array!
                        */

                        
                                    protected com.pccth.rdbservice.EdiGoodsInfo[] localEdiGoodsInfo ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localEdiGoodsInfoTracker = false ;

                           public boolean isEdiGoodsInfoSpecified(){
                               return localEdiGoodsInfoTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return com.pccth.rdbservice.EdiGoodsInfo[]
                           */
                           public  com.pccth.rdbservice.EdiGoodsInfo[] getEdiGoodsInfo(){
                               return localEdiGoodsInfo;
                           }

                           
                        


                               
                              /**
                               * validate the array for EdiGoodsInfo
                               */
                              protected void validateEdiGoodsInfo(com.pccth.rdbservice.EdiGoodsInfo[] param){
                             
                              }


                             /**
                              * Auto generated setter method
                              * @param param EdiGoodsInfo
                              */
                              public void setEdiGoodsInfo(com.pccth.rdbservice.EdiGoodsInfo[] param){
                              
                                   validateEdiGoodsInfo(param);

                               localEdiGoodsInfoTracker = true;
                                      
                                      this.localEdiGoodsInfo=param;
                              }

                               
                             
                             /**
                             * Auto generated add method for the array for convenience
                             * @param param com.pccth.rdbservice.EdiGoodsInfo
                             */
                             public void addEdiGoodsInfo(com.pccth.rdbservice.EdiGoodsInfo param){
                                   if (localEdiGoodsInfo == null){
                                   localEdiGoodsInfo = new com.pccth.rdbservice.EdiGoodsInfo[]{};
                                   }

                            
                                 //update the setting tracker
                                localEdiGoodsInfoTracker = true;
                            

                               java.util.List list =
                            org.apache.axis2.databinding.utils.ConverterUtil.toList(localEdiGoodsInfo);
                               list.add(param);
                               this.localEdiGoodsInfo =
                             (com.pccth.rdbservice.EdiGoodsInfo[])list.toArray(
                            new com.pccth.rdbservice.EdiGoodsInfo[list.size()]);

                             }
                             

                        /**
                        * field for ProductUnitInfo
                        * This was an Array!
                        */

                        
                                    protected com.pccth.rdbservice.ProductUnitInfo[] localProductUnitInfo ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localProductUnitInfoTracker = false ;

                           public boolean isProductUnitInfoSpecified(){
                               return localProductUnitInfoTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return com.pccth.rdbservice.ProductUnitInfo[]
                           */
                           public  com.pccth.rdbservice.ProductUnitInfo[] getProductUnitInfo(){
                               return localProductUnitInfo;
                           }

                           
                        


                               
                              /**
                               * validate the array for ProductUnitInfo
                               */
                              protected void validateProductUnitInfo(com.pccth.rdbservice.ProductUnitInfo[] param){
                             
                              }


                             /**
                              * Auto generated setter method
                              * @param param ProductUnitInfo
                              */
                              public void setProductUnitInfo(com.pccth.rdbservice.ProductUnitInfo[] param){
                              
                                   validateProductUnitInfo(param);

                               localProductUnitInfoTracker = true;
                                      
                                      this.localProductUnitInfo=param;
                              }

                               
                             
                             /**
                             * Auto generated add method for the array for convenience
                             * @param param com.pccth.rdbservice.ProductUnitInfo
                             */
                             public void addProductUnitInfo(com.pccth.rdbservice.ProductUnitInfo param){
                                   if (localProductUnitInfo == null){
                                   localProductUnitInfo = new com.pccth.rdbservice.ProductUnitInfo[]{};
                                   }

                            
                                 //update the setting tracker
                                localProductUnitInfoTracker = true;
                            

                               java.util.List list =
                            org.apache.axis2.databinding.utils.ConverterUtil.toList(localProductUnitInfo);
                               list.add(param);
                               this.localProductUnitInfo =
                             (com.pccth.rdbservice.ProductUnitInfo[])list.toArray(
                            new com.pccth.rdbservice.ProductUnitInfo[list.size()]);

                             }
                             

                        /**
                        * field for SssFundRateInfo
                        * This was an Array!
                        */

                        
                                    protected com.pccth.rdbservice.SssFundRateInfo[] localSssFundRateInfo ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localSssFundRateInfoTracker = false ;

                           public boolean isSssFundRateInfoSpecified(){
                               return localSssFundRateInfoTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return com.pccth.rdbservice.SssFundRateInfo[]
                           */
                           public  com.pccth.rdbservice.SssFundRateInfo[] getSssFundRateInfo(){
                               return localSssFundRateInfo;
                           }

                           
                        


                               
                              /**
                               * validate the array for SssFundRateInfo
                               */
                              protected void validateSssFundRateInfo(com.pccth.rdbservice.SssFundRateInfo[] param){
                             
                              }


                             /**
                              * Auto generated setter method
                              * @param param SssFundRateInfo
                              */
                              public void setSssFundRateInfo(com.pccth.rdbservice.SssFundRateInfo[] param){
                              
                                   validateSssFundRateInfo(param);

                               localSssFundRateInfoTracker = true;
                                      
                                      this.localSssFundRateInfo=param;
                              }

                               
                             
                             /**
                             * Auto generated add method for the array for convenience
                             * @param param com.pccth.rdbservice.SssFundRateInfo
                             */
                             public void addSssFundRateInfo(com.pccth.rdbservice.SssFundRateInfo param){
                                   if (localSssFundRateInfo == null){
                                   localSssFundRateInfo = new com.pccth.rdbservice.SssFundRateInfo[]{};
                                   }

                            
                                 //update the setting tracker
                                localSssFundRateInfoTracker = true;
                            

                               java.util.List list =
                            org.apache.axis2.databinding.utils.ConverterUtil.toList(localSssFundRateInfo);
                               list.add(param);
                               this.localSssFundRateInfo =
                             (com.pccth.rdbservice.SssFundRateInfo[])list.toArray(
                            new com.pccth.rdbservice.SssFundRateInfo[list.size()]);

                             }
                             

                        /**
                        * field for DutyMaterialInfo
                        * This was an Array!
                        */

                        
                                    protected com.pccth.rdbservice.DutyMaterialInfo[] localDutyMaterialInfo ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localDutyMaterialInfoTracker = false ;

                           public boolean isDutyMaterialInfoSpecified(){
                               return localDutyMaterialInfoTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return com.pccth.rdbservice.DutyMaterialInfo[]
                           */
                           public  com.pccth.rdbservice.DutyMaterialInfo[] getDutyMaterialInfo(){
                               return localDutyMaterialInfo;
                           }

                           
                        


                               
                              /**
                               * validate the array for DutyMaterialInfo
                               */
                              protected void validateDutyMaterialInfo(com.pccth.rdbservice.DutyMaterialInfo[] param){
                             
                              }


                             /**
                              * Auto generated setter method
                              * @param param DutyMaterialInfo
                              */
                              public void setDutyMaterialInfo(com.pccth.rdbservice.DutyMaterialInfo[] param){
                              
                                   validateDutyMaterialInfo(param);

                               localDutyMaterialInfoTracker = true;
                                      
                                      this.localDutyMaterialInfo=param;
                              }

                               
                             
                             /**
                             * Auto generated add method for the array for convenience
                             * @param param com.pccth.rdbservice.DutyMaterialInfo
                             */
                             public void addDutyMaterialInfo(com.pccth.rdbservice.DutyMaterialInfo param){
                                   if (localDutyMaterialInfo == null){
                                   localDutyMaterialInfo = new com.pccth.rdbservice.DutyMaterialInfo[]{};
                                   }

                            
                                 //update the setting tracker
                                localDutyMaterialInfoTracker = true;
                            

                               java.util.List list =
                            org.apache.axis2.databinding.utils.ConverterUtil.toList(localDutyMaterialInfo);
                               list.add(param);
                               this.localDutyMaterialInfo =
                             (com.pccth.rdbservice.DutyMaterialInfo[])list.toArray(
                            new com.pccth.rdbservice.DutyMaterialInfo[list.size()]);

                             }
                             

                        /**
                        * field for DutyGroupInfo
                        * This was an Array!
                        */

                        
                                    protected com.pccth.rdbservice.DutyGroupInfo[] localDutyGroupInfo ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localDutyGroupInfoTracker = false ;

                           public boolean isDutyGroupInfoSpecified(){
                               return localDutyGroupInfoTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return com.pccth.rdbservice.DutyGroupInfo[]
                           */
                           public  com.pccth.rdbservice.DutyGroupInfo[] getDutyGroupInfo(){
                               return localDutyGroupInfo;
                           }

                           
                        


                               
                              /**
                               * validate the array for DutyGroupInfo
                               */
                              protected void validateDutyGroupInfo(com.pccth.rdbservice.DutyGroupInfo[] param){
                             
                              }


                             /**
                              * Auto generated setter method
                              * @param param DutyGroupInfo
                              */
                              public void setDutyGroupInfo(com.pccth.rdbservice.DutyGroupInfo[] param){
                              
                                   validateDutyGroupInfo(param);

                               localDutyGroupInfoTracker = true;
                                      
                                      this.localDutyGroupInfo=param;
                              }

                               
                             
                             /**
                             * Auto generated add method for the array for convenience
                             * @param param com.pccth.rdbservice.DutyGroupInfo
                             */
                             public void addDutyGroupInfo(com.pccth.rdbservice.DutyGroupInfo param){
                                   if (localDutyGroupInfo == null){
                                   localDutyGroupInfo = new com.pccth.rdbservice.DutyGroupInfo[]{};
                                   }

                            
                                 //update the setting tracker
                                localDutyGroupInfoTracker = true;
                            

                               java.util.List list =
                            org.apache.axis2.databinding.utils.ConverterUtil.toList(localDutyGroupInfo);
                               list.add(param);
                               this.localDutyGroupInfo =
                             (com.pccth.rdbservice.DutyGroupInfo[])list.toArray(
                            new com.pccth.rdbservice.DutyGroupInfo[list.size()]);

                             }
                             

                        /**
                        * field for ImportCompInfo
                        * This was an Array!
                        */

                        
                                    protected com.pccth.rdbservice.ImportCompInfo[] localImportCompInfo ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localImportCompInfoTracker = false ;

                           public boolean isImportCompInfoSpecified(){
                               return localImportCompInfoTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return com.pccth.rdbservice.ImportCompInfo[]
                           */
                           public  com.pccth.rdbservice.ImportCompInfo[] getImportCompInfo(){
                               return localImportCompInfo;
                           }

                           
                        


                               
                              /**
                               * validate the array for ImportCompInfo
                               */
                              protected void validateImportCompInfo(com.pccth.rdbservice.ImportCompInfo[] param){
                             
                              }


                             /**
                              * Auto generated setter method
                              * @param param ImportCompInfo
                              */
                              public void setImportCompInfo(com.pccth.rdbservice.ImportCompInfo[] param){
                              
                                   validateImportCompInfo(param);

                               localImportCompInfoTracker = true;
                                      
                                      this.localImportCompInfo=param;
                              }

                               
                             
                             /**
                             * Auto generated add method for the array for convenience
                             * @param param com.pccth.rdbservice.ImportCompInfo
                             */
                             public void addImportCompInfo(com.pccth.rdbservice.ImportCompInfo param){
                                   if (localImportCompInfo == null){
                                   localImportCompInfo = new com.pccth.rdbservice.ImportCompInfo[]{};
                                   }

                            
                                 //update the setting tracker
                                localImportCompInfoTracker = true;
                            

                               java.util.List list =
                            org.apache.axis2.databinding.utils.ConverterUtil.toList(localImportCompInfo);
                               list.add(param);
                               this.localImportCompInfo =
                             (com.pccth.rdbservice.ImportCompInfo[])list.toArray(
                            new com.pccth.rdbservice.ImportCompInfo[list.size()]);

                             }
                             

                        /**
                        * field for MaterialInfo
                        * This was an Array!
                        */

                        
                                    protected com.pccth.rdbservice.MaterialInfo[] localMaterialInfo ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localMaterialInfoTracker = false ;

                           public boolean isMaterialInfoSpecified(){
                               return localMaterialInfoTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return com.pccth.rdbservice.MaterialInfo[]
                           */
                           public  com.pccth.rdbservice.MaterialInfo[] getMaterialInfo(){
                               return localMaterialInfo;
                           }

                           
                        


                               
                              /**
                               * validate the array for MaterialInfo
                               */
                              protected void validateMaterialInfo(com.pccth.rdbservice.MaterialInfo[] param){
                             
                              }


                             /**
                              * Auto generated setter method
                              * @param param MaterialInfo
                              */
                              public void setMaterialInfo(com.pccth.rdbservice.MaterialInfo[] param){
                              
                                   validateMaterialInfo(param);

                               localMaterialInfoTracker = true;
                                      
                                      this.localMaterialInfo=param;
                              }

                               
                             
                             /**
                             * Auto generated add method for the array for convenience
                             * @param param com.pccth.rdbservice.MaterialInfo
                             */
                             public void addMaterialInfo(com.pccth.rdbservice.MaterialInfo param){
                                   if (localMaterialInfo == null){
                                   localMaterialInfo = new com.pccth.rdbservice.MaterialInfo[]{};
                                   }

                            
                                 //update the setting tracker
                                localMaterialInfoTracker = true;
                            

                               java.util.List list =
                            org.apache.axis2.databinding.utils.ConverterUtil.toList(localMaterialInfo);
                               list.add(param);
                               this.localMaterialInfo =
                             (com.pccth.rdbservice.MaterialInfo[])list.toArray(
                            new com.pccth.rdbservice.MaterialInfo[list.size()]);

                             }
                             

                        /**
                        * field for LocalRateInfo
                        * This was an Array!
                        */

                        
                                    protected com.pccth.rdbservice.LocalRateInfo[] localLocalRateInfo ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localLocalRateInfoTracker = false ;

                           public boolean isLocalRateInfoSpecified(){
                               return localLocalRateInfoTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return com.pccth.rdbservice.LocalRateInfo[]
                           */
                           public  com.pccth.rdbservice.LocalRateInfo[] getLocalRateInfo(){
                               return localLocalRateInfo;
                           }

                           
                        


                               
                              /**
                               * validate the array for LocalRateInfo
                               */
                              protected void validateLocalRateInfo(com.pccth.rdbservice.LocalRateInfo[] param){
                             
                              }


                             /**
                              * Auto generated setter method
                              * @param param LocalRateInfo
                              */
                              public void setLocalRateInfo(com.pccth.rdbservice.LocalRateInfo[] param){
                              
                                   validateLocalRateInfo(param);

                               localLocalRateInfoTracker = true;
                                      
                                      this.localLocalRateInfo=param;
                              }

                               
                             
                             /**
                             * Auto generated add method for the array for convenience
                             * @param param com.pccth.rdbservice.LocalRateInfo
                             */
                             public void addLocalRateInfo(com.pccth.rdbservice.LocalRateInfo param){
                                   if (localLocalRateInfo == null){
                                   localLocalRateInfo = new com.pccth.rdbservice.LocalRateInfo[]{};
                                   }

                            
                                 //update the setting tracker
                                localLocalRateInfoTracker = true;
                            

                               java.util.List list =
                            org.apache.axis2.databinding.utils.ConverterUtil.toList(localLocalRateInfo);
                               list.add(param);
                               this.localLocalRateInfo =
                             (com.pccth.rdbservice.LocalRateInfo[])list.toArray(
                            new com.pccth.rdbservice.LocalRateInfo[list.size()]);

                             }
                             

                        /**
                        * field for CdCountryInfo
                        * This was an Array!
                        */

                        
                                    protected com.pccth.rdbservice.CdCountryInfo[] localCdCountryInfo ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localCdCountryInfoTracker = false ;

                           public boolean isCdCountryInfoSpecified(){
                               return localCdCountryInfoTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return com.pccth.rdbservice.CdCountryInfo[]
                           */
                           public  com.pccth.rdbservice.CdCountryInfo[] getCdCountryInfo(){
                               return localCdCountryInfo;
                           }

                           
                        


                               
                              /**
                               * validate the array for CdCountryInfo
                               */
                              protected void validateCdCountryInfo(com.pccth.rdbservice.CdCountryInfo[] param){
                             
                              }


                             /**
                              * Auto generated setter method
                              * @param param CdCountryInfo
                              */
                              public void setCdCountryInfo(com.pccth.rdbservice.CdCountryInfo[] param){
                              
                                   validateCdCountryInfo(param);

                               localCdCountryInfoTracker = true;
                                      
                                      this.localCdCountryInfo=param;
                              }

                               
                             
                             /**
                             * Auto generated add method for the array for convenience
                             * @param param com.pccth.rdbservice.CdCountryInfo
                             */
                             public void addCdCountryInfo(com.pccth.rdbservice.CdCountryInfo param){
                                   if (localCdCountryInfo == null){
                                   localCdCountryInfo = new com.pccth.rdbservice.CdCountryInfo[]{};
                                   }

                            
                                 //update the setting tracker
                                localCdCountryInfoTracker = true;
                            

                               java.util.List list =
                            org.apache.axis2.databinding.utils.ConverterUtil.toList(localCdCountryInfo);
                               list.add(param);
                               this.localCdCountryInfo =
                             (com.pccth.rdbservice.CdCountryInfo[])list.toArray(
                            new com.pccth.rdbservice.CdCountryInfo[list.size()]);

                             }
                             

                        /**
                        * field for ProductIncMastInfo
                        * This was an Array!
                        */

                        
                                    protected com.pccth.rdbservice.ProductIncMastInfo[] localProductIncMastInfo ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localProductIncMastInfoTracker = false ;

                           public boolean isProductIncMastInfoSpecified(){
                               return localProductIncMastInfoTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return com.pccth.rdbservice.ProductIncMastInfo[]
                           */
                           public  com.pccth.rdbservice.ProductIncMastInfo[] getProductIncMastInfo(){
                               return localProductIncMastInfo;
                           }

                           
                        


                               
                              /**
                               * validate the array for ProductIncMastInfo
                               */
                              protected void validateProductIncMastInfo(com.pccth.rdbservice.ProductIncMastInfo[] param){
                             
                              }


                             /**
                              * Auto generated setter method
                              * @param param ProductIncMastInfo
                              */
                              public void setProductIncMastInfo(com.pccth.rdbservice.ProductIncMastInfo[] param){
                              
                                   validateProductIncMastInfo(param);

                               localProductIncMastInfoTracker = true;
                                      
                                      this.localProductIncMastInfo=param;
                              }

                               
                             
                             /**
                             * Auto generated add method for the array for convenience
                             * @param param com.pccth.rdbservice.ProductIncMastInfo
                             */
                             public void addProductIncMastInfo(com.pccth.rdbservice.ProductIncMastInfo param){
                                   if (localProductIncMastInfo == null){
                                   localProductIncMastInfo = new com.pccth.rdbservice.ProductIncMastInfo[]{};
                                   }

                            
                                 //update the setting tracker
                                localProductIncMastInfoTracker = true;
                            

                               java.util.List list =
                            org.apache.axis2.databinding.utils.ConverterUtil.toList(localProductIncMastInfo);
                               list.add(param);
                               this.localProductIncMastInfo =
                             (com.pccth.rdbservice.ProductIncMastInfo[])list.toArray(
                            new com.pccth.rdbservice.ProductIncMastInfo[list.size()]);

                             }
                             

                        /**
                        * field for LicenseHdInfo
                        * This was an Array!
                        */

                        
                                    protected com.pccth.rdbservice.LicenseHdInfo[] localLicenseHdInfo ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localLicenseHdInfoTracker = false ;

                           public boolean isLicenseHdInfoSpecified(){
                               return localLicenseHdInfoTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return com.pccth.rdbservice.LicenseHdInfo[]
                           */
                           public  com.pccth.rdbservice.LicenseHdInfo[] getLicenseHdInfo(){
                               return localLicenseHdInfo;
                           }

                           
                        


                               
                              /**
                               * validate the array for LicenseHdInfo
                               */
                              protected void validateLicenseHdInfo(com.pccth.rdbservice.LicenseHdInfo[] param){
                             
                              }


                             /**
                              * Auto generated setter method
                              * @param param LicenseHdInfo
                              */
                              public void setLicenseHdInfo(com.pccth.rdbservice.LicenseHdInfo[] param){
                              
                                   validateLicenseHdInfo(param);

                               localLicenseHdInfoTracker = true;
                                      
                                      this.localLicenseHdInfo=param;
                              }

                               
                             
                             /**
                             * Auto generated add method for the array for convenience
                             * @param param com.pccth.rdbservice.LicenseHdInfo
                             */
                             public void addLicenseHdInfo(com.pccth.rdbservice.LicenseHdInfo param){
                                   if (localLicenseHdInfo == null){
                                   localLicenseHdInfo = new com.pccth.rdbservice.LicenseHdInfo[]{};
                                   }

                            
                                 //update the setting tracker
                                localLicenseHdInfoTracker = true;
                            

                               java.util.List list =
                            org.apache.axis2.databinding.utils.ConverterUtil.toList(localLicenseHdInfo);
                               list.add(param);
                               this.localLicenseHdInfo =
                             (com.pccth.rdbservice.LicenseHdInfo[])list.toArray(
                            new com.pccth.rdbservice.LicenseHdInfo[list.size()]);

                             }
                             

                        /**
                        * field for IncomeTypeInfo
                        * This was an Array!
                        */

                        
                                    protected com.pccth.rdbservice.IncomeTypeInfo[] localIncomeTypeInfo ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localIncomeTypeInfoTracker = false ;

                           public boolean isIncomeTypeInfoSpecified(){
                               return localIncomeTypeInfoTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return com.pccth.rdbservice.IncomeTypeInfo[]
                           */
                           public  com.pccth.rdbservice.IncomeTypeInfo[] getIncomeTypeInfo(){
                               return localIncomeTypeInfo;
                           }

                           
                        


                               
                              /**
                               * validate the array for IncomeTypeInfo
                               */
                              protected void validateIncomeTypeInfo(com.pccth.rdbservice.IncomeTypeInfo[] param){
                             
                              }


                             /**
                              * Auto generated setter method
                              * @param param IncomeTypeInfo
                              */
                              public void setIncomeTypeInfo(com.pccth.rdbservice.IncomeTypeInfo[] param){
                              
                                   validateIncomeTypeInfo(param);

                               localIncomeTypeInfoTracker = true;
                                      
                                      this.localIncomeTypeInfo=param;
                              }

                               
                             
                             /**
                             * Auto generated add method for the array for convenience
                             * @param param com.pccth.rdbservice.IncomeTypeInfo
                             */
                             public void addIncomeTypeInfo(com.pccth.rdbservice.IncomeTypeInfo param){
                                   if (localIncomeTypeInfo == null){
                                   localIncomeTypeInfo = new com.pccth.rdbservice.IncomeTypeInfo[]{};
                                   }

                            
                                 //update the setting tracker
                                localIncomeTypeInfoTracker = true;
                            

                               java.util.List list =
                            org.apache.axis2.databinding.utils.ConverterUtil.toList(localIncomeTypeInfo);
                               list.add(param);
                               this.localIncomeTypeInfo =
                             (com.pccth.rdbservice.IncomeTypeInfo[])list.toArray(
                            new com.pccth.rdbservice.IncomeTypeInfo[list.size()]);

                             }
                             

                        /**
                        * field for DueDatePs0112Info
                        * This was an Array!
                        */

                        
                                    protected com.pccth.rdbservice.DueDatePs0112Info[] localDueDatePs0112Info ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localDueDatePs0112InfoTracker = false ;

                           public boolean isDueDatePs0112InfoSpecified(){
                               return localDueDatePs0112InfoTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return com.pccth.rdbservice.DueDatePs0112Info[]
                           */
                           public  com.pccth.rdbservice.DueDatePs0112Info[] getDueDatePs0112Info(){
                               return localDueDatePs0112Info;
                           }

                           
                        


                               
                              /**
                               * validate the array for DueDatePs0112Info
                               */
                              protected void validateDueDatePs0112Info(com.pccth.rdbservice.DueDatePs0112Info[] param){
                             
                              }


                             /**
                              * Auto generated setter method
                              * @param param DueDatePs0112Info
                              */
                              public void setDueDatePs0112Info(com.pccth.rdbservice.DueDatePs0112Info[] param){
                              
                                   validateDueDatePs0112Info(param);

                               localDueDatePs0112InfoTracker = true;
                                      
                                      this.localDueDatePs0112Info=param;
                              }

                               
                             
                             /**
                             * Auto generated add method for the array for convenience
                             * @param param com.pccth.rdbservice.DueDatePs0112Info
                             */
                             public void addDueDatePs0112Info(com.pccth.rdbservice.DueDatePs0112Info param){
                                   if (localDueDatePs0112Info == null){
                                   localDueDatePs0112Info = new com.pccth.rdbservice.DueDatePs0112Info[]{};
                                   }

                            
                                 //update the setting tracker
                                localDueDatePs0112InfoTracker = true;
                            

                               java.util.List list =
                            org.apache.axis2.databinding.utils.ConverterUtil.toList(localDueDatePs0112Info);
                               list.add(param);
                               this.localDueDatePs0112Info =
                             (com.pccth.rdbservice.DueDatePs0112Info[])list.toArray(
                            new com.pccth.rdbservice.DueDatePs0112Info[list.size()]);

                             }
                             

                        /**
                        * field for LicenseDtInfo
                        * This was an Array!
                        */

                        
                                    protected com.pccth.rdbservice.LicenseDtInfo[] localLicenseDtInfo ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localLicenseDtInfoTracker = false ;

                           public boolean isLicenseDtInfoSpecified(){
                               return localLicenseDtInfoTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return com.pccth.rdbservice.LicenseDtInfo[]
                           */
                           public  com.pccth.rdbservice.LicenseDtInfo[] getLicenseDtInfo(){
                               return localLicenseDtInfo;
                           }

                           
                        


                               
                              /**
                               * validate the array for LicenseDtInfo
                               */
                              protected void validateLicenseDtInfo(com.pccth.rdbservice.LicenseDtInfo[] param){
                             
                              }


                             /**
                              * Auto generated setter method
                              * @param param LicenseDtInfo
                              */
                              public void setLicenseDtInfo(com.pccth.rdbservice.LicenseDtInfo[] param){
                              
                                   validateLicenseDtInfo(param);

                               localLicenseDtInfoTracker = true;
                                      
                                      this.localLicenseDtInfo=param;
                              }

                               
                             
                             /**
                             * Auto generated add method for the array for convenience
                             * @param param com.pccth.rdbservice.LicenseDtInfo
                             */
                             public void addLicenseDtInfo(com.pccth.rdbservice.LicenseDtInfo param){
                                   if (localLicenseDtInfo == null){
                                   localLicenseDtInfo = new com.pccth.rdbservice.LicenseDtInfo[]{};
                                   }

                            
                                 //update the setting tracker
                                localLicenseDtInfoTracker = true;
                            

                               java.util.List list =
                            org.apache.axis2.databinding.utils.ConverterUtil.toList(localLicenseDtInfo);
                               list.add(param);
                               this.localLicenseDtInfo =
                             (com.pccth.rdbservice.LicenseDtInfo[])list.toArray(
                            new com.pccth.rdbservice.LicenseDtInfo[list.size()]);

                             }
                             

                        /**
                        * field for HolidayInfo
                        * This was an Array!
                        */

                        
                                    protected com.pccth.rdbservice.HolidayInfo[] localHolidayInfo ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localHolidayInfoTracker = false ;

                           public boolean isHolidayInfoSpecified(){
                               return localHolidayInfoTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return com.pccth.rdbservice.HolidayInfo[]
                           */
                           public  com.pccth.rdbservice.HolidayInfo[] getHolidayInfo(){
                               return localHolidayInfo;
                           }

                           
                        


                               
                              /**
                               * validate the array for HolidayInfo
                               */
                              protected void validateHolidayInfo(com.pccth.rdbservice.HolidayInfo[] param){
                             
                              }


                             /**
                              * Auto generated setter method
                              * @param param HolidayInfo
                              */
                              public void setHolidayInfo(com.pccth.rdbservice.HolidayInfo[] param){
                              
                                   validateHolidayInfo(param);

                               localHolidayInfoTracker = true;
                                      
                                      this.localHolidayInfo=param;
                              }

                               
                             
                             /**
                             * Auto generated add method for the array for convenience
                             * @param param com.pccth.rdbservice.HolidayInfo
                             */
                             public void addHolidayInfo(com.pccth.rdbservice.HolidayInfo param){
                                   if (localHolidayInfo == null){
                                   localHolidayInfo = new com.pccth.rdbservice.HolidayInfo[]{};
                                   }

                            
                                 //update the setting tracker
                                localHolidayInfoTracker = true;
                            

                               java.util.List list =
                            org.apache.axis2.databinding.utils.ConverterUtil.toList(localHolidayInfo);
                               list.add(param);
                               this.localHolidayInfo =
                             (com.pccth.rdbservice.HolidayInfo[])list.toArray(
                            new com.pccth.rdbservice.HolidayInfo[list.size()]);

                             }
                             

                        /**
                        * field for SystemParamInfo
                        * This was an Array!
                        */

                        
                                    protected com.pccth.rdbservice.SystemParamInfo[] localSystemParamInfo ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localSystemParamInfoTracker = false ;

                           public boolean isSystemParamInfoSpecified(){
                               return localSystemParamInfoTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return com.pccth.rdbservice.SystemParamInfo[]
                           */
                           public  com.pccth.rdbservice.SystemParamInfo[] getSystemParamInfo(){
                               return localSystemParamInfo;
                           }

                           
                        


                               
                              /**
                               * validate the array for SystemParamInfo
                               */
                              protected void validateSystemParamInfo(com.pccth.rdbservice.SystemParamInfo[] param){
                             
                              }


                             /**
                              * Auto generated setter method
                              * @param param SystemParamInfo
                              */
                              public void setSystemParamInfo(com.pccth.rdbservice.SystemParamInfo[] param){
                              
                                   validateSystemParamInfo(param);

                               localSystemParamInfoTracker = true;
                                      
                                      this.localSystemParamInfo=param;
                              }

                               
                             
                             /**
                             * Auto generated add method for the array for convenience
                             * @param param com.pccth.rdbservice.SystemParamInfo
                             */
                             public void addSystemParamInfo(com.pccth.rdbservice.SystemParamInfo param){
                                   if (localSystemParamInfo == null){
                                   localSystemParamInfo = new com.pccth.rdbservice.SystemParamInfo[]{};
                                   }

                            
                                 //update the setting tracker
                                localSystemParamInfoTracker = true;
                            

                               java.util.List list =
                            org.apache.axis2.databinding.utils.ConverterUtil.toList(localSystemParamInfo);
                               list.add(param);
                               this.localSystemParamInfo =
                             (com.pccth.rdbservice.SystemParamInfo[])list.toArray(
                            new com.pccth.rdbservice.SystemParamInfo[list.size()]);

                             }
                             

                        /**
                        * field for BankBranchInfo
                        * This was an Array!
                        */

                        
                                    protected com.pccth.rdbservice.BankBranchInfo[] localBankBranchInfo ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localBankBranchInfoTracker = false ;

                           public boolean isBankBranchInfoSpecified(){
                               return localBankBranchInfoTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return com.pccth.rdbservice.BankBranchInfo[]
                           */
                           public  com.pccth.rdbservice.BankBranchInfo[] getBankBranchInfo(){
                               return localBankBranchInfo;
                           }

                           
                        


                               
                              /**
                               * validate the array for BankBranchInfo
                               */
                              protected void validateBankBranchInfo(com.pccth.rdbservice.BankBranchInfo[] param){
                             
                              }


                             /**
                              * Auto generated setter method
                              * @param param BankBranchInfo
                              */
                              public void setBankBranchInfo(com.pccth.rdbservice.BankBranchInfo[] param){
                              
                                   validateBankBranchInfo(param);

                               localBankBranchInfoTracker = true;
                                      
                                      this.localBankBranchInfo=param;
                              }

                               
                             
                             /**
                             * Auto generated add method for the array for convenience
                             * @param param com.pccth.rdbservice.BankBranchInfo
                             */
                             public void addBankBranchInfo(com.pccth.rdbservice.BankBranchInfo param){
                                   if (localBankBranchInfo == null){
                                   localBankBranchInfo = new com.pccth.rdbservice.BankBranchInfo[]{};
                                   }

                            
                                 //update the setting tracker
                                localBankBranchInfoTracker = true;
                            

                               java.util.List list =
                            org.apache.axis2.databinding.utils.ConverterUtil.toList(localBankBranchInfo);
                               list.add(param);
                               this.localBankBranchInfo =
                             (com.pccth.rdbservice.BankBranchInfo[])list.toArray(
                            new com.pccth.rdbservice.BankBranchInfo[list.size()]);

                             }
                             

                        /**
                        * field for DutyTableInfo
                        * This was an Array!
                        */

                        
                                    protected com.pccth.rdbservice.DutyTableInfo[] localDutyTableInfo ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localDutyTableInfoTracker = false ;

                           public boolean isDutyTableInfoSpecified(){
                               return localDutyTableInfoTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return com.pccth.rdbservice.DutyTableInfo[]
                           */
                           public  com.pccth.rdbservice.DutyTableInfo[] getDutyTableInfo(){
                               return localDutyTableInfo;
                           }

                           
                        


                               
                              /**
                               * validate the array for DutyTableInfo
                               */
                              protected void validateDutyTableInfo(com.pccth.rdbservice.DutyTableInfo[] param){
                             
                              }


                             /**
                              * Auto generated setter method
                              * @param param DutyTableInfo
                              */
                              public void setDutyTableInfo(com.pccth.rdbservice.DutyTableInfo[] param){
                              
                                   validateDutyTableInfo(param);

                               localDutyTableInfoTracker = true;
                                      
                                      this.localDutyTableInfo=param;
                              }

                               
                             
                             /**
                             * Auto generated add method for the array for convenience
                             * @param param com.pccth.rdbservice.DutyTableInfo
                             */
                             public void addDutyTableInfo(com.pccth.rdbservice.DutyTableInfo param){
                                   if (localDutyTableInfo == null){
                                   localDutyTableInfo = new com.pccth.rdbservice.DutyTableInfo[]{};
                                   }

                            
                                 //update the setting tracker
                                localDutyTableInfoTracker = true;
                            

                               java.util.List list =
                            org.apache.axis2.databinding.utils.ConverterUtil.toList(localDutyTableInfo);
                               list.add(param);
                               this.localDutyTableInfo =
                             (com.pccth.rdbservice.DutyTableInfo[])list.toArray(
                            new com.pccth.rdbservice.DutyTableInfo[list.size()]);

                             }
                             

                        /**
                        * field for ReturnCode
                        */

                        
                                    protected java.lang.String localReturnCode ;
                                

                           /**
                           * Auto generated getter method
                           * @return java.lang.String
                           */
                           public  java.lang.String getReturnCode(){
                               return localReturnCode;
                           }

                           
                        
                            /**
                               * Auto generated setter method
                               * @param param ReturnCode
                               */
                               public void setReturnCode(java.lang.String param){
                            
                                            this.localReturnCode=param;
                                    

                               }
                            

                        /**
                        * field for StoreInfo
                        * This was an Array!
                        */

                        
                                    protected com.pccth.rdbservice.StoreInfo[] localStoreInfo ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localStoreInfoTracker = false ;

                           public boolean isStoreInfoSpecified(){
                               return localStoreInfoTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return com.pccth.rdbservice.StoreInfo[]
                           */
                           public  com.pccth.rdbservice.StoreInfo[] getStoreInfo(){
                               return localStoreInfo;
                           }

                           
                        


                               
                              /**
                               * validate the array for StoreInfo
                               */
                              protected void validateStoreInfo(com.pccth.rdbservice.StoreInfo[] param){
                             
                              }


                             /**
                              * Auto generated setter method
                              * @param param StoreInfo
                              */
                              public void setStoreInfo(com.pccth.rdbservice.StoreInfo[] param){
                              
                                   validateStoreInfo(param);

                               localStoreInfoTracker = true;
                                      
                                      this.localStoreInfo=param;
                              }

                               
                             
                             /**
                             * Auto generated add method for the array for convenience
                             * @param param com.pccth.rdbservice.StoreInfo
                             */
                             public void addStoreInfo(com.pccth.rdbservice.StoreInfo param){
                                   if (localStoreInfo == null){
                                   localStoreInfo = new com.pccth.rdbservice.StoreInfo[]{};
                                   }

                            
                                 //update the setting tracker
                                localStoreInfoTracker = true;
                            

                               java.util.List list =
                            org.apache.axis2.databinding.utils.ConverterUtil.toList(localStoreInfo);
                               list.add(param);
                               this.localStoreInfo =
                             (com.pccth.rdbservice.StoreInfo[])list.toArray(
                            new com.pccth.rdbservice.StoreInfo[list.size()]);

                             }
                             

                        /**
                        * field for TambolInfo
                        * This was an Array!
                        */

                        
                                    protected com.pccth.rdbservice.TambolInfo[] localTambolInfo ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localTambolInfoTracker = false ;

                           public boolean isTambolInfoSpecified(){
                               return localTambolInfoTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return com.pccth.rdbservice.TambolInfo[]
                           */
                           public  com.pccth.rdbservice.TambolInfo[] getTambolInfo(){
                               return localTambolInfo;
                           }

                           
                        


                               
                              /**
                               * validate the array for TambolInfo
                               */
                              protected void validateTambolInfo(com.pccth.rdbservice.TambolInfo[] param){
                             
                              }


                             /**
                              * Auto generated setter method
                              * @param param TambolInfo
                              */
                              public void setTambolInfo(com.pccth.rdbservice.TambolInfo[] param){
                              
                                   validateTambolInfo(param);

                               localTambolInfoTracker = true;
                                      
                                      this.localTambolInfo=param;
                              }

                               
                             
                             /**
                             * Auto generated add method for the array for convenience
                             * @param param com.pccth.rdbservice.TambolInfo
                             */
                             public void addTambolInfo(com.pccth.rdbservice.TambolInfo param){
                                   if (localTambolInfo == null){
                                   localTambolInfo = new com.pccth.rdbservice.TambolInfo[]{};
                                   }

                            
                                 //update the setting tracker
                                localTambolInfoTracker = true;
                            

                               java.util.List list =
                            org.apache.axis2.databinding.utils.ConverterUtil.toList(localTambolInfo);
                               list.add(param);
                               this.localTambolInfo =
                             (com.pccth.rdbservice.TambolInfo[])list.toArray(
                            new com.pccth.rdbservice.TambolInfo[list.size()]);

                             }
                             

                        /**
                        * field for ProductInfo
                        * This was an Array!
                        */

                        
                                    protected com.pccth.rdbservice.ProductInfo[] localProductInfo ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localProductInfoTracker = false ;

                           public boolean isProductInfoSpecified(){
                               return localProductInfoTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return com.pccth.rdbservice.ProductInfo[]
                           */
                           public  com.pccth.rdbservice.ProductInfo[] getProductInfo(){
                               return localProductInfo;
                           }

                           
                        


                               
                              /**
                               * validate the array for ProductInfo
                               */
                              protected void validateProductInfo(com.pccth.rdbservice.ProductInfo[] param){
                             
                              }


                             /**
                              * Auto generated setter method
                              * @param param ProductInfo
                              */
                              public void setProductInfo(com.pccth.rdbservice.ProductInfo[] param){
                              
                                   validateProductInfo(param);

                               localProductInfoTracker = true;
                                      
                                      this.localProductInfo=param;
                              }

                               
                             
                             /**
                             * Auto generated add method for the array for convenience
                             * @param param com.pccth.rdbservice.ProductInfo
                             */
                             public void addProductInfo(com.pccth.rdbservice.ProductInfo param){
                                   if (localProductInfo == null){
                                   localProductInfo = new com.pccth.rdbservice.ProductInfo[]{};
                                   }

                            
                                 //update the setting tracker
                                localProductInfoTracker = true;
                            

                               java.util.List list =
                            org.apache.axis2.databinding.utils.ConverterUtil.toList(localProductInfo);
                               list.add(param);
                               this.localProductInfo =
                             (com.pccth.rdbservice.ProductInfo[])list.toArray(
                            new com.pccth.rdbservice.ProductInfo[list.size()]);

                             }
                             

                        /**
                        * field for EdOfficeInfo
                        * This was an Array!
                        */

                        
                                    protected com.pccth.rdbservice.EdOfficeInfo[] localEdOfficeInfo ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localEdOfficeInfoTracker = false ;

                           public boolean isEdOfficeInfoSpecified(){
                               return localEdOfficeInfoTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return com.pccth.rdbservice.EdOfficeInfo[]
                           */
                           public  com.pccth.rdbservice.EdOfficeInfo[] getEdOfficeInfo(){
                               return localEdOfficeInfo;
                           }

                           
                        


                               
                              /**
                               * validate the array for EdOfficeInfo
                               */
                              protected void validateEdOfficeInfo(com.pccth.rdbservice.EdOfficeInfo[] param){
                             
                              }


                             /**
                              * Auto generated setter method
                              * @param param EdOfficeInfo
                              */
                              public void setEdOfficeInfo(com.pccth.rdbservice.EdOfficeInfo[] param){
                              
                                   validateEdOfficeInfo(param);

                               localEdOfficeInfoTracker = true;
                                      
                                      this.localEdOfficeInfo=param;
                              }

                               
                             
                             /**
                             * Auto generated add method for the array for convenience
                             * @param param com.pccth.rdbservice.EdOfficeInfo
                             */
                             public void addEdOfficeInfo(com.pccth.rdbservice.EdOfficeInfo param){
                                   if (localEdOfficeInfo == null){
                                   localEdOfficeInfo = new com.pccth.rdbservice.EdOfficeInfo[]{};
                                   }

                            
                                 //update the setting tracker
                                localEdOfficeInfoTracker = true;
                            

                               java.util.List list =
                            org.apache.axis2.databinding.utils.ConverterUtil.toList(localEdOfficeInfo);
                               list.add(param);
                               this.localEdOfficeInfo =
                             (com.pccth.rdbservice.EdOfficeInfo[])list.toArray(
                            new com.pccth.rdbservice.EdOfficeInfo[list.size()]);

                             }
                             

                        /**
                        * field for VatSplitHdInfo
                        * This was an Array!
                        */

                        
                                    protected com.pccth.rdbservice.VatSplitHdInfo[] localVatSplitHdInfo ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localVatSplitHdInfoTracker = false ;

                           public boolean isVatSplitHdInfoSpecified(){
                               return localVatSplitHdInfoTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return com.pccth.rdbservice.VatSplitHdInfo[]
                           */
                           public  com.pccth.rdbservice.VatSplitHdInfo[] getVatSplitHdInfo(){
                               return localVatSplitHdInfo;
                           }

                           
                        


                               
                              /**
                               * validate the array for VatSplitHdInfo
                               */
                              protected void validateVatSplitHdInfo(com.pccth.rdbservice.VatSplitHdInfo[] param){
                             
                              }


                             /**
                              * Auto generated setter method
                              * @param param VatSplitHdInfo
                              */
                              public void setVatSplitHdInfo(com.pccth.rdbservice.VatSplitHdInfo[] param){
                              
                                   validateVatSplitHdInfo(param);

                               localVatSplitHdInfoTracker = true;
                                      
                                      this.localVatSplitHdInfo=param;
                              }

                               
                             
                             /**
                             * Auto generated add method for the array for convenience
                             * @param param com.pccth.rdbservice.VatSplitHdInfo
                             */
                             public void addVatSplitHdInfo(com.pccth.rdbservice.VatSplitHdInfo param){
                                   if (localVatSplitHdInfo == null){
                                   localVatSplitHdInfo = new com.pccth.rdbservice.VatSplitHdInfo[]{};
                                   }

                            
                                 //update the setting tracker
                                localVatSplitHdInfoTracker = true;
                            

                               java.util.List list =
                            org.apache.axis2.databinding.utils.ConverterUtil.toList(localVatSplitHdInfo);
                               list.add(param);
                               this.localVatSplitHdInfo =
                             (com.pccth.rdbservice.VatSplitHdInfo[])list.toArray(
                            new com.pccth.rdbservice.VatSplitHdInfo[list.size()]);

                             }
                             

                        /**
                        * field for OilfundRateInfo
                        * This was an Array!
                        */

                        
                                    protected com.pccth.rdbservice.OilfundRateInfo[] localOilfundRateInfo ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localOilfundRateInfoTracker = false ;

                           public boolean isOilfundRateInfoSpecified(){
                               return localOilfundRateInfoTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return com.pccth.rdbservice.OilfundRateInfo[]
                           */
                           public  com.pccth.rdbservice.OilfundRateInfo[] getOilfundRateInfo(){
                               return localOilfundRateInfo;
                           }

                           
                        


                               
                              /**
                               * validate the array for OilfundRateInfo
                               */
                              protected void validateOilfundRateInfo(com.pccth.rdbservice.OilfundRateInfo[] param){
                             
                              }


                             /**
                              * Auto generated setter method
                              * @param param OilfundRateInfo
                              */
                              public void setOilfundRateInfo(com.pccth.rdbservice.OilfundRateInfo[] param){
                              
                                   validateOilfundRateInfo(param);

                               localOilfundRateInfoTracker = true;
                                      
                                      this.localOilfundRateInfo=param;
                              }

                               
                             
                             /**
                             * Auto generated add method for the array for convenience
                             * @param param com.pccth.rdbservice.OilfundRateInfo
                             */
                             public void addOilfundRateInfo(com.pccth.rdbservice.OilfundRateInfo param){
                                   if (localOilfundRateInfo == null){
                                   localOilfundRateInfo = new com.pccth.rdbservice.OilfundRateInfo[]{};
                                   }

                            
                                 //update the setting tracker
                                localOilfundRateInfoTracker = true;
                            

                               java.util.List list =
                            org.apache.axis2.databinding.utils.ConverterUtil.toList(localOilfundRateInfo);
                               list.add(param);
                               this.localOilfundRateInfo =
                             (com.pccth.rdbservice.OilfundRateInfo[])list.toArray(
                            new com.pccth.rdbservice.OilfundRateInfo[list.size()]);

                             }
                             

                        /**
                        * field for ProductTypeInfo
                        * This was an Array!
                        */

                        
                                    protected com.pccth.rdbservice.ProductTypeInfo[] localProductTypeInfo ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localProductTypeInfoTracker = false ;

                           public boolean isProductTypeInfoSpecified(){
                               return localProductTypeInfoTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return com.pccth.rdbservice.ProductTypeInfo[]
                           */
                           public  com.pccth.rdbservice.ProductTypeInfo[] getProductTypeInfo(){
                               return localProductTypeInfo;
                           }

                           
                        


                               
                              /**
                               * validate the array for ProductTypeInfo
                               */
                              protected void validateProductTypeInfo(com.pccth.rdbservice.ProductTypeInfo[] param){
                             
                              }


                             /**
                              * Auto generated setter method
                              * @param param ProductTypeInfo
                              */
                              public void setProductTypeInfo(com.pccth.rdbservice.ProductTypeInfo[] param){
                              
                                   validateProductTypeInfo(param);

                               localProductTypeInfoTracker = true;
                                      
                                      this.localProductTypeInfo=param;
                              }

                               
                             
                             /**
                             * Auto generated add method for the array for convenience
                             * @param param com.pccth.rdbservice.ProductTypeInfo
                             */
                             public void addProductTypeInfo(com.pccth.rdbservice.ProductTypeInfo param){
                                   if (localProductTypeInfo == null){
                                   localProductTypeInfo = new com.pccth.rdbservice.ProductTypeInfo[]{};
                                   }

                            
                                 //update the setting tracker
                                localProductTypeInfoTracker = true;
                            

                               java.util.List list =
                            org.apache.axis2.databinding.utils.ConverterUtil.toList(localProductTypeInfo);
                               list.add(param);
                               this.localProductTypeInfo =
                             (com.pccth.rdbservice.ProductTypeInfo[])list.toArray(
                            new com.pccth.rdbservice.ProductTypeInfo[list.size()]);

                             }
                             

                        /**
                        * field for BankInfo
                        * This was an Array!
                        */

                        
                                    protected com.pccth.rdbservice.BankInfo[] localBankInfo ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localBankInfoTracker = false ;

                           public boolean isBankInfoSpecified(){
                               return localBankInfoTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return com.pccth.rdbservice.BankInfo[]
                           */
                           public  com.pccth.rdbservice.BankInfo[] getBankInfo(){
                               return localBankInfo;
                           }

                           
                        


                               
                              /**
                               * validate the array for BankInfo
                               */
                              protected void validateBankInfo(com.pccth.rdbservice.BankInfo[] param){
                             
                              }


                             /**
                              * Auto generated setter method
                              * @param param BankInfo
                              */
                              public void setBankInfo(com.pccth.rdbservice.BankInfo[] param){
                              
                                   validateBankInfo(param);

                               localBankInfoTracker = true;
                                      
                                      this.localBankInfo=param;
                              }

                               
                             
                             /**
                             * Auto generated add method for the array for convenience
                             * @param param com.pccth.rdbservice.BankInfo
                             */
                             public void addBankInfo(com.pccth.rdbservice.BankInfo param){
                                   if (localBankInfo == null){
                                   localBankInfo = new com.pccth.rdbservice.BankInfo[]{};
                                   }

                            
                                 //update the setting tracker
                                localBankInfoTracker = true;
                            

                               java.util.List list =
                            org.apache.axis2.databinding.utils.ConverterUtil.toList(localBankInfo);
                               list.add(param);
                               this.localBankInfo =
                             (com.pccth.rdbservice.BankInfo[])list.toArray(
                            new com.pccth.rdbservice.BankInfo[list.size()]);

                             }
                             

                        /**
                        * field for CustomRateInfo
                        * This was an Array!
                        */

                        
                                    protected com.pccth.rdbservice.CustomRateInfo[] localCustomRateInfo ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localCustomRateInfoTracker = false ;

                           public boolean isCustomRateInfoSpecified(){
                               return localCustomRateInfoTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return com.pccth.rdbservice.CustomRateInfo[]
                           */
                           public  com.pccth.rdbservice.CustomRateInfo[] getCustomRateInfo(){
                               return localCustomRateInfo;
                           }

                           
                        


                               
                              /**
                               * validate the array for CustomRateInfo
                               */
                              protected void validateCustomRateInfo(com.pccth.rdbservice.CustomRateInfo[] param){
                             
                              }


                             /**
                              * Auto generated setter method
                              * @param param CustomRateInfo
                              */
                              public void setCustomRateInfo(com.pccth.rdbservice.CustomRateInfo[] param){
                              
                                   validateCustomRateInfo(param);

                               localCustomRateInfoTracker = true;
                                      
                                      this.localCustomRateInfo=param;
                              }

                               
                             
                             /**
                             * Auto generated add method for the array for convenience
                             * @param param com.pccth.rdbservice.CustomRateInfo
                             */
                             public void addCustomRateInfo(com.pccth.rdbservice.CustomRateInfo param){
                                   if (localCustomRateInfo == null){
                                   localCustomRateInfo = new com.pccth.rdbservice.CustomRateInfo[]{};
                                   }

                            
                                 //update the setting tracker
                                localCustomRateInfoTracker = true;
                            

                               java.util.List list =
                            org.apache.axis2.databinding.utils.ConverterUtil.toList(localCustomRateInfo);
                               list.add(param);
                               this.localCustomRateInfo =
                             (com.pccth.rdbservice.CustomRateInfo[])list.toArray(
                            new com.pccth.rdbservice.CustomRateInfo[list.size()]);

                             }
                             

                        /**
                        * field for EdiUnitMapInfo
                        * This was an Array!
                        */

                        
                                    protected com.pccth.rdbservice.EdiUnitMapInfo[] localEdiUnitMapInfo ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localEdiUnitMapInfoTracker = false ;

                           public boolean isEdiUnitMapInfoSpecified(){
                               return localEdiUnitMapInfoTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return com.pccth.rdbservice.EdiUnitMapInfo[]
                           */
                           public  com.pccth.rdbservice.EdiUnitMapInfo[] getEdiUnitMapInfo(){
                               return localEdiUnitMapInfo;
                           }

                           
                        


                               
                              /**
                               * validate the array for EdiUnitMapInfo
                               */
                              protected void validateEdiUnitMapInfo(com.pccth.rdbservice.EdiUnitMapInfo[] param){
                             
                              }


                             /**
                              * Auto generated setter method
                              * @param param EdiUnitMapInfo
                              */
                              public void setEdiUnitMapInfo(com.pccth.rdbservice.EdiUnitMapInfo[] param){
                              
                                   validateEdiUnitMapInfo(param);

                               localEdiUnitMapInfoTracker = true;
                                      
                                      this.localEdiUnitMapInfo=param;
                              }

                               
                             
                             /**
                             * Auto generated add method for the array for convenience
                             * @param param com.pccth.rdbservice.EdiUnitMapInfo
                             */
                             public void addEdiUnitMapInfo(com.pccth.rdbservice.EdiUnitMapInfo param){
                                   if (localEdiUnitMapInfo == null){
                                   localEdiUnitMapInfo = new com.pccth.rdbservice.EdiUnitMapInfo[]{};
                                   }

                            
                                 //update the setting tracker
                                localEdiUnitMapInfoTracker = true;
                            

                               java.util.List list =
                            org.apache.axis2.databinding.utils.ConverterUtil.toList(localEdiUnitMapInfo);
                               list.add(param);
                               this.localEdiUnitMapInfo =
                             (com.pccth.rdbservice.EdiUnitMapInfo[])list.toArray(
                            new com.pccth.rdbservice.EdiUnitMapInfo[list.size()]);

                             }
                             

                        /**
                        * field for VatSplitDetInfo
                        * This was an Array!
                        */

                        
                                    protected com.pccth.rdbservice.VatSplitDetInfo[] localVatSplitDetInfo ;
                                
                           /*  This tracker boolean wil be used to detect whether the user called the set method
                          *   for this attribute. It will be used to determine whether to include this field
                           *   in the serialized XML
                           */
                           protected boolean localVatSplitDetInfoTracker = false ;

                           public boolean isVatSplitDetInfoSpecified(){
                               return localVatSplitDetInfoTracker;
                           }

                           

                           /**
                           * Auto generated getter method
                           * @return com.pccth.rdbservice.VatSplitDetInfo[]
                           */
                           public  com.pccth.rdbservice.VatSplitDetInfo[] getVatSplitDetInfo(){
                               return localVatSplitDetInfo;
                           }

                           
                        


                               
                              /**
                               * validate the array for VatSplitDetInfo
                               */
                              protected void validateVatSplitDetInfo(com.pccth.rdbservice.VatSplitDetInfo[] param){
                             
                              }


                             /**
                              * Auto generated setter method
                              * @param param VatSplitDetInfo
                              */
                              public void setVatSplitDetInfo(com.pccth.rdbservice.VatSplitDetInfo[] param){
                              
                                   validateVatSplitDetInfo(param);

                               localVatSplitDetInfoTracker = true;
                                      
                                      this.localVatSplitDetInfo=param;
                              }

                               
                             
                             /**
                             * Auto generated add method for the array for convenience
                             * @param param com.pccth.rdbservice.VatSplitDetInfo
                             */
                             public void addVatSplitDetInfo(com.pccth.rdbservice.VatSplitDetInfo param){
                                   if (localVatSplitDetInfo == null){
                                   localVatSplitDetInfo = new com.pccth.rdbservice.VatSplitDetInfo[]{};
                                   }

                            
                                 //update the setting tracker
                                localVatSplitDetInfoTracker = true;
                            

                               java.util.List list =
                            org.apache.axis2.databinding.utils.ConverterUtil.toList(localVatSplitDetInfo);
                               list.add(param);
                               this.localVatSplitDetInfo =
                             (com.pccth.rdbservice.VatSplitDetInfo[])list.toArray(
                            new com.pccth.rdbservice.VatSplitDetInfo[list.size()]);

                             }
                             

     
     
        /**
        *
        * @param parentQName
        * @param factory
        * @return org.apache.axiom.om.OMElement
        */
       public org.apache.axiom.om.OMElement getOMElement (
               final javax.xml.namespace.QName parentQName,
               final org.apache.axiom.om.OMFactory factory) throws org.apache.axis2.databinding.ADBException{


        
               org.apache.axiom.om.OMDataSource dataSource =
                       new org.apache.axis2.databinding.ADBDataSource(this,parentQName);
               return factory.createOMElement(dataSource,parentQName);
            
        }

         public void serialize(final javax.xml.namespace.QName parentQName,
                                       javax.xml.stream.XMLStreamWriter xmlWriter)
                                throws javax.xml.stream.XMLStreamException, org.apache.axis2.databinding.ADBException{
                           serialize(parentQName,xmlWriter,false);
         }

         public void serialize(final javax.xml.namespace.QName parentQName,
                               javax.xml.stream.XMLStreamWriter xmlWriter,
                               boolean serializeType)
            throws javax.xml.stream.XMLStreamException, org.apache.axis2.databinding.ADBException{
            
                


                java.lang.String prefix = null;
                java.lang.String namespace = null;
                

                    prefix = parentQName.getPrefix();
                    namespace = parentQName.getNamespaceURI();
                    writeStartElement(prefix, namespace, parentQName.getLocalPart(), xmlWriter);
                
                  if (serializeType){
               

                   java.lang.String namespacePrefix = registerPrefix(xmlWriter,"http://rdbservice.pccth.com/");
                   if ((namespacePrefix != null) && (namespacePrefix.trim().length() > 0)){
                       writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","type",
                           namespacePrefix+":Body",
                           xmlWriter);
                   } else {
                       writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","type",
                           "Body",
                           xmlWriter);
                   }

               
                   }
                if (localCdProductUnitInfoTracker){
                                       if (localCdProductUnitInfo!=null){
                                            for (int i = 0;i < localCdProductUnitInfo.length;i++){
                                                if (localCdProductUnitInfo[i] != null){
                                                 localCdProductUnitInfo[i].serialize(new javax.xml.namespace.QName("http://rdbservice.pccth.com/","cdProductUnitInfo"),
                                                           xmlWriter);
                                                } else {
                                                   
                                                            writeStartElement(null, "http://rdbservice.pccth.com/", "cdProductUnitInfo", xmlWriter);

                                                           // write the nil attribute
                                                           writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                                           xmlWriter.writeEndElement();
                                                    
                                                }

                                            }
                                     } else {
                                        
                                                writeStartElement(null, "http://rdbservice.pccth.com/", "cdProductUnitInfo", xmlWriter);

                                               // write the nil attribute
                                               writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                               xmlWriter.writeEndElement();
                                        
                                    }
                                 } if (localHospitalInfoTracker){
                                       if (localHospitalInfo!=null){
                                            for (int i = 0;i < localHospitalInfo.length;i++){
                                                if (localHospitalInfo[i] != null){
                                                 localHospitalInfo[i].serialize(new javax.xml.namespace.QName("http://rdbservice.pccth.com/","hospitalInfo"),
                                                           xmlWriter);
                                                } else {
                                                   
                                                            writeStartElement(null, "http://rdbservice.pccth.com/", "hospitalInfo", xmlWriter);

                                                           // write the nil attribute
                                                           writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                                           xmlWriter.writeEndElement();
                                                    
                                                }

                                            }
                                     } else {
                                        
                                                writeStartElement(null, "http://rdbservice.pccth.com/", "hospitalInfo", xmlWriter);

                                               // write the nil attribute
                                               writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                               xmlWriter.writeEndElement();
                                        
                                    }
                                 } if (localDegreeInfoTracker){
                                       if (localDegreeInfo!=null){
                                            for (int i = 0;i < localDegreeInfo.length;i++){
                                                if (localDegreeInfo[i] != null){
                                                 localDegreeInfo[i].serialize(new javax.xml.namespace.QName("http://rdbservice.pccth.com/","degreeInfo"),
                                                           xmlWriter);
                                                } else {
                                                   
                                                            writeStartElement(null, "http://rdbservice.pccth.com/", "degreeInfo", xmlWriter);

                                                           // write the nil attribute
                                                           writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                                           xmlWriter.writeEndElement();
                                                    
                                                }

                                            }
                                     } else {
                                        
                                                writeStartElement(null, "http://rdbservice.pccth.com/", "degreeInfo", xmlWriter);

                                               // write the nil attribute
                                               writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                               xmlWriter.writeEndElement();
                                        
                                    }
                                 } if (localZipCodeInfoTracker){
                                       if (localZipCodeInfo!=null){
                                            for (int i = 0;i < localZipCodeInfo.length;i++){
                                                if (localZipCodeInfo[i] != null){
                                                 localZipCodeInfo[i].serialize(new javax.xml.namespace.QName("http://rdbservice.pccth.com/","zipCodeInfo"),
                                                           xmlWriter);
                                                } else {
                                                   
                                                            writeStartElement(null, "http://rdbservice.pccth.com/", "zipCodeInfo", xmlWriter);

                                                           // write the nil attribute
                                                           writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                                           xmlWriter.writeEndElement();
                                                    
                                                }

                                            }
                                     } else {
                                        
                                                writeStartElement(null, "http://rdbservice.pccth.com/", "zipCodeInfo", xmlWriter);

                                               // write the nil attribute
                                               writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                               xmlWriter.writeEndElement();
                                        
                                    }
                                 } if (localTimeRateInfoTracker){
                                       if (localTimeRateInfo!=null){
                                            for (int i = 0;i < localTimeRateInfo.length;i++){
                                                if (localTimeRateInfo[i] != null){
                                                 localTimeRateInfo[i].serialize(new javax.xml.namespace.QName("http://rdbservice.pccth.com/","timeRateInfo"),
                                                           xmlWriter);
                                                } else {
                                                   
                                                            writeStartElement(null, "http://rdbservice.pccth.com/", "timeRateInfo", xmlWriter);

                                                           // write the nil attribute
                                                           writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                                           xmlWriter.writeEndElement();
                                                    
                                                }

                                            }
                                     } else {
                                        
                                                writeStartElement(null, "http://rdbservice.pccth.com/", "timeRateInfo", xmlWriter);

                                               // write the nil attribute
                                               writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                               xmlWriter.writeEndElement();
                                        
                                    }
                                 } if (localEmbassyInfoTracker){
                                       if (localEmbassyInfo!=null){
                                            for (int i = 0;i < localEmbassyInfo.length;i++){
                                                if (localEmbassyInfo[i] != null){
                                                 localEmbassyInfo[i].serialize(new javax.xml.namespace.QName("http://rdbservice.pccth.com/","embassyInfo"),
                                                           xmlWriter);
                                                } else {
                                                   
                                                            writeStartElement(null, "http://rdbservice.pccth.com/", "embassyInfo", xmlWriter);

                                                           // write the nil attribute
                                                           writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                                           xmlWriter.writeEndElement();
                                                    
                                                }

                                            }
                                     } else {
                                        
                                                writeStartElement(null, "http://rdbservice.pccth.com/", "embassyInfo", xmlWriter);

                                               // write the nil attribute
                                               writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                               xmlWriter.writeEndElement();
                                        
                                    }
                                 } if (localTitleInfoTracker){
                                       if (localTitleInfo!=null){
                                            for (int i = 0;i < localTitleInfo.length;i++){
                                                if (localTitleInfo[i] != null){
                                                 localTitleInfo[i].serialize(new javax.xml.namespace.QName("http://rdbservice.pccth.com/","titleInfo"),
                                                           xmlWriter);
                                                } else {
                                                   
                                                            writeStartElement(null, "http://rdbservice.pccth.com/", "titleInfo", xmlWriter);

                                                           // write the nil attribute
                                                           writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                                           xmlWriter.writeEndElement();
                                                    
                                                }

                                            }
                                     } else {
                                        
                                                writeStartElement(null, "http://rdbservice.pccth.com/", "titleInfo", xmlWriter);

                                               // write the nil attribute
                                               writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                               xmlWriter.writeEndElement();
                                        
                                    }
                                 } if (localAnacarGrpInfoTracker){
                                       if (localAnacarGrpInfo!=null){
                                            for (int i = 0;i < localAnacarGrpInfo.length;i++){
                                                if (localAnacarGrpInfo[i] != null){
                                                 localAnacarGrpInfo[i].serialize(new javax.xml.namespace.QName("http://rdbservice.pccth.com/","anacarGrpInfo"),
                                                           xmlWriter);
                                                } else {
                                                   
                                                            writeStartElement(null, "http://rdbservice.pccth.com/", "anacarGrpInfo", xmlWriter);

                                                           // write the nil attribute
                                                           writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                                           xmlWriter.writeEndElement();
                                                    
                                                }

                                            }
                                     } else {
                                        
                                                writeStartElement(null, "http://rdbservice.pccth.com/", "anacarGrpInfo", xmlWriter);

                                               // write the nil attribute
                                               writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                               xmlWriter.writeEndElement();
                                        
                                    }
                                 } if (localProductSubTypeInfoTracker){
                                       if (localProductSubTypeInfo!=null){
                                            for (int i = 0;i < localProductSubTypeInfo.length;i++){
                                                if (localProductSubTypeInfo[i] != null){
                                                 localProductSubTypeInfo[i].serialize(new javax.xml.namespace.QName("http://rdbservice.pccth.com/","productSubTypeInfo"),
                                                           xmlWriter);
                                                } else {
                                                   
                                                            writeStartElement(null, "http://rdbservice.pccth.com/", "productSubTypeInfo", xmlWriter);

                                                           // write the nil attribute
                                                           writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                                           xmlWriter.writeEndElement();
                                                    
                                                }

                                            }
                                     } else {
                                        
                                                writeStartElement(null, "http://rdbservice.pccth.com/", "productSubTypeInfo", xmlWriter);

                                               // write the nil attribute
                                               writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                               xmlWriter.writeEndElement();
                                        
                                    }
                                 } if (localAreaCodeInfoTracker){
                                       if (localAreaCodeInfo!=null){
                                            for (int i = 0;i < localAreaCodeInfo.length;i++){
                                                if (localAreaCodeInfo[i] != null){
                                                 localAreaCodeInfo[i].serialize(new javax.xml.namespace.QName("http://rdbservice.pccth.com/","areaCodeInfo"),
                                                           xmlWriter);
                                                } else {
                                                   
                                                            writeStartElement(null, "http://rdbservice.pccth.com/", "areaCodeInfo", xmlWriter);

                                                           // write the nil attribute
                                                           writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                                           xmlWriter.writeEndElement();
                                                    
                                                }

                                            }
                                     } else {
                                        
                                                writeStartElement(null, "http://rdbservice.pccth.com/", "areaCodeInfo", xmlWriter);

                                               // write the nil attribute
                                               writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                               xmlWriter.writeEndElement();
                                        
                                    }
                                 } if (localVatRateInfoTracker){
                                       if (localVatRateInfo!=null){
                                            for (int i = 0;i < localVatRateInfo.length;i++){
                                                if (localVatRateInfo[i] != null){
                                                 localVatRateInfo[i].serialize(new javax.xml.namespace.QName("http://rdbservice.pccth.com/","vatRateInfo"),
                                                           xmlWriter);
                                                } else {
                                                   
                                                            writeStartElement(null, "http://rdbservice.pccth.com/", "vatRateInfo", xmlWriter);

                                                           // write the nil attribute
                                                           writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                                           xmlWriter.writeEndElement();
                                                    
                                                }

                                            }
                                     } else {
                                        
                                                writeStartElement(null, "http://rdbservice.pccth.com/", "vatRateInfo", xmlWriter);

                                               // write the nil attribute
                                               writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                               xmlWriter.writeEndElement();
                                        
                                    }
                                 } if (localCountryInfoTracker){
                                       if (localCountryInfo!=null){
                                            for (int i = 0;i < localCountryInfo.length;i++){
                                                if (localCountryInfo[i] != null){
                                                 localCountryInfo[i].serialize(new javax.xml.namespace.QName("http://rdbservice.pccth.com/","countryInfo"),
                                                           xmlWriter);
                                                } else {
                                                   
                                                            writeStartElement(null, "http://rdbservice.pccth.com/", "countryInfo", xmlWriter);

                                                           // write the nil attribute
                                                           writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                                           xmlWriter.writeEndElement();
                                                    
                                                }

                                            }
                                     } else {
                                        
                                                writeStartElement(null, "http://rdbservice.pccth.com/", "countryInfo", xmlWriter);

                                               // write the nil attribute
                                               writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                               xmlWriter.writeEndElement();
                                        
                                    }
                                 } if (localApproveLevelInfoTracker){
                                       if (localApproveLevelInfo!=null){
                                            for (int i = 0;i < localApproveLevelInfo.length;i++){
                                                if (localApproveLevelInfo[i] != null){
                                                 localApproveLevelInfo[i].serialize(new javax.xml.namespace.QName("http://rdbservice.pccth.com/","approveLevelInfo"),
                                                           xmlWriter);
                                                } else {
                                                   
                                                            writeStartElement(null, "http://rdbservice.pccth.com/", "approveLevelInfo", xmlWriter);

                                                           // write the nil attribute
                                                           writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                                           xmlWriter.writeEndElement();
                                                    
                                                }

                                            }
                                     } else {
                                        
                                                writeStartElement(null, "http://rdbservice.pccth.com/", "approveLevelInfo", xmlWriter);

                                               // write the nil attribute
                                               writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                               xmlWriter.writeEndElement();
                                        
                                    }
                                 } if (localAccMastInfoTracker){
                                       if (localAccMastInfo!=null){
                                            for (int i = 0;i < localAccMastInfo.length;i++){
                                                if (localAccMastInfo[i] != null){
                                                 localAccMastInfo[i].serialize(new javax.xml.namespace.QName("http://rdbservice.pccth.com/","accMastInfo"),
                                                           xmlWriter);
                                                } else {
                                                   
                                                            writeStartElement(null, "http://rdbservice.pccth.com/", "accMastInfo", xmlWriter);

                                                           // write the nil attribute
                                                           writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                                           xmlWriter.writeEndElement();
                                                    
                                                }

                                            }
                                     } else {
                                        
                                                writeStartElement(null, "http://rdbservice.pccth.com/", "accMastInfo", xmlWriter);

                                               // write the nil attribute
                                               writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                               xmlWriter.writeEndElement();
                                        
                                    }
                                 } if (localFormCodeInfoTracker){
                                       if (localFormCodeInfo!=null){
                                            for (int i = 0;i < localFormCodeInfo.length;i++){
                                                if (localFormCodeInfo[i] != null){
                                                 localFormCodeInfo[i].serialize(new javax.xml.namespace.QName("http://rdbservice.pccth.com/","formCodeInfo"),
                                                           xmlWriter);
                                                } else {
                                                   
                                                            writeStartElement(null, "http://rdbservice.pccth.com/", "formCodeInfo", xmlWriter);

                                                           // write the nil attribute
                                                           writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                                           xmlWriter.writeEndElement();
                                                    
                                                }

                                            }
                                     } else {
                                        
                                                writeStartElement(null, "http://rdbservice.pccth.com/", "formCodeInfo", xmlWriter);

                                               // write the nil attribute
                                               writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                               xmlWriter.writeEndElement();
                                        
                                    }
                                 } if (localCurrencyInfoTracker){
                                       if (localCurrencyInfo!=null){
                                            for (int i = 0;i < localCurrencyInfo.length;i++){
                                                if (localCurrencyInfo[i] != null){
                                                 localCurrencyInfo[i].serialize(new javax.xml.namespace.QName("http://rdbservice.pccth.com/","currencyInfo"),
                                                           xmlWriter);
                                                } else {
                                                   
                                                            writeStartElement(null, "http://rdbservice.pccth.com/", "currencyInfo", xmlWriter);

                                                           // write the nil attribute
                                                           writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                                           xmlWriter.writeEndElement();
                                                    
                                                }

                                            }
                                     } else {
                                        
                                                writeStartElement(null, "http://rdbservice.pccth.com/", "currencyInfo", xmlWriter);

                                               // write the nil attribute
                                               writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                               xmlWriter.writeEndElement();
                                        
                                    }
                                 } if (localObjRateInfoTracker){
                                       if (localObjRateInfo!=null){
                                            for (int i = 0;i < localObjRateInfo.length;i++){
                                                if (localObjRateInfo[i] != null){
                                                 localObjRateInfo[i].serialize(new javax.xml.namespace.QName("http://rdbservice.pccth.com/","objRateInfo"),
                                                           xmlWriter);
                                                } else {
                                                   
                                                            writeStartElement(null, "http://rdbservice.pccth.com/", "objRateInfo", xmlWriter);

                                                           // write the nil attribute
                                                           writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                                           xmlWriter.writeEndElement();
                                                    
                                                }

                                            }
                                     } else {
                                        
                                                writeStartElement(null, "http://rdbservice.pccth.com/", "objRateInfo", xmlWriter);

                                               // write the nil attribute
                                               writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                               xmlWriter.writeEndElement();
                                        
                                    }
                                 }
                                    namespace = "http://rdbservice.pccth.com/";
                                    writeStartElement(null, namespace, "returnDesc", xmlWriter);
                             

                                          if (localReturnDesc==null){
                                              // write the nil attribute
                                              
                                                     writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                                  
                                          }else{

                                        
                                                   xmlWriter.writeCharacters(localReturnDesc);
                                            
                                          }
                                    
                                   xmlWriter.writeEndElement();
                              if (localCusGrpInfoTracker){
                                       if (localCusGrpInfo!=null){
                                            for (int i = 0;i < localCusGrpInfo.length;i++){
                                                if (localCusGrpInfo[i] != null){
                                                 localCusGrpInfo[i].serialize(new javax.xml.namespace.QName("http://rdbservice.pccth.com/","cusGrpInfo"),
                                                           xmlWriter);
                                                } else {
                                                   
                                                            writeStartElement(null, "http://rdbservice.pccth.com/", "cusGrpInfo", xmlWriter);

                                                           // write the nil attribute
                                                           writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                                           xmlWriter.writeEndElement();
                                                    
                                                }

                                            }
                                     } else {
                                        
                                                writeStartElement(null, "http://rdbservice.pccth.com/", "cusGrpInfo", xmlWriter);

                                               // write the nil attribute
                                               writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                               xmlWriter.writeEndElement();
                                        
                                    }
                                 } if (localAnacarSdInfoTracker){
                                       if (localAnacarSdInfo!=null){
                                            for (int i = 0;i < localAnacarSdInfo.length;i++){
                                                if (localAnacarSdInfo[i] != null){
                                                 localAnacarSdInfo[i].serialize(new javax.xml.namespace.QName("http://rdbservice.pccth.com/","anacarSdInfo"),
                                                           xmlWriter);
                                                } else {
                                                   
                                                            writeStartElement(null, "http://rdbservice.pccth.com/", "anacarSdInfo", xmlWriter);

                                                           // write the nil attribute
                                                           writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                                           xmlWriter.writeEndElement();
                                                    
                                                }

                                            }
                                     } else {
                                        
                                                writeStartElement(null, "http://rdbservice.pccth.com/", "anacarSdInfo", xmlWriter);

                                               // write the nil attribute
                                               writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                               xmlWriter.writeEndElement();
                                        
                                    }
                                 } if (localStructureGoodsInfoTracker){
                                       if (localStructureGoodsInfo!=null){
                                            for (int i = 0;i < localStructureGoodsInfo.length;i++){
                                                if (localStructureGoodsInfo[i] != null){
                                                 localStructureGoodsInfo[i].serialize(new javax.xml.namespace.QName("http://rdbservice.pccth.com/","structureGoodsInfo"),
                                                           xmlWriter);
                                                } else {
                                                   
                                                            writeStartElement(null, "http://rdbservice.pccth.com/", "structureGoodsInfo", xmlWriter);

                                                           // write the nil attribute
                                                           writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                                           xmlWriter.writeEndElement();
                                                    
                                                }

                                            }
                                     } else {
                                        
                                                writeStartElement(null, "http://rdbservice.pccth.com/", "structureGoodsInfo", xmlWriter);

                                               // write the nil attribute
                                               writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                               xmlWriter.writeEndElement();
                                        
                                    }
                                 } if (localIncMastInfoTracker){
                                       if (localIncMastInfo!=null){
                                            for (int i = 0;i < localIncMastInfo.length;i++){
                                                if (localIncMastInfo[i] != null){
                                                 localIncMastInfo[i].serialize(new javax.xml.namespace.QName("http://rdbservice.pccth.com/","incMastInfo"),
                                                           xmlWriter);
                                                } else {
                                                   
                                                            writeStartElement(null, "http://rdbservice.pccth.com/", "incMastInfo", xmlWriter);

                                                           // write the nil attribute
                                                           writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                                           xmlWriter.writeEndElement();
                                                    
                                                }

                                            }
                                     } else {
                                        
                                                writeStartElement(null, "http://rdbservice.pccth.com/", "incMastInfo", xmlWriter);

                                               // write the nil attribute
                                               writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                               xmlWriter.writeEndElement();
                                        
                                    }
                                 } if (localDutyUnitInfoTracker){
                                       if (localDutyUnitInfo!=null){
                                            for (int i = 0;i < localDutyUnitInfo.length;i++){
                                                if (localDutyUnitInfo[i] != null){
                                                 localDutyUnitInfo[i].serialize(new javax.xml.namespace.QName("http://rdbservice.pccth.com/","dutyUnitInfo"),
                                                           xmlWriter);
                                                } else {
                                                   
                                                            writeStartElement(null, "http://rdbservice.pccth.com/", "dutyUnitInfo", xmlWriter);

                                                           // write the nil attribute
                                                           writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                                           xmlWriter.writeEndElement();
                                                    
                                                }

                                            }
                                     } else {
                                        
                                                writeStartElement(null, "http://rdbservice.pccth.com/", "dutyUnitInfo", xmlWriter);

                                               // write the nil attribute
                                               writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                               xmlWriter.writeEndElement();
                                        
                                    }
                                 } if (localCustomHouseInfoTracker){
                                       if (localCustomHouseInfo!=null){
                                            for (int i = 0;i < localCustomHouseInfo.length;i++){
                                                if (localCustomHouseInfo[i] != null){
                                                 localCustomHouseInfo[i].serialize(new javax.xml.namespace.QName("http://rdbservice.pccth.com/","customHouseInfo"),
                                                           xmlWriter);
                                                } else {
                                                   
                                                            writeStartElement(null, "http://rdbservice.pccth.com/", "customHouseInfo", xmlWriter);

                                                           // write the nil attribute
                                                           writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                                           xmlWriter.writeEndElement();
                                                    
                                                }

                                            }
                                     } else {
                                        
                                                writeStartElement(null, "http://rdbservice.pccth.com/", "customHouseInfo", xmlWriter);

                                               // write the nil attribute
                                               writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                               xmlWriter.writeEndElement();
                                        
                                    }
                                 } if (localTitleOldInfoTracker){
                                       if (localTitleOldInfo!=null){
                                            for (int i = 0;i < localTitleOldInfo.length;i++){
                                                if (localTitleOldInfo[i] != null){
                                                 localTitleOldInfo[i].serialize(new javax.xml.namespace.QName("http://rdbservice.pccth.com/","titleOldInfo"),
                                                           xmlWriter);
                                                } else {
                                                   
                                                            writeStartElement(null, "http://rdbservice.pccth.com/", "titleOldInfo", xmlWriter);

                                                           // write the nil attribute
                                                           writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                                           xmlWriter.writeEndElement();
                                                    
                                                }

                                            }
                                     } else {
                                        
                                                writeStartElement(null, "http://rdbservice.pccth.com/", "titleOldInfo", xmlWriter);

                                               // write the nil attribute
                                               writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                               xmlWriter.writeEndElement();
                                        
                                    }
                                 } if (localEdiGoodsInfoTracker){
                                       if (localEdiGoodsInfo!=null){
                                            for (int i = 0;i < localEdiGoodsInfo.length;i++){
                                                if (localEdiGoodsInfo[i] != null){
                                                 localEdiGoodsInfo[i].serialize(new javax.xml.namespace.QName("http://rdbservice.pccth.com/","ediGoodsInfo"),
                                                           xmlWriter);
                                                } else {
                                                   
                                                            writeStartElement(null, "http://rdbservice.pccth.com/", "ediGoodsInfo", xmlWriter);

                                                           // write the nil attribute
                                                           writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                                           xmlWriter.writeEndElement();
                                                    
                                                }

                                            }
                                     } else {
                                        
                                                writeStartElement(null, "http://rdbservice.pccth.com/", "ediGoodsInfo", xmlWriter);

                                               // write the nil attribute
                                               writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                               xmlWriter.writeEndElement();
                                        
                                    }
                                 } if (localProductUnitInfoTracker){
                                       if (localProductUnitInfo!=null){
                                            for (int i = 0;i < localProductUnitInfo.length;i++){
                                                if (localProductUnitInfo[i] != null){
                                                 localProductUnitInfo[i].serialize(new javax.xml.namespace.QName("http://rdbservice.pccth.com/","productUnitInfo"),
                                                           xmlWriter);
                                                } else {
                                                   
                                                            writeStartElement(null, "http://rdbservice.pccth.com/", "productUnitInfo", xmlWriter);

                                                           // write the nil attribute
                                                           writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                                           xmlWriter.writeEndElement();
                                                    
                                                }

                                            }
                                     } else {
                                        
                                                writeStartElement(null, "http://rdbservice.pccth.com/", "productUnitInfo", xmlWriter);

                                               // write the nil attribute
                                               writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                               xmlWriter.writeEndElement();
                                        
                                    }
                                 } if (localSssFundRateInfoTracker){
                                       if (localSssFundRateInfo!=null){
                                            for (int i = 0;i < localSssFundRateInfo.length;i++){
                                                if (localSssFundRateInfo[i] != null){
                                                 localSssFundRateInfo[i].serialize(new javax.xml.namespace.QName("http://rdbservice.pccth.com/","sssFundRateInfo"),
                                                           xmlWriter);
                                                } else {
                                                   
                                                            writeStartElement(null, "http://rdbservice.pccth.com/", "sssFundRateInfo", xmlWriter);

                                                           // write the nil attribute
                                                           writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                                           xmlWriter.writeEndElement();
                                                    
                                                }

                                            }
                                     } else {
                                        
                                                writeStartElement(null, "http://rdbservice.pccth.com/", "sssFundRateInfo", xmlWriter);

                                               // write the nil attribute
                                               writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                               xmlWriter.writeEndElement();
                                        
                                    }
                                 } if (localDutyMaterialInfoTracker){
                                       if (localDutyMaterialInfo!=null){
                                            for (int i = 0;i < localDutyMaterialInfo.length;i++){
                                                if (localDutyMaterialInfo[i] != null){
                                                 localDutyMaterialInfo[i].serialize(new javax.xml.namespace.QName("http://rdbservice.pccth.com/","dutyMaterialInfo"),
                                                           xmlWriter);
                                                } else {
                                                   
                                                            writeStartElement(null, "http://rdbservice.pccth.com/", "dutyMaterialInfo", xmlWriter);

                                                           // write the nil attribute
                                                           writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                                           xmlWriter.writeEndElement();
                                                    
                                                }

                                            }
                                     } else {
                                        
                                                writeStartElement(null, "http://rdbservice.pccth.com/", "dutyMaterialInfo", xmlWriter);

                                               // write the nil attribute
                                               writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                               xmlWriter.writeEndElement();
                                        
                                    }
                                 } if (localDutyGroupInfoTracker){
                                       if (localDutyGroupInfo!=null){
                                            for (int i = 0;i < localDutyGroupInfo.length;i++){
                                                if (localDutyGroupInfo[i] != null){
                                                 localDutyGroupInfo[i].serialize(new javax.xml.namespace.QName("http://rdbservice.pccth.com/","dutyGroupInfo"),
                                                           xmlWriter);
                                                } else {
                                                   
                                                            writeStartElement(null, "http://rdbservice.pccth.com/", "dutyGroupInfo", xmlWriter);

                                                           // write the nil attribute
                                                           writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                                           xmlWriter.writeEndElement();
                                                    
                                                }

                                            }
                                     } else {
                                        
                                                writeStartElement(null, "http://rdbservice.pccth.com/", "dutyGroupInfo", xmlWriter);

                                               // write the nil attribute
                                               writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                               xmlWriter.writeEndElement();
                                        
                                    }
                                 } if (localImportCompInfoTracker){
                                       if (localImportCompInfo!=null){
                                            for (int i = 0;i < localImportCompInfo.length;i++){
                                                if (localImportCompInfo[i] != null){
                                                 localImportCompInfo[i].serialize(new javax.xml.namespace.QName("http://rdbservice.pccth.com/","importCompInfo"),
                                                           xmlWriter);
                                                } else {
                                                   
                                                            writeStartElement(null, "http://rdbservice.pccth.com/", "importCompInfo", xmlWriter);

                                                           // write the nil attribute
                                                           writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                                           xmlWriter.writeEndElement();
                                                    
                                                }

                                            }
                                     } else {
                                        
                                                writeStartElement(null, "http://rdbservice.pccth.com/", "importCompInfo", xmlWriter);

                                               // write the nil attribute
                                               writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                               xmlWriter.writeEndElement();
                                        
                                    }
                                 } if (localMaterialInfoTracker){
                                       if (localMaterialInfo!=null){
                                            for (int i = 0;i < localMaterialInfo.length;i++){
                                                if (localMaterialInfo[i] != null){
                                                 localMaterialInfo[i].serialize(new javax.xml.namespace.QName("http://rdbservice.pccth.com/","materialInfo"),
                                                           xmlWriter);
                                                } else {
                                                   
                                                            writeStartElement(null, "http://rdbservice.pccth.com/", "materialInfo", xmlWriter);

                                                           // write the nil attribute
                                                           writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                                           xmlWriter.writeEndElement();
                                                    
                                                }

                                            }
                                     } else {
                                        
                                                writeStartElement(null, "http://rdbservice.pccth.com/", "materialInfo", xmlWriter);

                                               // write the nil attribute
                                               writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                               xmlWriter.writeEndElement();
                                        
                                    }
                                 } if (localLocalRateInfoTracker){
                                       if (localLocalRateInfo!=null){
                                            for (int i = 0;i < localLocalRateInfo.length;i++){
                                                if (localLocalRateInfo[i] != null){
                                                 localLocalRateInfo[i].serialize(new javax.xml.namespace.QName("http://rdbservice.pccth.com/","localRateInfo"),
                                                           xmlWriter);
                                                } else {
                                                   
                                                            writeStartElement(null, "http://rdbservice.pccth.com/", "localRateInfo", xmlWriter);

                                                           // write the nil attribute
                                                           writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                                           xmlWriter.writeEndElement();
                                                    
                                                }

                                            }
                                     } else {
                                        
                                                writeStartElement(null, "http://rdbservice.pccth.com/", "localRateInfo", xmlWriter);

                                               // write the nil attribute
                                               writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                               xmlWriter.writeEndElement();
                                        
                                    }
                                 } if (localCdCountryInfoTracker){
                                       if (localCdCountryInfo!=null){
                                            for (int i = 0;i < localCdCountryInfo.length;i++){
                                                if (localCdCountryInfo[i] != null){
                                                 localCdCountryInfo[i].serialize(new javax.xml.namespace.QName("http://rdbservice.pccth.com/","cdCountryInfo"),
                                                           xmlWriter);
                                                } else {
                                                   
                                                            writeStartElement(null, "http://rdbservice.pccth.com/", "cdCountryInfo", xmlWriter);

                                                           // write the nil attribute
                                                           writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                                           xmlWriter.writeEndElement();
                                                    
                                                }

                                            }
                                     } else {
                                        
                                                writeStartElement(null, "http://rdbservice.pccth.com/", "cdCountryInfo", xmlWriter);

                                               // write the nil attribute
                                               writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                               xmlWriter.writeEndElement();
                                        
                                    }
                                 } if (localProductIncMastInfoTracker){
                                       if (localProductIncMastInfo!=null){
                                            for (int i = 0;i < localProductIncMastInfo.length;i++){
                                                if (localProductIncMastInfo[i] != null){
                                                 localProductIncMastInfo[i].serialize(new javax.xml.namespace.QName("http://rdbservice.pccth.com/","productIncMastInfo"),
                                                           xmlWriter);
                                                } else {
                                                   
                                                            writeStartElement(null, "http://rdbservice.pccth.com/", "productIncMastInfo", xmlWriter);

                                                           // write the nil attribute
                                                           writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                                           xmlWriter.writeEndElement();
                                                    
                                                }

                                            }
                                     } else {
                                        
                                                writeStartElement(null, "http://rdbservice.pccth.com/", "productIncMastInfo", xmlWriter);

                                               // write the nil attribute
                                               writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                               xmlWriter.writeEndElement();
                                        
                                    }
                                 } if (localLicenseHdInfoTracker){
                                       if (localLicenseHdInfo!=null){
                                            for (int i = 0;i < localLicenseHdInfo.length;i++){
                                                if (localLicenseHdInfo[i] != null){
                                                 localLicenseHdInfo[i].serialize(new javax.xml.namespace.QName("http://rdbservice.pccth.com/","licenseHdInfo"),
                                                           xmlWriter);
                                                } else {
                                                   
                                                            writeStartElement(null, "http://rdbservice.pccth.com/", "licenseHdInfo", xmlWriter);

                                                           // write the nil attribute
                                                           writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                                           xmlWriter.writeEndElement();
                                                    
                                                }

                                            }
                                     } else {
                                        
                                                writeStartElement(null, "http://rdbservice.pccth.com/", "licenseHdInfo", xmlWriter);

                                               // write the nil attribute
                                               writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                               xmlWriter.writeEndElement();
                                        
                                    }
                                 } if (localIncomeTypeInfoTracker){
                                       if (localIncomeTypeInfo!=null){
                                            for (int i = 0;i < localIncomeTypeInfo.length;i++){
                                                if (localIncomeTypeInfo[i] != null){
                                                 localIncomeTypeInfo[i].serialize(new javax.xml.namespace.QName("http://rdbservice.pccth.com/","incomeTypeInfo"),
                                                           xmlWriter);
                                                } else {
                                                   
                                                            writeStartElement(null, "http://rdbservice.pccth.com/", "incomeTypeInfo", xmlWriter);

                                                           // write the nil attribute
                                                           writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                                           xmlWriter.writeEndElement();
                                                    
                                                }

                                            }
                                     } else {
                                        
                                                writeStartElement(null, "http://rdbservice.pccth.com/", "incomeTypeInfo", xmlWriter);

                                               // write the nil attribute
                                               writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                               xmlWriter.writeEndElement();
                                        
                                    }
                                 } if (localDueDatePs0112InfoTracker){
                                       if (localDueDatePs0112Info!=null){
                                            for (int i = 0;i < localDueDatePs0112Info.length;i++){
                                                if (localDueDatePs0112Info[i] != null){
                                                 localDueDatePs0112Info[i].serialize(new javax.xml.namespace.QName("http://rdbservice.pccth.com/","dueDatePs0112Info"),
                                                           xmlWriter);
                                                } else {
                                                   
                                                            writeStartElement(null, "http://rdbservice.pccth.com/", "dueDatePs0112Info", xmlWriter);

                                                           // write the nil attribute
                                                           writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                                           xmlWriter.writeEndElement();
                                                    
                                                }

                                            }
                                     } else {
                                        
                                                writeStartElement(null, "http://rdbservice.pccth.com/", "dueDatePs0112Info", xmlWriter);

                                               // write the nil attribute
                                               writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                               xmlWriter.writeEndElement();
                                        
                                    }
                                 } if (localLicenseDtInfoTracker){
                                       if (localLicenseDtInfo!=null){
                                            for (int i = 0;i < localLicenseDtInfo.length;i++){
                                                if (localLicenseDtInfo[i] != null){
                                                 localLicenseDtInfo[i].serialize(new javax.xml.namespace.QName("http://rdbservice.pccth.com/","licenseDtInfo"),
                                                           xmlWriter);
                                                } else {
                                                   
                                                            writeStartElement(null, "http://rdbservice.pccth.com/", "licenseDtInfo", xmlWriter);

                                                           // write the nil attribute
                                                           writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                                           xmlWriter.writeEndElement();
                                                    
                                                }

                                            }
                                     } else {
                                        
                                                writeStartElement(null, "http://rdbservice.pccth.com/", "licenseDtInfo", xmlWriter);

                                               // write the nil attribute
                                               writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                               xmlWriter.writeEndElement();
                                        
                                    }
                                 } if (localHolidayInfoTracker){
                                       if (localHolidayInfo!=null){
                                            for (int i = 0;i < localHolidayInfo.length;i++){
                                                if (localHolidayInfo[i] != null){
                                                 localHolidayInfo[i].serialize(new javax.xml.namespace.QName("http://rdbservice.pccth.com/","holidayInfo"),
                                                           xmlWriter);
                                                } else {
                                                   
                                                            writeStartElement(null, "http://rdbservice.pccth.com/", "holidayInfo", xmlWriter);

                                                           // write the nil attribute
                                                           writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                                           xmlWriter.writeEndElement();
                                                    
                                                }

                                            }
                                     } else {
                                        
                                                writeStartElement(null, "http://rdbservice.pccth.com/", "holidayInfo", xmlWriter);

                                               // write the nil attribute
                                               writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                               xmlWriter.writeEndElement();
                                        
                                    }
                                 } if (localSystemParamInfoTracker){
                                       if (localSystemParamInfo!=null){
                                            for (int i = 0;i < localSystemParamInfo.length;i++){
                                                if (localSystemParamInfo[i] != null){
                                                 localSystemParamInfo[i].serialize(new javax.xml.namespace.QName("http://rdbservice.pccth.com/","systemParamInfo"),
                                                           xmlWriter);
                                                } else {
                                                   
                                                            writeStartElement(null, "http://rdbservice.pccth.com/", "systemParamInfo", xmlWriter);

                                                           // write the nil attribute
                                                           writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                                           xmlWriter.writeEndElement();
                                                    
                                                }

                                            }
                                     } else {
                                        
                                                writeStartElement(null, "http://rdbservice.pccth.com/", "systemParamInfo", xmlWriter);

                                               // write the nil attribute
                                               writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                               xmlWriter.writeEndElement();
                                        
                                    }
                                 } if (localBankBranchInfoTracker){
                                       if (localBankBranchInfo!=null){
                                            for (int i = 0;i < localBankBranchInfo.length;i++){
                                                if (localBankBranchInfo[i] != null){
                                                 localBankBranchInfo[i].serialize(new javax.xml.namespace.QName("http://rdbservice.pccth.com/","bankBranchInfo"),
                                                           xmlWriter);
                                                } else {
                                                   
                                                            writeStartElement(null, "http://rdbservice.pccth.com/", "bankBranchInfo", xmlWriter);

                                                           // write the nil attribute
                                                           writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                                           xmlWriter.writeEndElement();
                                                    
                                                }

                                            }
                                     } else {
                                        
                                                writeStartElement(null, "http://rdbservice.pccth.com/", "bankBranchInfo", xmlWriter);

                                               // write the nil attribute
                                               writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                               xmlWriter.writeEndElement();
                                        
                                    }
                                 } if (localDutyTableInfoTracker){
                                       if (localDutyTableInfo!=null){
                                            for (int i = 0;i < localDutyTableInfo.length;i++){
                                                if (localDutyTableInfo[i] != null){
                                                 localDutyTableInfo[i].serialize(new javax.xml.namespace.QName("http://rdbservice.pccth.com/","dutyTableInfo"),
                                                           xmlWriter);
                                                } else {
                                                   
                                                            writeStartElement(null, "http://rdbservice.pccth.com/", "dutyTableInfo", xmlWriter);

                                                           // write the nil attribute
                                                           writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                                           xmlWriter.writeEndElement();
                                                    
                                                }

                                            }
                                     } else {
                                        
                                                writeStartElement(null, "http://rdbservice.pccth.com/", "dutyTableInfo", xmlWriter);

                                               // write the nil attribute
                                               writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                               xmlWriter.writeEndElement();
                                        
                                    }
                                 }
                                    namespace = "http://rdbservice.pccth.com/";
                                    writeStartElement(null, namespace, "returnCode", xmlWriter);
                             

                                          if (localReturnCode==null){
                                              // write the nil attribute
                                              
                                                     writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                                  
                                          }else{

                                        
                                                   xmlWriter.writeCharacters(localReturnCode);
                                            
                                          }
                                    
                                   xmlWriter.writeEndElement();
                              if (localStoreInfoTracker){
                                       if (localStoreInfo!=null){
                                            for (int i = 0;i < localStoreInfo.length;i++){
                                                if (localStoreInfo[i] != null){
                                                 localStoreInfo[i].serialize(new javax.xml.namespace.QName("http://rdbservice.pccth.com/","storeInfo"),
                                                           xmlWriter);
                                                } else {
                                                   
                                                            writeStartElement(null, "http://rdbservice.pccth.com/", "storeInfo", xmlWriter);

                                                           // write the nil attribute
                                                           writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                                           xmlWriter.writeEndElement();
                                                    
                                                }

                                            }
                                     } else {
                                        
                                                writeStartElement(null, "http://rdbservice.pccth.com/", "storeInfo", xmlWriter);

                                               // write the nil attribute
                                               writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                               xmlWriter.writeEndElement();
                                        
                                    }
                                 } if (localTambolInfoTracker){
                                       if (localTambolInfo!=null){
                                            for (int i = 0;i < localTambolInfo.length;i++){
                                                if (localTambolInfo[i] != null){
                                                 localTambolInfo[i].serialize(new javax.xml.namespace.QName("http://rdbservice.pccth.com/","tambolInfo"),
                                                           xmlWriter);
                                                } else {
                                                   
                                                            writeStartElement(null, "http://rdbservice.pccth.com/", "tambolInfo", xmlWriter);

                                                           // write the nil attribute
                                                           writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                                           xmlWriter.writeEndElement();
                                                    
                                                }

                                            }
                                     } else {
                                        
                                                writeStartElement(null, "http://rdbservice.pccth.com/", "tambolInfo", xmlWriter);

                                               // write the nil attribute
                                               writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                               xmlWriter.writeEndElement();
                                        
                                    }
                                 } if (localProductInfoTracker){
                                       if (localProductInfo!=null){
                                            for (int i = 0;i < localProductInfo.length;i++){
                                                if (localProductInfo[i] != null){
                                                 localProductInfo[i].serialize(new javax.xml.namespace.QName("http://rdbservice.pccth.com/","productInfo"),
                                                           xmlWriter);
                                                } else {
                                                   
                                                            writeStartElement(null, "http://rdbservice.pccth.com/", "productInfo", xmlWriter);

                                                           // write the nil attribute
                                                           writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                                           xmlWriter.writeEndElement();
                                                    
                                                }

                                            }
                                     } else {
                                        
                                                writeStartElement(null, "http://rdbservice.pccth.com/", "productInfo", xmlWriter);

                                               // write the nil attribute
                                               writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                               xmlWriter.writeEndElement();
                                        
                                    }
                                 } if (localEdOfficeInfoTracker){
                                       if (localEdOfficeInfo!=null){
                                            for (int i = 0;i < localEdOfficeInfo.length;i++){
                                                if (localEdOfficeInfo[i] != null){
                                                 localEdOfficeInfo[i].serialize(new javax.xml.namespace.QName("http://rdbservice.pccth.com/","edOfficeInfo"),
                                                           xmlWriter);
                                                } else {
                                                   
                                                            writeStartElement(null, "http://rdbservice.pccth.com/", "edOfficeInfo", xmlWriter);

                                                           // write the nil attribute
                                                           writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                                           xmlWriter.writeEndElement();
                                                    
                                                }

                                            }
                                     } else {
                                        
                                                writeStartElement(null, "http://rdbservice.pccth.com/", "edOfficeInfo", xmlWriter);

                                               // write the nil attribute
                                               writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                               xmlWriter.writeEndElement();
                                        
                                    }
                                 } if (localVatSplitHdInfoTracker){
                                       if (localVatSplitHdInfo!=null){
                                            for (int i = 0;i < localVatSplitHdInfo.length;i++){
                                                if (localVatSplitHdInfo[i] != null){
                                                 localVatSplitHdInfo[i].serialize(new javax.xml.namespace.QName("http://rdbservice.pccth.com/","vatSplitHdInfo"),
                                                           xmlWriter);
                                                } else {
                                                   
                                                            writeStartElement(null, "http://rdbservice.pccth.com/", "vatSplitHdInfo", xmlWriter);

                                                           // write the nil attribute
                                                           writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                                           xmlWriter.writeEndElement();
                                                    
                                                }

                                            }
                                     } else {
                                        
                                                writeStartElement(null, "http://rdbservice.pccth.com/", "vatSplitHdInfo", xmlWriter);

                                               // write the nil attribute
                                               writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                               xmlWriter.writeEndElement();
                                        
                                    }
                                 } if (localOilfundRateInfoTracker){
                                       if (localOilfundRateInfo!=null){
                                            for (int i = 0;i < localOilfundRateInfo.length;i++){
                                                if (localOilfundRateInfo[i] != null){
                                                 localOilfundRateInfo[i].serialize(new javax.xml.namespace.QName("http://rdbservice.pccth.com/","oilfundRateInfo"),
                                                           xmlWriter);
                                                } else {
                                                   
                                                            writeStartElement(null, "http://rdbservice.pccth.com/", "oilfundRateInfo", xmlWriter);

                                                           // write the nil attribute
                                                           writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                                           xmlWriter.writeEndElement();
                                                    
                                                }

                                            }
                                     } else {
                                        
                                                writeStartElement(null, "http://rdbservice.pccth.com/", "oilfundRateInfo", xmlWriter);

                                               // write the nil attribute
                                               writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                               xmlWriter.writeEndElement();
                                        
                                    }
                                 } if (localProductTypeInfoTracker){
                                       if (localProductTypeInfo!=null){
                                            for (int i = 0;i < localProductTypeInfo.length;i++){
                                                if (localProductTypeInfo[i] != null){
                                                 localProductTypeInfo[i].serialize(new javax.xml.namespace.QName("http://rdbservice.pccth.com/","productTypeInfo"),
                                                           xmlWriter);
                                                } else {
                                                   
                                                            writeStartElement(null, "http://rdbservice.pccth.com/", "productTypeInfo", xmlWriter);

                                                           // write the nil attribute
                                                           writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                                           xmlWriter.writeEndElement();
                                                    
                                                }

                                            }
                                     } else {
                                        
                                                writeStartElement(null, "http://rdbservice.pccth.com/", "productTypeInfo", xmlWriter);

                                               // write the nil attribute
                                               writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                               xmlWriter.writeEndElement();
                                        
                                    }
                                 } if (localBankInfoTracker){
                                       if (localBankInfo!=null){
                                            for (int i = 0;i < localBankInfo.length;i++){
                                                if (localBankInfo[i] != null){
                                                 localBankInfo[i].serialize(new javax.xml.namespace.QName("http://rdbservice.pccth.com/","bankInfo"),
                                                           xmlWriter);
                                                } else {
                                                   
                                                            writeStartElement(null, "http://rdbservice.pccth.com/", "bankInfo", xmlWriter);

                                                           // write the nil attribute
                                                           writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                                           xmlWriter.writeEndElement();
                                                    
                                                }

                                            }
                                     } else {
                                        
                                                writeStartElement(null, "http://rdbservice.pccth.com/", "bankInfo", xmlWriter);

                                               // write the nil attribute
                                               writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                               xmlWriter.writeEndElement();
                                        
                                    }
                                 } if (localCustomRateInfoTracker){
                                       if (localCustomRateInfo!=null){
                                            for (int i = 0;i < localCustomRateInfo.length;i++){
                                                if (localCustomRateInfo[i] != null){
                                                 localCustomRateInfo[i].serialize(new javax.xml.namespace.QName("http://rdbservice.pccth.com/","customRateInfo"),
                                                           xmlWriter);
                                                } else {
                                                   
                                                            writeStartElement(null, "http://rdbservice.pccth.com/", "customRateInfo", xmlWriter);

                                                           // write the nil attribute
                                                           writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                                           xmlWriter.writeEndElement();
                                                    
                                                }

                                            }
                                     } else {
                                        
                                                writeStartElement(null, "http://rdbservice.pccth.com/", "customRateInfo", xmlWriter);

                                               // write the nil attribute
                                               writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                               xmlWriter.writeEndElement();
                                        
                                    }
                                 } if (localEdiUnitMapInfoTracker){
                                       if (localEdiUnitMapInfo!=null){
                                            for (int i = 0;i < localEdiUnitMapInfo.length;i++){
                                                if (localEdiUnitMapInfo[i] != null){
                                                 localEdiUnitMapInfo[i].serialize(new javax.xml.namespace.QName("http://rdbservice.pccth.com/","ediUnitMapInfo"),
                                                           xmlWriter);
                                                } else {
                                                   
                                                            writeStartElement(null, "http://rdbservice.pccth.com/", "ediUnitMapInfo", xmlWriter);

                                                           // write the nil attribute
                                                           writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                                           xmlWriter.writeEndElement();
                                                    
                                                }

                                            }
                                     } else {
                                        
                                                writeStartElement(null, "http://rdbservice.pccth.com/", "ediUnitMapInfo", xmlWriter);

                                               // write the nil attribute
                                               writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                               xmlWriter.writeEndElement();
                                        
                                    }
                                 } if (localVatSplitDetInfoTracker){
                                       if (localVatSplitDetInfo!=null){
                                            for (int i = 0;i < localVatSplitDetInfo.length;i++){
                                                if (localVatSplitDetInfo[i] != null){
                                                 localVatSplitDetInfo[i].serialize(new javax.xml.namespace.QName("http://rdbservice.pccth.com/","vatSplitDetInfo"),
                                                           xmlWriter);
                                                } else {
                                                   
                                                            writeStartElement(null, "http://rdbservice.pccth.com/", "vatSplitDetInfo", xmlWriter);

                                                           // write the nil attribute
                                                           writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                                           xmlWriter.writeEndElement();
                                                    
                                                }

                                            }
                                     } else {
                                        
                                                writeStartElement(null, "http://rdbservice.pccth.com/", "vatSplitDetInfo", xmlWriter);

                                               // write the nil attribute
                                               writeAttribute("xsi","http://www.w3.org/2001/XMLSchema-instance","nil","1",xmlWriter);
                                               xmlWriter.writeEndElement();
                                        
                                    }
                                 }
                    xmlWriter.writeEndElement();
               

        }

        private static java.lang.String generatePrefix(java.lang.String namespace) {
            if(namespace.equals("http://rdbservice.pccth.com/")){
                return "ns1";
            }
            return org.apache.axis2.databinding.utils.BeanUtil.getUniquePrefix();
        }

        /**
         * Utility method to write an element start tag.
         */
        private void writeStartElement(java.lang.String prefix, java.lang.String namespace, java.lang.String localPart,
                                       javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException {
            java.lang.String writerPrefix = xmlWriter.getPrefix(namespace);
            if (writerPrefix != null) {
                xmlWriter.writeStartElement(namespace, localPart);
            } else {
                if (namespace.length() == 0) {
                    prefix = "";
                } else if (prefix == null) {
                    prefix = generatePrefix(namespace);
                }

                xmlWriter.writeStartElement(prefix, localPart, namespace);
                xmlWriter.writeNamespace(prefix, namespace);
                xmlWriter.setPrefix(prefix, namespace);
            }
        }
        
        /**
         * Util method to write an attribute with the ns prefix
         */
        private void writeAttribute(java.lang.String prefix,java.lang.String namespace,java.lang.String attName,
                                    java.lang.String attValue,javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException{
            if (xmlWriter.getPrefix(namespace) == null) {
                xmlWriter.writeNamespace(prefix, namespace);
                xmlWriter.setPrefix(prefix, namespace);
            }
            xmlWriter.writeAttribute(namespace,attName,attValue);
        }

        /**
         * Util method to write an attribute without the ns prefix
         */
        private void writeAttribute(java.lang.String namespace,java.lang.String attName,
                                    java.lang.String attValue,javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException{
            if (namespace.equals("")) {
                xmlWriter.writeAttribute(attName,attValue);
            } else {
                registerPrefix(xmlWriter, namespace);
                xmlWriter.writeAttribute(namespace,attName,attValue);
            }
        }


           /**
             * Util method to write an attribute without the ns prefix
             */
            private void writeQNameAttribute(java.lang.String namespace, java.lang.String attName,
                                             javax.xml.namespace.QName qname, javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException {

                java.lang.String attributeNamespace = qname.getNamespaceURI();
                java.lang.String attributePrefix = xmlWriter.getPrefix(attributeNamespace);
                if (attributePrefix == null) {
                    attributePrefix = registerPrefix(xmlWriter, attributeNamespace);
                }
                java.lang.String attributeValue;
                if (attributePrefix.trim().length() > 0) {
                    attributeValue = attributePrefix + ":" + qname.getLocalPart();
                } else {
                    attributeValue = qname.getLocalPart();
                }

                if (namespace.equals("")) {
                    xmlWriter.writeAttribute(attName, attributeValue);
                } else {
                    registerPrefix(xmlWriter, namespace);
                    xmlWriter.writeAttribute(namespace, attName, attributeValue);
                }
            }
        /**
         *  method to handle Qnames
         */

        private void writeQName(javax.xml.namespace.QName qname,
                                javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException {
            java.lang.String namespaceURI = qname.getNamespaceURI();
            if (namespaceURI != null) {
                java.lang.String prefix = xmlWriter.getPrefix(namespaceURI);
                if (prefix == null) {
                    prefix = generatePrefix(namespaceURI);
                    xmlWriter.writeNamespace(prefix, namespaceURI);
                    xmlWriter.setPrefix(prefix,namespaceURI);
                }

                if (prefix.trim().length() > 0){
                    xmlWriter.writeCharacters(prefix + ":" + org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qname));
                } else {
                    // i.e this is the default namespace
                    xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qname));
                }

            } else {
                xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qname));
            }
        }

        private void writeQNames(javax.xml.namespace.QName[] qnames,
                                 javax.xml.stream.XMLStreamWriter xmlWriter) throws javax.xml.stream.XMLStreamException {

            if (qnames != null) {
                // we have to store this data until last moment since it is not possible to write any
                // namespace data after writing the charactor data
                java.lang.StringBuffer stringToWrite = new java.lang.StringBuffer();
                java.lang.String namespaceURI = null;
                java.lang.String prefix = null;

                for (int i = 0; i < qnames.length; i++) {
                    if (i > 0) {
                        stringToWrite.append(" ");
                    }
                    namespaceURI = qnames[i].getNamespaceURI();
                    if (namespaceURI != null) {
                        prefix = xmlWriter.getPrefix(namespaceURI);
                        if ((prefix == null) || (prefix.length() == 0)) {
                            prefix = generatePrefix(namespaceURI);
                            xmlWriter.writeNamespace(prefix, namespaceURI);
                            xmlWriter.setPrefix(prefix,namespaceURI);
                        }

                        if (prefix.trim().length() > 0){
                            stringToWrite.append(prefix).append(":").append(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qnames[i]));
                        } else {
                            stringToWrite.append(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qnames[i]));
                        }
                    } else {
                        stringToWrite.append(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(qnames[i]));
                    }
                }
                xmlWriter.writeCharacters(stringToWrite.toString());
            }

        }


        /**
         * Register a namespace prefix
         */
        private java.lang.String registerPrefix(javax.xml.stream.XMLStreamWriter xmlWriter, java.lang.String namespace) throws javax.xml.stream.XMLStreamException {
            java.lang.String prefix = xmlWriter.getPrefix(namespace);
            if (prefix == null) {
                prefix = generatePrefix(namespace);
                javax.xml.namespace.NamespaceContext nsContext = xmlWriter.getNamespaceContext();
                while (true) {
                    java.lang.String uri = nsContext.getNamespaceURI(prefix);
                    if (uri == null || uri.length() == 0) {
                        break;
                    }
                    prefix = org.apache.axis2.databinding.utils.BeanUtil.getUniquePrefix();
                }
                xmlWriter.writeNamespace(prefix, namespace);
                xmlWriter.setPrefix(prefix, namespace);
            }
            return prefix;
        }


  
        /**
        * databinding method to get an XML representation of this object
        *
        */
        public javax.xml.stream.XMLStreamReader getPullParser(javax.xml.namespace.QName qName)
                    throws org.apache.axis2.databinding.ADBException{


        
                 java.util.ArrayList elementList = new java.util.ArrayList();
                 java.util.ArrayList attribList = new java.util.ArrayList();

                 if (localCdProductUnitInfoTracker){
                             if (localCdProductUnitInfo!=null) {
                                 for (int i = 0;i < localCdProductUnitInfo.length;i++){

                                    if (localCdProductUnitInfo[i] != null){
                                         elementList.add(new javax.xml.namespace.QName("http://rdbservice.pccth.com/",
                                                                          "cdProductUnitInfo"));
                                         elementList.add(localCdProductUnitInfo[i]);
                                    } else {
                                        
                                                elementList.add(new javax.xml.namespace.QName("http://rdbservice.pccth.com/",
                                                                          "cdProductUnitInfo"));
                                                elementList.add(null);
                                            
                                    }

                                 }
                             } else {
                                 
                                        elementList.add(new javax.xml.namespace.QName("http://rdbservice.pccth.com/",
                                                                          "cdProductUnitInfo"));
                                        elementList.add(localCdProductUnitInfo);
                                    
                             }

                        } if (localHospitalInfoTracker){
                             if (localHospitalInfo!=null) {
                                 for (int i = 0;i < localHospitalInfo.length;i++){

                                    if (localHospitalInfo[i] != null){
                                         elementList.add(new javax.xml.namespace.QName("http://rdbservice.pccth.com/",
                                                                          "hospitalInfo"));
                                         elementList.add(localHospitalInfo[i]);
                                    } else {
                                        
                                                elementList.add(new javax.xml.namespace.QName("http://rdbservice.pccth.com/",
                                                                          "hospitalInfo"));
                                                elementList.add(null);
                                            
                                    }

                                 }
                             } else {
                                 
                                        elementList.add(new javax.xml.namespace.QName("http://rdbservice.pccth.com/",
                                                                          "hospitalInfo"));
                                        elementList.add(localHospitalInfo);
                                    
                             }

                        } if (localDegreeInfoTracker){
                             if (localDegreeInfo!=null) {
                                 for (int i = 0;i < localDegreeInfo.length;i++){

                                    if (localDegreeInfo[i] != null){
                                         elementList.add(new javax.xml.namespace.QName("http://rdbservice.pccth.com/",
                                                                          "degreeInfo"));
                                         elementList.add(localDegreeInfo[i]);
                                    } else {
                                        
                                                elementList.add(new javax.xml.namespace.QName("http://rdbservice.pccth.com/",
                                                                          "degreeInfo"));
                                                elementList.add(null);
                                            
                                    }

                                 }
                             } else {
                                 
                                        elementList.add(new javax.xml.namespace.QName("http://rdbservice.pccth.com/",
                                                                          "degreeInfo"));
                                        elementList.add(localDegreeInfo);
                                    
                             }

                        } if (localZipCodeInfoTracker){
                             if (localZipCodeInfo!=null) {
                                 for (int i = 0;i < localZipCodeInfo.length;i++){

                                    if (localZipCodeInfo[i] != null){
                                         elementList.add(new javax.xml.namespace.QName("http://rdbservice.pccth.com/",
                                                                          "zipCodeInfo"));
                                         elementList.add(localZipCodeInfo[i]);
                                    } else {
                                        
                                                elementList.add(new javax.xml.namespace.QName("http://rdbservice.pccth.com/",
                                                                          "zipCodeInfo"));
                                                elementList.add(null);
                                            
                                    }

                                 }
                             } else {
                                 
                                        elementList.add(new javax.xml.namespace.QName("http://rdbservice.pccth.com/",
                                                                          "zipCodeInfo"));
                                        elementList.add(localZipCodeInfo);
                                    
                             }

                        } if (localTimeRateInfoTracker){
                             if (localTimeRateInfo!=null) {
                                 for (int i = 0;i < localTimeRateInfo.length;i++){

                                    if (localTimeRateInfo[i] != null){
                                         elementList.add(new javax.xml.namespace.QName("http://rdbservice.pccth.com/",
                                                                          "timeRateInfo"));
                                         elementList.add(localTimeRateInfo[i]);
                                    } else {
                                        
                                                elementList.add(new javax.xml.namespace.QName("http://rdbservice.pccth.com/",
                                                                          "timeRateInfo"));
                                                elementList.add(null);
                                            
                                    }

                                 }
                             } else {
                                 
                                        elementList.add(new javax.xml.namespace.QName("http://rdbservice.pccth.com/",
                                                                          "timeRateInfo"));
                                        elementList.add(localTimeRateInfo);
                                    
                             }

                        } if (localEmbassyInfoTracker){
                             if (localEmbassyInfo!=null) {
                                 for (int i = 0;i < localEmbassyInfo.length;i++){

                                    if (localEmbassyInfo[i] != null){
                                         elementList.add(new javax.xml.namespace.QName("http://rdbservice.pccth.com/",
                                                                          "embassyInfo"));
                                         elementList.add(localEmbassyInfo[i]);
                                    } else {
                                        
                                                elementList.add(new javax.xml.namespace.QName("http://rdbservice.pccth.com/",
                                                                          "embassyInfo"));
                                                elementList.add(null);
                                            
                                    }

                                 }
                             } else {
                                 
                                        elementList.add(new javax.xml.namespace.QName("http://rdbservice.pccth.com/",
                                                                          "embassyInfo"));
                                        elementList.add(localEmbassyInfo);
                                    
                             }

                        } if (localTitleInfoTracker){
                             if (localTitleInfo!=null) {
                                 for (int i = 0;i < localTitleInfo.length;i++){

                                    if (localTitleInfo[i] != null){
                                         elementList.add(new javax.xml.namespace.QName("http://rdbservice.pccth.com/",
                                                                          "titleInfo"));
                                         elementList.add(localTitleInfo[i]);
                                    } else {
                                        
                                                elementList.add(new javax.xml.namespace.QName("http://rdbservice.pccth.com/",
                                                                          "titleInfo"));
                                                elementList.add(null);
                                            
                                    }

                                 }
                             } else {
                                 
                                        elementList.add(new javax.xml.namespace.QName("http://rdbservice.pccth.com/",
                                                                          "titleInfo"));
                                        elementList.add(localTitleInfo);
                                    
                             }

                        } if (localAnacarGrpInfoTracker){
                             if (localAnacarGrpInfo!=null) {
                                 for (int i = 0;i < localAnacarGrpInfo.length;i++){

                                    if (localAnacarGrpInfo[i] != null){
                                         elementList.add(new javax.xml.namespace.QName("http://rdbservice.pccth.com/",
                                                                          "anacarGrpInfo"));
                                         elementList.add(localAnacarGrpInfo[i]);
                                    } else {
                                        
                                                elementList.add(new javax.xml.namespace.QName("http://rdbservice.pccth.com/",
                                                                          "anacarGrpInfo"));
                                                elementList.add(null);
                                            
                                    }

                                 }
                             } else {
                                 
                                        elementList.add(new javax.xml.namespace.QName("http://rdbservice.pccth.com/",
                                                                          "anacarGrpInfo"));
                                        elementList.add(localAnacarGrpInfo);
                                    
                             }

                        } if (localProductSubTypeInfoTracker){
                             if (localProductSubTypeInfo!=null) {
                                 for (int i = 0;i < localProductSubTypeInfo.length;i++){

                                    if (localProductSubTypeInfo[i] != null){
                                         elementList.add(new javax.xml.namespace.QName("http://rdbservice.pccth.com/",
                                                                          "productSubTypeInfo"));
                                         elementList.add(localProductSubTypeInfo[i]);
                                    } else {
                                        
                                                elementList.add(new javax.xml.namespace.QName("http://rdbservice.pccth.com/",
                                                                          "productSubTypeInfo"));
                                                elementList.add(null);
                                            
                                    }

                                 }
                             } else {
                                 
                                        elementList.add(new javax.xml.namespace.QName("http://rdbservice.pccth.com/",
                                                                          "productSubTypeInfo"));
                                        elementList.add(localProductSubTypeInfo);
                                    
                             }

                        } if (localAreaCodeInfoTracker){
                             if (localAreaCodeInfo!=null) {
                                 for (int i = 0;i < localAreaCodeInfo.length;i++){

                                    if (localAreaCodeInfo[i] != null){
                                         elementList.add(new javax.xml.namespace.QName("http://rdbservice.pccth.com/",
                                                                          "areaCodeInfo"));
                                         elementList.add(localAreaCodeInfo[i]);
                                    } else {
                                        
                                                elementList.add(new javax.xml.namespace.QName("http://rdbservice.pccth.com/",
                                                                          "areaCodeInfo"));
                                                elementList.add(null);
                                            
                                    }

                                 }
                             } else {
                                 
                                        elementList.add(new javax.xml.namespace.QName("http://rdbservice.pccth.com/",
                                                                          "areaCodeInfo"));
                                        elementList.add(localAreaCodeInfo);
                                    
                             }

                        } if (localVatRateInfoTracker){
                             if (localVatRateInfo!=null) {
                                 for (int i = 0;i < localVatRateInfo.length;i++){

                                    if (localVatRateInfo[i] != null){
                                         elementList.add(new javax.xml.namespace.QName("http://rdbservice.pccth.com/",
                                                                          "vatRateInfo"));
                                         elementList.add(localVatRateInfo[i]);
                                    } else {
                                        
                                                elementList.add(new javax.xml.namespace.QName("http://rdbservice.pccth.com/",
                                                                          "vatRateInfo"));
                                                elementList.add(null);
                                            
                                    }

                                 }
                             } else {
                                 
                                        elementList.add(new javax.xml.namespace.QName("http://rdbservice.pccth.com/",
                                                                          "vatRateInfo"));
                                        elementList.add(localVatRateInfo);
                                    
                             }

                        } if (localCountryInfoTracker){
                             if (localCountryInfo!=null) {
                                 for (int i = 0;i < localCountryInfo.length;i++){

                                    if (localCountryInfo[i] != null){
                                         elementList.add(new javax.xml.namespace.QName("http://rdbservice.pccth.com/",
                                                                          "countryInfo"));
                                         elementList.add(localCountryInfo[i]);
                                    } else {
                                        
                                                elementList.add(new javax.xml.namespace.QName("http://rdbservice.pccth.com/",
                                                                          "countryInfo"));
                                                elementList.add(null);
                                            
                                    }

                                 }
                             } else {
                                 
                                        elementList.add(new javax.xml.namespace.QName("http://rdbservice.pccth.com/",
                                                                          "countryInfo"));
                                        elementList.add(localCountryInfo);
                                    
                             }

                        } if (localApproveLevelInfoTracker){
                             if (localApproveLevelInfo!=null) {
                                 for (int i = 0;i < localApproveLevelInfo.length;i++){

                                    if (localApproveLevelInfo[i] != null){
                                         elementList.add(new javax.xml.namespace.QName("http://rdbservice.pccth.com/",
                                                                          "approveLevelInfo"));
                                         elementList.add(localApproveLevelInfo[i]);
                                    } else {
                                        
                                                elementList.add(new javax.xml.namespace.QName("http://rdbservice.pccth.com/",
                                                                          "approveLevelInfo"));
                                                elementList.add(null);
                                            
                                    }

                                 }
                             } else {
                                 
                                        elementList.add(new javax.xml.namespace.QName("http://rdbservice.pccth.com/",
                                                                          "approveLevelInfo"));
                                        elementList.add(localApproveLevelInfo);
                                    
                             }

                        } if (localAccMastInfoTracker){
                             if (localAccMastInfo!=null) {
                                 for (int i = 0;i < localAccMastInfo.length;i++){

                                    if (localAccMastInfo[i] != null){
                                         elementList.add(new javax.xml.namespace.QName("http://rdbservice.pccth.com/",
                                                                          "accMastInfo"));
                                         elementList.add(localAccMastInfo[i]);
                                    } else {
                                        
                                                elementList.add(new javax.xml.namespace.QName("http://rdbservice.pccth.com/",
                                                                          "accMastInfo"));
                                                elementList.add(null);
                                            
                                    }

                                 }
                             } else {
                                 
                                        elementList.add(new javax.xml.namespace.QName("http://rdbservice.pccth.com/",
                                                                          "accMastInfo"));
                                        elementList.add(localAccMastInfo);
                                    
                             }

                        } if (localFormCodeInfoTracker){
                             if (localFormCodeInfo!=null) {
                                 for (int i = 0;i < localFormCodeInfo.length;i++){

                                    if (localFormCodeInfo[i] != null){
                                         elementList.add(new javax.xml.namespace.QName("http://rdbservice.pccth.com/",
                                                                          "formCodeInfo"));
                                         elementList.add(localFormCodeInfo[i]);
                                    } else {
                                        
                                                elementList.add(new javax.xml.namespace.QName("http://rdbservice.pccth.com/",
                                                                          "formCodeInfo"));
                                                elementList.add(null);
                                            
                                    }

                                 }
                             } else {
                                 
                                        elementList.add(new javax.xml.namespace.QName("http://rdbservice.pccth.com/",
                                                                          "formCodeInfo"));
                                        elementList.add(localFormCodeInfo);
                                    
                             }

                        } if (localCurrencyInfoTracker){
                             if (localCurrencyInfo!=null) {
                                 for (int i = 0;i < localCurrencyInfo.length;i++){

                                    if (localCurrencyInfo[i] != null){
                                         elementList.add(new javax.xml.namespace.QName("http://rdbservice.pccth.com/",
                                                                          "currencyInfo"));
                                         elementList.add(localCurrencyInfo[i]);
                                    } else {
                                        
                                                elementList.add(new javax.xml.namespace.QName("http://rdbservice.pccth.com/",
                                                                          "currencyInfo"));
                                                elementList.add(null);
                                            
                                    }

                                 }
                             } else {
                                 
                                        elementList.add(new javax.xml.namespace.QName("http://rdbservice.pccth.com/",
                                                                          "currencyInfo"));
                                        elementList.add(localCurrencyInfo);
                                    
                             }

                        } if (localObjRateInfoTracker){
                             if (localObjRateInfo!=null) {
                                 for (int i = 0;i < localObjRateInfo.length;i++){

                                    if (localObjRateInfo[i] != null){
                                         elementList.add(new javax.xml.namespace.QName("http://rdbservice.pccth.com/",
                                                                          "objRateInfo"));
                                         elementList.add(localObjRateInfo[i]);
                                    } else {
                                        
                                                elementList.add(new javax.xml.namespace.QName("http://rdbservice.pccth.com/",
                                                                          "objRateInfo"));
                                                elementList.add(null);
                                            
                                    }

                                 }
                             } else {
                                 
                                        elementList.add(new javax.xml.namespace.QName("http://rdbservice.pccth.com/",
                                                                          "objRateInfo"));
                                        elementList.add(localObjRateInfo);
                                    
                             }

                        }
                                      elementList.add(new javax.xml.namespace.QName("http://rdbservice.pccth.com/",
                                                                      "returnDesc"));
                                 
                                         elementList.add(localReturnDesc==null?null:
                                         org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localReturnDesc));
                                     if (localCusGrpInfoTracker){
                             if (localCusGrpInfo!=null) {
                                 for (int i = 0;i < localCusGrpInfo.length;i++){

                                    if (localCusGrpInfo[i] != null){
                                         elementList.add(new javax.xml.namespace.QName("http://rdbservice.pccth.com/",
                                                                          "cusGrpInfo"));
                                         elementList.add(localCusGrpInfo[i]);
                                    } else {
                                        
                                                elementList.add(new javax.xml.namespace.QName("http://rdbservice.pccth.com/",
                                                                          "cusGrpInfo"));
                                                elementList.add(null);
                                            
                                    }

                                 }
                             } else {
                                 
                                        elementList.add(new javax.xml.namespace.QName("http://rdbservice.pccth.com/",
                                                                          "cusGrpInfo"));
                                        elementList.add(localCusGrpInfo);
                                    
                             }

                        } if (localAnacarSdInfoTracker){
                             if (localAnacarSdInfo!=null) {
                                 for (int i = 0;i < localAnacarSdInfo.length;i++){

                                    if (localAnacarSdInfo[i] != null){
                                         elementList.add(new javax.xml.namespace.QName("http://rdbservice.pccth.com/",
                                                                          "anacarSdInfo"));
                                         elementList.add(localAnacarSdInfo[i]);
                                    } else {
                                        
                                                elementList.add(new javax.xml.namespace.QName("http://rdbservice.pccth.com/",
                                                                          "anacarSdInfo"));
                                                elementList.add(null);
                                            
                                    }

                                 }
                             } else {
                                 
                                        elementList.add(new javax.xml.namespace.QName("http://rdbservice.pccth.com/",
                                                                          "anacarSdInfo"));
                                        elementList.add(localAnacarSdInfo);
                                    
                             }

                        } if (localStructureGoodsInfoTracker){
                             if (localStructureGoodsInfo!=null) {
                                 for (int i = 0;i < localStructureGoodsInfo.length;i++){

                                    if (localStructureGoodsInfo[i] != null){
                                         elementList.add(new javax.xml.namespace.QName("http://rdbservice.pccth.com/",
                                                                          "structureGoodsInfo"));
                                         elementList.add(localStructureGoodsInfo[i]);
                                    } else {
                                        
                                                elementList.add(new javax.xml.namespace.QName("http://rdbservice.pccth.com/",
                                                                          "structureGoodsInfo"));
                                                elementList.add(null);
                                            
                                    }

                                 }
                             } else {
                                 
                                        elementList.add(new javax.xml.namespace.QName("http://rdbservice.pccth.com/",
                                                                          "structureGoodsInfo"));
                                        elementList.add(localStructureGoodsInfo);
                                    
                             }

                        } if (localIncMastInfoTracker){
                             if (localIncMastInfo!=null) {
                                 for (int i = 0;i < localIncMastInfo.length;i++){

                                    if (localIncMastInfo[i] != null){
                                         elementList.add(new javax.xml.namespace.QName("http://rdbservice.pccth.com/",
                                                                          "incMastInfo"));
                                         elementList.add(localIncMastInfo[i]);
                                    } else {
                                        
                                                elementList.add(new javax.xml.namespace.QName("http://rdbservice.pccth.com/",
                                                                          "incMastInfo"));
                                                elementList.add(null);
                                            
                                    }

                                 }
                             } else {
                                 
                                        elementList.add(new javax.xml.namespace.QName("http://rdbservice.pccth.com/",
                                                                          "incMastInfo"));
                                        elementList.add(localIncMastInfo);
                                    
                             }

                        } if (localDutyUnitInfoTracker){
                             if (localDutyUnitInfo!=null) {
                                 for (int i = 0;i < localDutyUnitInfo.length;i++){

                                    if (localDutyUnitInfo[i] != null){
                                         elementList.add(new javax.xml.namespace.QName("http://rdbservice.pccth.com/",
                                                                          "dutyUnitInfo"));
                                         elementList.add(localDutyUnitInfo[i]);
                                    } else {
                                        
                                                elementList.add(new javax.xml.namespace.QName("http://rdbservice.pccth.com/",
                                                                          "dutyUnitInfo"));
                                                elementList.add(null);
                                            
                                    }

                                 }
                             } else {
                                 
                                        elementList.add(new javax.xml.namespace.QName("http://rdbservice.pccth.com/",
                                                                          "dutyUnitInfo"));
                                        elementList.add(localDutyUnitInfo);
                                    
                             }

                        } if (localCustomHouseInfoTracker){
                             if (localCustomHouseInfo!=null) {
                                 for (int i = 0;i < localCustomHouseInfo.length;i++){

                                    if (localCustomHouseInfo[i] != null){
                                         elementList.add(new javax.xml.namespace.QName("http://rdbservice.pccth.com/",
                                                                          "customHouseInfo"));
                                         elementList.add(localCustomHouseInfo[i]);
                                    } else {
                                        
                                                elementList.add(new javax.xml.namespace.QName("http://rdbservice.pccth.com/",
                                                                          "customHouseInfo"));
                                                elementList.add(null);
                                            
                                    }

                                 }
                             } else {
                                 
                                        elementList.add(new javax.xml.namespace.QName("http://rdbservice.pccth.com/",
                                                                          "customHouseInfo"));
                                        elementList.add(localCustomHouseInfo);
                                    
                             }

                        } if (localTitleOldInfoTracker){
                             if (localTitleOldInfo!=null) {
                                 for (int i = 0;i < localTitleOldInfo.length;i++){

                                    if (localTitleOldInfo[i] != null){
                                         elementList.add(new javax.xml.namespace.QName("http://rdbservice.pccth.com/",
                                                                          "titleOldInfo"));
                                         elementList.add(localTitleOldInfo[i]);
                                    } else {
                                        
                                                elementList.add(new javax.xml.namespace.QName("http://rdbservice.pccth.com/",
                                                                          "titleOldInfo"));
                                                elementList.add(null);
                                            
                                    }

                                 }
                             } else {
                                 
                                        elementList.add(new javax.xml.namespace.QName("http://rdbservice.pccth.com/",
                                                                          "titleOldInfo"));
                                        elementList.add(localTitleOldInfo);
                                    
                             }

                        } if (localEdiGoodsInfoTracker){
                             if (localEdiGoodsInfo!=null) {
                                 for (int i = 0;i < localEdiGoodsInfo.length;i++){

                                    if (localEdiGoodsInfo[i] != null){
                                         elementList.add(new javax.xml.namespace.QName("http://rdbservice.pccth.com/",
                                                                          "ediGoodsInfo"));
                                         elementList.add(localEdiGoodsInfo[i]);
                                    } else {
                                        
                                                elementList.add(new javax.xml.namespace.QName("http://rdbservice.pccth.com/",
                                                                          "ediGoodsInfo"));
                                                elementList.add(null);
                                            
                                    }

                                 }
                             } else {
                                 
                                        elementList.add(new javax.xml.namespace.QName("http://rdbservice.pccth.com/",
                                                                          "ediGoodsInfo"));
                                        elementList.add(localEdiGoodsInfo);
                                    
                             }

                        } if (localProductUnitInfoTracker){
                             if (localProductUnitInfo!=null) {
                                 for (int i = 0;i < localProductUnitInfo.length;i++){

                                    if (localProductUnitInfo[i] != null){
                                         elementList.add(new javax.xml.namespace.QName("http://rdbservice.pccth.com/",
                                                                          "productUnitInfo"));
                                         elementList.add(localProductUnitInfo[i]);
                                    } else {
                                        
                                                elementList.add(new javax.xml.namespace.QName("http://rdbservice.pccth.com/",
                                                                          "productUnitInfo"));
                                                elementList.add(null);
                                            
                                    }

                                 }
                             } else {
                                 
                                        elementList.add(new javax.xml.namespace.QName("http://rdbservice.pccth.com/",
                                                                          "productUnitInfo"));
                                        elementList.add(localProductUnitInfo);
                                    
                             }

                        } if (localSssFundRateInfoTracker){
                             if (localSssFundRateInfo!=null) {
                                 for (int i = 0;i < localSssFundRateInfo.length;i++){

                                    if (localSssFundRateInfo[i] != null){
                                         elementList.add(new javax.xml.namespace.QName("http://rdbservice.pccth.com/",
                                                                          "sssFundRateInfo"));
                                         elementList.add(localSssFundRateInfo[i]);
                                    } else {
                                        
                                                elementList.add(new javax.xml.namespace.QName("http://rdbservice.pccth.com/",
                                                                          "sssFundRateInfo"));
                                                elementList.add(null);
                                            
                                    }

                                 }
                             } else {
                                 
                                        elementList.add(new javax.xml.namespace.QName("http://rdbservice.pccth.com/",
                                                                          "sssFundRateInfo"));
                                        elementList.add(localSssFundRateInfo);
                                    
                             }

                        } if (localDutyMaterialInfoTracker){
                             if (localDutyMaterialInfo!=null) {
                                 for (int i = 0;i < localDutyMaterialInfo.length;i++){

                                    if (localDutyMaterialInfo[i] != null){
                                         elementList.add(new javax.xml.namespace.QName("http://rdbservice.pccth.com/",
                                                                          "dutyMaterialInfo"));
                                         elementList.add(localDutyMaterialInfo[i]);
                                    } else {
                                        
                                                elementList.add(new javax.xml.namespace.QName("http://rdbservice.pccth.com/",
                                                                          "dutyMaterialInfo"));
                                                elementList.add(null);
                                            
                                    }

                                 }
                             } else {
                                 
                                        elementList.add(new javax.xml.namespace.QName("http://rdbservice.pccth.com/",
                                                                          "dutyMaterialInfo"));
                                        elementList.add(localDutyMaterialInfo);
                                    
                             }

                        } if (localDutyGroupInfoTracker){
                             if (localDutyGroupInfo!=null) {
                                 for (int i = 0;i < localDutyGroupInfo.length;i++){

                                    if (localDutyGroupInfo[i] != null){
                                         elementList.add(new javax.xml.namespace.QName("http://rdbservice.pccth.com/",
                                                                          "dutyGroupInfo"));
                                         elementList.add(localDutyGroupInfo[i]);
                                    } else {
                                        
                                                elementList.add(new javax.xml.namespace.QName("http://rdbservice.pccth.com/",
                                                                          "dutyGroupInfo"));
                                                elementList.add(null);
                                            
                                    }

                                 }
                             } else {
                                 
                                        elementList.add(new javax.xml.namespace.QName("http://rdbservice.pccth.com/",
                                                                          "dutyGroupInfo"));
                                        elementList.add(localDutyGroupInfo);
                                    
                             }

                        } if (localImportCompInfoTracker){
                             if (localImportCompInfo!=null) {
                                 for (int i = 0;i < localImportCompInfo.length;i++){

                                    if (localImportCompInfo[i] != null){
                                         elementList.add(new javax.xml.namespace.QName("http://rdbservice.pccth.com/",
                                                                          "importCompInfo"));
                                         elementList.add(localImportCompInfo[i]);
                                    } else {
                                        
                                                elementList.add(new javax.xml.namespace.QName("http://rdbservice.pccth.com/",
                                                                          "importCompInfo"));
                                                elementList.add(null);
                                            
                                    }

                                 }
                             } else {
                                 
                                        elementList.add(new javax.xml.namespace.QName("http://rdbservice.pccth.com/",
                                                                          "importCompInfo"));
                                        elementList.add(localImportCompInfo);
                                    
                             }

                        } if (localMaterialInfoTracker){
                             if (localMaterialInfo!=null) {
                                 for (int i = 0;i < localMaterialInfo.length;i++){

                                    if (localMaterialInfo[i] != null){
                                         elementList.add(new javax.xml.namespace.QName("http://rdbservice.pccth.com/",
                                                                          "materialInfo"));
                                         elementList.add(localMaterialInfo[i]);
                                    } else {
                                        
                                                elementList.add(new javax.xml.namespace.QName("http://rdbservice.pccth.com/",
                                                                          "materialInfo"));
                                                elementList.add(null);
                                            
                                    }

                                 }
                             } else {
                                 
                                        elementList.add(new javax.xml.namespace.QName("http://rdbservice.pccth.com/",
                                                                          "materialInfo"));
                                        elementList.add(localMaterialInfo);
                                    
                             }

                        } if (localLocalRateInfoTracker){
                             if (localLocalRateInfo!=null) {
                                 for (int i = 0;i < localLocalRateInfo.length;i++){

                                    if (localLocalRateInfo[i] != null){
                                         elementList.add(new javax.xml.namespace.QName("http://rdbservice.pccth.com/",
                                                                          "localRateInfo"));
                                         elementList.add(localLocalRateInfo[i]);
                                    } else {
                                        
                                                elementList.add(new javax.xml.namespace.QName("http://rdbservice.pccth.com/",
                                                                          "localRateInfo"));
                                                elementList.add(null);
                                            
                                    }

                                 }
                             } else {
                                 
                                        elementList.add(new javax.xml.namespace.QName("http://rdbservice.pccth.com/",
                                                                          "localRateInfo"));
                                        elementList.add(localLocalRateInfo);
                                    
                             }

                        } if (localCdCountryInfoTracker){
                             if (localCdCountryInfo!=null) {
                                 for (int i = 0;i < localCdCountryInfo.length;i++){

                                    if (localCdCountryInfo[i] != null){
                                         elementList.add(new javax.xml.namespace.QName("http://rdbservice.pccth.com/",
                                                                          "cdCountryInfo"));
                                         elementList.add(localCdCountryInfo[i]);
                                    } else {
                                        
                                                elementList.add(new javax.xml.namespace.QName("http://rdbservice.pccth.com/",
                                                                          "cdCountryInfo"));
                                                elementList.add(null);
                                            
                                    }

                                 }
                             } else {
                                 
                                        elementList.add(new javax.xml.namespace.QName("http://rdbservice.pccth.com/",
                                                                          "cdCountryInfo"));
                                        elementList.add(localCdCountryInfo);
                                    
                             }

                        } if (localProductIncMastInfoTracker){
                             if (localProductIncMastInfo!=null) {
                                 for (int i = 0;i < localProductIncMastInfo.length;i++){

                                    if (localProductIncMastInfo[i] != null){
                                         elementList.add(new javax.xml.namespace.QName("http://rdbservice.pccth.com/",
                                                                          "productIncMastInfo"));
                                         elementList.add(localProductIncMastInfo[i]);
                                    } else {
                                        
                                                elementList.add(new javax.xml.namespace.QName("http://rdbservice.pccth.com/",
                                                                          "productIncMastInfo"));
                                                elementList.add(null);
                                            
                                    }

                                 }
                             } else {
                                 
                                        elementList.add(new javax.xml.namespace.QName("http://rdbservice.pccth.com/",
                                                                          "productIncMastInfo"));
                                        elementList.add(localProductIncMastInfo);
                                    
                             }

                        } if (localLicenseHdInfoTracker){
                             if (localLicenseHdInfo!=null) {
                                 for (int i = 0;i < localLicenseHdInfo.length;i++){

                                    if (localLicenseHdInfo[i] != null){
                                         elementList.add(new javax.xml.namespace.QName("http://rdbservice.pccth.com/",
                                                                          "licenseHdInfo"));
                                         elementList.add(localLicenseHdInfo[i]);
                                    } else {
                                        
                                                elementList.add(new javax.xml.namespace.QName("http://rdbservice.pccth.com/",
                                                                          "licenseHdInfo"));
                                                elementList.add(null);
                                            
                                    }

                                 }
                             } else {
                                 
                                        elementList.add(new javax.xml.namespace.QName("http://rdbservice.pccth.com/",
                                                                          "licenseHdInfo"));
                                        elementList.add(localLicenseHdInfo);
                                    
                             }

                        } if (localIncomeTypeInfoTracker){
                             if (localIncomeTypeInfo!=null) {
                                 for (int i = 0;i < localIncomeTypeInfo.length;i++){

                                    if (localIncomeTypeInfo[i] != null){
                                         elementList.add(new javax.xml.namespace.QName("http://rdbservice.pccth.com/",
                                                                          "incomeTypeInfo"));
                                         elementList.add(localIncomeTypeInfo[i]);
                                    } else {
                                        
                                                elementList.add(new javax.xml.namespace.QName("http://rdbservice.pccth.com/",
                                                                          "incomeTypeInfo"));
                                                elementList.add(null);
                                            
                                    }

                                 }
                             } else {
                                 
                                        elementList.add(new javax.xml.namespace.QName("http://rdbservice.pccth.com/",
                                                                          "incomeTypeInfo"));
                                        elementList.add(localIncomeTypeInfo);
                                    
                             }

                        } if (localDueDatePs0112InfoTracker){
                             if (localDueDatePs0112Info!=null) {
                                 for (int i = 0;i < localDueDatePs0112Info.length;i++){

                                    if (localDueDatePs0112Info[i] != null){
                                         elementList.add(new javax.xml.namespace.QName("http://rdbservice.pccth.com/",
                                                                          "dueDatePs0112Info"));
                                         elementList.add(localDueDatePs0112Info[i]);
                                    } else {
                                        
                                                elementList.add(new javax.xml.namespace.QName("http://rdbservice.pccth.com/",
                                                                          "dueDatePs0112Info"));
                                                elementList.add(null);
                                            
                                    }

                                 }
                             } else {
                                 
                                        elementList.add(new javax.xml.namespace.QName("http://rdbservice.pccth.com/",
                                                                          "dueDatePs0112Info"));
                                        elementList.add(localDueDatePs0112Info);
                                    
                             }

                        } if (localLicenseDtInfoTracker){
                             if (localLicenseDtInfo!=null) {
                                 for (int i = 0;i < localLicenseDtInfo.length;i++){

                                    if (localLicenseDtInfo[i] != null){
                                         elementList.add(new javax.xml.namespace.QName("http://rdbservice.pccth.com/",
                                                                          "licenseDtInfo"));
                                         elementList.add(localLicenseDtInfo[i]);
                                    } else {
                                        
                                                elementList.add(new javax.xml.namespace.QName("http://rdbservice.pccth.com/",
                                                                          "licenseDtInfo"));
                                                elementList.add(null);
                                            
                                    }

                                 }
                             } else {
                                 
                                        elementList.add(new javax.xml.namespace.QName("http://rdbservice.pccth.com/",
                                                                          "licenseDtInfo"));
                                        elementList.add(localLicenseDtInfo);
                                    
                             }

                        } if (localHolidayInfoTracker){
                             if (localHolidayInfo!=null) {
                                 for (int i = 0;i < localHolidayInfo.length;i++){

                                    if (localHolidayInfo[i] != null){
                                         elementList.add(new javax.xml.namespace.QName("http://rdbservice.pccth.com/",
                                                                          "holidayInfo"));
                                         elementList.add(localHolidayInfo[i]);
                                    } else {
                                        
                                                elementList.add(new javax.xml.namespace.QName("http://rdbservice.pccth.com/",
                                                                          "holidayInfo"));
                                                elementList.add(null);
                                            
                                    }

                                 }
                             } else {
                                 
                                        elementList.add(new javax.xml.namespace.QName("http://rdbservice.pccth.com/",
                                                                          "holidayInfo"));
                                        elementList.add(localHolidayInfo);
                                    
                             }

                        } if (localSystemParamInfoTracker){
                             if (localSystemParamInfo!=null) {
                                 for (int i = 0;i < localSystemParamInfo.length;i++){

                                    if (localSystemParamInfo[i] != null){
                                         elementList.add(new javax.xml.namespace.QName("http://rdbservice.pccth.com/",
                                                                          "systemParamInfo"));
                                         elementList.add(localSystemParamInfo[i]);
                                    } else {
                                        
                                                elementList.add(new javax.xml.namespace.QName("http://rdbservice.pccth.com/",
                                                                          "systemParamInfo"));
                                                elementList.add(null);
                                            
                                    }

                                 }
                             } else {
                                 
                                        elementList.add(new javax.xml.namespace.QName("http://rdbservice.pccth.com/",
                                                                          "systemParamInfo"));
                                        elementList.add(localSystemParamInfo);
                                    
                             }

                        } if (localBankBranchInfoTracker){
                             if (localBankBranchInfo!=null) {
                                 for (int i = 0;i < localBankBranchInfo.length;i++){

                                    if (localBankBranchInfo[i] != null){
                                         elementList.add(new javax.xml.namespace.QName("http://rdbservice.pccth.com/",
                                                                          "bankBranchInfo"));
                                         elementList.add(localBankBranchInfo[i]);
                                    } else {
                                        
                                                elementList.add(new javax.xml.namespace.QName("http://rdbservice.pccth.com/",
                                                                          "bankBranchInfo"));
                                                elementList.add(null);
                                            
                                    }

                                 }
                             } else {
                                 
                                        elementList.add(new javax.xml.namespace.QName("http://rdbservice.pccth.com/",
                                                                          "bankBranchInfo"));
                                        elementList.add(localBankBranchInfo);
                                    
                             }

                        } if (localDutyTableInfoTracker){
                             if (localDutyTableInfo!=null) {
                                 for (int i = 0;i < localDutyTableInfo.length;i++){

                                    if (localDutyTableInfo[i] != null){
                                         elementList.add(new javax.xml.namespace.QName("http://rdbservice.pccth.com/",
                                                                          "dutyTableInfo"));
                                         elementList.add(localDutyTableInfo[i]);
                                    } else {
                                        
                                                elementList.add(new javax.xml.namespace.QName("http://rdbservice.pccth.com/",
                                                                          "dutyTableInfo"));
                                                elementList.add(null);
                                            
                                    }

                                 }
                             } else {
                                 
                                        elementList.add(new javax.xml.namespace.QName("http://rdbservice.pccth.com/",
                                                                          "dutyTableInfo"));
                                        elementList.add(localDutyTableInfo);
                                    
                             }

                        }
                                      elementList.add(new javax.xml.namespace.QName("http://rdbservice.pccth.com/",
                                                                      "returnCode"));
                                 
                                         elementList.add(localReturnCode==null?null:
                                         org.apache.axis2.databinding.utils.ConverterUtil.convertToString(localReturnCode));
                                     if (localStoreInfoTracker){
                             if (localStoreInfo!=null) {
                                 for (int i = 0;i < localStoreInfo.length;i++){

                                    if (localStoreInfo[i] != null){
                                         elementList.add(new javax.xml.namespace.QName("http://rdbservice.pccth.com/",
                                                                          "storeInfo"));
                                         elementList.add(localStoreInfo[i]);
                                    } else {
                                        
                                                elementList.add(new javax.xml.namespace.QName("http://rdbservice.pccth.com/",
                                                                          "storeInfo"));
                                                elementList.add(null);
                                            
                                    }

                                 }
                             } else {
                                 
                                        elementList.add(new javax.xml.namespace.QName("http://rdbservice.pccth.com/",
                                                                          "storeInfo"));
                                        elementList.add(localStoreInfo);
                                    
                             }

                        } if (localTambolInfoTracker){
                             if (localTambolInfo!=null) {
                                 for (int i = 0;i < localTambolInfo.length;i++){

                                    if (localTambolInfo[i] != null){
                                         elementList.add(new javax.xml.namespace.QName("http://rdbservice.pccth.com/",
                                                                          "tambolInfo"));
                                         elementList.add(localTambolInfo[i]);
                                    } else {
                                        
                                                elementList.add(new javax.xml.namespace.QName("http://rdbservice.pccth.com/",
                                                                          "tambolInfo"));
                                                elementList.add(null);
                                            
                                    }

                                 }
                             } else {
                                 
                                        elementList.add(new javax.xml.namespace.QName("http://rdbservice.pccth.com/",
                                                                          "tambolInfo"));
                                        elementList.add(localTambolInfo);
                                    
                             }

                        } if (localProductInfoTracker){
                             if (localProductInfo!=null) {
                                 for (int i = 0;i < localProductInfo.length;i++){

                                    if (localProductInfo[i] != null){
                                         elementList.add(new javax.xml.namespace.QName("http://rdbservice.pccth.com/",
                                                                          "productInfo"));
                                         elementList.add(localProductInfo[i]);
                                    } else {
                                        
                                                elementList.add(new javax.xml.namespace.QName("http://rdbservice.pccth.com/",
                                                                          "productInfo"));
                                                elementList.add(null);
                                            
                                    }

                                 }
                             } else {
                                 
                                        elementList.add(new javax.xml.namespace.QName("http://rdbservice.pccth.com/",
                                                                          "productInfo"));
                                        elementList.add(localProductInfo);
                                    
                             }

                        } if (localEdOfficeInfoTracker){
                             if (localEdOfficeInfo!=null) {
                                 for (int i = 0;i < localEdOfficeInfo.length;i++){

                                    if (localEdOfficeInfo[i] != null){
                                         elementList.add(new javax.xml.namespace.QName("http://rdbservice.pccth.com/",
                                                                          "edOfficeInfo"));
                                         elementList.add(localEdOfficeInfo[i]);
                                    } else {
                                        
                                                elementList.add(new javax.xml.namespace.QName("http://rdbservice.pccth.com/",
                                                                          "edOfficeInfo"));
                                                elementList.add(null);
                                            
                                    }

                                 }
                             } else {
                                 
                                        elementList.add(new javax.xml.namespace.QName("http://rdbservice.pccth.com/",
                                                                          "edOfficeInfo"));
                                        elementList.add(localEdOfficeInfo);
                                    
                             }

                        } if (localVatSplitHdInfoTracker){
                             if (localVatSplitHdInfo!=null) {
                                 for (int i = 0;i < localVatSplitHdInfo.length;i++){

                                    if (localVatSplitHdInfo[i] != null){
                                         elementList.add(new javax.xml.namespace.QName("http://rdbservice.pccth.com/",
                                                                          "vatSplitHdInfo"));
                                         elementList.add(localVatSplitHdInfo[i]);
                                    } else {
                                        
                                                elementList.add(new javax.xml.namespace.QName("http://rdbservice.pccth.com/",
                                                                          "vatSplitHdInfo"));
                                                elementList.add(null);
                                            
                                    }

                                 }
                             } else {
                                 
                                        elementList.add(new javax.xml.namespace.QName("http://rdbservice.pccth.com/",
                                                                          "vatSplitHdInfo"));
                                        elementList.add(localVatSplitHdInfo);
                                    
                             }

                        } if (localOilfundRateInfoTracker){
                             if (localOilfundRateInfo!=null) {
                                 for (int i = 0;i < localOilfundRateInfo.length;i++){

                                    if (localOilfundRateInfo[i] != null){
                                         elementList.add(new javax.xml.namespace.QName("http://rdbservice.pccth.com/",
                                                                          "oilfundRateInfo"));
                                         elementList.add(localOilfundRateInfo[i]);
                                    } else {
                                        
                                                elementList.add(new javax.xml.namespace.QName("http://rdbservice.pccth.com/",
                                                                          "oilfundRateInfo"));
                                                elementList.add(null);
                                            
                                    }

                                 }
                             } else {
                                 
                                        elementList.add(new javax.xml.namespace.QName("http://rdbservice.pccth.com/",
                                                                          "oilfundRateInfo"));
                                        elementList.add(localOilfundRateInfo);
                                    
                             }

                        } if (localProductTypeInfoTracker){
                             if (localProductTypeInfo!=null) {
                                 for (int i = 0;i < localProductTypeInfo.length;i++){

                                    if (localProductTypeInfo[i] != null){
                                         elementList.add(new javax.xml.namespace.QName("http://rdbservice.pccth.com/",
                                                                          "productTypeInfo"));
                                         elementList.add(localProductTypeInfo[i]);
                                    } else {
                                        
                                                elementList.add(new javax.xml.namespace.QName("http://rdbservice.pccth.com/",
                                                                          "productTypeInfo"));
                                                elementList.add(null);
                                            
                                    }

                                 }
                             } else {
                                 
                                        elementList.add(new javax.xml.namespace.QName("http://rdbservice.pccth.com/",
                                                                          "productTypeInfo"));
                                        elementList.add(localProductTypeInfo);
                                    
                             }

                        } if (localBankInfoTracker){
                             if (localBankInfo!=null) {
                                 for (int i = 0;i < localBankInfo.length;i++){

                                    if (localBankInfo[i] != null){
                                         elementList.add(new javax.xml.namespace.QName("http://rdbservice.pccth.com/",
                                                                          "bankInfo"));
                                         elementList.add(localBankInfo[i]);
                                    } else {
                                        
                                                elementList.add(new javax.xml.namespace.QName("http://rdbservice.pccth.com/",
                                                                          "bankInfo"));
                                                elementList.add(null);
                                            
                                    }

                                 }
                             } else {
                                 
                                        elementList.add(new javax.xml.namespace.QName("http://rdbservice.pccth.com/",
                                                                          "bankInfo"));
                                        elementList.add(localBankInfo);
                                    
                             }

                        } if (localCustomRateInfoTracker){
                             if (localCustomRateInfo!=null) {
                                 for (int i = 0;i < localCustomRateInfo.length;i++){

                                    if (localCustomRateInfo[i] != null){
                                         elementList.add(new javax.xml.namespace.QName("http://rdbservice.pccth.com/",
                                                                          "customRateInfo"));
                                         elementList.add(localCustomRateInfo[i]);
                                    } else {
                                        
                                                elementList.add(new javax.xml.namespace.QName("http://rdbservice.pccth.com/",
                                                                          "customRateInfo"));
                                                elementList.add(null);
                                            
                                    }

                                 }
                             } else {
                                 
                                        elementList.add(new javax.xml.namespace.QName("http://rdbservice.pccth.com/",
                                                                          "customRateInfo"));
                                        elementList.add(localCustomRateInfo);
                                    
                             }

                        } if (localEdiUnitMapInfoTracker){
                             if (localEdiUnitMapInfo!=null) {
                                 for (int i = 0;i < localEdiUnitMapInfo.length;i++){

                                    if (localEdiUnitMapInfo[i] != null){
                                         elementList.add(new javax.xml.namespace.QName("http://rdbservice.pccth.com/",
                                                                          "ediUnitMapInfo"));
                                         elementList.add(localEdiUnitMapInfo[i]);
                                    } else {
                                        
                                                elementList.add(new javax.xml.namespace.QName("http://rdbservice.pccth.com/",
                                                                          "ediUnitMapInfo"));
                                                elementList.add(null);
                                            
                                    }

                                 }
                             } else {
                                 
                                        elementList.add(new javax.xml.namespace.QName("http://rdbservice.pccth.com/",
                                                                          "ediUnitMapInfo"));
                                        elementList.add(localEdiUnitMapInfo);
                                    
                             }

                        } if (localVatSplitDetInfoTracker){
                             if (localVatSplitDetInfo!=null) {
                                 for (int i = 0;i < localVatSplitDetInfo.length;i++){

                                    if (localVatSplitDetInfo[i] != null){
                                         elementList.add(new javax.xml.namespace.QName("http://rdbservice.pccth.com/",
                                                                          "vatSplitDetInfo"));
                                         elementList.add(localVatSplitDetInfo[i]);
                                    } else {
                                        
                                                elementList.add(new javax.xml.namespace.QName("http://rdbservice.pccth.com/",
                                                                          "vatSplitDetInfo"));
                                                elementList.add(null);
                                            
                                    }

                                 }
                             } else {
                                 
                                        elementList.add(new javax.xml.namespace.QName("http://rdbservice.pccth.com/",
                                                                          "vatSplitDetInfo"));
                                        elementList.add(localVatSplitDetInfo);
                                    
                             }

                        }

                return new org.apache.axis2.databinding.utils.reader.ADBXMLStreamReaderImpl(qName, elementList.toArray(), attribList.toArray());
            
            

        }

  

     /**
      *  Factory class that keeps the parse method
      */
    public static class Factory{

        
        

        /**
        * static method to create the object
        * Precondition:  If this object is an element, the current or next start element starts this object and any intervening reader events are ignorable
        *                If this object is not an element, it is a complex type and the reader is at the event just after the outer start element
        * Postcondition: If this object is an element, the reader is positioned at its end element
        *                If this object is a complex type, the reader is positioned at the end element of its outer element
        */
        public static Body parse(javax.xml.stream.XMLStreamReader reader) throws java.lang.Exception{
            Body object =
                new Body();

            int event;
            java.lang.String nillableValue = null;
            java.lang.String prefix ="";
            java.lang.String namespaceuri ="";
            try {
                
                while (!reader.isStartElement() && !reader.isEndElement())
                    reader.next();

                
                if (reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","type")!=null){
                  java.lang.String fullTypeName = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance",
                        "type");
                  if (fullTypeName!=null){
                    java.lang.String nsPrefix = null;
                    if (fullTypeName.indexOf(":") > -1){
                        nsPrefix = fullTypeName.substring(0,fullTypeName.indexOf(":"));
                    }
                    nsPrefix = nsPrefix==null?"":nsPrefix;

                    java.lang.String type = fullTypeName.substring(fullTypeName.indexOf(":")+1);
                    
                            if (!"Body".equals(type)){
                                //find namespace for the prefix
                                java.lang.String nsUri = reader.getNamespaceContext().getNamespaceURI(nsPrefix);
                                return (Body)com.pccth.rdbservice.ExtensionMapper.getTypeObject(
                                     nsUri,type,reader);
                              }
                        

                  }
                

                }

                

                
                // Note all attributes that were handled. Used to differ normal attributes
                // from anyAttributes.
                java.util.Vector handledAttributes = new java.util.Vector();
                

                
                    
                    reader.next();
                
                        java.util.ArrayList list1 = new java.util.ArrayList();
                    
                        java.util.ArrayList list2 = new java.util.ArrayList();
                    
                        java.util.ArrayList list3 = new java.util.ArrayList();
                    
                        java.util.ArrayList list4 = new java.util.ArrayList();
                    
                        java.util.ArrayList list5 = new java.util.ArrayList();
                    
                        java.util.ArrayList list6 = new java.util.ArrayList();
                    
                        java.util.ArrayList list7 = new java.util.ArrayList();
                    
                        java.util.ArrayList list8 = new java.util.ArrayList();
                    
                        java.util.ArrayList list9 = new java.util.ArrayList();
                    
                        java.util.ArrayList list10 = new java.util.ArrayList();
                    
                        java.util.ArrayList list11 = new java.util.ArrayList();
                    
                        java.util.ArrayList list12 = new java.util.ArrayList();
                    
                        java.util.ArrayList list13 = new java.util.ArrayList();
                    
                        java.util.ArrayList list14 = new java.util.ArrayList();
                    
                        java.util.ArrayList list15 = new java.util.ArrayList();
                    
                        java.util.ArrayList list16 = new java.util.ArrayList();
                    
                        java.util.ArrayList list17 = new java.util.ArrayList();
                    
                        java.util.ArrayList list19 = new java.util.ArrayList();
                    
                        java.util.ArrayList list20 = new java.util.ArrayList();
                    
                        java.util.ArrayList list21 = new java.util.ArrayList();
                    
                        java.util.ArrayList list22 = new java.util.ArrayList();
                    
                        java.util.ArrayList list23 = new java.util.ArrayList();
                    
                        java.util.ArrayList list24 = new java.util.ArrayList();
                    
                        java.util.ArrayList list25 = new java.util.ArrayList();
                    
                        java.util.ArrayList list26 = new java.util.ArrayList();
                    
                        java.util.ArrayList list27 = new java.util.ArrayList();
                    
                        java.util.ArrayList list28 = new java.util.ArrayList();
                    
                        java.util.ArrayList list29 = new java.util.ArrayList();
                    
                        java.util.ArrayList list30 = new java.util.ArrayList();
                    
                        java.util.ArrayList list31 = new java.util.ArrayList();
                    
                        java.util.ArrayList list32 = new java.util.ArrayList();
                    
                        java.util.ArrayList list33 = new java.util.ArrayList();
                    
                        java.util.ArrayList list34 = new java.util.ArrayList();
                    
                        java.util.ArrayList list35 = new java.util.ArrayList();
                    
                        java.util.ArrayList list36 = new java.util.ArrayList();
                    
                        java.util.ArrayList list37 = new java.util.ArrayList();
                    
                        java.util.ArrayList list38 = new java.util.ArrayList();
                    
                        java.util.ArrayList list39 = new java.util.ArrayList();
                    
                        java.util.ArrayList list40 = new java.util.ArrayList();
                    
                        java.util.ArrayList list41 = new java.util.ArrayList();
                    
                        java.util.ArrayList list42 = new java.util.ArrayList();
                    
                        java.util.ArrayList list43 = new java.util.ArrayList();
                    
                        java.util.ArrayList list45 = new java.util.ArrayList();
                    
                        java.util.ArrayList list46 = new java.util.ArrayList();
                    
                        java.util.ArrayList list47 = new java.util.ArrayList();
                    
                        java.util.ArrayList list48 = new java.util.ArrayList();
                    
                        java.util.ArrayList list49 = new java.util.ArrayList();
                    
                        java.util.ArrayList list50 = new java.util.ArrayList();
                    
                        java.util.ArrayList list51 = new java.util.ArrayList();
                    
                        java.util.ArrayList list52 = new java.util.ArrayList();
                    
                        java.util.ArrayList list53 = new java.util.ArrayList();
                    
                        java.util.ArrayList list54 = new java.util.ArrayList();
                    
                        java.util.ArrayList list55 = new java.util.ArrayList();
                    
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://rdbservice.pccth.com/","cdProductUnitInfo").equals(reader.getName())){
                                
                                    
                                    
                                    // Process the array and step past its final element's end.
                                    
                                                          nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                                          if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                                              list1.add(null);
                                                              reader.next();
                                                          } else {
                                                        list1.add(com.pccth.rdbservice.CdProductUnitInfo.Factory.parse(reader));
                                                                }
                                                        //loop until we find a start element that is not part of this array
                                                        boolean loopDone1 = false;
                                                        while(!loopDone1){
                                                            // We should be at the end element, but make sure
                                                            while (!reader.isEndElement())
                                                                reader.next();
                                                            // Step out of this element
                                                            reader.next();
                                                            // Step to next element event.
                                                            while (!reader.isStartElement() && !reader.isEndElement())
                                                                reader.next();
                                                            if (reader.isEndElement()){
                                                                //two continuous end elements means we are exiting the xml structure
                                                                loopDone1 = true;
                                                            } else {
                                                                if (new javax.xml.namespace.QName("http://rdbservice.pccth.com/","cdProductUnitInfo").equals(reader.getName())){
                                                                    
                                                                      nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                                                      if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                                                          list1.add(null);
                                                                          reader.next();
                                                                      } else {
                                                                    list1.add(com.pccth.rdbservice.CdProductUnitInfo.Factory.parse(reader));
                                                                        }
                                                                }else{
                                                                    loopDone1 = true;
                                                                }
                                                            }
                                                        }
                                                        // call the converter utility  to convert and set the array
                                                        
                                                        object.setCdProductUnitInfo((com.pccth.rdbservice.CdProductUnitInfo[])
                                                            org.apache.axis2.databinding.utils.ConverterUtil.convertToArray(
                                                                com.pccth.rdbservice.CdProductUnitInfo.class,
                                                                list1));
                                                            
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://rdbservice.pccth.com/","hospitalInfo").equals(reader.getName())){
                                
                                    
                                    
                                    // Process the array and step past its final element's end.
                                    
                                                          nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                                          if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                                              list2.add(null);
                                                              reader.next();
                                                          } else {
                                                        list2.add(com.pccth.rdbservice.HospitalInfo.Factory.parse(reader));
                                                                }
                                                        //loop until we find a start element that is not part of this array
                                                        boolean loopDone2 = false;
                                                        while(!loopDone2){
                                                            // We should be at the end element, but make sure
                                                            while (!reader.isEndElement())
                                                                reader.next();
                                                            // Step out of this element
                                                            reader.next();
                                                            // Step to next element event.
                                                            while (!reader.isStartElement() && !reader.isEndElement())
                                                                reader.next();
                                                            if (reader.isEndElement()){
                                                                //two continuous end elements means we are exiting the xml structure
                                                                loopDone2 = true;
                                                            } else {
                                                                if (new javax.xml.namespace.QName("http://rdbservice.pccth.com/","hospitalInfo").equals(reader.getName())){
                                                                    
                                                                      nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                                                      if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                                                          list2.add(null);
                                                                          reader.next();
                                                                      } else {
                                                                    list2.add(com.pccth.rdbservice.HospitalInfo.Factory.parse(reader));
                                                                        }
                                                                }else{
                                                                    loopDone2 = true;
                                                                }
                                                            }
                                                        }
                                                        // call the converter utility  to convert and set the array
                                                        
                                                        object.setHospitalInfo((com.pccth.rdbservice.HospitalInfo[])
                                                            org.apache.axis2.databinding.utils.ConverterUtil.convertToArray(
                                                                com.pccth.rdbservice.HospitalInfo.class,
                                                                list2));
                                                            
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://rdbservice.pccth.com/","degreeInfo").equals(reader.getName())){
                                
                                    
                                    
                                    // Process the array and step past its final element's end.
                                    
                                                          nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                                          if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                                              list3.add(null);
                                                              reader.next();
                                                          } else {
                                                        list3.add(com.pccth.rdbservice.DegreeInfo.Factory.parse(reader));
                                                                }
                                                        //loop until we find a start element that is not part of this array
                                                        boolean loopDone3 = false;
                                                        while(!loopDone3){
                                                            // We should be at the end element, but make sure
                                                            while (!reader.isEndElement())
                                                                reader.next();
                                                            // Step out of this element
                                                            reader.next();
                                                            // Step to next element event.
                                                            while (!reader.isStartElement() && !reader.isEndElement())
                                                                reader.next();
                                                            if (reader.isEndElement()){
                                                                //two continuous end elements means we are exiting the xml structure
                                                                loopDone3 = true;
                                                            } else {
                                                                if (new javax.xml.namespace.QName("http://rdbservice.pccth.com/","degreeInfo").equals(reader.getName())){
                                                                    
                                                                      nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                                                      if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                                                          list3.add(null);
                                                                          reader.next();
                                                                      } else {
                                                                    list3.add(com.pccth.rdbservice.DegreeInfo.Factory.parse(reader));
                                                                        }
                                                                }else{
                                                                    loopDone3 = true;
                                                                }
                                                            }
                                                        }
                                                        // call the converter utility  to convert and set the array
                                                        
                                                        object.setDegreeInfo((com.pccth.rdbservice.DegreeInfo[])
                                                            org.apache.axis2.databinding.utils.ConverterUtil.convertToArray(
                                                                com.pccth.rdbservice.DegreeInfo.class,
                                                                list3));
                                                            
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://rdbservice.pccth.com/","zipCodeInfo").equals(reader.getName())){
                                
                                    
                                    
                                    // Process the array and step past its final element's end.
                                    
                                                          nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                                          if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                                              list4.add(null);
                                                              reader.next();
                                                          } else {
                                                        list4.add(com.pccth.rdbservice.ZipCodeInfo.Factory.parse(reader));
                                                                }
                                                        //loop until we find a start element that is not part of this array
                                                        boolean loopDone4 = false;
                                                        while(!loopDone4){
                                                            // We should be at the end element, but make sure
                                                            while (!reader.isEndElement())
                                                                reader.next();
                                                            // Step out of this element
                                                            reader.next();
                                                            // Step to next element event.
                                                            while (!reader.isStartElement() && !reader.isEndElement())
                                                                reader.next();
                                                            if (reader.isEndElement()){
                                                                //two continuous end elements means we are exiting the xml structure
                                                                loopDone4 = true;
                                                            } else {
                                                                if (new javax.xml.namespace.QName("http://rdbservice.pccth.com/","zipCodeInfo").equals(reader.getName())){
                                                                    
                                                                      nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                                                      if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                                                          list4.add(null);
                                                                          reader.next();
                                                                      } else {
                                                                    list4.add(com.pccth.rdbservice.ZipCodeInfo.Factory.parse(reader));
                                                                        }
                                                                }else{
                                                                    loopDone4 = true;
                                                                }
                                                            }
                                                        }
                                                        // call the converter utility  to convert and set the array
                                                        
                                                        object.setZipCodeInfo((com.pccth.rdbservice.ZipCodeInfo[])
                                                            org.apache.axis2.databinding.utils.ConverterUtil.convertToArray(
                                                                com.pccth.rdbservice.ZipCodeInfo.class,
                                                                list4));
                                                            
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://rdbservice.pccth.com/","timeRateInfo").equals(reader.getName())){
                                
                                    
                                    
                                    // Process the array and step past its final element's end.
                                    
                                                          nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                                          if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                                              list5.add(null);
                                                              reader.next();
                                                          } else {
                                                        list5.add(com.pccth.rdbservice.TimeRateInfo.Factory.parse(reader));
                                                                }
                                                        //loop until we find a start element that is not part of this array
                                                        boolean loopDone5 = false;
                                                        while(!loopDone5){
                                                            // We should be at the end element, but make sure
                                                            while (!reader.isEndElement())
                                                                reader.next();
                                                            // Step out of this element
                                                            reader.next();
                                                            // Step to next element event.
                                                            while (!reader.isStartElement() && !reader.isEndElement())
                                                                reader.next();
                                                            if (reader.isEndElement()){
                                                                //two continuous end elements means we are exiting the xml structure
                                                                loopDone5 = true;
                                                            } else {
                                                                if (new javax.xml.namespace.QName("http://rdbservice.pccth.com/","timeRateInfo").equals(reader.getName())){
                                                                    
                                                                      nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                                                      if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                                                          list5.add(null);
                                                                          reader.next();
                                                                      } else {
                                                                    list5.add(com.pccth.rdbservice.TimeRateInfo.Factory.parse(reader));
                                                                        }
                                                                }else{
                                                                    loopDone5 = true;
                                                                }
                                                            }
                                                        }
                                                        // call the converter utility  to convert and set the array
                                                        
                                                        object.setTimeRateInfo((com.pccth.rdbservice.TimeRateInfo[])
                                                            org.apache.axis2.databinding.utils.ConverterUtil.convertToArray(
                                                                com.pccth.rdbservice.TimeRateInfo.class,
                                                                list5));
                                                            
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://rdbservice.pccth.com/","embassyInfo").equals(reader.getName())){
                                
                                    
                                    
                                    // Process the array and step past its final element's end.
                                    
                                                          nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                                          if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                                              list6.add(null);
                                                              reader.next();
                                                          } else {
                                                        list6.add(com.pccth.rdbservice.EmbassyInfo.Factory.parse(reader));
                                                                }
                                                        //loop until we find a start element that is not part of this array
                                                        boolean loopDone6 = false;
                                                        while(!loopDone6){
                                                            // We should be at the end element, but make sure
                                                            while (!reader.isEndElement())
                                                                reader.next();
                                                            // Step out of this element
                                                            reader.next();
                                                            // Step to next element event.
                                                            while (!reader.isStartElement() && !reader.isEndElement())
                                                                reader.next();
                                                            if (reader.isEndElement()){
                                                                //two continuous end elements means we are exiting the xml structure
                                                                loopDone6 = true;
                                                            } else {
                                                                if (new javax.xml.namespace.QName("http://rdbservice.pccth.com/","embassyInfo").equals(reader.getName())){
                                                                    
                                                                      nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                                                      if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                                                          list6.add(null);
                                                                          reader.next();
                                                                      } else {
                                                                    list6.add(com.pccth.rdbservice.EmbassyInfo.Factory.parse(reader));
                                                                        }
                                                                }else{
                                                                    loopDone6 = true;
                                                                }
                                                            }
                                                        }
                                                        // call the converter utility  to convert and set the array
                                                        
                                                        object.setEmbassyInfo((com.pccth.rdbservice.EmbassyInfo[])
                                                            org.apache.axis2.databinding.utils.ConverterUtil.convertToArray(
                                                                com.pccth.rdbservice.EmbassyInfo.class,
                                                                list6));
                                                            
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://rdbservice.pccth.com/","titleInfo").equals(reader.getName())){
                                
                                    
                                    
                                    // Process the array and step past its final element's end.
                                    
                                                          nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                                          if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                                              list7.add(null);
                                                              reader.next();
                                                          } else {
                                                        list7.add(com.pccth.rdbservice.TitleInfo.Factory.parse(reader));
                                                                }
                                                        //loop until we find a start element that is not part of this array
                                                        boolean loopDone7 = false;
                                                        while(!loopDone7){
                                                            // We should be at the end element, but make sure
                                                            while (!reader.isEndElement())
                                                                reader.next();
                                                            // Step out of this element
                                                            reader.next();
                                                            // Step to next element event.
                                                            while (!reader.isStartElement() && !reader.isEndElement())
                                                                reader.next();
                                                            if (reader.isEndElement()){
                                                                //two continuous end elements means we are exiting the xml structure
                                                                loopDone7 = true;
                                                            } else {
                                                                if (new javax.xml.namespace.QName("http://rdbservice.pccth.com/","titleInfo").equals(reader.getName())){
                                                                    
                                                                      nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                                                      if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                                                          list7.add(null);
                                                                          reader.next();
                                                                      } else {
                                                                    list7.add(com.pccth.rdbservice.TitleInfo.Factory.parse(reader));
                                                                        }
                                                                }else{
                                                                    loopDone7 = true;
                                                                }
                                                            }
                                                        }
                                                        // call the converter utility  to convert and set the array
                                                        
                                                        object.setTitleInfo((com.pccth.rdbservice.TitleInfo[])
                                                            org.apache.axis2.databinding.utils.ConverterUtil.convertToArray(
                                                                com.pccth.rdbservice.TitleInfo.class,
                                                                list7));
                                                            
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://rdbservice.pccth.com/","anacarGrpInfo").equals(reader.getName())){
                                
                                    
                                    
                                    // Process the array and step past its final element's end.
                                    
                                                          nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                                          if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                                              list8.add(null);
                                                              reader.next();
                                                          } else {
                                                        list8.add(com.pccth.rdbservice.AnacarGrpInfo.Factory.parse(reader));
                                                                }
                                                        //loop until we find a start element that is not part of this array
                                                        boolean loopDone8 = false;
                                                        while(!loopDone8){
                                                            // We should be at the end element, but make sure
                                                            while (!reader.isEndElement())
                                                                reader.next();
                                                            // Step out of this element
                                                            reader.next();
                                                            // Step to next element event.
                                                            while (!reader.isStartElement() && !reader.isEndElement())
                                                                reader.next();
                                                            if (reader.isEndElement()){
                                                                //two continuous end elements means we are exiting the xml structure
                                                                loopDone8 = true;
                                                            } else {
                                                                if (new javax.xml.namespace.QName("http://rdbservice.pccth.com/","anacarGrpInfo").equals(reader.getName())){
                                                                    
                                                                      nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                                                      if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                                                          list8.add(null);
                                                                          reader.next();
                                                                      } else {
                                                                    list8.add(com.pccth.rdbservice.AnacarGrpInfo.Factory.parse(reader));
                                                                        }
                                                                }else{
                                                                    loopDone8 = true;
                                                                }
                                                            }
                                                        }
                                                        // call the converter utility  to convert and set the array
                                                        
                                                        object.setAnacarGrpInfo((com.pccth.rdbservice.AnacarGrpInfo[])
                                                            org.apache.axis2.databinding.utils.ConverterUtil.convertToArray(
                                                                com.pccth.rdbservice.AnacarGrpInfo.class,
                                                                list8));
                                                            
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://rdbservice.pccth.com/","productSubTypeInfo").equals(reader.getName())){
                                
                                    
                                    
                                    // Process the array and step past its final element's end.
                                    
                                                          nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                                          if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                                              list9.add(null);
                                                              reader.next();
                                                          } else {
                                                        list9.add(com.pccth.rdbservice.ProductSubTypeInfo.Factory.parse(reader));
                                                                }
                                                        //loop until we find a start element that is not part of this array
                                                        boolean loopDone9 = false;
                                                        while(!loopDone9){
                                                            // We should be at the end element, but make sure
                                                            while (!reader.isEndElement())
                                                                reader.next();
                                                            // Step out of this element
                                                            reader.next();
                                                            // Step to next element event.
                                                            while (!reader.isStartElement() && !reader.isEndElement())
                                                                reader.next();
                                                            if (reader.isEndElement()){
                                                                //two continuous end elements means we are exiting the xml structure
                                                                loopDone9 = true;
                                                            } else {
                                                                if (new javax.xml.namespace.QName("http://rdbservice.pccth.com/","productSubTypeInfo").equals(reader.getName())){
                                                                    
                                                                      nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                                                      if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                                                          list9.add(null);
                                                                          reader.next();
                                                                      } else {
                                                                    list9.add(com.pccth.rdbservice.ProductSubTypeInfo.Factory.parse(reader));
                                                                        }
                                                                }else{
                                                                    loopDone9 = true;
                                                                }
                                                            }
                                                        }
                                                        // call the converter utility  to convert and set the array
                                                        
                                                        object.setProductSubTypeInfo((com.pccth.rdbservice.ProductSubTypeInfo[])
                                                            org.apache.axis2.databinding.utils.ConverterUtil.convertToArray(
                                                                com.pccth.rdbservice.ProductSubTypeInfo.class,
                                                                list9));
                                                            
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://rdbservice.pccth.com/","areaCodeInfo").equals(reader.getName())){
                                
                                    
                                    
                                    // Process the array and step past its final element's end.
                                    
                                                          nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                                          if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                                              list10.add(null);
                                                              reader.next();
                                                          } else {
                                                        list10.add(com.pccth.rdbservice.AreaCodeInfo.Factory.parse(reader));
                                                                }
                                                        //loop until we find a start element that is not part of this array
                                                        boolean loopDone10 = false;
                                                        while(!loopDone10){
                                                            // We should be at the end element, but make sure
                                                            while (!reader.isEndElement())
                                                                reader.next();
                                                            // Step out of this element
                                                            reader.next();
                                                            // Step to next element event.
                                                            while (!reader.isStartElement() && !reader.isEndElement())
                                                                reader.next();
                                                            if (reader.isEndElement()){
                                                                //two continuous end elements means we are exiting the xml structure
                                                                loopDone10 = true;
                                                            } else {
                                                                if (new javax.xml.namespace.QName("http://rdbservice.pccth.com/","areaCodeInfo").equals(reader.getName())){
                                                                    
                                                                      nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                                                      if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                                                          list10.add(null);
                                                                          reader.next();
                                                                      } else {
                                                                    list10.add(com.pccth.rdbservice.AreaCodeInfo.Factory.parse(reader));
                                                                        }
                                                                }else{
                                                                    loopDone10 = true;
                                                                }
                                                            }
                                                        }
                                                        // call the converter utility  to convert and set the array
                                                        
                                                        object.setAreaCodeInfo((com.pccth.rdbservice.AreaCodeInfo[])
                                                            org.apache.axis2.databinding.utils.ConverterUtil.convertToArray(
                                                                com.pccth.rdbservice.AreaCodeInfo.class,
                                                                list10));
                                                            
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://rdbservice.pccth.com/","vatRateInfo").equals(reader.getName())){
                                
                                    
                                    
                                    // Process the array and step past its final element's end.
                                    
                                                          nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                                          if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                                              list11.add(null);
                                                              reader.next();
                                                          } else {
                                                        list11.add(com.pccth.rdbservice.VatRateInfo.Factory.parse(reader));
                                                                }
                                                        //loop until we find a start element that is not part of this array
                                                        boolean loopDone11 = false;
                                                        while(!loopDone11){
                                                            // We should be at the end element, but make sure
                                                            while (!reader.isEndElement())
                                                                reader.next();
                                                            // Step out of this element
                                                            reader.next();
                                                            // Step to next element event.
                                                            while (!reader.isStartElement() && !reader.isEndElement())
                                                                reader.next();
                                                            if (reader.isEndElement()){
                                                                //two continuous end elements means we are exiting the xml structure
                                                                loopDone11 = true;
                                                            } else {
                                                                if (new javax.xml.namespace.QName("http://rdbservice.pccth.com/","vatRateInfo").equals(reader.getName())){
                                                                    
                                                                      nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                                                      if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                                                          list11.add(null);
                                                                          reader.next();
                                                                      } else {
                                                                    list11.add(com.pccth.rdbservice.VatRateInfo.Factory.parse(reader));
                                                                        }
                                                                }else{
                                                                    loopDone11 = true;
                                                                }
                                                            }
                                                        }
                                                        // call the converter utility  to convert and set the array
                                                        
                                                        object.setVatRateInfo((com.pccth.rdbservice.VatRateInfo[])
                                                            org.apache.axis2.databinding.utils.ConverterUtil.convertToArray(
                                                                com.pccth.rdbservice.VatRateInfo.class,
                                                                list11));
                                                            
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://rdbservice.pccth.com/","countryInfo").equals(reader.getName())){
                                
                                    
                                    
                                    // Process the array and step past its final element's end.
                                    
                                                          nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                                          if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                                              list12.add(null);
                                                              reader.next();
                                                          } else {
                                                        list12.add(com.pccth.rdbservice.CountryInfo.Factory.parse(reader));
                                                                }
                                                        //loop until we find a start element that is not part of this array
                                                        boolean loopDone12 = false;
                                                        while(!loopDone12){
                                                            // We should be at the end element, but make sure
                                                            while (!reader.isEndElement())
                                                                reader.next();
                                                            // Step out of this element
                                                            reader.next();
                                                            // Step to next element event.
                                                            while (!reader.isStartElement() && !reader.isEndElement())
                                                                reader.next();
                                                            if (reader.isEndElement()){
                                                                //two continuous end elements means we are exiting the xml structure
                                                                loopDone12 = true;
                                                            } else {
                                                                if (new javax.xml.namespace.QName("http://rdbservice.pccth.com/","countryInfo").equals(reader.getName())){
                                                                    
                                                                      nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                                                      if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                                                          list12.add(null);
                                                                          reader.next();
                                                                      } else {
                                                                    list12.add(com.pccth.rdbservice.CountryInfo.Factory.parse(reader));
                                                                        }
                                                                }else{
                                                                    loopDone12 = true;
                                                                }
                                                            }
                                                        }
                                                        // call the converter utility  to convert and set the array
                                                        
                                                        object.setCountryInfo((com.pccth.rdbservice.CountryInfo[])
                                                            org.apache.axis2.databinding.utils.ConverterUtil.convertToArray(
                                                                com.pccth.rdbservice.CountryInfo.class,
                                                                list12));
                                                            
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://rdbservice.pccth.com/","approveLevelInfo").equals(reader.getName())){
                                
                                    
                                    
                                    // Process the array and step past its final element's end.
                                    
                                                          nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                                          if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                                              list13.add(null);
                                                              reader.next();
                                                          } else {
                                                        list13.add(com.pccth.rdbservice.ApproveLevelInfo.Factory.parse(reader));
                                                                }
                                                        //loop until we find a start element that is not part of this array
                                                        boolean loopDone13 = false;
                                                        while(!loopDone13){
                                                            // We should be at the end element, but make sure
                                                            while (!reader.isEndElement())
                                                                reader.next();
                                                            // Step out of this element
                                                            reader.next();
                                                            // Step to next element event.
                                                            while (!reader.isStartElement() && !reader.isEndElement())
                                                                reader.next();
                                                            if (reader.isEndElement()){
                                                                //two continuous end elements means we are exiting the xml structure
                                                                loopDone13 = true;
                                                            } else {
                                                                if (new javax.xml.namespace.QName("http://rdbservice.pccth.com/","approveLevelInfo").equals(reader.getName())){
                                                                    
                                                                      nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                                                      if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                                                          list13.add(null);
                                                                          reader.next();
                                                                      } else {
                                                                    list13.add(com.pccth.rdbservice.ApproveLevelInfo.Factory.parse(reader));
                                                                        }
                                                                }else{
                                                                    loopDone13 = true;
                                                                }
                                                            }
                                                        }
                                                        // call the converter utility  to convert and set the array
                                                        
                                                        object.setApproveLevelInfo((com.pccth.rdbservice.ApproveLevelInfo[])
                                                            org.apache.axis2.databinding.utils.ConverterUtil.convertToArray(
                                                                com.pccth.rdbservice.ApproveLevelInfo.class,
                                                                list13));
                                                            
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://rdbservice.pccth.com/","accMastInfo").equals(reader.getName())){
                                
                                    
                                    
                                    // Process the array and step past its final element's end.
                                    
                                                          nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                                          if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                                              list14.add(null);
                                                              reader.next();
                                                          } else {
                                                        list14.add(com.pccth.rdbservice.AccMastInfo.Factory.parse(reader));
                                                                }
                                                        //loop until we find a start element that is not part of this array
                                                        boolean loopDone14 = false;
                                                        while(!loopDone14){
                                                            // We should be at the end element, but make sure
                                                            while (!reader.isEndElement())
                                                                reader.next();
                                                            // Step out of this element
                                                            reader.next();
                                                            // Step to next element event.
                                                            while (!reader.isStartElement() && !reader.isEndElement())
                                                                reader.next();
                                                            if (reader.isEndElement()){
                                                                //two continuous end elements means we are exiting the xml structure
                                                                loopDone14 = true;
                                                            } else {
                                                                if (new javax.xml.namespace.QName("http://rdbservice.pccth.com/","accMastInfo").equals(reader.getName())){
                                                                    
                                                                      nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                                                      if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                                                          list14.add(null);
                                                                          reader.next();
                                                                      } else {
                                                                    list14.add(com.pccth.rdbservice.AccMastInfo.Factory.parse(reader));
                                                                        }
                                                                }else{
                                                                    loopDone14 = true;
                                                                }
                                                            }
                                                        }
                                                        // call the converter utility  to convert and set the array
                                                        
                                                        object.setAccMastInfo((com.pccth.rdbservice.AccMastInfo[])
                                                            org.apache.axis2.databinding.utils.ConverterUtil.convertToArray(
                                                                com.pccth.rdbservice.AccMastInfo.class,
                                                                list14));
                                                            
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://rdbservice.pccth.com/","formCodeInfo").equals(reader.getName())){
                                
                                    
                                    
                                    // Process the array and step past its final element's end.
                                    
                                                          nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                                          if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                                              list15.add(null);
                                                              reader.next();
                                                          } else {
                                                        list15.add(com.pccth.rdbservice.FormCodeInfo.Factory.parse(reader));
                                                                }
                                                        //loop until we find a start element that is not part of this array
                                                        boolean loopDone15 = false;
                                                        while(!loopDone15){
                                                            // We should be at the end element, but make sure
                                                            while (!reader.isEndElement())
                                                                reader.next();
                                                            // Step out of this element
                                                            reader.next();
                                                            // Step to next element event.
                                                            while (!reader.isStartElement() && !reader.isEndElement())
                                                                reader.next();
                                                            if (reader.isEndElement()){
                                                                //two continuous end elements means we are exiting the xml structure
                                                                loopDone15 = true;
                                                            } else {
                                                                if (new javax.xml.namespace.QName("http://rdbservice.pccth.com/","formCodeInfo").equals(reader.getName())){
                                                                    
                                                                      nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                                                      if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                                                          list15.add(null);
                                                                          reader.next();
                                                                      } else {
                                                                    list15.add(com.pccth.rdbservice.FormCodeInfo.Factory.parse(reader));
                                                                        }
                                                                }else{
                                                                    loopDone15 = true;
                                                                }
                                                            }
                                                        }
                                                        // call the converter utility  to convert and set the array
                                                        
                                                        object.setFormCodeInfo((com.pccth.rdbservice.FormCodeInfo[])
                                                            org.apache.axis2.databinding.utils.ConverterUtil.convertToArray(
                                                                com.pccth.rdbservice.FormCodeInfo.class,
                                                                list15));
                                                            
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://rdbservice.pccth.com/","currencyInfo").equals(reader.getName())){
                                
                                    
                                    
                                    // Process the array and step past its final element's end.
                                    
                                                          nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                                          if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                                              list16.add(null);
                                                              reader.next();
                                                          } else {
                                                        list16.add(com.pccth.rdbservice.CurrencyInfo.Factory.parse(reader));
                                                                }
                                                        //loop until we find a start element that is not part of this array
                                                        boolean loopDone16 = false;
                                                        while(!loopDone16){
                                                            // We should be at the end element, but make sure
                                                            while (!reader.isEndElement())
                                                                reader.next();
                                                            // Step out of this element
                                                            reader.next();
                                                            // Step to next element event.
                                                            while (!reader.isStartElement() && !reader.isEndElement())
                                                                reader.next();
                                                            if (reader.isEndElement()){
                                                                //two continuous end elements means we are exiting the xml structure
                                                                loopDone16 = true;
                                                            } else {
                                                                if (new javax.xml.namespace.QName("http://rdbservice.pccth.com/","currencyInfo").equals(reader.getName())){
                                                                    
                                                                      nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                                                      if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                                                          list16.add(null);
                                                                          reader.next();
                                                                      } else {
                                                                    list16.add(com.pccth.rdbservice.CurrencyInfo.Factory.parse(reader));
                                                                        }
                                                                }else{
                                                                    loopDone16 = true;
                                                                }
                                                            }
                                                        }
                                                        // call the converter utility  to convert and set the array
                                                        
                                                        object.setCurrencyInfo((com.pccth.rdbservice.CurrencyInfo[])
                                                            org.apache.axis2.databinding.utils.ConverterUtil.convertToArray(
                                                                com.pccth.rdbservice.CurrencyInfo.class,
                                                                list16));
                                                            
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://rdbservice.pccth.com/","objRateInfo").equals(reader.getName())){
                                
                                    
                                    
                                    // Process the array and step past its final element's end.
                                    
                                                          nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                                          if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                                              list17.add(null);
                                                              reader.next();
                                                          } else {
                                                        list17.add(com.pccth.rdbservice.ObjRateInfo.Factory.parse(reader));
                                                                }
                                                        //loop until we find a start element that is not part of this array
                                                        boolean loopDone17 = false;
                                                        while(!loopDone17){
                                                            // We should be at the end element, but make sure
                                                            while (!reader.isEndElement())
                                                                reader.next();
                                                            // Step out of this element
                                                            reader.next();
                                                            // Step to next element event.
                                                            while (!reader.isStartElement() && !reader.isEndElement())
                                                                reader.next();
                                                            if (reader.isEndElement()){
                                                                //two continuous end elements means we are exiting the xml structure
                                                                loopDone17 = true;
                                                            } else {
                                                                if (new javax.xml.namespace.QName("http://rdbservice.pccth.com/","objRateInfo").equals(reader.getName())){
                                                                    
                                                                      nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                                                      if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                                                          list17.add(null);
                                                                          reader.next();
                                                                      } else {
                                                                    list17.add(com.pccth.rdbservice.ObjRateInfo.Factory.parse(reader));
                                                                        }
                                                                }else{
                                                                    loopDone17 = true;
                                                                }
                                                            }
                                                        }
                                                        // call the converter utility  to convert and set the array
                                                        
                                                        object.setObjRateInfo((com.pccth.rdbservice.ObjRateInfo[])
                                                            org.apache.axis2.databinding.utils.ConverterUtil.convertToArray(
                                                                com.pccth.rdbservice.ObjRateInfo.class,
                                                                list17));
                                                            
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://rdbservice.pccth.com/","returnDesc").equals(reader.getName())){
                                
                                       nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                       if (!"true".equals(nillableValue) && !"1".equals(nillableValue)){
                                    

                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setReturnDesc(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));
                                            
                                       } else {
                                           
                                           
                                           reader.getElementText(); // throw away text nodes if any.
                                       }
                                      
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                else{
                                    // A start element we are not expecting indicates an invalid parameter was passed
                                    throw new org.apache.axis2.databinding.ADBException("Unexpected subelement " + reader.getName());
                                }
                            
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://rdbservice.pccth.com/","cusGrpInfo").equals(reader.getName())){
                                
                                    
                                    
                                    // Process the array and step past its final element's end.
                                    
                                                          nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                                          if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                                              list19.add(null);
                                                              reader.next();
                                                          } else {
                                                        list19.add(com.pccth.rdbservice.CusGrpInfo.Factory.parse(reader));
                                                                }
                                                        //loop until we find a start element that is not part of this array
                                                        boolean loopDone19 = false;
                                                        while(!loopDone19){
                                                            // We should be at the end element, but make sure
                                                            while (!reader.isEndElement())
                                                                reader.next();
                                                            // Step out of this element
                                                            reader.next();
                                                            // Step to next element event.
                                                            while (!reader.isStartElement() && !reader.isEndElement())
                                                                reader.next();
                                                            if (reader.isEndElement()){
                                                                //two continuous end elements means we are exiting the xml structure
                                                                loopDone19 = true;
                                                            } else {
                                                                if (new javax.xml.namespace.QName("http://rdbservice.pccth.com/","cusGrpInfo").equals(reader.getName())){
                                                                    
                                                                      nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                                                      if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                                                          list19.add(null);
                                                                          reader.next();
                                                                      } else {
                                                                    list19.add(com.pccth.rdbservice.CusGrpInfo.Factory.parse(reader));
                                                                        }
                                                                }else{
                                                                    loopDone19 = true;
                                                                }
                                                            }
                                                        }
                                                        // call the converter utility  to convert and set the array
                                                        
                                                        object.setCusGrpInfo((com.pccth.rdbservice.CusGrpInfo[])
                                                            org.apache.axis2.databinding.utils.ConverterUtil.convertToArray(
                                                                com.pccth.rdbservice.CusGrpInfo.class,
                                                                list19));
                                                            
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://rdbservice.pccth.com/","anacarSdInfo").equals(reader.getName())){
                                
                                    
                                    
                                    // Process the array and step past its final element's end.
                                    
                                                          nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                                          if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                                              list20.add(null);
                                                              reader.next();
                                                          } else {
                                                        list20.add(com.pccth.rdbservice.AnacarSdInfo.Factory.parse(reader));
                                                                }
                                                        //loop until we find a start element that is not part of this array
                                                        boolean loopDone20 = false;
                                                        while(!loopDone20){
                                                            // We should be at the end element, but make sure
                                                            while (!reader.isEndElement())
                                                                reader.next();
                                                            // Step out of this element
                                                            reader.next();
                                                            // Step to next element event.
                                                            while (!reader.isStartElement() && !reader.isEndElement())
                                                                reader.next();
                                                            if (reader.isEndElement()){
                                                                //two continuous end elements means we are exiting the xml structure
                                                                loopDone20 = true;
                                                            } else {
                                                                if (new javax.xml.namespace.QName("http://rdbservice.pccth.com/","anacarSdInfo").equals(reader.getName())){
                                                                    
                                                                      nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                                                      if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                                                          list20.add(null);
                                                                          reader.next();
                                                                      } else {
                                                                    list20.add(com.pccth.rdbservice.AnacarSdInfo.Factory.parse(reader));
                                                                        }
                                                                }else{
                                                                    loopDone20 = true;
                                                                }
                                                            }
                                                        }
                                                        // call the converter utility  to convert and set the array
                                                        
                                                        object.setAnacarSdInfo((com.pccth.rdbservice.AnacarSdInfo[])
                                                            org.apache.axis2.databinding.utils.ConverterUtil.convertToArray(
                                                                com.pccth.rdbservice.AnacarSdInfo.class,
                                                                list20));
                                                            
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://rdbservice.pccth.com/","structureGoodsInfo").equals(reader.getName())){
                                
                                    
                                    
                                    // Process the array and step past its final element's end.
                                    
                                                          nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                                          if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                                              list21.add(null);
                                                              reader.next();
                                                          } else {
                                                        list21.add(com.pccth.rdbservice.StructureGoodsInfo.Factory.parse(reader));
                                                                }
                                                        //loop until we find a start element that is not part of this array
                                                        boolean loopDone21 = false;
                                                        while(!loopDone21){
                                                            // We should be at the end element, but make sure
                                                            while (!reader.isEndElement())
                                                                reader.next();
                                                            // Step out of this element
                                                            reader.next();
                                                            // Step to next element event.
                                                            while (!reader.isStartElement() && !reader.isEndElement())
                                                                reader.next();
                                                            if (reader.isEndElement()){
                                                                //two continuous end elements means we are exiting the xml structure
                                                                loopDone21 = true;
                                                            } else {
                                                                if (new javax.xml.namespace.QName("http://rdbservice.pccth.com/","structureGoodsInfo").equals(reader.getName())){
                                                                    
                                                                      nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                                                      if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                                                          list21.add(null);
                                                                          reader.next();
                                                                      } else {
                                                                    list21.add(com.pccth.rdbservice.StructureGoodsInfo.Factory.parse(reader));
                                                                        }
                                                                }else{
                                                                    loopDone21 = true;
                                                                }
                                                            }
                                                        }
                                                        // call the converter utility  to convert and set the array
                                                        
                                                        object.setStructureGoodsInfo((com.pccth.rdbservice.StructureGoodsInfo[])
                                                            org.apache.axis2.databinding.utils.ConverterUtil.convertToArray(
                                                                com.pccth.rdbservice.StructureGoodsInfo.class,
                                                                list21));
                                                            
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://rdbservice.pccth.com/","incMastInfo").equals(reader.getName())){
                                
                                    
                                    
                                    // Process the array and step past its final element's end.
                                    
                                                          nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                                          if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                                              list22.add(null);
                                                              reader.next();
                                                          } else {
                                                        list22.add(com.pccth.rdbservice.IncMastInfo.Factory.parse(reader));
                                                                }
                                                        //loop until we find a start element that is not part of this array
                                                        boolean loopDone22 = false;
                                                        while(!loopDone22){
                                                            // We should be at the end element, but make sure
                                                            while (!reader.isEndElement())
                                                                reader.next();
                                                            // Step out of this element
                                                            reader.next();
                                                            // Step to next element event.
                                                            while (!reader.isStartElement() && !reader.isEndElement())
                                                                reader.next();
                                                            if (reader.isEndElement()){
                                                                //two continuous end elements means we are exiting the xml structure
                                                                loopDone22 = true;
                                                            } else {
                                                                if (new javax.xml.namespace.QName("http://rdbservice.pccth.com/","incMastInfo").equals(reader.getName())){
                                                                    
                                                                      nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                                                      if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                                                          list22.add(null);
                                                                          reader.next();
                                                                      } else {
                                                                    list22.add(com.pccth.rdbservice.IncMastInfo.Factory.parse(reader));
                                                                        }
                                                                }else{
                                                                    loopDone22 = true;
                                                                }
                                                            }
                                                        }
                                                        // call the converter utility  to convert and set the array
                                                        
                                                        object.setIncMastInfo((com.pccth.rdbservice.IncMastInfo[])
                                                            org.apache.axis2.databinding.utils.ConverterUtil.convertToArray(
                                                                com.pccth.rdbservice.IncMastInfo.class,
                                                                list22));
                                                            
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://rdbservice.pccth.com/","dutyUnitInfo").equals(reader.getName())){
                                
                                    
                                    
                                    // Process the array and step past its final element's end.
                                    
                                                          nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                                          if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                                              list23.add(null);
                                                              reader.next();
                                                          } else {
                                                        list23.add(com.pccth.rdbservice.DutyUnitInfo.Factory.parse(reader));
                                                                }
                                                        //loop until we find a start element that is not part of this array
                                                        boolean loopDone23 = false;
                                                        while(!loopDone23){
                                                            // We should be at the end element, but make sure
                                                            while (!reader.isEndElement())
                                                                reader.next();
                                                            // Step out of this element
                                                            reader.next();
                                                            // Step to next element event.
                                                            while (!reader.isStartElement() && !reader.isEndElement())
                                                                reader.next();
                                                            if (reader.isEndElement()){
                                                                //two continuous end elements means we are exiting the xml structure
                                                                loopDone23 = true;
                                                            } else {
                                                                if (new javax.xml.namespace.QName("http://rdbservice.pccth.com/","dutyUnitInfo").equals(reader.getName())){
                                                                    
                                                                      nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                                                      if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                                                          list23.add(null);
                                                                          reader.next();
                                                                      } else {
                                                                    list23.add(com.pccth.rdbservice.DutyUnitInfo.Factory.parse(reader));
                                                                        }
                                                                }else{
                                                                    loopDone23 = true;
                                                                }
                                                            }
                                                        }
                                                        // call the converter utility  to convert and set the array
                                                        
                                                        object.setDutyUnitInfo((com.pccth.rdbservice.DutyUnitInfo[])
                                                            org.apache.axis2.databinding.utils.ConverterUtil.convertToArray(
                                                                com.pccth.rdbservice.DutyUnitInfo.class,
                                                                list23));
                                                            
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://rdbservice.pccth.com/","customHouseInfo").equals(reader.getName())){
                                
                                    
                                    
                                    // Process the array and step past its final element's end.
                                    
                                                          nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                                          if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                                              list24.add(null);
                                                              reader.next();
                                                          } else {
                                                        list24.add(com.pccth.rdbservice.CustomHouseInfo.Factory.parse(reader));
                                                                }
                                                        //loop until we find a start element that is not part of this array
                                                        boolean loopDone24 = false;
                                                        while(!loopDone24){
                                                            // We should be at the end element, but make sure
                                                            while (!reader.isEndElement())
                                                                reader.next();
                                                            // Step out of this element
                                                            reader.next();
                                                            // Step to next element event.
                                                            while (!reader.isStartElement() && !reader.isEndElement())
                                                                reader.next();
                                                            if (reader.isEndElement()){
                                                                //two continuous end elements means we are exiting the xml structure
                                                                loopDone24 = true;
                                                            } else {
                                                                if (new javax.xml.namespace.QName("http://rdbservice.pccth.com/","customHouseInfo").equals(reader.getName())){
                                                                    
                                                                      nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                                                      if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                                                          list24.add(null);
                                                                          reader.next();
                                                                      } else {
                                                                    list24.add(com.pccth.rdbservice.CustomHouseInfo.Factory.parse(reader));
                                                                        }
                                                                }else{
                                                                    loopDone24 = true;
                                                                }
                                                            }
                                                        }
                                                        // call the converter utility  to convert and set the array
                                                        
                                                        object.setCustomHouseInfo((com.pccth.rdbservice.CustomHouseInfo[])
                                                            org.apache.axis2.databinding.utils.ConverterUtil.convertToArray(
                                                                com.pccth.rdbservice.CustomHouseInfo.class,
                                                                list24));
                                                            
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://rdbservice.pccth.com/","titleOldInfo").equals(reader.getName())){
                                
                                    
                                    
                                    // Process the array and step past its final element's end.
                                    
                                                          nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                                          if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                                              list25.add(null);
                                                              reader.next();
                                                          } else {
                                                        list25.add(com.pccth.rdbservice.TitleOldInfo.Factory.parse(reader));
                                                                }
                                                        //loop until we find a start element that is not part of this array
                                                        boolean loopDone25 = false;
                                                        while(!loopDone25){
                                                            // We should be at the end element, but make sure
                                                            while (!reader.isEndElement())
                                                                reader.next();
                                                            // Step out of this element
                                                            reader.next();
                                                            // Step to next element event.
                                                            while (!reader.isStartElement() && !reader.isEndElement())
                                                                reader.next();
                                                            if (reader.isEndElement()){
                                                                //two continuous end elements means we are exiting the xml structure
                                                                loopDone25 = true;
                                                            } else {
                                                                if (new javax.xml.namespace.QName("http://rdbservice.pccth.com/","titleOldInfo").equals(reader.getName())){
                                                                    
                                                                      nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                                                      if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                                                          list25.add(null);
                                                                          reader.next();
                                                                      } else {
                                                                    list25.add(com.pccth.rdbservice.TitleOldInfo.Factory.parse(reader));
                                                                        }
                                                                }else{
                                                                    loopDone25 = true;
                                                                }
                                                            }
                                                        }
                                                        // call the converter utility  to convert and set the array
                                                        
                                                        object.setTitleOldInfo((com.pccth.rdbservice.TitleOldInfo[])
                                                            org.apache.axis2.databinding.utils.ConverterUtil.convertToArray(
                                                                com.pccth.rdbservice.TitleOldInfo.class,
                                                                list25));
                                                            
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://rdbservice.pccth.com/","ediGoodsInfo").equals(reader.getName())){
                                
                                    
                                    
                                    // Process the array and step past its final element's end.
                                    
                                                          nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                                          if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                                              list26.add(null);
                                                              reader.next();
                                                          } else {
                                                        list26.add(com.pccth.rdbservice.EdiGoodsInfo.Factory.parse(reader));
                                                                }
                                                        //loop until we find a start element that is not part of this array
                                                        boolean loopDone26 = false;
                                                        while(!loopDone26){
                                                            // We should be at the end element, but make sure
                                                            while (!reader.isEndElement())
                                                                reader.next();
                                                            // Step out of this element
                                                            reader.next();
                                                            // Step to next element event.
                                                            while (!reader.isStartElement() && !reader.isEndElement())
                                                                reader.next();
                                                            if (reader.isEndElement()){
                                                                //two continuous end elements means we are exiting the xml structure
                                                                loopDone26 = true;
                                                            } else {
                                                                if (new javax.xml.namespace.QName("http://rdbservice.pccth.com/","ediGoodsInfo").equals(reader.getName())){
                                                                    
                                                                      nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                                                      if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                                                          list26.add(null);
                                                                          reader.next();
                                                                      } else {
                                                                    list26.add(com.pccth.rdbservice.EdiGoodsInfo.Factory.parse(reader));
                                                                        }
                                                                }else{
                                                                    loopDone26 = true;
                                                                }
                                                            }
                                                        }
                                                        // call the converter utility  to convert and set the array
                                                        
                                                        object.setEdiGoodsInfo((com.pccth.rdbservice.EdiGoodsInfo[])
                                                            org.apache.axis2.databinding.utils.ConverterUtil.convertToArray(
                                                                com.pccth.rdbservice.EdiGoodsInfo.class,
                                                                list26));
                                                            
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://rdbservice.pccth.com/","productUnitInfo").equals(reader.getName())){
                                
                                    
                                    
                                    // Process the array and step past its final element's end.
                                    
                                                          nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                                          if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                                              list27.add(null);
                                                              reader.next();
                                                          } else {
                                                        list27.add(com.pccth.rdbservice.ProductUnitInfo.Factory.parse(reader));
                                                                }
                                                        //loop until we find a start element that is not part of this array
                                                        boolean loopDone27 = false;
                                                        while(!loopDone27){
                                                            // We should be at the end element, but make sure
                                                            while (!reader.isEndElement())
                                                                reader.next();
                                                            // Step out of this element
                                                            reader.next();
                                                            // Step to next element event.
                                                            while (!reader.isStartElement() && !reader.isEndElement())
                                                                reader.next();
                                                            if (reader.isEndElement()){
                                                                //two continuous end elements means we are exiting the xml structure
                                                                loopDone27 = true;
                                                            } else {
                                                                if (new javax.xml.namespace.QName("http://rdbservice.pccth.com/","productUnitInfo").equals(reader.getName())){
                                                                    
                                                                      nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                                                      if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                                                          list27.add(null);
                                                                          reader.next();
                                                                      } else {
                                                                    list27.add(com.pccth.rdbservice.ProductUnitInfo.Factory.parse(reader));
                                                                        }
                                                                }else{
                                                                    loopDone27 = true;
                                                                }
                                                            }
                                                        }
                                                        // call the converter utility  to convert and set the array
                                                        
                                                        object.setProductUnitInfo((com.pccth.rdbservice.ProductUnitInfo[])
                                                            org.apache.axis2.databinding.utils.ConverterUtil.convertToArray(
                                                                com.pccth.rdbservice.ProductUnitInfo.class,
                                                                list27));
                                                            
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://rdbservice.pccth.com/","sssFundRateInfo").equals(reader.getName())){
                                
                                    
                                    
                                    // Process the array and step past its final element's end.
                                    
                                                          nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                                          if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                                              list28.add(null);
                                                              reader.next();
                                                          } else {
                                                        list28.add(com.pccth.rdbservice.SssFundRateInfo.Factory.parse(reader));
                                                                }
                                                        //loop until we find a start element that is not part of this array
                                                        boolean loopDone28 = false;
                                                        while(!loopDone28){
                                                            // We should be at the end element, but make sure
                                                            while (!reader.isEndElement())
                                                                reader.next();
                                                            // Step out of this element
                                                            reader.next();
                                                            // Step to next element event.
                                                            while (!reader.isStartElement() && !reader.isEndElement())
                                                                reader.next();
                                                            if (reader.isEndElement()){
                                                                //two continuous end elements means we are exiting the xml structure
                                                                loopDone28 = true;
                                                            } else {
                                                                if (new javax.xml.namespace.QName("http://rdbservice.pccth.com/","sssFundRateInfo").equals(reader.getName())){
                                                                    
                                                                      nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                                                      if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                                                          list28.add(null);
                                                                          reader.next();
                                                                      } else {
                                                                    list28.add(com.pccth.rdbservice.SssFundRateInfo.Factory.parse(reader));
                                                                        }
                                                                }else{
                                                                    loopDone28 = true;
                                                                }
                                                            }
                                                        }
                                                        // call the converter utility  to convert and set the array
                                                        
                                                        object.setSssFundRateInfo((com.pccth.rdbservice.SssFundRateInfo[])
                                                            org.apache.axis2.databinding.utils.ConverterUtil.convertToArray(
                                                                com.pccth.rdbservice.SssFundRateInfo.class,
                                                                list28));
                                                            
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://rdbservice.pccth.com/","dutyMaterialInfo").equals(reader.getName())){
                                
                                    
                                    
                                    // Process the array and step past its final element's end.
                                    
                                                          nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                                          if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                                              list29.add(null);
                                                              reader.next();
                                                          } else {
                                                        list29.add(com.pccth.rdbservice.DutyMaterialInfo.Factory.parse(reader));
                                                                }
                                                        //loop until we find a start element that is not part of this array
                                                        boolean loopDone29 = false;
                                                        while(!loopDone29){
                                                            // We should be at the end element, but make sure
                                                            while (!reader.isEndElement())
                                                                reader.next();
                                                            // Step out of this element
                                                            reader.next();
                                                            // Step to next element event.
                                                            while (!reader.isStartElement() && !reader.isEndElement())
                                                                reader.next();
                                                            if (reader.isEndElement()){
                                                                //two continuous end elements means we are exiting the xml structure
                                                                loopDone29 = true;
                                                            } else {
                                                                if (new javax.xml.namespace.QName("http://rdbservice.pccth.com/","dutyMaterialInfo").equals(reader.getName())){
                                                                    
                                                                      nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                                                      if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                                                          list29.add(null);
                                                                          reader.next();
                                                                      } else {
                                                                    list29.add(com.pccth.rdbservice.DutyMaterialInfo.Factory.parse(reader));
                                                                        }
                                                                }else{
                                                                    loopDone29 = true;
                                                                }
                                                            }
                                                        }
                                                        // call the converter utility  to convert and set the array
                                                        
                                                        object.setDutyMaterialInfo((com.pccth.rdbservice.DutyMaterialInfo[])
                                                            org.apache.axis2.databinding.utils.ConverterUtil.convertToArray(
                                                                com.pccth.rdbservice.DutyMaterialInfo.class,
                                                                list29));
                                                            
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://rdbservice.pccth.com/","dutyGroupInfo").equals(reader.getName())){
                                
                                    
                                    
                                    // Process the array and step past its final element's end.
                                    
                                                          nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                                          if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                                              list30.add(null);
                                                              reader.next();
                                                          } else {
                                                        list30.add(com.pccth.rdbservice.DutyGroupInfo.Factory.parse(reader));
                                                                }
                                                        //loop until we find a start element that is not part of this array
                                                        boolean loopDone30 = false;
                                                        while(!loopDone30){
                                                            // We should be at the end element, but make sure
                                                            while (!reader.isEndElement())
                                                                reader.next();
                                                            // Step out of this element
                                                            reader.next();
                                                            // Step to next element event.
                                                            while (!reader.isStartElement() && !reader.isEndElement())
                                                                reader.next();
                                                            if (reader.isEndElement()){
                                                                //two continuous end elements means we are exiting the xml structure
                                                                loopDone30 = true;
                                                            } else {
                                                                if (new javax.xml.namespace.QName("http://rdbservice.pccth.com/","dutyGroupInfo").equals(reader.getName())){
                                                                    
                                                                      nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                                                      if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                                                          list30.add(null);
                                                                          reader.next();
                                                                      } else {
                                                                    list30.add(com.pccth.rdbservice.DutyGroupInfo.Factory.parse(reader));
                                                                        }
                                                                }else{
                                                                    loopDone30 = true;
                                                                }
                                                            }
                                                        }
                                                        // call the converter utility  to convert and set the array
                                                        
                                                        object.setDutyGroupInfo((com.pccth.rdbservice.DutyGroupInfo[])
                                                            org.apache.axis2.databinding.utils.ConverterUtil.convertToArray(
                                                                com.pccth.rdbservice.DutyGroupInfo.class,
                                                                list30));
                                                            
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://rdbservice.pccth.com/","importCompInfo").equals(reader.getName())){
                                
                                    
                                    
                                    // Process the array and step past its final element's end.
                                    
                                                          nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                                          if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                                              list31.add(null);
                                                              reader.next();
                                                          } else {
                                                        list31.add(com.pccth.rdbservice.ImportCompInfo.Factory.parse(reader));
                                                                }
                                                        //loop until we find a start element that is not part of this array
                                                        boolean loopDone31 = false;
                                                        while(!loopDone31){
                                                            // We should be at the end element, but make sure
                                                            while (!reader.isEndElement())
                                                                reader.next();
                                                            // Step out of this element
                                                            reader.next();
                                                            // Step to next element event.
                                                            while (!reader.isStartElement() && !reader.isEndElement())
                                                                reader.next();
                                                            if (reader.isEndElement()){
                                                                //two continuous end elements means we are exiting the xml structure
                                                                loopDone31 = true;
                                                            } else {
                                                                if (new javax.xml.namespace.QName("http://rdbservice.pccth.com/","importCompInfo").equals(reader.getName())){
                                                                    
                                                                      nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                                                      if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                                                          list31.add(null);
                                                                          reader.next();
                                                                      } else {
                                                                    list31.add(com.pccth.rdbservice.ImportCompInfo.Factory.parse(reader));
                                                                        }
                                                                }else{
                                                                    loopDone31 = true;
                                                                }
                                                            }
                                                        }
                                                        // call the converter utility  to convert and set the array
                                                        
                                                        object.setImportCompInfo((com.pccth.rdbservice.ImportCompInfo[])
                                                            org.apache.axis2.databinding.utils.ConverterUtil.convertToArray(
                                                                com.pccth.rdbservice.ImportCompInfo.class,
                                                                list31));
                                                            
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://rdbservice.pccth.com/","materialInfo").equals(reader.getName())){
                                
                                    
                                    
                                    // Process the array and step past its final element's end.
                                    
                                                          nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                                          if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                                              list32.add(null);
                                                              reader.next();
                                                          } else {
                                                        list32.add(com.pccth.rdbservice.MaterialInfo.Factory.parse(reader));
                                                                }
                                                        //loop until we find a start element that is not part of this array
                                                        boolean loopDone32 = false;
                                                        while(!loopDone32){
                                                            // We should be at the end element, but make sure
                                                            while (!reader.isEndElement())
                                                                reader.next();
                                                            // Step out of this element
                                                            reader.next();
                                                            // Step to next element event.
                                                            while (!reader.isStartElement() && !reader.isEndElement())
                                                                reader.next();
                                                            if (reader.isEndElement()){
                                                                //two continuous end elements means we are exiting the xml structure
                                                                loopDone32 = true;
                                                            } else {
                                                                if (new javax.xml.namespace.QName("http://rdbservice.pccth.com/","materialInfo").equals(reader.getName())){
                                                                    
                                                                      nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                                                      if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                                                          list32.add(null);
                                                                          reader.next();
                                                                      } else {
                                                                    list32.add(com.pccth.rdbservice.MaterialInfo.Factory.parse(reader));
                                                                        }
                                                                }else{
                                                                    loopDone32 = true;
                                                                }
                                                            }
                                                        }
                                                        // call the converter utility  to convert and set the array
                                                        
                                                        object.setMaterialInfo((com.pccth.rdbservice.MaterialInfo[])
                                                            org.apache.axis2.databinding.utils.ConverterUtil.convertToArray(
                                                                com.pccth.rdbservice.MaterialInfo.class,
                                                                list32));
                                                            
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://rdbservice.pccth.com/","localRateInfo").equals(reader.getName())){
                                
                                    
                                    
                                    // Process the array and step past its final element's end.
                                    
                                                          nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                                          if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                                              list33.add(null);
                                                              reader.next();
                                                          } else {
                                                        list33.add(com.pccth.rdbservice.LocalRateInfo.Factory.parse(reader));
                                                                }
                                                        //loop until we find a start element that is not part of this array
                                                        boolean loopDone33 = false;
                                                        while(!loopDone33){
                                                            // We should be at the end element, but make sure
                                                            while (!reader.isEndElement())
                                                                reader.next();
                                                            // Step out of this element
                                                            reader.next();
                                                            // Step to next element event.
                                                            while (!reader.isStartElement() && !reader.isEndElement())
                                                                reader.next();
                                                            if (reader.isEndElement()){
                                                                //two continuous end elements means we are exiting the xml structure
                                                                loopDone33 = true;
                                                            } else {
                                                                if (new javax.xml.namespace.QName("http://rdbservice.pccth.com/","localRateInfo").equals(reader.getName())){
                                                                    
                                                                      nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                                                      if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                                                          list33.add(null);
                                                                          reader.next();
                                                                      } else {
                                                                    list33.add(com.pccth.rdbservice.LocalRateInfo.Factory.parse(reader));
                                                                        }
                                                                }else{
                                                                    loopDone33 = true;
                                                                }
                                                            }
                                                        }
                                                        // call the converter utility  to convert and set the array
                                                        
                                                        object.setLocalRateInfo((com.pccth.rdbservice.LocalRateInfo[])
                                                            org.apache.axis2.databinding.utils.ConverterUtil.convertToArray(
                                                                com.pccth.rdbservice.LocalRateInfo.class,
                                                                list33));
                                                            
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://rdbservice.pccth.com/","cdCountryInfo").equals(reader.getName())){
                                
                                    
                                    
                                    // Process the array and step past its final element's end.
                                    
                                                          nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                                          if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                                              list34.add(null);
                                                              reader.next();
                                                          } else {
                                                        list34.add(com.pccth.rdbservice.CdCountryInfo.Factory.parse(reader));
                                                                }
                                                        //loop until we find a start element that is not part of this array
                                                        boolean loopDone34 = false;
                                                        while(!loopDone34){
                                                            // We should be at the end element, but make sure
                                                            while (!reader.isEndElement())
                                                                reader.next();
                                                            // Step out of this element
                                                            reader.next();
                                                            // Step to next element event.
                                                            while (!reader.isStartElement() && !reader.isEndElement())
                                                                reader.next();
                                                            if (reader.isEndElement()){
                                                                //two continuous end elements means we are exiting the xml structure
                                                                loopDone34 = true;
                                                            } else {
                                                                if (new javax.xml.namespace.QName("http://rdbservice.pccth.com/","cdCountryInfo").equals(reader.getName())){
                                                                    
                                                                      nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                                                      if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                                                          list34.add(null);
                                                                          reader.next();
                                                                      } else {
                                                                    list34.add(com.pccth.rdbservice.CdCountryInfo.Factory.parse(reader));
                                                                        }
                                                                }else{
                                                                    loopDone34 = true;
                                                                }
                                                            }
                                                        }
                                                        // call the converter utility  to convert and set the array
                                                        
                                                        object.setCdCountryInfo((com.pccth.rdbservice.CdCountryInfo[])
                                                            org.apache.axis2.databinding.utils.ConverterUtil.convertToArray(
                                                                com.pccth.rdbservice.CdCountryInfo.class,
                                                                list34));
                                                            
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://rdbservice.pccth.com/","productIncMastInfo").equals(reader.getName())){
                                
                                    
                                    
                                    // Process the array and step past its final element's end.
                                    
                                                          nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                                          if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                                              list35.add(null);
                                                              reader.next();
                                                          } else {
                                                        list35.add(com.pccth.rdbservice.ProductIncMastInfo.Factory.parse(reader));
                                                                }
                                                        //loop until we find a start element that is not part of this array
                                                        boolean loopDone35 = false;
                                                        while(!loopDone35){
                                                            // We should be at the end element, but make sure
                                                            while (!reader.isEndElement())
                                                                reader.next();
                                                            // Step out of this element
                                                            reader.next();
                                                            // Step to next element event.
                                                            while (!reader.isStartElement() && !reader.isEndElement())
                                                                reader.next();
                                                            if (reader.isEndElement()){
                                                                //two continuous end elements means we are exiting the xml structure
                                                                loopDone35 = true;
                                                            } else {
                                                                if (new javax.xml.namespace.QName("http://rdbservice.pccth.com/","productIncMastInfo").equals(reader.getName())){
                                                                    
                                                                      nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                                                      if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                                                          list35.add(null);
                                                                          reader.next();
                                                                      } else {
                                                                    list35.add(com.pccth.rdbservice.ProductIncMastInfo.Factory.parse(reader));
                                                                        }
                                                                }else{
                                                                    loopDone35 = true;
                                                                }
                                                            }
                                                        }
                                                        // call the converter utility  to convert and set the array
                                                        
                                                        object.setProductIncMastInfo((com.pccth.rdbservice.ProductIncMastInfo[])
                                                            org.apache.axis2.databinding.utils.ConverterUtil.convertToArray(
                                                                com.pccth.rdbservice.ProductIncMastInfo.class,
                                                                list35));
                                                            
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://rdbservice.pccth.com/","licenseHdInfo").equals(reader.getName())){
                                
                                    
                                    
                                    // Process the array and step past its final element's end.
                                    
                                                          nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                                          if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                                              list36.add(null);
                                                              reader.next();
                                                          } else {
                                                        list36.add(com.pccth.rdbservice.LicenseHdInfo.Factory.parse(reader));
                                                                }
                                                        //loop until we find a start element that is not part of this array
                                                        boolean loopDone36 = false;
                                                        while(!loopDone36){
                                                            // We should be at the end element, but make sure
                                                            while (!reader.isEndElement())
                                                                reader.next();
                                                            // Step out of this element
                                                            reader.next();
                                                            // Step to next element event.
                                                            while (!reader.isStartElement() && !reader.isEndElement())
                                                                reader.next();
                                                            if (reader.isEndElement()){
                                                                //two continuous end elements means we are exiting the xml structure
                                                                loopDone36 = true;
                                                            } else {
                                                                if (new javax.xml.namespace.QName("http://rdbservice.pccth.com/","licenseHdInfo").equals(reader.getName())){
                                                                    
                                                                      nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                                                      if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                                                          list36.add(null);
                                                                          reader.next();
                                                                      } else {
                                                                    list36.add(com.pccth.rdbservice.LicenseHdInfo.Factory.parse(reader));
                                                                        }
                                                                }else{
                                                                    loopDone36 = true;
                                                                }
                                                            }
                                                        }
                                                        // call the converter utility  to convert and set the array
                                                        
                                                        object.setLicenseHdInfo((com.pccth.rdbservice.LicenseHdInfo[])
                                                            org.apache.axis2.databinding.utils.ConverterUtil.convertToArray(
                                                                com.pccth.rdbservice.LicenseHdInfo.class,
                                                                list36));
                                                            
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://rdbservice.pccth.com/","incomeTypeInfo").equals(reader.getName())){
                                
                                    
                                    
                                    // Process the array and step past its final element's end.
                                    
                                                          nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                                          if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                                              list37.add(null);
                                                              reader.next();
                                                          } else {
                                                        list37.add(com.pccth.rdbservice.IncomeTypeInfo.Factory.parse(reader));
                                                                }
                                                        //loop until we find a start element that is not part of this array
                                                        boolean loopDone37 = false;
                                                        while(!loopDone37){
                                                            // We should be at the end element, but make sure
                                                            while (!reader.isEndElement())
                                                                reader.next();
                                                            // Step out of this element
                                                            reader.next();
                                                            // Step to next element event.
                                                            while (!reader.isStartElement() && !reader.isEndElement())
                                                                reader.next();
                                                            if (reader.isEndElement()){
                                                                //two continuous end elements means we are exiting the xml structure
                                                                loopDone37 = true;
                                                            } else {
                                                                if (new javax.xml.namespace.QName("http://rdbservice.pccth.com/","incomeTypeInfo").equals(reader.getName())){
                                                                    
                                                                      nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                                                      if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                                                          list37.add(null);
                                                                          reader.next();
                                                                      } else {
                                                                    list37.add(com.pccth.rdbservice.IncomeTypeInfo.Factory.parse(reader));
                                                                        }
                                                                }else{
                                                                    loopDone37 = true;
                                                                }
                                                            }
                                                        }
                                                        // call the converter utility  to convert and set the array
                                                        
                                                        object.setIncomeTypeInfo((com.pccth.rdbservice.IncomeTypeInfo[])
                                                            org.apache.axis2.databinding.utils.ConverterUtil.convertToArray(
                                                                com.pccth.rdbservice.IncomeTypeInfo.class,
                                                                list37));
                                                            
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://rdbservice.pccth.com/","dueDatePs0112Info").equals(reader.getName())){
                                
                                    
                                    
                                    // Process the array and step past its final element's end.
                                    
                                                          nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                                          if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                                              list38.add(null);
                                                              reader.next();
                                                          } else {
                                                        list38.add(com.pccth.rdbservice.DueDatePs0112Info.Factory.parse(reader));
                                                                }
                                                        //loop until we find a start element that is not part of this array
                                                        boolean loopDone38 = false;
                                                        while(!loopDone38){
                                                            // We should be at the end element, but make sure
                                                            while (!reader.isEndElement())
                                                                reader.next();
                                                            // Step out of this element
                                                            reader.next();
                                                            // Step to next element event.
                                                            while (!reader.isStartElement() && !reader.isEndElement())
                                                                reader.next();
                                                            if (reader.isEndElement()){
                                                                //two continuous end elements means we are exiting the xml structure
                                                                loopDone38 = true;
                                                            } else {
                                                                if (new javax.xml.namespace.QName("http://rdbservice.pccth.com/","dueDatePs0112Info").equals(reader.getName())){
                                                                    
                                                                      nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                                                      if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                                                          list38.add(null);
                                                                          reader.next();
                                                                      } else {
                                                                    list38.add(com.pccth.rdbservice.DueDatePs0112Info.Factory.parse(reader));
                                                                        }
                                                                }else{
                                                                    loopDone38 = true;
                                                                }
                                                            }
                                                        }
                                                        // call the converter utility  to convert and set the array
                                                        
                                                        object.setDueDatePs0112Info((com.pccth.rdbservice.DueDatePs0112Info[])
                                                            org.apache.axis2.databinding.utils.ConverterUtil.convertToArray(
                                                                com.pccth.rdbservice.DueDatePs0112Info.class,
                                                                list38));
                                                            
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://rdbservice.pccth.com/","licenseDtInfo").equals(reader.getName())){
                                
                                    
                                    
                                    // Process the array and step past its final element's end.
                                    
                                                          nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                                          if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                                              list39.add(null);
                                                              reader.next();
                                                          } else {
                                                        list39.add(com.pccth.rdbservice.LicenseDtInfo.Factory.parse(reader));
                                                                }
                                                        //loop until we find a start element that is not part of this array
                                                        boolean loopDone39 = false;
                                                        while(!loopDone39){
                                                            // We should be at the end element, but make sure
                                                            while (!reader.isEndElement())
                                                                reader.next();
                                                            // Step out of this element
                                                            reader.next();
                                                            // Step to next element event.
                                                            while (!reader.isStartElement() && !reader.isEndElement())
                                                                reader.next();
                                                            if (reader.isEndElement()){
                                                                //two continuous end elements means we are exiting the xml structure
                                                                loopDone39 = true;
                                                            } else {
                                                                if (new javax.xml.namespace.QName("http://rdbservice.pccth.com/","licenseDtInfo").equals(reader.getName())){
                                                                    
                                                                      nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                                                      if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                                                          list39.add(null);
                                                                          reader.next();
                                                                      } else {
                                                                    list39.add(com.pccth.rdbservice.LicenseDtInfo.Factory.parse(reader));
                                                                        }
                                                                }else{
                                                                    loopDone39 = true;
                                                                }
                                                            }
                                                        }
                                                        // call the converter utility  to convert and set the array
                                                        
                                                        object.setLicenseDtInfo((com.pccth.rdbservice.LicenseDtInfo[])
                                                            org.apache.axis2.databinding.utils.ConverterUtil.convertToArray(
                                                                com.pccth.rdbservice.LicenseDtInfo.class,
                                                                list39));
                                                            
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://rdbservice.pccth.com/","holidayInfo").equals(reader.getName())){
                                
                                    
                                    
                                    // Process the array and step past its final element's end.
                                    
                                                          nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                                          if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                                              list40.add(null);
                                                              reader.next();
                                                          } else {
                                                        list40.add(com.pccth.rdbservice.HolidayInfo.Factory.parse(reader));
                                                                }
                                                        //loop until we find a start element that is not part of this array
                                                        boolean loopDone40 = false;
                                                        while(!loopDone40){
                                                            // We should be at the end element, but make sure
                                                            while (!reader.isEndElement())
                                                                reader.next();
                                                            // Step out of this element
                                                            reader.next();
                                                            // Step to next element event.
                                                            while (!reader.isStartElement() && !reader.isEndElement())
                                                                reader.next();
                                                            if (reader.isEndElement()){
                                                                //two continuous end elements means we are exiting the xml structure
                                                                loopDone40 = true;
                                                            } else {
                                                                if (new javax.xml.namespace.QName("http://rdbservice.pccth.com/","holidayInfo").equals(reader.getName())){
                                                                    
                                                                      nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                                                      if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                                                          list40.add(null);
                                                                          reader.next();
                                                                      } else {
                                                                    list40.add(com.pccth.rdbservice.HolidayInfo.Factory.parse(reader));
                                                                        }
                                                                }else{
                                                                    loopDone40 = true;
                                                                }
                                                            }
                                                        }
                                                        // call the converter utility  to convert and set the array
                                                        
                                                        object.setHolidayInfo((com.pccth.rdbservice.HolidayInfo[])
                                                            org.apache.axis2.databinding.utils.ConverterUtil.convertToArray(
                                                                com.pccth.rdbservice.HolidayInfo.class,
                                                                list40));
                                                            
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://rdbservice.pccth.com/","systemParamInfo").equals(reader.getName())){
                                
                                    
                                    
                                    // Process the array and step past its final element's end.
                                    
                                                          nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                                          if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                                              list41.add(null);
                                                              reader.next();
                                                          } else {
                                                        list41.add(com.pccth.rdbservice.SystemParamInfo.Factory.parse(reader));
                                                                }
                                                        //loop until we find a start element that is not part of this array
                                                        boolean loopDone41 = false;
                                                        while(!loopDone41){
                                                            // We should be at the end element, but make sure
                                                            while (!reader.isEndElement())
                                                                reader.next();
                                                            // Step out of this element
                                                            reader.next();
                                                            // Step to next element event.
                                                            while (!reader.isStartElement() && !reader.isEndElement())
                                                                reader.next();
                                                            if (reader.isEndElement()){
                                                                //two continuous end elements means we are exiting the xml structure
                                                                loopDone41 = true;
                                                            } else {
                                                                if (new javax.xml.namespace.QName("http://rdbservice.pccth.com/","systemParamInfo").equals(reader.getName())){
                                                                    
                                                                      nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                                                      if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                                                          list41.add(null);
                                                                          reader.next();
                                                                      } else {
                                                                    list41.add(com.pccth.rdbservice.SystemParamInfo.Factory.parse(reader));
                                                                        }
                                                                }else{
                                                                    loopDone41 = true;
                                                                }
                                                            }
                                                        }
                                                        // call the converter utility  to convert and set the array
                                                        
                                                        object.setSystemParamInfo((com.pccth.rdbservice.SystemParamInfo[])
                                                            org.apache.axis2.databinding.utils.ConverterUtil.convertToArray(
                                                                com.pccth.rdbservice.SystemParamInfo.class,
                                                                list41));
                                                            
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://rdbservice.pccth.com/","bankBranchInfo").equals(reader.getName())){
                                
                                    
                                    
                                    // Process the array and step past its final element's end.
                                    
                                                          nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                                          if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                                              list42.add(null);
                                                              reader.next();
                                                          } else {
                                                        list42.add(com.pccth.rdbservice.BankBranchInfo.Factory.parse(reader));
                                                                }
                                                        //loop until we find a start element that is not part of this array
                                                        boolean loopDone42 = false;
                                                        while(!loopDone42){
                                                            // We should be at the end element, but make sure
                                                            while (!reader.isEndElement())
                                                                reader.next();
                                                            // Step out of this element
                                                            reader.next();
                                                            // Step to next element event.
                                                            while (!reader.isStartElement() && !reader.isEndElement())
                                                                reader.next();
                                                            if (reader.isEndElement()){
                                                                //two continuous end elements means we are exiting the xml structure
                                                                loopDone42 = true;
                                                            } else {
                                                                if (new javax.xml.namespace.QName("http://rdbservice.pccth.com/","bankBranchInfo").equals(reader.getName())){
                                                                    
                                                                      nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                                                      if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                                                          list42.add(null);
                                                                          reader.next();
                                                                      } else {
                                                                    list42.add(com.pccth.rdbservice.BankBranchInfo.Factory.parse(reader));
                                                                        }
                                                                }else{
                                                                    loopDone42 = true;
                                                                }
                                                            }
                                                        }
                                                        // call the converter utility  to convert and set the array
                                                        
                                                        object.setBankBranchInfo((com.pccth.rdbservice.BankBranchInfo[])
                                                            org.apache.axis2.databinding.utils.ConverterUtil.convertToArray(
                                                                com.pccth.rdbservice.BankBranchInfo.class,
                                                                list42));
                                                            
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://rdbservice.pccth.com/","dutyTableInfo").equals(reader.getName())){
                                
                                    
                                    
                                    // Process the array and step past its final element's end.
                                    
                                                          nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                                          if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                                              list43.add(null);
                                                              reader.next();
                                                          } else {
                                                        list43.add(com.pccth.rdbservice.DutyTableInfo.Factory.parse(reader));
                                                                }
                                                        //loop until we find a start element that is not part of this array
                                                        boolean loopDone43 = false;
                                                        while(!loopDone43){
                                                            // We should be at the end element, but make sure
                                                            while (!reader.isEndElement())
                                                                reader.next();
                                                            // Step out of this element
                                                            reader.next();
                                                            // Step to next element event.
                                                            while (!reader.isStartElement() && !reader.isEndElement())
                                                                reader.next();
                                                            if (reader.isEndElement()){
                                                                //two continuous end elements means we are exiting the xml structure
                                                                loopDone43 = true;
                                                            } else {
                                                                if (new javax.xml.namespace.QName("http://rdbservice.pccth.com/","dutyTableInfo").equals(reader.getName())){
                                                                    
                                                                      nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                                                      if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                                                          list43.add(null);
                                                                          reader.next();
                                                                      } else {
                                                                    list43.add(com.pccth.rdbservice.DutyTableInfo.Factory.parse(reader));
                                                                        }
                                                                }else{
                                                                    loopDone43 = true;
                                                                }
                                                            }
                                                        }
                                                        // call the converter utility  to convert and set the array
                                                        
                                                        object.setDutyTableInfo((com.pccth.rdbservice.DutyTableInfo[])
                                                            org.apache.axis2.databinding.utils.ConverterUtil.convertToArray(
                                                                com.pccth.rdbservice.DutyTableInfo.class,
                                                                list43));
                                                            
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://rdbservice.pccth.com/","returnCode").equals(reader.getName())){
                                
                                       nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                       if (!"true".equals(nillableValue) && !"1".equals(nillableValue)){
                                    

                                    java.lang.String content = reader.getElementText();
                                    
                                              object.setReturnCode(
                                                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(content));
                                            
                                       } else {
                                           
                                           
                                           reader.getElementText(); // throw away text nodes if any.
                                       }
                                      
                                        reader.next();
                                    
                              }  // End of if for expected property start element
                                
                                else{
                                    // A start element we are not expecting indicates an invalid parameter was passed
                                    throw new org.apache.axis2.databinding.ADBException("Unexpected subelement " + reader.getName());
                                }
                            
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://rdbservice.pccth.com/","storeInfo").equals(reader.getName())){
                                
                                    
                                    
                                    // Process the array and step past its final element's end.
                                    
                                                          nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                                          if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                                              list45.add(null);
                                                              reader.next();
                                                          } else {
                                                        list45.add(com.pccth.rdbservice.StoreInfo.Factory.parse(reader));
                                                                }
                                                        //loop until we find a start element that is not part of this array
                                                        boolean loopDone45 = false;
                                                        while(!loopDone45){
                                                            // We should be at the end element, but make sure
                                                            while (!reader.isEndElement())
                                                                reader.next();
                                                            // Step out of this element
                                                            reader.next();
                                                            // Step to next element event.
                                                            while (!reader.isStartElement() && !reader.isEndElement())
                                                                reader.next();
                                                            if (reader.isEndElement()){
                                                                //two continuous end elements means we are exiting the xml structure
                                                                loopDone45 = true;
                                                            } else {
                                                                if (new javax.xml.namespace.QName("http://rdbservice.pccth.com/","storeInfo").equals(reader.getName())){
                                                                    
                                                                      nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                                                      if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                                                          list45.add(null);
                                                                          reader.next();
                                                                      } else {
                                                                    list45.add(com.pccth.rdbservice.StoreInfo.Factory.parse(reader));
                                                                        }
                                                                }else{
                                                                    loopDone45 = true;
                                                                }
                                                            }
                                                        }
                                                        // call the converter utility  to convert and set the array
                                                        
                                                        object.setStoreInfo((com.pccth.rdbservice.StoreInfo[])
                                                            org.apache.axis2.databinding.utils.ConverterUtil.convertToArray(
                                                                com.pccth.rdbservice.StoreInfo.class,
                                                                list45));
                                                            
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://rdbservice.pccth.com/","tambolInfo").equals(reader.getName())){
                                
                                    
                                    
                                    // Process the array and step past its final element's end.
                                    
                                                          nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                                          if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                                              list46.add(null);
                                                              reader.next();
                                                          } else {
                                                        list46.add(com.pccth.rdbservice.TambolInfo.Factory.parse(reader));
                                                                }
                                                        //loop until we find a start element that is not part of this array
                                                        boolean loopDone46 = false;
                                                        while(!loopDone46){
                                                            // We should be at the end element, but make sure
                                                            while (!reader.isEndElement())
                                                                reader.next();
                                                            // Step out of this element
                                                            reader.next();
                                                            // Step to next element event.
                                                            while (!reader.isStartElement() && !reader.isEndElement())
                                                                reader.next();
                                                            if (reader.isEndElement()){
                                                                //two continuous end elements means we are exiting the xml structure
                                                                loopDone46 = true;
                                                            } else {
                                                                if (new javax.xml.namespace.QName("http://rdbservice.pccth.com/","tambolInfo").equals(reader.getName())){
                                                                    
                                                                      nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                                                      if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                                                          list46.add(null);
                                                                          reader.next();
                                                                      } else {
                                                                    list46.add(com.pccth.rdbservice.TambolInfo.Factory.parse(reader));
                                                                        }
                                                                }else{
                                                                    loopDone46 = true;
                                                                }
                                                            }
                                                        }
                                                        // call the converter utility  to convert and set the array
                                                        
                                                        object.setTambolInfo((com.pccth.rdbservice.TambolInfo[])
                                                            org.apache.axis2.databinding.utils.ConverterUtil.convertToArray(
                                                                com.pccth.rdbservice.TambolInfo.class,
                                                                list46));
                                                            
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://rdbservice.pccth.com/","productInfo").equals(reader.getName())){
                                
                                    
                                    
                                    // Process the array and step past its final element's end.
                                    
                                                          nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                                          if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                                              list47.add(null);
                                                              reader.next();
                                                          } else {
                                                        list47.add(com.pccth.rdbservice.ProductInfo.Factory.parse(reader));
                                                                }
                                                        //loop until we find a start element that is not part of this array
                                                        boolean loopDone47 = false;
                                                        while(!loopDone47){
                                                            // We should be at the end element, but make sure
                                                            while (!reader.isEndElement())
                                                                reader.next();
                                                            // Step out of this element
                                                            reader.next();
                                                            // Step to next element event.
                                                            while (!reader.isStartElement() && !reader.isEndElement())
                                                                reader.next();
                                                            if (reader.isEndElement()){
                                                                //two continuous end elements means we are exiting the xml structure
                                                                loopDone47 = true;
                                                            } else {
                                                                if (new javax.xml.namespace.QName("http://rdbservice.pccth.com/","productInfo").equals(reader.getName())){
                                                                    
                                                                      nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                                                      if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                                                          list47.add(null);
                                                                          reader.next();
                                                                      } else {
                                                                    list47.add(com.pccth.rdbservice.ProductInfo.Factory.parse(reader));
                                                                        }
                                                                }else{
                                                                    loopDone47 = true;
                                                                }
                                                            }
                                                        }
                                                        // call the converter utility  to convert and set the array
                                                        
                                                        object.setProductInfo((com.pccth.rdbservice.ProductInfo[])
                                                            org.apache.axis2.databinding.utils.ConverterUtil.convertToArray(
                                                                com.pccth.rdbservice.ProductInfo.class,
                                                                list47));
                                                            
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://rdbservice.pccth.com/","edOfficeInfo").equals(reader.getName())){
                                
                                    
                                    
                                    // Process the array and step past its final element's end.
                                    
                                                          nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                                          if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                                              list48.add(null);
                                                              reader.next();
                                                          } else {
                                                        list48.add(com.pccth.rdbservice.EdOfficeInfo.Factory.parse(reader));
                                                                }
                                                        //loop until we find a start element that is not part of this array
                                                        boolean loopDone48 = false;
                                                        while(!loopDone48){
                                                            // We should be at the end element, but make sure
                                                            while (!reader.isEndElement())
                                                                reader.next();
                                                            // Step out of this element
                                                            reader.next();
                                                            // Step to next element event.
                                                            while (!reader.isStartElement() && !reader.isEndElement())
                                                                reader.next();
                                                            if (reader.isEndElement()){
                                                                //two continuous end elements means we are exiting the xml structure
                                                                loopDone48 = true;
                                                            } else {
                                                                if (new javax.xml.namespace.QName("http://rdbservice.pccth.com/","edOfficeInfo").equals(reader.getName())){
                                                                    
                                                                      nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                                                      if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                                                          list48.add(null);
                                                                          reader.next();
                                                                      } else {
                                                                    list48.add(com.pccth.rdbservice.EdOfficeInfo.Factory.parse(reader));
                                                                        }
                                                                }else{
                                                                    loopDone48 = true;
                                                                }
                                                            }
                                                        }
                                                        // call the converter utility  to convert and set the array
                                                        
                                                        object.setEdOfficeInfo((com.pccth.rdbservice.EdOfficeInfo[])
                                                            org.apache.axis2.databinding.utils.ConverterUtil.convertToArray(
                                                                com.pccth.rdbservice.EdOfficeInfo.class,
                                                                list48));
                                                            
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://rdbservice.pccth.com/","vatSplitHdInfo").equals(reader.getName())){
                                
                                    
                                    
                                    // Process the array and step past its final element's end.
                                    
                                                          nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                                          if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                                              list49.add(null);
                                                              reader.next();
                                                          } else {
                                                        list49.add(com.pccth.rdbservice.VatSplitHdInfo.Factory.parse(reader));
                                                                }
                                                        //loop until we find a start element that is not part of this array
                                                        boolean loopDone49 = false;
                                                        while(!loopDone49){
                                                            // We should be at the end element, but make sure
                                                            while (!reader.isEndElement())
                                                                reader.next();
                                                            // Step out of this element
                                                            reader.next();
                                                            // Step to next element event.
                                                            while (!reader.isStartElement() && !reader.isEndElement())
                                                                reader.next();
                                                            if (reader.isEndElement()){
                                                                //two continuous end elements means we are exiting the xml structure
                                                                loopDone49 = true;
                                                            } else {
                                                                if (new javax.xml.namespace.QName("http://rdbservice.pccth.com/","vatSplitHdInfo").equals(reader.getName())){
                                                                    
                                                                      nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                                                      if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                                                          list49.add(null);
                                                                          reader.next();
                                                                      } else {
                                                                    list49.add(com.pccth.rdbservice.VatSplitHdInfo.Factory.parse(reader));
                                                                        }
                                                                }else{
                                                                    loopDone49 = true;
                                                                }
                                                            }
                                                        }
                                                        // call the converter utility  to convert and set the array
                                                        
                                                        object.setVatSplitHdInfo((com.pccth.rdbservice.VatSplitHdInfo[])
                                                            org.apache.axis2.databinding.utils.ConverterUtil.convertToArray(
                                                                com.pccth.rdbservice.VatSplitHdInfo.class,
                                                                list49));
                                                            
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://rdbservice.pccth.com/","oilfundRateInfo").equals(reader.getName())){
                                
                                    
                                    
                                    // Process the array and step past its final element's end.
                                    
                                                          nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                                          if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                                              list50.add(null);
                                                              reader.next();
                                                          } else {
                                                        list50.add(com.pccth.rdbservice.OilfundRateInfo.Factory.parse(reader));
                                                                }
                                                        //loop until we find a start element that is not part of this array
                                                        boolean loopDone50 = false;
                                                        while(!loopDone50){
                                                            // We should be at the end element, but make sure
                                                            while (!reader.isEndElement())
                                                                reader.next();
                                                            // Step out of this element
                                                            reader.next();
                                                            // Step to next element event.
                                                            while (!reader.isStartElement() && !reader.isEndElement())
                                                                reader.next();
                                                            if (reader.isEndElement()){
                                                                //two continuous end elements means we are exiting the xml structure
                                                                loopDone50 = true;
                                                            } else {
                                                                if (new javax.xml.namespace.QName("http://rdbservice.pccth.com/","oilfundRateInfo").equals(reader.getName())){
                                                                    
                                                                      nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                                                      if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                                                          list50.add(null);
                                                                          reader.next();
                                                                      } else {
                                                                    list50.add(com.pccth.rdbservice.OilfundRateInfo.Factory.parse(reader));
                                                                        }
                                                                }else{
                                                                    loopDone50 = true;
                                                                }
                                                            }
                                                        }
                                                        // call the converter utility  to convert and set the array
                                                        
                                                        object.setOilfundRateInfo((com.pccth.rdbservice.OilfundRateInfo[])
                                                            org.apache.axis2.databinding.utils.ConverterUtil.convertToArray(
                                                                com.pccth.rdbservice.OilfundRateInfo.class,
                                                                list50));
                                                            
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://rdbservice.pccth.com/","productTypeInfo").equals(reader.getName())){
                                
                                    
                                    
                                    // Process the array and step past its final element's end.
                                    
                                                          nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                                          if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                                              list51.add(null);
                                                              reader.next();
                                                          } else {
                                                        list51.add(com.pccth.rdbservice.ProductTypeInfo.Factory.parse(reader));
                                                                }
                                                        //loop until we find a start element that is not part of this array
                                                        boolean loopDone51 = false;
                                                        while(!loopDone51){
                                                            // We should be at the end element, but make sure
                                                            while (!reader.isEndElement())
                                                                reader.next();
                                                            // Step out of this element
                                                            reader.next();
                                                            // Step to next element event.
                                                            while (!reader.isStartElement() && !reader.isEndElement())
                                                                reader.next();
                                                            if (reader.isEndElement()){
                                                                //two continuous end elements means we are exiting the xml structure
                                                                loopDone51 = true;
                                                            } else {
                                                                if (new javax.xml.namespace.QName("http://rdbservice.pccth.com/","productTypeInfo").equals(reader.getName())){
                                                                    
                                                                      nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                                                      if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                                                          list51.add(null);
                                                                          reader.next();
                                                                      } else {
                                                                    list51.add(com.pccth.rdbservice.ProductTypeInfo.Factory.parse(reader));
                                                                        }
                                                                }else{
                                                                    loopDone51 = true;
                                                                }
                                                            }
                                                        }
                                                        // call the converter utility  to convert and set the array
                                                        
                                                        object.setProductTypeInfo((com.pccth.rdbservice.ProductTypeInfo[])
                                                            org.apache.axis2.databinding.utils.ConverterUtil.convertToArray(
                                                                com.pccth.rdbservice.ProductTypeInfo.class,
                                                                list51));
                                                            
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://rdbservice.pccth.com/","bankInfo").equals(reader.getName())){
                                
                                    
                                    
                                    // Process the array and step past its final element's end.
                                    
                                                          nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                                          if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                                              list52.add(null);
                                                              reader.next();
                                                          } else {
                                                        list52.add(com.pccth.rdbservice.BankInfo.Factory.parse(reader));
                                                                }
                                                        //loop until we find a start element that is not part of this array
                                                        boolean loopDone52 = false;
                                                        while(!loopDone52){
                                                            // We should be at the end element, but make sure
                                                            while (!reader.isEndElement())
                                                                reader.next();
                                                            // Step out of this element
                                                            reader.next();
                                                            // Step to next element event.
                                                            while (!reader.isStartElement() && !reader.isEndElement())
                                                                reader.next();
                                                            if (reader.isEndElement()){
                                                                //two continuous end elements means we are exiting the xml structure
                                                                loopDone52 = true;
                                                            } else {
                                                                if (new javax.xml.namespace.QName("http://rdbservice.pccth.com/","bankInfo").equals(reader.getName())){
                                                                    
                                                                      nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                                                      if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                                                          list52.add(null);
                                                                          reader.next();
                                                                      } else {
                                                                    list52.add(com.pccth.rdbservice.BankInfo.Factory.parse(reader));
                                                                        }
                                                                }else{
                                                                    loopDone52 = true;
                                                                }
                                                            }
                                                        }
                                                        // call the converter utility  to convert and set the array
                                                        
                                                        object.setBankInfo((com.pccth.rdbservice.BankInfo[])
                                                            org.apache.axis2.databinding.utils.ConverterUtil.convertToArray(
                                                                com.pccth.rdbservice.BankInfo.class,
                                                                list52));
                                                            
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://rdbservice.pccth.com/","customRateInfo").equals(reader.getName())){
                                
                                    
                                    
                                    // Process the array and step past its final element's end.
                                    
                                                          nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                                          if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                                              list53.add(null);
                                                              reader.next();
                                                          } else {
                                                        list53.add(com.pccth.rdbservice.CustomRateInfo.Factory.parse(reader));
                                                                }
                                                        //loop until we find a start element that is not part of this array
                                                        boolean loopDone53 = false;
                                                        while(!loopDone53){
                                                            // We should be at the end element, but make sure
                                                            while (!reader.isEndElement())
                                                                reader.next();
                                                            // Step out of this element
                                                            reader.next();
                                                            // Step to next element event.
                                                            while (!reader.isStartElement() && !reader.isEndElement())
                                                                reader.next();
                                                            if (reader.isEndElement()){
                                                                //two continuous end elements means we are exiting the xml structure
                                                                loopDone53 = true;
                                                            } else {
                                                                if (new javax.xml.namespace.QName("http://rdbservice.pccth.com/","customRateInfo").equals(reader.getName())){
                                                                    
                                                                      nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                                                      if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                                                          list53.add(null);
                                                                          reader.next();
                                                                      } else {
                                                                    list53.add(com.pccth.rdbservice.CustomRateInfo.Factory.parse(reader));
                                                                        }
                                                                }else{
                                                                    loopDone53 = true;
                                                                }
                                                            }
                                                        }
                                                        // call the converter utility  to convert and set the array
                                                        
                                                        object.setCustomRateInfo((com.pccth.rdbservice.CustomRateInfo[])
                                                            org.apache.axis2.databinding.utils.ConverterUtil.convertToArray(
                                                                com.pccth.rdbservice.CustomRateInfo.class,
                                                                list53));
                                                            
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://rdbservice.pccth.com/","ediUnitMapInfo").equals(reader.getName())){
                                
                                    
                                    
                                    // Process the array and step past its final element's end.
                                    
                                                          nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                                          if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                                              list54.add(null);
                                                              reader.next();
                                                          } else {
                                                        list54.add(com.pccth.rdbservice.EdiUnitMapInfo.Factory.parse(reader));
                                                                }
                                                        //loop until we find a start element that is not part of this array
                                                        boolean loopDone54 = false;
                                                        while(!loopDone54){
                                                            // We should be at the end element, but make sure
                                                            while (!reader.isEndElement())
                                                                reader.next();
                                                            // Step out of this element
                                                            reader.next();
                                                            // Step to next element event.
                                                            while (!reader.isStartElement() && !reader.isEndElement())
                                                                reader.next();
                                                            if (reader.isEndElement()){
                                                                //two continuous end elements means we are exiting the xml structure
                                                                loopDone54 = true;
                                                            } else {
                                                                if (new javax.xml.namespace.QName("http://rdbservice.pccth.com/","ediUnitMapInfo").equals(reader.getName())){
                                                                    
                                                                      nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                                                      if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                                                          list54.add(null);
                                                                          reader.next();
                                                                      } else {
                                                                    list54.add(com.pccth.rdbservice.EdiUnitMapInfo.Factory.parse(reader));
                                                                        }
                                                                }else{
                                                                    loopDone54 = true;
                                                                }
                                                            }
                                                        }
                                                        // call the converter utility  to convert and set the array
                                                        
                                                        object.setEdiUnitMapInfo((com.pccth.rdbservice.EdiUnitMapInfo[])
                                                            org.apache.axis2.databinding.utils.ConverterUtil.convertToArray(
                                                                com.pccth.rdbservice.EdiUnitMapInfo.class,
                                                                list54));
                                                            
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                
                                    
                                    while (!reader.isStartElement() && !reader.isEndElement()) reader.next();
                                
                                    if (reader.isStartElement() && new javax.xml.namespace.QName("http://rdbservice.pccth.com/","vatSplitDetInfo").equals(reader.getName())){
                                
                                    
                                    
                                    // Process the array and step past its final element's end.
                                    
                                                          nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                                          if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                                              list55.add(null);
                                                              reader.next();
                                                          } else {
                                                        list55.add(com.pccth.rdbservice.VatSplitDetInfo.Factory.parse(reader));
                                                                }
                                                        //loop until we find a start element that is not part of this array
                                                        boolean loopDone55 = false;
                                                        while(!loopDone55){
                                                            // We should be at the end element, but make sure
                                                            while (!reader.isEndElement())
                                                                reader.next();
                                                            // Step out of this element
                                                            reader.next();
                                                            // Step to next element event.
                                                            while (!reader.isStartElement() && !reader.isEndElement())
                                                                reader.next();
                                                            if (reader.isEndElement()){
                                                                //two continuous end elements means we are exiting the xml structure
                                                                loopDone55 = true;
                                                            } else {
                                                                if (new javax.xml.namespace.QName("http://rdbservice.pccth.com/","vatSplitDetInfo").equals(reader.getName())){
                                                                    
                                                                      nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance","nil");
                                                                      if ("true".equals(nillableValue) || "1".equals(nillableValue)){
                                                                          list55.add(null);
                                                                          reader.next();
                                                                      } else {
                                                                    list55.add(com.pccth.rdbservice.VatSplitDetInfo.Factory.parse(reader));
                                                                        }
                                                                }else{
                                                                    loopDone55 = true;
                                                                }
                                                            }
                                                        }
                                                        // call the converter utility  to convert and set the array
                                                        
                                                        object.setVatSplitDetInfo((com.pccth.rdbservice.VatSplitDetInfo[])
                                                            org.apache.axis2.databinding.utils.ConverterUtil.convertToArray(
                                                                com.pccth.rdbservice.VatSplitDetInfo.class,
                                                                list55));
                                                            
                              }  // End of if for expected property start element
                                
                                    else {
                                        
                                    }
                                  
                            while (!reader.isStartElement() && !reader.isEndElement())
                                reader.next();
                            
                                if (reader.isStartElement())
                                // A start element we are not expecting indicates a trailing invalid property
                                throw new org.apache.axis2.databinding.ADBException("Unexpected subelement " + reader.getName());
                            



            } catch (javax.xml.stream.XMLStreamException e) {
                throw new java.lang.Exception(e);
            }

            return object;
        }

        }//end of factory class

        

        }
           
    