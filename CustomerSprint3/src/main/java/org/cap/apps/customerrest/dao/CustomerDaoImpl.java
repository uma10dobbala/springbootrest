package org.cap.apps.customerrest.dao;

import org.cap.apps.customerrest.entities.Customer;
import org.cap.apps.customerrest.exceptions.*;
import org.hibernate.annotations.common.util.impl.LoggerFactory;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import ch.qos.logback.classic.Logger;

import java.util.*;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

@Repository
public class CustomerDaoImpl implements ICustomerDao {
	
	@PersistenceContext
    private EntityManager entityManager;

	
	@Override
	public Customer add(Customer customer) {
		entityManager.persist(customer);
        return customer;
	}
	
	@Override
	  public Customer findById(Integer id) throws CustomerNotFoundException{

		  
	        Customer customer = entityManager.find(Customer.class, id);
	        if (customer == null) {
	            throw new CustomerNotFoundException("customer was not there for id=" + id);
	        }
	        return customer;
	    }
	
	
	@Override
	public Customer update(Customer customer) throws  CustomerNotFoundException{
		
		boolean success=checkExists(customer.getId());
        if(!success){
            throw new CustomerNotFoundException("updation is not possible customer doesn't exist for id="+customer.getId());
        }
        customer = entityManager.merge(customer);
        return customer;
	}
	
	public boolean checkExists(long l){
        Customer customer = entityManager.find(Customer.class, l);
        boolean result= customer!=null;
        return result;
    }
	
}















