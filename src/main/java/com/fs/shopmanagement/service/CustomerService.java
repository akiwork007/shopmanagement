/**
 * 
 */
package com.fs.shopmanagement.service;

import java.util.List;

import com.fs.shopmanagement.exception.NoDataFountException;
import com.fs.shopmanagement.service.bean.CustomerVO;

/**
 * @author Life
 *
 */
public interface CustomerService {

	public List<CustomerVO> getCustomer(CustomerVO request) throws NoDataFountException;

	public CustomerVO addCustomer(CustomerVO request);

	public CustomerVO updateCustomer(CustomerVO request);

}
