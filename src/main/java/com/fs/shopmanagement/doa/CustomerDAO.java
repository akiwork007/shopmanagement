/**
 * 
 */
package com.fs.shopmanagement.doa;

import java.util.List;

import com.fs.shopmanagement.doa.domain.CustomerEntity;
import com.fs.shopmanagement.exception.NoDataFountException;

/**
 * @author Life
 */
public interface CustomerDAO {

	public List<CustomerEntity> getCustomerDetails(CustomerEntity customerEntity) throws NoDataFountException;

	public CustomerEntity updateCustomerDetails(CustomerEntity customerEntity);

	public CustomerEntity addCustomerDetails(CustomerEntity customerEntity);
}
