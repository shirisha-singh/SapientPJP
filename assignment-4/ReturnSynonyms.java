package com.shirisha.udemy_java_course;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import java.util.Scanner;
public class ReturnSynonyms {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<String, Set<String>> synonyms = new HashMap<>();
		
		synonyms.put("GoodMorning", new HashSet<String>(
				Arrays.asList("GoodMorning", "Shubhodaya", "Shubhohday", "Bonjour" )));
		synonyms.put("GoodEvening", new HashSet<String>(
				Arrays.asList("good Evening", "Shubha sange", "susandhya" )));
		
		Scanner scanner = new Scanner(System.in);
		String word = scanner.nextLine();
		
		if(synonyms.containsKey(word))
		{
			System.out.println(synonyms.get(word));
		}
		else
		{
			System.out.println("The word does not exist in the dictionary, do you want to add this word manually? 'Y' or 'N' ");
			String userReply = scanner.nextLine();
			
			if(userReply.contentEquals("Y"))
			{
				System.out.println("Enter synonyms: ");
				List<String> list = new ArrayList<>();
				
				while(true)
				{
					String synonymWord = scanner.nextLine();
					if(synonymWord.isEmpty())
					{
						System.out.println("Synonyms have been added. GOOD BYE!!");
						break;
					}
					list.add(synonymWord);
				}
				scanner.close();
				synonyms.put(word, new HashSet<String>(list));
			}
			else
			{
				System.out.println("GOOD BYE!!");
			}
		}
		
								
	}

}
