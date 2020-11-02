package org.cap.apps.customerrest.exceptions;

public class InvalidAgeException  extends RuntimeException{
	
public InvalidAgeException() {
		
	}
	
	public InvalidAgeException(String msg) {
		super(msg);
	}

}
