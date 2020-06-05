package com.training.dao;

import java.util.Date;

import com.training.exceptions.CouldNotInsertInDbException;
import com.training.interfaces.IDAO;
import com.training.object.Student;

public class DAO implements IDAO{

	public DAO()
	{
		super();
	}
	
	@Override
	public boolean insert(Student newStudent) throws CouldNotInsertInDbException {
		
		System.out.println("Student Record Has been added to the database at " + new Date());
		return true;
		
	}

}
