package com.ticketmanagement.ticketbookingSystem.exceptionhaldler;

public class BusinessDateValidator extends RuntimeException {
	
	private static final long serialVersionUID = 1L;
	
	public BusinessDateValidator()
	{
		super("Invalid Date");
	}

}
