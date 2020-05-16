package com.shirisha.udemy_java_course;

public class Question {
	
	protected String statement;
	protected String optionA;
	protected String optionB;
	protected String optionC;
	protected String optionD;
	private String correctAnswer;
	
	public Question(String statement, String correctAnswer, String optionA, String optionB, String optionC, String optionD)
	{
		this.statement = statement;
		this.correctAnswer = correctAnswer;
		this.optionA = optionA;
		this.optionB = optionB;
		this.optionC = optionC;
		this.optionD = optionD;
	}

	@Override
	public String toString() {
		return "Question" + statement + "" + optionA + "" + optionB + "" + optionC + "" + optionD;
	}

	public static String getCorrectAnswer(Question question) {
		return question.correctAnswer;
	}
	
}
