/**
 * CreativeWrapperServiceInterface.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Mar 02, 2009 (07:08:06 PST) WSDL2Java emitter.
 */

package com.google.api.ads.dfp.axis.v201605;

public interface CreativeWrapperServiceInterface extends java.rmi.Remote {

    /**
     * Creates a new {@code CreativeWrapper} objects.
     *         
     *         The following fields are required:
     *         <ul>
     *         <li>{@link CreativeWrapper#labelId}</li>
     *         <li>{@link CreativeWrapper#ordering}</li>
     *         <li>{@link CreativeWrapper#header} or {@link CreativeWrapper#footer}</li>
     * </ul>
     *         
     *         
     * @param creativeWrappers the creative wrappers to create
     *         
     * @return the creative wrappers with their IDs filled in
     *         
     * @throws ApiException
     */
    public com.google.api.ads.dfp.axis.v201605.CreativeWrapper[] createCreativeWrappers(com.google.api.ads.dfp.axis.v201605.CreativeWrapper[] creativeWrappers) throws java.rmi.RemoteException, com.google.api.ads.dfp.axis.v201605.ApiException;

    /**
     * Gets a {@link CreativeWrapperPage} of {@link CreativeWrapper}
     * objects that satisfy the given {@link Statement#query}. The following
     * fields are supported for filtering:
     *         
     *         <table>
     *         <tr>
     *         <th scope="col">PQL Property</th> <th scope="col">Object Property</th>
     * </tr>
     *         <tr>
     *         <td>{@code id}</td>
     *         <td>{@link CreativeWrapper#id}</td>
     *         </tr>
     *         <tr>
     *         <td>{@code labelId}</td>
     *         <td>{@link CreativeWrapper#labelId}</td>
     *         </tr>
     *         <tr>
     *         <td>{@code status}</td>
     *         <td>{@link CreativeWrapper#status}</td>
     *         </tr>
     *         <tr>
     *         <td>{@code ordering}</td>
     *         <td>{@link CreativeWrapper#ordering}</td>
     *         </tr>
     *         </table>
     *         
     *         
     * @param filterStatement a Publisher Query Language statement used to
     * filter
     *         a set of creative wrappers.
     *         
     * @return the creative wrappers that match the given filter
     */
    public com.google.api.ads.dfp.axis.v201605.CreativeWrapperPage getCreativeWrappersByStatement(com.google.api.ads.dfp.axis.v201605.Statement filterStatement) throws java.rmi.RemoteException, com.google.api.ads.dfp.axis.v201605.ApiException;

    /**
     * Performs actions on {@link CreativeWrapper} objects that match
     * the
     *         given {@link Statement#query}.
     *         
     *         
     * @param creativeWrapperAction the action to perform
     *         
     * @param filterStatement a Publisher Query Language statement used to
     * filter
     *         a set of labels
     *         
     * @return the result of the action performed
     */
    public com.google.api.ads.dfp.axis.v201605.UpdateResult performCreativeWrapperAction(com.google.api.ads.dfp.axis.v201605.CreativeWrapperAction creativeWrapperAction, com.google.api.ads.dfp.axis.v201605.Statement filterStatement) throws java.rmi.RemoteException, com.google.api.ads.dfp.axis.v201605.ApiException;

    /**
     * Updates the specified {@code CreativeWrapper} objects.
     *         
     *         
     * @param creativeWrappers the creative wrappers to update
     *         
     * @return the updated creative wrapper objects
     *         
     * @throws ApiException
     */
    public com.google.api.ads.dfp.axis.v201605.CreativeWrapper[] updateCreativeWrappers(com.google.api.ads.dfp.axis.v201605.CreativeWrapper[] creativeWrappers) throws java.rmi.RemoteException, com.google.api.ads.dfp.axis.v201605.ApiException;
}
