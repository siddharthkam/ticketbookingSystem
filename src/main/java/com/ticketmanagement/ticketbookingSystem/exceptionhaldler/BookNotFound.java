package com.ticketmanagement.ticketbookingSystem.exceptionhaldler;

public class BookNotFound extends Exception {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	public BookNotFound()
	{
		super("Book Not found");
	}

}
