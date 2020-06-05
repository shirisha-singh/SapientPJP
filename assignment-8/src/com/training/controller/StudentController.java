package com.training.controller;

import com.training.exceptions.InvalidDetailsException;
import com.training.object.Student;
import com.training.service.StudentService;

public class StudentController {
	
	private Student newStudent;
	private StudentService service;
	
	public StudentController(Student student)
	{
		newStudent = student;
	}
	
	public StudentController()
	{
		super();
	}
	
	public boolean addStudentRecordIfValid() throws InvalidDetailsException
	{
		 if(service.validateStudentDetails())
			 {
			 	System.out.println("From StudentController: SUCCESS\n");
			 	return true;
			 }
		 else
		 	{
			 	System.out.println("From StudentController: FAILURE\n");
			 	return false;
		 	}
	}
	
	
	public Student getNewStudent() {
		return newStudent;
	}

	public void setNewStudent(Student newStudent) {
		this.newStudent = newStudent;
	}
	

	@Override
	public String toString() {
		return "StudentController [newStudent=" + newStudent + "]";
	}

	public StudentService getService() {
		return service;
	}

	public void setService(StudentService service) {
		this.service = service;
	}
	
}
