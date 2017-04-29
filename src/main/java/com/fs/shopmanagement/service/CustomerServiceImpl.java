/**
 * 
 */
package com.fs.shopmanagement.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.fs.shopmanagement.converter.CustomerConverter;
import com.fs.shopmanagement.doa.GetCustomerDAO;
import com.fs.shopmanagement.doa.domain.CustomerEntity;
import com.fs.shopmanagement.service.request.CustomerRequest;

/**
 * @author Life
 */
@Service
public class CustomerServiceImpl implements CustomerService {

	@Autowired
	private GetCustomerDAO customerDao;

	@Autowired
	private CustomerConverter custConverter;

	@Override
	public CustomerRequest getCustomer(CustomerRequest request) {
		CustomerEntity customerEntity = customerDao.getCustomerDetails(custConverter.getEntity(request));
		return custConverter.getRequest(customerEntity);
	}

	@Override
	public CustomerRequest addCustomer(CustomerRequest request) {
		CustomerEntity customerEntity = customerDao.getCustomerDetails(custConverter.getEntity(request));
		return custConverter.getRequest(customerEntity);
	}

	@Override
	public CustomerRequest updateCustomer(CustomerRequest request) {
		CustomerEntity customerEntity = customerDao.getCustomerDetails(custConverter.getEntity(request));
		return custConverter.getRequest(customerEntity);
	}

}
