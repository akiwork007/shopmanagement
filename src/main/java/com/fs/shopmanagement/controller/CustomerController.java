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

import com.fs.shopmanagement.exception.NoDataFountException;
import com.fs.shopmanagement.service.CustomerService;
import com.fs.shopmanagement.service.request.AddCustomerRequest;
import com.fs.shopmanagement.service.request.GetCustomerRequest;
import com.fs.shopmanagement.service.response.AddCustomerResponse;
import com.fs.shopmanagement.service.response.GetCustomerResponse;
import com.fs.shopmanagement.service.response.UpdateCustomerResponse;

@RestController
public class CustomerController {

	@Autowired
	private CustomerService customerService;

	/**
	 * Get Customer Details
	 * 
	 * @throws Exception
	 */
	@RequestMapping(value = "/getCustomer", method = RequestMethod.POST)
	public @ResponseBody ResponseEntity<GetCustomerResponse> getCustomer(HttpServletRequest httpRequest,
			@RequestBody GetCustomerRequest request) {
		GetCustomerResponse response = new GetCustomerResponse();
		try {
			response.setCustomer(customerService.getCustomer(request.getCustomer()));
			return new ResponseEntity<GetCustomerResponse>(response, HttpStatus.OK);
		} catch (NoDataFountException e) {
			response.setErrorMsg(e.getMessage());
			return new ResponseEntity<GetCustomerResponse>(response, HttpStatus.OK);
		}
	}

	/**
	 * Save a new customer
	 */
	@RequestMapping(value = "/addCustomer", method = RequestMethod.POST)
	public @ResponseBody ResponseEntity<AddCustomerResponse> addCustomer(HttpServletRequest httpRequest,
			@RequestBody AddCustomerRequest request) {
		AddCustomerResponse response = new AddCustomerResponse();
		customerService.addCustomer(request.getCustomer());
		response.setSuccessMsg("Done");
		return new ResponseEntity<AddCustomerResponse>(response, HttpStatus.OK);
	}

	/**
	 * Updates the existing customer
	 */
	@RequestMapping(value = "/updateCustomer", method = RequestMethod.PUT)
	public @ResponseBody ResponseEntity<UpdateCustomerResponse> updateCustomer(HttpServletRequest httpRequest,
			@RequestBody GetCustomerRequest request) {
		UpdateCustomerResponse response = new UpdateCustomerResponse();
		customerService.updateCustomer(request.getCustomer());
		response.setSuccessMsg("Done");
		return new ResponseEntity<UpdateCustomerResponse>(response, HttpStatus.OK);
	}

}
