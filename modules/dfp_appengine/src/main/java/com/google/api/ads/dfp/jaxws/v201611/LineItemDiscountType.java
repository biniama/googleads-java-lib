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


package com.google.api.ads.dfp.jaxws.v201611;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for LineItemDiscountType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="LineItemDiscountType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="ABSOLUTE_VALUE"/>
 *     &lt;enumeration value="PERCENTAGE"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "LineItemDiscountType")
@XmlEnum
public enum LineItemDiscountType {


    /**
     * 
     *                 An absolute value will be discounted from the line item's cost.
     *               
     * 
     */
    ABSOLUTE_VALUE,

    /**
     * 
     *                 A percentage of the cost will be applied as discount for booking the line
     *                 item.
     *               
     * 
     */
    PERCENTAGE;

    public String value() {
        return name();
    }

    public static LineItemDiscountType fromValue(String v) {
        return valueOf(v);
    }

}
