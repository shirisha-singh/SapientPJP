package com.training.interfaces;

import com.training.exceptions.CouldNotInsertInDbException;
import com.training.exceptions.InvalidDetailsException;

public interface IStudentService {
		
	public boolean validateStudentDetails() throws InvalidDetailsException;
	
	public boolean addStudentToDb() throws CouldNotInsertInDbException;
	
}
