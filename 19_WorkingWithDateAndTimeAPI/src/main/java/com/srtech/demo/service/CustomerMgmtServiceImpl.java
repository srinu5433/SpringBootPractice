package com.srtech.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.srtech.demo.dao.ICustomerRepo;
import com.srtech.demo.entities.Customer;

@Service("custService")
public class CustomerMgmtServiceImpl implements ICustomerServiceMgmt {

	@Autowired
	ICustomerRepo repo;
    public CustomerMgmtServiceImpl() {
	System.out.println("CustomerMgmtServiceImpl.CustomerMgmtServiceImpl()");
	}
	@Override
	public String registerCustomer(Customer cust) {
		System.out.println("Hello Customer");
		int id = repo.save(cust).getCustId();
		return "Customer Register succesfully with id " + id;
	}
	@Override
	public List<Customer> getAllCustomer() {
		
		return (List<Customer>) repo.findAll();
	}

}
