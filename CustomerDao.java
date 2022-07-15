package com.gl.springDemo.dao;

import java.util.List;

import com.gl.springDemo.entity.Customer;

public interface CustomerDao {
	public List<Customer> getCustomers();

	public void saveCustomer(Customer customer);

	public Customer getCustomer(int theID);

	public void deleteCustomer(int theId);
}
