package com.umair.exercises;

public class FindVowels {

	public static void main(String[] args) {
	 int count=vowels("Umair is my name");
	 System.out.println(count);

	}

	private static int vowels(String str) {
		int counter=0;
		String checker="aeiou";
		for(char c:str.toLowerCase().toCharArray()) {
			if(checker.contains(Character.toString(c))) {
				counter++;
			}
		}
		return counter;
	}

}
