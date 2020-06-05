package com.training.tests;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import com.training.dao.DAO;
import com.training.exceptions.CouldNotInsertInDbException;
import com.training.exceptions.InvalidDetailsException;
import com.training.object.Student;
import com.training.service.StudentService;


public class StudentServiceTest {

	@Mock
	DAO dao;
	
	private StudentService service;

	
	@Before
	public void setup()
	{
		MockitoAnnotations.initMocks(this);
		
		service = new StudentService();
		service.setDataBaseInstance(dao);
	}
		
	@Test
	public void Student_Record_Added_To_Db() throws CouldNotInsertInDbException, InvalidDetailsException
	{
		Student newStudent = new Student("Mary", "XI", "failed");
		service.setNewStudent(newStudent);
		
		when(dao.insert(newStudent)).thenReturn(true);
		
		System.out.println("From Student_Record_Added_To_Db: ");
		boolean hasBeenAddedToDb = service.validateStudentDetails();
		assertTrue(hasBeenAddedToDb);
		
		verify(dao).insert(newStudent);
	}
	
	@Test
	public void Student_Record_Not_Added_To_Db() throws CouldNotInsertInDbException
	{
		Student newStudent = new Student("Mary", "XI", "failed");
		service.setNewStudent(newStudent);
		when(dao.insert(newStudent)).thenReturn(false);
		
		System.out.println("From Student_Record_Not_Added_To_Db: ");
		boolean hasBeenAddedToDb = service.addStudentToDb();
		assertFalse(hasBeenAddedToDb);
		
		verify(dao).insert(newStudent);
	}
	
	@SuppressWarnings("unchecked")
	@Test(expected=CouldNotInsertInDbException.class)
	public void addStudentToDb_Should_Throw_CouldNotInsertInDbException() throws CouldNotInsertInDbException
	{
		Student newStudent = new Student("Mary", "XI", "failed");
		service.setNewStudent(newStudent);
		when(dao.insert(newStudent)).thenThrow(CouldNotInsertInDbException.class);
		System.out.println("From addStudentToDb_Should_Throw_CouldNotInsertInDbException:  CouldNotInsertInDbException was mocked\n");
		boolean hasBeenAddedToDb = service.addStudentToDb();
	}
	
	@Test(expected=InvalidDetailsException.class)
	public void Invalid_Id_Throws_Exception() throws InvalidDetailsException
	{
		Student newStudent = new Student(-1, "Mary", "XI", "failed");
		service.setNewStudent(newStudent);
		System.out.println("From Invalid_Id_Throws_Exception: InvalidDetailsException was thrown, check message: ");
		boolean result = service.validateStudentDetails();
	}
	
	@Test(expected=InvalidDetailsException.class)
	public void Invalid_Name_Throws_Exception() throws InvalidDetailsException
	{
		Student newStudent = new Student(2, "Mic", "XII", "failed");
		service.setNewStudent(newStudent);
		System.out.println("From Invalid_Name_Throws_Exception: InvalidDetailsException was thrown, check message: ");
		boolean result = service.validateStudentDetails();
	}
	
	@Test(expected=InvalidDetailsException.class)
	public void Invalid_NameAndId_Throws_Exception() throws InvalidDetailsException
	{
		Student newStudent = new Student(-3, "Jim", "IX", "failed");
		service.setNewStudent(newStudent);
		System.out.println("From Invalid_NameAndId_Throws_Exception: InvalidDetailsException was thrown, check message: ");
		boolean result = service.validateStudentDetails();
	}
	
}
