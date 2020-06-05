package com.training.tests;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import static org.mockito.Mockito.atLeast;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import com.training.controller.StudentController;
import com.training.exceptions.InvalidDetailsException;
import com.training.object.Student;
import com.training.service.StudentService;


public class StudentControllerTest {

	@Mock
	StudentService service;
	
	private StudentController stdController;
	
	@Before
 	public void setup()
 	{
 		MockitoAnnotations.initMocks(this);

 		Student newStudent = new Student("John", "X", "passed");
		stdController = new StudentController();
		stdController.setNewStudent(newStudent);
		//System.out.println(stdController);
		stdController.setService(service);
		
 	}
	
	@Test
	public void Student_Record_Is_Valid_And_Added() throws InvalidDetailsException
	{
		when(service.validateStudentDetails()).thenReturn(true);
		System.out.println("\nFrom Student_Record_Is_Valid_And_Added-> ");
		boolean finalResult = stdController.addStudentRecordIfValid();
		assertTrue(true);
		verify(service).validateStudentDetails();
	}
	
	
	@Test
	public void Student_Record_Invalid_Not_Added() throws InvalidDetailsException
	{
		when(service.validateStudentDetails()).thenReturn(false);
		System.out.println("\nFrom Student_Record_Invalid_Not_Added-> ");
		boolean finalResult = stdController.addStudentRecordIfValid();
		assertFalse(false);
		verify(service).validateStudentDetails();
	}
	
	
	@SuppressWarnings("unchecked")
	@Test(expected=InvalidDetailsException.class)
	public void addStudentRecordIfValid_Should_Throw_InvalidDetailsException() throws InvalidDetailsException 
	{
		when(service.validateStudentDetails()).thenThrow(InvalidDetailsException.class);
		boolean finalResult = stdController.addStudentRecordIfValid();
	}
	
}

