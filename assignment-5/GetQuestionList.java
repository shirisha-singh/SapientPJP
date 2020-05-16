package com.shirisha.udemy_java_course;

import java.util.ArrayList;


public class GetQuestionList {
	
	public ArrayList<Question> questions;
	
	public ArrayList<Question> getList(){
			
	ArrayList<Question> questions = new ArrayList<Question>();
	
	Question question1 = new Question(
			"1. Which of the following is not the Symptom of Dementia?\n",
			"D",
			"A. Problem solving or language and the ability to focus and pay attention.\n",
			"B. Memory loss\n",
			"C. Difficulties with thinking\n",
			"D. Dementia people are able to control their emotions."
			);
	
	Question question2 = new Question(
			"2. How Dementia is caused?\n", 
			"C",
			"A. Dementia can be caused due to Blood infection.\n",
			"B. Dementia can be caused by a stomach infection.\n", 
			"C. Dementia may be caused due to HIV infection.\n",
			"D. Deficiency of calcium may lead to Dementia."
			);
	
	Question question3 = new Question(
			"3. Name the type of Dementia disease in which a neurodegenerative condition linked to abnormal structures in the brain?\n", 
			"B",
			"A. Alzheimer's disease\n",
			"B. Dementia with Lewy bodies\n", 
			"C. Parkinson's disease\n",
			"D. Huntington's disease"
			);
			
	Question question4 = new Question(
			"4. Which disease is characterized by specific types of uncontrolled movements but also includes dementia?\n",
			"C",
			"A. Parkinson's disease\n",
			"B. Mixed dementia\n", 
			"C. Huntington's disease\n", 
			"D. None of the above"
			);
	
	Question question5 = new Question(
			"5. Name a disease in which a person may show both Alzheimer's disease and vascular dementia at the same time?\n",
			"C",
			"A. Alzheimer's disease\n", 
			"B. Parkinson's disease\n", 
			"C. Mixed dementia\n",
			"D. Frontotemporal dementia"
			);
	
	Question question6 = new Question(
			"6. Which disease of dementia increases the likelihood of young-onset Alzheimer's?\n",
			"C",
			"A. Frontotemporal dementia\n", 
			"B. Posterior cortical atrophy\n", 
			"C. Down syndrome\n",
			"D. Normal pressure hydrocephalus"
			);
	
	Question question7 = new Question(
			"7. What is ARDSI?\n",
			"A",
			"A. Alzheimer’s and related Disorders Society of India\n",
			"B. Act related to Dementia, Symptoms and Infection\n",
			"C. Alzheimer’s and related Dementia Symptoms of India\n", 
			"D. None of the above"
			);
	
	Question question8 = new Question(
			"8. Which of the following are the different types of Full Moons?\n",
			"D",
			"A. Blood Moons\n", 
			"B. Supermoons\n", 
			"C. Blue Moons\n", 
			"D. All the above"
			);
	
	Question question9 = new Question(
			"9. Who coined the term “Supermoon”?\n",
			"A",
			"A. Richard Nolle\n",
			"B. Michel Gauquelin\n", 
			"C. Shawn Carlson\n",
			"D. None of the above"
			);
	
	Question question10 = new Question(
			"10. Supermoon is also known as......\n",
			"A",
			"A. Perigee-syzygy Moon\n", 
			"B. Perigee Moon\n",
			"C. Both A and B\n", 
			"D. None of the above"
			);
	
	questions.add(question1);
	questions.add(question2);
	questions.add(question3);
	questions.add(question4);
	questions.add(question5);
	questions.add(question6);
	questions.add(question7);
	questions.add(question8);
	questions.add(question9);
	questions.add(question10);
	
	return questions;
}

	@Override
	public String toString() {
		return "GetQuestionList [questions=" + questions + "]";
	}

	
	
	
}
