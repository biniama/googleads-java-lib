
package com.google.api.ads.dfp.jaxws.v201605;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ReconciliationReportStatus.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ReconciliationReportStatus">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="DRAFT"/>
 *     &lt;enumeration value="RECONCILED"/>
 *     &lt;enumeration value="REVERTED"/>
 *     &lt;enumeration value="PENDING"/>
 *     &lt;enumeration value="UNKNOWN"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "ReconciliationReportStatus")
@XmlEnum
public enum ReconciliationReportStatus {


    /**
     * 
     *                 The starting status of a reconciliation report.
     *                 Reconciliation reports are updatable in the {@code DRAFT} state.
     *               
     * 
     */
    DRAFT,

    /**
     * 
     *                 The final status of a reconciliation report.
     *                 Reconciliation reports are not updatable in the {@code RECONCILED} state.
     *               
     * 
     */
    RECONCILED,

    /**
     * 
     *                 A similar status as {@code DRAFT}.
     *                 Reconciliation reports are updatable in the {@code REVERTED} state.
     *               
     * 
     */
    REVERTED,

    /**
     * 
     *                 It indicates that the reconciliation report is not ready for various of reasons. Reconciliation
     *                 reports in the {@code PENDING} state can't be viewed in the DoubleClick for Publisher UI.
     *               
     * 
     */
    PENDING,

    /**
     * 
     *                 The value returned if the actual value is not exposed by the requested API version.
     *               
     * 
     */
    UNKNOWN;

    public String value() {
        return name();
    }

    public static ReconciliationReportStatus fromValue(String v) {
        return valueOf(v);
    }

}
