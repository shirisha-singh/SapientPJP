package com.training.interfaces;

import com.training.exceptions.CouldNotInsertInDbException;
import com.training.object.Student;

public interface IDAO {
	
	boolean insert(Student newStudent) throws CouldNotInsertInDbException;
}
