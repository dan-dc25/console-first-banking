package com.revature.exceptions;

public class EmailAlreadyExistsException extends RuntimeException {

	private static final long serialVersionUID = 1L;

	public EmailAlreadyExistsException(){
		super("This email already exists");
	}
}
