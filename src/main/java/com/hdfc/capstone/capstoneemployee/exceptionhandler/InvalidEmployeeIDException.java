package com.hdfc.capstone.capstoneemployee.exceptionhandler;

//Invalid Employee Id exception
public class InvalidEmployeeIDException extends RuntimeException{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	public InvalidEmployeeIDException(String message) {
		super(message);
	}

}
