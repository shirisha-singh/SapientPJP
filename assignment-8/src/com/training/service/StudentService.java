package com.training.service;

import com.training.dao.DAO;
import com.training.exceptions.CouldNotInsertInDbException;
import com.training.exceptions.InvalidDetailsException;
import com.training.interfaces.IStudentService;
import com.training.object.Student;

public class StudentService implements IStudentService{

	private DAO dataBaseInstance;
	private Student newStudent;
	
	
	public DAO getDataBaseInstance() {
		return dataBaseInstance;
	}

	public void setDataBaseInstance(DAO dataBaseInstance) {
		this.dataBaseInstance = dataBaseInstance;
	}

	public Student getNewStudent() {
		return newStudent;
	}

	public void setNewStudent(Student newStudent) {
		this.newStudent = newStudent;
	}

	public StudentService(Student newStudent)
	{
		this.newStudent = newStudent;
	}
	
	public StudentService()
	{
		super();
	}
	
	@Override
	public boolean validateStudentDetails() throws InvalidDetailsException {
		
		String studentName = newStudent.getStudentName();
		Integer studentId = newStudent.getStudentId();
		boolean result = false;
		
		if(studentName.length() < 4 && studentId < 0)
		{
			throw new InvalidDetailsException(studentName, studentId);
		}
		else if(studentName.length() < 4)
		{
			throw new InvalidDetailsException(studentName);
		}
		else if(studentId<0)
		{
			throw new InvalidDetailsException(studentId);
		}
		else
		{
			try {
				 result = this.addStudentToDb();
			} catch (CouldNotInsertInDbException e) {
				e.printStackTrace();
			}
		}
		
		return result;
	}

	@Override
	public boolean addStudentToDb() throws CouldNotInsertInDbException {
		
		boolean finalResult = dataBaseInstance.insert(newStudent);
		
		if(finalResult)
		System.out.println("From StudentService: Student record successfully added\n");
		else
		System.out.println("From StudentService: Couldn't add student record\n");
		
		return finalResult;
	}


}
