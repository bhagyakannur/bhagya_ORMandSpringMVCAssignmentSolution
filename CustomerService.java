package com.gl.springDemo.service;

import java.util.List;

import com.gl.springDemo.entity.Customer;

public interface CustomerService {
	public List<Customer> getCustomers();

	public void saveCustomer(Customer customer);

	public Customer getCustomer(int theID);

	public void deleteCustomer(int theId);
}
