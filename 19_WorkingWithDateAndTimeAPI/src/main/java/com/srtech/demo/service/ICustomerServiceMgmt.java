package com.srtech.demo.service;

import java.util.List;

import com.srtech.demo.entities.Customer;

public interface ICustomerServiceMgmt {
	
	public String registerCustomer(Customer cust);
	public List<Customer> getAllCustomer();
}
