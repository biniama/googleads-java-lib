// Copyright 2016 Google Inc. All Rights Reserved.
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


package com.google.api.ads.dfp.jaxws.v201605;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 *             A {@code PremiumFeature} represents the feature type to be applied as a premium on a
 *             {@link RateCard}.
 *           
 * 
 * <p>Java class for PremiumFeature complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PremiumFeature">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PremiumFeature")
@XmlSeeAlso({
    AudienceSegmentPremiumFeature.class,
    DeviceCapabilityPremiumFeature.class,
    CustomTargetingPremiumFeature.class,
    BrowserPremiumFeature.class,
    BandwidthPremiumFeature.class,
    FrequencyCapPremiumFeature.class,
    DaypartPremiumFeature.class,
    DeviceManufacturerPremiumFeature.class,
    UnknownPremiumFeature.class,
    ContentBundlePremiumFeature.class,
    PlacementPremiumFeature.class,
    VideoPositionPremiumFeature.class,
    UserDomainPremiumFeature.class,
    BrowserLanguagePremiumFeature.class,
    MobileCarrierPremiumFeature.class,
    GeographyPremiumFeature.class,
    DeviceCategoryPremiumFeature.class,
    AdUnitPremiumFeature.class,
    OperatingSystemPremiumFeature.class
})
public abstract class PremiumFeature {


}
