package com.srtech.demo.dao;

import org.springframework.data.repository.CrudRepository;

import com.srtech.demo.entities.Customer;

public interface ICustomerRepo extends CrudRepository<Customer, Integer> {

}
