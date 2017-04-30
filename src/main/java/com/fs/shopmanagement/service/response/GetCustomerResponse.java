/**
 * 
 */
package com.fs.shopmanagement.service.response;

import java.util.List;

import com.fs.shopmanagement.service.bean.CustomerVO;

/**
 * @author Life
 *
 */
public class GetCustomerResponse extends BaseResponse {

	private static final long serialVersionUID = -1296059271956116056L;

	private List<CustomerVO> customer;

	/**
	 * @return the customer
	 */
	public List<CustomerVO> getCustomer() {
		return customer;
	}

	/**
	 * @param customer
	 *            the customer to set
	 */
	public void setCustomer(List<CustomerVO> customer) {
		this.customer = customer;
	}
}
