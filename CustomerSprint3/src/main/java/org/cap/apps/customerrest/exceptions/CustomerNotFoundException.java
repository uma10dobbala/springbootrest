package org.cap.apps.customerrest.exceptions;

public class CustomerNotFoundException extends RuntimeException {
	
	public CustomerNotFoundException() {

	}

	public CustomerNotFoundException(String msg) {
		super(msg);
	}

}
