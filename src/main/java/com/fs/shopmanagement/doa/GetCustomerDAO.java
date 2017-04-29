/**
 * 
 */
package com.fs.shopmanagement.doa;

import com.fs.shopmanagement.doa.domain.CustomerEntity;

/**
 * @author Life
 */
public interface GetCustomerDAO {

	public CustomerEntity getCustomerDetails(CustomerEntity customerEntity);

	public CustomerEntity updateCustomerDetails(CustomerEntity customerEntity);

	public CustomerEntity addCustomerDetails(CustomerEntity customerEntity);
}
