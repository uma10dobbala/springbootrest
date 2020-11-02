package org.cap.apps.customerrest.service;

import org.cap.apps.customerrest.dao.*;
import org.cap.apps.customerrest.entities.Customer;
import org.cap.apps.customerrest.service.CustomerServiceImpl;
import org.cap.apps.customerrest.util.ValidationUtil;
import org.cap.apps.customerrest.entities.Customer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.*;
import org.springframework.transaction.annotation.Transactional;

@Transactional
@Service
public class CustomerServiceImpl implements ICustomerService{

	private static final Logger Log= LoggerFactory.getLogger(CustomerServiceImpl.class);
	
	@Autowired
	private ICustomerDao dao;
	
	@Override
	public Customer register(Customer customer) {
		Log.info("Registration of Customer");
	  ValidationUtil.checkArgumentNotNull(customer);
	  ValidationUtil.checkName(customer.getName());
	  ValidationUtil.checkAge(customer.getAge());
	  customer=	dao.add(customer);
	   return customer;
	}

	@Override
	public Customer updateName(Integer id,String name) {
		Log.info("Customer Value  updated here");
		Customer customer=dao.findById(id);
		ValidationUtil.checkName(customer.getName());
		customer.setName(name);
		return customer;
	}

	@Override
	public Customer findById(Integer id) {
		 Customer customer = dao.findById(id);
	        return customer;
		
	}

	

}
