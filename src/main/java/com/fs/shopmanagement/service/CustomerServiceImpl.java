/**
 * 
 */
package com.fs.shopmanagement.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.fs.shopmanagement.converter.CustomerConverter;
import com.fs.shopmanagement.doa.CustomerDAO;
import com.fs.shopmanagement.doa.domain.CustomerEntity;
import com.fs.shopmanagement.exception.NoDataFountException;
import com.fs.shopmanagement.service.bean.CustomerVO;

/**
 * @author Life
 */
@Service
public class CustomerServiceImpl implements CustomerService {

	@Autowired
	private CustomerDAO customerDao;

	@Autowired
	private CustomerConverter custConverter;

	@Override
	public List<CustomerVO> getCustomer(CustomerVO request) throws NoDataFountException {
		List<CustomerEntity> customerEntity = customerDao.getCustomerDetails(custConverter.getEntity(request));
		return custConverter.getCustomerList(customerEntity);
	}

	@Override
	public CustomerVO addCustomer(CustomerVO request) {
		CustomerEntity customerEntity = customerDao.addCustomerDetails(custConverter.getEntity(request));
		return custConverter.getRequest(customerEntity);
	}

	@Override
	public CustomerVO updateCustomer(CustomerVO request) {
		CustomerEntity customerEntity = customerDao.updateCustomerDetails(custConverter.getEntity(request));
		return custConverter.getRequest(customerEntity);
	}

}
