/**
 * CustomerServiceInterface.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Mar 02, 2009 (07:08:06 PST) WSDL2Java emitter.
 */

package com.google.api.ads.adwords.axis.v201607.mcm;

public interface CustomerServiceInterface extends java.rmi.Remote {

    /**
     * Returns details of all the customers directly accessible by
     * the user authenticating the call.
     *         <p>
     *         Following V201605, if {@code clientCustomerId} is specified
     * in the request header,
     *         only details of that customer will be returned.
     */
    public com.google.api.ads.adwords.axis.v201607.mcm.Customer[] getCustomers() throws java.rmi.RemoteException, com.google.api.ads.adwords.axis.v201607.cm.ApiException;

    /**
     * Update the authorized customer.
     *         
     *         <p>While there are a limited set of properties available to
     * update, please read this
     *         <a href="https://support.google.com/analytics/answer/1033981">help
     * center article
     *         on auto-tagging</a> before updating {@code customer.autoTaggingEnabled}.
     * 
     *         
     * @param customer the requested updated value for the customer.
     *         
     * @throws ApiException
     */
    public com.google.api.ads.adwords.axis.v201607.mcm.Customer mutate(com.google.api.ads.adwords.axis.v201607.mcm.Customer customer) throws java.rmi.RemoteException, com.google.api.ads.adwords.axis.v201607.cm.ApiException;
}
