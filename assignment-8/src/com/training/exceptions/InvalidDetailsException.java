package com.training.exceptions;

public class InvalidDetailsException extends Exception{
		

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public InvalidDetailsException(String studentName, Integer studentId)
	{
		System.out.println("Details are invaild, the name: "+studentName +" "
				+ "is less than 4 letters and id: " + studentId + " is less than 0\n");
	}
	
	public InvalidDetailsException(String studentName)
	{
		System.out.println("Name: " + studentName + " is too short(less than 4 characters)\n");
	}
	
	public InvalidDetailsException(Integer studentId) {
		System.out.println("Id: " + studentId +" is invalid (less than 0)\n");
	}
	
}
