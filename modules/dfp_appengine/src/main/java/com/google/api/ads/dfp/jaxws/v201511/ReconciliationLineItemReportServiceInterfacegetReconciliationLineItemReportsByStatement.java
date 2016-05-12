
package com.google.api.ads.dfp.jaxws.v201511;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 *             Gets a {@link ReconciliationLineItemReportPage} of {@link ReconciliationLineItemReport}
 *             objects that satisfy the given {@link Statement#query}.
 *             The following fields are supported for filtering:
 *             
 *             <table>
 *             <tr>
 *             <th scope="col">PQL Property</th> <th scope="col">Object Property</th>
 *             </tr>
 *             <tr>
 *             <td>{@code id}</td>
 *             <td>{@link ReconciliationLineItemReport#id}</td>
 *             </tr>
 *             <tr>
 *             <td>{@code reconciliationReportId}</td>
 *             <td>{@link ReconciliationLineItemReport#reconciliationReportId}</td>
 *             </tr>
 *             <tr>
 *             <td>{@code orderId}</td>
 *             <td>{@link ReconciliationLineItemReport#orderId}</td>
 *             </tr>
 *             <tr>
 *             <td>{@code proposalId}</td>
 *             <td>{@link ReconciliationLineItemReport#proposalId}</td>
 *             </tr>
 *             <tr>
 *             <td>{@code lineItemId}</td>
 *             <td>{@link ReconciliationLineItemReport#lineItemId}</td>
 *             </tr>
 *             <tr>
 *             <td>{@code proposalLineItemId}</td>
 *             <td>{@link ReconciliationLineItemReport#proposalLineItemId}</td>
 *             </tr>
 *             </table>
 *             
 *             @param filterStatement a Publisher Query Language statement used to filter the result
 *             @return the {@link ReconciliationLineItemReport} objects that match the given filter
 *           
 * 
 * <p>Java class for getReconciliationLineItemReportsByStatement element declaration.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;element name="getReconciliationLineItemReportsByStatement">
 *   &lt;complexType>
 *     &lt;complexContent>
 *       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *         &lt;sequence>
 *           &lt;element name="filterStatement" type="{https://www.google.com/apis/ads/publisher/v201511}Statement" minOccurs="0"/>
 *         &lt;/sequence>
 *       &lt;/restriction>
 *     &lt;/complexContent>
 *   &lt;/complexType>
 * &lt;/element>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "filterStatement"
})
@XmlRootElement(name = "getReconciliationLineItemReportsByStatement")
public class ReconciliationLineItemReportServiceInterfacegetReconciliationLineItemReportsByStatement {

    protected Statement filterStatement;

    /**
     * Gets the value of the filterStatement property.
     * 
     * @return
     *     possible object is
     *     {@link Statement }
     *     
     */
    public Statement getFilterStatement() {
        return filterStatement;
    }

    /**
     * Sets the value of the filterStatement property.
     * 
     * @param value
     *     allowed object is
     *     {@link Statement }
     *     
     */
    public void setFilterStatement(Statement value) {
        this.filterStatement = value;
    }

}
