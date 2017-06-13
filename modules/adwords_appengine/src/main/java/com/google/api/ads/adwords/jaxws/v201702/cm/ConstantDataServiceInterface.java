// Copyright 2017 Google Inc. All Rights Reserved.
//
// Licensed under the Apache License, Version 2.0 (the "License");
// you may not use this file except in compliance with the License.
// You may obtain a copy of the License at
//
// http://www.apache.org/licenses/LICENSE-2.0
//
// Unless required by applicable law or agreed to in writing, software
// distributed under the License is distributed on an "AS IS" BASIS,
// WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
// See the License for the specific language governing permissions and
// limitations under the License.


package com.google.api.ads.adwords.jaxws.v201702.cm;

import java.util.List;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;


/**
 * 
 *       A service to return constant data.
 *     
 * 
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.9-b130926.1035
 * Generated source version: 2.1
 * 
 */
@WebService(name = "ConstantDataServiceInterface", targetNamespace = "https://adwords.google.com/api/adwords/cm/v201702")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface ConstantDataServiceInterface {


    /**
     * 
     *         Returns a list of all age range criteria.
     *         
     *         @return A list of age ranges.
     *         @throws ApiException when there is at least one error with the request.
     *       
     * 
     * @return
     *     returns java.util.List<com.google.api.ads.adwords.jaxws.v201702.cm.AgeRange>
     * @throws ApiException_Exception
     */
    @WebMethod
    @WebResult(name = "rval", targetNamespace = "https://adwords.google.com/api/adwords/cm/v201702")
    @RequestWrapper(localName = "getAgeRangeCriterion", targetNamespace = "https://adwords.google.com/api/adwords/cm/v201702", className = "com.google.api.ads.adwords.jaxws.v201702.cm.ConstantDataServiceInterfacegetAgeRangeCriterion")
    @ResponseWrapper(localName = "getAgeRangeCriterionResponse", targetNamespace = "https://adwords.google.com/api/adwords/cm/v201702", className = "com.google.api.ads.adwords.jaxws.v201702.cm.ConstantDataServiceInterfacegetAgeRangeCriterionResponse")
    public List<AgeRange> getAgeRangeCriterion()
        throws ApiException_Exception
    ;

    /**
     * 
     *         Returns a list of all carrier criteria.
     *         
     *         @return A list of carriers.
     *         @throws ApiException when there is at least one error with the request.
     *       
     * 
     * @return
     *     returns java.util.List<com.google.api.ads.adwords.jaxws.v201702.cm.Carrier>
     * @throws ApiException_Exception
     */
    @WebMethod
    @WebResult(name = "rval", targetNamespace = "https://adwords.google.com/api/adwords/cm/v201702")
    @RequestWrapper(localName = "getCarrierCriterion", targetNamespace = "https://adwords.google.com/api/adwords/cm/v201702", className = "com.google.api.ads.adwords.jaxws.v201702.cm.ConstantDataServiceInterfacegetCarrierCriterion")
    @ResponseWrapper(localName = "getCarrierCriterionResponse", targetNamespace = "https://adwords.google.com/api/adwords/cm/v201702", className = "com.google.api.ads.adwords.jaxws.v201702.cm.ConstantDataServiceInterfacegetCarrierCriterionResponse")
    public List<Carrier> getCarrierCriterion()
        throws ApiException_Exception
    ;

    /**
     * 
     *         Returns a list of all gender criteria.
     *         
     *         @return A list of genders.
     *         @throws ApiException when there is at least one error with the request.
     *       
     * 
     * @return
     *     returns java.util.List<com.google.api.ads.adwords.jaxws.v201702.cm.Gender>
     * @throws ApiException_Exception
     */
    @WebMethod
    @WebResult(name = "rval", targetNamespace = "https://adwords.google.com/api/adwords/cm/v201702")
    @RequestWrapper(localName = "getGenderCriterion", targetNamespace = "https://adwords.google.com/api/adwords/cm/v201702", className = "com.google.api.ads.adwords.jaxws.v201702.cm.ConstantDataServiceInterfacegetGenderCriterion")
    @ResponseWrapper(localName = "getGenderCriterionResponse", targetNamespace = "https://adwords.google.com/api/adwords/cm/v201702", className = "com.google.api.ads.adwords.jaxws.v201702.cm.ConstantDataServiceInterfacegetGenderCriterionResponse")
    public List<Gender> getGenderCriterion()
        throws ApiException_Exception
    ;

    /**
     * 
     *         Returns a list of all language criteria.
     *         
     *         @return A list of languages.
     *         @throws ApiException when there is at least one error with the request.
     *       
     * 
     * @return
     *     returns java.util.List<com.google.api.ads.adwords.jaxws.v201702.cm.Language>
     * @throws ApiException_Exception
     */
    @WebMethod
    @WebResult(name = "rval", targetNamespace = "https://adwords.google.com/api/adwords/cm/v201702")
    @RequestWrapper(localName = "getLanguageCriterion", targetNamespace = "https://adwords.google.com/api/adwords/cm/v201702", className = "com.google.api.ads.adwords.jaxws.v201702.cm.ConstantDataServiceInterfacegetLanguageCriterion")
    @ResponseWrapper(localName = "getLanguageCriterionResponse", targetNamespace = "https://adwords.google.com/api/adwords/cm/v201702", className = "com.google.api.ads.adwords.jaxws.v201702.cm.ConstantDataServiceInterfacegetLanguageCriterionResponse")
    public List<Language> getLanguageCriterion()
        throws ApiException_Exception
    ;

    /**
     * 
     *         Returns a list of all mobile app category criteria.
     *         
     *         @return A list of mobile app categories.
     *         @throws ApiException when there is at least one error with the request.
     *       
     * 
     * @return
     *     returns java.util.List<com.google.api.ads.adwords.jaxws.v201702.cm.MobileAppCategory>
     * @throws ApiException_Exception
     */
    @WebMethod
    @WebResult(name = "rval", targetNamespace = "https://adwords.google.com/api/adwords/cm/v201702")
    @RequestWrapper(localName = "getMobileAppCategoryCriterion", targetNamespace = "https://adwords.google.com/api/adwords/cm/v201702", className = "com.google.api.ads.adwords.jaxws.v201702.cm.ConstantDataServiceInterfacegetMobileAppCategoryCriterion")
    @ResponseWrapper(localName = "getMobileAppCategoryCriterionResponse", targetNamespace = "https://adwords.google.com/api/adwords/cm/v201702", className = "com.google.api.ads.adwords.jaxws.v201702.cm.ConstantDataServiceInterfacegetMobileAppCategoryCriterionResponse")
    public List<MobileAppCategory> getMobileAppCategoryCriterion()
        throws ApiException_Exception
    ;

    /**
     * 
     *         Returns a list of all mobile devices.
     *         
     *         @return A list of mobile devices.
     *         @throws ApiException when there is at least one error with the request.
     *       
     * 
     * @return
     *     returns java.util.List<com.google.api.ads.adwords.jaxws.v201702.cm.MobileDevice>
     * @throws ApiException_Exception
     */
    @WebMethod
    @WebResult(name = "rval", targetNamespace = "https://adwords.google.com/api/adwords/cm/v201702")
    @RequestWrapper(localName = "getMobileDeviceCriterion", targetNamespace = "https://adwords.google.com/api/adwords/cm/v201702", className = "com.google.api.ads.adwords.jaxws.v201702.cm.ConstantDataServiceInterfacegetMobileDeviceCriterion")
    @ResponseWrapper(localName = "getMobileDeviceCriterionResponse", targetNamespace = "https://adwords.google.com/api/adwords/cm/v201702", className = "com.google.api.ads.adwords.jaxws.v201702.cm.ConstantDataServiceInterfacegetMobileDeviceCriterionResponse")
    public List<MobileDevice> getMobileDeviceCriterion()
        throws ApiException_Exception
    ;

    /**
     * 
     *         Returns a list of all operating system version criteria.
     *         
     *         @return A list of operating system versions.
     *         @throws ApiException when there is at least one error with the request.
     *       
     * 
     * @return
     *     returns java.util.List<com.google.api.ads.adwords.jaxws.v201702.cm.OperatingSystemVersion>
     * @throws ApiException_Exception
     */
    @WebMethod
    @WebResult(name = "rval", targetNamespace = "https://adwords.google.com/api/adwords/cm/v201702")
    @RequestWrapper(localName = "getOperatingSystemVersionCriterion", targetNamespace = "https://adwords.google.com/api/adwords/cm/v201702", className = "com.google.api.ads.adwords.jaxws.v201702.cm.ConstantDataServiceInterfacegetOperatingSystemVersionCriterion")
    @ResponseWrapper(localName = "getOperatingSystemVersionCriterionResponse", targetNamespace = "https://adwords.google.com/api/adwords/cm/v201702", className = "com.google.api.ads.adwords.jaxws.v201702.cm.ConstantDataServiceInterfacegetOperatingSystemVersionCriterionResponse")
    public List<OperatingSystemVersion> getOperatingSystemVersionCriterion()
        throws ApiException_Exception
    ;

    /**
     * 
     *         Returns a list of shopping bidding categories.
     *         
     *         A country predicate must be included in the selector, only {@link Predicate.Operator#EQUALS}
     *         and {@link Predicate.Operator#IN} with a single value are supported in the country predicate.
     *         An empty parentDimensionType predicate will filter for root categories.
     *         
     *         @return A list of shopping bidding categories.
     *         @throws ApiException when there is at least one error with the request.
     *       
     * 
     * @param selector
     * @return
     *     returns java.util.List<com.google.api.ads.adwords.jaxws.v201702.cm.ProductBiddingCategoryData>
     * @throws ApiException_Exception
     */
    @WebMethod
    @WebResult(name = "rval", targetNamespace = "https://adwords.google.com/api/adwords/cm/v201702")
    @RequestWrapper(localName = "getProductBiddingCategoryData", targetNamespace = "https://adwords.google.com/api/adwords/cm/v201702", className = "com.google.api.ads.adwords.jaxws.v201702.cm.ConstantDataServiceInterfacegetProductBiddingCategoryData")
    @ResponseWrapper(localName = "getProductBiddingCategoryDataResponse", targetNamespace = "https://adwords.google.com/api/adwords/cm/v201702", className = "com.google.api.ads.adwords.jaxws.v201702.cm.ConstantDataServiceInterfacegetProductBiddingCategoryDataResponse")
    public List<ProductBiddingCategoryData> getProductBiddingCategoryData(
        @WebParam(name = "selector", targetNamespace = "https://adwords.google.com/api/adwords/cm/v201702")
        Selector selector)
        throws ApiException_Exception
    ;

    /**
     * 
     *         Returns a list of user interests.
     *         
     *         @param userInterestTaxonomyType The type of taxonomy to use when requesting user interests.
     *         @return A list of user interests.
     *         @throws ApiException when there is at least one error with the request.
     *       
     * 
     * @param userInterestTaxonomyType
     * @return
     *     returns java.util.List<com.google.api.ads.adwords.jaxws.v201702.cm.CriterionUserInterest>
     * @throws ApiException_Exception
     */
    @WebMethod
    @WebResult(name = "rval", targetNamespace = "https://adwords.google.com/api/adwords/cm/v201702")
    @RequestWrapper(localName = "getUserInterestCriterion", targetNamespace = "https://adwords.google.com/api/adwords/cm/v201702", className = "com.google.api.ads.adwords.jaxws.v201702.cm.ConstantDataServiceInterfacegetUserInterestCriterion")
    @ResponseWrapper(localName = "getUserInterestCriterionResponse", targetNamespace = "https://adwords.google.com/api/adwords/cm/v201702", className = "com.google.api.ads.adwords.jaxws.v201702.cm.ConstantDataServiceInterfacegetUserInterestCriterionResponse")
    public List<CriterionUserInterest> getUserInterestCriterion(
        @WebParam(name = "userInterestTaxonomyType", targetNamespace = "https://adwords.google.com/api/adwords/cm/v201702")
        ConstantDataServiceUserInterestTaxonomyType userInterestTaxonomyType)
        throws ApiException_Exception
    ;

    /**
     * 
     *         Returns a list of content verticals.
     *         
     *         @return A list of verticals.
     *         @throws ApiException when there is at least one error with the request.
     *       
     * 
     * @return
     *     returns java.util.List<com.google.api.ads.adwords.jaxws.v201702.cm.Vertical>
     * @throws ApiException_Exception
     */
    @WebMethod
    @WebResult(name = "rval", targetNamespace = "https://adwords.google.com/api/adwords/cm/v201702")
    @RequestWrapper(localName = "getVerticalCriterion", targetNamespace = "https://adwords.google.com/api/adwords/cm/v201702", className = "com.google.api.ads.adwords.jaxws.v201702.cm.ConstantDataServiceInterfacegetVerticalCriterion")
    @ResponseWrapper(localName = "getVerticalCriterionResponse", targetNamespace = "https://adwords.google.com/api/adwords/cm/v201702", className = "com.google.api.ads.adwords.jaxws.v201702.cm.ConstantDataServiceInterfacegetVerticalCriterionResponse")
    public List<Vertical> getVerticalCriterion()
        throws ApiException_Exception
    ;

}
