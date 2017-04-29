/**
 * 
 */
package com.fs.shopmanagement.service;

import com.fs.shopmanagement.service.request.CustomerRequest;

/**
 * @author Life
 *
 */
public interface CustomerService {

	public CustomerRequest getCustomer(CustomerRequest request);

	public CustomerRequest addCustomer(CustomerRequest request);

	public CustomerRequest updateCustomer(CustomerRequest request);

}
