package com.gl.springDemo.dao;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.gl.springDemo.entity.Customer;

@Repository
public class CustomerDaoImpl implements CustomerDao{

	@Autowired
	
	private SessionFactory sessionFactory;
	@Override
	public List<Customer> getCustomers() {
		Session currentSession = sessionFactory.getCurrentSession();
		Query<Customer> theQuery = currentSession.createQuery("from Customer order by lastName",Customer.class);
		List<Customer> customers = theQuery.getResultList();
		return customers;
	}

	@Override
	public void saveCustomer(Customer customer) {
		Session currentSession = sessionFactory.getCurrentSession();
		currentSession.saveOrUpdate(customer);
		
	}

	@Override
	public Customer getCustomer(int theID) {
		Session currentSession = sessionFactory.getCurrentSession();
		Customer customer =  currentSession.get(Customer.class, theID);
		return customer;
	}

	@Override
	public void deleteCustomer(int theId) {
		Session currentSession = sessionFactory.getCurrentSession();
		Query<Customer> theQuery = currentSession.createQuery("delete from Customer where id = customerId");
		theQuery.setParameter("customerId", theId);
		theQuery.executeUpdate();
		
	}

}
