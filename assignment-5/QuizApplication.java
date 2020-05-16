package com.shirisha.udemy_java_course;

import java.io.IOException;
import java.time.Duration;
import java.time.Instant;
import java.util.ArrayList;
import java.util.Scanner;


class Timer implements Runnable{
	
	//private boolean exit = false;
	
	@Override
	public void run() {
		try 
		{
			Thread.sleep(10000);
		} 
		catch (InterruptedException e) 
		{
		}	
	}
}

public class QuizApplication {

	@SuppressWarnings({ "resource" })
	public static void main(String[] args) throws InterruptedException, IOException  {
		
		
		System.out.println("This is a Quiz Application consisting of 10 MCQs.\n"
				+ "The questions would be"
				+ " covering some general aspects"
				+ "from Biology and Astrology.\n"
				+ "Every question has a timeout of 10 seconds exceeding which "
				+ "(for any question) would exit the Quiz.\n"
				+ "Maintain Speed and All The Best !!\n");
		
		Thread.sleep(7000);
		
		GetQuestionList instance = new GetQuestionList();
		
		ArrayList<Question> questionList = instance.getList();
		
		int score = 0;
		boolean hasTimedOut = false;
		
		for(Question question: questionList)
		{
			System.out.println(question);
			
			Timer timer = new Timer();
			Thread daemonThread = new Thread(timer);
			
			daemonThread.setDaemon(true);
			daemonThread.start();
			
			Scanner scanner = new Scanner(System.in);
			String answer = null;
			
			
			while(daemonThread.isAlive()) {
				if(System.in.available() > 0)
				{
					answer = scanner.nextLine();
					daemonThread.interrupt();
					break;
				}
			}
			if(answer == null)
			{
				System.out.println("\n Oops!! Time's up");
				hasTimedOut = true;
				break;
			}
			else if(answer.contentEquals(Question.getCorrectAnswer(question)))
			{
				score++;
			}
			
		}
		
		if(!hasTimedOut)
		{
			System.out.println("Congratulations on successfully completing the quiz!!!!\n");
			System.out.println("Your results will be displayed in a momemnt!");
			
			Thread.sleep(5000);
			
			System.out.println("You have scored: " + score + "/10 in the quiz");
			System.out.println("Percentage correct: " + score*10);
		}
		else
		{
			System.out.println("\n Better luck next time! ");
		}
		
	}
	
}


