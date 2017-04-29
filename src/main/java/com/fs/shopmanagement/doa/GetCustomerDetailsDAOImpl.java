package com.fs.shopmanagement.doa;

import org.springframework.stereotype.Repository;

import com.fs.shopmanagement.doa.domain.CustomerEntity;

/**
 * @author Life
 */
@Repository("getCustomerDetailsDAOImpl")
public class GetCustomerDetailsDAOImpl implements GetCustomerDAO {

	@Override
	public CustomerEntity getCustomerDetails(CustomerEntity customerEntity) {
		CustomerEntity customer = new CustomerEntity();
		customer.setFirstName("Ankit");
		return customer;
	}

	@Override
	public CustomerEntity addCustomerDetails(CustomerEntity customerEntity) {
		return customerEntity;
	}

	@Override
	public CustomerEntity updateCustomerDetails(CustomerEntity customerEntity) {
		return customerEntity;
	}
}
