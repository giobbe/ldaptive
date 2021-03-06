/* See LICENSE for licensing and NOTICE for copyright. */
package org.ldaptive.async;

import org.ldaptive.LdapException;
import org.ldaptive.control.RequestControl;

/**
 * Interface for asynchronous operation requests.
 *
 * @author  Middleware Services
 */
public interface AsyncRequest
{


  /**
   * Message ID associated with the operation.
   *
   * @return  message id
   */
  int getMessageId();


  /**
   * Abandon the operation.
   *
   * @throws  LdapException  if the operation fails
   */
  void abandon()
    throws LdapException;


  /**
   * Abandon the operation.
   *
   * @param  controls  request controls
   *
   * @throws  LdapException  if the operation fails
   */
  void abandon(RequestControl[] controls)
    throws LdapException;
}
