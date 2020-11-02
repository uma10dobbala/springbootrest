package org.cap.apps.customerrest.service;

import org.cap.apps.customerrest.entities.Customer;
import org.cap.apps.customerrest.entities.Customer;

public interface ICustomerService {

    Customer register(Customer customer);
	
	Customer updateName(Integer id,String name);
	
	Customer findById(Integer id);
	
}
