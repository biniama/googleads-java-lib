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


package com.google.api.ads.adwords.jaxws.v201607.mcm;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for LinkStatus.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="LinkStatus">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="ACTIVE"/>
 *     &lt;enumeration value="INACTIVE"/>
 *     &lt;enumeration value="PENDING"/>
 *     &lt;enumeration value="REFUSED"/>
 *     &lt;enumeration value="CANCELLED"/>
 *     &lt;enumeration value="UNKNOWN"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "LinkStatus")
@XmlEnum
public enum LinkStatus {


    /**
     * 
     *                 An active relationship.
     *               
     * 
     */
    ACTIVE,

    /**
     * 
     *                 A former active relationship.
     *               
     * 
     */
    INACTIVE,

    /**
     * 
     *                 An invitation that is active or has expired.
     *               
     * 
     */
    PENDING,

    /**
     * 
     *                 An invitation that was refused by the invitee.
     *               
     * 
     */
    REFUSED,

    /**
     * 
     *                 An invitation that was cancelled by the invitor.
     *               
     * 
     */
    CANCELLED,
    UNKNOWN;

    public String value() {
        return name();
    }

    public static LinkStatus fromValue(String v) {
        return valueOf(v);
    }

}
