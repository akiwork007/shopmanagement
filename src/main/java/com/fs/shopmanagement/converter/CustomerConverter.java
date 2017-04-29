/**
 * 
 */
package com.fs.shopmanagement.converter;

import org.springframework.stereotype.Component;

import com.fs.shopmanagement.doa.domain.CustomerEntity;
import com.fs.shopmanagement.service.request.CustomerRequest;

/**
 * @author Life
 *
 */
@Component
public class CustomerConverter {

	public CustomerEntity getEntity(CustomerRequest request) {
		CustomerEntity entity = new CustomerEntity();
		entity.setCustomerId(request.getCustomerId());
		entity.setFirstName(request.getFirstName());
		entity.setMiddleName(request.getMiddleName());
		entity.setLastName(request.getLastName());
		return entity;
	}

	public CustomerRequest getRequest(CustomerEntity entity) {
		CustomerRequest request = new CustomerRequest();
		request.setCustomerId(entity.getCustomerId());
		request.setFirstName(entity.getFirstName());
		request.setMiddleName(entity.getMiddleName());
		request.setLastName(entity.getLastName());
		return request;
	}

}
