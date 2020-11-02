package org.cap.apps.customerrest.controllers;

import org.cap.apps.customerrest.dto.CreateCustomerRequest;
import org.cap.apps.customerrest.dto.CustomerDetails;
import org.cap.apps.customerrest.entities.Customer;
import org.cap.apps.customerrest.service.ICustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/customers")
@RestController
public class CustomerController {
	
	 @Autowired
	    private ICustomerService service;

	 @ResponseStatus(HttpStatus.CREATED)
	    @PostMapping("/add")
	    public CustomerDetails add(@RequestBody CreateCustomerRequest requestData) {
	        Customer customer = new Customer(requestData.getName(), requestData.getAge());
	        customer = service.register(customer);
	        CustomerDetails details = toDetails(customer);
	        return details;
	    }

	 @GetMapping("/get/{id}")
	    public CustomerDetails fetchStudent(@PathVariable("id") Integer id) {
	        Customer customer = service.findById(id);
	        CustomerDetails details = toDetails(customer);
	        return details;
	    }
	 
	 
	 public CustomerDetails toDetails(Customer customer) {
	        CustomerDetails details = new CustomerDetails(customer.getId(), customer.getName(), customer.getAge());
	        return details;

	    }
	 
}
