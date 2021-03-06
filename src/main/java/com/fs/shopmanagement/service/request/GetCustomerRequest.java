/**
 * 
 */
package com.fs.shopmanagement.service.request;

import com.fs.shopmanagement.service.bean.CustomerVO;

/**
 * @author Life
 *
 */
public class GetCustomerRequest extends BaseRequest {

	private static final long serialVersionUID = -5543079199615510495L;

	private CustomerVO customer;

	/**
	 * @return the customer
	 */
	public CustomerVO getCustomer() {
		return customer;
	}

	/**
	 * @param customer
	 *            the customer to set
	 */
	public void setCustomer(CustomerVO customer) {
		this.customer = customer;
	}

}
