package com.training.object;

public class Student {
	
	private int studentId;
	private String studentName;
	private String currentClass;
	private String resultStatus;
	
	public Student(int studentId, String studentName, String currentClass, String hasPassed) {
		super();
		this.studentId = studentId;
		this.studentName = studentName;
		this.currentClass = currentClass;
		this.resultStatus = hasPassed;
	}

	public Student(String studentName, String currentClass, String hasPassed) {
		super();
		this.studentName = studentName;
		this.currentClass = currentClass;
		this.resultStatus = hasPassed;
	}

	public Student() {
		super();
	}
	
	@Override
	public String toString() {
		return "Student [studentName=" + studentName + ", currentClass=" + currentClass
				+ ", resultStatus=" + resultStatus + "]";
	}

	public int getStudentId() {
		return studentId;
	}

	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}

	public String getStudentName() {
		return studentName;
	}

	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}

	public String getCurrentClass() {
		return currentClass;
	}

	public void setCurrentClass(String currentClass) {
		this.currentClass = currentClass;
	}

	public String getResultStatus() {
		return resultStatus;
	}

	public void setResultStatus(String resultStatus) {
		this.resultStatus = resultStatus;
	}
	
	
}
