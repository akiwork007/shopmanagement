package com.fs.shopmanagement.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.fs.shopmanagement.service.CustomerService;
import com.fs.shopmanagement.service.request.CustomerRequest;

@RestController
public class CustomerController {

	@Autowired
	private CustomerService customerService;

	/**
	 * Get Customer Details
	 */
	@RequestMapping(value = "/getCustomer", method = RequestMethod.POST)
	public @ResponseBody ResponseEntity<CustomerRequest> getCustomer(HttpServletRequest httpRequest,
			@RequestBody CustomerRequest customer) {
		return new ResponseEntity<CustomerRequest>(customerService.getCustomer(customer), HttpStatus.OK);
	}

	/**
	 * Save a new customer
	 */
	@RequestMapping(value = "/addCustomer", method = RequestMethod.POST)
	public @ResponseBody ResponseEntity<?> addCustomer(HttpServletRequest httpRequest,
			@RequestBody CustomerRequest request) {
		customerService.addCustomer(request);
		return new ResponseEntity<CustomerRequest>(request, HttpStatus.OK);
	}

	/**
	 * Updates the existing customer
	 */
	@RequestMapping(value = "/updateCustomer", method = RequestMethod.PUT)
	public @ResponseBody ResponseEntity<?> updateCustomer(HttpServletRequest httpRequest,
			@RequestBody CustomerRequest request) {
		customerService.getCustomer(request);
		return new ResponseEntity<CustomerRequest>(request, HttpStatus.OK);
	}

}
