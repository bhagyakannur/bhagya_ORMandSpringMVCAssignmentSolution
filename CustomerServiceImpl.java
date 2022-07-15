package com.gl.springDemo.service;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.gl.springDemo.dao.CustomerDao;
import com.gl.springDemo.entity.Customer;

@Service
public class CustomerServiceImpl implements CustomerService{

	@Autowired
	private CustomerDao customerDao;
	@Override
	@Transactional
	public List<Customer> getCustomers() {
		List<Customer> customers = customerDao.getCustomers();
		return customers;
	}

	@Override
	@Transactional
	public void saveCustomer(Customer customer) {
		customerDao.saveCustomer(customer);
		
	}

	@Override
	@Transactional
	public Customer getCustomer(int theID) {
		Customer customer = customerDao.getCustomer(theID);
		return customer;
	}

	@Override
	@Transactional
	public void deleteCustomer(int theId) {
		customerDao.deleteCustomer(theId);
		
	}

	
	
}
