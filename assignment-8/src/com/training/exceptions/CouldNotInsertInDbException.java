package com.training.exceptions;

public class CouldNotInsertInDbException extends Exception{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public CouldNotInsertInDbException()
	{
		System.out.println("The record could not be inserted in the data base.");
	}
}
