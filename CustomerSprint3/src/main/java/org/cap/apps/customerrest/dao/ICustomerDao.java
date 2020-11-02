package org.cap.apps.customerrest.dao;

import org.cap.apps.customerrest.entities.Customer;

public interface ICustomerDao {
	Customer add(Customer customer);
	
	Customer update(Customer customer);
	
	Customer findById(Integer id);

}
