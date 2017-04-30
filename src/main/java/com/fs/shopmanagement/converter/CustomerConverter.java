/**
 * 
 */
package com.fs.shopmanagement.converter;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

import com.fs.shopmanagement.doa.domain.CustomerEntity;
import com.fs.shopmanagement.service.bean.CustomerVO;

/**
 * @author Life
 *
 */
@Component
public class CustomerConverter {

	public CustomerEntity getEntity(CustomerVO request) {
		CustomerEntity entity = new CustomerEntity();
		entity.setCustomerId(request.getCustomerId());
		entity.setFirstName(request.getFirstName());
		entity.setMiddleName(request.getMiddleName());
		entity.setLastName(request.getLastName());
		entity.setAge(request.getAge());
		entity.setPhoneNumber(request.getPhoneNumber());
		entity.setSex(request.getSex());
		return entity;
	}

	public CustomerVO getRequest(CustomerEntity entity) {
		CustomerVO request = new CustomerVO();
		request.setCustomerId(entity.getCustomerId());
		request.setFirstName(entity.getFirstName());
		request.setMiddleName(entity.getMiddleName());
		request.setLastName(entity.getLastName());
		request.setAge(entity.getAge());
		request.setPhoneNumber(entity.getPhoneNumber());
		request.setSex(entity.getSex());
		return request;
	}

	public List<CustomerVO> getCustomerList(List<CustomerEntity> entityList) {
		List<CustomerVO> customerList = new ArrayList<>();
		for (CustomerEntity entity : entityList) {
			CustomerVO request = new CustomerVO();
			request.setCustomerId(entity.getCustomerId());
			request.setFirstName(entity.getFirstName());
			request.setMiddleName(entity.getMiddleName());
			request.setLastName(entity.getLastName());
			request.setAge(entity.getAge());
			request.setPhoneNumber(entity.getPhoneNumber());
			request.setSex(entity.getSex());
			customerList.add(request);
		}
		return customerList;
	}

}
